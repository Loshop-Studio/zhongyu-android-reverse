package androidx.compose.p014ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.ResourceFont;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @InterfaceC10770a
    public Typeface load(Font font) {
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
        }
        Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
        AbstractC9979u.m20291d(font2);
        return font2;
    }
}
