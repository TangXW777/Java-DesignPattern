package com.tang.state;

/**
 * 状态模式 State
 * 当对象的状态改变时，同时改变其行为
 * @author TangXW
 *
 */
public class StateTest {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		// 1
		state.setValue("state1");
		context.method();
		
		// 2 
		state.setValue("state2");
		context.method();
	}
}
