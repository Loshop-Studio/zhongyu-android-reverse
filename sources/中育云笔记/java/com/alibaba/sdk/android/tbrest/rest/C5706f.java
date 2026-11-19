package com.alibaba.sdk.android.tbrest.rest;

import android.content.Context;
import anet.channel.request.Request;
import com.alibaba.sdk.android.tbrest.SendService;
import com.alibaba.sdk.android.tbrest.request.BizRequest;
import com.alibaba.sdk.android.tbrest.request.UrlWrapper;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.alibaba.sdk.android.tbrest.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.tbrest.rest.f */
/* loaded from: classes3.dex */
public class C5706f {
    /* renamed from: a */
    public static boolean m3865a(SendService sendService, String str, Context context, String str2, long j10, String str3, int i10, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        byte[] packRequest;
        try {
            LogUtil.m3872i("RestAPI start send log!");
            String strM3861a = C5705e.m3861a(sendService, str, j10, str3, i10, obj, obj2, obj3, map);
            if (!StringUtils.isNotBlank(strM3861a)) {
                LogUtil.m3872i("UTRestAPI build data failure!");
                return false;
            }
            LogUtil.m3872i("RestAPI build data succ!");
            HashMap map2 = new HashMap(1);
            map2.put(String.valueOf(i10), strM3861a);
            try {
                packRequest = BizRequest.getPackRequest(sendService, str, context, map2);
            } catch (Exception e10) {
                LogUtil.m3870e(e10.toString());
                packRequest = null;
            }
            if (packRequest == null) {
                return false;
            }
            LogUtil.m3872i("packRequest success!");
            return UrlWrapper.sendRequest(sendService, str2, packRequest).isSuccess();
        } catch (Throwable th) {
            LogUtil.m3871e("system error!", th);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m3866b(SendService sendService, String str, Context context, String str2, long j10, String str3, int i10, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        byte[] packRequest;
        try {
            LogUtil.m3872i("RestAPI start send log by url!");
            String strM3861a = C5705e.m3861a(sendService, str, j10, str3, i10, obj, obj2, obj3, map);
            if (!StringUtils.isNotBlank(strM3861a)) {
                LogUtil.m3872i("UTRestAPI build data failure by url!");
                return false;
            }
            LogUtil.m3872i("RestAPI build data succ by url!");
            HashMap map2 = new HashMap(1);
            map2.put(String.valueOf(i10), strM3861a);
            try {
                packRequest = BizRequest.getPackRequest(sendService, str, context, map2);
            } catch (Exception e10) {
                LogUtil.m3870e(e10.toString());
                packRequest = null;
            }
            if (packRequest == null) {
                return false;
            }
            LogUtil.m3872i("packRequest success by url!");
            return UrlWrapper.sendRequest(sendService, str, str2, packRequest).isSuccess();
        } catch (Throwable th) {
            LogUtil.m3871e("system error by url!", th);
            return false;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m3864a(SendService sendService, String str, String str2, Context context, long j10, String str3, int i10, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        try {
            LogUtil.m3872i("sendLogByUrl RestAPI start send log!");
            C5704d c5704dM3860a = C5705e.m3860a(sendService, str2, str, context, j10, str3, i10, obj, obj2, obj3, map);
            if (c5704dM3860a != null) {
                LogUtil.m3872i("sendLogByUrl RestAPI build data succ!");
                Map<String, Object> mapM3857a = c5704dM3860a.m3857a();
                if (mapM3857a == null) {
                    LogUtil.m3872i("sendLogByUrl postReqData is null!");
                    return null;
                }
                String strM3856a = c5704dM3860a.m3856a();
                if (StringUtils.isEmpty(strM3856a)) {
                    LogUtil.m3872i("sendLogByUrl reqUrl is null!");
                    return null;
                }
                byte[] bArrM3853a = C5702b.m3853a(2, strM3856a, mapM3857a, true);
                if (bArrM3853a != null) {
                    try {
                        String str4 = new String(bArrM3853a, Request.DEFAULT_CHARSET);
                        if (!StringUtils.isEmpty(str4)) {
                            return str4;
                        }
                    } catch (UnsupportedEncodingException e10) {
                        LogUtil.m3871e("sendLogByUrl result encoding UTF-8 error!", e10);
                    }
                }
            } else {
                LogUtil.m3872i("sendLogByUrl UTRestAPI build data failure!");
            }
        } catch (Throwable th) {
            LogUtil.m3871e("sendLogByUrl system error!", th);
        }
        return null;
    }
}
