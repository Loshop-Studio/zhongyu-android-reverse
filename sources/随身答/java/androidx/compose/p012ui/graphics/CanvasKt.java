package androidx.compose.p012ui.graphics;

import androidx.compose.p012ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

@Metadata(m13412d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a&\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a,\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b\u001a+\u0010\u0012\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b¨\u0006\u0017"}, m13413d2 = {"Canvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "rotate", "", "degrees", "", "pivotX", "pivotY", "rotateRad", "radians", "scale", "sx", "sy", "withSave", "block", "Lkotlin/Function0;", "withSaveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "paint", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f10, float f11, float f12, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i9 & 4) != 0) {
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

    public static /* synthetic */ void scale$default(Canvas canvas, float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            f11 = f10;
        }
        scale(canvas, f10, f11, f12, f13);
    }

    public static final void withSave(Canvas canvas, Function0<Unit> function0) {
        try {
            canvas.save();
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, Function0<Unit> function0) {
        try {
            canvas.saveLayer(rect, paint);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        }
    }
}
