package p039d0;

import android.content.Context;
import p055f0.C5507l;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;

/* renamed from: d0.e */
/* loaded from: classes2.dex */
public final class C5402e implements InterfaceC5512q {

    /* renamed from: a */
    public final /* synthetic */ int f8353a;

    /* renamed from: b */
    public final Context f8354b;

    public /* synthetic */ C5402e(Context context, int i) {
        this.f8353a = i;
        this.f8354b = context;
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        switch (this.f8353a) {
            case 1:
                return new C5507l(this.f8354b, 0);
            case 2:
                return new C5507l(this.f8354b, 1);
            default:
                return new C5507l(this.f8354b, 2);
        }
    }
}
