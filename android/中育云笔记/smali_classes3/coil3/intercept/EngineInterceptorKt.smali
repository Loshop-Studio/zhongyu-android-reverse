.class public abstract Lcoil3/intercept/EngineInterceptorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcoil3/intercept/EngineInterceptor$b;Lw/g;Lw/n;Lcoil3/b;Lcoil3/util/Logger;Lvc/c;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 11
    .line 12
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lcoil3/intercept/EngineInterceptorKt$transform$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->t:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v5, :cond_1

    .line 41
    .line 42
    iget v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->r:I

    .line 43
    .line 44
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->q:I

    .line 45
    .line 46
    iget v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->p:I

    .line 47
    .line 48
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Landroid/graphics/Bitmap;

    .line 51
    .line 52
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->n:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v8}, Lk/r;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Landroid/graphics/Bitmap;

    .line 60
    .line 61
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->l:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Landroid/graphics/Bitmap;

    .line 64
    .line 65
    iget-object v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->k:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v9, Ljava/util/List;

    .line 68
    .line 69
    iget-object v10, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v10, Landroid/graphics/Bitmap;

    .line 72
    .line 73
    iget-object v11, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v11, Lk/j;

    .line 76
    .line 77
    iget-object v12, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v12, Ljava/util/List;

    .line 80
    .line 81
    iget-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v13}, Lk/r;->a(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v13, Lcoil3/b;

    .line 89
    .line 90
    iget-object v14, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v14, Lw/n;

    .line 93
    .line 94
    iget-object v15, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v15, Lw/g;

    .line 97
    .line 98
    iget-object v4, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Lcoil3/intercept/EngineInterceptor$b;

    .line 101
    .line 102
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v1, Landroid/graphics/Bitmap;

    .line 106
    .line 107
    invoke-interface {v2}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 108
    .line 109
    .line 110
    move-result-object v16

    .line 111
    invoke-static/range {v16 .. v16}, Lsd/o1;->i(Lkotlin/coroutines/d;)V

    .line 112
    .line 113
    .line 114
    add-int/2addr v3, v5

    .line 115
    move-object/from16 v16, v12

    .line 116
    .line 117
    move-object v12, v4

    .line 118
    move v4, v7

    .line 119
    move v7, v0

    .line 120
    move-object v0, v6

    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_2
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static/range {p1 .. p1}, Lw/h;->e(Lw/g;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_3

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    instance-of v1, v11, Lk/a;

    .line 150
    .line 151
    if-nez v1, :cond_5

    .line 152
    .line 153
    invoke-static/range {p1 .. p1}, Lw/h;->b(Lw/g;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_5

    .line 158
    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    sget-object v1, Lcoil3/util/Logger$Level;->e:Lcoil3/util/Logger$Level;

    .line 162
    .line 163
    invoke-interface {v0}, Lcoil3/util/Logger;->a()Lcoil3/util/Logger$Level;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-gtz v2, :cond_4

    .line 172
    .line 173
    invoke-virtual/range {p0 .. p0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-interface {v2}, Lod/c;->f()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    new-instance v3, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v4, "allowConversionToBitmap=false, skipping transformations for type "

    .line 195
    .line 196
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const/16 v2, 0x2e

    .line 203
    .line 204
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const-string v3, "EngineInterceptor"

    .line 212
    .line 213
    invoke-interface {v0, v3, v1, v2, v6}, Lcoil3/util/Logger;->b(Ljava/lang/String;Lcoil3/util/Logger$Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    :cond_4
    return-object p0

    .line 217
    :cond_5
    move-object/from16 v1, p2

    .line 218
    .line 219
    invoke-static {v11, v1, v9, v0}, Lo/a;->a(Lk/j;Lw/n;Ljava/util/List;Lcoil3/util/Logger;)Landroid/graphics/Bitmap;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    move-object/from16 v3, p1

    .line 224
    .line 225
    move-object/from16 v4, p3

    .line 226
    .line 227
    invoke-virtual {v4, v3, v8}, Lcoil3/b;->p(Lw/g;Landroid/graphics/Bitmap;)V

    .line 228
    .line 229
    .line 230
    move-object v7, v9

    .line 231
    check-cast v7, Ljava/util/Collection;

    .line 232
    .line 233
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    move-object/from16 v12, p0

    .line 238
    .line 239
    move-object v14, v1

    .line 240
    move-object v15, v3

    .line 241
    move-object v13, v4

    .line 242
    move-object v1, v8

    .line 243
    move-object v10, v1

    .line 244
    move-object/from16 v16, v9

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    const/4 v4, 0x0

    .line 248
    :goto_1
    if-lt v3, v7, :cond_6

    .line 249
    .line 250
    invoke-virtual {v13, v15, v1}, Lcoil3/b;->o(Lw/g;Landroid/graphics/Bitmap;)V

    .line 251
    .line 252
    .line 253
    const/4 v0, 0x0

    .line 254
    invoke-static {v1, v0, v5, v6}, Lk/o;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk/a;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    const/16 v17, 0xe

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    invoke-static/range {v12 .. v18}, Lcoil3/intercept/EngineInterceptor$b;->b(Lcoil3/intercept/EngineInterceptor$b;Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;ILjava/lang/Object;)Lcoil3/intercept/EngineInterceptor$b;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :cond_6
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v17

    .line 275
    invoke-static/range {v17 .. v17}, Lk/r;->a(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v14}, Lw/n;->k()Lx/e;

    .line 279
    .line 280
    .line 281
    iput-object v12, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v15, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v14, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:Ljava/lang/Object;

    .line 294
    .line 295
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->h:Ljava/lang/Object;

    .line 300
    .line 301
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:Ljava/lang/Object;

    .line 306
    .line 307
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->j:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->k:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->l:Ljava/lang/Object;

    .line 320
    .line 321
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->m:Ljava/lang/Object;

    .line 326
    .line 327
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->n:Ljava/lang/Object;

    .line 332
    .line 333
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->o:Ljava/lang/Object;

    .line 338
    .line 339
    iput v4, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->p:I

    .line 340
    .line 341
    iput v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->q:I

    .line 342
    .line 343
    iput v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->r:I

    .line 344
    .line 345
    const/4 v0, 0x0

    .line 346
    iput v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->s:I

    .line 347
    .line 348
    iput v5, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->u:I

    .line 349
    .line 350
    throw v6
.end method
