package p303y;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p182n.InterfaceC9354g;
import p281w.AbstractC10267i;

/* renamed from: y.d */
/* loaded from: classes3.dex */
public class C10594d extends AbstractC10267i implements InterfaceC9354g {
    public C10594d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return GifDrawable.class;
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return ((GifDrawable) this.f20497a).m3121i();
    }

    @Override // p281w.AbstractC10267i, p182n.InterfaceC9354g
    public void initialize() {
        ((GifDrawable) this.f20497a).m3117e().prepareToDraw();
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
        ((GifDrawable) this.f20497a).stop();
        ((GifDrawable) this.f20497a).m3123k();
    }
}
