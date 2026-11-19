.class public final Lokhttp3/internal/connection/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lokhttp3/internal/connection/i;

.field public final b:Lokhttp3/internal/connection/e;

.field public final c:Ls7/c;

.field public d:Z

.field public e:Z

.field public final f:Lokhttp3/internal/connection/k;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/i;Lokhttp3/internal/connection/e;Ls7/c;)V
    .locals 1

    .line 1
    const-string v0, "finder"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/connection/d;->a:Lokhttp3/internal/connection/i;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/connection/d;->b:Lokhttp3/internal/connection/e;

    .line 12
    .line 13
    iput-object p3, p0, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 14
    .line 15
    invoke-interface {p3}, Ls7/c;->c()Lokhttp3/internal/connection/k;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lokhttp3/internal/connection/d;->f:Lokhttp3/internal/connection/k;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/connection/d;->a:Lokhttp3/internal/connection/i;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p2, p1, p3}, Lokhttp3/internal/connection/i;->k(Lokhttp3/internal/connection/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final b(Lokhttp3/c0;Z)Lokhttp3/internal/connection/b;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lokhttp3/internal/connection/d;->d:Z

    .line 7
    .line 8
    iget-object p2, p1, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 9
    .line 10
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lokhttp3/g0;->contentLength()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-object p2, p0, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 18
    .line 19
    invoke-interface {p2, p1, v0, v1}, Ls7/c;->e(Lokhttp3/c0;J)Lokio/Sink;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, Lokhttp3/internal/connection/b;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1, v0, v1}, Lokhttp3/internal/connection/b;-><init>(Lokhttp3/internal/connection/d;Lokio/Sink;J)V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method

.method public final c(Z)Lokhttp3/h0;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ls7/c;->g(Z)Lokhttp3/h0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object p0, p1, Lokhttp3/h0;->m:Lokhttp3/internal/connection/d;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Lokhttp3/internal/connection/d;->d(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public final d(Ljava/io/IOException;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/internal/connection/d;->e:Z

    .line 3
    .line 4
    iget-object v1, p0, Lokhttp3/internal/connection/d;->b:Lokhttp3/internal/connection/e;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lokhttp3/internal/connection/e;->c(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 10
    .line 11
    invoke-interface {v1}, Ls7/c;->c()Lokhttp3/internal/connection/k;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lokhttp3/internal/connection/d;->a:Lokhttp3/internal/connection/i;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    instance-of v3, p1, Lokhttp3/internal/http2/StreamResetException;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    check-cast v3, Lokhttp3/internal/http2/StreamResetException;

    .line 24
    .line 25
    iget-object v3, v3, Lokhttp3/internal/http2/StreamResetException;->errorCode:Lokhttp3/internal/http2/ErrorCode;

    .line 26
    .line 27
    sget-object v4, Lokhttp3/internal/http2/ErrorCode;->REFUSED_STREAM:Lokhttp3/internal/http2/ErrorCode;

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    iget p1, v1, Lokhttp3/internal/connection/k;->n:I

    .line 32
    .line 33
    add-int/2addr p1, v0

    .line 34
    iput p1, v1, Lokhttp3/internal/connection/k;->n:I

    .line 35
    .line 36
    if-le p1, v0, :cond_5

    .line 37
    .line 38
    iput-boolean v0, v1, Lokhttp3/internal/connection/k;->j:Z

    .line 39
    .line 40
    iget p1, v1, Lokhttp3/internal/connection/k;->l:I

    .line 41
    .line 42
    add-int/2addr p1, v0

    .line 43
    iput p1, v1, Lokhttp3/internal/connection/k;->l:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    check-cast p1, Lokhttp3/internal/http2/StreamResetException;

    .line 49
    .line 50
    iget-object p1, p1, Lokhttp3/internal/http2/StreamResetException;->errorCode:Lokhttp3/internal/http2/ErrorCode;

    .line 51
    .line 52
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;

    .line 53
    .line 54
    if-ne p1, v3, :cond_1

    .line 55
    .line 56
    iget-boolean p1, v2, Lokhttp3/internal/connection/i;->n:Z

    .line 57
    .line 58
    if-nez p1, :cond_5

    .line 59
    .line 60
    :cond_1
    iput-boolean v0, v1, Lokhttp3/internal/connection/k;->j:Z

    .line 61
    .line 62
    iget p1, v1, Lokhttp3/internal/connection/k;->l:I

    .line 63
    .line 64
    add-int/2addr p1, v0

    .line 65
    iput p1, v1, Lokhttp3/internal/connection/k;->l:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v3, v1, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    move v3, v0

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v3, 0x0

    .line 75
    :goto_0
    if-eqz v3, :cond_4

    .line 76
    .line 77
    instance-of v3, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    :cond_4
    iput-boolean v0, v1, Lokhttp3/internal/connection/k;->j:Z

    .line 82
    .line 83
    iget v3, v1, Lokhttp3/internal/connection/k;->m:I

    .line 84
    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    iget-object v2, v2, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 88
    .line 89
    iget-object v3, v1, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 90
    .line 91
    invoke-static {v2, v3, p1}, Lokhttp3/internal/connection/k;->d(Lokhttp3/z;Lokhttp3/n0;Ljava/io/IOException;)V

    .line 92
    .line 93
    .line 94
    iget p1, v1, Lokhttp3/internal/connection/k;->l:I

    .line 95
    .line 96
    add-int/2addr p1, v0

    .line 97
    iput p1, v1, Lokhttp3/internal/connection/k;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    :cond_5
    :goto_1
    monitor-exit v1

    .line 100
    return-void

    .line 101
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    throw p1
.end method
