package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, m5175d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DrawableKt {
    public static final Bitmap toBitmap(Drawable drawable, @Px int i4, @Px int i5, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i4 == bitmapDrawable.getBitmap().getWidth() && i5 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i4, i5, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return bitmapCreateScaledBitmap;
            }
        }
        Rect bounds = drawable.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        int i6 = bounds.left;
        int i7 = bounds.top;
        int i8 = bounds.right;
        int i9 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(i4, i5, config);
        drawable.setBounds(0, 0, i4, i5);
        drawable.draw(new Canvas(bitmap2));
        drawable.setBounds(i6, i7, i8, i9);
        Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
        return bitmap2;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i4, i5, config);
    }

    public static final Bitmap toBitmapOrNull(Drawable drawable, @Px int i4, @Px int i5, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i4, i5, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i4, i5, config);
    }

    public static final void updateBounds(Drawable drawable, @Px int i4, @Px int i5, @Px int i6, @Px int i7) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        drawable.setBounds(i4, i5, i6, i7);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = drawable.getBounds().left;
        }
        if ((i8 & 2) != 0) {
            i5 = drawable.getBounds().top;
        }
        if ((i8 & 4) != 0) {
            i6 = drawable.getBounds().right;
        }
        if ((i8 & 8) != 0) {
            i7 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i4, i5, i6, i7);
    }
}
