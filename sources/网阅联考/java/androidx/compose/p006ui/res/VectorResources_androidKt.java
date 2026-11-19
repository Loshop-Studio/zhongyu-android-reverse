package androidx.compose.p006ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.p006ui.graphics.vector.ImageVector;
import androidx.compose.p006ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.p006ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.p006ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p006ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m5174d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m5175d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n76#2:154\n83#3,3:155\n1114#4,6:158\n1#5:164\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,3\n53#1:158,6\n*E\n"})
/* loaded from: classes.dex */
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources res, XmlResourceParser parser, int i4) throws XmlPullParserException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(parser, 0, 2, null);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        ImageVector.Builder builderCreateVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, res, theme, attrs);
        int currentVectorNode = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(parser)) {
            currentVectorNode = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, res, attrs, theme, builderCreateVectorImageBuilder, currentVectorNode);
            parser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(builderCreateVectorImageBuilder.build(), i4);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i4, int i5, Object obj) throws XmlPullParserException {
        if ((i5 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i4);
    }

    @Composable
    public static final ImageVector vectorResource(ImageVector.Companion companion, @DrawableRes int i4, Composer composer, int i5) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        composer.startReplaceableGroup(44534090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i5, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i4), resources, theme, resources.getConfiguration()};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i6 = 0; i6 < 4; i6++) {
            zChanged |= composer.changed(objArr[i6]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = vectorResource(companion, theme, resources, i4);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ImageVector imageVector = (ImageVector) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i4, int i5, Object obj) throws XmlPullParserException {
        if ((i5 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i4);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources res, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        TypedValue typedValue = new TypedValue();
        res.getValue(i4, typedValue, true);
        XmlResourceParser vectorResource$lambda$1 = res.getXml(i4);
        Intrinsics.checkNotNullExpressionValue(vectorResource$lambda$1, "vectorResource$lambda$1");
        XmlVectorParser_androidKt.seekToStartTag(vectorResource$lambda$1);
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(vectorResource$lambda$1, "res.getXml(resId).apply { seekToStartTag() }");
        return loadVectorResourceInner(theme, res, vectorResource$lambda$1, typedValue.changingConfigurations).getImageVector();
    }
}
