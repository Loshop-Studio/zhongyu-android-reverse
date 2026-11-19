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
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final Animatable<Offset, AnimationVector2D> animatable;
    private InterfaceC9212n animationJob;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean visible;
    private final MutableState magnifierSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m27062boximpl(IntSize.Companion.m27075getZeroYbymL2g()), null, 2, null);
    private final MagnifierNode magnifierNode = (MagnifierNode) delegate(new MagnifierNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m24024boximpl(m21513invoketuRUvjQ((Density) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m21513invoketuRUvjQ(Density density) {
            return ((Offset) this.this$0.animatable.getValue()).m24045unboximpl();
        }
    }, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$2
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m21514invokeEaSLcWc(((DpSize) obj).m27005unboximpl());
            return C8736p.f16368a;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m21514invokeEaSLcWc(long j10) {
            TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
            textFieldMagnifierNodeImpl28.m21512setMagnifierSizeozmzZPI(IntSize.m27065constructorimpl((r1.mo20491roundToPx0680j_4(DpSize.m26995getHeightD9Ej5fM(j10)) & 4294967295L) | (((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity())).mo20491roundToPx0680j_4(DpSize.m26997getWidthD9Ej5fM(j10)) << 32)));
        }
    }, 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", m17801f = "AndroidTextFieldMagnifier.android.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1 */
    public static final class C18501 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        public C18501(InterfaceC9324c<? super C18501> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18501 c18501 = TextFieldMagnifierNodeImpl28.this.new C18501(interfaceC9324c);
            c18501.L$0 = obj;
            return c18501;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C18501) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = TextFieldMagnifierNodeImpl28.this;
                InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.restartAnimationJob.1.1
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m24024boximpl(m21515invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m21515invokeF1C5BW0() {
                        return (textFieldMagnifierNodeImpl28.visible || textFieldMagnifierNodeImpl28.textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.Touch) ? TextFieldMagnifierKt.m21508calculateSelectionMagnifierCenterAndroidhUlJWOE(textFieldMagnifierNodeImpl28.textFieldState, textFieldMagnifierNodeImpl28.textFieldSelectionState, textFieldMagnifierNodeImpl28.textLayoutState, textFieldMagnifierNodeImpl28.m21511getMagnifierSizeYbymL2g()) : Offset.Companion.m24050getUnspecifiedF1C5BW0();
                    }
                });
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = TextFieldMagnifierNodeImpl28.this;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.restartAnimationJob.1.2

                    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", m17801f = "AndroidTextFieldMagnifier.android.kt", m17802l = {160}, m17803m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                        final /* synthetic */ long $targetValue;
                        int label;
                        final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j10, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                            super(2, interfaceC9324c);
                            this.this$0 = textFieldMagnifierNodeImpl28;
                            this.$targetValue = j10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                            return new AnonymousClass1(this.this$0, this.$targetValue, interfaceC9324c);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM17291f = AbstractC9434a.m17291f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9079b.m15926b(obj);
                                Animatable animatable = this.this$0.animatable;
                                Offset offsetM24024boximpl = Offset.m24024boximpl(this.$targetValue);
                                SpringSpec<Offset> magnifierSpringSpec = SelectionMagnifierKt.getMagnifierSpringSpec();
                                this.label = 1;
                                if (Animatable.animateTo$default(animatable, offsetM24024boximpl, magnifierSpringSpec, null, null, this, 12, null) == objM17291f) {
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

                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return m21516emit3MmeM6k(((Offset) obj2).m24045unboximpl(), interfaceC9324c);
                    }

                    /* renamed from: emit-3MmeM6k, reason: not valid java name */
                    public final Object m21516emit3MmeM6k(long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        if ((((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m24045unboximpl() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || (j10 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || Float.intBitsToFloat((int) (((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m24045unboximpl() & 4294967295L)) == Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                            Object objSnapTo = textFieldMagnifierNodeImpl282.animatable.snapTo(Offset.m24024boximpl(j10), interfaceC9324c);
                            return objSnapTo == AbstractC9434a.m17291f() ? objSnapTo : C8736p.f16368a;
                        }
                        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(textFieldMagnifierNodeImpl282, j10, null), 3, null);
                        return C8736p.f16368a;
                    }
                };
                this.label = 1;
                if (interfaceC9266cSnapshotFlow.collect(interfaceC9267d, this) == objM17291f) {
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

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z10) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z10;
        this.animatable = new Animatable<>(Offset.m24024boximpl(TextFieldMagnifierKt.m21508calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m21511getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m24024boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m21511getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m27074unboximpl();
    }

    private final void restartAnimationJob() {
        InterfaceC9212n interfaceC9212n = this.animationJob;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.animationJob = null;
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            this.animationJob = AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C18501(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m21512setMagnifierSizeozmzZPI(long j10) {
        this.magnifierSize$delegate.setValue(IntSize.m27062boximpl(j10));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.p013ui.layout.OnGloballyPositionedModifier
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
        if (AbstractC9133u.m16128b(transformedTextFieldState, transformedTextFieldState2) && AbstractC9133u.m16128b(textFieldSelectionState, textFieldSelectionState2) && AbstractC9133u.m16128b(textLayoutState, textLayoutState2) && z10 == z11) {
            return;
        }
        restartAnimationJob();
    }
}
