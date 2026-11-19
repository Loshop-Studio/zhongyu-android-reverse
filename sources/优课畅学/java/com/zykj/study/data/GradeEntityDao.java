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
public interface GradeEntityDao {
    @Query("delete from grade")
    Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from grade where id = :id")
    Object getGradeById(int i10, InterfaceC9324c<? super GradeEntity> interfaceC9324c);

    @Query("select * from grade where parentId = :parentId")
    Object getGradeByPeriodId(int i10, InterfaceC9324c<? super GradeEntity> interfaceC9324c);

    @Query("select * from grade")
    LiveData<List<GradeEntity>> getList();

    @Insert(onConflict = 1)
    Object insert(List<GradeEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
