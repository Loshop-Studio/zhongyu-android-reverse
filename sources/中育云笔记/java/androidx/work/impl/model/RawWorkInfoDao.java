package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import p379vd.InterfaceC11594c;

@Dao
/* loaded from: classes3.dex */
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery(observedEntities = {WorkSpec.class})
    InterfaceC11594c getWorkInfoPojosFlow(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery(observedEntities = {WorkSpec.class})
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery);
}
