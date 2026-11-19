.class public final Lcom/friday/common/dao/ShareCacheDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/g2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/dao/ShareCacheDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/friday/common/dao/ShareCacheDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/dao/ShareCacheDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/dao/ShareCacheDao_Impl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/dao/ShareCacheDao_Impl;->c:Lcom/friday/common/dao/ShareCacheDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/dao/ShareCacheDao_Impl;->d:I

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
    iput-object p1, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/friday/common/dao/ShareCacheDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/friday/common/dao/ShareCacheDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic h(Ljava/lang/String;JLjava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/common/dao/ShareCacheDao_Impl;->s(Ljava/lang/String;JLjava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ShareCacheDao_Impl;->o(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/friday/common/dao/ShareCacheDao_Impl;Lcom/friday/common/entity/ShareCacheEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ShareCacheDao_Impl;->r(Lcom/friday/common/dao/ShareCacheDao_Impl;Lcom/friday/common/entity/ShareCacheEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ShareCacheDao_Impl;->n(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ShareCacheEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ShareCacheDao_Impl;->q(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ShareCacheEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ShareCacheDao_Impl;->p(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p4, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p4, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p4, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public static final o(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

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
    invoke-interface {p0, p3, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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
    sget-object p0, Lqc/q;->a:Lqc/q;

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

.method public static final p(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 12

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
    invoke-interface {p0, p3, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    const-string p1, "cacheId"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-string p2, "fileId"

    .line 21
    .line 22
    invoke-static {p0, p2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const-string p3, "version"

    .line 27
    .line 28
    invoke-static {p0, p3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    const-string v0, "accountId"

    .line 33
    .line 34
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-string v1, "previewTime"

    .line 39
    .line 40
    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    new-instance v2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-interface {p0, p3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    long-to-int v7, v3

    .line 68
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 73
    .line 74
    .line 75
    move-result-wide v10

    .line 76
    new-instance v4, Lcom/friday/common/entity/ShareCacheEntity;

    .line 77
    .line 78
    invoke-direct/range {v4 .. v11}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    goto :goto_1

    .line 88
    :cond_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method public static final q(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ShareCacheEntity;
    .locals 10

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p4, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p4, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p4, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 16
    .line 17
    .line 18
    const-string p1, "cacheId"

    .line 19
    .line 20
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const-string p2, "fileId"

    .line 25
    .line 26
    invoke-static {p0, p2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const-string p3, "version"

    .line 31
    .line 32
    invoke-static {p0, p3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    const-string p4, "accountId"

    .line 37
    .line 38
    invoke-static {p0, p4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    const-string v0, "previewTime"

    .line 43
    .line 44
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {p0, p3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    long-to-int v5, p1

    .line 67
    invoke-interface {p0, p4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    new-instance v2, Lcom/friday/common/entity/ShareCacheEntity;

    .line 76
    .line 77
    invoke-direct/range {v2 .. v9}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p1, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const/4 v2, 0x0

    .line 85
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public static final r(Lcom/friday/common/dao/ShareCacheDao_Impl;Lcom/friday/common/entity/ShareCacheEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final s(Ljava/lang/String;JLjava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p6, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p6, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p6, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    invoke-interface {p0, p1, p4, p5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 33
    .line 34
    .line 35
    throw p1
.end method


# virtual methods
.method public b(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/i2;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ShareCacheEntity WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/i2;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-static {v0, p1, p2, v1, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p1
.end method

.method public c(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/h2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ShareCacheEntity WHERE fileId=? AND accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/h2;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {v0, p1, p2, v1, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public d(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/j2;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ShareCacheEntity WHERE fileId=? AND accountId = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/j2;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-static {v0, p1, p2, v1, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p1
.end method

.method public e(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/m2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ShareCacheEntity WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/m2;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {v0, p1, p2, v1, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public f(JLjava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/l2;

    .line 4
    .line 5
    const-string v2, "UPDATE ShareCacheEntity SET previewTime=? WHERE fileId =? AND accountId = ?"

    .line 6
    .line 7
    move-wide v3, p1

    .line 8
    move-object v5, p3

    .line 9
    move-wide v6, p4

    .line 10
    invoke-direct/range {v1 .. v7}, Lc2/l2;-><init>(Ljava/lang/String;JLjava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 27
    .line 28
    return-object p1
.end method

.method public g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ShareCacheDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/k2;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/k2;-><init>(Lcom/friday/common/dao/ShareCacheDao_Impl;Lcom/friday/common/entity/ShareCacheEntity;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 22
    .line 23
    return-object p1
.end method
