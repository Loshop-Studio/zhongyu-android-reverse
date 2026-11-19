package androidx.room;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9979u;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z10, String[] tableNames, Callable<T> callableFunction) {
        super(database, container, z10, tableNames, null);
        AbstractC9979u.m20294g(database, "database");
        AbstractC9979u.m20294g(container, "container");
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(callableFunction, "callableFunction");
        this.callableFunction = callableFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(InterfaceC11588c<? super T> interfaceC11588c) {
        return this.callableFunction.call();
    }
}
