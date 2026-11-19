package p103m;

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
public abstract class AbstractC7362e {
    /* renamed from: a */
    public static final Job m8369a(CoroutineScope coroutineScope, Function2 function2) {
        CoroutineDispatcher coroutineDispatcherM8372c = AbstractC7365h.m8372c(coroutineScope.getCoroutineContext());
        return (coroutineDispatcherM8372c == null || Intrinsics.areEqual(coroutineDispatcherM8372c, Dispatchers.getUnconfined())) ? BuildersKt.launch(coroutineScope, Dispatchers.getUnconfined(), CoroutineStart.UNDISPATCHED, function2) : BuildersKt.launch(CoroutineScopeKt.CoroutineScope(new C7360c(coroutineScope.getCoroutineContext())), new C7361d(coroutineDispatcherM8372c), CoroutineStart.UNDISPATCHED, function2);
    }
}
