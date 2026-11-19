package androidx.compose.p013ui.spatial;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.IntRectKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010!R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m13558d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "boundsInRoot", "Landroidx/compose/ui/unit/IntRect;", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInScreen", "getBoundsInScreen", "boundsInWindow", "getBoundsInWindow", "height", "", "getHeight", "()I", "positionInRoot", "getPositionInRoot-nOcc-ac", "()J", "positionInScreen", "getPositionInScreen-nOcc-ac", "positionInWindow", "getPositionInWindow-nOcc-ac", "J", "[F", "width", "getWidth", "calculateOcclusions", "", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRelativeLayoutBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n1#1,179:1\n837#2:180\n839#2:181\n837#2:184\n839#2:185\n837#2:188\n837#2:189\n839#2:190\n839#2:191\n837#2:192\n839#2:193\n837#2:194\n839#2:195\n837#2:196\n839#2:197\n837#2:198\n839#2:199\n837#2:200\n839#2:201\n837#2:202\n839#2:203\n860#2,2:220\n837#2:224\n839#2:226\n837#2:228\n839#2:230\n810#2:232\n32#3:182\n32#3:186\n80#4:183\n80#4:187\n529#5,16:204\n545#5,2:222\n547#5:225\n548#5:227\n549#5:229\n550#5:231\n553#5,3:233\n*S KotlinDebug\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n*L\n55#1:180\n56#1:181\n65#1:184\n66#1:185\n73#1:188\n74#1:189\n81#1:190\n82#1:191\n91#1:192\n92#1:193\n93#1:194\n94#1:195\n101#1:196\n102#1:197\n103#1:198\n104#1:199\n131#1:200\n132#1:201\n133#1:202\n134#1:203\n171#1:220,2\n171#1:224\n171#1:226\n171#1:228\n171#1:230\n171#1:232\n57#1:182\n67#1:186\n57#1:183\n67#1:187\n171#1:204,16\n171#1:222,2\n171#1:225\n171#1:227\n171#1:229\n171#1:231\n171#1:233,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;

    public /* synthetic */ RelativeLayoutBounds(long j10, long j11, long j12, long j13, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
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
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
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
                        listCreateListBuilder.add(new IntRect(i14, i15, i16, i17));
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
        return CollectionsKt.build(listCreateListBuilder);
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
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m23689getXimpl(j10), boundsInWindow.getTop() + IntOffset.m23690getYimpl(j10), boundsInWindow.getRight() + IntOffset.m23689getXimpl(j10), boundsInWindow.getBottom() + IntOffset.m23690getYimpl(j10));
        }
        long j11 = this.topLeft;
        int i10 = (int) (j11 >> 32);
        long j12 = this.bottomRight;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) j12;
        int iM23689getXimpl = IntOffset.m23689getXimpl(this.screenOffset);
        int iM23690getYimpl = IntOffset.m23690getYimpl(this.screenOffset);
        return new IntRect(i10 + iM23689getXimpl, ((int) j11) + iM23690getYimpl, i11 + iM23689getXimpl, i12 + iM23690getYimpl);
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
            return IntRectKt.roundToIntRect(Matrix.m21213mapimpl(fArr, new Rect(i10, i11, i12, i13)));
        }
        int iM23689getXimpl = IntOffset.m23689getXimpl(this.screenOffset) - IntOffset.m23689getXimpl(this.windowOffset);
        int iM23690getYimpl = IntOffset.m23690getYimpl(this.screenOffset) - IntOffset.m23690getYimpl(this.windowOffset);
        return new IntRect(i10 + iM23689getXimpl, i11 + iM23690getYimpl, i12 + iM23689getXimpl, i13 + iM23690getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m22821getPositionInRootnOccac() {
        return IntOffset.m23683constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m22822getPositionInScreennOccac() {
        int iM23689getXimpl = IntOffset.m23689getXimpl(this.screenOffset);
        int iM23690getYimpl = IntOffset.m23690getYimpl(this.screenOffset);
        long j10 = this.topLeft;
        return IntOffset.m23683constructorimpl(((((int) (j10 >> 32)) + iM23689getXimpl) << 32) | ((((int) j10) + iM23690getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m22823getPositionInWindownOccac() {
        int iM23689getXimpl = IntOffset.m23689getXimpl(this.screenOffset) - IntOffset.m23689getXimpl(this.windowOffset);
        int iM23690getYimpl = IntOffset.m23690getYimpl(this.screenOffset) - IntOffset.m23690getYimpl(this.windowOffset);
        long j10 = this.topLeft;
        return IntOffset.m23683constructorimpl(((((int) (j10 >> 32)) + iM23689getXimpl) << 32) | ((((int) j10) + iM23690getYimpl) & 4294967295L));
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
