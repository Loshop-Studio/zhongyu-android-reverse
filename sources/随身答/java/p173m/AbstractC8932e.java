package p173m;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* renamed from: m.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8932e {
    /* renamed from: a */
    public static final Job m14225a(CoroutineScope coroutineScope, Function2 function2) {
        CoroutineDispatcher coroutineDispatcherM14230e = AbstractC8937j.m14230e(coroutineScope.getCoroutineContext());
        return (coroutineDispatcherM14230e == null || Intrinsics.areEqual(coroutineDispatcherM14230e, Dispatchers.getUnconfined())) ? BuildersKt.launch(coroutineScope, Dispatchers.getUnconfined(), CoroutineStart.UNDISPATCHED, function2) : BuildersKt.launch(CoroutineScopeKt.CoroutineScope(new C8930c(coroutineScope.getCoroutineContext())), new C8931d(coroutineDispatcherM14230e), CoroutineStart.UNDISPATCHED, function2);
    }
}
