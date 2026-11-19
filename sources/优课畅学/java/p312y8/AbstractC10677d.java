package p312y8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;

/* renamed from: y8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC10677d {

    /* renamed from: a */
    public static Paint f21184a = null;

    /* renamed from: b */
    public static Paint f21185b = null;

    /* renamed from: c */
    public static RectF f21186c = null;

    /* renamed from: d */
    public static boolean f21187d = true;

    /* renamed from: e */
    public static boolean f21188e = true;

    static {
        Paint paint = new Paint();
        f21184a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f21184a.setColor(0);
        f21186c = new RectF();
    }

    /* renamed from: a */
    public static void m19951a(Canvas canvas) {
        if (!f21187d) {
            f21186c.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            m19953c(canvas, f21186c);
        } else if (f21188e) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } else {
            canvas.drawColor(0);
        }
    }

    /* renamed from: b */
    public static void m19952b(Canvas canvas, float f10, float f11, float f12, float f13) {
        f21186c.set(f10, f11, f12, f13);
        m19953c(canvas, f21186c);
    }

    /* renamed from: c */
    public static void m19953c(Canvas canvas, RectF rectF) {
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        canvas.drawRect(rectF, f21184a);
    }

    /* renamed from: d */
    public static void m19954d(Canvas canvas, String str) {
        if (f21185b == null) {
            Paint paint = new Paint();
            f21185b = paint;
            paint.setColor(SupportMenu.CATEGORY_MASK);
            f21185b.setTextSize(30.0f);
        }
        int height = canvas.getHeight();
        m19952b(canvas, 10.0f, height - 100, (int) (f21185b.measureText(str) + 20.0f), canvas.getHeight());
        canvas.drawText(str, 10.0f, height - 50, f21185b);
    }

    /* renamed from: e */
    public static void m19955e(boolean z10, boolean z11) {
        f21187d = z10;
        f21188e = z11;
    }
}
