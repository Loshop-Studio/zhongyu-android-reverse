package androidx.datastore.core;

import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.datastore.core.DataMigrationInitializer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.datastore.core.DataMigrationInitializer$Companion", m17801f = "DataMigrationInitializer.kt", m17802l = {42, C3721BR.versionName}, m17803m = "runMigrations")
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, InterfaceC9324c<? super DataMigrationInitializer$Companion$runMigrations$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runMigrations(null, null, this);
    }
}
