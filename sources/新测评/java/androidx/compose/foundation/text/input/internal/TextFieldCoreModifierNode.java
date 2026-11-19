package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionColors;
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
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BM\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\"\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020-H\u0002JN\u00102\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\f\u00103\u001a\u00020-*\u000204H\u0016J\f\u00105\u001a\u00020-*\u000206H\u0016J\f\u00107\u001a\u00020-*\u000208H\u0002J(\u00109\u001a\u00020-*\u0002082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u001f0;2\u0006\u0010=\u001a\u00020>H\u0002J&\u0010?\u001a\u00020-*\u0002082\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0014\u0010C\u001a\u00020-*\u0002082\u0006\u0010=\u001a\u00020>H\u0002J&\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ&\u0010M\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010LJ&\u0010O\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010LJ6\u0010Q\u001a\u00020-*\u00020R2\u0006\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020VH\u0002ø\u0001\u0000¢\u0006\u0004\bW\u0010XR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "isFocused", "", "isDragHovered", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "writeable", "scrollState", "Landroidx/compose/foundation/ScrollState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "changeObserverJob", "Lkotlinx/coroutines/Job;", "cursorAnimation", "Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "previousTextLayoutSize", "", "showCursor", "getShowCursor", "()Z", "textFieldMagnifierNode", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "calculateOffsetToFollow", "currSelection", "currTextLayoutSize", "calculateOffsetToFollow-72CqOWE", "(JI)I", "onAttach", "", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "startCursorJob", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawCursor", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawHighlight", "highlight", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawSelection", "selection", "drawSelection-Sb-Bc2M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/text/TextLayoutResult;)V", "drawText", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureHorizontalScroll", "measureHorizontalScroll-3p2s80s", "measureVerticalScroll", "measureVerticalScroll-3p2s80s", "updateScrollState", "Landroidx/compose/ui/unit/Density;", "containerSize", "textLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "updateScrollState-tIlFzwE", "(Landroidx/compose/ui/unit/Density;IIJLandroidx/compose/ui/unit/LayoutDirection;)V", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,623:1\n1#2:624\n646#3:625\n635#3:626\n233#4:627\n56#5:628\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n483#1:625\n483#1:626\n497#1:627\n518#1:628\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private Job changeObserverJob;
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

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", m13596f = "TextFieldCoreModifier.kt", m13597i = {}, m13598l = {558}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1 */
    public static final class C17441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "isWindowFocused", ""}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", m13596f = "TextFieldCoreModifier.kt", m13597i = {}, m13598l = {560}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i10, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CursorAnimationState cursorAnimationState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Math.abs(this.I$0) == 1 && (cursorAnimationState = this.this$0.cursorAnimation) != null) {
                        this.label = 1;
                        if (cursorAnimationState.snapToVisibleAndAnimate(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }
        }

        public C17441(Continuation<? super C17441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldCoreModifierNode.this.new C17441(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 1;
                final TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Integer>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.startCursorJob.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Integer invoke() {
                        textFieldCoreModifierNode.textFieldState.getVisualText();
                        Integer numValueOf = Integer.valueOf(((textFieldCoreModifierNode.getIsAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * intRef.element);
                        intRef.element *= -1;
                        return numValueOf;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TextFieldCoreModifierNode.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TextFieldCoreModifierNode(boolean z9, boolean z10, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z11, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z9;
        this.isDragHovered = z10;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z11;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused || this.isDragHovered));
    }

    /* renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m18233calculateOffsetToFollow72CqOWE(long currSelection, int currTextLayoutSize) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m23022getEndimpl(currSelection) != TextRange.m23022getEndimpl(textRange.getPackedValue())) {
            return TextRange.m23022getEndimpl(currSelection);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m23027getStartimpl(currSelection) != TextRange.m23027getStartimpl(textRange2.getPackedValue())) {
            return TextRange.m23027getStartimpl(currSelection);
        }
        if (currTextLayoutSize != this.previousTextLayoutSize) {
            return TextRange.m23027getStartimpl(currSelection);
        }
        return -1;
    }

    private final void drawCursor(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && getShowCursor()) {
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m21512drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m20769getTopCenterF1C5BW0(), cursorRect.m20762getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, 432, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, Pair<TextHighlightType, TextRange> pair, TextLayoutResult textLayoutResult) {
        int value = pair.component1().getValue();
        long packedValue = pair.component2().getPackedValue();
        if (TextRange.m23021getCollapsedimpl(packedValue)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m23025getMinimpl(packedValue), TextRange.m23024getMaximpl(packedValue));
        if (!TextHighlightType.m18153equalsimpl0(value, TextHighlightType.INSTANCE.m18157getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.m21517drawPathLG529CI$default(drawScope, pathForRange, ((SelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.m21516drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jM23057getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m23057getColor0d7_KjU();
        if (jM23057getColor0d7_KjU == 16) {
            jM23057getColor0d7_KjU = Color.INSTANCE.m21002getBlack0d7_KjU();
        }
        long j10 = jM23057getColor0d7_KjU;
        DrawScope.m21517drawPathLG529CI$default(drawScope, pathForRange, Color.m20975copywmQWz5c$default(j10, Color.m20978getAlphaimpl(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m18234drawSelectionSbBc2M(DrawScope drawScope, long j10, TextLayoutResult textLayoutResult) {
        int iM23025getMinimpl = TextRange.m23025getMinimpl(j10);
        int iM23024getMaximpl = TextRange.m23024getMaximpl(j10);
        if (iM23025getMinimpl != iM23024getMaximpl) {
            DrawScope.m21517drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(iM23025getMinimpl, iM23024getMaximpl), ((SelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
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
    private final MeasureResult m18235measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(Constraints.m23504copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo22324measureBRTryo0.getWidth(), Constraints.m23514getMaxWidthimpl(j10));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                this.this$0.m18237updateScrollStatetIlFzwE(measureScope, iMin, placeableMo22324measureBRTryo0.getWidth(), this.this$0.textFieldState.getVisualText().getSelection(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22324measureBRTryo0, -this.this$0.scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m18236measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(Constraints.m23504copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo22324measureBRTryo0.getHeight(), Constraints.m23513getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), iMin, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                this.this$0.m18237updateScrollStatetIlFzwE(measureScope, iMin, placeableMo22324measureBRTryo0.getHeight(), this.this$0.textFieldState.getVisualText().getSelection(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22324measureBRTryo0, 0, -this.this$0.scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final void startCursorJob() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        this.changeObserverJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17441(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18237updateScrollStatetIlFzwE(androidx.compose.p013ui.unit.Density r9, int r10, int r11, long r12, androidx.compose.p013ui.unit.LayoutDirection r14) {
        /*
            r8 = this;
            int r0 = r11 - r10
            androidx.compose.foundation.ScrollState r1 = r8.scrollState
            r1.setMaxValue$foundation_release(r0)
            int r0 = r8.m18233calculateOffsetToFollow72CqOWE(r12, r11)
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
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            androidx.compose.ui.text.TextLayoutInput r3 = r1.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r3 = r3.getText()
            int r3 = r3.length()
            r4 = 0
            r2.<init>(r4, r3)
            int r0 = kotlin.ranges.RangesKt.coerceIn(r0, r2)
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
            androidx.compose.ui.text.TextRange r10 = androidx.compose.p013ui.text.TextRange.m23015boximpl(r12)
            r8.previousSelection = r10
            r8.previousCursorRect = r9
            r8.previousTextLayoutSize = r11
            kotlinx.coroutines.CoroutineScope r2 = r8.getCoroutineScope()
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1 r5 = new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1
            r9 = 0
            r5.<init>(r8, r1, r0, r9)
            r6 = 1
            r7 = 0
            r3 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.m18237updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
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
        if (TextRange.m23021getCollapsedimpl(visualText.getSelection())) {
            drawText(contentDrawScope, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m18234drawSelectionSbBc2M(contentDrawScope, visualText.getSelection(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return this.orientation == Orientation.Vertical ? m18236measureVerticalScroll3p2s80s(measureScope, measurable, j10) : m18235measureHorizontalScroll3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setCoreNodeCoordinates(coordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(coordinates);
    }

    public final void updateNode(boolean isFocused, boolean isDragHovered, TextLayoutState textLayoutState, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, Brush cursorBrush, boolean writeable, ScrollState scrollState, Orientation orientation) {
        boolean showCursor = getShowCursor();
        boolean z9 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = isFocused;
        this.isDragHovered = isDragHovered;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(textFieldState, textFieldSelectionState, textLayoutState, isFocused || isDragHovered);
        if (!getShowCursor()) {
            Job job = this.changeObserverJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z9 || !Intrinsics.areEqual(transformedTextFieldState, textFieldState) || !showCursor) {
            startCursorJob();
        }
        if (Intrinsics.areEqual(transformedTextFieldState, textFieldState) && Intrinsics.areEqual(textLayoutState2, textLayoutState) && Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState) && Intrinsics.areEqual(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
