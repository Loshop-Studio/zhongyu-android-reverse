package coil3.compose;

import android.os.Trace;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import coil3.InterfaceC4574e;
import coil3.compose.AsyncImagePainter;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import p096l.AbstractC7264f;
import p096l.InterfaceC7259a;
import p103m.AbstractC7365h;
import p103m.C7359b;
import p187y.C7872e;

/* renamed from: coil3.compose.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4556a {
    /* renamed from: a */
    public static final AsyncImagePainter m1770a(Object obj, InterfaceC4574e interfaceC4574e, Function1 function1, Function1 function12, ContentScale contentScale, int i6, Composer composer, int i7, int i8) {
        if ((i8 & 4) != 0) {
            function1 = AsyncImagePainter.INSTANCE.m1754a();
        }
        Function1 function13 = function1;
        if ((i8 & 8) != 0) {
            function12 = null;
        }
        Function1 function14 = function12;
        if ((i8 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        ContentScale contentScale2 = contentScale;
        if ((i8 & 32) != 0) {
            i6 = DrawScope.INSTANCE.m14453getDefaultFilterQualityfv9h1I();
        }
        int i9 = i6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066092719, i7, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:119)");
        }
        AsyncImagePainter asyncImagePainterM1771b = m1771b(new C7359b(obj, (InterfaceC7259a) composer.consume(AbstractC7264f.m8186c()), interfaceC4574e), function13, function14, contentScale2, i9, composer, (i7 >> 3) & 65520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asyncImagePainterM1771b;
    }

    /* renamed from: b */
    public static final AsyncImagePainter m1771b(C7359b c7359b, Function1 function1, Function1 function12, ContentScale contentScale, int i6, Composer composer, int i7) {
        composer.startReplaceGroup(-1242991349);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1242991349, i7, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:134)");
        }
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C7872e c7872eM8375f = AbstractC7365h.m8375f(c7359b.m8363b(), composer, 0);
            AbstractC7365h.m8382m(c7872eM8375f);
            AsyncImagePainter.C4552b c4552b = new AsyncImagePainter.C4552b(c7359b.m8362a(), c7872eM8375f, c7359b.m8364c());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new AsyncImagePainter(c4552b);
                composer.updateRememberedValue(objRememberedValue);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue2);
            }
            asyncImagePainter.m1748u((CoroutineScope) objRememberedValue2);
            asyncImagePainter.m1749v(function1);
            asyncImagePainter.m1745q(function12);
            asyncImagePainter.m1742n(contentScale);
            asyncImagePainter.m1744p(i6);
            asyncImagePainter.m1746s(AbstractC7365h.m8374e(composer, 0));
            asyncImagePainter.m1750w(c4552b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }
}
