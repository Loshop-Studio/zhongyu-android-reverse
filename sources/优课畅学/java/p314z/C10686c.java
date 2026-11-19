package p314z;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p160l.C9230d;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;
import p259u.C10142f;

/* renamed from: z.c */
/* loaded from: classes3.dex */
public final class C10686c implements InterfaceC10688e {

    /* renamed from: a */
    public final InterfaceC9500d f21216a;

    /* renamed from: b */
    public final InterfaceC10688e f21217b;

    /* renamed from: c */
    public final InterfaceC10688e f21218c;

    public C10686c(InterfaceC9500d interfaceC9500d, InterfaceC10688e interfaceC10688e, InterfaceC10688e interfaceC10688e2) {
        this.f21216a = interfaceC9500d;
        this.f21217b = interfaceC10688e;
        this.f21218c = interfaceC10688e2;
    }

    @Override // p314z.InterfaceC10688e
    /* renamed from: a */
    public InterfaceC9357j mo19979a(InterfaceC9357j interfaceC9357j, C9230d c9230d) {
        Drawable drawable = (Drawable) interfaceC9357j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f21217b.mo19979a(C10142f.m18997c(((BitmapDrawable) drawable).getBitmap(), this.f21216a), c9230d);
        }
        if (drawable instanceof GifDrawable) {
            return this.f21218c.mo19979a(m19980b(interfaceC9357j), c9230d);
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC9357j m19980b(InterfaceC9357j interfaceC9357j) {
        return interfaceC9357j;
    }
}
