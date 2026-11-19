.class public final Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/study/data/SearchHistoryEntityDao;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;


# instance fields
.field private final __converters:Lcom/zykj/study/data/Converters;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfSearchHistoryEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfSearchHistoryEntity:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/zykj/study/data/SearchHistoryEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->Companion:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/study/data/Converters;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/zykj/study/data/Converters;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 17
    .line 18
    new-instance p1, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$1;-><init>(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__insertAdapterOfSearchHistoryEntity:Landroidx/room/EntityInsertAdapter;

    .line 24
    .line 25
    new-instance p1, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$2;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl$2;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__deleteAdapterOfSearchHistoryEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->deleteAll$lambda$5(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get__converters$p(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)Lcom/zykj/study/data/Converters;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->insert$lambda$0(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->getList$lambda$3(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->delete$lambda$2(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final delete$lambda$1(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__deleteAdapterOfSearchHistoryEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final delete$lambda$2(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__deleteAdapterOfSearchHistoryEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final deleteAll$lambda$5(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p2, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p2, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->getHistoryList$lambda$4(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->delete$lambda$1(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final getHistoryList$lambda$4(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p3, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p3, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "id"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-string p3, "userId"

    .line 21
    .line 22
    invoke-static {p0, p3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const-string v0, "searchKey"

    .line 27
    .line 28
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const-string v1, "createDate"

    .line 33
    .line 34
    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    long-to-int v3, v3

    .line 54
    invoke-interface {p0, p3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    :goto_1
    iget-object v7, p2, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 79
    .line 80
    invoke-virtual {v7, v6}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-eqz v6, :cond_1

    .line 85
    .line 86
    new-instance v7, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 87
    .line 88
    invoke-direct {v7, v3, v4, v5, v6}, Lcom/zykj/study/data/SearchHistoryEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string p2, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :cond_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method private static final getList$lambda$3(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p3, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p3, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "id"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-string p3, "userId"

    .line 21
    .line 22
    invoke-static {p0, p3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const-string v0, "searchKey"

    .line 27
    .line 28
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const-string v1, "createDate"

    .line 33
    .line 34
    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    long-to-int v3, v3

    .line 54
    invoke-interface {p0, p3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    :goto_1
    iget-object v7, p2, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 79
    .line 80
    invoke-virtual {v7, v6}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-eqz v6, :cond_1

    .line 85
    .line 86
    new-instance v7, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 87
    .line 88
    invoke-direct {v7, v3, v4, v5, v6}, Lcom/zykj/study/data/SearchHistoryEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string p2, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :cond_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method private static final insert$lambda$0(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__insertAdapterOfSearchHistoryEntity:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public delete(Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .locals 3
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

    .line 2
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/j1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/j1;-><init>(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public delete([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;
    .locals 3
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

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/g1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/g1;-><init>(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public deleteAll(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 3
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

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/i1;

    .line 4
    .line 5
    const-string v2, "delete from search_history where userId = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/data/i1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p1
.end method

.method public getHistoryList(Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 4
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

    .line 1
    const-string v0, "userId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "search_history"

    .line 13
    .line 14
    filled-new-array {v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lcom/zykj/study/data/h1;

    .line 19
    .line 20
    const-string v3, "select * from search_history where userId = ?"

    .line 21
    .line 22
    invoke-direct {v2, v3, p1, p0}, Lcom/zykj/study/data/h1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/InvalidationTracker;->createLiveData([Ljava/lang/String;ZLx7/l;)Landroidx/lifecycle/LiveData;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public getList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
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

    .line 1
    const-string v0, "userId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/study/data/k1;

    .line 9
    .line 10
    const-string v2, "select * from search_history where userId = ? order by createDate"

    .line 11
    .line 12
    invoke-direct {v1, v2, p1, p0}, Lcom/zykj/study/data/k1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLx7/l;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/util/List;

    .line 22
    .line 23
    return-object p1
.end method

.method public insert([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;
    .locals 3
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

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/l1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/l1;-><init>(Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;[Lcom/zykj/study/data/SearchHistoryEntity;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method
