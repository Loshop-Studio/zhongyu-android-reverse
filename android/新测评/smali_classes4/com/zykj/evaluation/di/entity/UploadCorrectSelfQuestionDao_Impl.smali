.class public final Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$a;

.field public static final f:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;

.field public final c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

.field public final d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->e:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->f:I

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
    iput-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 15
    .line 16
    new-instance v0, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 24
    .line 25
    new-instance p1, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl$1;-><init>(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic f(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->p(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->m(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->q(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->o(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/o;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->n(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/o;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/UploadDataConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final m(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
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

.method public static final n(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/o;
    .locals 22

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    const-string v2, "_connection"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    move-wide/from16 v3, p1

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    move-wide/from16 v3, p3

    .line 24
    .line 25
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    move/from16 v3, p5

    .line 30
    .line 31
    int-to-long v3, v3

    .line 32
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    move-wide/from16 v3, p6

    .line 37
    .line 38
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 39
    .line 40
    .line 41
    const-string v2, "user_id"

    .line 42
    .line 43
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v3, "task_id"

    .line 48
    .line 49
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const-string v4, "task_state"

    .line 54
    .line 55
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const-string v5, "question_id"

    .line 60
    .line 61
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    const-string v6, "answer_upload_data"

    .line 66
    .line 67
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const-string v7, "commit_self_correct_req"

    .line 72
    .line 73
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    const-string v8, "commit_state"

    .line 78
    .line 79
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    const/4 v10, 0x0

    .line 88
    if-eqz v9, :cond_4

    .line 89
    .line 90
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v12

    .line 94
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v14

    .line 98
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    long-to-int v2, v2

    .line 103
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 104
    .line 105
    .line 106
    move-result-wide v17

    .line 107
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_0

    .line 112
    .line 113
    move-object v3, v10

    .line 114
    goto :goto_0

    .line 115
    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    :goto_0
    iget-object v4, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v19

    .line 125
    if-eqz v19, :cond_3

    .line 126
    .line 127
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    :goto_1
    iget-object v0, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 139
    .line 140
    invoke-virtual {v0, v10}, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v20

    .line 144
    if-eqz v20, :cond_2

    .line 145
    .line 146
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    long-to-int v0, v3

    .line 151
    new-instance v11, Ln5/o;

    .line 152
    .line 153
    move/from16 v21, v0

    .line 154
    .line 155
    move/from16 v16, v2

    .line 156
    .line 157
    invoke-direct/range {v11 .. v21}, Ln5/o;-><init>(JJIJLjava/util/List;Ljava/util/List;I)V

    .line 158
    .line 159
    .line 160
    move-object v10, v11

    .line 161
    goto :goto_2

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>\', but it was NULL."

    .line 167
    .line 168
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 175
    .line 176
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    :cond_4
    :goto_2
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 181
    .line 182
    .line 183
    return-object v10

    .line 184
    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 185
    .line 186
    .line 187
    throw v0
.end method

.method public static final o(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    const-string v2, "_connection"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    move-wide/from16 v3, p1

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    move-wide/from16 v3, p3

    .line 24
    .line 25
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    move/from16 v3, p5

    .line 30
    .line 31
    int-to-long v3, v3

    .line 32
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const-string v2, "user_id"

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const-string v3, "task_id"

    .line 42
    .line 43
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const-string v4, "task_state"

    .line 48
    .line 49
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "question_id"

    .line 54
    .line 55
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const-string v6, "answer_upload_data"

    .line 60
    .line 61
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const-string v7, "commit_self_correct_req"

    .line 66
    .line 67
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    const-string v8, "commit_state"

    .line 72
    .line 73
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    new-instance v9, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v14

    .line 96
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v10

    .line 100
    long-to-int v10, v10

    .line 101
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 102
    .line 103
    .line 104
    move-result-wide v17

    .line 105
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    if-eqz v11, :cond_0

    .line 112
    .line 113
    move-object/from16 v11, v16

    .line 114
    .line 115
    :goto_1
    move/from16 p0, v2

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    goto :goto_1

    .line 123
    :goto_2
    iget-object v2, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 124
    .line 125
    invoke-virtual {v2, v11}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v19

    .line 129
    if-eqz v19, :cond_3

    .line 130
    .line 131
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_1

    .line 136
    .line 137
    :goto_3
    move-object/from16 v2, v16

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_1
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    goto :goto_3

    .line 145
    :goto_4
    iget-object v11, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 146
    .line 147
    invoke-virtual {v11, v2}, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v20

    .line 151
    if-eqz v20, :cond_2

    .line 152
    .line 153
    move/from16 p1, v3

    .line 154
    .line 155
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    long-to-int v2, v2

    .line 160
    new-instance v11, Ln5/o;

    .line 161
    .line 162
    move/from16 v21, v2

    .line 163
    .line 164
    move/from16 v16, v10

    .line 165
    .line 166
    invoke-direct/range {v11 .. v21}, Ln5/o;-><init>(JJIJLjava/util/List;Ljava/util/List;I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move/from16 v2, p0

    .line 173
    .line 174
    move/from16 v3, p1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    goto :goto_5

    .line 179
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>\', but it was NULL."

    .line 182
    .line 183
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 190
    .line 191
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 196
    .line 197
    .line 198
    return-object v9

    .line 199
    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 200
    .line 201
    .line 202
    throw v0
.end method

.method public static final p(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    const-string v2, "_connection"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    move-wide/from16 v3, p1

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    move-wide/from16 v3, p3

    .line 24
    .line 25
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    move/from16 v3, p5

    .line 30
    .line 31
    int-to-long v3, v3

    .line 32
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const-string v2, "user_id"

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const-string v3, "task_id"

    .line 42
    .line 43
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const-string v4, "task_state"

    .line 48
    .line 49
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "question_id"

    .line 54
    .line 55
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const-string v6, "answer_upload_data"

    .line 60
    .line 61
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const-string v7, "commit_self_correct_req"

    .line 66
    .line 67
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    const-string v8, "commit_state"

    .line 72
    .line 73
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    new-instance v9, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v14

    .line 96
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v10

    .line 100
    long-to-int v10, v10

    .line 101
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 102
    .line 103
    .line 104
    move-result-wide v17

    .line 105
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    if-eqz v11, :cond_0

    .line 112
    .line 113
    move-object/from16 v11, v16

    .line 114
    .line 115
    :goto_1
    move/from16 p0, v2

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    goto :goto_1

    .line 123
    :goto_2
    iget-object v2, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 124
    .line 125
    invoke-virtual {v2, v11}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v19

    .line 129
    if-eqz v19, :cond_3

    .line 130
    .line 131
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_1

    .line 136
    .line 137
    :goto_3
    move-object/from16 v2, v16

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_1
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    goto :goto_3

    .line 145
    :goto_4
    iget-object v11, v0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;

    .line 146
    .line 147
    invoke-virtual {v11, v2}, Lcom/zykj/evaluation/di/converter/CommitSelfCorrectConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v20

    .line 151
    if-eqz v20, :cond_2

    .line 152
    .line 153
    move/from16 p1, v3

    .line 154
    .line 155
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    long-to-int v2, v2

    .line 160
    new-instance v11, Ln5/o;

    .line 161
    .line 162
    move/from16 v21, v2

    .line 163
    .line 164
    move/from16 v16, v10

    .line 165
    .line 166
    invoke-direct/range {v11 .. v21}, Ln5/o;-><init>(JJIJLjava/util/List;Ljava/util/List;I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move/from16 v2, p0

    .line 173
    .line 174
    move/from16 v3, p1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    goto :goto_5

    .line 179
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitSelfCorrectReq>\', but it was NULL."

    .line 182
    .line 183
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 190
    .line 191
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 196
    .line 197
    .line 198
    return-object v9

    .line 199
    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 200
    .line 201
    .line 202
    throw v0
.end method

.method public static final q(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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


# virtual methods
.method public a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/s;

    .line 4
    .line 5
    const-string v2, "DELETE FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

    .line 6
    .line 7
    move-wide v3, p1

    .line 8
    move-wide v5, p3

    .line 9
    move v7, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Ln5/s;-><init>(Ljava/lang/String;JJI)V

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

.method public b(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/u;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

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
    invoke-direct/range {v1 .. v8}, Ln5/u;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)V

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

.method public c(Ln5/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/r;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ln5/r;-><init>(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;)V

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

.method public d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/t;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ? AND question_id = ?"

    .line 6
    .line 7
    move-object v10, p0

    .line 8
    move-wide v3, p1

    .line 9
    move-wide v5, p3

    .line 10
    move/from16 v7, p5

    .line 11
    .line 12
    move-wide/from16 v8, p6

    .line 13
    .line 14
    invoke-direct/range {v1 .. v10}, Ln5/t;-><init>(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    const/4 p2, 0x0

    .line 19
    move-object/from16 p3, p8

    .line 20
    .line 21
    invoke-static {v0, p1, p2, v1, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public e(JJI)Lkotlinx/coroutines/flow/Flow;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    const-string v1, "upload_correct_self_question"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ln5/q;

    .line 10
    .line 11
    const-string v3, "SELECT * FROM upload_correct_self_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

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
    invoke-direct/range {v2 .. v9}, Ln5/q;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;)V

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
