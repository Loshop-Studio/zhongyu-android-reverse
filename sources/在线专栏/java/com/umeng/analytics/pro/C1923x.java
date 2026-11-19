package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C2026b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.x */
/* loaded from: classes.dex */
public class C1923x {

    /* renamed from: c */
    private static volatile C1923x f8934c;

    /* renamed from: a */
    private InterfaceC1921v f8935a = new C1922w();

    /* renamed from: b */
    private String f8936b;

    /* renamed from: d */
    private List<a> f8937d;

    /* renamed from: e */
    private String f8938e;

    /* renamed from: com.umeng.analytics.pro.x$a */
    public interface a {
        /* renamed from: a */
        void mo7247a(String str, long j4, long j5, long j6);

        /* renamed from: a */
        void mo7248a(String str, String str2, long j4, long j5, long j6);
    }

    private C1923x() {
    }

    /* renamed from: a */
    public static C1923x m7267a() {
        if (f8934c == null) {
            synchronized (C1923x.class) {
                if (f8934c == null) {
                    f8934c = new C1923x();
                }
            }
        }
        return f8934c;
    }

    /* renamed from: f */
    private String m7269f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString(C1919t.f8916d, m7282d(context));
            editorEdit.commit();
        } catch (Exception unused) {
        }
        long jM7271h = m7271h(context);
        long jM7272i = m7272i(context);
        String str = this.f8936b;
        long jM7236a = C1919t.m7236a(context);
        long j4 = jM7236a * 5000;
        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + jM7236a);
        if (!FieldManager.allow(C2026b.f9562E)) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        } else if (UMWorkDispatch.eventHasExist()) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
            UMWorkDispatch.removeEvent();
        } else {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
        }
        m7268a(jM7272i, jM7271h, j4, str, false);
        this.f8936b = this.f8935a.mo7262a(context);
        m7268a(jM7272i, jM7271h, j4, str, true);
        this.f8935a.mo7264a(context, this.f8936b);
        return this.f8936b;
    }

    /* renamed from: g */
    private boolean m7270g(Context context) {
        return !TextUtils.isEmpty(this.f8936b) && C1907h.m7081a(context).m7093a(this.f8936b) > 0;
    }

    /* renamed from: h */
    private long m7271h(Context context) {
        return m7266a(context, C1919t.f8918f);
    }

    /* renamed from: i */
    private long m7272i(Context context) {
        return m7266a(context, C1919t.f8913a);
    }

    /* renamed from: j */
    private boolean m7273j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j4 = sharedPreferences.getLong(C1919t.f8917e, 0L);
            long j5 = sharedPreferences.getLong(C1919t.f8918f, 0L);
            if (FieldManager.allow(C2026b.f9562E) && j4 > 0 && j5 == 0) {
                long jM7236a = C1919t.m7236a(appContext);
                if (jM7236a > 0) {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j5 = j4 + (jM7236a * 5000);
                }
            }
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j5 - j4));
            return this.f8935a.mo7265a(j4, j5);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long m7278b() {
        return this.f8935a.mo7261a();
    }

    /* renamed from: c */
    public String m7281c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f8936b = m7269f(appContext);
        } catch (Exception unused) {
        }
        return this.f8936b;
    }

    /* renamed from: d */
    public String m7282d(Context context) {
        if (TextUtils.isEmpty(this.f8936b)) {
            try {
                this.f8936b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f8936b;
    }

    /* renamed from: e */
    public boolean m7283e(Context context) {
        if (TextUtils.isEmpty(this.f8936b)) {
            this.f8936b = m7282d(context);
        }
        return TextUtils.isEmpty(this.f8936b) || m7273j(context) || m7270g(context);
    }

    /* renamed from: b */
    public synchronized String m7279b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f8936b = m7282d(appContext);
        if (m7283e(appContext)) {
            try {
                this.f8936b = m7269f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f8936b;
    }

    /* renamed from: a */
    public void m7276a(long j4) {
        this.f8935a.mo7263a(j4);
    }

    /* renamed from: a */
    public String m7274a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String string = "";
        try {
            synchronized (C1923x.class) {
                string = PreferenceWrapper.getDefault(appContext).getString(C1919t.f8916d, "");
            }
        } catch (Exception unused) {
        }
        return string;
    }

    /* renamed from: b */
    public void m7280b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f8937d) == null || list.size() == 0) {
            return;
        }
        this.f8937d.remove(aVar);
    }

    /* renamed from: a */
    public String m7275a(Context context, long j4) {
        if (TextUtils.isEmpty(this.f8938e)) {
            String str = "SUB" + j4;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f8938e = sb.toString();
        }
        return this.f8938e;
    }

    /* renamed from: a */
    private long m7266a(Context context, String str) {
        long j4;
        try {
            j4 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j4 = 0;
        }
        return j4 <= 0 ? System.currentTimeMillis() : j4;
    }

    /* renamed from: a */
    private void m7268a(long j4, long j5, long j6, String str, boolean z3) {
        List<a> list = this.f8937d;
        if (list != null) {
            for (a aVar : list) {
                if (z3) {
                    try {
                        aVar.mo7248a(str, this.f8936b, j4, j5, j6);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo7247a(this.f8936b, j4, j5, j6);
                }
            }
        }
    }

    /* renamed from: a */
    public void m7277a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f8937d == null) {
            this.f8937d = new ArrayList();
        }
        if (this.f8937d.contains(aVar)) {
            return;
        }
        this.f8937d.add(aVar);
    }
}
