.class public Le0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;Landroid/content/Context;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Le0/g;->b(Landroid/content/Intent;Landroid/content/Context;I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public b(Landroid/content/Intent;Landroid/content/Context;I)I
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v2, "Delete msg("

    .line 4
    .line 5
    const-string v3, "Open msg("

    .line 6
    .line 7
    invoke-static {}, Lc0/n;->a()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const-string v5, "action_type"

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const-string v7, "notification_open"

    .line 18
    .line 19
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const-string v7, ".AGOO"

    .line 24
    .line 25
    const-string v9, "messageId"

    .line 26
    .line 27
    const-string v11, "extraMap"

    .line 28
    .line 29
    const-string v12, "notificationOpenType"

    .line 30
    .line 31
    const-string v13, "group"

    .line 32
    .line 33
    const-string v14, "extData"

    .line 34
    .line 35
    const-string v15, "summary"

    .line 36
    .line 37
    const-string v8, "title"

    .line 38
    .line 39
    const-string v10, "msgId"

    .line 40
    .line 41
    move/from16 v16, v6

    .line 42
    .line 43
    const-string v6, ")"

    .line 44
    .line 45
    move-object/from16 v17, v2

    .line 46
    .line 47
    const-string v2, "MPS:CPushServiceListener"

    .line 48
    .line 49
    move-object/from16 v18, v5

    .line 50
    .line 51
    if-eqz v16, :cond_c

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    move-object/from16 v19, v6

    .line 58
    .line 59
    const-string v6, "realIntent"

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Landroid/content/Intent;

    .line 66
    .line 67
    const/high16 v6, 0x14000000

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v5, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    move-object/from16 v20, v3

    .line 81
    .line 82
    invoke-virtual {v5, v15}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object/from16 v21, v2

    .line 95
    .line 96
    move-object/from16 v17, v14

    .line 97
    .line 98
    const/4 v14, 0x1

    .line 99
    invoke-virtual {v5, v12, v14}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const-string v14, "notificationId"

    .line 104
    .line 105
    move-object/from16 v22, v4

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-virtual {v5, v14, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v5, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-object/from16 v18, v5

    .line 117
    .line 118
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    .line 119
    .line 120
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 121
    .line 122
    .line 123
    move-object/from16 v23, v7

    .line 124
    .line 125
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v5, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    const-string v7, "com.alibaba.push2.action.NOTIFICATION_OPENED"

    .line 133
    .line 134
    invoke-virtual {v5, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v9, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v8, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v15, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v11, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v12, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v14, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_0

    .line 160
    .line 161
    invoke-virtual {v5, v13, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    .line 163
    .line 164
    :cond_0
    const/16 v0, 0x20

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    move-object/from16 v3, p2

    .line 169
    .line 170
    :goto_0
    move-object/from16 v1, v17

    .line 171
    .line 172
    move-object/from16 v7, v19

    .line 173
    .line 174
    move-object/from16 v2, v20

    .line 175
    .line 176
    move-object/from16 v5, v21

    .line 177
    .line 178
    goto/16 :goto_8

    .line 179
    .line 180
    :goto_1
    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 181
    .line 182
    .line 183
    if-nez v22, :cond_1

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    move-object/from16 v1, v23

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    move-object/from16 v3, p2

    .line 207
    .line 208
    :try_start_1
    invoke-virtual {v3, v5, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :catchall_1
    move-exception v0

    .line 213
    goto :goto_0

    .line 214
    :cond_1
    move-object/from16 v3, p2

    .line 215
    .line 216
    move-object/from16 v4, v22

    .line 217
    .line 218
    invoke-virtual {v5, v3, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v3, v5, v0}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_2
    if-nez p3, :cond_2

    .line 229
    .line 230
    const-string v0, "android.intent.action.MAIN"

    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_2

    .line 241
    .line 242
    invoke-static {v3}, Le0/h;->a(Landroid/content/Context;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_2

    .line 247
    .line 248
    sget-object v0, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 249
    .line 250
    new-instance v1, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v2, "app is in front, action:"

    .line 256
    .line 257
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 272
    .line 273
    .line 274
    goto/16 :goto_6

    .line 275
    .line 276
    :cond_2
    const/4 v0, 0x4

    .line 277
    if-ne v2, v0, :cond_3

    .line 278
    .line 279
    :try_start_2
    const-string v0, "open with no action"

    .line 280
    .line 281
    const/4 v4, 0x0

    .line 282
    new-array v1, v4, [Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 283
    .line 284
    move-object/from16 v5, v21

    .line 285
    .line 286
    :try_start_3
    invoke-static {v5, v0, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_6

    .line 290
    .line 291
    :catchall_2
    move-exception v0

    .line 292
    :goto_3
    move-object/from16 v1, v17

    .line 293
    .line 294
    move-object/from16 v7, v19

    .line 295
    .line 296
    move-object/from16 v2, v20

    .line 297
    .line 298
    goto/16 :goto_8

    .line 299
    .line 300
    :catchall_3
    move-exception v0

    .line 301
    move-object/from16 v5, v21

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_3
    move-object/from16 v5, v21

    .line 305
    .line 306
    const/4 v14, 0x1

    .line 307
    if-ne v2, v14, :cond_8

    .line 308
    .line 309
    const-string v0, "open app"

    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    new-array v1, v4, [Ljava/lang/Object;

    .line 313
    .line 314
    invoke-static {v5, v0, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    if-nez p3, :cond_7

    .line 318
    .line 319
    const-string v0, "android.permission.GET_TASKS"

    .line 320
    .line 321
    invoke-static {v3, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_6

    .line 326
    .line 327
    const-string v0, "android.permission.REORDER_TASKS"

    .line 328
    .line 329
    invoke-static {v3, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_6

    .line 334
    .line 335
    const-string v0, "activity"

    .line 336
    .line 337
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    move-object v1, v0

    .line 342
    check-cast v1, Landroid/app/ActivityManager;

    .line 343
    .line 344
    const v0, 0x7fffffff

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    :cond_4
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_5

    .line 360
    .line 361
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 366
    .line 367
    invoke-static {v0}, Le0/f;->a(Landroid/app/ActivityManager$RunningTaskInfo;)Landroid/content/ComponentName;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_4

    .line 384
    .line 385
    const-string v4, "move task to front"

    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    new-array v8, v7, [Ljava/lang/Object;

    .line 389
    .line 390
    invoke-static {v5, v4, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 391
    .line 392
    .line 393
    :try_start_4
    iget v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->id:I

    .line 394
    .line 395
    invoke-virtual {v1, v0, v7}, Landroid/app/ActivityManager;->moveTaskToFront(II)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 396
    .line 397
    .line 398
    goto :goto_6

    .line 399
    :catchall_4
    move-exception v0

    .line 400
    :try_start_5
    const-string v4, "move task to front fail"

    .line 401
    .line 402
    new-array v8, v7, [Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {v5, v4, v0, v8}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_5
    const-string v0, "do not find corresponing running task, start app with launch activity"

    .line 409
    .line 410
    const/4 v4, 0x0

    .line 411
    new-array v1, v4, [Ljava/lang/Object;

    .line 412
    .line 413
    invoke-static {v5, v0, v1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    move-object/from16 v1, v18

    .line 417
    .line 418
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 419
    .line 420
    .line 421
    goto :goto_6

    .line 422
    :cond_6
    move-object/from16 v1, v18

    .line 423
    .line 424
    const-string v0, "no get tasks and reorder tasks permission, start app with launch activity"

    .line 425
    .line 426
    const/4 v4, 0x0

    .line 427
    new-array v2, v4, [Ljava/lang/Object;

    .line 428
    .line 429
    invoke-static {v5, v0, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 433
    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_7
    move-object/from16 v1, v18

    .line 437
    .line 438
    const-string v0, "sdk version < 11 or start from activity, start app with launch activity"

    .line 439
    .line 440
    const/4 v4, 0x0

    .line 441
    new-array v2, v4, [Ljava/lang/Object;

    .line 442
    .line 443
    invoke-static {v5, v0, v2}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 447
    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_8
    move-object/from16 v1, v18

    .line 451
    .line 452
    const/4 v0, 0x2

    .line 453
    if-ne v2, v0, :cond_9

    .line 454
    .line 455
    const-string v0, "open activity"

    .line 456
    .line 457
    const/4 v4, 0x0

    .line 458
    new-array v2, v4, [Ljava/lang/Object;

    .line 459
    .line 460
    invoke-static {v5, v0, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    goto :goto_5

    .line 464
    :cond_9
    const/4 v0, 0x3

    .line 465
    if-ne v2, v0, :cond_a

    .line 466
    .line 467
    const-string v0, "open url"

    .line 468
    .line 469
    const/4 v4, 0x0

    .line 470
    new-array v2, v4, [Ljava/lang/Object;

    .line 471
    .line 472
    invoke-static {v5, v0, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :cond_a
    :goto_5
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 476
    .line 477
    .line 478
    :goto_6
    sget-object v0, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 479
    .line 480
    new-instance v1, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 483
    .line 484
    .line 485
    move-object/from16 v2, v20

    .line 486
    .line 487
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    move-object/from16 v7, v19

    .line 494
    .line 495
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    move-object/from16 v1, v17

    .line 506
    .line 507
    :goto_7
    invoke-static {v3, v6, v1}, Lcom/taobao/agoo/TaobaoRegister;->clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    goto :goto_9

    .line 511
    :goto_8
    :try_start_6
    const-string v4, "startActivity error"

    .line 512
    .line 513
    const/4 v8, 0x0

    .line 514
    new-array v9, v8, [Ljava/lang/Object;

    .line 515
    .line 516
    invoke-static {v5, v4, v0, v9}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 517
    .line 518
    .line 519
    sget-object v0, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 520
    .line 521
    new-instance v4, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-interface {v0, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    goto :goto_7

    .line 543
    :cond_b
    :goto_9
    const/16 v16, 0x0

    .line 544
    .line 545
    goto/16 :goto_d

    .line 546
    .line 547
    :catchall_5
    move-exception v0

    .line 548
    sget-object v4, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 549
    .line 550
    new-instance v5, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    invoke-interface {v4, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    invoke-static {v3, v6, v1}, Lcom/taobao/agoo/TaobaoRegister;->clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v0

    .line 575
    :cond_c
    move-object/from16 v3, p2

    .line 576
    .line 577
    move-object v5, v2

    .line 578
    move-object v1, v7

    .line 579
    move-object v7, v6

    .line 580
    const-string v2, "notification_delete"

    .line 581
    .line 582
    move-object/from16 v21, v5

    .line 583
    .line 584
    move-object/from16 v6, v18

    .line 585
    .line 586
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    if-eqz v2, :cond_e

    .line 595
    .line 596
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const-string v5, "task_id"

    .line 601
    .line 602
    invoke-virtual {v0, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    :try_start_7
    new-instance v6, Landroid/content/Intent;

    .line 610
    .line 611
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    invoke-virtual {v6, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 619
    .line 620
    .line 621
    const-string v10, "com.alibaba.push2.action.NOTIFICATION_REMOVED"

    .line 622
    .line 623
    invoke-virtual {v6, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v6, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v9

    .line 633
    invoke-virtual {v6, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v15}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    invoke-virtual {v6, v15, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v0, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    invoke-virtual {v6, v11, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 648
    .line 649
    .line 650
    const/4 v14, 0x1

    .line 651
    invoke-virtual {v0, v12, v14}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 652
    .line 653
    .line 654
    move-result v8

    .line 655
    invoke-virtual {v6, v12, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v6, v13, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 663
    .line 664
    .line 665
    const/16 v0, 0x20

    .line 666
    .line 667
    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 668
    .line 669
    .line 670
    if-nez v4, :cond_d

    .line 671
    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v3, v6, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    goto :goto_a

    .line 695
    :catchall_6
    move-exception v0

    .line 696
    move-object/from16 v4, v17

    .line 697
    .line 698
    goto :goto_c

    .line 699
    :cond_d
    invoke-virtual {v6, v3, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v3, v6, v0}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 707
    .line 708
    .line 709
    :goto_a
    sget-object v0, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 710
    .line 711
    new-instance v1, Ljava/lang/StringBuilder;

    .line 712
    .line 713
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 714
    .line 715
    .line 716
    move-object/from16 v4, v17

    .line 717
    .line 718
    :goto_b
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    invoke-static {v3, v2, v5}, Lcom/taobao/agoo/TaobaoRegister;->dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    goto/16 :goto_9

    .line 738
    .line 739
    :goto_c
    :try_start_8
    const-string v1, "send intent failed."

    .line 740
    .line 741
    const/4 v8, 0x0

    .line 742
    new-array v6, v8, [Ljava/lang/Object;

    .line 743
    .line 744
    move-object/from16 v8, v21

    .line 745
    .line 746
    invoke-static {v8, v1, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 747
    .line 748
    .line 749
    sget-object v0, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 750
    .line 751
    new-instance v1, Ljava/lang/StringBuilder;

    .line 752
    .line 753
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 754
    .line 755
    .line 756
    goto :goto_b

    .line 757
    :catchall_7
    move-exception v0

    .line 758
    sget-object v1, Lc0/n;->a:Lcom/alibaba/sdk/android/logger/ILog;

    .line 759
    .line 760
    new-instance v6, Ljava/lang/StringBuilder;

    .line 761
    .line 762
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    invoke-interface {v1, v4}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-static {v3, v2, v5}, Lcom/taobao/agoo/TaobaoRegister;->dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :cond_e
    const-string v1, "message_open"

    .line 786
    .line 787
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    if-eqz v1, :cond_f

    .line 796
    .line 797
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-static {v3, v1, v0}, Lcom/taobao/agoo/TaobaoRegister;->clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_9

    .line 809
    .line 810
    :cond_f
    const-string v1, "message_delete"

    .line 811
    .line 812
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    if-eqz v1, :cond_b

    .line 821
    .line 822
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v3, v1, v0}, Lcom/taobao/agoo/TaobaoRegister;->dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_9

    .line 834
    .line 835
    :goto_d
    return v16
.end method
