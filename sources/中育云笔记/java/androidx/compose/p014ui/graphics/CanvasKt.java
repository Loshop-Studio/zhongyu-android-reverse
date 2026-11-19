package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Rect;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(Canvas canvas, float f10, float f11, float f12) {
        if (f10 == 0.0f) {
            return;
        }
        canvas.translate(f11, f12);
        canvas.rotate(f10);
        canvas.translate(-f11, -f12);
    }

    public static final void rotateRad(Canvas canvas, float f10, float f11, float f12) {
        rotate(canvas, DegreesKt.degrees(f10), f11, f12);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        rotateRad(canvas, f10, f11, f12);
    }

    public static final void scale(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f10 == 1.0f && f11 == 1.0f) {
            return;
        }
        canvas.translate(f12, f13);
        canvas.scale(f10, f11);
        canvas.translate(-f12, -f13);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        scale(canvas, f10, f11, f12, f13);
    }

    public static final void withSave(Canvas canvas, InterfaceC9529a interfaceC9529a) {
        try {
            canvas.save();
            interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            canvas.restore();
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, InterfaceC9529a interfaceC9529a) {
        try {
            canvas.saveLayer(rect, paint);
            interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            canvas.restore();
            AbstractC9977s.m20285a(1);
        }
    }
}
