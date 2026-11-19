package p000a.p064r.p065a.p066a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p035d.C0204c;

/* renamed from: a.r.a.a.c */
/* loaded from: classes.dex */
public class C0438c {

    /* renamed from: a.r.a.a.c$a */
    public static class a implements TypeEvaluator<C0204c[]> {

        /* renamed from: a */
        public C0204c[] f2500a;

        @Override // android.animation.TypeEvaluator
        public C0204c[] evaluate(float f2, C0204c[] c0204cArr, C0204c[] c0204cArr2) {
            C0204c[] c0204cArr3 = c0204cArr;
            C0204c[] c0204cArr4 = c0204cArr2;
            if (!C0190e.m709d(c0204cArr3, c0204cArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C0190e.m709d(this.f2500a, c0204cArr3)) {
                this.f2500a = C0190e.m722q(c0204cArr3);
            }
            for (int i = 0; i < c0204cArr3.length; i++) {
                C0204c c0204c = this.f2500a[i];
                C0204c c0204c2 = c0204cArr3[i];
                C0204c c0204c3 = c0204cArr4[i];
                Objects.requireNonNull(c0204c);
                c0204c.f1458a = c0204c2.f1458a;
                int i2 = 0;
                while (true) {
                    float[] fArr = c0204c2.f1459b;
                    if (i2 < fArr.length) {
                        c0204c.f1459b[i2] = (c0204c3.f1459b[i2] * f2) + ((1.0f - f2) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f2500a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x034a, code lost:
    
        if (r26 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034c, code lost:
    
        if (r13 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034e, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035c, code lost:
    
        if (r2.hasNext() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x035e, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x036a, code lost:
    
        if (r27 != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x036c, code lost:
    
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0370, code lost:
    
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0373, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0263 A[PHI: r14
      0x0263: PHI (r14v11 float) = (r14v10 float), (r14v12 float) binds: [B:135:0x025a, B:138:0x0261] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m1487a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p064r.p065a.p066a.C0438c.m1487a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m1488b(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    /* renamed from: c */
    public static PropertyValuesHolder m1489c(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfInt;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m1490d(i4)) || (z2 && m1490d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C0439d c0439d = i == 3 ? C0439d.f2501a : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else {
                if (!z) {
                    if (z2) {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1490d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                    }
                    if (propertyValuesHolder == null && c0439d != null) {
                        propertyValuesHolder.setEvaluator(c0439d);
                        return propertyValuesHolder;
                    }
                }
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m1490d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1490d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = propertyValuesHolderOfInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0204c[] c0204cArrM720o = C0190e.m720o(string);
        C0204c[] c0204cArrM720o2 = C0190e.m720o(string2);
        if (c0204cArrM720o == null && c0204cArrM720o2 == null) {
            return null;
        }
        if (c0204cArrM720o == null) {
            if (c0204cArrM720o2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), c0204cArrM720o2);
            }
            return null;
        }
        a aVar = new a();
        if (c0204cArrM720o2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, c0204cArrM720o);
        } else {
            if (!C0190e.m709d(c0204cArrM720o, c0204cArrM720o2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, c0204cArrM720o, c0204cArrM720o2);
        }
        return propertyValuesHolderOfObject;
    }

    /* renamed from: d */
    public static boolean m1490d(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m1491e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray typedArrayM693F = C0190e.m693F(resources, theme, attributeSet, C0436a.f2483g);
        TypedArray typedArrayM693F2 = C0190e.m693F(resources, theme, attributeSet, C0436a.f2487k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j = C0190e.m730y(xmlPullParser, "duration") ? typedArrayM693F.getInt(1, 300) : 300;
        int resourceId = 0;
        long j2 = !C0190e.m730y(xmlPullParser, "startOffset") ? 0 : typedArrayM693F.getInt(2, 0);
        int i = !C0190e.m730y(xmlPullParser, "valueType") ? 4 : typedArrayM693F.getInt(7, 4);
        if (C0190e.m730y(xmlPullParser, "valueFrom") && C0190e.m730y(xmlPullParser, "valueTo")) {
            if (i == 4) {
                TypedValue typedValuePeekValue = typedArrayM693F.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i2 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM693F.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i = ((z && m1490d(i2)) || (z2 && m1490d(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM1489c = m1489c(typedArrayM693F, i, 5, 6, BuildConfig.FLAVOR);
            if (propertyValuesHolderM1489c != null) {
                valueAnimator4.setValues(propertyValuesHolderM1489c);
            }
        }
        valueAnimator4.setDuration(j);
        valueAnimator4.setStartDelay(j2);
        valueAnimator4.setRepeatCount(!C0190e.m730y(xmlPullParser, "repeatCount") ? 0 : typedArrayM693F.getInt(3, 0));
        valueAnimator4.setRepeatMode(!C0190e.m730y(xmlPullParser, "repeatMode") ? 1 : typedArrayM693F.getInt(4, 1));
        if (typedArrayM693F2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String strM724s = C0190e.m724s(typedArrayM693F2, xmlPullParser, "pathData", 1);
            if (strM724s != null) {
                String strM724s2 = C0190e.m724s(typedArrayM693F2, xmlPullParser, "propertyXName", 2);
                String strM724s3 = C0190e.m724s(typedArrayM693F2, xmlPullParser, "propertyYName", 3);
                if (strM724s2 == null && strM724s3 == null) {
                    throw new InflateException(typedArrayM693F2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM721p = C0190e.m721p(strM724s);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(pathM721p, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathM721p, false);
                int iMin = Math.min(100, ((int) (length / f3)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f4 = length / (iMin - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayM693F;
                int i3 = 0;
                float f5 = 0.0f;
                while (true) {
                    if (resourceId >= iMin) {
                        break;
                    }
                    int i4 = iMin;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[resourceId] = fArr3[0];
                    fArr2[resourceId] = fArr3[1];
                    f5 += f4;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f5 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    resourceId++;
                    iMin = i4;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM724s2 != null ? PropertyValuesHolder.ofFloat(strM724s2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM724s3 != null ? PropertyValuesHolder.ofFloat(strM724s3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayM693F;
                objectAnimator.setPropertyName(C0190e.m724s(typedArrayM693F2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = typedArrayM693F;
        }
        if (C0190e.m730y(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (typedArrayM693F2 != null) {
            typedArrayM693F2.recycle();
        }
        return valueAnimator3;
    }
}
