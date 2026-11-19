package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.WindowInfo;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextPainter;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private InterfaceC10045g changeObserverJob;
    private CursorAnimationState cursorAnimation;
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;
    private Orientation orientation;
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
    private TextRange previousSelection;
    private int previousTextLayoutSize;
    private ScrollState scrollState;
    private final TextFieldMagnifierNode textFieldMagnifierNode;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean writeable;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", m26211f = "TextFieldCoreModifier.kt", m26212l = {558}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1 */
    public static final class C18031 extends SuspendLambda implements InterfaceC9544p {
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", m26211f = "TextFieldCoreModifier.kt", m26212l = {560}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC11588c);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(Integer.valueOf(i10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CursorAnimationState cursorAnimationState;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    if (Math.abs(this.I$0) == 1 && (cursorAnimationState = this.this$0.cursorAnimation) != null) {
                        this.label = 1;
                        if (cursorAnimationState.snapToVisibleAndAnimate(this) == objM25952f) {
                            return objM25952f;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (InterfaceC11588c<? super C10786q>) obj2);
            }
        }

        public C18031(InterfaceC11588c<? super C18031> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return TextFieldCoreModifierNode.this.new C18031(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f23400c = 1;
                final TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.startCursorJob.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Integer invoke() {
                        textFieldCoreModifierNode.textFieldState.getVisualText();
                        Integer numValueOf = Integer.valueOf(((textFieldCoreModifierNode.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * ref$IntRef.f23400c);
                        ref$IntRef.f23400c *= -1;
                        return numValueOf;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TextFieldCoreModifierNode.this, null);
                this.label = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cSnapshotFlow, anonymousClass2, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C18031) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TextFieldCoreModifierNode(boolean z10, boolean z11, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z12, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z10;
        this.isDragHovered = z11;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z12;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused || this.isDragHovered));
    }

    /* renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m28038calculateOffsetToFollow72CqOWE(long j10, int i10) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m32961getEndimpl(j10) != TextRange.m32961getEndimpl(textRange.m32970unboximpl())) {
            return TextRange.m32961getEndimpl(j10);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m32966getStartimpl(j10) != TextRange.m32966getStartimpl(textRange2.m32970unboximpl())) {
            return TextRange.m32966getStartimpl(j10);
        }
        if (i10 != this.previousTextLayoutSize) {
            return TextRange.m32966getStartimpl(j10);
        }
        return -1;
    }

    private final void drawCursor(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && getShowCursor()) {
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m31414drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m30671getTopCenterF1C5BW0(), cursorRect.m30664getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, 432, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, Pair<TextHighlightType, TextRange> pair, TextLayoutResult textLayoutResult) {
        int iM27959unboximpl = ((TextHighlightType) pair.m20048a()).m27959unboximpl();
        long jM32970unboximpl = ((TextRange) pair.m20049c()).m32970unboximpl();
        if (TextRange.m32960getCollapsedimpl(jM32970unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m32964getMinimpl(jM32970unboximpl), TextRange.m32963getMaximpl(jM32970unboximpl));
        if (!TextHighlightType.m27956equalsimpl0(iM27959unboximpl, TextHighlightType.Companion.m27960getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.m31419drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m28308getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.m31418drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jM32996getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m32996getColor0d7_KjU();
        if (jM32996getColor0d7_KjU == 16) {
            jM32996getColor0d7_KjU = Color.Companion.m30904getBlack0d7_KjU();
        }
        long j10 = jM32996getColor0d7_KjU;
        DrawScope.m31419drawPathLG529CI$default(drawScope, pathForRange, Color.m30877copywmQWz5c$default(j10, Color.m30880getAlphaimpl(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m28039drawSelectionSbBc2M(DrawScope drawScope, long j10, TextLayoutResult textLayoutResult) {
        int iM32964getMinimpl = TextRange.m32964getMinimpl(j10);
        int iM32963getMaximpl = TextRange.m32963getMaximpl(j10);
        if (iM32964getMinimpl != iM32963getMaximpl) {
            DrawScope.m31419drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(iM32964getMinimpl, iM32963getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m28308getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }

    private final boolean getShowCursor() {
        if (this.writeable) {
            return (this.isFocused || this.isDragHovered) && TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
        }
        return false;
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m28040measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo32229measureBRTryo0.getWidth(), Constraints.m33454getMaxWidthimpl(j10));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                this.this$0.m28042updateScrollStatetIlFzwE(measureScope, iMin, placeableMo32229measureBRTryo0.getWidth(), this.this$0.textFieldState.getVisualText().m27947getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, -this.this$0.scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m28041measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo32229measureBRTryo0.getHeight(), Constraints.m33453getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), iMin, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                this.this$0.m28042updateScrollStatetIlFzwE(measureScope, iMin, placeableMo32229measureBRTryo0.getHeight(), this.this$0.textFieldState.getVisualText().m27947getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, -this.this$0.scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        this.changeObserverJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C18031(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28042updateScrollStatetIlFzwE(androidx.compose.p014ui.unit.Density r9, int r10, int r11, long r12, androidx.compose.p014ui.unit.LayoutDirection r14) {
        /*
            r8 = this;
            int r0 = r11 - r10
            androidx.compose.foundation.ScrollState r1 = r8.scrollState
            r1.setMaxValue$foundation_release(r0)
            int r0 = r8.m28038calculateOffsetToFollow72CqOWE(r12, r11)
            if (r0 < 0) goto Lc6
            boolean r1 = r8.getShowCursor()
            if (r1 != 0) goto L15
            goto Lc6
        L15:
            androidx.compose.foundation.text.input.internal.TextLayoutState r1 = r8.textLayoutState
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 != 0) goto L1f
            goto Lc6
        L1f:
            nd.j r2 = new nd.j
            androidx.compose.ui.text.TextLayoutInput r3 = r1.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r3 = r3.getText()
            int r3 = r3.length()
            r4 = 0
            r2.<init>(r4, r3)
            int r0 = p265nd.AbstractC10410o.m21762o(r0, r2)
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p014ui.unit.LayoutDirection.Rtl
            r2 = 1
            if (r14 != r1) goto L40
            r14 = r2
            goto L41
        L40:
            r14 = r4
        L41:
            androidx.compose.ui.geometry.Rect r9 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$getCursorRectInScroller(r9, r0, r14, r11)
            float r14 = r9.getLeft()
            androidx.compose.ui.geometry.Rect r1 = r8.previousCursorRect
            float r1 = r1.getLeft()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L65
            float r14 = r9.getTop()
            androidx.compose.ui.geometry.Rect r1 = r8.previousCursorRect
            float r1 = r1.getTop()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L65
            int r14 = r8.previousTextLayoutSize
            if (r11 == r14) goto Lc6
        L65:
            androidx.compose.foundation.gestures.Orientation r14 = r8.orientation
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r14 != r1) goto L6c
            r4 = r2
        L6c:
            if (r4 == 0) goto L73
            float r14 = r9.getTop()
            goto L77
        L73:
            float r14 = r9.getLeft()
        L77:
            if (r4 == 0) goto L7e
            float r1 = r9.getBottom()
            goto L82
        L7e:
            float r1 = r9.getRight()
        L82:
            androidx.compose.foundation.ScrollState r2 = r8.scrollState
            int r2 = r2.getValue()
            int r3 = r2 + r10
            float r3 = (float) r3
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L91
        L8f:
            float r1 = r1 - r3
            goto Laa
        L91:
            float r2 = (float) r2
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 >= 0) goto L9e
            float r5 = r1 - r14
            float r6 = (float) r10
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L9e
            goto L8f
        L9e:
            if (r4 >= 0) goto La9
            float r1 = r1 - r14
            float r10 = (float) r10
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 > 0) goto La9
            float r1 = r14 - r2
            goto Laa
        La9:
            r1 = 0
        Laa:
            androidx.compose.ui.text.TextRange r10 = androidx.compose.p014ui.text.TextRange.m32954boximpl(r12)
            r8.previousSelection = r10
            r8.previousCursorRect = r9
            r8.previousTextLayoutSize = r11
            sd.i0 r2 = r8.getCoroutineScope()
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.f23479f
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1 r5 = new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1
            r9 = 0
            r5.<init>(r8, r1, r0, r9)
            r6 = 1
            r7 = 0
            r3 = 0
            sd.AbstractC11109f.m24706d(r2, r3, r4, r5, r6, r7)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.m28042updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        Pair<TextHighlightType, TextRange> highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(contentDrawScope, highlight, layoutResult);
        }
        if (TextRange.m32960getCollapsedimpl(visualText.m27947getSelectiond9O1mEE())) {
            drawText(contentDrawScope, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m28039drawSelectionSbBc2M(contentDrawScope, visualText.m27947getSelectiond9O1mEE(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return this.orientation == Orientation.Vertical ? m28041measureVerticalScroll3p2s80s(measureScope, measurable, j10) : m28040measureHorizontalScroll3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    public final void updateNode(boolean z10, boolean z11, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z12, ScrollState scrollState, Orientation orientation) {
        boolean showCursor = getShowCursor();
        boolean z13 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z10;
        this.isDragHovered = z11;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z12;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z10 || z11);
        if (!getShowCursor()) {
            InterfaceC10045g interfaceC10045g = this.changeObserverJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z13 || !AbstractC9979u.m20289b(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (AbstractC9979u.m20289b(transformedTextFieldState2, transformedTextFieldState) && AbstractC9979u.m20289b(textLayoutState2, textLayoutState) && AbstractC9979u.m20289b(textFieldSelectionState2, textFieldSelectionState) && AbstractC9979u.m20289b(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
