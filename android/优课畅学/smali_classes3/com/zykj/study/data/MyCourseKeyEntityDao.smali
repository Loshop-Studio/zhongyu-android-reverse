.class public interface abstract Lcom/zykj/study/data/MyCourseKeyEntityDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract deleteById(ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from my_course_key where id = :id"
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
        value = "delete from my_course_key where userId = :userId"
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

.method public abstract getKeyById(ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "select * from my_course_key where id = :id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/MyCourseKeyEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getKeyByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "select * from my_course_key where userId = :userId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/MyCourseKeyEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/MyCourseKeyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract update(Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Update;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/MyCourseKeyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
