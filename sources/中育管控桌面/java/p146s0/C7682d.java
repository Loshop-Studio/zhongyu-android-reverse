package p146s0;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p067h0.InterfaceC6437g;
import p132q0.AbstractC7614i;

/* renamed from: s0.d */
/* loaded from: classes3.dex */
public class C7682d extends AbstractC7614i implements InterfaceC6437g {
    public C7682d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return GifDrawable.class;
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return ((GifDrawable) this.f10073a).m2856i();
    }

    @Override // p132q0.AbstractC7614i, p067h0.InterfaceC6437g
    public void initialize() {
        ((GifDrawable) this.f10073a).m2852e().prepareToDraw();
    }

    @Override // p067h0.InterfaceC6440j
    public void recycle() {
        ((GifDrawable) this.f10073a).stop();
        ((GifDrawable) this.f10073a).m2858k();
    }
}
