package p281w;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p116h0.AbstractC8706j;
import p182n.InterfaceC9354g;
import p182n.InterfaceC9357j;

/* renamed from: w.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10267i implements InterfaceC9357j, InterfaceC9354g {

    /* renamed from: a */
    public final Drawable f20497a;

    public AbstractC10267i(Drawable drawable) {
        this.f20497a = (Drawable) AbstractC8706j.m14181d(drawable);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f20497a.getConstantState();
        return constantState == null ? this.f20497a : constantState.newDrawable();
    }

    @Override // p182n.InterfaceC9354g
    public void initialize() {
        Drawable drawable = this.f20497a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m3117e().prepareToDraw();
        }
    }
}
