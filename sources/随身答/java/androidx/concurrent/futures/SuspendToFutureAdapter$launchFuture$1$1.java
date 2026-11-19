package androidx.concurrent.futures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1<T> extends FunctionReferenceImpl implements Function1<Continuation<? super T>, Object>, SuspendFunction {
    public SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, Deferred.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super T> continuation) {
        return ((Deferred) this.receiver).await(continuation);
    }
}
