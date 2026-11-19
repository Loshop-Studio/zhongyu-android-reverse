package androidx.compose.p013ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p013ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.LoadedFontFamily;
import androidx.compose.p013ui.text.font.SystemFontFamily;
import androidx.compose.p013ui.text.font.Typeface;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.LinkedHashMap;
import java.util.Map;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();

    @GuardedBy("cacheLock")
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @Composable
    @ReadOnlyComposable
    @InterfaceC8721a
    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i10, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:51)");
        }
        Typeface typefaceFontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typefaceFontResourceFromContext;
    }

    @InterfaceC8721a
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            try {
                Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                Typeface typefaceTypeface$default = map.get(fontFamily);
                if (typefaceTypeface$default == null) {
                    typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typefaceTypeface$default);
                }
                typeface = typefaceTypeface$default;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typeface;
    }
}
