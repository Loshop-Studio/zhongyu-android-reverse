package p268v0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p091e1.AbstractC7837i;
import p122h0.InterfaceC8087g;
import p152k0.InterfaceC8259j;
import p228r0.C9395e;

/* renamed from: v0.e */
/* loaded from: classes3.dex */
public class C9744e implements InterfaceC8087g {

    /* renamed from: b */
    public final InterfaceC8087g f17216b;

    public C9744e(InterfaceC8087g interfaceC8087g) {
        this.f17216b = (InterfaceC8087g) AbstractC7837i.m12256d(interfaceC8087g);
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        this.f17216b.mo12082a(messageDigest);
    }

    @Override // p122h0.InterfaceC8087g
    /* renamed from: b */
    public InterfaceC8259j mo12912b(Context context, InterfaceC8259j interfaceC8259j, int i9, int i10) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC8259j.get();
        InterfaceC8259j c9395e = new C9395e(gifDrawable.m3297e(), ComponentCallbacks2C5471b.m3006c(context).m3017f());
        InterfaceC8259j interfaceC8259jMo12912b = this.f17216b.mo12912b(context, c9395e, i9, i10);
        if (!c9395e.equals(interfaceC8259jMo12912b)) {
            c9395e.recycle();
        }
        gifDrawable.m3305m(this.f17216b, (Bitmap) interfaceC8259jMo12912b.get());
        return interfaceC8259j;
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C9744e) {
            return this.f17216b.equals(((C9744e) obj).f17216b);
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return this.f17216b.hashCode();
    }
}
