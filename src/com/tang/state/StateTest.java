package com.tang.state;

/**
 * ״̬ģʽ State
 * �������״̬�ı�ʱ��ͬʱ�ı�����Ϊ
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
