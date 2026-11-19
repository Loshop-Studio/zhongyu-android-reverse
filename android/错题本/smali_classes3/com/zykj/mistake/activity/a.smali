# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final synthetic Lcom/zykj/mistake/activity/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/a;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/a;->b:Lcom/zykj/mistake/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
# RE I/O 保存长整数偏好（SharedPreferences$Editor.putLong）。
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/mistake/activity/a;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 9
    .line 10
    check-cast p1, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 11
    .line 12
    sget v1, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 13
    .line 14
    const-string v1, "target"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lcom/zykj/mistake/main/u0;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lcom/zykj/mistake/main/u0;-><init>(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/activity/a;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 35
    .line 36
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 37
    .line 38
    sget v3, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 39
    .line 40
    const-string v3, "userInfo"

    .line 41
    .line 42
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p1, Lcom/zykj/message/server/bean/UserInfo;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, p1, Lcom/zykj/message/server/bean/UserInfo;->c:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v3, "_"

    .line 58
    .line 59
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const-string v4, "<set-?>"

    .line 70
    .line 71
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sput-object v3, Lcom/zykj/mistake/utils/e;->d:Ljava/lang/String;

    .line 75
    .line 76
    const-string v3, "SP_USER_ID"

    .line 77
    .line 78
    iget-object v4, p1, Lcom/zykj/message/server/bean/UserInfo;->a:Ljava/lang/Long;

    .line 79
    .line 80
    const-string v5, "getId(...)"

    .line 81
    .line 82
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    const-string v6, "zykjMistake"

    .line 90
    .line 91
    invoke-virtual {v0, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v2, p1, Lcom/zykj/message/server/bean/UserInfo;->a:Ljava/lang/Long;

    .line 110
    .line 111
    const-string v3, "getId(...)"

    .line 112
    .line 113
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    const-string v4, ""

    .line 121
    .line 122
    iget-object v5, p1, Lcom/zykj/message/server/bean/UserInfo;->d:Ljava/lang/String;

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    invoke-static {v5}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    goto :goto_1

    .line 136
    :cond_0
    move-object v5, v6

    .line 137
    :goto_1
    if-nez v5, :cond_1

    .line 138
    .line 139
    move-object v5, v4

    .line 140
    :cond_1
    invoke-static {v5}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_4

    .line 145
    .line 146
    iget-object p1, p1, Lcom/zykj/message/server/bean/UserInfo;->c:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz p1, :cond_2

    .line 149
    .line 150
    invoke-static {p1}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    goto :goto_2

    .line 159
    :cond_2
    move-object p1, v6

    .line 160
    :goto_2
    if-nez p1, :cond_3

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    move-object v4, p1

    .line 164
    goto :goto_3

    .line 165
    :cond_4
    move-object v4, v5

    .line 166
    :goto_3
    monitor-enter v0

    .line 167
    :try_start_0
    iget-object p1, v0, Lcom/zykj/mistake/main/MainShellViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 168
    .line 169
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    check-cast p1, Lcom/zykj/mistake/main/e;

    .line 174
    .line 175
    if-eqz p1, :cond_5

    .line 176
    .line 177
    iget-wide v7, p1, Lcom/zykj/mistake/main/e;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    cmp-long p1, v7, v2

    .line 180
    .line 181
    if-nez p1, :cond_5

    .line 182
    .line 183
    monitor-exit v0

    .line 184
    goto :goto_4

    .line 185
    :catchall_0
    move-exception p1

    .line 186
    goto :goto_5

    .line 187
    :cond_5
    :try_start_1
    iget p1, v0, Lcom/zykj/mistake/main/MainShellViewModel;->j:I

    .line 188
    .line 189
    add-int/2addr p1, v1

    .line 190
    iput p1, v0, Lcom/zykj/mistake/main/MainShellViewModel;->j:I

    .line 191
    .line 192
    iget-object v1, v0, Lcom/zykj/mistake/main/MainShellViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 193
    .line 194
    new-instance v5, Lcom/zykj/mistake/main/e;

    .line 195
    .line 196
    invoke-direct {v5, v2, v3, p1, v4}, Lcom/zykj/mistake/main/e;-><init>(JILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v6, v5}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    monitor-exit v0

    .line 206
    :goto_4
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 207
    .line 208
    return-object p1

    .line 209
    :goto_5
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    throw p1

    .line 211
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/activity/a;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 212
    .line 213
    check-cast p1, Lr6/a;

    .line 214
    .line 215
    sget v1, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 216
    .line 217
    const-string v1, "onResult"

    .line 218
    .line 219
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iput-object p1, v0, Lcom/zykj/mistake/activity/MainActivity;->f:Lr6/a;

    .line 223
    .line 224
    iget-object p1, v0, Lcom/zykj/mistake/activity/MainActivity;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 225
    .line 226
    new-instance v1, Landroid/content/Intent;

    .line 227
    .line 228
    const-class v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 229
    .line 230
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/mistake/activity/a;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 239
    .line 240
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 241
    .line 242
    sget v3, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 243
    .line 244
    const-string v3, "it"

    .line 245
    .line 246
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v3, p1, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v4, p1, Lcom/zykj/message/server/bean/ServerInfo;->b:Ljava/lang/String;

    .line 252
    .line 253
    iget-object p1, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 254
    .line 255
    sget-object v5, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    .line 256
    .line 257
    if-ne p1, v5, :cond_8

    .line 258
    .line 259
    sget-object p1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 260
    .line 261
    const-string p1, "getServerUrl(...)"

    .line 262
    .line 263
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    sput-object v4, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 267
    .line 268
    const-string p1, "getToken(...)"

    .line 269
    .line 270
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    sput-object v3, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 274
    .line 275
    const-string p1, "SP_API_URL"

    .line 276
    .line 277
    invoke-static {v0, p1, v4}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string p1, "SP_API_TOKEN"

    .line 281
    .line 282
    invoke-static {v0, p1, v3}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    sget-object p1, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 286
    .line 287
    new-instance v3, Lcom/zykj/mistake/activity/a;

    .line 288
    .line 289
    const/4 v4, 0x2

    .line 290
    invoke-direct {v3, v0, v4}, Lcom/zykj/mistake/activity/a;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v3}, Lcom/zykj/message/client/MessageClient;->getUserInfo(Lr6/c;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-nez p1, :cond_8

    .line 301
    .line 302
    iget-boolean p1, v0, Lcom/zykj/mistake/activity/MainActivity;->d:Z

    .line 303
    .line 304
    if-eqz p1, :cond_8

    .line 305
    .line 306
    const-string p1, "cn.com.techvision.appstore"

    .line 307
    .line 308
    :try_start_3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-virtual {v3, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    iget-boolean p1, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :catch_0
    move-exception p1

    .line 320
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 321
    .line 322
    .line 323
    move p1, v2

    .line 324
    :goto_6
    if-nez p1, :cond_7

    .line 325
    .line 326
    sget-object p1, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 327
    .line 328
    sget-boolean v3, Lc5/c;->a:Z

    .line 329
    .line 330
    if-eqz v3, :cond_6

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_6
    sput-boolean v1, Lc5/c;->a:Z

    .line 334
    .line 335
    const-string v3, "com.zykj.mistake"

    .line 336
    .line 337
    sget-object v4, Ld5/b;->a:Lokhttp3/z;

    .line 338
    .line 339
    new-instance v4, Lb0/d;

    .line 340
    .line 341
    invoke-direct {v4, v1}, Lb0/d;-><init>(I)V

    .line 342
    .line 343
    .line 344
    sget-object v5, Ld5/b;->a:Lokhttp3/z;

    .line 345
    .line 346
    const-string v6, "client == null"

    .line 347
    .line 348
    invoke-static {v5, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    iput-object v5, v4, Lb0/d;->a:Ljava/lang/Object;

    .line 352
    .line 353
    new-instance v5, Lcom/google/gson/h;

    .line 354
    .line 355
    invoke-direct {v5}, Lcom/google/gson/h;-><init>()V

    .line 356
    .line 357
    .line 358
    iput-boolean v1, v5, Lcom/google/gson/h;->j:Z

    .line 359
    .line 360
    invoke-virtual {v5}, Lcom/google/gson/h;->a()Lcom/google/gson/g;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    new-instance v5, Ld8/a;

    .line 365
    .line 366
    invoke-direct {v5, v1}, Ld8/a;-><init>(Lcom/google/gson/g;)V

    .line 367
    .line 368
    .line 369
    iget-object v1, v4, Lb0/d;->c:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    new-instance v1, Lc8/e;

    .line 377
    .line 378
    invoke-direct {v1, v2}, Lc8/e;-><init>(I)V

    .line 379
    .line 380
    .line 381
    iget-object v5, v4, Lb0/d;->d:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v5, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4, p1}, Lb0/d;->b(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4}, Lb0/d;->c()Lretrofit2/p0;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    const-class v1, Ld5/a;

    .line 396
    .line 397
    invoke-virtual {p1, v1}, Lretrofit2/p0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    const-string v1, "create(...)"

    .line 402
    .line 403
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    check-cast p1, Ld5/a;

    .line 407
    .line 408
    const/16 v1, 0x27dd

    .line 409
    .line 410
    invoke-interface {p1, v3, v1, v2}, Ld5/a;->a(Ljava/lang/String;II)Lq5/e;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    sget-object v1, Lc6/f;->a:Lq5/j;

    .line 415
    .line 416
    invoke-virtual {p1, v1}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {p1, v1}, Lq5/e;->a(Lr5/e;)Lio/reactivex/internal/operators/observable/f;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    new-instance v1, Lc5/a;

    .line 429
    .line 430
    invoke-direct {v1, v0}, Lc5/a;-><init>(Landroid/content/Context;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1, v1}, Lq5/e;->b(Lq5/g;)V

    .line 434
    .line 435
    .line 436
    :cond_7
    :goto_7
    iput-boolean v2, v0, Lcom/zykj/mistake/activity/MainActivity;->d:Z

    .line 437
    .line 438
    :cond_8
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 439
    .line 440
    return-object p1

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
