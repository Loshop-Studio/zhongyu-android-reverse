package coil3.compose;

import android.content.Context;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.C5338l;
import kotlin.jvm.functions.Function1;

/* renamed from: coil3.compose.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5312c {
    /* renamed from: a */
    public static final void m2673a(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i9, boolean z9, Composer composer, int i10, int i11, int i12) {
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i12 & 8) != 0 ? null : painter;
        Painter painter5 = (i12 & 16) != 0 ? null : painter2;
        Painter painter6 = (i12 & 32) != 0 ? painter5 : painter3;
        Function1 function14 = (i12 & 64) != 0 ? null : function1;
        Function1 function15 = (i12 & 128) != 0 ? null : function12;
        Function1 function16 = (i12 & 256) != 0 ? null : function13;
        Alignment center = (i12 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i12 & 2048) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i12 & 4096) != 0 ? null : colorFilter;
        int iM21963getDefaultFilterQualityfv9h1I = (i12 & 8192) != 0 ? DrawScope.INSTANCE.m21963getDefaultFilterQualityfv9h1I() : i9;
        boolean z10 = (i12 & 16384) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846727149, i10, i11, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:61)");
        }
        int i13 = i10 << 3;
        int i14 = i11 << 3;
        AbstractC5310a.m2670c(obj, str, C5338l.m2823a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifier2, painter4, painter5, painter6, function14, function15, function16, center, fit, f11, colorFilter2, iM21963getDefaultFilterQualityfv9h1I, z10, composer, (i10 & 126) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), ((i10 >> 27) & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
