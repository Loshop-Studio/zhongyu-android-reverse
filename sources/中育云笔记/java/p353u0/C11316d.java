package p353u0;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p198j0.InterfaceC9654g;
import p328s0.AbstractC11030i;

/* renamed from: u0.d */
/* loaded from: classes3.dex */
public class C11316d extends AbstractC11030i implements InterfaceC9654g {
    public C11316d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return GifDrawable.class;
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return ((GifDrawable) this.f26605c).m4325i();
    }

    @Override // p328s0.AbstractC11030i, p198j0.InterfaceC9654g
    public void initialize() {
        ((GifDrawable) this.f26605c).m4321e().prepareToDraw();
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
        ((GifDrawable) this.f26605c).stop();
        ((GifDrawable) this.f26605c).m4327k();
    }
}
