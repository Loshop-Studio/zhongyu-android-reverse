package com.taobao.accs.p085ut.p086a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.c */
/* loaded from: classes5.dex */
public class C7669c {

    /* renamed from: a */
    public int f13175a;

    /* renamed from: b */
    public int f13176b;

    /* renamed from: f */
    public String f13180f;

    /* renamed from: g */
    public String f13181g;

    /* renamed from: h */
    public long f13182h;

    /* renamed from: i */
    public boolean f13183i;

    /* renamed from: j */
    public boolean f13184j;

    /* renamed from: k */
    private long f13185k = 0;

    /* renamed from: c */
    public boolean f13177c = false;

    /* renamed from: d */
    public int f13178d = 0;

    /* renamed from: e */
    public int f13179e = 0;

    /* renamed from: a */
    public void m10109a() {
        String strValueOf;
        String strValueOf2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.m10116d("MonitorStatistic", "commitUT interval:" + (jCurrentTimeMillis - this.f13185k) + " interval1:" + (jCurrentTimeMillis - this.f13182h), new Object[0]);
        }
        if (jCurrentTimeMillis - this.f13185k <= 1200000 || jCurrentTimeMillis - this.f13182h <= 60000) {
            return;
        }
        HashMap map = new HashMap();
        String str = null;
        try {
            String strValueOf3 = String.valueOf(this.f13178d);
            try {
                strValueOf = String.valueOf(this.f13179e);
                try {
                    strValueOf2 = String.valueOf(Constants.SDK_VERSION_CODE);
                    try {
                        map.put("connStatus", String.valueOf(this.f13175a));
                        map.put("connType", String.valueOf(this.f13176b));
                        map.put("tcpConnected", String.valueOf(this.f13177c));
                        map.put("proxy", String.valueOf(this.f13180f));
                        map.put("startServiceTime", String.valueOf(this.f13182h));
                        map.put("commitTime", String.valueOf(jCurrentTimeMillis));
                        map.put("networkAvailable", String.valueOf(this.f13183i));
                        map.put("threadIsalive", String.valueOf(this.f13184j));
                        map.put("url", this.f13181g);
                        if (ALog.isPrintLog(level)) {
                            ALog.m10116d("MonitorStatistic", UTMini.getCommitInfo(66001, strValueOf3, strValueOf, strValueOf2, map), new Object[0]);
                        }
                        UTMini.getInstance().commitEvent(66001, "MONITOR", strValueOf3, strValueOf, strValueOf2, map);
                        this.f13185k = jCurrentTimeMillis;
                    } catch (Throwable th) {
                        th = th;
                        str = strValueOf3;
                        ALog.m10116d("MonitorStatistic", UTMini.getCommitInfo(66001, str, strValueOf, strValueOf2, map) + " " + th.toString(), new Object[0]);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    strValueOf2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                strValueOf = null;
                strValueOf2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            strValueOf = null;
            strValueOf2 = null;
        }
    }
}
