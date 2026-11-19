package com.zykj.download;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import androidx.annotation.Keep;
import androidx.work.Data;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.blankj.utilcode.constant.TimeConstants;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

@Keep
/* loaded from: classes6.dex */
public final class OssUtils {
    public static final String DEFAULT_CHECK_SUM_GRID_FS = "3f4e17759c6b9c6a364211895bbb2abdc0ba62db";
    public static final String DEFAULT_CHECK_SUM_ZY_FS = "3f4e17759c6b9c6a364211895bbb2abdc0ba62db";
    public static final String ERROR_KEY = "error_key";
    public static final String FILE_DIR = "file_dir";
    public static final String FILE_NAME = "file_name";
    public static final String FILE_PATH = "file_path";
    public static final String FILE_URL = "file_url";
    public static final OssUtils INSTANCE = new OssUtils();
    public static final String OSS_ACCESS_KEY_ID = "access_key_id";
    public static final String OSS_ACCESS_KEY_SECRET = "access_Key_secret";
    public static final String OSS_BUCKET = "bucket";
    public static final String OSS_DATA = "OSS_DATA";
    public static final String OSS_ENDPOINT = "endpoint";
    public static final String OSS_OBJECT_NAME = "oss_object_name";
    public static final String OSS_SECURITY_TOKEN = "security_token";
    public static final String PROGRESS = "progress";
    public static final String SPEED = "speed";
    public static final String SUCCESS_KEY = "success_key";
    private static final ClientConfiguration clientConfiguration;

    static {
        ClientConfiguration clientConfiguration2 = new ClientConfiguration();
        clientConfiguration2.setConnectionTimeout(10000);
        clientConfiguration2.setSocketTimeout(TimeConstants.MIN);
        clientConfiguration = clientConfiguration2;
    }

    private OssUtils() {
    }

    private final String getCacheDir(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            AbstractC9979u.m20293f(absolutePath, "{\n            externalFilesDir.absolutePath\n        }");
            return absolutePath;
        }
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath2, "{\n            context.cacheDir.absolutePath\n        }");
        return absolutePath2;
    }

    public final String checkDownloadDir(Context context, String str) {
        AbstractC9979u.m20294g(context, "context");
        if (str == null || str.length() == 0) {
            return getCacheDir(context);
        }
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : INSTANCE.getCacheDir(context);
    }

    public final String checkFileName(String str, String fileUrl) {
        int iM23136l0;
        int i10;
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        if (str == null || str.length() == 0) {
            if (AbstractC10793c0.m23132h0(fileUrl) || (iM23136l0 = AbstractC10793c0.m23136l0(fileUrl, MqttTopic.TOPIC_LEVEL_SEPARATOR, 0, false, 6, null)) == -1 || fileUrl.length() == (i10 = iM23136l0 + 1)) {
                str = UUID.randomUUID().toString();
            } else {
                str = fileUrl.substring(i10);
                AbstractC9979u.m20293f(str, "(this as java.lang.String).substring(startIndex)");
            }
        }
        if (str.length() <= 64) {
            return str;
        }
        String strSubstring = str.substring(0, 63);
        AbstractC9979u.m20293f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String getObjectKey(OssToken ossToken, String fileUrl) {
        AbstractC9979u.m20294g(ossToken, "ossToken");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        return AbstractC10819z.m23238K(fileUrl, AbstractC9979u.m20303p(ossToken.getEndpoint(), new Regex(MqttTopic.TOPIC_LEVEL_SEPARATOR)), "", false, 4, null);
    }

    public final OSSClient getOssClient(Context context, OssToken ossToken) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(ossToken, "ossToken");
        return new OSSClient(context, AbstractC10819z.m23238K(ossToken.getEndpoint(), AbstractC9979u.m20303p(ossToken.getBucket(), new Regex(Consts.DOT)), "", false, 4, null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken()), clientConfiguration);
    }

    public final OssToken getOssToken(Data inputData) {
        AbstractC9979u.m20294g(inputData, "inputData");
        String string = inputData.getString(OSS_ENDPOINT);
        if (string == null || string.length() == 0) {
            throw new NullPointerException("endPoint is null");
        }
        String string2 = inputData.getString(OSS_BUCKET);
        if (string2 == null || string2.length() == 0) {
            throw new NullPointerException("bucket is null");
        }
        String string3 = inputData.getString(OSS_SECURITY_TOKEN);
        if (string3 == null || string3.length() == 0) {
            throw new NullPointerException("securityToken is null");
        }
        String string4 = inputData.getString(OSS_ACCESS_KEY_ID);
        if (string4 == null || string4.length() == 0) {
            throw new NullPointerException("accessKeyId is null");
        }
        String string5 = inputData.getString(OSS_ACCESS_KEY_SECRET);
        if (string5 == null || string5.length() == 0) {
            throw new NullPointerException("accessKeySecret is null");
        }
        return new OssToken(StrategyEnum.ALI_OSS, string, string2, string4, string5, string3);
    }

    public final boolean isNetworkConnected(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
