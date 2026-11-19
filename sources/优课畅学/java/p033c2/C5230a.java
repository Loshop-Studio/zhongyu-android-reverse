package p033c2;

import android.widget.ImageView;
import p140j2.InterfaceC8995a;
import p151k2.C9052a;

/* renamed from: c2.a */
/* loaded from: classes4.dex */
public class C5230a implements InterfaceC8995a {

    /* renamed from: b */
    public static volatile C5230a f2316b;

    /* renamed from: a */
    public InterfaceC8995a f2317a = new C9052a();

    /* renamed from: b */
    public static C5230a m2134b() {
        if (f2316b == null) {
            synchronized (C5230a.class) {
                try {
                    if (f2316b == null) {
                        f2316b = new C5230a();
                    }
                } finally {
                }
            }
        }
        return f2316b;
    }

    @Override // p140j2.InterfaceC8995a
    /* renamed from: a */
    public void mo2135a(ImageView imageView, Object obj) {
        this.f2317a.mo2135a(imageView, obj);
    }
}
