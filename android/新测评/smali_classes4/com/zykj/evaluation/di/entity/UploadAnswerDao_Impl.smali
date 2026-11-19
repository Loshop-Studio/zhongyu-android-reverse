.class public final Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$a;

.field public static final f:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;

.field public final c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

.field public final d:Landroidx/room/EntityDeleteOrUpdateAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->e:Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->f:I

    return-void
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 17
    .line 18
    new-instance p1, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$1;-><init>(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 24
    .line 25
    new-instance p1, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl$2;-><init>(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->d:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic f(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->n(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ln5/h;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->o(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ln5/h;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->m(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->l(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->p(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)Lcom/zykj/evaluation/di/converter/UploadDataConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final l(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p0, p1, p3, p4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    int-to-long p2, p5

    .line 20
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public static final m(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const/4 v0, 0x2

    .line 21
    move-wide/from16 v2, p3

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    move/from16 v2, p5

    .line 28
    .line 29
    int-to-long v2, v2

    .line 30
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 31
    .line 32
    .line 33
    const-string v0, "user_id"

    .line 34
    .line 35
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v2, "task_id"

    .line 40
    .line 41
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const-string v3, "task_state"

    .line 46
    .line 47
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const-string v4, "uuid"

    .line 52
    .line 53
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const-string v5, "upload_data"

    .line 58
    .line 59
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    new-instance v6, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    long-to-int v13, v7

    .line 87
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_0

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    :goto_1
    move-object/from16 v8, p6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_0
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    iget-object v15, v8, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 107
    .line 108
    invoke-virtual {v15, v7}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;

    .line 109
    .line 110
    .line 111
    move-result-object v15

    .line 112
    if-eqz v15, :cond_1

    .line 113
    .line 114
    new-instance v8, Ln5/h;

    .line 115
    .line 116
    invoke-direct/range {v8 .. v15}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v2, "Expected NON-NULL \'com.zykj.evaluation.bean.UploadData\', but it was NULL."

    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_2
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 134
    .line 135
    .line 136
    return-object v6

    .line 137
    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 138
    .line 139
    .line 140
    throw v0
.end method

.method public static final n(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const/4 v0, 0x2

    .line 21
    move-wide/from16 v2, p3

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    move/from16 v2, p5

    .line 28
    .line 29
    int-to-long v2, v2

    .line 30
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 31
    .line 32
    .line 33
    const-string v0, "user_id"

    .line 34
    .line 35
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v2, "task_id"

    .line 40
    .line 41
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const-string v3, "task_state"

    .line 46
    .line 47
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const-string v4, "uuid"

    .line 52
    .line 53
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const-string v5, "upload_data"

    .line 58
    .line 59
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    new-instance v6, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    long-to-int v13, v7

    .line 87
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_0

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    :goto_1
    move-object/from16 v8, p6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_0
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    iget-object v15, v8, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 107
    .line 108
    invoke-virtual {v15, v7}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;

    .line 109
    .line 110
    .line 111
    move-result-object v15

    .line 112
    if-eqz v15, :cond_1

    .line 113
    .line 114
    new-instance v8, Ln5/h;

    .line 115
    .line 116
    invoke-direct/range {v8 .. v15}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v2, "Expected NON-NULL \'com.zykj.evaluation.bean.UploadData\', but it was NULL."

    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_2
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 134
    .line 135
    .line 136
    return-object v6

    .line 137
    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 138
    .line 139
    .line 140
    throw v0
.end method

.method public static final o(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ln5/h;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final p(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/n;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?"

    .line 6
    .line 7
    move-object v8, p0

    .line 8
    move-wide v3, p1

    .line 9
    move-wide v5, p3

    .line 10
    move v7, p5

    .line 11
    invoke-direct/range {v1 .. v8}, Ln5/n;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public b(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/j;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ln5/j;-><init>(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

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
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p1
.end method

.method public c(Ln5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/k;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ln5/k;-><init>(Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;Ln5/h;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

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
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p1
.end method

.method public d(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/l;

    .line 4
    .line 5
    const-string v2, "DELETE FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?"

    .line 6
    .line 7
    move-wide v3, p1

    .line 8
    move-wide v5, p3

    .line 9
    move v7, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Ln5/l;-><init>(Ljava/lang/String;JJI)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

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
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p1
.end method

.method public e(JJI)Lkotlinx/coroutines/flow/Flow;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    const-string v1, "upload_answer"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ln5/m;

    .line 10
    .line 11
    const-string v3, "SELECT * FROM upload_answer WHERE user_id = ? AND task_id = ? AND task_state = ?"

    .line 12
    .line 13
    move-object v9, p0

    .line 14
    move-wide v4, p1

    .line 15
    move-wide v6, p3

    .line 16
    move v8, p5

    .line 17
    invoke-direct/range {v2 .. v9}, Ln5/m;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadAnswerDao_Impl;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-static {v0, p1, v1, v2}, Landroidx/room/coroutines/FlowUtil;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
