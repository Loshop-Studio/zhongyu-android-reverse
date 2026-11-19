package p003a1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p162m0.C8539d;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;
import p261v0.C9633f;

/* renamed from: a1.c */
/* loaded from: classes3.dex */
public final class C0010c implements InterfaceC0012e {

    /* renamed from: a */
    public final InterfaceC8804d f12a;

    /* renamed from: b */
    public final InterfaceC0012e f13b;

    /* renamed from: c */
    public final InterfaceC0012e f14c;

    public C0010c(InterfaceC8804d interfaceC8804d, InterfaceC0012e interfaceC0012e, InterfaceC0012e interfaceC0012e2) {
        this.f12a = interfaceC8804d;
        this.f13b = interfaceC0012e;
        this.f14c = interfaceC0012e2;
    }

    @Override // p003a1.InterfaceC0012e
    /* renamed from: a */
    public InterfaceC8690j mo16a(InterfaceC8690j interfaceC8690j, C8539d c8539d) {
        Drawable drawable = (Drawable) interfaceC8690j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f13b.mo16a(C9633f.m16002c(((BitmapDrawable) drawable).getBitmap(), this.f12a), c8539d);
        }
        if (drawable instanceof GifDrawable) {
            return this.f14c.mo16a(m17b(interfaceC8690j), c8539d);
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC8690j m17b(InterfaceC8690j interfaceC8690j) {
        return interfaceC8690j;
    }
}
