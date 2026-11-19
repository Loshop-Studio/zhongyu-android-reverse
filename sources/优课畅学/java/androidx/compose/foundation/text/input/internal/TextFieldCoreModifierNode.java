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
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.WindowInfo;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextPainter;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private InterfaceC9212n changeObserverJob;
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", m17801f = "TextFieldCoreModifier.kt", m17802l = {558}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1 */
    public static final class C17731 extends SuspendLambda implements InterfaceC10574p {
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", m17801f = "TextFieldCoreModifier.kt", m17802l = {560}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC9324c);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(Integer.valueOf(i10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CursorAnimationState cursorAnimationState;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    if (Math.abs(this.I$0) == 1 && (cursorAnimationState = this.this$0.cursorAnimation) != null) {
                        this.label = 1;
                        if (cursorAnimationState.snapToVisibleAndAnimate(this) == objM17291f) {
                            return objM17291f;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (InterfaceC9324c<? super C8736p>) obj2);
            }
        }

        public C17731(InterfaceC9324c<? super C17731> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return TextFieldCoreModifierNode.this.new C17731(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17731) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f17471a = 1;
                final TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.startCursorJob.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final Integer invoke() {
                        textFieldCoreModifierNode.textFieldState.getVisualText();
                        Integer numValueOf = Integer.valueOf(((textFieldCoreModifierNode.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * ref$IntRef.f17471a);
                        ref$IntRef.f17471a *= -1;
                        return numValueOf;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TextFieldCoreModifierNode.this, null);
                this.label = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cSnapshotFlow, anonymousClass2, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
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
    private final int m21436calculateOffsetToFollow72CqOWE(long j10, int i10) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m26359getEndimpl(j10) != TextRange.m26359getEndimpl(textRange.m26368unboximpl())) {
            return TextRange.m26359getEndimpl(j10);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m26364getStartimpl(j10) != TextRange.m26364getStartimpl(textRange2.m26368unboximpl())) {
            return TextRange.m26364getStartimpl(j10);
        }
        if (i10 != this.previousTextLayoutSize) {
            return TextRange.m26364getStartimpl(j10);
        }
        return -1;
    }

    private final void drawCursor(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && getShowCursor()) {
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m24812drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m24069getTopCenterF1C5BW0(), cursorRect.m24062getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, 432, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, Pair<TextHighlightType, TextRange> pair, TextLayoutResult textLayoutResult) {
        int iM21357unboximpl = ((TextHighlightType) pair.m15903a()).m21357unboximpl();
        long jM26368unboximpl = ((TextRange) pair.m15904b()).m26368unboximpl();
        if (TextRange.m26358getCollapsedimpl(jM26368unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m26362getMinimpl(jM26368unboximpl), TextRange.m26361getMaximpl(jM26368unboximpl));
        if (!TextHighlightType.m21354equalsimpl0(iM21357unboximpl, TextHighlightType.Companion.m21358getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.m24817drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m21706getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.m24816drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jM26394getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m26394getColor0d7_KjU();
        if (jM26394getColor0d7_KjU == 16) {
            jM26394getColor0d7_KjU = Color.Companion.m24302getBlack0d7_KjU();
        }
        long j10 = jM26394getColor0d7_KjU;
        DrawScope.m24817drawPathLG529CI$default(drawScope, pathForRange, Color.m24275copywmQWz5c$default(j10, Color.m24278getAlphaimpl(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m21437drawSelectionSbBc2M(DrawScope drawScope, long j10, TextLayoutResult textLayoutResult) {
        int iM26362getMinimpl = TextRange.m26362getMinimpl(j10);
        int iM26361getMaximpl = TextRange.m26361getMaximpl(j10);
        if (iM26362getMinimpl != iM26361getMaximpl) {
            DrawScope.m24817drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(iM26362getMinimpl, iM26361getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m21706getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
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
    private final MeasureResult m21438measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo25627measureBRTryo0.getWidth(), Constraints.m26852getMaxWidthimpl(j10));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                this.this$0.m21440updateScrollStatetIlFzwE(measureScope, iMin, placeableMo25627measureBRTryo0.getWidth(), this.this$0.textFieldState.getVisualText().m21345getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, -this.this$0.scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m21439measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo25627measureBRTryo0.getHeight(), Constraints.m26851getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), iMin, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                this.this$0.m21440updateScrollStatetIlFzwE(measureScope, iMin, placeableMo25627measureBRTryo0.getHeight(), this.this$0.textFieldState.getVisualText().m21345getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, -this.this$0.scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        this.changeObserverJob = AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C17731(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21440updateScrollStatetIlFzwE(androidx.compose.p013ui.unit.Density r9, int r10, int r11, long r12, androidx.compose.p013ui.unit.LayoutDirection r14) {
        /*
            r8 = this;
            int r0 = r11 - r10
            androidx.compose.foundation.ScrollState r1 = r8.scrollState
            r1.setMaxValue$foundation_release(r0)
            int r0 = r8.m21436calculateOffsetToFollow72CqOWE(r12, r11)
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
            d8.f r2 = new d8.f
            androidx.compose.ui.text.TextLayoutInput r3 = r1.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r3 = r3.getText()
            int r3 = r3.length()
            r4 = 0
            r2.<init>(r4, r3)
            int r0 = p077d8.AbstractC8323h.m13519n(r0, r2)
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p013ui.unit.LayoutDirection.Rtl
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
            androidx.compose.ui.text.TextRange r10 = androidx.compose.p013ui.text.TextRange.m26352boximpl(r12)
            r8.previousSelection = r10
            r8.previousCursorRect = r9
            r8.previousTextLayoutSize = r11
            i8.b0 r2 = r8.getCoroutineScope()
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.f17555d
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1 r5 = new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1
            r9 = 0
            r5.<init>(r8, r1, r0, r9)
            r6 = 1
            r7 = 0
            r3 = 0
            p135i8.AbstractC8833f.m14845d(r2, r3, r4, r5, r6, r7)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.m21440updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
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
        if (TextRange.m26358getCollapsedimpl(visualText.m21345getSelectiond9O1mEE())) {
            drawText(contentDrawScope, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m21437drawSelectionSbBc2M(contentDrawScope, visualText.m21345getSelectiond9O1mEE(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return this.orientation == Orientation.Vertical ? m21439measureVerticalScroll3p2s80s(measureScope, measurable, j10) : m21438measureHorizontalScroll3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
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
            InterfaceC9212n interfaceC9212n = this.changeObserverJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z13 || !AbstractC9133u.m16128b(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (AbstractC9133u.m16128b(transformedTextFieldState2, transformedTextFieldState) && AbstractC9133u.m16128b(textLayoutState2, textLayoutState) && AbstractC9133u.m16128b(textFieldSelectionState2, textFieldSelectionState) && AbstractC9133u.m16128b(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
