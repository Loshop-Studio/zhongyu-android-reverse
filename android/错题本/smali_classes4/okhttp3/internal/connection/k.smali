.class public final Lokhttp3/internal/connection/k;
.super Lu7/h;
.source "SourceFile"


# instance fields
.field public final b:Lokhttp3/n0;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Lokhttp3/p;

.field public f:Lokhttp3/Protocol;

.field public g:Lu7/o;

.field public h:Lokio/BufferedSource;

.field public i:Lokio/BufferedSink;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/m;Lokhttp3/n0;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "route"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput p1, p0, Lokhttp3/internal/connection/k;->o:I

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lokhttp3/internal/connection/k;->p:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-wide p1, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, Lokhttp3/internal/connection/k;->q:J

    .line 32
    .line 33
    return-void
.end method

.method public static d(Lokhttp3/z;Lokhttp3/n0;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "failedRoute"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failure"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 22
    .line 23
    iget-object v1, v0, Lokhttp3/a;->h:Ljava/net/ProxySelector;

    .line 24
    .line 25
    iget-object v0, v0, Lokhttp3/a;->i:Lokhttp3/r;

    .line 26
    .line 27
    invoke-virtual {v0}, Lokhttp3/r;->h()Ljava/net/URI;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p0, p0, Lokhttp3/z;->A:Lo2/a;

    .line 41
    .line 42
    monitor-enter p0

    .line 43
    :try_start_0
    iget-object p2, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lu7/o;Lu7/b0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string p1, "settings"

    .line 3
    .line 4
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget p1, p2, Lu7/b0;->a:I

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0x10

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p2, Lu7/b0;->b:[I

    .line 14
    .line 15
    const/4 p2, 0x4

    .line 16
    aget p1, p1, p2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    :goto_0
    iput p1, p0, Lokhttp3/internal/connection/k;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public final b(Lu7/w;)V
    .locals 2

    .line 1
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->REFUSED_STREAM:Lokhttp3/internal/http2/ErrorCode;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lu7/w;->c(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(IIIZLokhttp3/e;)V
    .locals 7

    .line 1
    const-string v0, "inetSocketAddress"

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 4
    .line 5
    if-nez v1, :cond_e

    .line 6
    .line 7
    iget-object v1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 8
    .line 9
    iget-object v1, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 10
    .line 11
    iget-object v1, v1, Lokhttp3/a;->k:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, Lcom/canhub/cropper/f;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lcom/canhub/cropper/f;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 19
    .line 20
    iget-object v3, v3, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 21
    .line 22
    iget-object v4, v3, Lokhttp3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    sget-object v3, Lokhttp3/l;->f:Lokhttp3/l;

    .line 27
    .line 28
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 35
    .line 36
    iget-object v1, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 37
    .line 38
    iget-object v1, v1, Lokhttp3/a;->i:Lokhttp3/r;

    .line 39
    .line 40
    iget-object v1, v1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v3, Lv7/n;->a:Lv7/n;

    .line 43
    .line 44
    sget-object v3, Lv7/n;->a:Lv7/n;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Lv7/n;->h(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lokhttp3/internal/connection/RouteException;

    .line 54
    .line 55
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 56
    .line 57
    const-string p3, "CLEARTEXT communication to "

    .line 58
    .line 59
    const-string p4, " not permitted by network security policy"

    .line 60
    .line 61
    invoke-static {p3, v1, p4}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_1
    new-instance p1, Lokhttp3/internal/connection/RouteException;

    .line 73
    .line 74
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 75
    .line 76
    const-string p3, "CLEARTEXT communication not enabled for client"

    .line 77
    .line 78
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p2}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    iget-object v1, v3, Lokhttp3/a;->j:Ljava/util/List;

    .line 86
    .line 87
    sget-object v3, Lokhttp3/Protocol;->H2_PRIOR_KNOWLEDGE:Lokhttp3/Protocol;

    .line 88
    .line 89
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_d

    .line 94
    .line 95
    :goto_0
    const/4 v1, 0x0

    .line 96
    move-object v3, v1

    .line 97
    :goto_1
    const/4 v4, 0x1

    .line 98
    :try_start_0
    iget-object v5, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 99
    .line 100
    iget-object v6, v5, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 101
    .line 102
    iget-object v6, v6, Lokhttp3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 103
    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    iget-object v5, v5, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 113
    .line 114
    if-ne v5, v6, :cond_3

    .line 115
    .line 116
    move v5, v4

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    const/4 v5, 0x0

    .line 119
    :goto_2
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2, p3, p5}, Lokhttp3/internal/connection/k;->f(IIILokhttp3/e;)V

    .line 122
    .line 123
    .line 124
    iget-object v5, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 125
    .line 126
    if-nez v5, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catch_0
    move-exception v5

    .line 130
    goto :goto_5

    .line 131
    :cond_4
    invoke-virtual {p0, p1, p2, p5}, Lokhttp3/internal/connection/k;->e(IILokhttp3/e;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {p0, v2, p5}, Lokhttp3/internal/connection/k;->g(Lcom/canhub/cropper/f;Lokhttp3/e;)V

    .line 135
    .line 136
    .line 137
    iget-object v5, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 138
    .line 139
    iget-object v5, v5, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 140
    .line 141
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    :goto_3
    iget-object p1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 145
    .line 146
    iget-object p2, p1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 147
    .line 148
    iget-object p2, p2, Lokhttp3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 149
    .line 150
    if-eqz p2, :cond_7

    .line 151
    .line 152
    iget-object p1, p1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 159
    .line 160
    if-ne p1, p2, :cond_7

    .line 161
    .line 162
    iget-object p1, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 163
    .line 164
    if-eqz p1, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    new-instance p1, Lokhttp3/internal/connection/RouteException;

    .line 168
    .line 169
    new-instance p2, Ljava/net/ProtocolException;

    .line 170
    .line 171
    const-string p3, "Too many tunnel connections attempted: 21"

    .line 172
    .line 173
    invoke-direct {p2, p3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p1, p2}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 181
    .line 182
    .line 183
    move-result-wide p1

    .line 184
    iput-wide p1, p0, Lokhttp3/internal/connection/k;->q:J

    .line 185
    .line 186
    return-void

    .line 187
    :goto_5
    iget-object v6, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    invoke-static {v6}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object v6, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 195
    .line 196
    if-eqz v6, :cond_9

    .line 197
    .line 198
    invoke-static {v6}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    iput-object v1, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 202
    .line 203
    iput-object v1, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 204
    .line 205
    iput-object v1, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 206
    .line 207
    iput-object v1, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;

    .line 208
    .line 209
    iput-object v1, p0, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 210
    .line 211
    iput-object v1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 212
    .line 213
    iput-object v1, p0, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 214
    .line 215
    iput v4, p0, Lokhttp3/internal/connection/k;->o:I

    .line 216
    .line 217
    iget-object v6, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 218
    .line 219
    iget-object v6, v6, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 220
    .line 221
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    if-nez v3, :cond_a

    .line 225
    .line 226
    new-instance v3, Lokhttp3/internal/connection/RouteException;

    .line 227
    .line 228
    invoke-direct {v3, v5}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    invoke-virtual {v3, v5}, Lokhttp3/internal/connection/RouteException;->addConnectException(Ljava/io/IOException;)V

    .line 233
    .line 234
    .line 235
    :goto_6
    if-eqz p4, :cond_c

    .line 236
    .line 237
    iput-boolean v4, v2, Lcom/canhub/cropper/f;->c:Z

    .line 238
    .line 239
    iget-boolean v4, v2, Lcom/canhub/cropper/f;->b:Z

    .line 240
    .line 241
    if-eqz v4, :cond_c

    .line 242
    .line 243
    instance-of v4, v5, Ljava/net/ProtocolException;

    .line 244
    .line 245
    if-nez v4, :cond_c

    .line 246
    .line 247
    instance-of v4, v5, Ljava/io/InterruptedIOException;

    .line 248
    .line 249
    if-nez v4, :cond_c

    .line 250
    .line 251
    instance-of v4, v5, Ljavax/net/ssl/SSLHandshakeException;

    .line 252
    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    instance-of v4, v4, Ljava/security/cert/CertificateException;

    .line 260
    .line 261
    if-nez v4, :cond_c

    .line 262
    .line 263
    :cond_b
    instance-of v4, v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 264
    .line 265
    if-nez v4, :cond_c

    .line 266
    .line 267
    instance-of v4, v5, Ljavax/net/ssl/SSLException;

    .line 268
    .line 269
    if-eqz v4, :cond_c

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :cond_c
    throw v3

    .line 274
    :cond_d
    new-instance p1, Lokhttp3/internal/connection/RouteException;

    .line 275
    .line 276
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 277
    .line 278
    const-string p3, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 279
    .line 280
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-direct {p1, p2}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 288
    .line 289
    const-string p2, "already connected"

    .line 290
    .line 291
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1
.end method

.method public final e(IILokhttp3/e;)V
    .locals 3

    .line 1
    iget-object p3, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 2
    .line 3
    iget-object v0, p3, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    iget-object p3, p3, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lokhttp3/internal/connection/j;->a:[I

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    aget v1, v2, v1

    .line 22
    .line 23
    :goto_0
    const/4 v2, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/net/Socket;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p3, p3, Lokhttp3/a;->b:Ljavax/net/SocketFactory;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iput-object p3, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 45
    .line 46
    iget-object v0, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 47
    .line 48
    iget-object v0, v0, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    const-string v1, "inetSocketAddress"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    sget-object p2, Lv7/n;->a:Lv7/n;

    .line 59
    .line 60
    sget-object p2, Lv7/n;->a:Lv7/n;

    .line 61
    .line 62
    iget-object v0, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 63
    .line 64
    iget-object v0, v0, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 65
    .line 66
    invoke-virtual {p2, p3, v0, p1}, Lv7/n;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-static {p3}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 78
    .line 79
    invoke-static {p3}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    .line 89
    return-void

    .line 90
    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const-string p3, "throw with null exception"

    .line 96
    .line 97
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_2

    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    new-instance p2, Ljava/io/IOException;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p2

    .line 110
    :catch_1
    move-exception p1

    .line 111
    new-instance p2, Ljava/net/ConnectException;

    .line 112
    .line 113
    new-instance p3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v0, "Failed to connect to "

    .line 116
    .line 117
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 121
    .line 122
    iget-object v0, v0, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 123
    .line 124
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    throw p2
.end method

.method public final f(IIILokhttp3/e;)V
    .locals 9

    .line 1
    new-instance v0, Lokhttp3/b0;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/b0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 7
    .line 8
    iget-object v2, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 9
    .line 10
    iget-object v2, v2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 11
    .line 12
    const-string v3, "url"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, Lokhttp3/b0;->a:Lokhttp3/r;

    .line 18
    .line 19
    const-string v2, "CONNECT"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v2, v3}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 26
    .line 27
    iget-object v2, v1, Lokhttp3/a;->i:Lokhttp3/r;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-static {v2, v4}, Lp7/c;->u(Lokhttp3/r;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "Host"

    .line 35
    .line 36
    invoke-virtual {v0, v5, v2}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "Proxy-Connection"

    .line 40
    .line 41
    const-string v5, "Keep-Alive"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v5}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "User-Agent"

    .line 47
    .line 48
    const-string v5, "okhttp/4.12.0"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v5}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v2, Lkotlin/jvm/internal/o;

    .line 58
    .line 59
    const/4 v5, 0x2

    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-direct {v2, v5, v6}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 62
    .line 63
    .line 64
    sget-object v5, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 65
    .line 66
    const-string v6, "protocol"

    .line 67
    .line 68
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v5, "Proxy-Authenticate"

    .line 72
    .line 73
    invoke-static {v5}, Lokhttp3/o;->b(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v6, "OkHttp-Preemptive"

    .line 77
    .line 78
    invoke-static {v6, v5}, Lokhttp3/o;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v5, v6}, Lkotlin/jvm/internal/o;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    .line 88
    .line 89
    .line 90
    iget-object v2, v1, Lokhttp3/a;->f:Lokhttp3/b;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, p4}, Lokhttp3/internal/connection/k;->e(IILokhttp3/e;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string p4, "CONNECT "

    .line 103
    .line 104
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4}, Lp7/c;->u(Lokhttp3/r;Z)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p4, " HTTP/1.1"

    .line 115
    .line 116
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p4, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 124
    .line 125
    invoke-static {p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;

    .line 129
    .line 130
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    new-instance v4, Lt7/g;

    .line 134
    .line 135
    invoke-direct {v4, v3, p0, p4, v2}, Lt7/g;-><init>(Lokhttp3/z;Lokhttp3/internal/connection/k;Lokio/BufferedSource;Lokio/BufferedSink;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p4}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    int-to-long v5, p2

    .line 143
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 144
    .line 145
    invoke-virtual {v3, v5, v6, p2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 146
    .line 147
    .line 148
    invoke-interface {v2}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    int-to-long v5, p3

    .line 153
    invoke-virtual {v3, v5, v6, p2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 154
    .line 155
    .line 156
    iget-object p2, v0, Lokhttp3/c0;->c:Lokhttp3/q;

    .line 157
    .line 158
    invoke-virtual {v4, p2, p1}, Lt7/g;->k(Lokhttp3/q;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Lt7/g;->a()V

    .line 162
    .line 163
    .line 164
    const/4 p1, 0x0

    .line 165
    invoke-virtual {v4, p1}, Lt7/g;->g(Z)Lokhttp3/h0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iput-object v0, p1, Lokhttp3/h0;->a:Lokhttp3/c0;

    .line 173
    .line 174
    invoke-virtual {p1}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget p2, p1, Lokhttp3/i0;->d:I

    .line 179
    .line 180
    invoke-static {p1}, Lp7/c;->i(Lokhttp3/i0;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    const-wide/16 v7, -0x1

    .line 185
    .line 186
    cmp-long p1, v5, v7

    .line 187
    .line 188
    if-nez p1, :cond_0

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {v4, v5, v6}, Lt7/g;->j(J)Lt7/e;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const p3, 0x7fffffff

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p3}, Lp7/c;->s(Lokio/Source;I)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lt7/e;->close()V

    .line 202
    .line 203
    .line 204
    :goto_0
    const/16 p1, 0xc8

    .line 205
    .line 206
    if-eq p2, p1, :cond_2

    .line 207
    .line 208
    const/16 p1, 0x197

    .line 209
    .line 210
    if-ne p2, p1, :cond_1

    .line 211
    .line 212
    iget-object p1, v1, Lokhttp3/a;->f:Lokhttp3/b;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-instance p1, Ljava/io/IOException;

    .line 218
    .line 219
    const-string p2, "Failed to authenticate with proxy"

    .line 220
    .line 221
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 226
    .line 227
    const-string p3, "Unexpected response code for CONNECT: "

    .line 228
    .line 229
    invoke-static {p2, p3}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1

    .line 237
    :cond_2
    invoke-interface {p4}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1}, Lokio/Buffer;->exhausted()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_3

    .line 246
    .line 247
    invoke-interface {v2}, Lokio/BufferedSink;->getBuffer()Lokio/Buffer;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Lokio/Buffer;->exhausted()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_3

    .line 256
    .line 257
    return-void

    .line 258
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 259
    .line 260
    const-string p2, "TLS tunnel buffered too many bytes!"

    .line 261
    .line 262
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1
.end method

.method public final g(Lcom/canhub/cropper/f;Lokhttp3/e;)V
    .locals 9

    .line 1
    iget-object p2, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 2
    .line 3
    iget-object p2, p2, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 4
    .line 5
    iget-object v0, p2, Lokhttp3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p2, Lokhttp3/a;->j:Ljava/util/List;

    .line 10
    .line 11
    sget-object p2, Lokhttp3/Protocol;->H2_PRIOR_KNOWLEDGE:Lokhttp3/Protocol;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 20
    .line 21
    iput-object p1, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 22
    .line 23
    iput-object p2, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 24
    .line 25
    invoke-virtual {p0}, Lokhttp3/internal/connection/k;->l()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 30
    .line 31
    iput-object p1, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 32
    .line 33
    sget-object p1, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 34
    .line 35
    iput-object p1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string v1, "Hostname "

    .line 39
    .line 40
    const-string v2, "\n              |Hostname "

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    :try_start_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 47
    .line 48
    iget-object v5, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 49
    .line 50
    iget-object v6, v5, Lokhttp3/r;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget v5, v5, Lokhttp3/r;->e:I

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    invoke-virtual {v0, v4, v6, v5, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v4, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    .line 60
    .line 61
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v0, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {p1, v0}, Lcom/canhub/cropper/f;->a(Ljavax/net/ssl/SSLSocket;)Lokhttp3/l;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-boolean v4, p1, Lokhttp3/l;->b:Z

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    sget-object v4, Lv7/n;->a:Lv7/n;

    .line 75
    .line 76
    sget-object v4, Lv7/n;->a:Lv7/n;

    .line 77
    .line 78
    iget-object v5, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 79
    .line 80
    iget-object v5, v5, Lokhttp3/r;->d:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v6, p2, Lokhttp3/a;->j:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v4, v0, v5, v6}, Lv7/n;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    move-object v3, v0

    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-string v5, "sslSocketSession"

    .line 100
    .line 101
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, Lokhttp3/o;->e(Ljavax/net/ssl/SSLSession;)Lokhttp3/p;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget-object v6, p2, Lokhttp3/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 109
    .line 110
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v7, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 114
    .line 115
    iget-object v7, v7, Lokhttp3/r;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v6, v7, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_4

    .line 122
    .line 123
    invoke-virtual {v5}, Lokhttp3/p;->a()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_3

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 139
    .line 140
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 144
    .line 145
    new-instance v1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 146
    .line 147
    new-instance v3, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object p2, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 153
    .line 154
    iget-object p2, p2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string p2, " not verified:\n              |    certificate: "

    .line 160
    .line 161
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    sget-object p2, Lokhttp3/h;->c:Lokhttp3/h;

    .line 165
    .line 166
    invoke-static {p1}, Lokhttp3/g;->a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string p2, "\n              |    DN: "

    .line 174
    .line 175
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-interface {p2}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p2, "\n              |    subjectAltNames: "

    .line 190
    .line 191
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const/4 p2, 0x7

    .line 195
    invoke-static {p1, p2}, Lz7/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    const/4 v2, 0x2

    .line 200
    invoke-static {p1, v2}, Lz7/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p2, p1}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string p1, "\n              "

    .line 212
    .line 213
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lkotlin/text/q;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-direct {v1, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v1

    .line 228
    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 229
    .line 230
    new-instance v2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object p2, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 236
    .line 237
    iget-object p2, p2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string p2, " not verified (no certificates)"

    .line 243
    .line 244
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :cond_4
    iget-object v1, p2, Lokhttp3/a;->e:Lokhttp3/h;

    .line 256
    .line 257
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    new-instance v2, Lokhttp3/p;

    .line 261
    .line 262
    iget-object v4, v5, Lokhttp3/p;->a:Lokhttp3/TlsVersion;

    .line 263
    .line 264
    iget-object v6, v5, Lokhttp3/p;->b:Lokhttp3/j;

    .line 265
    .line 266
    iget-object v7, v5, Lokhttp3/p;->c:Ljava/util/List;

    .line 267
    .line 268
    new-instance v8, Lokhttp3/internal/connection/RealConnection$connectTls$1;

    .line 269
    .line 270
    invoke-direct {v8, v1, v5, p2}, Lokhttp3/internal/connection/RealConnection$connectTls$1;-><init>(Lokhttp3/h;Lokhttp3/p;Lokhttp3/a;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v2, v4, v6, v7, v8}, Lokhttp3/p;-><init>(Lokhttp3/TlsVersion;Lokhttp3/j;Ljava/util/List;Lr6/a;)V

    .line 274
    .line 275
    .line 276
    iput-object v2, p0, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 277
    .line 278
    iget-object p2, p2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 279
    .line 280
    iget-object p2, p2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 281
    .line 282
    new-instance v2, Lokhttp3/internal/connection/RealConnection$connectTls$2;

    .line 283
    .line 284
    invoke-direct {v2, p0}, Lokhttp3/internal/connection/RealConnection$connectTls$2;-><init>(Lokhttp3/internal/connection/k;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, p2, v2}, Lokhttp3/h;->b(Ljava/lang/String;Lr6/a;)V

    .line 288
    .line 289
    .line 290
    iget-boolean p1, p1, Lokhttp3/l;->b:Z

    .line 291
    .line 292
    if-eqz p1, :cond_5

    .line 293
    .line 294
    sget-object p1, Lv7/n;->a:Lv7/n;

    .line 295
    .line 296
    sget-object p1, Lv7/n;->a:Lv7/n;

    .line 297
    .line 298
    invoke-virtual {p1, v0}, Lv7/n;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :cond_5
    iput-object v0, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 303
    .line 304
    invoke-static {v0}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 313
    .line 314
    invoke-static {v0}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    iput-object p1, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;

    .line 323
    .line 324
    if-eqz v3, :cond_6

    .line 325
    .line 326
    sget-object p1, Lokhttp3/Protocol;->Companion:Lokhttp3/a0;

    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v3}, Lokhttp3/a0;->a(Ljava/lang/String;)Lokhttp3/Protocol;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    goto :goto_1

    .line 336
    :cond_6
    sget-object p1, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 337
    .line 338
    :goto_1
    iput-object p1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 339
    .line 340
    sget-object p1, Lv7/n;->a:Lv7/n;

    .line 341
    .line 342
    sget-object p1, Lv7/n;->a:Lv7/n;

    .line 343
    .line 344
    invoke-virtual {p1, v0}, Lv7/n;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 345
    .line 346
    .line 347
    iget-object p1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 348
    .line 349
    sget-object p2, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    .line 350
    .line 351
    if-ne p1, p2, :cond_7

    .line 352
    .line 353
    invoke-virtual {p0}, Lokhttp3/internal/connection/k;->l()V

    .line 354
    .line 355
    .line 356
    :cond_7
    return-void

    .line 357
    :catchall_1
    move-exception p1

    .line 358
    :goto_2
    if-eqz v3, :cond_8

    .line 359
    .line 360
    sget-object p2, Lv7/n;->a:Lv7/n;

    .line 361
    .line 362
    sget-object p2, Lv7/n;->a:Lv7/n;

    .line 363
    .line 364
    invoke-virtual {p2, v3}, Lv7/n;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 365
    .line 366
    .line 367
    :cond_8
    if-eqz v3, :cond_9

    .line 368
    .line 369
    invoke-static {v3}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 370
    .line 371
    .line 372
    :cond_9
    throw p1
.end method

.method public final h(Lokhttp3/a;Ljava/util/List;)Z
    .locals 9

    .line 1
    iget-object v0, p1, Lokhttp3/a;->i:Lokhttp3/r;

    .line 2
    .line 3
    sget-object v1, Lp7/c;->a:[B

    .line 4
    .line 5
    iget-object v1, p0, Lokhttp3/internal/connection/k;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, Lokhttp3/internal/connection/k;->o:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_9

    .line 15
    .line 16
    iget-boolean v1, p0, Lokhttp3/internal/connection/k;->j:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 23
    .line 24
    iget-object v2, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 25
    .line 26
    iget-object v4, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lokhttp3/a;->a(Lokhttp3/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Lokhttp3/r;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v5, v0, Lokhttp3/r;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v6, v4, Lokhttp3/a;->i:Lokhttp3/r;

    .line 41
    .line 42
    iget-object v6, v6, Lokhttp3/r;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    return v6

    .line 52
    :cond_2
    iget-object v2, p0, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_3
    if-eqz p2, :cond_9

    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_9

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lokhttp3/n0;

    .line 83
    .line 84
    iget-object v7, v2, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 91
    .line 92
    if-ne v7, v8, :cond_5

    .line 93
    .line 94
    iget-object v7, v1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-ne v7, v8, :cond_5

    .line 101
    .line 102
    iget-object v7, v1, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    iget-object v2, v2, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 105
    .line 106
    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    iget-object p2, p1, Lokhttp3/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 113
    .line 114
    sget-object v1, Lz7/c;->a:Lz7/c;

    .line 115
    .line 116
    if-eq p2, v1, :cond_6

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    sget-object p2, Lp7/c;->a:[B

    .line 120
    .line 121
    iget-object p2, v4, Lokhttp3/a;->i:Lokhttp3/r;

    .line 122
    .line 123
    iget v0, v0, Lokhttp3/r;->e:I

    .line 124
    .line 125
    iget v1, p2, Lokhttp3/r;->e:I

    .line 126
    .line 127
    if-eq v0, v1, :cond_7

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    iget-object p2, p2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    iget-boolean p2, p0, Lokhttp3/internal/connection/k;->k:Z

    .line 140
    .line 141
    if-nez p2, :cond_9

    .line 142
    .line 143
    iget-object p2, p0, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 144
    .line 145
    if-eqz p2, :cond_9

    .line 146
    .line 147
    invoke-virtual {p2}, Lokhttp3/p;->a()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_9

    .line 156
    .line 157
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 162
    .line 163
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    check-cast p2, Ljava/security/cert/X509Certificate;

    .line 167
    .line 168
    invoke-static {v5, p2}, Lz7/c;->b(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_9

    .line 173
    .line 174
    :goto_0
    :try_start_0
    iget-object p1, p1, Lokhttp3/a;->e:Lokhttp3/h;

    .line 175
    .line 176
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p2, p0, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 180
    .line 181
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lokhttp3/p;->a()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p1, v5, p2}, Lokhttp3/h;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    return v6

    .line 192
    :catch_0
    :cond_9
    :goto_1
    return v3
.end method

.method public final i(Z)Z
    .locals 9

    .line 1
    sget-object v0, Lp7/c;->a:[B

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 18
    .line 19
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iget-object v2, p0, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-boolean p1, v2, Lu7/o;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    monitor-exit v2

    .line 59
    return v5

    .line 60
    :cond_1
    :try_start_1
    iget-wide v3, v2, Lu7/o;->n:J

    .line 61
    .line 62
    iget-wide v7, v2, Lu7/o;->m:J

    .line 63
    .line 64
    cmp-long p1, v3, v7

    .line 65
    .line 66
    if-gez p1, :cond_2

    .line 67
    .line 68
    iget-wide v3, v2, Lu7/o;->o:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    cmp-long p1, v0, v3

    .line 71
    .line 72
    if-ltz p1, :cond_2

    .line 73
    .line 74
    monitor-exit v2

    .line 75
    return v5

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    monitor-exit v2

    .line 79
    return v6

    .line 80
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    throw p1

    .line 82
    :cond_3
    monitor-enter p0

    .line 83
    :try_start_3
    iget-wide v7, p0, Lokhttp3/internal/connection/k;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    sub-long/2addr v0, v7

    .line 86
    monitor-exit p0

    .line 87
    const-wide v7, 0x2540be400L

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long v0, v0, v7

    .line 93
    .line 94
    if-ltz v0, :cond_4

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    :try_start_4
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    .line 99
    .line 100
    .line 101
    move-result p1
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 102
    :try_start_5
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4}, Lokio/BufferedSource;->exhausted()Z

    .line 106
    .line 107
    .line 108
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    xor-int/2addr v0, v6

    .line 110
    :try_start_6
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 111
    .line 112
    .line 113
    return v0

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 116
    .line 117
    .line 118
    throw v0
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 119
    :catch_0
    move v5, v6

    .line 120
    :catch_1
    return v5

    .line 121
    :cond_4
    return v6

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit p0

    .line 124
    throw p1

    .line 125
    :cond_5
    :goto_1
    return v5
.end method

.method public final j(Lokhttp3/z;Ls7/e;)Ls7/c;
    .locals 6

    .line 1
    iget v0, p2, Ls7/e;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;

    .line 14
    .line 15
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    new-instance v0, Lu7/p;

    .line 23
    .line 24
    invoke-direct {v0, p1, p0, p2, v4}, Lu7/p;-><init>(Lokhttp3/z;Lokhttp3/internal/connection/k;Ls7/e;Lu7/o;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    int-to-long v4, v0

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    invoke-virtual {v1, v4, v5, v0}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 39
    .line 40
    .line 41
    invoke-interface {v3}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget p2, p2, Ls7/e;->h:I

    .line 46
    .line 47
    int-to-long v4, p2

    .line 48
    invoke-virtual {v1, v4, v5, v0}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 49
    .line 50
    .line 51
    new-instance p2, Lt7/g;

    .line 52
    .line 53
    invoke-direct {p2, p1, p0, v2, v3}, Lt7/g;-><init>(Lokhttp3/z;Lokhttp3/internal/connection/k;Lokio/BufferedSource;Lokio/BufferedSink;)V

    .line 54
    .line 55
    .line 56
    return-object p2
.end method

.method public final declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lokhttp3/internal/connection/k;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
.end method

.method public final l()V
    .locals 10

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/internal/connection/k;->h:Lokio/BufferedSource;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lokhttp3/internal/connection/k;->i:Lokio/BufferedSink;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lretrofit2/p0;

    .line 21
    .line 22
    sget-object v5, Lr7/c;->h:Lr7/c;

    .line 23
    .line 24
    invoke-direct {v4, v5}, Lretrofit2/p0;-><init>(Lr7/c;)V

    .line 25
    .line 26
    .line 27
    iget-object v6, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 28
    .line 29
    iget-object v6, v6, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 30
    .line 31
    iget-object v6, v6, Lokhttp3/a;->i:Lokhttp3/r;

    .line 32
    .line 33
    iget-object v6, v6, Lokhttp3/r;->d:Ljava/lang/String;

    .line 34
    .line 35
    const-string v7, "peerName"

    .line 36
    .line 37
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, v4, Lretrofit2/p0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    sget-object v7, Lp7/c;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 v7, 0x20

    .line 53
    .line 54
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v6, "<set-?>"

    .line 65
    .line 66
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, v4, Lretrofit2/p0;->c:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v1, v4, Lretrofit2/p0;->d:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v2, v4, Lretrofit2/p0;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p0, v4, Lretrofit2/p0;->f:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance v0, Lu7/o;

    .line 78
    .line 79
    invoke-direct {v0, v4}, Lu7/o;-><init>(Lretrofit2/p0;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lokhttp3/internal/connection/k;->g:Lu7/o;

    .line 83
    .line 84
    sget-object v1, Lu7/o;->z:Lu7/b0;

    .line 85
    .line 86
    iget v2, v1, Lu7/b0;->a:I

    .line 87
    .line 88
    and-int/lit8 v2, v2, 0x10

    .line 89
    .line 90
    const/4 v4, 0x4

    .line 91
    if-eqz v2, :cond_0

    .line 92
    .line 93
    iget-object v1, v1, Lu7/b0;->b:[I

    .line 94
    .line 95
    aget v1, v1, v4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const v1, 0x7fffffff

    .line 99
    .line 100
    .line 101
    :goto_0
    iput v1, p0, Lokhttp3/internal/connection/k;->o:I

    .line 102
    .line 103
    iget-object v1, v0, Lu7/o;->w:Lu7/x;

    .line 104
    .line 105
    const-string v2, ">> CONNECTION "

    .line 106
    .line 107
    monitor-enter v1

    .line 108
    :try_start_0
    iget-boolean v6, v1, Lu7/x;->d:Z

    .line 109
    .line 110
    if-nez v6, :cond_9

    .line 111
    .line 112
    sget-object v6, Lu7/x;->f:Ljava/util/logging/Logger;

    .line 113
    .line 114
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 115
    .line 116
    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_1

    .line 121
    .line 122
    new-instance v7, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sget-object v2, Lu7/f;->a:Lokio/ByteString;

    .line 128
    .line 129
    invoke-virtual {v2}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    new-array v7, v3, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {v2, v7}, Lp7/c;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    :cond_1
    :goto_1
    iget-object v2, v1, Lu7/x;->a:Lokio/BufferedSink;

    .line 154
    .line 155
    sget-object v6, Lu7/f;->a:Lokio/ByteString;

    .line 156
    .line 157
    invoke-interface {v2, v6}, Lokio/BufferedSink;->write(Lokio/ByteString;)Lokio/BufferedSink;

    .line 158
    .line 159
    .line 160
    iget-object v2, v1, Lu7/x;->a:Lokio/BufferedSink;

    .line 161
    .line 162
    invoke-interface {v2}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    monitor-exit v1

    .line 166
    iget-object v2, v0, Lu7/o;->w:Lu7/x;

    .line 167
    .line 168
    iget-object v1, v0, Lu7/o;->p:Lu7/b0;

    .line 169
    .line 170
    monitor-enter v2

    .line 171
    :try_start_1
    const-string v6, "settings"

    .line 172
    .line 173
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-boolean v6, v2, Lu7/x;->d:Z

    .line 177
    .line 178
    if-nez v6, :cond_8

    .line 179
    .line 180
    iget v6, v1, Lu7/b0;->a:I

    .line 181
    .line 182
    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    mul-int/lit8 v6, v6, 0x6

    .line 187
    .line 188
    invoke-virtual {v2, v3, v6, v4, v3}, Lu7/x;->c(IIII)V

    .line 189
    .line 190
    .line 191
    move v6, v3

    .line 192
    :goto_2
    const/16 v7, 0xa

    .line 193
    .line 194
    if-ge v6, v7, :cond_6

    .line 195
    .line 196
    const/4 v7, 0x1

    .line 197
    shl-int v8, v7, v6

    .line 198
    .line 199
    iget v9, v1, Lu7/b0;->a:I

    .line 200
    .line 201
    and-int/2addr v8, v9

    .line 202
    if-eqz v8, :cond_2

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_2
    move v7, v3

    .line 206
    :goto_3
    if-eqz v7, :cond_5

    .line 207
    .line 208
    if-eq v6, v4, :cond_4

    .line 209
    .line 210
    const/4 v7, 0x7

    .line 211
    if-eq v6, v7, :cond_3

    .line 212
    .line 213
    move v7, v6

    .line 214
    goto :goto_4

    .line 215
    :cond_3
    move v7, v4

    .line 216
    goto :goto_4

    .line 217
    :cond_4
    const/4 v7, 0x3

    .line 218
    :goto_4
    iget-object v8, v2, Lu7/x;->a:Lokio/BufferedSink;

    .line 219
    .line 220
    invoke-interface {v8, v7}, Lokio/BufferedSink;->writeShort(I)Lokio/BufferedSink;

    .line 221
    .line 222
    .line 223
    iget-object v7, v2, Lu7/x;->a:Lokio/BufferedSink;

    .line 224
    .line 225
    iget-object v8, v1, Lu7/b0;->b:[I

    .line 226
    .line 227
    aget v8, v8, v6

    .line 228
    .line 229
    invoke-interface {v7, v8}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    goto :goto_6

    .line 235
    :cond_5
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_6
    iget-object v1, v2, Lu7/x;->a:Lokio/BufferedSink;

    .line 239
    .line 240
    invoke-interface {v1}, Lokio/BufferedSink;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    .line 242
    .line 243
    monitor-exit v2

    .line 244
    iget-object v1, v0, Lu7/o;->p:Lu7/b0;

    .line 245
    .line 246
    invoke-virtual {v1}, Lu7/b0;->a()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    const v2, 0xffff

    .line 251
    .line 252
    .line 253
    if-eq v1, v2, :cond_7

    .line 254
    .line 255
    iget-object v4, v0, Lu7/o;->w:Lu7/x;

    .line 256
    .line 257
    sub-int/2addr v1, v2

    .line 258
    int-to-long v1, v1

    .line 259
    invoke-virtual {v4, v3, v1, v2}, Lu7/x;->h(IJ)V

    .line 260
    .line 261
    .line 262
    :cond_7
    invoke-virtual {v5}, Lr7/c;->e()Lr7/b;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v2, v0, Lu7/o;->c:Ljava/lang/String;

    .line 267
    .line 268
    iget-object v0, v0, Lu7/o;->x:Lcom/zykj/mistake/feature/collection/component/n;

    .line 269
    .line 270
    new-instance v3, Lokhttp3/internal/connection/l;

    .line 271
    .line 272
    const/4 v4, 0x1

    .line 273
    invoke-direct {v3, v0, v2, v4}, Lokhttp3/internal/connection/l;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    const-wide/16 v4, 0x0

    .line 277
    .line 278
    invoke-virtual {v1, v3, v4, v5}, Lr7/b;->b(Lr7/a;J)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_8
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 283
    .line 284
    const-string v1, "closed"

    .line 285
    .line 286
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :goto_6
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 291
    throw v0

    .line 292
    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 293
    .line 294
    const-string v2, "closed"

    .line 295
    .line 296
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :goto_7
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 301
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 9
    .line 10
    iget-object v2, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 11
    .line 12
    iget-object v2, v2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 13
    .line 14
    iget-object v2, v2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3a

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 25
    .line 26
    iget-object v2, v2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 27
    .line 28
    iget v2, v2, Lokhttp3/r;->e:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lokhttp3/n0;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lokhttp3/internal/connection/k;->e:Lokhttp3/p;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lokhttp3/p;->b:Lokhttp3/j;

    .line 63
    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    :cond_0
    const-string v1, "none"

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " protocol="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lokhttp3/internal/connection/k;->f:Lokhttp3/Protocol;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v1, 0x7d

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
.end method
