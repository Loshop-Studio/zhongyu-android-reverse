package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase database) {
        AbstractC9133u.m16133g(database, "database");
        this.database = database;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC9133u.m16132f(setNewSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = setNewSetFromMap;
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z10, Callable<T> callableFunction) {
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(callableFunction, "callableFunction");
        return new RoomCallableTrackingLiveData(this.database, this, z10, tableNames, callableFunction);
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(LiveData<?> liveData) {
        AbstractC9133u.m16133g(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(LiveData<?> liveData) {
        AbstractC9133u.m16133g(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }

    public final <T> LiveData<T> create(String[] tableNames, boolean z10, InterfaceC10570l lambdaFunction) {
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(lambdaFunction, "lambdaFunction");
        return new RoomLambdaTrackingLiveData(this.database, this, z10, tableNames, lambdaFunction);
    }
}
