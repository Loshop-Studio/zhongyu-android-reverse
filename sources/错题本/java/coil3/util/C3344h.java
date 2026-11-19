package coil3.util;

import android.os.SystemClock;
import p162t.C6571a;
import p162t.C6576f;
import p162t.InterfaceC6573c;

/* renamed from: coil3.util.h */
/* loaded from: classes2.dex */
public final class C3344h implements InterfaceC3340d {
    @Override // coil3.util.InterfaceC3340d
    /* renamed from: a */
    public final boolean mo2285a(C6576f c6576f) {
        InterfaceC6573c interfaceC6573c = c6576f.f10978a;
        if ((interfaceC6573c instanceof C6571a ? ((C6571a) interfaceC6573c).f10974a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC6573c interfaceC6573c2 = c6576f.f10979b;
        return (interfaceC6573c2 instanceof C6571a ? ((C6571a) interfaceC6573c2).f10974a : Integer.MAX_VALUE) > 100;
    }

    @Override // coil3.util.InterfaceC3340d
    /* renamed from: b */
    public final boolean mo2286b() {
        boolean z8;
        synchronized (C3339c.f2072a) {
            try {
                int i = C3339c.f2074c;
                C3339c.f2074c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > C3339c.f2075d + 30000) {
                    C3339c.f2074c = 0;
                    C3339c.f2075d = SystemClock.uptimeMillis();
                    String[] list = C3339c.f2073b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C3339c.f2076e = list.length < 800;
                }
                z8 = C3339c.f2076e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }
}
