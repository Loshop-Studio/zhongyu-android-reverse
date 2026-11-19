package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@Dao
/* loaded from: classes3.dex */
public interface SystemIdInfoDao {

    public static final class DefaultImpls {
        @Deprecated
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
            AbstractC9979u.m20294g(id2, "id");
            return SystemIdInfoDao.super.getSystemIdInfo(id2);
        }

        @Deprecated
        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
            AbstractC9979u.m20294g(id2, "id");
            SystemIdInfoDao.super.removeSystemIdInfo(id2);
        }
    }

    default SystemIdInfo getSystemIdInfo(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        return getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    SystemIdInfo getSystemIdInfo(String str, int i10);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    default void removeSystemIdInfo(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(String str);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(String str, int i10);
}
