package androidx.compose.p012ui.graphics.drawscope;

import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.geometry.SizeKt;
import androidx.compose.p012ui.graphics.Canvas;
import androidx.compose.p012ui.graphics.InlineClassHelperKt;
import androidx.compose.p012ui.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m13413d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo21883clipPathmtrdDE(Path path, int clipOp) {
                drawContext.getCanvas().mo21262clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo21884clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo21263clipRectN_I0leg(left, top2, right, bottom, clipOp);
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo21885getCenterF1C5BW0() {
                return SizeKt.m21247getCenteruvyYCjk(mo21886getSizeNHjbRc());
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo21886getSizeNHjbRc() {
                return drawContext.mo21881getSizeNHjbRc();
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top2, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo21886getSizeNHjbRc() >> 32)) - (right + left);
                long jM21228constructorimpl = Size.m21228constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo21886getSizeNHjbRc() & 4294967295L)) - (bottom + top2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (jM21228constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM21228constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo21882setSizeuvyYCjk(jM21228constructorimpl);
                canvas.translate(left, top2);
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo21887rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i9 = (int) (pivot >> 32);
                int i10 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                canvas.rotate(degrees);
                canvas.translate(-Float.intBitsToFloat(i9), -Float.intBitsToFloat(i10));
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo21888scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i9 = (int) (pivot >> 32);
                int i10 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Float.intBitsToFloat(i9), -Float.intBitsToFloat(i10));
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo21889transform58bKbWc(float[] matrix) {
                drawContext.getCanvas().mo21264concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p012ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top2) {
                drawContext.getCanvas().translate(left, top2);
            }
        };
    }
}
