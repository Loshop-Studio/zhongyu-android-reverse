.class public final Landroidx/compose/material/icons/twotone/ContactlessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_contactless",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Contactless",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getContactless",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nContactless.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/twotone/ContactlessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n233#2,18:239\n253#2:276\n233#2,18:277\n253#2:314\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n705#4,2:257\n717#4,2:259\n719#4,11:265\n705#4,2:295\n717#4,2:297\n719#4,11:303\n72#5,4:147\n72#5,4:185\n72#5,4:223\n72#5,4:261\n72#5,4:299\n*S KotlinDebug\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/twotone/ContactlessKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n62#1:163,18\n62#1:200\n76#1:201,18\n76#1:238\n86#1:239,18\n86#1:276\n96#1:277,18\n96#1:314\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n62#1:181,2\n62#1:183,2\n62#1:189,11\n76#1:219,2\n76#1:221,2\n76#1:227,11\n86#1:257,2\n86#1:259,2\n86#1:265,11\n96#1:295,2\n96#1:297,2\n96#1:303,11\n30#1:147,4\n62#1:185,4\n76#1:223,4\n86#1:261,4\n96#1:299,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactless:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactless(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "TwoTone.Contactless"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40651eb8    # 3.58f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9ae148    # -3.58f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x41835c29    # 16.42f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x41075c29    # 8.46f

    .line 128
    .line 129
    .line 130
    const v6, 0x41673333    # 14.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x415d47ae    # 13.83f

    .line 137
    .line 138
    .line 139
    const v6, 0x40e33333    # 7.1f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v25, 0x3ecccccd    # 0.4f

    .line 146
    .line 147
    .line 148
    const v26, -0x4011eb85    # -1.86f

    .line 149
    .line 150
    .line 151
    const v21, 0x3e8f5c29    # 0.28f

    .line 152
    .line 153
    .line 154
    const v22, -0x40e3d70a    # -0.61f

    .line 155
    .line 156
    .line 157
    const v23, 0x3ed1eb85    # 0.41f

    .line 158
    .line 159
    .line 160
    const v24, -0x406147ae    # -1.24f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, -0x41333333    # -0.4f

    .line 167
    .line 168
    .line 169
    const v26, -0x4019999a    # -1.8f

    .line 170
    .line 171
    .line 172
    const v21, -0x43dc28f6    # -0.01f

    .line 173
    .line 174
    .line 175
    const v22, -0x40deb852    # -0.63f

    .line 176
    .line 177
    .line 178
    const v23, -0x41f0a3d7    # -0.14f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x3fae147b    # 1.36f

    .line 185
    .line 186
    .line 187
    const v6, -0x40deb852    # -0.63f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v25, 0x3f0a3d71    # 0.54f

    .line 194
    .line 195
    .line 196
    const v26, 0x4019999a    # 2.4f

    .line 197
    .line 198
    .line 199
    const v21, 0x3eb33333    # 0.35f

    .line 200
    .line 201
    .line 202
    const/high16 v22, 0x3f400000    # 0.75f

    .line 203
    .line 204
    const v23, 0x3f07ae14    # 0.53f

    .line 205
    .line 206
    .line 207
    const v24, 0x3fc7ae14    # 1.56f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x41075c29    # 8.46f

    .line 214
    .line 215
    .line 216
    const v26, 0x41673333    # 14.45f

    .line 217
    .line 218
    .line 219
    const v21, 0x411028f6    # 9.01f

    .line 220
    .line 221
    .line 222
    const v22, 0x414ccccd    # 12.8f

    .line 223
    .line 224
    .line 225
    const v23, 0x410d47ae    # 8.83f

    .line 226
    .line 227
    .line 228
    const v24, 0x415a3d71    # 13.64f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x41387ae1    # 11.53f

    .line 238
    .line 239
    .line 240
    const v6, 0x4180147b    # 16.01f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x4059999a    # -1.3f

    .line 247
    .line 248
    .line 249
    const v6, -0x40c28f5c    # -0.74f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, 0x3f47ae14    # 0.78f

    .line 256
    .line 257
    .line 258
    const v26, -0x3fb66666    # -3.15f

    .line 259
    .line 260
    .line 261
    const v21, 0x3f051eb8    # 0.52f

    .line 262
    .line 263
    .line 264
    const v22, -0x40947ae1    # -0.92f

    .line 265
    .line 266
    .line 267
    const v23, 0x3f47ae14    # 0.78f

    .line 268
    .line 269
    .line 270
    const v24, -0x40028f5c    # -1.98f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, -0x40b33333    # -0.8f

    .line 277
    .line 278
    .line 279
    const v26, -0x3fa66666    # -3.4f

    .line 280
    .line 281
    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    const v22, -0x4067ae14    # -1.19f

    .line 285
    .line 286
    .line 287
    const v23, -0x4175c28f    # -0.27f

    .line 288
    .line 289
    .line 290
    const v24, -0x3feae148    # -2.33f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, -0x40d47ae1    # -0.67f

    .line 297
    .line 298
    .line 299
    const v6, 0x3fab851f    # 1.34f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v25, 0x3f75c28f    # 0.96f

    .line 306
    .line 307
    .line 308
    const v26, 0x40823d71    # 4.07f

    .line 309
    .line 310
    .line 311
    const v21, 0x3f23d70a    # 0.64f

    .line 312
    .line 313
    .line 314
    const v22, 0x3fa3d70a    # 1.28f

    .line 315
    .line 316
    .line 317
    const v23, 0x3f75c28f    # 0.96f

    .line 318
    .line 319
    .line 320
    const v24, 0x4029999a    # 2.65f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x41387ae1    # 11.53f

    .line 327
    .line 328
    .line 329
    const v26, 0x4180147b    # 16.01f

    .line 330
    .line 331
    .line 332
    const v21, 0x414828f6    # 12.51f

    .line 333
    .line 334
    .line 335
    const v22, 0x4158cccd    # 13.55f

    .line 336
    .line 337
    .line 338
    const v23, 0x4142e148    # 12.18f

    .line 339
    .line 340
    .line 341
    const v24, 0x416dc28f    # 14.86f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, 0x416ab852    # 14.67f

    .line 351
    .line 352
    .line 353
    const v6, 0x418aa3d7    # 17.33f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, -0x40533333    # -1.35f

    .line 360
    .line 361
    .line 362
    const v6, -0x40d70a3d    # -0.66f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v25, 0x3f970a3d    # 1.18f

    .line 369
    .line 370
    .line 371
    const v26, -0x3f69eb85    # -4.69f

    .line 372
    .line 373
    .line 374
    const v21, 0x3f47ae14    # 0.78f

    .line 375
    .line 376
    .line 377
    const v22, -0x40333333    # -1.6f

    .line 378
    .line 379
    .line 380
    const v23, 0x3f970a3d    # 1.18f

    .line 381
    .line 382
    .line 383
    const v24, -0x3fb47ae1    # -3.18f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v25, -0x4068f5c3    # -1.18f

    .line 390
    .line 391
    .line 392
    const v26, -0x3f6b851f    # -4.64f

    .line 393
    .line 394
    .line 395
    const/16 v21, 0x0

    .line 396
    .line 397
    const v22, -0x403eb852    # -1.51f

    .line 398
    .line 399
    .line 400
    const v23, -0x41333333    # -0.4f

    .line 401
    .line 402
    .line 403
    const v24, -0x3fbb851f    # -3.07f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, -0x40d47ae1    # -0.67f

    .line 410
    .line 411
    .line 412
    const v6, 0x3fab851f    # 1.34f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, 0x41800000    # 16.0f

    .line 419
    .line 420
    const v26, 0x413fae14    # 11.98f

    .line 421
    .line 422
    .line 423
    const v21, 0x4178f5c3    # 15.56f

    .line 424
    .line 425
    .line 426
    const v22, 0x41073333    # 8.45f

    .line 427
    .line 428
    .line 429
    const/high16 v23, 0x41800000    # 16.0f

    .line 430
    .line 431
    const v24, 0x4123ae14    # 10.23f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v25, 0x416ab852    # 14.67f

    .line 438
    .line 439
    .line 440
    const v26, 0x418aa3d7    # 17.33f

    .line 441
    .line 442
    .line 443
    const/high16 v21, 0x41800000    # 16.0f

    .line 444
    .line 445
    const v22, 0x415b851f    # 13.72f

    .line 446
    .line 447
    .line 448
    const v23, 0x4178f5c3    # 15.56f

    .line 449
    .line 450
    .line 451
    const v24, 0x417851ec    # 15.52f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    const/16 v16, 0x3800

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    const v6, 0x3e99999a    # 0.3f

    .line 469
    .line 470
    .line 471
    const v8, 0x3e99999a    # 0.3f

    .line 472
    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/high16 v9, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v12, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    const/4 v15, 0x0

    .line 482
    const-string v4, ""

    .line 483
    .line 484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 485
    .line 486
    .line 487
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 492
    .line 493
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 494
    .line 495
    .line 496
    move-result-wide v6

    .line 497
    const/4 v2, 0x0

    .line 498
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x40000000    # 2.0f

    .line 515
    .line 516
    const/high16 v6, 0x41400000    # 12.0f

    .line 517
    .line 518
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v25, 0x40000000    # 2.0f

    .line 522
    .line 523
    const/high16 v26, 0x41400000    # 12.0f

    .line 524
    .line 525
    const v21, 0x40cf5c29    # 6.48f

    .line 526
    .line 527
    .line 528
    const/high16 v22, 0x40000000    # 2.0f

    .line 529
    .line 530
    const/high16 v23, 0x40000000    # 2.0f

    .line 531
    .line 532
    const v24, 0x40cf5c29    # 6.48f

    .line 533
    .line 534
    .line 535
    move-object/from16 v20, v2

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v25, 0x41200000    # 10.0f

    .line 541
    .line 542
    const/high16 v26, 0x41200000    # 10.0f

    .line 543
    .line 544
    const/16 v21, 0x0

    .line 545
    .line 546
    const v22, 0x40b0a3d7    # 5.52f

    .line 547
    .line 548
    .line 549
    const v23, 0x408f5c29    # 4.48f

    .line 550
    .line 551
    .line 552
    const/high16 v24, 0x41200000    # 10.0f

    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v4, -0x3f70a3d7    # -4.48f

    .line 558
    .line 559
    .line 560
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 561
    .line 562
    const/high16 v7, 0x41200000    # 10.0f

    .line 563
    .line 564
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v25, 0x41400000    # 12.0f

    .line 568
    .line 569
    const/high16 v26, 0x40000000    # 2.0f

    .line 570
    .line 571
    const/high16 v21, 0x41b00000    # 22.0f

    .line 572
    .line 573
    const v22, 0x40cf5c29    # 6.48f

    .line 574
    .line 575
    .line 576
    const v23, 0x418c28f6    # 17.52f

    .line 577
    .line 578
    .line 579
    const/high16 v24, 0x40000000    # 2.0f

    .line 580
    .line 581
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x41a00000    # 20.0f

    .line 588
    .line 589
    const/high16 v6, 0x41400000    # 12.0f

    .line 590
    .line 591
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v25, -0x3f000000    # -8.0f

    .line 595
    .line 596
    const/high16 v26, -0x3f000000    # -8.0f

    .line 597
    .line 598
    const v21, -0x3f728f5c    # -4.42f

    .line 599
    .line 600
    .line 601
    const/16 v22, 0x0

    .line 602
    .line 603
    const/high16 v23, -0x3f000000    # -8.0f

    .line 604
    .line 605
    const v24, -0x3f9ae148    # -3.58f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, -0x3f000000    # -8.0f

    .line 612
    .line 613
    const v6, 0x40651eb8    # 3.58f

    .line 614
    .line 615
    .line 616
    const/high16 v7, 0x41000000    # 8.0f

    .line 617
    .line 618
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v4, 0x40651eb8    # 3.58f

    .line 622
    .line 623
    .line 624
    const/high16 v6, 0x41000000    # 8.0f

    .line 625
    .line 626
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v4, 0x41835c29    # 16.42f

    .line 630
    .line 631
    .line 632
    const/high16 v6, 0x41a00000    # 20.0f

    .line 633
    .line 634
    const/high16 v7, 0x41400000    # 12.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v8, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const-string v4, ""

    .line 652
    .line 653
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 654
    .line 655
    .line 656
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 661
    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 663
    .line 664
    .line 665
    move-result-wide v6

    .line 666
    const/4 v2, 0x0

    .line 667
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 675
    .line 676
    .line 677
    move-result v11

    .line 678
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    const v4, 0x4122e148    # 10.18f

    .line 684
    .line 685
    .line 686
    const v6, 0x40e33333    # 7.1f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v25, 0x3ecccccd    # 0.4f

    .line 693
    .line 694
    .line 695
    const v26, 0x3fe66666    # 1.8f

    .line 696
    .line 697
    .line 698
    const v21, 0x3e851eb8    # 0.26f

    .line 699
    .line 700
    .line 701
    const v22, 0x3f0f5c29    # 0.56f

    .line 702
    .line 703
    .line 704
    const v23, 0x3ec7ae14    # 0.39f

    .line 705
    .line 706
    .line 707
    const v24, 0x3f947ae1    # 1.16f

    .line 708
    .line 709
    .line 710
    move-object/from16 v20, v2

    .line 711
    .line 712
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v25, -0x41333333    # -0.4f

    .line 716
    .line 717
    .line 718
    const v26, 0x3fee147b    # 1.86f

    .line 719
    .line 720
    .line 721
    const v21, 0x3c23d70a    # 0.01f

    .line 722
    .line 723
    .line 724
    const v22, 0x3f2147ae    # 0.63f

    .line 725
    .line 726
    .line 727
    const v23, -0x41fae148    # -0.13f

    .line 728
    .line 729
    .line 730
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 731
    .line 732
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v4, 0x3faf5c29    # 1.37f

    .line 736
    .line 737
    .line 738
    const v6, 0x3f1eb852    # 0.62f

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v25, 0x3f0a3d71    # 0.54f

    .line 745
    .line 746
    .line 747
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 748
    .line 749
    const v21, 0x3ebd70a4    # 0.37f

    .line 750
    .line 751
    .line 752
    const v22, -0x40b0a3d7    # -0.81f

    .line 753
    .line 754
    .line 755
    const v23, 0x3f0ccccd    # 0.55f

    .line 756
    .line 757
    .line 758
    const v24, -0x402ccccd    # -1.65f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v25, -0x40f5c28f    # -0.54f

    .line 765
    .line 766
    .line 767
    const v26, -0x3fe66666    # -2.4f

    .line 768
    .line 769
    .line 770
    const v21, -0x43dc28f6    # -0.01f

    .line 771
    .line 772
    .line 773
    const v22, -0x40a8f5c3    # -0.84f

    .line 774
    .line 775
    .line 776
    const v23, -0x41bd70a4    # -0.19f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v4, 0x4122e148    # 10.18f

    .line 783
    .line 784
    .line 785
    const v6, 0x40e33333    # 7.1f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    const/high16 v6, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v7, 0x0

    .line 801
    const-string v4, ""

    .line 802
    .line 803
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 804
    .line 805
    .line 806
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 811
    .line 812
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 813
    .line 814
    .line 815
    move-result-wide v6

    .line 816
    const/4 v2, 0x0

    .line 817
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 821
    .line 822
    .line 823
    move-result v10

    .line 824
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 825
    .line 826
    .line 827
    move-result v11

    .line 828
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 831
    .line 832
    .line 833
    const v4, 0x40ea8f5c    # 7.33f

    .line 834
    .line 835
    .line 836
    const v6, 0x415547ae    # 13.33f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v25, 0x3f970a3d    # 1.18f

    .line 843
    .line 844
    .line 845
    const v26, 0x40947ae1    # 4.64f

    .line 846
    .line 847
    .line 848
    const v21, 0x3f47ae14    # 0.78f

    .line 849
    .line 850
    .line 851
    const v22, 0x3fc8f5c3    # 1.57f

    .line 852
    .line 853
    .line 854
    const v23, 0x3f970a3d    # 1.18f

    .line 855
    .line 856
    .line 857
    const v24, 0x4048f5c3    # 3.14f

    .line 858
    .line 859
    .line 860
    move-object/from16 v20, v2

    .line 861
    .line 862
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v25, -0x4068f5c3    # -1.18f

    .line 866
    .line 867
    .line 868
    const v26, 0x4096147b    # 4.69f

    .line 869
    .line 870
    .line 871
    const/16 v21, 0x0

    .line 872
    .line 873
    const v22, 0x3fc147ae    # 1.51f

    .line 874
    .line 875
    .line 876
    const v23, -0x41333333    # -0.4f

    .line 877
    .line 878
    .line 879
    const v24, 0x4045c28f    # 3.09f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v4, 0x3faccccd    # 1.35f

    .line 886
    .line 887
    .line 888
    const v6, 0x3f28f5c3    # 0.66f

    .line 889
    .line 890
    .line 891
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v25, 0x3faa3d71    # 1.33f

    .line 895
    .line 896
    .line 897
    const v26, -0x3f54cccd    # -5.35f

    .line 898
    .line 899
    .line 900
    const v21, 0x3f6147ae    # 0.88f

    .line 901
    .line 902
    .line 903
    const v22, -0x401851ec    # -1.81f

    .line 904
    .line 905
    .line 906
    const v23, 0x3faa3d71    # 1.33f

    .line 907
    .line 908
    .line 909
    const v24, -0x3f98f5c3    # -3.61f

    .line 910
    .line 911
    .line 912
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v25, -0x4055c28f    # -1.33f

    .line 916
    .line 917
    .line 918
    const v26, -0x3f56147b    # -5.31f

    .line 919
    .line 920
    .line 921
    const/16 v21, 0x0

    .line 922
    .line 923
    const v22, -0x402147ae    # -1.74f

    .line 924
    .line 925
    .line 926
    const v23, -0x4119999a    # -0.45f

    .line 927
    .line 928
    .line 929
    const v24, -0x3f9e147b    # -3.53f

    .line 930
    .line 931
    .line 932
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v4, 0x40ea8f5c    # 7.33f

    .line 936
    .line 937
    .line 938
    const v6, 0x415547ae    # 13.33f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    const/high16 v6, 0x3f800000    # 1.0f

    .line 952
    .line 953
    const/4 v7, 0x0

    .line 954
    const-string v4, ""

    .line 955
    .line 956
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 957
    .line 958
    .line 959
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 960
    .line 961
    .line 962
    move-result v3

    .line 963
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 964
    .line 965
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 966
    .line 967
    .line 968
    move-result-wide v6

    .line 969
    const/4 v0, 0x0

    .line 970
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 974
    .line 975
    .line 976
    move-result v10

    .line 977
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 978
    .line 979
    .line 980
    move-result v11

    .line 981
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 984
    .line 985
    .line 986
    const v0, 0x410b851f    # 8.72f

    .line 987
    .line 988
    .line 989
    const v2, 0x41233333    # 10.2f

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, 0x3f4ccccd    # 0.8f

    .line 996
    .line 997
    .line 998
    const v18, 0x4059999a    # 3.4f

    .line 999
    .line 1000
    .line 1001
    const v13, 0x3f07ae14    # 0.53f

    .line 1002
    .line 1003
    .line 1004
    const v14, 0x3f88f5c3    # 1.07f

    .line 1005
    .line 1006
    .line 1007
    const v15, 0x3f4ccccd    # 0.8f

    .line 1008
    .line 1009
    .line 1010
    const v16, 0x400d70a4    # 2.21f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v17, -0x40b851ec    # -0.78f

    .line 1017
    .line 1018
    .line 1019
    const v18, 0x4049999a    # 3.15f

    .line 1020
    .line 1021
    .line 1022
    const/4 v13, 0x0

    .line 1023
    const v14, 0x3f95c28f    # 1.17f

    .line 1024
    .line 1025
    .line 1026
    const v15, -0x417ae148    # -0.26f

    .line 1027
    .line 1028
    .line 1029
    const v16, 0x400eb852    # 2.23f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const v0, 0x3fa66666    # 1.3f

    .line 1036
    .line 1037
    .line 1038
    const v2, 0x3f3d70a4    # 0.74f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const v17, 0x3f7ae148    # 0.98f

    .line 1045
    .line 1046
    .line 1047
    const v18, -0x3f870a3d    # -3.89f

    .line 1048
    .line 1049
    .line 1050
    const v13, 0x3f266666    # 0.65f

    .line 1051
    .line 1052
    .line 1053
    const v14, -0x406ccccd    # -1.15f

    .line 1054
    .line 1055
    .line 1056
    const v15, 0x3f7ae148    # 0.98f

    .line 1057
    .line 1058
    .line 1059
    const v16, -0x3fe33333    # -2.45f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, -0x408a3d71    # -0.96f

    .line 1066
    .line 1067
    .line 1068
    const v18, -0x3f7dc28f    # -4.07f

    .line 1069
    .line 1070
    .line 1071
    const/4 v13, 0x0

    .line 1072
    const v14, -0x404a3d71    # -1.42f

    .line 1073
    .line 1074
    .line 1075
    const v15, -0x415c28f6    # -0.32f

    .line 1076
    .line 1077
    .line 1078
    const v16, -0x3fcd70a4    # -2.79f

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v0, 0x410b851f    # 8.72f

    .line 1085
    .line 1086
    .line 1087
    const v2, 0x41233333    # 10.2f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    const/16 v16, 0x3800

    .line 1101
    .line 1102
    const/16 v17, 0x0

    .line 1103
    .line 1104
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1105
    .line 1106
    const/4 v7, 0x0

    .line 1107
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1108
    .line 1109
    const/4 v14, 0x0

    .line 1110
    const/4 v15, 0x0

    .line 1111
    const-string v4, ""

    .line 1112
    .line 1113
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    sput-object v0, Landroidx/compose/material/icons/twotone/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1122
    .line 1123
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    return-object v0
.end method
