.class public abstract Ld7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Ljava/lang/String;


# instance fields
.field public a:Ljava/util/concurrent/locks/Lock;

.field public b:Landroid/database/sqlite/SQLiteOpenHelper;

.field public c:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Ld7/a;->d:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, Ld7/c;->g:Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    iput-object v0, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 17
    .line 18
    iput-object p1, p0, Ld7/a;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 19
    .line 20
    invoke-virtual {p0}, Ld7/a;->d()Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/database/Cursor;->isClosed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public abstract b(Ljava/lang/Object;)Landroid/content/ContentValues;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public d()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/a;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public abstract e(Landroid/database/Cursor;)Ljava/lang/Object;
.end method

.method public f([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, " query"

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    iget-object v0, v1, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    :try_start_0
    iget-object v0, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 23
    .line 24
    .line 25
    iget-object v7, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 26
    .line 27
    invoke-virtual {v1}, Ld7/a;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    move-object/from16 v9, p1

    .line 32
    .line 33
    move-object/from16 v10, p2

    .line 34
    .line 35
    move-object/from16 v11, p3

    .line 36
    .line 37
    move-object/from16 v12, p4

    .line 38
    .line 39
    move-object/from16 v13, p5

    .line 40
    .line 41
    move-object/from16 v14, p6

    .line 42
    .line 43
    move-object/from16 v15, p7

    .line 44
    .line 45
    invoke-virtual/range {v7 .. v15}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 46
    .line 47
    .line 48
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    :goto_0
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->isClosed()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {v1, v7}, Ld7/a;->e(Landroid/database/Cursor;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_3

    .line 71
    :catch_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    iget-object v0, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v6, v7}, Ld7/a;->a(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 84
    .line 85
    .line 86
    iget-object v0, v1, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 89
    .line 90
    .line 91
    sget-object v0, Ld7/a;->d:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v6, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    sub-long/2addr v7, v3

    .line 103
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v0, v2}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v5

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    move-object v7, v6

    .line 119
    goto :goto_3

    .line 120
    :catch_1
    move-exception v0

    .line 121
    move-object v7, v6

    .line 122
    :goto_2
    :try_start_2
    invoke-static {v0}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v6, v7}, Ld7/a;->a(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 131
    .line 132
    .line 133
    iget-object v0, v1, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 136
    .line 137
    .line 138
    sget-object v0, Ld7/a;->d:Ljava/lang/String;

    .line 139
    .line 140
    new-instance v6, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :goto_3
    invoke-virtual {v1, v6, v7}, Ld7/a;->a(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, v1, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 150
    .line 151
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 152
    .line 153
    .line 154
    iget-object v5, v1, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 157
    .line 158
    .line 159
    sget-object v5, Ld7/a;->d:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v6, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    sub-long/2addr v7, v3

    .line 171
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v5, v2}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
.end method

.method public g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v8, 0x0

    .line 6
    const-string v9, "1"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-virtual/range {v2 .. v9}, Ld7/a;->f([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object p2, Ld7/a;->d:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    sub-long/2addr v3, v0

    .line 30
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " queryOne"

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p2, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-lez p2, :cond_0

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    return-object p1
.end method

.method public h(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const-string v0, " replaceT"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v4, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 12
    .line 13
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v4, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 22
    .line 23
    invoke-virtual {p0}, Ld7/a;->c()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {p0, p1}, Ld7/a;->b(Ljava/lang/Object;)Landroid/content/ContentValues;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v4, v5, v6, p1}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 48
    .line 49
    .line 50
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    sub-long/2addr v4, v2

    .line 62
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception p1

    .line 80
    :try_start_1
    invoke-static {p1}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 91
    .line 92
    .line 93
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 94
    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    sub-long/2addr v5, v2

    .line 105
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {p1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return v1

    .line 119
    :goto_0
    iget-object v1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 127
    .line 128
    .line 129
    sget-object v1, Ld7/a;->d:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    sub-long/2addr v5, v2

    .line 141
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1
.end method

.method public i(Ljava/util/List;)Z
    .locals 8

    .line 1
    const-string v0, " replaceList"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v4, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 12
    .line 13
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v4, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    invoke-virtual {p0}, Ld7/a;->c()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {p0, v4}, Ld7/a;->b(Ljava/lang/Object;)Landroid/content/ContentValues;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v7, 0x0

    .line 46
    invoke-virtual {v5, v6, v7, v4}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 67
    .line 68
    .line 69
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    sub-long/2addr v4, v2

    .line 81
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x1

    .line 95
    return p1

    .line 96
    :goto_1
    :try_start_1
    invoke-static {p1}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 107
    .line 108
    .line 109
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v4, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    sub-long/2addr v5, v2

    .line 121
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :goto_2
    iget-object v1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 141
    .line 142
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 143
    .line 144
    .line 145
    sget-object v1, Ld7/a;->d:Ljava/lang/String;

    .line 146
    .line 147
    new-instance v4, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    sub-long/2addr v5, v2

    .line 157
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v1, v0}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1
.end method

.method public j(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-string v0, " updateContentValues"

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object v3, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 8
    .line 9
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-object v3, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    invoke-virtual {p0}, Ld7/a;->c()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, v4, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 39
    .line 40
    .line 41
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 42
    .line 43
    new-instance p2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    sub-long/2addr v3, v1

    .line 53
    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p1, p2}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    :try_start_1
    invoke-static {p1}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 82
    .line 83
    .line 84
    sget-object p1, Ld7/a;->d:Ljava/lang/String;

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    sub-long/2addr v3, v1

    .line 96
    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p1, p2}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    return p1

    .line 111
    :goto_0
    iget-object p2, p0, Ld7/a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 112
    .line 113
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 114
    .line 115
    .line 116
    iget-object p2, p0, Ld7/a;->a:Ljava/util/concurrent/locks/Lock;

    .line 117
    .line 118
    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 119
    .line 120
    .line 121
    sget-object p2, Ld7/a;->d:Ljava/lang/String;

    .line 122
    .line 123
    new-instance p3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    sub-long/2addr v3, v1

    .line 133
    invoke-virtual {p3, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-static {p2, p3}, Lf7/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1
.end method
