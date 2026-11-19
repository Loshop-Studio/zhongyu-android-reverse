.class public final Lokhttp3/internal/connection/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/t;


# static fields
.field public static final a:Lokhttp3/internal/connection/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/internal/connection/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokhttp3/internal/connection/a;->a:Lokhttp3/internal/connection/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/s;)Lokhttp3/i0;
    .locals 9

    .line 1
    check-cast p1, Ls7/e;

    .line 2
    .line 3
    iget-object v1, p1, Ls7/e;->a:Lokhttp3/internal/connection/i;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v0, v1, Lokhttp3/internal/connection/i;->m:Z

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, v1, Lokhttp3/internal/connection/i;->l:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean v0, v1, Lokhttp3/internal/connection/i;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    iget-object v2, v1, Lokhttp3/internal/connection/i;->g:Lokhttp3/internal/connection/e;

    .line 20
    .line 21
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 25
    .line 26
    :try_start_1
    iget v4, p1, Ls7/e;->f:I

    .line 27
    .line 28
    iget v6, p1, Ls7/e;->g:I

    .line 29
    .line 30
    iget v7, p1, Ls7/e;->h:I

    .line 31
    .line 32
    iget-boolean v3, v0, Lokhttp3/z;->f:Z

    .line 33
    .line 34
    iget-object v5, p1, Ls7/e;->e:Lokhttp3/c0;

    .line 35
    .line 36
    iget-object v5, v5, Lokhttp3/c0;->b:Ljava/lang/String;

    .line 37
    .line 38
    const-string v8, "GET"

    .line 39
    .line 40
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v8, 0x1

    .line 45
    xor-int/2addr v5, v8

    .line 46
    invoke-virtual/range {v2 .. v7}, Lokhttp3/internal/connection/e;->a(ZIZII)Lokhttp3/internal/connection/k;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3, v0, p1}, Lokhttp3/internal/connection/k;->j(Lokhttp3/z;Ls7/e;)Ls7/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_1
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    new-instance v3, Lokhttp3/internal/connection/d;

    .line 55
    .line 56
    invoke-direct {v3, v1, v2, v0}, Lokhttp3/internal/connection/d;-><init>(Lokhttp3/internal/connection/i;Lokhttp3/internal/connection/e;Ls7/c;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, v1, Lokhttp3/internal/connection/i;->j:Lokhttp3/internal/connection/d;

    .line 60
    .line 61
    iput-object v3, v1, Lokhttp3/internal/connection/i;->o:Lokhttp3/internal/connection/d;

    .line 62
    .line 63
    monitor-enter v1

    .line 64
    :try_start_2
    iput-boolean v8, v1, Lokhttp3/internal/connection/i;->k:Z

    .line 65
    .line 66
    iput-boolean v8, v1, Lokhttp3/internal/connection/i;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    monitor-exit v1

    .line 69
    iget-boolean v0, v1, Lokhttp3/internal/connection/i;->n:Z

    .line 70
    .line 71
    if-nez v0, :cond_0

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    const/16 v1, 0x3d

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-static {p1, v2, v3, v0, v1}, Ls7/e;->a(Ls7/e;ILokhttp3/internal/connection/d;Lokhttp3/c0;I)Ls7/e;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object p1, p1, Ls7/e;->e:Lokhttp3/c0;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 89
    .line 90
    const-string v0, "Canceled"

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    monitor-exit v1

    .line 99
    throw p1

    .line 100
    :catch_0
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    goto :goto_0

    .line 103
    :catch_1
    move-exception v0

    .line 104
    move-object p1, v0

    .line 105
    goto :goto_1

    .line 106
    :goto_0
    invoke-virtual {v2, p1}, Lokhttp3/internal/connection/e;->c(Ljava/io/IOException;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lokhttp3/internal/connection/RouteException;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :goto_1
    invoke-virtual {p1}, Lokhttp3/internal/connection/RouteException;->getLastConnectException()Ljava/io/IOException;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/e;->c(Ljava/io/IOException;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    .line 124
    .line 125
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    move-object p1, v0

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    const-string p1, "Check failed."

    .line 135
    .line 136
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :cond_3
    const-string p1, "released"

    .line 143
    .line 144
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    :goto_2
    monitor-exit v1

    .line 151
    throw p1
.end method
