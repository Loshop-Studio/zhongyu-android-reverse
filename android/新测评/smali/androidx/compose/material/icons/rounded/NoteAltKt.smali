.class public final Landroidx/compose/material/icons/rounded/NoteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noteAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoteAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNoteAlt",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNoteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoteAlt.kt\nandroidx/compose/material/icons/rounded/NoteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 NoteAlt.kt\nandroidx/compose/material/icons/rounded/NoteAltKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoteAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoteAltKt;->_noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoteAlt"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f7a3d71    # -4.18f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v13, 0x41666666    # 14.4f

    .line 88
    .line 89
    .line 90
    const v14, 0x3feb851f    # 1.84f

    .line 91
    .line 92
    .line 93
    const v15, 0x4154cccd    # 13.3f

    .line 94
    .line 95
    .line 96
    const/high16 v16, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3feb851f    # 1.84f

    .line 102
    .line 103
    .line 104
    const v2, 0x4112e148    # 9.18f

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40400000    # 3.0f

    .line 108
    .line 109
    const v6, 0x4119999a    # 9.6f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40a00000    # 5.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x40400000    # 3.0f

    .line 121
    .line 122
    const/high16 v18, 0x40a00000    # 5.0f

    .line 123
    .line 124
    const v13, 0x4079999a    # 3.9f

    .line 125
    .line 126
    .line 127
    const/high16 v14, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v15, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v16, 0x4079999a    # 3.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x41600000    # 14.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x40000000    # 2.0f

    .line 143
    .line 144
    const/high16 v18, 0x40000000    # 2.0f

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f8ccccd    # 1.1f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f666666    # 0.9f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x40000000    # 2.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v18, -0x40000000    # -2.0f

    .line 162
    .line 163
    const v13, 0x3f8ccccd    # 1.1f

    .line 164
    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    const/high16 v15, 0x40000000    # 2.0f

    .line 168
    .line 169
    const v16, -0x4099999a    # -0.9f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x40a00000    # 5.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x41980000    # 19.0f

    .line 181
    .line 182
    const/high16 v18, 0x40400000    # 3.0f

    .line 183
    .line 184
    const/high16 v13, 0x41a80000    # 21.0f

    .line 185
    .line 186
    const v14, 0x4079999a    # 3.9f

    .line 187
    .line 188
    .line 189
    const v15, 0x41a0cccd    # 20.1f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x40400000    # 3.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40300000    # 2.75f

    .line 201
    .line 202
    const/high16 v2, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x3f400000    # 0.75f

    .line 208
    .line 209
    const/high16 v18, 0x3f400000    # 0.75f

    .line 210
    .line 211
    const v13, 0x3ed1eb85    # 0.41f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const/high16 v15, 0x3f400000    # 0.75f

    .line 216
    .line 217
    const v16, 0x3eae147b    # 0.34f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x41468f5c    # 12.41f

    .line 224
    .line 225
    .line 226
    const/high16 v2, 0x40880000    # 4.25f

    .line 227
    .line 228
    const/high16 v4, 0x41400000    # 12.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, -0x4151eb85    # -0.34f

    .line 234
    .line 235
    .line 236
    const/high16 v2, -0x40c00000    # -0.75f

    .line 237
    .line 238
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x413970a4    # 11.59f

    .line 242
    .line 243
    .line 244
    const/high16 v2, 0x40300000    # 2.75f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x410e6666    # 8.9f

    .line 253
    .line 254
    .line 255
    const/high16 v2, 0x41880000    # 17.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40f00000    # 7.5f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40e00000    # 7.0f

    .line 266
    .line 267
    const/high16 v18, 0x41840000    # 16.5f

    .line 268
    .line 269
    const v13, 0x40e70a3d    # 7.22f

    .line 270
    .line 271
    .line 272
    const/high16 v14, 0x41880000    # 17.0f

    .line 273
    .line 274
    const/high16 v15, 0x40e00000    # 7.0f

    .line 275
    .line 276
    const v16, 0x41863d71    # 16.78f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, -0x4048f5c3    # -1.43f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3e19999a    # 0.15f

    .line 289
    .line 290
    .line 291
    const v18, -0x414ccccd    # -0.35f

    .line 292
    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const v14, -0x41fae148    # -0.13f

    .line 296
    .line 297
    .line 298
    const v15, 0x3d4ccccd    # 0.05f

    .line 299
    .line 300
    .line 301
    const v16, -0x417ae148    # -0.26f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x40b9eb85    # 5.81f

    .line 308
    .line 309
    .line 310
    const v2, -0x3f46147b    # -5.81f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4007ae14    # 2.12f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x3f4570a4    # -5.83f

    .line 323
    .line 324
    .line 325
    const v2, 0x40ba8f5c    # 5.83f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x410e6666    # 8.9f

    .line 332
    .line 333
    .line 334
    const/high16 v18, 0x41880000    # 17.0f

    .line 335
    .line 336
    const v13, 0x41128f5c    # 9.16f

    .line 337
    .line 338
    .line 339
    const v14, 0x4187999a    # 16.95f

    .line 340
    .line 341
    .line 342
    const v15, 0x41107ae1    # 9.03f

    .line 343
    .line 344
    .line 345
    const/high16 v16, 0x41880000    # 17.0f

    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x4186cccd    # 16.85f

    .line 354
    .line 355
    .line 356
    const v2, 0x411451ec    # 9.27f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x3f87ae14    # 1.06f

    .line 363
    .line 364
    .line 365
    const v2, -0x407851ec    # -1.06f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x3ff851ec    # -2.12f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x3f87ae14    # 1.06f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3f35c28f    # 0.71f

    .line 384
    .line 385
    .line 386
    const/16 v18, 0x0

    .line 387
    .line 388
    const v13, 0x3e4ccccd    # 0.2f

    .line 389
    .line 390
    .line 391
    const v14, -0x41b33333    # -0.2f

    .line 392
    .line 393
    .line 394
    const v15, 0x3f028f5c    # 0.51f

    .line 395
    .line 396
    .line 397
    const v16, -0x41b33333    # -0.2f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x3fb47ae1    # 1.41f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x4186cccd    # 16.85f

    .line 410
    .line 411
    .line 412
    const v18, 0x411451ec    # 9.27f

    .line 413
    .line 414
    .line 415
    const v13, 0x41886666    # 17.05f

    .line 416
    .line 417
    .line 418
    const v14, 0x410c28f6    # 8.76f

    .line 419
    .line 420
    .line 421
    const v15, 0x41886666    # 17.05f

    .line 422
    .line 423
    .line 424
    const v16, 0x41111eb8    # 9.07f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const/16 v16, 0x3800

    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const/high16 v6, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/high16 v8, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const/high16 v9, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/high16 v12, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Landroidx/compose/material/icons/rounded/NoteAltKt;->_noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v0
.end method
