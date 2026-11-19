package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final Animatable<Offset, AnimationVector2D> animatable;
    private InterfaceC10045g animationJob;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean visible;
    private final MutableState magnifierSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m33664boximpl(IntSize.Companion.m33677getZeroYbymL2g()), null, 2, null);
    private final MagnifierNode magnifierNode = (MagnifierNode) delegate(new MagnifierNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m30626boximpl(m28115invoketuRUvjQ((Density) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m28115invoketuRUvjQ(Density density) {
            return ((Offset) this.this$0.animatable.getValue()).m30647unboximpl();
        }
    }, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$2
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28116invokeEaSLcWc(((DpSize) obj).m33607unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m28116invokeEaSLcWc(long j10) {
            TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            textFieldMagnifierNodeImpl28.m28114setMagnifierSizeozmzZPI(IntSize.m33667constructorimpl((r1.mo27093roundToPx0680j_4(DpSize.m33597getHeightD9Ej5fM(j10)) & 4294967295L) | (((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(DpSize.m33599getWidthD9Ej5fM(j10)) << 32)));
        }
    }, 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", m26211f = "AndroidTextFieldMagnifier.android.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1 */
    public static final class C18801 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C18801(InterfaceC11588c<? super C18801> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C18801 c18801 = TextFieldMagnifierNodeImpl28.this.new C18801(interfaceC11588c);
            c18801.L$0 = obj;
            return c18801;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = TextFieldMagnifierNodeImpl28.this;
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.restartAnimationJob.1.1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m30626boximpl(m28117invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m28117invokeF1C5BW0() {
                        return (textFieldMagnifierNodeImpl28.visible || textFieldMagnifierNodeImpl28.textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.Touch) ? TextFieldMagnifierKt.m28110calculateSelectionMagnifierCenterAndroidhUlJWOE(textFieldMagnifierNodeImpl28.textFieldState, textFieldMagnifierNodeImpl28.textFieldSelectionState, textFieldMagnifierNodeImpl28.textLayoutState, textFieldMagnifierNodeImpl28.m28113getMagnifierSizeYbymL2g()) : Offset.Companion.m30652getUnspecifiedF1C5BW0();
                    }
                });
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = TextFieldMagnifierNodeImpl28.this;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.restartAnimationJob.1.2

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", m26211f = "AndroidTextFieldMagnifier.android.kt", m26212l = {Opcodes.IF_ICMPNE}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ long $targetValue;
                        int label;
                        final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.this$0 = textFieldMagnifierNodeImpl28;
                            this.$targetValue = j10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new AnonymousClass1(this.this$0, this.$targetValue, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                Animatable animatable = this.this$0.animatable;
                                Offset offsetM30626boximpl = Offset.m30626boximpl(this.$targetValue);
                                SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                                this.label = 1;
                                if (Animatable.animateTo$default(animatable, offsetM30626boximpl, magnifierSpringSpec, null, null, this, 12, null) == objM25952f) {
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
                            return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return m28118emit3MmeM6k(((Offset) obj2).m30647unboximpl(), interfaceC11588c);
                    }

                    /* renamed from: emit-3MmeM6k, reason: not valid java name */
                    public final Object m28118emit3MmeM6k(long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        if ((((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m30647unboximpl() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || (j10 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || Float.intBitsToFloat((int) (((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m30647unboximpl() & 4294967295L)) == Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                            Object objSnapTo = textFieldMagnifierNodeImpl282.animatable.snapTo(Offset.m30626boximpl(j10), interfaceC11588c);
                            return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
                        }
                        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(textFieldMagnifierNodeImpl282, j10, null), 3, null);
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594cSnapshotFlow.collect(interfaceC11595d, this) == objM25952f) {
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
            return ((C18801) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z10) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z10;
        this.animatable = new Animatable<>(Offset.m30626boximpl(TextFieldMagnifierKt.m28110calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m28113getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m30626boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m28113getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m33676unboximpl();
    }

    private final void restartAnimationJob() {
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.animationJob = null;
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            this.animationJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C18801(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m28114setMagnifierSizeozmzZPI(long j10) {
        this.magnifierSize$delegate.setValue(IntSize.m33664boximpl(j10));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p014ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.magnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void update(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z10) {
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z11 = this.visible;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z10;
        if (AbstractC9979u.m20289b(transformedTextFieldState, transformedTextFieldState2) && AbstractC9979u.m20289b(textFieldSelectionState, textFieldSelectionState2) && AbstractC9979u.m20289b(textLayoutState, textLayoutState2) && z10 == z11) {
            return;
        }
        restartAnimationJob();
    }
}
