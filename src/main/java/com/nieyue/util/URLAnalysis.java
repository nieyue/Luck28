package com.nieyue.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 类说明：URL参数解析
 * 
 */
public class URLAnalysis {
	 private Map<String, String> paramMap = new HashMap<String, String>();
	 
	    public void analysis(String url) {
	        paramMap.clear();
	        if (!"".equals(url)) {// 如果URL不是空字符串
	            url = url.substring(url.indexOf('?') + 1);
	            String paramaters[] = url.split("&");
	            for (String param : paramaters) {
	                String values[] = param.split("=");
	                paramMap.put(values[0], values[1]);
	            }
	        }
	    }
	 
	    public String getParam(String name) {
	        return paramMap.get(name);
	    }
	 
	    public static void main(String[] args) {
	        String test = "http://apiadvertise.yayao8.com/ad/click?channel_id=225ssdf.dsf&appid=814";
	        URLAnalysis urlAnalysis = new URLAnalysis();
	        urlAnalysis.analysis(test);
	        System.out.println("channel_id = " + urlAnalysis.getParam("channel_id"));
	        System.out.println("appid = " + urlAnalysis.getParam("appid"));
	    }
}
