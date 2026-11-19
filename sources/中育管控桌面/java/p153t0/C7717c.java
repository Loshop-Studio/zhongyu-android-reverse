package p153t0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p053f0.C6285d;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;
import p118o0.C7495f;

/* renamed from: t0.c */
/* loaded from: classes3.dex */
public final class C7717c implements InterfaceC7719e {

    /* renamed from: a */
    public final InterfaceC6499d f10197a;

    /* renamed from: b */
    public final InterfaceC7719e f10198b;

    /* renamed from: c */
    public final InterfaceC7719e f10199c;

    public C7717c(InterfaceC6499d interfaceC6499d, InterfaceC7719e interfaceC7719e, InterfaceC7719e interfaceC7719e2) {
        this.f10197a = interfaceC6499d;
        this.f10198b = interfaceC7719e;
        this.f10199c = interfaceC7719e2;
    }

    @Override // p153t0.InterfaceC7719e
    /* renamed from: a */
    public InterfaceC6440j mo7679a(InterfaceC6440j interfaceC6440j, C6285d c6285d) {
        Drawable drawable = (Drawable) interfaceC6440j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f10198b.mo7679a(C7495f.m8619c(((BitmapDrawable) drawable).getBitmap(), this.f10197a), c6285d);
        }
        if (drawable instanceof GifDrawable) {
            return this.f10199c.mo7679a(m9203b(interfaceC6440j), c6285d);
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC6440j m9203b(InterfaceC6440j interfaceC6440j) {
        return interfaceC6440j;
    }
}
