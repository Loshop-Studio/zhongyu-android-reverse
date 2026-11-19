package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<C10786q> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i10, ActivityResultRegistry registry, final InterfaceC9540l callback) {
        AbstractC9979u.m20294g(activityResultCaller, "<this>");
        AbstractC9979u.m20294g(contract, "contract");
        AbstractC9979u.m20294g(registry, "registry");
        AbstractC9979u.m20294g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                callback.invoke(obj);
            }
        }), contract, i10);
    }

    public static final <I, O> ActivityResultLauncher<C10786q> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i10, final InterfaceC9540l callback) {
        AbstractC9979u.m20294g(activityResultCaller, "<this>");
        AbstractC9979u.m20294g(contract, "contract");
        AbstractC9979u.m20294g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                callback.invoke(obj);
            }
        }), contract, i10);
    }
}
