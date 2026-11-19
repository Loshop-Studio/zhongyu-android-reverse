package p251t3;

import android.widget.ImageView;
import p005a4.InterfaceC0036a;
import p022b4.C5110a;

/* renamed from: t3.a */
/* loaded from: classes4.dex */
public class C9613a implements InterfaceC0036a {

    /* renamed from: b */
    public static volatile C9613a f16900b;

    /* renamed from: a */
    public InterfaceC0036a f16901a = new C5110a();

    /* renamed from: b */
    public static C9613a m15905b() {
        if (f16900b == null) {
            synchronized (C9613a.class) {
                try {
                    if (f16900b == null) {
                        f16900b = new C9613a();
                    }
                } finally {
                }
            }
        }
        return f16900b;
    }

    @Override // p005a4.InterfaceC0036a
    /* renamed from: a */
    public void mo172a(ImageView imageView, Object obj) {
        this.f16901a.mo172a(imageView, obj);
    }
}
