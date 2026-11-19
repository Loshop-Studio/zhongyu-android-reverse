package p281x0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p117i1.AbstractC7651j;
import p184o0.InterfaceC8687g;
import p184o0.InterfaceC8690j;

/* renamed from: x0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC9835i implements InterfaceC8690j, InterfaceC8687g {

    /* renamed from: a */
    public final Drawable f17393a;

    public AbstractC9835i(Drawable drawable) {
        this.f17393a = (Drawable) AbstractC7651j.m12683d(drawable);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f17393a.getConstantState();
        return constantState == null ? this.f17393a : constantState.newDrawable();
    }

    @Override // p184o0.InterfaceC8687g
    public void initialize() {
        Drawable drawable = this.f17393a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m3672e().prepareToDraw();
        }
    }
}
