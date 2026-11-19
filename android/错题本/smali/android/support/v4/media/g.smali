.class public final Landroid/support/v4/media/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/support/v4/media/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Landroid/support/v4/media/g;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>(Landroid/os/Parcel;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>(Landroid/os/Parcel;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_1
    new-instance v0, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;-><init>(Landroid/os/Parcel;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_2
    new-instance v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;-><init>(Landroid/os/Parcel;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_3
    new-instance v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-class v1, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/Long;

    .line 47
    .line 48
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->a:Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->e:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, v0, Lcom/zykj/message/server/bean/UserInfo;->f:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, v0, Lcom/zykj/message/server/bean/UserInfo;->g:Ljava/lang/Integer;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lcom/zykj/message/server/bean/Status;->valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :pswitch_5
    new-instance v0, Lcom/zykj/message/server/bean/ServerInfo;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const/4 v3, -0x1

    .line 110
    if-ne v2, v3, :cond_0

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-static {}, Lcom/zykj/message/server/bean/Status;->values()[Lcom/zykj/message/server/bean/Status;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    aget-object v1, v1, v2

    .line 118
    .line 119
    :goto_0
    iput-object v1, v0, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v1, v0, Lcom/zykj/message/server/bean/ServerInfo;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iput-object v1, v0, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, v0, Lcom/zykj/message/server/bean/ServerInfo;->d:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, v0, Lcom/zykj/message/server/bean/ServerInfo;->e:Ljava/lang/String;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_6
    const-string v0, "in"

    .line 147
    .line 148
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v1, Lcom/canhub/cropper/CropImage$ActivityResult;

    .line 152
    .line 153
    const-class v0, Landroid/net/Uri;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Landroid/net/Uri;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v3, v0

    .line 174
    check-cast v3, Landroid/net/Uri;

    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v4, v0

    .line 181
    check-cast v4, Ljava/lang/Exception;

    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->createFloatArray()[F

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    const-class v0, Landroid/graphics/Rect;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {p1, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, Landroid/graphics/Rect;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v7, v0

    .line 211
    check-cast v7, Landroid/graphics/Rect;

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    invoke-direct/range {v1 .. v9}, Lcom/canhub/cropper/u;-><init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 222
    .line 223
    .line 224
    return-object v1

    .line 225
    :pswitch_7
    new-instance v0, Landroid/support/v4/os/ResultReceiver;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    sget v2, Lb/c;->d:I

    .line 235
    .line 236
    if-nez p1, :cond_1

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_1
    sget-object v1, Lb/b;->b:Ljava/lang/String;

    .line 240
    .line 241
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    if-eqz v1, :cond_2

    .line 246
    .line 247
    instance-of v2, v1, Lb/b;

    .line 248
    .line 249
    if-eqz v2, :cond_2

    .line 250
    .line 251
    check-cast v1, Lb/b;

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_2
    new-instance v1, Lb/a;

    .line 255
    .line 256
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    iput-object p1, v1, Lb/a;->c:Landroid/os/IBinder;

    .line 260
    .line 261
    :goto_1
    iput-object v1, v0, Landroid/support/v4/os/ResultReceiver;->a:Lb/b;

    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_8
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 265
    .line 266
    invoke-direct {v0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(Landroid/os/Parcel;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_9
    new-instance v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 271
    .line 272
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->a:I

    .line 280
    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->c:I

    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->d:I

    .line 292
    .line 293
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->e:I

    .line 298
    .line 299
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    iput p1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->b:I

    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_a
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 311
    .line 312
    invoke-direct {v0, p1, v1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/c;)V

    .line 313
    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_b
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 317
    .line 318
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 319
    .line 320
    .line 321
    sget-object v1, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 322
    .line 323
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    check-cast p1, Landroid/os/ResultReceiver;

    .line 328
    .line 329
    iput-object p1, v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->a:Landroid/os/ResultReceiver;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_c
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 333
    .line 334
    invoke-direct {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    .line 335
    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_d
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 339
    .line 340
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_e
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 353
    .line 354
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 355
    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_f
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 359
    .line 360
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    if-eqz p1, :cond_7

    .line 365
    .line 366
    move-object v0, p1

    .line 367
    check-cast v0, Landroid/media/MediaDescription;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const-string v9, "android.support.v4.media.description.MEDIA_URI"

    .line 398
    .line 399
    if-eqz v2, :cond_3

    .line 400
    .line 401
    invoke-static {v2}, Landroid/support/v4/media/session/f;->a(Landroid/os/Bundle;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    check-cast v10, Landroid/net/Uri;

    .line 409
    .line 410
    goto :goto_2

    .line 411
    :cond_3
    move-object v10, v1

    .line 412
    :goto_2
    if-eqz v10, :cond_5

    .line 413
    .line 414
    const-string v11, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 415
    .line 416
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 417
    .line 418
    .line 419
    move-result v12

    .line 420
    if-eqz v12, :cond_4

    .line 421
    .line 422
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    const/4 v13, 0x2

    .line 427
    if-ne v12, v13, :cond_4

    .line 428
    .line 429
    move-object v9, v1

    .line 430
    goto :goto_3

    .line 431
    :cond_4
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :cond_5
    move-object v9, v2

    .line 438
    :goto_3
    if-eqz v10, :cond_6

    .line 439
    .line 440
    goto :goto_4

    .line 441
    :cond_6
    invoke-virtual {v0}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    :goto_4
    new-instance v2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 446
    .line 447
    invoke-direct/range {v2 .. v10}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 448
    .line 449
    .line 450
    iput-object p1, v2, Landroid/support/v4/media/MediaDescriptionCompat;->i:Ljava/lang/Object;

    .line 451
    .line 452
    move-object v1, v2

    .line 453
    :cond_7
    return-object v1

    .line 454
    :pswitch_10
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 455
    .line 456
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 457
    .line 458
    .line 459
    return-object v0

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroid/support/v4/media/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lcom/zykj/message/server/bean/UserInfo;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lcom/zykj/message/server/bean/Status;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lcom/zykj/message/server/bean/ServerInfo;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lcom/canhub/cropper/CropImage$ActivityResult;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Landroid/support/v4/os/ResultReceiver;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 58
    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
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
