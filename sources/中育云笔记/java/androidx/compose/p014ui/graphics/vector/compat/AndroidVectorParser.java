package androidx.compose.p014ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.p014ui.graphics.vector.PathParser;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.xmlpull.v1.XmlPullParser;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i10) {
        this.xmlParser = xmlPullParser;
        this.config = i10;
        this.pathParser = new PathParser();
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i11 & 2) != 0) {
            i10 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i10);
    }

    private final void updateConfig(int i10) {
        this.config = i10 | this.config;
    }

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i10) {
        return new AndroidVectorParser(xmlPullParser, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return AbstractC9979u.m20289b(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        updateConfig(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int getInt(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        updateConfig(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, @StyleableRes int i10, boolean z10) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i10, z10);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i10) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i10);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i10, @ColorInt int i11) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i10, i11);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, @StyleableRes int i10, float f10) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i10, f10);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(TypedArray typedArray, String str, @StyleableRes int i10, int i11) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i10, i11);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final String getString(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void setConfig(int i10) {
        this.config = i10;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
