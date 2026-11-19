package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final long DefaultNetworkRequestTimeoutMs = 1000;
    private static final String TAG;

    @InterfaceC11829d(m26210c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", m26211f = "WorkConstraintsTracker.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1 */
    public static final class C48111 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ OnConstraintsStateChangedListener $listener;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ WorkConstraintsTracker $this_listen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48111(WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, OnConstraintsStateChangedListener onConstraintsStateChangedListener, InterfaceC11588c<? super C48111> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_listen = workConstraintsTracker;
            this.$spec = workSpec;
            this.$listener = onConstraintsStateChangedListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C48111(this.$this_listen, this.$spec, this.$listener, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cTrack = this.$this_listen.track(this.$spec);
                final OnConstraintsStateChangedListener onConstraintsStateChangedListener = this.$listener;
                final WorkSpec workSpec = this.$spec;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen.1.1
                    public final Object emit(ConstraintsState constraintsState, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        onConstraintsStateChangedListener.onConstraintsStateChanged(workSpec, constraintsState);
                        return C10786q.f26013a;
                    }

                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((ConstraintsState) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }
                };
                this.label = 1;
                if (interfaceC11594cTrack.collect(interfaceC11595d, this) == objM25952f) {
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
            return ((C48111) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = strTagWithPrefix;
    }

    @RequiresApi(28)
    public static final NetworkRequestConstraintController NetworkRequestConstraintController(Context context) {
        AbstractC9979u.m20294g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final InterfaceC10045g listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, AbstractC11106e0 dispatcher, OnConstraintsStateChangedListener listener) {
        AbstractC9979u.m20294g(workConstraintsTracker, "<this>");
        AbstractC9979u.m20294g(spec, "spec");
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        AbstractC9979u.m20294g(listener, "listener");
        return AbstractC11117h.m24726d(AbstractC10006d.m20744a(dispatcher), null, null, new C48111(workConstraintsTracker, spec, listener, null), 3, null);
    }
}
