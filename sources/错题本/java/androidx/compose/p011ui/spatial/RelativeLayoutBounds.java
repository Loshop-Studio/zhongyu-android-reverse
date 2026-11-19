package androidx.compose.p011ui.spatial;

import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntRectKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010(\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b'\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m5110d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Landroidx/compose/ui/node/DelegatableNode;", "node", "<init>", "(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/e;)V", "", "Landroidx/compose/ui/unit/IntRect;", "calculateOcclusions", "()Ljava/util/List;", "J", "[F", "Landroidx/compose/ui/node/DelegatableNode;", "getPositionInRoot-nOcc-ac", "()J", "positionInRoot", "getPositionInWindow-nOcc-ac", "positionInWindow", "getPositionInScreen-nOcc-ac", "positionInScreen", "", "getWidth", "()I", "width", "getHeight", "height", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInRoot", "getBoundsInWindow", "boundsInWindow", "getBoundsInScreen", "boundsInScreen", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRelativeLayoutBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n1#1,179:1\n837#2:180\n839#2:181\n837#2:184\n839#2:185\n837#2:188\n837#2:189\n839#2:190\n839#2:191\n837#2:192\n839#2:193\n837#2:194\n839#2:195\n837#2:196\n839#2:197\n837#2:198\n839#2:199\n837#2:200\n839#2:201\n837#2:202\n839#2:203\n860#2,2:220\n837#2:224\n839#2:226\n837#2:228\n839#2:230\n810#2:232\n32#3:182\n32#3:186\n80#4:183\n80#4:187\n529#5,16:204\n545#5,2:222\n547#5:225\n548#5:227\n549#5:229\n550#5:231\n553#5,3:233\n*S KotlinDebug\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n*L\n55#1:180\n56#1:181\n65#1:184\n66#1:185\n73#1:188\n74#1:189\n81#1:190\n82#1:191\n91#1:192\n92#1:193\n93#1:194\n94#1:195\n101#1:196\n102#1:197\n103#1:198\n104#1:199\n131#1:200\n132#1:201\n133#1:202\n134#1:203\n171#1:220,2\n171#1:224\n171#1:226\n171#1:228\n171#1:230\n171#1:232\n57#1:182\n67#1:186\n57#1:183\n67#1:187\n171#1:204,16\n171#1:222,2\n171#1:225\n171#1:227\n171#1:229\n171#1:231\n171#1:233,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;

    @NotNull
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;

    @Nullable
    private final float[] viewToWindowMatrix;
    private final long windowOffset;

    public /* synthetic */ RelativeLayoutBounds(long j7, long j8, long j9, long j10, float[] fArr, DelegatableNode delegatableNode, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, fArr, delegatableNode);
    }

    @NotNull
    public final List<IntRect> calculateOcclusions() {
        int i;
        int i8;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int iIndexOf = rects.indexOf(semanticsId);
        if (iIndexOf < 0) {
            return EmptyList.INSTANCE;
        }
        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
        long[] jArr = rects.items;
        int i9 = rects.itemsSize;
        long j7 = jArr[iIndexOf];
        long j8 = jArr[iIndexOf + 1];
        int i10 = 0;
        while (i10 < jArr.length - 2 && i10 < i9) {
            if (i10 == iIndexOf) {
                i10 += 3;
            } else {
                long j9 = jArr[i10];
                long j10 = jArr[i10 + 1];
                if (((((j8 - j9) - InlineClassHelperKt.Uint64Low32) | ((j10 - j7) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i = i9;
                    i8 = iIndexOf;
                    int i11 = (int) (j9 >> 32);
                    int i12 = (int) j9;
                    int i13 = (int) (j10 >> 32);
                    int i14 = (int) j10;
                    if (rectManager.isTargetDrawnFirst$ui_release(semanticsId, ((int) jArr[i10 + 2]) & RectListKt.Lower26Bits)) {
                        listBuilderM5278q.add(new IntRect(i11, i12, i13, i14));
                    }
                } else {
                    i = i9;
                    i8 = iIndexOf;
                }
                i10 += 3;
                iIndexOf = i8;
                i9 = i;
            }
        }
        return listBuilderM5278q.build();
    }

    @NotNull
    public final IntRect getBoundsInRoot() {
        long j7 = this.topLeft;
        long j8 = this.bottomRight;
        return new IntRect((int) (j7 >> 32), (int) j7, (int) (j8 >> 32), (int) j8);
    }

    @NotNull
    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix == null) {
            long j7 = this.topLeft;
            int i = (int) (j7 >> 32);
            long j8 = this.bottomRight;
            int i8 = (int) (j8 >> 32);
            int i9 = (int) j8;
            int iM13433getXimpl = IntOffset.m13433getXimpl(this.screenOffset);
            int iM13434getYimpl = IntOffset.m13434getYimpl(this.screenOffset);
            return new IntRect(i + iM13433getXimpl, ((int) j7) + iM13434getYimpl, i8 + iM13433getXimpl, i9 + iM13434getYimpl);
        }
        IntRect boundsInWindow = getBoundsInWindow();
        long j9 = this.windowOffset;
        return new IntRect(IntOffset.m13433getXimpl(j9) + boundsInWindow.getLeft(), IntOffset.m13434getYimpl(j9) + boundsInWindow.getTop(), IntOffset.m13433getXimpl(j9) + boundsInWindow.getRight(), IntOffset.m13434getYimpl(j9) + boundsInWindow.getBottom());
    }

    @NotNull
    public final IntRect getBoundsInWindow() {
        long j7 = this.topLeft;
        int i = (int) (j7 >> 32);
        int i8 = (int) j7;
        long j8 = this.bottomRight;
        int i9 = (int) (j8 >> 32);
        int i10 = (int) j8;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m10919mapimpl(fArr, new Rect(i, i8, i9, i10)));
        }
        int iM13433getXimpl = IntOffset.m13433getXimpl(this.screenOffset) - IntOffset.m13433getXimpl(this.windowOffset);
        int iM13434getYimpl = IntOffset.m13434getYimpl(this.screenOffset) - IntOffset.m13434getYimpl(this.windowOffset);
        return new IntRect(i + iM13433getXimpl, i8 + iM13434getYimpl, i9 + iM13433getXimpl, i10 + iM13434getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m12564getPositionInRootnOccac() {
        return IntOffset.m13427constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m12565getPositionInScreennOccac() {
        int iM13433getXimpl = IntOffset.m13433getXimpl(this.screenOffset);
        int iM13434getYimpl = IntOffset.m13434getYimpl(this.screenOffset);
        long j7 = this.topLeft;
        return IntOffset.m13427constructorimpl(((((int) (j7 >> 32)) + iM13433getXimpl) << 32) | ((((int) j7) + iM13434getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m12566getPositionInWindownOccac() {
        int iM13433getXimpl = IntOffset.m13433getXimpl(this.screenOffset) - IntOffset.m13433getXimpl(this.windowOffset);
        int iM13434getYimpl = IntOffset.m13434getYimpl(this.screenOffset) - IntOffset.m13434getYimpl(this.windowOffset);
        long j7 = this.topLeft;
        return IntOffset.m13427constructorimpl(((((int) (j7 >> 32)) + iM13433getXimpl) << 32) | ((((int) j7) + iM13434getYimpl) & 4294967295L));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    private RelativeLayoutBounds(long j7, long j8, long j9, long j10, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j7;
        this.bottomRight = j8;
        this.windowOffset = j9;
        this.screenOffset = j10;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }
}
