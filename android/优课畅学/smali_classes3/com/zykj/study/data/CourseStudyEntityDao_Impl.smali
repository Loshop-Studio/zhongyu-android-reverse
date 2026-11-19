.class public final Lcom/zykj/study/data/CourseStudyEntityDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/study/data/CourseStudyEntityDao;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;


# instance fields
.field private final __converters:Lcom/zykj/study/data/Converters;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfCourseStudyEntity:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfCourseStudyEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->Companion:Lcom/zykj/study/data/CourseStudyEntityDao_Impl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->$stable:I

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
    iput-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 17
    .line 18
    new-instance p1, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$1;-><init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__insertAdapterOfCourseStudyEntity:Landroidx/room/EntityInsertAdapter;

    .line 24
    .line 25
    new-instance p1, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$2;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$2;-><init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__updateAdapterOfCourseStudyEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->getCourseStudyList$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get__converters$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Lcom/zykj/study/data/Converters;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get__db$p(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->deleteByUserId$lambda$6(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->insert$lambda$1(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/CourseStudyEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->findByIdAndUserId$lambda$3(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/CourseStudyEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final deleteAll$lambda$5(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
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

.method private static final deleteById$lambda$7(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;
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

.method private static final deleteByUserId$lambda$6(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
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

.method public static synthetic e(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->deleteAll$lambda$5(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->update$lambda$2(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final findByIdAndUserId$lambda$3(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/CourseStudyEntity;
    .locals 36

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const-string v2, "_connection"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    move-object/from16 v3, p1

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    move/from16 v4, p2

    .line 24
    .line 25
    int-to-long v4, v4

    .line 26
    invoke-interface {v1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 27
    .line 28
    .line 29
    const-string v3, "userName"

    .line 30
    .line 31
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const-string v4, "progress"

    .line 36
    .line 37
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const-string v5, "studyUserId"

    .line 42
    .line 43
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const-string v6, "learnTime"

    .line 48
    .line 49
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const-string v7, "id"

    .line 54
    .line 55
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const-string v8, "userId"

    .line 60
    .line 61
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    const-string v9, "cover"

    .line 66
    .line 67
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    const-string v10, "title"

    .line 72
    .line 73
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    const-string v11, "description"

    .line 78
    .line 79
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    const-string v12, "periodId"

    .line 84
    .line 85
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    const-string v13, "gradeId"

    .line 90
    .line 91
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    const-string v14, "subjectId"

    .line 96
    .line 97
    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    const-string v15, "learning"

    .line 102
    .line 103
    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    const-string v2, "likes"

    .line 108
    .line 109
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 p1, v2

    .line 114
    .line 115
    const-string v2, "isPublic"

    .line 116
    .line 117
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 p2, v2

    .line 122
    .line 123
    const-string v2, "status"

    .line 124
    .line 125
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 p4, v2

    .line 130
    .line 131
    const-string v2, "createTime"

    .line 132
    .line 133
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 138
    .line 139
    .line 140
    move-result v16

    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    if-eqz v16, :cond_9

    .line 144
    .line 145
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-eqz v16, :cond_0

    .line 150
    .line 151
    move-object/from16 v21, v17

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    move-object/from16 v21, v3

    .line 159
    .line 160
    :goto_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    long-to-int v3, v3

    .line 165
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_1

    .line 170
    .line 171
    move-object/from16 v33, v17

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    move-object/from16 v33, v4

    .line 179
    .line 180
    :goto_1
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_2

    .line 185
    .line 186
    move-object/from16 v4, v17

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_2
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v4

    .line 193
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    :goto_2
    iget-object v5, v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 198
    .line 199
    invoke-virtual {v5, v4}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 200
    .line 201
    .line 202
    move-result-object v35

    .line 203
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    long-to-int v4, v4

    .line 208
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_3

    .line 213
    .line 214
    move-object/from16 v20, v17

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_3
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    move-object/from16 v20, v5

    .line 222
    .line 223
    :goto_3
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_4

    .line 228
    .line 229
    move-object/from16 v22, v17

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_4
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    move-object/from16 v22, v5

    .line 237
    .line 238
    :goto_4
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-eqz v5, :cond_5

    .line 243
    .line 244
    move-object/from16 v23, v17

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_5
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    move-object/from16 v23, v5

    .line 252
    .line 253
    :goto_5
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_6

    .line 258
    .line 259
    move-object/from16 v24, v17

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_6
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    move-object/from16 v24, v5

    .line 267
    .line 268
    :goto_6
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v5

    .line 272
    long-to-int v5, v5

    .line 273
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    long-to-int v6, v6

    .line 278
    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 279
    .line 280
    .line 281
    move-result-wide v7

    .line 282
    long-to-int v7, v7

    .line 283
    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 284
    .line 285
    .line 286
    move-result-wide v8

    .line 287
    long-to-int v8, v8

    .line 288
    move/from16 v9, p1

    .line 289
    .line 290
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    long-to-int v9, v9

    .line 295
    move/from16 v10, p2

    .line 296
    .line 297
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v10

    .line 301
    long-to-int v10, v10

    .line 302
    if-eqz v10, :cond_7

    .line 303
    .line 304
    const/16 v30, 0x1

    .line 305
    .line 306
    :goto_7
    move/from16 v10, p4

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_7
    const/4 v10, 0x0

    .line 310
    move/from16 v30, v10

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :goto_8
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    iget-object v11, v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 318
    .line 319
    invoke-virtual {v11, v10}, Lcom/zykj/study/data/Converters;->stringToSessionOrderType(Ljava/lang/String;)Lcom/zykj/study/bean/course/CourseType;

    .line 320
    .line 321
    .line 322
    move-result-object v31

    .line 323
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-eqz v10, :cond_8

    .line 328
    .line 329
    :goto_9
    move-object/from16 v2, v17

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v10

    .line 336
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 337
    .line 338
    .line 339
    move-result-object v17

    .line 340
    goto :goto_9

    .line 341
    :goto_a
    iget-object v0, v0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__converters:Lcom/zykj/study/data/Converters;

    .line 342
    .line 343
    invoke-virtual {v0, v2}, Lcom/zykj/study/data/Converters;->longToDate(Ljava/lang/Long;)Ljava/util/Date;

    .line 344
    .line 345
    .line 346
    move-result-object v34

    .line 347
    new-instance v18, Lcom/zykj/study/data/CourseStudyEntity;

    .line 348
    .line 349
    move/from16 v32, v3

    .line 350
    .line 351
    move/from16 v19, v4

    .line 352
    .line 353
    move/from16 v25, v5

    .line 354
    .line 355
    move/from16 v26, v6

    .line 356
    .line 357
    move/from16 v27, v7

    .line 358
    .line 359
    move/from16 v28, v8

    .line 360
    .line 361
    move/from16 v29, v9

    .line 362
    .line 363
    invoke-direct/range {v18 .. v35}, Lcom/zykj/study/data/CourseStudyEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    .line 365
    .line 366
    move-object/from16 v17, v18

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :catchall_0
    move-exception v0

    .line 370
    goto :goto_c

    .line 371
    :cond_9
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 372
    .line 373
    .line 374
    return-object v17

    .line 375
    :goto_c
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 376
    .line 377
    .line 378
    throw v0
.end method

.method public static synthetic g(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->insert$lambda$0(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final getCourseStudyList$lambda$4(Ljava/lang/String;Landroidx/sqlite/SQLiteStatement;)Lh7/p;
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

.method public static synthetic h(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->deleteById$lambda$7(Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final insert$lambda$0(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__insertAdapterOfCourseStudyEntity:Landroidx/room/EntityInsertAdapter;

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

.method private static final insert$lambda$1(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__insertAdapterOfCourseStudyEntity:Landroidx/room/EntityInsertAdapter;

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

.method private static final update$lambda$2(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__updateAdapterOfCourseStudyEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
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
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/s;

    .line 4
    .line 5
    const-string v2, "delete from course_study"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/zykj/study/data/s;-><init>(Ljava/lang/String;)V

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

.method public deleteById(ILm7/c;)Ljava/lang/Object;
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
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/t;

    .line 4
    .line 5
    const-string v2, "delete from course_study where  id = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/data/t;-><init>(Ljava/lang/String;I)V

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
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/r;

    .line 4
    .line 5
    const-string v2, "delete from course_study where  studyUserId = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/data/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public findByIdAndUserId(Ljava/lang/String;ILm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/x;

    .line 4
    .line 5
    const-string v2, "select * from course_study where studyUserId = ? and id = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p0}, Lcom/zykj/study/data/x;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {v0, p1, p2, v1, p3}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public getCourseStudyList(Ljava/lang/String;)Landroidx/paging/PagingSource;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/paging/PagingSource<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/study/data/CourseStudyEntity;",
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
    new-instance v1, Lcom/zykj/study/data/y;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/zykj/study/data/y;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "select * from course_study where studyUserId = ? order by learnTime desc"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lx7/l;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 19
    .line 20
    const-string v1, "course_study"

    .line 21
    .line 22
    filled-new-array {v1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;

    .line 27
    .line 28
    invoke-direct {v2, v0, p0, p1, v1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;-><init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2
.end method

.method public insert(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/w;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/w;-><init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;)V

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
            "Lcom/zykj/study/data/CourseStudyEntity;",
            ">;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/zykj/study/data/v;

    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/v;-><init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Ljava/util/List;)V

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

.method public update(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/CourseStudyEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/data/u;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/zykj/study/data/u;-><init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, p1, v2, v1, p2}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLx7/l;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

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
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method
