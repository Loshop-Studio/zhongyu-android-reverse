package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p014ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final AssetManager assetManager;
    private final String cacheKey;
    private final String path;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, AbstractC9972n abstractC9972n) {
        this(assetManager, str, fontWeight, i10, settings);
    }

    @Override // androidx.compose.p014ui.text.font.AndroidPreloadedFont
    public Typeface doLoad$ui_text_release(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings()) : Typeface.createFromAsset(this.assetManager, this.path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        return AbstractC9979u.m20289b(this.path, androidAssetFont.path) && AbstractC9979u.m20289b(getVariationSettings(), androidAssetFont.getVariationSettings());
    }

    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.p014ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m33079toStringimpl(mo33030getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, AbstractC9972n abstractC9972n) {
        this(assetManager, str, (i11 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i11 & 8) != 0 ? FontStyle.Companion.m33084getNormal_LCdwA() : i10, settings, null);
    }

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(fontWeight, i10, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + str;
    }
}
