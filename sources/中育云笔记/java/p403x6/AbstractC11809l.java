package p403x6;

import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;

/* renamed from: x6.l */
/* loaded from: classes5.dex */
public abstract class AbstractC11809l {

    /* renamed from: x6.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28039a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f28039a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m26126a(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: b */
    public static int m26127b(int i10) {
        return (i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static boolean m26128c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: d */
    public static boolean m26129d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (a.f28039a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
