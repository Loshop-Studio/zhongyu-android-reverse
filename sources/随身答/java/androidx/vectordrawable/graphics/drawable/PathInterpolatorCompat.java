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
/* loaded from: classes3.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private float[] f2056mX;

    /* renamed from: mY */
    private float[] f2057mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i9 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f2056mX = new float[iMin];
        this.f2057mY = new float[iMin];
        float[] fArr = new float[2];
        for (int i10 = 0; i10 < iMin; i10++) {
            pathMeasure.getPosTan((i10 * length) / (iMin - 1), fArr, null);
            this.f2056mX[i10] = fArr[0];
            this.f2057mY[i10] = fArr[1];
        }
        if (Math.abs(this.f2056mX[0]) <= 1.0E-5d && Math.abs(this.f2057mY[0]) <= 1.0E-5d) {
            int i11 = iMin - 1;
            if (Math.abs(this.f2056mX[i11] - 1.0f) <= 1.0E-5d && Math.abs(this.f2057mY[i11] - 1.0f) <= 1.0E-5d) {
                float f10 = 0.0f;
                int i12 = 0;
                while (i9 < iMin) {
                    float[] fArr2 = this.f2056mX;
                    int i13 = i12 + 1;
                    float f11 = fArr2[i12];
                    if (f11 < f10) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                    }
                    fArr2[i9] = f11;
                    i9++;
                    f10 = f11;
                    i12 = i13;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f2056mX[0]);
        sb.append(",");
        sb.append(this.f2057mY[0]);
        sb.append(" end:");
        int i14 = iMin - 1;
        sb.append(this.f2056mX[i14]);
        sb.append(",");
        sb.append(this.f2057mY[i14]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void initQuad(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
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
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f2056mX.length - 1;
        int i9 = 0;
        while (length - i9 > 1) {
            int i10 = (i9 + length) / 2;
            if (f10 < this.f2056mX[i10]) {
                length = i10;
            } else {
                i9 = i10;
            }
        }
        float[] fArr = this.f2056mX;
        float f11 = fArr[length];
        float f12 = fArr[i9];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f2057mY[i9];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f2057mY;
        float f15 = fArr2[i9];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(typedArrayObtainAttributes, xmlPullParser);
        typedArrayObtainAttributes.recycle();
    }
}
