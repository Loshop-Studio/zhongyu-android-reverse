.class public Lh5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/c;-><init>(Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public final synthetic c:Lh5/c;


# direct methods
.method public constructor <init>(Lh5/c;Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh5/c$a;->c:Lh5/c;

    .line 2
    .line 3
    iput-object p2, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lh5/c$a;->b:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 7

    .line 1
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 2
    .line 3
    new-instance v1, Lk5/g;

    .line 4
    .line 5
    invoke-direct {v1}, Lk5/g;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lh5/c;->h(Lh5/c;Lk5/g;)Lk5/g;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 12
    .line 13
    new-instance v1, Li5/c;

    .line 14
    .line 15
    iget-object v2, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const-string v5, "_"

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getBrand(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v4, "share_pre_grs_conf_"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v1, v2, v3}, Li5/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lh5/c;->d(Lh5/c;Li5/c;)Li5/c;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 51
    .line 52
    new-instance v1, Li5/c;

    .line 53
    .line 54
    iget-object v2, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4, v5}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getBrand(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, "share_pre_grs_services_"

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-direct {v1, v2, v3}, Li5/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Lh5/c;->q(Lh5/c;Li5/c;)Li5/c;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 88
    .line 89
    new-instance v1, Li5/a;

    .line 90
    .line 91
    invoke-static {v0}, Lh5/c;->p(Lh5/c;)Li5/c;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v3, p0, Lh5/c$a;->c:Lh5/c;

    .line 96
    .line 97
    invoke-static {v3}, Lh5/c;->t(Lh5/c;)Li5/c;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v4, p0, Lh5/c$a;->c:Lh5/c;

    .line 102
    .line 103
    invoke-static {v4}, Lh5/c;->g(Lh5/c;)Lk5/g;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-direct {v1, v2, v3, v4}, Li5/a;-><init>(Li5/c;Li5/c;Lk5/g;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1}, Lh5/c;->c(Lh5/c;Li5/a;)Li5/a;

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 114
    .line 115
    new-instance v1, Lh5/a;

    .line 116
    .line 117
    invoke-static {v0}, Lh5/c;->y(Lh5/c;)Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-object v3, p0, Lh5/c$a;->c:Lh5/c;

    .line 122
    .line 123
    invoke-static {v3}, Lh5/c;->v(Lh5/c;)Li5/a;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v4, p0, Lh5/c$a;->c:Lh5/c;

    .line 128
    .line 129
    invoke-static {v4}, Lh5/c;->g(Lh5/c;)Lk5/g;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iget-object v6, p0, Lh5/c$a;->c:Lh5/c;

    .line 134
    .line 135
    invoke-static {v6}, Lh5/c;->t(Lh5/c;)Li5/c;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-direct {v1, v2, v3, v4, v6}, Lh5/a;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;Lk5/g;Li5/c;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Lh5/c;->b(Lh5/c;Lh5/a;)Lh5/a;

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-string v1, ""

    .line 156
    .line 157
    const/4 v2, 0x1

    .line 158
    if-nez v0, :cond_1

    .line 159
    .line 160
    new-instance v0, Li5/c;

    .line 161
    .line 162
    iget-object v3, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 163
    .line 164
    new-instance v4, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v6, v5}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getBrand(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v5, "share_pre_grs_local_conf_"

    .line 181
    .line 182
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-direct {v0, v3, v4}, Li5/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v3, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v4, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v4, "#localConfig"

    .line 207
    .line 208
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v0, v3, v1}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_0

    .line 224
    .line 225
    new-instance v4, Lj5/b;

    .line 226
    .line 227
    invoke-direct {v4}, Lj5/b;-><init>()V

    .line 228
    .line 229
    .line 230
    iget-object v5, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 231
    .line 232
    invoke-virtual {v4, v5, v3}, Lj5/b;->g(Landroid/content/Context;Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_1

    .line 237
    .line 238
    :cond_0
    new-instance v3, Lj5/b;

    .line 239
    .line 240
    iget-object v4, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 241
    .line 242
    invoke-direct {v3, v4, v2}, Lj5/b;-><init>(Landroid/content/Context;Z)V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lh5/c;->u()Ljava/util/concurrent/ExecutorService;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    new-instance v5, Lh5/c$a$a;

    .line 250
    .line 251
    invoke-direct {v5, p0, v3, v0}, Lh5/c$a$a;-><init>(Lh5/c$a;Lj5/b;Li5/c;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 255
    .line 256
    .line 257
    :cond_1
    new-instance v0, Lm5/c;

    .line 258
    .line 259
    iget-object v3, p0, Lh5/c$a;->b:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 260
    .line 261
    iget-object v4, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 262
    .line 263
    invoke-direct {v0, v3, v4}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lm5/c;->d()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-static {}, Lh5/c;->w()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    new-instance v4, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const-string v5, "scan serviceSet is: "

    .line 280
    .line 281
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-static {v3, v4}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-object v3, p0, Lh5/c$a;->c:Lh5/c;

    .line 295
    .line 296
    invoke-static {v3}, Lh5/c;->t(Lh5/c;)Li5/c;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const-string v4, "services"

    .line 301
    .line 302
    invoke-virtual {v3, v4, v1}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-static {v1, v0}, Lk5/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-nez v3, :cond_2

    .line 315
    .line 316
    iget-object v3, p0, Lh5/c$a;->c:Lh5/c;

    .line 317
    .line 318
    invoke-static {v3}, Lh5/c;->t(Lh5/c;)Li5/c;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-virtual {v3, v4, v0}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-static {}, Lh5/c;->w()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    new-instance v4, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v5, "postList is:"

    .line 335
    .line 336
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-static {v0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-static {v3, v4}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    invoke-static {}, Lh5/c;->w()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    new-instance v4, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const-string v5, "currentServices:"

    .line 363
    .line 364
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-static {v1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-static {v3, v4}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_2

    .line 386
    .line 387
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 388
    .line 389
    invoke-static {v0}, Lh5/c;->y(Lh5/c;)Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iget-object v1, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 394
    .line 395
    invoke-virtual {v0, v2, v2, v1}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    iget-object v1, p0, Lh5/c$a;->c:Lh5/c;

    .line 400
    .line 401
    invoke-static {v1}, Lh5/c;->g(Lh5/c;)Lk5/g;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v1, v0}, Lk5/g;->e(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 409
    .line 410
    invoke-static {v0}, Lh5/c;->g(Lh5/c;)Lk5/g;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    new-instance v2, Lm5/c;

    .line 415
    .line 416
    iget-object v0, p0, Lh5/c$a;->b:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 417
    .line 418
    iget-object v3, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 419
    .line 420
    invoke-direct {v2, v0, v3}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 421
    .line 422
    .line 423
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 424
    .line 425
    invoke-static {v0}, Lh5/c;->t(Lh5/c;)Li5/c;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 430
    .line 431
    invoke-static {v0}, Lh5/c;->y(Lh5/c;)Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getQueryTimeout()I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    const/4 v3, 0x0

    .line 440
    const/4 v4, 0x0

    .line 441
    invoke-virtual/range {v1 .. v6}, Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V

    .line 442
    .line 443
    .line 444
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 445
    .line 446
    .line 447
    move-result-wide v0

    .line 448
    invoke-static {}, Lh5/c;->x()J

    .line 449
    .line 450
    .line 451
    move-result-wide v2

    .line 452
    sub-long/2addr v0, v2

    .line 453
    invoke-static {}, Lh5/c;->x()J

    .line 454
    .line 455
    .line 456
    move-result-wide v2

    .line 457
    const-wide/16 v4, 0x0

    .line 458
    .line 459
    cmp-long v2, v2, v4

    .line 460
    .line 461
    if-eqz v2, :cond_3

    .line 462
    .line 463
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 464
    .line 465
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    .line 466
    .line 467
    .line 468
    move-result-wide v0

    .line 469
    const-wide/16 v2, 0x18

    .line 470
    .line 471
    cmp-long v0, v0, v2

    .line 472
    .line 473
    if-lez v0, :cond_4

    .line 474
    .line 475
    :cond_3
    invoke-static {}, Lh5/c;->w()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const-string v1, "Try to clear unUsed sp data."

    .line 480
    .line 481
    invoke-static {v0, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 485
    .line 486
    .line 487
    move-result-wide v0

    .line 488
    invoke-static {v0, v1}, Lh5/c;->a(J)J

    .line 489
    .line 490
    .line 491
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 492
    .line 493
    invoke-static {v0}, Lh5/c;->p(Lh5/c;)Li5/c;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-virtual {v1}, Li5/c;->b()Ljava/util/Map;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-static {v0, v1}, Lh5/c;->k(Lh5/c;Ljava/util/Map;)V

    .line 502
    .line 503
    .line 504
    :cond_4
    iget-object v0, p0, Lh5/c$a;->c:Lh5/c;

    .line 505
    .line 506
    invoke-static {v0}, Lh5/c;->v(Lh5/c;)Li5/a;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    iget-object v1, p0, Lh5/c$a;->b:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 511
    .line 512
    iget-object v2, p0, Lh5/c$a;->a:Landroid/content/Context;

    .line 513
    .line 514
    invoke-virtual {v0, v1, v2}, Li5/a;->h(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 515
    .line 516
    .line 517
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 518
    .line 519
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh5/c$a;->a()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
