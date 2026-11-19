.class public final synthetic Landroidx/camera/core/impl/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/impl/utils/a;->a:I

    iput-object p2, p0, Landroidx/camera/core/impl/utils/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/impl/utils/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Landroidx/camera/core/impl/utils/a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/core/impl/utils/a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/camera/core/impl/utils/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lio/objectbox/relation/ToOne;

    .line 11
    .line 12
    invoke-static {v2, v1}, Lio/objectbox/relation/ToOne;->a(Lio/objectbox/relation/ToOne;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    check-cast v1, Landroidx/fragment/app/strictmode/Violation;

    .line 19
    .line 20
    invoke-static {v2, v1}, Landroidx/fragment/app/strictmode/FragmentStrictMode;->a(Ljava/lang/String;Landroidx/fragment/app/strictmode/Violation;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast v2, Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;

    .line 25
    .line 26
    check-cast v1, Landroidx/fragment/app/strictmode/Violation;

    .line 27
    .line 28
    invoke-static {v2, v1}, Landroidx/fragment/app/strictmode/FragmentStrictMode;->b(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;Landroidx/fragment/app/strictmode/Violation;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    check-cast v2, Lkotlinx/coroutines/g;

    .line 33
    .line 34
    check-cast v1, Ld7/d;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lkotlinx/coroutines/g;->C(Lkotlinx/coroutines/r;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_3
    check-cast v2, Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 41
    .line 42
    check-cast v1, Le1/a;

    .line 43
    .line 44
    invoke-static {v2, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->i(Lcom/zykj/view/ui/camera/ImagePickFragment;Le1/a;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_4
    check-cast v2, Lr6/c;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->d(Lr6/c;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_5
    check-cast v2, Lr6/c;

    .line 57
    .line 58
    check-cast v1, Lcom/zykj/sketch/exception/LowVersionException;

    .line 59
    .line 60
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->b(Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_6
    check-cast v2, Lr6/c;

    .line 65
    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->h(Lr6/c;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_7
    check-cast v2, Lr6/c;

    .line 73
    .line 74
    check-cast v1, Ljava/io/IOException;

    .line 75
    .line 76
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->l(Lr6/c;Ljava/io/IOException;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_8
    check-cast v2, Lr6/c;

    .line 81
    .line 82
    check-cast v1, Lcom/zykj/sketch/exception/HighVersionException;

    .line 83
    .line 84
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->g(Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_9
    check-cast v2, Lr6/c;

    .line 89
    .line 90
    check-cast v1, Ljava/io/FileNotFoundException;

    .line 91
    .line 92
    invoke-static {v2, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->c(Lr6/c;Ljava/io/FileNotFoundException;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_a
    check-cast v2, Lcom/zykj/mistake/widget/StemWebView;

    .line 97
    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/widget/StemWebView;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_b
    check-cast v2, Ljava/util/List;

    .line 105
    .line 106
    check-cast v1, Lcom/zykj/mistake/activity/SketchActivity;

    .line 107
    .line 108
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 109
    .line 110
    new-instance v0, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 116
    .line 117
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 118
    .line 119
    .line 120
    const/4 v4, -0x1

    .line 121
    iput v4, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Ljava/lang/String;

    .line 138
    .line 139
    const/4 v5, 0x1

    .line 140
    :try_start_0
    invoke-static {v1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v6, v1}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const-class v7, Ljava/io/File;

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    sget-object v7, Lcom/bumptech/glide/h;->m:Lr0/d;

    .line 155
    .line 156
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    iput-object v4, v6, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 161
    .line 162
    iput-boolean v5, v6, Lcom/bumptech/glide/f;->y:Z

    .line 163
    .line 164
    new-instance v4, Lr0/c;

    .line 165
    .line 166
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    sget-object v7, Lv0/e;->b:Lv0/d;

    .line 170
    .line 171
    invoke-virtual {v6, v4, v4, v6, v7}, Lcom/bumptech/glide/f;->A(Ls0/i;Lr0/c;Lr0/a;Ljava/util/concurrent/Executor;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Lr0/c;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Ljava/io/File;

    .line 179
    .line 180
    new-instance v6, Ljava/io/File;

    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    new-instance v10, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v8, ".jpg"

    .line 199
    .line 200
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget v7, Lcom/blankj/utilcode/util/e;->a:I

    .line 211
    .line 212
    if-nez v4, :cond_0

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_1

    .line 220
    .line 221
    invoke-static {v4, v6}, Lcom/blankj/utilcode/util/e;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_1
    invoke-static {v4, v6}, Lcom/blankj/utilcode/util/e;->b(Ljava/io/File;Ljava/io/File;)Z

    .line 226
    .line 227
    .line 228
    :goto_1
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :catch_0
    move-exception v4

    .line 237
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const/4 v6, 0x0

    .line 242
    if-eqz v4, :cond_2

    .line 243
    .line 244
    const-string v7, "FileNotFoundException"

    .line 245
    .line 246
    invoke-static {v4, v7, v6}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-ne v4, v5, :cond_2

    .line 251
    .line 252
    move v6, v5

    .line 253
    :cond_2
    xor-int/lit8 v4, v6, 0x1

    .line 254
    .line 255
    iput v4, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_3
    new-instance v2, Lcom/zykj/mistake/activity/d0;

    .line 260
    .line 261
    invoke-direct {v2, v3, v1, v0}, Lcom/zykj/mistake/activity/d0;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/zykj/mistake/activity/SketchActivity;Ljava/util/ArrayList;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_c
    check-cast v2, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 269
    .line 270
    check-cast v1, Lr6/c;

    .line 271
    .line 272
    invoke-static {v2, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->e(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_d
    check-cast v2, Lcom/zykj/blackboard/core/edit/BasePageControl;

    .line 277
    .line 278
    check-cast v1, Lr6/a;

    .line 279
    .line 280
    invoke-static {v2, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->a(Lcom/zykj/blackboard/core/edit/BasePageControl;Lr6/a;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_e
    check-cast v2, Landroidx/core/content/res/ResourcesCompat$FontCallback;

    .line 285
    .line 286
    check-cast v1, Landroid/graphics/Typeface;

    .line 287
    .line 288
    invoke-static {v2, v1}, Landroidx/core/content/res/ResourcesCompat$FontCallback;->a(Landroidx/core/content/res/ResourcesCompat$FontCallback;Landroid/graphics/Typeface;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_f
    check-cast v2, Landroidx/constraintlayout/motion/widget/ViewTransition;

    .line 293
    .line 294
    check-cast v1, [Landroid/view/View;

    .line 295
    .line 296
    invoke-static {v2, v1}, Landroidx/constraintlayout/motion/widget/ViewTransition;->a(Landroidx/constraintlayout/motion/widget/ViewTransition;[Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_10
    check-cast v2, Landroidx/camera/video/internal/audio/AudioSource;

    .line 301
    .line 302
    check-cast v1, Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;

    .line 303
    .line 304
    invoke-static {v2, v1}, Landroidx/camera/video/internal/audio/AudioSource;->i(Landroidx/camera/video/internal/audio/AudioSource;Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :pswitch_11
    check-cast v2, Landroidx/camera/video/internal/audio/AudioSource;

    .line 309
    .line 310
    check-cast v1, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    .line 311
    .line 312
    invoke-static {v2, v1}, Landroidx/camera/video/internal/audio/AudioSource;->f(Landroidx/camera/video/internal/audio/AudioSource;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :pswitch_12
    check-cast v2, Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;

    .line 317
    .line 318
    check-cast v1, Ljava/lang/Throwable;

    .line 319
    .line 320
    invoke-static {v2, v1}, Landroidx/camera/video/internal/audio/AudioSource;->c(Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_13
    check-cast v2, Landroidx/camera/video/internal/audio/AudioSource;

    .line 325
    .line 326
    check-cast v1, Landroidx/camera/video/internal/BufferProvider;

    .line 327
    .line 328
    invoke-static {v2, v1}, Landroidx/camera/video/internal/audio/AudioSource;->d(Landroidx/camera/video/internal/audio/AudioSource;Landroidx/camera/video/internal/BufferProvider;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :pswitch_14
    check-cast v2, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    .line 333
    .line 334
    check-cast v1, Landroidx/camera/core/SurfaceOutput;

    .line 335
    .line 336
    invoke-static {v2, v1}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->f(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Landroidx/camera/core/SurfaceOutput;)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_15
    check-cast v2, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    .line 341
    .line 342
    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    .line 343
    .line 344
    invoke-static {v2, v1}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->g(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Landroidx/camera/core/SurfaceRequest;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_16
    check-cast v2, Ljava/lang/Runnable;

    .line 349
    .line 350
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 351
    .line 352
    invoke-static {v2, v1}, Landroidx/camera/core/impl/utils/Threads;->a(Ljava/lang/Runnable;Ljava/util/concurrent/CountDownLatch;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
