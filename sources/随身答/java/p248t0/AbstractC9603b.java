package p248t0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p091e1.AbstractC7837i;
import p152k0.InterfaceC8256g;
import p152k0.InterfaceC8259j;

/* renamed from: t0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9603b implements InterfaceC8259j, InterfaceC8256g {

    /* renamed from: a */
    public final Drawable f16823a;

    public AbstractC9603b(Drawable drawable) {
        this.f16823a = (Drawable) AbstractC7837i.m12256d(drawable);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f16823a.getConstantState();
        return constantState == null ? this.f16823a : constantState.newDrawable();
    }

    @Override // p152k0.InterfaceC8256g
    public void initialize() {
        Drawable drawable = this.f16823a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).m3297e().prepareToDraw();
        }
    }
}
