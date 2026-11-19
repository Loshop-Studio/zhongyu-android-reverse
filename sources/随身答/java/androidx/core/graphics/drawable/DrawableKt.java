package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, m13413d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n37#2,31:119\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119,31\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawableKt {
    public static final Bitmap toBitmap(Drawable drawable, @Px int i9, @Px int i10, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i9 == bitmapDrawable.getBitmap().getWidth() && i10 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i9, i10, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, config);
        drawable.setBounds(0, 0, i9, i10);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i9, int i10, Bitmap.Config config, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = drawable.getIntrinsicWidth();
        }
        if ((i11 & 2) != 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        if ((i11 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i9, i10, config);
    }

    public static final Bitmap toBitmapOrNull(Drawable drawable, @Px int i9, @Px int i10, Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i9, i10, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i9, int i10, Bitmap.Config config, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = drawable.getIntrinsicWidth();
        }
        if ((i11 & 2) != 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        if ((i11 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i9, i10, config);
    }

    public static final void updateBounds(Drawable drawable, @Px int i9, @Px int i10, @Px int i11, @Px int i12) {
        drawable.setBounds(i9, i10, i11, i12);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = drawable.getBounds().left;
        }
        if ((i13 & 2) != 0) {
            i10 = drawable.getBounds().top;
        }
        if ((i13 & 4) != 0) {
            i11 = drawable.getBounds().right;
        }
        if ((i13 & 8) != 0) {
            i12 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i9, i10, i11, i12);
    }
}
