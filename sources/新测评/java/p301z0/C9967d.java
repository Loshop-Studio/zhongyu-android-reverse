package p301z0;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p184o0.InterfaceC8687g;
import p281x0.AbstractC9835i;

/* renamed from: z0.d */
/* loaded from: classes3.dex */
public class C9967d extends AbstractC9835i implements InterfaceC8687g {
    public C9967d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return GifDrawable.class;
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return ((GifDrawable) this.f17393a).m3676i();
    }

    @Override // p281x0.AbstractC9835i, p184o0.InterfaceC8687g
    public void initialize() {
        ((GifDrawable) this.f17393a).m3672e().prepareToDraw();
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
        ((GifDrawable) this.f17393a).stop();
        ((GifDrawable) this.f17393a).m3678k();
    }
}
