.class public final Lz2/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:Lokio/Buffer;

.field public b:Lr2/s;

.field public c:Z

.field public d:Z

.field public final synthetic e:Lz2/g;


# direct methods
.method public constructor <init>(Lz2/g;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lz2/g$b;->d:Z

    .line 7
    .line 8
    new-instance p1, Lokio/Buffer;

    .line 9
    .line 10
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 5
    .line 6
    invoke-virtual {v1}, Lz2/g;->s()Lz2/g$d;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lokio/AsyncTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 11
    .line 12
    .line 13
    :goto_0
    :try_start_1
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 14
    .line 15
    invoke-virtual {v1}, Lz2/g;->r()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-object v3, p0, Lz2/g$b;->e:Lz2/g;

    .line 20
    .line 21
    invoke-virtual {v3}, Lz2/g;->q()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    iget-boolean v1, p0, Lz2/g$b;->d:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-boolean v1, p0, Lz2/g$b;->c:Z

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 38
    .line 39
    invoke-virtual {v1}, Lz2/g;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 46
    .line 47
    invoke-virtual {v1}, Lz2/g;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    :try_start_2
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 52
    .line 53
    invoke-virtual {v1}, Lz2/g;->s()Lz2/g$d;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Lz2/g$d;->a()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 61
    .line 62
    invoke-virtual {v1}, Lz2/g;->c()V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 66
    .line 67
    invoke-virtual {v1}, Lz2/g;->q()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    iget-object v3, p0, Lz2/g$b;->e:Lz2/g;

    .line 72
    .line 73
    invoke-virtual {v3}, Lz2/g;->r()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    sub-long/2addr v1, v3

    .line 78
    iget-object v3, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 79
    .line 80
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 89
    .line 90
    invoke-virtual {v1}, Lz2/g;->r()J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    add-long/2addr v2, v9

    .line 95
    invoke-virtual {v1, v2, v3}, Lz2/g;->B(J)V

    .line 96
    .line 97
    .line 98
    if-eqz p1, :cond_1

    .line 99
    .line 100
    iget-object p1, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 101
    .line 102
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    cmp-long p1, v9, v1

    .line 107
    .line 108
    if-nez p1, :cond_1

    .line 109
    .line 110
    iget-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 111
    .line 112
    invoke-virtual {p1}, Lz2/g;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-nez p1, :cond_1

    .line 117
    .line 118
    const/4 p1, 0x1

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const/4 p1, 0x0

    .line 121
    :goto_1
    move v7, p1

    .line 122
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 123
    .line 124
    monitor-exit v0

    .line 125
    iget-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 126
    .line 127
    invoke-virtual {p1}, Lz2/g;->s()Lz2/g$d;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lokio/AsyncTimeout;->enter()V

    .line 132
    .line 133
    .line 134
    :try_start_3
    iget-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 135
    .line 136
    invoke-virtual {p1}, Lz2/g;->g()Lz2/d;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 141
    .line 142
    invoke-virtual {p1}, Lz2/g;->j()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-object v8, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 147
    .line 148
    invoke-virtual/range {v5 .. v10}, Lz2/d;->V(IZLokio/Buffer;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lz2/g$b;->e:Lz2/g;

    .line 152
    .line 153
    invoke-virtual {p1}, Lz2/g;->s()Lz2/g$d;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lz2/g$d;->a()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception p1

    .line 162
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 163
    .line 164
    invoke-virtual {v0}, Lz2/g;->s()Lz2/g$d;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lz2/g$d;->a()V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :catchall_1
    move-exception p1

    .line 173
    :try_start_4
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 174
    .line 175
    invoke-virtual {v1}, Lz2/g;->s()Lz2/g$d;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Lz2/g$d;->a()V

    .line 180
    .line 181
    .line 182
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 183
    :catchall_2
    move-exception p1

    .line 184
    monitor-exit v0

    .line 185
    throw p1
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz2/g$b;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz2/g$b;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 10

    .line 1
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 2
    .line 3
    sget-boolean v1, Ls2/b;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-boolean v1, p0, Lz2/g$b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :cond_2
    :try_start_1
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 68
    .line 69
    invoke-virtual {v1}, Lz2/g;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x1

    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    move v1, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move v1, v2

    .line 80
    :goto_1
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    monitor-exit v0

    .line 83
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 84
    .line 85
    invoke-virtual {v0}, Lz2/g;->o()Lz2/g$b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v0, v0, Lz2/g$b;->d:Z

    .line 90
    .line 91
    if-nez v0, :cond_9

    .line 92
    .line 93
    iget-object v0, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 94
    .line 95
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    const-wide/16 v6, 0x0

    .line 100
    .line 101
    cmp-long v0, v4, v6

    .line 102
    .line 103
    if-lez v0, :cond_4

    .line 104
    .line 105
    move v0, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move v0, v2

    .line 108
    :goto_2
    iget-object v4, p0, Lz2/g$b;->b:Lr2/s;

    .line 109
    .line 110
    if-eqz v4, :cond_5

    .line 111
    .line 112
    move v4, v3

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    move v4, v2

    .line 115
    :goto_3
    if-eqz v4, :cond_7

    .line 116
    .line 117
    :goto_4
    iget-object v0, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 118
    .line 119
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    cmp-long v0, v4, v6

    .line 124
    .line 125
    if-lez v0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0, v2}, Lz2/g$b;->a(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 132
    .line 133
    invoke-virtual {v0}, Lz2/g;->g()Lz2/d;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v2, p0, Lz2/g$b;->e:Lz2/g;

    .line 138
    .line 139
    invoke-virtual {v2}, Lz2/g;->j()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    iget-object v4, p0, Lz2/g$b;->b:Lr2/s;

    .line 144
    .line 145
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v4}, Ls2/b;->J(Lr2/s;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v0, v2, v1, v4}, Lz2/d;->W(IZLjava/util/List;)V

    .line 153
    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_7
    if-eqz v0, :cond_8

    .line 157
    .line 158
    :goto_5
    iget-object v0, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 159
    .line 160
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    cmp-long v0, v0, v6

    .line 165
    .line 166
    if-lez v0, :cond_9

    .line 167
    .line 168
    invoke-virtual {p0, v3}, Lz2/g$b;->a(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_8
    if-eqz v1, :cond_9

    .line 173
    .line 174
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 175
    .line 176
    invoke-virtual {v0}, Lz2/g;->g()Lz2/d;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 181
    .line 182
    invoke-virtual {v0}, Lz2/g;->j()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    const/4 v6, 0x1

    .line 187
    const/4 v7, 0x0

    .line 188
    const-wide/16 v8, 0x0

    .line 189
    .line 190
    invoke-virtual/range {v4 .. v9}, Lz2/d;->V(IZLokio/Buffer;J)V

    .line 191
    .line 192
    .line 193
    :cond_9
    :goto_6
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 194
    .line 195
    monitor-enter v0

    .line 196
    :try_start_2
    iput-boolean v3, p0, Lz2/g$b;->c:Z

    .line 197
    .line 198
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    .line 200
    monitor-exit v0

    .line 201
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 202
    .line 203
    invoke-virtual {v0}, Lz2/g;->g()Lz2/d;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Lz2/d;->flush()V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 211
    .line 212
    invoke-virtual {v0}, Lz2/g;->b()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :catchall_0
    move-exception v1

    .line 217
    monitor-exit v0

    .line 218
    throw v1

    .line 219
    :catchall_1
    move-exception v1

    .line 220
    monitor-exit v0

    .line 221
    throw v1
.end method

.method public flush()V
    .locals 5

    .line 1
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 2
    .line 3
    sget-boolean v1, Ls2/b;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v1, p0, Lz2/g$b;->e:Lz2/g;

    .line 62
    .line 63
    invoke-virtual {v1}, Lz2/g;->c()V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit v0

    .line 69
    :goto_1
    iget-object v0, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 70
    .line 71
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    cmp-long v0, v0, v2

    .line 78
    .line 79
    if-lez v0, :cond_2

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, v0}, Lz2/g$b;->a(Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 86
    .line 87
    invoke-virtual {v0}, Lz2/g;->g()Lz2/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lz2/d;->flush()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    return-void

    .line 96
    :catchall_0
    move-exception v1

    .line 97
    monitor-exit v0

    .line 98
    throw v1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz2/g;->s()Lz2/g$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz2/g$b;->e:Lz2/g;

    .line 7
    .line 8
    sget-boolean v1, Ls2/b;->h:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p3, "Thread "

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const-string v1, "Thread.currentThread()"

    .line 36
    .line 37
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p3, " MUST NOT hold lock on "

    .line 48
    .line 49
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    :goto_0
    iget-object v0, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object p1, p0, Lz2/g$b;->a:Lokio/Buffer;

    .line 69
    .line 70
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    const-wide/16 v0, 0x4000

    .line 75
    .line 76
    cmp-long p1, p1, v0

    .line 77
    .line 78
    if-ltz p1, :cond_2

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-virtual {p0, p1}, Lz2/g$b;->a(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    return-void
.end method
