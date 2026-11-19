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
public interface SubjectEntityDao {
    @Query("delete from subject")
    Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from subject")
    LiveData<List<SubjectEntity>> getList();

    @Query("select * from subject where id = :id")
    Object getSubjectId(int i10, InterfaceC9324c<? super SubjectEntity> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(List<SubjectEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
