package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private float[] f1374mX;

    /* renamed from: mY */
    private float[] f1375mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f7, f8, f9, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(MAX_NUM_POINTS, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1374mX = new float[iMin];
        this.f1375mY = new float[iMin];
        float[] fArr = new float[2];
        for (int i8 = 0; i8 < iMin; i8++) {
            pathMeasure.getPosTan((i8 * length) / (iMin - 1), fArr, null);
            this.f1374mX[i8] = fArr[0];
            this.f1375mY[i8] = fArr[1];
        }
        if (Math.abs(this.f1374mX[0]) <= 1.0E-5d && Math.abs(this.f1375mY[0]) <= 1.0E-5d) {
            int i9 = iMin - 1;
            if (Math.abs(this.f1374mX[i9] - 1.0f) <= 1.0E-5d && Math.abs(this.f1375mY[i9] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i10 = 0;
                while (i < iMin) {
                    float[] fArr2 = this.f1374mX;
                    int i11 = i10 + 1;
                    float f7 = fArr2[i10];
                    if (f7 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f7);
                    }
                    fArr2[i] = f7;
                    i++;
                    f = f7;
                    i10 = i11;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1374mX[0]);
        sb.append(",");
        sb.append(this.f1375mY[0]);
        sb.append(" end:");
        int i12 = iMin - 1;
        sb.append(this.f1374mX[i12]);
        sb.append(",");
        sb.append(this.f1375mY[i12]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void initQuad(float f, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f7, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path pathCreatePathFromPathData = PathParser.createPathFromPathData(namedString);
            if (pathCreatePathFromPathData == null) {
                throw new InflateException(AbstractC0037f.m85j("The path is null, which is created from ", namedString));
            }
            initPath(pathCreatePathFromPathData);
            return;
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zHasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
        if (zHasAttribute != TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zHasAttribute) {
            initCubic(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            initQuad(namedFloat, namedFloat2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f1374mX.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i8 = (i + length) / 2;
            if (f < this.f1374mX[i8]) {
                length = i8;
            } else {
                i = i8;
            }
        }
        float[] fArr = this.f1374mX;
        float f7 = fArr[length];
        float f8 = fArr[i];
        float f9 = f7 - f8;
        if (f9 == 0.0f) {
            return this.f1375mY[i];
        }
        float f10 = (f - f8) / f9;
        float[] fArr2 = this.f1375mY;
        float f11 = fArr2[i];
        return AbstractC0037f.m77b(fArr2[length], f11, f10, f11);
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(typedArrayObtainAttributes, xmlPullParser);
        typedArrayObtainAttributes.recycle();
    }
}
