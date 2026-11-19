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

    public static int getAttr(Context context, int i6, int i7) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i6, typedValue, true);
        return typedValue.resourceId != 0 ? i6 : i7;
    }

    public static boolean getBoolean(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7, boolean z6) {
        return typedArray.getBoolean(i6, typedArray.getBoolean(i7, z6));
    }

    public static Drawable getDrawable(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7) {
        Drawable drawable = typedArray.getDrawable(i6);
        return drawable == null ? typedArray.getDrawable(i7) : drawable;
    }

    public static int getInt(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7, int i8) {
        return typedArray.getInt(i6, typedArray.getInt(i7, i8));
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6, boolean z6) {
        return !hasAttribute(xmlPullParser, str) ? z6 : typedArray.getBoolean(i6, z6);
    }

    @ColorInt
    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6, @ColorInt int i7) {
        return !hasAttribute(xmlPullParser, str) ? i7 : typedArray.getColor(i6, i7);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, @StyleableRes int i6) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i6, typedValue);
        int i7 = typedValue.type;
        if (i7 != 2) {
            return (i7 < 28 || i7 > 31) ? ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme) : getNamedColorStateListFromInt(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i6 + ": " + typedValue);
    }

    private static ColorStateList getNamedColorStateListFromInt(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ComplexColorCompat getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, @StyleableRes int i6, @ColorInt int i7) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i6, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat complexColorCompatInflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme);
            if (complexColorCompatInflate != null) {
                return complexColorCompatInflate;
            }
        }
        return ComplexColorCompat.from(i7);
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6, float f6) {
        return !hasAttribute(xmlPullParser, str) ? f6 : typedArray.getFloat(i6, f6);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6, int i7) {
        return !hasAttribute(xmlPullParser, str) ? i7 : typedArray.getInt(i6, i7);
    }

    @AnyRes
    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6, @AnyRes int i7) {
        return !hasAttribute(xmlPullParser, str) ? i7 : typedArray.getResourceId(i6, i7);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, @StyleableRes int i6) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i6);
        }
        return null;
    }

    @AnyRes
    public static int getResourceId(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7, @AnyRes int i8) {
        return typedArray.getResourceId(i6, typedArray.getResourceId(i7, i8));
    }

    public static String getString(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7) {
        String string = typedArray.getString(i6);
        return string == null ? typedArray.getString(i7) : string;
    }

    public static CharSequence getText(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7) {
        CharSequence text = typedArray.getText(i6);
        return text == null ? typedArray.getText(i7) : text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, @StyleableRes int i6, @StyleableRes int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i6);
        return textArray == null ? typedArray.getTextArray(i7) : textArray;
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(NAMESPACE, str) != null;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i6) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i6);
        }
        return null;
    }
}
