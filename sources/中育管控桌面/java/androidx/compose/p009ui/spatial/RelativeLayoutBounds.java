package androidx.compose.p009ui.spatial;

import androidx.compose.p009ui.geometry.InlineClassHelperKt;
import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.graphics.Matrix;
import androidx.compose.p009ui.node.DelegatableNode;
import androidx.compose.p009ui.node.DelegatableNodeKt;
import androidx.compose.p009ui.unit.IntOffset;
import androidx.compose.p009ui.unit.IntRect;
import androidx.compose.p009ui.unit.IntRectKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010!R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m7880d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "boundsInRoot", "Landroidx/compose/ui/unit/IntRect;", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInScreen", "getBoundsInScreen", "boundsInWindow", "getBoundsInWindow", "height", "", "getHeight", "()I", "positionInRoot", "getPositionInRoot-nOcc-ac", "()J", "positionInScreen", "getPositionInScreen-nOcc-ac", "positionInWindow", "getPositionInWindow-nOcc-ac", "J", "[F", "width", "getWidth", "calculateOcclusions", "", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
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

    public /* synthetic */ RelativeLayoutBounds(long j6, long j7, long j8, long j9, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(j6, j7, j8, j9, fArr, delegatableNode);
    }

    public final List<IntRect> calculateOcclusions() {
        int i6;
        int i7;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int iIndexOf = rects.indexOf(semanticsId);
        if (iIndexOf < 0) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        long[] jArr = rects.items;
        int i8 = rects.itemsSize;
        long j6 = jArr[iIndexOf];
        long j7 = jArr[iIndexOf + 1];
        int i9 = 0;
        while (i9 < jArr.length - 2 && i9 < i8) {
            if (i9 == iIndexOf) {
                i9 += 3;
            } else {
                long j8 = jArr[i9];
                long j9 = jArr[i9 + 1];
                if (((((j7 - j8) - InlineClassHelperKt.Uint64Low32) | ((j9 - j6) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i6 = i8;
                    i7 = iIndexOf;
                    int i10 = (int) (j8 >> 32);
                    int i11 = (int) j8;
                    int i12 = (int) (j9 >> 32);
                    int i13 = (int) j9;
                    if (rectManager.isTargetDrawnFirst$ui_release(semanticsId, ((int) jArr[i9 + 2]) & RectListKt.Lower26Bits)) {
                        listCreateListBuilder.add(new IntRect(i10, i11, i12, i13));
                    }
                } else {
                    i6 = i8;
                    i7 = iIndexOf;
                }
                i9 += 3;
                iIndexOf = i7;
                i8 = i6;
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final IntRect getBoundsInRoot() {
        long j6 = this.topLeft;
        long j7 = this.bottomRight;
        return new IntRect((int) (j6 >> 32), (int) j6, (int) (j7 >> 32), (int) j7);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix != null) {
            IntRect boundsInWindow = getBoundsInWindow();
            long j6 = this.windowOffset;
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m16612getXimpl(j6), boundsInWindow.getTop() + IntOffset.m16613getYimpl(j6), boundsInWindow.getRight() + IntOffset.m16612getXimpl(j6), boundsInWindow.getBottom() + IntOffset.m16613getYimpl(j6));
        }
        long j7 = this.topLeft;
        int i6 = (int) (j7 >> 32);
        long j8 = this.bottomRight;
        int i7 = (int) (j8 >> 32);
        int i8 = (int) j8;
        int iM16612getXimpl = IntOffset.m16612getXimpl(this.screenOffset);
        int iM16613getYimpl = IntOffset.m16613getYimpl(this.screenOffset);
        return new IntRect(i6 + iM16612getXimpl, ((int) j7) + iM16613getYimpl, i7 + iM16612getXimpl, i8 + iM16613getYimpl);
    }

    public final IntRect getBoundsInWindow() {
        long j6 = this.topLeft;
        int i6 = (int) (j6 >> 32);
        int i7 = (int) j6;
        long j7 = this.bottomRight;
        int i8 = (int) (j7 >> 32);
        int i9 = (int) j7;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m14136mapimpl(fArr, new Rect(i6, i7, i8, i9)));
        }
        int iM16612getXimpl = IntOffset.m16612getXimpl(this.screenOffset) - IntOffset.m16612getXimpl(this.windowOffset);
        int iM16613getYimpl = IntOffset.m16613getYimpl(this.screenOffset) - IntOffset.m16613getYimpl(this.windowOffset);
        return new IntRect(i6 + iM16612getXimpl, i7 + iM16613getYimpl, i8 + iM16612getXimpl, i9 + iM16613getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m15744getPositionInRootnOccac() {
        return IntOffset.m16606constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m15745getPositionInScreennOccac() {
        int iM16612getXimpl = IntOffset.m16612getXimpl(this.screenOffset);
        int iM16613getYimpl = IntOffset.m16613getYimpl(this.screenOffset);
        long j6 = this.topLeft;
        return IntOffset.m16606constructorimpl(((((int) (j6 >> 32)) + iM16612getXimpl) << 32) | ((((int) j6) + iM16613getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m15746getPositionInWindownOccac() {
        int iM16612getXimpl = IntOffset.m16612getXimpl(this.screenOffset) - IntOffset.m16612getXimpl(this.windowOffset);
        int iM16613getYimpl = IntOffset.m16613getYimpl(this.screenOffset) - IntOffset.m16613getYimpl(this.windowOffset);
        long j6 = this.topLeft;
        return IntOffset.m16606constructorimpl(((((int) (j6 >> 32)) + iM16612getXimpl) << 32) | ((((int) j6) + iM16613getYimpl) & 4294967295L));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    private RelativeLayoutBounds(long j6, long j7, long j8, long j9, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j6;
        this.bottomRight = j7;
        this.windowOffset = j8;
        this.screenOffset = j9;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }
}
