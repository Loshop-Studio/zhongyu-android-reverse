package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.umeng.commonsdk.config.C6780a;
import java.util.ArrayList;
import java.util.List;
import p114g2.C8038r0;
import p114g2.InterfaceC8036q0;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p240s2.C9468a;
import p290x2.AbstractC9866a;

/* renamed from: com.umeng.analytics.pro.g */
/* loaded from: classes4.dex */
public class C6772g {

    /* renamed from: e */
    public static volatile C6772g f6688e;

    /* renamed from: a */
    public InterfaceC8036q0 f6689a = new C8038r0();

    /* renamed from: b */
    public String f6690b;

    /* renamed from: c */
    public List f6691c;

    /* renamed from: d */
    public String f6692d;

    /* renamed from: com.umeng.analytics.pro.g$a */
    public interface a {
        /* renamed from: a */
        void mo6157a(String str, String str2, long j9, long j10, long j11);

        /* renamed from: b */
        void mo6158b(String str, long j9, long j10, long j11);
    }

    /* renamed from: b */
    public static C6772g m6179b() {
        if (f6688e == null) {
            synchronized (C6772g.class) {
                try {
                    if (f6688e == null) {
                        f6688e = new C6772g();
                    }
                } finally {
                }
            }
        }
        return f6688e;
    }

    /* renamed from: a */
    public final long m6180a(Context context, String str) {
        long j9;
        try {
            j9 = AbstractC9866a.m16841a(context).getLong(str, 0L);
        } catch (Exception unused) {
            j9 = 0;
        }
        return j9 <= 0 ? System.currentTimeMillis() : j9;
    }

    /* renamed from: c */
    public String m6181c(Context context) {
        Context contextM15647b = C9468a.m15647b(context);
        if (contextM15647b == null) {
            return "";
        }
        String string = "";
        try {
            synchronized (C6772g.class) {
                string = AbstractC9866a.m16841a(contextM15647b).getString("pre_session_id", "");
            }
            return string;
        } catch (Exception unused) {
            return string;
        }
    }

    /* renamed from: d */
    public String m6182d(Context context, long j9) {
        if (TextUtils.isEmpty(this.f6692d)) {
            String str = "SUB" + j9;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f6692d = sb.toString();
        }
        return this.f6692d;
    }

    /* renamed from: e */
    public final void m6183e(long j9, long j10, long j11, String str, boolean z9) {
        List<a> list = this.f6691c;
        if (list != null) {
            for (a aVar : list) {
                if (z9) {
                    try {
                        aVar.mo6157a(str, this.f6690b, j9, j10, j11);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo6158b(this.f6690b, j9, j10, j11);
                }
            }
        }
    }

    /* renamed from: f */
    public void m6184f(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f6691c == null) {
            this.f6691c = new ArrayList();
        }
        if (this.f6691c.contains(aVar)) {
            return;
        }
        this.f6691c.add(aVar);
    }

    /* renamed from: g */
    public synchronized String m6185g(Context context) {
        Context contextM15647b = C9468a.m15647b(context);
        if (contextM15647b == null) {
            return "";
        }
        this.f6690b = m6187i(contextM15647b);
        if (m6188j(contextM15647b)) {
            try {
                this.f6690b = m6189k(contextM15647b);
            } catch (Exception unused) {
            }
        }
        return this.f6690b;
    }

    /* renamed from: h */
    public String m6186h(Context context) {
        Context contextM15647b = C9468a.m15647b(context);
        if (contextM15647b == null) {
            return "";
        }
        try {
            this.f6690b = m6189k(contextM15647b);
        } catch (Exception unused) {
        }
        return this.f6690b;
    }

    /* renamed from: i */
    public String m6187i(Context context) {
        if (TextUtils.isEmpty(this.f6690b)) {
            try {
                this.f6690b = AbstractC9866a.m16841a(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f6690b;
    }

    /* renamed from: j */
    public boolean m6188j(Context context) {
        if (TextUtils.isEmpty(this.f6690b)) {
            this.f6690b = m6187i(context);
        }
        return TextUtils.isEmpty(this.f6690b) || m6193o(context) || m6190l(context);
    }

    /* renamed from: k */
    public final String m6189k(Context context) {
        try {
            SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(context).edit();
            editorEdit.putString("pre_session_id", m6187i(context));
            editorEdit.commit();
        } catch (Exception unused) {
        }
        long jM6191m = m6191m(context);
        long jM6192n = m6192n(context);
        String str = this.f6690b;
        long jM6154c = C6770e.m6154c(context);
        long j9 = jM6154c * CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        AbstractC8959h.m14292b("MobclickRT", "--->>>*** 读取 foreground count 值完成，count次数：" + jM6154c);
        if (!C6780a.m6260e("header_foreground_count")) {
            AbstractC8959h.m14292b("MobclickRT", "--->>>*** foreground count druation云控参数关闭。");
        } else if (AbstractC9089c.m14588e()) {
            AbstractC8959h.m14292b("MobclickRT", "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
            AbstractC9089c.m14594k();
        } else {
            AbstractC8959h.m14292b("MobclickRT", "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
        }
        m6183e(jM6192n, jM6191m, j9, str, false);
        this.f6690b = this.f6689a.mo12717a(context);
        m6183e(jM6192n, jM6191m, j9, str, true);
        this.f6689a.mo12718b(context, this.f6690b);
        return this.f6690b;
    }

    /* renamed from: l */
    public final boolean m6190l(Context context) {
        return !TextUtils.isEmpty(this.f6690b) && C6773h.m6194b(context).m6201a(this.f6690b) > 0;
    }

    /* renamed from: m */
    public final long m6191m(Context context) {
        return m6180a(context, "a_end_time");
    }

    /* renamed from: n */
    public final long m6192n(Context context) {
        return m6180a(context, "session_start_time");
    }

    /* renamed from: o */
    public final boolean m6193o(Context context) {
        Context contextM15647b = C9468a.m15647b(context);
        try {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(contextM15647b);
            long j9 = sharedPreferencesM16841a.getLong("a_start_time", 0L);
            long j10 = sharedPreferencesM16841a.getLong("a_end_time", 0L);
            if (C6780a.m6260e("header_foreground_count") && j9 > 0 && j10 == 0) {
                long jM6154c = C6770e.m6154c(contextM15647b);
                if (jM6154c > 0) {
                    long j11 = jM6154c * CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                    AbstractC8959h.m14292b("MobclickRT", "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j10 = j9 + j11;
                }
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> interval of last session is: " + (j10 - j9));
            return this.f6689a.mo12719c(j9, j10);
        } catch (Exception unused) {
            return false;
        }
    }
}
