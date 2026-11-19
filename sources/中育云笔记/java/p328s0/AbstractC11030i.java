package p328s0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p109d1.AbstractC8909j;
import p198j0.InterfaceC9654g;
import p198j0.InterfaceC9657j;

/* renamed from: s0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC11030i implements InterfaceC9657j, InterfaceC9654g {

    /* renamed from: c */
    public final Drawable f26605c;

    public AbstractC11030i(Drawable drawable) {
        this.f26605c = (Drawable) AbstractC8909j.m17468d(drawable);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f26605c.getConstantState();
        return constantState == null ? this.f26605c : constantState.newDrawable();
    }

    @Override // p198j0.InterfaceC9654g
    public void initialize() {
        Drawable drawable = this.f26605c;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m4321e().prepareToDraw();
        }
    }
}
