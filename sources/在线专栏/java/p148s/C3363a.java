package p148s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p139q.C3003a;
import p139q.C3005c;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C3363a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f11810a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m10184a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m10185b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m10185b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m10188e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m10186c() {
        ThreadLocal<TypedValue> threadLocal = f11810a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m10187d(Resources resources, int i4, Resources.Theme theme) {
        try {
            return m10184a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    /* renamed from: e */
    private static ColorStateList m10188e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM10227a = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM10191h = m10191h(resources, theme, attributeSet, C3005c.f11642b);
                int i6 = C3005c.f11643c;
                int resourceId = typedArrayM10191h.getResourceId(i6, -1);
                if (resourceId == -1 || m10189f(resources, resourceId)) {
                    color = typedArrayM10191h.getColor(i6, -65281);
                } else {
                    try {
                        color = m10184a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM10191h.getColor(C3005c.f11643c, -65281);
                    }
                }
                float f4 = 1.0f;
                int i7 = C3005c.f11644d;
                if (typedArrayM10191h.hasValue(i7)) {
                    f4 = typedArrayM10191h.getFloat(i7, 1.0f);
                } else {
                    int i8 = C3005c.f11645e;
                    if (typedArrayM10191h.hasValue(i8)) {
                        f4 = typedArrayM10191h.getFloat(i8, 1.0f);
                    }
                }
                typedArrayM10191h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i9 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C3003a.f11580a) {
                        int i11 = i9 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i9] = attributeNameResource;
                        i9 = i11;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i9);
                iArrM10227a = C3367e.m10227a(iArrM10227a, i5, m10190g(color, f4));
                iArr = (int[][]) C3367e.m10228b(iArr, i5, iArrTrimStateSet);
                i5++;
            }
            i4 = 1;
        }
        int[] iArr3 = new int[i5];
        int[][] iArr4 = new int[i5][];
        System.arraycopy(iArrM10227a, 0, iArr3, 0, i5);
        System.arraycopy(iArr, 0, iArr4, 0, i5);
        return new ColorStateList(iArr4, iArr3);
    }

    /* renamed from: f */
    private static boolean m10189f(Resources resources, int i4) throws Resources.NotFoundException {
        TypedValue typedValueM10186c = m10186c();
        resources.getValue(i4, typedValueM10186c, true);
        int i5 = typedValueM10186c.type;
        return i5 >= 28 && i5 <= 31;
    }

    /* renamed from: g */
    private static int m10190g(int i4, float f4) {
        return (i4 & 16777215) | (Math.round(Color.alpha(i4) * f4) << 24);
    }

    /* renamed from: h */
    private static TypedArray m10191h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
