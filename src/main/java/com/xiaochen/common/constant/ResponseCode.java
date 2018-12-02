package com.xiaochen.common.constant;

public interface ResponseCode {
	/*
	   +------+-------------------------------+------------------------+
	    | 错误码 | 错误描述-英文                 | 错误描述-中文        |
	   +------+-------------------------------+------------------------+
	   | -1  | Response Fail                    | 响应失败  	       |
	   | 0   | Response Success                 | 响应成功  	       |
	   | 3   | Upload Fail                      | 图片上传失败	       |
	   | 7   | App Call Limited                 | 应用调用次数超限     |
	   | 9   | Http Action Not Allowed          | HTTP方法被禁止	   |
	   | 10  | Service Currently Unavailable    | 服务不可用	       |
	   | 11  | Insufficient ISV Permissions	    | 开发者权限不足	   |
	   | 12  | Insufficient User Permissions    | 用户权限不足	       |
	   | 13  | Insufficient Partner Permissions	| 合作伙伴权限不足     |
	   | 21  | Missing Method	                | 缺少方法名参数	   |
	   | 22  | Invalid Method	                | 不存在的方法名	   |
	   | 23  | Invalid Format	                | 无效数据格式	       |
	   | 24  | Missing Signature	            | 缺少签名参数	       |
	   | 25  | Invalid Signature	            | 无效签名	           |
	   | 26  | Missing Session	                | 缺少SessionKey参数   |
	   | 27  | Invalid Session                  | 无效的SessionKey参数 |
	   | 28  | Missing App Key	                | 缺少AppKey参数	   |
	   | 29  | Invalid App Key	                | 无效的AppKey参数	   |
	   | 30  | Missing Timestamp	            | 缺少时间戳参数	   |
	   | 31  | Invalid Timestamp	            | 非法的时间戳参数	   |    
	   | 32  | Missing Version	                | 缺少版本参数	       |
	   | 33  | Invalid Version	                | 非法的版本参数	   |
	   | 34  | Unsupported Version	            | 不支持的版本号	   |
	   | 40  | Missing Required Arguments   	| 缺少必选参数         |
	   | 41  | Invalid Arguments            	| 非法的参数           |
	   | 42  | Insufficient session permissions	| 短授权权限不足       |
	   | 43  | Parameter Error	                | 参数错误	           |
	   | 44  | Invalid access token	            | 无效的access token   |
	   | 47  | Invalid encoding	                | 编码错误             |
	   | 50  | Business Error                   | 业务错误             |
	   | 53  | Insufficient security level      | 安全等级不足         |
	   +------+-------------------------------+------------------------+
	 */
	// 操作成功状态码
	public static final String SUCCESS = "0";
	// 操作失败状态码
	public static final String FAIL = "-1";
	
	// 图片上传失败
	public static final String UPLOAD_FAIL = "3";
	
	// 用户权限不足
	public static final String USER_PERMISSIONS = "12";
	
	// 缺少必选参数
	public static final String MISSING_PARAMETER = "40";
	
	// 参数错误
	public static final String PARAMETER_ERROR = "43";
	
	// 业务错误
	public static final String BUSINESS_ERROR = "50";
	
	/**
	 * 内部错误
	 */
	public static final String INTERNAL_EXCEPTION = "5";
}
