package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase database) {
        AbstractC9979u.m20294g(database, "database");
        this.database = database;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC9979u.m20293f(setNewSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = setNewSetFromMap;
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z10, Callable<T> callableFunction) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(callableFunction, "callableFunction");
        return new RoomCallableTrackingLiveData(this.database, this, z10, tableNames, callableFunction);
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(LiveData<?> liveData) {
        AbstractC9979u.m20294g(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(LiveData<?> liveData) {
        AbstractC9979u.m20294g(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z10, InterfaceC9540l lambdaFunction) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(lambdaFunction, "lambdaFunction");
        return new RoomLambdaTrackingLiveData(this.database, this, z10, tableNames, lambdaFunction);
    }
}
