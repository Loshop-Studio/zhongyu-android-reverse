package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class Recreator implements LifecycleEventObserver {
    public static final String CLASSES_KEY = "classes_to_restore";
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner owner;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        private final Set<String> classes;

        public SavedStateProvider(SavedStateRegistry registry) {
            AbstractC9979u.m20294g(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        public final void add(String className) {
            AbstractC9979u.m20294g(className, "className");
            this.classes.add(className);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public Bundle saveState() {
            Pair[] pairArr;
            Map mapM20088h = AbstractC9925a.m20088h();
            if (mapM20088h.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM20088h.size());
                for (Map.Entry entry : mapM20088h.entrySet()) {
                    arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m33945putStringListimpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf), Recreator.CLASSES_KEY, AbstractC10947g0.m23922X0(this.classes));
            return bundleBundleOf;
        }
    }

    public Recreator(SavedStateRegistryOwner owner) {
        AbstractC9979u.m20294g(owner, "owner");
        this.owner = owner;
    }

    private final void reflectiveNew(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            AbstractC9979u.m20291d(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC9979u.m20291d(objNewInstance);
                    ((SavedStateRegistry.AutoRecreated) objNewInstance).onRecreated(this.owner);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        Bundle bundleConsumeRestoredStateForKey = this.owner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        List<String> listM33899getStringListOrNullimpl = SavedStateReader.m33899getStringListOrNullimpl(SavedStateReader.m33824constructorimpl(bundleConsumeRestoredStateForKey), CLASSES_KEY);
        if (listM33899getStringListOrNullimpl == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listM33899getStringListOrNullimpl.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }
}
