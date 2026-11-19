package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.InlineClassHelperKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m5110d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo11156clipPathmtrdDE(Path path, int clipOp) {
                drawContext.getCanvas().mo10535clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo11157clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo10536clipRectN_I0leg(left, top2, right, bottom, clipOp);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo11158getCenterF1C5BW0() {
                return SizeKt.m10520getCenteruvyYCjk(mo11159getSizeNHjbRc());
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo11159getSizeNHjbRc() {
                return drawContext.mo11154getSizeNHjbRc();
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top2, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo11159getSizeNHjbRc() >> 32)) - (right + left);
                long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo11159getSizeNHjbRc() & 4294967295L)) - (bottom + top2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (jM10501constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM10501constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo11155setSizeuvyYCjk(jM10501constructorimpl);
                canvas.translate(left, top2);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo11160rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (pivot >> 32);
                int i8 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i8));
                canvas.rotate(degrees);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i8));
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo11161scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (pivot >> 32);
                int i8 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i8));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i8));
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo11162transform58bKbWc(float[] matrix) {
                drawContext.getCanvas().mo10537concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top2) {
                drawContext.getCanvas().translate(left, top2);
            }
        };
    }
}
