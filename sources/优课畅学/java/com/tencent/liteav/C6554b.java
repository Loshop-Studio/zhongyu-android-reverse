package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.p051a.C6634b;
import com.tencent.liteav.network.p051a.C6638e;
import com.tencent.liteav.network.p051a.p052a.C6631a;
import com.tencent.smtt.sdk.TbsReaderView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.liteav.b */
/* loaded from: classes4.dex */
public class C6554b {

    /* renamed from: a */
    private static String f5129a = "TXCDataReport";

    /* renamed from: u */
    private static HashMap<String, a> f5130u = new HashMap<>();

    /* renamed from: c */
    private String f5132c;

    /* renamed from: d */
    private Context f5133d;

    /* renamed from: f */
    private long f5135f;

    /* renamed from: g */
    private long f5136g;

    /* renamed from: i */
    private long f5138i;

    /* renamed from: j */
    private boolean f5139j;

    /* renamed from: k */
    private long f5140k;

    /* renamed from: r */
    private long f5147r;

    /* renamed from: t */
    private String f5149t;

    /* renamed from: h */
    private long f5137h = -1;

    /* renamed from: m */
    private boolean f5142m = false;

    /* renamed from: n */
    private long f5143n = 0;

    /* renamed from: o */
    private long f5144o = 0;

    /* renamed from: p */
    private long f5145p = 0;

    /* renamed from: q */
    private long f5146q = 0;

    /* renamed from: s */
    private int f5148s = 0;

    /* renamed from: v */
    private String f5150v = "";

    /* renamed from: w */
    private String f5151w = "";

    /* renamed from: b */
    private HashMap f5131b = new HashMap(100);

    /* renamed from: e */
    private String f5134e = TXCCommonUtil.getAppVersion();

    /* renamed from: l */
    private int f5141l = 5000;

    /* renamed from: com.tencent.liteav.b$a */
    public enum a {
        PENDING,
        CONFIRM,
        NEGATIVE
    }

    public C6554b(Context context) {
        this.f5147r = 0L;
        this.f5133d = context.getApplicationContext();
        this.f5147r = 0L;
    }

    /* renamed from: g */
    private void m4773g() {
        m4777a(6002, 6017, 6018);
        TXCStatus.m5008a(this.f5150v, 9001, Integer.valueOf(C6592e.m5047a()[0]));
        m4777a(9001, 9002, 9003);
        TXCStatus.m5008a(this.f5150v, 9004, Integer.valueOf(C6592e.m5048b()));
        m4777a(9004, 9005, 9006);
    }

