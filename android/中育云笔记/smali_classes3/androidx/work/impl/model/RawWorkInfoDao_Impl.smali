.class public final Landroidx/work/impl/model/RawWorkInfoDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/impl/model/RawWorkInfoDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 0
    .param p1    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 5
    .line 6
    return-void
.end method

.method private __fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V
    .locals 5
    .param p1    # Ljava/util/HashMap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroidx/work/Data;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3e7

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-le v1, v2, :cond_1

    .line 20
    .line 21
    new-instance v0, Landroidx/work/impl/model/b;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroidx/work/impl/model/b;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v3, v0}, Landroidx/room/util/RelationUtil;->recursiveFetchHashMap(Ljava/util/HashMap;ZLhd/l;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Landroidx/room/util/StringUtil;->newStringBuilder()Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v1, v2}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 44
    .line 45
    .line 46
    const-string v4, ")"

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move v2, v3

    .line 64
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v1, v2, v4}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    add-int/2addr v2, v3

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v0, v1, v3, v2}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :try_start_0
    const-string v1, "work_spec_id"

    .line 90
    .line 91
    invoke-static {v0, v1}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    const/4 v2, -0x1

    .line 96
    if-ne v1, v2, :cond_3

    .line 97
    .line 98
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/ArrayList;

    .line 117
    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v4}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catchall_0
    move-exception p1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 139
    .line 140
    .line 141
    throw p1
.end method

.method private __fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V
    .locals 5
    .param p1    # Ljava/util/HashMap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3e7

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-le v1, v2, :cond_1

    .line 20
    .line 21
    new-instance v0, Landroidx/work/impl/model/a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroidx/work/impl/model/a;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v3, v0}, Landroidx/room/util/RelationUtil;->recursiveFetchHashMap(Ljava/util/HashMap;ZLhd/l;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Landroidx/room/util/StringUtil;->newStringBuilder()Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v1, v2}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    .line 44
    .line 45
    .line 46
    const-string v4, ")"

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move v2, v3

    .line 64
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v1, v2, v4}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    add-int/2addr v2, v3

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v0, v1, v3, v2}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :try_start_0
    const-string v1, "work_spec_id"

    .line 90
    .line 91
    invoke-static {v0, v1}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    const/4 v2, -0x1

    .line 96
    if-ne v1, v2, :cond_3

    .line 97
    .line 98
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/ArrayList;

    .line 117
    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 135
    .line 136
    .line 137
    throw p1
.end method

