package p300y2;

import android.content.Context;
import androidx.compose.material3.internal.CalendarModelKt;
import com.umeng.commonsdk.framework.AbstractC6782a;
import p280w2.C9802b;
import p290x2.InterfaceC9873h;

/* renamed from: y2.b */
/* loaded from: classes4.dex */
public class C9946b implements InterfaceC9873h {

    /* renamed from: b */
    public static C9946b f17881b;

    /* renamed from: a */
    public int f17882a = 0;

    /* renamed from: c */
    public static synchronized C9946b m17146c(Context context) {
        try {
            if (f17881b == null) {
                f17881b = new C9946b();
                f17881b.m17149e(Integer.valueOf(AbstractC6782a.m6274h(context, "defcon", "0")).intValue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17881b;
    }

    @Override // p290x2.InterfaceC9873h
    /* renamed from: a */
    public void mo16130a(C9802b.a aVar) {
        m17149e(Integer.valueOf(aVar.m16638a("defcon", String.valueOf(0))).intValue());
    }

    /* renamed from: b */
    public long m17147b() {
        int i9 = this.f17882a;
        if (i9 == 1) {
            return 14400000L;
        }
        if (i9 == 2) {
            return 28800000L;
        }
        if (i9 != 3) {
            return 0L;
        }
        return CalendarModelKt.MillisecondsIn24Hours;
    }

    /* renamed from: d */
    public boolean m17148d() {
        return this.f17882a != 0;
    }

    /* renamed from: e */
    public void m17149e(int i9) {
        if (i9 < 0 || i9 > 3) {
            return;
        }
        this.f17882a = i9;
    }
}
