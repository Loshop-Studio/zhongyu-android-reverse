package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
    }

    public static int getAttr(Context context, int i9, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i9, typedValue, true);
        return typedValue.resourceId != 0 ? i9 : i10;
    }

    public static boolean getBoolean(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10, boolean z9) {
        return typedArray.getBoolean(i9, typedArray.getBoolean(i10, z9));
    }

    public static Drawable getDrawable(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10) {
        Drawable drawable = typedArray.getDrawable(i9);
        return drawable == null ? typedArray.getDrawable(i10) : drawable;
    }

    public static int getInt(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10, int i11) {
        return typedArray.getInt(i9, typedArray.getInt(i10, i11));
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9, boolean z9) {
        return !hasAttribute(xmlPullParser, str) ? z9 : typedArray.getBoolean(i9, z9);
    }

    @ColorInt
    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9, @ColorInt int i10) {
        return !hasAttribute(xmlPullParser, str) ? i10 : typedArray.getColor(i9, i10);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, @StyleableRes int i9) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i9, typedValue);
        int i10 = typedValue.type;
        if (i10 != 2) {
            return (i10 < 28 || i10 > 31) ? ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme) : getNamedColorStateListFromInt(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i9 + ": " + typedValue);
    }

    private static ColorStateList getNamedColorStateListFromInt(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ComplexColorCompat getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, @StyleableRes int i9, @ColorInt int i10) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i9, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat complexColorCompatInflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme);
            if (complexColorCompatInflate != null) {
                return complexColorCompatInflate;
            }
        }
        return ComplexColorCompat.from(i10);
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9, float f10) {
        return !hasAttribute(xmlPullParser, str) ? f10 : typedArray.getFloat(i9, f10);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9, int i10) {
        return !hasAttribute(xmlPullParser, str) ? i10 : typedArray.getInt(i9, i10);
    }

    @AnyRes
    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9, @AnyRes int i10) {
        return !hasAttribute(xmlPullParser, str) ? i10 : typedArray.getResourceId(i9, i10);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i9) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i9);
        }
        return null;
    }

    @AnyRes
    public static int getResourceId(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10, @AnyRes int i11) {
        return typedArray.getResourceId(i9, typedArray.getResourceId(i10, i11));
    }

    public static String getString(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10) {
        String string = typedArray.getString(i9);
        return string == null ? typedArray.getString(i10) : string;
    }

    public static CharSequence getText(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10) {
        CharSequence text = typedArray.getText(i9);
        return text == null ? typedArray.getText(i10) : text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, @StyleableRes int i9, @StyleableRes int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i9);
        return textArray == null ? typedArray.getTextArray(i10) : textArray;
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(NAMESPACE, str) != null;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i9);
        }
        return null;
    }
}
