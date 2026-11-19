package androidx.compose.p009ui.graphics.drawscope;

import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.geometry.SizeKt;
import androidx.compose.p009ui.graphics.Canvas;
import androidx.compose.p009ui.graphics.InlineClassHelperKt;
import androidx.compose.p009ui.graphics.Path;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m7880d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo14373clipPathmtrdDE(Path path, int clipOp) {
                drawContext.getCanvas().mo13752clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo14374clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo13753clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo14375getCenterF1C5BW0() {
                return SizeKt.m13737getCenteruvyYCjk(mo14376getSizeNHjbRc());
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo14376getSizeNHjbRc() {
                return drawContext.mo14371getSizeNHjbRc();
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo14376getSizeNHjbRc() >> 32)) - (right + left);
                long jM13718constructorimpl = Size.m13718constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo14376getSizeNHjbRc() & 4294967295L)) - (bottom + top)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (jM13718constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM13718constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo14372setSizeuvyYCjk(jM13718constructorimpl);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo14377rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i6 = (int) (pivot >> 32);
                int i7 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                canvas.rotate(degrees);
                canvas.translate(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i7));
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo14378scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i6 = (int) (pivot >> 32);
                int i7 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i7));
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo14379transform58bKbWc(float[] matrix) {
                drawContext.getCanvas().mo13754concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p009ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }
        };
    }
}
