package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@Dao
/* loaded from: classes3.dex */
public interface SystemIdInfoDao {

    public static final class DefaultImpls {
        @Deprecated
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            AbstractC9133u.m16133g(id, "id");
            return SystemIdInfoDao.super.getSystemIdInfo(id);
        }

        @Deprecated
        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            AbstractC9133u.m16133g(id, "id");
            SystemIdInfoDao.super.removeSystemIdInfo(id);
        }
    }

    default SystemIdInfo getSystemIdInfo(WorkGenerationalId id) {
        AbstractC9133u.m16133g(id, "id");
        return getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    SystemIdInfo getSystemIdInfo(String str, int i10);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    default void removeSystemIdInfo(WorkGenerationalId id) {
        AbstractC9133u.m16133g(id, "id");
        removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(String str);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(String str, int i10);
}
