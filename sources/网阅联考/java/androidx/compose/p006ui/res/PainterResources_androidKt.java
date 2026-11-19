package androidx.compose.p006ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.p006ui.graphics.ImageBitmap;
import androidx.compose.p006ui.graphics.painter.BitmapPainter;
import androidx.compose.p006ui.graphics.painter.Painter;
import androidx.compose.p006ui.graphics.vector.ImageVector;
import androidx.compose.p006ui.graphics.vector.VectorPainterKt;
import androidx.compose.p006ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.p006ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p006ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a1\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bR\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m5175d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "changingConfigurations", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageBitmap loadImageBitmapResource(Resources resources, int i4) {
        return ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, resources, i4);
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i4, int i5, Composer composer, int i6) throws XmlPullParserException, Resources.NotFoundException, IOException, IllegalArgumentException {
        composer.startReplaceableGroup(21855625);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i6, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i4);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i4);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i5);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    @Composable
    public static final Painter painterResource(@DrawableRes int i4, Composer composer, int i5) throws Resources.NotFoundException {
        Painter bitmapPainter;
        composer.startReplaceableGroup(473971343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i5, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) objRememberedValue;
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt__StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            composer.startReplaceableGroup(-738265327);
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
            bitmapPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(theme, resources, i4, typedValue.changingConfigurations, composer, ((i5 << 6) & 896) | 72), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-738265172);
            Object objValueOf = Integer.valueOf(i4);
            Object theme2 = context.getTheme();
            composer.startReplaceableGroup(1618982084);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(charSequence) | composer.changed(theme2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = loadImageBitmapResource(resources, i4);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            bitmapPainter = new BitmapPainter((ImageBitmap) objRememberedValue2, 0L, 0L, 6, null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bitmapPainter;
    }
}
