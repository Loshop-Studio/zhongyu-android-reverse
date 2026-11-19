.class public abstract Lcoil3/intercept/EngineInterceptorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcoil3/intercept/EngineInterceptor$b;Ly/e;Ly/k;Lcoil3/b;Lcoil3/util/Logger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->s:I

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
    iput v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lcoil3/intercept/EngineInterceptorKt$transform$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->r:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->s:I

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
    iget v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->p:I

    .line 43
    .line 44
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->o:I

    .line 45
    .line 46
    iget v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->n:I

    .line 47
    .line 48
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Landroid/graphics/Bitmap;

    .line 51
    .line 52
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->l:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v8}, Lk/r;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->k:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Landroid/graphics/Bitmap;

    .line 60
    .line 61
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Landroid/graphics/Bitmap;

    .line 64
    .line 65
    iget-object v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v9, Ljava/util/List;

    .line 68
    .line 69
    iget-object v10, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v10, Landroid/graphics/Bitmap;

    .line 72
    .line 73
    iget-object v11, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v11, Lk/j;

    .line 76
    .line 77
    iget-object v12, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v12, Ljava/util/List;

    .line 80
    .line 81
    iget-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v13}, Lk/r;->a(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v13, Lcoil3/b;

    .line 89
    .line 90
    iget-object v14, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v14, Ly/k;

    .line 93
    .line 94
    iget-object v15, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v15, Ly/e;

    .line 97
    .line 98
    iget-object v4, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Lcoil3/intercept/EngineInterceptor$b;

    .line 101
    .line 102
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v1, Landroid/graphics/Bitmap;

    .line 106
    .line 107
    invoke-interface {v2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 108
    .line 109
    .line 110
    move-result-object v16

    .line 111
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/JobKt;->ensureActive(Lkotlin/coroutines/CoroutineContext;)V

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
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static/range {p1 .. p1}, Ly/f;->e(Ly/e;)Ljava/util/List;

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
    invoke-static/range {p1 .. p1}, Ly/f;->b(Ly/e;)Z

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
    sget-object v1, Lcoil3/util/Logger$Level;->c:Lcoil3/util/Logger$Level;

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
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-interface {v2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

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
    invoke-static {v11, v1, v9, v0}, Lq/a;->a(Lk/j;Ly/k;Ljava/util/List;Lcoil3/util/Logger;)Landroid/graphics/Bitmap;

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
    invoke-virtual {v4, v3, v8}, Lcoil3/b;->p(Ly/e;Landroid/graphics/Bitmap;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    move-object/from16 v12, p0

    .line 235
    .line 236
    move-object v14, v1

    .line 237
    move-object v15, v3

    .line 238
    move-object v13, v4

    .line 239
    move-object v1, v8

    .line 240
    move-object v10, v1

    .line 241
    move-object/from16 v16, v9

    .line 242
    .line 243
    const/4 v3, 0x0

    .line 244
    const/4 v4, 0x0

    .line 245
    :goto_1
    if-lt v3, v7, :cond_6

    .line 246
    .line 247
    invoke-virtual {v13, v15, v1}, Lcoil3/b;->o(Ly/e;Landroid/graphics/Bitmap;)V

    .line 248
    .line 249
    .line 250
    const/4 v0, 0x0

    .line 251
    invoke-static {v1, v0, v5, v6}, Lk/o;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk/a;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    const/16 v17, 0xe

    .line 256
    .line 257
    const/16 v18, 0x0

    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/4 v15, 0x0

    .line 261
    const/16 v16, 0x0

    .line 262
    .line 263
    invoke-static/range {v12 .. v18}, Lcoil3/intercept/EngineInterceptor$b;->b(Lcoil3/intercept/EngineInterceptor$b;Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;ILjava/lang/Object;)Lcoil3/intercept/EngineInterceptor$b;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0

    .line 268
    :cond_6
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v17

    .line 272
    invoke-static/range {v17 .. v17}, Lk/r;->a(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v14}, Ly/k;->k()Lz/e;

    .line 276
    .line 277
    .line 278
    iput-object v12, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->a:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v15, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->b:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v14, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v13, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 285
    .line 286
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 291
    .line 292
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:Ljava/lang/Object;

    .line 297
    .line 298
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->h:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:Ljava/lang/Object;

    .line 311
    .line 312
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->j:Ljava/lang/Object;

    .line 317
    .line 318
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->k:Ljava/lang/Object;

    .line 323
    .line 324
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->l:Ljava/lang/Object;

    .line 329
    .line 330
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->m:Ljava/lang/Object;

    .line 335
    .line 336
    iput v4, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->n:I

    .line 337
    .line 338
    iput v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->o:I

    .line 339
    .line 340
    iput v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->p:I

    .line 341
    .line 342
    const/4 v0, 0x0

    .line 343
    iput v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->q:I

    .line 344
    .line 345
    iput v5, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->s:I

    .line 346
    .line 347
    throw v6
.end method
