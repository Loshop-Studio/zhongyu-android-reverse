.class public final Lcom/blankj/utilcode/util/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/a0;->a:I

    iput-object p2, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;ZLjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/a0;->a:I

    iput-object p2, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh6/c;

    .line 9
    .line 10
    invoke-static {v0}, Lv7/l;->n(Lh6/c;)Lh6/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Throwable;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Lh6/c;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/zykj/mistake/widget/LineBaseProView;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, [I

    .line 37
    .line 38
    array-length v2, v1

    .line 39
    new-array v8, v2, [I

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_0
    array-length v3, v1

    .line 43
    if-ge v2, v3, :cond_0

    .line 44
    .line 45
    aget v3, v1, v2

    .line 46
    .line 47
    aput v3, v8, v2

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v3, Landroid/graphics/LinearGradient;

    .line 53
    .line 54
    iget v1, v0, Lcom/zykj/mistake/widget/BaseProView;->a:I

    .line 55
    .line 56
    int-to-float v6, v1

    .line 57
    const/4 v9, 0x0

    .line 58
    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    const/4 v0, 0x0

    .line 73
    move v1, v0

    .line 74
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/lang/Runnable;

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    :try_start_1
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 84
    .line 85
    invoke-static {v2, v0}, Lkotlinx/coroutines/x;->p(Lh6/h;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Le7/f;

    .line 91
    .line 92
    invoke-virtual {v0}, Le7/f;->d()Ljava/lang/Runnable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    iput-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    const/16 v0, 0x10

    .line 104
    .line 105
    if-lt v1, v0, :cond_1

    .line 106
    .line 107
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Le7/f;

    .line 110
    .line 111
    iget-object v2, v0, Le7/f;->b:Lkotlinx/coroutines/r;

    .line 112
    .line 113
    invoke-static {v2, v0}, Le7/a;->j(Lkotlinx/coroutines/r;Lh6/h;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Le7/f;

    .line 122
    .line 123
    iget-object v1, v0, Le7/f;->b:Lkotlinx/coroutines/r;

    .line 124
    .line 125
    invoke-static {v1, v0, p0}, Le7/a;->i(Lkotlinx/coroutines/r;Lh6/h;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    .line 128
    :goto_2
    return-void

    .line 129
    :catchall_1
    move-exception v0

    .line 130
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Le7/f;

    .line 133
    .line 134
    iget-object v2, v1, Le7/f;->f:Ljava/lang/Object;

    .line 135
    .line 136
    monitor-enter v2

    .line 137
    :try_start_2
    sget-object v3, Le7/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 138
    .line 139
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 140
    .line 141
    .line 142
    monitor-exit v2

    .line 143
    throw v0

    .line 144
    :catchall_2
    move-exception v0

    .line 145
    monitor-exit v2

    .line 146
    throw v0

    .line 147
    :pswitch_2
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lcom/zykj/mistake/widget/StemWebView;

    .line 150
    .line 151
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/widget/StemWebView;->b(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_3
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Landroid/content/Context;

    .line 162
    .line 163
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Lcom/tencent/bugly/BuglyStrategy;

    .line 166
    .line 167
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/s;->b(Landroid/content/Context;Lcom/tencent/bugly/BuglyStrategy;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_4
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lcom/tencent/bugly/proguard/b1;

    .line 174
    .line 175
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b1;->b:Lcom/tencent/bugly/proguard/ay;

    .line 176
    .line 177
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ljava/lang/String;

    .line 180
    .line 181
    const/4 v2, 0x1

    .line 182
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/ay;->a(Z)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    :try_start_3
    const-string v2, "read trace first dump for create time!"

    .line 189
    .line 190
    const/4 v3, 0x0

    .line 191
    new-array v4, v3, [Ljava/lang/Object;

    .line 192
    .line 193
    invoke-static {v2, v4}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v3}, Lcom/tencent/bugly/crashreport/crash/anr/TraceFileHelper;->readFirstDumpInfo(Ljava/lang/String;Z)Lcom/tencent/bugly/crashreport/crash/anr/TraceFileHelper$a;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-wide/16 v4, -0x1

    .line 201
    .line 202
    if-eqz v2, :cond_3

    .line 203
    .line 204
    iget-wide v6, v2, Lcom/tencent/bugly/crashreport/crash/anr/TraceFileHelper$a;->c:J

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :catchall_3
    move-exception v0

    .line 208
    goto :goto_4

    .line 209
    :cond_3
    move-wide v6, v4

    .line 210
    :goto_3
    cmp-long v2, v6, v4

    .line 211
    .line 212
    if-nez v2, :cond_4

    .line 213
    .line 214
    const-string/jumbo v2, "trace dump fail could not get time!"

    .line 215
    .line 216
    .line 217
    new-array v3, v3, [Ljava/lang/Object;

    .line 218
    .line 219
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/al;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    :cond_4
    invoke-virtual {v0, v6, v7}, Lcom/tencent/bugly/proguard/ay;->a(J)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_5

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_5
    invoke-virtual {v0, v6, v7, v1}, Lcom/tencent/bugly/proguard/ay;->a(JLjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :goto_4
    invoke-static {v0}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/Throwable;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_6

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 244
    .line 245
    .line 246
    :cond_6
    const-string v1, "handle anr error %s"

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    :cond_7
    :goto_5
    return-void

    .line 264
    :pswitch_5
    :try_start_4
    invoke-static {}, Lcom/tencent/bugly/proguard/aq;->b()Lcom/tencent/bugly/proguard/aq;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v1, "Register broadcast receiver of Bugly."

    .line 273
    .line 274
    const/4 v2, 0x0

    .line 275
    new-array v2, v2, [Ljava/lang/Object;

    .line 276
    .line 277
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v1, v0

    .line 283
    check-cast v1, Lcom/tencent/bugly/proguard/aq;

    .line 284
    .line 285
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 286
    :try_start_5
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Lcom/tencent/bugly/proguard/aq;

    .line 289
    .line 290
    invoke-static {v0}, Lcom/tencent/bugly/proguard/aq;->b(Lcom/tencent/bugly/proguard/aq;)Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {}, Lcom/tencent/bugly/proguard/aq;->b()Lcom/tencent/bugly/proguard/aq;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    iget-object v3, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, Lcom/tencent/bugly/proguard/aq;

    .line 301
    .line 302
    invoke-static {v3}, Lcom/tencent/bugly/proguard/aq;->a(Lcom/tencent/bugly/proguard/aq;)Landroid/content/IntentFilter;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    const-string v4, "com.tencent.bugly.BuglyBroadcastReceiver.permission"

    .line 307
    .line 308
    const/4 v5, 0x0

    .line 309
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 310
    .line 311
    .line 312
    monitor-exit v1

    .line 313
    goto :goto_6

    .line 314
    :catchall_4
    move-exception v0

    .line 315
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 316
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 317
    :catchall_5
    move-exception v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 319
    .line 320
    .line 321
    :goto_6
    return-void

    .line 322
    :pswitch_6
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, Ljava/lang/Runnable;

    .line 325
    .line 326
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 327
    .line 328
    .line 329
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lcom/tencent/bugly/proguard/ai;

    .line 332
    .line 333
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ai;->a(Lcom/tencent/bugly/proguard/ai;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    monitor-enter v1

    .line 338
    :try_start_7
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lcom/tencent/bugly/proguard/ai;

    .line 341
    .line 342
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ai;->b(Lcom/tencent/bugly/proguard/ai;)I

    .line 343
    .line 344
    .line 345
    monitor-exit v1

    .line 346
    return-void

    .line 347
    :catchall_6
    move-exception v0

    .line 348
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 349
    throw v0

    .line 350
    :pswitch_7
    :try_start_8
    iget-object v0, p0, Lcom/blankj/utilcode/util/a0;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Landroid/app/Activity;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_8

    .line 359
    .line 360
    iget-object v1, p0, Lcom/blankj/utilcode/util/a0;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 369
    .line 370
    .line 371
    :catch_0
    :cond_8
    return-void

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
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
