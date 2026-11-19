package androidx.compose.p014ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.painter.BitmapPainter;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.VectorPainterKt;
import androidx.compose.p014ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p014ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* loaded from: classes2.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i10) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i10);
        } catch (Exception e10) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:89)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i10);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!AbstractC9979u.m20289b(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i11);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    @Composable
    public static final Painter painterResource(@DrawableRes int i10, Composer composer, int i11) {
        Painter painterRememberVectorPainter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = context.getResources();
        TypedValue typedValueResolveResourcePath = ((ResourceIdCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i10);
        CharSequence charSequence = typedValueResolveResourcePath.string;
        boolean z10 = true;
        if (charSequence == null || !AbstractC10793c0.m23114X(charSequence, ".xml", false, 2, null)) {
            composer.startReplaceGroup(-802887899);
            Object theme = context.getTheme();
            boolean zChanged = composer.changed(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !composer.changed(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zChanged2 = composer.changed(theme) | zChanged | z10;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = loadImageBitmapResource(charSequence, resources, i10);
                composer.updateRememberedValue(objRememberedValue);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) objRememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            painterRememberVectorPainter = bitmapPainter;
        } else {
            composer.startReplaceGroup(-803043333);
            painterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i10, typedValueResolveResourcePath.changingConfigurations, composer, (i11 << 6) & 896), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painterRememberVectorPainter;
    }
}
