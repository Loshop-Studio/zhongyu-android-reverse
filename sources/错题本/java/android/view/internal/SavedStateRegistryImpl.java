package android.view.internal;

import android.os.Bundle;
import android.view.C2766k;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.SavedStateReader;
import android.view.SavedStateRegistry;
import android.view.SavedStateRegistryOwner;
import android.view.SavedStateWriter;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.navigation.internal.C2863b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u00052\n\u0010\u001d\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00100\u001a\u00020*2\u0006\u0010/\u001a\u00020*8G@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u00101\"\u0004\b4\u00105¨\u00067"}, m5110d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Lkotlin/Function0;", "Ld6/s;", "onAttach", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Lr6/a;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "registerSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "getSavedStateProvider", "(Ljava/lang/String;)Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "unregisterSavedStateProvider", "(Ljava/lang/String;)V", "performAttach", "()V", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performRestore", "outBundle", "performSave$savedstate_release", "performSave", "Landroidx/savedstate/SavedStateRegistryOwner;", "Lr6/a;", "getOnAttach$savedstate_release", "()Lr6/a;", "Landroidx/savedstate/internal/SynchronizedObject;", "lock", "Landroidx/savedstate/internal/SynchronizedObject;", "", "keyToProviders", "Ljava/util/Map;", "", "attached", "Z", "restoredState", "Landroid/os/Bundle;", "value", "isRestored", "()Z", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "Companion", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateRegistryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistryImpl.kt\nandroidx/savedstate/internal/SavedStateRegistryImpl\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n+ 4 SynchronizedObject.jvm.kt\nandroidx/savedstate/internal/SynchronizedObject_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,154:1\n90#2:155\n106#2:156\n90#2:157\n90#2:165\n106#2:186\n90#2:189\n106#2:190\n41#3:158\n41#3:160\n41#3:162\n41#3:187\n23#4:159\n23#4:161\n23#4:163\n23#4:188\n1#5:164\n1#5:185\n27#6:166\n46#6:167\n32#6,4:168\n31#6,7:178\n126#7:172\n153#7,3:173\n37#8,2:176\n*S KotlinDebug\n*F\n+ 1 SavedStateRegistryImpl.kt\nandroidx/savedstate/internal/SavedStateRegistryImpl\n*L\n55#1:155\n56#1:156\n57#1:157\n121#1:165\n135#1:186\n144#1:189\n145#1:190\n66#1:158\n75#1:160\n84#1:162\n137#1:187\n66#1:159\n75#1:161\n84#1:163\n137#1:188\n135#1:185\n135#1:166\n135#1:167\n135#1:168,4\n135#1:178,7\n135#1:172\n135#1:173,3\n135#1:176,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateRegistryImpl {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private boolean isAllowingSavingState;
    private boolean isRestored;

    @NotNull
    private final Map<String, SavedStateRegistry.SavedStateProvider> keyToProviders;

    @NotNull
    private final SynchronizedObject lock;

    @NotNull
    private final InterfaceC6469a onAttach;

    @NotNull
    private final SavedStateRegistryOwner owner;

    @Nullable
    private Bundle restoredState;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m5110d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl$Companion;", "", "<init>", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
    }

    public SavedStateRegistryImpl(@NotNull SavedStateRegistryOwner owner, @NotNull InterfaceC6469a onAttach) {
        AbstractC5830k.m5330g(owner, "owner");
        AbstractC5830k.m5330g(onAttach, "onAttach");
        this.owner = owner;
        this.onAttach = onAttach;
        this.lock = new SynchronizedObject();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$12(SavedStateRegistryImpl savedStateRegistryImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC5830k.m5330g(lifecycleOwner, "<unused var>");
        AbstractC5830k.m5330g(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistryImpl.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistryImpl.isAllowingSavingState = false;
        }
    }

    @MainThread
    @Nullable
    public final Bundle consumeRestoredStateForKey(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(bundle);
        Bundle bundleM13654getSavedStateimpl = SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, key) ? SavedStateReader.m13654getSavedStateimpl(bundleM13597constructorimpl, key) : null;
        SavedStateWriter.m13719removeimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
        if (SavedStateReader.m13675isEmptyimpl(SavedStateReader.m13597constructorimpl(bundle))) {
            this.restoredState = null;
        }
        return bundleM13654getSavedStateimpl;
    }

    @NotNull
    /* renamed from: getOnAttach$savedstate_release, reason: from getter */
    public final InterfaceC6469a getOnAttach() {
        return this.onAttach;
    }

    @Nullable
    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider(@NotNull String key) {
        SavedStateRegistry.SavedStateProvider savedStateProvider;
        AbstractC5830k.m5330g(key, "key");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                SavedStateRegistry.SavedStateProvider savedStateProvider2 = (SavedStateRegistry.SavedStateProvider) entry.getValue();
                if (AbstractC5830k.m5325b(str, key)) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    /* renamed from: isAllowingSavingState$savedstate_release, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    @MainThread
    /* renamed from: isRestored, reason: from getter */
    public final boolean getIsRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach() {
        if (this.owner.getLifecycle().getState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.getLifecycle().addObserver(new C2863b(this, 1));
        this.attached = true;
    }

    @MainThread
    public final void performRestore$savedstate_release(@Nullable Bundle savedState) {
        if (!this.attached) {
            performAttach();
        }
        if (this.owner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.getLifecycle().getState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM13654getSavedStateimpl = null;
        if (savedState != null) {
            Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(savedState);
            if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, SAVED_COMPONENTS_KEY)) {
                bundleM13654getSavedStateimpl = SavedStateReader.m13654getSavedStateimpl(bundleM13597constructorimpl, SAVED_COMPONENTS_KEY);
            }
        }
        this.restoredState = bundleM13654getSavedStateimpl;
        this.isRestored = true;
    }

    @MainThread
    public final void performSave$savedstate_release(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(outBundle, "outBundle");
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m13687putAllimpl(bundleM13683constructorimpl, bundle);
        }
        synchronized (this.lock) {
            for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                SavedStateWriter.m13710putSavedStateimpl(bundleM13683constructorimpl, (String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
            }
        }
        if (SavedStateReader.m13675isEmptyimpl(SavedStateReader.m13597constructorimpl(bundleBundleOf))) {
            return;
        }
        SavedStateWriter.m13710putSavedStateimpl(SavedStateWriter.m13683constructorimpl(outBundle), SAVED_COMPONENTS_KEY, bundleBundleOf);
    }

    @MainThread
    public final void registerSavedStateProvider(@NotNull String key, @NotNull SavedStateRegistry.SavedStateProvider provider) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(provider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z8) {
        this.isAllowingSavingState = z8;
    }

    @MainThread
    public final void unregisterSavedStateProvider(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        synchronized (this.lock) {
        }
    }

    public /* synthetic */ SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, InterfaceC6469a interfaceC6469a, int i, AbstractC5824e abstractC5824e) {
        this(savedStateRegistryOwner, (i & 2) != 0 ? new C2766k(5) : interfaceC6469a);
    }
}
