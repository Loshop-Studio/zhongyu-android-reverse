package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final String cacheKey;
    private final File file;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings, AbstractC9126n abstractC9126n) {
        this(file, fontWeight, i10, settings);
    }

    @Override // androidx.compose.p013ui.text.font.AndroidPreloadedFont
    public Typeface doLoad$ui_text_release(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings()) : Typeface.createFromFile(this.file);
    }

    @Override // androidx.compose.p013ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final File getFile() {
        return this.file;
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m26477toStringimpl(mo26428getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, AbstractC9126n abstractC9126n) {
        this(file, (i11 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i11 & 4) != 0 ? FontStyle.Companion.m26482getNormal_LCdwA() : i10, settings, null);
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(fontWeight, i10, settings, null);
        this.file = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
