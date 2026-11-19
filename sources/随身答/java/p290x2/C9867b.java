package p290x2;

import android.content.Context;
import android.content.SharedPreferences;
import com.blankj.utilcode.constant.TimeConstants;
import p270v2.AbstractC9756d;

/* renamed from: x2.b */
/* loaded from: classes4.dex */
public class C9867b implements InterfaceC9871f {

    /* renamed from: h */
    public static Context f17607h;

    /* renamed from: a */
    public final int f17608a;

    /* renamed from: b */
    public int f17609b;

    /* renamed from: c */
    public int f17610c;

    /* renamed from: d */
    public int f17611d;

    /* renamed from: e */
    public long f17612e;

    /* renamed from: f */
    public long f17613f;

    /* renamed from: g */
    public long f17614g;

    /* renamed from: x2.b$b */
    public static class b {

        /* renamed from: a */
        public static final C9867b f17615a = new C9867b();
    }

    /* renamed from: e */
    public static C9867b m16842e(Context context) {
        if (f17607h == null) {
            if (context != null) {
                f17607h = context.getApplicationContext();
            } else {
                AbstractC9756d.m16404c("inside StatTracer. please check context. context must not be null!");
            }
        }
        return b.f17615a;
    }

    @Override // p290x2.InterfaceC9871f
    /* renamed from: a */
    public void mo16843a() {
        m16849h();
    }

    @Override // p290x2.InterfaceC9871f
    /* renamed from: b */
    public void mo16844b(boolean z9) {
        m16851j(z9);
    }

    @Override // p290x2.InterfaceC9871f
    /* renamed from: c */
    public void mo16845c() {
        m16850i();
    }

    @Override // p290x2.InterfaceC9871f
    /* renamed from: d */
    public void mo16846d() {
        m16848g();
    }

    /* renamed from: f */
    public final void m16847f() {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f17607h);
        this.f17609b = sharedPreferencesM16841a.getInt("successful_request", 0);
        this.f17610c = sharedPreferencesM16841a.getInt("failed_requests ", 0);
        this.f17611d = sharedPreferencesM16841a.getInt("last_request_spent_ms", 0);
        this.f17612e = sharedPreferencesM16841a.getLong("last_request_time", 0L);
        this.f17613f = sharedPreferencesM16841a.getLong("last_req", 0L);
    }

    /* renamed from: g */
    public void m16848g() {
        this.f17610c++;
    }

    /* renamed from: h */
    public void m16849h() {
        this.f17611d = (int) (System.currentTimeMillis() - this.f17613f);
    }

    /* renamed from: i */
    public void m16850i() {
        this.f17613f = System.currentTimeMillis();
    }

    /* renamed from: j */
    public void m16851j(boolean z9) {
        this.f17609b++;
        if (z9) {
            this.f17612e = this.f17613f;
        }
    }

    /* renamed from: k */
    public void m16852k() {
        AbstractC9866a.m16841a(f17607h).edit().putInt("successful_request", this.f17609b).putInt("failed_requests ", this.f17610c).putInt("last_request_spent_ms", this.f17611d).putLong("last_req", this.f17613f).putLong("last_request_time", this.f17612e).commit();
    }

    public C9867b() {
        this.f17608a = TimeConstants.HOUR;
        this.f17613f = 0L;
        this.f17614g = 0L;
        m16847f();
    }
}
