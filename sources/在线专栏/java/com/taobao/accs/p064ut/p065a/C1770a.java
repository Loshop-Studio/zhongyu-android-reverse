package com.taobao.accs.p064ut.p065a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.a */
/* loaded from: classes.dex */
public class C1770a {

    /* renamed from: a */
    public String f7766a;

    /* renamed from: b */
    public String f7767b;

    /* renamed from: c */
    public boolean f7768c;

    /* renamed from: d */
    public String f7769d;

    /* renamed from: e */
    private boolean f7770e = false;

    /* renamed from: b */
    private void m6075b(String str) {
        String str2;
        String strValueOf;
        if (this.f7770e) {
            return;
        }
        this.f7770e = true;
        HashMap map = new HashMap();
        try {
            str2 = this.f7766a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f7766a);
                    map.put("bind_date", this.f7767b);
                    map.put("ret", this.f7768c ? "y" : "n");
                    map.put("fail_reasons", this.f7769d);
                    map.put("push_token", "");
                    UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, strValueOf, map);
                } catch (Throwable th) {
                    th = th;
                    ALog.m6090d("BindAppStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                strValueOf = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = null;
            strValueOf = null;
        }
    }

    /* renamed from: a */
    public void m6078a(String str) {
        this.f7769d = str;
    }

    /* renamed from: a */
    public void m6077a(ErrorCode errorCode) {
        if (errorCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
            m6078a(errorCode.getMsg());
        }
    }

    /* renamed from: a */
    public void m6076a() {
        m6075b("BindApp");
    }
}
