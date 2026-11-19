.class public Lcom/tendcloud/tenddata/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/ap;
.implements Ljava/nio/channels/ByteChannel;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation


# static fields
.field protected static a:Ljava/nio/ByteBuffer; = null

.field static final synthetic m:Z = true


# instance fields
.field protected b:Ljava/util/concurrent/ExecutorService;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "*>;>;"
        }
    .end annotation
.end field

.field protected d:Ljava/nio/ByteBuffer;

.field protected e:Ljava/nio/ByteBuffer;

.field protected f:Ljava/nio/ByteBuffer;

.field protected g:Ljava/nio/channels/SocketChannel;

.field protected h:Ljava/nio/channels/SelectionKey;

.field protected i:Ljavax/net/ssl/SSLEngine;

.field protected j:Ljavax/net/ssl/SSLEngineResult;

.field protected k:Ljavax/net/ssl/SSLEngineResult;

.field protected l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/ah;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/nio/channels/SocketChannel;Ljavax/net/ssl/SSLEngine;Ljava/util/concurrent/ExecutorService;Ljava/nio/channels/SelectionKey;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tendcloud/tenddata/ah;->l:I

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/tendcloud/tenddata/ah;->b:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    new-instance p1, Ljavax/net/ssl/SSLEngineResult;

    .line 20
    .line 21
    sget-object p3, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p1, p3, v1, v0, v0}, Ljavax/net/ssl/SSLEngineResult;-><init>(Ljavax/net/ssl/SSLEngineResult$Status;Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;II)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->k:Ljavax/net/ssl/SSLEngineResult;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 p3, 0x3

    .line 37
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->c:Ljava/util/List;

    .line 41
    .line 42
    if-eqz p4, :cond_0

    .line 43
    .line 44
    invoke-virtual {p4}, Ljava/nio/channels/SelectionKey;->interestOps()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    or-int/lit8 p1, p1, 0x4

    .line 49
    .line 50
    invoke-virtual {p4, p1}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 51
    .line 52
    .line 53
    iput-object p4, p0, Lcom/tendcloud/tenddata/ah;->h:Ljava/nio/channels/SelectionKey;

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljavax/net/ssl/SSLSession;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 63
    .line 64
    sget-object p2, Lcom/tendcloud/tenddata/ah;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-direct {p0, p2}, Lcom/tendcloud/tenddata/ah;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->j()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string p2, "parameter must not be null"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method private a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    .line 28
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0

    .line 31
    :cond_1
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return v0
.end method

