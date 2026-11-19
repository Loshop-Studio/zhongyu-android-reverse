package androidx.room;

import androidx.room.util.DBUtil;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class RoomLambdaTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final InterfaceC10570l lambdaFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomLambdaTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z10, String[] tableNames, InterfaceC10570l lambdaFunction) {
        super(database, container, z10, tableNames, null);
        AbstractC9133u.m16133g(database, "database");
        AbstractC9133u.m16133g(container, "container");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(lambdaFunction, "lambdaFunction");
        this.lambdaFunction = lambdaFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(InterfaceC9324c<? super T> interfaceC9324c) {
        return DBUtil.performSuspending(getDatabase(), true, getInTransaction(), this.lambdaFunction, interfaceC9324c);
    }
}
