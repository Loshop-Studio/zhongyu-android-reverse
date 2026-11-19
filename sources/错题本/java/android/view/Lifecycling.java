package android.view;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import p045d6.C5434j;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0007J \u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002J\u001e\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\u0015\u001a\u00020\u00052\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\u0016\u001a\u00020\u00052\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m5110d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "REFLECTIVE_CALLBACK", "", "GENERATED_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "object", "createGeneratedAdapter", "constructor", "generatedConstructor", "klass", "getObserverConstructorType", "resolveObserverCallbackType", "isLifecycleParent", "", "getAdapterName", "", "className", "lifecycle-common"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;

    @NotNull
    public static final Lifecycling INSTANCE = new Lifecycling();

    @NotNull
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    @NotNull
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            GeneratedAdapter generatedAdapterNewInstance = constructor.newInstance(object);
            AbstractC5830k.m5327d(generatedAdapterNewInstance);
            return generatedAdapterNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> klass) throws NoSuchMethodException, SecurityException {
        try {
            Package r02 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            AbstractC5830k.m5327d(name);
            if (name.length() != 0) {
                AbstractC5830k.m5327d(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC5830k.m5329f(canonicalName, "substring(...)");
            }
            AbstractC5830k.m5327d(canonicalName);
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + '.' + adapterName;
            }
            Constructor declaredConstructor = Class.forName(adapterName).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getAdapterName(@NotNull String className) {
        AbstractC5830k.m5330g(className, "className");
        return AbstractC5862w.m5407A(className, ".", "_").concat("_LifecycleAdapter");
    }

    private final int getObserverConstructorType(Class<?> klass) throws NoSuchMethodException, SecurityException {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(klass);
        map.put(klass, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    @JvmStatic
    @NotNull
    public static final LifecycleEventObserver lifecycleEventObserver(@NotNull Object object) {
        AbstractC5830k.m5330g(object, "object");
        boolean z8 = object instanceof LifecycleEventObserver;
        boolean z9 = object instanceof DefaultLifecycleObserver;
        if (z8 && z9) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z9) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z8) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        AbstractC5830k.m5327d(list);
        List<Constructor<? extends GeneratedAdapter>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i = 0; i < size; i++) {
            generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> klass) throws NoSuchMethodException, SecurityException {
        ArrayList arrayList;
        if (klass.getCanonicalName() != null) {
            Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(klass);
            if (constructorGeneratedConstructor != null) {
                classToAdapters.put(klass, AbstractC5806u.m5286y(constructorGeneratedConstructor));
                return 2;
            }
            if (!ClassesInfoCache.sInstance.hasLifecycleMethods(klass)) {
                Class<? super Object> superclass = klass.getSuperclass();
                if (isLifecycleParent(superclass)) {
                    AbstractC5830k.m5327d(superclass);
                    if (getObserverConstructorType(superclass) != 1) {
                        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                        AbstractC5830k.m5327d(list);
                        arrayList = new ArrayList(list);
                    }
                } else {
                    arrayList = null;
                }
                C5434j c5434jM5335l = AbstractC5830k.m5335l(klass.getInterfaces());
                while (true) {
                    if (c5434jM5335l.hasNext()) {
                        Class<?> cls = (Class) c5434jM5335l.next();
                        if (isLifecycleParent(cls)) {
                            AbstractC5830k.m5327d(cls);
                            if (getObserverConstructorType(cls) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls);
                            AbstractC5830k.m5327d(list2);
                            arrayList.addAll(list2);
                        }
                    } else if (arrayList != null) {
                        classToAdapters.put(klass, arrayList);
                        return 2;
                    }
                }
            }
        }
        return 1;
    }
}
