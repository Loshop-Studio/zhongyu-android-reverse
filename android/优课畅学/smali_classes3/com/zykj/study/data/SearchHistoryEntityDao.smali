.class public interface abstract Lcom/zykj/study/data/SearchHistoryEntityDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Delete;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            ">;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract delete([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Delete;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteAll(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "delete from search_history where userId = :userId"
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

.method public abstract getHistoryList(Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .annotation build Landroidx/room/Query;
        value = "select * from search_history where userId = :userId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getList(Ljava/lang/String;)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "select * from search_history where userId = :userId order by createDate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
