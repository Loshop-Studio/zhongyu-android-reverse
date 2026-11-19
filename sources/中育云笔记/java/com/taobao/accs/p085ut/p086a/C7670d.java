package com.taobao.accs.p085ut.p086a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.d */
/* loaded from: classes5.dex */
public class C7670d {

    /* renamed from: a */
    public String f13186a;

    /* renamed from: b */
    public String f13187b;

    /* renamed from: c */
    public String f13188c;

    /* renamed from: d */
    public String f13189d;

    /* renamed from: e */
    public String f13190e;

    /* renamed from: f */
    public String f13191f;

    /* renamed from: g */
    public String f13192g;

    /* renamed from: i */
    public String f13194i;

    /* renamed from: h */
    public boolean f13193h = false;

    /* renamed from: j */
    private boolean f13195j = false;

    /* renamed from: a */
    public void m10110a() {
        String strValueOf;
        if (this.f13195j) {
            return;
        }
        this.f13195j = true;
        HashMap map = new HashMap();
        String str = null;
        try {
            String str2 = this.f13186a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f13186a);
                    map.put("data_id", this.f13187b);
                    map.put("receive_date", this.f13188c);
                    map.put("to_bz_date", this.f13189d);
                    map.put("service_id", this.f13190e);
                    map.put("data_length", this.f13191f);
                    map.put("msg_type", this.f13192g);
                    map.put("repeat", this.f13193h ? "y" : "n");
                    map.put("user_id", this.f13194i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", str2, (Object) null, strValueOf, map);
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    ALog.m10116d("ReceiveMessage", UTMini.getCommitInfo(66001, str, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                strValueOf = null;
            }
        } catch (Throwable th3) {
            th = th3;
            strValueOf = null;
        }
    }
}