.method private a(Ljava/util/concurrent/Future;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    .line 2
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    return-void

    .line 3
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private declared-synchronized b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, v1}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->k:Ljavax/net/ssl/SSLEngineResult;

    .line 3
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 4
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private c(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->k()Ljava/nio/ByteBuffer;

    .line 7
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p1

    if-lez p1, :cond_2

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private declared-synchronized j()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->c:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/concurrent/Future;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/util/concurrent/Future;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_2
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_UNWRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 71
    .line 72
    if-ne v0, v1, :cond_7

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->d()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 87
    .line 88
    if-ne v0, v1, :cond_5

    .line 89
    .line 90
    :cond_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 96
    .line 97
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v1, -0x1

    .line 104
    if-eq v0, v1, :cond_6

    .line 105
    .line 106
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->k()Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 126
    .line 127
    if-ne v0, v1, :cond_7

    .line 128
    .line 129
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ah;->a(Ljavax/net/ssl/SSLSession;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    .line 138
    monitor-exit p0

    .line 139
    return-void

    .line 140
    :cond_6
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 141
    .line 142
    const-string v1, "connection closed unexpectedly by peer"

    .line 143
    .line 144
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_7
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->e()V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->c:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_8

    .line 158
    .line 159
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_WRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 166
    .line 167
    if-ne v0, v1, :cond_9

    .line 168
    .line 169
    :cond_8
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 170
    .line 171
    sget-object v1, Lcom/tendcloud/tenddata/ah;->a:Ljava/nio/ByteBuffer;

    .line 172
    .line 173
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/ah;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->k:Ljavax/net/ssl/SSLEngineResult;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 187
    .line 188
    if-ne v0, v1, :cond_9

    .line 189
    .line 190
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ah;->a(Ljavax/net/ssl/SSLSession;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 197
    .line 198
    .line 199
    monitor-exit p0

    .line 200
    return-void

    .line 201
    :cond_9
    :try_start_4
    sget-boolean v0, Lcom/tendcloud/tenddata/ah;->m:Z

    .line 202
    .line 203
    if-nez v0, :cond_b

    .line 204
    .line 205
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 212
    .line 213
    if-eq v0, v1, :cond_a

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_b
    :goto_1
    const/4 v0, 0x1

    .line 223
    iput v0, p0, Lcom/tendcloud/tenddata/ah;->l:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 224
    .line 225
    monitor-exit p0

    .line 226
    return-void

    .line 227
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 228
    throw v0
.end method

.method private declared-synchronized k()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Ljavax/net/ssl/SSLEngine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Ljavax/net/ssl/SSLEngineResult$Status;->OK:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_UNWRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 43
    .line 44
    if-eq v0, v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object v0

    .line 58
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw v0
.end method

.method private l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)I
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ah;->c(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public a(Z)Ljava/nio/channels/SelectableChannel;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0, p1}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljavax/net/ssl/SSLSession;)V
    .locals 2

    .line 4
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getApplicationBufferSize()I

    move-result v0

    .line 5
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    move-result p1

    .line 6
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_0

    .line 7
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 8
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    if-eq v1, v0, :cond_1

    .line 11
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-eq v0, p1, :cond_2

    .line 13
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-eq v0, p1, :cond_3

    .line 15
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 16
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 17
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 18
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 19
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 20
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 21
    iget-object p1, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 22
    iget p1, p0, Lcom/tendcloud/tenddata/ah;->l:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tendcloud/tenddata/ah;->l:I

    return-void
.end method

.method public a()Z
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->l()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/net/SocketAddress;)Z
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0, p1}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    move-result p1

    return p1
.end method

.method public b()V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ah;->write(Ljava/nio/ByteBuffer;)I

    return-void
.end method

.method public c()Z
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->CLOSED:Ljavax/net/ssl/SSLEngineResult$Status;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->closeOutbound()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljavax/net/ssl/SSLSession;->invalidate()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 24
    .line 25
    sget-object v1, Lcom/tendcloud/tenddata/ah;->a:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/ah;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->b:Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getDelegatedTask()Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->c:Ljava/util/List;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tendcloud/tenddata/ah;->b:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->isInboundDone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :goto_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->l()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->j()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->j()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->l()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    iget v0, p0, Lcom/tendcloud/tenddata/ah;->l:I

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    if-gt v0, v1, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ah;->a(Ljavax/net/ssl/SSLSession;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ah;->c(Ljava/nio/ByteBuffer;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    return v0

    .line 62
    :cond_4
    sget-boolean v0, Lcom/tendcloud/tenddata/ah;->m:Z

    .line 63
    .line 64
    if-nez v0, :cond_6

    .line 65
    .line 66
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_7

    .line 93
    .line 94
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->d()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->j:Ljavax/net/ssl/SSLEngineResult;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 118
    .line 119
    if-ne v0, v1, :cond_9

    .line 120
    .line 121
    :cond_8
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v1, -0x1

    .line 130
    if-ne v0, v1, :cond_9

    .line 131
    .line 132
    return v1

    .line 133
    :cond_9
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->f:Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 136
    .line 137
    .line 138
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->k()Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->d:Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_a

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ah;->d()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_a

    .line 154
    .line 155
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/ah;->read(Ljava/nio/ByteBuffer;)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    return p1

    .line 160
    :cond_a
    return v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ah;->j()V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    iget v0, p0, Lcom/tendcloud/tenddata/ah;->l:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->i:Ljavax/net/ssl/SSLEngine;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ah;->a(Ljavax/net/ssl/SSLSession;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ah;->g:Ljava/nio/channels/SocketChannel;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ah;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method
