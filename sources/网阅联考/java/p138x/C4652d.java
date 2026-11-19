package p138x;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import p130v.AbstractC4614b;

/* renamed from: x.d */
/* loaded from: classes2.dex */
public class C4652d extends AbstractC4614b {
    public C4652d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p130v.AbstractC4614b, p093m.InterfaceC4358g
    /* renamed from: a */
    public void mo5369a() {
        ((GifDrawable) this.f5825a).m1973e().prepareToDraw();
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return GifDrawable.class;
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return ((GifDrawable) this.f5825a).m1977i();
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
        ((GifDrawable) this.f5825a).stop();
        ((GifDrawable) this.f5825a).m1979k();
    }
}
