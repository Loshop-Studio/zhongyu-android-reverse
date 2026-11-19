package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final InterfaceC10575q migrate;
    private final String name;
    private final InterfaceC8724d sharedPrefs$delegate;
    private final InterfaceC10574p shouldRunMigration;

    @InterfaceC9539d(m17800c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    public static final class C37741 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C37741(InterfaceC9324c<? super C37741> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37741(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C37741) obj, (InterfaceC9324c<? super Boolean>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(true);
        }

        public final Object invoke(T t10, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37741) create(t10, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    public static final class C37752 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C37752(InterfaceC9324c<? super C37752> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37752(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C37752) obj, (InterfaceC9324c<? super Boolean>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(true);
        }

        public final Object invoke(T t10, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37752) create(t10, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    public static final class C37763 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C37763(InterfaceC9324c<? super C37763> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37763(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C37763) obj, (InterfaceC9324c<? super Boolean>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(true);
        }

        public final Object invoke(T t10, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37763) create(t10, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @RequiresApi(24)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(Context context, String name) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.migrations.SharedPreferencesMigration", m17801f = "SharedPreferencesMigration.android.kt", m17802l = {151}, m17803m = "shouldMigrate")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 */
    public static final class C37781 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37781(SharedPreferencesMigration<T> sharedPreferencesMigration, InterfaceC9324c<? super C37781> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC10575q migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        AbstractC9133u.m16133g(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        Api24Impl.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str + ".xml");
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(InterfaceC9324c<? super C8736p> interfaceC9324c) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return C8736p.f16368a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t10, InterfaceC9324c<? super T> interfaceC9324c) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t10, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldMigrate(T r5, p179m7.InterfaceC9324c<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration.C37781
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration.C37781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            x7.p r6 = r4.shouldRunMigration
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.keySet
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = r0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, m7.c):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, InterfaceC10575q migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC9133u.m16133g(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC10559a produceSharedPreferences, Set<String> keysToMigrate, InterfaceC10575q migrate) {
        this(produceSharedPreferences, keysToMigrate, (InterfaceC10574p) null, migrate, 4, (AbstractC9126n) null);
        AbstractC9133u.m16133g(produceSharedPreferences, "produceSharedPreferences");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        AbstractC9133u.m16133g(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC10559a produceSharedPreferences, InterfaceC10575q migrate) {
        this(produceSharedPreferences, (Set) null, (InterfaceC10574p) null, migrate, 6, (AbstractC9126n) null);
        AbstractC9133u.m16133g(produceSharedPreferences, "produceSharedPreferences");
        AbstractC9133u.m16133g(migrate, "migrate");
    }

    private SharedPreferencesMigration(InterfaceC10559a interfaceC10559a, Set<String> set, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, Context context, String str) {
        this.shouldRunMigration = interfaceC10574p;
        this.migrate = interfaceC10575q;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = AbstractC9078a.m15924b(interfaceC10559a);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : AbstractC8778f0.m14548Y0(set);
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC10559a interfaceC10559a, Set set, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, Context context, String str, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, (Set<String>) set, (i10 & 4) != 0 ? new C37741(null) : interfaceC10574p, interfaceC10575q, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC10559a interfaceC10559a, Set set, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, (Set<String>) ((i10 & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i10 & 4) != 0 ? new C37752(null) : interfaceC10574p, interfaceC10575q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC10559a produceSharedPreferences, Set<String> keysToMigrate, InterfaceC10574p shouldRunMigration, InterfaceC10575q migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        AbstractC9133u.m16133g(produceSharedPreferences, "produceSharedPreferences");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        AbstractC9133u.m16133g(shouldRunMigration, "shouldRunMigration");
        AbstractC9133u.m16133g(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, int i10, AbstractC9126n abstractC9126n) {
        this(context, str, (i10 & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i10 & 8) != 0 ? new C37763(null) : interfaceC10574p, interfaceC10575q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC10574p shouldRunMigration, InterfaceC10575q migrate) {
        this(new InterfaceC10559a() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final SharedPreferences invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                AbstractC9133u.m16132f(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sharedPreferencesName, "sharedPreferencesName");
        AbstractC9133u.m16133g(keysToMigrate, "keysToMigrate");
        AbstractC9133u.m16133g(shouldRunMigration, "shouldRunMigration");
        AbstractC9133u.m16133g(migrate, "migrate");
    }
}
