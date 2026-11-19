package com.zykj.study.data;

import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface CourseStudyEntityDao {
    @Query("delete from course_study")
    Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from course_study where  id = :id")
    Object deleteById(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from course_study where  studyUserId = :userId")
    Object deleteByUserId(String str, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from course_study where studyUserId = :userId and id = :id")
    Object findByIdAndUserId(String str, int i10, InterfaceC9324c<? super CourseStudyEntity> interfaceC9324c);

    @Query("select * from course_study where studyUserId = :userId order by learnTime desc")
    PagingSource<Integer, CourseStudyEntity> getCourseStudyList(String str);

    @Insert(onConflict = 1)
    Object insert(CourseStudyEntity courseStudyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(List<CourseStudyEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Update
    Object update(CourseStudyEntity courseStudyEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
