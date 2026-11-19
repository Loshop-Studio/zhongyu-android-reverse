package coil3.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: d */
    public final ImageView f3915d;

    public ImageViewTarget(ImageView imageView) {
        this.f3915d = imageView;
    }

    @Override // coil3.target.GenericViewTarget
    /* renamed from: d */
    public Drawable mo3282d() {
        return getView().getDrawable();
    }

    @Override // coil3.target.GenericViewTarget
    /* renamed from: e */
    public void mo3283e(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && AbstractC9979u.m20289b(this.f3915d, ((ImageViewTarget) obj).f3915d);
    }

    @Override // p412y.InterfaceC11880b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f3915d;
    }

    public int hashCode() {
        return this.f3915d.hashCode();
    }

    public String toString() {
        return "ImageViewTarget(view=" + this.f3915d + ')';
    }
}
