.class public final Lu7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# instance fields
.field public final a:J

.field public b:Z

.field public final c:Lokio/Buffer;

.field public final d:Lokio/Buffer;

.field public e:Z

.field public final synthetic f:Lu7/w;


# direct methods
.method public constructor <init>(Lu7/w;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu7/u;->f:Lu7/w;

    .line 5
    .line 6
    iput-wide p2, p0, Lu7/u;->a:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lu7/u;->b:Z

    .line 9
    .line 10
    new-instance p1, Lokio/Buffer;

    .line 11
    .line 12
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lu7/u;->c:Lokio/Buffer;

    .line 16
    .line 17
    new-instance p1, Lokio/Buffer;

    .line 18
    .line 19
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lu7/u;->d:Lokio/Buffer;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lu7/u;->f:Lu7/w;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lu7/u;->e:Z

    .line 6
    .line 7
    iget-object v1, p0, Lu7/u;->d:Lokio/Buffer;

    .line 8
    .line 9
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object v3, p0, Lu7/u;->d:Lokio/Buffer;

    .line 14
    .line 15
    invoke-virtual {v3}, Lokio/Buffer;->clear()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v0, v1, v3

    .line 25
    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lu7/u;->f:Lu7/w;

    .line 29
    .line 30
    sget-object v3, Lp7/c;->a:[B

    .line 31
    .line 32
    iget-object v0, v0, Lu7/w;->b:Lu7/o;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lu7/o;->f(J)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lu7/u;->f:Lu7/w;

    .line 38
    .line 39
    invoke-virtual {v0}, Lu7/w;->a()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    monitor-exit v0

    .line 45
    throw v1
.end method

.method public final read(Lokio/Buffer;J)J
    .locals 16

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
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_9

    .line 17
    .line 18
    :goto_0
    iget-object v6, v1, Lu7/u;->f:Lu7/w;

    .line 19
    .line 20
    monitor-enter v6

    .line 21
    :try_start_0
    iget-object v7, v6, Lu7/w;->k:Lu7/v;

    .line 22
    .line 23
    invoke-virtual {v7}, Lokio/AsyncTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    .line 25
    .line 26
    :try_start_1
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :try_start_2
    iget-object v7, v6, Lu7/w;->m:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 28
    .line 29
    :try_start_3
    monitor-exit v6

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    iget-boolean v7, v1, Lu7/u;->b:Z

    .line 33
    .line 34
    if-nez v7, :cond_0

    .line 35
    .line 36
    iget-object v7, v6, Lu7/w;->n:Ljava/io/IOException;

    .line 37
    .line 38
    if-nez v7, :cond_1

    .line 39
    .line 40
    new-instance v7, Lokhttp3/internal/http2/StreamResetException;

    .line 41
    .line 42
    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :try_start_4
    iget-object v8, v6, Lu7/w;->m:Lokhttp3/internal/http2/ErrorCode;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 44
    .line 45
    :try_start_5
    monitor-exit v6

    .line 46
    invoke-static {v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v7, v8}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lokhttp3/internal/http2/ErrorCode;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :catchall_1
    move-exception v0

    .line 57
    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 58
    :try_start_7
    throw v0

    .line 59
    :cond_0
    const/4 v7, 0x0

    .line 60
    :cond_1
    :goto_1
    iget-boolean v8, v1, Lu7/u;->e:Z

    .line 61
    .line 62
    if-nez v8, :cond_8

    .line 63
    .line 64
    iget-object v8, v1, Lu7/u;->d:Lokio/Buffer;

    .line 65
    .line 66
    invoke-virtual {v8}, Lokio/Buffer;->size()J

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    cmp-long v8, v8, v4

    .line 71
    .line 72
    const-wide/16 v9, -0x1

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    if-lez v8, :cond_2

    .line 76
    .line 77
    iget-object v8, v1, Lu7/u;->d:Lokio/Buffer;

    .line 78
    .line 79
    invoke-virtual {v8}, Lokio/Buffer;->size()J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v12

    .line 87
    invoke-virtual {v8, v0, v12, v13}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    iget-wide v14, v6, Lu7/w;->c:J

    .line 92
    .line 93
    add-long/2addr v14, v12

    .line 94
    iput-wide v14, v6, Lu7/w;->c:J

    .line 95
    .line 96
    iget-wide v4, v6, Lu7/w;->d:J

    .line 97
    .line 98
    sub-long/2addr v14, v4

    .line 99
    if-nez v7, :cond_4

    .line 100
    .line 101
    iget-object v4, v6, Lu7/w;->b:Lu7/o;

    .line 102
    .line 103
    iget-object v4, v4, Lu7/o;->p:Lu7/b0;

    .line 104
    .line 105
    invoke-virtual {v4}, Lu7/b0;->a()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    div-int/lit8 v4, v4, 0x2

    .line 110
    .line 111
    int-to-long v4, v4

    .line 112
    cmp-long v4, v14, v4

    .line 113
    .line 114
    if-ltz v4, :cond_4

    .line 115
    .line 116
    iget-object v4, v6, Lu7/w;->b:Lu7/o;

    .line 117
    .line 118
    iget v5, v6, Lu7/w;->a:I

    .line 119
    .line 120
    invoke-virtual {v4, v5, v14, v15}, Lu7/o;->k(IJ)V

    .line 121
    .line 122
    .line 123
    iget-wide v4, v6, Lu7/w;->c:J

    .line 124
    .line 125
    iput-wide v4, v6, Lu7/w;->d:J

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    iget-boolean v4, v1, Lu7/u;->b:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 129
    .line 130
    if-nez v4, :cond_3

    .line 131
    .line 132
    if-nez v7, :cond_3

    .line 133
    .line 134
    :try_start_8
    invoke-virtual {v6}, Ljava/lang/Object;->wait()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 135
    .line 136
    .line 137
    const/4 v11, 0x1

    .line 138
    :cond_3
    move-wide v12, v9

    .line 139
    goto :goto_2

    .line 140
    :catch_0
    :try_start_9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 145
    .line 146
    .line 147
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 150
    .line 151
    .line 152
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 153
    :cond_4
    :goto_2
    :try_start_a
    iget-object v4, v6, Lu7/w;->k:Lu7/v;

    .line 154
    .line 155
    invoke-virtual {v4}, Lu7/v;->a()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 156
    .line 157
    .line 158
    monitor-exit v6

    .line 159
    if-eqz v11, :cond_5

    .line 160
    .line 161
    const-wide/16 v4, 0x0

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_5
    cmp-long v0, v12, v9

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    return-wide v12

    .line 170
    :cond_6
    if-nez v7, :cond_7

    .line 171
    .line 172
    return-wide v9

    .line 173
    :cond_7
    throw v7

    .line 174
    :catchall_2
    move-exception v0

    .line 175
    goto :goto_4

    .line 176
    :cond_8
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 177
    .line 178
    const-string v2, "stream closed"

    .line 179
    .line 180
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 184
    :catchall_3
    move-exception v0

    .line 185
    :try_start_c
    monitor-exit v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 186
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 187
    :goto_3
    :try_start_e
    iget-object v2, v6, Lu7/w;->k:Lu7/v;

    .line 188
    .line 189
    invoke-virtual {v2}, Lu7/v;->a()V

    .line 190
    .line 191
    .line 192
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 193
    :goto_4
    monitor-exit v6

    .line 194
    throw v0

    .line 195
    :cond_9
    const-string v0, "byteCount < 0: "

    .line 196
    .line 197
    invoke-static {v2, v3, v0}, Landroidx/collection/a;->n(JLjava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v2
.end method

.method public final timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/u;->f:Lu7/w;

    .line 2
    .line 3
    iget-object v0, v0, Lu7/w;->k:Lu7/v;

    .line 4
    .line 5
    return-object v0
.end method
