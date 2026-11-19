package com.zykj.study.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface MyCourseKeyEntityDao {
    @Query("delete from my_course_key where id = :id")
    Object deleteById(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from my_course_key where userId = :userId")
    Object deleteByUserId(String str, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from my_course_key where id = :id")
    Object getKeyById(int i10, InterfaceC9324c<? super MyCourseKeyEntity> interfaceC9324c);

    @Query("select * from my_course_key where userId = :userId")
    Object getKeyByUserId(String str, InterfaceC9324c<? super MyCourseKeyEntity> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(MyCourseKeyEntity myCourseKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Update
    Object update(MyCourseKeyEntity myCourseKeyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
