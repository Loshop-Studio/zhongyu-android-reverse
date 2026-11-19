package com.taobao.accs.p085ut.p086a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.e */
/* loaded from: classes5.dex */
public class C7671e {

    /* renamed from: a */
    public String f13196a;

    /* renamed from: b */
    public String f13197b;

    /* renamed from: c */
    public String f13198c;

    /* renamed from: d */
    public String f13199d;

    /* renamed from: e */
    public String f13200e;

    /* renamed from: f */
    public String f13201f;

    /* renamed from: g */
    private boolean f13202g = false;

    /* renamed from: a */
    public void m10111a() {
        String strValueOf;
        String str;
        if (this.f13202g) {
            return;
        }
        this.f13202g = true;
        HashMap map = new HashMap();
        String str2 = null;
        try {
            str = this.f13196a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
            } catch (Throwable th) {
                th = th;
                strValueOf = null;
            }
        } catch (Throwable th2) {
            th = th2;
            strValueOf = null;
        }
        try {
            map.put("device_id", this.f13196a);
            map.put("session_id", this.f13197b);
            map.put("data_id", this.f13198c);
            map.put("ack_date", this.f13199d);
            map.put("service_id", this.f13200e);
            map.put("fail_reasons", this.f13201f);
            UTMini.getInstance().commitEvent(66001, "sendAck", str, (Object) null, strValueOf, map);
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
            ALog.m10116d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
        }
    }
}
