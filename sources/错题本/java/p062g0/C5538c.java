package p062g0;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;

/* renamed from: g0.c */
/* loaded from: classes2.dex */
public final class C5538c implements InterfaceC5512q {

    /* renamed from: a */
    public final Context f8582a;

    /* renamed from: b */
    public final Class f8583b;

    public C5538c(Context context, Class cls) {
        this.f8582a = context;
        this.f8583b = cls;
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public final InterfaceC5511p mo2140r(C5519x c5519x) {
        Class cls = this.f8583b;
        return new C5540e(this.f8582a, c5519x.m4889a(File.class, cls), c5519x.m4889a(Uri.class, cls), cls);
    }
}
