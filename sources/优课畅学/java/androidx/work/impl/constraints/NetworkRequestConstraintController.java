package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.InterfaceC9163f;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p157k8.InterfaceC9071g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    @InterfaceC9539d(m17800c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m17801f = "WorkConstraintsTracker.kt", m17802l = {178}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1 */
    public static final class C48581 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48581(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, InterfaceC9324c<? super C48581> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C48581 c48581 = new C48581(this.$constraints, this.this$0, interfaceC9324c);
            c48581.L$0 = obj;
            return c48581;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.L$0;
                NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
                if (requiredNetworkRequest == null) {
                    InterfaceC9163f.a.m16549a(interfaceC9071g.getChannel(), null, 1, null);
                    return C8736p.f16368a;
                }
                final InterfaceC9212n interfaceC9212nM14861d = AbstractC8839h.m14861d(interfaceC9071g, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, interfaceC9071g, null), 3, null);
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$onConstraintState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ConstraintsState) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(ConstraintsState it) {
                        AbstractC9133u.m16133g(it, "it");
                        InterfaceC9212n.a.m16777a(interfaceC9212nM14861d, null, 1, null);
                        interfaceC9071g.mo27213trySendJP2dKIU(it);
                    }
                };
                final InterfaceC10559a interfaceC10559aAddCallback = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, interfaceC10570l) : IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, interfaceC10570l);
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.1
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27370invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27370invoke() {
                        interfaceC10559aAddCallback.invoke();
                    }
                };
                this.label = 1;
                if (ProduceKt.m16521a(interfaceC9071g, interfaceC10559a, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C48581) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public NetworkRequestConstraintController(ConnectivityManager connManager, long j10) {
        AbstractC9133u.m16133g(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC9133u.m16133g(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        AbstractC9133u.m16133g(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC9266c track(Constraints constraints) {
        AbstractC9133u.m16133g(constraints, "constraints");
        return AbstractC9268e.m17015e(new C48581(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j10, int i10, AbstractC9126n abstractC9126n) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
