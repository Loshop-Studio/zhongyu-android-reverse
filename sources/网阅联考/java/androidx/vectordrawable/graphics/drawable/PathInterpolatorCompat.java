package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
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
    private float[] f442mX;

    /* renamed from: mY */
    private float[] f443mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i4 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(MAX_NUM_POINTS, ((int) (length / PRECISION)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f442mX = new float[iMin];
        this.f443mY = new float[iMin];
        float[] fArr = new float[2];
        for (int i5 = 0; i5 < iMin; i5++) {
            pathMeasure.getPosTan((i5 * length) / (iMin - 1), fArr, null);
            this.f442mX[i5] = fArr[0];
            this.f443mY[i5] = fArr[1];
        }
        if (Math.abs(this.f442mX[0]) <= 1.0E-5d && Math.abs(this.f443mY[0]) <= 1.0E-5d) {
            int i6 = iMin - 1;
            if (Math.abs(this.f442mX[i6] - 1.0f) <= 1.0E-5d && Math.abs(this.f443mY[i6] - 1.0f) <= 1.0E-5d) {
                float f4 = 0.0f;
                int i7 = 0;
                while (i4 < iMin) {
                    float[] fArr2 = this.f442mX;
                    int i8 = i7 + 1;
                    float f5 = fArr2[i7];
                    if (f5 < f4) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f5);
                    }
                    fArr2[i4] = f5;
                    i4++;
                    f4 = f5;
                    i7 = i8;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f442mX[0]);
        sb.append(",");
        sb.append(this.f443mY[0]);
        sb.append(" end:");
        int i9 = iMin - 1;
        sb.append(this.f442mX[i9]);
        sb.append(",");
        sb.append(this.f443mY[i9]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void initQuad(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path pathCreatePathFromPathData = PathParser.createPathFromPathData(namedString);
            if (pathCreatePathFromPathData != null) {
                initPath(pathCreatePathFromPathData);
                return;
            }
            throw new InflateException("The path is null, which is created from " + namedString);
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
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f442mX.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f442mX[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f442mX;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f443mY[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f443mY;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(typedArrayObtainAttributes, xmlPullParser);
        typedArrayObtainAttributes.recycle();
    }
}
