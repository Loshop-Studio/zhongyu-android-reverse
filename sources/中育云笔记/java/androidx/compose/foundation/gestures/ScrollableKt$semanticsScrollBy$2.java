package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", m26211f = "Scrollable.kt", m26212l = {1024}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j10, Ref$FloatRef ref$FloatRef, InterfaceC11588c<? super ScrollableKt$semanticsScrollBy$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j10;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, interfaceC11588c);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            float fM27247toFloatk4lQ0M = this.$this_semanticsScrollBy.m27247toFloatk4lQ0M(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return C10786q.f26013a;
                }

                public final void invoke(float f10, float f11) {
                    float f12 = f10 - ref$FloatRef.f23399c;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    ref$FloatRef.f23399c += scrollingLogic2.reverseIfNeeded(scrollingLogic2.m27247toFloatk4lQ0M(nestedScrollScope.mo27201scrollByOzD1aCk(scrollingLogic2.m27248toOffsettuRUvjQ(scrollingLogic2.reverseIfNeeded(f12)), NestedScrollSource.Companion.m31996getUserInputWNlRxjI())));
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, fM27247toFloatk4lQ0M, 0.0f, null, interfaceC9544p, this, 12, null) == objM25952f) {
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
}
