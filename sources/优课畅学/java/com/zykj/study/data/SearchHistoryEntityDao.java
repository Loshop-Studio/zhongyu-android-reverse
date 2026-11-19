package com.zykj.study.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface SearchHistoryEntityDao {
    @Delete
    Object delete(List<SearchHistoryEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Delete
    Object delete(SearchHistoryEntity[] searchHistoryEntityArr, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from search_history where userId = :userId")
    Object deleteAll(String str, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from search_history where userId = :userId")
    LiveData<List<SearchHistoryEntity>> getHistoryList(String str);

    @Query("select * from search_history where userId = :userId order by createDate")
    List<SearchHistoryEntity> getList(String str);

    @Insert(onConflict = 1)
    Object insert(SearchHistoryEntity[] searchHistoryEntityArr, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
