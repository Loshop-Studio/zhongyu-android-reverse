.class public final Lretrofit2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/e;


# instance fields
.field public final a:Lretrofit2/m0;

.field public final b:Ljava/lang/Object;

.field public final c:[Ljava/lang/Object;

.field public final d:Lokhttp3/d;

.field public final e:Lretrofit2/m;

.field public volatile f:Z

.field public g:Lokhttp3/internal/connection/i;

.field public h:Ljava/lang/Throwable;

.field public i:Z


# direct methods
.method public constructor <init>(Lretrofit2/m0;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/d;Lretrofit2/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/x;->a:Lretrofit2/m0;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/x;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/x;->c:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lretrofit2/x;->d:Lokhttp3/d;

    .line 11
    .line 12
    iput-object p5, p0, Lretrofit2/x;->e:Lretrofit2/m;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lokhttp3/c0;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lretrofit2/x;->e()Lokhttp3/e;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lokhttp3/internal/connection/i;

    .line 7
    .line 8
    iget-object v0, v0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    const-string v2, "Unable to create request."

    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method public final b(Lretrofit2/h;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lretrofit2/x;->i:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lretrofit2/x;->i:Z

    .line 8
    .line 9
    iget-object v0, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;

    .line 10
    .line 11
    iget-object v1, p0, Lretrofit2/x;->h:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p0}, Lretrofit2/x;->c()Lokhttp3/internal/connection/i;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    :try_start_2
    invoke-static {v1}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lretrofit2/x;->h:Ljava/lang/Throwable;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, p0, v1}, Lretrofit2/h;->k(Lretrofit2/e;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-boolean v1, p0, Lretrofit2/x;->f:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Lokhttp3/internal/connection/i;->cancel()V

    .line 46
    .line 47
    .line 48
    :cond_2
    new-instance v1, Landroid/support/v4/media/h;

    .line 49
    .line 50
    const/16 v2, 0x1c

    .line 51
    .line 52
    invoke-direct {v1, v2, p0, p1}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lokhttp3/internal/connection/i;->g(Lokhttp3/f;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v0, "Already executed."

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    throw p1
.end method

.method public final c()Lokhttp3/internal/connection/i;
    .locals 14

    .line 1
    iget-object v0, p0, Lretrofit2/x;->a:Lretrofit2/m0;

    .line 2
    .line 3
    iget-object v1, v0, Lretrofit2/m0;->k:[Lretrofit2/v;

    .line 4
    .line 5
    iget-object v2, p0, Lretrofit2/x;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    array-length v4, v1

    .line 9
    if-ne v3, v4, :cond_a

    .line 10
    .line 11
    new-instance v5, Lretrofit2/k0;

    .line 12
    .line 13
    iget-object v6, v0, Lretrofit2/m0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lretrofit2/m0;->c:Lokhttp3/r;

    .line 16
    .line 17
    iget-object v8, v0, Lretrofit2/m0;->e:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v0, Lretrofit2/m0;->f:Lokhttp3/q;

    .line 20
    .line 21
    iget-object v10, v0, Lretrofit2/m0;->g:Lokhttp3/u;

    .line 22
    .line 23
    iget-boolean v11, v0, Lretrofit2/m0;->h:Z

    .line 24
    .line 25
    iget-boolean v12, v0, Lretrofit2/m0;->i:Z

    .line 26
    .line 27
    iget-boolean v13, v0, Lretrofit2/m0;->j:Z

    .line 28
    .line 29
    invoke-direct/range {v5 .. v13}, Lretrofit2/k0;-><init>(Ljava/lang/String;Lokhttp3/r;Ljava/lang/String;Lokhttp3/q;Lokhttp3/u;ZZZ)V

    .line 30
    .line 31
    .line 32
    iget-boolean v4, v0, Lretrofit2/m0;->l:Z

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    add-int/lit8 v3, v3, -0x1

    .line 37
    .line 38
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    move v7, v6

    .line 45
    :goto_0
    if-ge v7, v3, :cond_1

    .line 46
    .line 47
    aget-object v8, v2, v7

    .line 48
    .line 49
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    aget-object v8, v1, v7

    .line 53
    .line 54
    aget-object v9, v2, v7

    .line 55
    .line 56
    invoke-virtual {v8, v5, v9}, Lretrofit2/v;->a(Lretrofit2/k0;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v1, v5, Lretrofit2/k0;->d:Lcom/zykj/mistake/feature/notebook/detail/z4;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/z4;->a()Lokhttp3/r;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v1, v5, Lretrofit2/k0;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, v5, Lretrofit2/k0;->b:Lokhttp3/r;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v7, "link"

    .line 80
    .line 81
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v1}, Lokhttp3/r;->f(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/z4;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/z4;->a()Lokhttp3/r;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-object v1, v2

    .line 96
    :goto_1
    if-eqz v1, :cond_9

    .line 97
    .line 98
    :goto_2
    iget-object v3, v5, Lretrofit2/k0;->k:Lokhttp3/g0;

    .line 99
    .line 100
    if-nez v3, :cond_6

    .line 101
    .line 102
    iget-object v7, v5, Lretrofit2/k0;->j:Landroid/support/v4/media/h;

    .line 103
    .line 104
    if-eqz v7, :cond_4

    .line 105
    .line 106
    new-instance v3, Lokhttp3/n;

    .line 107
    .line 108
    iget-object v2, v7, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ljava/util/ArrayList;

    .line 111
    .line 112
    iget-object v6, v7, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v3, v2, v6}, Lokhttp3/n;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    iget-object v7, v5, Lretrofit2/k0;->i:Lokhttp3/v;

    .line 121
    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    invoke-virtual {v7}, Lokhttp3/v;->b()Lokhttp3/x;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    iget-boolean v7, v5, Lretrofit2/k0;->h:Z

    .line 130
    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    new-array v3, v6, [B

    .line 134
    .line 135
    invoke-static {v2, v3}, Lokhttp3/g0;->create(Lokhttp3/u;[B)Lokhttp3/g0;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_6
    :goto_3
    iget-object v2, v5, Lretrofit2/k0;->g:Lokhttp3/u;

    .line 140
    .line 141
    iget-object v6, v5, Lretrofit2/k0;->f:Lkotlin/jvm/internal/o;

    .line 142
    .line 143
    if-eqz v2, :cond_8

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    new-instance v7, Lokhttp3/d0;

    .line 148
    .line 149
    invoke-direct {v7, v3, v2}, Lokhttp3/d0;-><init>(Lokhttp3/g0;Lokhttp3/u;)V

    .line 150
    .line 151
    .line 152
    move-object v3, v7

    .line 153
    goto :goto_4

    .line 154
    :cond_7
    const-string v7, "Content-Type"

    .line 155
    .line 156
    iget-object v2, v2, Lokhttp3/u;->a:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v6, v7, v2}, Lkotlin/jvm/internal/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_4
    iget-object v2, v5, Lretrofit2/k0;->e:Lokhttp3/b0;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iput-object v1, v2, Lokhttp3/b0;->a:Lokhttp3/r;

    .line 167
    .line 168
    invoke-virtual {v6}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Lokhttp3/q;->c()Lkotlin/jvm/internal/o;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, v2, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 177
    .line 178
    iget-object v1, v5, Lretrofit2/k0;->a:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v2, v1, v3}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Lretrofit2/s;

    .line 184
    .line 185
    iget-object v3, v0, Lretrofit2/m0;->a:Ljava/lang/Class;

    .line 186
    .line 187
    iget-object v0, v0, Lretrofit2/m0;->b:Ljava/lang/reflect/Method;

    .line 188
    .line 189
    iget-object v5, p0, Lretrofit2/x;->b:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-direct {v1, v3, v5, v0, v4}, Lretrofit2/s;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;)V

    .line 192
    .line 193
    .line 194
    const-class v0, Lretrofit2/s;

    .line 195
    .line 196
    invoke-virtual {v2, v0, v1}, Lokhttp3/b0;->e(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v1, p0, Lretrofit2/x;->d:Lokhttp3/d;

    .line 204
    .line 205
    check-cast v1, Lokhttp3/z;

    .line 206
    .line 207
    invoke-virtual {v1, v0}, Lokhttp3/z;->c(Lokhttp3/c0;)Lokhttp3/internal/connection/i;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 213
    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v2, "Malformed URL. Base: "

    .line 217
    .line 218
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, ", Relative: "

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-object v2, v5, Lretrofit2/k0;->c:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 243
    .line 244
    const-string v2, "Argument count ("

    .line 245
    .line 246
    const-string v4, ") doesn\'t match expected count ("

    .line 247
    .line 248
    invoke-static {v3, v2, v4}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    array-length v1, v1

    .line 253
    const-string v3, ")"

    .line 254
    .line 255
    invoke-static {v2, v3, v1}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lretrofit2/x;->f:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;

    .line 6
    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lokhttp3/internal/connection/i;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lretrofit2/x;

    iget-object v4, p0, Lretrofit2/x;->d:Lokhttp3/d;

    iget-object v5, p0, Lretrofit2/x;->e:Lretrofit2/m;

    iget-object v1, p0, Lretrofit2/x;->a:Lretrofit2/m0;

    iget-object v2, p0, Lretrofit2/x;->b:Ljava/lang/Object;

    iget-object v3, p0, Lretrofit2/x;->c:[Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lretrofit2/x;-><init>(Lretrofit2/m0;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/d;Lretrofit2/m;)V

    return-object v0
.end method

.method public final clone()Lretrofit2/e;
    .locals 6

    .line 2
    new-instance v0, Lretrofit2/x;

    iget-object v4, p0, Lretrofit2/x;->d:Lokhttp3/d;

    iget-object v5, p0, Lretrofit2/x;->e:Lretrofit2/m;

    iget-object v1, p0, Lretrofit2/x;->a:Lretrofit2/m0;

    iget-object v2, p0, Lretrofit2/x;->b:Ljava/lang/Object;

    iget-object v3, p0, Lretrofit2/x;->c:[Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lretrofit2/x;-><init>(Lretrofit2/m0;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/d;Lretrofit2/m;)V

    return-object v0
.end method

.method public final d()Lretrofit2/n0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lretrofit2/x;->i:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lretrofit2/x;->i:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lretrofit2/x;->e()Lokhttp3/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-boolean v1, p0, Lretrofit2/x;->f:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Lokhttp3/internal/connection/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Lokhttp3/internal/connection/i;->cancel()V

    .line 22
    .line 23
    .line 24
    :cond_0
    check-cast v0, Lokhttp3/internal/connection/i;

    .line 25
    .line 26
    invoke-virtual {v0}, Lokhttp3/internal/connection/i;->h()Lokhttp3/i0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lretrofit2/x;->f(Lokhttp3/i0;)Lretrofit2/n0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "Already executed."

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
.end method

.method public final e()Lokhttp3/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lretrofit2/x;->h:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    instance-of v1, v0, Ljava/io/IOException;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    check-cast v0, Ljava/lang/Error;

    .line 22
    .line 23
    throw v0

    .line 24
    :cond_2
    check-cast v0, Ljava/io/IOException;

    .line 25
    .line 26
    throw v0

    .line 27
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lretrofit2/x;->c()Lokhttp3/internal/connection/i;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_2
    move-exception v0

    .line 39
    :goto_0
    invoke-static {v0}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lretrofit2/x;->h:Ljava/lang/Throwable;

    .line 43
    .line 44
    throw v0
.end method

.method public final f(Lokhttp3/i0;)Lretrofit2/n0;
    .locals 6

    .line 1
    iget-object v0, p1, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lretrofit2/w;

    .line 8
    .line 9
    invoke-virtual {v0}, Lokhttp3/m0;->contentType()Lokhttp3/u;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Lokhttp3/m0;->contentLength()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lretrofit2/w;-><init>(Lokhttp3/u;J)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p1, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 21
    .line 22
    invoke-virtual {p1}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget v1, p1, Lokhttp3/i0;->d:I

    .line 27
    .line 28
    const/16 v2, 0xc8

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-lt v1, v2, :cond_6

    .line 32
    .line 33
    const/16 v2, 0x12c

    .line 34
    .line 35
    if-lt v1, v2, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const/16 v2, 0xcc

    .line 39
    .line 40
    const-string v4, "rawResponse must be successful response"

    .line 41
    .line 42
    if-eq v1, v2, :cond_4

    .line 43
    .line 44
    const/16 v2, 0xcd

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v1, Lm4/f;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lm4/f;-><init>(Lokhttp3/m0;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    iget-object v0, p0, Lretrofit2/x;->e:Lretrofit2/m;

    .line 55
    .line 56
    invoke-interface {v0, v1}, Lretrofit2/m;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1}, Lokhttp3/i0;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    new-instance v2, Lretrofit2/n0;

    .line 67
    .line 68
    invoke-direct {v2, p1, v0}, Lretrofit2/n0;-><init>(Lokhttp3/i0;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :catch_0
    move-exception p1

    .line 79
    iget-object v0, v1, Lm4/f;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/io/IOException;

    .line 82
    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    throw p1

    .line 86
    :cond_3
    throw v0

    .line 87
    :cond_4
    :goto_0
    invoke-virtual {v0}, Lokhttp3/m0;->close()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lokhttp3/i0;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    new-instance v0, Lretrofit2/n0;

    .line 97
    .line 98
    invoke-direct {v0, p1, v3}, Lretrofit2/n0;-><init>(Lokhttp3/i0;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_6
    :goto_1
    :try_start_1
    new-instance v1, Lokio/Buffer;

    .line 109
    .line 110
    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lokhttp3/m0;->source()Lokio/BufferedSource;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v2, v1}, Lokio/BufferedSource;->readAll(Lokio/Sink;)J

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lokhttp3/m0;->contentType()Lokhttp3/u;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0}, Lokhttp3/m0;->contentLength()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    invoke-static {v2, v4, v5, v1}, Lokhttp3/m0;->create(Lokhttp3/u;JLokio/BufferedSource;)Lokhttp3/m0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "body == null"

    .line 133
    .line 134
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lokhttp3/i0;->b()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_7

    .line 142
    .line 143
    new-instance v1, Lretrofit2/n0;

    .line 144
    .line 145
    invoke-direct {v1, p1, v3}, Lretrofit2/n0;-><init>(Lokhttp3/i0;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lokhttp3/m0;->close()V

    .line 149
    .line 150
    .line 151
    return-object v1

    .line 152
    :cond_7
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    const-string v1, "rawResponse should not be successful response"

    .line 155
    .line 156
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    :catchall_0
    move-exception p1

    .line 161
    invoke-virtual {v0}, Lokhttp3/m0;->close()V

    .line 162
    .line 163
    .line 164
    throw p1
.end method

.method public final isCanceled()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lretrofit2/x;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lretrofit2/x;->g:Lokhttp3/internal/connection/i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, v0, Lokhttp3/internal/connection/i;->n:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 v1, 0x0

    .line 20
    :goto_0
    monitor-exit p0

    .line 21
    return v1

    .line 22
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0
.end method
