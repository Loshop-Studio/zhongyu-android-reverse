.class public final Ln/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/g;


# instance fields
.field public final synthetic a:I

.field public final b:Lcoil3/x;

.field public final c:Ls/l;


# direct methods
.method public synthetic constructor <init>(Lcoil3/x;Ls/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln/b;->a:I

    iput-object p1, p0, Ln/b;->b:Lcoil3/x;

    iput-object p2, p0, Ln/b;->c:Ls/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh6/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ln/b;->a:I

    .line 4
    .line 5
    const-string/jumbo v2, "toLowerCase(...)"

    .line 6
    .line 7
    .line 8
    const-string v3, ""

    .line 9
    .line 10
    const/16 v4, 0x2e

    .line 11
    .line 12
    const/16 v5, 0x2f

    .line 13
    .line 14
    const/16 v6, 0x3f

    .line 15
    .line 16
    const/16 v7, 0x23

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x2

    .line 20
    iget-object v10, v0, Ln/b;->b:Lcoil3/x;

    .line 21
    .line 22
    iget-object v12, v0, Ln/b;->c:Ls/l;

    .line 23
    .line 24
    const/4 v13, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    iget-object v1, v10, Lcoil3/x;->d:Ljava/lang/String;

    .line 29
    .line 30
    const-string v14, "Invalid android.resource URI: "

    .line 31
    .line 32
    if-eqz v1, :cond_10

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v15

    .line 38
    if-nez v15, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-eqz v1, :cond_10

    .line 43
    .line 44
    invoke-static {v10}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v15

    .line 48
    invoke-static {v15}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v15

    .line 52
    check-cast v15, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v15, :cond_f

    .line 55
    .line 56
    invoke-static {v15}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v15

    .line 60
    if-eqz v15, :cond_f

    .line 61
    .line 62
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    iget-object v14, v12, Ls/l;->a:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    if-eqz v15, :cond_1

    .line 77
    .line 78
    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v14}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    invoke-virtual {v15, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    :goto_1
    new-instance v11, Landroid/util/TypedValue;

    .line 92
    .line 93
    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v15, v10, v11, v13}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 97
    .line 98
    .line 99
    iget-object v11, v11, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 100
    .line 101
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-static {v11}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v16

    .line 109
    if-eqz v16, :cond_2

    .line 110
    .line 111
    :goto_2
    const/4 v11, 0x0

    .line 112
    goto :goto_3

    .line 113
    :cond_2
    invoke-static {v11, v7}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-static {v7, v6}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v5, v6, v6}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-static {v4, v5, v3}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    sget-object v2, Lcoil3/util/i;->a:Ljava/util/Map;

    .line 146
    .line 147
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    move-object v11, v2

    .line 152
    check-cast v11, Ljava/lang/String;

    .line 153
    .line 154
    if-nez v11, :cond_4

    .line 155
    .line 156
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2, v3}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    :cond_4
    :goto_3
    const-string/jumbo v2, "text/xml"

    .line 165
    .line 166
    .line 167
    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_e

    .line 172
    .line 173
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const-string v2, "Invalid resource ID: "

    .line 182
    .line 183
    if-eqz v1, :cond_6

    .line 184
    .line 185
    invoke-static {v14, v10}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_5

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_5
    invoke-static {v10, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v2

    .line 206
    :cond_6
    invoke-virtual {v15, v10}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    :goto_4
    if-eq v3, v9, :cond_7

    .line 215
    .line 216
    if-eq v3, v13, :cond_7

    .line 217
    .line 218
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    goto :goto_4

    .line 223
    :cond_7
    if-ne v3, v9, :cond_d

    .line 224
    .line 225
    invoke-virtual {v14}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v15, v10, v1}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-eqz v1, :cond_c

    .line 234
    .line 235
    :goto_5
    sget-object v2, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 236
    .line 237
    instance-of v2, v1, Landroid/graphics/drawable/VectorDrawable;

    .line 238
    .line 239
    if-nez v2, :cond_9

    .line 240
    .line 241
    instance-of v2, v1, Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;

    .line 242
    .line 243
    if-eqz v2, :cond_8

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_8
    move v2, v8

    .line 247
    goto :goto_7

    .line 248
    :cond_9
    :goto_6
    move v2, v13

    .line 249
    :goto_7
    new-instance v3, Ln/i;

    .line 250
    .line 251
    if-eqz v2, :cond_b

    .line 252
    .line 253
    sget-object v4, Ls/h;->b:Lo2/a;

    .line 254
    .line 255
    invoke-static {v12, v4}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    check-cast v4, Landroid/graphics/Bitmap$Config;

    .line 260
    .line 261
    iget-object v5, v12, Ls/l;->b:Lt/f;

    .line 262
    .line 263
    iget-object v6, v12, Ls/l;->c:Lcoil3/size/Scale;

    .line 264
    .line 265
    iget-object v7, v12, Ls/l;->d:Lcoil3/size/Precision;

    .line 266
    .line 267
    sget-object v9, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 268
    .line 269
    if-ne v7, v9, :cond_a

    .line 270
    .line 271
    move v8, v13

    .line 272
    :cond_a
    invoke-static {v1, v4, v5, v6, v8}, Lv7/d;->g(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt/f;Lcoil3/size/Scale;Z)Landroid/graphics/Bitmap;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 281
    .line 282
    invoke-direct {v5, v4, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 283
    .line 284
    .line 285
    move-object v1, v5

    .line 286
    :cond_b
    invoke-static {v1}, Lcoil3/o;->c(Landroid/graphics/drawable/Drawable;)Lcoil3/k;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    sget-object v4, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 291
    .line 292
    invoke-direct {v3, v1, v2, v4}, Ln/i;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;)V

    .line 293
    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_c
    invoke-static {v10, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v2

    .line 310
    :cond_d
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 311
    .line 312
    const-string v2, "No start tag found."

    .line 313
    .line 314
    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v1

    .line 318
    :cond_e
    new-instance v2, Landroid/util/TypedValue;

    .line 319
    .line 320
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v15, v10, v2}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    new-instance v3, Ln/k;

    .line 328
    .line 329
    invoke-static {v2}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iget-object v4, v12, Ls/l;->f:Lokio/FileSystem;

    .line 338
    .line 339
    new-instance v5, Lcoil3/decode/q;

    .line 340
    .line 341
    invoke-direct {v5, v1, v10}, Lcoil3/decode/q;-><init>(Ljava/lang/String;I)V

    .line 342
    .line 343
    .line 344
    new-instance v1, Lcoil3/decode/r;

    .line 345
    .line 346
    invoke-direct {v1, v2, v4, v5}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 347
    .line 348
    .line 349
    sget-object v2, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 350
    .line 351
    invoke-direct {v3, v1, v11, v2}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 352
    .line 353
    .line 354
    :goto_8
    return-object v3

    .line 355
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 356
    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v1

    .line 373
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 374
    .line 375
    new-instance v2, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v1

    .line 391
    :pswitch_0
    iget-object v1, v10, Lcoil3/x;->a:Ljava/lang/String;

    .line 392
    .line 393
    iget-object v2, v10, Lcoil3/x;->a:Ljava/lang/String;

    .line 394
    .line 395
    const-string v3, ";base64,"

    .line 396
    .line 397
    const/4 v4, 0x6

    .line 398
    invoke-static {v1, v3, v8, v8, v4}, Lkotlin/text/p;->N(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    const-string v3, "invalid data uri: "

    .line 403
    .line 404
    const/4 v5, -0x1

    .line 405
    if-eq v1, v5, :cond_33

    .line 406
    .line 407
    const/16 v6, 0x3a

    .line 408
    .line 409
    invoke-static {v2, v6, v8, v4}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    if-eq v6, v5, :cond_32

    .line 414
    .line 415
    add-int/2addr v6, v13

    .line 416
    invoke-virtual {v2, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    const-string/jumbo v6, "substring(...)"

    .line 421
    .line 422
    .line 423
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    sget-object v7, Lo6/b;->d:Lo6/a;

    .line 427
    .line 428
    const/16 v9, 0x8

    .line 429
    .line 430
    add-int/2addr v1, v9

    .line 431
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v11, v7, Lo6/b;->c:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 439
    .line 440
    iget-boolean v14, v7, Lo6/b;->b:Z

    .line 441
    .line 442
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 443
    .line 444
    .line 445
    move-result v15

    .line 446
    sget-object v16, Lkotlin/collections/f;->Companion:Lkotlin/collections/c;

    .line 447
    .line 448
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-static {v1, v10, v15}, Lkotlin/collections/c;->a(III)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v1, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    sget-object v2, Lkotlin/text/a;->b:Ljava/nio/charset/Charset;

    .line 462
    .line 463
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    const-string v2, "getBytes(...)"

    .line 468
    .line 469
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    array-length v2, v1

    .line 473
    array-length v6, v1

    .line 474
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-static {v8, v2, v6}, Lkotlin/collections/c;->a(III)V

    .line 478
    .line 479
    .line 480
    const/16 v6, 0x3d

    .line 481
    .line 482
    const/4 v10, -0x2

    .line 483
    if-nez v2, :cond_11

    .line 484
    .line 485
    move v5, v8

    .line 486
    move v15, v13

    .line 487
    move/from16 v16, v14

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_11
    if-eq v2, v13, :cond_31

    .line 491
    .line 492
    if-eqz v14, :cond_15

    .line 493
    .line 494
    move/from16 v16, v2

    .line 495
    .line 496
    move v15, v8

    .line 497
    :goto_9
    if-ge v15, v2, :cond_12

    .line 498
    .line 499
    aget-byte v8, v1, v15

    .line 500
    .line 501
    and-int/lit16 v8, v8, 0xff

    .line 502
    .line 503
    sget-object v18, Lo6/c;->a:[I

    .line 504
    .line 505
    aget v8, v18, v8

    .line 506
    .line 507
    if-gez v8, :cond_14

    .line 508
    .line 509
    if-ne v8, v10, :cond_13

    .line 510
    .line 511
    sub-int v8, v2, v15

    .line 512
    .line 513
    sub-int v16, v16, v8

    .line 514
    .line 515
    :cond_12
    :goto_a
    move v15, v13

    .line 516
    move/from16 v8, v16

    .line 517
    .line 518
    :goto_b
    move/from16 v16, v14

    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_13
    add-int/lit8 v16, v16, -0x1

    .line 522
    .line 523
    :cond_14
    add-int/lit8 v15, v15, 0x1

    .line 524
    .line 525
    const/4 v8, 0x0

    .line 526
    goto :goto_9

    .line 527
    :cond_15
    add-int/lit8 v8, v2, -0x1

    .line 528
    .line 529
    aget-byte v8, v1, v8

    .line 530
    .line 531
    if-ne v8, v6, :cond_16

    .line 532
    .line 533
    add-int/lit8 v16, v2, -0x1

    .line 534
    .line 535
    add-int/lit8 v8, v2, -0x2

    .line 536
    .line 537
    aget-byte v8, v1, v8

    .line 538
    .line 539
    if-ne v8, v6, :cond_12

    .line 540
    .line 541
    add-int/lit8 v16, v2, -0x2

    .line 542
    .line 543
    goto :goto_a

    .line 544
    :cond_16
    move v8, v2

    .line 545
    move v15, v13

    .line 546
    goto :goto_b

    .line 547
    :goto_c
    int-to-long v13, v8

    .line 548
    int-to-long v5, v4

    .line 549
    mul-long/2addr v13, v5

    .line 550
    int-to-long v5, v9

    .line 551
    div-long/2addr v13, v5

    .line 552
    long-to-int v5, v13

    .line 553
    :goto_d
    new-array v6, v5, [B

    .line 554
    .line 555
    iget-boolean v7, v7, Lo6/b;->a:Z

    .line 556
    .line 557
    if-eqz v7, :cond_17

    .line 558
    .line 559
    sget-object v7, Lo6/c;->b:[I

    .line 560
    .line 561
    goto :goto_e

    .line 562
    :cond_17
    sget-object v7, Lo6/c;->a:[I

    .line 563
    .line 564
    :goto_e
    const/4 v13, -0x8

    .line 565
    move/from16 v19, v4

    .line 566
    .line 567
    move v4, v13

    .line 568
    move/from16 v22, v15

    .line 569
    .line 570
    const/4 v8, 0x0

    .line 571
    const/4 v14, 0x0

    .line 572
    const/16 v20, 0x0

    .line 573
    .line 574
    :goto_f
    const-string v15, ") at index "

    .line 575
    .line 576
    move/from16 v23, v9

    .line 577
    .line 578
    const-string/jumbo v9, "toString(...)"

    .line 579
    .line 580
    .line 581
    const-string v10, "\'("

    .line 582
    .line 583
    if-ge v14, v2, :cond_27

    .line 584
    .line 585
    if-ne v4, v13, :cond_18

    .line 586
    .line 587
    add-int/lit8 v13, v14, 0x3

    .line 588
    .line 589
    if-ge v13, v2, :cond_18

    .line 590
    .line 591
    add-int/lit8 v24, v14, 0x1

    .line 592
    .line 593
    aget-byte v0, v1, v14

    .line 594
    .line 595
    and-int/lit16 v0, v0, 0xff

    .line 596
    .line 597
    aget v0, v7, v0

    .line 598
    .line 599
    add-int/lit8 v25, v14, 0x2

    .line 600
    .line 601
    move/from16 v26, v0

    .line 602
    .line 603
    aget-byte v0, v1, v24

    .line 604
    .line 605
    and-int/lit16 v0, v0, 0xff

    .line 606
    .line 607
    aget v0, v7, v0

    .line 608
    .line 609
    move/from16 v24, v0

    .line 610
    .line 611
    aget-byte v0, v1, v25

    .line 612
    .line 613
    and-int/lit16 v0, v0, 0xff

    .line 614
    .line 615
    aget v0, v7, v0

    .line 616
    .line 617
    add-int/lit8 v25, v14, 0x4

    .line 618
    .line 619
    aget-byte v13, v1, v13

    .line 620
    .line 621
    and-int/lit16 v13, v13, 0xff

    .line 622
    .line 623
    aget v13, v7, v13

    .line 624
    .line 625
    shl-int/lit8 v26, v26, 0x12

    .line 626
    .line 627
    shl-int/lit8 v24, v24, 0xc

    .line 628
    .line 629
    or-int v24, v26, v24

    .line 630
    .line 631
    shl-int/lit8 v0, v0, 0x6

    .line 632
    .line 633
    or-int v0, v24, v0

    .line 634
    .line 635
    or-int/2addr v0, v13

    .line 636
    if-ltz v0, :cond_18

    .line 637
    .line 638
    add-int/lit8 v9, v8, 0x1

    .line 639
    .line 640
    shr-int/lit8 v10, v0, 0x10

    .line 641
    .line 642
    int-to-byte v10, v10

    .line 643
    aput-byte v10, v6, v8

    .line 644
    .line 645
    add-int/lit8 v10, v8, 0x2

    .line 646
    .line 647
    shr-int/lit8 v13, v0, 0x8

    .line 648
    .line 649
    int-to-byte v13, v13

    .line 650
    aput-byte v13, v6, v9

    .line 651
    .line 652
    add-int/lit8 v8, v8, 0x3

    .line 653
    .line 654
    int-to-byte v0, v0

    .line 655
    aput-byte v0, v6, v10

    .line 656
    .line 657
    move-object/from16 v0, p0

    .line 658
    .line 659
    move/from16 v9, v23

    .line 660
    .line 661
    move/from16 v14, v25

    .line 662
    .line 663
    :goto_10
    const/4 v10, -0x2

    .line 664
    const/4 v13, -0x8

    .line 665
    goto :goto_f

    .line 666
    :cond_18
    aget-byte v0, v1, v14

    .line 667
    .line 668
    and-int/lit16 v0, v0, 0xff

    .line 669
    .line 670
    aget v13, v7, v0

    .line 671
    .line 672
    if-gez v13, :cond_25

    .line 673
    .line 674
    move-object/from16 v24, v1

    .line 675
    .line 676
    const/4 v1, -0x2

    .line 677
    if-ne v13, v1, :cond_23

    .line 678
    .line 679
    const/4 v13, -0x8

    .line 680
    if-eq v4, v13, :cond_22

    .line 681
    .line 682
    const/4 v0, -0x6

    .line 683
    const-string v7, "The padding option is set to ABSENT, but the input has a pad character at index "

    .line 684
    .line 685
    if-eq v4, v0, :cond_20

    .line 686
    .line 687
    const/4 v0, -0x4

    .line 688
    if-eq v4, v0, :cond_1a

    .line 689
    .line 690
    if-ne v4, v1, :cond_19

    .line 691
    .line 692
    :goto_11
    add-int/lit8 v14, v14, 0x1

    .line 693
    .line 694
    goto :goto_14

    .line 695
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 696
    .line 697
    const-string v1, "Unreachable"

    .line 698
    .line 699
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    throw v0

    .line 703
    :cond_1a
    sget-object v0, Lkotlin/io/encoding/Base64$PaddingOption;->ABSENT:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 704
    .line 705
    if-eq v11, v0, :cond_1f

    .line 706
    .line 707
    add-int/lit8 v14, v14, 0x1

    .line 708
    .line 709
    if-nez v16, :cond_1b

    .line 710
    .line 711
    goto :goto_13

    .line 712
    :cond_1b
    :goto_12
    if-ge v14, v2, :cond_1d

    .line 713
    .line 714
    aget-byte v0, v24, v14

    .line 715
    .line 716
    and-int/lit16 v0, v0, 0xff

    .line 717
    .line 718
    sget-object v1, Lo6/c;->a:[I

    .line 719
    .line 720
    aget v0, v1, v0

    .line 721
    .line 722
    const/4 v1, -0x1

    .line 723
    if-eq v0, v1, :cond_1c

    .line 724
    .line 725
    goto :goto_13

    .line 726
    :cond_1c
    add-int/lit8 v14, v14, 0x1

    .line 727
    .line 728
    goto :goto_12

    .line 729
    :cond_1d
    :goto_13
    if-eq v14, v2, :cond_1e

    .line 730
    .line 731
    aget-byte v0, v24, v14

    .line 732
    .line 733
    const/16 v13, 0x3d

    .line 734
    .line 735
    if-ne v0, v13, :cond_1e

    .line 736
    .line 737
    add-int/lit8 v14, v14, 0x1

    .line 738
    .line 739
    goto :goto_14

    .line 740
    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 741
    .line 742
    const-string v1, "Missing one pad character at index "

    .line 743
    .line 744
    invoke-static {v14, v1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    throw v0

    .line 752
    :cond_1f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 753
    .line 754
    invoke-static {v14, v7}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    throw v0

    .line 762
    :cond_20
    sget-object v0, Lkotlin/io/encoding/Base64$PaddingOption;->ABSENT:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 763
    .line 764
    if-eq v11, v0, :cond_21

    .line 765
    .line 766
    goto :goto_11

    .line 767
    :goto_14
    move/from16 v17, v22

    .line 768
    .line 769
    :goto_15
    const/4 v0, -0x2

    .line 770
    goto/16 :goto_16

    .line 771
    .line 772
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 773
    .line 774
    invoke-static {v14, v7}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v0

    .line 782
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 783
    .line 784
    const-string v1, "Redundant pad character at index "

    .line 785
    .line 786
    invoke-static {v14, v1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    throw v0

    .line 794
    :cond_23
    const/16 v13, 0x3d

    .line 795
    .line 796
    if-eqz v16, :cond_24

    .line 797
    .line 798
    add-int/lit8 v14, v14, 0x1

    .line 799
    .line 800
    move-object/from16 v0, p0

    .line 801
    .line 802
    move/from16 v9, v23

    .line 803
    .line 804
    move-object/from16 v1, v24

    .line 805
    .line 806
    goto/16 :goto_10

    .line 807
    .line 808
    :cond_24
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 809
    .line 810
    new-instance v2, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    const-string v3, "Invalid symbol \'"

    .line 813
    .line 814
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    int-to-char v3, v0

    .line 818
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-static/range {v23 .. v23}, Ly1/a;->d(I)V

    .line 825
    .line 826
    .line 827
    move/from16 v3, v23

    .line 828
    .line 829
    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    throw v1

    .line 853
    :cond_25
    move-object/from16 v24, v1

    .line 854
    .line 855
    const/16 v18, 0x3d

    .line 856
    .line 857
    add-int/lit8 v14, v14, 0x1

    .line 858
    .line 859
    shl-int/lit8 v0, v20, 0x6

    .line 860
    .line 861
    or-int v20, v0, v13

    .line 862
    .line 863
    add-int/lit8 v13, v4, 0x6

    .line 864
    .line 865
    if-ltz v13, :cond_26

    .line 866
    .line 867
    add-int/lit8 v0, v8, 0x1

    .line 868
    .line 869
    ushr-int v9, v20, v13

    .line 870
    .line 871
    int-to-byte v9, v9

    .line 872
    aput-byte v9, v6, v8

    .line 873
    .line 874
    shl-int v8, v22, v13

    .line 875
    .line 876
    add-int/lit8 v8, v8, -0x1

    .line 877
    .line 878
    and-int v20, v20, v8

    .line 879
    .line 880
    add-int/lit8 v4, v4, -0x2

    .line 881
    .line 882
    move v8, v0

    .line 883
    move-object/from16 v1, v24

    .line 884
    .line 885
    const/16 v9, 0x8

    .line 886
    .line 887
    const/4 v10, -0x2

    .line 888
    const/4 v13, -0x8

    .line 889
    move-object/from16 v0, p0

    .line 890
    .line 891
    goto/16 :goto_f

    .line 892
    .line 893
    :cond_26
    move-object/from16 v0, p0

    .line 894
    .line 895
    move v4, v13

    .line 896
    move-object/from16 v1, v24

    .line 897
    .line 898
    const/16 v9, 0x8

    .line 899
    .line 900
    goto/16 :goto_10

    .line 901
    .line 902
    :cond_27
    move-object/from16 v24, v1

    .line 903
    .line 904
    const/16 v17, 0x0

    .line 905
    .line 906
    goto/16 :goto_15

    .line 907
    .line 908
    :goto_16
    if-eq v4, v0, :cond_30

    .line 909
    .line 910
    const/4 v13, -0x8

    .line 911
    if-eq v4, v13, :cond_29

    .line 912
    .line 913
    if-nez v17, :cond_29

    .line 914
    .line 915
    sget-object v0, Lkotlin/io/encoding/Base64$PaddingOption;->PRESENT:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 916
    .line 917
    if-eq v11, v0, :cond_28

    .line 918
    .line 919
    goto :goto_17

    .line 920
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 921
    .line 922
    const-string v1, "The padding option is set to PRESENT, but the input is not properly padded"

    .line 923
    .line 924
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    throw v0

    .line 928
    :cond_29
    :goto_17
    if-nez v20, :cond_2f

    .line 929
    .line 930
    if-nez v16, :cond_2a

    .line 931
    .line 932
    goto :goto_19

    .line 933
    :cond_2a
    :goto_18
    if-ge v14, v2, :cond_2c

    .line 934
    .line 935
    aget-byte v0, v24, v14

    .line 936
    .line 937
    and-int/lit16 v0, v0, 0xff

    .line 938
    .line 939
    sget-object v4, Lo6/c;->a:[I

    .line 940
    .line 941
    aget v0, v4, v0

    .line 942
    .line 943
    const/4 v1, -0x1

    .line 944
    if-eq v0, v1, :cond_2b

    .line 945
    .line 946
    goto :goto_19

    .line 947
    :cond_2b
    add-int/lit8 v14, v14, 0x1

    .line 948
    .line 949
    goto :goto_18

    .line 950
    :cond_2c
    :goto_19
    if-lt v14, v2, :cond_2e

    .line 951
    .line 952
    if-ne v8, v5, :cond_2d

    .line 953
    .line 954
    new-instance v0, Lokio/Buffer;

    .line 955
    .line 956
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0, v6}, Lokio/Buffer;->write([B)Lokio/Buffer;

    .line 960
    .line 961
    .line 962
    iget-object v1, v12, Ls/l;->f:Lokio/FileSystem;

    .line 963
    .line 964
    new-instance v2, Lcoil3/decode/r;

    .line 965
    .line 966
    const/4 v8, 0x0

    .line 967
    invoke-direct {v2, v0, v1, v8}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 968
    .line 969
    .line 970
    sget-object v0, Lcoil3/decode/DataSource;->MEMORY:Lcoil3/decode/DataSource;

    .line 971
    .line 972
    new-instance v1, Ln/k;

    .line 973
    .line 974
    invoke-direct {v1, v2, v3, v0}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 975
    .line 976
    .line 977
    return-object v1

    .line 978
    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 979
    .line 980
    const-string v1, "Check failed."

    .line 981
    .line 982
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    throw v0

    .line 986
    :cond_2e
    aget-byte v0, v24, v14

    .line 987
    .line 988
    and-int/lit16 v0, v0, 0xff

    .line 989
    .line 990
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 991
    .line 992
    new-instance v2, Ljava/lang/StringBuilder;

    .line 993
    .line 994
    const-string v3, "Symbol \'"

    .line 995
    .line 996
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    int-to-char v3, v0

    .line 1000
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    const/16 v3, 0x8

    .line 1007
    .line 1008
    invoke-static {v3}, Ly1/a;->d(I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    add-int/lit8 v14, v14, -0x1

    .line 1025
    .line 1026
    const-string v0, " is prohibited after the pad character"

    .line 1027
    .line 1028
    invoke-static {v2, v0, v14}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    throw v1

    .line 1036
    :cond_2f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1037
    .line 1038
    const-string v1, "The pad bits must be zeros"

    .line 1039
    .line 1040
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    throw v0

    .line 1044
    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1045
    .line 1046
    const-string v1, "The last unit of input does not have enough bits"

    .line 1047
    .line 1048
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    throw v0

    .line 1052
    :cond_31
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1053
    .line 1054
    const-string v1, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "

    .line 1055
    .line 1056
    invoke-static {v2, v1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    throw v0

    .line 1064
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1077
    .line 1078
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    throw v1

    .line 1086
    :cond_33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    throw v1

    .line 1108
    :pswitch_1
    move/from16 v22, v13

    .line 1109
    .line 1110
    const/4 v8, 0x0

    .line 1111
    iget-object v0, v10, Lcoil3/x;->a:Ljava/lang/String;

    .line 1112
    .line 1113
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    iget-object v1, v12, Ls/l;->a:Landroid/content/Context;

    .line 1118
    .line 1119
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v1

    .line 1123
    iget-object v2, v10, Lcoil3/x;->d:Ljava/lang/String;

    .line 1124
    .line 1125
    const-string v3, "com.android.contacts"

    .line 1126
    .line 1127
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    const-string v4, "r"

    .line 1132
    .line 1133
    const-string v5, "\'."

    .line 1134
    .line 1135
    if-eqz v3, :cond_35

    .line 1136
    .line 1137
    invoke-static {v10}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    invoke-static {v3}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v3

    .line 1145
    const-string v6, "display_photo"

    .line 1146
    .line 1147
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v3

    .line 1151
    if-eqz v3, :cond_35

    .line 1152
    .line 1153
    invoke-virtual {v1, v0, v4}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v2

    .line 1157
    if-eqz v2, :cond_34

    .line 1158
    .line 1159
    goto/16 :goto_1e

    .line 1160
    .line 1161
    :cond_34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    const-string v2, "Unable to find a contact photo associated with \'"

    .line 1164
    .line 1165
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1179
    .line 1180
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    throw v1

    .line 1188
    :cond_35
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1189
    .line 1190
    const/16 v6, 0x1d

    .line 1191
    .line 1192
    if-lt v3, v6, :cond_3b

    .line 1193
    .line 1194
    const-string v3, "media"

    .line 1195
    .line 1196
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    if-nez v2, :cond_36

    .line 1201
    .line 1202
    goto/16 :goto_1d

    .line 1203
    .line 1204
    :cond_36
    invoke-static {v10}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1209
    .line 1210
    .line 1211
    move-result v3

    .line 1212
    const/4 v6, 0x3

    .line 1213
    if-lt v3, v6, :cond_3b

    .line 1214
    .line 1215
    add-int/lit8 v6, v3, -0x3

    .line 1216
    .line 1217
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v6

    .line 1221
    const-string v7, "audio"

    .line 1222
    .line 1223
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v6

    .line 1227
    if-eqz v6, :cond_3b

    .line 1228
    .line 1229
    sub-int/2addr v3, v9

    .line 1230
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v2

    .line 1234
    const-string v3, "albums"

    .line 1235
    .line 1236
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    if-eqz v2, :cond_3b

    .line 1241
    .line 1242
    iget-object v2, v12, Ls/l;->b:Lt/f;

    .line 1243
    .line 1244
    iget-object v3, v2, Lt/f;->a:Lt/c;

    .line 1245
    .line 1246
    instance-of v4, v3, Lt/a;

    .line 1247
    .line 1248
    if-eqz v4, :cond_37

    .line 1249
    .line 1250
    check-cast v3, Lt/a;

    .line 1251
    .line 1252
    goto :goto_1a

    .line 1253
    :cond_37
    move-object v3, v8

    .line 1254
    :goto_1a
    if-eqz v3, :cond_39

    .line 1255
    .line 1256
    iget v3, v3, Lt/a;->a:I

    .line 1257
    .line 1258
    iget-object v2, v2, Lt/f;->b:Lt/c;

    .line 1259
    .line 1260
    instance-of v4, v2, Lt/a;

    .line 1261
    .line 1262
    if-eqz v4, :cond_38

    .line 1263
    .line 1264
    check-cast v2, Lt/a;

    .line 1265
    .line 1266
    goto :goto_1b

    .line 1267
    :cond_38
    move-object v2, v8

    .line 1268
    :goto_1b
    if-eqz v2, :cond_39

    .line 1269
    .line 1270
    iget v2, v2, Lt/a;->a:I

    .line 1271
    .line 1272
    new-instance v11, Landroid/os/Bundle;

    .line 1273
    .line 1274
    move/from16 v15, v22

    .line 1275
    .line 1276
    invoke-direct {v11, v15}, Landroid/os/Bundle;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    new-instance v4, Landroid/graphics/Point;

    .line 1280
    .line 1281
    invoke-direct {v4, v3, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 1282
    .line 1283
    .line 1284
    const-string v2, "android.content.extra.SIZE"

    .line 1285
    .line 1286
    invoke-virtual {v11, v2, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1287
    .line 1288
    .line 1289
    goto :goto_1c

    .line 1290
    :cond_39
    move-object v11, v8

    .line 1291
    :goto_1c
    invoke-static {v1, v0, v11}, Landroidx/transition/c;->d(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    if-eqz v2, :cond_3a

    .line 1296
    .line 1297
    goto :goto_1e

    .line 1298
    :cond_3a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    const-string v2, "Unable to find a music thumbnail associated with \'"

    .line 1301
    .line 1302
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    throw v1

    .line 1325
    :cond_3b
    :goto_1d
    invoke-virtual {v1, v0, v4}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    if-eqz v2, :cond_3c

    .line 1330
    .line 1331
    :goto_1e
    new-instance v3, Ln/k;

    .line 1332
    .line 1333
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v4

    .line 1337
    invoke-static {v4}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v4

    .line 1341
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v4

    .line 1345
    iget-object v5, v12, Ls/l;->f:Lokio/FileSystem;

    .line 1346
    .line 1347
    new-instance v6, Lcoil3/decode/f;

    .line 1348
    .line 1349
    invoke-direct {v6, v2}, Lcoil3/decode/f;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    .line 1350
    .line 1351
    .line 1352
    new-instance v2, Lcoil3/decode/r;

    .line 1353
    .line 1354
    invoke-direct {v2, v4, v5, v6}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    sget-object v1, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 1362
    .line 1363
    invoke-direct {v3, v2, v0, v1}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 1364
    .line 1365
    .line 1366
    return-object v3

    .line 1367
    :cond_3c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    const-string v2, "Unable to open \'"

    .line 1370
    .line 1371
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1385
    .line 1386
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    throw v1

    .line 1394
    :pswitch_2
    const/4 v8, 0x0

    .line 1395
    invoke-static {v10}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    const/4 v15, 0x1

    .line 1400
    invoke-static {v0, v15}, Lkotlin/collections/t;->e0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v16

    .line 1404
    const/16 v20, 0x0

    .line 1405
    .line 1406
    const/16 v21, 0x3e

    .line 1407
    .line 1408
    const-string v17, "/"

    .line 1409
    .line 1410
    const/16 v18, 0x0

    .line 1411
    .line 1412
    const/16 v19, 0x0

    .line 1413
    .line 1414
    invoke-static/range {v16 .. v21}, Lkotlin/collections/t;->n0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lr6/c;I)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    new-instance v1, Ln/k;

    .line 1419
    .line 1420
    iget-object v9, v12, Ls/l;->a:Landroid/content/Context;

    .line 1421
    .line 1422
    invoke-virtual {v9}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v9

    .line 1426
    invoke-virtual {v9, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v9

    .line 1430
    invoke-static {v9}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v9

    .line 1434
    invoke-static {v9}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v9

    .line 1438
    iget-object v10, v12, Ls/l;->f:Lokio/FileSystem;

    .line 1439
    .line 1440
    new-instance v11, Lcoil3/decode/a;

    .line 1441
    .line 1442
    invoke-direct {v11, v0}, Lcoil3/decode/a;-><init>(Ljava/lang/String;)V

    .line 1443
    .line 1444
    .line 1445
    new-instance v12, Lcoil3/decode/r;

    .line 1446
    .line 1447
    invoke-direct {v12, v9, v10, v11}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 1448
    .line 1449
    .line 1450
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v9

    .line 1454
    if-eqz v9, :cond_3d

    .line 1455
    .line 1456
    :goto_1f
    move-object v11, v8

    .line 1457
    goto :goto_20

    .line 1458
    :cond_3d
    invoke-static {v0, v7}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    invoke-static {v0, v6}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    invoke-static {v5, v0, v0}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    invoke-static {v4, v0, v3}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v0

    .line 1474
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v3

    .line 1478
    if-eqz v3, :cond_3e

    .line 1479
    .line 1480
    goto :goto_1f

    .line 1481
    :cond_3e
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1482
    .line 1483
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1488
    .line 1489
    .line 1490
    sget-object v2, Lcoil3/util/i;->a:Ljava/util/Map;

    .line 1491
    .line 1492
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v2

    .line 1496
    move-object v11, v2

    .line 1497
    check-cast v11, Ljava/lang/String;

    .line 1498
    .line 1499
    if-nez v11, :cond_3f

    .line 1500
    .line 1501
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v2

    .line 1505
    invoke-virtual {v2, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v11

    .line 1509
    :cond_3f
    :goto_20
    sget-object v0, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 1510
    .line 1511
    invoke-direct {v1, v12, v11, v0}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 1512
    .line 1513
    .line 1514
    return-object v1

    .line 1515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
