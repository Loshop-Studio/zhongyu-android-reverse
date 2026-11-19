package p132q0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p016b1.AbstractC4408j;
import p067h0.InterfaceC6437g;
import p067h0.InterfaceC6440j;

/* renamed from: q0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7614i implements InterfaceC6440j, InterfaceC6437g {

    /* renamed from: a */
    public final Drawable f10073a;

    public AbstractC7614i(Drawable drawable) {
        this.f10073a = (Drawable) AbstractC4408j.m1438d(drawable);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f10073a.getConstantState();
        return constantState == null ? this.f10073a : constantState.newDrawable();
    }

    @Override // p067h0.InterfaceC6437g
    public void initialize() {
        Drawable drawable = this.f10073a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m2852e().prepareToDraw();
        }
    }
}
