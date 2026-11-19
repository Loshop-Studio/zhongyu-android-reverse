package com.taobao.accs.p064ut.p065a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.b */
/* loaded from: classes.dex */
public class C1771b {

    /* renamed from: a */
    public String f7771a;

    /* renamed from: b */
    public String f7772b;

    /* renamed from: c */
    public boolean f7773c;

    /* renamed from: d */
    public String f7774d;

    /* renamed from: e */
    public String f7775e;

    /* renamed from: f */
    private boolean f7776f = false;

    /* renamed from: b */
    private void m6079b(String str) {
        String str2;
        String strValueOf;
        if (this.f7776f) {
            return;
        }
        this.f7776f = true;
        HashMap map = new HashMap();
        try {
            str2 = this.f7771a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f7771a);
                    map.put("bind_date", this.f7772b);
                    map.put("ret", this.f7773c ? "y" : "n");
                    map.put("fail_reasons", this.f7774d);
                    map.put("user_id", this.f7775e);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.m6090d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, strValueOf, map);
                } catch (Throwable th) {
                    th = th;
                    ALog.m6090d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
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
    public void m6082a(String str) {
        this.f7774d = str;
    }

    /* renamed from: a */
    public void m6081a(ErrorCode errorCode) {
        if (errorCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
            m6082a(errorCode.getMsg());
        }
    }

    /* renamed from: a */
    public void m6080a() {
        m6079b("BindUser");
    }
}
