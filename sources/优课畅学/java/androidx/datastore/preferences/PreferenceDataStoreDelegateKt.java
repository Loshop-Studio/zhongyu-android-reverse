package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p009a8.InterfaceC0048d;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final InterfaceC0048d preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC10570l produceMigrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(produceMigrations, "produceMigrations");
        AbstractC9133u.m16133g(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC0048d preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, InterfaceC10570l interfaceC10570l, InterfaceC8822b0 interfaceC8822b0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1
                @Override // p300x7.InterfaceC10570l
                public final List<DataMigration<Preferences>> invoke(Context it) {
                    AbstractC9133u.m16133g(it, "it");
                    return AbstractC8809v.m14771n();
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(C8843i0.m14867b().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, interfaceC10570l, interfaceC8822b0);
    }
}
