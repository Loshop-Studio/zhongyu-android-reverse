.class public final Lcom/friday/common/dao/ImageSafetyDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/dao/ImageSafetyDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/friday/common/dao/ImageSafetyDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/dao/ImageSafetyDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/dao/ImageSafetyDao_Impl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->c:Lcom/friday/common/dao/ImageSafetyDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->d:I

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
    iput-object p1, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/friday/common/dao/ImageSafetyDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/friday/common/dao/ImageSafetyDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->i(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->k(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->j(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->l(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final j(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :try_start_0
    const-string p1, "imageId"

    .line 11
    .line 12
    invoke-static {p0, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const-string v0, "riskScore"

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    long-to-int v3, v3

    .line 42
    new-instance v4, Lcom/friday/common/entity/ImageSafetyEntity;

    .line 43
    .line 44
    invoke-direct {v4, v2, v3}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public static final k(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
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

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public static final l(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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


# virtual methods
.method public a(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/w0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/w0;-><init>(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;)V

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

.method public b(Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/z0;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ImageSafetyEntity"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lc2/z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v0, v2, v3, v1, p1}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/x0;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ImageSafetyEntity WHERE imageId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/x0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

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

.method public d(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ImageSafetyDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/y0;

    .line 4
    .line 5
    const-string v2, "SELECT riskScore From ImageSafetyEntity where imageId =?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/y0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
