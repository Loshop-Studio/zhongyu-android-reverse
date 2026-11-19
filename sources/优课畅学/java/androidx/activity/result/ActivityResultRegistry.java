package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.random.Random;
import p101f8.AbstractC8476n;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final Map<Integer, String> rcToKey = new LinkedHashMap();
    private final Map<String, Integer> keyToRc = new LinkedHashMap();
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();
    private final List<String> launchedKeys = new ArrayList();
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();
    private final Bundle pendingResults = new Bundle();

    public static final class CallbackAndContract<O> {
        private final ActivityResultCallback<O> callback;
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(ActivityResultCallback<O> callback, ActivityResultContract<?, O> contract) {
            AbstractC9133u.m16133g(callback, "callback");
            AbstractC9133u.m16133g(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class LifecycleContainer {
        private final Lifecycle lifecycle;
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(Lifecycle lifecycle) {
            AbstractC9133u.m16133g(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(LifecycleEventObserver observer) {
            AbstractC9133u.m16133g(observer, "observer");
            this.lifecycle.addObserver(observer);
            this.observers.add(observer);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }

        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    private final void bindRcKey(int i10, String str) {
        this.rcToKey.put(Integer.valueOf(i10), str);
        this.keyToRc.put(str, Integer.valueOf(i10));
    }

    private final <O> void doDispatch(String str, int i10, Intent intent, CallbackAndContract<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null || !this.launchedKeys.contains(str)) {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i10, intent));
            this.launchedKeys.remove(str);
        }
    }

    private final int generateRandomNumber() {
        for (Number number : AbstractC8476n.m13834i(new InterfaceC10559a() { // from class: androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1
            @Override // p300x7.InterfaceC10559a
            public final Integer invoke() {
                return Integer.valueOf(Random.f17502a.mo2105c(2147418112) + 65536);
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC9133u.m16133g(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC9133u.m16133g(event, "event");
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                activityResultRegistry.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    activityResultRegistry.unregister$activity_release(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
            Object obj = activityResultRegistry.parsedPendingResults.get(str);
            activityResultRegistry.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void registerKey(String str) {
        if (this.keyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i10, int i11, Intent intent) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        doDispatch(str, i11, intent, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i10, ActivityResultContract<I, O> activityResultContract, I i11, ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (bundle2 != null) {
            this.pendingResults.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    AbstractC9116d0.m16095d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            AbstractC9133u.m16132f(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            AbstractC9133u.m16132f(str2, "keys[i]");
            bindRcKey(iIntValue, str2);
        }
    }

    public final void onSaveInstanceState(Bundle outState) {
        AbstractC9133u.m16133g(outState, "outState");
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    public final <I, O> ActivityResultLauncher<I> register(final String key, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> contract, final ActivityResultCallback<O> callback) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(lifecycleOwner, "lifecycleOwner");
        AbstractC9133u.m16133g(contract, "contract");
        AbstractC9133u.m16133g(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registerKey(key);
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ActivityResultRegistry.register$lambda$1(this.f217a, key, callback, contract, lifecycleOwner2, event);
            }
        });
        this.keyToLifecycleContainers.put(key, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.2
            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i10, ActivityOptionsCompat activityOptionsCompat) throws Exception {
                Object obj = ActivityResultRegistry.this.keyToRc.get(key);
                Object obj2 = contract;
                if (obj != null) {
                    int iIntValue = ((Number) obj).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(key);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, contract, i10, activityOptionsCompat);
                        return;
                    } catch (Exception e10) {
                        ActivityResultRegistry.this.launchedKeys.remove(key);
                        throw e10;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }

    @MainThread
    public final void unregister$activity_release(String key) {
        Integer numRemove;
        AbstractC9133u.m16133g(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class)));
            this.pendingResults.remove(key);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(key);
        }
    }

    @MainThread
    public final <O> boolean dispatchResult(int i10, O o10) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o10);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        AbstractC9133u.m16131e(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(o10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> register(final String key, final ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(contract, "contract");
        AbstractC9133u.m16133g(callback, "callback");
        registerKey(key);
        this.keyToCallback.put(key, new CallbackAndContract<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i10, ActivityOptionsCompat activityOptionsCompat) throws Exception {
                Object obj2 = ActivityResultRegistry.this.keyToRc.get(key);
                Object obj3 = contract;
                if (obj2 != null) {
                    int iIntValue = ((Number) obj2).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(key);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, contract, i10, activityOptionsCompat);
                        return;
                    } catch (Exception e10) {
                        ActivityResultRegistry.this.launchedKeys.remove(key);
                        throw e10;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }
}