    /* renamed from: h */
    private void m4774h() {
        HashMap map = new HashMap();
        String strM5009b = TXCStatus.m5009b(this.f5150v, 7116);
        String strM5009b2 = TXCStatus.m5009b(this.f5150v, 7117);
        String strM5009b3 = TXCStatus.m5009b(this.f5150v, 7118);
        int iM5012c = TXCStatus.m5012c(this.f5150v, 7105);
        String strM5009b4 = TXCStatus.m5009b(this.f5150v, 7106);
        int iM5012c2 = TXCStatus.m5012c(this.f5150v, 7111);
        map.put("stream_url", strM5009b);
        map.put("stream_id", strM5009b2);
        map.put("bizid", strM5009b3);
        map.put("err_code", String.valueOf(iM5012c));
        map.put("err_info", strM5009b4);
        map.put("channel_type", String.valueOf(iM5012c2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f5143n;
        map.put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f5143n)));
        map.put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(jCurrentTimeMillis)));
        map.put("total_time", String.valueOf(j10));
        long jM5004a = TXCStatus.m5004a(this.f5150v, 6003);
        long jM5004a2 = TXCStatus.m5004a(this.f5150v, 6006);
        long jM5004a3 = TXCStatus.m5004a(this.f5150v, 6005);
        long j11 = jM5004a != 0 ? jM5004a2 / jM5004a : 0L;
        map.put("block_count", String.valueOf(jM5004a));
        map.put("block_duration_max", String.valueOf(jM5004a3));
        map.put("block_duration_avg", String.valueOf(j11));
        long j12 = this.f5146q;
        long j13 = j12 != 0 ? this.f5145p / j12 : 0L;
        map.put("jitter_cache_max", String.valueOf(this.f5144o));
        map.put("jitter_cache_avg", String.valueOf(j13));
        String strTxCreateToken = TXCDRApi.txCreateToken();
        int i10 = C6574a.f5375af;
        int i11 = C6574a.f5381al;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.f5133d, strTxCreateToken, i10, i11, tXCDRExtInfo);
        TXCLog.m4989d(f5129a, "report evt 40402: token=" + strTxCreateToken);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            TXCLog.m4991e(f5129a, "RealTimePlayStatisticInfo: " + str + " = " + str2);
            if (str != null && str.length() > 0 && str2 != null) {
                TXCDRApi.txSetEventValue(strTxCreateToken, i10, str, str2);
            }
        }
        TXCDRApi.nativeReportEvent(strTxCreateToken, i10);
        this.f5142m = false;
        this.f5143n = 0L;
        this.f5146q = 0L;
        this.f5145p = 0L;
        this.f5144o = 0L;
    }

    /* renamed from: i */
    private void m4775i() {
        this.f5139j = false;
        this.f5140k = 0L;
        this.f5148s = 0;
        String strM5039a = this.f5151w;
        if (TextUtils.isEmpty(strM5039a)) {
            strM5039a = TXCCommonUtil.getUserId();
        }
        if (TextUtils.isEmpty(strM5039a)) {
            strM5039a = C6592e.m5039a(this.f5133d);
        }
        this.f5131b.put("str_user_id", strM5039a);
        this.f5131b.put("str_device_type", C6592e.m5054c());
        this.f5131b.put("str_device_type", C6592e.m5054c());
        this.f5131b.put("u32_network_type", Integer.valueOf(C6592e.m5053c(this.f5133d)));
        this.f5131b.put("token", C6592e.m5057e());
        this.f5131b.put("str_package_name", C6592e.m5050b(this.f5133d));
        this.f5131b.put("dev_uuid", C6592e.m5056d(this.f5133d));
        this.f5131b.put("str_os_info", C6592e.m5055d());
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        this.f5147r = utcTimeTick;
        this.f5131b.put("u64_timestamp", Long.valueOf(utcTimeTick));
    }

    /* renamed from: a */
    public void m4776a() {
        m4775i();
        this.f5136g = -1L;
        this.f5138i = -1L;
        this.f5143n = System.currentTimeMillis();
    }

    /* renamed from: b */
    public void m4780b() {
        if (!this.f5139j) {
            TXCLog.m4991e(f5129a, "play " + this.f5132c + " failed");
            if (this.f5142m) {
                m4764a(C6574a.f5340X);
            } else {
                m4764a(C6574a.f5337U);
            }
        } else if (this.f5142m) {
            m4766b(C6574a.f5342Z);
        } else {
            m4766b(C6574a.f5339W);
        }
        if (this.f5142m) {
            m4774h();
        }
        TXCStatus.m5008a(this.f5150v, 7107, (Object) 0L);
        TXCStatus.m5008a(this.f5150v, 2033, (Object) 0L);
        TXCStatus.m5008a(this.f5150v, TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE, (Object) 0L);
        TXCStatus.m5008a(this.f5150v, 7104, (Object) 0L);
        TXCStatus.m5008a(this.f5150v, 7108, (Object) 0L);
    }

    /* renamed from: c */
    public a m4782c() {
        Uri uri;
        try {
            uri = Uri.parse(this.f5149t);
        } catch (Exception e10) {
            TXCLog.m4992e(f5129a, "check stream failed.", e10);
        }
        if (uri == null) {
            return a.PENDING;
        }
        final String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return a.PENDING;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return a.PENDING;
        }
        if (!scheme.equals("rtmp") && !scheme.equals("http") && !scheme.equals("https")) {
            return a.PENDING;
        }
        if (m4768c(host)) {
            return a.CONFIRM;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && (queryParameterNames.contains("bizid") || queryParameterNames.contains("txTime") || queryParameterNames.contains("txSecret"))) {
            return a.CONFIRM;
        }
        if (f5130u.containsKey(host)) {
            return f5130u.get(host);
        }
        f5130u.put(host, a.PENDING);
        new Thread(new Runnable() { // from class: com.tencent.liteav.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean z10 = true;
                    C6638e[] c6638eArrMo5241a = C6631a.m5240c().mo5241a(new C6634b(host, true), null);
                    int length = c6638eArrMo5241a.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z10 = false;
                            break;
                        }
                        C6638e c6638e = c6638eArrMo5241a[i10];
                        if (c6638e.m5254a() && C6554b.m4768c(c6638e.f5789a)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    C6554b.f5130u.put(host, z10 ? a.CONFIRM : a.NEGATIVE);
                    TXCLog.m4989d(C6554b.f5129a, host + " isTencent " + z10);
                } catch (Exception e11) {
                    TXCLog.m4992e(C6554b.f5129a, "check dns failed.", e11);
                }
            }
        }).start();
        return a.PENDING;
    }

    /* renamed from: d */
    public void m4784d(String str) {
        this.f5150v = str;
    }

    /* renamed from: f */
    private void m4771f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("room://")) {
            return;
        }
        str.split("/")[r3.length - 1].split("_");
        TXCStatus.m5008a(this.f5150v, 7112, (Object) 3L);
    }

    /* renamed from: d */
    public void m4783d() {
        m4773g();
        if (!this.f5139j) {
            long jM5004a = TXCStatus.m5004a(this.f5150v, TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            long jM5004a2 = TXCStatus.m5004a(this.f5150v, 7104);
            long jM5004a3 = TXCStatus.m5004a(this.f5150v, 2033);
            long jM5004a4 = TXCStatus.m5004a(this.f5150v, 7108);
            if (jM5004a > 0 && jM5004a2 > 0 && jM5004a4 > 0 && jM5004a3 > 0) {
                m4764a(this.f5142m ? C6574a.f5340X : C6574a.f5337U);
                this.f5141l = 5000;
                this.f5139j = true;
            }
            String strM5009b = TXCStatus.m5009b(this.f5150v, 7119);
            if (strM5009b != null) {
                m4781b(strM5009b);
            }
        }
        if (this.f5148s >= 3 && !this.f5139j) {
            m4764a(this.f5142m ? C6574a.f5340X : C6574a.f5337U);
            this.f5141l = 5000;
            this.f5139j = true;
        }
        this.f5148s++;
        if (this.f5140k <= 0) {
            this.f5140k = TXCTimeUtil.getTimeTick();
        }
        if (TXCTimeUtil.getTimeTick() > this.f5140k + this.f5141l) {
            if (this.f5142m) {
                m4767c(C6574a.f5341Y);
                this.f5141l = 5000;
            } else {
                if (m4782c() == a.NEGATIVE) {
                    return;
                }
                m4767c(C6574a.f5338V);
                int statusReportInterval = TXCDRApi.getStatusReportInterval();
                this.f5141l = statusReportInterval;
                if (statusReportInterval < 5000) {
                    this.f5141l = 5000;
                }
                if (this.f5141l > 300000) {
                    this.f5141l = 300000;
                }
            }
            this.f5136g = TXCStatus.m5004a(this.f5150v, 6004);
            this.f5138i = TXCStatus.m5012c(this.f5150v, 2002);
            this.f5140k = TXCTimeUtil.getTimeTick();
        }
    }

    /* renamed from: e */
    public void m4785e(String str) {
        this.f5151w = str;
    }

    /* renamed from: a */
    public void m4779a(boolean z10) {
        this.f5142m = z10;
    }

    /* renamed from: a */
    public void m4778a(String str) {
        this.f5132c = str;
        m4781b(str);
    }

    /* renamed from: g */
    private int m4772g(String str) {
        Number number = (Number) this.f5131b.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public void m4777a(int i10, int i11, int i12) {
        if (i10 == 6002) {
            double dM5014d = TXCStatus.m5014d(this.f5150v, i10);
            if (dM5014d < 0.001d) {
                return;
            }
            double dM5014d2 = TXCStatus.m5014d(this.f5150v, i11);
            int iM5012c = TXCStatus.m5012c(this.f5150v, i12) + 1;
            TXCStatus.m5008a(this.f5150v, i11, Double.valueOf(dM5014d2 + ((dM5014d - dM5014d2) / iM5012c)));
            TXCStatus.m5008a(this.f5150v, i12, Integer.valueOf(iM5012c));
            return;
        }
        double dM5012c = TXCStatus.m5012c(this.f5150v, i10);
        if (dM5012c < 0.001d) {
            return;
        }
        double dM5014d3 = TXCStatus.m5014d(this.f5150v, i11);
        int iM5012c2 = TXCStatus.m5012c(this.f5150v, i12) + 1;
        TXCStatus.m5008a(this.f5150v, i11, Double.valueOf(dM5014d3 + ((dM5012c - dM5014d3) / iM5012c2)));
        TXCStatus.m5008a(this.f5150v, i12, Integer.valueOf(iM5012c2));
    }

    /* renamed from: b */
    public void m4781b(String str) {
        if (str == null) {
            return;
        }
        this.f5149t = str;
    }

    /* renamed from: a */
    private void m4764a(int i10) {
        long j10;
        long j11;
        long j12;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f5132c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f5131b.get("token");
        TXCDRApi.InitEvent(this.f5133d, str, i10, C6574a.f5382am, tXCDRExtInfo);
        m4765a(i10, str);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_timestamp", ((Long) this.f5131b.get("u64_timestamp")).longValue());
        long jM5004a = TXCStatus.m5004a(this.f5150v, 7107);
        long jM5004a2 = TXCStatus.m5004a(this.f5150v, 7108);
        if (jM5004a2 != -1) {
            jM5004a2 -= jM5004a;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_dns_time", jM5004a2 < 0 ? -1L : jM5004a2);
        long jM5004a3 = TXCStatus.m5004a(this.f5150v, 7109);
        if (jM5004a3 != -1) {
            jM5004a3 -= jM5004a;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_connect_server_time", jM5004a3 >= 0 ? jM5004a3 : -1L);
        int iM5012c = TXCStatus.m5012c(this.f5150v, TbsReaderView.ReaderCallback.SEARCH_SELECT_TEXT);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_decode_type", iM5012c);
        long jM5004a4 = TXCStatus.m5004a(this.f5150v, TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE) - jM5004a;
        this.f5135f = jM5004a4;
        if (jM5004a4 < 0) {
            jM5004a4 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_i_frame", jM5004a4);
        long jM5004a5 = TXCStatus.m5004a(this.f5150v, 7103) - jM5004a;
        if (jM5004a5 < 0) {
            j10 = jM5004a5;
            jM5004a5 = -1;
        } else {
            j10 = jM5004a5;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_frame_down", jM5004a5);
        long jM5004a6 = TXCStatus.m5004a(this.f5150v, TbsReaderView.ReaderCallback.READER_TOAST) - jM5004a;
        if (jM5004a6 < 0) {
            jM5004a6 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_video_decode_time", jM5004a6);
        long jM5004a7 = TXCStatus.m5004a(this.f5150v, 7104) - jM5004a;
        if (jM5004a7 < 0) {
            j11 = jM5004a7;
            jM5004a7 = -1;
        } else {
            j11 = jM5004a7;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_audio_frame_down", jM5004a7);
        long jM5004a8 = TXCStatus.m5004a(this.f5150v, 2033) - jM5004a;
        if (jM5004a8 < 0) {
            j12 = jM5004a8;
            jM5004a8 = -1;
        } else {
            j12 = jM5004a8;
        }
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_audio_render_time", jM5004a8);
        int iM5012c2 = TXCStatus.m5012c(this.f5150v, 7105);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_err_code", iM5012c2);
        int iM5012c3 = TXCStatus.m5012c(this.f5150v, 7106);
        TXCDRApi.txSetEventIntValue(str, i10, "str_err_info", iM5012c3);
        int iM5012c4 = TXCStatus.m5012c(this.f5150v, 7112);
        TXCDRApi.txSetEventValue(str, i10, "u32_link_type", String.valueOf(iM5012c4));
        int iM5012c5 = TXCStatus.m5012c(this.f5150v, 7111);
        TXCDRApi.txSetEventValue(str, i10, "u32_channel_type", String.valueOf(iM5012c5));
        TXCDRApi.txSetEventValue(str, i10, "str_app_version", this.f5134e);
        TXCDRApi.nativeReportEvent(str, i10);
        TXCLog.m4989d(f5129a, "report evt " + i10 + ": token=" + str + SignParameters.NEW_LINE + "str_user_id=" + this.f5131b.get("str_user_id") + SignParameters.NEW_LINE + "dev_uuid=" + this.f5131b.get("dev_uuid") + SignParameters.NEW_LINE + "str_session_id=" + this.f5131b.get("str_session_id") + SignParameters.NEW_LINE + "str_device_type=" + this.f5131b.get("str_device_type") + SignParameters.NEW_LINE + "str_os_info=" + this.f5131b.get("str_os_info") + SignParameters.NEW_LINE + "str_package_name=" + this.f5131b.get("str_package_name") + SignParameters.NEW_LINE + "u32_network_type=" + this.f5131b.get("u32_network_type") + SignParameters.NEW_LINE + "u32_server_ip=" + this.f5131b.get("u32_server_ip") + SignParameters.NEW_LINE + "str_stream_url=" + this.f5131b.get("str_stream_url") + SignParameters.NEW_LINE + "u64_timestamp=" + this.f5131b.get("u64_timestamp") + SignParameters.NEW_LINE + "u32_dns_time=" + jM5004a2 + SignParameters.NEW_LINE + "u32_connect_server_time=" + jM5004a3 + SignParameters.NEW_LINE + "u32_video_decode_type=" + iM5012c + SignParameters.NEW_LINE + "u32_first_frame_down=" + j10 + SignParameters.NEW_LINE + "u32_first_video_decode_time=" + jM5004a6 + SignParameters.NEW_LINE + "u32_first_i_frame=" + this.f5135f + SignParameters.NEW_LINE + "u32_first_audio_frame_down=" + j11 + SignParameters.NEW_LINE + "u32_first_audio_render_time=" + j12 + SignParameters.NEW_LINE + "u64_err_code=" + iM5012c2 + SignParameters.NEW_LINE + "str_err_info=" + iM5012c3 + SignParameters.NEW_LINE + "u32_link_type=" + iM5012c4 + SignParameters.NEW_LINE + "u32_channel_type=" + iM5012c5 + SignParameters.NEW_LINE + "str_app_version=" + this.f5134e);
    }

    /* renamed from: b */
    private void m4766b(int i10) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f5132c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f5131b.get("token");
        TXCDRApi.InitEvent(this.f5133d, str, i10, C6574a.f5382am, tXCDRExtInfo);
        m4765a(i10, str);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, i10, "u64_end_timestamp", utcTimeTick);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_timestamp", utcTimeTick);
        double dM5014d = TXCStatus.m5014d(this.f5150v, 9002);
        TXCDRApi.txSetEventValue(str, i10, "u32_avg_cpu_usage", String.valueOf(dM5014d));
        double dM5014d2 = TXCStatus.m5014d(this.f5150v, 9005);
        TXCDRApi.txSetEventValue(str, i10, "u32_avg_memory", String.valueOf(dM5014d2));
        String strValueOf = String.valueOf(this.f5147r);
        TXCDRApi.txSetEventValue(str, i10, "u64_begin_timestamp", strValueOf);
        long timeTick = (TXCTimeUtil.getTimeTick() - TXCStatus.m5004a(this.f5150v, 7107)) / 1000;
        long j10 = 0;
        TXCDRApi.txSetEventIntValue(str, i10, "u64_playtime", timeTick < 0 ? -1L : timeTick);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_result", timeTick < 0 ? -1L : timeTick);
        int iM5012c = TXCStatus.m5012c(this.f5150v, 7105);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_err_code", iM5012c);
        int iM5012c2 = TXCStatus.m5012c(this.f5150v, 2004);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_speed_cnt", iM5012c2);
        int iM5012c3 = TXCStatus.m5012c(this.f5150v, 2008);
        long j11 = iM5012c3;
        TXCDRApi.txSetEventIntValue(str, i10, "u64_audio_cache_avg", j11);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_avg_cache_time", j11);
        long jM5012c = TXCStatus.m5012c(this.f5150v, 2003);
        TXCDRApi.txSetEventValue(str, i10, "u32_max_load", String.valueOf(jM5012c));
        long jM5012c2 = TXCStatus.m5012c(this.f5150v, 2001);
        TXCDRApi.txSetEventValue(str, i10, "u32_avg_load", String.valueOf(jM5012c2));
        long jM5012c3 = TXCStatus.m5012c(this.f5150v, 2002);
        TXCDRApi.txSetEventValue(str, i10, "u32_load_cnt", String.valueOf(jM5012c3));
        int iM5012c4 = TXCStatus.m5012c(this.f5150v, 2005);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_nodata_cnt", iM5012c4);
        long j12 = jM5012c2 * jM5012c3;
        TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_block_time", j12);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_first_i_frame", this.f5135f);
        int iM5012c5 = TXCStatus.m5012c(this.f5150v, 6015);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_width", iM5012c5);
        int iM5012c6 = TXCStatus.m5012c(this.f5150v, 6016);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_height", iM5012c6);
        double dM5014d3 = TXCStatus.m5014d(this.f5150v, 6017);
        TXCDRApi.txSetEventValue(str, i10, "u32_video_avg_fps", String.valueOf(dM5014d3));
        long jM5004a = TXCStatus.m5004a(this.f5150v, 6003);
        long jM5004a2 = TXCStatus.m5004a(this.f5150v, 6005);
        long jM5004a3 = TXCStatus.m5004a(this.f5150v, 6006);
        if (jM5004a > 0) {
            j10 = jM5004a3 / jM5004a;
        }
        long j13 = j10;
        TXCDRApi.txSetEventIntValue(str, i10, "u64_block_duration_avg", j13);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_avg_block_time", j13);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_block_count", jM5004a);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_block_time", jM5004a3);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_block_duration_max", jM5004a2);
        long jM5004a4 = TXCStatus.m5004a(this.f5150v, 6009);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_jitter_cache_max", jM5004a4);
        long jM5004a5 = TXCStatus.m5004a(this.f5150v, 6008);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_jitter_cache_avg", jM5004a5);
        TXCDRApi.txSetEventValue(str, i10, "u32_link_type", String.valueOf(TXCStatus.m5012c(this.f5150v, 7112)));
        int iM5012c7 = TXCStatus.m5012c(this.f5150v, 7111);
        TXCDRApi.txSetEventValue(str, i10, "u32_channel_type", String.valueOf(iM5012c7));
        int iM5012c8 = TXCStatus.m5012c(this.f5150v, 7113);
        TXCDRApi.txSetEventValue(str, i10, "u32_ip_count_quic", String.valueOf(iM5012c8));
        int iM5012c9 = TXCStatus.m5012c(this.f5150v, 7114);
        TXCDRApi.txSetEventValue(str, i10, "u32_connect_count_quic", String.valueOf(iM5012c9));
        int iM5012c10 = TXCStatus.m5012c(this.f5150v, 7115);
        TXCDRApi.txSetEventValue(str, i10, "u32_connect_count_tcp", String.valueOf(iM5012c10));
        TXCDRApi.txSetEventValue(str, i10, "str_app_version", this.f5134e);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_is_real_time", TXCStatus.m5004a(this.f5150v, 2009));
        TXCDRApi.nativeReportEvent(str, i10);
        TXCLog.m4989d(f5129a, "report evt " + i10 + ": token=" + str + SignParameters.NEW_LINE + "str_user_id=" + this.f5131b.get("str_user_id") + SignParameters.NEW_LINE + "dev_uuid=" + this.f5131b.get("dev_uuid") + SignParameters.NEW_LINE + "str_session_id=" + this.f5131b.get("str_session_id") + SignParameters.NEW_LINE + "str_device_type=" + this.f5131b.get("str_device_type") + SignParameters.NEW_LINE + "str_os_info=" + this.f5131b.get("str_os_info") + SignParameters.NEW_LINE + "str_package_name=" + this.f5131b.get("str_package_name") + SignParameters.NEW_LINE + "u32_network_type=" + this.f5131b.get("u32_network_type") + SignParameters.NEW_LINE + "u32_server_ip=" + this.f5131b.get("u32_server_ip") + SignParameters.NEW_LINE + "str_stream_url=" + this.f5131b.get("str_stream_url") + SignParameters.NEW_LINE + "u64_timestamp=" + this.f5131b.get("u64_timestamp") + SignParameters.NEW_LINE + "u32_avg_cpu_usage=" + dM5014d + SignParameters.NEW_LINE + "u32_avg_memory=" + dM5014d2 + SignParameters.NEW_LINE + "u32_first_i_frame=" + this.f5135f + SignParameters.NEW_LINE + "u32_video_width=" + iM5012c5 + SignParameters.NEW_LINE + "u32_video_height=" + iM5012c6 + SignParameters.NEW_LINE + "u32_video_avg_fps=" + dM5014d3 + SignParameters.NEW_LINE + "u32_speed_cnt=" + iM5012c2 + SignParameters.NEW_LINE + "u32_nodata_cnt=" + iM5012c4 + SignParameters.NEW_LINE + "u32_avg_cache_time=" + iM5012c3 + SignParameters.NEW_LINE + "u32_avg_block_time=" + j13 + SignParameters.NEW_LINE + "u32_avg_load=" + jM5012c2 + SignParameters.NEW_LINE + "u32_max_load=" + jM5012c + SignParameters.NEW_LINE + "u32_video_block_time=" + jM5004a3 + SignParameters.NEW_LINE + "u32_audio_block_time=" + j12 + SignParameters.NEW_LINE + "u32_load_cnt=" + jM5012c3 + SignParameters.NEW_LINE + "u32_result=" + timeTick + SignParameters.NEW_LINE + "u64_err_code=" + iM5012c + SignParameters.NEW_LINE + "u32_channel_type=" + iM5012c7 + SignParameters.NEW_LINE + "u32_ip_count_quic=" + iM5012c8 + SignParameters.NEW_LINE + "u32_connect_count_quic=" + iM5012c9 + SignParameters.NEW_LINE + "u32_connect_count_tcp=" + iM5012c10 + SignParameters.NEW_LINE + "u64_block_count=" + jM5004a + SignParameters.NEW_LINE + "u64_jitter_cache_max=" + jM5004a4 + SignParameters.NEW_LINE + "u64_jitter_cache_avg=" + jM5004a5 + SignParameters.NEW_LINE + "u64_begin_timestamp=" + strValueOf + SignParameters.NEW_LINE + "u32_is_real_time=" + TXCStatus.m5004a(this.f5150v, 2009) + SignParameters.NEW_LINE + "str_app_version=" + this.f5134e);
    }

    /* renamed from: c */
    public static boolean m4768c(String str) {
        if (str == null || !str.contains("myqcloud")) {
            return C6573c.m4883a().m4910a(str);
        }
        return true;
    }

    /* renamed from: c */
    private void m4767c(int i10) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f5132c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        String str = (String) this.f5131b.get("token");
        TXCDRApi.InitEvent(this.f5133d, str, i10, C6574a.f5382am, tXCDRExtInfo);
        m4765a(i10, str);
        TXCDRApi.txSetEventIntValue(str, i10, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        int[] iArrM5047a = C6592e.m5047a();
        TXCDRApi.txSetEventIntValue(str, i10, "u32_cpu_usage", iArrM5047a[1]);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_app_cpu_usage", iArrM5047a[0]);
        TXCDRApi.txSetEventValue(str, i10, "u32_avg_cpu_usage", String.valueOf(TXCStatus.m5014d(this.f5150v, 9002)));
        TXCDRApi.txSetEventValue(str, i10, "u32_avg_memory", String.valueOf(TXCStatus.m5014d(this.f5150v, 9005)));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_recv_av_diff_time", TXCStatus.m5005a(this.f5150v, 6014, 2));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_play_av_diff_time", TXCStatus.m5005a(this.f5150v, 6013, 2));
        TXCDRApi.txSetEventValue(str, i10, "u64_playtime", String.valueOf((TXCTimeUtil.getUtcTimeTick() - this.f5147r) / 1000));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_decode_type", TXCStatus.m5012c(this.f5150v, 2015) == 0 ? 2 : 1);
        long jM5004a = TXCStatus.m5004a(this.f5150v, 2002);
        long j10 = this.f5138i;
        if (j10 == -1) {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_block_count", 0L);
        } else if (jM5004a >= j10) {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_block_count", jM5004a - j10);
        } else {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_block_count", -1L);
        }
        this.f5138i = jM5004a;
        TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_cache_time", TXCStatus.m5012c(this.f5150v, 2010));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_audio_drop", TXCStatus.m5012c(this.f5150v, 2014));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_decode_type", TXCStatus.m5012c(this.f5150v, TbsReaderView.ReaderCallback.SEARCH_SELECT_TEXT));
        long jM5012c = TXCStatus.m5012c(this.f5150v, 6019);
        long j11 = this.f5137h;
        if (jM5012c >= j11) {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_video_recv_fps", (jM5012c - j11) / 2);
        }
        this.f5137h = jM5012c;
        TXCDRApi.txSetEventIntValue(str, i10, "u32_fps", (int) TXCStatus.m5014d(this.f5150v, 6002));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_cache_time", TXCStatus.m5012c(this.f5150v, 6007));
        long jM5004a2 = TXCStatus.m5004a(this.f5150v, 6008);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_video_cache_count", jM5004a2);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_avg_cache_count", jM5004a2);
        long jM5004a3 = TXCStatus.m5004a(this.f5150v, 6004);
        long j12 = this.f5136g;
        if (j12 != -1 && jM5004a3 >= j12) {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_video_block_count", jM5004a3 - j12);
        } else {
            TXCDRApi.txSetEventIntValue(str, i10, "u32_video_block_count", 0L);
        }
        this.f5136g = jM5004a3;
        long jM5012c2 = TXCStatus.m5012c(this.f5150v, 7102) + TXCStatus.m5012c(this.f5150v, 7101);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_net_speed", jM5012c2);
        TXCDRApi.txSetEventIntValue(str, i10, "u32_avg_net_speed", jM5012c2);
        TXCDRApi.txSetEventValue(str, i10, "u32_link_type", String.valueOf(TXCStatus.m5012c(this.f5150v, 7112)));
        TXCDRApi.txSetEventValue(str, i10, "u32_channel_type", String.valueOf(TXCStatus.m5012c(this.f5150v, 7111)));
        TXCDRApi.txSetEventValue(str, i10, "str_app_version", this.f5134e);
        TXCDRApi.nativeReportEvent(str, i10);
        if (this.f5142m) {
            this.f5146q++;
            this.f5145p += jM5004a2;
            if (jM5004a2 > this.f5144o) {
                this.f5144o = jM5004a2;
            }
        }
    }

    /* renamed from: a */
    private void m4765a(int i10, String str) {
        String strM5009b = TXCStatus.m5009b(this.f5150v, 7121);
        if (TextUtils.isEmpty(strM5009b)) {
            strM5009b = str;
        }
        this.f5131b.put("str_session_id", strM5009b);
        this.f5131b.put("u32_server_ip", TXCStatus.m5009b(this.f5150v, 7110));
        if (this.f5142m) {
            this.f5131b.put("str_stream_url", TXCStatus.m5009b(this.f5150v, 7116));
            m4771f((String) this.f5131b.get("str_stream_url"));
        } else {
            this.f5131b.put("str_stream_url", this.f5132c);
        }
        TXCDRApi.txSetEventValue(str, i10, "str_user_id", (String) this.f5131b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, i10, "dev_uuid", (String) this.f5131b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, i10, "str_session_id", (String) this.f5131b.get("str_session_id"));
        TXCDRApi.txSetEventValue(str, i10, "str_device_type", (String) this.f5131b.get("str_device_type"));
        TXCDRApi.txSetEventValue(str, i10, "str_os_info", (String) this.f5131b.get("str_os_info"));
        TXCDRApi.txSetEventValue(str, i10, "str_package_name", (String) this.f5131b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, i10, "u32_network_type", m4772g("u32_network_type"));
        TXCDRApi.txSetEventValue(str, i10, "u32_server_ip", (String) this.f5131b.get("u32_server_ip"));
        TXCDRApi.txSetEventValue(str, i10, "str_stream_url", (String) this.f5131b.get("str_stream_url"));
    }
}
