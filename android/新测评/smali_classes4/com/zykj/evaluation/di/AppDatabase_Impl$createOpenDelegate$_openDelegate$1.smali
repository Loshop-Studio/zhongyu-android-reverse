.class public final Lcom/zykj/evaluation/di/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;
.super Landroidx/room/RoomOpenDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/di/AppDatabase_Impl;->t()Landroidx/room/RoomOpenDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/zykj/evaluation/di/AppDatabase_Impl$createOpenDelegate$_openDelegate$1",
        "Landroidx/room/RoomOpenDelegate;",
        "createAllTables",
        "",
        "connection",
        "Landroidx/sqlite/SQLiteConnection;",
        "dropAllTables",
        "onCreate",
        "onOpen",
        "onPreMigrate",
        "onPostMigrate",
        "onValidateSchema",
        "Landroidx/room/RoomOpenDelegate$ValidationResult;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/di/AppDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/di/AppDatabase_Impl;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/di/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->a:Lcom/zykj/evaluation/di/AppDatabase_Impl;

    .line 2
    .line 3
    const-string p1, "90a54ad0d2ffc64b76807da9080d5976"

    .line 4
    .line 5
    const-string v0, "4422c95965a9c044fa5825b5ba8ad05b"

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {p0, v1, p1, v0}, Landroidx/room/RoomOpenDelegate;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public createAllTables(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE IF NOT EXISTS `upload_answer` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `uuid` TEXT NOT NULL, `upload_data` TEXT NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `uuid`))"

    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "CREATE TABLE IF NOT EXISTS `upload_question` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `question_id` INTEGER NOT NULL, `draft_upload_data` TEXT NOT NULL, `answer_upload_data` TEXT NOT NULL, `is_todo` INTEGER NOT NULL, `is_group` INTEGER NOT NULL, `commit_request` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `question_id`))"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "CREATE TABLE IF NOT EXISTS `upload_correct_self_question` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `task_state` INTEGER NOT NULL, `question_id` INTEGER NOT NULL, `answer_upload_data` TEXT NOT NULL, `commit_self_correct_req` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`, `task_state`, `question_id`))"

    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "CREATE TABLE IF NOT EXISTS `submit_task` (`user_id` INTEGER NOT NULL, `task_id` INTEGER NOT NULL, `submit_type` INTEGER NOT NULL, `extra` TEXT NOT NULL, `commit_state` INTEGER NOT NULL, `commit_count` INTEGER NOT NULL, `show_fail_wrong` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `task_id`))"

    .line 22
    .line 23
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 27
    .line 28
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'90a54ad0d2ffc64b76807da9080d5976\')"

    .line 32
    .line 33
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public dropAllTables(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "DROP TABLE IF EXISTS `upload_answer`"

    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DROP TABLE IF EXISTS `upload_question`"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "DROP TABLE IF EXISTS `upload_correct_self_question`"

    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DROP TABLE IF EXISTS `submit_task`"

    .line 22
    .line 23
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onCreate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/di/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->a:Lcom/zykj/evaluation/di/AppDatabase_Impl;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/evaluation/di/AppDatabase_Impl;->s(Lcom/zykj/evaluation/di/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onPostMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPreMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/room/util/DBUtil;->dropFtsSyncTriggers(Landroidx/sqlite/SQLiteConnection;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onValidateSchema(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    const-string v3, "user_id"

    .line 18
    .line 19
    const-string v4, "INTEGER"

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x1

    .line 23
    invoke-direct/range {v2 .. v8}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const-string v3, "user_id"

    .line 27
    .line 28
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    new-instance v4, Landroidx/room/util/TableInfo$Column;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x1

    .line 35
    const-string v5, "task_id"

    .line 36
    .line 37
    const-string v6, "INTEGER"

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x2

    .line 41
    invoke-direct/range {v4 .. v10}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const-string v2, "task_id"

    .line 45
    .line 46
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    new-instance v5, Landroidx/room/util/TableInfo$Column;

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x1

    .line 53
    const-string v6, "task_state"

    .line 54
    .line 55
    const-string v7, "INTEGER"

    .line 56
    .line 57
    const/4 v8, 0x1

    .line 58
    const/4 v9, 0x3

    .line 59
    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    const-string v4, "task_state"

    .line 63
    .line 64
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    new-instance v6, Landroidx/room/util/TableInfo$Column;

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x1

    .line 71
    const-string v7, "uuid"

    .line 72
    .line 73
    const-string v8, "TEXT"

    .line 74
    .line 75
    const/4 v9, 0x1

    .line 76
    const/4 v10, 0x4

    .line 77
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    const-string v5, "uuid"

    .line 81
    .line 82
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x1

    .line 89
    const-string v8, "upload_data"

    .line 90
    .line 91
    const-string v9, "TEXT"

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    const-string v5, "upload_data"

    .line 99
    .line 100
    invoke-interface {v1, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 109
    .line 110
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    new-instance v7, Landroidx/room/util/TableInfo;

    .line 114
    .line 115
    const-string v8, "upload_answer"

    .line 116
    .line 117
    invoke-direct {v7, v8, v1, v5, v6}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 118
    .line 119
    .line 120
    sget-object v1, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    .line 121
    .line 122
    invoke-virtual {v1, v0, v8}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v7, v5}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    const-string v8, "\n Found:\n"

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    if-nez v6, :cond_0

    .line 134
    .line 135
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v2, "upload_answer(com.zykj.evaluation.di.entity.UploadAnswer).\n Expected:\n"

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v9, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_0
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v10, Landroidx/room/util/TableInfo$Column;

    .line 170
    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x1

    .line 173
    .line 174
    const-string v11, "user_id"

    .line 175
    .line 176
    const-string v12, "INTEGER"

    .line 177
    .line 178
    const/4 v13, 0x1

    .line 179
    const/4 v14, 0x1

    .line 180
    invoke-direct/range {v10 .. v16}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v5, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    new-instance v11, Landroidx/room/util/TableInfo$Column;

    .line 187
    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    const/16 v17, 0x1

    .line 191
    .line 192
    const-string v12, "task_id"

    .line 193
    .line 194
    const-string v13, "INTEGER"

    .line 195
    .line 196
    const/4 v15, 0x2

    .line 197
    invoke-direct/range {v11 .. v17}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v5, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const/16 v18, 0x1

    .line 208
    .line 209
    const-string v13, "task_state"

    .line 210
    .line 211
    const-string v14, "INTEGER"

    .line 212
    .line 213
    const/4 v15, 0x1

    .line 214
    const/16 v16, 0x3

    .line 215
    .line 216
    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v5, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    const/16 v19, 0x1

    .line 227
    .line 228
    const-string v14, "question_id"

    .line 229
    .line 230
    const-string v15, "INTEGER"

    .line 231
    .line 232
    const/16 v16, 0x1

    .line 233
    .line 234
    const/16 v17, 0x4

    .line 235
    .line 236
    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    const-string v6, "question_id"

    .line 240
    .line 241
    invoke-interface {v5, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v20, 0x1

    .line 249
    .line 250
    const-string v15, "draft_upload_data"

    .line 251
    .line 252
    const-string v16, "TEXT"

    .line 253
    .line 254
    const/16 v17, 0x1

    .line 255
    .line 256
    const/16 v18, 0x0

    .line 257
    .line 258
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 259
    .line 260
    .line 261
    const-string v7, "draft_upload_data"

    .line 262
    .line 263
    invoke-interface {v5, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    new-instance v15, Landroidx/room/util/TableInfo$Column;

    .line 267
    .line 268
    const/16 v20, 0x0

    .line 269
    .line 270
    const/16 v21, 0x1

    .line 271
    .line 272
    const-string v16, "answer_upload_data"

    .line 273
    .line 274
    const-string v17, "TEXT"

    .line 275
    .line 276
    const/16 v18, 0x1

    .line 277
    .line 278
    const/16 v19, 0x0

    .line 279
    .line 280
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 281
    .line 282
    .line 283
    const-string v7, "answer_upload_data"

    .line 284
    .line 285
    invoke-interface {v5, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    new-instance v16, Landroidx/room/util/TableInfo$Column;

    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const/16 v22, 0x1

    .line 293
    .line 294
    const-string v17, "is_todo"

    .line 295
    .line 296
    const-string v18, "INTEGER"

    .line 297
    .line 298
    const/16 v19, 0x1

    .line 299
    .line 300
    const/16 v20, 0x0

    .line 301
    .line 302
    invoke-direct/range {v16 .. v22}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v10, v16

    .line 306
    .line 307
    const-string v11, "is_todo"

    .line 308
    .line 309
    invoke-interface {v5, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 313
    .line 314
    const/16 v17, 0x0

    .line 315
    .line 316
    const/16 v18, 0x1

    .line 317
    .line 318
    const-string v13, "is_group"

    .line 319
    .line 320
    const-string v14, "INTEGER"

    .line 321
    .line 322
    const/4 v15, 0x1

    .line 323
    const/16 v16, 0x0

    .line 324
    .line 325
    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 326
    .line 327
    .line 328
    const-string v10, "is_group"

    .line 329
    .line 330
    invoke-interface {v5, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const-string v14, "commit_request"

    .line 338
    .line 339
    const-string v15, "TEXT"

    .line 340
    .line 341
    const/16 v16, 0x1

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 346
    .line 347
    .line 348
    const-string v10, "commit_request"

    .line 349
    .line 350
    invoke-interface {v5, v10, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 354
    .line 355
    const/16 v19, 0x0

    .line 356
    .line 357
    const/16 v20, 0x1

    .line 358
    .line 359
    const-string v15, "commit_state"

    .line 360
    .line 361
    const-string v16, "INTEGER"

    .line 362
    .line 363
    const/16 v17, 0x1

    .line 364
    .line 365
    const/16 v18, 0x0

    .line 366
    .line 367
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 368
    .line 369
    .line 370
    const-string v10, "commit_state"

    .line 371
    .line 372
    invoke-interface {v5, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 376
    .line 377
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 378
    .line 379
    .line 380
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 381
    .line 382
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 383
    .line 384
    .line 385
    new-instance v13, Landroidx/room/util/TableInfo;

    .line 386
    .line 387
    const-string v14, "upload_question"

    .line 388
    .line 389
    invoke-direct {v13, v14, v5, v11, v12}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v0, v14}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-virtual {v13, v5}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v11

    .line 400
    if-nez v11, :cond_1

    .line 401
    .line 402
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 403
    .line 404
    new-instance v1, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 407
    .line 408
    .line 409
    const-string v2, "upload_question(com.zykj.evaluation.di.entity.UploadQuestion).\n Expected:\n"

    .line 410
    .line 411
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-direct {v0, v9, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-object v0

    .line 431
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 432
    .line 433
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 434
    .line 435
    .line 436
    new-instance v11, Landroidx/room/util/TableInfo$Column;

    .line 437
    .line 438
    const/16 v16, 0x0

    .line 439
    .line 440
    const/16 v17, 0x1

    .line 441
    .line 442
    const-string v12, "user_id"

    .line 443
    .line 444
    const-string v13, "INTEGER"

    .line 445
    .line 446
    const/4 v14, 0x1

    .line 447
    const/4 v15, 0x1

    .line 448
    invoke-direct/range {v11 .. v17}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v5, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/16 v18, 0x1

    .line 459
    .line 460
    const-string v13, "task_id"

    .line 461
    .line 462
    const-string v14, "INTEGER"

    .line 463
    .line 464
    const/16 v16, 0x2

    .line 465
    .line 466
    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v5, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 473
    .line 474
    const/16 v18, 0x0

    .line 475
    .line 476
    const/16 v19, 0x1

    .line 477
    .line 478
    const-string v14, "task_state"

    .line 479
    .line 480
    const-string v15, "INTEGER"

    .line 481
    .line 482
    const/16 v16, 0x1

    .line 483
    .line 484
    const/16 v17, 0x3

    .line 485
    .line 486
    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v5, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 493
    .line 494
    const/16 v19, 0x0

    .line 495
    .line 496
    const/16 v20, 0x1

    .line 497
    .line 498
    const-string v15, "question_id"

    .line 499
    .line 500
    const-string v16, "INTEGER"

    .line 501
    .line 502
    const/16 v17, 0x1

    .line 503
    .line 504
    const/16 v18, 0x4

    .line 505
    .line 506
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 507
    .line 508
    .line 509
    invoke-interface {v5, v6, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    new-instance v15, Landroidx/room/util/TableInfo$Column;

    .line 513
    .line 514
    const/16 v20, 0x0

    .line 515
    .line 516
    const/16 v21, 0x1

    .line 517
    .line 518
    const-string v16, "answer_upload_data"

    .line 519
    .line 520
    const-string v17, "TEXT"

    .line 521
    .line 522
    const/16 v18, 0x1

    .line 523
    .line 524
    const/16 v19, 0x0

    .line 525
    .line 526
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v5, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    new-instance v16, Landroidx/room/util/TableInfo$Column;

    .line 533
    .line 534
    const/16 v21, 0x0

    .line 535
    .line 536
    const/16 v22, 0x1

    .line 537
    .line 538
    const-string v17, "commit_self_correct_req"

    .line 539
    .line 540
    const-string v18, "TEXT"

    .line 541
    .line 542
    const/16 v19, 0x1

    .line 543
    .line 544
    const/16 v20, 0x0

    .line 545
    .line 546
    invoke-direct/range {v16 .. v22}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 547
    .line 548
    .line 549
    move-object/from16 v4, v16

    .line 550
    .line 551
    const-string v6, "commit_self_correct_req"

    .line 552
    .line 553
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    new-instance v11, Landroidx/room/util/TableInfo$Column;

    .line 557
    .line 558
    const/16 v16, 0x0

    .line 559
    .line 560
    const/16 v17, 0x1

    .line 561
    .line 562
    const-string v12, "commit_state"

    .line 563
    .line 564
    const-string v13, "INTEGER"

    .line 565
    .line 566
    const/4 v14, 0x1

    .line 567
    const/4 v15, 0x0

    .line 568
    invoke-direct/range {v11 .. v17}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 569
    .line 570
    .line 571
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 575
    .line 576
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 577
    .line 578
    .line 579
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 580
    .line 581
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 582
    .line 583
    .line 584
    new-instance v7, Landroidx/room/util/TableInfo;

    .line 585
    .line 586
    const-string v11, "upload_correct_self_question"

    .line 587
    .line 588
    invoke-direct {v7, v11, v5, v4, v6}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v0, v11}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-virtual {v7, v4}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    if-nez v5, :cond_2

    .line 600
    .line 601
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 602
    .line 603
    new-instance v1, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 606
    .line 607
    .line 608
    const-string v2, "upload_correct_self_question(com.zykj.evaluation.di.entity.UploadCorrectSelfQuestion).\n Expected:\n"

    .line 609
    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-direct {v0, v9, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 627
    .line 628
    .line 629
    return-object v0

    .line 630
    :cond_2
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 631
    .line 632
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 633
    .line 634
    .line 635
    new-instance v11, Landroidx/room/util/TableInfo$Column;

    .line 636
    .line 637
    const/16 v16, 0x0

    .line 638
    .line 639
    const/16 v17, 0x1

    .line 640
    .line 641
    const-string v12, "user_id"

    .line 642
    .line 643
    const-string v13, "INTEGER"

    .line 644
    .line 645
    const/4 v14, 0x1

    .line 646
    const/4 v15, 0x1

    .line 647
    invoke-direct/range {v11 .. v17}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 648
    .line 649
    .line 650
    invoke-interface {v4, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/16 v18, 0x1

    .line 658
    .line 659
    const-string v13, "task_id"

    .line 660
    .line 661
    const-string v14, "INTEGER"

    .line 662
    .line 663
    const/16 v16, 0x2

    .line 664
    .line 665
    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 666
    .line 667
    .line 668
    invoke-interface {v4, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 672
    .line 673
    const/16 v18, 0x0

    .line 674
    .line 675
    const/16 v19, 0x1

    .line 676
    .line 677
    const-string v14, "submit_type"

    .line 678
    .line 679
    const-string v15, "INTEGER"

    .line 680
    .line 681
    const/16 v16, 0x1

    .line 682
    .line 683
    const/16 v17, 0x0

    .line 684
    .line 685
    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 686
    .line 687
    .line 688
    const-string v2, "submit_type"

    .line 689
    .line 690
    invoke-interface {v4, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 694
    .line 695
    const/16 v19, 0x0

    .line 696
    .line 697
    const/16 v20, 0x1

    .line 698
    .line 699
    const-string v15, "extra"

    .line 700
    .line 701
    const-string v16, "TEXT"

    .line 702
    .line 703
    const/16 v17, 0x1

    .line 704
    .line 705
    const/16 v18, 0x0

    .line 706
    .line 707
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 708
    .line 709
    .line 710
    const-string v2, "extra"

    .line 711
    .line 712
    invoke-interface {v4, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    new-instance v15, Landroidx/room/util/TableInfo$Column;

    .line 716
    .line 717
    const/16 v20, 0x0

    .line 718
    .line 719
    const/16 v21, 0x1

    .line 720
    .line 721
    const-string v16, "commit_state"

    .line 722
    .line 723
    const-string v17, "INTEGER"

    .line 724
    .line 725
    const/16 v18, 0x1

    .line 726
    .line 727
    const/16 v19, 0x0

    .line 728
    .line 729
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 730
    .line 731
    .line 732
    invoke-interface {v4, v10, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    new-instance v16, Landroidx/room/util/TableInfo$Column;

    .line 736
    .line 737
    const/16 v21, 0x0

    .line 738
    .line 739
    const/16 v22, 0x1

    .line 740
    .line 741
    const-string v17, "commit_count"

    .line 742
    .line 743
    const-string v18, "INTEGER"

    .line 744
    .line 745
    const/16 v19, 0x1

    .line 746
    .line 747
    const/16 v20, 0x0

    .line 748
    .line 749
    invoke-direct/range {v16 .. v22}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 750
    .line 751
    .line 752
    move-object/from16 v2, v16

    .line 753
    .line 754
    const-string v3, "commit_count"

    .line 755
    .line 756
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    new-instance v10, Landroidx/room/util/TableInfo$Column;

    .line 760
    .line 761
    const/4 v15, 0x0

    .line 762
    const/16 v16, 0x1

    .line 763
    .line 764
    const-string v11, "show_fail_wrong"

    .line 765
    .line 766
    const-string v12, "INTEGER"

    .line 767
    .line 768
    const/4 v13, 0x1

    .line 769
    const/4 v14, 0x0

    .line 770
    invoke-direct/range {v10 .. v16}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 771
    .line 772
    .line 773
    const-string v2, "show_fail_wrong"

    .line 774
    .line 775
    invoke-interface {v4, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 779
    .line 780
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 781
    .line 782
    .line 783
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 784
    .line 785
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 786
    .line 787
    .line 788
    new-instance v5, Landroidx/room/util/TableInfo;

    .line 789
    .line 790
    const-string v6, "submit_task"

    .line 791
    .line 792
    invoke-direct {v5, v6, v4, v2, v3}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v1, v0, v6}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-virtual {v5, v0}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    if-nez v1, :cond_3

    .line 804
    .line 805
    new-instance v1, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 806
    .line 807
    new-instance v2, Ljava/lang/StringBuilder;

    .line 808
    .line 809
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 810
    .line 811
    .line 812
    const-string v3, "submit_task(com.zykj.evaluation.di.entity.SubmitTask).\n Expected:\n"

    .line 813
    .line 814
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-direct {v1, v9, v0}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-object v1

    .line 834
    :cond_3
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 835
    .line 836
    const/4 v1, 0x1

    .line 837
    const/4 v2, 0x0

    .line 838
    invoke-direct {v0, v1, v2}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 839
    .line 840
    .line 841
    return-object v0
.end method
