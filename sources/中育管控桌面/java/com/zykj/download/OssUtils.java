package com.zykj.download;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import androidx.annotation.Keep;
import androidx.work.Data;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Keep
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m7880d2 = {"Lcom/zykj/download/OssUtils;", "", "()V", "DEFAULT_CHECK_SUM_GRID_FS", "", "DEFAULT_CHECK_SUM_ZY_FS", "ERROR_KEY", "FILE_DIR", "FILE_NAME", "FILE_PATH", "FILE_URL", "OSS_ACCESS_KEY_ID", "OSS_ACCESS_KEY_SECRET", "OSS_BUCKET", OssUtils.OSS_DATA, "OSS_ENDPOINT", "OSS_OBJECT_NAME", "OSS_SECURITY_TOKEN", "PROGRESS", "SPEED", "SUCCESS_KEY", "clientConfiguration", "Lcom/alibaba/sdk/android/oss/ClientConfiguration;", "checkDownloadDir", "context", "Landroid/content/Context;", "dir", "checkFileName", "fileName", "fileUrl", "getCacheDir", "getObjectKey", "ossToken", "Lcom/zykj/download/OssToken;", "getOssClient", "Lcom/alibaba/sdk/android/oss/OSSClient;", "getOssToken", "inputData", "Landroidx/work/Data;", "isNetworkConnected", "", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
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
        clientConfiguration2.setSocketTimeout(60000);
        clientConfiguration = clientConfiguration2;
    }

    private OssUtils() {
    }

    private final String getCacheDir(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "{\n            externalFilesDir.absolutePath\n        }");
            return absolutePath;
        }
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "{\n            context.cacheDir.absolutePath\n        }");
        return absolutePath2;
    }

    public final String checkDownloadDir(Context context, String dir) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (dir == null || dir.length() == 0) {
            return getCacheDir(context);
        }
        File file = new File(dir);
        return (file.exists() || file.mkdirs()) ? dir : INSTANCE.getCacheDir(context);
    }

    public final String checkFileName(String fileName, String fileUrl) {
        int iLastIndexOf$default;
        int i6;
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        if (fileName == null || fileName.length() == 0) {
            if (StringsKt.isBlank(fileUrl) || (iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) fileUrl, "/", 0, false, 6, (Object) null)) == -1 || fileUrl.length() == (i6 = iLastIndexOf$default + 1)) {
                fileName = UUID.randomUUID().toString();
            } else {
                fileName = fileUrl.substring(i6);
                Intrinsics.checkNotNullExpressionValue(fileName, "(this as java.lang.String).substring(startIndex)");
            }
        }
        if (fileName.length() <= 64) {
            return fileName;
        }
        String strSubstring = fileName.substring(0, 63);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String getObjectKey(OssToken ossToken, String fileUrl) {
        Intrinsics.checkNotNullParameter(ossToken, "ossToken");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        return StringsKt.replace$default(fileUrl, Intrinsics.stringPlus(ossToken.getEndpoint(), new Regex("/")), "", false, 4, (Object) null);
    }

    public final OSSClient getOssClient(Context context, OssToken ossToken) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ossToken, "ossToken");
        return new OSSClient(context, StringsKt.replace$default(ossToken.getEndpoint(), Intrinsics.stringPlus(ossToken.getBucket(), new Regex(".")), "", false, 4, (Object) null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken()), clientConfiguration);
    }

    public final OssToken getOssToken(Data inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
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
