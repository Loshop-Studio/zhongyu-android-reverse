package com.zykj.download;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import androidx.annotation.Keep;
import androidx.work.C0810a;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import java.io.File;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2484j;
import p082e3.C2495u;
import p082e3.C2496v;

@Keep
/* loaded from: classes.dex */
public final class OssUtils {

    @NotNull
    public static final String DEFAULT_CHECK_SUM = "3f4e17759c6b9c6a364211895bbb2abdc0ba62db";

    @NotNull
    public static final String ERROR_KEY = "error_key";

    @NotNull
    public static final String FILE_DIR = "file_dir";

    @NotNull
    public static final String FILE_NAME = "file_name";

    @NotNull
    public static final String FILE_PATH = "file_path";

    @NotNull
    public static final String FILE_URL = "file_url";

    @NotNull
    public static final OssUtils INSTANCE = new OssUtils();

    @NotNull
    public static final String OSS_ACCESS_KEY_ID = "access_key_id";

    @NotNull
    public static final String OSS_ACCESS_KEY_SECRET = "access_Key_secret";

    @NotNull
    public static final String OSS_BUCKET = "bucket";

    @NotNull
    public static final String OSS_ENDPOINT = "endpoint";

    @NotNull
    public static final String OSS_OBJECT_NAME = "oss_object_name";

    @NotNull
    public static final String OSS_SECURITY_TOKEN = "security_token";

    @NotNull
    public static final String PROGRESS = "progress";

    @NotNull
    public static final String SPEED = "speed";

    @NotNull
    public static final String SUCCESS_KEY = "success_key";

    @NotNull
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
            C2769l.m9240d(absolutePath, "{\n            externalFilesDir.absolutePath\n        }");
            return absolutePath;
        }
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        C2769l.m9240d(absolutePath2, "{\n            context.cacheDir.absolutePath\n        }");
        return absolutePath2;
    }

    @NotNull
    public final String checkDownloadDir(@NotNull Context context, @Nullable String str) {
        C2769l.m9241e(context, "context");
        if (str != null) {
            if (!(str.length() == 0)) {
                File file = new File(str);
                return (file.exists() || file.mkdirs()) ? str : INSTANCE.getCacheDir(context);
            }
        }
        return getCacheDir(context);
    }

    @NotNull
    public final String checkFileName(@Nullable String str, @NotNull String fileUrl) {
        int iM8386Z;
        int i4;
        C2769l.m9241e(fileUrl, "fileUrl");
        if (str == null || str.length() == 0) {
            if (!(!C2495u.m8346r(fileUrl)) || (iM8386Z = C2496v.m8386Z(fileUrl, "/", 0, false, 6, null)) == -1 || fileUrl.length() == (i4 = iM8386Z + 1)) {
                str = UUID.randomUUID().toString();
            } else {
                str = fileUrl.substring(i4);
                C2769l.m9240d(str, "(this as java.lang.String).substring(startIndex)");
            }
        }
        if (str.length() <= 64) {
            return str;
        }
        String strSubstring = str.substring(0, 63);
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String getObjectKey(@NotNull OssToken ossToken, @NotNull String fileUrl) {
        C2769l.m9241e(ossToken, "ossToken");
        C2769l.m9241e(fileUrl, "fileUrl");
        return C2495u.m8353y(fileUrl, C2769l.m9248l(ossToken.getEndpoint(), new C2484j("/")), "", false, 4, null);
    }

    @NotNull
    public final OSSClient getOssClient(@NotNull Context context, @NotNull OssToken ossToken) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(ossToken, "ossToken");
        return new OSSClient(context, C2495u.m8353y(ossToken.getEndpoint(), C2769l.m9248l(ossToken.getBucket(), new C2484j(".")), "", false, 4, null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken()), clientConfiguration);
    }

    @NotNull
    public final OssToken getOssToken(@NotNull C0810a inputData) throws NullPointerException {
        C2769l.m9241e(inputData, "inputData");
        String strM4152j = inputData.m4152j(OSS_ENDPOINT);
        if (strM4152j == null || strM4152j.length() == 0) {
            throw new NullPointerException("endPoint is null");
        }
        String strM4152j2 = inputData.m4152j(OSS_BUCKET);
        if (strM4152j2 == null || strM4152j2.length() == 0) {
            throw new NullPointerException("bucket is null");
        }
        String strM4152j3 = inputData.m4152j(OSS_SECURITY_TOKEN);
        if (strM4152j3 == null || strM4152j3.length() == 0) {
            throw new NullPointerException("securityToken is null");
        }
        String strM4152j4 = inputData.m4152j(OSS_ACCESS_KEY_ID);
        if (strM4152j4 == null || strM4152j4.length() == 0) {
            throw new NullPointerException("accessKeyId is null");
        }
        String strM4152j5 = inputData.m4152j(OSS_ACCESS_KEY_SECRET);
        if (strM4152j5 == null || strM4152j5.length() == 0) {
            throw new NullPointerException("accessKeySecret is null");
        }
        return new OssToken(StrategyEnum.ALI_OSS, strM4152j, strM4152j2, strM4152j4, strM4152j5, strM4152j3);
    }

    public final boolean isNetworkConnected(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
