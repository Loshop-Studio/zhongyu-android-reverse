package p148s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: s.g */
/* loaded from: classes.dex */
public class C3369g {
    /* renamed from: a */
    public static boolean m10245a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, boolean z3) {
        return !m10254j(xmlPullParser, str) ? z3 : typedArray.getBoolean(i4, z3);
    }

    /* renamed from: b */
    public static int m10246b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        return !m10254j(xmlPullParser, str) ? i5 : typedArray.getColor(i4, i5);
    }

    /* renamed from: c */
    public static ColorStateList m10247c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        if (!m10254j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i4, typedValue);
        int i5 = typedValue.type;
        if (i5 != 2) {
            return (i5 < 28 || i5 > 31) ? C3363a.m10187d(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme) : m10248d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i4 + ": " + typedValue);
    }

    /* renamed from: d */
    private static ColorStateList m10248d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C3364b m10249e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4, int i5) {
        if (m10254j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return C3364b.m10193b(typedValue.data);
            }
            C3364b c3364bM10196g = C3364b.m10196g(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            if (c3364bM10196g != null) {
                return c3364bM10196g;
            }
        }
        return C3364b.m10193b(i5);
    }

    /* renamed from: f */
    public static float m10250f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, float f4) {
        return !m10254j(xmlPullParser, str) ? f4 : typedArray.getFloat(i4, f4);
    }

    /* renamed from: g */
    public static int m10251g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        return !m10254j(xmlPullParser, str) ? i5 : typedArray.getInt(i4, i5);
    }

    /* renamed from: h */
    public static int m10252h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        return !m10254j(xmlPullParser, str) ? i5 : typedArray.getResourceId(i4, i5);
    }

    /* renamed from: i */
    public static String m10253i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4) {
        if (m10254j(xmlPullParser, str)) {
            return typedArray.getString(i4);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m10254j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m10255k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m10256l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4) {
        if (m10254j(xmlPullParser, str)) {
            return typedArray.peekValue(i4);
        }
        return null;
    }
}
