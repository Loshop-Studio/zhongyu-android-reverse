package com.taobao.accs.p085ut.p086a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.a */
/* loaded from: classes5.dex */
public class C7667a {

    /* renamed from: a */
    public String f13164a;

    /* renamed from: b */
    public String f13165b;

    /* renamed from: c */
    public boolean f13166c;

    /* renamed from: d */
    public String f13167d;

    /* renamed from: e */
    private boolean f13168e = false;

    /* renamed from: b */
    private void m10101b(String str) {
        Throwable th;
        String strValueOf;
        String str2;
        if (this.f13168e) {
            return;
        }
        this.f13168e = true;
        HashMap map = new HashMap();
        String str3 = null;
        try {
            str2 = this.f13164a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
            } catch (Throwable th2) {
                th = th2;
                strValueOf = null;
            }
        } catch (Throwable th3) {
            th = th3;
            strValueOf = null;
        }
        try {
            map.put("device_id", this.f13164a);
            map.put("bind_date", this.f13165b);
            map.put("ret", this.f13166c ? "y" : "n");
            map.put("fail_reasons", this.f13167d);
            map.put("push_token", "");
            UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, strValueOf, map);
        } catch (Throwable th4) {
            th = th4;
            str3 = str2;
            ALog.m10116d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public void m10104a(String str) {
        this.f13167d = str;
    }

    /* renamed from: a */
    public void m10103a(ErrorCode errorCode) {
        if (errorCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
            m10104a(errorCode.getMsg());
        }
    }

    /* renamed from: a */
    public void m10102a() {
        m10101b("BindApp");
    }
}
