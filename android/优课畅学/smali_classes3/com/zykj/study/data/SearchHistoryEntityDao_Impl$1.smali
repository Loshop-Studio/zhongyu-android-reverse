.class public final Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/zykj/study/data/SearchHistoryEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;->this$0:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/zykj/study/data/SearchHistoryEntity;)V
    .locals 3

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/zykj/study/data/SearchHistoryEntity;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/zykj/study/data/SearchHistoryEntity;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lcom/zykj/study/data/SearchHistoryEntity;->getSearchKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;->this$0:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    invoke-static {v0}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    move-result-object v0

    invoke-virtual {p2}, Lcom/zykj/study/data/SearchHistoryEntity;->getCreateDate()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/zykj/study/data/Converters;->dateToLong(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p2

    const/4 v0, 0x4

    if-nez p2, :cond_0

    .line 6
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/zykj/study/data/SearchHistoryEntity;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/zykj/study/data/SearchHistoryEntity;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `search_history` (`id`,`userId`,`searchKey`,`createDate`) VALUES (nullif(?, 0),?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
