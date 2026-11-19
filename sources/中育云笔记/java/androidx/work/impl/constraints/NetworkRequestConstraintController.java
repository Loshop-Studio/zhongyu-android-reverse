package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.InterfaceC10005f;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    @InterfaceC11829d(m26210c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m26211f = "WorkConstraintsTracker.kt", m26212l = {Opcodes.GETSTATIC}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1 */
    public static final class C48061 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48061(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, InterfaceC11588c<? super C48061> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C48061 c48061 = new C48061(this.$constraints, this.this$0, interfaceC11588c);
            c48061.L$0 = obj;
            return c48061;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
                NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
                if (requiredNetworkRequest == null) {
                    InterfaceC10005f.a.m20742a(interfaceC11395j.getChannel(), null, 1, null);
                    return C10786q.f26013a;
                }
                final InterfaceC10045g interfaceC10045gM24726d = AbstractC11117h.m24726d(interfaceC11395j, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, interfaceC11395j, null), 3, null);
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$onConstraintState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ConstraintsState) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(ConstraintsState it) {
                        AbstractC9979u.m20294g(it, "it");
                        InterfaceC10045g.a.m20900a(interfaceC10045gM24726d, null, 1, null);
                        interfaceC11395j.mo33808trySendJP2dKIU(it);
                    }
                };
                final InterfaceC9529a interfaceC9529aAddCallback = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, interfaceC9540l) : IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, interfaceC9540l);
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m33965invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m33965invoke() {
                        interfaceC9529aAddCallback.invoke();
                    }
                };
                this.label = 1;
                if (ProduceKt.m20713a(interfaceC11395j, interfaceC9529a, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C48061) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public NetworkRequestConstraintController(ConnectivityManager connManager, long j10) {
        AbstractC9979u.m20294g(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC11594c track(Constraints constraints) {
        AbstractC9979u.m20294g(constraints, "constraints");
        return AbstractC11596e.m25555e(new C48061(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j10, int i10, AbstractC9972n abstractC9972n) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
