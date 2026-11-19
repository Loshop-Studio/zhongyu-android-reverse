.class public Landroidx/constraintlayout/core/state/ConstraintSetParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$MotionLayoutDebugFlags;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$OverrideValue;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$FiniteGenerator;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$Generator;,
        Landroidx/constraintlayout/core/state/ConstraintSetParser$GeneratedValue;
    }
.end annotation


# static fields
.field private static final PARSER_DEBUG:Z = false


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

.method public static applyAttribute(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, -0x1

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    :goto_0
    move v0, v6

    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :sswitch_0
    const-string/jumbo v0, "visibility"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v0, 0x17

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :sswitch_1
    const-string v0, "centerHorizontally"

    .line 36
    .line 37
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/16 v0, 0x16

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :sswitch_2
    const-string v0, "hWeight"

    .line 49
    .line 50
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/16 v0, 0x15

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_3
    const-string/jumbo v0, "width"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const/16 v0, 0x14

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :sswitch_4
    const-string/jumbo v0, "vBias"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/16 v0, 0x13

    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :sswitch_5
    const-string v0, "hBias"

    .line 90
    .line 91
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_5

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    const/16 v0, 0x12

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :sswitch_6
    const-string v0, "alpha"

    .line 103
    .line 104
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_6
    const/16 v0, 0x11

    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :sswitch_7
    const-string/jumbo v0, "vWeight"

    .line 116
    .line 117
    .line 118
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_7

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_7
    const/16 v0, 0x10

    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :sswitch_8
    const-string v0, "hRtlBias"

    .line 130
    .line 131
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_8

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_8
    const/16 v0, 0xf

    .line 139
    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :sswitch_9
    const-string/jumbo v0, "scaleY"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_9
    const/16 v0, 0xe

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :sswitch_a
    const-string/jumbo v0, "scaleX"

    .line 158
    .line 159
    .line 160
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_a

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_a
    const/16 v0, 0xd

    .line 169
    .line 170
    goto/16 :goto_1

    .line 171
    .line 172
    :sswitch_b
    const-string v0, "pivotY"

    .line 173
    .line 174
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_b

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_b
    const/16 v0, 0xc

    .line 183
    .line 184
    goto/16 :goto_1

    .line 185
    .line 186
    :sswitch_c
    const-string v0, "pivotX"

    .line 187
    .line 188
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-nez v0, :cond_c

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    const/16 v0, 0xb

    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :sswitch_d
    const-string v0, "motion"

    .line 201
    .line 202
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_d

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_d
    const/16 v0, 0xa

    .line 211
    .line 212
    goto/16 :goto_1

    .line 213
    .line 214
    :sswitch_e
    const-string v0, "height"

    .line 215
    .line 216
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-nez v0, :cond_e

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_e
    const/16 v0, 0x9

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :sswitch_f
    const-string/jumbo v0, "translationZ"

    .line 229
    .line 230
    .line 231
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_f

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_f
    move v0, v1

    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :sswitch_10
    const-string/jumbo v0, "translationY"

    .line 243
    .line 244
    .line 245
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_10

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_10
    const/4 v0, 0x7

    .line 254
    goto :goto_1

    .line 255
    :sswitch_11
    const-string/jumbo v0, "translationX"

    .line 256
    .line 257
    .line 258
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_11

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_11
    const/4 v0, 0x6

    .line 267
    goto :goto_1

    .line 268
    :sswitch_12
    const-string/jumbo v0, "rotationZ"

    .line 269
    .line 270
    .line 271
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-nez v0, :cond_12

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_12
    const/4 v0, 0x5

    .line 280
    goto :goto_1

    .line 281
    :sswitch_13
    const-string/jumbo v0, "rotationY"

    .line 282
    .line 283
    .line 284
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_13

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_13
    move v0, v2

    .line 293
    goto :goto_1

    .line 294
    :sswitch_14
    const-string/jumbo v0, "rotationX"

    .line 295
    .line 296
    .line 297
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_14

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_14
    const/4 v0, 0x3

    .line 306
    goto :goto_1

    .line 307
    :sswitch_15
    const-string v0, "custom"

    .line 308
    .line 309
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_15

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_15
    move v0, v3

    .line 318
    goto :goto_1

    .line 319
    :sswitch_16
    const-string v0, "center"

    .line 320
    .line 321
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_16

    .line 326
    .line 327
    goto/16 :goto_0

    .line 328
    .line 329
    :cond_16
    move v0, v4

    .line 330
    goto :goto_1

    .line 331
    :sswitch_17
    const-string v0, "centerVertically"

    .line 332
    .line 333
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_17

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_17
    move v0, v5

    .line 342
    :goto_1
    const-string v7, "parent"

    .line 343
    .line 344
    packed-switch v0, :pswitch_data_0

    .line 345
    .line 346
    .line 347
    invoke-static {p0, p1, p3, p2, p4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseConstraint(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_0
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    sparse-switch p1, :sswitch_data_1

    .line 363
    .line 364
    .line 365
    :goto_2
    move v3, v6

    .line 366
    goto :goto_3

    .line 367
    :sswitch_18
    const-string/jumbo p1, "visible"

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    if-nez p0, :cond_1a

    .line 375
    .line 376
    goto :goto_2

    .line 377
    :sswitch_19
    const-string p1, "gone"

    .line 378
    .line 379
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    if-nez p0, :cond_18

    .line 384
    .line 385
    goto :goto_2

    .line 386
    :cond_18
    move v3, v4

    .line 387
    goto :goto_3

    .line 388
    :sswitch_1a
    const-string p1, "invisible"

    .line 389
    .line 390
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    if-nez p0, :cond_19

    .line 395
    .line 396
    goto :goto_2

    .line 397
    :cond_19
    move v3, v5

    .line 398
    :cond_1a
    :goto_3
    packed-switch v3, :pswitch_data_1

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_1
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/core/state/ConstraintReference;->visibility(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :pswitch_2
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->visibility(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :pswitch_3
    invoke-virtual {p2, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->visibility(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 411
    .line 412
    .line 413
    const/4 p0, 0x0

    .line 414
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->alpha(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :pswitch_4
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result p3

    .line 426
    if-eqz p3, :cond_1b

    .line 427
    .line 428
    sget-object p1, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 429
    .line 430
    :cond_1b
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->startToStart(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 435
    .line 436
    .line 437
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->endToEnd(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_5
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 446
    .line 447
    .line 448
    move-result p0

    .line 449
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setHorizontalChainWeight(F)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_6
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/State;->getDpToPixel()Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-static {p3, p4, p0, p1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseDimension(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/CorePixelDp;)Landroidx/constraintlayout/core/state/Dimension;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setWidth(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :pswitch_7
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 470
    .line 471
    .line 472
    move-result p0

    .line 473
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->verticalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 474
    .line 475
    .line 476
    return-void

    .line 477
    :pswitch_8
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 482
    .line 483
    .line 484
    move-result p0

    .line 485
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->horizontalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_9
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->alpha(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_a
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setVerticalChainWeight(F)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :pswitch_b
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 514
    .line 515
    .line 516
    move-result-object p3

    .line 517
    invoke-virtual {p1, p3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/State;->isRtl()Z

    .line 522
    .line 523
    .line 524
    move-result p0

    .line 525
    if-eqz p0, :cond_1c

    .line 526
    .line 527
    const/high16 p0, 0x3f800000    # 1.0f

    .line 528
    .line 529
    sub-float p1, p0, p1

    .line 530
    .line 531
    :cond_1c
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/state/ConstraintReference;->horizontalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_c
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 540
    .line 541
    .line 542
    move-result p0

    .line 543
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->scaleY(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :pswitch_d
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 552
    .line 553
    .line 554
    move-result p0

    .line 555
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->scaleX(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_e
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 564
    .line 565
    .line 566
    move-result p0

    .line 567
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->pivotY(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :pswitch_f
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 576
    .line 577
    .line 578
    move-result p0

    .line 579
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->pivotX(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :pswitch_10
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 584
    .line 585
    .line 586
    move-result-object p0

    .line 587
    invoke-static {p0, p2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseMotionProperties(Landroidx/constraintlayout/core/parser/CLElement;Landroidx/constraintlayout/core/state/ConstraintReference;)V

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :pswitch_11
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/State;->getDpToPixel()Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    invoke-static {p3, p4, p0, p1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseDimension(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/CorePixelDp;)Landroidx/constraintlayout/core/state/Dimension;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setHeight(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :pswitch_12
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 604
    .line 605
    .line 606
    move-result-object p3

    .line 607
    invoke-virtual {p1, p3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->translationZ(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 616
    .line 617
    .line 618
    return-void

    .line 619
    :pswitch_13
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 620
    .line 621
    .line 622
    move-result-object p3

    .line 623
    invoke-virtual {p1, p3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 628
    .line 629
    .line 630
    move-result p0

    .line 631
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->translationY(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :pswitch_14
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 636
    .line 637
    .line 638
    move-result-object p3

    .line 639
    invoke-virtual {p1, p3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 640
    .line 641
    .line 642
    move-result p1

    .line 643
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 644
    .line 645
    .line 646
    move-result p0

    .line 647
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->translationX(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :pswitch_15
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 656
    .line 657
    .line 658
    move-result p0

    .line 659
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->rotationZ(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :pswitch_16
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 668
    .line 669
    .line 670
    move-result p0

    .line 671
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->rotationY(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :pswitch_17
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 680
    .line 681
    .line 682
    move-result p0

    .line 683
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->rotationX(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_18
    invoke-static {p3, p2, p4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseCustomProperties(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :pswitch_19
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result p3

    .line 699
    if-eqz p3, :cond_1d

    .line 700
    .line 701
    sget-object p1, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 702
    .line 703
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 704
    .line 705
    .line 706
    move-result-object p0

    .line 707
    goto :goto_4

    .line 708
    :cond_1d
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    :goto_4
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->startToStart(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 713
    .line 714
    .line 715
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->endToEnd(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 716
    .line 717
    .line 718
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 719
    .line 720
    .line 721
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 722
    .line 723
    .line 724
    return-void

    .line 725
    :pswitch_1a
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result p3

    .line 733
    if-eqz p3, :cond_1e

    .line 734
    .line 735
    sget-object p1, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 736
    .line 737
    :cond_1e
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 742
    .line 743
    .line 744
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 745
    .line 746
    .line 747
    return-void

    .line 748
    nop

    .line 749
    :sswitch_data_0
    .sparse-switch
        -0x565a8e48 -> :sswitch_17
        -0x514d33ab -> :sswitch_16
        -0x5069748f -> :sswitch_15
        -0x4a771f66 -> :sswitch_14
        -0x4a771f65 -> :sswitch_13
        -0x4a771f64 -> :sswitch_12
        -0x490b9c39 -> :sswitch_11
        -0x490b9c38 -> :sswitch_10
        -0x490b9c37 -> :sswitch_f
        -0x48c76ed9 -> :sswitch_e
        -0x3fad404a -> :sswitch_d
        -0x3ae243aa -> :sswitch_c
        -0x3ae243a9 -> :sswitch_b
        -0x3621dfb2 -> :sswitch_a
        -0x3621dfb1 -> :sswitch_9
        -0xec32145 -> :sswitch_8
        -0x3aa8172 -> :sswitch_7
        0x589b15e -> :sswitch_6
        0x5d92341 -> :sswitch_5
        0x69e6c4f -> :sswitch_4
        0x6be2dc6 -> :sswitch_3
        0x17be4100 -> :sswitch_2
        0x53b069a6 -> :sswitch_1
        0x73b66312 -> :sswitch_0
    .end sparse-switch

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
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
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
        :pswitch_0
    .end packed-switch

    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    :sswitch_data_1
    .sparse-switch
        -0x715b4053 -> :sswitch_1a
        0x30809f -> :sswitch_19
        0x1bd1f072 -> :sswitch_18
    .end sparse-switch

    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static varargs indexOf(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public static lookForType(Landroidx/constraintlayout/core/parser/CLObject;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :cond_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const-string/jumbo v4, "type"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static override(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->getObject(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :cond_1
    :goto_0
    if-ge v2, v0, :cond_7

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "clear"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p0, v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p2, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move v4, v1

    .line 56
    :goto_1
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-ge v4, v5, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/4 v7, -0x1

    .line 75
    sparse-switch v6, :sswitch_data_0

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :sswitch_0
    const-string v6, "dimensions"

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    const/4 v7, 0x2

    .line 89
    goto :goto_2

    .line 90
    :sswitch_1
    const-string v6, "constraints"

    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const/4 v7, 0x1

    .line 100
    goto :goto_2

    .line 101
    :sswitch_2
    const-string/jumbo v6, "transforms"

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    move v7, v1

    .line 112
    :goto_2
    packed-switch v7, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :pswitch_0
    const-string/jumbo v5, "width"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v5, "height"

    .line 126
    .line 127
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :pswitch_1
    const-string/jumbo v5, "start"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v5, "end"

    .line 138
    .line 139
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string/jumbo v5, "top"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v5, "bottom"

    .line 149
    .line 150
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string v5, "baseline"

    .line 154
    .line 155
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v5, "center"

    .line 159
    .line 160
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string v5, "centerHorizontally"

    .line 164
    .line 165
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const-string v5, "centerVertically"

    .line 169
    .line 170
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :pswitch_2
    const-string/jumbo v5, "visibility"

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string v5, "alpha"

    .line 181
    .line 182
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v5, "pivotX"

    .line 186
    .line 187
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string v5, "pivotY"

    .line 191
    .line 192
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string/jumbo v5, "rotationX"

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string/jumbo v5, "rotationY"

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string/jumbo v5, "rotationZ"

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string/jumbo v5, "scaleX"

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const-string/jumbo v5, "scaleY"

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const-string/jumbo v5, "translationX"

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-string/jumbo v5, "translationY"

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :cond_7
    return-void

    .line 242
    nop

    .line 243
    :sswitch_data_0
    .sparse-switch
        -0x66f0fd79 -> :sswitch_2
        -0x5fc459ca -> :sswitch_1
        0x18b23fcd -> :sswitch_0
    .end sparse-switch

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseBarrier(Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/State;->isRtl()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Landroidx/constraintlayout/core/state/State$Direction;->END:Landroidx/constraintlayout/core/state/State$Direction;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v1}, Landroidx/constraintlayout/core/state/State;->barrier(Ljava/lang/Object;Landroidx/constraintlayout/core/state/State$Direction;)Landroidx/constraintlayout/core/state/helpers/BarrierReference;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    :cond_1
    :goto_0
    if-ge v4, v2, :cond_d

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    check-cast v5, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x2

    .line 43
    const/4 v8, -0x1

    .line 44
    const/4 v9, 0x1

    .line 45
    sparse-switch v6, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    :goto_1
    move v6, v8

    .line 49
    goto :goto_2

    .line 50
    :sswitch_0
    const-string v6, "contains"

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v6, v7

    .line 60
    goto :goto_2

    .line 61
    :sswitch_1
    const-string v6, "direction"

    .line 62
    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v6, v9

    .line 71
    goto :goto_2

    .line 72
    :sswitch_2
    const-string v6, "margin"

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v6, v3

    .line 82
    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_0
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    move v6, v3

    .line 93
    :goto_3
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-ge v6, v7, :cond_1

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {p0, v7}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {p1, v7}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 116
    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :pswitch_1
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    sparse-switch v6, :sswitch_data_1

    .line 133
    .line 134
    .line 135
    :goto_4
    move v7, v8

    .line 136
    goto :goto_5

    .line 137
    :sswitch_3
    const-string/jumbo v6, "start"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_5

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    const/4 v7, 0x5

    .line 148
    goto :goto_5

    .line 149
    :sswitch_4
    const-string/jumbo v6, "right"

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_6

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    const/4 v7, 0x4

    .line 160
    goto :goto_5

    .line 161
    :sswitch_5
    const-string v6, "left"

    .line 162
    .line 163
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    const/4 v7, 0x3

    .line 171
    goto :goto_5

    .line 172
    :sswitch_6
    const-string/jumbo v6, "top"

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_a

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :sswitch_7
    const-string v6, "end"

    .line 183
    .line 184
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_8

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    move v7, v9

    .line 192
    goto :goto_5

    .line 193
    :sswitch_8
    const-string v6, "bottom"

    .line 194
    .line 195
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-nez v5, :cond_9

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    move v7, v3

    .line 203
    :cond_a
    :goto_5
    packed-switch v7, :pswitch_data_1

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :pswitch_2
    if-nez v0, :cond_b

    .line 209
    .line 210
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->LEFT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 211
    .line 212
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_b
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->RIGHT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 218
    .line 219
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_3
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->RIGHT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 225
    .line 226
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_4
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->LEFT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 232
    .line 233
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :pswitch_5
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->TOP:Landroidx/constraintlayout/core/state/State$Direction;

    .line 239
    .line 240
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :pswitch_6
    if-nez v0, :cond_c

    .line 246
    .line 247
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->RIGHT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 248
    .line 249
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_c
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->LEFT:Landroidx/constraintlayout/core/state/State$Direction;

    .line 255
    .line 256
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :pswitch_7
    sget-object v5, Landroidx/constraintlayout/core/state/State$Direction;->BOTTOM:Landroidx/constraintlayout/core/state/State$Direction;

    .line 262
    .line 263
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->setBarrierDirection(Landroidx/constraintlayout/core/state/State$Direction;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_8
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-nez v6, :cond_1

    .line 277
    .line 278
    invoke-static {p0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/helpers/BarrierReference;->margin(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_d
    :goto_6
    return-void

    .line 292
    nop

    .line 293
    :sswitch_data_0
    .sparse-switch
        -0x40737a52 -> :sswitch_2
        -0x395ff881 -> :sswitch_1
        -0x21d289e1 -> :sswitch_0
    .end sparse-switch

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    :sswitch_data_1
    .sparse-switch
        -0x527265d5 -> :sswitch_8
        0x188db -> :sswitch_7
        0x1c155 -> :sswitch_6
        0x32a007 -> :sswitch_5
        0x677c21c -> :sswitch_4
        0x68ac462 -> :sswitch_3
    .end sparse-switch

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static parseChain(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/constraintlayout/core/state/State;->horizontalChain()Landroidx/constraintlayout/core/state/helpers/HorizontalChainReference;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/core/state/State;->verticalChain()Landroidx/constraintlayout/core/state/helpers/VerticalChainReference;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p3, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 18
    .line 19
    if-eqz v2, :cond_8

    .line 20
    .line 21
    check-cast v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v2, v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_1
    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ge v3, v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v3, 0x2

    .line 58
    if-le v1, v3, :cond_8

    .line 59
    .line 60
    invoke-virtual {p3, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    instance-of v1, p3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_3
    check-cast p3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 70
    .line 71
    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    move v4, v2

    .line 80
    :goto_2
    if-ge v4, v3, :cond_8

    .line 81
    .line 82
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    check-cast v5, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-string/jumbo v6, "style"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-nez v6, :cond_4

    .line 101
    .line 102
    invoke-static {p1, p2, p3, p0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseConstraint(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-virtual {p3, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    instance-of v6, v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 111
    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    move-object v6, v5

    .line 115
    check-cast v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 116
    .line 117
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-le v7, v0, :cond_5

    .line 122
    .line 123
    invoke-virtual {v6, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v6, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->bias(F)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const-string v6, "packed"

    .line 143
    .line 144
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-nez v6, :cond_7

    .line 149
    .line 150
    const-string/jumbo v6, "spread_inside"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-nez v5, :cond_6

    .line 158
    .line 159
    sget-object v5, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD:Landroidx/constraintlayout/core/state/State$Chain;

    .line 160
    .line 161
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    sget-object v5, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD_INSIDE:Landroidx/constraintlayout/core/state/State$Chain;

    .line 166
    .line 167
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    sget-object v5, Landroidx/constraintlayout/core/state/State$Chain;->PACKED:Landroidx/constraintlayout/core/state/State$Chain;

    .line 172
    .line 173
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_8
    :goto_4
    return-void
.end method

.method private static parseChainType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-object/from16 v4, p0

    .line 9
    .line 10
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/16 v5, 0x68

    .line 15
    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/State;->horizontalChain()Landroidx/constraintlayout/core/state/helpers/HorizontalChainReference;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :goto_0
    move-object v5, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/State;->verticalChain()Landroidx/constraintlayout/core/state/helpers/VerticalChainReference;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    invoke-virtual {v5, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->setKey(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    move v6, v3

    .line 41
    :goto_2
    if-ge v6, v12, :cond_15

    .line 42
    .line 43
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    add-int/lit8 v13, v6, 0x1

    .line 48
    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/4 v14, 0x6

    .line 59
    const/4 v8, 0x4

    .line 60
    const/4 v9, 0x3

    .line 61
    const/4 v10, 0x2

    .line 62
    const/4 v11, 0x1

    .line 63
    const/16 v16, -0x1

    .line 64
    .line 65
    sparse-switch v6, :sswitch_data_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :sswitch_0
    const-string/jumbo v6, "style"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_1

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_1
    const/16 v16, 0x7

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :sswitch_1
    const-string/jumbo v6, "start"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-nez v6, :cond_2

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_2
    move/from16 v16, v14

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :sswitch_2
    const-string/jumbo v6, "right"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_3

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    const/16 v16, 0x5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :sswitch_3
    const-string v6, "left"

    .line 111
    .line 112
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_4

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move/from16 v16, v8

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :sswitch_4
    const-string/jumbo v6, "top"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move/from16 v16, v9

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :sswitch_5
    const-string v6, "end"

    .line 136
    .line 137
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-nez v6, :cond_6

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move/from16 v16, v10

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :sswitch_6
    const-string v6, "contains"

    .line 148
    .line 149
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-nez v6, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    move/from16 v16, v11

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :sswitch_7
    const-string v6, "bottom"

    .line 160
    .line 161
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_8

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    move/from16 v16, v3

    .line 169
    .line 170
    :goto_3
    packed-switch v16, :pswitch_data_0

    .line 171
    .line 172
    .line 173
    :cond_9
    :goto_4
    move-object/from16 v3, p3

    .line 174
    .line 175
    goto/16 :goto_c

    .line 176
    .line 177
    :pswitch_0
    invoke-virtual {v2, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    instance-of v7, v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 182
    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    move-object v7, v6

    .line 186
    check-cast v7, Landroidx/constraintlayout/core/parser/CLArray;

    .line 187
    .line 188
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-le v8, v11, :cond_a

    .line 193
    .line 194
    invoke-virtual {v7, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v7, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->bias(F)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_a
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    :goto_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    const-string v7, "packed"

    .line 214
    .line 215
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-nez v7, :cond_c

    .line 220
    .line 221
    const-string/jumbo v7, "spread_inside"

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-nez v6, :cond_b

    .line 229
    .line 230
    sget-object v6, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD:Landroidx/constraintlayout/core/state/State$Chain;

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_b
    sget-object v6, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD_INSIDE:Landroidx/constraintlayout/core/state/State$Chain;

    .line 237
    .line 238
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_c
    sget-object v6, Landroidx/constraintlayout/core/state/State$Chain;->PACKED:Landroidx/constraintlayout/core/state/State$Chain;

    .line 243
    .line 244
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :pswitch_1
    invoke-virtual {v2, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    instance-of v7, v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 253
    .line 254
    if-eqz v7, :cond_14

    .line 255
    .line 256
    move-object v7, v6

    .line 257
    check-cast v7, Landroidx/constraintlayout/core/parser/CLArray;

    .line 258
    .line 259
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-ge v15, v11, :cond_d

    .line 264
    .line 265
    goto/16 :goto_b

    .line 266
    .line 267
    :cond_d
    move v15, v3

    .line 268
    :goto_6
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-ge v15, v6, :cond_9

    .line 273
    .line 274
    invoke-virtual {v7, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    instance-of v11, v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 279
    .line 280
    if-eqz v11, :cond_13

    .line 281
    .line 282
    check-cast v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 283
    .line 284
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    if-lez v11, :cond_12

    .line 289
    .line 290
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    const/high16 v17, 0x7fc00000    # Float.NaN

    .line 303
    .line 304
    if-eq v3, v10, :cond_11

    .line 305
    .line 306
    if-eq v3, v9, :cond_10

    .line 307
    .line 308
    if-eq v3, v8, :cond_f

    .line 309
    .line 310
    if-eq v3, v14, :cond_e

    .line 311
    .line 312
    move-object v3, v7

    .line 313
    move/from16 v18, v8

    .line 314
    .line 315
    move/from16 v19, v9

    .line 316
    .line 317
    move v14, v10

    .line 318
    move-object v6, v11

    .line 319
    move/from16 v7, v17

    .line 320
    .line 321
    move v8, v7

    .line 322
    move v9, v8

    .line 323
    move v10, v9

    .line 324
    move v11, v10

    .line 325
    :goto_7
    const/16 v20, 0x1

    .line 326
    .line 327
    goto/16 :goto_9

    .line 328
    .line 329
    :cond_e
    const/4 v3, 0x1

    .line 330
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 331
    .line 332
    .line 333
    move-result v17

    .line 334
    invoke-virtual {v6, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 335
    .line 336
    .line 337
    move-result v14

    .line 338
    invoke-static {v0, v14}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 339
    .line 340
    .line 341
    move-result v14

    .line 342
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    invoke-static {v0, v10}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    invoke-static {v0, v9}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    const/4 v3, 0x5

    .line 359
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    invoke-static {v0, v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    move-object v3, v11

    .line 368
    move v11, v6

    .line 369
    move-object v6, v3

    .line 370
    move v3, v10

    .line 371
    move v10, v9

    .line 372
    move v9, v3

    .line 373
    move-object v3, v7

    .line 374
    move/from16 v18, v8

    .line 375
    .line 376
    move v8, v14

    .line 377
    move/from16 v7, v17

    .line 378
    .line 379
    const/4 v14, 0x2

    .line 380
    const/16 v19, 0x3

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_f
    const/4 v3, 0x5

    .line 384
    const/4 v9, 0x1

    .line 385
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    const/4 v14, 0x2

    .line 390
    invoke-virtual {v6, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    invoke-static {v0, v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    const/4 v8, 0x3

    .line 399
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    invoke-static {v0, v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    move/from16 v19, v8

    .line 408
    .line 409
    move/from16 v20, v9

    .line 410
    .line 411
    const/16 v18, 0x4

    .line 412
    .line 413
    move v8, v3

    .line 414
    move v9, v6

    .line 415
    move-object v3, v7

    .line 416
    move v7, v10

    .line 417
    move-object v6, v11

    .line 418
    move/from16 v10, v17

    .line 419
    .line 420
    :goto_8
    move v11, v10

    .line 421
    goto :goto_9

    .line 422
    :cond_10
    move v8, v9

    .line 423
    move v14, v10

    .line 424
    const/4 v9, 0x1

    .line 425
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    invoke-virtual {v6, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    invoke-static {v0, v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    move-object v10, v7

    .line 438
    move v7, v3

    .line 439
    move-object v3, v10

    .line 440
    move/from16 v19, v8

    .line 441
    .line 442
    move/from16 v20, v9

    .line 443
    .line 444
    move/from16 v10, v17

    .line 445
    .line 446
    const/16 v18, 0x4

    .line 447
    .line 448
    move v8, v6

    .line 449
    move v9, v8

    .line 450
    move-object v6, v11

    .line 451
    goto :goto_8

    .line 452
    :cond_11
    move v8, v9

    .line 453
    move v14, v10

    .line 454
    const/4 v9, 0x1

    .line 455
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    move-object v6, v7

    .line 460
    move v7, v3

    .line 461
    move-object v3, v6

    .line 462
    move/from16 v19, v8

    .line 463
    .line 464
    move/from16 v20, v9

    .line 465
    .line 466
    move-object v6, v11

    .line 467
    move/from16 v8, v17

    .line 468
    .line 469
    move v9, v8

    .line 470
    move v10, v9

    .line 471
    move v11, v10

    .line 472
    const/16 v18, 0x4

    .line 473
    .line 474
    :goto_9
    invoke-virtual/range {v5 .. v11}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->addChainElement(Ljava/lang/Object;FFFFF)V

    .line 475
    .line 476
    .line 477
    goto :goto_a

    .line 478
    :cond_12
    move-object v3, v7

    .line 479
    move/from16 v18, v8

    .line 480
    .line 481
    move/from16 v19, v9

    .line 482
    .line 483
    move v14, v10

    .line 484
    const/16 v20, 0x1

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_13
    move-object v3, v7

    .line 488
    move/from16 v18, v8

    .line 489
    .line 490
    move/from16 v19, v9

    .line 491
    .line 492
    move v14, v10

    .line 493
    const/16 v20, 0x1

    .line 494
    .line 495
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v6

    .line 503
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 504
    .line 505
    .line 506
    :goto_a
    add-int/lit8 v15, v15, 0x1

    .line 507
    .line 508
    move-object v7, v3

    .line 509
    move v10, v14

    .line 510
    move/from16 v8, v18

    .line 511
    .line 512
    move/from16 v9, v19

    .line 513
    .line 514
    move/from16 v11, v20

    .line 515
    .line 516
    const/4 v3, 0x0

    .line 517
    const/4 v14, 0x6

    .line 518
    goto/16 :goto_6

    .line 519
    .line 520
    :cond_14
    :goto_b
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 521
    .line 522
    const-string v2, " contains should be an array \""

    .line 523
    .line 524
    invoke-static {v1, v2}, Landroid/support/v4/media/f;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string v2, "\""

    .line 536
    .line 537
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :pswitch_2
    move-object/from16 v3, p3

    .line 549
    .line 550
    invoke-static {v0, v3, v2, v5, v7}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseConstraint(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    :goto_c
    move v6, v13

    .line 554
    const/4 v3, 0x0

    .line 555
    goto/16 :goto_2

    .line 556
    .line 557
    :cond_15
    return-void

    .line 558
    nop

    .line 559
    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_7
        -0x21d289e1 -> :sswitch_6
        0x188db -> :sswitch_5
        0x1c155 -> :sswitch_4
        0x32a007 -> :sswitch_3
        0x677c21c -> :sswitch_2
        0x68ac462 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static parseColorString(Ljava/lang/String;)J
    .locals 2

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x6

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const-string v0, "FF"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    const/16 v0, 0x10

    .line 28
    .line 29
    invoke-static {p0, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    :cond_1
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    return-wide v0
.end method

.method public static parseConstraint(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/State;->isRtl()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    xor-int/lit8 v6, v5, 0x1

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const-string/jumbo v9, "start"

    .line 22
    .line 23
    .line 24
    const-string v10, "end"

    .line 25
    .line 26
    const-string/jumbo v11, "top"

    .line 27
    .line 28
    .line 29
    const-string v12, "bottom"

    .line 30
    .line 31
    const-string v13, "baseline"

    .line 32
    .line 33
    const-string v15, "parent"

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v14, 0x1

    .line 37
    move/from16 v18, v5

    .line 38
    .line 39
    if-eqz v7, :cond_1d

    .line 40
    .line 41
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-le v5, v14, :cond_1d

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v7, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/16 v19, 0x0

    .line 60
    .line 61
    const/4 v14, 0x2

    .line 62
    if-le v8, v14, :cond_0

    .line 63
    .line 64
    invoke-virtual {v7, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v1, v8}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    invoke-static {v0, v8}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move/from16 v8, v19

    .line 78
    .line 79
    :goto_0
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    move/from16 v21, v6

    .line 84
    .line 85
    const/4 v6, 0x3

    .line 86
    if-le v14, v6, :cond_1

    .line 87
    .line 88
    invoke-virtual {v7, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-virtual {v1, v14}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    invoke-static {v0, v14}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move/from16 v14, v19

    .line 102
    .line 103
    :goto_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    if-eqz v15, :cond_2

    .line 108
    .line 109
    sget-object v2, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    goto :goto_2

    .line 116
    :cond_2
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    const-string/jumbo v6, "right"

    .line 128
    .line 129
    .line 130
    move/from16 p2, v8

    .line 131
    .line 132
    const-string v8, "left"

    .line 133
    .line 134
    sparse-switch v15, :sswitch_data_0

    .line 135
    .line 136
    .line 137
    :goto_3
    const/4 v4, -0x1

    .line 138
    goto :goto_4

    .line 139
    :sswitch_0
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-nez v4, :cond_3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    const/4 v4, 0x7

    .line 147
    goto :goto_4

    .line 148
    :sswitch_1
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-nez v4, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    const/4 v4, 0x6

    .line 156
    goto :goto_4

    .line 157
    :sswitch_2
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-nez v4, :cond_5

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_5
    const/4 v4, 0x5

    .line 165
    goto :goto_4

    .line 166
    :sswitch_3
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-nez v4, :cond_6

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    const/4 v4, 0x4

    .line 174
    goto :goto_4

    .line 175
    :sswitch_4
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-nez v4, :cond_7

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    const/4 v4, 0x3

    .line 183
    goto :goto_4

    .line 184
    :sswitch_5
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_8

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_8
    const/4 v4, 0x2

    .line 192
    goto :goto_4

    .line 193
    :sswitch_6
    const-string v15, "circular"

    .line 194
    .line 195
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-nez v4, :cond_9

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_9
    const/4 v4, 0x1

    .line 203
    goto :goto_4

    .line 204
    :sswitch_7
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_a

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_a
    const/4 v4, 0x0

    .line 212
    :goto_4
    packed-switch v4, :pswitch_data_0

    .line 213
    .line 214
    .line 215
    :goto_5
    const/4 v4, 0x1

    .line 216
    const/4 v15, 0x2

    .line 217
    goto/16 :goto_d

    .line 218
    .line 219
    :pswitch_0
    move/from16 v0, v21

    .line 220
    .line 221
    :goto_6
    const/4 v4, 0x1

    .line 222
    const/4 v15, 0x2

    .line 223
    const/16 v20, 0x1

    .line 224
    .line 225
    goto/16 :goto_e

    .line 226
    .line 227
    :pswitch_1
    const/4 v0, 0x0

    .line 228
    goto :goto_6

    .line 229
    :pswitch_2
    const/4 v0, 0x1

    .line 230
    goto :goto_6

    .line 231
    :pswitch_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    sparse-switch v1, :sswitch_data_1

    .line 239
    .line 240
    .line 241
    :goto_7
    const/4 v1, -0x1

    .line 242
    goto :goto_8

    .line 243
    :sswitch_8
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_b

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    const/4 v1, 0x2

    .line 251
    goto :goto_8

    .line 252
    :sswitch_9
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-nez v1, :cond_c

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_c
    const/4 v1, 0x1

    .line 260
    goto :goto_8

    .line 261
    :sswitch_a
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_d

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_d
    const/4 v1, 0x0

    .line 269
    :goto_8
    packed-switch v1, :pswitch_data_1

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :pswitch_4
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :pswitch_5
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :pswitch_6
    invoke-virtual {v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToBaseline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :pswitch_7
    move/from16 v0, v18

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :pswitch_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    sparse-switch v1, :sswitch_data_2

    .line 303
    .line 304
    .line 305
    :goto_9
    const/4 v1, -0x1

    .line 306
    goto :goto_a

    .line 307
    :sswitch_b
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-nez v1, :cond_e

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_e
    const/4 v1, 0x2

    .line 315
    goto :goto_a

    .line 316
    :sswitch_c
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-nez v1, :cond_f

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_f
    const/4 v1, 0x1

    .line 324
    goto :goto_a

    .line 325
    :sswitch_d
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-nez v1, :cond_10

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_10
    const/4 v1, 0x0

    .line 333
    :goto_a
    packed-switch v1, :pswitch_data_2

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :pswitch_9
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :pswitch_a
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 342
    .line 343
    .line 344
    goto/16 :goto_5

    .line 345
    .line 346
    :pswitch_b
    invoke-virtual {v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBaseline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 354
    .line 355
    .line 356
    goto/16 :goto_5

    .line 357
    .line 358
    :pswitch_c
    const/4 v4, 0x1

    .line 359
    invoke-virtual {v7, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    invoke-virtual {v1, v11}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    const/4 v15, 0x2

    .line 372
    if-le v12, v15, :cond_11

    .line 373
    .line 374
    invoke-virtual {v7, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-virtual {v1, v7}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    invoke-static {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 383
    .line 384
    .line 385
    move-result v19

    .line 386
    :cond_11
    move/from16 v0, v19

    .line 387
    .line 388
    invoke-virtual {v3, v2, v11, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->circularConstraint(Ljava/lang/Object;FF)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 389
    .line 390
    .line 391
    goto :goto_d

    .line 392
    :pswitch_d
    const/4 v4, 0x1

    .line 393
    const/4 v15, 0x2

    .line 394
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    sparse-switch v1, :sswitch_data_3

    .line 402
    .line 403
    .line 404
    :goto_b
    const/4 v1, -0x1

    .line 405
    goto :goto_c

    .line 406
    :sswitch_e
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_12

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_12
    move v1, v15

    .line 414
    goto :goto_c

    .line 415
    :sswitch_f
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_13

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_13
    move v1, v4

    .line 423
    goto :goto_c

    .line 424
    :sswitch_10
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-nez v1, :cond_14

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_14
    const/4 v1, 0x0

    .line 432
    :goto_c
    packed-switch v1, :pswitch_data_3

    .line 433
    .line 434
    .line 435
    goto :goto_d

    .line 436
    :pswitch_e
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->baselineToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 444
    .line 445
    .line 446
    goto :goto_d

    .line 447
    :pswitch_f
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->baselineToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 455
    .line 456
    .line 457
    goto :goto_d

    .line 458
    :pswitch_10
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->baselineToBaseline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 473
    .line 474
    .line 475
    :goto_d
    move v0, v4

    .line 476
    const/16 v20, 0x0

    .line 477
    .line 478
    :goto_e
    if-eqz v20, :cond_1c

    .line 479
    .line 480
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    sparse-switch v1, :sswitch_data_4

    .line 488
    .line 489
    .line 490
    :goto_f
    const/16 v16, -0x1

    .line 491
    .line 492
    goto :goto_10

    .line 493
    :sswitch_11
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-nez v1, :cond_15

    .line 498
    .line 499
    goto :goto_f

    .line 500
    :cond_15
    const/16 v16, 0x3

    .line 501
    .line 502
    goto :goto_10

    .line 503
    :sswitch_12
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-nez v1, :cond_16

    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_16
    move/from16 v16, v15

    .line 511
    .line 512
    goto :goto_10

    .line 513
    :sswitch_13
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-nez v1, :cond_17

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_17
    move/from16 v16, v4

    .line 521
    .line 522
    goto :goto_10

    .line 523
    :sswitch_14
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    if-nez v1, :cond_18

    .line 528
    .line 529
    goto :goto_f

    .line 530
    :cond_18
    const/16 v16, 0x0

    .line 531
    .line 532
    :goto_10
    packed-switch v16, :pswitch_data_4

    .line 533
    .line 534
    .line 535
    :pswitch_11
    move v5, v4

    .line 536
    goto :goto_11

    .line 537
    :pswitch_12
    move/from16 v5, v21

    .line 538
    .line 539
    goto :goto_11

    .line 540
    :pswitch_13
    const/4 v5, 0x0

    .line 541
    goto :goto_11

    .line 542
    :pswitch_14
    move/from16 v5, v18

    .line 543
    .line 544
    :goto_11
    if-eqz v0, :cond_1a

    .line 545
    .line 546
    if-eqz v5, :cond_19

    .line 547
    .line 548
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->leftToLeft(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 549
    .line 550
    .line 551
    goto :goto_12

    .line 552
    :cond_19
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->leftToRight(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 553
    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_1a
    if-eqz v5, :cond_1b

    .line 557
    .line 558
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->rightToLeft(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 559
    .line 560
    .line 561
    goto :goto_12

    .line 562
    :cond_1b
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->rightToRight(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 563
    .line 564
    .line 565
    :cond_1c
    :goto_12
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->margin(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->marginGone(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :cond_1d
    move/from16 v20, v14

    .line 582
    .line 583
    const/16 v17, 0x2

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    if-eqz v1, :cond_26

    .line 590
    .line 591
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-eqz v2, :cond_1e

    .line 596
    .line 597
    sget-object v1, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 598
    .line 599
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    goto :goto_13

    .line 604
    :cond_1e
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    :goto_13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    sparse-switch v2, :sswitch_data_5

    .line 616
    .line 617
    .line 618
    :goto_14
    const/4 v8, -0x1

    .line 619
    goto :goto_15

    .line 620
    :sswitch_15
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    if-nez v2, :cond_1f

    .line 625
    .line 626
    goto :goto_14

    .line 627
    :cond_1f
    const/4 v8, 0x4

    .line 628
    goto :goto_15

    .line 629
    :sswitch_16
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-nez v2, :cond_20

    .line 634
    .line 635
    goto :goto_14

    .line 636
    :cond_20
    const/4 v8, 0x3

    .line 637
    goto :goto_15

    .line 638
    :sswitch_17
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    if-nez v2, :cond_21

    .line 643
    .line 644
    goto :goto_14

    .line 645
    :cond_21
    move/from16 v8, v17

    .line 646
    .line 647
    goto :goto_15

    .line 648
    :sswitch_18
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    if-nez v2, :cond_22

    .line 653
    .line 654
    goto :goto_14

    .line 655
    :cond_22
    move/from16 v8, v20

    .line 656
    .line 657
    goto :goto_15

    .line 658
    :sswitch_19
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-nez v2, :cond_23

    .line 663
    .line 664
    goto :goto_14

    .line 665
    :cond_23
    const/4 v8, 0x0

    .line 666
    :goto_15
    packed-switch v8, :pswitch_data_5

    .line 667
    .line 668
    .line 669
    goto :goto_16

    .line 670
    :pswitch_15
    if-nez v18, :cond_24

    .line 671
    .line 672
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->leftToLeft(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 673
    .line 674
    .line 675
    return-void

    .line 676
    :cond_24
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->rightToRight(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 677
    .line 678
    .line 679
    return-void

    .line 680
    :pswitch_16
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :pswitch_17
    if-nez v18, :cond_25

    .line 685
    .line 686
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->rightToRight(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 687
    .line 688
    .line 689
    return-void

    .line 690
    :cond_25
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->leftToLeft(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 691
    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_18
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 695
    .line 696
    .line 697
    return-void

    .line 698
    :pswitch_19
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/state/State;->baselineNeededFor(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->baselineToBaseline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 713
    .line 714
    .line 715
    :cond_26
    :goto_16
    return-void

    .line 716
    nop

    .line 717
    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_7
        -0x594af961 -> :sswitch_6
        -0x527265d5 -> :sswitch_5
        0x188db -> :sswitch_4
        0x1c155 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    :sswitch_data_1
    .sparse-switch
        -0x669119bb -> :sswitch_a
        -0x527265d5 -> :sswitch_9
        0x1c155 -> :sswitch_8
    .end sparse-switch

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    :sswitch_data_2
    .sparse-switch
        -0x669119bb -> :sswitch_d
        -0x527265d5 -> :sswitch_c
        0x1c155 -> :sswitch_b
    .end sparse-switch

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
    .line 806
    .line 807
    .line 808
    .line 809
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    :sswitch_data_3
    .sparse-switch
        -0x669119bb -> :sswitch_10
        -0x527265d5 -> :sswitch_f
        0x1c155 -> :sswitch_e
    .end sparse-switch

    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    :sswitch_data_4
    .sparse-switch
        0x188db -> :sswitch_14
        0x32a007 -> :sswitch_13
        0x677c21c -> :sswitch_12
        0x68ac462 -> :sswitch_11
    .end sparse-switch

    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_14
        :pswitch_11
        :pswitch_13
        :pswitch_12
    .end packed-switch

    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    :sswitch_data_5
    .sparse-switch
        -0x669119bb -> :sswitch_19
        -0x527265d5 -> :sswitch_18
        0x188db -> :sswitch_17
        0x1c155 -> :sswitch_16
        0x68ac462 -> :sswitch_15
    .end sparse-switch

    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch
.end method

.method public static parseConstraintSets(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_6

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getObject(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "Extends"

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-eqz v6, :cond_5

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_5

    .line 41
    .line 42
    invoke-interface {p0, v6}, Landroidx/constraintlayout/core/state/CoreMotionScene;->getConstraintSet(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v6}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    move v9, v2

    .line 65
    :cond_3
    :goto_1
    if-ge v9, v8, :cond_4

    .line 66
    .line 67
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    add-int/lit8 v9, v9, 0x1

    .line 72
    .line 73
    check-cast v10, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v5, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    instance-of v12, v11, Landroidx/constraintlayout/core/parser/CLObject;

    .line 80
    .line 81
    if-eqz v12, :cond_3

    .line 82
    .line 83
    check-cast v11, Landroidx/constraintlayout/core/parser/CLObject;

    .line 84
    .line 85
    invoke-static {v6, v10, v11}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->override(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLObject;->toJSON()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-interface {p0, v4, v5}, Landroidx/constraintlayout/core/state/CoreMotionScene;->setConstraintSetContent(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLObject;->toJSON()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {p0, v4, v5}, Landroidx/constraintlayout/core/state/CoreMotionScene;->setConstraintSetContent(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    :goto_2
    return-void
.end method

.method public static parseCustomProperties(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/ConstraintReference;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :cond_2
    :goto_0
    if-ge v1, v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {p1, v2, v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->addCustomFloat(Ljava/lang/String;F)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLString;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    const-wide/16 v5, -0x1

    .line 59
    .line 60
    cmp-long v5, v3, v5

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    long-to-int v3, v3

    .line 65
    invoke-virtual {p1, v2, v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->addCustomColor(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_1
    return-void
.end method

.method public static parseDesignElementsJSON(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_6

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v2, "Design"

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    instance-of v2, p0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    check-cast p0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move v3, v1

    .line 54
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ge v3, v4, :cond_6

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 71
    .line 72
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 73
    .line 74
    const-string v7, "element found "

    .line 75
    .line 76
    const-string v8, ""

    .line 77
    .line 78
    invoke-static {v7, v4, v8}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-array v7, v1, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v6, v4, v7}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 85
    .line 86
    .line 87
    const-string/jumbo v4, "type"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    new-instance v6, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    move v8, v1

    .line 106
    :goto_1
    if-ge v8, v7, :cond_4

    .line 107
    .line 108
    invoke-virtual {v5, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    check-cast v9, Landroidx/constraintlayout/core/parser/CLKey;

    .line 113
    .line 114
    invoke-virtual {v9}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v9}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-virtual {v9}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    invoke-virtual {v6, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    new-instance v5, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;

    .line 135
    .line 136
    invoke-direct {v5, v0, v4, v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_6
    :goto_2
    return-void
.end method

.method public static parseDimension(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/CorePixelDp;)Landroidx/constraintlayout/core/state/Dimension;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, v0, Landroidx/constraintlayout/core/parser/CLString;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseDimensionMode(Ljava/lang/String;)Landroidx/constraintlayout/core/state/Dimension;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    instance-of v2, v0, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-interface {p3, p0}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/State;->convertDimension(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    instance-of p0, v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 49
    .line 50
    if-eqz p0, :cond_6

    .line 51
    .line 52
    check-cast v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 53
    .line 54
    const-string/jumbo p0, "value"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    invoke-static {p0}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseDimensionMode(Ljava/lang/String;)Landroidx/constraintlayout/core/state/Dimension;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_2
    const-string p0, "min"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    instance-of p1, p0, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    check-cast p0, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLNumber;->getFloat()F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-interface {p3, p0}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/State;->convertDimension(Ljava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    instance-of p0, p0, Landroidx/constraintlayout/core/parser/CLString;

    .line 102
    .line 103
    if-eqz p0, :cond_4

    .line 104
    .line 105
    sget-object p0, Landroidx/constraintlayout/core/state/Dimension;->WRAP_DIMENSION:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/core/state/Dimension;->min(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/Dimension;

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_0
    const-string p0, "max"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_6

    .line 117
    .line 118
    instance-of p1, p0, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    check-cast p0, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLNumber;->getFloat()F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-interface {p3, p0}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/core/state/State;->convertDimension(Ljava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/core/state/Dimension;->max(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_5
    instance-of p0, p0, Landroidx/constraintlayout/core/parser/CLString;

    .line 145
    .line 146
    if-eqz p0, :cond_6

    .line 147
    .line 148
    sget-object p0, Landroidx/constraintlayout/core/state/Dimension;->WRAP_DIMENSION:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/core/state/Dimension;->max(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/Dimension;

    .line 151
    .line 152
    .line 153
    :cond_6
    return-object v1
.end method

.method public static parseDimensionMode(Ljava/lang/String;)Landroidx/constraintlayout/core/state/Dimension;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    sparse-switch v2, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string/jumbo v2, "wrap"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x3

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string/jumbo v2, "spread"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    const-string v2, "parent"

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v3, 0x1

    .line 52
    goto :goto_0

    .line 53
    :sswitch_3
    const-string v2, "preferWrap"

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move v3, v0

    .line 63
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    const-string v2, "%"

    .line 67
    .line 68
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const/16 v1, 0x25

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    const/high16 v1, 0x42c80000    # 100.0f

    .line 89
    .line 90
    div-float/2addr p0, v1

    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, p0}, Landroidx/constraintlayout/core/state/Dimension;->createPercent(Ljava/lang/Object;F)Landroidx/constraintlayout/core/state/Dimension;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/state/Dimension;->suggested(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_4
    const-string v0, ":"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-static {p0}, Landroidx/constraintlayout/core/state/Dimension;->createRatio(Ljava/lang/String;)Landroidx/constraintlayout/core/state/Dimension;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object v0, Landroidx/constraintlayout/core/state/Dimension;->SPREAD_DIMENSION:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/state/Dimension;->suggested(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/Dimension;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_5
    return-object v1

    .line 124
    :pswitch_0
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_1
    sget-object p0, Landroidx/constraintlayout/core/state/Dimension;->SPREAD_DIMENSION:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {p0}, Landroidx/constraintlayout/core/state/Dimension;->createSuggested(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/Dimension;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_2
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createParent()Landroidx/constraintlayout/core/state/Dimension;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_3
    sget-object p0, Landroidx/constraintlayout/core/state/Dimension;->WRAP_DIMENSION:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {p0}, Landroidx/constraintlayout/core/state/Dimension;->createSuggested(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/Dimension;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :sswitch_data_0
    .sparse-switch
        -0x57099186 -> :sswitch_3
        -0x3b54f756 -> :sswitch_2
        -0x35630e8d -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static parseFlowType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/high16 v3, 0x3f000000    # 0.5f

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object/from16 v6, p0

    .line 15
    .line 16
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/16 v7, 0x76

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    if-ne v6, v7, :cond_0

    .line 24
    .line 25
    move v6, v8

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v6, v5

    .line 28
    :goto_0
    invoke-virtual {v0, v1, v6}, Landroidx/constraintlayout/core/state/State;->getFlow(Ljava/lang/Object;Z)Landroidx/constraintlayout/core/state/helpers/FlowReference;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    move v10, v5

    .line 41
    :goto_1
    if-ge v10, v9, :cond_2d

    .line 42
    .line 43
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    add-int/lit8 v10, v10, 0x1

    .line 48
    .line 49
    check-cast v11, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    const/4 v15, 0x3

    .line 59
    move/from16 v16, v3

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    sparse-switch v12, :sswitch_data_0

    .line 63
    .line 64
    .line 65
    :goto_2
    const/4 v12, -0x1

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :sswitch_0
    const-string/jumbo v12, "wrap"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    if-nez v12, :cond_1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    const/16 v12, 0xc

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :sswitch_1
    const-string/jumbo v12, "vGap"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-nez v12, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/16 v12, 0xb

    .line 93
    .line 94
    goto/16 :goto_3

    .line 95
    .line 96
    :sswitch_2
    const-string/jumbo v12, "type"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-nez v12, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const/16 v12, 0xa

    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :sswitch_3
    const-string v12, "hGap"

    .line 111
    .line 112
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-nez v12, :cond_4

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    const/16 v12, 0x9

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :sswitch_4
    const-string v12, "maxElement"

    .line 124
    .line 125
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    const/16 v12, 0x8

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :sswitch_5
    const-string v12, "contains"

    .line 137
    .line 138
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-nez v12, :cond_6

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const/4 v12, 0x7

    .line 146
    goto :goto_3

    .line 147
    :sswitch_6
    const-string/jumbo v12, "vFlowBias"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-nez v12, :cond_7

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    const/4 v12, 0x6

    .line 158
    goto :goto_3

    .line 159
    :sswitch_7
    const-string v12, "padding"

    .line 160
    .line 161
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-nez v12, :cond_8

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    const/4 v12, 0x5

    .line 169
    goto :goto_3

    .line 170
    :sswitch_8
    const-string/jumbo v12, "vStyle"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-nez v12, :cond_9

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_9
    const/4 v12, 0x4

    .line 181
    goto :goto_3

    .line 182
    :sswitch_9
    const-string/jumbo v12, "vAlign"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-nez v12, :cond_a

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    move v12, v15

    .line 193
    goto :goto_3

    .line 194
    :sswitch_a
    const-string v12, "hFlowBias"

    .line 195
    .line 196
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-nez v12, :cond_b

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :cond_b
    move v12, v3

    .line 205
    goto :goto_3

    .line 206
    :sswitch_b
    const-string v12, "hStyle"

    .line 207
    .line 208
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    if-nez v12, :cond_c

    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_c
    move v12, v8

    .line 217
    goto :goto_3

    .line 218
    :sswitch_c
    const-string v12, "hAlign"

    .line 219
    .line 220
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    if-nez v12, :cond_d

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :cond_d
    move v12, v5

    .line 229
    :goto_3
    const-string v14, ""

    .line 230
    .line 231
    packed-switch v12, :pswitch_data_0

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {p1 .. p2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    move-object/from16 v12, p3

    .line 239
    .line 240
    invoke-static {v0, v12, v3, v2, v11}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->applyAttribute(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_e
    :goto_4
    move v11, v8

    .line 244
    move v8, v5

    .line 245
    goto/16 :goto_16

    .line 246
    .line 247
    :pswitch_0
    move-object/from16 v12, p3

    .line 248
    .line 249
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-static {v3}, Landroidx/constraintlayout/core/state/State$Wrap;->getValueByString(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setWrapMode(I)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :pswitch_1
    move-object/from16 v12, p3

    .line 266
    .line 267
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalGap(I)V

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :pswitch_2
    move-object/from16 v12, p3

    .line 280
    .line 281
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    const-string v11, "hFlow"

    .line 290
    .line 291
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_f

    .line 296
    .line 297
    invoke-virtual {v6, v5}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setOrientation(I)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_f
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setOrientation(I)V

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :pswitch_3
    move-object/from16 v12, p3

    .line 306
    .line 307
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setHorizontalGap(I)V

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :pswitch_4
    move-object/from16 v12, p3

    .line 320
    .line 321
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setMaxElementsWrap(I)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :pswitch_5
    move-object/from16 v12, p3

    .line 334
    .line 335
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    instance-of v14, v11, Landroidx/constraintlayout/core/parser/CLArray;

    .line 340
    .line 341
    if-eqz v14, :cond_16

    .line 342
    .line 343
    move-object v14, v11

    .line 344
    check-cast v14, Landroidx/constraintlayout/core/parser/CLArray;

    .line 345
    .line 346
    invoke-virtual {v14}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 347
    .line 348
    .line 349
    move-result v13

    .line 350
    if-ge v13, v8, :cond_10

    .line 351
    .line 352
    goto/16 :goto_a

    .line 353
    .line 354
    :cond_10
    move v11, v5

    .line 355
    :goto_5
    invoke-virtual {v14}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    if-ge v11, v13, :cond_e

    .line 360
    .line 361
    invoke-virtual {v14, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    instance-of v8, v13, Landroidx/constraintlayout/core/parser/CLArray;

    .line 366
    .line 367
    if-eqz v8, :cond_14

    .line 368
    .line 369
    check-cast v13, Landroidx/constraintlayout/core/parser/CLArray;

    .line 370
    .line 371
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    if-lez v8, :cond_15

    .line 376
    .line 377
    invoke-virtual {v13, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    invoke-virtual {v8}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    const/high16 v17, 0x7fc00000    # Float.NaN

    .line 390
    .line 391
    if-eq v5, v3, :cond_13

    .line 392
    .line 393
    if-eq v5, v15, :cond_12

    .line 394
    .line 395
    const/4 v15, 0x4

    .line 396
    if-eq v5, v15, :cond_11

    .line 397
    .line 398
    move/from16 v3, v17

    .line 399
    .line 400
    move v5, v3

    .line 401
    :goto_6
    move v15, v5

    .line 402
    goto :goto_8

    .line 403
    :cond_11
    const/4 v5, 0x1

    .line 404
    invoke-virtual {v13, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 405
    .line 406
    .line 407
    move-result v17

    .line 408
    invoke-virtual {v13, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 409
    .line 410
    .line 411
    move-result v15

    .line 412
    invoke-static {v0, v15}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    const/4 v3, 0x3

    .line 417
    invoke-virtual {v13, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    invoke-static {v0, v13}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    move v5, v3

    .line 426
    :goto_7
    move/from16 v3, v17

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_12
    const/4 v5, 0x1

    .line 430
    invoke-virtual {v13, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 431
    .line 432
    .line 433
    move-result v17

    .line 434
    const/4 v3, 0x2

    .line 435
    invoke-virtual {v13, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 436
    .line 437
    .line 438
    move-result v13

    .line 439
    invoke-static {v0, v13}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    move v5, v3

    .line 444
    move v15, v5

    .line 445
    goto :goto_7

    .line 446
    :cond_13
    const/4 v5, 0x1

    .line 447
    invoke-virtual {v13, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    move/from16 v5, v17

    .line 452
    .line 453
    goto :goto_6

    .line 454
    :goto_8
    invoke-virtual {v6, v8, v3, v15, v5}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->addFlowElement(Ljava/lang/String;FFF)V

    .line 455
    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_14
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 467
    .line 468
    .line 469
    :cond_15
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 470
    .line 471
    const/4 v3, 0x2

    .line 472
    const/4 v5, 0x0

    .line 473
    const/4 v8, 0x1

    .line 474
    const/4 v15, 0x3

    .line 475
    goto :goto_5

    .line 476
    :cond_16
    :goto_a
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 477
    .line 478
    const-string v2, " contains should be an array \""

    .line 479
    .line 480
    invoke-static {v1, v2}, Landroid/support/v4/media/f;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    const-string v2, "\""

    .line 492
    .line 493
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :pswitch_6
    move-object/from16 v12, p3

    .line 505
    .line 506
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    instance-of v5, v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 511
    .line 512
    if-eqz v5, :cond_18

    .line 513
    .line 514
    move-object v5, v3

    .line 515
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 516
    .line 517
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    const/4 v11, 0x1

    .line 522
    if-le v8, v11, :cond_18

    .line 523
    .line 524
    const/4 v8, 0x0

    .line 525
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-virtual {v5, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 542
    .line 543
    .line 544
    move-result v11

    .line 545
    const/4 v13, 0x2

    .line 546
    if-le v11, v13, :cond_17

    .line 547
    .line 548
    invoke-virtual {v5, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 549
    .line 550
    .line 551
    move-result v5

    .line 552
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 553
    .line 554
    .line 555
    move-result-object v5

    .line 556
    goto :goto_b

    .line 557
    :cond_17
    move-object v5, v4

    .line 558
    goto :goto_b

    .line 559
    :cond_18
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    move-object v3, v4

    .line 568
    move-object v5, v3

    .line 569
    :goto_b
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 570
    .line 571
    .line 572
    move-result v8

    .line 573
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/ConstraintReference;->verticalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    cmpl-float v8, v8, v16

    .line 581
    .line 582
    if-eqz v8, :cond_19

    .line 583
    .line 584
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 585
    .line 586
    .line 587
    move-result v3

    .line 588
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setFirstVerticalBias(F)V

    .line 589
    .line 590
    .line 591
    :cond_19
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    cmpl-float v3, v3, v16

    .line 596
    .line 597
    if-eqz v3, :cond_1a

    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setLastVerticalBias(F)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 604
    .line 605
    .line 606
    :catch_0
    :cond_1a
    :goto_c
    const/4 v8, 0x0

    .line 607
    :goto_d
    const/4 v11, 0x1

    .line 608
    goto/16 :goto_16

    .line 609
    .line 610
    :pswitch_7
    move-object/from16 v12, p3

    .line 611
    .line 612
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    instance-of v5, v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 617
    .line 618
    if-eqz v5, :cond_1c

    .line 619
    .line 620
    move-object v5, v3

    .line 621
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 622
    .line 623
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 624
    .line 625
    .line 626
    move-result v8

    .line 627
    const/4 v11, 0x1

    .line 628
    if-le v8, v11, :cond_1c

    .line 629
    .line 630
    const/4 v8, 0x0

    .line 631
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 632
    .line 633
    .line 634
    move-result v13

    .line 635
    int-to-float v8, v13

    .line 636
    invoke-virtual {v5, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 637
    .line 638
    .line 639
    move-result v13

    .line 640
    int-to-float v11, v13

    .line 641
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 642
    .line 643
    .line 644
    move-result v13

    .line 645
    const/4 v14, 0x2

    .line 646
    if-le v13, v14, :cond_1b

    .line 647
    .line 648
    invoke-virtual {v5, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    int-to-float v5, v5

    .line 653
    :try_start_1
    check-cast v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 654
    .line 655
    const/4 v13, 0x3

    .line 656
    invoke-virtual {v3, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 657
    .line 658
    .line 659
    move-result v3
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 660
    int-to-float v3, v3

    .line 661
    goto :goto_e

    .line 662
    :catch_1
    const/4 v3, 0x0

    .line 663
    goto :goto_e

    .line 664
    :cond_1b
    move v5, v8

    .line 665
    move v3, v11

    .line 666
    goto :goto_e

    .line 667
    :cond_1c
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    int-to-float v8, v3

    .line 672
    move v3, v8

    .line 673
    move v5, v3

    .line 674
    move v11, v5

    .line 675
    :goto_e
    invoke-static {v0, v8}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 676
    .line 677
    .line 678
    move-result v8

    .line 679
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 680
    .line 681
    .line 682
    move-result v8

    .line 683
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setPaddingLeft(I)V

    .line 684
    .line 685
    .line 686
    invoke-static {v0, v11}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 691
    .line 692
    .line 693
    move-result v8

    .line 694
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setPaddingTop(I)V

    .line 695
    .line 696
    .line 697
    invoke-static {v0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 698
    .line 699
    .line 700
    move-result v5

    .line 701
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    invoke-virtual {v6, v5}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setPaddingRight(I)V

    .line 706
    .line 707
    .line 708
    invoke-static {v0, v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setPaddingBottom(I)V

    .line 717
    .line 718
    .line 719
    goto :goto_c

    .line 720
    :pswitch_8
    move-object/from16 v12, p3

    .line 721
    .line 722
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    instance-of v5, v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 727
    .line 728
    if-eqz v5, :cond_1e

    .line 729
    .line 730
    move-object v5, v3

    .line 731
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 732
    .line 733
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 734
    .line 735
    .line 736
    move-result v8

    .line 737
    const/4 v11, 0x1

    .line 738
    if-le v8, v11, :cond_1e

    .line 739
    .line 740
    const/4 v8, 0x0

    .line 741
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    invoke-virtual {v5, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 750
    .line 751
    .line 752
    move-result v11

    .line 753
    const/4 v13, 0x2

    .line 754
    if-le v11, v13, :cond_1d

    .line 755
    .line 756
    invoke-virtual {v5, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    goto :goto_f

    .line 761
    :cond_1d
    move-object v5, v14

    .line 762
    goto :goto_f

    .line 763
    :cond_1e
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v8

    .line 767
    move-object v3, v14

    .line 768
    move-object v5, v3

    .line 769
    :goto_f
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    if-nez v11, :cond_1f

    .line 774
    .line 775
    invoke-static {v8}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 776
    .line 777
    .line 778
    move-result v8

    .line 779
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalStyle(I)V

    .line 780
    .line 781
    .line 782
    :cond_1f
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v8

    .line 786
    if-nez v8, :cond_20

    .line 787
    .line 788
    invoke-static {v3}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 789
    .line 790
    .line 791
    move-result v3

    .line 792
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setFirstVerticalStyle(I)V

    .line 793
    .line 794
    .line 795
    :cond_20
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-nez v3, :cond_1a

    .line 800
    .line 801
    invoke-static {v5}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setLastVerticalStyle(I)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_c

    .line 809
    .line 810
    :pswitch_9
    move-object/from16 v12, p3

    .line 811
    .line 812
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    sparse-switch v5, :sswitch_data_1

    .line 828
    .line 829
    .line 830
    :goto_10
    const/4 v14, -0x1

    .line 831
    goto :goto_11

    .line 832
    :sswitch_d
    const-string/jumbo v5, "top"

    .line 833
    .line 834
    .line 835
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    if-nez v3, :cond_21

    .line 840
    .line 841
    goto :goto_10

    .line 842
    :cond_21
    const/4 v14, 0x2

    .line 843
    goto :goto_11

    .line 844
    :sswitch_e
    const-string v5, "bottom"

    .line 845
    .line 846
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v3

    .line 850
    if-nez v3, :cond_22

    .line 851
    .line 852
    goto :goto_10

    .line 853
    :cond_22
    const/4 v14, 0x1

    .line 854
    goto :goto_11

    .line 855
    :sswitch_f
    const-string v5, "baseline"

    .line 856
    .line 857
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    if-nez v3, :cond_23

    .line 862
    .line 863
    goto :goto_10

    .line 864
    :cond_23
    const/4 v14, 0x0

    .line 865
    :goto_11
    packed-switch v14, :pswitch_data_1

    .line 866
    .line 867
    .line 868
    const/4 v13, 0x2

    .line 869
    invoke-virtual {v6, v13}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalAlign(I)V

    .line 870
    .line 871
    .line 872
    :goto_12
    const/4 v5, 0x1

    .line 873
    goto :goto_13

    .line 874
    :pswitch_a
    const/4 v8, 0x0

    .line 875
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalAlign(I)V

    .line 876
    .line 877
    .line 878
    goto :goto_12

    .line 879
    :pswitch_b
    const/4 v5, 0x1

    .line 880
    invoke-virtual {v6, v5}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalAlign(I)V

    .line 881
    .line 882
    .line 883
    goto :goto_13

    .line 884
    :pswitch_c
    const/4 v5, 0x1

    .line 885
    const/4 v13, 0x3

    .line 886
    invoke-virtual {v6, v13}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setVerticalAlign(I)V

    .line 887
    .line 888
    .line 889
    :goto_13
    move v11, v5

    .line 890
    const/4 v8, 0x0

    .line 891
    goto/16 :goto_16

    .line 892
    .line 893
    :pswitch_d
    move-object/from16 v12, p3

    .line 894
    .line 895
    move v5, v8

    .line 896
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    instance-of v8, v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 901
    .line 902
    if-eqz v8, :cond_25

    .line 903
    .line 904
    move-object v8, v3

    .line 905
    check-cast v8, Landroidx/constraintlayout/core/parser/CLArray;

    .line 906
    .line 907
    invoke-virtual {v8}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 908
    .line 909
    .line 910
    move-result v11

    .line 911
    if-le v11, v5, :cond_25

    .line 912
    .line 913
    const/4 v11, 0x0

    .line 914
    invoke-virtual {v8, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 915
    .line 916
    .line 917
    move-result v3

    .line 918
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    invoke-virtual {v8, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 923
    .line 924
    .line 925
    move-result v11

    .line 926
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 927
    .line 928
    .line 929
    move-result-object v5

    .line 930
    invoke-virtual {v8}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 931
    .line 932
    .line 933
    move-result v11

    .line 934
    const/4 v13, 0x2

    .line 935
    if-le v11, v13, :cond_24

    .line 936
    .line 937
    invoke-virtual {v8, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 938
    .line 939
    .line 940
    move-result v8

    .line 941
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 942
    .line 943
    .line 944
    move-result-object v8

    .line 945
    goto :goto_14

    .line 946
    :cond_24
    move-object v8, v4

    .line 947
    goto :goto_14

    .line 948
    :cond_25
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 953
    .line 954
    .line 955
    move-result-object v5

    .line 956
    move-object v3, v4

    .line 957
    move-object v8, v3

    .line 958
    :goto_14
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 959
    .line 960
    .line 961
    move-result v5

    .line 962
    invoke-virtual {v6, v5}, Landroidx/constraintlayout/core/state/ConstraintReference;->horizontalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 966
    .line 967
    .line 968
    move-result v5

    .line 969
    cmpl-float v5, v5, v16

    .line 970
    .line 971
    if-eqz v5, :cond_26

    .line 972
    .line 973
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setFirstHorizontalBias(F)V

    .line 978
    .line 979
    .line 980
    :cond_26
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 981
    .line 982
    .line 983
    move-result v3

    .line 984
    cmpl-float v3, v3, v16

    .line 985
    .line 986
    if-eqz v3, :cond_1a

    .line 987
    .line 988
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setLastHorizontalBias(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 993
    .line 994
    .line 995
    goto/16 :goto_c

    .line 996
    .line 997
    :pswitch_e
    move-object/from16 v12, p3

    .line 998
    .line 999
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    instance-of v5, v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 1004
    .line 1005
    if-eqz v5, :cond_28

    .line 1006
    .line 1007
    move-object v5, v3

    .line 1008
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 1009
    .line 1010
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 1011
    .line 1012
    .line 1013
    move-result v8

    .line 1014
    const/4 v11, 0x1

    .line 1015
    if-le v8, v11, :cond_28

    .line 1016
    .line 1017
    const/4 v8, 0x0

    .line 1018
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v3

    .line 1022
    invoke-virtual {v5, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v8

    .line 1026
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 1027
    .line 1028
    .line 1029
    move-result v11

    .line 1030
    const/4 v13, 0x2

    .line 1031
    if-le v11, v13, :cond_27

    .line 1032
    .line 1033
    invoke-virtual {v5, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v5

    .line 1037
    goto :goto_15

    .line 1038
    :cond_27
    move-object v5, v14

    .line 1039
    goto :goto_15

    .line 1040
    :cond_28
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v8

    .line 1044
    move-object v3, v14

    .line 1045
    move-object v5, v3

    .line 1046
    :goto_15
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v11

    .line 1050
    if-nez v11, :cond_29

    .line 1051
    .line 1052
    invoke-static {v8}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 1053
    .line 1054
    .line 1055
    move-result v8

    .line 1056
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setHorizontalStyle(I)V

    .line 1057
    .line 1058
    .line 1059
    :cond_29
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v8

    .line 1063
    if-nez v8, :cond_2a

    .line 1064
    .line 1065
    invoke-static {v3}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setFirstHorizontalStyle(I)V

    .line 1070
    .line 1071
    .line 1072
    :cond_2a
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v3

    .line 1076
    if-nez v3, :cond_1a

    .line 1077
    .line 1078
    invoke-static {v5}, Landroidx/constraintlayout/core/state/State$Chain;->getValueByString(Ljava/lang/String;)I

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setLastHorizontalStyle(I)V

    .line 1083
    .line 1084
    .line 1085
    goto/16 :goto_c

    .line 1086
    .line 1087
    :pswitch_f
    move-object/from16 v12, p3

    .line 1088
    .line 1089
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    const-string v5, "end"

    .line 1101
    .line 1102
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v5

    .line 1106
    if-nez v5, :cond_2c

    .line 1107
    .line 1108
    const-string/jumbo v5, "start"

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v3

    .line 1115
    if-nez v3, :cond_2b

    .line 1116
    .line 1117
    const/4 v13, 0x2

    .line 1118
    invoke-virtual {v6, v13}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setHorizontalAlign(I)V

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_c

    .line 1122
    .line 1123
    :cond_2b
    const/4 v8, 0x0

    .line 1124
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setHorizontalAlign(I)V

    .line 1125
    .line 1126
    .line 1127
    goto/16 :goto_d

    .line 1128
    .line 1129
    :cond_2c
    const/4 v8, 0x0

    .line 1130
    const/4 v11, 0x1

    .line 1131
    invoke-virtual {v6, v11}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->setHorizontalAlign(I)V

    .line 1132
    .line 1133
    .line 1134
    :goto_16
    move v5, v8

    .line 1135
    move v8, v11

    .line 1136
    move/from16 v3, v16

    .line 1137
    .line 1138
    goto/16 :goto_1

    .line 1139
    .line 1140
    :cond_2d
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4ac15883 -> :sswitch_c
        -0x49bfd1d7 -> :sswitch_b
        -0x47693271 -> :sswitch_a
        -0x32dd7fd1 -> :sswitch_9
        -0x31dbf925 -> :sswitch_8
        -0x300fc3ef -> :sswitch_7
        -0x2bab2063 -> :sswitch_6
        -0x21d289e1 -> :sswitch_5
        -0x1d240708 -> :sswitch_4
        0x305d4e -> :sswitch_3
        0x368f3a -> :sswitch_2
        0x36ba80 -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
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

    :sswitch_data_1
    .sparse-switch
        -0x669119bb -> :sswitch_f
        -0x527265d5 -> :sswitch_e
        0x1c155 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static parseGenerate(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :cond_1
    if-ge v3, v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {p1, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->getList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    instance-of v6, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    move v7, v2

    .line 43
    :goto_0
    if-ge v7, v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    add-int/lit8 v7, v7, 0x1

    .line 50
    .line 51
    check-cast v8, Ljava/lang/String;

    .line 52
    .line 53
    move-object v9, v5

    .line 54
    check-cast v9, Landroidx/constraintlayout/core/parser/CLObject;

    .line 55
    .line 56
    invoke-static {p0, p1, v8, v9}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseWidget(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    :goto_1
    return-void
.end method

.method private static parseGridType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p0}, Landroidx/constraintlayout/core/state/State;->getGrid(Ljava/lang/Object;Ljava/lang/String;)Landroidx/constraintlayout/core/state/helpers/GridReference;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p4}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_11

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    check-cast v4, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x2

    .line 34
    const/4 v8, 0x1

    .line 35
    const/4 v9, -0x1

    .line 36
    sparse-switch v5, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :sswitch_0
    const-string v5, "columnWeights"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_1
    const/16 v9, 0xb

    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :sswitch_1
    const-string v5, "columns"

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_2

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_2
    const/16 v9, 0xa

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :sswitch_2
    const-string/jumbo v5, "rowWeights"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    goto/16 :goto_1

    .line 79
    .line 80
    :cond_3
    const/16 v9, 0x9

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :sswitch_3
    const-string/jumbo v5, "spans"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_4

    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_4
    const/16 v9, 0x8

    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :sswitch_4
    const-string/jumbo v5, "skips"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/4 v9, 0x7

    .line 110
    goto :goto_1

    .line 111
    :sswitch_5
    const-string v5, "flags"

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    const/4 v9, 0x6

    .line 121
    goto :goto_1

    .line 122
    :sswitch_6
    const-string/jumbo v5, "vGap"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_7

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    const/4 v9, 0x5

    .line 133
    goto :goto_1

    .line 134
    :sswitch_7
    const-string/jumbo v5, "rows"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-nez v5, :cond_8

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_8
    const/4 v9, 0x4

    .line 145
    goto :goto_1

    .line 146
    :sswitch_8
    const-string v5, "hGap"

    .line 147
    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-nez v5, :cond_9

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_9
    move v9, v6

    .line 156
    goto :goto_1

    .line 157
    :sswitch_9
    const-string v5, "contains"

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-nez v5, :cond_a

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    move v9, v7

    .line 167
    goto :goto_1

    .line 168
    :sswitch_a
    const-string v5, "padding"

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_b

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_b
    move v9, v8

    .line 178
    goto :goto_1

    .line 179
    :sswitch_b
    const-string v5, "orientation"

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_c

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_c
    move v9, v2

    .line 189
    :goto_1
    const-string v5, ":"

    .line 190
    .line 191
    const-string v10, ","

    .line 192
    .line 193
    packed-switch v9, :pswitch_data_0

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-static {p1, p3, v5, p4, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->applyAttribute(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :pswitch_0
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    if-eqz v4, :cond_0

    .line 214
    .line 215
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_0

    .line 220
    .line 221
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setColumnWeights(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :pswitch_1
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-lez v4, :cond_0

    .line 235
    .line 236
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setColumnsSet(I)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :pswitch_2
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-eqz v4, :cond_0

    .line 250
    .line 251
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_0

    .line 256
    .line 257
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setRowWeights(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :pswitch_3
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    if-eqz v4, :cond_0

    .line 271
    .line 272
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    if-eqz v5, :cond_0

    .line 277
    .line 278
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setSpans(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :pswitch_4
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    if-eqz v4, :cond_0

    .line 292
    .line 293
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_0

    .line 298
    .line 299
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setSkips(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :pswitch_5
    const-string v5, ""

    .line 305
    .line 306
    :try_start_0
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    instance-of v6, v4, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 311
    .line 312
    if-eqz v6, :cond_d

    .line 313
    .line 314
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    goto :goto_4

    .line 319
    :catch_0
    move-exception v4

    .line 320
    goto :goto_2

    .line 321
    :cond_d
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    goto :goto_3

    .line 326
    :goto_2
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 327
    .line 328
    new-instance v7, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    const-string v8, "Error parsing grid flags "

    .line 331
    .line 332
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v6, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :goto_3
    move v4, v2

    .line 346
    :goto_4
    if-eqz v5, :cond_e

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-nez v6, :cond_e

    .line 353
    .line 354
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setFlags(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :cond_e
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setFlags(I)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_0

    .line 363
    .line 364
    :pswitch_6
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    invoke-static {p1, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setVerticalGaps(F)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :pswitch_7
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-lez v4, :cond_0

    .line 390
    .line 391
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setRowsSet(I)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :pswitch_8
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    invoke-static {p1, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setHorizontalGaps(F)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_0

    .line 412
    .line 413
    :pswitch_9
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    if-eqz v4, :cond_0

    .line 418
    .line 419
    move v5, v2

    .line 420
    :goto_5
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-ge v5, v6, :cond_0

    .line 425
    .line 426
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    invoke-virtual {p1, v6}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 443
    .line 444
    .line 445
    add-int/lit8 v5, v5, 0x1

    .line 446
    .line 447
    goto :goto_5

    .line 448
    :pswitch_a
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    instance-of v5, v4, Landroidx/constraintlayout/core/parser/CLArray;

    .line 453
    .line 454
    if-eqz v5, :cond_10

    .line 455
    .line 456
    move-object v5, v4

    .line 457
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 458
    .line 459
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 460
    .line 461
    .line 462
    move-result v9

    .line 463
    if-le v9, v8, :cond_10

    .line 464
    .line 465
    invoke-virtual {v5, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    int-to-float v9, v9

    .line 470
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    int-to-float v8, v8

    .line 475
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 476
    .line 477
    .line 478
    move-result v10

    .line 479
    if-le v10, v7, :cond_f

    .line 480
    .line 481
    invoke-virtual {v5, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    int-to-float v5, v5

    .line 486
    :try_start_1
    check-cast v4, Landroidx/constraintlayout/core/parser/CLArray;

    .line 487
    .line 488
    invoke-virtual {v4, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 489
    .line 490
    .line 491
    move-result v4
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 492
    int-to-float v4, v4

    .line 493
    goto :goto_6

    .line 494
    :catch_1
    const/4 v4, 0x0

    .line 495
    goto :goto_6

    .line 496
    :cond_f
    move v4, v8

    .line 497
    move v5, v9

    .line 498
    goto :goto_6

    .line 499
    :cond_10
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    int-to-float v9, v4

    .line 504
    move v4, v9

    .line 505
    move v5, v4

    .line 506
    move v8, v5

    .line 507
    :goto_6
    invoke-static {p1, v9}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setPaddingStart(I)V

    .line 516
    .line 517
    .line 518
    invoke-static {p1, v8}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setPaddingTop(I)V

    .line 527
    .line 528
    .line 529
    invoke-static {p1, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setPaddingEnd(I)V

    .line 538
    .line 539
    .line 540
    invoke-static {p1, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setPaddingBottom(I)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_0

    .line 552
    .line 553
    :pswitch_b
    invoke-virtual {p4, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/helpers/GridReference;->setOrientation(I)V

    .line 562
    .line 563
    .line 564
    goto/16 :goto_0

    .line 565
    .line 566
    :cond_11
    return-void

    .line 567
    :sswitch_data_0
    .sparse-switch
        -0x55cd0a30 -> :sswitch_b
        -0x300fc3ef -> :sswitch_a
        -0x21d289e1 -> :sswitch_9
        0x305d4e -> :sswitch_8
        0x3581d9 -> :sswitch_7
        0x36ba80 -> :sswitch_6
        0x5cfee87 -> :sswitch_5
        0x686cad4 -> :sswitch_4
        0x688f269 -> :sswitch_3
        0x89c01c1 -> :sswitch_2
        0x389b97dd -> :sswitch_1
        0x793284c5 -> :sswitch_0
    .end sparse-switch

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    :pswitch_data_0
    .packed-switch 0x0
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

.method public static parseGuideline(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/parser/CLArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    instance-of v0, p2, Landroidx/constraintlayout/core/parser/CLObject;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    check-cast p2, Landroidx/constraintlayout/core/parser/CLObject;

    .line 12
    .line 13
    const-string v0, "id"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    invoke-static {p0, p1, v0, p2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGuidelineParams(ILandroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static parseGuidelineParams(ILandroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual/range {p1 .. p2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    invoke-virtual/range {p1 .. p2}, Landroidx/constraintlayout/core/state/State;->horizontalGuideline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual/range {p1 .. p2}, Landroidx/constraintlayout/core/state/State;->verticalGuideline(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/State;->isRtl()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/4 v4, 0x0

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    :goto_1
    const/4 v4, 0x1

    .line 37
    :goto_2
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getFacade()Landroidx/constraintlayout/core/state/helpers/Facade;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x1

    .line 50
    const/4 v11, 0x0

    .line 51
    :goto_3
    if-ge v11, v7, :cond_f

    .line 52
    .line 53
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    add-int/lit8 v11, v11, 0x1

    .line 58
    .line 59
    check-cast v12, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    const-string/jumbo v14, "start"

    .line 69
    .line 70
    .line 71
    const-string/jumbo v15, "right"

    .line 72
    .line 73
    .line 74
    const/16 v16, 0x2

    .line 75
    .line 76
    const-string v5, "left"

    .line 77
    .line 78
    const-string v6, "end"

    .line 79
    .line 80
    const/16 v18, -0x1

    .line 81
    .line 82
    sparse-switch v13, :sswitch_data_0

    .line 83
    .line 84
    .line 85
    :goto_4
    move/from16 v13, v18

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :sswitch_0
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-nez v13, :cond_4

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    const/4 v13, 0x4

    .line 96
    goto :goto_5

    .line 97
    :sswitch_1
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    if-nez v13, :cond_5

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    const/4 v13, 0x3

    .line 105
    goto :goto_5

    .line 106
    :sswitch_2
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-nez v13, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    move/from16 v13, v16

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :sswitch_3
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-nez v13, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    const/4 v13, 0x1

    .line 124
    goto :goto_5

    .line 125
    :sswitch_4
    const-string v13, "percent"

    .line 126
    .line 127
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-nez v13, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    const/4 v13, 0x0

    .line 135
    :goto_5
    packed-switch v13, :pswitch_data_0

    .line 136
    .line 137
    .line 138
    :goto_6
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x1

    .line 140
    goto :goto_3

    .line 141
    :pswitch_0
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-static {v0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    move v10, v4

    .line 150
    :goto_7
    move v8, v5

    .line 151
    goto :goto_6

    .line 152
    :pswitch_1
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    invoke-static {v0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    move v8, v5

    .line 161
    const/4 v10, 0x0

    .line 162
    goto :goto_6

    .line 163
    :pswitch_2
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    invoke-static {v0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    move v8, v5

    .line 172
    :goto_8
    const/4 v10, 0x1

    .line 173
    goto :goto_6

    .line 174
    :pswitch_3
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-static {v0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->toPix(Landroidx/constraintlayout/core/state/State;F)F

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    xor-int/lit8 v10, v4, 0x1

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :pswitch_4
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    if-nez v9, :cond_9

    .line 190
    .line 191
    invoke-virtual {v1, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    move v8, v5

    .line 196
    const/4 v9, 0x1

    .line 197
    goto :goto_8

    .line 198
    :cond_9
    invoke-virtual {v9}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    const/4 v13, 0x1

    .line 203
    if-le v12, v13, :cond_e

    .line 204
    .line 205
    const/4 v12, 0x0

    .line 206
    invoke-virtual {v9, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-virtual {v9, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    sparse-switch v17, :sswitch_data_1

    .line 222
    .line 223
    .line 224
    :goto_9
    move/from16 v15, v18

    .line 225
    .line 226
    goto :goto_a

    .line 227
    :sswitch_5
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-nez v5, :cond_a

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_a
    const/4 v15, 0x3

    .line 235
    goto :goto_a

    .line 236
    :sswitch_6
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_b

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_b
    move/from16 v15, v16

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :sswitch_7
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    if-nez v5, :cond_c

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_c
    move v15, v13

    .line 254
    goto :goto_a

    .line 255
    :sswitch_8
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-nez v5, :cond_d

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_d
    move v15, v12

    .line 263
    :goto_a
    packed-switch v15, :pswitch_data_1

    .line 264
    .line 265
    .line 266
    :goto_b
    move v8, v9

    .line 267
    :goto_c
    move v9, v13

    .line 268
    goto/16 :goto_3

    .line 269
    .line 270
    :pswitch_5
    move v10, v4

    .line 271
    goto :goto_b

    .line 272
    :pswitch_6
    move v8, v9

    .line 273
    move v10, v12

    .line 274
    goto :goto_c

    .line 275
    :pswitch_7
    move v8, v9

    .line 276
    move v9, v13

    .line 277
    move v10, v9

    .line 278
    goto/16 :goto_3

    .line 279
    .line 280
    :pswitch_8
    xor-int/lit8 v10, v4, 0x1

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_e
    const/4 v12, 0x0

    .line 284
    goto :goto_c

    .line 285
    :cond_f
    if-eqz v9, :cond_11

    .line 286
    .line 287
    if-eqz v10, :cond_10

    .line 288
    .line 289
    invoke-virtual {v3, v8}, Landroidx/constraintlayout/core/state/helpers/GuidelineReference;->percent(F)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 294
    .line 295
    sub-float/2addr v0, v8

    .line 296
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/state/helpers/GuidelineReference;->percent(F)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_11
    if-eqz v10, :cond_12

    .line 301
    .line 302
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/state/helpers/GuidelineReference;->start(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_12
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/state/helpers/GuidelineReference;->end(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/helpers/GuidelineReference;

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    nop

    .line 319
    :sswitch_data_0
    .sparse-switch
        -0x28779bbb -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    :sswitch_data_1
    .sparse-switch
        0x188db -> :sswitch_8
        0x32a007 -> :sswitch_7
        0x677c21c -> :sswitch_6
        0x68ac462 -> :sswitch_5
    .end sparse-switch

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public static parseHeader(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 1

    .line 1
    const-string v0, "export"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1}, Landroidx/constraintlayout/core/state/CoreMotionScene;->setDebugName(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static parseHelpers(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_5

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Landroidx/constraintlayout/core/parser/CLArray;

    .line 14
    .line 15
    if-eqz v3, :cond_4

    .line 16
    .line 17
    check-cast v2, Landroidx/constraintlayout/core/parser/CLArray;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x1

    .line 24
    if-le v3, v4, :cond_4

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v6, -0x1

    .line 38
    sparse-switch v5, :sswitch_data_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :sswitch_0
    const-string v5, "hGuideline"

    .line 43
    .line 44
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const/4 v6, 0x3

    .line 52
    goto :goto_1

    .line 53
    :sswitch_1
    const-string/jumbo v5, "vChain"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v6, 0x2

    .line 64
    goto :goto_1

    .line 65
    :sswitch_2
    const-string v5, "hChain"

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v6, v4

    .line 75
    goto :goto_1

    .line 76
    :sswitch_3
    const-string/jumbo v5, "vGuideline"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move v6, v0

    .line 87
    :goto_1
    packed-switch v6, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_0
    invoke-static {v0, p0, v2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGuideline(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/parser/CLArray;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_1
    invoke-static {v4, p0, p1, v2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseChain(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :pswitch_2
    invoke-static {v0, p0, p1, v2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseChain(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :pswitch_3
    invoke-static {v4, p0, v2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGuideline(ILandroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/parser/CLArray;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    return-void

    .line 110
    nop

    .line 111
    :sswitch_data_0
    .sparse-switch
        -0x6a6caee6 -> :sswitch_3
        -0x4aa718c7 -> :sswitch_2
        -0x32c34015 -> :sswitch_1
        0x398f2168 -> :sswitch_0
    .end sparse-switch

    .line 112
    .line 113
    .line 114
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseJSON(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 18
    :try_start_0
    invoke-static {p0}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p0

    .line 19
    invoke-static {p0, p1, p2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->populateState(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;)V
    :try_end_0
    .catch Landroidx/constraintlayout/core/parser/CLParsingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 20
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error parsing JSON "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static parseJSON(Ljava/lang/String;Landroidx/constraintlayout/core/state/Transition;I)V
    .locals 17

    move-object/from16 v0, p1

    move/from16 v1, p2

    .line 1
    :try_start_0
    invoke-static/range {p0 .. p0}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object v2

    .line 2
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :cond_1
    if-ge v6, v4, :cond_4

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ljava/lang/String;

    .line 4
    invoke-virtual {v2, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    move-result-object v8

    .line 5
    instance-of v9, v8, Landroidx/constraintlayout/core/parser/CLObject;

    if-eqz v9, :cond_1

    .line 6
    check-cast v8, Landroidx/constraintlayout/core/parser/CLObject;

    .line 7
    const-string v9, "custom"

    invoke-virtual {v8, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 8
    invoke-virtual {v8}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    move-result-object v9

    .line 9
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v11, v5

    :cond_2
    :goto_0
    if-ge v11, v10, :cond_1

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v11, v11, 0x1

    check-cast v12, Ljava/lang/String;

    .line 10
    invoke-virtual {v8, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    move-result-object v13

    .line 11
    instance-of v14, v13, Landroidx/constraintlayout/core/parser/CLNumber;

    if-eqz v14, :cond_3

    .line 12
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    move-result v13

    .line 13
    invoke-virtual {v0, v1, v7, v12, v13}, Landroidx/constraintlayout/core/state/Transition;->addCustomFloat(ILjava/lang/String;Ljava/lang/String;F)V

    goto :goto_0

    .line 14
    :cond_3
    instance-of v14, v13, Landroidx/constraintlayout/core/parser/CLString;

    if-eqz v14, :cond_2

    .line 15
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    move-result-wide v13

    const-wide/16 v15, -0x1

    cmp-long v15, v13, v15

    if-eqz v15, :cond_2

    long-to-int v13, v13

    .line 16
    invoke-virtual {v0, v1, v7, v12, v13}, Landroidx/constraintlayout/core/state/Transition;->addCustomColor(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroidx/constraintlayout/core/parser/CLParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    :goto_1
    return-void

    :catch_0
    move-exception v0

    .line 17
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error parsing JSON "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static parseMotionProperties(Landroidx/constraintlayout/core/parser/CLElement;Landroidx/constraintlayout/core/state/ConstraintReference;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    instance-of v0, p0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 7
    .line 8
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :cond_2
    :goto_1
    if-ge v4, v2, :cond_a

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/4 v7, -0x1

    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x1

    .line 46
    sparse-switch v6, :sswitch_data_0

    .line 47
    .line 48
    .line 49
    :goto_2
    move v6, v7

    .line 50
    goto :goto_3

    .line 51
    :sswitch_0
    const-string v6, "relativeTo"

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/4 v6, 0x4

    .line 61
    goto :goto_3

    .line 62
    :sswitch_1
    const-string v6, "pathArc"

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-nez v6, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/4 v6, 0x3

    .line 72
    goto :goto_3

    .line 73
    :sswitch_2
    const-string v6, "quantize"

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    move v6, v8

    .line 83
    goto :goto_3

    .line 84
    :sswitch_3
    const-string v6, "easing"

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move v6, v9

    .line 94
    goto :goto_3

    .line 95
    :sswitch_4
    const-string/jumbo v6, "stagger"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-nez v6, :cond_7

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    move v6, v3

    .line 106
    :goto_3
    packed-switch v6, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_0
    const/16 v6, 0x25d

    .line 111
    .line 112
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v0, v6, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_1
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-string v12, "below"

    .line 125
    .line 126
    const-string v13, "above"

    .line 127
    .line 128
    const-string v8, "none"

    .line 129
    .line 130
    const-string/jumbo v9, "startVertical"

    .line 131
    .line 132
    .line 133
    const-string/jumbo v10, "startHorizontal"

    .line 134
    .line 135
    .line 136
    const-string v11, "flip"

    .line 137
    .line 138
    filled-new-array/range {v8 .. v13}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v5, v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->indexOf(Ljava/lang/String;[Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-ne v6, v7, :cond_8

    .line 147
    .line 148
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 149
    .line 150
    new-instance v7, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLElement;->getLine()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v8, " pathArc = \'"

    .line 163
    .line 164
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v5, "\'"

    .line 171
    .line 172
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_1

    .line 183
    .line 184
    :cond_8
    const/16 v5, 0x25f

    .line 185
    .line 186
    invoke-virtual {v0, v5, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :pswitch_2
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    instance-of v7, v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 196
    .line 197
    const/16 v10, 0x262

    .line 198
    .line 199
    if-eqz v7, :cond_9

    .line 200
    .line 201
    check-cast v6, Landroidx/constraintlayout/core/parser/CLArray;

    .line 202
    .line 203
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-lez v5, :cond_2

    .line 208
    .line 209
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    invoke-virtual {v0, v10, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 214
    .line 215
    .line 216
    if-le v5, v9, :cond_2

    .line 217
    .line 218
    const/16 v7, 0x263

    .line 219
    .line 220
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-virtual {v0, v7, v9}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    if-le v5, v8, :cond_2

    .line 228
    .line 229
    const/16 v5, 0x25a

    .line 230
    .line 231
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-virtual {v0, v5, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :cond_9
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    invoke-virtual {v0, v10, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :pswitch_3
    const/16 v6, 0x25b

    .line 250
    .line 251
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v0, v6, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :pswitch_4
    const/16 v6, 0x258

    .line 261
    .line 262
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(Ljava/lang/String;)F

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    invoke-virtual {v0, v6, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :cond_a
    iput-object v0, p1, Landroidx/constraintlayout/core/state/ConstraintReference;->mMotionProperties:Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 272
    .line 273
    return-void

    .line 274
    nop

    .line 275
    :sswitch_data_0
    .sparse-switch
        -0x7119f053 -> :sswitch_4
        -0x4e19c2d5 -> :sswitch_3
        -0x4c979acf -> :sswitch_2
        -0x2f2d1013 -> :sswitch_1
        -0xe1f7d99 -> :sswitch_0
    .end sparse-switch

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseMotionSceneJSON(Landroidx/constraintlayout/core/state/CoreMotionScene;Ljava/lang/String;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-static {p1}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_9

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    instance-of v6, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const v7, -0x7f663153

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x2

    .line 47
    const/4 v9, 0x1

    .line 48
    if-eq v6, v7, :cond_4

    .line 49
    .line 50
    const v7, -0xe641a62

    .line 51
    .line 52
    .line 53
    if-eq v6, v7, :cond_3

    .line 54
    .line 55
    const v7, 0x41acefee

    .line 56
    .line 57
    .line 58
    if-eq v6, v7, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string v6, "ConstraintSets"

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    move v4, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const-string v6, "Transitions"

    .line 72
    .line 73
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    move v4, v9

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const-string v6, "Header"

    .line 82
    .line 83
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    move v4, v8

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    :goto_1
    const/4 v4, -0x1

    .line 92
    :goto_2
    if-eqz v4, :cond_8

    .line 93
    .line 94
    if-eq v4, v9, :cond_7

    .line 95
    .line 96
    if-eq v4, v8, :cond_6

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    invoke-static {p0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseHeader(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    invoke-static {p0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseTransitions(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_8
    invoke-static {p0, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseConstraintSets(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V
    :try_end_0
    .catch Landroidx/constraintlayout/core/parser/CLParsingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_9
    :goto_3
    return-void

    .line 112
    :catch_0
    move-exception p0

    .line 113
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, "Error parsing JSON "

    .line 118
    .line 119
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public static parseTransitions(Landroidx/constraintlayout/core/state/CoreMotionScene;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getObject(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLObject;->toJSON()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {p0, v3, v4}, Landroidx/constraintlayout/core/state/CoreMotionScene;->setTransitionContent(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return-void
.end method

.method private static parseVariables(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_7

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    move-object v6, v4

    .line 24
    check-cast v6, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    instance-of v5, v4, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {p1, v6, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v5, v4, Landroidx/constraintlayout/core/parser/CLObject;

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    check-cast v4, Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    const-string v5, "from"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    const-string/jumbo v7, "to"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {p1, v7}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    const-string v7, "prefix"

    .line 82
    .line 83
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    const-string v7, "postfix"

    .line 88
    .line 89
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    const/high16 v9, 0x3f800000    # 1.0f

    .line 94
    .line 95
    move v7, v5

    .line 96
    move-object v5, p1

    .line 97
    invoke-virtual/range {v5 .. v11}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_4

    .line 106
    .line 107
    const-string/jumbo v7, "step"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_4

    .line 115
    .line 116
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {p1, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->get(Ljava/lang/Object;)F

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-virtual {p1, v6, v5, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;FF)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    const-string v5, "ids"

    .line 137
    .line 138
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    new-instance v5, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    move v7, v2

    .line 154
    :goto_1
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-ge v7, v8, :cond_5

    .line 159
    .line 160
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    add-int/lit8 v7, v7, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    invoke-virtual {p1, v6, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_6
    const-string/jumbo v5, "tag"

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_1

    .line 183
    .line 184
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/state/State;->getIdsForTag(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {p1, v6, v4}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_7
    :goto_2
    return-void
.end method

.method public static parseWidget(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 3
    invoke-virtual {p2}, Landroidx/constraintlayout/core/state/ConstraintReference;->getWidth()Landroidx/constraintlayout/core/state/Dimension;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setWidth(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 5
    :cond_0
    invoke-virtual {p2}, Landroidx/constraintlayout/core/state/ConstraintReference;->getHeight()Landroidx/constraintlayout/core/state/Dimension;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setHeight(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 7
    :cond_1
    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Ljava/lang/String;

    .line 9
    invoke-static {p0, p1, p2, p3, v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->applyAttribute(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static parseWidget(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    move-result-object p2

    .line 2
    invoke-static {p0, p1, p2, p3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseWidget(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/state/ConstraintReference;Landroidx/constraintlayout/core/parser/CLObject;)V

    return-void
.end method

.method public static populateState(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;)V
    .locals 11
    .param p0    # Landroidx/constraintlayout/core/parser/CLObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/core/state/State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->names()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_11

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    check-cast v4, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->get(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, 0x2

    .line 37
    const/4 v8, -0x1

    .line 38
    const/4 v9, 0x1

    .line 39
    sparse-switch v6, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    :goto_1
    move v6, v8

    .line 43
    goto :goto_2

    .line 44
    :sswitch_0
    const-string v6, "Variables"

    .line 45
    .line 46
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v6, v7

    .line 54
    goto :goto_2

    .line 55
    :sswitch_1
    const-string v6, "Generate"

    .line 56
    .line 57
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move v6, v9

    .line 65
    goto :goto_2

    .line 66
    :sswitch_2
    const-string v6, "Helpers"

    .line 67
    .line 68
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move v6, v2

    .line 76
    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    instance-of v6, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 80
    .line 81
    if-eqz v6, :cond_10

    .line 82
    .line 83
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 84
    .line 85
    invoke-static {v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->lookForType(Landroidx/constraintlayout/core/parser/CLObject;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-eqz v6, :cond_f

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    sparse-switch v10, :sswitch_data_1

    .line 96
    .line 97
    .line 98
    :goto_3
    move v7, v8

    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :sswitch_3
    const-string v7, "hGuideline"

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-nez v7, :cond_5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    const/16 v7, 0x9

    .line 111
    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :sswitch_4
    const-string/jumbo v7, "vFlow"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-nez v7, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    const/16 v7, 0x8

    .line 125
    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :sswitch_5
    const-string v7, "hFlow"

    .line 129
    .line 130
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-nez v7, :cond_7

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    const/4 v7, 0x7

    .line 138
    goto :goto_4

    .line 139
    :sswitch_6
    const-string v7, "grid"

    .line 140
    .line 141
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_8

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    const/4 v7, 0x6

    .line 149
    goto :goto_4

    .line 150
    :sswitch_7
    const-string/jumbo v7, "row"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-nez v7, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    const/4 v7, 0x5

    .line 161
    goto :goto_4

    .line 162
    :sswitch_8
    const-string v7, "barrier"

    .line 163
    .line 164
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-nez v7, :cond_a

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    const/4 v7, 0x4

    .line 172
    goto :goto_4

    .line 173
    :sswitch_9
    const-string/jumbo v7, "vChain"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-nez v7, :cond_b

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_b
    const/4 v7, 0x3

    .line 184
    goto :goto_4

    .line 185
    :sswitch_a
    const-string v10, "hChain"

    .line 186
    .line 187
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-nez v10, :cond_e

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :sswitch_b
    const-string v7, "column"

    .line 195
    .line 196
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-nez v7, :cond_c

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_c
    move v7, v9

    .line 204
    goto :goto_4

    .line 205
    :sswitch_c
    const-string/jumbo v7, "vGuideline"

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-nez v7, :cond_d

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_d
    move v7, v2

    .line 216
    :cond_e
    :goto_4
    packed-switch v7, :pswitch_data_1

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :pswitch_0
    invoke-static {v2, p1, v4, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGuidelineParams(ILandroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :pswitch_1
    invoke-static {v6, p1, v4, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseFlowType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_2
    invoke-static {p1, v4, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseBarrier(Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :pswitch_3
    invoke-static {v6, p1, v4, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseChainType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :pswitch_4
    invoke-static {v6, p1, v4, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGridType(Ljava/lang/String;Landroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :pswitch_5
    invoke-static {v9, p1, v4, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGuidelineParams(ILandroidx/constraintlayout/core/state/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_f
    invoke-static {p1, p2, v4, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseWidget(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_10
    instance-of v6, v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 257
    .line 258
    if-eqz v6, :cond_1

    .line 259
    .line 260
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLElement;->getInt()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-virtual {p2, v4, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;->put(Ljava/lang/String;I)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :pswitch_6
    instance-of v4, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 270
    .line 271
    if-eqz v4, :cond_1

    .line 272
    .line 273
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 274
    .line 275
    invoke-static {p1, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseVariables(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :pswitch_7
    instance-of v4, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 281
    .line 282
    if-eqz v4, :cond_1

    .line 283
    .line 284
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 285
    .line 286
    invoke-static {p1, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseGenerate(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :pswitch_8
    instance-of v4, v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 292
    .line 293
    if-eqz v4, :cond_1

    .line 294
    .line 295
    check-cast v5, Landroidx/constraintlayout/core/parser/CLArray;

    .line 296
    .line 297
    invoke-static {p1, p2, v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseHelpers(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_11
    :goto_5
    return-void

    .line 303
    :sswitch_data_0
    .sparse-switch
        -0x6cbf819b -> :sswitch_2
        0x6fc27995 -> :sswitch_1
        0x72879d57 -> :sswitch_0
    .end sparse-switch

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :sswitch_data_1
    .sparse-switch
        -0x6a6caee6 -> :sswitch_c
        -0x50c12caa -> :sswitch_b
        -0x4aa718c7 -> :sswitch_a
        -0x32c34015 -> :sswitch_9
        -0x13db5c49 -> :sswitch_8
        0x1b9da -> :sswitch_7
        0x308b46 -> :sswitch_6
        0x5db01b6 -> :sswitch_5
        0x6a04ac4 -> :sswitch_4
        0x398f2168 -> :sswitch_3
    .end sparse-switch

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static toPix(Landroidx/constraintlayout/core/state/State;F)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/State;->getDpToPixel()Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
