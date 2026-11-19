package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/NestedScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/NestedScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", m5303f = "Scrollable.kt", m5304i = {}, m5305l = {1024}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j7, Ref$FloatRef ref$FloatRef, InterfaceC5631c<? super ScrollableKt$semanticsScrollBy$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j7;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, interfaceC5631c);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            float fM7051toFloatk4lQ0M = this.$this_semanticsScrollBy.m7051toFloatk4lQ0M(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return C5443s.f8405a;
                }

                public final void invoke(float f, float f7) {
                    float f8 = f - ref$FloatRef.element;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    ref$FloatRef.element += scrollingLogic2.reverseIfNeeded(scrollingLogic2.m7051toFloatk4lQ0M(nestedScrollScope.mo7005scrollByOzD1aCk(scrollingLogic2.m7052toOffsettuRUvjQ(scrollingLogic2.reverseIfNeeded(f8)), NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI())));
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, fM7051toFloatk4lQ0M, 0.0f, null, interfaceC6473e, this, 12, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
