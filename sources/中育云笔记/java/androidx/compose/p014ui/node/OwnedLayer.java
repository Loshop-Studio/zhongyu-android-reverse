package androidx.compose.p014ui.node;

import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo32561getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo32562inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo32563isInLayerk4lQ0M(long j10);

    void mapBounds(MutableRect mutableRect, boolean z10);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo32564mapOffset8S9VItk(long j10, boolean z10);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo32565movegyyYBs(long j10);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo32566resizeozmzZPI(long j10);

    void reuseLayer(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo32567transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
