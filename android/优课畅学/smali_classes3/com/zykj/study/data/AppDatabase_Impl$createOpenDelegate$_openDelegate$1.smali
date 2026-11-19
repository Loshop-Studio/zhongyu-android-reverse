.class public final Lcom/zykj/study/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;
.super Landroidx/room/RoomOpenDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/data/AppDatabase_Impl;->createOpenDelegate()Landroidx/room/RoomOpenDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/data/AppDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/study/data/AppDatabase_Impl;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/zykj/study/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lcom/zykj/study/data/AppDatabase_Impl;

    .line 2
    .line 3
    const-string p1, "8c81f4442798fc231c64703175b36246"

    .line 4
    .line 5
    const-string v0, "6eb7a3ba145149af08152bc6124ac897"

    .line 6
    .line 7
    const/4 v1, 0x3

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE IF NOT EXISTS `course_study` (`userName` TEXT, `progress` INTEGER NOT NULL, `studyUserId` TEXT, `learnTime` INTEGER, `id` INTEGER NOT NULL, `userId` TEXT, `cover` TEXT, `title` TEXT, `description` TEXT, `periodId` INTEGER NOT NULL, `gradeId` INTEGER NOT NULL, `subjectId` INTEGER NOT NULL, `learning` INTEGER NOT NULL, `likes` INTEGER NOT NULL, `isPublic` INTEGER NOT NULL, `status` TEXT NOT NULL, `createTime` INTEGER, PRIMARY KEY(`id`))"

    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "CREATE TABLE IF NOT EXISTS `course_study_key` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `pageIndex` INTEGER NOT NULL, `nextPage` INTEGER)"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "CREATE TABLE IF NOT EXISTS `my_course` (`isSuperviser` INTEGER NOT NULL, `sort` INTEGER NOT NULL, `id` INTEGER NOT NULL, `userId` TEXT, `cover` TEXT, `title` TEXT, `description` TEXT, `periodId` INTEGER NOT NULL, `gradeId` INTEGER NOT NULL, `subjectId` INTEGER NOT NULL, `learning` INTEGER NOT NULL, `likes` INTEGER NOT NULL, `isPublic` INTEGER NOT NULL, `status` TEXT NOT NULL, `createTime` INTEGER, PRIMARY KEY(`id`))"

    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "CREATE TABLE IF NOT EXISTS `my_course_key` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `startId` INTEGER NOT NULL, `take` INTEGER NOT NULL, `nextStartId` INTEGER)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE TABLE IF NOT EXISTS `period` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))"

    .line 27
    .line 28
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CREATE TABLE IF NOT EXISTS `grade` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `parentId` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 32
    .line 33
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "CREATE TABLE IF NOT EXISTS `subject` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))"

    .line 37
    .line 38
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "CREATE TABLE IF NOT EXISTS `catalog` (`id` INTEGER NOT NULL, `courseId` INTEGER NOT NULL, `title` TEXT NOT NULL, `isLeaf` INTEGER NOT NULL, `progress` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 42
    .line 43
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "CREATE TABLE IF NOT EXISTS `search_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `searchKey` TEXT NOT NULL, `createDate` INTEGER NOT NULL)"

    .line 47
    .line 48
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "CREATE TABLE IF NOT EXISTS `PdfEntity` (`id` TEXT NOT NULL, `currentPage` INTEGER NOT NULL, `pageCount` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 52
    .line 53
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 57
    .line 58
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'8c81f4442798fc231c64703175b36246\')"

    .line 62
    .line 63
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public dropAllTables(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "DROP TABLE IF EXISTS `course_study`"

    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DROP TABLE IF EXISTS `course_study_key`"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "DROP TABLE IF EXISTS `my_course`"

    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DROP TABLE IF EXISTS `my_course_key`"

    .line 22
    .line 23
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "DROP TABLE IF EXISTS `period`"

    .line 27
    .line 28
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "DROP TABLE IF EXISTS `grade`"

    .line 32
    .line 33
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "DROP TABLE IF EXISTS `subject`"

    .line 37
    .line 38
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "DROP TABLE IF EXISTS `catalog`"

    .line 42
    .line 43
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "DROP TABLE IF EXISTS `search_history`"

    .line 47
    .line 48
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "DROP TABLE IF EXISTS `PdfEntity`"

    .line 52
    .line 53
    invoke-static {p1, v0}, Landroidx/sqlite/SQLite;->execSQL(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public onCreate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/data/AppDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lcom/zykj/study/data/AppDatabase_Impl;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/study/data/AppDatabase_Impl;->access$internalInitInvalidationTracker(Lcom/zykj/study/data/AppDatabase_Impl;Landroidx/sqlite/SQLiteConnection;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onPostMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPreMigrate(Landroidx/sqlite/SQLiteConnection;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "connection"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string v3, "userName"

    .line 18
    .line 19
    const-string v4, "TEXT"

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-direct/range {v2 .. v8}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const-string v3, "userName"

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
    const-string v5, "progress"

    .line 36
    .line 37
    const-string v6, "INTEGER"

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-direct/range {v4 .. v10}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const-string v2, "progress"

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
    const-string v6, "studyUserId"

    .line 54
    .line 55
    const-string v7, "TEXT"

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    const-string v3, "studyUserId"

    .line 62
    .line 63
    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    new-instance v6, Landroidx/room/util/TableInfo$Column;

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x1

    .line 70
    const-string v7, "learnTime"

    .line 71
    .line 72
    const-string v8, "INTEGER"

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    const-string v3, "learnTime"

    .line 79
    .line 80
    invoke-interface {v1, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v13, 0x1

    .line 87
    const-string v8, "id"

    .line 88
    .line 89
    const-string v9, "INTEGER"

    .line 90
    .line 91
    const/4 v10, 0x1

    .line 92
    const/4 v11, 0x1

    .line 93
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    const-string v3, "id"

    .line 97
    .line 98
    invoke-interface {v1, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x1

    .line 105
    const-string v9, "userId"

    .line 106
    .line 107
    const-string v10, "TEXT"

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    const-string v4, "userId"

    .line 115
    .line 116
    invoke-interface {v1, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    new-instance v9, Landroidx/room/util/TableInfo$Column;

    .line 120
    .line 121
    const/4 v14, 0x0

    .line 122
    const/4 v15, 0x1

    .line 123
    const-string v10, "cover"

    .line 124
    .line 125
    const-string v11, "TEXT"

    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    invoke-direct/range {v9 .. v15}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    const-string v5, "cover"

    .line 132
    .line 133
    invoke-interface {v1, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    new-instance v10, Landroidx/room/util/TableInfo$Column;

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x1

    .line 140
    .line 141
    const-string v11, "title"

    .line 142
    .line 143
    const-string v12, "TEXT"

    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    invoke-direct/range {v10 .. v16}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    const-string v6, "title"

    .line 150
    .line 151
    invoke-interface {v1, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    new-instance v11, Landroidx/room/util/TableInfo$Column;

    .line 155
    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    const/16 v17, 0x1

    .line 159
    .line 160
    const-string v12, "description"

    .line 161
    .line 162
    const-string v13, "TEXT"

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    invoke-direct/range {v11 .. v17}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    const-string v7, "description"

    .line 169
    .line 170
    invoke-interface {v1, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    new-instance v12, Landroidx/room/util/TableInfo$Column;

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const/16 v18, 0x1

    .line 178
    .line 179
    const-string v13, "periodId"

    .line 180
    .line 181
    const-string v14, "INTEGER"

    .line 182
    .line 183
    const/4 v15, 0x1

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    invoke-direct/range {v12 .. v18}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 187
    .line 188
    .line 189
    const-string v8, "periodId"

    .line 190
    .line 191
    invoke-interface {v1, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    new-instance v13, Landroidx/room/util/TableInfo$Column;

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    const/16 v19, 0x1

    .line 199
    .line 200
    const-string v14, "gradeId"

    .line 201
    .line 202
    const-string v15, "INTEGER"

    .line 203
    .line 204
    const/16 v16, 0x1

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    invoke-direct/range {v13 .. v19}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 209
    .line 210
    .line 211
    const-string v9, "gradeId"

    .line 212
    .line 213
    invoke-interface {v1, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 217
    .line 218
    const/16 v19, 0x0

    .line 219
    .line 220
    const/16 v20, 0x1

    .line 221
    .line 222
    const-string v15, "subjectId"

    .line 223
    .line 224
    const-string v16, "INTEGER"

    .line 225
    .line 226
    const/16 v17, 0x1

    .line 227
    .line 228
    const/16 v18, 0x0

    .line 229
    .line 230
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    const-string v10, "subjectId"

    .line 234
    .line 235
    invoke-interface {v1, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    new-instance v15, Landroidx/room/util/TableInfo$Column;

    .line 239
    .line 240
    const/16 v20, 0x0

    .line 241
    .line 242
    const/16 v21, 0x1

    .line 243
    .line 244
    const-string v16, "learning"

    .line 245
    .line 246
    const-string v17, "INTEGER"

    .line 247
    .line 248
    const/16 v18, 0x1

    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    .line 252
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 253
    .line 254
    .line 255
    const-string v11, "learning"

    .line 256
    .line 257
    invoke-interface {v1, v11, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    new-instance v16, Landroidx/room/util/TableInfo$Column;

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x1

    .line 265
    .line 266
    const-string v17, "likes"

    .line 267
    .line 268
    const-string v18, "INTEGER"

    .line 269
    .line 270
    const/16 v19, 0x1

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    invoke-direct/range {v16 .. v22}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v12, v16

    .line 278
    .line 279
    const-string v13, "likes"

    .line 280
    .line 281
    invoke-interface {v1, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    new-instance v14, Landroidx/room/util/TableInfo$Column;

    .line 285
    .line 286
    const/16 v19, 0x0

    .line 287
    .line 288
    const/16 v20, 0x1

    .line 289
    .line 290
    const-string v15, "isPublic"

    .line 291
    .line 292
    const-string v16, "INTEGER"

    .line 293
    .line 294
    const/16 v17, 0x1

    .line 295
    .line 296
    const/16 v18, 0x0

    .line 297
    .line 298
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 299
    .line 300
    .line 301
    const-string v12, "isPublic"

    .line 302
    .line 303
    invoke-interface {v1, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    new-instance v15, Landroidx/room/util/TableInfo$Column;

    .line 307
    .line 308
    const/16 v20, 0x0

    .line 309
    .line 310
    const/16 v21, 0x1

    .line 311
    .line 312
    const-string v16, "status"

    .line 313
    .line 314
    const-string v17, "TEXT"

    .line 315
    .line 316
    const/16 v18, 0x1

    .line 317
    .line 318
    const/16 v19, 0x0

    .line 319
    .line 320
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 321
    .line 322
    .line 323
    const-string v14, "status"

    .line 324
    .line 325
    invoke-interface {v1, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    new-instance v16, Landroidx/room/util/TableInfo$Column;

    .line 329
    .line 330
    const/16 v21, 0x0

    .line 331
    .line 332
    const-string v17, "createTime"

    .line 333
    .line 334
    const-string v18, "INTEGER"

    .line 335
    .line 336
    const/16 v20, 0x0

    .line 337
    .line 338
    invoke-direct/range {v16 .. v22}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v15, v16

    .line 342
    .line 343
    move-object/from16 v16, v2

    .line 344
    .line 345
    const-string v2, "createTime"

    .line 346
    .line 347
    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 351
    .line 352
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 353
    .line 354
    .line 355
    move-object/from16 v17, v2

    .line 356
    .line 357
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 358
    .line 359
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 360
    .line 361
    .line 362
    move-object/from16 v18, v14

    .line 363
    .line 364
    new-instance v14, Landroidx/room/util/TableInfo;

    .line 365
    .line 366
    move-object/from16 v19, v12

    .line 367
    .line 368
    const-string v12, "course_study"

    .line 369
    .line 370
    invoke-direct {v14, v12, v1, v15, v2}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 371
    .line 372
    .line 373
    sget-object v1, Landroidx/room/util/TableInfo;->Companion:Landroidx/room/util/TableInfo$Companion;

    .line 374
    .line 375
    invoke-virtual {v1, v0, v12}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v14, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    const-string v15, "\n Found:\n"

    .line 384
    .line 385
    move/from16 v20, v12

    .line 386
    .line 387
    const/4 v12, 0x0

    .line 388
    if-nez v20, :cond_0

    .line 389
    .line 390
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 391
    .line 392
    new-instance v1, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    const-string v3, "course_study(com.zykj.study.data.CourseStudyEntity).\n Expected:\n"

    .line 398
    .line 399
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-direct {v0, v12, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 420
    .line 421
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 422
    .line 423
    .line 424
    new-instance v20, Landroidx/room/util/TableInfo$Column;

    .line 425
    .line 426
    const/16 v25, 0x0

    .line 427
    .line 428
    const/16 v26, 0x1

    .line 429
    .line 430
    const-string v21, "id"

    .line 431
    .line 432
    const-string v22, "INTEGER"

    .line 433
    .line 434
    const/16 v23, 0x1

    .line 435
    .line 436
    const/16 v24, 0x1

    .line 437
    .line 438
    invoke-direct/range {v20 .. v26}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 439
    .line 440
    .line 441
    move-object/from16 v14, v20

    .line 442
    .line 443
    invoke-interface {v2, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    new-instance v20, Landroidx/room/util/TableInfo$Column;

    .line 447
    .line 448
    const-string v21, "userId"

    .line 449
    .line 450
    const-string v22, "TEXT"

    .line 451
    .line 452
    const/16 v24, 0x0

    .line 453
    .line 454
    invoke-direct/range {v20 .. v26}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 455
    .line 456
    .line 457
    move-object/from16 v14, v20

    .line 458
    .line 459
    invoke-interface {v2, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    new-instance v20, Landroidx/room/util/TableInfo$Column;

    .line 463
    .line 464
    const-string v21, "pageIndex"

    .line 465
    .line 466
    const-string v22, "INTEGER"

    .line 467
    .line 468
    invoke-direct/range {v20 .. v26}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 469
    .line 470
    .line 471
    move-object/from16 v14, v20

    .line 472
    .line 473
    const-string v12, "pageIndex"

    .line 474
    .line 475
    invoke-interface {v2, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 479
    .line 480
    const/16 v26, 0x0

    .line 481
    .line 482
    const/16 v27, 0x1

    .line 483
    .line 484
    const-string v22, "nextPage"

    .line 485
    .line 486
    const-string v23, "INTEGER"

    .line 487
    .line 488
    const/16 v25, 0x0

    .line 489
    .line 490
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 491
    .line 492
    .line 493
    move-object/from16 v12, v21

    .line 494
    .line 495
    const-string v14, "nextPage"

    .line 496
    .line 497
    invoke-interface {v2, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 501
    .line 502
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 503
    .line 504
    .line 505
    new-instance v14, Ljava/util/LinkedHashSet;

    .line 506
    .line 507
    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    .line 508
    .line 509
    .line 510
    move-object/from16 v21, v13

    .line 511
    .line 512
    new-instance v13, Landroidx/room/util/TableInfo;

    .line 513
    .line 514
    move-object/from16 v22, v11

    .line 515
    .line 516
    const-string v11, "course_study_key"

    .line 517
    .line 518
    invoke-direct {v13, v11, v2, v12, v14}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v0, v11}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-virtual {v13, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v11

    .line 529
    if-nez v11, :cond_1

    .line 530
    .line 531
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 532
    .line 533
    new-instance v1, Ljava/lang/StringBuilder;

    .line 534
    .line 535
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const-string v3, "course_study_key(com.zykj.study.data.CourseStudyKeyEntity).\n Expected:\n"

    .line 539
    .line 540
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    const/4 v2, 0x0

    .line 557
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 558
    .line 559
    .line 560
    return-object v0

    .line 561
    :cond_1
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 562
    .line 563
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 564
    .line 565
    .line 566
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 567
    .line 568
    const/16 v28, 0x0

    .line 569
    .line 570
    const/16 v29, 0x1

    .line 571
    .line 572
    const/16 v26, 0x1

    .line 573
    .line 574
    const/16 v27, 0x0

    .line 575
    .line 576
    const-string v24, "isSuperviser"

    .line 577
    .line 578
    const-string v25, "INTEGER"

    .line 579
    .line 580
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 581
    .line 582
    .line 583
    move-object/from16 v11, v23

    .line 584
    .line 585
    const-string v12, "isSuperviser"

    .line 586
    .line 587
    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 591
    .line 592
    const-string v24, "sort"

    .line 593
    .line 594
    const-string v25, "INTEGER"

    .line 595
    .line 596
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v11, v23

    .line 600
    .line 601
    const-string v12, "sort"

    .line 602
    .line 603
    invoke-interface {v2, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 607
    .line 608
    const/16 v27, 0x1

    .line 609
    .line 610
    const-string v24, "id"

    .line 611
    .line 612
    const-string v25, "INTEGER"

    .line 613
    .line 614
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v11, v23

    .line 618
    .line 619
    invoke-interface {v2, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 623
    .line 624
    const/16 v26, 0x0

    .line 625
    .line 626
    const/16 v27, 0x0

    .line 627
    .line 628
    const-string v24, "userId"

    .line 629
    .line 630
    const-string v25, "TEXT"

    .line 631
    .line 632
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 633
    .line 634
    .line 635
    move-object/from16 v11, v23

    .line 636
    .line 637
    invoke-interface {v2, v4, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 641
    .line 642
    const-string v24, "cover"

    .line 643
    .line 644
    const-string v25, "TEXT"

    .line 645
    .line 646
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v11, v23

    .line 650
    .line 651
    invoke-interface {v2, v5, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 655
    .line 656
    const-string v24, "title"

    .line 657
    .line 658
    const-string v25, "TEXT"

    .line 659
    .line 660
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v5, v23

    .line 664
    .line 665
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 669
    .line 670
    const-string v24, "description"

    .line 671
    .line 672
    const-string v25, "TEXT"

    .line 673
    .line 674
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 675
    .line 676
    .line 677
    move-object/from16 v5, v23

    .line 678
    .line 679
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 683
    .line 684
    const/16 v26, 0x1

    .line 685
    .line 686
    const-string v24, "periodId"

    .line 687
    .line 688
    const-string v25, "INTEGER"

    .line 689
    .line 690
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 691
    .line 692
    .line 693
    move-object/from16 v5, v23

    .line 694
    .line 695
    invoke-interface {v2, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 699
    .line 700
    const-string v24, "gradeId"

    .line 701
    .line 702
    const-string v25, "INTEGER"

    .line 703
    .line 704
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 705
    .line 706
    .line 707
    move-object/from16 v5, v23

    .line 708
    .line 709
    invoke-interface {v2, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 713
    .line 714
    const-string v24, "subjectId"

    .line 715
    .line 716
    const-string v25, "INTEGER"

    .line 717
    .line 718
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 719
    .line 720
    .line 721
    move-object/from16 v5, v23

    .line 722
    .line 723
    invoke-interface {v2, v10, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    new-instance v23, Landroidx/room/util/TableInfo$Column;

    .line 727
    .line 728
    const-string v24, "learning"

    .line 729
    .line 730
    const-string v25, "INTEGER"

    .line 731
    .line 732
    invoke-direct/range {v23 .. v29}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 733
    .line 734
    .line 735
    move-object/from16 v7, v22

    .line 736
    .line 737
    move-object/from16 v5, v23

    .line 738
    .line 739
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 743
    .line 744
    const/4 v13, 0x0

    .line 745
    const/4 v14, 0x1

    .line 746
    const/4 v11, 0x1

    .line 747
    const/4 v12, 0x0

    .line 748
    const-string v9, "likes"

    .line 749
    .line 750
    const-string v10, "INTEGER"

    .line 751
    .line 752
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 753
    .line 754
    .line 755
    move-object/from16 v5, v21

    .line 756
    .line 757
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 761
    .line 762
    const/16 v26, 0x0

    .line 763
    .line 764
    const/16 v27, 0x1

    .line 765
    .line 766
    const/16 v24, 0x1

    .line 767
    .line 768
    const/16 v25, 0x0

    .line 769
    .line 770
    const-string v22, "isPublic"

    .line 771
    .line 772
    const-string v23, "INTEGER"

    .line 773
    .line 774
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v7, v19

    .line 778
    .line 779
    move-object/from16 v5, v21

    .line 780
    .line 781
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 785
    .line 786
    const-string v9, "status"

    .line 787
    .line 788
    const-string v10, "TEXT"

    .line 789
    .line 790
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 791
    .line 792
    .line 793
    move-object/from16 v5, v18

    .line 794
    .line 795
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 799
    .line 800
    const/16 v24, 0x0

    .line 801
    .line 802
    const-string v22, "createTime"

    .line 803
    .line 804
    const-string v23, "INTEGER"

    .line 805
    .line 806
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v7, v17

    .line 810
    .line 811
    move-object/from16 v5, v21

    .line 812
    .line 813
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 817
    .line 818
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 819
    .line 820
    .line 821
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 822
    .line 823
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 824
    .line 825
    .line 826
    new-instance v8, Landroidx/room/util/TableInfo;

    .line 827
    .line 828
    const-string v9, "my_course"

    .line 829
    .line 830
    invoke-direct {v8, v9, v2, v5, v7}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v0, v9}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    invoke-virtual {v8, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v5

    .line 841
    if-nez v5, :cond_2

    .line 842
    .line 843
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 844
    .line 845
    new-instance v1, Ljava/lang/StringBuilder;

    .line 846
    .line 847
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 848
    .line 849
    .line 850
    const-string v3, "my_course(com.zykj.study.data.MyCourseEntity).\n Expected:\n"

    .line 851
    .line 852
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    const/4 v2, 0x0

    .line 869
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 870
    .line 871
    .line 872
    return-object v0

    .line 873
    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 874
    .line 875
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 876
    .line 877
    .line 878
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 879
    .line 880
    const/4 v12, 0x0

    .line 881
    const/4 v13, 0x1

    .line 882
    const-string v8, "id"

    .line 883
    .line 884
    const-string v9, "INTEGER"

    .line 885
    .line 886
    const/4 v10, 0x1

    .line 887
    const/4 v11, 0x1

    .line 888
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 889
    .line 890
    .line 891
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 895
    .line 896
    const/4 v13, 0x0

    .line 897
    const/4 v14, 0x1

    .line 898
    const-string v9, "userId"

    .line 899
    .line 900
    const-string v10, "TEXT"

    .line 901
    .line 902
    const/4 v12, 0x0

    .line 903
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 904
    .line 905
    .line 906
    invoke-interface {v2, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 910
    .line 911
    const/16 v26, 0x0

    .line 912
    .line 913
    const/16 v27, 0x1

    .line 914
    .line 915
    const-string v22, "startId"

    .line 916
    .line 917
    const-string v23, "INTEGER"

    .line 918
    .line 919
    const/16 v24, 0x1

    .line 920
    .line 921
    const/16 v25, 0x0

    .line 922
    .line 923
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 924
    .line 925
    .line 926
    move-object/from16 v5, v21

    .line 927
    .line 928
    const-string v7, "startId"

    .line 929
    .line 930
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 934
    .line 935
    const-string v9, "take"

    .line 936
    .line 937
    const-string v10, "INTEGER"

    .line 938
    .line 939
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 940
    .line 941
    .line 942
    const-string v5, "take"

    .line 943
    .line 944
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 948
    .line 949
    const-string v22, "nextStartId"

    .line 950
    .line 951
    const-string v23, "INTEGER"

    .line 952
    .line 953
    const/16 v24, 0x0

    .line 954
    .line 955
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 956
    .line 957
    .line 958
    move-object/from16 v5, v21

    .line 959
    .line 960
    const-string v7, "nextStartId"

    .line 961
    .line 962
    invoke-interface {v2, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 966
    .line 967
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 968
    .line 969
    .line 970
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 971
    .line 972
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 973
    .line 974
    .line 975
    new-instance v8, Landroidx/room/util/TableInfo;

    .line 976
    .line 977
    const-string v9, "my_course_key"

    .line 978
    .line 979
    invoke-direct {v8, v9, v2, v5, v7}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v1, v0, v9}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    invoke-virtual {v8, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v5

    .line 990
    if-nez v5, :cond_3

    .line 991
    .line 992
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 993
    .line 994
    new-instance v1, Ljava/lang/StringBuilder;

    .line 995
    .line 996
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 997
    .line 998
    .line 999
    const-string v3, "my_course_key(com.zykj.study.data.MyCourseKeyEntity).\n Expected:\n"

    .line 1000
    .line 1001
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    const/4 v2, 0x0

    .line 1018
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    return-object v0

    .line 1022
    :cond_3
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1023
    .line 1024
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1028
    .line 1029
    const/4 v12, 0x0

    .line 1030
    const/4 v13, 0x1

    .line 1031
    const-string v8, "id"

    .line 1032
    .line 1033
    const-string v9, "INTEGER"

    .line 1034
    .line 1035
    const/4 v10, 0x1

    .line 1036
    const/4 v11, 0x1

    .line 1037
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1044
    .line 1045
    const/4 v13, 0x0

    .line 1046
    const/4 v14, 0x1

    .line 1047
    const-string v9, "name"

    .line 1048
    .line 1049
    const-string v10, "TEXT"

    .line 1050
    .line 1051
    const/4 v12, 0x0

    .line 1052
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1053
    .line 1054
    .line 1055
    const-string v5, "name"

    .line 1056
    .line 1057
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 1061
    .line 1062
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1063
    .line 1064
    .line 1065
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 1066
    .line 1067
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    new-instance v9, Landroidx/room/util/TableInfo;

    .line 1071
    .line 1072
    const-string v10, "period"

    .line 1073
    .line 1074
    invoke-direct {v9, v10, v2, v7, v8}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v0, v10}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    invoke-virtual {v9, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v7

    .line 1085
    if-nez v7, :cond_4

    .line 1086
    .line 1087
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1088
    .line 1089
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1092
    .line 1093
    .line 1094
    const-string v3, "period(com.zykj.study.data.PeriodEntity).\n Expected:\n"

    .line 1095
    .line 1096
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    const/4 v2, 0x0

    .line 1113
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    return-object v0

    .line 1117
    :cond_4
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1118
    .line 1119
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1120
    .line 1121
    .line 1122
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1123
    .line 1124
    const/4 v12, 0x0

    .line 1125
    const/4 v13, 0x1

    .line 1126
    const-string v8, "id"

    .line 1127
    .line 1128
    const-string v9, "INTEGER"

    .line 1129
    .line 1130
    const/4 v10, 0x1

    .line 1131
    const/4 v11, 0x1

    .line 1132
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1133
    .line 1134
    .line 1135
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1139
    .line 1140
    const/4 v13, 0x0

    .line 1141
    const/4 v14, 0x1

    .line 1142
    const-string v9, "name"

    .line 1143
    .line 1144
    const-string v10, "TEXT"

    .line 1145
    .line 1146
    const/4 v12, 0x0

    .line 1147
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 1154
    .line 1155
    const/16 v26, 0x0

    .line 1156
    .line 1157
    const/16 v27, 0x1

    .line 1158
    .line 1159
    const-string v22, "parentId"

    .line 1160
    .line 1161
    const-string v23, "INTEGER"

    .line 1162
    .line 1163
    const/16 v24, 0x1

    .line 1164
    .line 1165
    const/16 v25, 0x0

    .line 1166
    .line 1167
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1168
    .line 1169
    .line 1170
    move-object/from16 v7, v21

    .line 1171
    .line 1172
    const-string v8, "parentId"

    .line 1173
    .line 1174
    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 1178
    .line 1179
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 1183
    .line 1184
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1185
    .line 1186
    .line 1187
    new-instance v9, Landroidx/room/util/TableInfo;

    .line 1188
    .line 1189
    const-string v10, "grade"

    .line 1190
    .line 1191
    invoke-direct {v9, v10, v2, v7, v8}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1192
    .line 1193
    .line 1194
    const-string v2, "grade"

    .line 1195
    .line 1196
    invoke-virtual {v1, v0, v2}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    invoke-virtual {v9, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v7

    .line 1204
    if-nez v7, :cond_5

    .line 1205
    .line 1206
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1207
    .line 1208
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1211
    .line 1212
    .line 1213
    const-string v3, "grade(com.zykj.study.data.GradeEntity).\n Expected:\n"

    .line 1214
    .line 1215
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    const/4 v2, 0x0

    .line 1232
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    return-object v0

    .line 1236
    :cond_5
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1237
    .line 1238
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1239
    .line 1240
    .line 1241
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1242
    .line 1243
    const/4 v12, 0x0

    .line 1244
    const/4 v13, 0x1

    .line 1245
    const-string v8, "id"

    .line 1246
    .line 1247
    const-string v9, "INTEGER"

    .line 1248
    .line 1249
    const/4 v10, 0x1

    .line 1250
    const/4 v11, 0x1

    .line 1251
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1252
    .line 1253
    .line 1254
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1258
    .line 1259
    const/4 v13, 0x0

    .line 1260
    const/4 v14, 0x1

    .line 1261
    const-string v9, "name"

    .line 1262
    .line 1263
    const-string v10, "TEXT"

    .line 1264
    .line 1265
    const/4 v12, 0x0

    .line 1266
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1267
    .line 1268
    .line 1269
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1273
    .line 1274
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1275
    .line 1276
    .line 1277
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 1278
    .line 1279
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1280
    .line 1281
    .line 1282
    new-instance v8, Landroidx/room/util/TableInfo;

    .line 1283
    .line 1284
    const-string v9, "subject"

    .line 1285
    .line 1286
    invoke-direct {v8, v9, v2, v5, v7}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1287
    .line 1288
    .line 1289
    const-string v2, "subject"

    .line 1290
    .line 1291
    invoke-virtual {v1, v0, v2}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    invoke-virtual {v8, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v5

    .line 1299
    if-nez v5, :cond_6

    .line 1300
    .line 1301
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1302
    .line 1303
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1306
    .line 1307
    .line 1308
    const-string v3, "subject(com.zykj.study.data.SubjectEntity).\n Expected:\n"

    .line 1309
    .line 1310
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    const/4 v2, 0x0

    .line 1327
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    return-object v0

    .line 1331
    :cond_6
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1332
    .line 1333
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1334
    .line 1335
    .line 1336
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1337
    .line 1338
    const/4 v12, 0x0

    .line 1339
    const/4 v13, 0x1

    .line 1340
    const-string v8, "id"

    .line 1341
    .line 1342
    const-string v9, "INTEGER"

    .line 1343
    .line 1344
    const/4 v10, 0x1

    .line 1345
    const/4 v11, 0x1

    .line 1346
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1347
    .line 1348
    .line 1349
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1353
    .line 1354
    const/4 v13, 0x0

    .line 1355
    const/4 v14, 0x1

    .line 1356
    const-string v9, "courseId"

    .line 1357
    .line 1358
    const-string v10, "INTEGER"

    .line 1359
    .line 1360
    const/4 v12, 0x0

    .line 1361
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1362
    .line 1363
    .line 1364
    const-string v5, "courseId"

    .line 1365
    .line 1366
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 1370
    .line 1371
    const/16 v26, 0x0

    .line 1372
    .line 1373
    const/16 v27, 0x1

    .line 1374
    .line 1375
    const-string v22, "title"

    .line 1376
    .line 1377
    const-string v23, "TEXT"

    .line 1378
    .line 1379
    const/16 v24, 0x1

    .line 1380
    .line 1381
    const/16 v25, 0x0

    .line 1382
    .line 1383
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1384
    .line 1385
    .line 1386
    move-object/from16 v5, v21

    .line 1387
    .line 1388
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1392
    .line 1393
    const/4 v12, 0x0

    .line 1394
    const/4 v13, 0x1

    .line 1395
    const-string v8, "isLeaf"

    .line 1396
    .line 1397
    const-string v9, "INTEGER"

    .line 1398
    .line 1399
    const/4 v10, 0x1

    .line 1400
    const/4 v11, 0x0

    .line 1401
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1402
    .line 1403
    .line 1404
    const-string v5, "isLeaf"

    .line 1405
    .line 1406
    invoke-interface {v2, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1410
    .line 1411
    const/4 v13, 0x0

    .line 1412
    const-string v9, "progress"

    .line 1413
    .line 1414
    const-string v10, "INTEGER"

    .line 1415
    .line 1416
    const/4 v11, 0x1

    .line 1417
    const/4 v12, 0x0

    .line 1418
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1419
    .line 1420
    .line 1421
    move-object/from16 v5, v16

    .line 1422
    .line 1423
    invoke-interface {v2, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    new-instance v21, Landroidx/room/util/TableInfo$Column;

    .line 1427
    .line 1428
    const-string v22, "parentId"

    .line 1429
    .line 1430
    const-string v23, "INTEGER"

    .line 1431
    .line 1432
    invoke-direct/range {v21 .. v27}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1433
    .line 1434
    .line 1435
    move-object/from16 v5, v21

    .line 1436
    .line 1437
    const-string v6, "parentId"

    .line 1438
    .line 1439
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1443
    .line 1444
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1445
    .line 1446
    .line 1447
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 1448
    .line 1449
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1450
    .line 1451
    .line 1452
    new-instance v7, Landroidx/room/util/TableInfo;

    .line 1453
    .line 1454
    const-string v8, "catalog"

    .line 1455
    .line 1456
    invoke-direct {v7, v8, v2, v5, v6}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1457
    .line 1458
    .line 1459
    const-string v2, "catalog"

    .line 1460
    .line 1461
    invoke-virtual {v1, v0, v2}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-virtual {v7, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v5

    .line 1469
    if-nez v5, :cond_7

    .line 1470
    .line 1471
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1472
    .line 1473
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1474
    .line 1475
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1476
    .line 1477
    .line 1478
    const-string v3, "catalog(com.zykj.study.data.CatalogEntity).\n Expected:\n"

    .line 1479
    .line 1480
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    const/4 v2, 0x0

    .line 1497
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1498
    .line 1499
    .line 1500
    return-object v0

    .line 1501
    :cond_7
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1502
    .line 1503
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1504
    .line 1505
    .line 1506
    new-instance v5, Landroidx/room/util/TableInfo$Column;

    .line 1507
    .line 1508
    const/4 v10, 0x0

    .line 1509
    const/4 v11, 0x1

    .line 1510
    const-string v6, "id"

    .line 1511
    .line 1512
    const-string v7, "INTEGER"

    .line 1513
    .line 1514
    const/4 v8, 0x1

    .line 1515
    const/4 v9, 0x1

    .line 1516
    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1517
    .line 1518
    .line 1519
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    new-instance v6, Landroidx/room/util/TableInfo$Column;

    .line 1523
    .line 1524
    const/4 v11, 0x0

    .line 1525
    const/4 v12, 0x1

    .line 1526
    const-string v7, "userId"

    .line 1527
    .line 1528
    const-string v8, "TEXT"

    .line 1529
    .line 1530
    const/4 v10, 0x0

    .line 1531
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1532
    .line 1533
    .line 1534
    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    new-instance v7, Landroidx/room/util/TableInfo$Column;

    .line 1538
    .line 1539
    const/4 v12, 0x0

    .line 1540
    const/4 v13, 0x1

    .line 1541
    const-string v8, "searchKey"

    .line 1542
    .line 1543
    const-string v9, "TEXT"

    .line 1544
    .line 1545
    const/4 v10, 0x1

    .line 1546
    const/4 v11, 0x0

    .line 1547
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1548
    .line 1549
    .line 1550
    const-string v4, "searchKey"

    .line 1551
    .line 1552
    invoke-interface {v2, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    new-instance v8, Landroidx/room/util/TableInfo$Column;

    .line 1556
    .line 1557
    const/4 v13, 0x0

    .line 1558
    const/4 v14, 0x1

    .line 1559
    const-string v9, "createDate"

    .line 1560
    .line 1561
    const-string v10, "INTEGER"

    .line 1562
    .line 1563
    const/4 v11, 0x1

    .line 1564
    const/4 v12, 0x0

    .line 1565
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1566
    .line 1567
    .line 1568
    const-string v4, "createDate"

    .line 1569
    .line 1570
    invoke-interface {v2, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1574
    .line 1575
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1576
    .line 1577
    .line 1578
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1579
    .line 1580
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1581
    .line 1582
    .line 1583
    new-instance v6, Landroidx/room/util/TableInfo;

    .line 1584
    .line 1585
    const-string v7, "search_history"

    .line 1586
    .line 1587
    invoke-direct {v6, v7, v2, v4, v5}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1588
    .line 1589
    .line 1590
    const-string v2, "search_history"

    .line 1591
    .line 1592
    invoke-virtual {v1, v0, v2}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v2

    .line 1596
    invoke-virtual {v6, v2}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v4

    .line 1600
    if-nez v4, :cond_8

    .line 1601
    .line 1602
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1603
    .line 1604
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1605
    .line 1606
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1607
    .line 1608
    .line 1609
    const-string v3, "search_history(com.zykj.study.data.SearchHistoryEntity).\n Expected:\n"

    .line 1610
    .line 1611
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1618
    .line 1619
    .line 1620
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v1

    .line 1627
    const/4 v2, 0x0

    .line 1628
    invoke-direct {v0, v2, v1}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1629
    .line 1630
    .line 1631
    return-object v0

    .line 1632
    :cond_8
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1633
    .line 1634
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1635
    .line 1636
    .line 1637
    new-instance v4, Landroidx/room/util/TableInfo$Column;

    .line 1638
    .line 1639
    const/4 v9, 0x0

    .line 1640
    const/4 v10, 0x1

    .line 1641
    const-string v5, "id"

    .line 1642
    .line 1643
    const-string v6, "TEXT"

    .line 1644
    .line 1645
    const/4 v7, 0x1

    .line 1646
    const/4 v8, 0x1

    .line 1647
    invoke-direct/range {v4 .. v10}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1648
    .line 1649
    .line 1650
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    new-instance v5, Landroidx/room/util/TableInfo$Column;

    .line 1654
    .line 1655
    const/4 v10, 0x0

    .line 1656
    const/4 v11, 0x1

    .line 1657
    const-string v6, "currentPage"

    .line 1658
    .line 1659
    const-string v7, "INTEGER"

    .line 1660
    .line 1661
    const/4 v9, 0x0

    .line 1662
    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1663
    .line 1664
    .line 1665
    const-string v3, "currentPage"

    .line 1666
    .line 1667
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    new-instance v6, Landroidx/room/util/TableInfo$Column;

    .line 1671
    .line 1672
    const/4 v11, 0x0

    .line 1673
    const/4 v12, 0x1

    .line 1674
    const-string v7, "pageCount"

    .line 1675
    .line 1676
    const-string v8, "INTEGER"

    .line 1677
    .line 1678
    const/4 v9, 0x1

    .line 1679
    const/4 v10, 0x0

    .line 1680
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 1681
    .line 1682
    .line 1683
    const-string v3, "pageCount"

    .line 1684
    .line 1685
    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 1689
    .line 1690
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1691
    .line 1692
    .line 1693
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1694
    .line 1695
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1696
    .line 1697
    .line 1698
    new-instance v5, Landroidx/room/util/TableInfo;

    .line 1699
    .line 1700
    const-string v6, "PdfEntity"

    .line 1701
    .line 1702
    invoke-direct {v5, v6, v2, v3, v4}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1703
    .line 1704
    .line 1705
    const-string v2, "PdfEntity"

    .line 1706
    .line 1707
    invoke-virtual {v1, v0, v2}, Landroidx/room/util/TableInfo$Companion;->read(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    invoke-virtual {v5, v0}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v1

    .line 1715
    if-nez v1, :cond_9

    .line 1716
    .line 1717
    new-instance v1, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1718
    .line 1719
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1720
    .line 1721
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1722
    .line 1723
    .line 1724
    const-string v3, "PdfEntity(com.zykj.study.data.PdfEntity).\n Expected:\n"

    .line 1725
    .line 1726
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    const/4 v2, 0x0

    .line 1743
    invoke-direct {v1, v2, v0}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1744
    .line 1745
    .line 1746
    return-object v1

    .line 1747
    :cond_9
    new-instance v0, Landroidx/room/RoomOpenDelegate$ValidationResult;

    .line 1748
    .line 1749
    const/4 v1, 0x1

    .line 1750
    const/4 v2, 0x0

    .line 1751
    invoke-direct {v0, v1, v2}, Landroidx/room/RoomOpenDelegate$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 1752
    .line 1753
    .line 1754
    return-object v0
.end method
