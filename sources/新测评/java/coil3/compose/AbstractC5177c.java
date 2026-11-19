package coil3.compose;

import android.content.Context;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.C5203l;
import kotlin.jvm.functions.Function1;

/* renamed from: coil3.compose.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5177c {
    /* renamed from: a */
    public static final void m2945a(Object obj, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, boolean z9, Composer composer, int i11, int i12, int i13) {
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Function1 function1M2920a = (i13 & 8) != 0 ? AsyncImagePainter.INSTANCE.m2920a() : function1;
        Function1 function13 = (i13 & 16) != 0 ? null : function12;
        Alignment center = (i13 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i13 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i13 & 128) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i13 & 256) != 0 ? null : colorFilter;
        int iM21530getDefaultFilterQualityfv9h1I = (i13 & 512) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i10;
        boolean z10 = (i13 & 1024) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1976030921, i11, i12, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:117)");
        }
        int i14 = i11 << 3;
        AbstractC5175a.m2942d(obj, str, C5203l.m3104a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifier2, function1M2920a, function13, center, fit, f11, colorFilter2, iM21530getDefaultFilterQualityfv9h1I, z10, composer, (i11 & 126) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), ((i11 >> 27) & 14) | ((i12 << 3) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: b */
    public static final void m2946b(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, boolean z9, Composer composer, int i11, int i12, int i13) {
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i13 & 8) != 0 ? null : painter;
        Painter painter5 = (i13 & 16) != 0 ? null : painter2;
        Painter painter6 = (i13 & 32) != 0 ? painter5 : painter3;
        Function1 function14 = (i13 & 64) != 0 ? null : function1;
        Function1 function15 = (i13 & 128) != 0 ? null : function12;
        Function1 function16 = (i13 & 256) != 0 ? null : function13;
        Alignment center = (i13 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i13 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i13 & 2048) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i13 & 4096) != 0 ? null : colorFilter;
        int iM21530getDefaultFilterQualityfv9h1I = (i13 & 8192) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i10;
        boolean z10 = (i13 & 16384) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846727149, i11, i12, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:61)");
        }
        int i14 = i11 << 3;
        int i15 = i12 << 3;
        AbstractC5175a.m2941c(obj, str, C5203l.m3104a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifier2, painter4, painter5, painter6, function14, function15, function16, center, fit, f11, colorFilter2, iM21530getDefaultFilterQualityfv9h1I, z10, composer, (i11 & 126) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192), ((i11 >> 27) & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
