package androidx.work.impl.model;

import androidx.sqlite.p018db.SupportSQLiteQuery;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p169l8.InterfaceC9266c;

/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC9266c getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, CoroutineDispatcher dispatcher, SupportSQLiteQuery query) {
        AbstractC9133u.m16133g(rawWorkInfoDao, "<this>");
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        AbstractC9133u.m16133g(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
