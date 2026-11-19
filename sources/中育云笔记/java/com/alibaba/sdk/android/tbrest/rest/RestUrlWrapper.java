package com.alibaba.sdk.android.tbrest.rest;

import android.content.Context;
import anet.channel.request.Request;
import com.alibaba.sdk.android.tbrest.utils.MD5Utils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class RestUrlWrapper {
    public static final String FIELD_APPKEY = "appkey";
    public static final String FIELD_APPVERSION = "app_version";
    public static final String FIELD_CHANNEL = "channel";
    public static final String FIELD_PLATFORM = "platform";
    public static final String FIELD_SDK_VERSION = "sdk_version";
    public static final String FIELD_T = "t";
    public static final String FIELD_UTDID = "utdid";
    public static final String FIELD_V = "v";
    static boolean enableSecuritySDK = false;
    static Context mContext;

    private static String _getEncoded(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String _wrapUrl(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, android.content.Context r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            r1 = r22
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r14 = java.lang.String.valueOf(r2)
            boolean r0 = com.alibaba.sdk.android.tbrest.rest.RestUrlWrapper.enableSecuritySDK
            java.lang.String r12 = "4.1.0"
            java.lang.String r2 = "3.0"
            java.lang.String r3 = ""
            if (r0 == 0) goto L93
            android.content.Context r0 = com.alibaba.sdk.android.tbrest.rest.RestUrlWrapper.mContext
            if (r0 == 0) goto L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r0.<init>()     // Catch: java.lang.Exception -> L87
            r0.append(r1)     // Catch: java.lang.Exception -> L87
            r4 = r23
            r0.append(r4)     // Catch: java.lang.Exception -> L83
            r5 = r24
            r0.append(r5)     // Catch: java.lang.Exception -> L7f
            r13 = r25
            r0.append(r13)     // Catch: java.lang.Exception -> L7b
            r0.append(r12)     // Catch: java.lang.Exception -> L7b
            r6 = r27
            r0.append(r6)     // Catch: java.lang.Exception -> L78
            r0.append(r14)     // Catch: java.lang.Exception -> L78
            r0.append(r2)     // Catch: java.lang.Exception -> L78
            r0.append(r3)     // Catch: java.lang.Exception -> L78
            if (r19 != 0) goto L44
            r7 = r3
            goto L46
        L44:
            r7 = r19
        L46:
            r0.append(r7)     // Catch: java.lang.Exception -> L78
            if (r20 != 0) goto L4d
            r7 = r3
            goto L4f
        L4d:
            r7 = r20
        L4f:
            r0.append(r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L78
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = com.alibaba.sdk.android.tbrest.utils.MD5Utils.getMd5Hex(r0)     // Catch: java.lang.Exception -> L78
            com.alibaba.sdk.android.tbrest.rest.g r7 = new com.alibaba.sdk.android.tbrest.rest.g     // Catch: java.lang.Exception -> L78
            android.content.Context r8 = com.alibaba.sdk.android.tbrest.rest.RestUrlWrapper.mContext     // Catch: java.lang.Exception -> L78
            r7.<init>(r8, r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r7 = r7.m3868b(r0)     // Catch: java.lang.Exception -> L78
            boolean r0 = com.alibaba.sdk.android.tbrest.utils.StringUtils.isNotBlank(r12)     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L74
            java.lang.String r0 = "1"
            goto L75
        L72:
            r0 = move-exception
            goto L8b
        L74:
            r0 = r3
        L75:
            r16 = r0
            goto L9e
        L78:
            r0 = move-exception
        L79:
            r7 = r3
            goto L8b
        L7b:
            r0 = move-exception
        L7c:
            r6 = r27
            goto L79
        L7f:
            r0 = move-exception
        L80:
            r13 = r25
            goto L7c
        L83:
            r0 = move-exception
        L84:
            r5 = r24
            goto L80
        L87:
            r0 = move-exception
            r4 = r23
            goto L84
        L8b:
            java.lang.String r8 = "security sdk signed"
            com.alibaba.sdk.android.tbrest.utils.LogUtil.m3873w(r8, r0)
            r16 = r3
            goto L9e
        L93:
            r4 = r23
            r5 = r24
            r13 = r25
            r6 = r27
            r7 = r3
            r16 = r7
        L9e:
            boolean r0 = com.alibaba.sdk.android.tbrest.utils.StringUtils.isEmpty(r18)
            if (r0 != 0) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r18
            r0.append(r3)
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        Lb7:
            java.lang.String r0 = _getEncoded(r1)
            java.lang.String r1 = _getEncoded(r5)
            java.lang.String r8 = _getEncoded(r4)
            java.lang.String r9 = _getEncoded(r2)
            java.lang.String r10 = _getEncoded(r7)
            java.lang.String r11 = _getEncoded(r6)
            java.lang.String r15 = ""
            r4 = r17
            r6 = r0
            r7 = r1
            r5 = r3
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r1 = "%s?%sak=%s&av=%s&c=%s&v=%s&s=%s&d=%s&sv=%s&p=%s&t=%s&u=%s&is=%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.tbrest.rest.RestUrlWrapper._wrapUrl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void enableSecuritySDK() {
        enableSecuritySDK = true;
    }

    public static String getSignedTransferUrl(String str, Map<String, Object> map, Map<String, Object> map2, Context context, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = "";
        if (map2 != null && map2.size() > 0) {
            Set<String> setKeySet = map2.keySet();
            String[] strArr = new String[setKeySet.size()];
            setKeySet.toArray(strArr);
            for (String str9 : C5703c.m3854a().m3855a(strArr, true)) {
                str8 = str8 + str9 + MD5Utils.getMd5Hex((byte[]) map2.get(str9));
            }
        }
        String str10 = str8;
        try {
            return _wrapUrl(str, null, null, str10, context, str2, str3, str4, str5, str6, str7);
        } catch (Exception unused) {
            return _wrapUrl(RestConstants.getTransferUrl(), null, null, str10, context, str2, str3, str4, str5, str6, str7);
        }
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
