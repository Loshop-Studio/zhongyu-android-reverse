package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
    }

    private static float toTangent(float f6) {
        if (f6 < 0.0f || f6 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f6 / 2.0f));
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        Path path = new Path();
        path.moveTo(f6, f7);
        float f13 = f8 - f6;
        float f14 = f9 - f7;
        float f15 = (f13 * f13) + (f14 * f14);
        float f16 = (f6 + f8) / 2.0f;
        float f17 = (f7 + f9) / 2.0f;
        float f18 = 0.25f * f15;
        boolean z6 = f7 > f9;
        if (Math.abs(f13) < Math.abs(f14)) {
            float fAbs = Math.abs(f15 / (f14 * 2.0f));
            if (z6) {
                f11 = fAbs + f9;
                f10 = f8;
            } else {
                f11 = fAbs + f7;
                f10 = f6;
            }
            f12 = this.mMinimumVerticalTangent;
        } else {
            float f19 = f15 / (f13 * 2.0f);
            if (z6) {
                f11 = f7;
                f10 = f19 + f6;
            } else {
                f10 = f8 - f19;
                f11 = f9;
            }
            f12 = this.mMinimumHorizontalTangent;
        }
        float f20 = f18 * f12 * f12;
        float f21 = f16 - f10;
        float f22 = f17 - f11;
        float f23 = (f21 * f21) + (f22 * f22);
        float f24 = this.mMaximumTangent;
        float f25 = f18 * f24 * f24;
        if (f23 >= f20) {
            f20 = f23 > f25 ? f25 : 0.0f;
        }
        if (f20 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f20 / f23);
            f10 = ((f10 - f16) * fSqrt) + f16;
            f11 = f17 + (fSqrt * (f11 - f17));
        }
        path.cubicTo((f6 + f10) / 2.0f, (f7 + f11) / 2.0f, (f10 + f8) / 2.0f, (f11 + f9) / 2.0f, f8, f9);
        return path;
    }

    public void setMaximumAngle(float f6) {
        this.mMaximumAngle = f6;
        this.mMaximumTangent = toTangent(f6);
    }

    public void setMinimumHorizontalAngle(float f6) {
        this.mMinimumHorizontalAngle = f6;
        this.mMinimumHorizontalTangent = toTangent(f6);
    }

    public void setMinimumVerticalAngle(float f6) {
        this.mMinimumVerticalAngle = f6;
        this.mMinimumVerticalTangent = toTangent(f6);
    }

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, DEFAULT_MAX_ANGLE_DEGREES));
        typedArrayObtainStyledAttributes.recycle();
    }
}
