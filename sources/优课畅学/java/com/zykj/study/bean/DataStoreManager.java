package com.zykj.study.bean;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.PropertyReference2Impl;
import p009a8.InterfaceC0048d;
import p089e8.InterfaceC8383k;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DataStoreManager {
    static final /* synthetic */ InterfaceC8383k[] $$delegatedProperties = {AbstractC9137y.m16160h(new PropertyReference2Impl(DataStoreManager.class, "settingsDataStore", "getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    public static final int $stable = 8;
    private final Context appContext;
    private final InterfaceC0048d settingsDataStore$delegate;

    @InterfaceC9539d(m17800c = "com.zykj.study.bean.DataStoreManager$removeKey$2", m17801f = "DataStoreManager.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.bean.DataStoreManager$removeKey$2 */
    public static final class C76152 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C76152(String str, InterfaceC9324c<? super C76152> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C76152 c76152 = new C76152(this.$key, interfaceC9324c);
            c76152.L$0 = obj;
            return c76152;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C76152) create(mutablePreferences, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            mutablePreferences.remove(PreferencesKeys.booleanKey(this.$key));
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.bean.DataStoreManager$setExerciseRevised$2", m17801f = "DataStoreManager.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.bean.DataStoreManager$setExerciseRevised$2 */
    public static final class C76162 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $isRevised;
        final /* synthetic */ String $keyName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C76162(String str, boolean z10, InterfaceC9324c<? super C76162> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$keyName = str;
            this.$isRevised = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C76162 c76162 = new C76162(this.$keyName, this.$isRevised, interfaceC9324c);
            c76162.L$0 = obj;
            return c76162;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C76162) create(mutablePreferences, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            mutablePreferences.set(PreferencesKeys.booleanKey(this.$keyName), AbstractC9536a.m17796a(this.$isRevised));
            return C8736p.f16368a;
        }
    }

    public DataStoreManager(Context appContext) {
        AbstractC9133u.m16133g(appContext, "appContext");
        this.appContext = appContext;
        this.settingsDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("filename", null, null, null, 14, null);
    }

    public final InterfaceC9266c exerciseRevised(final String keyName) {
        AbstractC9133u.m16133g(keyName, "keyName");
        final InterfaceC9266c data = getSettingsDataStore(this.appContext).getData();
        return new InterfaceC9266c() { // from class: com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1

            /* renamed from: com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2 */
            public static final class C76142<T> implements InterfaceC9267d {
                final /* synthetic */ String $keyName$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2", m17801f = "DataStoreManager.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                /* renamed from: com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C76142.this.emit(null, this);
                    }
                }

                public C76142(InterfaceC9267d interfaceC9267d, String str) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$keyName$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1.C76142.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2$1 r0 = (com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1.C76142.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2$1 r0 = new com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.L$3
                        l8.d r7 = (p169l8.InterfaceC9267d) r7
                        java.lang.Object r7 = r0.L$1
                        com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1$2$1 r7 = (com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1.C76142.AnonymousClass1) r7
                        kotlin.AbstractC9079b.m15926b(r8)
                        goto L7d
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.AbstractC9079b.m15926b(r8)
                        l8.d r8 = r6.$this_unsafeFlow
                        r2 = r7
                        androidx.datastore.preferences.core.Preferences r2 = (androidx.datastore.preferences.core.Preferences) r2
                        java.lang.String r4 = r6.$keyName$inlined
                        androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.booleanKey(r4)
                        java.lang.Object r2 = r2.get(r4)
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        r4 = 0
                        if (r2 == 0) goto L55
                        boolean r2 = r2.booleanValue()
                        goto L56
                    L55:
                        r2 = r4
                    L56:
                        java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r2)
                        java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r7)
                        r0.L$0 = r5
                        java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r0)
                        r0.L$1 = r5
                        java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r8)
                        r0.L$3 = r7
                        r0.I$0 = r4
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L7d
                        return r1
                    L7d:
                        h7.p r7 = p123h7.C8736p.f16368a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.bean.DataStoreManager$exerciseRevised$$inlined$map$1.C76142.emit(java.lang.Object, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1$2.smali:59
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = data.collect(new C76142(interfaceC9267d, keyName), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a8.d, com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder] */
    public final DataStore<Preferences> getSettingsDataStore(Context context) {
        AbstractC9133u.m16133g(context, "<this>");
        ?? r02 = this.settingsDataStore$delegate;
        InterfaceC8383k interfaceC8383k = $$delegatedProperties[0];
        return (DataStore) r02.setMessage(context);
    }

    public final Object removeKey(String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objEdit = PreferencesKt.edit(getSettingsDataStore(this.appContext), new C76152(str, null), interfaceC9324c);
        return objEdit == AbstractC9434a.m17291f() ? objEdit : C8736p.f16368a;
    }

    public final Object setExerciseRevised(String str, boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objEdit = PreferencesKt.edit(getSettingsDataStore(this.appContext), new C76162(str, z10, null), interfaceC9324c);
        return objEdit == AbstractC9434a.m17291f() ? objEdit : C8736p.f16368a;
    }
}
