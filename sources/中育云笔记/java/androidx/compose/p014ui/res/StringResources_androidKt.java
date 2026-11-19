package androidx.compose.p014ui.res;

import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class StringResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final String pluralStringResource(@PluralsRes int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i10, i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    public static final String[] stringArrayResource(@ArrayRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i11, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    @Composable
    @ReadOnlyComposable
    public static final String stringResource(@StringRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    public static final String pluralStringResource(@PluralsRes int i10, int i11, Object[] objArr, Composer composer, int i12) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    public static final String stringResource(@StringRes int i10, Object[] objArr, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
