package com.tang.proxy;

/**
 * 代理模式  Proxy
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 * @author TangXW
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable sc = new Proxy();
		sc.method();
	}
}
