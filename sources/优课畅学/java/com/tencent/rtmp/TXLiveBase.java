package com.tencent.rtmp;

import android.content.Context;
import android.util.Log;
import com.tencent.liteav.C6608k;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.C6581e;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class TXLiveBase {
    private static final String FILE_MD5_FFMPEG_ARM = "___md5_libtxffmpeg_arm_md5______";
    private static final String FILE_MD5_FFMPEG_V64 = "___md5_libtxffmpeg_v64_md5______";
    private static final String FILE_MD5_FFMPEG_V7A = "___md5_libtxffmpeg_v7a_md5______";
    private static final String FILE_MD5_LITEAV_ARM = "___md5_libliteavsdk_arm_md5_____";
    private static final String FILE_MD5_LITEAV_V64 = "___md5_libliteavsdk_v64_md5_____";
    private static final String FILE_MD5_LITEAV_V7A = "___md5_libliteavsdk_v7a_md5_____";
    private static final String FILE_MD5_SATURN_ARM = "___md5_libsaturn_arm_md5________";
    private static final String FILE_MD5_SATURN_V64 = "___md5_libsaturn_v64_md5________";
    private static final String FILE_MD5_SATURN_V7A = "___md5_libsaturn_v7a_md5________";
    private static final String FILE_MD5_TRAE_ARM = "___md5_libtraeimp_arm_md5_______";
    private static final String FILE_MD5_TRAE_V64 = "___md5_libtraeimp_v64_md5_______";
    private static final String FILE_MD5_TRAE_V7A = "___md5_libtraeimp_v7a_md5_______";
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static ITXLiveBaseListener listener;

    /* renamed from: com.tencent.rtmp.TXLiveBase$a */
    public static class C6725a implements TXCLog.InterfaceC6583a {
        private C6725a() {
        }

        @Override // com.tencent.liteav.basic.log.TXCLog.InterfaceC6583a
        /* renamed from: a */
        public void mo5000a(int i10, String str, String str2) {
            if (TXLiveBase.listener != null) {
                TXLiveBase.listener.OnLog(i10, str, str2);
            }
        }
    }

    private TXLiveBase() {
    }

    private static String getFileMD5(String str, String str2) throws NoSuchAlgorithmException, IOException {
        File file = new File(str, str2);
        MessageDigest messageDigest = null;
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i10 = fileInputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (NoSuchAlgorithmException e12) {
            e12.printStackTrace();
        }
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static String getPituSDKVersion() {
        return C6608k.m5191a();
    }

    public static String getSDKVersionStr() {
        return TXCCommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) throws NoSuchAlgorithmException, IOException {
        String fileMD5 = getFileMD5(str, "libliteavsdk.so");
        String fileMD52 = getFileMD5(str, "libsaturn.so");
        String fileMD53 = getFileMD5(str, "libtxffmpeg.so");
        String fileMD54 = getFileMD5(str, "libtraeimp-rtmp.so");
        Log.e(TAG, "MD5-CHECK-V64 libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V64 = " + FILE_MD5_LITEAV_V64);
        Log.e(TAG, "MD5-CHECK-V64 libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V64 = " + FILE_MD5_SATURN_V64);
        Log.e(TAG, "MD5-CHECK-V64 libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V64 = " + FILE_MD5_FFMPEG_V64);
        Log.e(TAG, "MD5-CHECK-V64 libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V64   = " + FILE_MD5_TRAE_V64);
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V64) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V64) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V64) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V64)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-V7A libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V7A = " + FILE_MD5_LITEAV_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V7A = " + FILE_MD5_SATURN_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V7A = " + FILE_MD5_FFMPEG_V7A);
        Log.e(TAG, "MD5-CHECK-V7A libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V7A   = " + FILE_MD5_TRAE_V7A);
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V7A) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V7A) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V7A) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V7A)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-ARM libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_ARM = " + FILE_MD5_LITEAV_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_ARM = " + FILE_MD5_SATURN_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_ARM = " + FILE_MD5_FFMPEG_ARM);
        Log.e(TAG, "MD5-CHECK-ARM libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_ARM   = " + FILE_MD5_TRAE_ARM);
        return fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_ARM) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_ARM) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_ARM) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_ARM);
    }

    public static void setAppID(String str) {
        TXCCommonUtil.setAppID(str);
    }

    public static void setAppVersion(String str) {
        TXCDRApi.txSetAppVersion(str);
        TXCCommonUtil.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z10) {
        TXCLog.setConsoleEnabled(z10);
    }

    public static void setLibraryPath(String str) {
        Log.i(TAG, "setLibraryPath " + str);
        C6592e.m5051b(str);
    }

    public static void setListener(ITXLiveBaseListener iTXLiveBaseListener) {
        TXCLog.setListener(new C6725a());
        listener = iTXLiveBaseListener;
    }

    public static void setLogLevel(int i10) {
        TXCLog.setLevel(i10);
    }

    public static void setPituLicencePath(String str) {
        TXCCommonUtil.setPituLicencePath(str);
    }

    public static void setUserId(String str) {
        TXCCommonUtil.setUserId(str);
    }

    public String getLicenceInfo(Context context) {
        C6581e c6581e = new C6581e();
        LicenceCheck.m4952a().m4978a(c6581e, context);
        return c6581e.f5484a;
    }

    public void setLicence(Context context, String str, String str2) {
        LicenceCheck.m4952a().m4980a(context, str, str2);
    }
}
