package coil3.compose;

import android.content.Context;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.C4584l;
import kotlin.jvm.functions.Function1;

/* renamed from: coil3.compose.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4558c {
    /* renamed from: a */
    public static final AsyncImagePainter m1773a(Object obj, Function1 function1, Function1 function12, ContentScale contentScale, int i6, Composer composer, int i7, int i8) {
        if ((i8 & 2) != 0) {
            function1 = AsyncImagePainter.INSTANCE.m1754a();
        }
        Function1 function13 = function1;
        if ((i8 & 4) != 0) {
            function12 = null;
        }
        Function1 function14 = function12;
        if ((i8 & 8) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        ContentScale contentScale2 = contentScale;
        if ((i8 & 16) != 0) {
            i6 = DrawScope.INSTANCE.m14453getDefaultFilterQualityfv9h1I();
        }
        int i9 = i6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093003120, i7, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:82)");
        }
        int i10 = i7 << 3;
        AsyncImagePainter asyncImagePainterM1770a = AbstractC4556a.m1770a(obj, C4584l.m1929a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), function13, function14, contentScale2, i9, composer, (i7 & 14) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asyncImagePainterM1770a;
    }
}
