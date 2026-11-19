package androidx.datastore.core;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m17801f = "DataMigrationInitializer.kt", m17802l = {45}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements InterfaceC10570l {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, InterfaceC9324c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> interfaceC9324c) {
        super(1, interfaceC9324c);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
