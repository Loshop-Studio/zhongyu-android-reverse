package com.tencent.smtt.sdk.p058a;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.TbsCoreLoadStat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsShareManager;
import com.tencent.smtt.utils.C6860q;
import com.tencent.smtt.utils.TbsLog;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.tencent.smtt.sdk.a.b */
/* loaded from: classes4.dex */
public class C6772b {

    /* renamed from: a */
    public static byte[] f6746a;

    static {
        try {
            f6746a = "65dRa93L".getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: a */
    private static String m5989a(Context context) throws NoSuchAlgorithmException {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            if (byteArray != null) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                if (bArrDigest != null) {
                    StringBuilder sb = new StringBuilder("");
                    if (bArrDigest.length <= 0) {
                        return null;
                    }
                    for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                        String upperCase = Integer.toHexString(bArrDigest[i10] & 255).toUpperCase();
                        if (i10 > 0) {
                            sb.append(":");
                        }
                        if (upperCase.length() < 2) {
                            sb.append(0);
                        }
                        sb.append(upperCase);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static JSONObject m5993c(C0000a c0000a, Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("APPNAME", c0000a.f0a);
            jSONObject.put("TIME", c0000a.f1b);
            jSONObject.put("QUA2", c0000a.f2c);
            jSONObject.put("LC", c0000a.f3d);
            jSONObject.put("GUID", c0000a.f4e);
            jSONObject.put("IMEI", c0000a.f5f);
            jSONObject.put("IMSI", c0000a.f6g);
            jSONObject.put("MAC", c0000a.f7h);
            jSONObject.put("PV", c0000a.f8i);
            jSONObject.put("CORETYPE", c0000a.f9j);
            jSONObject.put("APPVN", c0000a.f10k);
            String str = c0000a.f11l;
            if (str == null) {
                str = "0";
            }
            jSONObject.put("SIGNATURE", str);
            jSONObject.put("PROTOCOL_VERSION", 3);
            jSONObject.put("ANDROID_ID", c0000a.f12m);
            if (TbsShareManager.isThirdPartyApp(context)) {
                jSONObject.put("HOST_COREVERSION", TbsShareManager.getHostCoreVersions(context));
            } else {
                jSONObject.put("HOST_COREVERSION", TbsDownloader.getCoreShareDecoupleCoreVersion());
                jSONObject.put("DECOUPLE_COREVERSION", TbsDownloader.getCoreShareDecoupleCoreVersion());
            }
            if (c0000a.f9j == 0) {
                jSONObject.put("WIFICONNECTEDTIME", c0000a.f13n);
                jSONObject.put("CORE_EXIST", c0000a.f14o);
                int i10 = TbsCoreLoadStat.mLoadErrorCode;
                if (c0000a.f14o <= 0) {
                    jSONObject.put("TBS_ERROR_CODE", TbsDownloadConfig.getInstance(context).getDownloadInterruptCode());
                } else {
                    jSONObject.put("TBS_ERROR_CODE", i10);
                }
                if (i10 == -1) {
                    TbsLog.m6246e("sdkreport", "ATTENTION: Load errorCode missed!");
                }
            }
            try {
                if (QbSdk.getTID() != null) {
                    if (c0000a.f0a.equals(TbsConfig.APP_QQ)) {
                        jSONObject.put("TID", C6860q.m6346a().m6348a(QbSdk.getTID()));
                        jSONObject.put("TIDTYPE", 1);
                        return jSONObject;
                    }
                    if (c0000a.f0a.equals(TbsConfig.APP_WX)) {
                        jSONObject.put("TID", QbSdk.getTID());
                        jSONObject.put("TIDTYPE", 0);
                    }
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            TbsLog.m6246e("sdkreport", "getPostData exception!");
            return null;
        }
    }

    /* renamed from: a */
    public static void m5990a(C0000a c0000a, Context context) {
        new C6773c("HttpUtils", context, c0000a).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:16:0x004a, B:18:0x0080, B:20:0x0089, B:22:0x009d, B:24:0x00a3, B:26:0x00a7, B:28:0x00ad, B:29:0x00af, B:31:0x00b5, B:33:0x00b9, B:35:0x00bf, B:36:0x00c1, B:39:0x00cc, B:41:0x00d2, B:45:0x00df, B:47:0x00e9, B:48:0x00f1, B:42:0x00d6, B:43:0x00da, B:44:0x00dd, B:19:0x0083), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:16:0x004a, B:18:0x0080, B:20:0x0089, B:22:0x009d, B:24:0x00a3, B:26:0x00a7, B:28:0x00ad, B:29:0x00af, B:31:0x00b5, B:33:0x00b9, B:35:0x00bf, B:36:0x00c1, B:39:0x00cc, B:41:0x00d2, B:45:0x00df, B:47:0x00e9, B:48:0x00f1, B:42:0x00d6, B:43:0x00da, B:44:0x00dd, B:19:0x0083), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:16:0x004a, B:18:0x0080, B:20:0x0089, B:22:0x009d, B:24:0x00a3, B:26:0x00a7, B:28:0x00ad, B:29:0x00af, B:31:0x00b5, B:33:0x00b9, B:35:0x00bf, B:36:0x00c1, B:39:0x00cc, B:41:0x00d2, B:45:0x00df, B:47:0x00e9, B:48:0x00f1, B:42:0x00d6, B:43:0x00da, B:44:0x00dd, B:19:0x0083), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:16:0x004a, B:18:0x0080, B:20:0x0089, B:22:0x009d, B:24:0x00a3, B:26:0x00a7, B:28:0x00ad, B:29:0x00af, B:31:0x00b5, B:33:0x00b9, B:35:0x00bf, B:36:0x00c1, B:39:0x00cc, B:41:0x00d2, B:45:0x00df, B:47:0x00e9, B:48:0x00f1, B:42:0x00d6, B:43:0x00da, B:44:0x00dd, B:19:0x0083), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:16:0x004a, B:18:0x0080, B:20:0x0089, B:22:0x009d, B:24:0x00a3, B:26:0x00a7, B:28:0x00ad, B:29:0x00af, B:31:0x00b5, B:33:0x00b9, B:35:0x00bf, B:36:0x00c1, B:39:0x00cc, B:41:0x00d2, B:45:0x00df, B:47:0x00e9, B:48:0x00f1, B:42:0x00d6, B:43:0x00da, B:44:0x00dd, B:19:0x0083), top: B:55:0x004a }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5991a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, boolean r11, long r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p058a.C6772b.m5991a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, boolean, long):void");
    }
}
