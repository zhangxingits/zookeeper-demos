package com.xin.zk.client;

import org.apache.zookeeper.AsyncCallback.VoidCallback;

public class DeleteCallBack implements VoidCallback {
	public void processResult(int rc, String path, Object ctx) {
		// TODO Auto-generated method stub haha hehe
		System.out.println("删除节点:"+path);
		System.out.println((String)ctx);
	}

}
