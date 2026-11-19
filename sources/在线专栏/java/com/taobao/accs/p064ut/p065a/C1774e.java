package com.taobao.accs.p064ut.p065a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.e */
/* loaded from: classes.dex */
public class C1774e {

    /* renamed from: a */
    public String f7798a;

    /* renamed from: b */
    public String f7799b;

    /* renamed from: c */
    public String f7800c;

    /* renamed from: d */
    public String f7801d;

    /* renamed from: e */
    public String f7802e;

    /* renamed from: f */
    public String f7803f;

    /* renamed from: g */
    private boolean f7804g = false;

    /* renamed from: a */
    public void m6085a() {
        String str;
        String strValueOf;
        if (this.f7804g) {
            return;
        }
        this.f7804g = true;
        HashMap map = new HashMap();
        try {
            str = this.f7798a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f7798a);
                    map.put("session_id", this.f7799b);
                    map.put("data_id", this.f7800c);
                    map.put("ack_date", this.f7801d);
                    map.put("service_id", this.f7802e);
                    map.put("fail_reasons", this.f7803f);
                    UTMini.getInstance().commitEvent(66001, "sendAck", str, (Object) null, strValueOf, map);
                } catch (Throwable th) {
                    th = th;
                    ALog.m6090d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                strValueOf = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            strValueOf = null;
        }
    }
}
