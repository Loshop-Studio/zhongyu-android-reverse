package coil3.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m13558d2 = {"Lcoil3/target/ImageViewTarget;", "Lcoil3/target/GenericViewTarget;", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Landroid/widget/ImageView;", "h", "()Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "value", "d", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        this.view = imageView;
    }

    @Override // coil3.target.GenericViewTarget
    /* renamed from: d */
    public Drawable mo3188d() {
        return getView().getDrawable();
    }

    @Override // coil3.target.GenericViewTarget
    /* renamed from: e */
    public void mo3189e(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageViewTarget) && Intrinsics.areEqual(this.view, ((ImageViewTarget) other).view);
    }

    @Override // p002a0.InterfaceC0007b
    /* renamed from: h, reason: from getter */
    public ImageView getView() {
        return this.view;
    }

    public int hashCode() {
        return this.view.hashCode();
    }

    public String toString() {
        return "ImageViewTarget(view=" + this.view + ')';
    }
}
