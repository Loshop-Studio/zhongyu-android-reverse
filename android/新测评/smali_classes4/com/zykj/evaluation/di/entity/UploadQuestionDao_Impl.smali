.class public final Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$a;

.field public static final f:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;

.field public final c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

.field public final d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->e:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->f:I

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
    iput-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 15
    .line 16
    new-instance v0, Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 24
    .line 25
    new-instance p1, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$1;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl$1;-><init>(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic f(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Ln5/v;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->q(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Ln5/v;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->o(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->p(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->m(Ljava/lang/String;JJILandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/v;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->n(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/v;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)Lcom/zykj/evaluation/di/converter/UploadDataConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

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

.method public static final n(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/v;
    .locals 29

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
    const/4 v3, 0x2

    .line 23
    move-wide/from16 v4, p3

    .line 24
    .line 25
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    move/from16 v4, p5

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    move-wide/from16 v4, p6

    .line 37
    .line 38
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 39
    .line 40
    .line 41
    const-string v3, "user_id"

    .line 42
    .line 43
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const-string v4, "task_id"

    .line 48
    .line 49
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "task_state"

    .line 54
    .line 55
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const-string v6, "question_id"

    .line 60
    .line 61
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const-string v7, "draft_upload_data"

    .line 66
    .line 67
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    const-string v8, "answer_upload_data"

    .line 72
    .line 73
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const-string v9, "is_todo"

    .line 78
    .line 79
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    const-string v10, "is_group"

    .line 84
    .line 85
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    const-string v11, "commit_request"

    .line 90
    .line 91
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    const-string v12, "commit_state"

    .line 96
    .line 97
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    const/4 v14, 0x0

    .line 106
    if-eqz v13, :cond_8

    .line 107
    .line 108
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v16

    .line 112
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v18

    .line 116
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    long-to-int v3, v3

    .line 121
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 122
    .line 123
    .line 124
    move-result-wide v21

    .line 125
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_0

    .line 130
    .line 131
    move-object v4, v14

    .line 132
    goto :goto_0

    .line 133
    :cond_0
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :goto_0
    iget-object v5, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 138
    .line 139
    invoke-virtual {v5, v4}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;

    .line 140
    .line 141
    .line 142
    move-result-object v23

    .line 143
    if-eqz v23, :cond_7

    .line 144
    .line 145
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_1

    .line 150
    .line 151
    move-object v4, v14

    .line 152
    goto :goto_1

    .line 153
    :cond_1
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :goto_1
    iget-object v5, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 158
    .line 159
    invoke-virtual {v5, v4}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v24

    .line 163
    if-eqz v24, :cond_6

    .line 164
    .line 165
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    long-to-int v4, v4

    .line 170
    const/4 v5, 0x0

    .line 171
    if-eqz v4, :cond_2

    .line 172
    .line 173
    move/from16 v25, v2

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    move/from16 v25, v5

    .line 177
    .line 178
    :goto_2
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 179
    .line 180
    .line 181
    move-result-wide v6

    .line 182
    long-to-int v4, v6

    .line 183
    if-eqz v4, :cond_3

    .line 184
    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_3
    move/from16 v26, v5

    .line 189
    .line 190
    :goto_3
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_4

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_4
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    :goto_4
    iget-object v0, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 202
    .line 203
    invoke-virtual {v0, v14}, Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;->a(Ljava/lang/String;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v27

    .line 207
    if-eqz v27, :cond_5

    .line 208
    .line 209
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v4

    .line 213
    long-to-int v0, v4

    .line 214
    new-instance v15, Ln5/v;

    .line 215
    .line 216
    move/from16 v28, v0

    .line 217
    .line 218
    move/from16 v20, v3

    .line 219
    .line 220
    invoke-direct/range {v15 .. v28}, Ln5/v;-><init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V

    .line 221
    .line 222
    .line 223
    move-object v14, v15

    .line 224
    goto :goto_5

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    goto :goto_6

    .line 227
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>\', but it was NULL."

    .line 230
    .line 231
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 236
    .line 237
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 238
    .line 239
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    const-string v2, "Expected NON-NULL \'com.zykj.evaluation.bean.UploadData\', but it was NULL."

    .line 246
    .line 247
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    :cond_8
    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 252
    .line 253
    .line 254
    return-object v14

    .line 255
    :goto_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 256
    .line 257
    .line 258
    throw v0
.end method

.method public static final o(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29

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
    const/4 v3, 0x2

    .line 23
    move-wide/from16 v4, p3

    .line 24
    .line 25
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    move/from16 v4, p5

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const-string v3, "user_id"

    .line 36
    .line 37
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "task_id"

    .line 42
    .line 43
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "task_state"

    .line 48
    .line 49
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v6, "question_id"

    .line 54
    .line 55
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const-string v7, "draft_upload_data"

    .line 60
    .line 61
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "answer_upload_data"

    .line 66
    .line 67
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v9, "is_todo"

    .line 72
    .line 73
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const-string v10, "is_group"

    .line 78
    .line 79
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const-string v11, "commit_request"

    .line 84
    .line 85
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    const-string v12, "commit_state"

    .line 90
    .line 91
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    new-instance v13, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    if-eqz v14, :cond_8

    .line 105
    .line 106
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v16

    .line 110
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v18

    .line 114
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    long-to-int v14, v14

    .line 119
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v21

    .line 123
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    if-eqz v15, :cond_0

    .line 130
    .line 131
    move-object/from16 v15, v20

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_0
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    :goto_1
    iget-object v2, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 139
    .line 140
    invoke-virtual {v2, v15}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;

    .line 141
    .line 142
    .line 143
    move-result-object v23

    .line 144
    if-eqz v23, :cond_7

    .line 145
    .line 146
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_1

    .line 151
    .line 152
    move-object/from16 v2, v20

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_1
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :goto_2
    iget-object v15, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 160
    .line 161
    invoke-virtual {v15, v2}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v24

    .line 165
    if-eqz v24, :cond_6

    .line 166
    .line 167
    move/from16 p1, v3

    .line 168
    .line 169
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v2

    .line 173
    long-to-int v2, v2

    .line 174
    if-eqz v2, :cond_2

    .line 175
    .line 176
    const/16 v25, 0x1

    .line 177
    .line 178
    :goto_3
    move/from16 p2, v4

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_2
    const/16 v25, 0x0

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :goto_4
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    long-to-int v2, v3

    .line 189
    if-eqz v2, :cond_3

    .line 190
    .line 191
    const/16 v26, 0x1

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_3
    const/16 v26, 0x0

    .line 195
    .line 196
    :goto_5
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_4

    .line 201
    .line 202
    :goto_6
    move-object/from16 v2, v20

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_4
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v20

    .line 209
    goto :goto_6

    .line 210
    :goto_7
    iget-object v3, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 211
    .line 212
    invoke-virtual {v3, v2}, Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;->a(Ljava/lang/String;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v27

    .line 216
    if-eqz v27, :cond_5

    .line 217
    .line 218
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 219
    .line 220
    .line 221
    move-result-wide v2

    .line 222
    long-to-int v2, v2

    .line 223
    new-instance v15, Ln5/v;

    .line 224
    .line 225
    move/from16 v28, v2

    .line 226
    .line 227
    move/from16 v20, v14

    .line 228
    .line 229
    invoke-direct/range {v15 .. v28}, Ln5/v;-><init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move/from16 v3, p1

    .line 236
    .line 237
    move/from16 v4, p2

    .line 238
    .line 239
    const/4 v2, 0x1

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :catchall_0
    move-exception v0

    .line 243
    goto :goto_8

    .line 244
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>\', but it was NULL."

    .line 247
    .line 248
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 253
    .line 254
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 255
    .line 256
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    const-string v2, "Expected NON-NULL \'com.zykj.evaluation.bean.UploadData\', but it was NULL."

    .line 263
    .line 264
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    :cond_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 269
    .line 270
    .line 271
    return-object v13

    .line 272
    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 273
    .line 274
    .line 275
    throw v0
.end method

.method public static final p(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29

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
    const/4 v3, 0x2

    .line 23
    move-wide/from16 v4, p3

    .line 24
    .line 25
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    move/from16 v4, p5

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 33
    .line 34
    .line 35
    const-string v3, "user_id"

    .line 36
    .line 37
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "task_id"

    .line 42
    .line 43
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "task_state"

    .line 48
    .line 49
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const-string v6, "question_id"

    .line 54
    .line 55
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const-string v7, "draft_upload_data"

    .line 60
    .line 61
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "answer_upload_data"

    .line 66
    .line 67
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v9, "is_todo"

    .line 72
    .line 73
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const-string v10, "is_group"

    .line 78
    .line 79
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const-string v11, "commit_request"

    .line 84
    .line 85
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    const-string v12, "commit_state"

    .line 90
    .line 91
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    new-instance v13, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    if-eqz v14, :cond_8

    .line 105
    .line 106
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v16

    .line 110
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v18

    .line 114
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    long-to-int v14, v14

    .line 119
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v21

    .line 123
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    if-eqz v15, :cond_0

    .line 130
    .line 131
    move-object/from16 v15, v20

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_0
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    :goto_1
    iget-object v2, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 139
    .line 140
    invoke-virtual {v2, v15}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;

    .line 141
    .line 142
    .line 143
    move-result-object v23

    .line 144
    if-eqz v23, :cond_7

    .line 145
    .line 146
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_1

    .line 151
    .line 152
    move-object/from16 v2, v20

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_1
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :goto_2
    iget-object v15, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->c:Lcom/zykj/evaluation/di/converter/UploadDataConverter;

    .line 160
    .line 161
    invoke-virtual {v15, v2}, Lcom/zykj/evaluation/di/converter/UploadDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v24

    .line 165
    if-eqz v24, :cond_6

    .line 166
    .line 167
    move/from16 p1, v3

    .line 168
    .line 169
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v2

    .line 173
    long-to-int v2, v2

    .line 174
    if-eqz v2, :cond_2

    .line 175
    .line 176
    const/16 v25, 0x1

    .line 177
    .line 178
    :goto_3
    move/from16 p2, v4

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_2
    const/16 v25, 0x0

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :goto_4
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    long-to-int v2, v3

    .line 189
    if-eqz v2, :cond_3

    .line 190
    .line 191
    const/16 v26, 0x1

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_3
    const/16 v26, 0x0

    .line 195
    .line 196
    :goto_5
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_4

    .line 201
    .line 202
    :goto_6
    move-object/from16 v2, v20

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_4
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v20

    .line 209
    goto :goto_6

    .line 210
    :goto_7
    iget-object v3, v0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->d:Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;

    .line 211
    .line 212
    invoke-virtual {v3, v2}, Lcom/zykj/evaluation/di/converter/CommitTaskAnswerConverter;->a(Ljava/lang/String;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v27

    .line 216
    if-eqz v27, :cond_5

    .line 217
    .line 218
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 219
    .line 220
    .line 221
    move-result-wide v2

    .line 222
    long-to-int v2, v2

    .line 223
    new-instance v15, Ln5/v;

    .line 224
    .line 225
    move/from16 v28, v2

    .line 226
    .line 227
    move/from16 v20, v14

    .line 228
    .line 229
    invoke-direct/range {v15 .. v28}, Ln5/v;-><init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move/from16 v3, p1

    .line 236
    .line 237
    move/from16 v4, p2

    .line 238
    .line 239
    const/4 v2, 0x1

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :catchall_0
    move-exception v0

    .line 243
    goto :goto_8

    .line 244
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.CommitTaskAnswer>\', but it was NULL."

    .line 247
    .line 248
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 253
    .line 254
    const-string v2, "Expected NON-NULL \'kotlin.collections.List<com.zykj.evaluation.bean.UploadData>\', but it was NULL."

    .line 255
    .line 256
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    const-string v2, "Expected NON-NULL \'com.zykj.evaluation.bean.UploadData\', but it was NULL."

    .line 263
    .line 264
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    :cond_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 269
    .line 270
    .line 271
    return-object v13

    .line 272
    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 273
    .line 274
    .line 275
    throw v0
.end method

.method public static final q(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Ln5/v;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/b0;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

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
    invoke-direct/range {v1 .. v8}, Ln5/b0;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V

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

.method public b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/z;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ln5/z;-><init>(Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Ln5/v;)V

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

.method public c(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/y;

    .line 4
    .line 5
    const-string v2, "DELETE FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

    .line 6
    .line 7
    move-wide v3, p1

    .line 8
    move-wide v5, p3

    .line 9
    move v7, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Ln5/y;-><init>(Ljava/lang/String;JJI)V

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

.method public d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Ln5/x;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ? AND question_id = ?"

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
    invoke-direct/range {v1 .. v10}, Ln5/x;-><init>(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V

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
    iget-object v0, p0, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    const-string v1, "upload_question"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ln5/a0;

    .line 10
    .line 11
    const-string v3, "SELECT * FROM upload_question WHERE user_id = ? AND task_id = ? AND task_state = ?"

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
    invoke-direct/range {v2 .. v9}, Ln5/a0;-><init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V

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
