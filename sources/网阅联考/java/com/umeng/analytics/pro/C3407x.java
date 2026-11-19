package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3510b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.x */
/* loaded from: classes2.dex */
public class C3407x {

    /* renamed from: c */
    private static volatile C3407x f2342c;

    /* renamed from: a */
    private InterfaceC3405v f2343a = new C3406w();

    /* renamed from: b */
    private String f2344b;

    /* renamed from: d */
    private List<a> f2345d;

    /* renamed from: e */
    private String f2346e;

    /* renamed from: com.umeng.analytics.pro.x$a */
    public interface a {
        /* renamed from: a */
        void mo3324a(String str, long j4, long j5, long j6);

        /* renamed from: a */
        void mo3325a(String str, String str2, long j4, long j5, long j6);
    }

    private C3407x() {
    }

    /* renamed from: a */
    public static C3407x m3344a() {
        if (f2342c == null) {
            synchronized (C3407x.class) {
                if (f2342c == null) {
                    f2342c = new C3407x();
                }
            }
        }
        return f2342c;
    }

    /* renamed from: f */
    private String m3346f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString(C3403t.f2324d, m3359d(context));
            editorEdit.commit();
        } catch (Exception unused) {
        }
        long jM3348h = m3348h(context);
        long jM3349i = m3349i(context);
        String str = this.f2344b;
        long jM3313a = C3403t.m3313a(context);
        long j4 = jM3313a * 5000;
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + jM3313a);
        if (!FieldManager.allow(C3510b.f2970E)) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        } else if (UMWorkDispatch.eventHasExist()) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
            UMWorkDispatch.removeEvent();
        } else {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
        }
        m3345a(jM3349i, jM3348h, j4, str, false);
        this.f2344b = this.f2343a.mo3339a(context);
        m3345a(jM3349i, jM3348h, j4, str, true);
        this.f2343a.mo3341a(context, this.f2344b);
        return this.f2344b;
    }

    /* renamed from: g */
    private boolean m3347g(Context context) {
        return !TextUtils.isEmpty(this.f2344b) && C3391h.m3158a(context).m3170a(this.f2344b) > 0;
    }

    /* renamed from: h */
    private long m3348h(Context context) {
        return m3343a(context, C3403t.f2326f);
    }

    /* renamed from: i */
    private long m3349i(Context context) {
        return m3343a(context, C3403t.f2321a);
    }

    /* renamed from: j */
    private boolean m3350j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j4 = sharedPreferences.getLong(C3403t.f2325e, 0L);
            long j5 = sharedPreferences.getLong(C3403t.f2326f, 0L);
            if (FieldManager.allow(C3510b.f2970E) && j4 > 0 && j5 == 0) {
                long jM3313a = C3403t.m3313a(appContext);
                if (jM3313a > 0) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j5 = j4 + (jM3313a * 5000);
                }
            }
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j5 - j4));
            return this.f2343a.mo3342a(j4, j5);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long m3355b() {
        return this.f2343a.mo3338a();
    }

    /* renamed from: c */
    public String m3358c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f2344b = m3346f(appContext);
        } catch (Exception unused) {
        }
        return this.f2344b;
    }

    /* renamed from: d */
    public String m3359d(Context context) {
        if (TextUtils.isEmpty(this.f2344b)) {
            try {
                this.f2344b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f2344b;
    }

    /* renamed from: e */
    public boolean m3360e(Context context) {
        if (TextUtils.isEmpty(this.f2344b)) {
            this.f2344b = m3359d(context);
        }
        return TextUtils.isEmpty(this.f2344b) || m3350j(context) || m3347g(context);
    }

    /* renamed from: b */
    public synchronized String m3356b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f2344b = m3359d(appContext);
        if (m3360e(appContext)) {
            try {
                this.f2344b = m3346f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f2344b;
    }

    /* renamed from: a */
    public void m3353a(long j4) {
        this.f2343a.mo3340a(j4);
    }

    /* renamed from: a */
    public String m3351a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String string = "";
        try {
            synchronized (C3407x.class) {
                string = PreferenceWrapper.getDefault(appContext).getString(C3403t.f2324d, "");
            }
        } catch (Exception unused) {
        }
        return string;
    }

    /* renamed from: b */
    public void m3357b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f2345d) == null || list.size() == 0) {
            return;
        }
        this.f2345d.remove(aVar);
    }

    /* renamed from: a */
    public String m3352a(Context context, long j4) {
        if (TextUtils.isEmpty(this.f2346e)) {
            String str = "SUB" + j4;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f2346e = sb.toString();
        }
        return this.f2346e;
    }

    /* renamed from: a */
    private long m3343a(Context context, String str) {
        long j4;
        try {
            j4 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j4 = 0;
        }
        return j4 <= 0 ? System.currentTimeMillis() : j4;
    }

    /* renamed from: a */
    private void m3345a(long j4, long j5, long j6, String str, boolean z3) {
        List<a> list = this.f2345d;
        if (list != null) {
            for (a aVar : list) {
                if (z3) {
                    try {
                        aVar.mo3325a(str, this.f2344b, j4, j5, j6);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo3324a(this.f2344b, j4, j5, j6);
                }
            }
        }
    }

    /* renamed from: a */
    public void m3354a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f2345d == null) {
            this.f2345d = new ArrayList();
        }
        if (this.f2345d.contains(aVar)) {
            return;
        }
        this.f2345d.add(aVar);
    }
}
