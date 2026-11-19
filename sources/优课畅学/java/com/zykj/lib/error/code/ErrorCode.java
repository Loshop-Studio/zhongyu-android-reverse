package com.zykj.lib.error.code;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.smtt.sdk.TbsListener;

@Keep
/* loaded from: classes4.dex */
public enum ErrorCode {
    DEFAULT_ERROR(new ErrorCodeInfo(100, "异常", Integer.valueOf(R$string.default_error), null, 8, null)),
    NET_PARAMETER_ERROR(new ErrorCodeInfo(TbsListener.ErrorCode.INFO_CODE_BASE, "请求参数不正确", Integer.valueOf(R$string.net_parameter_error), null, 8, null)),
    NET_TOKEN_ERROR(new ErrorCodeInfo(401, "token未设置或token不正确", Integer.valueOf(R$string.net_token_error), null, 8, null)),
    NET_TOKEN_EXPIRED(new ErrorCodeInfo(4011, "用户Token已过期", Integer.valueOf(R$string.net_token_expired), null, 8, null)),
    NET_NO_PERMISSION(new ErrorCodeInfo(403, "用户无权限", Integer.valueOf(R$string.net_no_permission), null, 8, null)),
    NET_URL_NOT_FOUND(new ErrorCodeInfo(TbsListener.ErrorCode.INFO_DISABLE_X5, "url不正确", Integer.valueOf(R$string.net_url_not_found), null, 8, null)),
    NET_SERVER_ERROR(new ErrorCodeInfo(TbsListener.ErrorCode.INFO_CODE_MINIQB, "服务器异常", Integer.valueOf(R$string.net_server_error), null, 8, null)),
    NET_SERVER_NOT_AVAILABLE(new ErrorCodeInfo(503, "服务不可用", Integer.valueOf(R$string.net_server_not_available), null, 8, null)),
    NET_RESULT_NULL(new ErrorCodeInfo(593, "接口结果为null", Integer.valueOf(R$string.net_result_null), null, 8, null)),
    NET_UN_KNOW_SERVER(new ErrorCodeInfo(594, "java.net.UnknownServiceException: CLEARTEXT communication not enabled for client", Integer.valueOf(R$string.net_server_un_know), null, 8, null)),
    NET_RESPONSE_NULL(new ErrorCodeInfo(595, "接口返回null", Integer.valueOf(R$string.net_response_null), null, 8, null)),
    NET_SYS_TIME_ERROR(new ErrorCodeInfo(596, "系统时间异常", Integer.valueOf(R$string.net_sys_time_error), null, 8, null)),
    NET_SOCKET_TIME_OUT(new ErrorCodeInfo(597, "网络连接超时", Integer.valueOf(R$string.net_socket_time_out), null, 8, null)),
    NET_OFFLINE_MODE(new ErrorCodeInfo(598, "离线模式", Integer.valueOf(R$string.net_offline_mode), null, 8, null)),
    NET_NO_CONNECT(new ErrorCodeInfo(599, "没有连接网络", Integer.valueOf(R$string.net_no_connect), null, 8, null)),
    FILE_CREATE_FAIL(new ErrorCodeInfo(700, "文件夹创建失败", Integer.valueOf(R$string.file_create_fail), null, 8, null)),
    FILE_NO_FOUND(new ErrorCodeInfo(701, "文件找不到", Integer.valueOf(R$string.file_no_found), null, 8, null)),
    FILE_BREAKDOWN(new ErrorCodeInfo(702, "文件损坏（文件校验不通过）", Integer.valueOf(R$string.file_breakdown), null, 8, null)),
    FILE_OPERATION_FAIL(new ErrorCodeInfo(703, "文件操作失败，没有权限访问文件", Integer.valueOf(R$string.file_operation_fail), null, 8, null)),
    FILE_OCCUPY(new ErrorCodeInfo(704, "文件被占用", Integer.valueOf(R$string.file_occupy), null, 8, null)),
    FILE_PERMISSION(new ErrorCodeInfo(TypedValues.TransitionType.TYPE_INTERPOLATOR, "文件权限", Integer.valueOf(R$string.file_no_permission), null, 8, null)),
    JSON_PARSE_FAIL(new ErrorCodeInfo(720, "json解析失败", Integer.valueOf(R$string.json_parse_fail), null, 8, null)),
    JSON_NOT_RIGHT(new ErrorCodeInfo(721, "json格式不正确", Integer.valueOf(R$string.json_not_right), null, 8, null)),
    CLASS_CAST_FAIL(new ErrorCodeInfo(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE, "类型转换失败", Integer.valueOf(R$string.class_cast_fail), null, 8, null)),
    ARGUMENT_SERIAL_FAIL(new ErrorCodeInfo(IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, "参数异常", Integer.valueOf(R$string.argument_serial_fail), null, 8, null)),
    SYS_OOM(new ErrorCodeInfo(800, "内存溢出", Integer.valueOf(R$string.sys_oom), null, 8, null)),
    NULL_POINT(new ErrorCodeInfo(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE, "空指针", Integer.valueOf(R$string.null_point), null, 8, null)),
    PARAMETER_NO_SET(new ErrorCodeInfo(IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, "参数未设置", Integer.valueOf(R$string.parameter_no_set), null, 8, null)),
    USER_NOT_EXIST(new ErrorCodeInfo(803, "用户不合法", Integer.valueOf(R$string.user_not_exist), null, 8, null)),
    IMAGE_CAPTURE_ERROR_UNKNOWN(new ErrorCodeInfo(900, "拍照，图片处理未知异常", Integer.valueOf(R$string.image_capture_unknown), null, 8, null)),
    IMAGE_CAPTURE_ERROR_FILE_IO(new ErrorCodeInfo(901, "拍照写入文件失败", Integer.valueOf(R$string.image_capture_error_file_io), null, 8, null)),
    IMAGE_CAPTURE_CAPTURE_FAILED(new ErrorCodeInfo(902, "相机框架报告的错误，指示捕获请求失败", Integer.valueOf(R$string.image_capture_capture_failed), null, 8, null)),
    IMAGE_CAPTURE_ERROR_CAMERA_CLOSED(new ErrorCodeInfo(TypedValues.Custom.TYPE_STRING, "错误消息，表明由于相机关闭，无法完成请求", Integer.valueOf(R$string.image_capture_error_camera_closed), null, 8, null)),
    IMAGE_CAPTURE_ERROR_INVALID_CAMERA(new ErrorCodeInfo(TypedValues.Custom.TYPE_BOOLEAN, "指示此ImageCapture未绑定到有效相机的错误。", Integer.valueOf(R$string.image_capture_error_invalid_camera), null, 8, null)),
    OSS_NOT_SET(new ErrorCodeInfo(1000, "oss未设置", Integer.valueOf(R$string.oss_not_set), null, 8, null)),
    OSS_CALLBACK_FAILED(new ErrorCodeInfo(1001, "OSS未能成功获取到图片信息，该图片可能上传失败或已被删除", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_TOO_MANY_CALLBACK_REQUEST(new ErrorCodeInfo(1002, "OSS正在处理的Callback请求过多", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_COST_TOO_LONG_TIME(new ErrorCodeInfo(1003, "回调服务器处理时间超过5秒，OSS将其判断为超时行为", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_RESPONSE_NOT_VALID_JSON(new ErrorCodeInfo(1004, "回调服务器返回给OSS的Body不为JSON格式", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_BUCKET_NOT_VALID(new ErrorCodeInfo(1020, "Bucket命名不符合规范", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_OBJECT_NAME_EMPTY(new ErrorCodeInfo(1021, "Object命名不符合规范", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_OBJECT_NAME_TOO_LONG(new ErrorCodeInfo(1022, "The Length of Object name must be less than 1024", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_OBJECT_NAME__NOT_VALID(new ErrorCodeInfo(TXLiteAVCode.EVT_CAMERA_REMOVED, "The specified object is not valid", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_TOO_MANY_BUCKETS(new ErrorCodeInfo(1024, "You have attempted to create more buckets than allowed", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_REQUEST_NOT_MULTI_PART_CONTENT(new ErrorCodeInfo(1025, "Post操作提交表单编码不是multipart/form-data类型", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_NOT_IMPLEMENTED(new ErrorCodeInfo(TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START, "A header you provided implies functionality that is not implemented", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_MISSING_ARGUMENT(new ErrorCodeInfo(TXLiteAVCode.EVT_HW_ENCODER_START_SUCC, "封装API时缺少必选参数", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_INVALID_ARGUMENT(new ErrorCodeInfo(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC, "参数格式不符合要求", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_REPEATED_TAGS(new ErrorCodeInfo(TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, "标签中的Key已存在", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_INVALID_HOST_BUCKET(new ErrorCodeInfo(TXLiteAVCode.EVT_LOCAL_RECORD_PROGRESS, "Host参数错误", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_ACCESS_DENIED(new ErrorCodeInfo(1031, "没有相应的访问权限，可能token过期", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_CLIENT_ERROR(new ErrorCodeInfo(1032, "统一的oss客户端异常", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_CLIENT_FILE_NOT_FOUND(new ErrorCodeInfo(1033, "文件不存在", Integer.valueOf(R$string.oss_server_error), null, 8, null)),
    OSS_CLIENT_SOCKET_TIME_OUT(new ErrorCodeInfo(1034, "连接超时", Integer.valueOf(R$string.oss_server_error), null, 8, null));

    private final ErrorCodeInfo errorCodeInfo;

    ErrorCode(ErrorCodeInfo errorCodeInfo) {
        this.errorCodeInfo = errorCodeInfo;
    }

    public final ErrorCodeInfo getErrorCodeInfo() {
        return this.errorCodeInfo;
    }
}
