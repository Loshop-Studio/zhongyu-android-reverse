package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p013ui.graphics.VertexMode;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, m13558d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m20882toAndroidVertexModeJOOmi9M(int i10) {
        VertexMode.Companion companion = VertexMode.INSTANCE;
        return VertexMode.m21371equalsimpl0(i10, companion.m21377getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m21371equalsimpl0(i10, companion.m21376getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m21371equalsimpl0(i10, companion.m21375getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
