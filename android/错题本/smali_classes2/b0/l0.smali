.class public final Lb0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/i;
.implements Lb0/h;


# instance fields
.field public final a:Lb0/j;

.field public final b:Lcom/bumptech/glide/load/engine/b;

.field public c:I

.field public d:Lb0/e;

.field public e:Ljava/lang/Object;

.field public volatile f:Lf0/o;

.field public g:Lb0/f;


# direct methods
.method public constructor <init>(Lb0/j;Lcom/bumptech/glide/load/engine/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/l0;->a:Lb0/j;

    .line 5
    .line 6
    iput-object p2, p0, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ly/c;Ljava/lang/Exception;Lz/e;Lcom/bumptech/glide/load/DataSource;)V
    .locals 1

    .line 1
    iget-object p4, p0, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 4
    .line 5
    iget-object v0, v0, Lf0/o;->c:Lz/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/bumptech/glide/load/engine/b;->a(Ly/c;Ljava/lang/Exception;Lz/e;Lcom/bumptech/glide/load/DataSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(Ly/c;Ljava/lang/Object;Lz/e;Lcom/bumptech/glide/load/DataSource;Ly/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object p4, p0, Lb0/l0;->f:Lf0/o;

    .line 4
    .line 5
    iget-object p4, p4, Lf0/o;->c:Lz/e;

    .line 6
    .line 7
    invoke-interface {p4}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object v5, p1

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move-object v3, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/b;->b(Ly/c;Ljava/lang/Object;Lz/e;Lcom/bumptech/glide/load/DataSource;Ly/c;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lf0/o;->c:Lz/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lz/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 14

    .line 1
    iget-object v0, p0, Lb0/l0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iput-object v3, p0, Lb0/l0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v4, "SourceGenerator"

    .line 11
    .line 12
    const-string v5, "Finished encoding source to cache, key: "

    .line 13
    .line 14
    sget v6, Lv0/f;->b:I

    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 17
    .line 18
    .line 19
    move-result-wide v6

    .line 20
    :try_start_0
    iget-object v8, p0, Lb0/l0;->a:Lb0/j;

    .line 21
    .line 22
    invoke-virtual {v8, v0}, Lb0/j;->d(Ljava/lang/Object;)Ly/a;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    new-instance v9, Lb0/g;

    .line 27
    .line 28
    iget-object v10, p0, Lb0/l0;->a:Lb0/j;

    .line 29
    .line 30
    iget-object v10, v10, Lb0/j;->i:Ly/f;

    .line 31
    .line 32
    invoke-direct {v9, v8, v0, v2, v10}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v10, Lb0/f;

    .line 36
    .line 37
    iget-object v11, p0, Lb0/l0;->f:Lf0/o;

    .line 38
    .line 39
    iget-object v11, v11, Lf0/o;->a:Ly/c;

    .line 40
    .line 41
    iget-object v12, p0, Lb0/l0;->a:Lb0/j;

    .line 42
    .line 43
    iget-object v13, v12, Lb0/j;->n:Ly/c;

    .line 44
    .line 45
    invoke-direct {v10, v11, v13}, Lb0/f;-><init>(Ly/c;Ly/c;)V

    .line 46
    .line 47
    .line 48
    iput-object v10, p0, Lb0/l0;->g:Lb0/f;

    .line 49
    .line 50
    iget-object v10, v12, Lb0/j;->h:Lb0/t;

    .line 51
    .line 52
    invoke-virtual {v10}, Lb0/t;->a()Ld0/a;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    iget-object v11, p0, Lb0/l0;->g:Lb0/f;

    .line 57
    .line 58
    invoke-interface {v10, v11, v9}, Ld0/a;->c(Ly/c;Lb0/g;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_0

    .line 66
    .line 67
    new-instance v9, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v5, p0, Lb0/l0;->g:Lb0/f;

    .line 73
    .line 74
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, ", data: "

    .line 78
    .line 79
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", encoder: "

    .line 86
    .line 87
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, ", duration: "

    .line 94
    .line 95
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-static {v6, v7}, Lv0/f;->a(J)D

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto :goto_1

    .line 115
    :cond_0
    :goto_0
    iget-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 116
    .line 117
    iget-object v0, v0, Lf0/o;->c:Lz/e;

    .line 118
    .line 119
    invoke-interface {v0}, Lz/e;->a()V

    .line 120
    .line 121
    .line 122
    new-instance v0, Lb0/e;

    .line 123
    .line 124
    iget-object v4, p0, Lb0/l0;->f:Lf0/o;

    .line 125
    .line 126
    iget-object v4, v4, Lf0/o;->a:Ly/c;

    .line 127
    .line 128
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iget-object v5, p0, Lb0/l0;->a:Lb0/j;

    .line 133
    .line 134
    invoke-direct {v0, v4, v5, p0}, Lb0/e;-><init>(Ljava/util/List;Lb0/j;Lb0/h;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p0, Lb0/l0;->d:Lb0/e;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_1
    iget-object v1, p0, Lb0/l0;->f:Lf0/o;

    .line 141
    .line 142
    iget-object v1, v1, Lf0/o;->c:Lz/e;

    .line 143
    .line 144
    invoke-interface {v1}, Lz/e;->a()V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_1
    :goto_2
    iget-object v0, p0, Lb0/l0;->d:Lb0/e;

    .line 149
    .line 150
    const/4 v4, 0x1

    .line 151
    if-eqz v0, :cond_2

    .line 152
    .line 153
    invoke-virtual {v0}, Lb0/e;->d()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_2

    .line 158
    .line 159
    return v4

    .line 160
    :cond_2
    iput-object v3, p0, Lb0/l0;->d:Lb0/e;

    .line 161
    .line 162
    iput-object v3, p0, Lb0/l0;->f:Lf0/o;

    .line 163
    .line 164
    :cond_3
    :goto_3
    if-nez v2, :cond_5

    .line 165
    .line 166
    iget v0, p0, Lb0/l0;->c:I

    .line 167
    .line 168
    iget-object v3, p0, Lb0/l0;->a:Lb0/j;

    .line 169
    .line 170
    invoke-virtual {v3}, Lb0/j;->b()Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-ge v0, v3, :cond_5

    .line 179
    .line 180
    iget-object v0, p0, Lb0/l0;->a:Lb0/j;

    .line 181
    .line 182
    invoke-virtual {v0}, Lb0/j;->b()Ljava/util/ArrayList;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget v3, p0, Lb0/l0;->c:I

    .line 187
    .line 188
    add-int/lit8 v5, v3, 0x1

    .line 189
    .line 190
    iput v5, p0, Lb0/l0;->c:I

    .line 191
    .line 192
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lf0/o;

    .line 197
    .line 198
    iput-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 199
    .line 200
    iget-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 201
    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    iget-object v0, p0, Lb0/l0;->a:Lb0/j;

    .line 205
    .line 206
    iget-object v0, v0, Lb0/j;->p:Lb0/o;

    .line 207
    .line 208
    iget-object v3, p0, Lb0/l0;->f:Lf0/o;

    .line 209
    .line 210
    iget-object v3, v3, Lf0/o;->c:Lz/e;

    .line 211
    .line 212
    invoke-interface {v3}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v0, v3}, Lb0/o;->c(Lcom/bumptech/glide/load/DataSource;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-nez v0, :cond_4

    .line 221
    .line 222
    iget-object v0, p0, Lb0/l0;->a:Lb0/j;

    .line 223
    .line 224
    iget-object v3, p0, Lb0/l0;->f:Lf0/o;

    .line 225
    .line 226
    iget-object v3, v3, Lf0/o;->c:Lz/e;

    .line 227
    .line 228
    invoke-interface {v3}, Lz/e;->b()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v0, v3}, Lb0/j;->c(Ljava/lang/Class;)Lb0/e0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_3

    .line 237
    .line 238
    :cond_4
    iget-object v0, p0, Lb0/l0;->f:Lf0/o;

    .line 239
    .line 240
    iget-object v2, p0, Lb0/l0;->f:Lf0/o;

    .line 241
    .line 242
    iget-object v2, v2, Lf0/o;->c:Lz/e;

    .line 243
    .line 244
    iget-object v3, p0, Lb0/l0;->a:Lb0/j;

    .line 245
    .line 246
    iget-object v3, v3, Lb0/j;->o:Lcom/bumptech/glide/Priority;

    .line 247
    .line 248
    new-instance v5, Landroid/support/v4/media/h;

    .line 249
    .line 250
    invoke-direct {v5, v1, p0, v0}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v2, v3, v5}, Lz/e;->e(Lcom/bumptech/glide/Priority;Lz/d;)V

    .line 254
    .line 255
    .line 256
    move v2, v4

    .line 257
    goto :goto_3

    .line 258
    :cond_5
    return v2
.end method
