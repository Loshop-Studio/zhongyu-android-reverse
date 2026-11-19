package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<C8736p> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i10, ActivityResultRegistry registry, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(activityResultCaller, "<this>");
        AbstractC9133u.m16133g(contract, "contract");
        AbstractC9133u.m16133g(registry, "registry");
        AbstractC9133u.m16133g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                callback.invoke(obj);
            }
        }), contract, i10);
    }

    public static final <I, O> ActivityResultLauncher<C8736p> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i10, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(activityResultCaller, "<this>");
        AbstractC9133u.m16133g(contract, "contract");
        AbstractC9133u.m16133g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                callback.invoke(obj);
            }
        }), contract, i10);
    }
}
