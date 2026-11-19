package p368v0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p168h0.C9438e;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;
import p298q0.C10697f;

/* renamed from: v0.c */
/* loaded from: classes3.dex */
public final class C11405c implements InterfaceC11407e {

    /* renamed from: a */
    public final InterfaceC9772d f27226a;

    /* renamed from: b */
    public final InterfaceC11407e f27227b;

    /* renamed from: c */
    public final InterfaceC11407e f27228c;

    public C11405c(InterfaceC9772d interfaceC9772d, InterfaceC11407e interfaceC11407e, InterfaceC11407e interfaceC11407e2) {
        this.f27226a = interfaceC9772d;
        this.f27227b = interfaceC11407e;
        this.f27228c = interfaceC11407e2;
    }

    @Override // p368v0.InterfaceC11407e
    /* renamed from: a */
    public InterfaceC9657j mo25360a(InterfaceC9657j interfaceC9657j, C9438e c9438e) {
        Drawable drawable = (Drawable) interfaceC9657j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f27227b.mo25360a(C10697f.m22659c(((BitmapDrawable) drawable).getBitmap(), this.f27226a), c9438e);
        }
        if (drawable instanceof GifDrawable) {
            return this.f27228c.mo25360a(m25361b(interfaceC9657j), c9438e);
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC9657j m25361b(InterfaceC9657j interfaceC9657j) {
        return interfaceC9657j;
    }
}
