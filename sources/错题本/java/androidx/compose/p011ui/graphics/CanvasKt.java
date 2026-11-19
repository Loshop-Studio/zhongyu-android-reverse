package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0015\u001a3\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "Canvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function0;", "Ld6/s;", "block", "withSave", "(Landroidx/compose/ui/graphics/Canvas;Lr6/a;)V", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "withSaveLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;Lr6/a;)V", "", "degrees", "pivotX", "pivotY", "rotate", "(Landroidx/compose/ui/graphics/Canvas;FFF)V", "radians", "rotateRad", "sx", "sy", "scale", "(Landroidx/compose/ui/graphics/Canvas;FFFF)V", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CanvasKt {
    @NotNull
    public static final Canvas Canvas(@NotNull ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(@NotNull Canvas canvas, float f, float f7, float f8) {
        if (f == 0.0f) {
            return;
        }
        canvas.translate(f7, f8);
        canvas.rotate(f);
        canvas.translate(-f7, -f8);
    }

    public static final void rotateRad(@NotNull Canvas canvas, float f, float f7, float f8) {
        rotate(canvas, DegreesKt.degrees(f), f7, f8);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f, float f7, float f8, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i & 4) != 0) {
            f8 = 0.0f;
        }
        rotateRad(canvas, f, f7, f8);
    }

    public static final void scale(@NotNull Canvas canvas, float f, float f7, float f8, float f9) {
        if (f == 1.0f && f7 == 1.0f) {
            return;
        }
        canvas.translate(f8, f9);
        canvas.scale(f, f7);
        canvas.translate(-f8, -f9);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = f;
        }
        scale(canvas, f, f7, f8, f9);
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull InterfaceC6469a interfaceC6469a) {
        try {
            canvas.save();
            interfaceC6469a.invoke();
        } finally {
            canvas.restore();
        }
    }

    public static final void withSaveLayer(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint, @NotNull InterfaceC6469a interfaceC6469a) {
        try {
            canvas.saveLayer(rect, paint);
            interfaceC6469a.invoke();
        } finally {
            canvas.restore();
        }
    }
}
