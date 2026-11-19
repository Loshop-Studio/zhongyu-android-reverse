.class public final Lb0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lb0/a;->a:I

    sget-object v0, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/a;->a:I

    iput-object p1, p0, Lb0/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lb0/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    if-eq v5, v6, :cond_0

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v4, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    int-to-float v3, v3

    .line 69
    iget-object v5, v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    int-to-float v5, v5

    .line 76
    iget v6, v0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 77
    .line 78
    add-float/2addr v5, v6

    .line 79
    add-float/2addr v5, v3

    .line 80
    float-to-int v3, v5

    .line 81
    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/view/View;->invalidate(IIII)V

    .line 82
    .line 83
    .line 84
    :cond_1
    const-wide/16 v1, 0x10

    .line 85
    .line 86
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    :goto_1
    :pswitch_0
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lr7/c;

    .line 93
    .line 94
    monitor-enter v0

    .line 95
    :try_start_0
    invoke-virtual {v0}, Lr7/c;->c()Lr7/a;

    .line 96
    .line 97
    .line 98
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 99
    monitor-exit v0

    .line 100
    if-nez v1, :cond_3

    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    iget-object v0, v1, Lr7/a;->c:Lr7/b;

    .line 104
    .line 105
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Lr7/c;

    .line 111
    .line 112
    sget-object v3, Lr7/c;->i:Ljava/util/logging/Logger;

    .line 113
    .line 114
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    const-string/jumbo v6, "starting"

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v0, v6}, Lv7/l;->a(Lr7/a;Lr7/b;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    const-wide/16 v4, -0x1

    .line 134
    .line 135
    :goto_2
    :try_start_1
    invoke-static {v2, v1}, Lr7/c;->a(Lr7/c;Lr7/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    if-eqz v3, :cond_2

    .line 139
    .line 140
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 141
    .line 142
    .line 143
    move-result-wide v2

    .line 144
    sub-long/2addr v2, v4

    .line 145
    invoke-static {v2, v3}, Lv7/l;->l(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v3, "finished run in "

    .line 150
    .line 151
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v1, v0, v2}, Lv7/l;->a(Lr7/a;Lr7/b;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catchall_0
    move-exception v6

    .line 160
    :try_start_2
    iget-object v2, v2, Lr7/c;->a:Lq/d;

    .line 161
    .line 162
    iget-object v2, v2, Lq/d;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 165
    .line 166
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 167
    .line 168
    .line 169
    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    :catchall_1
    move-exception v2

    .line 171
    if-eqz v3, :cond_5

    .line 172
    .line 173
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    sub-long/2addr v6, v4

    .line 178
    invoke-static {v6, v7}, Lv7/l;->l(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    const-string v4, "failed a run in "

    .line 183
    .line 184
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-static {v1, v0, v3}, Lv7/l;->a(Lr7/a;Lr7/b;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    throw v2

    .line 192
    :catchall_2
    move-exception v1

    .line 193
    monitor-exit v0

    .line 194
    throw v1

    .line 195
    :pswitch_1
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 204
    .line 205
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    sub-int/2addr v1, v2

    .line 210
    iput v1, v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->h:I

    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_2
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lp3/r;

    .line 216
    .line 217
    iget-object v1, v0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 218
    .line 219
    iget v2, v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 220
    .line 221
    const/4 v3, 0x5

    .line 222
    if-ne v2, v3, :cond_6

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    iget-object v2, v0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 229
    .line 230
    iget v2, v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 231
    .line 232
    sub-int/2addr v1, v2

    .line 233
    int-to-float v1, v1

    .line 234
    iput v1, v0, Lp3/r;->b:F

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_6
    const/16 v3, 0x77

    .line 238
    .line 239
    if-ne v2, v3, :cond_7

    .line 240
    .line 241
    iget v2, v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 242
    .line 243
    iput v2, v0, Lp3/r;->d:I

    .line 244
    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    iput v2, v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 250
    .line 251
    :cond_7
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_3
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Lcom/tencent/bugly/proguard/z0;

    .line 258
    .line 259
    iget-object v0, v0, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Ln1/a;

    .line 262
    .line 263
    invoke-virtual {v0}, Ln1/a;->c()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_8

    .line 268
    .line 269
    :try_start_3
    const-string v1, "Mp3Recorder"

    .line 270
    .line 271
    const-string/jumbo v2, "stop recording"

    .line 272
    .line 273
    .line 274
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ln1/a;->a()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :catch_0
    move-exception v0

    .line 282
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 283
    .line 284
    .line 285
    :cond_8
    :goto_4
    return-void

    .line 286
    :pswitch_4
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 289
    .line 290
    iget-object v1, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-nez v1, :cond_9

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_9
    iget-object v2, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 302
    .line 303
    .line 304
    iget-object v2, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 305
    .line 306
    new-instance v3, Li3/c;

    .line 307
    .line 308
    invoke-direct {v3, v0, v1}, Li3/c;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 312
    .line 313
    .line 314
    :goto_5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->i:Landroid/os/Handler;

    .line 315
    .line 316
    iget-object v0, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->j:Lb0/a;

    .line 317
    .line 318
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :pswitch_5
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, Lcom/zykj/message/UnLoginActivity;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-nez v1, :cond_a

    .line 331
    .line 332
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 333
    .line 334
    .line 335
    :cond_a
    return-void

    .line 336
    :pswitch_6
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Lcom/zykj/message/UnInstallActivity;

    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-nez v1, :cond_b

    .line 345
    .line 346
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 347
    .line 348
    .line 349
    :cond_b
    return-void

    .line 350
    :pswitch_7
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lcom/zykj/message/KillSelfService;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const-string v3, "application"

    .line 363
    .line 364
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    if-eqz v1, :cond_c

    .line 376
    .line 377
    const/high16 v2, 0x10000000

    .line 378
    .line 379
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x4000000

    .line 383
    .line 384
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 391
    .line 392
    .line 393
    :cond_c
    return-void

    .line 394
    :pswitch_8
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Lcom/xuexiang/xui/widget/button/RippleView;

    .line 397
    .line 398
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_9
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lcom/tencent/bugly/proguard/au;

    .line 405
    .line 406
    invoke-static {v0}, Lcom/tencent/bugly/proguard/au;->a(Lcom/tencent/bugly/proguard/au;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :pswitch_a
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v0, Ljava/util/List;

    .line 413
    .line 414
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ag;->c(Ljava/util/List;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :pswitch_b
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Lcom/bumptech/glide/h;

    .line 421
    .line 422
    iget-object v1, v0, Lcom/bumptech/glide/h;->c:Lo0/e;

    .line 423
    .line 424
    invoke-interface {v1, v0}, Lo0/e;->d(Lo0/f;)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :pswitch_c
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lcom/blankj/utilcode/util/v;

    .line 431
    .line 432
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/v;->a()V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_d
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v0, Lcom/blankj/utilcode/util/v;

    .line 439
    .line 440
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/v;->a()V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :pswitch_e
    const-string v0, "layout_inflater"

    .line 445
    .line 446
    new-instance v4, Lcom/blankj/utilcode/util/a;

    .line 447
    .line 448
    const/4 v5, 0x2

    .line 449
    invoke-direct {v4, v5}, Lcom/blankj/utilcode/util/a;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-static {v4}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 453
    .line 454
    .line 455
    sget-object v4, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 456
    .line 457
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    invoke-static {v6}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    invoke-virtual {v6}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    if-eqz v6, :cond_d

    .line 470
    .line 471
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    invoke-static {v6}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-nez v6, :cond_d

    .line 480
    .line 481
    new-instance v6, Lcom/blankj/utilcode/util/w;

    .line 482
    .line 483
    invoke-direct {v6, v4}, Lcom/blankj/utilcode/util/w;-><init>(Lcom/blankj/utilcode/util/x;)V

    .line 484
    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_d
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 488
    .line 489
    const/16 v7, 0x19

    .line 490
    .line 491
    if-ge v6, v7, :cond_e

    .line 492
    .line 493
    new-instance v6, Lcom/blankj/utilcode/util/v;

    .line 494
    .line 495
    const/16 v4, 0x7d5

    .line 496
    .line 497
    invoke-direct {v6, v4}, Lcom/blankj/utilcode/util/v;-><init>(I)V

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_e
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    invoke-static {v7}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    if-eqz v7, :cond_10

    .line 510
    .line 511
    const/16 v4, 0x1a

    .line 512
    .line 513
    if-lt v6, v4, :cond_f

    .line 514
    .line 515
    new-instance v6, Lcom/blankj/utilcode/util/v;

    .line 516
    .line 517
    const/16 v4, 0x7f6

    .line 518
    .line 519
    invoke-direct {v6, v4}, Lcom/blankj/utilcode/util/v;-><init>(I)V

    .line 520
    .line 521
    .line 522
    goto :goto_6

    .line 523
    :cond_f
    new-instance v6, Lcom/blankj/utilcode/util/v;

    .line 524
    .line 525
    const/16 v4, 0x7d2

    .line 526
    .line 527
    invoke-direct {v6, v4}, Lcom/blankj/utilcode/util/v;-><init>(I)V

    .line 528
    .line 529
    .line 530
    goto :goto_6

    .line 531
    :cond_10
    new-instance v6, Lcom/blankj/utilcode/util/v;

    .line 532
    .line 533
    invoke-direct {v6, v4, v3}, Lcom/blankj/utilcode/util/v;-><init>(Lcom/blankj/utilcode/util/x;I)V

    .line 534
    .line 535
    .line 536
    :goto_6
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 537
    .line 538
    invoke-direct {v4, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    sput-object v4, Lcom/blankj/utilcode/util/x;->c:Ljava/lang/ref/WeakReference;

    .line 542
    .line 543
    iget-object v4, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v4, Ljava/lang/CharSequence;

    .line 546
    .line 547
    iget-object v7, v6, Lcom/blankj/utilcode/util/t;->b:Lcom/blankj/utilcode/util/x;

    .line 548
    .line 549
    iget-object v7, v7, Lcom/blankj/utilcode/util/x;->a:[Landroid/graphics/drawable/Drawable;

    .line 550
    .line 551
    const-string v8, "dark"

    .line 552
    .line 553
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    const v10, 0x102000b

    .line 558
    .line 559
    .line 560
    const/4 v11, 0x3

    .line 561
    if-nez v9, :cond_11

    .line 562
    .line 563
    const-string v9, "light"

    .line 564
    .line 565
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    if-nez v9, :cond_11

    .line 570
    .line 571
    aget-object v9, v7, v3

    .line 572
    .line 573
    if-nez v9, :cond_11

    .line 574
    .line 575
    aget-object v9, v7, v1

    .line 576
    .line 577
    if-nez v9, :cond_11

    .line 578
    .line 579
    aget-object v9, v7, v5

    .line 580
    .line 581
    if-nez v9, :cond_11

    .line 582
    .line 583
    aget-object v9, v7, v11

    .line 584
    .line 585
    if-nez v9, :cond_11

    .line 586
    .line 587
    move-object v9, v2

    .line 588
    goto/16 :goto_7

    .line 589
    .line 590
    :cond_11
    sget v9, Lcom/blankj/utilcode/R$layout;->utils_toast_view:I

    .line 591
    .line 592
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    invoke-virtual {v12, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v12

    .line 600
    check-cast v12, Landroid/view/LayoutInflater;

    .line 601
    .line 602
    invoke-virtual {v12, v9, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 603
    .line 604
    .line 605
    move-result-object v9

    .line 606
    invoke-virtual {v9, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 607
    .line 608
    .line 609
    move-result-object v12

    .line 610
    check-cast v12, Landroid/widget/TextView;

    .line 611
    .line 612
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v8

    .line 616
    if-eqz v8, :cond_12

    .line 617
    .line 618
    invoke-virtual {v9}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    check-cast v8, Landroid/graphics/drawable/GradientDrawable;

    .line 627
    .line 628
    const-string v13, "#BB000000"

    .line 629
    .line 630
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 631
    .line 632
    .line 633
    move-result v13

    .line 634
    invoke-virtual {v8, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 635
    .line 636
    .line 637
    const/4 v8, -0x1

    .line 638
    invoke-virtual {v12, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 639
    .line 640
    .line 641
    :cond_12
    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 642
    .line 643
    .line 644
    aget-object v8, v7, v3

    .line 645
    .line 646
    if-eqz v8, :cond_13

    .line 647
    .line 648
    sget v8, Lcom/blankj/utilcode/R$id;->utvLeftIconView:I

    .line 649
    .line 650
    invoke-virtual {v9, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 651
    .line 652
    .line 653
    move-result-object v8

    .line 654
    aget-object v12, v7, v3

    .line 655
    .line 656
    invoke-static {v8, v12}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 660
    .line 661
    .line 662
    :cond_13
    aget-object v8, v7, v1

    .line 663
    .line 664
    if-eqz v8, :cond_14

    .line 665
    .line 666
    sget v8, Lcom/blankj/utilcode/R$id;->utvTopIconView:I

    .line 667
    .line 668
    invoke-virtual {v9, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v8

    .line 672
    aget-object v1, v7, v1

    .line 673
    .line 674
    invoke-static {v8, v1}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 678
    .line 679
    .line 680
    :cond_14
    aget-object v1, v7, v5

    .line 681
    .line 682
    if-eqz v1, :cond_15

    .line 683
    .line 684
    sget v1, Lcom/blankj/utilcode/R$id;->utvRightIconView:I

    .line 685
    .line 686
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    aget-object v5, v7, v5

    .line 691
    .line 692
    invoke-static {v1, v5}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 696
    .line 697
    .line 698
    :cond_15
    aget-object v1, v7, v11

    .line 699
    .line 700
    if-eqz v1, :cond_16

    .line 701
    .line 702
    sget v1, Lcom/blankj/utilcode/R$id;->utvBottomIconView:I

    .line 703
    .line 704
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    aget-object v5, v7, v11

    .line 709
    .line 710
    invoke-static {v1, v5}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 714
    .line 715
    .line 716
    :cond_16
    :goto_7
    if-eqz v9, :cond_17

    .line 717
    .line 718
    iput-object v9, v6, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 719
    .line 720
    iget-object v0, v6, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 721
    .line 722
    invoke-virtual {v0, v9}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v6}, Lcom/blankj/utilcode/util/t;->c()V

    .line 726
    .line 727
    .line 728
    goto :goto_8

    .line 729
    :cond_17
    iget-object v1, v6, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 730
    .line 731
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    iput-object v1, v6, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 736
    .line 737
    if-eqz v1, :cond_18

    .line 738
    .line 739
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    if-nez v1, :cond_19

    .line 744
    .line 745
    :cond_18
    sget v1, Lcom/blankj/utilcode/R$layout;->utils_toast_view:I

    .line 746
    .line 747
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    check-cast v0, Landroid/view/LayoutInflater;

    .line 756
    .line 757
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    iput-object v0, v6, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 762
    .line 763
    iget-object v1, v6, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 764
    .line 765
    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 766
    .line 767
    .line 768
    :cond_19
    iget-object v0, v6, Lcom/blankj/utilcode/util/t;->c:Landroid/view/View;

    .line 769
    .line 770
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    check-cast v0, Landroid/widget/TextView;

    .line 775
    .line 776
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v6}, Lcom/blankj/utilcode/util/t;->c()V

    .line 780
    .line 781
    .line 782
    :goto_8
    invoke-virtual {v6}, Lcom/blankj/utilcode/util/t;->d()V

    .line 783
    .line 784
    .line 785
    return-void

    .line 786
    :pswitch_f
    sget v0, Lcom/blankj/utilcode/util/j;->a:I

    .line 787
    .line 788
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    const-string v3, "connectivity"

    .line 793
    .line 794
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 799
    .line 800
    if-nez v0, :cond_1a

    .line 801
    .line 802
    goto :goto_9

    .line 803
    :cond_1a
    const/16 v4, 0x9

    .line 804
    .line 805
    invoke-virtual {v0, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    if-nez v0, :cond_1b

    .line 810
    .line 811
    goto :goto_9

    .line 812
    :cond_1b
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    if-nez v0, :cond_1c

    .line 817
    .line 818
    goto :goto_9

    .line 819
    :cond_1c
    sget-object v4, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    .line 820
    .line 821
    if-eq v0, v4, :cond_24

    .line 822
    .line 823
    sget-object v4, Landroid/net/NetworkInfo$State;->CONNECTING:Landroid/net/NetworkInfo$State;

    .line 824
    .line 825
    if-ne v0, v4, :cond_1d

    .line 826
    .line 827
    goto/16 :goto_c

    .line 828
    .line 829
    :cond_1d
    :goto_9
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 838
    .line 839
    if-nez v0, :cond_1e

    .line 840
    .line 841
    goto :goto_a

    .line 842
    :cond_1e
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    :goto_a
    if-eqz v2, :cond_23

    .line 847
    .line 848
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 849
    .line 850
    .line 851
    move-result v0

    .line 852
    if-eqz v0, :cond_23

    .line 853
    .line 854
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    if-ne v0, v1, :cond_1f

    .line 859
    .line 860
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_WIFI:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 861
    .line 862
    goto :goto_d

    .line 863
    :cond_1f
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-nez v0, :cond_22

    .line 868
    .line 869
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    packed-switch v0, :pswitch_data_1

    .line 874
    .line 875
    .line 876
    :pswitch_10
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    const-string v1, "TD-SCDMA"

    .line 881
    .line 882
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 883
    .line 884
    .line 885
    move-result v1

    .line 886
    if-nez v1, :cond_21

    .line 887
    .line 888
    const-string v1, "WCDMA"

    .line 889
    .line 890
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 891
    .line 892
    .line 893
    move-result v1

    .line 894
    if-nez v1, :cond_21

    .line 895
    .line 896
    const-string v1, "CDMA2000"

    .line 897
    .line 898
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-eqz v0, :cond_20

    .line 903
    .line 904
    goto :goto_b

    .line 905
    :cond_20
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_UNKNOWN:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 906
    .line 907
    goto :goto_d

    .line 908
    :cond_21
    :goto_b
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_3G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 909
    .line 910
    goto :goto_d

    .line 911
    :pswitch_11
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_5G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 912
    .line 913
    goto :goto_d

    .line 914
    :pswitch_12
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_4G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 915
    .line 916
    goto :goto_d

    .line 917
    :pswitch_13
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_3G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 918
    .line 919
    goto :goto_d

    .line 920
    :pswitch_14
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_2G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 921
    .line 922
    goto :goto_d

    .line 923
    :cond_22
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_UNKNOWN:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 924
    .line 925
    goto :goto_d

    .line 926
    :cond_23
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_NO:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 927
    .line 928
    goto :goto_d

    .line 929
    :cond_24
    :goto_c
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_ETHERNET:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 930
    .line 931
    :goto_d
    iget-object v1, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkChangedReceiver;

    .line 934
    .line 935
    iget-object v2, v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkChangedReceiver;->a:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 936
    .line 937
    if-ne v2, v0, :cond_25

    .line 938
    .line 939
    goto :goto_e

    .line 940
    :cond_25
    iput-object v0, v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkChangedReceiver;->a:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 941
    .line 942
    sget-object v2, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_NO:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 943
    .line 944
    if-ne v0, v2, :cond_27

    .line 945
    .line 946
    iget-object v0, v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkChangedReceiver;->b:Ljava/util/HashSet;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    if-nez v1, :cond_26

    .line 957
    .line 958
    goto :goto_e

    .line 959
    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    new-instance v0, Ljava/lang/ClassCastException;

    .line 967
    .line 968
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 969
    .line 970
    .line 971
    throw v0

    .line 972
    :cond_27
    iget-object v0, v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkChangedReceiver;->b:Ljava/util/HashSet;

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 979
    .line 980
    .line 981
    move-result v1

    .line 982
    if-nez v1, :cond_28

    .line 983
    .line 984
    :goto_e
    return-void

    .line 985
    :cond_28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    new-instance v0, Ljava/lang/ClassCastException;

    .line 993
    .line 994
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 995
    .line 996
    .line 997
    throw v0

    .line 998
    :pswitch_15
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    .line 1001
    .line 1002
    iget-object v0, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->w:Landroid/os/Handler;

    .line 1003
    .line 1004
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1009
    .line 1010
    .line 1011
    return-void

    .line 1012
    :pswitch_16
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v0, Lb0/d;

    .line 1015
    .line 1016
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    :goto_f
    :try_start_4
    iget-object v1, v0, Lb0/d;->c:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 1022
    .line 1023
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    check-cast v1, Lb0/c;

    .line 1028
    .line 1029
    invoke-virtual {v0, v1}, Lb0/d;->d(Lb0/c;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1030
    .line 1031
    .line 1032
    goto :goto_f

    .line 1033
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1038
    .line 1039
    .line 1040
    goto :goto_f

    .line 1041
    :pswitch_17
    const/16 v0, 0xa

    .line 1042
    .line 1043
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v0, p0, Lb0/a;->b:Ljava/lang/Object;

    .line 1047
    .line 1048
    check-cast v0, Ljava/lang/Runnable;

    .line 1049
    .line 1050
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1051
    .line 1052
    .line 1053
    return-void

    .line 1054
    nop

    .line 1055
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
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

    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_13
        :pswitch_13
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method
