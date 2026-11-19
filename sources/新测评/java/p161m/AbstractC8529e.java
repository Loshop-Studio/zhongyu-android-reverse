package p161m;

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
public abstract class AbstractC8529e {
    /* renamed from: a */
    public static final Job m14023a(CoroutineScope coroutineScope, Function2 function2) {
        CoroutineDispatcher coroutineDispatcherM14028e = AbstractC8534j.m14028e(coroutineScope.getCoroutineContext());
        return (coroutineDispatcherM14028e == null || Intrinsics.areEqual(coroutineDispatcherM14028e, Dispatchers.getUnconfined())) ? BuildersKt.launch(coroutineScope, Dispatchers.getUnconfined(), CoroutineStart.UNDISPATCHED, function2) : BuildersKt.launch(CoroutineScopeKt.CoroutineScope(new C8527c(coroutineScope.getCoroutineContext())), new C8528d(coroutineDispatcherM14028e), CoroutineStart.UNDISPATCHED, function2);
    }
}
