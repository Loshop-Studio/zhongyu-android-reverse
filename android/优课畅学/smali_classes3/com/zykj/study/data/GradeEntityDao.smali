.class public interface abstract Lcom/zykj/study/data/GradeEntityDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract deleteAll(Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from grade"
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

.method public abstract getGradeById(ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "select * from grade where id = :id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/GradeEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getGradeByPeriodId(ILm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "select * from grade where parentId = :parentId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/GradeEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getList()Landroidx/lifecycle/LiveData;
    .annotation build Landroidx/room/Query;
        value = "select * from grade"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/GradeEntity;",
            ">;>;"
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
            "Lcom/zykj/study/data/GradeEntity;",
            ">;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
