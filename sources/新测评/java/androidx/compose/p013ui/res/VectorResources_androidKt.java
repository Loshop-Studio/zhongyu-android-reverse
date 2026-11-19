package androidx.compose.p013ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.p013ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p013ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m13558d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n75#2:141\n1247#3,6:142\n1#4:148\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:141\n53#1:142,6\n*E\n"})
/* loaded from: classes2.dex */
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        ImageVector.Builder builderCreateVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int currentVectorNode = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser)) {
            currentVectorNode = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, attributeSetAsAttributeSet, theme, builderCreateVectorImageBuilder, currentVectorNode);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(builderCreateVectorImageBuilder.build(), i10);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i10);
    }

    @Composable
    public static final ImageVector vectorResource(ImageVector.Companion companion, @DrawableRes int i10, Composer composer, int i11) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        Resources.Theme theme = context.getTheme();
        boolean zChanged = composer.changed(resources) | ((((i11 & 112) ^ 48) > 32 && composer.changed(i10)) || (i11 & 48) == 32) | composer.changed(theme) | composer.changed(resources.getConfiguration());
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = vectorResource(companion, theme, resources, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        ImageVector imageVector = (ImageVector) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i10);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        Unit unit = Unit.INSTANCE;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
