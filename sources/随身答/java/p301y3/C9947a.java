package p301y3;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p311z3.C9995a;
import p311z3.InterfaceC9996b;
import p311z3.InterfaceC9997c;

/* renamed from: y3.a */
/* loaded from: classes4.dex */
public class C9947a implements InterfaceC9996b {

    /* renamed from: b */
    public static volatile C9947a f17883b;

    /* renamed from: a */
    public volatile InterfaceC9996b f17884a = new C9995a();

    /* renamed from: e */
    public static C9947a m17150e() {
        if (f17883b == null) {
            synchronized (C9947a.class) {
                try {
                    if (f17883b == null) {
                        f17883b = new C9947a();
                    }
                } finally {
                }
            }
        }
        return f17883b;
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: a */
    public void mo17151a(Context context) {
        this.f17884a.mo17151a(context);
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: b */
    public void mo17152b(Fragment fragment) {
        this.f17884a.mo17152b(fragment);
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: c */
    public void mo17153c(Fragment fragment, String str, ImageView imageView, InterfaceC9997c interfaceC9997c) {
        this.f17884a.mo17153c(fragment, str, imageView, interfaceC9997c);
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: d */
    public void mo17154d(Fragment fragment, String str, ImageView imageView, InterfaceC9997c interfaceC9997c) {
        this.f17884a.mo17154d(fragment, str, imageView, interfaceC9997c);
    }
}
