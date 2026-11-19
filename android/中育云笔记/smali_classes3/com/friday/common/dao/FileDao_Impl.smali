.class public final Lcom/friday/common/dao/FileDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/dao/FileDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/dao/FileDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/friday/common/dao/FileDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/dao/FileDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/dao/FileDao_Impl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/dao/FileDao_Impl;->c:Lcom/friday/common/dao/FileDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/dao/FileDao_Impl;->d:I

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
    iput-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/friday/common/dao/FileDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/friday/common/dao/FileDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic A0(Ljava/lang/String;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->d1(Ljava/lang/String;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final A1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p5, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p5, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p5, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-interface {p0, p1, p4}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public static synthetic B0(JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->r1(JLandroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final B1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

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
    invoke-interface {p0, p6, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p6, 0x2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-interface {p0, p6, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-interface {p0, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 p3, 0x4

    .line 28
    move p4, p3

    .line 29
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p6

    .line 33
    if-eqz p6, :cond_0

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p6

    .line 39
    check-cast p6, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p0, p4, p6}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 p4, p4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/2addr p5, p3

    .line 50
    invoke-interface {p0, p5, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 60
    .line 61
    return-object p0

    .line 62
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public static synthetic C0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->C1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final C1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic D0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->t1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final D1(Ljava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

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
    int-to-long v0, p1

    .line 11
    const/4 p1, 0x1

    .line 12
    :try_start_0
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 26
    .line 27
    return-object p0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public static synthetic E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/FileDao_Impl;->o1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final E1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p3, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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

.method public static synthetic F0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->f1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final F1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p3, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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

.method public static synthetic G0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->F1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final G1(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p8, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p8, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p8, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-interface {p0, p1, p3, p4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-interface {p0, p1, p5}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x5

    .line 28
    int-to-long p2, p6

    .line 29
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x6

    .line 33
    invoke-interface {p0, p1, p7}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 43
    .line 44
    return-object p0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public static synthetic H0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->b1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final H1(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

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
    int-to-long v0, p1

    .line 12
    :try_start_0
    invoke-interface {p0, p4, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    int-to-long v0, p2

    .line 17
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method public static synthetic I0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->Z0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final I1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p5, p0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p5, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p5, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-interface {p0, p1, p4}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public static synthetic J0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/common/dao/FileDao_Impl;->J1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final J1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

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
    invoke-interface {p0, p6, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    int-to-long p2, p4

    .line 25
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x5

    .line 29
    invoke-interface {p0, p1, p5}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 39
    .line 40
    return-object p0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public static synthetic K0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->i1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final K1(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 2

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
    int-to-long v0, p1

    .line 12
    :try_start_0
    invoke-interface {p0, p4, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    int-to-long v0, p2

    .line 17
    invoke-interface {p0, p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method public static synthetic L0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->v1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic M0(Ljava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->D1(Ljava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->z1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O0(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->u1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->g1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->a1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic R0(Lcom/friday/common/dao/FileDao_Impl;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->E(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic S0(Lcom/friday/common/dao/FileDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic T0(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic U0(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->z(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic V0(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->H(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic W0(Lcom/friday/common/dao/FileDao_Impl;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao;->p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final X0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final Y0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
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

.method public static final Z0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static final a1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 41

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-wide/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const-string v2, "fileId"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "accountId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "fileName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "ossFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "localFileUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "fileType"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "parentId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "createTime"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "updateTime"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "state"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "isSync"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "version"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    const-string v14, "isShared"

    .line 99
    .line 100
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const-string v15, "preFileId"

    .line 105
    .line 106
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    const-string v0, "errorTimes"

    .line 111
    .line 112
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    move/from16 p1, v0

    .line 117
    .line 118
    const-string v0, "md5"

    .line 119
    .line 120
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    move/from16 p2, v0

    .line 125
    .line 126
    const-string v0, "cached"

    .line 127
    .line 128
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    move/from16 p3, v0

    .line 133
    .line 134
    const-string v0, "expiredTime"

    .line 135
    .line 136
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    move/from16 p4, v0

    .line 141
    .line 142
    const-string v0, "isRecycled"

    .line 143
    .line 144
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    move/from16 v16, v0

    .line 149
    .line 150
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 156
    .line 157
    .line 158
    move-result v17

    .line 159
    if-eqz v17, :cond_6

    .line 160
    .line 161
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v19

    .line 165
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v20

    .line 169
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v22

    .line 173
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v23

    .line 177
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v24

    .line 181
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v25

    .line 185
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v26

    .line 189
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v27

    .line 193
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v28

    .line 197
    move/from16 v17, v2

    .line 198
    .line 199
    move/from16 v40, v3

    .line 200
    .line 201
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 202
    .line 203
    .line 204
    move-result-wide v2

    .line 205
    long-to-int v2, v2

    .line 206
    move/from16 v29, v2

    .line 207
    .line 208
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    long-to-int v2, v2

    .line 213
    if-eqz v2, :cond_0

    .line 214
    .line 215
    const/16 v30, 0x1

    .line 216
    .line 217
    :goto_1
    move v2, v4

    .line 218
    goto :goto_2

    .line 219
    :cond_0
    const/16 v30, 0x0

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    long-to-int v3, v3

    .line 227
    move v4, v2

    .line 228
    move/from16 v31, v3

    .line 229
    .line 230
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    long-to-int v2, v2

    .line 235
    if-eqz v2, :cond_1

    .line 236
    .line 237
    const/16 v32, 0x1

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_1
    const/16 v32, 0x0

    .line 241
    .line 242
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_2

    .line 247
    .line 248
    const/16 v33, 0x0

    .line 249
    .line 250
    :goto_4
    move/from16 v2, p1

    .line 251
    .line 252
    move/from16 p1, v4

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-object/from16 v33, v2

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    long-to-int v3, v3

    .line 267
    move/from16 v4, p2

    .line 268
    .line 269
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 270
    .line 271
    .line 272
    move-result v35

    .line 273
    if-eqz v35, :cond_3

    .line 274
    .line 275
    const/16 v35, 0x0

    .line 276
    .line 277
    move/from16 p2, v2

    .line 278
    .line 279
    move/from16 v34, v3

    .line 280
    .line 281
    move/from16 v2, p3

    .line 282
    .line 283
    :goto_6
    move/from16 p3, v4

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v34

    .line 290
    move-object/from16 v35, v34

    .line 291
    .line 292
    move/from16 p2, v2

    .line 293
    .line 294
    move/from16 v2, p3

    .line 295
    .line 296
    move/from16 v34, v3

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v3

    .line 303
    long-to-int v3, v3

    .line 304
    if-eqz v3, :cond_4

    .line 305
    .line 306
    const/16 v36, 0x1

    .line 307
    .line 308
    :goto_8
    move/from16 v3, p4

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_4
    const/16 v36, 0x0

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v37

    .line 318
    move/from16 p4, v3

    .line 319
    .line 320
    move/from16 v4, v16

    .line 321
    .line 322
    move/from16 v16, v2

    .line 323
    .line 324
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 325
    .line 326
    .line 327
    move-result-wide v2

    .line 328
    long-to-int v2, v2

    .line 329
    if-eqz v2, :cond_5

    .line 330
    .line 331
    const/16 v39, 0x1

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_5
    const/16 v39, 0x0

    .line 335
    .line 336
    :goto_a
    new-instance v18, Lcom/friday/common/entity/FileEntity;

    .line 337
    .line 338
    invoke-direct/range {v18 .. v39}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v2, v18

    .line 342
    .line 343
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    .line 345
    .line 346
    move v2, v4

    .line 347
    move/from16 v4, p1

    .line 348
    .line 349
    move/from16 p1, p2

    .line 350
    .line 351
    move/from16 p2, p3

    .line 352
    .line 353
    move/from16 p3, v16

    .line 354
    .line 355
    move/from16 v16, v2

    .line 356
    .line 357
    move/from16 v2, v17

    .line 358
    .line 359
    move/from16 v3, v40

    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :catchall_0
    move-exception v0

    .line 364
    goto :goto_b

    .line 365
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 370
    .line 371
    .line 372
    throw v0
.end method

.method public static final b1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic c0(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->K1(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;
    .locals 42

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 v16, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v17, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 143
    .line 144
    .line 145
    move-result v18

    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    if-eqz v18, :cond_6

    .line 149
    .line 150
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v21

    .line 154
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v22

    .line 158
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v24

    .line 162
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v25

    .line 166
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v26

    .line 170
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v27

    .line 174
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v28

    .line 178
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v29

    .line 182
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v30

    .line 186
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v2

    .line 190
    long-to-int v2, v2

    .line 191
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 192
    .line 193
    .line 194
    move-result-wide v3

    .line 195
    long-to-int v3, v3

    .line 196
    const/4 v4, 0x0

    .line 197
    if-eqz v3, :cond_0

    .line 198
    .line 199
    const/16 v32, 0x1

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_0
    move/from16 v32, v4

    .line 203
    .line 204
    :goto_0
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v5

    .line 208
    long-to-int v3, v5

    .line 209
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v5

    .line 213
    long-to-int v5, v5

    .line 214
    if-eqz v5, :cond_1

    .line 215
    .line 216
    const/16 v34, 0x1

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_1
    move/from16 v34, v4

    .line 220
    .line 221
    :goto_1
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_2

    .line 226
    .line 227
    move-object/from16 v35, v19

    .line 228
    .line 229
    :goto_2
    move/from16 v5, p1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    move-object/from16 v35, v5

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :goto_3
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 240
    .line 241
    .line 242
    move-result-wide v5

    .line 243
    long-to-int v5, v5

    .line 244
    move/from16 v6, p2

    .line 245
    .line 246
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eqz v7, :cond_3

    .line 251
    .line 252
    :goto_4
    move/from16 v6, v16

    .line 253
    .line 254
    move-object/from16 v37, v19

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v19

    .line 261
    goto :goto_4

    .line 262
    :goto_5
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    long-to-int v6, v6

    .line 267
    if-eqz v6, :cond_4

    .line 268
    .line 269
    const/16 v38, 0x1

    .line 270
    .line 271
    :goto_6
    move/from16 v6, v17

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_4
    move/from16 v38, v4

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :goto_7
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 278
    .line 279
    .line 280
    move-result-wide v39

    .line 281
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v6

    .line 285
    long-to-int v0, v6

    .line 286
    if-eqz v0, :cond_5

    .line 287
    .line 288
    const/16 v41, 0x1

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_5
    move/from16 v41, v4

    .line 292
    .line 293
    :goto_8
    new-instance v20, Lcom/friday/common/entity/FileEntity;

    .line 294
    .line 295
    move/from16 v31, v2

    .line 296
    .line 297
    move/from16 v33, v3

    .line 298
    .line 299
    move/from16 v36, v5

    .line 300
    .line 301
    invoke-direct/range {v20 .. v41}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    .line 304
    move-object/from16 v19, v20

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    goto :goto_a

    .line 309
    :cond_6
    :goto_9
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 310
    .line 311
    .line 312
    return-object v19

    .line 313
    :goto_a
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 314
    .line 315
    .line 316
    throw v0
.end method

.method public static synthetic d0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->c1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final d1(Ljava/lang/String;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 43

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x1

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {v1, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :cond_0
    const-string v0, "fileId"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v3, "accountId"

    .line 47
    .line 48
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-string v4, "fileName"

    .line 53
    .line 54
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const-string v5, "ossFileUrl"

    .line 59
    .line 60
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const-string v6, "localFileUrl"

    .line 65
    .line 66
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const-string v7, "fileType"

    .line 71
    .line 72
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    const-string v8, "parentId"

    .line 77
    .line 78
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    const-string v9, "createTime"

    .line 83
    .line 84
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    const-string v10, "updateTime"

    .line 89
    .line 90
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    const-string v11, "state"

    .line 95
    .line 96
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    const-string v12, "isSync"

    .line 101
    .line 102
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    const-string v13, "version"

    .line 107
    .line 108
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    const-string v14, "isShared"

    .line 113
    .line 114
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    const-string v15, "preFileId"

    .line 119
    .line 120
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    const-string v2, "errorTimes"

    .line 125
    .line 126
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    move/from16 p1, v2

    .line 131
    .line 132
    const-string v2, "md5"

    .line 133
    .line 134
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    move/from16 p2, v2

    .line 139
    .line 140
    const-string v2, "cached"

    .line 141
    .line 142
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    move/from16 v16, v2

    .line 147
    .line 148
    const-string v2, "expiredTime"

    .line 149
    .line 150
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    move/from16 v17, v2

    .line 155
    .line 156
    const-string v2, "isRecycled"

    .line 157
    .line 158
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    move/from16 v18, v2

    .line 163
    .line 164
    new-instance v2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    :goto_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 170
    .line 171
    .line 172
    move-result v19

    .line 173
    if-eqz v19, :cond_7

    .line 174
    .line 175
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v21

    .line 179
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 180
    .line 181
    .line 182
    move-result-wide v22

    .line 183
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v24

    .line 187
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v25

    .line 191
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v26

    .line 195
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v27

    .line 199
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v28

    .line 203
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v29

    .line 207
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v30

    .line 211
    move/from16 v19, v3

    .line 212
    .line 213
    move/from16 v42, v4

    .line 214
    .line 215
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 216
    .line 217
    .line 218
    move-result-wide v3

    .line 219
    long-to-int v3, v3

    .line 220
    move/from16 v31, v3

    .line 221
    .line 222
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    long-to-int v3, v3

    .line 227
    if-eqz v3, :cond_1

    .line 228
    .line 229
    const/16 v32, 0x1

    .line 230
    .line 231
    :goto_2
    move v3, v5

    .line 232
    goto :goto_3

    .line 233
    :cond_1
    const/16 v32, 0x0

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :goto_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v4

    .line 240
    long-to-int v4, v4

    .line 241
    move v5, v3

    .line 242
    move/from16 v33, v4

    .line 243
    .line 244
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 245
    .line 246
    .line 247
    move-result-wide v3

    .line 248
    long-to-int v3, v3

    .line 249
    if-eqz v3, :cond_2

    .line 250
    .line 251
    const/16 v34, 0x1

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_2
    const/16 v34, 0x0

    .line 255
    .line 256
    :goto_4
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_3

    .line 261
    .line 262
    const/16 v35, 0x0

    .line 263
    .line 264
    :goto_5
    move/from16 v3, p1

    .line 265
    .line 266
    move/from16 p1, v5

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    move-object/from16 v35, v3

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :goto_6
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 277
    .line 278
    .line 279
    move-result-wide v4

    .line 280
    long-to-int v4, v4

    .line 281
    move/from16 v5, p2

    .line 282
    .line 283
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 284
    .line 285
    .line 286
    move-result v37

    .line 287
    if-eqz v37, :cond_4

    .line 288
    .line 289
    const/16 v37, 0x0

    .line 290
    .line 291
    move/from16 p2, v0

    .line 292
    .line 293
    move/from16 v36, v4

    .line 294
    .line 295
    move/from16 v0, v16

    .line 296
    .line 297
    move/from16 v16, v3

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_4
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v36

    .line 304
    move-object/from16 v37, v36

    .line 305
    .line 306
    move/from16 p2, v0

    .line 307
    .line 308
    move/from16 v0, v16

    .line 309
    .line 310
    move/from16 v16, v3

    .line 311
    .line 312
    move/from16 v36, v4

    .line 313
    .line 314
    :goto_7
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v3

    .line 318
    long-to-int v3, v3

    .line 319
    if-eqz v3, :cond_5

    .line 320
    .line 321
    const/16 v38, 0x1

    .line 322
    .line 323
    :goto_8
    move/from16 v3, v17

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_5
    const/16 v38, 0x0

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v39

    .line 333
    move/from16 v17, v6

    .line 334
    .line 335
    move/from16 v4, v18

    .line 336
    .line 337
    move/from16 v18, v5

    .line 338
    .line 339
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v5

    .line 343
    long-to-int v5, v5

    .line 344
    if-eqz v5, :cond_6

    .line 345
    .line 346
    const/16 v41, 0x1

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_6
    const/16 v41, 0x0

    .line 350
    .line 351
    :goto_a
    new-instance v20, Lcom/friday/common/entity/FileEntity;

    .line 352
    .line 353
    invoke-direct/range {v20 .. v41}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v5, v20

    .line 357
    .line 358
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    .line 360
    .line 361
    move/from16 v5, p1

    .line 362
    .line 363
    move/from16 p1, v16

    .line 364
    .line 365
    move/from16 v6, v17

    .line 366
    .line 367
    move/from16 v16, v0

    .line 368
    .line 369
    move/from16 v17, v3

    .line 370
    .line 371
    move/from16 v3, v19

    .line 372
    .line 373
    move/from16 v0, p2

    .line 374
    .line 375
    move/from16 p2, v18

    .line 376
    .line 377
    move/from16 v18, v4

    .line 378
    .line 379
    move/from16 v4, v42

    .line 380
    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :cond_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 384
    .line 385
    .line 386
    return-object v2

    .line 387
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 388
    .line 389
    .line 390
    throw v0
.end method

.method public static synthetic e0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->L1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final e1(JLjava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p0, p1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    invoke-interface {p3, p0, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic f0(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->h1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final f1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 41

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-wide/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const-string v2, "fileId"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "accountId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "fileName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "ossFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "localFileUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "fileType"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "parentId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "createTime"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "updateTime"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "state"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "isSync"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "version"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    const-string v14, "isShared"

    .line 99
    .line 100
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const-string v15, "preFileId"

    .line 105
    .line 106
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    const-string v0, "errorTimes"

    .line 111
    .line 112
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    move/from16 p1, v0

    .line 117
    .line 118
    const-string v0, "md5"

    .line 119
    .line 120
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    move/from16 p2, v0

    .line 125
    .line 126
    const-string v0, "cached"

    .line 127
    .line 128
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    move/from16 p3, v0

    .line 133
    .line 134
    const-string v0, "expiredTime"

    .line 135
    .line 136
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    move/from16 p4, v0

    .line 141
    .line 142
    const-string v0, "isRecycled"

    .line 143
    .line 144
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    move/from16 v16, v0

    .line 149
    .line 150
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 156
    .line 157
    .line 158
    move-result v17

    .line 159
    if-eqz v17, :cond_6

    .line 160
    .line 161
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v19

    .line 165
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v20

    .line 169
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v22

    .line 173
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v23

    .line 177
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v24

    .line 181
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v25

    .line 185
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v26

    .line 189
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v27

    .line 193
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v28

    .line 197
    move/from16 v17, v2

    .line 198
    .line 199
    move/from16 v40, v3

    .line 200
    .line 201
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 202
    .line 203
    .line 204
    move-result-wide v2

    .line 205
    long-to-int v2, v2

    .line 206
    move/from16 v29, v2

    .line 207
    .line 208
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    long-to-int v2, v2

    .line 213
    if-eqz v2, :cond_0

    .line 214
    .line 215
    const/16 v30, 0x1

    .line 216
    .line 217
    :goto_1
    move v2, v4

    .line 218
    goto :goto_2

    .line 219
    :cond_0
    const/16 v30, 0x0

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    long-to-int v3, v3

    .line 227
    move v4, v2

    .line 228
    move/from16 v31, v3

    .line 229
    .line 230
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    long-to-int v2, v2

    .line 235
    if-eqz v2, :cond_1

    .line 236
    .line 237
    const/16 v32, 0x1

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_1
    const/16 v32, 0x0

    .line 241
    .line 242
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_2

    .line 247
    .line 248
    const/16 v33, 0x0

    .line 249
    .line 250
    :goto_4
    move/from16 v2, p1

    .line 251
    .line 252
    move/from16 p1, v4

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-object/from16 v33, v2

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    long-to-int v3, v3

    .line 267
    move/from16 v4, p2

    .line 268
    .line 269
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 270
    .line 271
    .line 272
    move-result v35

    .line 273
    if-eqz v35, :cond_3

    .line 274
    .line 275
    const/16 v35, 0x0

    .line 276
    .line 277
    move/from16 p2, v2

    .line 278
    .line 279
    move/from16 v34, v3

    .line 280
    .line 281
    move/from16 v2, p3

    .line 282
    .line 283
    :goto_6
    move/from16 p3, v4

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v34

    .line 290
    move-object/from16 v35, v34

    .line 291
    .line 292
    move/from16 p2, v2

    .line 293
    .line 294
    move/from16 v2, p3

    .line 295
    .line 296
    move/from16 v34, v3

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v3

    .line 303
    long-to-int v3, v3

    .line 304
    if-eqz v3, :cond_4

    .line 305
    .line 306
    const/16 v36, 0x1

    .line 307
    .line 308
    :goto_8
    move/from16 v3, p4

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_4
    const/16 v36, 0x0

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v37

    .line 318
    move/from16 p4, v3

    .line 319
    .line 320
    move/from16 v4, v16

    .line 321
    .line 322
    move/from16 v16, v2

    .line 323
    .line 324
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 325
    .line 326
    .line 327
    move-result-wide v2

    .line 328
    long-to-int v2, v2

    .line 329
    if-eqz v2, :cond_5

    .line 330
    .line 331
    const/16 v39, 0x1

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_5
    const/16 v39, 0x0

    .line 335
    .line 336
    :goto_a
    new-instance v18, Lcom/friday/common/entity/FileEntity;

    .line 337
    .line 338
    invoke-direct/range {v18 .. v39}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v2, v18

    .line 342
    .line 343
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    .line 345
    .line 346
    move v2, v4

    .line 347
    move/from16 v4, p1

    .line 348
    .line 349
    move/from16 p1, p2

    .line 350
    .line 351
    move/from16 p2, p3

    .line 352
    .line 353
    move/from16 p3, v16

    .line 354
    .line 355
    move/from16 v16, v2

    .line 356
    .line 357
    move/from16 v2, v17

    .line 358
    .line 359
    move/from16 v3, v40

    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :catchall_0
    move-exception v0

    .line 364
    goto :goto_b

    .line 365
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 370
    .line 371
    .line 372
    throw v0
.end method

.method public static synthetic g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->E1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final g1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    invoke-interface {p3, p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic h0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->m1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final h1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    invoke-interface {p3, p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic i0(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->H1(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final i1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/FileEntity;
    .locals 42

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 v16, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v17, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 143
    .line 144
    .line 145
    move-result v18

    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    if-eqz v18, :cond_6

    .line 149
    .line 150
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v21

    .line 154
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v22

    .line 158
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v24

    .line 162
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v25

    .line 166
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v26

    .line 170
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v27

    .line 174
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v28

    .line 178
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v29

    .line 182
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v30

    .line 186
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v2

    .line 190
    long-to-int v2, v2

    .line 191
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 192
    .line 193
    .line 194
    move-result-wide v3

    .line 195
    long-to-int v3, v3

    .line 196
    const/4 v4, 0x0

    .line 197
    if-eqz v3, :cond_0

    .line 198
    .line 199
    const/16 v32, 0x1

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_0
    move/from16 v32, v4

    .line 203
    .line 204
    :goto_0
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v5

    .line 208
    long-to-int v3, v5

    .line 209
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v5

    .line 213
    long-to-int v5, v5

    .line 214
    if-eqz v5, :cond_1

    .line 215
    .line 216
    const/16 v34, 0x1

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_1
    move/from16 v34, v4

    .line 220
    .line 221
    :goto_1
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_2

    .line 226
    .line 227
    move-object/from16 v35, v19

    .line 228
    .line 229
    :goto_2
    move/from16 v5, p1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    move-object/from16 v35, v5

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :goto_3
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 240
    .line 241
    .line 242
    move-result-wide v5

    .line 243
    long-to-int v5, v5

    .line 244
    move/from16 v6, p2

    .line 245
    .line 246
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eqz v7, :cond_3

    .line 251
    .line 252
    :goto_4
    move/from16 v6, v16

    .line 253
    .line 254
    move-object/from16 v37, v19

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v19

    .line 261
    goto :goto_4

    .line 262
    :goto_5
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    long-to-int v6, v6

    .line 267
    if-eqz v6, :cond_4

    .line 268
    .line 269
    const/16 v38, 0x1

    .line 270
    .line 271
    :goto_6
    move/from16 v6, v17

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_4
    move/from16 v38, v4

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :goto_7
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 278
    .line 279
    .line 280
    move-result-wide v39

    .line 281
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v6

    .line 285
    long-to-int v0, v6

    .line 286
    if-eqz v0, :cond_5

    .line 287
    .line 288
    const/16 v41, 0x1

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_5
    move/from16 v41, v4

    .line 292
    .line 293
    :goto_8
    new-instance v20, Lcom/friday/common/entity/FileEntity;

    .line 294
    .line 295
    move/from16 v31, v2

    .line 296
    .line 297
    move/from16 v33, v3

    .line 298
    .line 299
    move/from16 v36, v5

    .line 300
    .line 301
    invoke-direct/range {v20 .. v41}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    .line 304
    move-object/from16 v19, v20

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    goto :goto_a

    .line 309
    :cond_6
    :goto_9
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 310
    .line 311
    .line 312
    return-object v19

    .line 313
    :goto_a
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 314
    .line 315
    .line 316
    throw v0
.end method

.method public static synthetic j0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->p1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic k0(JLjava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->e1(JLjava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final k1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 40

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-object/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    move-wide/from16 v3, p3

    .line 28
    .line 29
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    .line 31
    .line 32
    const-string v2, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const-string v3, "accountId"

    .line 39
    .line 40
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const-string v4, "fileName"

    .line 45
    .line 46
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const-string v5, "ossFileUrl"

    .line 51
    .line 52
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const-string v6, "localFileUrl"

    .line 57
    .line 58
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-string v7, "fileType"

    .line 63
    .line 64
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const-string v8, "parentId"

    .line 69
    .line 70
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-string v9, "createTime"

    .line 75
    .line 76
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    const-string v10, "updateTime"

    .line 81
    .line 82
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const-string v11, "state"

    .line 87
    .line 88
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const-string v12, "isSync"

    .line 93
    .line 94
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    const-string v13, "version"

    .line 99
    .line 100
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    const-string v14, "isShared"

    .line 105
    .line 106
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    const-string v15, "preFileId"

    .line 111
    .line 112
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    const-string v0, "errorTimes"

    .line 117
    .line 118
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    move/from16 p1, v0

    .line 123
    .line 124
    const-string v0, "md5"

    .line 125
    .line 126
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    move/from16 p2, v0

    .line 131
    .line 132
    const-string v0, "cached"

    .line 133
    .line 134
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    move/from16 p3, v0

    .line 139
    .line 140
    const-string v0, "expiredTime"

    .line 141
    .line 142
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move/from16 p4, v0

    .line 147
    .line 148
    const-string v0, "isRecycled"

    .line 149
    .line 150
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    move/from16 p5, v0

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_6

    .line 166
    .line 167
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v18

    .line 171
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v19

    .line 175
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v21

    .line 179
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v22

    .line 183
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v23

    .line 187
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v24

    .line 191
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v25

    .line 195
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v26

    .line 199
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v27

    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    move/from16 v39, v3

    .line 206
    .line 207
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    long-to-int v2, v2

    .line 212
    move/from16 v28, v2

    .line 213
    .line 214
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    long-to-int v2, v2

    .line 219
    if-eqz v2, :cond_0

    .line 220
    .line 221
    const/16 v29, 0x1

    .line 222
    .line 223
    :goto_1
    move v2, v4

    .line 224
    goto :goto_2

    .line 225
    :cond_0
    const/16 v29, 0x0

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    long-to-int v3, v3

    .line 233
    move v4, v2

    .line 234
    move/from16 v30, v3

    .line 235
    .line 236
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    long-to-int v2, v2

    .line 241
    if-eqz v2, :cond_1

    .line 242
    .line 243
    const/16 v31, 0x1

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_1
    const/16 v31, 0x0

    .line 247
    .line 248
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_2

    .line 253
    .line 254
    const/16 v32, 0x0

    .line 255
    .line 256
    :goto_4
    move/from16 v2, p1

    .line 257
    .line 258
    move/from16 p1, v4

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    move-object/from16 v32, v2

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    long-to-int v3, v3

    .line 273
    move/from16 v4, p2

    .line 274
    .line 275
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 276
    .line 277
    .line 278
    move-result v34

    .line 279
    if-eqz v34, :cond_3

    .line 280
    .line 281
    const/16 v34, 0x0

    .line 282
    .line 283
    move/from16 p2, v2

    .line 284
    .line 285
    move/from16 v33, v3

    .line 286
    .line 287
    move/from16 v2, p3

    .line 288
    .line 289
    :goto_6
    move/from16 p3, v4

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v33

    .line 296
    move-object/from16 v34, v33

    .line 297
    .line 298
    move/from16 p2, v2

    .line 299
    .line 300
    move/from16 v2, p3

    .line 301
    .line 302
    move/from16 v33, v3

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v3

    .line 309
    long-to-int v3, v3

    .line 310
    if-eqz v3, :cond_4

    .line 311
    .line 312
    const/16 v35, 0x1

    .line 313
    .line 314
    :goto_8
    move/from16 v3, p4

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_4
    const/16 v35, 0x0

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v36

    .line 324
    move/from16 v4, p5

    .line 325
    .line 326
    move/from16 p4, v2

    .line 327
    .line 328
    move/from16 p5, v3

    .line 329
    .line 330
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    if-eqz v2, :cond_5

    .line 336
    .line 337
    const/16 v38, 0x1

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_5
    const/16 v38, 0x0

    .line 341
    .line 342
    :goto_a
    new-instance v17, Lcom/friday/common/entity/FileEntity;

    .line 343
    .line 344
    invoke-direct/range {v17 .. v38}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v2, v17

    .line 348
    .line 349
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    .line 351
    .line 352
    move v2, v4

    .line 353
    move/from16 v4, p1

    .line 354
    .line 355
    move/from16 p1, p2

    .line 356
    .line 357
    move/from16 p2, p3

    .line 358
    .line 359
    move/from16 p3, p4

    .line 360
    .line 361
    move/from16 p4, p5

    .line 362
    .line 363
    move/from16 p5, v2

    .line 364
    .line 365
    move/from16 v2, v16

    .line 366
    .line 367
    move/from16 v3, v39

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :catchall_0
    move-exception v0

    .line 372
    goto :goto_b

    .line 373
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 374
    .line 375
    .line 376
    return-object v0

    .line 377
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 378
    .line 379
    .line 380
    throw v0
.end method

.method public static synthetic l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/FileDao_Impl;->k1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final l1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic m0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->j1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final m1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic n0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/FileDao_Impl;->I1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final n1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
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
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide p2

    .line 34
    long-to-int p2, p2

    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public static synthetic o0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/FileDao_Impl;->A1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final o1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 40

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-object/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    move-wide/from16 v3, p3

    .line 28
    .line 29
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    .line 31
    .line 32
    const-string v2, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const-string v3, "accountId"

    .line 39
    .line 40
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const-string v4, "fileName"

    .line 45
    .line 46
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const-string v5, "ossFileUrl"

    .line 51
    .line 52
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const-string v6, "localFileUrl"

    .line 57
    .line 58
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-string v7, "fileType"

    .line 63
    .line 64
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const-string v8, "parentId"

    .line 69
    .line 70
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-string v9, "createTime"

    .line 75
    .line 76
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    const-string v10, "updateTime"

    .line 81
    .line 82
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const-string v11, "state"

    .line 87
    .line 88
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const-string v12, "isSync"

    .line 93
    .line 94
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    const-string v13, "version"

    .line 99
    .line 100
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    const-string v14, "isShared"

    .line 105
    .line 106
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    const-string v15, "preFileId"

    .line 111
    .line 112
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    const-string v0, "errorTimes"

    .line 117
    .line 118
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    move/from16 p1, v0

    .line 123
    .line 124
    const-string v0, "md5"

    .line 125
    .line 126
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    move/from16 p2, v0

    .line 131
    .line 132
    const-string v0, "cached"

    .line 133
    .line 134
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    move/from16 p3, v0

    .line 139
    .line 140
    const-string v0, "expiredTime"

    .line 141
    .line 142
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move/from16 p4, v0

    .line 147
    .line 148
    const-string v0, "isRecycled"

    .line 149
    .line 150
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    move/from16 p5, v0

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_6

    .line 166
    .line 167
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v18

    .line 171
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v19

    .line 175
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v21

    .line 179
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v22

    .line 183
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v23

    .line 187
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v24

    .line 191
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v25

    .line 195
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v26

    .line 199
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v27

    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    move/from16 v39, v3

    .line 206
    .line 207
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    long-to-int v2, v2

    .line 212
    move/from16 v28, v2

    .line 213
    .line 214
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    long-to-int v2, v2

    .line 219
    if-eqz v2, :cond_0

    .line 220
    .line 221
    const/16 v29, 0x1

    .line 222
    .line 223
    :goto_1
    move v2, v4

    .line 224
    goto :goto_2

    .line 225
    :cond_0
    const/16 v29, 0x0

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    long-to-int v3, v3

    .line 233
    move v4, v2

    .line 234
    move/from16 v30, v3

    .line 235
    .line 236
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    long-to-int v2, v2

    .line 241
    if-eqz v2, :cond_1

    .line 242
    .line 243
    const/16 v31, 0x1

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_1
    const/16 v31, 0x0

    .line 247
    .line 248
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_2

    .line 253
    .line 254
    const/16 v32, 0x0

    .line 255
    .line 256
    :goto_4
    move/from16 v2, p1

    .line 257
    .line 258
    move/from16 p1, v4

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    move-object/from16 v32, v2

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    long-to-int v3, v3

    .line 273
    move/from16 v4, p2

    .line 274
    .line 275
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 276
    .line 277
    .line 278
    move-result v34

    .line 279
    if-eqz v34, :cond_3

    .line 280
    .line 281
    const/16 v34, 0x0

    .line 282
    .line 283
    move/from16 p2, v2

    .line 284
    .line 285
    move/from16 v33, v3

    .line 286
    .line 287
    move/from16 v2, p3

    .line 288
    .line 289
    :goto_6
    move/from16 p3, v4

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v33

    .line 296
    move-object/from16 v34, v33

    .line 297
    .line 298
    move/from16 p2, v2

    .line 299
    .line 300
    move/from16 v2, p3

    .line 301
    .line 302
    move/from16 v33, v3

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v3

    .line 309
    long-to-int v3, v3

    .line 310
    if-eqz v3, :cond_4

    .line 311
    .line 312
    const/16 v35, 0x1

    .line 313
    .line 314
    :goto_8
    move/from16 v3, p4

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_4
    const/16 v35, 0x0

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v36

    .line 324
    move/from16 v4, p5

    .line 325
    .line 326
    move/from16 p4, v2

    .line 327
    .line 328
    move/from16 p5, v3

    .line 329
    .line 330
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    if-eqz v2, :cond_5

    .line 336
    .line 337
    const/16 v38, 0x1

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_5
    const/16 v38, 0x0

    .line 341
    .line 342
    :goto_a
    new-instance v17, Lcom/friday/common/entity/FileEntity;

    .line 343
    .line 344
    invoke-direct/range {v17 .. v38}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v2, v17

    .line 348
    .line 349
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    .line 351
    .line 352
    move v2, v4

    .line 353
    move/from16 v4, p1

    .line 354
    .line 355
    move/from16 p1, p2

    .line 356
    .line 357
    move/from16 p2, p3

    .line 358
    .line 359
    move/from16 p3, p4

    .line 360
    .line 361
    move/from16 p4, p5

    .line 362
    .line 363
    move/from16 p5, v2

    .line 364
    .line 365
    move/from16 v2, v16

    .line 366
    .line 367
    move/from16 v3, v39

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :catchall_0
    move-exception v0

    .line 372
    goto :goto_b

    .line 373
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 374
    .line 375
    .line 376
    return-object v0

    .line 377
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 378
    .line 379
    .line 380
    throw v0
.end method

.method public static synthetic p0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->n1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final p1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/String;
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
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 37
    .line 38
    .line 39
    return-object p2

    .line 40
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public static synthetic q0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->l1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 40

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-object/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    move-wide/from16 v3, p3

    .line 28
    .line 29
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 30
    .line 31
    .line 32
    const-string v2, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const-string v3, "accountId"

    .line 39
    .line 40
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const-string v4, "fileName"

    .line 45
    .line 46
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const-string v5, "ossFileUrl"

    .line 51
    .line 52
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const-string v6, "localFileUrl"

    .line 57
    .line 58
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-string v7, "fileType"

    .line 63
    .line 64
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const-string v8, "parentId"

    .line 69
    .line 70
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-string v9, "createTime"

    .line 75
    .line 76
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    const-string v10, "updateTime"

    .line 81
    .line 82
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const-string v11, "state"

    .line 87
    .line 88
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const-string v12, "isSync"

    .line 93
    .line 94
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    const-string v13, "version"

    .line 99
    .line 100
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    const-string v14, "isShared"

    .line 105
    .line 106
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    const-string v15, "preFileId"

    .line 111
    .line 112
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    const-string v0, "errorTimes"

    .line 117
    .line 118
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    move/from16 p1, v0

    .line 123
    .line 124
    const-string v0, "md5"

    .line 125
    .line 126
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    move/from16 p2, v0

    .line 131
    .line 132
    const-string v0, "cached"

    .line 133
    .line 134
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    move/from16 p3, v0

    .line 139
    .line 140
    const-string v0, "expiredTime"

    .line 141
    .line 142
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move/from16 p4, v0

    .line 147
    .line 148
    const-string v0, "isRecycled"

    .line 149
    .line 150
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    move/from16 p5, v0

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_6

    .line 166
    .line 167
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v18

    .line 171
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v19

    .line 175
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v21

    .line 179
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v22

    .line 183
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v23

    .line 187
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v24

    .line 191
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v25

    .line 195
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v26

    .line 199
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v27

    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    move/from16 v39, v3

    .line 206
    .line 207
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    long-to-int v2, v2

    .line 212
    move/from16 v28, v2

    .line 213
    .line 214
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    long-to-int v2, v2

    .line 219
    if-eqz v2, :cond_0

    .line 220
    .line 221
    const/16 v29, 0x1

    .line 222
    .line 223
    :goto_1
    move v2, v4

    .line 224
    goto :goto_2

    .line 225
    :cond_0
    const/16 v29, 0x0

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    long-to-int v3, v3

    .line 233
    move v4, v2

    .line 234
    move/from16 v30, v3

    .line 235
    .line 236
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    long-to-int v2, v2

    .line 241
    if-eqz v2, :cond_1

    .line 242
    .line 243
    const/16 v31, 0x1

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_1
    const/16 v31, 0x0

    .line 247
    .line 248
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_2

    .line 253
    .line 254
    const/16 v32, 0x0

    .line 255
    .line 256
    :goto_4
    move/from16 v2, p1

    .line 257
    .line 258
    move/from16 p1, v4

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    move-object/from16 v32, v2

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    long-to-int v3, v3

    .line 273
    move/from16 v4, p2

    .line 274
    .line 275
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 276
    .line 277
    .line 278
    move-result v34

    .line 279
    if-eqz v34, :cond_3

    .line 280
    .line 281
    const/16 v34, 0x0

    .line 282
    .line 283
    move/from16 p2, v2

    .line 284
    .line 285
    move/from16 v33, v3

    .line 286
    .line 287
    move/from16 v2, p3

    .line 288
    .line 289
    :goto_6
    move/from16 p3, v4

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v33

    .line 296
    move-object/from16 v34, v33

    .line 297
    .line 298
    move/from16 p2, v2

    .line 299
    .line 300
    move/from16 v2, p3

    .line 301
    .line 302
    move/from16 v33, v3

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v3

    .line 309
    long-to-int v3, v3

    .line 310
    if-eqz v3, :cond_4

    .line 311
    .line 312
    const/16 v35, 0x1

    .line 313
    .line 314
    :goto_8
    move/from16 v3, p4

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_4
    const/16 v35, 0x0

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v36

    .line 324
    move/from16 v4, p5

    .line 325
    .line 326
    move/from16 p4, v2

    .line 327
    .line 328
    move/from16 p5, v3

    .line 329
    .line 330
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    if-eqz v2, :cond_5

    .line 336
    .line 337
    const/16 v38, 0x1

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_5
    const/16 v38, 0x0

    .line 341
    .line 342
    :goto_a
    new-instance v17, Lcom/friday/common/entity/FileEntity;

    .line 343
    .line 344
    invoke-direct/range {v17 .. v38}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v2, v17

    .line 348
    .line 349
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    .line 351
    .line 352
    move v2, v4

    .line 353
    move/from16 v4, p1

    .line 354
    .line 355
    move/from16 p1, p2

    .line 356
    .line 357
    move/from16 p2, p3

    .line 358
    .line 359
    move/from16 p3, p4

    .line 360
    .line 361
    move/from16 p4, p5

    .line 362
    .line 363
    move/from16 p5, v2

    .line 364
    .line 365
    move/from16 v2, v16

    .line 366
    .line 367
    move/from16 v3, v39

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :catchall_0
    move-exception v0

    .line 372
    goto :goto_b

    .line 373
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 374
    .line 375
    .line 376
    return-object v0

    .line 377
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 378
    .line 379
    .line 380
    throw v0
.end method

.method public static synthetic r0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao_Impl;->s1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final r1(JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p2, v0, p0, p1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic s0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/common/dao/FileDao_Impl;->B1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final s1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic t0(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->x1(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final t1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic u0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/FileDao_Impl;->q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final u1(Ljava/lang/String;JLandroidx/sqlite/SQLiteStatement;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    invoke-interface {p3, p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic v0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->y1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final v1(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 42

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v0, 0x1

    .line 15
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "fileName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "ossFileUrl"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "localFileUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "fileType"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "parentId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "createTime"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "updateTime"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "state"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "isSync"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "version"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "isShared"

    .line 93
    .line 94
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "preFileId"

    .line 99
    .line 100
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "errorTimes"

    .line 105
    .line 106
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "md5"

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 p2, v0

    .line 119
    .line 120
    const-string v0, "cached"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 p3, v0

    .line 127
    .line 128
    const-string v0, "expiredTime"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v16, v0

    .line 135
    .line 136
    const-string v0, "isRecycled"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v17, v0

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_6

    .line 154
    .line 155
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v21

    .line 163
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v25

    .line 175
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v26

    .line 179
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v27

    .line 183
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v28

    .line 187
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v29

    .line 191
    move/from16 v18, v2

    .line 192
    .line 193
    move/from16 v41, v3

    .line 194
    .line 195
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    long-to-int v2, v2

    .line 200
    move/from16 v30, v2

    .line 201
    .line 202
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v2

    .line 206
    long-to-int v2, v2

    .line 207
    if-eqz v2, :cond_0

    .line 208
    .line 209
    const/16 v31, 0x1

    .line 210
    .line 211
    :goto_1
    move v2, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_0
    const/16 v31, 0x0

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    long-to-int v3, v3

    .line 221
    move v4, v2

    .line 222
    move/from16 v32, v3

    .line 223
    .line 224
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    long-to-int v2, v2

    .line 229
    if-eqz v2, :cond_1

    .line 230
    .line 231
    const/16 v33, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_1
    const/16 v33, 0x0

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    const/16 v34, 0x0

    .line 243
    .line 244
    :goto_4
    move/from16 v2, p1

    .line 245
    .line 246
    move/from16 p1, v4

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_2
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object/from16 v34, v2

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :goto_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    long-to-int v3, v3

    .line 261
    move/from16 v4, p2

    .line 262
    .line 263
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v36

    .line 267
    if-eqz v36, :cond_3

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    move/from16 p2, v2

    .line 272
    .line 273
    move/from16 v35, v3

    .line 274
    .line 275
    move/from16 v2, p3

    .line 276
    .line 277
    :goto_6
    move/from16 p3, v4

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_3
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v35

    .line 284
    move-object/from16 v36, v35

    .line 285
    .line 286
    move/from16 p2, v2

    .line 287
    .line 288
    move/from16 v2, p3

    .line 289
    .line 290
    move/from16 v35, v3

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :goto_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    long-to-int v3, v3

    .line 298
    if-eqz v3, :cond_4

    .line 299
    .line 300
    const/16 v37, 0x1

    .line 301
    .line 302
    :goto_8
    move/from16 v3, v16

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_4
    const/16 v37, 0x0

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v38

    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move/from16 v4, v17

    .line 315
    .line 316
    move/from16 v17, v3

    .line 317
    .line 318
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    long-to-int v2, v2

    .line 323
    if-eqz v2, :cond_5

    .line 324
    .line 325
    const/16 v40, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_5
    const/16 v40, 0x0

    .line 329
    .line 330
    :goto_a
    new-instance v19, Lcom/friday/common/entity/FileEntity;

    .line 331
    .line 332
    invoke-direct/range {v19 .. v40}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v19

    .line 336
    .line 337
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    move v2, v4

    .line 341
    move/from16 v4, p1

    .line 342
    .line 343
    move/from16 p1, p2

    .line 344
    .line 345
    move/from16 p2, p3

    .line 346
    .line 347
    move/from16 p3, v16

    .line 348
    .line 349
    move/from16 v16, v17

    .line 350
    .line 351
    move/from16 v17, v2

    .line 352
    .line 353
    move/from16 v2, v18

    .line 354
    .line 355
    move/from16 v3, v41

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :catchall_0
    move-exception v0

    .line 360
    goto :goto_b

    .line 361
    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic w0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->X0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final w1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    const-string v4, "_connection"

    .line 8
    .line 9
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p0

    .line 13
    .line 14
    invoke-interface {v3, v4}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x1

    .line 19
    :try_start_0
    invoke-interface {v3, v4, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    invoke-interface {v3, v5, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-interface {v3, v5, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    invoke-interface {v3, v5, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x5

    .line 35
    invoke-interface {v3, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    invoke-interface {v3, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x7

    .line 43
    invoke-interface {v3, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 44
    .line 45
    .line 46
    const-string v0, "fileId"

    .line 47
    .line 48
    invoke-static {v3, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const-string v1, "accountId"

    .line 53
    .line 54
    invoke-static {v3, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const-string v2, "fileName"

    .line 59
    .line 60
    invoke-static {v3, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const-string v5, "ossFileUrl"

    .line 65
    .line 66
    invoke-static {v3, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const-string v6, "localFileUrl"

    .line 71
    .line 72
    invoke-static {v3, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    const-string v7, "fileType"

    .line 77
    .line 78
    invoke-static {v3, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    const-string v8, "parentId"

    .line 83
    .line 84
    invoke-static {v3, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const-string v9, "createTime"

    .line 89
    .line 90
    invoke-static {v3, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    const-string v10, "updateTime"

    .line 95
    .line 96
    invoke-static {v3, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    const-string v11, "state"

    .line 101
    .line 102
    invoke-static {v3, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    const-string v12, "isSync"

    .line 107
    .line 108
    invoke-static {v3, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    const-string v13, "version"

    .line 113
    .line 114
    invoke-static {v3, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    const-string v14, "isShared"

    .line 119
    .line 120
    invoke-static {v3, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    const-string v15, "preFileId"

    .line 125
    .line 126
    invoke-static {v3, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    const-string v4, "errorTimes"

    .line 131
    .line 132
    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    move/from16 p1, v4

    .line 137
    .line 138
    const-string v4, "md5"

    .line 139
    .line 140
    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    move/from16 p2, v4

    .line 145
    .line 146
    const-string v4, "cached"

    .line 147
    .line 148
    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    move/from16 p3, v4

    .line 153
    .line 154
    const-string v4, "expiredTime"

    .line 155
    .line 156
    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    move/from16 p4, v4

    .line 161
    .line 162
    const-string v4, "isRecycled"

    .line 163
    .line 164
    invoke-static {v3, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    move/from16 v16, v4

    .line 169
    .line 170
    new-instance v4, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    :goto_0
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    if-eqz v17, :cond_6

    .line 180
    .line 181
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v19

    .line 185
    invoke-interface {v3, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v20

    .line 189
    invoke-interface {v3, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v22

    .line 193
    invoke-interface {v3, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v23

    .line 197
    invoke-interface {v3, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v24

    .line 201
    invoke-interface {v3, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v25

    .line 205
    invoke-interface {v3, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v26

    .line 209
    invoke-interface {v3, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v27

    .line 213
    invoke-interface {v3, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v28

    .line 217
    move/from16 v17, v0

    .line 218
    .line 219
    move/from16 v40, v1

    .line 220
    .line 221
    invoke-interface {v3, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 222
    .line 223
    .line 224
    move-result-wide v0

    .line 225
    long-to-int v0, v0

    .line 226
    move/from16 v29, v0

    .line 227
    .line 228
    invoke-interface {v3, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    long-to-int v0, v0

    .line 233
    if-eqz v0, :cond_0

    .line 234
    .line 235
    const/16 v30, 0x1

    .line 236
    .line 237
    :goto_1
    move v0, v2

    .line 238
    goto :goto_2

    .line 239
    :cond_0
    const/16 v30, 0x0

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :goto_2
    invoke-interface {v3, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    long-to-int v1, v1

    .line 247
    move v2, v0

    .line 248
    move/from16 v31, v1

    .line 249
    .line 250
    invoke-interface {v3, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    long-to-int v0, v0

    .line 255
    if-eqz v0, :cond_1

    .line 256
    .line 257
    const/16 v32, 0x1

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_1
    const/16 v32, 0x0

    .line 261
    .line 262
    :goto_3
    invoke-interface {v3, v15}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_2

    .line 267
    .line 268
    const/16 v33, 0x0

    .line 269
    .line 270
    :goto_4
    move/from16 v0, p1

    .line 271
    .line 272
    move/from16 p1, v2

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_2
    invoke-interface {v3, v15}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object/from16 v33, v0

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :goto_5
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 283
    .line 284
    .line 285
    move-result-wide v1

    .line 286
    long-to-int v1, v1

    .line 287
    move/from16 v2, p2

    .line 288
    .line 289
    invoke-interface {v3, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 290
    .line 291
    .line 292
    move-result v35

    .line 293
    if-eqz v35, :cond_3

    .line 294
    .line 295
    const/16 v35, 0x0

    .line 296
    .line 297
    move/from16 p2, v0

    .line 298
    .line 299
    move/from16 v34, v1

    .line 300
    .line 301
    move/from16 v0, p3

    .line 302
    .line 303
    :goto_6
    move/from16 p3, v2

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_3
    invoke-interface {v3, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v34

    .line 310
    move-object/from16 v35, v34

    .line 311
    .line 312
    move/from16 p2, v0

    .line 313
    .line 314
    move/from16 v0, p3

    .line 315
    .line 316
    move/from16 v34, v1

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :goto_7
    invoke-interface {v3, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 320
    .line 321
    .line 322
    move-result-wide v1

    .line 323
    long-to-int v1, v1

    .line 324
    if-eqz v1, :cond_4

    .line 325
    .line 326
    const/16 v36, 0x1

    .line 327
    .line 328
    :goto_8
    move/from16 v1, p4

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_4
    const/16 v36, 0x0

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :goto_9
    invoke-interface {v3, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 335
    .line 336
    .line 337
    move-result-wide v37

    .line 338
    move/from16 p4, v1

    .line 339
    .line 340
    move/from16 v2, v16

    .line 341
    .line 342
    move/from16 v16, v0

    .line 343
    .line 344
    invoke-interface {v3, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v0

    .line 348
    long-to-int v0, v0

    .line 349
    if-eqz v0, :cond_5

    .line 350
    .line 351
    const/16 v39, 0x1

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_5
    const/16 v39, 0x0

    .line 355
    .line 356
    :goto_a
    new-instance v18, Lcom/friday/common/entity/FileEntity;

    .line 357
    .line 358
    invoke-direct/range {v18 .. v39}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    .line 359
    .line 360
    .line 361
    move-object/from16 v0, v18

    .line 362
    .line 363
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    .line 365
    .line 366
    move v0, v2

    .line 367
    move/from16 v2, p1

    .line 368
    .line 369
    move/from16 p1, p2

    .line 370
    .line 371
    move/from16 p2, p3

    .line 372
    .line 373
    move/from16 p3, v16

    .line 374
    .line 375
    move/from16 v16, v0

    .line 376
    .line 377
    move/from16 v0, v17

    .line 378
    .line 379
    move/from16 v1, v40

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :catchall_0
    move-exception v0

    .line 384
    goto :goto_b

    .line 385
    :cond_6
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 386
    .line 387
    .line 388
    return-object v4

    .line 389
    :goto_b
    invoke-interface {v3}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 390
    .line 391
    .line 392
    throw v0
.end method

.method public static synthetic x0(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/friday/common/dao/FileDao_Impl;->G1(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final x1(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/FileDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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

.method public static synthetic y0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao_Impl;->w1(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final y1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic z0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl;->Y0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final z1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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


# virtual methods
.method public A(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/u;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET state=30 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public B(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/o0;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=? AND fileType in (0,1) AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 1 ELSE 0 END ,updateTime DESC"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public C(Ljava/lang/String;J)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 7
    .line 8
    new-instance v1, Lc2/b;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p3}, Lc2/b;-><init>(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const-string p1, "SELECT * FROM File WHERE parentId=? AND fileType in (0,1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30  ORDER BY CASE WHEN fileType = 0 Then 0 ELSE 1 END, filename COLLATE localized ASC"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string p2, "File"

    .line 21
    .line 22
    filled-new-array {p2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance p3, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;

    .line 27
    .line 28
    invoke-direct {p3, v0, p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByNamePagingForStudent$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p3
.end method

.method public D(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/c0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET state=1, version=?, isSync=?, errorTimes = 0 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/c0;-><init>(Ljava/lang/String;IZLjava/lang/String;)V

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

.method public E(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$getAllParentIdById$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/FileDao_Impl$getAllParentIdById$2;-><init>(Lcom/friday/common/dao/FileDao_Impl;Ljava/lang/String;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public F(Ljava/lang/String;J)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 7
    .line 8
    new-instance v1, Lc2/f0;

    .line 9
    .line 10
    invoke-direct {v1, p2, p3, p1}, Lc2/f0;-><init>(JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "SELECT * FROM File WHERE fileType in (1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 AND filename LIKE \'%\' || ? || \'%\' ORDER BY filename ASC"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string p2, "File"

    .line 21
    .line 22
    filled-new-array {p2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance p3, Lcom/friday/common/dao/FileDao_Impl$getByFileNamePagingForStudent$1;

    .line 27
    .line 28
    invoke-direct {p3, v0, p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$getByFileNamePagingForStudent$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p3
.end method

.method public H(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$updateRestoreFileList$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/FileDao_Impl$updateRestoreFileList$2;-><init>(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method

.method public I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/h0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/h0;-><init>(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;)V

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

.method public J(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/x;

    .line 4
    .line 5
    const-string v2, "SELECT errorTimes from File WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public K(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/q;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE state!=0 AND accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/q;-><init>(Ljava/lang/String;J)V

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

.method public L(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/i;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET parentId=?, state=?, updateTime=? WHERE fileId=?"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v6, p2

    .line 9
    move v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v1 .. v6}, Lc2/i;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p1
.end method

.method public M(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/t;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET state=3 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$insertFileList$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/FileDao_Impl$insertFileList$2;-><init>(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method

.method public O()Landroidx/paging/PagingSource;
    .locals 4

    .line 1
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const-string v3, "SELECT * FROM FILE LIMIT 0"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;ILkotlin/jvm/internal/n;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 11
    .line 12
    const-string v2, "FILE"

    .line 13
    .line 14
    filled-new-array {v2}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Lcom/friday/common/dao/FileDao_Impl$emptyList$1;

    .line 19
    .line 20
    invoke-direct {v3, v0, p0, v1, v2}, Lcom/friday/common/dao/FileDao_Impl$emptyList$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3
.end method

.method public P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/n0;

    .line 4
    .line 5
    const-string v2, "DELETE FROM File WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/n0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public Q(Ljava/lang/String;J)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 7
    .line 8
    new-instance v1, Lc2/g0;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p3}, Lc2/g0;-><init>(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const-string p1, "SELECT * FROM File WHERE parentId=? AND accountId=? ORDER BY expiredTime DESC"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string p2, "File"

    .line 21
    .line 22
    filled-new-array {p2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance p3, Lcom/friday/common/dao/FileDao_Impl$getRecycleBinFiles$1;

    .line 27
    .line 28
    invoke-direct {p3, v0, p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$getRecycleBinFiles$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p3
.end method

.method public R(J)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/p;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/p;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLhd/l;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    return-object p1
.end method

.method public S(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/f;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE accountId=? AND (state=10 OR state=30) "

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/f;-><init>(Ljava/lang/String;J)V

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

.method public T(Ljava/lang/String;J)Ljava/util/List;
    .locals 3

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    new-instance v1, Lc2/y;

    .line 9
    .line 10
    const-string v2, "WITH RECURSIVE file_tree_cte(fileId, state, parentId) AS (SELECT fileId, state, parentId FROM File WHERE fileId =? AND fileType in (0,1,12,6) AND accountId=? UNION ALL SELECT fe.fileId, fe.state, fe.parentId FROM File fe JOIN file_tree_cte ftc ON fe.parentId = ftc.fileId) SELECT state FROM file_tree_cte"

    .line 11
    .line 12
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/y;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLhd/l;)Ljava/lang/Object;

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

.method public U(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)V
    .locals 10

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parentId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updateTime"

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    new-instance v1, Lc2/e;

    .line 21
    .line 22
    const-string v2, "UPDATE File SET parentId=? ,isRecycled = ?,expiredTime = ?,updateTime = ?,version = ? WHERE fileId=?"

    .line 23
    .line 24
    move-object v9, p1

    .line 25
    move-object v3, p2

    .line 26
    move v4, p3

    .line 27
    move-wide v5, p4

    .line 28
    move/from16 v8, p7

    .line 29
    .line 30
    invoke-direct/range {v1 .. v9}, Lc2/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLhd/l;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public V(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SELECT * FROM File WHERE fileId IN ("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, ")"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "toString(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 33
    .line 34
    new-instance v2, Lc2/s;

    .line 35
    .line 36
    invoke-direct {v2, v0, p1}, Lc2/s;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-static {v1, p1, v0, v2, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public W(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/w;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE fileType!=0 AND state=0 AND accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/w;-><init>(Ljava/lang/String;J)V

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

.method public X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/r;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=? AND accountId=? AND state!=3 AND state!=30"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/r;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/m0;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/m0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public Z(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/j;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=? AND fileType=0 AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/j;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/d0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET ossFileUrl=? WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p1}, Lc2/d0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/j0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET fileName=?, state=?, updateTime=? WHERE fileId=?"

    .line 6
    .line 7
    move-object v6, p1

    .line 8
    move-object v3, p2

    .line 9
    move v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v1 .. v6}, Lc2/j0;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/l0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET fileName=?, state=?, updateTime=?, cached=? WHERE fileId=?"

    .line 6
    .line 7
    move-object v7, p1

    .line 8
    move-object v3, p2

    .line 9
    move v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move v6, p5

    .line 12
    invoke-direct/range {v1 .. v7}, Lc2/l0;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1
.end method

.method public b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/k0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET cached = ? WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p1}, Lc2/k0;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

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

.method public c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/h;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET md5 = ? WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p1}, Lc2/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/v;

    .line 4
    .line 5
    const-string v2, "\nWITH RECURSIVE\n-- 1. \u5411\u4e0a\u627e\u7956\u5148\uff1a\u4ece\u5f53\u524d\u8282\u70b9\u5f00\u59cb\uff0c\u6cbf\u7740 parentId \u4e00\u5c42\u5c42\u5f80\u4e0a\u6478\uff0c\u76f4\u5230 parentId \u4e3a \'0\'\nAncestors AS (\n    SELECT *, 0 AS depth\n    FROM File\n    WHERE fileId = ? AND accountId = ?\n    \n    UNION ALL\n    \n    SELECT t.*, a.depth - 1\n    FROM File t\n    JOIN Ancestors a ON t.fileId = a.parentId\n    WHERE a.parentId != \'0\' \n      AND t.accountId = ?\n),\n\n-- 2. \u5411\u4e0b\u627e\u5b50\u5b59\uff1a\u4ece\u5f53\u524d\u8282\u70b9\u5f00\u59cb\uff0c\u627e\u6240\u6709\u4ee5\u6211\u4e3a parentId \u7684\u5b50\u96c6\nSubTree AS (\n    SELECT *, 0 AS depth\n    FROM File\n    WHERE fileId = ? AND accountId = ?\n    \n    UNION ALL\n    \n    SELECT t.*, st.depth + 1\n    FROM File t\n    JOIN SubTree st ON t.parentId = st.fileId\n    WHERE t.accountId = ?\n)\n\n-- 3. \u5408\u5e76\u7ed3\u679c\u5e76\u8fc7\u6ee4\uff1a\u53ea\u53d6\u7b26\u5408\u9519\u8bef\u72b6\u6001\u548c\u6307\u5b9a\u7c7b\u578b\u7684\u8bb0\u5f55\nSELECT * FROM (\n    SELECT * FROM Ancestors\n    UNION\n    SELECT * FROM SubTree\n)\nWHERE accountId = ?\n  AND (state = 10 OR state = 30)\nORDER BY depth ASC\n"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/v;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public f(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/a0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET state=10 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public l(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/b0;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET state=0, version=?, isSync=?, errorTimes = 0 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/b0;-><init>(Ljava/lang/String;IZLjava/lang/String;)V

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

.method public m(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/e0;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/e0;-><init>(Ljava/lang/String;J)V

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

.method public n(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/d;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE accountId=? AND fileType in (1,12,6,0) AND (state=10 OR state=30) "

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/d;-><init>(Ljava/lang/String;J)V

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

.method public o(J)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 2
    .line 3
    new-instance v1, Lc2/i0;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lc2/i0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    const-string p1, "SELECT * FROM File WHERE fileType in (1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 14
    .line 15
    const-string p2, "File"

    .line 16
    .line 17
    filled-new-array {p2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$getNewestListPagingForStudent$1;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$getNewestListPagingForStudent$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$updateTimeWithParents$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/common/dao/FileDao_Impl$updateTimeWithParents$2;-><init>(Lcom/friday/common/dao/FileDao_Impl;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p3}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method

.method public q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/o;

    .line 4
    .line 5
    const-string v2, "SELECT md5 FROM File WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/g;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public s(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/a;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE accountId=? AND cached = 1 AND state!=3 AND state!=30 AND fileType in (10,5,3,4)"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/a;-><init>(Ljava/lang/String;J)V

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

.method public t(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/c;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=? AND fileType=0 AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY updateTime DESC"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public u(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/z;

    .line 4
    .line 5
    const-string v2, "UPDATE File SET errorTimes=errorTimes+1 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public v(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/l;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=? AND fileType in (0,12) AND fileId!=? AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 1 ELSE 0 END ,updateTime DESC"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public w(Ljava/lang/String;J)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 7
    .line 8
    new-instance v1, Lc2/k;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p3}, Lc2/k;-><init>(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const-string p1, "SELECT * FROM File WHERE parentId=? AND fileType in (0,1,12,6) AND isRecycled==0 AND accountId=? AND state!=3 AND state!=30 ORDER BY CASE WHEN fileType = 0 Then 0 ELSE 1 END ,updateTime DESC"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string p2, "File"

    .line 21
    .line 22
    filled-new-array {p2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance p3, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByTimePagingForStudent$1;

    .line 27
    .line 28
    invoke-direct {p3, v0, p0, p1, p2}, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByTimePagingForStudent$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/friday/common/dao/FileDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p3
.end method

.method public x(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/n;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM File WHERE parentId=-1 AND accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/n;-><init>(Ljava/lang/String;J)V

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

.method public y(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "UPDATE File SET parentId="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "?"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ", state="

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, ", updateTime="

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, " WHERE fileId IN ("

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-static {v0, v9}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 42
    .line 43
    .line 44
    const-string v2, ") AND fileId != "

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v0, "toString(...)"

    .line 57
    .line 58
    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 62
    .line 63
    new-instance v3, Lc2/m;

    .line 64
    .line 65
    move-object v5, p1

    .line 66
    move-object v8, p2

    .line 67
    move v6, p3

    .line 68
    move-object v7, p4

    .line 69
    invoke-direct/range {v3 .. v9}, Lc2/m;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;I)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    const/4 p2, 0x1

    .line 74
    invoke-static {v0, p1, p2, v3, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-ne p1, p2, :cond_0

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 86
    .line 87
    return-object p1
.end method

.method public z(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/FileDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/FileDao_Impl$markCacheStateAsFalse$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/FileDao_Impl$markCacheStateAsFalse$2;-><init>(Lcom/friday/common/dao/FileDao_Impl;Ljava/util/List;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method
