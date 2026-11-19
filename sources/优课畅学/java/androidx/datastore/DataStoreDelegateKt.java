package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p009a8.InterfaceC0048d;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class DataStoreDelegateKt {
    public static final <T> InterfaceC0048d dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC10570l produceMigrations, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(produceMigrations, "produceMigrations");
        AbstractC9133u.m16133g(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC0048d dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, InterfaceC10570l interfaceC10570l, InterfaceC8822b0 interfaceC8822b0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.datastore.DataStoreDelegateKt.dataStore.1
                @Override // p300x7.InterfaceC10570l
                public final List invoke(Context it) {
                    AbstractC9133u.m16133g(it, "it");
                    return AbstractC8809v.m14771n();
                }
            };
        }
        if ((i10 & 16) != 0) {
            interfaceC8822b0 = AbstractC9165e.m16552a(C8843i0.m14867b().plus(AbstractC8874s1.m14910b(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, interfaceC10570l, interfaceC8822b0);
    }
}
