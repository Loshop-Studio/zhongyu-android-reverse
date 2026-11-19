package p070b.p113c.p114a.p116e.p128f.p133c;

import android.content.Context;
import android.widget.ImageView;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p070b.p113c.p114a.p116e.p128f.p133c.p135d.C0832a;
import p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b;
import p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0834c;

/* renamed from: b.c.a.e.f.c.a */
/* loaded from: classes.dex */
public class C0829a implements InterfaceC0833b {

    /* renamed from: b */
    public static volatile C0829a f4607b;

    /* renamed from: a */
    public volatile InterfaceC0833b f4608a = new C0832a();

    /* renamed from: e */
    public static C0829a m2547e() {
        if (f4607b == null) {
            synchronized (C0829a.class) {
                if (f4607b == null) {
                    f4607b = new C0829a();
                }
            }
        }
        return f4607b;
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: a */
    public void mo2548a(ComponentCallbacksC0320m componentCallbacksC0320m) {
        this.f4608a.mo2548a(componentCallbacksC0320m);
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: b */
    public void mo2549b(Context context) {
        this.f4608a.mo2549b(context);
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: c */
    public void mo2550c(ComponentCallbacksC0320m componentCallbacksC0320m, String str, ImageView imageView, InterfaceC0834c interfaceC0834c) {
        this.f4608a.mo2550c(componentCallbacksC0320m, str, imageView, interfaceC0834c);
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: d */
    public void mo2551d(ComponentCallbacksC0320m componentCallbacksC0320m, String str, ImageView imageView, InterfaceC0834c interfaceC0834c) {
        this.f4608a.mo2551d(componentCallbacksC0320m, str, imageView, interfaceC0834c);
    }
}
