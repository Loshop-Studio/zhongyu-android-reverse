package android.view.result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C5842c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p184v6.AbstractC6671c;
import p214z6.C6823a;
import p214z6.C6835m;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\b&\u0018\u0000 B2\u00020\u0001:\u0003CBDB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00101\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000209058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\"\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010@\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, m5110d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "callbackAndContract", "Ld6/s;", "doDispatch", "(Ljava/lang/String;ILandroid/content/Intent;Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;)V", "registerKey", "(Ljava/lang/String;)V", "generateRandomNumber", "()I", "rc", "bindRcKey", "(ILjava/lang/String;)V", "I", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "unregister$activity_release", "unregister", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "", "dispatchResult", "(IILandroid/content/Intent;)Z", "result", "(ILjava/lang/Object;)Z", "", "rcToKey", "Ljava/util/Map;", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "keyToLifecycleContainers", "", "launchedKeys", "Ljava/util/List;", "keyToCallback", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "Companion", "CallbackAndContract", "LifecycleContainer", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,422:1\n123#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n380#1:423,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    @NotNull
    private static final String LOG_TAG = "ActivityResultRegistry";

    @NotNull
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    @NotNull
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    @NotNull
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();

    @NotNull
    private final List<String> launchedKeys = new ArrayList();

    @NotNull
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();

    @NotNull
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    @NotNull
    private final Bundle pendingResults = new Bundle();

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "callback", "Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CallbackAndContract<O> {

        @NotNull
        private final ActivityResultCallback<O> callback;

        @NotNull
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(@NotNull ActivityResultCallback<O> callback, @NotNull ActivityResultContract<?, O> contract) {
            AbstractC5830k.m5330g(callback, "callback");
            AbstractC5830k.m5330g(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        @NotNull
        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        @NotNull
        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m5110d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "()V", "INITIAL_REQUEST_CODE_VALUE", "", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, "", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, "LOG_TAG", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Ld6/s;", "addObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "clearObservers", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "observers", "Ljava/util/List;", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n402#1:423,2\n*E\n"})
    public static final class LifecycleContainer {

        @NotNull
        private final Lifecycle lifecycle;

        @NotNull
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(@NotNull Lifecycle lifecycle) {
            AbstractC5830k.m5330g(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(@NotNull LifecycleEventObserver observer) {
            AbstractC5830k.m5330g(observer, "observer");
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

        @NotNull
        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    private final void bindRcKey(int rc, String key) {
        this.rcToKey.put(Integer.valueOf(rc), key);
        this.keyToRc.put(key, Integer.valueOf(rc));
    }

    private final <O> void doDispatch(String key, int resultCode, Intent data, CallbackAndContract<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        } else {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int generateRandomNumber() {
        C00971 nextFunction = new InterfaceC6469a() { // from class: androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1
            @Override // p152r6.InterfaceC6469a
            public final Integer invoke() {
                return Integer.valueOf(AbstractC6671c.Default.nextInt(2147418112) + 65536);
            }
        };
        AbstractC5830k.m5330g(nextFunction, "nextFunction");
        Iterator it = new C6823a(new C5842c(nextFunction, new C6835m(nextFunction, 0))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC5830k.m5330g(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC5830k.m5330g(event, "event");
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

    private final void registerKey(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), key);
    }

    @MainThread
    public final boolean dispatchResult(int requestCode, int resultCode, @Nullable Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        doDispatch(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int requestCode, @NotNull ActivityResultContract<I, O> contract, I input, @Nullable ActivityOptionsCompat options);

    public final void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    AbstractC5835p.m5353b(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i);
            AbstractC5830k.m5329f(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i);
            AbstractC5830k.m5329f(str2, "keys[i]");
            bindRcKey(iIntValue, str2);
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle outState) {
        AbstractC5830k.m5330g(outState, "outState");
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> register(@NotNull final String key, @NotNull LifecycleOwner lifecycleOwner, @NotNull final ActivityResultContract<I, O> contract, @NotNull final ActivityResultCallback<O> callback) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(lifecycleOwner, "lifecycleOwner");
        AbstractC5830k.m5330g(contract, "contract");
        AbstractC5830k.m5330g(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registerKey(key);
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.b
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ActivityResultRegistry.register$lambda$1(this.f159a, key, callback, contract, lifecycleOwner2, event);
            }
        });
        this.keyToLifecycleContainers.put(key, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.2
            @Override // android.view.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // android.view.result.ActivityResultLauncher
            public void launch(I input, ActivityOptionsCompat options) throws Exception {
                Object obj = ActivityResultRegistry.this.keyToRc.get(key);
                Object obj2 = contract;
                if (obj == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj).intValue();
                ActivityResultRegistry.this.launchedKeys.add(key);
                try {
                    ActivityResultRegistry.this.onLaunch(iIntValue, contract, input, options);
                } catch (Exception e) {
                    ActivityResultRegistry.this.launchedKeys.remove(key);
                    throw e;
                }
            }

            @Override // android.view.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }

    @MainThread
    public final void unregister$activity_release(@NotNull String key) {
        Integer numRemove;
        AbstractC5830k.m5330g(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Dropping pending result for request ", key, ": ");
            sbM100y.append(this.parsedPendingResults.get(key));
            Log.w(LOG_TAG, sbM100y.toString());
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
    public final <O> boolean dispatchResult(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        AbstractC5830k.m5328e(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(result);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <I, O> ActivityResultLauncher<I> register(@NotNull final String key, @NotNull final ActivityResultContract<I, O> contract, @NotNull ActivityResultCallback<O> callback) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(contract, "contract");
        AbstractC5830k.m5330g(callback, "callback");
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
            @Override // android.view.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // android.view.result.ActivityResultLauncher
            public void launch(I input, ActivityOptionsCompat options) throws Exception {
                Object obj2 = ActivityResultRegistry.this.keyToRc.get(key);
                Object obj3 = contract;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ActivityResultRegistry.this.launchedKeys.add(key);
                try {
                    ActivityResultRegistry.this.onLaunch(iIntValue, contract, input, options);
                } catch (Exception e) {
                    ActivityResultRegistry.this.launchedKeys.remove(key);
                    throw e;
                }
            }

            @Override // android.view.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }
}
