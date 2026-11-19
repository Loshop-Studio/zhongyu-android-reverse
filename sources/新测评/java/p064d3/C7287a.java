package p064d3;

import android.widget.ImageView;
import p141k3.InterfaceC7877a;
import p154l3.C8495a;

/* renamed from: d3.a */
/* loaded from: classes4.dex */
public class C7287a implements InterfaceC7877a {

    /* renamed from: b */
    public static volatile C7287a f11760b;

    /* renamed from: a */
    public InterfaceC7877a f11761a = new C8495a();

    /* renamed from: b */
    public static C7287a m11574b() {
        if (f11760b == null) {
            synchronized (C7287a.class) {
                try {
                    if (f11760b == null) {
                        f11760b = new C7287a();
                    }
                } finally {
                }
            }
        }
        return f11760b;
    }

    @Override // p141k3.InterfaceC7877a
    /* renamed from: a */
    public void mo11575a(ImageView imageView, Object obj) {
        this.f11761a.mo11575a(imageView, obj);
    }
}
