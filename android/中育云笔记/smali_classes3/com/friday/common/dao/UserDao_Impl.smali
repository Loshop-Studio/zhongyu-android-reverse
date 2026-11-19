.class public final Lcom/friday/common/dao/UserDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/dao/UserDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/dao/UserDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/friday/common/dao/UserDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/dao/UserDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/dao/UserDao_Impl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/dao/UserDao_Impl;->c:Lcom/friday/common/dao/UserDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/dao/UserDao_Impl;->d:I

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
    iput-object p1, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/friday/common/dao/UserDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/friday/common/dao/UserDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/dao/UserDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static final A(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/User;
    .locals 21

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
    const-string v2, "accountId"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "accountName"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "headPhotoUrl"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "userName"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "unit"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "cameraPermission"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "albumPermission"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "screenshotsPermission"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_3

    .line 73
    .line 74
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v17

    .line 94
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    long-to-int v2, v2

    .line 99
    const/4 v3, 0x0

    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    move/from16 v18, v0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    move/from16 v18, v3

    .line 106
    .line 107
    :goto_0
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    long-to-int v2, v4

    .line 112
    if-eqz v2, :cond_1

    .line 113
    .line 114
    move/from16 v19, v0

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    move/from16 v19, v3

    .line 118
    .line 119
    :goto_1
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    long-to-int v2, v4

    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    move/from16 v20, v0

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move/from16 v20, v3

    .line 130
    .line 131
    :goto_2
    new-instance v11, Lcom/friday/common/entity/User;

    .line 132
    .line 133
    invoke-direct/range {v11 .. v20}, Lcom/friday/common/entity/User;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    goto :goto_4

    .line 139
    :cond_3
    const/4 v11, 0x0

    .line 140
    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 141
    .line 142
    .line 143
    return-object v11

    .line 144
    :goto_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 145
    .line 146
    .line 147
    throw v0
.end method

.method public static final B(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
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
    const/4 p3, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p3, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    long-to-int p1, v0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p3, p2

    .line 30
    :goto_0
    move p2, p3

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 35
    .line 36
    .line 37
    return p2

    .line 38
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public static final C(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
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
    const/4 p3, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p3, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    long-to-int p1, v0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p3, p2

    .line 30
    :goto_0
    move p2, p3

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 35
    .line 36
    .line 37
    return p2

    .line 38
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public static final D(Lcom/friday/common/dao/UserDao_Impl;Lcom/friday/common/entity/User;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/UserDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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

.method public static final E(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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

.method public static final F(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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

.method public static final G(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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

.method public static synthetic q(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/UserDao_Impl;->B(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z

    move-result p0

    return p0
.end method

.method public static synthetic r(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/UserDao_Impl;->F(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/User;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/UserDao_Impl;->A(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/User;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/common/dao/UserDao_Impl;Lcom/friday/common/entity/User;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/UserDao_Impl;->D(Lcom/friday/common/dao/UserDao_Impl;Lcom/friday/common/entity/User;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/UserDao_Impl;->z(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/UserDao_Impl;->C(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z

    move-result p0

    return p0
.end method

.method public static synthetic w(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/UserDao_Impl;->E(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/UserDao_Impl;->G(Ljava/lang/String;ZJLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(Lcom/friday/common/dao/UserDao_Impl;JLjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/UserDao;->b(JLjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final z(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Z
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
    const/4 p3, 0x1

    .line 11
    :try_start_0
    invoke-interface {p0, p3, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    long-to-int p1, v0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p3, p2

    .line 30
    :goto_0
    move p2, p3

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 35
    .line 36
    .line 37
    return p2

    .line 38
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method


# virtual methods
.method public b(JLjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/UserDao_Impl$insertUserOrUpdate$2;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-wide v3, p1

    .line 8
    move-object v5, p3

    .line 9
    invoke-direct/range {v1 .. v6}, Lcom/friday/common/dao/UserDao_Impl$insertUserOrUpdate$2;-><init>(Lcom/friday/common/dao/UserDao_Impl;JLjava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p4}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

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

.method public c(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/q2;

    .line 4
    .line 5
    const-string v2, "SELECT albumPermission FROM User WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/q2;-><init>(Ljava/lang/String;J)V

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

.method public d(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/n2;

    .line 4
    .line 5
    const-string v2, "SELECT screenshotsPermission FROM User WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/n2;-><init>(Ljava/lang/String;J)V

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

.method public f(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/o2;

    .line 4
    .line 5
    const-string v2, "SELECT cameraPermission FROM User WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/o2;-><init>(Ljava/lang/String;J)V

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

.method public g(ZJLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/r2;

    .line 4
    .line 5
    const-string v2, "UPDATE User SET screenshotsPermission =? WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/r2;-><init>(Ljava/lang/String;ZJ)V

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

.method public h(Lcom/friday/common/entity/User;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/u2;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/u2;-><init>(Lcom/friday/common/dao/UserDao_Impl;Lcom/friday/common/entity/User;)V

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

.method public l(ZJLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/t2;

    .line 4
    .line 5
    const-string v2, "UPDATE User SET albumPermission =? WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/t2;-><init>(Ljava/lang/String;ZJ)V

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

.method public o(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/s2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM User WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/s2;-><init>(Ljava/lang/String;J)V

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

.method public p(ZJLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/UserDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/p2;

    .line 4
    .line 5
    const-string v2, "UPDATE User SET cameraPermission =? WHERE accountId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/p2;-><init>(Ljava/lang/String;ZJ)V

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
