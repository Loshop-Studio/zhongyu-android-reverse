package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class PreferencesKt {

    @InterfaceC9539d(m17800c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m17801f = "Preferences.kt", m17802l = {358}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    public static final class C37872 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37872(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C37872> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$transform = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37872 c37872 = new C37872(this.$transform, interfaceC9324c);
            c37872.L$0 = obj;
            return c37872;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Preferences preferences, InterfaceC9324c<? super Preferences> interfaceC9324c) {
            return ((C37872) create(preferences, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                AbstractC9079b.m15926b(obj);
                return mutablePreferences;
            }
            AbstractC9079b.m15926b(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            InterfaceC10574p interfaceC10574p = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return interfaceC10574p.invoke(mutablePreferences2, this) == objM17291f ? objM17291f : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super Preferences> interfaceC9324c) {
        return dataStore.updateData(new C37872(interfaceC10574p, null), interfaceC9324c);
    }
}
