package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    @InterfaceC9539d(m17800c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1 */
    public static final class C37821 extends SuspendLambda implements InterfaceC10575q {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C37821(InterfaceC9324c<? super C37821> interfaceC9324c) {
            super(3, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, InterfaceC9324c<? super Preferences> interfaceC9324c) {
            C37821 c37821 = new C37821(interfaceC9324c);
            c37821.L$0 = sharedPreferencesView;
            c37821.L$1 = preferences;
            return c37821.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                    AbstractC9133u.m16131e(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    mutablePreferences.set(keyStringSetKey, (Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 */
    public static final class C37831 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Set<String> $keysToMigrate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37831(Set<String> set, InterfaceC9324c<? super C37831> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$keysToMigrate = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37831 c37831 = new C37831(this.$keysToMigrate, interfaceC9324c);
            c37831.L$0 = obj;
            return c37831;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Preferences preferences, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37831) create(preferences, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            Set<Preferences.Key<?>> setKeySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z10 = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z10 = false;
                }
            }
            return AbstractC9536a.m17796a(z10);
        }
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(InterfaceC10559a interfaceC10559a, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(interfaceC10559a, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final InterfaceC10575q getMigrationFunction() {
        return new C37821(null);
    }

    private static final InterfaceC10574p getShouldRunMigration(Set<String> set) {
        return new C37831(set, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(InterfaceC10559a produceSharedPreferences) {
        AbstractC9133u.m16133g(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(InterfaceC10559a produceSharedPreferences, Set<String> keysToMigrate) {
        AbstractC9133u.m16133g(produceSharedPreferences, "produceSharedPreferences");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (AbstractC9126n) null);
        }
        return new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }
}