.method public static synthetic a(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)Lqc/q;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic access$000(Landroidx/work/impl/model/RawWorkInfoDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Ljava/util/HashMap;)Lqc/q;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public getWorkInfoPojos(Landroidx/sqlite/db/SupportSQLiteQuery;)Ljava/util/List;
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/sqlite/db/SupportSQLiteQuery;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 2
    iget-object v0, v1, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v4, p1

    invoke-static {v0, v4, v2, v3}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v4

    .line 3
    :try_start_0
    const-string v0, "id"

    invoke-static {v4, v0}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    .line 4
    const-string v5, "state"

    invoke-static {v4, v5}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    .line 5
    const-string v6, "output"

    invoke-static {v4, v6}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    .line 6
    const-string v7, "initial_delay"

    invoke-static {v4, v7}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 7
    const-string v8, "interval_duration"

    invoke-static {v4, v8}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    .line 8
    const-string v9, "flex_duration"

    invoke-static {v4, v9}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    .line 9
    const-string v10, "run_attempt_count"

    invoke-static {v4, v10}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    .line 10
    const-string v11, "backoff_policy"

    invoke-static {v4, v11}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    .line 11
    const-string v12, "backoff_delay_duration"

    invoke-static {v4, v12}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    .line 12
    const-string v13, "last_enqueue_time"

    invoke-static {v4, v13}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    .line 13
    const-string v14, "period_count"

    invoke-static {v4, v14}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    .line 14
    const-string v15, "generation"

    invoke-static {v4, v15}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    .line 15
    const-string v2, "next_schedule_time_override"

    invoke-static {v4, v2}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    .line 16
    const-string v3, "stop_reason"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    .line 17
    const-string v3, "required_network_type"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v16, v3

    .line 18
    const-string v3, "required_network_request"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    .line 19
    const-string v3, "requires_charging"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    .line 20
    const-string v3, "requires_device_idle"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    .line 21
    const-string v3, "requires_battery_not_low"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    .line 22
    const-string v3, "requires_storage_not_low"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    .line 23
    const-string v3, "trigger_content_update_delay"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    .line 24
    const-string v3, "trigger_max_content_delay"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    .line 25
    const-string v3, "content_uri_triggers"

    invoke-static {v4, v3}, Landroidx/room/util/CursorUtil;->getColumnIndex(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    .line 26
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move/from16 v25, v2

    .line 27
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 28
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v26

    if-eqz v26, :cond_2

    move/from16 v26, v15

    .line 29
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 30
    invoke-virtual {v3, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_0

    move/from16 v27, v14

    .line 31
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v15, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_2a

    :cond_0
    move/from16 v27, v14

    .line 32
    :goto_1
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 33
    invoke-virtual {v2, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1

    .line 34
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move/from16 v15, v26

    move/from16 v14, v27

    goto :goto_0

    :cond_2
    move/from16 v27, v14

    move/from16 v26, v15

    const/4 v14, -0x1

    .line 35
    invoke-interface {v4, v14}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 36
    invoke-direct {v1, v3}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkTagAsjavaLangString(Ljava/util/HashMap;)V

    .line 37
    invoke-direct {v1, v2}, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__fetchRelationshipWorkProgressAsandroidxWorkData(Ljava/util/HashMap;)V

    .line 38
    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v14

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    :goto_2
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v14

    if-eqz v14, :cond_1e

    const/4 v14, -0x1

    if-ne v0, v14, :cond_3

    const/16 v30, 0x0

    goto :goto_3

    .line 40
    :cond_3
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v30, v28

    :goto_3
    if-ne v5, v14, :cond_4

    const/16 v31, 0x0

    goto :goto_4

    .line 41
    :cond_4
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v28

    .line 42
    invoke-static/range {v28 .. v28}, Landroidx/work/impl/model/WorkTypeConverters;->intToState(I)Landroidx/work/WorkInfo$State;

    move-result-object v28

    move-object/from16 v31, v28

    :goto_4
    if-ne v6, v14, :cond_5

    const/16 v32, 0x0

    goto :goto_5

    .line 43
    :cond_5
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v28

    .line 44
    invoke-static/range {v28 .. v28}, Landroidx/work/Data;->fromByteArray([B)Landroidx/work/Data;

    move-result-object v28

    move-object/from16 v32, v28

    :goto_5
    const-wide/16 v28, 0x0

    if-ne v7, v14, :cond_6

    move-wide/from16 v33, v28

    goto :goto_6

    .line 45
    :cond_6
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v33

    :goto_6
    if-ne v8, v14, :cond_7

    move-wide/from16 v35, v28

    goto :goto_7

    .line 46
    :cond_7
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v35

    :goto_7
    if-ne v9, v14, :cond_8

    move-wide/from16 v37, v28

    goto :goto_8

    .line 47
    :cond_8
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v37

    :goto_8
    const/16 v39, 0x0

    if-ne v10, v14, :cond_9

    move/from16 v40, v39

    goto :goto_9

    .line 48
    :cond_9
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v40

    :goto_9
    if-ne v11, v14, :cond_a

    const/16 v41, 0x0

    goto :goto_a

    .line 49
    :cond_a
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    .line 50
    invoke-static/range {v41 .. v41}, Landroidx/work/impl/model/WorkTypeConverters;->intToBackoffPolicy(I)Landroidx/work/BackoffPolicy;

    move-result-object v41

    :goto_a
    if-ne v12, v14, :cond_b

    move-wide/from16 v42, v28

    goto :goto_b

    .line 51
    :cond_b
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v42

    :goto_b
    if-ne v13, v14, :cond_c

    move-wide/from16 v44, v28

    :goto_c
    move/from16 v1, v27

    goto :goto_d

    .line 52
    :cond_c
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v44

    goto :goto_c

    :goto_d
    if-ne v1, v14, :cond_d

    move/from16 v46, v39

    :goto_e
    move/from16 v27, v1

    move/from16 v1, v26

    goto :goto_f

    .line 53
    :cond_d
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v27

    move/from16 v46, v27

    goto :goto_e

    :goto_f
    if-ne v1, v14, :cond_e

    move/from16 v47, v39

    :goto_10
    move/from16 v26, v1

    move/from16 v1, v25

    goto :goto_11

    .line 54
    :cond_e
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    move/from16 v47, v26

    goto :goto_10

    :goto_11
    if-ne v1, v14, :cond_f

    move-wide/from16 v48, v28

    :goto_12
    move/from16 v25, v1

    move/from16 v1, p1

    goto :goto_13

    .line 55
    :cond_f
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v48

    goto :goto_12

    :goto_13
    if-ne v1, v14, :cond_10

    move/from16 v50, v39

    :goto_14
    move/from16 p1, v1

    move/from16 v1, v16

    goto :goto_15

    .line 56
    :cond_10
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v50

    goto :goto_14

    :goto_15
    if-ne v1, v14, :cond_11

    const/16 v53, 0x0

    :goto_16
    move/from16 v16, v1

    move/from16 v1, v17

    goto :goto_17

    .line 57
    :cond_11
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 58
    invoke-static/range {v16 .. v16}, Landroidx/work/impl/model/WorkTypeConverters;->intToNetworkType(I)Landroidx/work/NetworkType;

    move-result-object v16

    move-object/from16 v53, v16

    goto :goto_16

    :goto_17
    if-ne v1, v14, :cond_12

    const/16 v52, 0x0

    :goto_18
    move/from16 v17, v1

    move/from16 v1, v18

    goto :goto_19

    .line 59
    :cond_12
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v17

    .line 60
    invoke-static/range {v17 .. v17}, Landroidx/work/impl/model/WorkTypeConverters;->toNetworkRequest$work_runtime_release([B)Landroidx/work/impl/utils/NetworkRequestCompat;

    move-result-object v17

    move-object/from16 v52, v17

    goto :goto_18

    :goto_19
    if-ne v1, v14, :cond_13

    move/from16 v54, v39

    :goto_1a
    move/from16 v18, v1

    move/from16 v1, v19

    goto :goto_1c

    .line 61
    :cond_13
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    if-eqz v18, :cond_14

    const/16 v18, 0x1

    goto :goto_1b

    :cond_14
    move/from16 v18, v39

    :goto_1b
    move/from16 v54, v18

    goto :goto_1a

    :goto_1c
    if-ne v1, v14, :cond_15

    move/from16 v55, v39

    :goto_1d
    move/from16 v19, v1

    move/from16 v1, v20

    goto :goto_1f

    .line 62
    :cond_15
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v19

    if-eqz v19, :cond_16

    const/16 v19, 0x1

    goto :goto_1e

    :cond_16
    move/from16 v19, v39

    :goto_1e
    move/from16 v55, v19

    goto :goto_1d

    :goto_1f
    if-ne v1, v14, :cond_17

    move/from16 v56, v39

    :goto_20
    move/from16 v20, v1

    move/from16 v1, v21

    goto :goto_22

    .line 63
    :cond_17
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v20

    if-eqz v20, :cond_18

    const/16 v20, 0x1

    goto :goto_21

    :cond_18
    move/from16 v20, v39

    :goto_21
    move/from16 v56, v20

    goto :goto_20

    :goto_22
    if-ne v1, v14, :cond_1a

    :cond_19
    :goto_23
    move/from16 v21, v1

    move/from16 v1, v22

    move/from16 v57, v39

    goto :goto_24

    .line 64
    :cond_1a
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    if-eqz v21, :cond_19

    const/16 v39, 0x1

    goto :goto_23

    :goto_24
    if-ne v1, v14, :cond_1b

    move-wide/from16 v58, v28

    :goto_25
    move/from16 v22, v1

    move/from16 v1, v23

    goto :goto_26

    .line 65
    :cond_1b
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v58

    goto :goto_25

    :goto_26
    if-ne v1, v14, :cond_1c

    :goto_27
    move/from16 v23, v1

    move/from16 v1, v24

    move-wide/from16 v60, v28

    goto :goto_28

    .line 66
    :cond_1c
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v28

    goto :goto_27

    :goto_28
    if-ne v1, v14, :cond_1d

    const/16 v62, 0x0

    goto :goto_29

    .line 67
    :cond_1d
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v24

    .line 68
    invoke-static/range {v24 .. v24}, Landroidx/work/impl/model/WorkTypeConverters;->byteArrayToSetOfTriggers([B)Ljava/util/Set;

    move-result-object v24

    move-object/from16 v62, v24

    .line 69
    :goto_29
    new-instance v51, Landroidx/work/Constraints;

    invoke-direct/range {v51 .. v62}, Landroidx/work/Constraints;-><init>(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V

    .line 70
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 71
    invoke-virtual {v3, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/ArrayList;

    move/from16 v24, v1

    .line 72
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v52, v1

    check-cast v52, Ljava/util/ArrayList;

    .line 74
    new-instance v29, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;

    move-object/from16 v39, v51

    move-object/from16 v51, v14

    invoke-direct/range {v29 .. v52}, Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;-><init>(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V

    move-object/from16 v1, v29

    .line 75
    invoke-interface {v15, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p0

    goto/16 :goto_2

    .line 76
    :cond_1e
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-object v15

    :goto_2a
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 77
    throw v0
.end method

.method public getWorkInfoPojosFlow(Landroidx/sqlite/db/SupportSQLiteQuery;)Lvd/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/sqlite/db/SupportSQLiteQuery;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    const-string v1, "WorkProgress"

    .line 4
    .line 5
    const-string v2, "WorkSpec"

    .line 6
    .line 7
    const-string v3, "WorkTag"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Landroidx/work/impl/model/RawWorkInfoDao_Impl$2;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl$2;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Landroidx/sqlite/db/SupportSQLiteQuery;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {v0, p1, v1, v2}, Landroidx/room/CoroutinesRoom;->createFlow(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lvd/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public getWorkInfoPojosLiveData(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/lifecycle/LiveData;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/sqlite/db/SupportSQLiteQuery;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/RawWorkInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "WorkProgress"

    .line 8
    .line 9
    const-string v2, "WorkSpec"

    .line 10
    .line 11
    const-string v3, "WorkTag"

    .line 12
    .line 13
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Landroidx/work/impl/model/RawWorkInfoDao_Impl$1;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, Landroidx/work/impl/model/RawWorkInfoDao_Impl$1;-><init>(Landroidx/work/impl/model/RawWorkInfoDao_Impl;Landroidx/sqlite/db/SupportSQLiteQuery;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/InvalidationTracker;->createLiveData([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method
