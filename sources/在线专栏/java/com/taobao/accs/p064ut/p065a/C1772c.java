package com.taobao.accs.p064ut.p065a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.accs.ut.a.c */
/* loaded from: classes.dex */
public class C1772c {

    /* renamed from: a */
    public int f7777a;

    /* renamed from: b */
    public int f7778b;

    /* renamed from: f */
    public String f7782f;

    /* renamed from: g */
    public String f7783g;

    /* renamed from: h */
    public long f7784h;

    /* renamed from: i */
    public boolean f7785i;

    /* renamed from: j */
    public boolean f7786j;

    /* renamed from: k */
    private long f7787k = 0;

    /* renamed from: c */
    public boolean f7779c = false;

    /* renamed from: d */
    public int f7780d = 0;

    /* renamed from: e */
    public int f7781e = 0;

    /* renamed from: a */
    public void m6083a() {
        String strValueOf;
        String strValueOf2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.m6090d("MonitorStatistic", "commitUT interval:" + (jCurrentTimeMillis - this.f7787k) + " interval1:" + (jCurrentTimeMillis - this.f7784h), new Object[0]);
        }
        if (jCurrentTimeMillis - this.f7787k <= 1200000 || jCurrentTimeMillis - this.f7784h <= 60000) {
            return;
        }
        HashMap map = new HashMap();
        String str = null;
        try {
            String strValueOf3 = String.valueOf(this.f7780d);
            try {
                strValueOf2 = String.valueOf(this.f7781e);
                try {
                    strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                    try {
                        map.put("connStatus", String.valueOf(this.f7777a));
                        map.put("connType", String.valueOf(this.f7778b));
                        map.put("tcpConnected", String.valueOf(this.f7779c));
                        map.put("proxy", String.valueOf(this.f7782f));
                        map.put("startServiceTime", String.valueOf(this.f7784h));
                        map.put("commitTime", String.valueOf(jCurrentTimeMillis));
                        map.put("networkAvailable", String.valueOf(this.f7785i));
                        map.put("threadIsalive", String.valueOf(this.f7786j));
                        map.put(AgooConstants.OPEN_URL, this.f7783g);
                        if (ALog.isPrintLog(level)) {
                            try {
                                ALog.m6090d("MonitorStatistic", UTMini.getCommitInfo(66001, strValueOf3, strValueOf2, strValueOf, map), new Object[0]);
                            } catch (Throwable th) {
                                th = th;
                                str = strValueOf3;
                                ALog.m6090d("MonitorStatistic", UTMini.getCommitInfo(66001, str, strValueOf2, strValueOf, map) + " " + th.toString(), new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    strValueOf = null;
                }
                try {
                    UTMini.getInstance().commitEvent(66001, "MONITOR", strValueOf3, strValueOf2, strValueOf, map);
                    this.f7787k = jCurrentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    str = strValueOf3;
                    strValueOf = strValueOf;
                    strValueOf2 = strValueOf2;
                    ALog.m6090d("MonitorStatistic", UTMini.getCommitInfo(66001, str, strValueOf2, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th5) {
                th = th5;
                strValueOf = null;
                strValueOf2 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            strValueOf = null;
            strValueOf2 = null;
        }
    }
}
