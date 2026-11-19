package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.taobao.accs.ErrorCode;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p148s.C3369g;
import p152t.C3387f;

/* renamed from: androidx.vectordrawable.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0759e {

    /* renamed from: androidx.vectordrawable.graphics.drawable.e$a */
    private static class a implements TypeEvaluator<C3387f.b[]> {

        /* renamed from: a */
        private C3387f.b[] f4523a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3387f.b[] evaluate(float f4, C3387f.b[] bVarArr, C3387f.b[] bVarArr2) {
            if (!C3387f.m10310b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C3387f.m10310b(this.f4523a, bVarArr)) {
                this.f4523a = C3387f.m10314f(bVarArr);
            }
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                this.f4523a[i4].m10323d(bVarArr[i4], bVarArr2[i4], f4);
            }
            return this.f4523a;
        }
    }

    /* renamed from: a */
    private static Animator m3933a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f4) throws XmlPullParserException, IOException {
        return m3934b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m3934b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C0759e.m3934b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m3935c(Keyframe keyframe, float f4) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f4) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f4) : Keyframe.ofObject(f4);
    }

    /* renamed from: d */
    private static void m3936d(Keyframe[] keyframeArr, float f4, int i4, int i5) {
        float f5 = f4 / ((i5 - i4) + 2);
        while (i4 <= i5) {
            keyframeArr[i4].setFraction(keyframeArr[i4 - 1].getFraction() + f5);
            i4++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m3937e(TypedArray typedArray, int i4, int i5, int i6, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i5);
        boolean z3 = typedValuePeekValue != null;
        int i7 = z3 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i6);
        boolean z4 = typedValuePeekValue2 != null;
        int i8 = z4 ? typedValuePeekValue2.type : 0;
        if (i4 == 4) {
            i4 = ((z3 && m3940h(i7)) || (z4 && m3940h(i8))) ? 3 : 0;
        }
        boolean z5 = i4 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i4 != 2) {
            C0760f c0760fM3953a = i4 == 3 ? C0760f.m3953a() : null;
            if (z5) {
                if (z3) {
                    float dimension = i7 == 5 ? typedArray.getDimension(i5, IGoodView.DEFAULT_TO_ALPHA) : typedArray.getFloat(i5, IGoodView.DEFAULT_TO_ALPHA);
                    if (z4) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i8 == 5 ? typedArray.getDimension(i6, IGoodView.DEFAULT_TO_ALPHA) : typedArray.getFloat(i6, IGoodView.DEFAULT_TO_ALPHA));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i8 == 5 ? typedArray.getDimension(i6, IGoodView.DEFAULT_TO_ALPHA) : typedArray.getFloat(i6, IGoodView.DEFAULT_TO_ALPHA));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z3) {
                int dimension2 = i7 == 5 ? (int) typedArray.getDimension(i5, IGoodView.DEFAULT_TO_ALPHA) : m3940h(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
                if (z4) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i8 == 5 ? (int) typedArray.getDimension(i6, IGoodView.DEFAULT_TO_ALPHA) : m3940h(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z4) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i8 == 5 ? (int) typedArray.getDimension(i6, IGoodView.DEFAULT_TO_ALPHA) : m3940h(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
            }
            if (propertyValuesHolderOfInt == null || c0760fM3953a == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(c0760fM3953a);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i5);
        String string2 = typedArray.getString(i6);
        C3387f.b[] bVarArrM10312d = C3387f.m10312d(string);
        C3387f.b[] bVarArrM10312d2 = C3387f.m10312d(string2);
        if (bVarArrM10312d == null && bVarArrM10312d2 == null) {
            return null;
        }
        if (bVarArrM10312d == null) {
            if (bVarArrM10312d2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrM10312d2);
            }
            return null;
        }
        a aVar = new a();
        if (bVarArrM10312d2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrM10312d);
        } else {
            if (!C3387f.m10310b(bVarArrM10312d, bVarArrM10312d2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrM10312d, bVarArrM10312d2);
        }
        return propertyValuesHolderOfObject;
    }

    /* renamed from: f */
    private static int m3938f(TypedArray typedArray, int i4, int i5) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue != null;
        int i6 = z3 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i5);
        boolean z4 = typedValuePeekValue2 != null;
        return ((z3 && m3940h(i6)) || (z4 && m3940h(z4 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m3939g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4507j);
        int i4 = 0;
        TypedValue typedValueM10256l = C3369g.m10256l(typedArrayM10255k, xmlPullParser, "value", 0);
        if ((typedValueM10256l != null) && m3940h(typedValueM10256l.type)) {
            i4 = 3;
        }
        typedArrayM10255k.recycle();
        return i4;
    }

    /* renamed from: h */
    private static boolean m3940h(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    /* renamed from: i */
    public static Animator m3941i(Context context, int i4) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i4) : m3942j(context, context.getResources(), context.getTheme(), i4);
    }

    /* renamed from: j */
    public static Animator m3942j(Context context, Resources resources, Resources.Theme theme, int i4) throws Resources.NotFoundException {
        return m3943k(context, resources, theme, i4, 1.0f);
    }

    /* renamed from: k */
    public static Animator m3943k(Context context, Resources resources, Resources.Theme theme, int i4, float f4) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i4);
                    return m3933a(context, resources, theme, animation, f4);
                } catch (XmlPullParserException e4) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                    notFoundException.initCause(e4);
                    throw notFoundException;
                }
            } catch (IOException e5) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException2.initCause(e5);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m3944l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4504g);
        TypedArray typedArrayM10255k2 = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4508k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m3949q(valueAnimator, typedArrayM10255k, typedArrayM10255k2, f4, xmlPullParser);
        int iM10252h = C3369g.m10252h(typedArrayM10255k, xmlPullParser, "interpolator", 0, 0);
        if (iM10252h > 0) {
            valueAnimator.setInterpolator(C0758d.m3932a(context, iM10252h));
        }
        typedArrayM10255k.recycle();
        if (typedArrayM10255k2 != null) {
            typedArrayM10255k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m3945m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i4, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4507j);
        float fM10250f = C3369g.m10250f(typedArrayM10255k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueM10256l = C3369g.m10256l(typedArrayM10255k, xmlPullParser, "value", 0);
        boolean z3 = typedValueM10256l != null;
        if (i4 == 4) {
            i4 = (z3 && m3940h(typedValueM10256l.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z3 ? i4 != 0 ? (i4 == 1 || i4 == 3) ? Keyframe.ofInt(fM10250f, C3369g.m10251g(typedArrayM10255k, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fM10250f, C3369g.m10250f(typedArrayM10255k, xmlPullParser, "value", 0, IGoodView.DEFAULT_TO_ALPHA)) : i4 == 0 ? Keyframe.ofFloat(fM10250f) : Keyframe.ofInt(fM10250f);
        int iM10252h = C3369g.m10252h(typedArrayM10255k, xmlPullParser, "interpolator", 1, 0);
        if (iM10252h > 0) {
            keyframeOfInt.setInterpolator(C0758d.m3932a(context, iM10252h));
        }
        typedArrayM10255k.recycle();
        return keyframeOfInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m3946n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m3944l(context, resources, theme, attributeSet, objectAnimator, f4, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m3947o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i4) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i4 == 4) {
                    i4 = m3939g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeM3945m = m3945m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser);
                if (keyframeM3945m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM3945m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < IGoodView.DEFAULT_TO_ALPHA) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m3935c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != IGoodView.DEFAULT_TO_ALPHA) {
                if (fraction2 < IGoodView.DEFAULT_TO_ALPHA) {
                    keyframe.setFraction(IGoodView.DEFAULT_TO_ALPHA);
                } else {
                    arrayList.add(0, m3935c(keyframe, IGoodView.DEFAULT_TO_ALPHA));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i5 = 0; i5 < size; i5++) {
                Keyframe keyframe3 = keyframeArr[i5];
                if (keyframe3.getFraction() < IGoodView.DEFAULT_TO_ALPHA) {
                    if (i5 == 0) {
                        keyframe3.setFraction(IGoodView.DEFAULT_TO_ALPHA);
                    } else {
                        int i6 = size - 1;
                        if (i5 == i6) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i7 = i5;
                            for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < IGoodView.DEFAULT_TO_ALPHA; i8++) {
                                i7 = i8;
                            }
                            m3936d(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i4 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(C0760f.m3953a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m3948p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i4;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4506i);
                    String strM10253i = C3369g.m10253i(typedArrayM10255k, xmlPullParser, "propertyName", 3);
                    int iM10251g = C3369g.m10251g(typedArrayM10255k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderM3947o = m3947o(context, resources, theme, xmlPullParser, strM10253i, iM10251g);
                    if (propertyValuesHolderM3947o == null) {
                        propertyValuesHolderM3947o = m3937e(typedArrayM10255k, iM10251g, 0, 1, strM10253i);
                    }
                    if (propertyValuesHolderM3947o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderM3947o);
                    }
                    typedArrayM10255k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i4 = 0; i4 < size; i4++) {
                propertyValuesHolderArr[i4] = (PropertyValuesHolder) arrayList.get(i4);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m3949q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f4, XmlPullParser xmlPullParser) {
        long jM10251g = C3369g.m10251g(typedArray, xmlPullParser, "duration", 1, ErrorCode.APP_NOT_BIND);
        long jM10251g2 = C3369g.m10251g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iM10251g = C3369g.m10251g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C3369g.m10254j(xmlPullParser, "valueFrom") && C3369g.m10254j(xmlPullParser, "valueTo")) {
            if (iM10251g == 4) {
                iM10251g = m3938f(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderM3937e = m3937e(typedArray, iM10251g, 5, 6, "");
            if (propertyValuesHolderM3937e != null) {
                valueAnimator.setValues(propertyValuesHolderM3937e);
            }
        }
        valueAnimator.setDuration(jM10251g);
        valueAnimator.setStartDelay(jM10251g2);
        valueAnimator.setRepeatCount(C3369g.m10251g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C3369g.m10251g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m3950r(valueAnimator, typedArray2, iM10251g, f4, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m3950r(ValueAnimator valueAnimator, TypedArray typedArray, int i4, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM10253i = C3369g.m10253i(typedArray, xmlPullParser, "pathData", 1);
        if (strM10253i == null) {
            objectAnimator.setPropertyName(C3369g.m10253i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM10253i2 = C3369g.m10253i(typedArray, xmlPullParser, "propertyXName", 2);
        String strM10253i3 = C3369g.m10253i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i4 != 2) {
        }
        if (strM10253i2 != null || strM10253i3 != null) {
            m3951s(C3387f.m10313e(strM10253i), objectAnimator, f4 * 0.5f, strM10253i2, strM10253i3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    private static void m3951s(Path path, ObjectAnimator objectAnimator, float f4, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f5 = IGoodView.DEFAULT_TO_ALPHA;
        arrayList.add(Float.valueOf(IGoodView.DEFAULT_TO_ALPHA));
        float length = IGoodView.DEFAULT_TO_ALPHA;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f4)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f6 = length / (iMin - 1);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
            fArr[i4] = fArr3[0];
            fArr2[i4] = fArr3[1];
            f5 += f6;
            int i6 = i5 + 1;
            if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                pathMeasure2.nextContour();
                i5 = i6;
            }
            i4++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
