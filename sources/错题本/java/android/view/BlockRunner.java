package android.view;

import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00127\u0010\u000b\u001a3\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017RE\u0010\u000b\u001a3\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, m5110d2 = {"Landroidx/lifecycle/BlockRunner;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lh6/c;", "Ld6/s;", "Landroidx/lifecycle/Block;", "Lkotlin/ExtensionFunctionType;", "block", "", "timeoutInMs", "Lkotlinx/coroutines/v;", "scope", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lr6/e;JLkotlinx/coroutines/v;Lr6/a;)V", "maybeRun", "()V", "cancel", "Landroidx/lifecycle/CoroutineLiveData;", "Lr6/e;", "J", "Lkotlinx/coroutines/v;", "Lr6/a;", "Lkotlinx/coroutines/w0;", "runningJob", "Lkotlinx/coroutines/w0;", "cancellationJob", "lifecycle-livedata_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BlockRunner<T> {

    @NotNull
    private final InterfaceC6473e block;

    @Nullable
    private InterfaceC6013w0 cancellationJob;

    @NotNull
    private final CoroutineLiveData<T> liveData;

    @NotNull
    private final InterfaceC6469a onDone;

    @Nullable
    private InterfaceC6013w0 runningJob;

    @NotNull
    private final InterfaceC6009v scope;
    private final long timeoutInMs;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.BlockRunner$cancel$1", m5303f = "CoroutineLiveData.kt", m5304i = {}, m5305l = {180}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.BlockRunner$cancel$1 */
    public static final class C27181 extends SuspendLambda implements InterfaceC6473e {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27181(BlockRunner<T> blockRunner, InterfaceC5631c<? super C27181> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C27181(this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                long j7 = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                if (AbstractC6014x.m5638i(j7, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                InterfaceC6013w0 interfaceC6013w0 = ((BlockRunner) this.this$0).runningJob;
                if (interfaceC6013w0 != null) {
                    interfaceC6013w0.cancel(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27181) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.BlockRunner$maybeRun$1", m5303f = "CoroutineLiveData.kt", m5304i = {}, m5305l = {168}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.BlockRunner$maybeRun$1 */
    public static final class C27191 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27191(BlockRunner<T> blockRunner, InterfaceC5631c<? super C27191> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C27191 c27191 = new C27191(this.this$0, interfaceC5631c);
            c27191.L$0 = obj;
            return c27191;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((InterfaceC6009v) this.L$0).getCoroutineContext());
                InterfaceC6473e interfaceC6473e = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (interfaceC6473e.invoke(liveDataScopeImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27191) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public BlockRunner(@NotNull CoroutineLiveData<T> liveData, @NotNull InterfaceC6473e block, long j7, @NotNull InterfaceC6009v scope, @NotNull InterfaceC6469a onDone) {
        AbstractC5830k.m5330g(liveData, "liveData");
        AbstractC5830k.m5330g(block, "block");
        AbstractC5830k.m5330g(scope, "scope");
        AbstractC5830k.m5330g(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j7;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        InterfaceC6009v interfaceC6009v = this.scope;
        C5609e c5609e = AbstractC5896f0.f9343a;
        this.cancellationJob = AbstractC6014x.m5651v(interfaceC6009v, AbstractC5479k.f8471a.f8411d, null, new C27181(this, null), 2);
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC6013w0 interfaceC6013w0 = this.cancellationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = AbstractC6014x.m5651v(this.scope, null, null, new C27191(this, null), 3);
    }
}
