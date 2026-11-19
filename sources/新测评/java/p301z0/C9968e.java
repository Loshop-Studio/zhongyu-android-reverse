package p301z0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p117i1.AbstractC7651j;
import p162m0.InterfaceC8542g;
import p184o0.InterfaceC8690j;
import p261v0.C9633f;

/* renamed from: z0.e */
/* loaded from: classes3.dex */
public class C9968e implements InterfaceC8542g {

    /* renamed from: b */
    public final InterfaceC8542g f17823b;

    public C9968e(InterfaceC8542g interfaceC8542g) {
        this.f17823b = (InterfaceC8542g) AbstractC7651j.m12683d(interfaceC8542g);
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        this.f17823b.mo12541a(messageDigest);
    }

    @Override // p162m0.InterfaceC8542g
    /* renamed from: b */
    public InterfaceC8690j mo14061b(Context context, InterfaceC8690j interfaceC8690j, int i10, int i11) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC8690j.get();
        InterfaceC8690j c9633f = new C9633f(gifDrawable.m3672e(), ComponentCallbacks2C5342b.m3291c(context).m3302f());
        InterfaceC8690j interfaceC8690jMo14061b = this.f17823b.mo14061b(context, c9633f, i10, i11);
        if (!c9633f.equals(interfaceC8690jMo14061b)) {
            c9633f.recycle();
        }
        gifDrawable.m3680m(this.f17823b, (Bitmap) interfaceC8690jMo14061b.get());
        return interfaceC8690j;
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C9968e) {
            return this.f17823b.equals(((C9968e) obj).f17823b);
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return this.f17823b.hashCode();
    }
}
