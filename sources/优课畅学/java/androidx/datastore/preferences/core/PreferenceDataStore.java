package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    @InterfaceC9539d(m17800c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m17801f = "PreferenceDataStoreFactory.kt", m17802l = {94}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 */
    public static final class C37852 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37852(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C37852> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$transform = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37852 c37852 = new C37852(this.$transform, interfaceC9324c);
            c37852.L$0 = obj;
            return c37852;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Preferences preferences, InterfaceC9324c<? super Preferences> interfaceC9324c) {
            return ((C37852) create(preferences, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Preferences preferences = (Preferences) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$transform;
                this.label = 1;
                obj = interfaceC10574p.invoke(preferences, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            AbstractC9133u.m16131e(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC9266c getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super Preferences> interfaceC9324c) {
        return this.delegate.updateData(new C37852(interfaceC10574p, null), interfaceC9324c);
    }
}
