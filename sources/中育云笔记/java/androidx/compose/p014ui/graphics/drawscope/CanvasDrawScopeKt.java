package androidx.compose.p014ui.graphics.drawscope;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.InlineClassHelperKt;
import androidx.compose.p014ui.graphics.Path;

/* loaded from: classes2.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo31352clipPathmtrdDE(Path path, int i10) {
                drawContext.getCanvas().mo30731clipPathmtrdDE(path, i10);
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo31353clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10) {
                drawContext.getCanvas().mo30732clipRectN_I0leg(f10, f11, f12, f13, i10);
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo31354getCenterF1C5BW0() {
                return SizeKt.m30716getCenteruvyYCjk(mo31355getSizeNHjbRc());
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo31355getSizeNHjbRc() {
                return drawContext.mo31350getSizeNHjbRc();
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            public void inset(float f10, float f11, float f12, float f13) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo31355getSizeNHjbRc() >> 32)) - (f12 + f10);
                long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo31355getSizeNHjbRc() & 4294967295L)) - (f13 + f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (jM30697constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM30697constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo31351setSizeuvyYCjk(jM30697constructorimpl);
                canvas.translate(f10, f11);
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo31356rotateUv8p0NA(float f10, long j10) {
                Canvas canvas = drawContext.getCanvas();
                int i10 = (int) (j10 >> 32);
                int i11 = (int) (j10 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
                canvas.rotate(f10);
                canvas.translate(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo31357scale0AR0LA0(float f10, float f11, long j10) {
                Canvas canvas = drawContext.getCanvas();
                int i10 = (int) (j10 >> 32);
                int i11 = (int) (j10 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
                canvas.scale(f10, f11);
                canvas.translate(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo31358transform58bKbWc(float[] fArr) {
                drawContext.getCanvas().mo30733concat58bKbWc(fArr);
            }

            @Override // androidx.compose.p014ui.graphics.drawscope.DrawTransform
            public void translate(float f10, float f11) {
                drawContext.getCanvas().translate(f10, f11);
            }
        };
    }
}
