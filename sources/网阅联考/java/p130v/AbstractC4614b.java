package p130v;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p062g0.AbstractC3749i;
import p093m.InterfaceC4358g;
import p093m.InterfaceC4361j;

/* renamed from: v.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4614b implements InterfaceC4361j, InterfaceC4358g {

    /* renamed from: a */
    public final Drawable f5825a;

    public AbstractC4614b(Drawable drawable) {
        this.f5825a = (Drawable) AbstractC3749i.m4768d(drawable);
    }

    @Override // p093m.InterfaceC4358g
    /* renamed from: a */
    public void mo5369a() {
        Drawable drawable = this.f5825a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m1973e().prepareToDraw();
        }
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f5825a.getConstantState();
        return constantState == null ? this.f5825a : constantState.newDrawable();
    }
}
