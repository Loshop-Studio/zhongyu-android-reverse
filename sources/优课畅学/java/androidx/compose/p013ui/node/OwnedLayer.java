package androidx.compose.p013ui.node;

import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo25959getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo25960inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo25961isInLayerk4lQ0M(long j10);

    void mapBounds(MutableRect mutableRect, boolean z10);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo25962mapOffset8S9VItk(long j10, boolean z10);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo25963movegyyYBs(long j10);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo25964resizeozmzZPI(long j10);

    void reuseLayer(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo25965transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
