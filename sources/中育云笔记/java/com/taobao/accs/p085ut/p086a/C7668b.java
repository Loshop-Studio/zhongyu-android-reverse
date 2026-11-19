package com.taobao.accs.p085ut.p086a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.b */
/* loaded from: classes5.dex */
public class C7668b {

    /* renamed from: a */
    public String f13169a;

    /* renamed from: b */
    public String f13170b;

    /* renamed from: c */
    public boolean f13171c;

    /* renamed from: d */
    public String f13172d;

    /* renamed from: e */
    public String f13173e;

    /* renamed from: f */
    private boolean f13174f = false;

    /* renamed from: b */
    private void m10105b(String str) {
        Throwable th;
        String strValueOf;
        if (this.f13174f) {
            return;
        }
        this.f13174f = true;
        HashMap map = new HashMap();
        String str2 = null;
        try {
            String str3 = this.f13169a;
            try {
                strValueOf = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    map.put("device_id", this.f13169a);
                    map.put("bind_date", this.f13170b);
                    map.put("ret", this.f13171c ? "y" : "n");
                    map.put("fail_reasons", this.f13172d);
                    map.put("user_id", this.f13173e);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.m10116d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, strValueOf, map), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66001, str, str3, (Object) null, strValueOf, map);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    ALog.m10116d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                strValueOf = null;
            }
        } catch (Throwable th4) {
            th = th4;
            strValueOf = null;
        }
    }

    /* renamed from: a */
    public void m10108a(String str) {
        this.f13172d = str;
    }

    /* renamed from: a */
    public void m10107a(ErrorCode errorCode) {
        if (errorCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
            m10108a(errorCode.getMsg());
        }
    }

    /* renamed from: a */
    public void m10106a() {
        m10105b("BindUser");
    }
}
