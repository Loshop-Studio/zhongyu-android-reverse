package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", m26211f = "SelectionMagnifier.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_FIELD}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, InterfaceC11588c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, interfaceC11588c);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    return Offset.m30626boximpl(m28234invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m28234invokeF1C5BW0() {
                    return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", m26211f = "SelectionMagnifier.kt", m26212l = {98}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Animatable<Offset, AnimationVector2D> animatable, long j10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$animatable = animatable;
                        this.$targetValue = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
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
                    return m28235emit3MmeM6k(((Offset) obj2).m30647unboximpl(), interfaceC11588c);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m28235emit3MmeM6k(long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if ((animatable.getValue().m30647unboximpl() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || (j10 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats || Float.intBitsToFloat((int) (animatable.getValue().m30647unboximpl() & 4294967295L)) == Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                        Object objSnapTo = animatable.snapTo(Offset.m30626boximpl(j10), interfaceC11588c);
                        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
                    }
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(animatable, j10, null), 3, null);
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
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
