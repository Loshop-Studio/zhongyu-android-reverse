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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u00012\b\b\u0003\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "toBitmapOrNull", "left", "top", "right", "bottom", "Ld6/s;", "updateBounds", "(Landroid/graphics/drawable/Drawable;IIII)V", "core-ktx_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n37#2,31:119\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119,31\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawableKt {
    @NotNull
    public static final Bitmap toBitmap(@NotNull Drawable drawable, @Px int i, @Px int i8, @Nullable Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i8 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i8, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i9 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i8, config);
        drawable.setBounds(0, 0, i, i8);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i9, i10, i11, i12);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i8, Bitmap.Config config, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i9 & 2) != 0) {
            i8 = drawable.getIntrinsicHeight();
        }
        if ((i9 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i8, config);
    }

    @Nullable
    public static final Bitmap toBitmapOrNull(@NotNull Drawable drawable, @Px int i, @Px int i8, @Nullable Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i, i8, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i, int i8, Bitmap.Config config, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i9 & 2) != 0) {
            i8 = drawable.getIntrinsicHeight();
        }
        if ((i9 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i, i8, config);
    }

    public static final void updateBounds(@NotNull Drawable drawable, @Px int i, @Px int i8, @Px int i9, @Px int i10) {
        drawable.setBounds(i, i8, i9, i10);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i11 & 2) != 0) {
            i8 = drawable.getBounds().top;
        }
        if ((i11 & 4) != 0) {
            i9 = drawable.getBounds().right;
        }
        if ((i11 & 8) != 0) {
            i10 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i8, i9, i10);
    }
}
