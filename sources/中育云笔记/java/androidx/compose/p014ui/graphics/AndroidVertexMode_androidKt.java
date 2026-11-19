package androidx.compose.p014ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p014ui.graphics.VertexMode;

/* loaded from: classes2.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m30784toAndroidVertexModeJOOmi9M(int i10) {
        VertexMode.Companion companion = VertexMode.Companion;
        return VertexMode.m31273equalsimpl0(i10, companion.m31279getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m31273equalsimpl0(i10, companion.m31278getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m31273equalsimpl0(i10, companion.m31277getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
