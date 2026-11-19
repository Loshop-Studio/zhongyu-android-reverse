.class public final Lcom/xuexiang/xui/widget/imageview/edit/d;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field public a:[I

.field public b:Landroid/media/effect/EffectContext;

.field public c:Landroid/media/effect/Effect;

.field public d:Lcom/xuexiang/xui/widget/imageview/edit/f;

.field public e:I

.field public f:I

.field public g:Z

.field public h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

.field public i:Landroid/graphics/Bitmap;


# virtual methods
.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 10

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->a:[I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->d:Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_5

    .line 10
    .line 11
    invoke-static {}, Landroid/media/effect/EffectContext;->createWithCurrentGlContext()Landroid/media/effect/EffectContext;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->b:Landroid/media/effect/EffectContext;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v1, 0x8b31

    .line 21
    .line 22
    .line 23
    const-string v4, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n"

    .line 24
    .line 25
    invoke-static {v1, v4}, Lv7/l;->q(ILjava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_0
    move v5, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const v4, 0x8b30

    .line 34
    .line 35
    .line 36
    const-string v5, "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n"

    .line 37
    .line 38
    invoke-static {v4, v5}, Lv7/l;->q(ILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    invoke-static {v5, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 52
    .line 53
    .line 54
    const-string v1, "glAttachShader"

    .line 55
    .line 56
    invoke-static {v1}, Lv7/l;->c(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lv7/l;->c(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v5}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 66
    .line 67
    .line 68
    new-array v1, v2, [I

    .line 69
    .line 70
    const v4, 0x8b82

    .line 71
    .line 72
    .line 73
    invoke-static {v5, v4, v1, v3}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 74
    .line 75
    .line 76
    aget v1, v1, v3

    .line 77
    .line 78
    if-ne v1, v2, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {v5}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v5}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ljava/lang/RuntimeException;

    .line 89
    .line 90
    const-string v1, "Could not link program: "

    .line 91
    .line 92
    invoke-static {v1, p1}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_3
    :goto_1
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->a:I

    .line 101
    .line 102
    const-string v1, "tex_sampler"

    .line 103
    .line 104
    invoke-static {v5, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->b:I

    .line 109
    .line 110
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->a:I

    .line 111
    .line 112
    const-string v4, "a_texcoord"

    .line 113
    .line 114
    invoke-static {v1, v4}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->c:I

    .line 119
    .line 120
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->a:I

    .line 121
    .line 122
    const-string v4, "a_position"

    .line 123
    .line 124
    invoke-static {v1, v4}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->d:I

    .line 129
    .line 130
    const/16 v1, 0x20

    .line 131
    .line 132
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    iput-object v4, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->e:Ljava/nio/FloatBuffer;

    .line 149
    .line 150
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/edit/f;->k:[F

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 157
    .line 158
    .line 159
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->f:Ljava/nio/FloatBuffer;

    .line 176
    .line 177
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/edit/f;->l:[F

    .line 178
    .line 179
    invoke-virtual {v1, v4}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 184
    .line 185
    .line 186
    const/4 v1, 0x2

    .line 187
    invoke-static {v1, p1, v3}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 191
    .line 192
    if-eqz v1, :cond_4

    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->e:I

    .line 199
    .line 200
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 201
    .line 202
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->f:I

    .line 207
    .line 208
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->e:I

    .line 209
    .line 210
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->i:I

    .line 211
    .line 212
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/f;->j:I

    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/f;->a()V

    .line 215
    .line 216
    .line 217
    aget v1, p1, v3

    .line 218
    .line 219
    const/16 v4, 0xde1

    .line 220
    .line 221
    invoke-static {v4, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 225
    .line 226
    invoke-static {v4, v3, v1, v3}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 227
    .line 228
    .line 229
    const/16 v1, 0x2800

    .line 230
    .line 231
    const/16 v5, 0x2601

    .line 232
    .line 233
    invoke-static {v4, v1, v5}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 234
    .line 235
    .line 236
    const/16 v1, 0x2801

    .line 237
    .line 238
    invoke-static {v4, v1, v5}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 239
    .line 240
    .line 241
    const/16 v1, 0x2802

    .line 242
    .line 243
    const v5, 0x812f

    .line 244
    .line 245
    .line 246
    invoke-static {v4, v1, v5}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 247
    .line 248
    .line 249
    const/16 v1, 0x2803

    .line 250
    .line 251
    invoke-static {v4, v1, v5}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 252
    .line 253
    .line 254
    :cond_4
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 255
    .line 256
    :cond_5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 257
    .line 258
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 259
    .line 260
    if-ne v1, v4, :cond_6

    .line 261
    .line 262
    goto/16 :goto_3

    .line 263
    .line 264
    :cond_6
    const/high16 v1, 0x3f000000    # 0.5f

    .line 265
    .line 266
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->b:Landroid/media/effect/EffectContext;

    .line 271
    .line 272
    invoke-virtual {v5}, Landroid/media/effect/EffectContext;->getFactory()Landroid/media/effect/EffectFactory;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 277
    .line 278
    if-eqz v6, :cond_7

    .line 279
    .line 280
    invoke-virtual {v6}, Landroid/media/effect/Effect;->release()V

    .line 281
    .line 282
    .line 283
    :cond_7
    sget-object v6, Lcom/xuexiang/xui/widget/imageview/edit/c;->a:[I

    .line 284
    .line 285
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 286
    .line 287
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    aget v6, v6, v7

    .line 292
    .line 293
    const-string v7, "android.media.effect.effects.FlipEffect"

    .line 294
    .line 295
    const-string v8, "strength"

    .line 296
    .line 297
    const-string v9, "scale"

    .line 298
    .line 299
    packed-switch v6, :pswitch_data_0

    .line 300
    .line 301
    .line 302
    :pswitch_0
    goto/16 :goto_2

    .line 303
    .line 304
    :pswitch_1
    const-string v6, "android.media.effect.effects.VignetteEffect"

    .line 305
    .line 306
    invoke-virtual {v5, v6}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    iput-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 311
    .line 312
    invoke-virtual {v5, v9, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :pswitch_2
    const-string v1, "android.media.effect.effects.TintEffect"

    .line 318
    .line 319
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 324
    .line 325
    const v5, -0xff01

    .line 326
    .line 327
    .line 328
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    const-string v6, "tint"

    .line 333
    .line 334
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :pswitch_3
    const-string v1, "android.media.effect.effects.ColorTemperatureEffect"

    .line 340
    .line 341
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 346
    .line 347
    const v5, 0x3f666666    # 0.9f

    .line 348
    .line 349
    .line 350
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-virtual {v1, v9, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :pswitch_4
    const-string v1, "android.media.effect.effects.SharpenEffect"

    .line 360
    .line 361
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 366
    .line 367
    goto/16 :goto_2

    .line 368
    .line 369
    :pswitch_5
    const-string v1, "android.media.effect.effects.SepiaEffect"

    .line 370
    .line 371
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 376
    .line 377
    goto/16 :goto_2

    .line 378
    .line 379
    :pswitch_6
    const-string v6, "android.media.effect.effects.SaturateEffect"

    .line 380
    .line 381
    invoke-virtual {v5, v6}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    iput-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 386
    .line 387
    invoke-virtual {v5, v9, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_2

    .line 391
    .line 392
    :pswitch_7
    const-string v1, "android.media.effect.effects.RotateEffect"

    .line 393
    .line 394
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 399
    .line 400
    const/16 v5, 0xb4

    .line 401
    .line 402
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    const-string v6, "angle"

    .line 407
    .line 408
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_2

    .line 412
    .line 413
    :pswitch_8
    const-string v1, "android.media.effect.effects.PosterizeEffect"

    .line 414
    .line 415
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 420
    .line 421
    goto/16 :goto_2

    .line 422
    .line 423
    :pswitch_9
    const-string v1, "android.media.effect.effects.NegativeEffect"

    .line 424
    .line 425
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 430
    .line 431
    goto/16 :goto_2

    .line 432
    .line 433
    :pswitch_a
    const-string v1, "android.media.effect.effects.LomoishEffect"

    .line 434
    .line 435
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 440
    .line 441
    goto/16 :goto_2

    .line 442
    .line 443
    :pswitch_b
    const-string v1, "android.media.effect.effects.GrayscaleEffect"

    .line 444
    .line 445
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 450
    .line 451
    goto/16 :goto_2

    .line 452
    .line 453
    :pswitch_c
    const-string v1, "android.media.effect.effects.GrainEffect"

    .line 454
    .line 455
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 460
    .line 461
    const/high16 v5, 0x3f800000    # 1.0f

    .line 462
    .line 463
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    invoke-virtual {v1, v8, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_2

    .line 471
    .line 472
    :pswitch_d
    invoke-virtual {v5, v7}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 477
    .line 478
    const-string v5, "vertical"

    .line 479
    .line 480
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 481
    .line 482
    invoke-virtual {v1, v5, v6}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :pswitch_e
    invoke-virtual {v5, v7}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 492
    .line 493
    const-string v5, "horizontal"

    .line 494
    .line 495
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {v1, v5, v6}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    goto/16 :goto_2

    .line 501
    .line 502
    :pswitch_f
    const-string v6, "android.media.effect.effects.FisheyeEffect"

    .line 503
    .line 504
    invoke-virtual {v5, v6}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    iput-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 509
    .line 510
    invoke-virtual {v5, v9, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_2

    .line 514
    .line 515
    :pswitch_10
    const-string v1, "android.media.effect.effects.FillLightEffect"

    .line 516
    .line 517
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 522
    .line 523
    const v5, 0x3f4ccccd    # 0.8f

    .line 524
    .line 525
    .line 526
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    invoke-virtual {v1, v8, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    goto/16 :goto_2

    .line 534
    .line 535
    :pswitch_11
    const-string v1, "android.media.effect.effects.DuotoneEffect"

    .line 536
    .line 537
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 542
    .line 543
    const/16 v5, -0x100

    .line 544
    .line 545
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    const-string v6, "first_color"

    .line 550
    .line 551
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 555
    .line 556
    const v5, -0xbbbbbc

    .line 557
    .line 558
    .line 559
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    const-string v6, "second_color"

    .line 564
    .line 565
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    goto :goto_2

    .line 569
    :pswitch_12
    const-string v1, "android.media.effect.effects.DocumentaryEffect"

    .line 570
    .line 571
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 576
    .line 577
    goto :goto_2

    .line 578
    :pswitch_13
    const-string v1, "android.media.effect.effects.CrossProcessEffect"

    .line 579
    .line 580
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 585
    .line 586
    goto :goto_2

    .line 587
    :pswitch_14
    const-string v1, "android.media.effect.effects.ContrastEffect"

    .line 588
    .line 589
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 594
    .line 595
    const v5, 0x3fb33333    # 1.4f

    .line 596
    .line 597
    .line 598
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    const-string v6, "contrast"

    .line 603
    .line 604
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto :goto_2

    .line 608
    :pswitch_15
    const-string v1, "android.media.effect.effects.BrightnessEffect"

    .line 609
    .line 610
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 615
    .line 616
    const/high16 v5, 0x40000000    # 2.0f

    .line 617
    .line 618
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    const-string v6, "brightness"

    .line 623
    .line 624
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    goto :goto_2

    .line 628
    :pswitch_16
    const-string v1, "android.media.effect.effects.BlackWhiteEffect"

    .line 629
    .line 630
    invoke-virtual {v5, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 635
    .line 636
    const v5, 0x3dcccccd    # 0.1f

    .line 637
    .line 638
    .line 639
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    const-string v6, "black"

    .line 644
    .line 645
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 649
    .line 650
    const v5, 0x3f333333    # 0.7f

    .line 651
    .line 652
    .line 653
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    const-string v6, "white"

    .line 658
    .line 659
    invoke-virtual {v1, v6, v5}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    goto :goto_2

    .line 663
    :pswitch_17
    const-string v6, "android.media.effect.effects.AutoFixEffect"

    .line 664
    .line 665
    invoke-virtual {v5, v6}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    iput-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 670
    .line 671
    invoke-virtual {v5, v9, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    :goto_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->c:Landroid/media/effect/Effect;

    .line 675
    .line 676
    aget v5, p1, v3

    .line 677
    .line 678
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->e:I

    .line 679
    .line 680
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->f:I

    .line 681
    .line 682
    aget v8, p1, v2

    .line 683
    .line 684
    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/media/effect/Effect;->apply(IIII)V

    .line 685
    .line 686
    .line 687
    :goto_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 688
    .line 689
    if-ne v1, v4, :cond_8

    .line 690
    .line 691
    aget p1, p1, v3

    .line 692
    .line 693
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/f;->b(I)V

    .line 694
    .line 695
    .line 696
    goto :goto_4

    .line 697
    :cond_8
    aget p1, p1, v2

    .line 698
    .line 699
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/f;->b(I)V

    .line 700
    .line 701
    .line 702
    :goto_4
    return-void

    .line 703
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/d;->d:Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iput p2, p1, Lcom/xuexiang/xui/widget/imageview/edit/f;->g:I

    .line 6
    .line 7
    iput p3, p1, Lcom/xuexiang/xui/widget/imageview/edit/f;->h:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/edit/f;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    return-void
.end method
