package com.zykj.study.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface CourseStudyKeyEntityDao {
    @Query("delete from course_study_key where id = :id")
    Object deleteById(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from course_study_key where userId = :userId")
    Object deleteByUserId(String str, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from course_study_key where id = :id")
    Object getKeyById(int i10, InterfaceC9324c<? super CourseStudyKeyEntity> interfaceC9324c);

    @Query("select * from course_study_key where userId = :userId")
    Object getKeyByUserId(String str, InterfaceC9324c<? super CourseStudyKeyEntity> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(CourseStudyKeyEntity courseStudyKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Update
    Object update(CourseStudyKeyEntity courseStudyKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
