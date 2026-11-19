package coil3.compose;

import android.content.Context;
import android.os.Trace;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.navigation.C2826a;
import coil3.AbstractC3336u;
import coil3.InterfaceC3308n;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InterfaceC6009v;
import p110m.AbstractC6077e;
import p154s.C6532f;

/* renamed from: coil3.compose.o */
/* loaded from: classes2.dex */
public abstract class AbstractC3258o {
    /* renamed from: a */
    public static final AsyncImagePainter m2189a(String str, Composer composer, int i) {
        C2826a c2826a = AsyncImagePainter.f1818q;
        ContentScale fit = ContentScale.INSTANCE.getFit();
        int iM11236getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11236getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093003120, i, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:76)");
        }
        InterfaceC3308n interfaceC3308nM2283a = AbstractC3336u.m2283a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        int i8 = i & 14;
        int i9 = i << 3;
        int i10 = (i9 & 458752) | i8 | (i9 & 896) | (i9 & 7168) | (57344 & i9);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066092719, i10, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:113)");
        }
        C3246c c3246c = (C3246c) composer.consume(AbstractC3256m.f1879a);
        int i11 = (i10 >> 3) & 65520;
        composer.startReplaceGroup(-1242991349);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1242991349, i11, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C6532f c6532fM5791c = AbstractC6077e.m5791c(composer, str);
            AbstractC6077e.m5794f(c6532fM5791c);
            C3247d c3247d = new C3247d(interfaceC3308nM2283a, c6532fM5791c, c3246c);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new AsyncImagePainter(c3247d);
                composer.updateRememberedValue(objRememberedValue);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue2);
            }
            asyncImagePainter.f1825g = (InterfaceC6009v) objRememberedValue2;
            asyncImagePainter.f1826h = c2826a;
            asyncImagePainter.f1827i = null;
            asyncImagePainter.f1828j = fit;
            asyncImagePainter.f1829k = iM11236getDefaultFilterQualityfv9h1I;
            asyncImagePainter.f1830l = AbstractC6077e.m5789a(composer);
            asyncImagePainter.m2179d(c3247d);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Trace.endSection();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return asyncImagePainter;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
