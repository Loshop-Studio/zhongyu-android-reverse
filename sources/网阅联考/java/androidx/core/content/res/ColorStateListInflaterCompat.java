package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.C1770R;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources, @XmlRes int i4, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    private static boolean isColorInt(@NonNull Resources resources, @ColorRes int i4) throws Resources.NotFoundException {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        return i5 >= 28 && i5 <= 31;
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i4, @FloatRange(from = 0.0d, m95to = 1.0d) float f4, @FloatRange(from = 0.0d, m95to = 100.0d) float f5) {
        boolean z3 = f5 >= 0.0f && f5 <= 100.0f;
        if (f4 == 1.0f && !z3) {
            return i4;
        }
        int iClamp = MathUtils.clamp((int) ((Color.alpha(i4) * f4) + 0.5f), 0, 255);
        if (z3) {
            CamColor camColorFromColor = CamColor.fromColor(i4);
            i4 = CamColor.toColor(camColorFromColor.getHue(), camColorFromColor.getChroma(), f5);
        }
        return (i4 & ViewCompat.MEASURED_SIZE_MASK) | (iClamp << 24);
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f4;
        Resources resources2 = resources;
        int i4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = obtainAttributes(resources2, theme, attributeSet, C1770R.styleable.ColorStateListItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(C1770R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !isColorInt(resources2, resourceId)) {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayObtainAttributes.getColor(C1770R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(C1770R.styleable.ColorStateListItem_android_color, -65281);
                }
                float f5 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(C1770R.styleable.ColorStateListItem_android_alpha)) {
                    f5 = typedArrayObtainAttributes.getFloat(C1770R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(C1770R.styleable.ColorStateListItem_alpha)) {
                    f5 = typedArrayObtainAttributes.getFloat(C1770R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                if (Build.VERSION.SDK_INT >= 31 && typedArrayObtainAttributes.hasValue(C1770R.styleable.ColorStateListItem_android_lStar)) {
                    f4 = typedArrayObtainAttributes.getFloat(C1770R.styleable.ColorStateListItem_android_lStar, -1.0f);
                } else {
                    f4 = typedArrayObtainAttributes.getFloat(C1770R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C1770R.attr.alpha && attributeNameResource != C1770R.attr.lStar) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i6);
                iArrAppend = GrowingArrayUtils.append(iArrAppend, i5, modulateColorAlpha(color, f5, f4));
                iArr = (int[][]) GrowingArrayUtils.append(iArr, i5, iArrTrimStateSet);
                i5++;
            }
            i4 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i5];
        int[][] iArr4 = new int[i5][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i5);
        System.arraycopy(iArr, 0, iArr4, 0, i5);
        return new ColorStateList(iArr4, iArr3);
    }
}
