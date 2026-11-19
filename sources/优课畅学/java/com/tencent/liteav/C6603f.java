package com.tencent.liteav;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;

/* renamed from: com.tencent.liteav.f */
/* loaded from: classes4.dex */
public class C6603f {

    /* renamed from: b */
    private Context f5643b;

    /* renamed from: m */
    private int f5654m;

    /* renamed from: v */
    private int f5663v;

    /* renamed from: w */
    private int f5664w;

    /* renamed from: x */
    private int f5665x;

    /* renamed from: y */
    private String f5666y;

    /* renamed from: a */
    private final String f5642a = "TXCVodPlayCollection";

    /* renamed from: c */
    private String f5644c = null;

    /* renamed from: d */
    private long f5645d = 0;

    /* renamed from: e */
    private long f5646e = 0;

    /* renamed from: f */
    private boolean f5647f = false;

    /* renamed from: g */
    private int f5648g = 0;

    /* renamed from: h */
    private int f5649h = 0;

    /* renamed from: i */
    private int f5650i = 0;

    /* renamed from: j */
    private int f5651j = 0;

    /* renamed from: k */
    private int f5652k = 0;

    /* renamed from: l */
    private int f5653l = 0;

    /* renamed from: o */
    private boolean f5656o = false;

    /* renamed from: p */
    private boolean f5657p = false;

    /* renamed from: q */
    private int f5658q = 0;

    /* renamed from: r */
    private int f5659r = 0;

    /* renamed from: s */
    private int f5660s = 0;

    /* renamed from: t */
    private int f5661t = 0;

    /* renamed from: u */
    private int f5662u = 0;

    /* renamed from: n */
    private String f5655n = TXCCommonUtil.getAppVersion();

    public C6603f(Context context) {
        this.f5643b = context;
    }

