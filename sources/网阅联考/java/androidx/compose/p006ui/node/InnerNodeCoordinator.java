package androidx.compose.p006ui.node;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.GraphicsLayerScope;
import androidx.compose.p006ui.graphics.Paint;
import androidx.compose.p006ui.graphics.PaintingStyle;
import androidx.compose.p006ui.layout.AlignmentLine;
import androidx.compose.p006ui.layout.LookaheadScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0002<=B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JS\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u001d\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J@\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014\u0018\u000107¢\u0006\u0002\b9H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, m5175d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail$annotations", "()V", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "createLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "hitTestChild", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/DelegatableNode;", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "Companion", "LookaheadDelegateImpl", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,223:1\n306#2,2:224\n308#2,2:238\n163#3:226\n460#4,11:227\n460#4,11:240\n222#4,11:253\n178#5,2:251\n180#5,2:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n96#1:224,2\n96#1:238,2\n98#1:226\n98#1:227,11\n149#1:240,11\n185#1:253,11\n182#1:251,2\n182#1:264,2\n*E\n"})
/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Paint innerBoundsPaint;
    private final Modifier.Node tail;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5175d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    @Metadata(m5174d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m5175d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "(Landroidx/compose/ui/node/InnerNodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeChildren", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,223:1\n173#2,2:224\n175#2:238\n163#3:226\n460#4,11:227\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n53#1:224,2\n53#1:238\n55#1:226\n55#1:227,11\n*E\n"})
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        final /* synthetic */ InnerNodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateImpl(InnerNodeCoordinator innerNodeCoordinator, LookaheadScope scope) {
            super(innerNodeCoordinator, scope);
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.this$0 = innerNodeCoordinator;
        }

        @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.p006ui.node.LookaheadDelegate, androidx.compose.p006ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.p006ui.node.LookaheadDelegate, androidx.compose.p006ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.p006ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo10585measureBRTryo0(long constraints) {
            m10619setMeasurementConstraintsBRTryo0(constraints);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i4 = 0;
                do {
                    content[i4].setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i4++;
                } while (i4 < size);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo6928measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), constraints));
            return this;
        }

        @Override // androidx.compose.p006ui.node.LookaheadDelegate, androidx.compose.p006ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.p006ui.node.LookaheadDelegate, androidx.compose.p006ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.p006ui.node.LookaheadDelegate
        public void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.checkNotNull(lookaheadPassDelegate);
            lookaheadPassDelegate.onPlaced();
            getAlignmentLinesOwner().layoutChildren();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo9066setColor8_81llA(Color.INSTANCE.m9212getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo9070setStylek9PVt8s(PaintingStyle.INSTANCE.m9420getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.tail = new Modifier.Node() { // from class: androidx.compose.ui.node.InnerNodeCoordinator$tail$1
            public String toString() {
                return "<tail>";
            }
        };
        getTail().updateCoordinator$ui_release(this);
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p006ui.node.NodeCoordinator
    public LookaheadDelegate createLookaheadDelegate(LookaheadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new LookaheadDelegateImpl(this, scope);
    }

    @Override // androidx.compose.p006ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[EDGE_INSN: B:38:0x00a0->B:36:0x00a0 BREAK  A[LOOP:0: B:21:0x0064->B:40:?], SYNTHETIC] */
    @Override // androidx.compose.p006ui.node.NodeCoordinator
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends androidx.compose.p006ui.node.DelegatableNode> void mo10695hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource<T> r20, long r21, androidx.compose.p006ui.node.HitTestResult<T> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r19.getLayoutNode()
            boolean r1 = r8.shouldHitTestChildren(r1)
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L46
            boolean r1 = r0.m10767withinLayerBoundsk4lQ0M(r9)
            if (r1 == 0) goto L28
            r14 = r25
            r1 = r12
            goto L49
        L28:
            if (r24 == 0) goto L46
            long r1 = r19.m10757getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m10754distanceInMinimumTouchTargettz77jQw(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L40
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L40
            r1 = r12
            goto L41
        L40:
            r1 = r13
        L41:
            if (r1 == 0) goto L46
            r1 = r12
            r14 = r13
            goto L49
        L46:
            r14 = r25
            r1 = r13
        L49:
            if (r1 == 0) goto La3
            int r15 = androidx.compose.p006ui.node.HitTestResult.access$getHitDepth$p(r23)
            androidx.compose.ui.node.LayoutNode r1 = r19.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto La0
            int r2 = r2 - r12
            java.lang.Object[] r16 = r1.getContent()
            r17 = r2
        L64:
            r1 = r16[r17]
            r18 = r1
            androidx.compose.ui.node.LayoutNode r18 = (androidx.compose.p006ui.node.LayoutNode) r18
            boolean r1 = r18.getIsPlaced()
            if (r1 == 0) goto L99
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.mo10768childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r23.hasHit()
            if (r1 != 0) goto L86
        L84:
            r1 = r12
            goto L95
        L86:
            androidx.compose.ui.node.NodeCoordinator r1 = r18.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L94
            r23.acceptHits()
            goto L84
        L94:
            r1 = r13
        L95:
            if (r1 != 0) goto L99
            r1 = r12
            goto L9a
        L99:
            r1 = r13
        L9a:
            if (r1 != 0) goto La0
            int r17 = r17 + (-1)
            if (r17 >= 0) goto L64
        La0:
            androidx.compose.p006ui.node.HitTestResult.access$setHitDepth$p(r11, r15)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.node.InnerNodeCoordinator.mo10695hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.p006ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo10585measureBRTryo0(long constraints) {
        m10619setMeasurementConstraintsBRTryo0(constraints);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i4 = 0;
            do {
                content[i4].setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i4++;
            } while (i4 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo6928measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), constraints));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.p006ui.node.NodeCoordinator
    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i4 = 0;
            do {
                LayoutNode layoutNode = content[i4];
                if (layoutNode.getIsPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i4++;
            } while (i4 < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    @Override // androidx.compose.p006ui.node.NodeCoordinator, androidx.compose.p006ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo10586placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        super.mo10586placeAtf8xVGno(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        getLayoutNode().onNodePlaced$ui_release();
    }
}
