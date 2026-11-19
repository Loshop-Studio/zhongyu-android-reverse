package androidx.compose.p014ui.spatial;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;

    public /* synthetic */ RelativeLayoutBounds(long j10, long j11, long j12, long j13, float[] fArr, DelegatableNode delegatableNode, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, fArr, delegatableNode);
    }

    public final List<IntRect> calculateOcclusions() {
        int i10;
        int i11;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int iIndexOf = rects.indexOf(semanticsId);
        if (iIndexOf < 0) {
            return AbstractC10978w.m24136n();
        }
        List listM24124c = AbstractC10976v.m24124c();
        long[] jArr = rects.items;
        int i12 = rects.itemsSize;
        long j10 = jArr[iIndexOf];
        long j11 = jArr[iIndexOf + 1];
        int i13 = 0;
        while (i13 < jArr.length - 2 && i13 < i12) {
            if (i13 == iIndexOf) {
                i13 += 3;
            } else {
                long j12 = jArr[i13];
                long j13 = jArr[i13 + 1];
                if (((((j11 - j12) - InlineClassHelperKt.Uint64Low32) | ((j13 - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i10 = i12;
                    i11 = iIndexOf;
                    int i14 = (int) (j12 >> 32);
                    int i15 = (int) j12;
                    int i16 = (int) (j13 >> 32);
                    int i17 = (int) j13;
                    if (rectManager.isTargetDrawnFirst$ui_release(semanticsId, ((int) jArr[i13 + 2]) & RectListKt.Lower26Bits)) {
                        listM24124c.add(new IntRect(i14, i15, i16, i17));
                    }
                } else {
                    i10 = i12;
                    i11 = iIndexOf;
                }
                i13 += 3;
                iIndexOf = i11;
                i12 = i10;
            }
        }
        return AbstractC10976v.m24122a(listM24124c);
    }

    public final IntRect getBoundsInRoot() {
        long j10 = this.topLeft;
        long j11 = this.bottomRight;
        return new IntRect((int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix != null) {
            IntRect boundsInWindow = getBoundsInWindow();
            long j10 = this.windowOffset;
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m33629getXimpl(j10), boundsInWindow.getTop() + IntOffset.m33630getYimpl(j10), boundsInWindow.getRight() + IntOffset.m33629getXimpl(j10), boundsInWindow.getBottom() + IntOffset.m33630getYimpl(j10));
        }
        long j11 = this.topLeft;
        int i10 = (int) (j11 >> 32);
        long j12 = this.bottomRight;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) j12;
        int iM33629getXimpl = IntOffset.m33629getXimpl(this.screenOffset);
        int iM33630getYimpl = IntOffset.m33630getYimpl(this.screenOffset);
        return new IntRect(i10 + iM33629getXimpl, ((int) j11) + iM33630getYimpl, i11 + iM33629getXimpl, i12 + iM33630getYimpl);
    }

    public final IntRect getBoundsInWindow() {
        long j10 = this.topLeft;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) j10;
        long j11 = this.bottomRight;
        int i12 = (int) (j11 >> 32);
        int i13 = (int) j11;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m31115mapimpl(fArr, new Rect(i10, i11, i12, i13)));
        }
        int iM33629getXimpl = IntOffset.m33629getXimpl(this.screenOffset) - IntOffset.m33629getXimpl(this.windowOffset);
        int iM33630getYimpl = IntOffset.m33630getYimpl(this.screenOffset) - IntOffset.m33630getYimpl(this.windowOffset);
        return new IntRect(i10 + iM33629getXimpl, i11 + iM33630getYimpl, i12 + iM33629getXimpl, i13 + iM33630getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m32760getPositionInRootnOccac() {
        return IntOffset.m33623constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m32761getPositionInScreennOccac() {
        int iM33629getXimpl = IntOffset.m33629getXimpl(this.screenOffset);
        int iM33630getYimpl = IntOffset.m33630getYimpl(this.screenOffset);
        long j10 = this.topLeft;
        return IntOffset.m33623constructorimpl(((((int) (j10 >> 32)) + iM33629getXimpl) << 32) | ((((int) j10) + iM33630getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m32762getPositionInWindownOccac() {
        int iM33629getXimpl = IntOffset.m33629getXimpl(this.screenOffset) - IntOffset.m33629getXimpl(this.windowOffset);
        int iM33630getYimpl = IntOffset.m33630getYimpl(this.screenOffset) - IntOffset.m33630getYimpl(this.windowOffset);
        long j10 = this.topLeft;
        return IntOffset.m33623constructorimpl(((((int) (j10 >> 32)) + iM33629getXimpl) << 32) | ((((int) j10) + iM33630getYimpl) & 4294967295L));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    private RelativeLayoutBounds(long j10, long j11, long j12, long j13, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j10;
        this.bottomRight = j11;
        this.windowOffset = j12;
        this.screenOffset = j13;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }
}
