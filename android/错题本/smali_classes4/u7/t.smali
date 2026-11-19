.class public final Lu7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# instance fields
.field public final a:Z

.field public final b:Lokio/Buffer;

.field public c:Z

.field public final synthetic d:Lu7/w;


# direct methods
.method public constructor <init>(Lu7/w;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu7/t;->d:Lu7/w;

    .line 5
    .line 6
    iput-boolean p2, p0, Lu7/t;->a:Z

    .line 7
    .line 8
    new-instance p1, Lokio/Buffer;

    .line 9
    .line 10
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lu7/t;->b:Lokio/Buffer;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 12

    .line 1
    iget-object v1, p0, Lu7/t;->d:Lu7/w;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, v1, Lu7/w;->l:Lu7/v;

    .line 5
    .line 6
    invoke-virtual {v0}, Lokio/AsyncTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    .line 8
    .line 9
    :goto_0
    :try_start_1
    iget-wide v2, v1, Lu7/w;->e:J

    .line 10
    .line 11
    iget-wide v4, v1, Lu7/w;->f:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Lu7/t;->a:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lu7/t;->c:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :try_start_2
    iget-object v0, v1, Lu7/w;->m:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 51
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_3

    .line 55
    :cond_0
    :try_start_8
    iget-object v0, v1, Lu7/w;->l:Lu7/v;

    .line 56
    .line 57
    invoke-virtual {v0}, Lu7/v;->a()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lu7/w;->b()V

    .line 61
    .line 62
    .line 63
    iget-wide v2, v1, Lu7/w;->f:J

    .line 64
    .line 65
    iget-wide v4, v1, Lu7/w;->e:J

    .line 66
    .line 67
    sub-long/2addr v2, v4

    .line 68
    iget-object v0, p0, Lu7/t;->b:Lokio/Buffer;

    .line 69
    .line 70
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    iget-wide v2, v1, Lu7/w;->e:J

    .line 79
    .line 80
    add-long/2addr v2, v10

    .line 81
    iput-wide v2, v1, Lu7/w;->e:J

    .line 82
    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    iget-object p1, p0, Lu7/t;->b:Lokio/Buffer;

    .line 86
    .line 87
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 91
    cmp-long p1, v10, v2

    .line 92
    .line 93
    if-nez p1, :cond_1

    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    :goto_1
    move v8, p1

    .line 97
    goto :goto_2

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    move-object p1, v0

    .line 100
    goto :goto_4

    .line 101
    :cond_1
    const/4 p1, 0x0

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    monitor-exit v1

    .line 104
    iget-object p1, p0, Lu7/t;->d:Lu7/w;

    .line 105
    .line 106
    iget-object p1, p1, Lu7/w;->l:Lu7/v;

    .line 107
    .line 108
    invoke-virtual {p1}, Lokio/AsyncTimeout;->enter()V

    .line 109
    .line 110
    .line 111
    :try_start_9
    iget-object p1, p0, Lu7/t;->d:Lu7/w;

    .line 112
    .line 113
    iget-object v6, p1, Lu7/w;->b:Lu7/o;

    .line 114
    .line 115
    iget v7, p1, Lu7/w;->a:I

    .line 116
    .line 117
    iget-object v9, p0, Lu7/t;->b:Lokio/Buffer;

    .line 118
    .line 119
    invoke-virtual/range {v6 .. v11}, Lu7/o;->g(IZLokio/Buffer;J)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lu7/t;->d:Lu7/w;

    .line 123
    .line 124
    iget-object p1, p1, Lu7/w;->l:Lu7/v;

    .line 125
    .line 126
    invoke-virtual {p1}, Lu7/v;->a()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_3
    move-exception v0

    .line 131
    move-object p1, v0

    .line 132
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 133
    .line 134
    iget-object v0, v0, Lu7/w;->l:Lu7/v;

    .line 135
    .line 136
    invoke-virtual {v0}, Lu7/v;->a()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :goto_3
    :try_start_a
    iget-object v0, v1, Lu7/w;->l:Lu7/v;

    .line 141
    .line 142
    invoke-virtual {v0}, Lu7/v;->a()V

    .line 143
    .line 144
    .line 145
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 146
    :goto_4
    monitor-exit v1

    .line 147
    throw p1
.end method

.method public final close()V
    .locals 9

    .line 1
    iget-object v1, p0, Lu7/t;->d:Lu7/w;

    .line 2
    .line 3
    sget-object v0, Lp7/c;->a:[B

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v0, p0, Lu7/t;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 13
    :try_start_2
    iget-object v0, v1, Lu7/w;->m:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 14
    .line 15
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    monitor-exit v1

    .line 23
    iget-object v1, p0, Lu7/t;->d:Lu7/w;

    .line 24
    .line 25
    iget-object v1, v1, Lu7/w;->j:Lu7/t;

    .line 26
    .line 27
    iget-boolean v1, v1, Lu7/t;->a:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    iget-object v1, p0, Lu7/t;->b:Lokio/Buffer;

    .line 32
    .line 33
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    cmp-long v1, v3, v5

    .line 40
    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    :goto_1
    iget-object v0, p0, Lu7/t;->b:Lokio/Buffer;

    .line 44
    .line 45
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    cmp-long v0, v0, v5

    .line 50
    .line 51
    if-lez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v2}, Lu7/t;->a(Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 60
    .line 61
    iget-object v3, v0, Lu7/w;->b:Lu7/o;

    .line 62
    .line 63
    iget v4, v0, Lu7/w;->a:I

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-virtual/range {v3 .. v8}, Lu7/o;->g(IZLokio/Buffer;J)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v1, p0, Lu7/t;->d:Lu7/w;

    .line 73
    .line 74
    monitor-enter v1

    .line 75
    :try_start_4
    iput-boolean v2, p0, Lu7/t;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 76
    .line 77
    monitor-exit v1

    .line 78
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 79
    .line 80
    iget-object v0, v0, Lu7/w;->b:Lu7/o;

    .line 81
    .line 82
    iget-object v0, v0, Lu7/o;->w:Lu7/x;

    .line 83
    .line 84
    invoke-virtual {v0}, Lu7/x;->flush()V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 88
    .line 89
    invoke-virtual {v0}, Lu7/w;->a()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    monitor-exit v1

    .line 95
    throw v0

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 98
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 99
    :catchall_2
    move-exception v0

    .line 100
    monitor-exit v1

    .line 101
    throw v0
.end method

.method public final flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 2
    .line 3
    sget-object v1, Lp7/c;->a:[B

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lu7/w;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    :goto_0
    iget-object v0, p0, Lu7/t;->b:Lokio/Buffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0}, Lu7/t;->a(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 27
    .line 28
    iget-object v0, v0, Lu7/w;->b:Lu7/o;

    .line 29
    .line 30
    iget-object v0, v0, Lu7/o;->w:Lu7/x;

    .line 31
    .line 32
    invoke-virtual {v0}, Lu7/x;->flush()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0

    .line 39
    throw v1
.end method

.method public final timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/t;->d:Lu7/w;

    .line 2
    .line 3
    iget-object v0, v0, Lu7/w;->l:Lu7/v;

    .line 4
    .line 5
    return-object v0
.end method

.method public final write(Lokio/Buffer;J)V
    .locals 3

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lp7/c;->a:[B

    .line 7
    .line 8
    iget-object v0, p0, Lu7/t;->b:Lokio/Buffer;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    const-wide/16 v1, 0x4000

    .line 18
    .line 19
    cmp-long p1, p1, v1

    .line 20
    .line 21
    if-ltz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1}, Lu7/t;->a(Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method
