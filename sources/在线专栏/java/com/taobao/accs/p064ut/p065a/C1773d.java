package com.taobao.accs.p064ut.p065a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.d */
/* loaded from: classes.dex */
public class C1773d {

    /* renamed from: a */
    public String f7788a;

    /* renamed from: b */
    public String f7789b;

    /* renamed from: c */
    public String f7790c;

    /* renamed from: d */
    public String f7791d;

    /* renamed from: e */
    public String f7792e;

    /* renamed from: f */
    public String f7793f;

    /* renamed from: g */
    public String f7794g;

    /* renamed from: i */
    public String f7796i;

    /* renamed from: h */
    public boolean f7795h = false;

    /* renamed from: j */
    private boolean f7797j = false;

    /* renamed from: a */
    public void m6084a() {
        String str;
        String strValueOf;
        if (this.f7797j) {
            return;
        }
        this.f7797j = true;
        HashMap map = new HashMap();
        try {
            str = this.f7788a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f7788a);
                    map.put("data_id", this.f7789b);
                    map.put("receive_date", this.f7790c);
                    map.put("to_bz_date", this.f7791d);
                    map.put("service_id", this.f7792e);
                    map.put("data_length", this.f7793f);
                    map.put("msg_type", this.f7794g);
                    map.put("repeat", this.f7795h ? "y" : "n");
                    map.put("user_id", this.f7796i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", str, (Object) null, strValueOf, map);
                } catch (Throwable th) {
                    th = th;
                    ALog.m6090d("ReceiveMessage", UTMini.getCommitInfo(66001, str, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
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
