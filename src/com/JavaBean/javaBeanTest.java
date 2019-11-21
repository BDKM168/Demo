package com.JavaBean;

/**
 * JavaBean
 * JavaBean 是遵循特定写法的Java类 它通常具有以下特点。
 * 这个java类必须具有一个无参的构造函数。
 * 属性必须私有化
 * 私有化的属性必须通过public类型方法暴露给其他程序 ， 并且方法的命名也要遵守一定的命名规范。
 */
/**
 * JavaBean 在 J2EE 开发中 ， 通常用于 封装数据 ， 对于遵循以上写法的JavaBean 组件， 其他程序可以通过
 * 反射技术实例化JavaBean对象，并且通过反射 遵守那些命名规范的方法，从而获知JavaBean属性。
 */
/**
 * JavaBean 属性
 * JavaBean属性可以是任意类型，并且一个JavaBean可以有多个属性。每个属性通常都具有相应的setter、getter方法，
 * setter 方法 称为 属性修改器，getter方法 被称为属性访问器。
 * 一个JavaBean属性可以只有setter方法 或 getter方法 ，这行的属性通常 称为 只读 或 只写
 */

/**
 * JSP 中使用 JavaBean
 *
 * JSP技术提供了三个 使用JavaBean 组件 的动作元素  即JSP标签，
 * <jsp:useBean></>  标签  用于在JSP页面中 查找或 实例化一个 JavaBean组件
 * <jsp:setProperty></> 标签 用于在jsp页面中 设置一个JavaBean组件 的属性
 * <jsp:getProperty></> 标签 用于在         获取一个JavaBean组件 的属性
 *
 */



public class javaBeanTest {

}
