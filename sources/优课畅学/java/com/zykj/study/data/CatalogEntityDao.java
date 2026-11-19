package com.zykj.study.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface CatalogEntityDao {
    @Query("delete from catalog")
    Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from catalog where  id = :catalogId")
    Object deleteByCatalogId(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from catalog where  courseId = :courseId")
    Object deleteByCourse(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from catalog where  courseId = :courseId")
    LiveData<List<CatalogEntity>> findCourse(int i10);

    @Insert(onConflict = 1)
    Object insert(CatalogEntity catalogEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(List<CatalogEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("update catalog set title = :title WHERE id =:catalogId")
    void updateCatalogTitle(int i10, String str);
}
