package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

@Dao
/* loaded from: classes3.dex */
public interface WorkTagDao {

    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String id2, Set<String> tags) {
            AbstractC9979u.m20294g(id2, "id");
            AbstractC9979u.m20294g(tags, "tags");
            WorkTagDao.super.insertTags(id2, tags);
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> getTagsForWorkSpecId(String str);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> getWorkSpecIdsWithTag(String str);

    @Insert(onConflict = 5)
    void insert(WorkTag workTag);

    default void insertTags(String id2, Set<String> tags) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new WorkTag((String) it.next(), id2));
        }
    }
}
