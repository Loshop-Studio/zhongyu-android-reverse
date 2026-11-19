.class public interface abstract Lcom/zykj/study/data/CourseStudyEntityDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract deleteAll(Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from course_study"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteById(ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from course_study where  id = :id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from course_study where  studyUserId = :userId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract findByIdAndUserId(Ljava/lang/String;ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "select * from course_study where studyUserId = :userId and id = :id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getCourseStudyList(Ljava/lang/String;)Landroidx/paging/PagingSource;
    .annotation build Landroidx/room/Query;
        value = "select * from course_study where studyUserId = :userId order by learnTime desc"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/paging/PagingSource<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract update(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Update;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