    /* renamed from: m */
    private void m5141m() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strM5057e = C6592e.m5057e();
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.f5644c;
        TXCDRApi.InitEvent(this.f5643b, strM5057e, C6574a.f5373ad, C6574a.f5388as, tXCDRExtInfo);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_timeuse", this.f5649h);
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_stream_url", this.f5644c);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_videotime", this.f5648g);
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_device_type", C6592e.m5054c());
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_network_type", C6592e.m5053c(this.f5643b));
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_user_id", C6592e.m5039a(this.f5643b));
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_package_name", C6592e.m5050b(this.f5643b));
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_app_version", this.f5655n);
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "dev_uuid", C6592e.m5056d(this.f5643b));
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_first_i_frame", this.f5650i);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_isp2p", this.f5651j);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_avg_load", this.f5652k == 0 ? 0L : this.f5653l / r14);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_load_cnt", this.f5652k);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_max_load", this.f5654m);
        TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_player_type", this.f5659r);
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "str_app_name", m5142a());
        int i10 = this.f5661t;
        if (i10 > 0) {
            str = "u32_player_type";
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_dns_time", i10);
            str2 = "str_app_version";
            str3 = "dev_uuid";
        } else {
            str = "u32_player_type";
            str2 = "str_app_version";
            str3 = "dev_uuid";
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_dns_time", -1L);
        }
        int i11 = this.f5660s;
        if (i11 > 0) {
            str4 = str2;
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_tcp_did_connect", i11);
            str5 = "u32_dns_time";
        } else {
            str4 = str2;
            str5 = "u32_dns_time";
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_tcp_did_connect", -1L);
        }
        int i12 = this.f5662u;
        if (i12 > 0) {
            str6 = str5;
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_first_video_packet", i12);
            str7 = str3;
        } else {
            str6 = str5;
            str7 = str3;
            TXCDRApi.txSetEventIntValue(strM5057e, C6574a.f5373ad, "u32_first_video_packet", -1L);
        }
        TXCDRApi.txSetEventValue(strM5057e, C6574a.f5373ad, "u32_server_ip", this.f5666y);
        TXCDRApi.nativeReportEvent(strM5057e, C6574a.f5373ad);
        StringBuilder sb = new StringBuilder();
        sb.append("report evt 40301: token=");
        sb.append(strM5057e);
        sb.append(" ");
        sb.append("u32_timeuse");
        sb.append("=");
        sb.append(this.f5649h);
        sb.append(" ");
        sb.append("str_stream_url");
        sb.append("=");
        sb.append(this.f5644c);
        sb.append(" ");
        sb.append("u32_videotime");
        sb.append("=");
        sb.append(this.f5648g);
        sb.append(" ");
        sb.append("str_device_type");
        sb.append("=");
        sb.append(C6592e.m5054c());
        sb.append(" ");
        sb.append("u32_network_type");
        sb.append("=");
        sb.append(C6592e.m5053c(this.f5643b));
        sb.append(" ");
        sb.append("str_user_id");
        sb.append("=");
        sb.append(C6592e.m5039a(this.f5643b));
        sb.append(" ");
        sb.append("str_package_name");
        sb.append("=");
        sb.append(C6592e.m5050b(this.f5643b));
        sb.append(" ");
        sb.append(str4);
        sb.append("=");
        sb.append(this.f5655n);
        sb.append(" ");
        sb.append(str7);
        sb.append("=");
        sb.append(C6592e.m5056d(this.f5643b));
        sb.append(" ");
        sb.append("u32_first_i_frame");
        sb.append("=");
        sb.append(this.f5650i);
        sb.append(" ");
        sb.append("u32_isp2p");
        sb.append("=");
        sb.append(this.f5651j);
        sb.append(" ");
        sb.append("u32_avg_load");
        sb.append("=");
        int i13 = this.f5652k;
        sb.append(i13 == 0 ? 0 : this.f5653l / i13);
        sb.append(" ");
        sb.append("u32_load_cnt");
        sb.append("=");
        sb.append(this.f5652k);
        sb.append(" ");
        sb.append("u32_max_load");
        sb.append("=");
        sb.append(this.f5654m);
        sb.append(" ");
        sb.append(str);
        sb.append("=");
        sb.append(this.f5659r);
        sb.append(" ");
        sb.append(str6);
        sb.append("=");
        sb.append(this.f5661t);
        sb.append(" ");
        sb.append("u32_tcp_did_connect");
        sb.append("=");
        sb.append(this.f5660s);
        sb.append(" ");
        sb.append("u32_first_video_packet");
        sb.append("=");
        sb.append(this.f5662u);
        sb.append(" ");
        sb.append("u32_server_ip");
        sb.append("=");
        sb.append(this.f5666y);
        TXCLog.m4998w("TXCVodPlayCollection", sb.toString());
    }

    /* renamed from: a */
    public void m5144a(String str) {
        this.f5644c = str;
    }

    /* renamed from: b */
    public void m5146b() {
        this.f5647f = true;
        this.f5645d = System.currentTimeMillis();
    }

    /* renamed from: c */
    public void m5149c() {
        if (this.f5647f) {
            this.f5649h = (int) ((System.currentTimeMillis() - this.f5645d) / 1000);
            m5141m();
            this.f5647f = false;
        }
        this.f5656o = false;
        this.f5657p = false;
    }

    /* renamed from: d */
    public void m5150d() {
        if (this.f5650i != 0 && this.f5657p) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f5646e);
            this.f5653l += iCurrentTimeMillis;
            this.f5652k++;
            if (this.f5654m < iCurrentTimeMillis) {
                this.f5654m = iCurrentTimeMillis;
            }
            this.f5657p = false;
        }
        if (this.f5656o) {
            this.f5656o = false;
        }
    }

    /* renamed from: e */
    public void m5151e() {
        if (this.f5650i == 0) {
            this.f5650i = (int) (System.currentTimeMillis() - this.f5645d);
        }
    }

    /* renamed from: f */
    public void m5152f() {
        if (this.f5660s == 0) {
            this.f5660s = (int) (System.currentTimeMillis() - this.f5645d);
        }
    }

    /* renamed from: g */
    public void m5153g() {
        if (this.f5661t == 0) {
            this.f5661t = (int) (System.currentTimeMillis() - this.f5645d);
        }
    }

    /* renamed from: h */
    public void m5154h() {
        if (this.f5662u == 0) {
            this.f5662u = (int) (System.currentTimeMillis() - this.f5645d);
        }
    }

    /* renamed from: i */
    public void m5155i() {
        this.f5646e = System.currentTimeMillis();
        this.f5657p = true;
    }

    /* renamed from: j */
    public void m5156j() {
        this.f5656o = true;
        this.f5658q++;
        TXCDRApi.txReportDAU(this.f5643b, C6574a.f5430by);
    }

    /* renamed from: k */
    public void m5157k() {
        this.f5665x++;
        TXCDRApi.txReportDAU(this.f5643b, C6574a.f5398bB);
    }

    /* renamed from: l */
    public void m5158l() {
        this.f5664w++;
        TXCDRApi.txReportDAU(this.f5643b, C6574a.f5431bz);
    }

    /* renamed from: a */
    public String m5142a() {
        Context context = this.f5643b;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        return i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
    }

    /* renamed from: b */
    public void m5147b(int i10) {
        this.f5659r = i10;
    }

    /* renamed from: b */
    public void m5148b(String str) {
        this.f5666y = str;
    }

    /* renamed from: a */
    public void m5143a(int i10) {
        this.f5648g = i10;
    }

    /* renamed from: a */
    public void m5145a(boolean z10) {
        if (z10) {
            this.f5663v = 1;
            TXCDRApi.txReportDAU(this.f5643b, C6574a.f5397bA);
        } else {
            this.f5663v = 0;
        }
    }
}
