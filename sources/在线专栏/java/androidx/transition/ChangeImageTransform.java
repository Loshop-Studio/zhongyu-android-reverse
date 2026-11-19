package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C0751w;
import java.util.Map;

/* loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: a */
    private static final String[] f4304a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: b */
    private static final TypeEvaluator<Matrix> f4305b = new C0682a();

    /* renamed from: c */
    private static final Property<ImageView, Matrix> f4306c = new C0683b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    static class C0682a implements TypeEvaluator<Matrix> {
        C0682a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    static class C0683b extends Property<ImageView, Matrix> {
        C0683b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            C0734k.m3900a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    static /* synthetic */ class C0684c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4307a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f4307a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4307a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: a */
    private static Matrix m3782a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f4 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f5 = intrinsicHeight;
        float fMax = Math.max(width / f4, height / f5);
        int iRound = Math.round((width - (f4 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f5 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    /* renamed from: b */
    private static Matrix m3783b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i4 = C0684c.f4307a[imageView.getScaleType().ordinal()];
            if (i4 == 1) {
                return m3786e(imageView);
            }
            if (i4 == 2) {
                return m3782a(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: c */
    private ObjectAnimator m3784c(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f4306c, (TypeEvaluator) new C0751w.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    private void captureValues(C0752x c0752x) {
        View view = c0752x.f4483b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = c0752x.f4482a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", m3783b(imageView));
        }
    }

    /* renamed from: d */
    private ObjectAnimator m3785d(ImageView imageView) {
        Property<ImageView, Matrix> property = f4306c;
        TypeEvaluator<Matrix> typeEvaluator = f4305b;
        Matrix matrix = C0736l.f4441a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    /* renamed from: e */
    private static Matrix m3786e(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        if (c0752x == null || c0752x2 == null) {
            return null;
        }
        Rect rect = (Rect) c0752x.f4482a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) c0752x2.f4482a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c0752x.f4482a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) c0752x2.f4482a.get("android:changeImageTransform:matrix");
        boolean z3 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z3) {
            return null;
        }
        ImageView imageView = (ImageView) c0752x2.f4483b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m3785d(imageView);
        }
        if (matrix == null) {
            matrix = C0736l.f4441a;
        }
        if (matrix2 == null) {
            matrix2 = C0736l.f4441a;
        }
        f4306c.set(imageView, matrix);
        return m3784c(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f4304a;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
