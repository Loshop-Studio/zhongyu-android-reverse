.class public final Lcom/friday/common/dao/ResourceDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/dao/ResourceDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/dao/ResourceDao_Impl$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/friday/common/dao/ResourceDao_Impl$a;

.field public static final d:I


# instance fields
.field public final a:Landroidx/room/RoomDatabase;

.field public final b:Landroidx/room/EntityInsertAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/dao/ResourceDao_Impl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/dao/ResourceDao_Impl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/dao/ResourceDao_Impl;->c:Lcom/friday/common/dao/ResourceDao_Impl$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/dao/ResourceDao_Impl;->d:I

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
    iput-object p1, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Lcom/friday/common/dao/ResourceDao_Impl$1;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/friday/common/dao/ResourceDao_Impl$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/dao/ResourceDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic A0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->Y0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->N0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao;->A(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic E0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao;->O(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao;->i(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic G0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao;->s(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic H0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao;->o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final I0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final J0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final K0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p5, 0x1

    .line 15
    move v0, p5

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p0, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/2addr p2, p5

    .line 37
    invoke-interface {p0, p2, p3, p4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public static final L0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final M0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    const-string v2, "id"

    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "fileId"

    .line 27
    .line 28
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "pageName"

    .line 33
    .line 34
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "pageIndex"

    .line 39
    .line 40
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "ossImageUrl"

    .line 45
    .line 46
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "md5"

    .line 51
    .line 52
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "userId"

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "resourceType"

    .line 63
    .line 64
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "toBeUploaded"

    .line 69
    .line 70
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "wasDeleted"

    .line 75
    .line 76
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "createTimeStamp"

    .line 81
    .line 82
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "updateTimeStamp"

    .line 87
    .line 88
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    new-instance v14, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    if-eqz v15, :cond_4

    .line 102
    .line 103
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v17

    .line 107
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v18

    .line 111
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v19

    .line 115
    move/from16 p0, v2

    .line 116
    .line 117
    move/from16 p1, v3

    .line 118
    .line 119
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    long-to-int v2, v2

    .line 124
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v21

    .line 128
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v22

    .line 132
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v23

    .line 136
    move/from16 v20, v2

    .line 137
    .line 138
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    long-to-int v2, v2

    .line 143
    move/from16 v25, v2

    .line 144
    .line 145
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    long-to-int v2, v2

    .line 150
    if-eqz v2, :cond_0

    .line 151
    .line 152
    move/from16 v26, v0

    .line 153
    .line 154
    :goto_1
    move/from16 p2, v4

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_0
    const/16 v26, 0x0

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    long-to-int v2, v3

    .line 165
    if-eqz v2, :cond_1

    .line 166
    .line 167
    move/from16 v27, v0

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_1
    const/16 v27, 0x0

    .line 171
    .line 172
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    const/4 v3, 0x0

    .line 177
    if-eqz v2, :cond_2

    .line 178
    .line 179
    move-object/from16 v28, v3

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    move-object/from16 v28, v2

    .line 187
    .line 188
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_3

    .line 193
    .line 194
    :goto_5
    move-object/from16 v29, v3

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    goto :goto_5

    .line 202
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 203
    .line 204
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v2, v16

    .line 208
    .line 209
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    .line 212
    move/from16 v2, p0

    .line 213
    .line 214
    move/from16 v3, p1

    .line 215
    .line 216
    move/from16 v4, p2

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    goto :goto_7

    .line 221
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 222
    .line 223
    .line 224
    return-object v14

    .line 225
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 226
    .line 227
    .line 228
    throw v0
.end method

.method public static final N0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    const-string v2, "id"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "pageName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "pageIndex"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "ossImageUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "md5"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "userId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "resourceType"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "toBeUploaded"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "wasDeleted"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "createTimeStamp"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "updateTimeStamp"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    new-instance v14, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    if-eqz v15, :cond_4

    .line 108
    .line 109
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v17

    .line 113
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v18

    .line 117
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v19

    .line 121
    move/from16 p0, v2

    .line 122
    .line 123
    move/from16 p1, v3

    .line 124
    .line 125
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    long-to-int v2, v2

    .line 130
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v21

    .line 134
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v22

    .line 138
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v23

    .line 142
    move/from16 v20, v2

    .line 143
    .line 144
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    long-to-int v2, v2

    .line 149
    move/from16 v25, v2

    .line 150
    .line 151
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    long-to-int v2, v2

    .line 156
    if-eqz v2, :cond_0

    .line 157
    .line 158
    move/from16 v26, v0

    .line 159
    .line 160
    :goto_1
    move/from16 p2, v4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_0
    const/16 v26, 0x0

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    long-to-int v2, v3

    .line 171
    if-eqz v2, :cond_1

    .line 172
    .line 173
    move/from16 v27, v0

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_1
    const/16 v27, 0x0

    .line 177
    .line 178
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    const/4 v3, 0x0

    .line 183
    if-eqz v2, :cond_2

    .line 184
    .line 185
    move-object/from16 v28, v3

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object/from16 v28, v2

    .line 193
    .line 194
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_3

    .line 199
    .line 200
    :goto_5
    move-object/from16 v29, v3

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    goto :goto_5

    .line 208
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 209
    .line 210
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v2, v16

    .line 214
    .line 215
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    move/from16 v2, p0

    .line 219
    .line 220
    move/from16 v3, p1

    .line 221
    .line 222
    move/from16 v4, p2

    .line 223
    .line 224
    goto :goto_0

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    goto :goto_7

    .line 227
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 228
    .line 229
    .line 230
    return-object v14

    .line 231
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 232
    .line 233
    .line 234
    throw v0
.end method

.method public static final O0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    move-wide/from16 v2, p1

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    move-object/from16 v3, p3

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "id"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "pageName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "pageIndex"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "ossImageUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "md5"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "userId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "resourceType"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "toBeUploaded"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "wasDeleted"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "createTimeStamp"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "updateTimeStamp"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    new-instance v14, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    if-eqz v15, :cond_4

    .line 108
    .line 109
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v17

    .line 113
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v18

    .line 117
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v19

    .line 121
    move/from16 p0, v2

    .line 122
    .line 123
    move/from16 p1, v3

    .line 124
    .line 125
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    long-to-int v2, v2

    .line 130
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v21

    .line 134
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v22

    .line 138
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v23

    .line 142
    move/from16 v20, v2

    .line 143
    .line 144
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    long-to-int v2, v2

    .line 149
    move/from16 v25, v2

    .line 150
    .line 151
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    long-to-int v2, v2

    .line 156
    if-eqz v2, :cond_0

    .line 157
    .line 158
    move/from16 v26, v0

    .line 159
    .line 160
    :goto_1
    move/from16 p2, v4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_0
    const/16 v26, 0x0

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    long-to-int v2, v3

    .line 171
    if-eqz v2, :cond_1

    .line 172
    .line 173
    move/from16 v27, v0

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_1
    const/16 v27, 0x0

    .line 177
    .line 178
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    const/4 v3, 0x0

    .line 183
    if-eqz v2, :cond_2

    .line 184
    .line 185
    move-object/from16 v28, v3

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object/from16 v28, v2

    .line 193
    .line 194
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_3

    .line 199
    .line 200
    :goto_5
    move-object/from16 v29, v3

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    goto :goto_5

    .line 208
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 209
    .line 210
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v2, v16

    .line 214
    .line 215
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    move/from16 v2, p0

    .line 219
    .line 220
    move/from16 v3, p1

    .line 221
    .line 222
    move/from16 v4, p2

    .line 223
    .line 224
    goto :goto_0

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    goto :goto_7

    .line 227
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 228
    .line 229
    .line 230
    return-object v14

    .line 231
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 232
    .line 233
    .line 234
    throw v0
.end method

.method public static final P0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;
    .locals 30

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
    const-string v2, "id"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "pageName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "pageIndex"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "ossImageUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "md5"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "userId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "resourceType"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "toBeUploaded"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "wasDeleted"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "createTimeStamp"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "updateTimeStamp"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    const/4 v15, 0x0

    .line 103
    if-eqz v14, :cond_4

    .line 104
    .line 105
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v17

    .line 109
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v18

    .line 113
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v19

    .line 117
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    long-to-int v2, v2

    .line 122
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v21

    .line 126
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v22

    .line 130
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v23

    .line 134
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    long-to-int v3, v3

    .line 139
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    long-to-int v4, v4

    .line 144
    const/4 v5, 0x0

    .line 145
    if-eqz v4, :cond_0

    .line 146
    .line 147
    move/from16 v26, v0

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_0
    move/from16 v26, v5

    .line 151
    .line 152
    :goto_0
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    long-to-int v4, v6

    .line 157
    if-eqz v4, :cond_1

    .line 158
    .line 159
    move/from16 v27, v0

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    move/from16 v27, v5

    .line 163
    .line 164
    :goto_1
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_2

    .line 169
    .line 170
    move-object/from16 v28, v15

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    move-object/from16 v28, v0

    .line 178
    .line 179
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_3

    .line 184
    .line 185
    :goto_3
    move-object/from16 v29, v15

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    goto :goto_3

    .line 193
    :goto_4
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 194
    .line 195
    move/from16 v20, v2

    .line 196
    .line 197
    move/from16 v25, v3

    .line 198
    .line 199
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    .line 201
    .line 202
    move-object/from16 v15, v16

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto :goto_6

    .line 207
    :cond_4
    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 208
    .line 209
    .line 210
    return-object v15

    .line 211
    :goto_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 212
    .line 213
    .line 214
    throw v0
.end method

.method public static final Q0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Boolean;
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
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x0

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    move-object p3, p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {p0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    long-to-int p3, v0

    .line 39
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    :goto_0
    if-eqz p3, :cond_2

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move p4, p1

    .line 53
    :goto_1
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    :goto_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :goto_3
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public static final R0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    const-string v2, "id"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "fileId"

    .line 33
    .line 34
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-string v4, "pageName"

    .line 39
    .line 40
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const-string v5, "pageIndex"

    .line 45
    .line 46
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, "ossImageUrl"

    .line 51
    .line 52
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const-string v7, "md5"

    .line 57
    .line 58
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v8, "userId"

    .line 63
    .line 64
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const-string v9, "resourceType"

    .line 69
    .line 70
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const-string v10, "toBeUploaded"

    .line 75
    .line 76
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const-string v11, "wasDeleted"

    .line 81
    .line 82
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const-string v12, "createTimeStamp"

    .line 87
    .line 88
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const-string v13, "updateTimeStamp"

    .line 93
    .line 94
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    new-instance v14, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    if-eqz v15, :cond_4

    .line 108
    .line 109
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v17

    .line 113
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v18

    .line 117
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v19

    .line 121
    move/from16 p0, v2

    .line 122
    .line 123
    move/from16 p1, v3

    .line 124
    .line 125
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    long-to-int v2, v2

    .line 130
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v21

    .line 134
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v22

    .line 138
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v23

    .line 142
    move/from16 v20, v2

    .line 143
    .line 144
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    long-to-int v2, v2

    .line 149
    move/from16 v25, v2

    .line 150
    .line 151
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    long-to-int v2, v2

    .line 156
    if-eqz v2, :cond_0

    .line 157
    .line 158
    move/from16 v26, v0

    .line 159
    .line 160
    :goto_1
    move/from16 p2, v4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_0
    const/16 v26, 0x0

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    long-to-int v2, v3

    .line 171
    if-eqz v2, :cond_1

    .line 172
    .line 173
    move/from16 v27, v0

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_1
    const/16 v27, 0x0

    .line 177
    .line 178
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    const/4 v3, 0x0

    .line 183
    if-eqz v2, :cond_2

    .line 184
    .line 185
    move-object/from16 v28, v3

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object/from16 v28, v2

    .line 193
    .line 194
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_3

    .line 199
    .line 200
    :goto_5
    move-object/from16 v29, v3

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    goto :goto_5

    .line 208
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 209
    .line 210
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v2, v16

    .line 214
    .line 215
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    move/from16 v2, p0

    .line 219
    .line 220
    move/from16 v3, p1

    .line 221
    .line 222
    move/from16 v4, p2

    .line 223
    .line 224
    goto :goto_0

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    goto :goto_7

    .line 227
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 228
    .line 229
    .line 230
    return-object v14

    .line 231
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 232
    .line 233
    .line 234
    throw v0
.end method

.method public static final S0(Ljava/lang/String;Ljava/lang/String;JILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    move-wide/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    move/from16 v3, p4

    .line 28
    .line 29
    int-to-long v3, v3

    .line 30
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 31
    .line 32
    .line 33
    const-string v2, "id"

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const-string v3, "fileId"

    .line 40
    .line 41
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-string v4, "pageName"

    .line 46
    .line 47
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const-string v5, "pageIndex"

    .line 52
    .line 53
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const-string v6, "ossImageUrl"

    .line 58
    .line 59
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const-string v7, "md5"

    .line 64
    .line 65
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-string v8, "userId"

    .line 70
    .line 71
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    const-string v9, "resourceType"

    .line 76
    .line 77
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    const-string v10, "toBeUploaded"

    .line 82
    .line 83
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    const-string v11, "wasDeleted"

    .line 88
    .line 89
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    const-string v12, "createTimeStamp"

    .line 94
    .line 95
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    const-string v13, "updateTimeStamp"

    .line 100
    .line 101
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    new-instance v14, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-eqz v15, :cond_4

    .line 115
    .line 116
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v17

    .line 120
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v18

    .line 124
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v19

    .line 128
    move/from16 p0, v2

    .line 129
    .line 130
    move/from16 p1, v3

    .line 131
    .line 132
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    long-to-int v2, v2

    .line 137
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v21

    .line 141
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v22

    .line 145
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v23

    .line 149
    move/from16 v20, v2

    .line 150
    .line 151
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    long-to-int v2, v2

    .line 156
    move/from16 v25, v2

    .line 157
    .line 158
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 159
    .line 160
    .line 161
    move-result-wide v2

    .line 162
    long-to-int v2, v2

    .line 163
    if-eqz v2, :cond_0

    .line 164
    .line 165
    move/from16 v26, v0

    .line 166
    .line 167
    :goto_1
    move/from16 p2, v4

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_0
    const/16 v26, 0x0

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 174
    .line 175
    .line 176
    move-result-wide v3

    .line 177
    long-to-int v2, v3

    .line 178
    if-eqz v2, :cond_1

    .line 179
    .line 180
    move/from16 v27, v0

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_1
    const/16 v27, 0x0

    .line 184
    .line 185
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    const/4 v3, 0x0

    .line 190
    if-eqz v2, :cond_2

    .line 191
    .line 192
    move-object/from16 v28, v3

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    move-object/from16 v28, v2

    .line 200
    .line 201
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_3

    .line 206
    .line 207
    :goto_5
    move-object/from16 v29, v3

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    goto :goto_5

    .line 215
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 216
    .line 217
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v2, v16

    .line 221
    .line 222
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    move/from16 v2, p0

    .line 226
    .line 227
    move/from16 v3, p1

    .line 228
    .line 229
    move/from16 v4, p2

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :catchall_0
    move-exception v0

    .line 233
    goto :goto_7

    .line 234
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 235
    .line 236
    .line 237
    return-object v14

    .line 238
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 239
    .line 240
    .line 241
    throw v0
.end method

.method public static final T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    const-string v2, "id"

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const-string v3, "fileId"

    .line 39
    .line 40
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const-string v4, "pageName"

    .line 45
    .line 46
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const-string v5, "pageIndex"

    .line 51
    .line 52
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const-string v6, "ossImageUrl"

    .line 57
    .line 58
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-string v7, "md5"

    .line 63
    .line 64
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const-string v8, "userId"

    .line 69
    .line 70
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-string v9, "resourceType"

    .line 75
    .line 76
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    const-string v10, "toBeUploaded"

    .line 81
    .line 82
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const-string v11, "wasDeleted"

    .line 87
    .line 88
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const-string v12, "createTimeStamp"

    .line 93
    .line 94
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    const-string v13, "updateTimeStamp"

    .line 99
    .line 100
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    new-instance v14, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    if-eqz v15, :cond_4

    .line 114
    .line 115
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v17

    .line 119
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v18

    .line 123
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v19

    .line 127
    move/from16 p0, v2

    .line 128
    .line 129
    move/from16 p1, v3

    .line 130
    .line 131
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 132
    .line 133
    .line 134
    move-result-wide v2

    .line 135
    long-to-int v2, v2

    .line 136
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v21

    .line 140
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v22

    .line 144
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v23

    .line 148
    move/from16 v20, v2

    .line 149
    .line 150
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    long-to-int v2, v2

    .line 155
    move/from16 v25, v2

    .line 156
    .line 157
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    long-to-int v2, v2

    .line 162
    if-eqz v2, :cond_0

    .line 163
    .line 164
    move/from16 v26, v0

    .line 165
    .line 166
    :goto_1
    move/from16 p2, v4

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_0
    const/16 v26, 0x0

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :goto_2
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    long-to-int v2, v3

    .line 177
    if-eqz v2, :cond_1

    .line 178
    .line 179
    move/from16 v27, v0

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_1
    const/16 v27, 0x0

    .line 183
    .line 184
    :goto_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/4 v3, 0x0

    .line 189
    if-eqz v2, :cond_2

    .line 190
    .line 191
    move-object/from16 v28, v3

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object/from16 v28, v2

    .line 199
    .line 200
    :goto_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_3

    .line 205
    .line 206
    :goto_5
    move-object/from16 v29, v3

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    goto :goto_5

    .line 214
    :goto_6
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 215
    .line 216
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v2, v16

    .line 220
    .line 221
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    move/from16 v2, p0

    .line 225
    .line 226
    move/from16 v3, p1

    .line 227
    .line 228
    move/from16 v4, p2

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :catchall_0
    move-exception v0

    .line 232
    goto :goto_7

    .line 233
    :cond_4
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 234
    .line 235
    .line 236
    return-object v14

    .line 237
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 238
    .line 239
    .line 240
    throw v0
.end method

.method public static final U0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)I
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
    invoke-interface {p0, p4, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0, p2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    long-to-int p2, p1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 34
    .line 35
    .line 36
    return p2

    .line 37
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public static final V0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 30

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
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x1

    .line 19
    move v3, v2

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_8

    .line 40
    .line 41
    :cond_0
    add-int/lit8 v0, p2, 0x1

    .line 42
    .line 43
    move-wide/from16 v3, p3

    .line 44
    .line 45
    invoke-interface {v1, v0, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 46
    .line 47
    .line 48
    const-string v0, "id"

    .line 49
    .line 50
    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const-string v3, "fileId"

    .line 55
    .line 56
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const-string v4, "pageName"

    .line 61
    .line 62
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const-string v5, "pageIndex"

    .line 67
    .line 68
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const-string v6, "ossImageUrl"

    .line 73
    .line 74
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const-string v7, "md5"

    .line 79
    .line 80
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    const-string v8, "userId"

    .line 85
    .line 86
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const-string v9, "resourceType"

    .line 91
    .line 92
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const-string v10, "toBeUploaded"

    .line 97
    .line 98
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    const-string v11, "wasDeleted"

    .line 103
    .line 104
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    const-string v12, "createTimeStamp"

    .line 109
    .line 110
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    const-string v13, "updateTimeStamp"

    .line 115
    .line 116
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    new-instance v14, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-eqz v15, :cond_5

    .line 130
    .line 131
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v17

    .line 135
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v18

    .line 139
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v19

    .line 143
    move/from16 p1, v3

    .line 144
    .line 145
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    long-to-int v2, v2

    .line 150
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v21

    .line 154
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v22

    .line 158
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 159
    .line 160
    .line 161
    move-result-wide v23

    .line 162
    move/from16 v20, v2

    .line 163
    .line 164
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    long-to-int v2, v2

    .line 169
    move/from16 v25, v2

    .line 170
    .line 171
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    long-to-int v2, v2

    .line 176
    if-eqz v2, :cond_1

    .line 177
    .line 178
    const/16 v26, 0x1

    .line 179
    .line 180
    :goto_2
    move/from16 p2, v4

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_1
    const/16 v26, 0x0

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :goto_3
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    long-to-int v2, v3

    .line 191
    if-eqz v2, :cond_2

    .line 192
    .line 193
    const/16 v27, 0x1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_2
    const/16 v27, 0x0

    .line 197
    .line 198
    :goto_4
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    const/4 v3, 0x0

    .line 203
    if-eqz v2, :cond_3

    .line 204
    .line 205
    move-object/from16 v28, v3

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_3
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    move-object/from16 v28, v2

    .line 213
    .line 214
    :goto_5
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_4

    .line 219
    .line 220
    :goto_6
    move-object/from16 v29, v3

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_4
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    goto :goto_6

    .line 228
    :goto_7
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 229
    .line 230
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    move-object/from16 v2, v16

    .line 234
    .line 235
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    .line 237
    .line 238
    move/from16 v3, p1

    .line 239
    .line 240
    move/from16 v4, p2

    .line 241
    .line 242
    const/4 v2, 0x1

    .line 243
    goto :goto_1

    .line 244
    :cond_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 245
    .line 246
    .line 247
    return-object v14

    .line 248
    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 249
    .line 250
    .line 251
    throw v0
.end method

.method public static final W0(Lcom/friday/common/dao/ResourceDao_Impl;Lcom/friday/common/entity/ResourceEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

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

.method public static final X0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "_connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->b:Landroidx/room/EntityInsertAdapter;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insert(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final Y0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static final Z0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic a0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->K0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final a1(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;
    .locals 30

    .line 1
    move-object/from16 v0, p6

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
    const/4 v2, 0x2

    .line 21
    move-object/from16 v3, p3

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    move-object/from16 v3, p4

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    move-object/from16 v3, p5

    .line 34
    .line 35
    invoke-interface {v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "id"

    .line 39
    .line 40
    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const-string v3, "fileId"

    .line 45
    .line 46
    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const-string v4, "pageName"

    .line 51
    .line 52
    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const-string v5, "pageIndex"

    .line 57
    .line 58
    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const-string v6, "ossImageUrl"

    .line 63
    .line 64
    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const-string v7, "md5"

    .line 69
    .line 70
    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    const-string v8, "userId"

    .line 75
    .line 76
    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    const-string v9, "resourceType"

    .line 81
    .line 82
    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const-string v10, "toBeUploaded"

    .line 87
    .line 88
    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    const-string v11, "wasDeleted"

    .line 93
    .line 94
    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    const-string v12, "createTimeStamp"

    .line 99
    .line 100
    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    const-string v13, "updateTimeStamp"

    .line 105
    .line 106
    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    const/4 v15, 0x0

    .line 115
    if-eqz v14, :cond_4

    .line 116
    .line 117
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v18

    .line 125
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v19

    .line 129
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    long-to-int v2, v2

    .line 134
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v21

    .line 138
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v22

    .line 142
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 143
    .line 144
    .line 145
    move-result-wide v23

    .line 146
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    long-to-int v3, v3

    .line 151
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v4

    .line 155
    long-to-int v4, v4

    .line 156
    const/4 v5, 0x0

    .line 157
    if-eqz v4, :cond_0

    .line 158
    .line 159
    move/from16 v26, v0

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_0
    move/from16 v26, v5

    .line 163
    .line 164
    :goto_0
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    long-to-int v4, v6

    .line 169
    if-eqz v4, :cond_1

    .line 170
    .line 171
    move/from16 v27, v0

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_1
    move/from16 v27, v5

    .line 175
    .line 176
    :goto_1
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    move-object/from16 v28, v15

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_2
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object/from16 v28, v0

    .line 190
    .line 191
    :goto_2
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_3

    .line 196
    .line 197
    :goto_3
    move-object/from16 v29, v15

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_3
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    goto :goto_3

    .line 205
    :goto_4
    new-instance v16, Lcom/friday/common/entity/ResourceEntity;

    .line 206
    .line 207
    move/from16 v20, v2

    .line 208
    .line 209
    move/from16 v25, v3

    .line 210
    .line 211
    invoke-direct/range {v16 .. v29}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    .line 213
    .line 214
    move-object/from16 v15, v16

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    goto :goto_6

    .line 219
    :cond_4
    :goto_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 220
    .line 221
    .line 222
    return-object v15

    .line 223
    :goto_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 224
    .line 225
    .line 226
    throw v0
.end method

.method public static synthetic b0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->Q0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final b1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic c0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->R0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Ljava/lang/String;Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    int-to-long p2, p2

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

.method public static synthetic d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao_Impl;->h1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final d1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic e0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->I0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 1

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
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    invoke-interface {p0, p1, p3, p4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static synthetic f0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->P0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final f1(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p5, 0x1

    .line 15
    move v0, p5

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p0, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/2addr p2, p5

    .line 37
    invoke-interface {p0, p2, p3, p4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public static synthetic g0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->O0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final g1(Ljava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    int-to-long v0, p1

    .line 12
    :try_start_0
    invoke-interface {p0, p3, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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

.method public static synthetic h0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->J0(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final h1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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

.method public static synthetic i0(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/common/dao/ResourceDao_Impl;->i1(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final i1(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    int-to-long v0, p1

    .line 12
    :try_start_0
    invoke-interface {p0, p6, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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
    invoke-interface {p0, p1, p4, p5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

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

.method public static synthetic j0(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/common/dao/ResourceDao_Impl;->a1(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/ResourceEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final j1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static synthetic k0(Ljava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao_Impl;->g1(Ljava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final k1(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
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
    invoke-interface {p0, p4, p1, p2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-interface {p0, p1, p3}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

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

.method public static synthetic l0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->V0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->f1(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Ljava/lang/String;Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao_Impl;->c1(Ljava/lang/String;Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->b1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->j1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->X0(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->Z0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->d1(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->U0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    return p0
.end method

.method public static synthetic v0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao_Impl;->k1(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao_Impl;->M0(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Ljava/lang/String;Ljava/lang/String;JILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao_Impl;->S0(Ljava/lang/String;Ljava/lang/String;JILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->L0(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lcom/friday/common/dao/ResourceDao_Impl;Lcom/friday/common/entity/ResourceEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao_Impl;->W0(Lcom/friday/common/dao/ResourceDao_Impl;Lcom/friday/common/entity/ResourceEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/ResourceDao_Impl$deletePageResources$2;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao_Impl$deletePageResources$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/lang/String;JLvc/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p5}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public B(JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/w1;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE userId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/w1;-><init>(Ljava/lang/String;J)V

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

.method public C(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/t1;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ResourceEntity WHERE fileId = ?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/t1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/a2;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET toBeUploaded=1 WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/a2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/o1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/o1;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Lcom/friday/common/entity/ResourceEntity;)V

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

.method public H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/x1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET toBeUploaded=0 WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/x1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/y1;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE id=? AND userId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/y1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public L(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "DELETE FROM ResourceEntity WHERE id IN ("

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
    move-result v5

    .line 15
    invoke-static {v0, v5}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, ") AND ossImageUrl=\'\' AND userId="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "?"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v0, "toString(...)"

    .line 33
    .line 34
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 38
    .line 39
    new-instance v2, Lc2/k1;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    move-wide v6, p2

    .line 43
    invoke-direct/range {v2 .. v7}, Lc2/k1;-><init>(Ljava/lang/String;Ljava/util/List;IJ)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {v0, p1, p2, v2, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-ne p1, p2, :cond_0

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 60
    .line 61
    return-object p1
.end method

.method public O(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/ResourceDao_Impl$deleteResourceList$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/ResourceDao_Impl$deleteResourceList$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Lvc/c;)V

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

.method public R(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/z1;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ResourceEntity WHERE fileId=? AND userId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/z1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public S(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/u1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET userId=? WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/u1;-><init>(Ljava/lang/String;JLjava/lang/String;)V

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

.method public T(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/d1;

    .line 4
    .line 5
    const-string v2, "SELECT max(pageIndex) FROM ResourceEntity WHERE userId=? AND fileId=? "

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/d1;-><init>(Ljava/lang/String;JLjava/lang/String;)V

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

.method public V(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/e2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=? AND wasDeleted=0"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/e2;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public W(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/n1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET pageIndex = ? WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p1}, Lc2/n1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

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

.method public X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/j1;

    .line 4
    .line 5
    const-string v2, "SELECT wasDeleted FROM ResourceEntity WHERE id like \'%\' || ? || \'%\' AND userId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/j1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public Y(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SELECT * FROM ResourceEntity WHERE id IN ("

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
    move-result v5

    .line 15
    invoke-static {v0, v5}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, ") AND ossImageUrl!=\'\' AND userId="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "?"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v0, "toString(...)"

    .line 33
    .line 34
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 38
    .line 39
    new-instance v2, Lc2/r1;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    move-wide v6, p2

    .line 43
    invoke-direct/range {v2 .. v7}, Lc2/r1;-><init>(Ljava/lang/String;Ljava/util/List;IJ)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-static {v0, p1, p2, v2, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/e1;

    .line 4
    .line 5
    const-string v2, "DELETE FROM ResourceEntity WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/e1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/q1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET ossImageUrl=? WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p1}, Lc2/q1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public b(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded=0 WHERE id IN ("

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
    move-result v5

    .line 15
    invoke-static {v0, v5}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, ") AND userId="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "?"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v0, "toString(...)"

    .line 33
    .line 34
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 38
    .line 39
    new-instance v2, Lc2/p1;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    move-wide v6, p2

    .line 43
    invoke-direct/range {v2 .. v7}, Lc2/p1;-><init>(Ljava/lang/String;Ljava/util/List;IJ)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {v0, p1, p2, v2, p4}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-ne p1, p2, :cond_0

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 60
    .line 61
    return-object p1
.end method

.method public d(Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/h1;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=? AND pageIndex = ? AND wasDeleted=0"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v6, p2

    .line 9
    move-wide v4, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/h1;-><init>(Ljava/lang/String;Ljava/lang/String;JI)V

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

.method public e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/v1;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE userId=? AND fileId=?  AND wasDeleted = 1"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/v1;-><init>(Ljava/lang/String;JLjava/lang/String;)V

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

.method public f(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/f2;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded=0 WHERE fileId=? AND pageName=? AND userId=?"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/f2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {v0, p1, p2, v1, p5}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 27
    .line 28
    return-object p1
.end method

.method public i(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/ResourceDao_Impl$deleteResourceListExceptOssUrlNotEmpty$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/common/dao/ResourceDao_Impl$deleteResourceListExceptOssUrlNotEmpty$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;Lvc/c;)V

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

.method public j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/f1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET md5=?,updateTimeStamp=? WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p2, p3, p1}, Lc2/f1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method public k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/i1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE id=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/i1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/l1;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE userId=? AND fileId=? AND pageName LIKE \'%\' || ? || \'%\' AND Id LIKE \'%\' || ? || \'%\' "

    .line 6
    .line 7
    move-object v5, p1

    .line 8
    move-object v6, p2

    .line 9
    move-object v7, p3

    .line 10
    move-wide v3, p4

    .line 11
    invoke-direct/range {v1 .. v7}, Lc2/l1;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/g1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET pageIndex=? WHERE fileId=? AND pageName=? AND userId=? AND wasDeleted=0"

    .line 6
    .line 7
    move-object v4, p1

    .line 8
    move-object v5, p2

    .line 9
    move v3, p3

    .line 10
    move-wide v6, p4

    .line 11
    invoke-direct/range {v1 .. v7}, Lc2/g1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-static {v0, p1, p2, v1, p6}, Landroidx/room/util/DBUtil;->performSuspending(Landroidx/room/RoomDatabase;ZZLhd/l;Lvc/c;)Ljava/lang/Object;

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

.method public o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao_Impl$updatePageOrder$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/Map;JLvc/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p5}, Landroidx/room/util/DBUtil;->performInTransactionSuspending(Landroidx/room/RoomDatabase;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p1
.end method

.method public p(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/s1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE fileId=? AND pageIndex=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2}, Lc2/s1;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

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

.method public q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/m1;

    .line 4
    .line 5
    const-string v2, "UPDATE ResourceEntity SET wasDeleted=1, toBeUploaded =0 WHERE fileId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lc2/m1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public r(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/d2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE fileId=? AND pageName=? AND userId=? AND wasDeleted=0"

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lc2/d2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

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

.method public s(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/dao/ResourceDao_Impl$syncResourceList$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/common/dao/ResourceDao_Impl$syncResourceList$2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/lang/String;Ljava/util/List;Lvc/c;)V

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

.method public v(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/b2;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM ResourceEntity WHERE fileId=? AND userId=?"

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lc2/b2;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

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

.method public x(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao_Impl;->a:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Lc2/c2;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lc2/c2;-><init>(Lcom/friday/common/dao/ResourceDao_Impl;Ljava/util/List;)V

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
