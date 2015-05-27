package com.infogen.self_describing;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.infogen.self_describing.component.Function;

@RestController
public class InfoGen_Self_DescribingTest {
	private static InfoGen_Self_Describing instance = null;
	private static Method ref_get_in_parameter_names;
	private static Constructor<?>[] ref_Construction_method;
	private static Field ref_class_pool;

	@BeforeClass(groups = { "tools", "all" })
	public void beforeClass() throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		instance = InfoGen_Self_Describing.getInstance();
		Class<?> refNewClass = instance.getClass();
		ref_get_in_parameter_names = refNewClass.getDeclaredMethod("get_in_parameter_names", Class.class, String.class, java.lang.reflect.Parameter[].class);
		ref_get_in_parameter_names.setAccessible(true);
		ref_Construction_method = refNewClass.getDeclaredConstructors();
		int i;
		for (i = 0; i < ref_Construction_method.length; i++) {
			ref_Construction_method[i].setAccessible(true);
		}
		ref_class_pool = refNewClass.getDeclaredField("class_pool");
		ref_class_pool.setAccessible(true);
	}

	@Test(groups = { "tools", "all" })
	public void getInstance() {
		Assert.assertNotNull(instance);
		Assert.assertEquals(instance instanceof InfoGen_Self_Describing, true);
	}

	@Test(groups = { "tools", "all" })
	public void self_describing() throws IOException {
		Set<Class<?>> class_set = new HashSet<Class<?>>();
		class_set.add(InfoGen_Self_DescribingTest.class);
		class_set.add(com.infogen.tools.Tool_JacksonTest.class);
		Map<String, Function> map = instance.self_describing(class_set);
		Assert.assertEquals(map.size(), 1);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	private int test(int a, int b) {
		return a + b;
	}
}