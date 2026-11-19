package androidx.work.impl.model;

import androidx.sqlite.p019db.SupportSQLiteQuery;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.InterfaceC11594c;
import sd.AbstractC11106e0;

/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC11594c getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, AbstractC11106e0 dispatcher, SupportSQLiteQuery query) {
        AbstractC9979u.m20294g(rawWorkInfoDao, "<this>");
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        AbstractC9979u.m20294g(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
