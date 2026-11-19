package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import org.xmlpull.v1.XmlPullParser;
import p148s.C3369g;
import p152t.C3387f;

/* loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private Path f4346a;

    /* renamed from: b */
    private final Path f4347b;

    /* renamed from: c */
    private final Matrix f4348c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f4347b = path;
        this.f4348c = new Matrix();
        path.lineTo(1.0f, IGoodView.DEFAULT_TO_ALPHA);
        this.f4346a = path;
    }

    /* renamed from: a */
    private static float m3811a(float f4, float f5) {
        return (float) Math.sqrt((f4 * f4) + (f5 * f5));
    }

    /* renamed from: b */
    public void m3812b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        pathMeasure.getPosTan(IGoodView.DEFAULT_TO_ALPHA, fArr, null);
        float f6 = fArr[0];
        float f7 = fArr[1];
        if (f6 == f4 && f7 == f5) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f4348c.setTranslate(-f6, -f7);
        float f8 = f4 - f6;
        float f9 = f5 - f7;
        float fM3811a = 1.0f / m3811a(f8, f9);
        this.f4348c.postScale(fM3811a, fM3811a);
        this.f4348c.postRotate((float) Math.toDegrees(-Math.atan2(f9, f8)));
        path.transform(this.f4348c, this.f4347b);
        this.f4346a = path;
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float fM3811a = m3811a(f8, f9);
        double dAtan2 = Math.atan2(f9, f8);
        this.f4348c.setScale(fM3811a, fM3811a);
        this.f4348c.postRotate((float) Math.toDegrees(dAtan2));
        this.f4348c.postTranslate(f4, f5);
        Path path = new Path();
        this.f4347b.transform(this.f4348c, path);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f4347b = new Path();
        this.f4348c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4468k);
        try {
            String strM10253i = C3369g.m10253i(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM10253i != null) {
                m3812b(C3387f.m10313e(strM10253i));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
