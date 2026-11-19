package p261v0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;
import p281x0.C9837k;

/* renamed from: v0.x */
/* loaded from: classes3.dex */
public class C9651x implements InterfaceC8540e {

    /* renamed from: a */
    public final C9837k f16843a;

    /* renamed from: b */
    public final InterfaceC8804d f16844b;

    public C9651x(C9837k c9837k, InterfaceC8804d interfaceC8804d) {
        this.f16843a = c9837k;
        this.f16844b = interfaceC8804d;
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(Uri uri, int i10, int i11, C8539d c8539d) {
        InterfaceC8690j interfaceC8690jMo3617b = this.f16843a.mo3617b(uri, i10, i11, c8539d);
        if (interfaceC8690jMo3617b == null) {
            return null;
        }
        return AbstractC9643p.m16012a(this.f16844b, (Drawable) interfaceC8690jMo3617b.get(), i10, i11);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(Uri uri, C8539d c8539d) {
        return "android.resource".equals(uri.getScheme());
    }
}
