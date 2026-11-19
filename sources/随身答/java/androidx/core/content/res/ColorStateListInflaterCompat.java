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
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.core.C3266R;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.utilities.Contrast;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    public static ColorStateList createFromXml(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
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

    public static ColorStateList createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

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

    public static ColorStateList inflate(Resources resources, @XmlRes int i9, Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i9), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    private static boolean isColorInt(Resources resources, @ColorRes int i9) throws Resources.NotFoundException {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i9, typedValue, true);
        int i10 = typedValue.type;
        return i10 >= 28 && i10 <= 31;
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i9, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f11) {
        boolean z9 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z9) {
            return i9;
        }
        int iClamp = MathUtils.clamp((int) ((Color.alpha(i9) * f10) + 0.5f), 0, 255);
        if (z9) {
            CamColor camColorFromColor = CamColor.fromColor(i9);
            i9 = CamColor.toColor(camColorFromColor.getHue(), camColorFromColor.getChroma(), f11);
        }
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (iClamp << 24);
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static ColorStateList inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f10;
        Resources resources2 = resources;
        int i9 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i10 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i9 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = obtainAttributes(resources2, theme, attributeSet, C3266R.styleable.ColorStateListItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(C3266R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !isColorInt(resources2, resourceId)) {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayObtainAttributes.getColor(C3266R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(C3266R.styleable.ColorStateListItem_android_color, -65281);
                }
                float f11 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(C3266R.styleable.ColorStateListItem_android_alpha)) {
                    f11 = typedArrayObtainAttributes.getFloat(C3266R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(C3266R.styleable.ColorStateListItem_alpha)) {
                    f11 = typedArrayObtainAttributes.getFloat(C3266R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                if (Build.VERSION.SDK_INT >= 31 && typedArrayObtainAttributes.hasValue(C3266R.styleable.ColorStateListItem_android_lStar)) {
                    f10 = typedArrayObtainAttributes.getFloat(C3266R.styleable.ColorStateListItem_android_lStar, -1.0f);
                } else {
                    f10 = typedArrayObtainAttributes.getFloat(C3266R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C3266R.attr.alpha && attributeNameResource != C3266R.attr.lStar) {
                        int i13 = i11 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i11);
                iArrAppend = GrowingArrayUtils.append(iArrAppend, i10, modulateColorAlpha(color, f11, f10));
                iArr = (int[][]) GrowingArrayUtils.append(iArr, i10, iArrTrimStateSet);
                i10++;
            }
            i9 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i10];
        int[][] iArr4 = new int[i10][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i10);
        System.arraycopy(iArr, 0, iArr4, 0, i10);
        return new ColorStateList(iArr4, iArr3);
    }
}
