package androidx.compose.p014ui.text.platform;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.SieveCache;
import androidx.compose.p014ui.text.font.AndroidFont;
import androidx.compose.p014ui.text.font.AndroidPreloadedFont;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.ResourceFont;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final SieveCache<String, Typeface> cache = new SieveCache<>(16, 16, null, null, null, 28, null);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    private final String getKey(Context context, Font font) throws Resources.NotFoundException {
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        AbstractC9979u.m20291d(string);
        sb2.append(string);
        return sb2.toString();
    }

    public final Typeface getOrCreate(Context context, Font font) throws Resources.NotFoundException {
        Typeface typefaceLoadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                typefaceLoadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                typefaceLoadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                AbstractC9979u.m20291d(typefaceLoadBlocking);
            }
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            AndroidFont androidFont = (AndroidFont) font;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (typefaceLoadBlocking != null) {
            if (key != null) {
                cache.put(key, typefaceLoadBlocking);
            }
            return typefaceLoadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
