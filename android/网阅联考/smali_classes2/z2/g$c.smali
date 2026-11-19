.class public final Lz2/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lokio/Buffer;

.field public final b:Lokio/Buffer;

.field public c:Lr2/s;

.field public d:Z

.field public final e:J

.field public f:Z

.field public final synthetic g:Lz2/g;


# direct methods
.method public constructor <init>(Lz2/g;JZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/g$c;->g:Lz2/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Lz2/g$c;->e:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lz2/g$c;->f:Z

    .line 9
    .line 10
    new-instance p1, Lokio/Buffer;

    .line 11
    .line 12
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lz2/g$c;->a:Lokio/Buffer;

    .line 16
    .line 17
    new-instance p1, Lokio/Buffer;

    .line 18
    .line 19
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz2/g$c;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz2/g$c;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(Lokio/BufferedSource;J)V
    .locals 9

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

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
    const-wide/16 v0, 0x0

    .line 64
    .line 65
    cmp-long v2, p2, v0

    .line 66
    .line 67
    if-lez v2, :cond_a

    .line 68
    .line 69
    iget-object v2, p0, Lz2/g$c;->g:Lz2/g;

    .line 70
    .line 71
    monitor-enter v2

    .line 72
    :try_start_0
    iget-boolean v3, p0, Lz2/g$c;->f:Z

    .line 73
    .line 74
    iget-object v4, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 75
    .line 76
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    add-long/2addr v4, p2

    .line 81
    iget-wide v6, p0, Lz2/g$c;->e:J

    .line 82
    .line 83
    cmp-long v4, v4, v6

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    const/4 v6, 0x0

    .line 87
    if-lez v4, :cond_2

    .line 88
    .line 89
    move v4, v5

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move v4, v6

    .line 92
    :goto_1
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lz2/g$c;->g:Lz2/g;

    .line 101
    .line 102
    sget-object p2, Lokhttp3/internal/http2/ErrorCode;->e:Lokhttp3/internal/http2/ErrorCode;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lz2/g;->f(Lokhttp3/internal/http2/ErrorCode;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    iget-object v2, p0, Lz2/g$c;->a:Lokio/Buffer;

    .line 115
    .line 116
    invoke-interface {p1, v2, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    const-wide/16 v7, -0x1

    .line 121
    .line 122
    cmp-long v4, v2, v7

    .line 123
    .line 124
    if-eqz v4, :cond_9

    .line 125
    .line 126
    sub-long/2addr p2, v2

    .line 127
    iget-object v2, p0, Lz2/g$c;->g:Lz2/g;

    .line 128
    .line 129
    monitor-enter v2

    .line 130
    :try_start_1
    iget-boolean v3, p0, Lz2/g$c;->d:Z

    .line 131
    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    iget-object v3, p0, Lz2/g$c;->a:Lokio/Buffer;

    .line 135
    .line 136
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 137
    .line 138
    .line 139
    move-result-wide v3

    .line 140
    iget-object v5, p0, Lz2/g$c;->a:Lokio/Buffer;

    .line 141
    .line 142
    invoke-virtual {v5}, Lokio/Buffer;->clear()V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    iget-object v3, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 147
    .line 148
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    cmp-long v3, v3, v0

    .line 153
    .line 154
    if-nez v3, :cond_6

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move v5, v6

    .line 158
    :goto_2
    iget-object v3, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 159
    .line 160
    iget-object v4, p0, Lz2/g$c;->a:Lokio/Buffer;

    .line 161
    .line 162
    invoke-virtual {v3, v4}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 163
    .line 164
    .line 165
    if-eqz v5, :cond_8

    .line 166
    .line 167
    iget-object v3, p0, Lz2/g$c;->g:Lz2/g;

    .line 168
    .line 169
    if-eqz v3, :cond_7

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 176
    .line 177
    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    :cond_8
    :goto_3
    move-wide v3, v0

    .line 184
    :goto_4
    monitor-exit v2

    .line 185
    cmp-long v0, v3, v0

    .line 186
    .line 187
    if-lez v0, :cond_1

    .line 188
    .line 189
    invoke-virtual {p0, v3, v4}, Lz2/g$c;->f(J)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :catchall_0
    move-exception p1

    .line 195
    monitor-exit v2

    .line 196
    throw p1

    .line 197
    :cond_9
    new-instance p1, Ljava/io/EOFException;

    .line 198
    .line 199
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :catchall_1
    move-exception p1

    .line 204
    monitor-exit v2

    .line 205
    throw p1

    .line 206
    :cond_a
    return-void
.end method

.method public close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lz2/g$c;->d:Z

    .line 6
    .line 7
    iget-object v1, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 8
    .line 9
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object v3, p0, Lz2/g$c;->b:Lokio/Buffer;

    .line 14
    .line 15
    invoke-virtual {v3}, Lokio/Buffer;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lz2/g$c;->g:Lz2/g;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    cmp-long v0, v1, v3

    .line 31
    .line 32
    if-lez v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, v1, v2}, Lz2/g$c;->f(J)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

    .line 38
    .line 39
    invoke-virtual {v0}, Lz2/g;->b()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    monitor-exit v0

    .line 53
    throw v1
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lz2/g$c;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lr2/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/g$c;->c:Lr2/s;

    .line 2
    .line 3
    return-void
.end method

.method public final f(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

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
    new-instance p1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Thread "

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

    .line 59
    .line 60
    invoke-virtual {v0}, Lz2/g;->g()Lz2/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, p1, p2}, Lz2/d;->U(J)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_0

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v6, 0x0

    .line 21
    :goto_0
    if-eqz v6, :cond_a

    .line 22
    .line 23
    :goto_1
    iget-object v6, v1, Lz2/g$c;->g:Lz2/g;

    .line 24
    .line 25
    monitor-enter v6

    .line 26
    :try_start_0
    iget-object v9, v1, Lz2/g$c;->g:Lz2/g;

    .line 27
    .line 28
    invoke-virtual {v9}, Lz2/g;->m()Lz2/g$d;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    invoke-virtual {v9}, Lokio/AsyncTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    .line 35
    :try_start_1
    iget-object v9, v1, Lz2/g$c;->g:Lz2/g;

    .line 36
    .line 37
    invoke-virtual {v9}, Lz2/g;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    iget-object v9, v1, Lz2/g$c;->g:Lz2/g;

    .line 44
    .line 45
    invoke-virtual {v9}, Lz2/g;->i()Ljava/io/IOException;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    if-eqz v9, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance v9, Lokhttp3/internal/http2/StreamResetException;

    .line 53
    .line 54
    iget-object v10, v1, Lz2/g$c;->g:Lz2/g;

    .line 55
    .line 56
    invoke-virtual {v10}, Lz2/g;->h()Lokhttp3/internal/http2/ErrorCode;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v9, v10}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lokhttp3/internal/http2/ErrorCode;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/4 v9, 0x0

    .line 68
    :goto_2
    iget-boolean v10, v1, Lz2/g$c;->d:Z

    .line 69
    .line 70
    if-nez v10, :cond_9

    .line 71
    .line 72
    iget-object v10, v1, Lz2/g$c;->b:Lokio/Buffer;

    .line 73
    .line 74
    invoke-virtual {v10}, Lokio/Buffer;->size()J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    cmp-long v10, v10, v4

    .line 79
    .line 80
    const-wide/16 v11, -0x1

    .line 81
    .line 82
    if-lez v10, :cond_3

    .line 83
    .line 84
    iget-object v10, v1, Lz2/g$c;->b:Lokio/Buffer;

    .line 85
    .line 86
    invoke-virtual {v10}, Lokio/Buffer;->size()J

    .line 87
    .line 88
    .line 89
    move-result-wide v13

    .line 90
    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v13

    .line 94
    invoke-virtual {v10, v0, v13, v14}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v13

    .line 98
    iget-object v10, v1, Lz2/g$c;->g:Lz2/g;

    .line 99
    .line 100
    invoke-virtual {v10}, Lz2/g;->l()J

    .line 101
    .line 102
    .line 103
    move-result-wide v15

    .line 104
    add-long v4, v15, v13

    .line 105
    .line 106
    invoke-virtual {v10, v4, v5}, Lz2/g;->A(J)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v1, Lz2/g$c;->g:Lz2/g;

    .line 110
    .line 111
    invoke-virtual {v4}, Lz2/g;->l()J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    iget-object v10, v1, Lz2/g$c;->g:Lz2/g;

    .line 116
    .line 117
    invoke-virtual {v10}, Lz2/g;->k()J

    .line 118
    .line 119
    .line 120
    move-result-wide v15

    .line 121
    sub-long/2addr v4, v15

    .line 122
    if-nez v9, :cond_5

    .line 123
    .line 124
    iget-object v10, v1, Lz2/g$c;->g:Lz2/g;

    .line 125
    .line 126
    invoke-virtual {v10}, Lz2/g;->g()Lz2/d;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v10}, Lz2/d;->z()Lz2/k;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-virtual {v10}, Lz2/k;->c()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    div-int/lit8 v10, v10, 0x2

    .line 139
    .line 140
    int-to-long v7, v10

    .line 141
    cmp-long v7, v4, v7

    .line 142
    .line 143
    if-ltz v7, :cond_5

    .line 144
    .line 145
    iget-object v7, v1, Lz2/g$c;->g:Lz2/g;

    .line 146
    .line 147
    invoke-virtual {v7}, Lz2/g;->g()Lz2/d;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget-object v8, v1, Lz2/g$c;->g:Lz2/g;

    .line 152
    .line 153
    invoke-virtual {v8}, Lz2/g;->j()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-virtual {v7, v8, v4, v5}, Lz2/d;->a0(IJ)V

    .line 158
    .line 159
    .line 160
    iget-object v4, v1, Lz2/g$c;->g:Lz2/g;

    .line 161
    .line 162
    invoke-virtual {v4}, Lz2/g;->l()J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    invoke-virtual {v4, v7, v8}, Lz2/g;->z(J)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_3
    iget-boolean v4, v1, Lz2/g$c;->f:Z

    .line 171
    .line 172
    if-nez v4, :cond_4

    .line 173
    .line 174
    if-nez v9, :cond_4

    .line 175
    .line 176
    iget-object v4, v1, Lz2/g$c;->g:Lz2/g;

    .line 177
    .line 178
    invoke-virtual {v4}, Lz2/g;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    move-wide v13, v11

    .line 182
    const/4 v4, 0x1

    .line 183
    goto :goto_4

    .line 184
    :cond_4
    move-wide v13, v11

    .line 185
    :cond_5
    :goto_3
    const/4 v4, 0x0

    .line 186
    :goto_4
    :try_start_2
    iget-object v5, v1, Lz2/g$c;->g:Lz2/g;

    .line 187
    .line 188
    invoke-virtual {v5}, Lz2/g;->m()Lz2/g$d;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v5}, Lz2/g$d;->a()V

    .line 193
    .line 194
    .line 195
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 196
    .line 197
    monitor-exit v6

    .line 198
    if-eqz v4, :cond_6

    .line 199
    .line 200
    const-wide/16 v4, 0x0

    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_6
    cmp-long v0, v13, v11

    .line 205
    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    invoke-virtual {v1, v13, v14}, Lz2/g$c;->f(J)V

    .line 209
    .line 210
    .line 211
    return-wide v13

    .line 212
    :cond_7
    if-nez v9, :cond_8

    .line 213
    .line 214
    return-wide v11

    .line 215
    :cond_8
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    throw v9

    .line 219
    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 220
    .line 221
    const-string v2, "stream closed"

    .line 222
    .line 223
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    :try_start_4
    iget-object v2, v1, Lz2/g$c;->g:Lz2/g;

    .line 229
    .line 230
    invoke-virtual {v2}, Lz2/g;->m()Lz2/g$d;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v2}, Lz2/g$d;->a()V

    .line 235
    .line 236
    .line 237
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 238
    :catchall_1
    move-exception v0

    .line 239
    monitor-exit v6

    .line 240
    throw v0

    .line 241
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v4, "byteCount < 0: "

    .line 247
    .line 248
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v2
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/g$c;->g:Lz2/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz2/g;->m()Lz2/g$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
