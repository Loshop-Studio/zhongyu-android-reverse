package p268v0;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p152k0.InterfaceC8256g;
import p248t0.AbstractC9603b;

/* renamed from: v0.d */
/* loaded from: classes3.dex */
public class C9743d extends AbstractC9603b implements InterfaceC8256g {
    public C9743d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return GifDrawable.class;
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return ((GifDrawable) this.f16823a).m3301i();
    }

    @Override // p248t0.AbstractC9603b, p152k0.InterfaceC8256g
    public void initialize() {
        ((GifDrawable) this.f16823a).m3297e().prepareToDraw();
    }

    @Override // p152k0.InterfaceC8259j
    public void recycle() {
        ((GifDrawable) this.f16823a).stop();
        ((GifDrawable) this.f16823a).m3303k();
    }
}
