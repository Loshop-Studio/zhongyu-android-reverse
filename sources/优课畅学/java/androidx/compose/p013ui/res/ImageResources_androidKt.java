package androidx.compose.p013ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.p013ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, @DrawableRes int i10) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10, null);
        AbstractC9133u.m16131e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    @Composable
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, @DrawableRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:51)");
        }
        Resources resources = Resources_androidKt.resources(composer, 0);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        TypedValue typedValue = (TypedValue) objRememberedValue;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        AbstractC9133u.m16130d(charSequence);
        boolean zChanged = composer.changed(charSequence.toString());
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = imageResource(companion, resources, i10);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageBitmap;
    }
}
