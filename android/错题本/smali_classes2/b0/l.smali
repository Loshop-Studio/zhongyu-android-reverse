.class public final Lb0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/List;

.field public final c:Ln0/a;

.field public final d:Landroidx/core/util/Pools$Pool;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ln0/a;Lw0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/l;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p4, p0, Lb0/l;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p5, p0, Lb0/l;->c:Ln0/a;

    .line 9
    .line 10
    iput-object p6, p0, Lb0/l;->d:Landroidx/core/util/Pools$Pool;

    .line 11
    .line 12
    new-instance p4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p5, "Failed DecodePath{"

    .line 15
    .line 16
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, "->"

    .line 27
    .line 28
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string/jumbo p1, "}"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lb0/l;->e:Ljava/lang/String;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(IILandroid/support/v4/media/h;Ly/f;Lz/g;)Lb0/g0;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    iget-object v7, v1, Lb0/l;->d:Landroidx/core/util/Pools$Pool;

    .line 6
    .line 7
    invoke-interface {v7}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "Argument must not be null"

    .line 12
    .line 13
    invoke-static {v2, v3}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v6, v2

    .line 17
    check-cast v6, Ljava/util/List;

    .line 18
    .line 19
    move/from16 v3, p1

    .line 20
    .line 21
    move/from16 v4, p2

    .line 22
    .line 23
    move-object/from16 v5, p4

    .line 24
    .line 25
    move-object/from16 v2, p5

    .line 26
    .line 27
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lb0/l;->b(Lz/g;IILy/f;Ljava/util/List;)Lb0/g0;

    .line 28
    .line 29
    .line 30
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-interface {v7, v6}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v3, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lcom/bumptech/glide/load/engine/b;

    .line 37
    .line 38
    iget-object v0, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lcom/bumptech/glide/load/DataSource;

    .line 41
    .line 42
    iget-object v4, v3, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 43
    .line 44
    invoke-interface {v2}, Lb0/g0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    sget-object v5, Lcom/bumptech/glide/load/DataSource;->RESOURCE_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eq v0, v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4, v13}, Lb0/j;->e(Ljava/lang/Class;)Ly/i;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v7, v3, Lcom/bumptech/glide/load/engine/b;->h:Lcom/bumptech/glide/c;

    .line 62
    .line 63
    iget v8, v3, Lcom/bumptech/glide/load/engine/b;->l:I

    .line 64
    .line 65
    iget v9, v3, Lcom/bumptech/glide/load/engine/b;->m:I

    .line 66
    .line 67
    invoke-interface {v5, v7, v2, v8, v9}, Ly/i;->a(Landroid/content/Context;Lb0/g0;II)Lb0/g0;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move-object v12, v5

    .line 72
    move-object v5, v7

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move-object v5, v2

    .line 75
    move-object v12, v6

    .line 76
    :goto_0
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_1

    .line 81
    .line 82
    invoke-interface {v2}, Lb0/g0;->recycle()V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v2, v4, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 86
    .line 87
    iget-object v2, v2, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 88
    .line 89
    iget-object v2, v2, Lcom/bumptech/glide/d;->d:Lkotlin/jvm/internal/o;

    .line 90
    .line 91
    invoke-interface {v5}, Lb0/g0;->a()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-virtual {v2, v7}, Lkotlin/jvm/internal/o;->g(Ljava/lang/Class;)Ly/h;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_3

    .line 100
    .line 101
    iget-object v2, v4, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 102
    .line 103
    iget-object v2, v2, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 104
    .line 105
    iget-object v2, v2, Lcom/bumptech/glide/d;->d:Lkotlin/jvm/internal/o;

    .line 106
    .line 107
    invoke-interface {v5}, Lb0/g0;->a()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/o;->g(Ljava/lang/Class;)Ly/h;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-eqz v6, :cond_2

    .line 116
    .line 117
    iget-object v2, v3, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 118
    .line 119
    invoke-interface {v6, v2}, Ly/h;->g(Ly/f;)Lcom/bumptech/glide/load/EncodeStrategy;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :goto_1
    move-object v15, v6

    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 126
    .line 127
    invoke-interface {v5}, Lb0/g0;->a()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {v0, v2}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_3
    sget-object v2, Lcom/bumptech/glide/load/EncodeStrategy;->NONE:Lcom/bumptech/glide/load/EncodeStrategy;

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :goto_2
    iget-object v6, v3, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 139
    .line 140
    invoke-virtual {v4}, Lb0/j;->b()Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    const/4 v9, 0x0

    .line 149
    move v10, v9

    .line 150
    :goto_3
    const/4 v11, 0x1

    .line 151
    if-ge v10, v8, :cond_5

    .line 152
    .line 153
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    check-cast v14, Lf0/o;

    .line 158
    .line 159
    iget-object v14, v14, Lf0/o;->a:Ly/c;

    .line 160
    .line 161
    invoke-interface {v14, v6}, Ly/c;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-eqz v14, :cond_4

    .line 166
    .line 167
    move v6, v11

    .line 168
    goto :goto_4

    .line 169
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    move v6, v9

    .line 173
    :goto_4
    xor-int/2addr v6, v11

    .line 174
    iget-object v7, v3, Lcom/bumptech/glide/load/engine/b;->n:Lb0/o;

    .line 175
    .line 176
    invoke-virtual {v7, v6, v0, v2}, Lb0/o;->d(ZLcom/bumptech/glide/load/DataSource;Lcom/bumptech/glide/load/EncodeStrategy;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    if-eqz v15, :cond_8

    .line 183
    .line 184
    sget-object v0, Lcom/bumptech/glide/load/engine/a;->c:[I

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    aget v0, v0, v6

    .line 191
    .line 192
    if-eq v0, v11, :cond_7

    .line 193
    .line 194
    const/4 v6, 0x2

    .line 195
    if-ne v0, v6, :cond_6

    .line 196
    .line 197
    new-instance v6, Lb0/i0;

    .line 198
    .line 199
    iget-object v0, v4, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 200
    .line 201
    iget-object v7, v0, Lcom/bumptech/glide/c;->a:Lc0/g;

    .line 202
    .line 203
    iget-object v8, v3, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 204
    .line 205
    move v0, v9

    .line 206
    iget-object v9, v3, Lcom/bumptech/glide/load/engine/b;->i:Ly/c;

    .line 207
    .line 208
    iget v10, v3, Lcom/bumptech/glide/load/engine/b;->l:I

    .line 209
    .line 210
    move v2, v11

    .line 211
    iget v11, v3, Lcom/bumptech/glide/load/engine/b;->m:I

    .line 212
    .line 213
    iget-object v14, v3, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 214
    .line 215
    move v4, v2

    .line 216
    invoke-direct/range {v6 .. v14}, Lb0/i0;-><init>(Lc0/g;Ly/c;Ly/c;IILy/i;Ljava/lang/Class;Ly/f;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 221
    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v4, "Unknown strategy: "

    .line 225
    .line 226
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_7
    move v0, v9

    .line 241
    move v4, v11

    .line 242
    new-instance v6, Lb0/f;

    .line 243
    .line 244
    iget-object v2, v3, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 245
    .line 246
    iget-object v7, v3, Lcom/bumptech/glide/load/engine/b;->i:Ly/c;

    .line 247
    .line 248
    invoke-direct {v6, v2, v7}, Lb0/f;-><init>(Ly/c;Ly/c;)V

    .line 249
    .line 250
    .line 251
    :goto_5
    sget-object v2, Lb0/f0;->e:Lw0/d;

    .line 252
    .line 253
    invoke-virtual {v2}, Lw0/d;->acquire()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Lb0/f0;

    .line 258
    .line 259
    iput-boolean v0, v2, Lb0/f0;->d:Z

    .line 260
    .line 261
    iput-boolean v4, v2, Lb0/f0;->c:Z

    .line 262
    .line 263
    iput-object v5, v2, Lb0/f0;->b:Lb0/g0;

    .line 264
    .line 265
    iget-object v0, v3, Lcom/bumptech/glide/load/engine/b;->f:Lb0/g;

    .line 266
    .line 267
    iput-object v6, v0, Lb0/g;->b:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v15, v0, Lb0/g;->c:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v2, v0, Lb0/g;->d:Ljava/lang/Object;

    .line 272
    .line 273
    move-object v5, v2

    .line 274
    goto :goto_6

    .line 275
    :cond_8
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 276
    .line 277
    invoke-interface {v5}, Lb0/g0;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-direct {v0, v2}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 286
    .line 287
    .line 288
    throw v0

    .line 289
    :cond_9
    :goto_6
    iget-object v0, v1, Lb0/l;->c:Ln0/a;

    .line 290
    .line 291
    move-object/from16 v2, p4

    .line 292
    .line 293
    invoke-interface {v0, v5, v2}, Ln0/a;->a(Lb0/g0;Ly/f;)Lb0/g0;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    return-object v0

    .line 298
    :catchall_0
    move-exception v0

    .line 299
    invoke-interface {v7, v6}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    throw v0
.end method

.method public final b(Lz/g;IILy/f;Ljava/util/List;)Lb0/g0;
    .locals 9

    .line 1
    iget-object v0, p0, Lb0/l;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ly/g;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1}, Lz/g;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-interface {v4, v5, p4}, Ly/g;->a(Ljava/lang/Object;Ly/f;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Lz/g;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5, p2, p3, p4}, Ly/g;->b(Ljava/lang/Object;IILy/f;)Lb0/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception v5

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception v5

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception v5

    .line 41
    :goto_1
    const/4 v6, 0x2

    .line 42
    const-string v7, "DecodePath"

    .line 43
    .line 44
    invoke-static {v7, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    new-instance v6, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v8, "Failed to decode data for "

    .line 53
    .line 54
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v7, v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 80
    .line 81
    new-instance p2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    iget-object p3, p0, Lb0/l;->e:Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct {p1, p3, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DecodePath{ dataClass="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lb0/l;->a:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", decoders="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lb0/l;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", transcoder="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lb0/l;->c:Ln0/a;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x7d

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
