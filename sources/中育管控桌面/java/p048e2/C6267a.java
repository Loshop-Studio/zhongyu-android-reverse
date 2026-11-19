package p048e2;

import android.widget.ImageView;
import p099l2.InterfaceC7294a;
import p106m2.C7378a;

/* renamed from: e2.a */
/* loaded from: classes3.dex */
public class C6267a implements InterfaceC7294a {

    /* renamed from: b */
    public static volatile C6267a f7623b;

    /* renamed from: a */
    public InterfaceC7294a f7624a = new C7378a();

    /* renamed from: b */
    public static C6267a m6397b() {
        if (f7623b == null) {
            synchronized (C6267a.class) {
                try {
                    if (f7623b == null) {
                        f7623b = new C6267a();
                    }
                } finally {
                }
            }
        }
        return f7623b;
    }

    @Override // p099l2.InterfaceC7294a
    /* renamed from: a */
    public void mo6398a(ImageView imageView, Object obj) {
        this.f7624a.mo6398a(imageView, obj);
    }
}
