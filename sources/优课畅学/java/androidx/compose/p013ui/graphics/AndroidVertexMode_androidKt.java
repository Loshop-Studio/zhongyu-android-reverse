package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p013ui.graphics.VertexMode;

/* loaded from: classes2.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m24182toAndroidVertexModeJOOmi9M(int i10) {
        VertexMode.Companion companion = VertexMode.Companion;
        return VertexMode.m24671equalsimpl0(i10, companion.m24677getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m24671equalsimpl0(i10, companion.m24676getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m24671equalsimpl0(i10, companion.m24675getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
