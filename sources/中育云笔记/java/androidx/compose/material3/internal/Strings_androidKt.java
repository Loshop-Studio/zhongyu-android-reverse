package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;

/* loaded from: classes2.dex */
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m29589getString2EP1pXo(int i10, Composer composer, int i11) {
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
    public static final String m29590getStringqBjtwXw(int i10, Object[] objArr, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strM29589getString2EP1pXo = m29589getString2EP1pXo(i10, composer, i11 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C9960c0 c9960c0 = C9960c0.f23411a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(locale, strM29589getString2EP1pXo, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC9979u.m20293f(str, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
