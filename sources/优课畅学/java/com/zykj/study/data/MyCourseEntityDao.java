package com.zykj.study.data;

import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.zykj.study.bean.course.CourseType;
import java.util.List;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Dao
/* loaded from: classes3.dex */
public interface MyCourseEntityDao {
    @Query("delete from my_course")
    Object deleteAll(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from my_course where  id = :courseId")
    Object deleteByCourse(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("delete from my_course where  userId = :userId")
    Object deleteByUserId(String str, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("select * from my_course where  id = :courseId")
    LiveData<MyCourseEntity> findCourse(int i10);

    @Query("select * from my_course where userId = :userId ORDER BY sort")
    PagingSource<Integer, MyCourseEntity> getMyCourseList(String str);

    @Insert(onConflict = 1)
    Object insert(MyCourseEntity myCourseEntity, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Insert(onConflict = 1)
    Object insert(List<MyCourseEntity> list, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Query("update my_course set status = :status WHERE id =:courseId")
    int updateStatus(int i10, CourseType courseType);
}
