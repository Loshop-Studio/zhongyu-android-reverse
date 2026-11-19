package android.view;

import android.view.Lifecycle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "(Lkotlinx/coroutines/flow/f;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Lkotlinx/coroutines/flow/f;", "lifecycle-runtime_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FlowExtKt {

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m5303f = "FlowExt.kt", m5304i = {0}, m5305l = {90}, m5306m = "invokeSuspend", m5307n = {"$this$callbackFlow"}, m5308s = {"L$0"})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    public static final class C27231 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC5910f $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
        @DebugMetadata(m5302c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m5303f = "FlowExt.kt", m5304i = {}, m5305l = {90}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC5884m $$this$callbackFlow;
            final /* synthetic */ InterfaceC5910f $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC5910f interfaceC5910f, InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_flowWithLifecycle = interfaceC5910f;
                this.$$this$callbackFlow = interfaceC5884m;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC5910f interfaceC5910f = this.$this_flowWithLifecycle;
                    final InterfaceC5884m interfaceC5884m = this.$$this$callbackFlow;
                    InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.flow.InterfaceC5912g
                        public final Object emit(T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            Object objMo5494q = ((C5883l) interfaceC5884m).f9333d.mo5494q(interfaceC5631c, t8);
                            return objMo5494q == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5494q : C5443s.f8405a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC5910f.collect(interfaceC5912g, this) == coroutineSingletons) {
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

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27231(Lifecycle lifecycle, Lifecycle.State state, InterfaceC5910f interfaceC5910f, InterfaceC5631c<? super C27231> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC5910f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C27231 c27231 = new C27231(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC5631c);
            c27231.L$0 = obj;
            return c27231;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC5884m interfaceC5884m;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5884m interfaceC5884m2 = (InterfaceC5884m) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, interfaceC5884m2, null);
                this.L$0 = interfaceC5884m2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5884m = interfaceC5884m2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5884m = (InterfaceC5884m) this.L$0;
                AbstractC5774b.m5119b(obj);
            }
            ((C5883l) interfaceC5884m).mo5489l(null);
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27231) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @NotNull
    public static final <T> InterfaceC5910f flowWithLifecycle(@NotNull InterfaceC5910f interfaceC5910f, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minActiveState) {
        AbstractC5830k.m5330g(interfaceC5910f, "<this>");
        AbstractC5830k.m5330g(lifecycle, "lifecycle");
        AbstractC5830k.m5330g(minActiveState, "minActiveState");
        return AbstractC5914h.m5551g(new C27231(lifecycle, minActiveState, interfaceC5910f, null));
    }

    public static /* synthetic */ InterfaceC5910f flowWithLifecycle$default(InterfaceC5910f interfaceC5910f, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC5910f, lifecycle, state);
    }
}
