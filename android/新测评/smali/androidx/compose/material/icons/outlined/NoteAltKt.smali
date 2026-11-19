.class public final Landroidx/compose/material/icons/outlined/NoteAltKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getNoteAlt",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNoteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoteAlt.kt\nandroidx/compose/material/icons/outlined/NoteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n233#2,18:132\n253#2:169\n233#2,18:170\n253#2:207\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n705#4,2:150\n717#4,2:152\n719#4,11:158\n705#4,2:188\n717#4,2:190\n719#4,11:196\n72#5,4:116\n72#5,4:154\n72#5,4:192\n*S KotlinDebug\n*F\n+ 1 NoteAlt.kt\nandroidx/compose/material/icons/outlined/NoteAltKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n57#1:132,18\n57#1:169\n65#1:170,18\n65#1:207\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n57#1:150,2\n57#1:152,2\n57#1:158,11\n65#1:188,2\n65#1:190,2\n65#1:196,11\n30#1:116,4\n57#1:154,4\n65#1:192,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoteAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NoteAltKt;->_noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.NoteAlt"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3f7a3d71    # -4.18f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v26, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v21, 0x41666666    # 14.4f

    .line 88
    .line 89
    .line 90
    const v22, 0x3feb851f    # 1.84f

    .line 91
    .line 92
    .line 93
    const v23, 0x4154cccd    # 13.3f

    .line 94
    .line 95
    .line 96
    const/high16 v24, 0x3f800000    # 1.0f

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v4, 0x3feb851f    # 1.84f

    .line 104
    .line 105
    .line 106
    const v6, 0x4112e148    # 9.18f

    .line 107
    .line 108
    .line 109
    const/high16 v7, 0x40400000    # 3.0f

    .line 110
    .line 111
    const v8, 0x4119999a    # 9.6f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40a00000    # 5.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x40400000    # 3.0f

    .line 123
    .line 124
    const/high16 v26, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const v21, 0x4079999a    # 3.9f

    .line 127
    .line 128
    .line 129
    const/high16 v22, 0x40400000    # 3.0f

    .line 130
    .line 131
    const/high16 v23, 0x40400000    # 3.0f

    .line 132
    .line 133
    const v24, 0x4079999a    # 3.9f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41600000    # 14.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, 0x40000000    # 2.0f

    .line 145
    .line 146
    const/high16 v26, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, 0x3f8ccccd    # 1.1f

    .line 151
    .line 152
    .line 153
    const v23, 0x3f666666    # 0.9f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x40000000    # 2.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v26, -0x40000000    # -2.0f

    .line 165
    .line 166
    const v21, 0x3f8ccccd    # 1.1f

    .line 167
    .line 168
    .line 169
    const/16 v22, 0x0

    .line 170
    .line 171
    const/high16 v23, 0x40000000    # 2.0f

    .line 172
    .line 173
    const v24, -0x4099999a    # -0.9f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x40a00000    # 5.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x41980000    # 19.0f

    .line 185
    .line 186
    const/high16 v26, 0x40400000    # 3.0f

    .line 187
    .line 188
    const/high16 v21, 0x41a80000    # 21.0f

    .line 189
    .line 190
    const v22, 0x4079999a    # 3.9f

    .line 191
    .line 192
    .line 193
    const v23, 0x41a0cccd    # 20.1f

    .line 194
    .line 195
    .line 196
    const/high16 v24, 0x40400000    # 3.0f

    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x40300000    # 2.75f

    .line 205
    .line 206
    const/high16 v6, 0x41400000    # 12.0f

    .line 207
    .line 208
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v25, 0x3f400000    # 0.75f

    .line 212
    .line 213
    const/high16 v26, 0x3f400000    # 0.75f

    .line 214
    .line 215
    const v21, 0x3ed1eb85    # 0.41f

    .line 216
    .line 217
    .line 218
    const/16 v22, 0x0

    .line 219
    .line 220
    const/high16 v23, 0x3f400000    # 0.75f

    .line 221
    .line 222
    const v24, 0x3eae147b    # 0.34f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x41468f5c    # 12.41f

    .line 229
    .line 230
    .line 231
    const/high16 v6, 0x40880000    # 4.25f

    .line 232
    .line 233
    const/high16 v7, 0x41400000    # 12.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, -0x4151eb85    # -0.34f

    .line 239
    .line 240
    .line 241
    const/high16 v6, -0x40c00000    # -0.75f

    .line 242
    .line 243
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x413970a4    # 11.59f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x40300000    # 2.75f

    .line 250
    .line 251
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x41980000    # 19.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x40a00000    # 5.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41600000    # 14.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x41980000    # 19.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const/16 v16, 0x3800

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const/high16 v6, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v8, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    const/high16 v9, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const/high16 v12, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const/4 v14, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const-string v4, ""

    .line 304
    .line 305
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 306
    .line 307
    .line 308
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    const/4 v2, 0x0

    .line 319
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const v4, 0x417147ae    # 15.08f

    .line 336
    .line 337
    .line 338
    const v6, 0x41307ae1    # 11.03f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, -0x3ff851ec    # -2.12f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, -0x3f4147ae    # -5.96f

    .line 351
    .line 352
    .line 353
    const v6, 0x40be6666    # 5.95f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, 0x4008f5c3    # 2.14f

    .line 360
    .line 361
    .line 362
    const/4 v6, 0x0

    .line 363
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x40066666    # 2.1f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    const/high16 v6, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/4 v7, 0x0

    .line 382
    const-string v4, ""

    .line 383
    .line 384
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 385
    .line 386
    .line 387
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 392
    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 394
    .line 395
    .line 396
    move-result-wide v6

    .line 397
    const/4 v0, 0x0

    .line 398
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 412
    .line 413
    .line 414
    const v0, 0x411451ec    # 9.27f

    .line 415
    .line 416
    .line 417
    const v2, 0x4186cccd    # 16.85f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const v18, -0x40ca3d71    # -0.71f

    .line 426
    .line 427
    .line 428
    const v13, 0x3e4ccccd    # 0.2f

    .line 429
    .line 430
    .line 431
    const v14, -0x41b33333    # -0.2f

    .line 432
    .line 433
    .line 434
    const v15, 0x3e4ccccd    # 0.2f

    .line 435
    .line 436
    .line 437
    const v16, -0x40fd70a4    # -0.51f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x404b851f    # -1.41f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x40ca3d71    # -0.71f

    .line 450
    .line 451
    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    const v13, -0x41b33333    # -0.2f

    .line 455
    .line 456
    .line 457
    const v15, -0x40fd70a4    # -0.51f

    .line 458
    .line 459
    .line 460
    const v16, -0x41b33333    # -0.2f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, -0x407851ec    # -1.06f

    .line 467
    .line 468
    .line 469
    const v2, 0x3f87ae14    # 1.06f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x4007ae14    # 2.12f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x411451ec    # 9.27f

    .line 482
    .line 483
    .line 484
    const v2, 0x4186cccd    # 16.85f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    const/16 v16, 0x3800

    .line 498
    .line 499
    const/16 v17, 0x0

    .line 500
    .line 501
    const/high16 v6, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const/high16 v12, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const/4 v14, 0x0

    .line 508
    const/4 v15, 0x0

    .line 509
    const-string v4, ""

    .line 510
    .line 511
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    sput-object v0, Landroidx/compose/material/icons/outlined/NoteAltKt;->_noteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 520
    .line 521
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    return-object v0
.end method
