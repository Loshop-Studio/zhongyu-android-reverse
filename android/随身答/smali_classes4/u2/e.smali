.class public Lu2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Ljava/lang/String; = ""

.field public static c:Ljava/lang/String; = ""

.field public static d:Ljava/lang/String; = null

.field public static e:Ljava/lang/String; = null

.field public static f:Ljava/lang/String; = ""

.field public static g:Z


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lu2/e;->a:I

    .line 6
    .line 7
    return-void
.end method

.method public static b(Landroid/content/Context;)J
    .locals 4

    .line 1
    sget-wide v0, Lv2/a;->c:J

    .line 2
    .line 3
    sget-wide v2, Lv2/a;->b:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    sget-boolean p0, Lv2/f;->a:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "free size is "

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v2, "EnvelopeManager"

    .line 28
    .line 29
    invoke-static {v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    return-wide v0
.end method

.method public static h()V
    .locals 1

    .line 1
    sget-object v0, Lu2/e;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-object v0, Lu2/e;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lw2/g;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static i(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 13

    .line 1
    const-string v0, "umid"

    .line 2
    .line 3
    const-string v1, "failed_requests"

    .line 4
    .line 5
    const-string v2, "2G/3G"

    .line 6
    .line 7
    const-string v3, "Android"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    sget-object v6, Lu2/e;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v7, 0x0

    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    .line 24
    .line 25
    sget-object v3, Lu2/e;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :catch_0
    move-object v2, v4

    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    :try_start_2
    invoke-static {}, Lz2/d;->t()V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v8, "app_signature"

    .line 47
    .line 48
    invoke-static {p0}, Lv2/b;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v8, "app_sig_sha1"

    .line 56
    .line 57
    invoke-static {p0}, Lv2/b;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    const-string v8, "app_sig_sha"

    .line 65
    .line 66
    invoke-static {p0}, Lv2/b;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v8, "app_version"

    .line 74
    .line 75
    invoke-static {p0}, Lv2/b;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    const-string v8, "version_code"

    .line 83
    .line 84
    invoke-static {p0}, Lv2/b;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v8, "idmd5"

    .line 96
    .line 97
    invoke-static {p0}, Lv2/b;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    const-string v8, "cpu"

    .line 105
    .line 106
    invoke-static {}, Lv2/b;->k()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Lv2/b;->A(Landroid/content/Context;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    const-string v10, ""

    .line 122
    .line 123
    const-string v11, "mccmnc"

    .line 124
    .line 125
    if-nez v9, :cond_1

    .line 126
    .line 127
    :try_start_3
    invoke-virtual {v6, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    sput-object v8, Lu2/e;->f:Ljava/lang/String;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    invoke-virtual {v6, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    :goto_0
    invoke-static {p0}, Lv2/b;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-nez v9, :cond_2

    .line 145
    .line 146
    const-string v9, "sub_os_name"

    .line 147
    .line 148
    invoke-virtual {v6, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    :cond_2
    invoke-static {p0}, Lv2/b;->N(Landroid/content/Context;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-nez v9, :cond_3

    .line 160
    .line 161
    const-string v9, "sub_os_version"

    .line 162
    .line 163
    invoke-virtual {v6, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    :cond_3
    invoke-static {p0}, Lv2/b;->p(Landroid/content/Context;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-nez v9, :cond_4

    .line 175
    .line 176
    const-string v9, "device_type"

    .line 177
    .line 178
    invoke-virtual {v6, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    :cond_4
    const-string v8, "package_name"

    .line 182
    .line 183
    invoke-static {p0}, Lv2/b;->I(Landroid/content/Context;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    const-string v8, "sdk_type"

    .line 191
    .line 192
    invoke-virtual {v6, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    const-string v8, "device_id"

    .line 196
    .line 197
    invoke-static {p0}, Lv2/b;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    const-string v8, "device_model"

    .line 205
    .line 206
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    const-string v8, "device_board"

    .line 212
    .line 213
    sget-object v9, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    const-string v8, "device_brand"

    .line 219
    .line 220
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    const-string v8, "device_manutime"

    .line 226
    .line 227
    sget-wide v11, Landroid/os/Build;->TIME:J

    .line 228
    .line 229
    invoke-virtual {v6, v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 230
    .line 231
    .line 232
    const-string v8, "device_manufacturer"

    .line 233
    .line 234
    sget-object v9, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 237
    .line 238
    .line 239
    const-string v8, "device_manuid"

    .line 240
    .line 241
    sget-object v9, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    const-string v8, "device_name"

    .line 247
    .line 248
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 251
    .line 252
    .line 253
    const-string v8, "os_version"

    .line 254
    .line 255
    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    .line 259
    .line 260
    const-string v8, "os"

    .line 261
    .line 262
    invoke-virtual {v6, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 263
    .line 264
    .line 265
    invoke-static {p0}, Lv2/b;->J(Landroid/content/Context;)[I

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    const/4 v8, 0x1

    .line 270
    if-eqz v3, :cond_5

    .line 271
    .line 272
    const-string v9, "resolution"

    .line 273
    .line 274
    new-instance v11, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    aget v12, v3, v8

    .line 280
    .line 281
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v12, "*"

    .line 285
    .line 286
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    aget v3, v3, v7

    .line 290
    .line 291
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v6, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 299
    .line 300
    .line 301
    :cond_5
    const-string v3, "mc"

    .line 302
    .line 303
    invoke-static {p0}, Lv2/b;->B(Landroid/content/Context;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-virtual {v6, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 308
    .line 309
    .line 310
    const-string v3, "timezone"

    .line 311
    .line 312
    invoke-static {p0}, Lv2/b;->O(Landroid/content/Context;)I

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    invoke-virtual {v6, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 317
    .line 318
    .line 319
    invoke-static {p0}, Lv2/b;->z(Landroid/content/Context;)[Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    const-string v9, "country"

    .line 324
    .line 325
    aget-object v11, v3, v7

    .line 326
    .line 327
    invoke-virtual {v6, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 328
    .line 329
    .line 330
    const-string v9, "language"

    .line 331
    .line 332
    aget-object v3, v3, v8

    .line 333
    .line 334
    invoke-virtual {v6, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 335
    .line 336
    .line 337
    const-string v3, "carrier"

    .line 338
    .line 339
    invoke-static {p0}, Lv2/b;->F(Landroid/content/Context;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-virtual {v6, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    const-string v3, "display_name"

    .line 347
    .line 348
    invoke-static {p0}, Lv2/b;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-virtual {v6, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    .line 354
    .line 355
    invoke-static {p0}, Lv2/b;->E(Landroid/content/Context;)[Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    const-string v9, "Wi-Fi"

    .line 360
    .line 361
    aget-object v11, v3, v7

    .line 362
    .line 363
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 367
    const-string v11, "access"

    .line 368
    .line 369
    if-eqz v9, :cond_6

    .line 370
    .line 371
    :try_start_4
    const-string v2, "wifi"

    .line 372
    .line 373
    invoke-virtual {v6, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 374
    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_6
    aget-object v9, v3, v7

    .line 378
    .line 379
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    if-eqz v9, :cond_7

    .line 384
    .line 385
    invoke-virtual {v6, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 386
    .line 387
    .line 388
    goto :goto_1

    .line 389
    :cond_7
    const-string v2, "unknow"

    .line 390
    .line 391
    invoke-virtual {v6, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 392
    .line 393
    .line 394
    :goto_1
    aget-object v2, v3, v8

    .line 395
    .line 396
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-nez v2, :cond_8

    .line 401
    .line 402
    const-string v2, "access_subtype"

    .line 403
    .line 404
    aget-object v3, v3, v8

    .line 405
    .line 406
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 407
    .line 408
    .line 409
    :cond_8
    const-string v2, "header_local_ip"

    .line 410
    .line 411
    invoke-static {v2}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_9

    .line 416
    .line 417
    const-string v2, "local_ip"

    .line 418
    .line 419
    invoke-static {p0}, Lv2/b;->u(Landroid/content/Context;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 424
    .line 425
    .line 426
    :cond_9
    const-string v2, "network_type"

    .line 427
    .line 428
    invoke-static {p0}, Lv2/b;->G(Landroid/content/Context;)I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 433
    .line 434
    .line 435
    const-string v2, "com_ver"

    .line 436
    .line 437
    const-string v3, "9.3.7"

    .line 438
    .line 439
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 440
    .line 441
    .line 442
    const-string v2, "com_type"

    .line 443
    .line 444
    sget v3, Lu2/b;->a:I

    .line 445
    .line 446
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 447
    .line 448
    .line 449
    const-string v2, "mini_ver"

    .line 450
    .line 451
    const-string v3, "1"

    .line 452
    .line 453
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 454
    .line 455
    .line 456
    sget-object v2, Lu2/e;->e:Ljava/lang/String;

    .line 457
    .line 458
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-nez v2, :cond_a

    .line 463
    .line 464
    const-string v2, "module"

    .line 465
    .line 466
    sget-object v3, Lu2/e;->e:Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 469
    .line 470
    .line 471
    :cond_a
    const-string v2, "api_level"

    .line 472
    .line 473
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 474
    .line 475
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 476
    .line 477
    .line 478
    sget-object v2, Lz2/d;->j:Ljava/lang/String;

    .line 479
    .line 480
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-nez v2, :cond_b

    .line 485
    .line 486
    const-string v2, "urec_ver"

    .line 487
    .line 488
    sget-object v3, Lz2/d;->j:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 491
    .line 492
    .line 493
    :cond_b
    :try_start_5
    invoke-static {p0}, Lz2/d;->q(Landroid/content/Context;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 498
    .line 499
    .line 500
    move-result v3

    .line 501
    if-eqz v3, :cond_c

    .line 502
    .line 503
    invoke-static {p0}, Lz2/d;->y(Landroid/content/Context;)V

    .line 504
    .line 505
    .line 506
    invoke-static {p0}, Lz2/d;->q(Landroid/content/Context;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    :cond_c
    const-string v3, "session_id"

    .line 511
    .line 512
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 513
    .line 514
    .line 515
    :catchall_1
    :try_start_6
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    sput-object v2, Lu2/e;->d:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 520
    .line 521
    move-object v2, v6

    .line 522
    :goto_2
    if-nez v2, :cond_d

    .line 523
    .line 524
    return-object v4

    .line 525
    :cond_d
    :try_start_7
    const-string v3, "oaid_required_time"

    .line 526
    .line 527
    invoke-static {p0}, Lz2/d;->n(Landroid/content/Context;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-virtual {v2, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 532
    .line 533
    .line 534
    :catch_1
    :try_start_8
    const-string v3, "successful_requests"

    .line 535
    .line 536
    const-string v6, "successful_request"

    .line 537
    .line 538
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    invoke-virtual {v2, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 543
    .line 544
    .line 545
    invoke-interface {v5, v1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 550
    .line 551
    .line 552
    const-string v1, "req_time"

    .line 553
    .line 554
    const-string v3, "last_request_spent_ms"

    .line 555
    .line 556
    invoke-interface {v5, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 561
    .line 562
    .line 563
    invoke-static {p0}, Lz2/d;->r(Landroid/content/Context;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    if-nez v3, :cond_e

    .line 572
    .line 573
    const-string v3, "zid"

    .line 574
    .line 575
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 576
    .line 577
    .line 578
    :cond_e
    sget-object v1, Lz2/d;->l:Ljava/lang/String;

    .line 579
    .line 580
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-nez v1, :cond_f

    .line 585
    .line 586
    const-string v1, "zid_sdk_version"

    .line 587
    .line 588
    sget-object v3, Lz2/d;->l:Ljava/lang/String;

    .line 589
    .line 590
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 591
    .line 592
    .line 593
    :catch_2
    :cond_f
    :try_start_9
    const-string v1, "channel"

    .line 594
    .line 595
    invoke-static {p0}, Lz2/d;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 600
    .line 601
    .line 602
    const-string v1, "appkey"

    .line 603
    .line 604
    invoke-static {p0}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 609
    .line 610
    .line 611
    :try_start_a
    invoke-static {p0}, Lz2/d;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-nez v3, :cond_10

    .line 620
    .line 621
    const-string v3, "devicetoken"

    .line 622
    .line 623
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 624
    .line 625
    .line 626
    goto :goto_3

    .line 627
    :catch_3
    move-exception v1

    .line 628
    :try_start_b
    invoke-static {p0, v1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 629
    .line 630
    .line 631
    :cond_10
    :goto_3
    :try_start_c
    invoke-static {p0, v0, v4}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    if-nez v3, :cond_11

    .line 640
    .line 641
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 642
    .line 643
    .line 644
    goto :goto_4

    .line 645
    :catch_4
    move-exception v0

    .line 646
    :try_start_d
    invoke-static {p0, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 647
    .line 648
    .line 649
    :cond_11
    :goto_4
    :try_start_e
    const-string v0, "wrapper_type"

    .line 650
    .line 651
    sget-object v1, Lu2/d;->a:Ljava/lang/String;

    .line 652
    .line 653
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 654
    .line 655
    .line 656
    const-string v0, "wrapper_version"

    .line 657
    .line 658
    sget-object v1, Lu2/d;->b:Ljava/lang/String;

    .line 659
    .line 660
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 661
    .line 662
    .line 663
    :catch_5
    :try_start_f
    invoke-static {p0}, Lz2/d;->p(Landroid/content/Context;)I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    const-string v1, "android.permission.READ_PHONE_STATE"

    .line 668
    .line 669
    invoke-static {p0, v1}, Lz2/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    const-string v3, "targetSdkVer"

    .line 674
    .line 675
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 676
    .line 677
    .line 678
    const-string v0, "rps_pr"

    .line 679
    .line 680
    if-eqz v1, :cond_12

    .line 681
    .line 682
    :try_start_10
    const-string v1, "yes"

    .line 683
    .line 684
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 685
    .line 686
    .line 687
    goto :goto_5

    .line 688
    :cond_12
    const-string v1, "no"

    .line 689
    .line 690
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 691
    .line 692
    .line 693
    :catchall_2
    :goto_5
    :try_start_11
    invoke-static {}, Lu2/e;->j()Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_13

    .line 698
    .line 699
    const-string v0, "umTaskId"

    .line 700
    .line 701
    sget-object v1, Lu2/e;->b:Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 704
    .line 705
    .line 706
    const-string v0, "umCaseId"

    .line 707
    .line 708
    sget-object v1, Lu2/e;->c:Ljava/lang/String;

    .line 709
    .line 710
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 711
    .line 712
    .line 713
    :catchall_3
    :cond_13
    :try_start_12
    new-instance v0, Lorg/json/JSONObject;

    .line 714
    .line 715
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 716
    .line 717
    .line 718
    const-string v1, "i_ver"

    .line 719
    .line 720
    const-string v3, "1.2.0"

    .line 721
    .line 722
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 723
    .line 724
    .line 725
    sget-object v1, Lz2/d;->c:Ljava/lang/String;

    .line 726
    .line 727
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    if-nez v1, :cond_14

    .line 732
    .line 733
    const-string v1, "a_ver"

    .line 734
    .line 735
    sget-object v3, Lz2/d;->c:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 738
    .line 739
    .line 740
    :cond_14
    sget-object v1, Lz2/d;->d:Ljava/lang/String;

    .line 741
    .line 742
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    if-nez v1, :cond_15

    .line 747
    .line 748
    const-string v1, "g_ver"

    .line 749
    .line 750
    sget-object v3, Lz2/d;->d:Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 753
    .line 754
    .line 755
    :cond_15
    sget-object v1, Lz2/d;->e:Ljava/lang/String;

    .line 756
    .line 757
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-nez v1, :cond_16

    .line 762
    .line 763
    const-string v1, "p_ver"

    .line 764
    .line 765
    sget-object v3, Lz2/d;->e:Ljava/lang/String;

    .line 766
    .line 767
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 768
    .line 769
    .line 770
    :cond_16
    sget-object v1, Lz2/d;->f:Ljava/lang/String;

    .line 771
    .line 772
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-nez v1, :cond_17

    .line 777
    .line 778
    const-string v1, "s_ver"

    .line 779
    .line 780
    sget-object v3, Lz2/d;->f:Ljava/lang/String;

    .line 781
    .line 782
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 783
    .line 784
    .line 785
    :cond_17
    sget-object v1, Lz2/d;->g:Ljava/lang/String;

    .line 786
    .line 787
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    if-nez v1, :cond_18

    .line 792
    .line 793
    const-string v1, "c_ver"

    .line 794
    .line 795
    sget-object v3, Lz2/d;->g:Ljava/lang/String;

    .line 796
    .line 797
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 798
    .line 799
    .line 800
    :cond_18
    sget-object v1, Lz2/d;->h:Ljava/lang/String;

    .line 801
    .line 802
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    if-nez v1, :cond_19

    .line 807
    .line 808
    const-string v1, "n_ver"

    .line 809
    .line 810
    sget-object v3, Lz2/d;->h:Ljava/lang/String;

    .line 811
    .line 812
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 813
    .line 814
    .line 815
    :cond_19
    sget-object v1, Lz2/d;->i:Ljava/lang/String;

    .line 816
    .line 817
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    if-nez v1, :cond_1a

    .line 822
    .line 823
    const-string v1, "m_ver"

    .line 824
    .line 825
    sget-object v3, Lz2/d;->i:Ljava/lang/String;

    .line 826
    .line 827
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 828
    .line 829
    .line 830
    :cond_1a
    sget-object v1, Lz2/d;->j:Ljava/lang/String;

    .line 831
    .line 832
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 833
    .line 834
    .line 835
    move-result v1

    .line 836
    if-nez v1, :cond_1b

    .line 837
    .line 838
    const-string v1, "u_ver"

    .line 839
    .line 840
    sget-object v3, Lz2/d;->j:Ljava/lang/String;

    .line 841
    .line 842
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 843
    .line 844
    .line 845
    :cond_1b
    sget-object v1, Lz2/d;->k:Ljava/lang/String;

    .line 846
    .line 847
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    if-nez v1, :cond_1c

    .line 852
    .line 853
    const-string v1, "v_ver"

    .line 854
    .line 855
    sget-object v3, Lz2/d;->k:Ljava/lang/String;

    .line 856
    .line 857
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 858
    .line 859
    .line 860
    :cond_1c
    sget-object v1, Lz2/d;->l:Ljava/lang/String;

    .line 861
    .line 862
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    if-nez v1, :cond_1d

    .line 867
    .line 868
    const-string v1, "z_ver"

    .line 869
    .line 870
    sget-object v3, Lz2/d;->l:Ljava/lang/String;

    .line 871
    .line 872
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 873
    .line 874
    .line 875
    :cond_1d
    sget-object v1, Lz2/d;->m:Ljava/lang/String;

    .line 876
    .line 877
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    if-nez v1, :cond_1e

    .line 882
    .line 883
    const-string v1, "l_ver"

    .line 884
    .line 885
    sget-object v3, Lz2/d;->m:Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 888
    .line 889
    .line 890
    :cond_1e
    sget-object v1, Lz2/d;->n:Ljava/lang/String;

    .line 891
    .line 892
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    if-nez v1, :cond_1f

    .line 897
    .line 898
    const-string v1, "t_ver"

    .line 899
    .line 900
    sget-object v3, Lz2/d;->n:Ljava/lang/String;

    .line 901
    .line 902
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 903
    .line 904
    .line 905
    :cond_1f
    const-string v1, "module_ver"

    .line 906
    .line 907
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 908
    .line 909
    .line 910
    :catchall_4
    :try_start_13
    invoke-static {p0}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-virtual {v0}, Lw2/b;->k()[B

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    if-eqz v0, :cond_20

    .line 919
    .line 920
    array-length v1, v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 921
    if-lez v1, :cond_20

    .line 922
    .line 923
    :try_start_14
    const-string v1, "imprint"

    .line 924
    .line 925
    invoke-static {v0, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 930
    .line 931
    .line 932
    goto :goto_6

    .line 933
    :catch_6
    move-exception v0

    .line 934
    :try_start_15
    invoke-static {p0, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 935
    .line 936
    .line 937
    :cond_20
    :goto_6
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    if-lez v0, :cond_21

    .line 942
    .line 943
    new-instance v0, Lorg/json/JSONObject;

    .line 944
    .line 945
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 946
    .line 947
    .line 948
    const-string v1, "header"

    .line 949
    .line 950
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 951
    .line 952
    .line 953
    move-result-object p0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 954
    return-object p0

    .line 955
    :goto_7
    invoke-static {p0, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 956
    .line 957
    .line 958
    :cond_21
    return-object v4
.end method

.method public static j()Z
    .locals 5

    .line 1
    const-string v0, "debug.umeng.umTaskId"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz2/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lu2/e;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "debug.umeng.umCaseId"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lz2/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lu2/e;->c:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v0, Lu2/e;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "empty"

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    const/4 v3, 0x0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Lu2/e;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v0, v3

    .line 42
    :goto_0
    sget-object v4, Lu2/e;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    sget-object v4, Lu2/e;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    move v1, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v1, v3

    .line 61
    :goto_1
    if-eqz v0, :cond_2

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    return v2

    .line 66
    :cond_2
    return v3
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lw2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lv2/b;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    :cond_1
    invoke-static {p5}, Lt2/d;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "&&"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p4, "_"

    .line 43
    .line 44
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p4, ".log"

    .line 61
    .line 62
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lw2/a;->m()[B

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string p4, "z"

    .line 70
    .line 71
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-nez p4, :cond_3

    .line 76
    .line 77
    const-string p4, "i"

    .line 78
    .line 79
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    if-nez p4, :cond_3

    .line 84
    .line 85
    const-string p4, "a"

    .line 86
    .line 87
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    if-nez p4, :cond_3

    .line 92
    .line 93
    const-string p4, "t"

    .line 94
    .line 95
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    if-eqz p3, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const-string p3, ".emitter"

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    invoke-static {p1, p3, p4, p2}, Lt2/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[B)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    return p1

    .line 113
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-static {p1, p3, p2}, Lcom/umeng/commonsdk/framework/b;->o(Landroid/content/Context;Ljava/lang/String;[B)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    return p1

    .line 122
    :cond_4
    :goto_1
    const/16 p1, 0x65

    .line 123
    .line 124
    return p1
.end method

.method public final c(ILorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-object p2

    .line 9
    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    .line 17
    :catch_1
    return-object p2
.end method

.method public d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    const-string v1, "header"

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-static {}, Lu2/e;->j()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-string v3, "umTaskId"

    .line 25
    .line 26
    sget-object v4, Lu2/e;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string v3, "umCaseId"

    .line 32
    .line 33
    sget-object v4, Lu2/e;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    :catchall_0
    :cond_0
    if-eqz p2, :cond_1

    .line 39
    .line 40
    :try_start_2
    invoke-virtual {p0, v2, p2}, Lu2/e;->f(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    move-object p2, v0

    .line 47
    move-object v3, p0

    .line 48
    move-object v4, p1

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    :goto_0
    if-eqz v2, :cond_3

    .line 52
    .line 53
    if-eqz p3, :cond_3

    .line 54
    .line 55
    invoke-virtual {p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :catch_0
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    instance-of v4, v3, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    check-cast v3, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p3, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    :try_start_3
    invoke-virtual {p3, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :try_start_4
    const-string v6, "z==1.2.0"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    :try_start_5
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    array-length p2, p2

    .line 104
    int-to-long p2, p2

    .line 105
    sget-wide v3, Lv2/a;->c:J

    .line 106
    .line 107
    invoke-static {p2, p3, v3, v4}, Lv2/a;->i(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_5

    .line 112
    .line 113
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-eqz p2, :cond_4

    .line 118
    .line 119
    const/4 p3, 0x1

    .line 120
    invoke-interface {p2, v0, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result p4

    .line 124
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    add-int/2addr p4, p3

    .line 129
    invoke-interface {p2, v0, p4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 134
    .line 135
    .line 136
    :cond_4
    const/16 p2, 0x71

    .line 137
    .line 138
    invoke-virtual {p0, p2, v2}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_5
    const/4 p2, 0x0

    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-virtual {p0, p1, p3}, Lu2/e;->g(Landroid/content/Context;[B)Lw2/a;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    if-nez p3, :cond_6

    .line 159
    .line 160
    const/16 p2, 0x6f

    .line 161
    .line 162
    invoke-virtual {p0, p2, v2}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :cond_6
    move-object v5, p3

    .line 168
    goto :goto_2

    .line 169
    :cond_7
    move-object v5, p2

    .line 170
    :goto_2
    if-eqz v5, :cond_8

    .line 171
    .line 172
    invoke-virtual {v5}, Lw2/a;->m()[B

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    array-length p3, p3

    .line 177
    int-to-long v3, p3

    .line 178
    sget-wide v7, Lv2/a;->d:J

    .line 179
    .line 180
    invoke-static {v3, v4, v7, v8}, Lv2/a;->i(JJ)Z

    .line 181
    .line 182
    .line 183
    move-result p3

    .line 184
    if-eqz p3, :cond_8

    .line 185
    .line 186
    const/16 p2, 0x72

    .line 187
    .line 188
    invoke-virtual {p0, p2, v2}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1

    .line 193
    :cond_8
    if-eqz v2, :cond_9

    .line 194
    .line 195
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    const-string p3, "app_version"

    .line 200
    .line 201
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 205
    :cond_9
    move-object v3, p0

    .line 206
    move-object v4, p1

    .line 207
    move-object v7, p2

    .line 208
    move-object v8, p4

    .line 209
    :try_start_6
    invoke-virtual/range {v3 .. v8}, Lu2/e;->a(Landroid/content/Context;Lw2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_a

    .line 214
    .line 215
    invoke-virtual {p0, p1, v2}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1

    .line 220
    :catchall_2
    move-exception v0

    .line 221
    :goto_3
    move-object p2, v0

    .line 222
    goto :goto_4

    .line 223
    :cond_a
    sget-boolean p1, Lv2/f;->a:Z

    .line 224
    .line 225
    if-eqz p1, :cond_b

    .line 226
    .line 227
    const-string p1, "EnvelopeManager"

    .line 228
    .line 229
    new-instance p2, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string p3, "constructHeader size is "

    .line 235
    .line 236
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    .line 244
    .line 245
    .line 246
    move-result-object p3

    .line 247
    array-length p3, p3

    .line 248
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 256
    .line 257
    .line 258
    :cond_b
    return-object v2

    .line 259
    :catchall_3
    move-exception v0

    .line 260
    move-object v3, p0

    .line 261
    move-object v4, p1

    .line 262
    goto :goto_3

    .line 263
    :goto_4
    invoke-static {v4, p2}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    new-instance p1, Lorg/json/JSONObject;

    .line 267
    .line 268
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 269
    .line 270
    .line 271
    const/16 p2, 0x6e

    .line 272
    .line 273
    invoke-virtual {p0, p2, p1}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    return-object p1
.end method

.method public e(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    const-string v0, "serial"

    .line 10
    .line 11
    const-string v3, "&="

    .line 12
    .line 13
    const-string v9, "header"

    .line 14
    .line 15
    sget-boolean v4, Lv2/f;->a:Z

    .line 16
    .line 17
    const-string v10, "EnvelopeManager"

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    if-eqz v8, :cond_0

    .line 24
    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v5, "headerJSONObject size is "

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    array-length v5, v5

    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v10, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v5, "bodyJSONObject size is "

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    array-length v5, v5

    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v10, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    :cond_0
    const/16 v11, 0x6e

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    if-eqz v2, :cond_19

    .line 87
    .line 88
    if-nez v8, :cond_1

    .line 89
    .line 90
    goto/16 :goto_c

    .line 91
    .line 92
    :cond_1
    :try_start_0
    invoke-static {v2}, Lu2/e;->i(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    if-eqz v7, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1, v4, v7}, Lu2/e;->f(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :cond_2
    move-object v13, v4

    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :goto_0
    if-eqz v13, :cond_4

    .line 110
    .line 111
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :catch_0
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    instance-of v6, v5, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    check-cast v5, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    if-eqz v6, :cond_3

    .line 138
    .line 139
    :try_start_1
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-virtual {v13, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    :try_start_2
    const-string v4, "u"

    .line 148
    .line 149
    const-string v5, "1.0.0"

    .line 150
    .line 151
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-nez v6, :cond_5

    .line 156
    .line 157
    move-object/from16 v4, p5

    .line 158
    .line 159
    :cond_5
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-nez v6, :cond_6

    .line 164
    .line 165
    move-object/from16 v5, p6

    .line 166
    .line 167
    :cond_6
    const/4 v6, 0x0

    .line 168
    if-eqz v13, :cond_8

    .line 169
    .line 170
    new-instance v14, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v4, "=="

    .line 179
    .line 180
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_7

    .line 198
    .line 199
    const/16 v0, 0x65

    .line 200
    .line 201
    invoke-virtual {v1, v0, v13}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0

    .line 206
    :cond_7
    invoke-virtual {v4, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_9

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    add-int/lit8 v3, v3, -0x2

    .line 217
    .line 218
    invoke-virtual {v4, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 222
    goto :goto_2

    .line 223
    :cond_8
    move-object v4, v12

    .line 224
    :cond_9
    :goto_2
    if-eqz v13, :cond_a

    .line 225
    .line 226
    :try_start_3
    invoke-static {v2}, Lw2/g;->a(Landroid/content/Context;)Lw2/g;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    if-eqz v3, :cond_a

    .line 231
    .line 232
    invoke-virtual {v3}, Lw2/g;->e()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Lw2/g;->g()Lcom/umeng/commonsdk/statistics/proto/c;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    new-instance v5, Lcom/umeng/analytics/pro/b;

    .line 240
    .line 241
    invoke-direct {v5}, Lcom/umeng/analytics/pro/b;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v3}, Lcom/umeng/analytics/pro/b;->a(Lcom/umeng/analytics/pro/aq;)[B

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-static {v3, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-nez v5, :cond_a

    .line 257
    .line 258
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    const-string v6, "id_tracking"

    .line 263
    .line 264
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v13, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 268
    .line 269
    .line 270
    :catch_1
    :cond_a
    if-eqz v13, :cond_c

    .line 271
    .line 272
    :try_start_4
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    array-length v3, v3

    .line 281
    int-to-long v5, v3

    .line 282
    sget-wide v14, Lv2/a;->c:J

    .line 283
    .line 284
    invoke-static {v5, v6, v14, v15}, Lv2/a;->i(JJ)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-eqz v3, :cond_c

    .line 289
    .line 290
    invoke-static {v2}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    if-eqz v3, :cond_b

    .line 295
    .line 296
    const/4 v4, 0x1

    .line 297
    invoke-interface {v3, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    add-int/2addr v5, v4

    .line 306
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 311
    .line 312
    .line 313
    :cond_b
    const/16 v0, 0x71

    .line 314
    .line 315
    invoke-virtual {v1, v0, v13}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    return-object v0

    .line 320
    :cond_c
    if-eqz v13, :cond_e

    .line 321
    .line 322
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v1, v2, v0}, Lu2/e;->g(Landroid/content/Context;[B)Lw2/a;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-nez v0, :cond_d

    .line 335
    .line 336
    const/16 v0, 0x6f

    .line 337
    .line 338
    invoke-virtual {v1, v0, v13}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    return-object v0

    .line 343
    :cond_d
    move-object v3, v0

    .line 344
    goto :goto_3

    .line 345
    :cond_e
    move-object v3, v12

    .line 346
    :goto_3
    if-eqz v3, :cond_f

    .line 347
    .line 348
    invoke-virtual {v3}, Lw2/a;->m()[B

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    array-length v0, v0

    .line 353
    int-to-long v5, v0

    .line 354
    sget-wide v14, Lv2/a;->d:J

    .line 355
    .line 356
    invoke-static {v5, v6, v14, v15}, Lv2/a;->i(JJ)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-eqz v0, :cond_f

    .line 361
    .line 362
    const/16 v0, 0x72

    .line 363
    .line 364
    invoke-virtual {v1, v0, v13}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :cond_f
    if-eqz v13, :cond_10

    .line 370
    .line 371
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v5, "app_version"

    .line 376
    .line 377
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    move-object v5, v0

    .line 382
    :goto_4
    move-object/from16 v6, p4

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_10
    move-object v5, v12

    .line 386
    goto :goto_4

    .line 387
    :goto_5
    invoke-virtual/range {v1 .. v6}, Lu2/e;->a(Landroid/content/Context;Lw2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_11

    .line 392
    .line 393
    invoke-virtual {v1, v0, v13}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :cond_11
    sget-boolean v0, Lv2/f;->a:Z

    .line 399
    .line 400
    if-eqz v0, :cond_12

    .line 401
    .line 402
    new-instance v0, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    const-string v3, "constructHeader size is "

    .line 408
    .line 409
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    array-length v3, v3

    .line 421
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 429
    .line 430
    .line 431
    :cond_12
    const-string v0, "z"

    .line 432
    .line 433
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-nez v0, :cond_14

    .line 438
    .line 439
    const-string v0, "i"

    .line 440
    .line 441
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-nez v0, :cond_14

    .line 446
    .line 447
    const-string v0, "t"

    .line 448
    .line 449
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-nez v0, :cond_14

    .line 454
    .line 455
    const-string v0, "a"

    .line 456
    .line 457
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_13

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_13
    invoke-static {}, Lt2/b;->c()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-nez v0, :cond_14

    .line 469
    .line 470
    new-instance v0, Lt2/b;

    .line 471
    .line 472
    invoke-direct {v0, v2}, Lt2/b;-><init>(Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    invoke-static {}, Lt2/b;->e()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 476
    .line 477
    .line 478
    :cond_14
    :goto_6
    return-object v13

    .line 479
    :goto_7
    invoke-static {v2, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 480
    .line 481
    .line 482
    if-eqz v7, :cond_15

    .line 483
    .line 484
    :try_start_5
    new-instance v3, Lorg/json/JSONObject;

    .line 485
    .line 486
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 487
    .line 488
    .line 489
    :try_start_6
    invoke-virtual {v3, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 490
    .line 491
    .line 492
    goto :goto_8

    .line 493
    :catch_2
    move-exception v0

    .line 494
    move-object v12, v3

    .line 495
    goto :goto_b

    .line 496
    :catch_3
    :goto_8
    move-object v12, v3

    .line 497
    goto :goto_9

    .line 498
    :catch_4
    move-exception v0

    .line 499
    goto :goto_b

    .line 500
    :cond_15
    :goto_9
    if-nez v12, :cond_16

    .line 501
    .line 502
    :try_start_7
    new-instance v0, Lorg/json/JSONObject;

    .line 503
    .line 504
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 505
    .line 506
    .line 507
    move-object v12, v0

    .line 508
    :cond_16
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    :catch_5
    :cond_17
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-eqz v3, :cond_18

    .line 517
    .line 518
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    if-eqz v3, :cond_17

    .line 523
    .line 524
    instance-of v4, v3, Ljava/lang/String;

    .line 525
    .line 526
    if-eqz v4, :cond_17

    .line 527
    .line 528
    check-cast v3, Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 534
    if-eqz v4, :cond_17

    .line 535
    .line 536
    :try_start_8
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v12, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 541
    .line 542
    .line 543
    goto :goto_a

    .line 544
    :goto_b
    invoke-static {v2, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    :cond_18
    invoke-virtual {v1, v11, v12}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    return-object v0

    .line 552
    :cond_19
    :goto_c
    invoke-virtual {v1, v11, v12}, Lu2/e;->c(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    return-object v0
.end method

.method public final f(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    const-string v0, "header"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v1, v1, Lorg/json/JSONObject;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :catch_0
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    instance-of v3, v2, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v3, "vertical_type"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    instance-of v3, v3, Ljava/lang/Integer;

    .line 75
    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iput v2, p0, Lu2/e;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    return-object p1
.end method

.method public final g(Landroid/content/Context;[B)Lw2/a;
    .locals 3

    .line 1
    const-string v0, "codex"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, -0x1

    .line 9
    :try_start_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    invoke-static {p1, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    :goto_0
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1, v0, p2}, Lw2/a;->d(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    if-ne v1, v0, :cond_2

    .line 41
    .line 42
    invoke-static {p1}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p1, v0, p2}, Lw2/a;->c(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-boolean v0, Lu2/e;->g:Z

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-static {p1}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1, v0, p2}, Lw2/a;->c(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p1}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1, v0, p2}, Lw2/a;->d(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    return-object p1
.end method
