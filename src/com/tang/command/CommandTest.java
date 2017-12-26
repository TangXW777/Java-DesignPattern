package com.tang.command;

/**
 * 命令模式 Command
 * Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，实现了Command接口
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 * @author TangXW
 *
 */
public class CommandTest {
	public static void main(String[] args) {
		// 执行任务者
		Receiver receiver = new Receiver();
		// 命令
		Command command = new MyCommand(receiver);
		// 调用者
		Invoker invoker = new Invoker(command);
		
		invoker.action();
	}
}
