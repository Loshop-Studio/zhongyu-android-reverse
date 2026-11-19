package com.alibaba.sdk.android.tbrest.request;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.tbrest.SendService;
import com.alibaba.sdk.android.tbrest.rest.RestConstants;
import com.alibaba.sdk.android.tbrest.utils.ByteUtils;
import com.alibaba.sdk.android.tbrest.utils.GzipUtils;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.p101ut.device.UTDevice;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public class BizRequest {
    private static final byte FLAGS_GET_CONFIG = 32;
    private static final byte FLAGS_GZIP = 1;
    private static final byte FLAGS_GZIP_FLUSH_DIC = 2;
    private static final byte FLAGS_KEEP_ALIVE = 8;
    private static final byte FLAGS_NO_GZIP = 0;
    private static final byte FLAGS_REAL_TIME_DEBUG = 16;
    private static final int HEAD_LENGTH = 8;
    private static final int PAYLOAD_MAX_LENGTH = 16777216;
    private static long mReceivedDataLen = 0;
    static String mResponseAdditionalData = null;
    static boolean needConfigByResponse = false;

    public static String getHead(SendService sendService, String str, Context context) {
        String str2;
        String str3 = sendService.appVersion;
        String str4 = str3 == null ? "" : str3;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Unknown";
        }
        String str5 = str2;
        String str6 = sendService.channel;
        String str7 = String.format("ak=%s&av=%s&avsys=%s&c=%s&d=%s&sv=%s", str, str4, str5, str6 == null ? "" : str6, UTDevice.getUtdid(context), RestConstants.UT_SDK_VRESION);
        LogUtil.m3872i("send url :" + str7);
        return str7;
    }

    public static byte[] getPackRequest(Context context, SendService sendService, Map<String, String> map) {
        return getPackRequest(sendService, sendService.appKey, context, map, 1);
    }

    public static byte[] getPackRequestByRealtime(Context context, SendService sendService, Map<String, String> map) {
        return getPackRequest(sendService, sendService.appKey, context, map, 2);
    }

    private static byte[] getPayload(SendService sendService, String str, Context context, Map<String, String> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String head = getHead(sendService, str, context);
        if (head == null || head.length() <= 0) {
            byteArrayOutputStream.write(ByteUtils.intToBytes2(0));
        } else {
            byteArrayOutputStream.write(ByteUtils.intToBytes2(head.getBytes().length));
            byteArrayOutputStream.write(head.getBytes());
        }
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                byteArrayOutputStream.write(ByteUtils.intToBytes4(Integer.valueOf(str2).intValue()));
                String str3 = map.get(str2);
                if (str3 != null) {
                    byteArrayOutputStream.write(ByteUtils.intToBytes4(str3.getBytes().length));
                    byteArrayOutputStream.write(str3.getBytes());
                } else {
                    byteArrayOutputStream.write(ByteUtils.intToBytes4(0));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            LogUtil.m3870e(e10.toString());
            return byteArray;
        }
    }

    public static int parseResult(byte[] bArr) throws Throwable {
        int iBytesToInt = -1;
        if (bArr == null || bArr.length < 12) {
            LogUtil.m3870e("recv errCode UNKNOWN_ERROR");
        } else {
            mReceivedDataLen = bArr.length;
            if (ByteUtils.bytesToInt(bArr, 1, 3) + 8 != bArr.length) {
                LogUtil.m3870e("recv len error");
            } else {
                boolean z10 = 1 == (bArr[5] & 1);
                iBytesToInt = ByteUtils.bytesToInt(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length <= 0) {
                    mResponseAdditionalData = null;
                } else if (z10) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 12, bArr2, 0, length);
                    byte[] bArrUnGzip = GzipUtils.unGzip(bArr2);
                    mResponseAdditionalData = new String(bArrUnGzip, 0, bArrUnGzip.length);
                } else {
                    mResponseAdditionalData = new String(bArr, 12, length);
                }
            }
        }
        LogUtil.m3869d("errCode:" + iBytesToInt);
        return iBytesToInt;
    }

    public static byte[] getPackRequest(SendService sendService, String str, Context context, Map<String, String> map) {
        return getPackRequest(sendService, str, context, map, 1);
    }

    public static byte[] getPackRequestByRealtime(SendService sendService, String str, Context context, Map<String, String> map) {
        return getPackRequest(sendService, str, context, map, 2);
    }

    public static byte[] getPackRequest(SendService sendService, String str, Context context, Map<String, String> map, int i10) throws Throwable {
        byte[] bArrGzip = GzipUtils.gzip(getPayload(sendService, str, context, map));
        if (bArrGzip == null || bArrGzip.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(ByteUtils.intToBytes3(bArrGzip.length));
        byteArrayOutputStream.write(i10);
        byte b10 = (byte) 9;
        if (needConfigByResponse) {
            b10 = (byte) (b10 | FLAGS_GET_CONFIG);
        }
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArrGzip);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            LogUtil.m3870e(e10.toString());
            return byteArray;
        }
    }
}
