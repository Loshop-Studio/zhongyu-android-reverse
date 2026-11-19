package p127u0;

import android.widget.ImageView;
import p012b1.InterfaceC2715a;
import p017c1.C2755a;

/* renamed from: u0.a */
/* loaded from: classes2.dex */
public class C4602a implements InterfaceC2715a {

    /* renamed from: b */
    public static volatile C4602a f5805b;

    /* renamed from: a */
    public InterfaceC2715a f5806a = new C2755a();

    /* renamed from: b */
    public static C4602a m6344b() {
        if (f5805b == null) {
            synchronized (C4602a.class) {
                if (f5805b == null) {
                    f5805b = new C4602a();
                }
            }
        }
        return f5805b;
    }

    @Override // p012b1.InterfaceC2715a
    /* renamed from: a */
    public void mo1504a(ImageView imageView, Object obj) {
        this.f5806a.mo1504a(imageView, obj);
    }
}
