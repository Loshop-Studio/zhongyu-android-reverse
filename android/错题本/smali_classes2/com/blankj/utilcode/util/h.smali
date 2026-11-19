.class public final Lcom/blankj/utilcode/util/h;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/blankj/utilcode/util/h;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/ComponentCallbacks;I)V
    .locals 0

    .line 2
    iput p2, p0, Lcom/blankj/utilcode/util/h;->a:I

    iput-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 3
    const/4 v0, 0x5

    iput v0, p0, Lcom/blankj/utilcode/util/h;->a:I

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcom/blankj/utilcode/util/h;->a:I

    .line 4
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/h;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x67

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/mistake/fragment/NoteFragment;

    .line 15
    .line 16
    const-string v1, "msg"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v1, p1, Landroid/os/Message;->what:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_1

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_0
    const-string/jumbo p1, "\u4e0a\u4f20\u5931\u8d25"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseFragment;->b(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPFragment;->c()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    const-string v1, "UPLOAD_SUCCESS_URL"

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    const-string p1, ""

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/zykj/mistake/presenter/NotePresenter;

    .line 60
    .line 61
    iget-wide v2, v0, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 62
    .line 63
    new-instance v0, Lcom/zykj/mistake/entity/req/AddPictureNoteReq;

    .line 64
    .line 65
    invoke-direct {v0, v2, v3, p1}, Lcom/zykj/mistake/entity/req/AddPictureNoteReq;-><init>(JLjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 69
    .line 70
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v2, v0}, Lcom/zykj/mistake/network/b;->q(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;)Lq5/e;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v2, Lb5/h;

    .line 79
    .line 80
    invoke-direct {v2, v1, p1, v4}, Lb5/h;-><init>(Lcom/zykj/mistake/presenter/NotePresenter;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0, v2, v4}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    return-void

    .line 87
    :pswitch_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v2, v0

    .line 90
    check-cast v2, Ln1/c;

    .line 91
    .line 92
    iget p1, p1, Landroid/os/Message;->what:I

    .line 93
    .line 94
    if-ne p1, v5, :cond_7

    .line 95
    .line 96
    :goto_1
    invoke-virtual {v2}, Ln1/c;->a()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-lez p1, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, v2, Ln1/c;->c:Ljava/io/FileOutputStream;

    .line 107
    .line 108
    iget-object v0, v2, Ln1/c;->b:[B

    .line 109
    .line 110
    invoke-static {v0}, Lcom/stormdzh/lame4android/Lame;->flush([B)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-lez v1, :cond_6

    .line 115
    .line 116
    :try_start_0
    invoke-virtual {p1, v0, v4, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    :try_start_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :catch_0
    move-exception v0

    .line 124
    move-object p1, v0

    .line 125
    goto :goto_2

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object v1, v0

    .line 128
    goto :goto_4

    .line 129
    :catch_1
    move-exception v0

    .line 130
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    .line 132
    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_3
    invoke-static {}, Lcom/stormdzh/lame4android/Lame;->close()V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :goto_4
    if-eqz p1, :cond_5

    .line 147
    .line 148
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :catch_2
    move-exception v0

    .line 153
    move-object p1, v0

    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 155
    .line 156
    .line 157
    :cond_5
    :goto_5
    invoke-static {}, Lcom/stormdzh/lame4android/Lame;->close()V

    .line 158
    .line 159
    .line 160
    throw v1

    .line 161
    :cond_6
    :goto_6
    iget-object p1, v2, Ln1/c;->d:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    .line 171
    .line 172
    .line 173
    :cond_7
    return-void

    .line 174
    :pswitch_2
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 177
    .line 178
    iget p1, p1, Landroid/os/Message;->what:I

    .line 179
    .line 180
    const/16 v1, 0x3e8

    .line 181
    .line 182
    if-eq p1, v1, :cond_b

    .line 183
    .line 184
    const/16 v1, 0x7d0

    .line 185
    .line 186
    if-eq p1, v1, :cond_9

    .line 187
    .line 188
    const/16 v1, 0xbb8

    .line 189
    .line 190
    if-eq p1, v1, :cond_8

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_9
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 198
    .line 199
    .line 200
    iget p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:F

    .line 201
    .line 202
    const/4 v1, 0x0

    .line 203
    rem-float/2addr p1, v1

    .line 204
    add-float/2addr p1, v1

    .line 205
    rem-float/2addr p1, v1

    .line 206
    float-to-int p1, p1

    .line 207
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 208
    .line 209
    int-to-float v2, p1

    .line 210
    cmpl-float v3, v2, v1

    .line 211
    .line 212
    if-lez v3, :cond_a

    .line 213
    .line 214
    sub-float/2addr v1, v2

    .line 215
    float-to-int p1, v1

    .line 216
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_a
    neg-int p1, p1

    .line 220
    iput p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 221
    .line 222
    :goto_7
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 223
    .line 224
    new-instance v2, Lg3/b;

    .line 225
    .line 226
    iget p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 227
    .line 228
    invoke-direct {v2, v0, p1}, Lg3/b;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

    .line 229
    .line 230
    .line 231
    const-wide/16 v5, 0xa

    .line 232
    .line 233
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 234
    .line 235
    const-wide/16 v3, 0x0

    .line 236
    .line 237
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 245
    .line 246
    .line 247
    :goto_8
    return-void

    .line 248
    :pswitch_3
    const-string v0, "mSubmitFailedDialog"

    .line 249
    .line 250
    iget-object v4, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, Lcom/zykj/mistake/activity/SketchActivity;

    .line 253
    .line 254
    const-string v6, "msg"

    .line 255
    .line 256
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget v6, p1, Landroid/os/Message;->what:I

    .line 260
    .line 261
    if-eq v6, v2, :cond_e

    .line 262
    .line 263
    packed-switch v6, :pswitch_data_2

    .line 264
    .line 265
    .line 266
    goto :goto_9

    .line 267
    :pswitch_4
    invoke-virtual {v4}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :pswitch_5
    iget-object p1, v4, Lcom/zykj/mistake/activity/SketchActivity;->l:Landroidx/appcompat/app/AlertDialog;

    .line 272
    .line 273
    if-eqz p1, :cond_c

    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 279
    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_c
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :pswitch_6
    iget-object p1, v4, Lcom/zykj/mistake/activity/SketchActivity;->l:Landroidx/appcompat/app/AlertDialog;

    .line 287
    .line 288
    if-eqz p1, :cond_d

    .line 289
    .line 290
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 294
    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_d
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v1

    .line 301
    :cond_e
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    if-eqz p1, :cond_11

    .line 306
    .line 307
    const-string v0, "UPLOAD_SUCCESS_URL"

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    iget-object v0, v4, Lcom/zykj/mistake/activity/SketchActivity;->o:Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 314
    .line 315
    if-eqz p1, :cond_f

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-nez v1, :cond_10

    .line 322
    .line 323
    :cond_f
    const-string p1, ""

    .line 324
    .line 325
    :cond_10
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/entity/req/SetNoteReq;->setNote(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    check-cast p1, Lcom/zykj/mistake/presenter/SketchPresenter;

    .line 333
    .line 334
    iget-object v0, v4, Lcom/zykj/mistake/activity/SketchActivity;->o:Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 335
    .line 336
    const-string/jumbo v1, "req"

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-interface {v1, v0}, Lcom/zykj/mistake/network/b;->a(Lcom/zykj/mistake/entity/req/SetNoteReq;)Lq5/e;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    new-instance v1, Lb5/i;

    .line 351
    .line 352
    invoke-direct {v1, p1, v3}, Lb5/i;-><init>(Lcom/zykj/mistake/base/BasePresenter;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v0, v1}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 356
    .line 357
    .line 358
    iput-boolean v5, v4, Lcom/zykj/mistake/activity/SketchActivity;->q:Z

    .line 359
    .line 360
    :cond_11
    invoke-virtual {v4}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 361
    .line 362
    .line 363
    :goto_9
    return-void

    .line 364
    :pswitch_7
    const-string v0, "msg"

    .line 365
    .line 366
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    iget v0, p1, Landroid/os/Message;->what:I

    .line 370
    .line 371
    if-eq v0, v2, :cond_12

    .line 372
    .line 373
    packed-switch v0, :pswitch_data_3

    .line 374
    .line 375
    .line 376
    goto/16 :goto_11

    .line 377
    .line 378
    :pswitch_8
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 381
    .line 382
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 383
    .line 384
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 389
    .line 390
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 391
    .line 392
    invoke-virtual {p1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 393
    .line 394
    .line 395
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 398
    .line 399
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_11

    .line 403
    .line 404
    :pswitch_9
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 407
    .line 408
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 409
    .line 410
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 415
    .line 416
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 417
    .line 418
    invoke-virtual {p1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 419
    .line 420
    .line 421
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 424
    .line 425
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_11

    .line 429
    .line 430
    :pswitch_a
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 433
    .line 434
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 435
    .line 436
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 441
    .line 442
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 443
    .line 444
    invoke-virtual {p1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 445
    .line 446
    .line 447
    iget-object p1, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 450
    .line 451
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_11

    .line 455
    .line 456
    :cond_12
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    if-eqz p1, :cond_1d

    .line 461
    .line 462
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 463
    .line 464
    move-object v1, v0

    .line 465
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 466
    .line 467
    const-string v0, "UPLOAD_SUCCESS_URL"

    .line 468
    .line 469
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    if-nez v0, :cond_13

    .line 474
    .line 475
    const-string v0, ""

    .line 476
    .line 477
    :cond_13
    const-string v2, "UPLOAD_DATA"

    .line 478
    .line 479
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    if-eqz p1, :cond_1d

    .line 484
    .line 485
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 486
    .line 487
    .line 488
    move-result p1

    .line 489
    sget v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 490
    .line 491
    const-string v2, "End2: path--->> "

    .line 492
    .line 493
    monitor-enter v1

    .line 494
    :try_start_5
    const-string/jumbo v6, "uploadImage"

    .line 495
    .line 496
    .line 497
    new-instance v7, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    const-string v2, ", tag--->> "

    .line 506
    .line 507
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-static {v6, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 518
    .line 519
    .line 520
    if-ge p1, v3, :cond_17

    .line 521
    .line 522
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 523
    .line 524
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getStemShoot()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-nez v2, :cond_14

    .line 536
    .line 537
    goto :goto_a

    .line 538
    :cond_14
    if-nez p1, :cond_15

    .line 539
    .line 540
    :goto_a
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 541
    .line 542
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setStemShoot(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    goto :goto_b

    .line 546
    :catchall_1
    move-exception v0

    .line 547
    move-object p1, v0

    .line 548
    goto/16 :goto_10

    .line 549
    .line 550
    :cond_15
    :goto_b
    if-nez p1, :cond_16

    .line 551
    .line 552
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 553
    .line 554
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraStems()Ljava/util/ArrayList;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v4, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    goto :goto_c

    .line 565
    :cond_16
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 566
    .line 567
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraStems()Ljava/util/ArrayList;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_17
    if-ne p1, v3, :cond_18

    .line 579
    .line 580
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 581
    .line 582
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraAnswers()Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v4, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    goto :goto_c

    .line 593
    :cond_18
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 594
    .line 595
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraAnswers()Ljava/util/ArrayList;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    :goto_c
    iget-object v0, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->q:[Ljava/lang/Integer;

    .line 606
    .line 607
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    aput-object v2, v0, p1

    .line 612
    .line 613
    iget-object p1, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->q:[Ljava/lang/Integer;

    .line 614
    .line 615
    array-length v0, p1

    .line 616
    move v2, v4

    .line 617
    :goto_d
    if-ge v2, v0, :cond_19

    .line 618
    .line 619
    aget-object v6, p1, v2

    .line 620
    .line 621
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    if-eq v6, v5, :cond_1c

    .line 626
    .line 627
    add-int/lit8 v2, v2, 0x1

    .line 628
    .line 629
    goto :goto_d

    .line 630
    :cond_19
    iget-object p1, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 631
    .line 632
    if-eqz p1, :cond_1a

    .line 633
    .line 634
    move p1, v5

    .line 635
    goto :goto_e

    .line 636
    :cond_1a
    move p1, v4

    .line 637
    :goto_e
    if-eqz p1, :cond_1b

    .line 638
    .line 639
    invoke-virtual {v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    check-cast p1, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 644
    .line 645
    iget-object v0, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 646
    .line 647
    const-string/jumbo v2, "req"

    .line 648
    .line 649
    .line 650
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-interface {v2, v0}, Lcom/zykj/mistake/network/b;->t(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v2, Lb5/b;

    .line 662
    .line 663
    invoke-direct {v2, p1, v3}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {p1, v0, v2, v4}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 667
    .line 668
    .line 669
    goto :goto_f

    .line 670
    :cond_1b
    invoke-virtual {v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    check-cast p1, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 675
    .line 676
    iget-object v0, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 677
    .line 678
    const-string/jumbo v2, "req"

    .line 679
    .line 680
    .line 681
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 685
    .line 686
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    invoke-interface {v2, v0}, Lcom/zykj/mistake/network/b;->l(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    new-instance v2, Lb5/b;

    .line 695
    .line 696
    invoke-direct {v2, p1, v5}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {p1, v0, v2, v4}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 700
    .line 701
    .line 702
    :cond_1c
    :goto_f
    monitor-exit v1

    .line 703
    goto :goto_11

    .line 704
    :goto_10
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 705
    throw p1

    .line 706
    :cond_1d
    :goto_11
    return-void

    .line 707
    :pswitch_b
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Landroid/os/Handler;

    .line 710
    .line 711
    invoke-virtual {v0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :pswitch_c
    iget-object v0, p0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;

    .line 718
    .line 719
    iget-object v1, v0, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 720
    .line 721
    iget v2, p1, Landroid/os/Message;->what:I

    .line 722
    .line 723
    if-eqz v2, :cond_21

    .line 724
    .line 725
    if-eq v2, v5, :cond_20

    .line 726
    .line 727
    if-eq v2, v3, :cond_1e

    .line 728
    .line 729
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 730
    .line 731
    .line 732
    goto :goto_12

    .line 733
    :cond_1e
    sget v1, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->d:I

    .line 734
    .line 735
    invoke-virtual {v0, p1}, Lcom/blankj/utilcode/util/MessengerUtils$ServerService;->a(Landroid/os/Message;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 739
    .line 740
    .line 741
    move-result-object p1

    .line 742
    if-eqz p1, :cond_22

    .line 743
    .line 744
    const-string v0, "MESSENGER_UTILS"

    .line 745
    .line 746
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object p1

    .line 750
    if-eqz p1, :cond_22

    .line 751
    .line 752
    sget-object v0, Lcom/blankj/utilcode/util/i;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 753
    .line 754
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object p1

    .line 758
    if-nez p1, :cond_1f

    .line 759
    .line 760
    goto :goto_12

    .line 761
    :cond_1f
    new-instance p1, Ljava/lang/ClassCastException;

    .line 762
    .line 763
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 764
    .line 765
    .line 766
    throw p1

    .line 767
    :cond_20
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 768
    .line 769
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 770
    .line 771
    .line 772
    move-result-object p1

    .line 773
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    goto :goto_12

    .line 777
    :cond_21
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 778
    .line 779
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 784
    .line 785
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    :cond_22
    :goto_12
    return-void

    .line 789
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    :pswitch_data_1
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    :pswitch_data_2
    .packed-switch 0xc9
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    :pswitch_data_3
    .packed-switch 0xc9
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method
