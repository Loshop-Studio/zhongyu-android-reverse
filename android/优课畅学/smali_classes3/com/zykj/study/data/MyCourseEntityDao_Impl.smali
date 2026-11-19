.class public final Lcom/zykj/study/data/MyCourseEntityDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/study/data/MyCourseEntityDao;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;


# instance fields
.field private final __converters:Lcom/zykj/study/data/Converters;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfMyCourseEntity:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/zykj/study/data/MyCourseEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->Companion:Lcom/zykj/study/data/MyCourseEntityDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->$stable:I

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
    iput-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 17
    .line 18
    new-instance p1, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;-><init>(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__insertAdapterOfMyCourseEntity:Landroidx/room/EntityInsertAdapter;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/MyCourseEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->findCourse$lambda$2(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/MyCourseEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get__converters$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Lcom/zykj/study/data/Converters;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get__db$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/data/MyCourseEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->insert$lambda$1(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/data/MyCourseEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->insert$lambda$0(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->getMyCourseList$lambda$3(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final deleteAll$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

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
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method private static final deleteByCourse$lambda$6(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 2

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
    int-to-long v0, p1

    .line 12
    :try_start_0
    invoke-interface {p0, p2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method private static final deleteByUserId$lambda$5(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
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

.method public static synthetic e(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->deleteByCourse$lambda$6(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;ILandroidx/sqlite/SQLiteConnection;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->updateStatus$lambda$7(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;ILandroidx/sqlite/SQLiteConnection;)I

    move-result p0

    return p0
.end method

.method private static final findCourse$lambda$2(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/MyCourseEntity;
    .locals 34

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    const-string v2, "_connection"

    .line 4
    .line 5
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move/from16 v2, p1

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    const/4 v4, 0x1

    .line 18
    :try_start_0
    invoke-interface {v1, v4, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 19
    .line 20
    .line 21
    const-string v2, "isSuperviser"

    .line 22
    .line 23
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "sort"

    .line 28
    .line 29
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const-string v5, "id"

    .line 34
    .line 35
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "userId"

    .line 40
    .line 41
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const-string v7, "cover"

    .line 46
    .line 47
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "title"

    .line 52
    .line 53
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "description"

    .line 58
    .line 59
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "periodId"

    .line 64
    .line 65
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "gradeId"

    .line 70
    .line 71
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "subjectId"

    .line 76
    .line 77
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "learning"

    .line 82
    .line 83
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "likes"

    .line 88
    .line 89
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "isPublic"

    .line 94
    .line 95
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v4, "status"

    .line 100
    .line 101
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const-string v0, "createTime"

    .line 106
    .line 107
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 112
    .line 113
    .line 114
    move-result v16

    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    if-eqz v16, :cond_7

    .line 118
    .line 119
    move/from16 p1, v14

    .line 120
    .line 121
    move/from16 p3, v15

    .line 122
    .line 123
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v14

    .line 127
    long-to-int v2, v14

    .line 128
    if-eqz v2, :cond_0

    .line 129
    .line 130
    const/16 v30, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    const/16 v30, 0x0

    .line 134
    .line 135
    :goto_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    long-to-int v2, v2

    .line 140
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 141
    .line 142
    .line 143
    move-result-wide v14

    .line 144
    long-to-int v5, v14

    .line 145
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_1

    .line 150
    .line 151
    move-object/from16 v20, v17

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_1
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    move-object/from16 v20, v6

    .line 159
    .line 160
    :goto_1
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_2

    .line 165
    .line 166
    move-object/from16 v21, v17

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    move-object/from16 v21, v6

    .line 174
    .line 175
    :goto_2
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_3

    .line 180
    .line 181
    move-object/from16 v22, v17

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    move-object/from16 v22, v6

    .line 189
    .line 190
    :goto_3
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_4

    .line 195
    .line 196
    move-object/from16 v23, v17

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_4
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    move-object/from16 v23, v6

    .line 204
    .line 205
    :goto_4
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    long-to-int v6, v6

    .line 210
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v7

    .line 214
    long-to-int v7, v7

    .line 215
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 216
    .line 217
    .line 218
    move-result-wide v8

    .line 219
    long-to-int v8, v8

    .line 220
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 221
    .line 222
    .line 223
    move-result-wide v9

    .line 224
    long-to-int v9, v9

    .line 225
    move/from16 v10, p1

    .line 226
    .line 227
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v10

    .line 231
    long-to-int v10, v10

    .line 232
    move/from16 v11, p3

    .line 233
    .line 234
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 235
    .line 236
    .line 237
    move-result-wide v11

    .line 238
    long-to-int v11, v11

    .line 239
    if-eqz v11, :cond_5

    .line 240
    .line 241
    const/16 v29, 0x1

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_5
    const/16 v29, 0x0

    .line 245
    .line 246
    :goto_5
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    move-object/from16 v4, p2

    .line 251
    .line 252
    iget-object v11, v4, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 253
    .line 254
    invoke-virtual {v11, v3}, Lcom/zykj/study/data/Converters;->stringToSessionOrderType(Ljava/lang/String;)Lcom/zykj/study/bean/course/CourseType;

    .line 255
    .line 256
    .line 257
    move-result-object v31

    .line 258
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_6

    .line 263
    .line 264
    :goto_6
    move-object/from16 v0, v17

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_6
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v11

    .line 271
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object v17

    .line 275
    goto :goto_6

    .line 276
    :goto_7
    iget-object v3, v4, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 277
    .line 278
    invoke-virtual {v3, v0}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 279
    .line 280
    .line 281
    move-result-object v32

    .line 282
    new-instance v18, Lcom/zykj/study/data/MyCourseEntity;

    .line 283
    .line 284
    move/from16 v33, v2

    .line 285
    .line 286
    move/from16 v19, v5

    .line 287
    .line 288
    move/from16 v24, v6

    .line 289
    .line 290
    move/from16 v25, v7

    .line 291
    .line 292
    move/from16 v26, v8

    .line 293
    .line 294
    move/from16 v27, v9

    .line 295
    .line 296
    move/from16 v28, v10

    .line 297
    .line 298
    invoke-direct/range {v18 .. v33}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    .line 300
    .line 301
    move-object/from16 v17, v18

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :catchall_0
    move-exception v0

    .line 305
    goto :goto_9

    .line 306
    :cond_7
    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 307
    .line 308
    .line 309
    return-object v17

    .line 310
    :goto_9
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 311
    .line 312
    .line 313
    throw v0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->deleteByUserId$lambda$5(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final getMyCourseList$lambda$3(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_stmt"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p1, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->deleteAll$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final insert$lambda$0(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__insertAdapterOfMyCourseEntity:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final insert$lambda$1(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/data/MyCourseEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__insertAdapterOfMyCourseEntity:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final updateStatus$lambda$7(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;ILandroidx/sqlite/SQLiteConnection;)I
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
    :try_start_0
    iget-object p1, p1, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/data/Converters;->sessionOrderTypeToString(Lcom/zykj/study/bean/course/CourseType;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-interface {p0, p2, p1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    int-to-long p2, p3

    .line 22
    invoke-interface {p0, p1, p2, p3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 26
    .line 27
    .line 28
    invoke-static {p4}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    .line 29
    .line 30
    .line 31
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 33
    .line 34
    .line 35
    return p1

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


# virtual methods
.method public deleteAll(Lm7/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/m0;

    .line 4
    .line 5
    const-string v2, "delete from my_course"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/zykj/study/data/m0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v0, v2, v3, v1, p1}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-ne p1, v0, :cond_0

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

.method public deleteByCourse(ILm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/r0;

    .line 4
    .line 5
    const-string v2, "delete from my_course where  id = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/data/r0;-><init>(Ljava/lang/String;I)V

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

.method public deleteByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
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
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/p0;

    .line 4
    .line 5
    const-string v2, "delete from my_course where  userId = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/data/p0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public findCourse(I)Landroidx/lifecycle/LiveData;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/study/data/MyCourseEntity;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "my_course"

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/zykj/study/data/s0;

    .line 14
    .line 15
    const-string v3, "select * from my_course where  id = ?"

    .line 16
    .line 17
    invoke-direct {v2, v3, p1, p0}, Lcom/zykj/study/data/s0;-><init>(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/InvalidationTracker;->createLiveData([Ljava/lang/String;ZLx7/l;)Landroidx/lifecycle/LiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public getMyCourseList(Ljava/lang/String;)Landroidx/paging/PagingSource;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/paging/PagingSource<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/study/data/MyCourseEntity;",
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
    new-instance v0, Landroidx/room/RoomRawQuery;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/study/data/o0;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/zykj/study/data/o0;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "select * from my_course where userId = ? ORDER BY sort"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lx7/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string v1, "my_course"

    .line 21
    .line 22
    filled-new-array {v1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;

    .line 27
    .line 28
    invoke-direct {v2, v0, p0, p1, v1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$getMyCourseList$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2
.end method

.method public insert(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/MyCourseEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/l0;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/l0;-><init>(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/data/MyCourseEntity;)V

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

.method public insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/data/MyCourseEntity;",
            ">;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/q0;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/q0;-><init>(Lcom/zykj/study/data/MyCourseEntityDao_Impl;Ljava/util/List;)V

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

.method public updateStatus(ILcom/zykj/study/bean/course/CourseType;)I
    .locals 3

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/study/data/n0;

    .line 9
    .line 10
    const-string v2, "update my_course set status = ? WHERE id =?"

    .line 11
    .line 12
    invoke-direct {v1, v2, p0, p2, p1}, Lcom/zykj/study/data/n0;-><init>(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLx7/l;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method
