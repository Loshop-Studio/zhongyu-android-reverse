package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Vertices;
import java.util.List;

/* loaded from: classes2.dex */
public final class EmptyCanvas implements Canvas {
    public static final EmptyCanvas INSTANCE = new EmptyCanvas();

    private EmptyCanvas() {
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo24129clipPathmtrdDE(Path path, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo24130clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo24131concat58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo24132drawCircle9KIMszo(long j10, float f10, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo24133drawImaged4ec7I(ImageBitmap imageBitmap, long j10, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo24134drawImageRectHPBpro0(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo24135drawLineWko1d7g(long j10, long j11, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo24136drawPointsO7TthRY(int i10, List<Offset> list, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo24137drawRawPointsO7TthRY(int i10, float[] fArr, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo24138drawVerticesTPEHhCM(Vertices vertices, int i10, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void rotate(float f10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void saveLayer(Rect rect, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void scale(float f10, float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void skew(float f10, float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    public void translate(float f10, float f11) {
        throw new UnsupportedOperationException();
    }
}
