package androidx.room;

import androidx.room.util.DBUtil;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RoomLambdaTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final InterfaceC9540l lambdaFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomLambdaTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z10, String[] tableNames, InterfaceC9540l lambdaFunction) {
        super(database, container, z10, tableNames, null);
        AbstractC9979u.m20294g(database, "database");
        AbstractC9979u.m20294g(container, "container");
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(lambdaFunction, "lambdaFunction");
        this.lambdaFunction = lambdaFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(InterfaceC11588c<? super T> interfaceC11588c) {
        return DBUtil.performSuspending(getDatabase(), true, getInTransaction(), this.lambdaFunction, interfaceC11588c);
    }
}
