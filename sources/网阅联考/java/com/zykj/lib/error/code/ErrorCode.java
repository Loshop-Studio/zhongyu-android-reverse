package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Keep
@Metadata(m5174d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<¨\u0006="}, m5175d2 = {"Lcom/zykj/lib/error/code/ErrorCode;", "", "errorCodeInfo", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "(Ljava/lang/String;ILcom/zykj/lib/error/code/ErrorCodeInfo;)V", "getErrorCodeInfo", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "DEFAULT_ERROR", "NET_PARAMETER_ERROR", "NET_TOKEN_ERROR", "NET_TOKEN_EXPIRED", "NET_NO_PERMISSION", "NET_URL_NOT_FOUND", "NET_SERVER_ERROR", "NET_SERVER_NOT_AVAILABLE", "NET_RESULT_NULL", "NET_UN_KNOW_SERVER", "NET_RESPONSE_NULL", "NET_SYS_TIME_ERROR", "NET_SOCKET_TIME_OUT", "NET_OFFLINE_MODE", "NET_NO_CONNECT", "FILE_CREATE_FAIL", "FILE_NO_FOUND", "FILE_BREAKDOWN", "FILE_OPERATION_FAIL", "FILE_OCCUPY", "FILE_PERMISSION", "JSON_PARSE_FAIL", "JSON_NOT_RIGHT", "CLASS_CAST_FAIL", "ARGUMENT_SERIAL_FAIL", "SYS_OOM", "NULL_POINT", "PARAMETER_NO_SET", "USER_NOT_EXIST", "IMAGE_CAPTURE_ERROR_UNKNOWN", "IMAGE_CAPTURE_ERROR_FILE_IO", "IMAGE_CAPTURE_CAPTURE_FAILED", "IMAGE_CAPTURE_ERROR_CAMERA_CLOSED", "IMAGE_CAPTURE_ERROR_INVALID_CAMERA", "OSS_NOT_SET", "OSS_CALLBACK_FAILED", "OSS_TOO_MANY_CALLBACK_REQUEST", "OSS_COST_TOO_LONG_TIME", "OSS_RESPONSE_NOT_VALID_JSON", "OSS_BUCKET_NOT_VALID", "OSS_OBJECT_NAME_EMPTY", "OSS_OBJECT_NAME_TOO_LONG", "OSS_OBJECT_NAME__NOT_VALID", "OSS_TOO_MANY_BUCKETS", "OSS_REQUEST_NOT_MULTI_PART_CONTENT", "OSS_NOT_IMPLEMENTED", "OSS_MISSING_ARGUMENT", "OSS_INVALID_ARGUMENT", "OSS_REPEATED_TAGS", "OSS_INVALID_HOST_BUCKET", "OSS_ACCESS_DENIED", "OSS_CLIENT_ERROR", "OSS_CLIENT_FILE_NOT_FOUND", "OSS_CLIENT_SOCKET_TIME_OUT", "code_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ErrorCode {
    private static final /* synthetic */ ErrorCode[] $VALUES = $values();
    public static final ErrorCode ARGUMENT_SERIAL_FAIL;
    public static final ErrorCode CLASS_CAST_FAIL;
    public static final ErrorCode DEFAULT_ERROR;
    public static final ErrorCode FILE_BREAKDOWN;
    public static final ErrorCode FILE_CREATE_FAIL;
    public static final ErrorCode FILE_NO_FOUND;
    public static final ErrorCode FILE_OCCUPY;
    public static final ErrorCode FILE_OPERATION_FAIL;
    public static final ErrorCode FILE_PERMISSION;
    public static final ErrorCode IMAGE_CAPTURE_CAPTURE_FAILED;
    public static final ErrorCode IMAGE_CAPTURE_ERROR_CAMERA_CLOSED;
    public static final ErrorCode IMAGE_CAPTURE_ERROR_FILE_IO;
    public static final ErrorCode IMAGE_CAPTURE_ERROR_INVALID_CAMERA;
    public static final ErrorCode IMAGE_CAPTURE_ERROR_UNKNOWN;
    public static final ErrorCode JSON_NOT_RIGHT;
    public static final ErrorCode JSON_PARSE_FAIL;
    public static final ErrorCode NET_NO_CONNECT;
    public static final ErrorCode NET_NO_PERMISSION;
    public static final ErrorCode NET_OFFLINE_MODE;
    public static final ErrorCode NET_PARAMETER_ERROR;
    public static final ErrorCode NET_RESPONSE_NULL;
    public static final ErrorCode NET_RESULT_NULL;
    public static final ErrorCode NET_SERVER_ERROR;
    public static final ErrorCode NET_SERVER_NOT_AVAILABLE;
    public static final ErrorCode NET_SOCKET_TIME_OUT;
    public static final ErrorCode NET_SYS_TIME_ERROR;
    public static final ErrorCode NET_TOKEN_ERROR;
    public static final ErrorCode NET_TOKEN_EXPIRED;
    public static final ErrorCode NET_UN_KNOW_SERVER;
    public static final ErrorCode NET_URL_NOT_FOUND;
    public static final ErrorCode NULL_POINT;
    public static final ErrorCode OSS_ACCESS_DENIED;
    public static final ErrorCode OSS_BUCKET_NOT_VALID;
    public static final ErrorCode OSS_CALLBACK_FAILED;
    public static final ErrorCode OSS_CLIENT_ERROR;
    public static final ErrorCode OSS_CLIENT_FILE_NOT_FOUND;
    public static final ErrorCode OSS_CLIENT_SOCKET_TIME_OUT;
    public static final ErrorCode OSS_COST_TOO_LONG_TIME;
    public static final ErrorCode OSS_INVALID_ARGUMENT;
    public static final ErrorCode OSS_INVALID_HOST_BUCKET;
    public static final ErrorCode OSS_MISSING_ARGUMENT;
    public static final ErrorCode OSS_NOT_IMPLEMENTED;
    public static final ErrorCode OSS_NOT_SET;
    public static final ErrorCode OSS_OBJECT_NAME_EMPTY;
    public static final ErrorCode OSS_OBJECT_NAME_TOO_LONG;
    public static final ErrorCode OSS_OBJECT_NAME__NOT_VALID;
    public static final ErrorCode OSS_REPEATED_TAGS;
    public static final ErrorCode OSS_REQUEST_NOT_MULTI_PART_CONTENT;
    public static final ErrorCode OSS_RESPONSE_NOT_VALID_JSON;
    public static final ErrorCode OSS_TOO_MANY_BUCKETS;
    public static final ErrorCode OSS_TOO_MANY_CALLBACK_REQUEST;
    public static final ErrorCode PARAMETER_NO_SET;
    public static final ErrorCode SYS_OOM;
    public static final ErrorCode USER_NOT_EXIST;
    private final ErrorCodeInfo errorCodeInfo;

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{DEFAULT_ERROR, NET_PARAMETER_ERROR, NET_TOKEN_ERROR, NET_TOKEN_EXPIRED, NET_NO_PERMISSION, NET_URL_NOT_FOUND, NET_SERVER_ERROR, NET_SERVER_NOT_AVAILABLE, NET_RESULT_NULL, NET_UN_KNOW_SERVER, NET_RESPONSE_NULL, NET_SYS_TIME_ERROR, NET_SOCKET_TIME_OUT, NET_OFFLINE_MODE, NET_NO_CONNECT, FILE_CREATE_FAIL, FILE_NO_FOUND, FILE_BREAKDOWN, FILE_OPERATION_FAIL, FILE_OCCUPY, FILE_PERMISSION, JSON_PARSE_FAIL, JSON_NOT_RIGHT, CLASS_CAST_FAIL, ARGUMENT_SERIAL_FAIL, SYS_OOM, NULL_POINT, PARAMETER_NO_SET, USER_NOT_EXIST, IMAGE_CAPTURE_ERROR_UNKNOWN, IMAGE_CAPTURE_ERROR_FILE_IO, IMAGE_CAPTURE_CAPTURE_FAILED, IMAGE_CAPTURE_ERROR_CAMERA_CLOSED, IMAGE_CAPTURE_ERROR_INVALID_CAMERA, OSS_NOT_SET, OSS_CALLBACK_FAILED, OSS_TOO_MANY_CALLBACK_REQUEST, OSS_COST_TOO_LONG_TIME, OSS_RESPONSE_NOT_VALID_JSON, OSS_BUCKET_NOT_VALID, OSS_OBJECT_NAME_EMPTY, OSS_OBJECT_NAME_TOO_LONG, OSS_OBJECT_NAME__NOT_VALID, OSS_TOO_MANY_BUCKETS, OSS_REQUEST_NOT_MULTI_PART_CONTENT, OSS_NOT_IMPLEMENTED, OSS_MISSING_ARGUMENT, OSS_INVALID_ARGUMENT, OSS_REPEATED_TAGS, OSS_INVALID_HOST_BUCKET, OSS_ACCESS_DENIED, OSS_CLIENT_ERROR, OSS_CLIENT_FILE_NOT_FOUND, OSS_CLIENT_SOCKET_TIME_OUT};
    }

    static {
        String str = null;
        int i4 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        DEFAULT_ERROR = new ErrorCode("DEFAULT_ERROR", 0, new ErrorCodeInfo(0, "异常", Integer.valueOf(R$string.default_error), str, i4, defaultConstructorMarker));
        NET_PARAMETER_ERROR = new ErrorCode("NET_PARAMETER_ERROR", 1, new ErrorCodeInfo(400, "请求参数不正确", Integer.valueOf(R$string.net_parameter_error), str, i4, defaultConstructorMarker));
        NET_TOKEN_ERROR = new ErrorCode("NET_TOKEN_ERROR", 2, new ErrorCodeInfo(401, "token未设置或token不正确", Integer.valueOf(R$string.net_token_error), str, i4, defaultConstructorMarker));
        NET_TOKEN_EXPIRED = new ErrorCode("NET_TOKEN_EXPIRED", 3, new ErrorCodeInfo(4011, "用户Token已过期", Integer.valueOf(R$string.net_token_expired), str, i4, defaultConstructorMarker));
        NET_NO_PERMISSION = new ErrorCode("NET_NO_PERMISSION", 4, new ErrorCodeInfo(403, "用户无权限", Integer.valueOf(R$string.net_no_permission), str, i4, defaultConstructorMarker));
        NET_URL_NOT_FOUND = new ErrorCode("NET_URL_NOT_FOUND", 5, new ErrorCodeInfo(404, "url不正确", Integer.valueOf(R$string.net_url_not_found), str, i4, defaultConstructorMarker));
        NET_SERVER_ERROR = new ErrorCode("NET_SERVER_ERROR", 6, new ErrorCodeInfo(500, "服务器异常", Integer.valueOf(R$string.net_server_error), str, i4, defaultConstructorMarker));
        NET_SERVER_NOT_AVAILABLE = new ErrorCode("NET_SERVER_NOT_AVAILABLE", 7, new ErrorCodeInfo(503, "服务不可用", Integer.valueOf(R$string.net_server_not_available), str, i4, defaultConstructorMarker));
        NET_RESULT_NULL = new ErrorCode("NET_RESULT_NULL", 8, new ErrorCodeInfo(593, "接口结果为null", Integer.valueOf(R$string.net_result_null), str, i4, defaultConstructorMarker));
        NET_UN_KNOW_SERVER = new ErrorCode("NET_UN_KNOW_SERVER", 9, new ErrorCodeInfo(594, "java.net.UnknownServiceException: CLEARTEXT communication not enabled for client", Integer.valueOf(R$string.net_server_un_know), str, i4, defaultConstructorMarker));
        NET_RESPONSE_NULL = new ErrorCode("NET_RESPONSE_NULL", 10, new ErrorCodeInfo(595, "接口返回null", Integer.valueOf(R$string.net_response_null), str, i4, defaultConstructorMarker));
        NET_SYS_TIME_ERROR = new ErrorCode("NET_SYS_TIME_ERROR", 11, new ErrorCodeInfo(596, "系统时间异常", Integer.valueOf(R$string.net_sys_time_error), str, i4, defaultConstructorMarker));
        NET_SOCKET_TIME_OUT = new ErrorCode("NET_SOCKET_TIME_OUT", 12, new ErrorCodeInfo(597, "网络连接超时", Integer.valueOf(R$string.net_socket_time_out), str, i4, defaultConstructorMarker));
        NET_OFFLINE_MODE = new ErrorCode("NET_OFFLINE_MODE", 13, new ErrorCodeInfo(598, "离线模式", Integer.valueOf(R$string.net_offline_mode), str, i4, defaultConstructorMarker));
        NET_NO_CONNECT = new ErrorCode("NET_NO_CONNECT", 14, new ErrorCodeInfo(599, "没有连接网络", Integer.valueOf(R$string.net_no_connect), str, i4, defaultConstructorMarker));
        FILE_CREATE_FAIL = new ErrorCode("FILE_CREATE_FAIL", 15, new ErrorCodeInfo(700, "文件夹创建失败", Integer.valueOf(R$string.file_create_fail), str, i4, defaultConstructorMarker));
        FILE_NO_FOUND = new ErrorCode("FILE_NO_FOUND", 16, new ErrorCodeInfo(701, "文件找不到", Integer.valueOf(R$string.file_no_found), str, i4, defaultConstructorMarker));
        FILE_BREAKDOWN = new ErrorCode("FILE_BREAKDOWN", 17, new ErrorCodeInfo(702, "文件损坏（文件校验不通过）", Integer.valueOf(R$string.file_breakdown), str, i4, defaultConstructorMarker));
        FILE_OPERATION_FAIL = new ErrorCode("FILE_OPERATION_FAIL", 18, new ErrorCodeInfo(703, "文件操作失败，没有权限访问文件", Integer.valueOf(R$string.file_operation_fail), str, i4, defaultConstructorMarker));
        FILE_OCCUPY = new ErrorCode("FILE_OCCUPY", 19, new ErrorCodeInfo(704, "文件被占用", Integer.valueOf(R$string.file_occupy), str, i4, defaultConstructorMarker));
        FILE_PERMISSION = new ErrorCode("FILE_PERMISSION", 20, new ErrorCodeInfo(705, "文件权限", Integer.valueOf(R$string.file_no_permission), str, i4, defaultConstructorMarker));
        JSON_PARSE_FAIL = new ErrorCode("JSON_PARSE_FAIL", 21, new ErrorCodeInfo(720, "json解析失败", Integer.valueOf(R$string.json_parse_fail), str, i4, defaultConstructorMarker));
        JSON_NOT_RIGHT = new ErrorCode("JSON_NOT_RIGHT", 22, new ErrorCodeInfo(721, "json格式不正确", Integer.valueOf(R$string.json_not_right), str, i4, defaultConstructorMarker));
        CLASS_CAST_FAIL = new ErrorCode("CLASS_CAST_FAIL", 23, new ErrorCodeInfo(801, "类型转换失败", Integer.valueOf(R$string.class_cast_fail), str, i4, defaultConstructorMarker));
        ARGUMENT_SERIAL_FAIL = new ErrorCode("ARGUMENT_SERIAL_FAIL", 24, new ErrorCodeInfo(802, "参数异常", Integer.valueOf(R$string.argument_serial_fail), str, i4, defaultConstructorMarker));
        SYS_OOM = new ErrorCode("SYS_OOM", 25, new ErrorCodeInfo(800, "内存溢出", Integer.valueOf(R$string.sys_oom), str, i4, defaultConstructorMarker));
        NULL_POINT = new ErrorCode("NULL_POINT", 26, new ErrorCodeInfo(801, "空指针", Integer.valueOf(R$string.null_point), str, i4, defaultConstructorMarker));
        PARAMETER_NO_SET = new ErrorCode("PARAMETER_NO_SET", 27, new ErrorCodeInfo(802, "参数未设置", Integer.valueOf(R$string.parameter_no_set), str, i4, defaultConstructorMarker));
        USER_NOT_EXIST = new ErrorCode("USER_NOT_EXIST", 28, new ErrorCodeInfo(803, "用户不合法", Integer.valueOf(R$string.user_not_exist), str, i4, defaultConstructorMarker));
        IMAGE_CAPTURE_ERROR_UNKNOWN = new ErrorCode("IMAGE_CAPTURE_ERROR_UNKNOWN", 29, new ErrorCodeInfo(900, "拍照，图片处理未知异常", Integer.valueOf(R$string.image_capture_unknown), str, i4, defaultConstructorMarker));
        IMAGE_CAPTURE_ERROR_FILE_IO = new ErrorCode("IMAGE_CAPTURE_ERROR_FILE_IO", 30, new ErrorCodeInfo(901, "拍照写入文件失败", Integer.valueOf(R$string.image_capture_error_file_io), str, i4, defaultConstructorMarker));
        IMAGE_CAPTURE_CAPTURE_FAILED = new ErrorCode("IMAGE_CAPTURE_CAPTURE_FAILED", 31, new ErrorCodeInfo(902, "相机框架报告的错误，指示捕获请求失败", Integer.valueOf(R$string.image_capture_capture_failed), str, i4, defaultConstructorMarker));
        IMAGE_CAPTURE_ERROR_CAMERA_CLOSED = new ErrorCode("IMAGE_CAPTURE_ERROR_CAMERA_CLOSED", 32, new ErrorCodeInfo(903, "错误消息，表明由于相机关闭，无法完成请求", Integer.valueOf(R$string.image_capture_error_camera_closed), str, i4, defaultConstructorMarker));
        IMAGE_CAPTURE_ERROR_INVALID_CAMERA = new ErrorCode("IMAGE_CAPTURE_ERROR_INVALID_CAMERA", 33, new ErrorCodeInfo(904, "指示此ImageCapture未绑定到有效相机的错误。", Integer.valueOf(R$string.image_capture_error_invalid_camera), str, i4, defaultConstructorMarker));
        OSS_NOT_SET = new ErrorCode("OSS_NOT_SET", 34, new ErrorCodeInfo(1000, "oss未设置", Integer.valueOf(R$string.oss_not_set), str, i4, defaultConstructorMarker));
        OSS_CALLBACK_FAILED = new ErrorCode("OSS_CALLBACK_FAILED", 35, new ErrorCodeInfo(PointerIconCompat.TYPE_CONTEXT_MENU, "OSS未能成功获取到图片信息，该图片可能上传失败或已被删除", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_TOO_MANY_CALLBACK_REQUEST = new ErrorCode("OSS_TOO_MANY_CALLBACK_REQUEST", 36, new ErrorCodeInfo(PointerIconCompat.TYPE_HAND, "OSS正在处理的Callback请求过多", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_COST_TOO_LONG_TIME = new ErrorCode("OSS_COST_TOO_LONG_TIME", 37, new ErrorCodeInfo(PointerIconCompat.TYPE_HELP, "回调服务器处理时间超过5秒，OSS将其判断为超时行为", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_RESPONSE_NOT_VALID_JSON = new ErrorCode("OSS_RESPONSE_NOT_VALID_JSON", 38, new ErrorCodeInfo(PointerIconCompat.TYPE_WAIT, "回调服务器返回给OSS的Body不为JSON格式", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_BUCKET_NOT_VALID = new ErrorCode("OSS_BUCKET_NOT_VALID", 39, new ErrorCodeInfo(PointerIconCompat.TYPE_GRAB, "Bucket命名不符合规范", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_OBJECT_NAME_EMPTY = new ErrorCode("OSS_OBJECT_NAME_EMPTY", 40, new ErrorCodeInfo(PointerIconCompat.TYPE_GRABBING, "Object命名不符合规范", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_OBJECT_NAME_TOO_LONG = new ErrorCode("OSS_OBJECT_NAME_TOO_LONG", 41, new ErrorCodeInfo(1022, "The Length of Object name must be less than 1024", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_OBJECT_NAME__NOT_VALID = new ErrorCode("OSS_OBJECT_NAME__NOT_VALID", 42, new ErrorCodeInfo(1023, "The specified object is not valid", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_TOO_MANY_BUCKETS = new ErrorCode("OSS_TOO_MANY_BUCKETS", 43, new ErrorCodeInfo(1024, "You have attempted to create more buckets than allowed", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_REQUEST_NOT_MULTI_PART_CONTENT = new ErrorCode("OSS_REQUEST_NOT_MULTI_PART_CONTENT", 44, new ErrorCodeInfo(InputDeviceCompat.SOURCE_GAMEPAD, "Post操作提交表单编码不是multipart/form-data类型", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_NOT_IMPLEMENTED = new ErrorCode("OSS_NOT_IMPLEMENTED", 45, new ErrorCodeInfo(1026, "A header you provided implies functionality that is not implemented", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_MISSING_ARGUMENT = new ErrorCode("OSS_MISSING_ARGUMENT", 46, new ErrorCodeInfo(1027, "封装API时缺少必选参数", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_INVALID_ARGUMENT = new ErrorCode("OSS_INVALID_ARGUMENT", 47, new ErrorCodeInfo(1028, "参数格式不符合要求", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_REPEATED_TAGS = new ErrorCode("OSS_REPEATED_TAGS", 48, new ErrorCodeInfo(1029, "标签中的Key已存在", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_INVALID_HOST_BUCKET = new ErrorCode("OSS_INVALID_HOST_BUCKET", 49, new ErrorCodeInfo(1030, "Host参数错误", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_ACCESS_DENIED = new ErrorCode("OSS_ACCESS_DENIED", 50, new ErrorCodeInfo(1031, "没有相应的访问权限，可能token过期", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_CLIENT_ERROR = new ErrorCode("OSS_CLIENT_ERROR", 51, new ErrorCodeInfo(1032, "统一的oss客户端异常", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_CLIENT_FILE_NOT_FOUND = new ErrorCode("OSS_CLIENT_FILE_NOT_FOUND", 52, new ErrorCodeInfo(1033, "文件不存在", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
        OSS_CLIENT_SOCKET_TIME_OUT = new ErrorCode("OSS_CLIENT_SOCKET_TIME_OUT", 53, new ErrorCodeInfo(1034, "连接超时", Integer.valueOf(R$string.oss_server_error), str, i4, defaultConstructorMarker));
    }

    private ErrorCode(String str, int i4, ErrorCodeInfo errorCodeInfo) {
        this.errorCodeInfo = errorCodeInfo;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    public final ErrorCodeInfo getErrorCodeInfo() {
        return this.errorCodeInfo;
    }
}
