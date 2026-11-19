package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;

/* loaded from: classes2.dex */
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m22987getString2EP1pXo(int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m22988getStringqBjtwXw(int i10, Object[] objArr, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strM22987getString2EP1pXo = m22987getString2EP1pXo(i10, composer, i11 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C9114c0 c9114c0 = C9114c0.f17482a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(locale, strM22987getString2EP1pXo, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC9133u.m16132f(str, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
