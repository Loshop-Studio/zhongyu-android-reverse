package p062g0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p000a.AbstractC0000a;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p172u0.C6610b;
import p202y.C6763f;

/* renamed from: g0.e */
/* loaded from: classes2.dex */
public final class C5540e implements InterfaceC5511p {

    /* renamed from: a */
    public final Context f8595a;

    /* renamed from: b */
    public final InterfaceC5511p f8596b;

    /* renamed from: c */
    public final InterfaceC5511p f8597c;

    /* renamed from: d */
    public final Class f8598d;

    public C5540e(Context context, InterfaceC5511p interfaceC5511p, InterfaceC5511p interfaceC5511p2, Class cls) {
        this.f8595a = context.getApplicationContext();
        this.f8596b = interfaceC5511p;
        this.f8597c = interfaceC5511p2;
        this.f8598d = cls;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC0000a.m11l((Uri) obj);
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        Uri uri = (Uri) obj;
        return new C5510o(new C6610b(uri), new C5539d(this.f8595a, this.f8596b, this.f8597c, uri, i, i8, c6763f, this.f8598d));
    }
}
