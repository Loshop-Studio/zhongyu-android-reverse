package androidx.room;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

/* loaded from: classes3.dex */
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z10, String[] tableNames, Callable<T> callableFunction) {
        super(database, container, z10, tableNames, null);
        AbstractC9133u.m16133g(database, "database");
        AbstractC9133u.m16133g(container, "container");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(callableFunction, "callableFunction");
        this.callableFunction = callableFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(InterfaceC9324c<? super T> interfaceC9324c) {
        return this.callableFunction.call();
    }
}
