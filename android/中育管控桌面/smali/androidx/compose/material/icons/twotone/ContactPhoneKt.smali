.class public final Landroidx/compose/material/icons/twotone/ContactPhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_contactPhone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ContactPhone",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getContactPhone",
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
        "SMAP\nContactPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactPhone.kt\nandroidx/compose/material/icons/twotone/ContactPhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,126:1\n212#2,12:127\n233#2,18:140\n253#2:177\n233#2,18:178\n253#2:215\n174#3:139\n705#4,2:158\n717#4,2:160\n719#4,11:166\n705#4,2:196\n717#4,2:198\n719#4,11:204\n72#5,4:162\n72#5,4:200\n*S KotlinDebug\n*F\n+ 1 ContactPhone.kt\nandroidx/compose/material/icons/twotone/ContactPhoneKt\n*L\n29#1:127,12\n30#1:140,18\n30#1:177\n65#1:178,18\n65#1:215\n29#1:139\n30#1:158,2\n30#1:160,2\n30#1:166,11\n65#1:196,2\n65#1:198,2\n65#1:204,11\n30#1:162,4\n65#1:200,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactPhone(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ContactPhoneKt;->_contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ContactPhone"

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
    const/high16 v4, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v6, 0x40000000    # 2.0f

    .line 80
    .line 81
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x41a00000    # 20.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41b00000    # 22.0f

    .line 95
    .line 96
    const/high16 v6, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x40c00000    # 6.0f

    .line 105
    .line 106
    const/high16 v6, 0x41100000    # 9.0f

    .line 107
    .line 108
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40400000    # 3.0f

    .line 112
    .line 113
    const/high16 v26, 0x40400000    # 3.0f

    .line 114
    .line 115
    const v21, 0x3fd33333    # 1.65f

    .line 116
    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    const/high16 v23, 0x40400000    # 3.0f

    .line 121
    .line 122
    const v24, 0x3faccccd    # 1.35f

    .line 123
    .line 124
    .line 125
    move-object/from16 v20, v2

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x40533333    # -1.35f

    .line 131
    .line 132
    .line 133
    const/high16 v6, 0x40400000    # 3.0f

    .line 134
    .line 135
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 141
    .line 142
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x3faccccd    # 1.35f

    .line 146
    .line 147
    .line 148
    const/high16 v6, 0x40400000    # 3.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41700000    # 15.0f

    .line 157
    .line 158
    const/high16 v6, 0x41900000    # 18.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x41900000    # 18.0f

    .line 164
    .line 165
    const/high16 v6, 0x40400000    # 3.0f

    .line 166
    .line 167
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, -0x404b851f    # -1.41f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x41100000    # 9.0f

    .line 177
    .line 178
    const/high16 v26, 0x41500000    # 13.0f

    .line 179
    .line 180
    const/high16 v21, 0x40400000    # 3.0f

    .line 181
    .line 182
    const v22, 0x416147ae    # 14.08f

    .line 183
    .line 184
    .line 185
    const v23, 0x40df0a3d    # 6.97f

    .line 186
    .line 187
    .line 188
    const/high16 v24, 0x41500000    # 13.0f

    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x3f8a3d71    # 1.08f

    .line 194
    .line 195
    .line 196
    const v6, 0x40651eb8    # 3.58f

    .line 197
    .line 198
    .line 199
    const/high16 v7, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41700000    # 15.0f

    .line 205
    .line 206
    const/high16 v6, 0x41900000    # 18.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x418ecccd    # 17.85f

    .line 215
    .line 216
    .line 217
    const/high16 v6, 0x41600000    # 14.0f

    .line 218
    .line 219
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x3fd1eb85    # 1.64f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41800000    # 16.0f

    .line 229
    .line 230
    const/high16 v6, 0x41a80000    # 21.0f

    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3ffeb852    # 1.99f

    .line 236
    .line 237
    .line 238
    const v6, -0x400147ae    # -1.99f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, -0x3fd147ae    # -2.73f

    .line 245
    .line 246
    .line 247
    const v26, -0x3f80a3d7    # -3.99f

    .line 248
    .line 249
    .line 250
    const v21, -0x405851ec    # -1.31f

    .line 251
    .line 252
    .line 253
    const v22, -0x40851eb8    # -0.98f

    .line 254
    .line 255
    .line 256
    const v23, -0x3fee147b    # -2.28f

    .line 257
    .line 258
    .line 259
    const v24, -0x3fe7ae14    # -2.38f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x4170a3d7    # -0.28f

    .line 266
    .line 267
    .line 268
    const/high16 v26, -0x40000000    # -2.0f

    .line 269
    .line 270
    const v21, -0x41c7ae14    # -0.18f

    .line 271
    .line 272
    .line 273
    const v22, -0x40dc28f6    # -0.64f

    .line 274
    .line 275
    .line 276
    const v23, -0x4170a3d7    # -0.28f

    .line 277
    .line 278
    .line 279
    const v24, -0x405851ec    # -1.31f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, -0x4051eb85    # -1.36f

    .line 286
    .line 287
    .line 288
    const v6, 0x3e8f5c29    # 0.28f

    .line 289
    .line 290
    .line 291
    const/high16 v7, -0x40000000    # -2.0f

    .line 292
    .line 293
    const v8, 0x3dcccccd    # 0.1f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, 0x402eb852    # 2.73f

    .line 300
    .line 301
    .line 302
    const v26, -0x3f80a3d7    # -3.99f

    .line 303
    .line 304
    .line 305
    const v21, 0x3ee66666    # 0.45f

    .line 306
    .line 307
    .line 308
    const v22, -0x4030a3d7    # -1.62f

    .line 309
    .line 310
    .line 311
    const v23, 0x3fb5c28f    # 1.42f

    .line 312
    .line 313
    .line 314
    const v24, -0x3fbf5c29    # -3.01f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41000000    # 8.0f

    .line 321
    .line 322
    const/high16 v6, 0x41a80000    # 21.0f

    .line 323
    .line 324
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, -0x403eb852    # -1.51f

    .line 328
    .line 329
    .line 330
    const/high16 v6, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, -0x402e147b    # -1.64f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v25, -0x414ccccd    # -0.35f

    .line 342
    .line 343
    .line 344
    const/high16 v26, 0x40000000    # 2.0f

    .line 345
    .line 346
    const v21, -0x419eb852    # -0.22f

    .line 347
    .line 348
    .line 349
    const v22, 0x3f2147ae    # 0.63f

    .line 350
    .line 351
    .line 352
    const v23, -0x414ccccd    # -0.35f

    .line 353
    .line 354
    .line 355
    const v24, 0x3fa66666    # 1.3f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, 0x3faf5c29    # 1.37f

    .line 362
    .line 363
    .line 364
    const v6, 0x3eb33333    # 0.35f

    .line 365
    .line 366
    .line 367
    const/high16 v7, 0x40000000    # 2.0f

    .line 368
    .line 369
    const v8, 0x3e051eb8    # 0.13f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const/16 v16, 0x3800

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const v6, 0x3e99999a    # 0.3f

    .line 387
    .line 388
    .line 389
    const v8, 0x3e99999a    # 0.3f

    .line 390
    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v9, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v12, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 410
    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 412
    .line 413
    .line 414
    move-result-wide v6

    .line 415
    const/4 v0, 0x0

    .line 416
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41a80000    # 21.0f

    .line 433
    .line 434
    const/high16 v2, 0x40000000    # 2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x41a00000    # 20.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3ffeb852    # 1.99f

    .line 445
    .line 446
    .line 447
    const/high16 v18, -0x40000000    # -2.0f

    .line 448
    .line 449
    const v13, 0x3f8ccccd    # 1.1f

    .line 450
    .line 451
    .line 452
    const v15, 0x3ffeb852    # 1.99f

    .line 453
    .line 454
    .line 455
    const v16, -0x4099999a    # -0.9f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41c00000    # 24.0f

    .line 462
    .line 463
    const/high16 v2, 0x40a00000    # 5.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, -0x40000000    # -2.0f

    .line 469
    .line 470
    const/4 v13, 0x0

    .line 471
    const v14, -0x40733333    # -1.1f

    .line 472
    .line 473
    .line 474
    const v15, -0x4099999a    # -0.9f

    .line 475
    .line 476
    .line 477
    const/high16 v16, -0x40000000    # -2.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x40000000    # 2.0f

    .line 483
    .line 484
    const/high16 v2, 0x40400000    # 3.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v18, 0x40a00000    # 5.0f

    .line 492
    .line 493
    const v13, 0x3f666666    # 0.9f

    .line 494
    .line 495
    .line 496
    const/high16 v14, 0x40400000    # 3.0f

    .line 497
    .line 498
    const/4 v15, 0x0

    .line 499
    const v16, 0x4079999a    # 3.9f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41600000    # 14.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x40000000    # 2.0f

    .line 511
    .line 512
    const/high16 v18, 0x40000000    # 2.0f

    .line 513
    .line 514
    const/4 v13, 0x0

    .line 515
    const v14, 0x3f8ccccd    # 1.1f

    .line 516
    .line 517
    .line 518
    const v15, 0x3f666666    # 0.9f

    .line 519
    .line 520
    .line 521
    const/high16 v16, 0x40000000    # 2.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x40a00000    # 5.0f

    .line 530
    .line 531
    const/high16 v2, 0x40000000    # 2.0f

    .line 532
    .line 533
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41a00000    # 20.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41600000    # 14.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41980000    # 19.0f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x40a00000    # 5.0f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x419beb85    # 19.49f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x41200000    # 10.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41000000    # 8.0f

    .line 568
    .line 569
    const/high16 v2, 0x41a80000    # 21.0f

    .line 570
    .line 571
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, -0x400147ae    # -1.99f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, -0x3fd147ae    # -2.73f

    .line 581
    .line 582
    .line 583
    const v18, 0x407f5c29    # 3.99f

    .line 584
    .line 585
    .line 586
    const v13, -0x405851ec    # -1.31f

    .line 587
    .line 588
    .line 589
    const v14, 0x3f7ae148    # 0.98f

    .line 590
    .line 591
    .line 592
    const v15, -0x3fee147b    # -2.28f

    .line 593
    .line 594
    .line 595
    const v16, 0x4017ae14    # 2.37f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, -0x4170a3d7    # -0.28f

    .line 602
    .line 603
    .line 604
    const/high16 v18, 0x40000000    # 2.0f

    .line 605
    .line 606
    const v13, -0x41c7ae14    # -0.18f

    .line 607
    .line 608
    .line 609
    const v14, 0x3f23d70a    # 0.64f

    .line 610
    .line 611
    .line 612
    const v15, -0x4170a3d7    # -0.28f

    .line 613
    .line 614
    .line 615
    const v16, 0x3fa7ae14    # 1.31f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x3fae147b    # 1.36f

    .line 622
    .line 623
    .line 624
    const v2, 0x3e8f5c29    # 0.28f

    .line 625
    .line 626
    .line 627
    const/high16 v4, 0x40000000    # 2.0f

    .line 628
    .line 629
    const v6, 0x3dcccccd    # 0.1f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, 0x402eb852    # 2.73f

    .line 636
    .line 637
    .line 638
    const v18, 0x407f5c29    # 3.99f

    .line 639
    .line 640
    .line 641
    const v13, 0x3ee66666    # 0.45f

    .line 642
    .line 643
    .line 644
    const v14, 0x3fce147b    # 1.61f

    .line 645
    .line 646
    .line 647
    const v15, 0x3fb5c28f    # 1.42f

    .line 648
    .line 649
    .line 650
    const v16, 0x4040a3d7    # 3.01f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x41800000    # 16.0f

    .line 657
    .line 658
    const/high16 v2, 0x41a80000    # 21.0f

    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, -0x403eb852    # -1.51f

    .line 664
    .line 665
    .line 666
    const/high16 v2, -0x40000000    # -2.0f

    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, -0x402e147b    # -1.64f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, -0x414ccccd    # -0.35f

    .line 678
    .line 679
    .line 680
    const/high16 v18, -0x40000000    # -2.0f

    .line 681
    .line 682
    const v13, -0x419eb852    # -0.22f

    .line 683
    .line 684
    .line 685
    const v14, -0x40deb852    # -0.63f

    .line 686
    .line 687
    .line 688
    const v15, -0x414ccccd    # -0.35f

    .line 689
    .line 690
    .line 691
    const v16, -0x4059999a    # -1.3f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, -0x4050a3d7    # -1.37f

    .line 698
    .line 699
    .line 700
    const v2, 0x3eb33333    # 0.35f

    .line 701
    .line 702
    .line 703
    const/high16 v4, -0x40000000    # -2.0f

    .line 704
    .line 705
    const v6, 0x3e051eb8    # 0.13f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x3fd1eb85    # 1.64f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v0, 0x41400000    # 12.0f

    .line 721
    .line 722
    const/high16 v2, 0x41100000    # 9.0f

    .line 723
    .line 724
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v17, 0x40400000    # 3.0f

    .line 728
    .line 729
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 730
    .line 731
    const v13, 0x3fd33333    # 1.65f

    .line 732
    .line 733
    .line 734
    const/4 v14, 0x0

    .line 735
    const/high16 v15, 0x40400000    # 3.0f

    .line 736
    .line 737
    const v16, -0x40533333    # -1.35f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, -0x40533333    # -1.35f

    .line 744
    .line 745
    .line 746
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x3faccccd    # 1.35f

    .line 752
    .line 753
    .line 754
    const/high16 v2, 0x40400000    # 3.0f

    .line 755
    .line 756
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 757
    .line 758
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x41000000    # 8.0f

    .line 768
    .line 769
    const/high16 v2, 0x41100000    # 9.0f

    .line 770
    .line 771
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v17, 0x3f800000    # 1.0f

    .line 775
    .line 776
    const/high16 v18, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const v13, 0x3f0ccccd    # 0.55f

    .line 779
    .line 780
    .line 781
    const/high16 v15, 0x3f800000    # 1.0f

    .line 782
    .line 783
    const v16, 0x3ee66666    # 0.45f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, -0x4119999a    # -0.45f

    .line 790
    .line 791
    .line 792
    const/high16 v2, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/high16 v4, -0x40800000    # -1.0f

    .line 795
    .line 796
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/high16 v2, -0x40800000    # -1.0f

    .line 800
    .line 801
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x3ee66666    # 0.45f

    .line 805
    .line 806
    .line 807
    const/high16 v2, 0x3f800000    # 1.0f

    .line 808
    .line 809
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x41500000    # 13.0f

    .line 816
    .line 817
    const/high16 v2, 0x41100000    # 9.0f

    .line 818
    .line 819
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v17, -0x3f400000    # -6.0f

    .line 823
    .line 824
    const v18, 0x40651eb8    # 3.58f

    .line 825
    .line 826
    .line 827
    const v13, -0x3ffe147b    # -2.03f

    .line 828
    .line 829
    .line 830
    const/high16 v15, -0x3f400000    # -6.0f

    .line 831
    .line 832
    const v16, 0x3f8a3d71    # 1.08f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x41900000    # 18.0f

    .line 839
    .line 840
    const/high16 v2, 0x40400000    # 3.0f

    .line 841
    .line 842
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v0, 0x41400000    # 12.0f

    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, -0x404b851f    # -1.41f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v17, 0x41100000    # 9.0f

    .line 857
    .line 858
    const/high16 v18, 0x41500000    # 13.0f

    .line 859
    .line 860
    const/high16 v13, 0x41700000    # 15.0f

    .line 861
    .line 862
    const v14, 0x416147ae    # 14.08f

    .line 863
    .line 864
    .line 865
    const v15, 0x41307ae1    # 11.03f

    .line 866
    .line 867
    .line 868
    const/high16 v16, 0x41500000    # 13.0f

    .line 869
    .line 870
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, 0x40af5c29    # 5.48f

    .line 877
    .line 878
    .line 879
    const/high16 v2, 0x41800000    # 16.0f

    .line 880
    .line 881
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const v17, 0x406147ae    # 3.52f

    .line 885
    .line 886
    .line 887
    const/high16 v18, -0x40800000    # -1.0f

    .line 888
    .line 889
    const v13, 0x3f3d70a4    # 0.74f

    .line 890
    .line 891
    .line 892
    const/high16 v14, -0x41000000    # -0.5f

    .line 893
    .line 894
    const v15, 0x400e147b    # 2.22f

    .line 895
    .line 896
    .line 897
    const/high16 v16, -0x40800000    # -1.0f

    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v0, 0x3efae148    # 0.49f

    .line 903
    .line 904
    .line 905
    const v2, 0x406147ae    # 3.52f

    .line 906
    .line 907
    .line 908
    const/high16 v4, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const v6, 0x403147ae    # 2.77f

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v0, 0x40af5c29    # 5.48f

    .line 917
    .line 918
    .line 919
    const/high16 v2, 0x41800000    # 16.0f

    .line 920
    .line 921
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    const/16 v16, 0x3800

    .line 932
    .line 933
    const/16 v17, 0x0

    .line 934
    .line 935
    const/high16 v6, 0x3f800000    # 1.0f

    .line 936
    .line 937
    const/high16 v8, 0x3f800000    # 1.0f

    .line 938
    .line 939
    const/4 v7, 0x0

    .line 940
    const/high16 v12, 0x3f800000    # 1.0f

    .line 941
    .line 942
    const/4 v13, 0x0

    .line 943
    const/4 v14, 0x0

    .line 944
    const/4 v15, 0x0

    .line 945
    const-string v4, ""

    .line 946
    .line 947
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    sput-object v0, Landroidx/compose/material/icons/twotone/ContactPhoneKt;->_contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 956
    .line 957
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 958
    .line 959
    .line 960
    return-object v0
.end method
