package android.view.internal;

import android.os.Bundle;
import android.view.SavedStateRegistry;
import android.view.SavedStateWriter;
import android.view.internal.SavedStateHandleImpl;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5795j0;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010!\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010$R%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R(\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R+\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\t¨\u00060"}, m5110d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "key", "", "contains", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "initialValue", "Lkotlinx/coroutines/flow/m0;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/m0;", "Lkotlinx/coroutines/flow/y;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/y;", "", "keys", "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Ld6/s;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "providers", "flows", "mutableFlows", "getMutableFlows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider", "lifecycle-viewmodel-savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateHandleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,129:1\n381#2,7:130\n381#2,7:137\n27#3:144\n46#3:145\n32#3,4:146\n31#3,7:156\n126#4:150\n153#4,3:151\n37#5,2:154\n1#6:163\n106#7:164\n46#8:165\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n*L\n60#1:130,7\n76#1:137,7\n47#1:144\n47#1:145\n47#1:146,4\n47#1:156,7\n47#1:150\n47#1:151,3\n47#1:154,2\n47#1:163\n47#1:164\n47#1:165\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleImpl {

    @NotNull
    private final Map<String, InterfaceC5959y> flows;

    @NotNull
    private final Map<String, InterfaceC5959y> mutableFlows;

    @NotNull
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;

    @NotNull
    private final Map<String, Object> regular;

    @NotNull
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : AbstractC5785e0.m5156J(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((C5946n0) ((InterfaceC5959y) entry.getValue())).getValue());
        }
        for (Map.Entry entry2 : AbstractC5785e0.m5156J(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(new Pair(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    @MainThread
    public final void clearSavedStateProvider(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        this.providers.remove(key);
    }

    @MainThread
    public final boolean contains(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    @Nullable
    public final <T> T get(@NotNull String key) {
        T t8;
        AbstractC5830k.m5330g(key, "key");
        try {
            InterfaceC5959y interfaceC5959y = this.mutableFlows.get(key);
            if (interfaceC5959y != null && (t8 = (T) ((C5946n0) interfaceC5959y).getValue()) != null) {
                return t8;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @NotNull
    public final Map<String, InterfaceC5959y> getMutableFlows() {
        return this.mutableFlows;
    }

    @MainThread
    @NotNull
    public final <T> InterfaceC5959y getMutableStateFlow(@NotNull String key, T initialValue) {
        AbstractC5830k.m5330g(key, "key");
        Map<String, InterfaceC5959y> map = this.mutableFlows;
        InterfaceC5959y interfaceC5959yM5546b = map.get(key);
        if (interfaceC5959yM5546b == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC5959yM5546b = AbstractC5914h.m5546b(this.regular.get(key));
            map.put(key, interfaceC5959yM5546b);
        }
        return interfaceC5959yM5546b;
    }

    @NotNull
    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    @NotNull
    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    @NotNull
    public final <T> InterfaceC5944m0 getStateFlow(@NotNull String key, T initialValue) {
        AbstractC5830k.m5330g(key, "key");
        Map<String, InterfaceC5959y> map = this.flows;
        InterfaceC5959y interfaceC5959yM5546b = map.get(key);
        if (interfaceC5959yM5546b == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC5959yM5546b = AbstractC5914h.m5546b(this.regular.get(key));
            map.put(key, interfaceC5959yM5546b);
        }
        return new C5901a0(interfaceC5959yM5546b);
    }

    @MainThread
    @NotNull
    public final Set<String> keys() {
        return AbstractC5795j0.m5163x(this.regular.keySet(), this.providers.keySet());
    }

    @MainThread
    @Nullable
    public final <T> T remove(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        T t8 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t8;
    }

    @NotNull
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(@NotNull String key, @Nullable T value) {
        AbstractC5830k.m5330g(key, "key");
        this.regular.put(key, value);
        InterfaceC5959y interfaceC5959y = this.flows.get(key);
        if (interfaceC5959y != null) {
            ((C5946n0) interfaceC5959y).m5570j(value);
        }
        InterfaceC5959y interfaceC5959y2 = this.mutableFlows.get(key);
        if (interfaceC5959y2 != null) {
            ((C5946n0) interfaceC5959y2).m5570j(value);
        }
    }

    @MainThread
    public final void setSavedStateProvider(@NotNull String key, @NotNull SavedStateRegistry.SavedStateProvider provider) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(provider, "provider");
        this.providers.put(key, provider);
    }

    public SavedStateHandleImpl(@NotNull Map<String, ? extends Object> initialState) {
        AbstractC5830k.m5330g(initialState, "initialState");
        this.regular = AbstractC5785e0.m5158L(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: j.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f9063a);
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? AbstractC5785e0.m5147A() : map);
    }
}
