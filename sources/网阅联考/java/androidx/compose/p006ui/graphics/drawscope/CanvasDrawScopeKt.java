package androidx.compose.p006ui.graphics.drawscope;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DensityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m5175d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo9622clipPathmtrdDE(Path path, int clipOp) {
                Intrinsics.checkNotNullParameter(path, "path");
                drawContext.getCanvas().mo9039clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo9623clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo9040clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo9624getCenterF1C5BW0() {
                return SizeKt.m9024getCenteruvyYCjk(mo9625getSizeNHjbRc());
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo9625getSizeNHjbRc() {
                return drawContext.mo9620getSizeNHjbRc();
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                long jSize = SizeKt.Size(Size.m9014getWidthimpl(mo9625getSizeNHjbRc()) - (right + left), Size.m9011getHeightimpl(mo9625getSizeNHjbRc()) - (bottom + top));
                if (!(Size.m9014getWidthimpl(jSize) >= 0.0f && Size.m9011getHeightimpl(jSize) >= 0.0f)) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo9621setSizeuvyYCjk(jSize);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo9626rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m8945getXimpl(pivot), Offset.m8946getYimpl(pivot));
                canvas.rotate(degrees);
                canvas.translate(-Offset.m8945getXimpl(pivot), -Offset.m8946getYimpl(pivot));
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo9627scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m8945getXimpl(pivot), Offset.m8946getYimpl(pivot));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Offset.m8945getXimpl(pivot), -Offset.m8946getYimpl(pivot));
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo9628transform58bKbWc(float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                drawContext.getCanvas().mo9042concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p006ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }
        };
    }
}
