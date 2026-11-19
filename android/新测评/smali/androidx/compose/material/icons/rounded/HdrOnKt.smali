.class public final Landroidx/compose/material/icons/rounded/HdrOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hdrOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HdrOn",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHdrOn",
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
        "SMAP\nHdrOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HdrOn.kt\nandroidx/compose/material/icons/rounded/HdrOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 HdrOn.kt\nandroidx/compose/material/icons/rounded/HdrOnKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hdrOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrOn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HdrOnKt;->_hdrOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HdrOn"

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
    const/high16 v0, 0x40e80000    # 7.25f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40c00000    # -0.75f

    .line 78
    .line 79
    const/high16 v18, 0x3f400000    # 0.75f

    .line 80
    .line 81
    const v13, -0x412e147b    # -0.41f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40c00000    # -0.75f

    .line 86
    .line 87
    const v16, 0x3eae147b    # 0.34f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40d00000    # 6.5f

    .line 94
    .line 95
    const/high16 v2, 0x41300000    # 11.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x411c0000    # 9.75f

    .line 106
    .line 107
    const/high16 v2, 0x40900000    # 4.5f

    .line 108
    .line 109
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v18, -0x40c00000    # -0.75f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const v14, -0x412e147b    # -0.41f

    .line 116
    .line 117
    .line 118
    const v15, -0x4151eb85    # -0.34f

    .line 119
    .line 120
    .line 121
    const/high16 v16, -0x40c00000    # -0.75f

    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x411570a4    # 9.34f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x411c0000    # 9.75f

    .line 130
    .line 131
    const/high16 v4, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40900000    # 4.5f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x3f400000    # 0.75f

    .line 142
    .line 143
    const/high16 v18, 0x3f400000    # 0.75f

    .line 144
    .line 145
    const v14, 0x3ed1eb85    # 0.41f

    .line 146
    .line 147
    .line 148
    const v15, 0x3eae147b    # 0.34f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x3f400000    # 0.75f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, -0x40c00000    # -0.75f

    .line 157
    .line 158
    const v2, -0x4151eb85    # -0.34f

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x3f400000    # 0.75f

    .line 162
    .line 163
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41480000    # 12.5f

    .line 167
    .line 168
    const/high16 v2, 0x40900000    # 4.5f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, -0x40c00000    # -0.75f

    .line 187
    .line 188
    const v2, -0x4151eb85    # -0.34f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, -0x3f700000    # -4.5f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x40e80000    # 7.25f

    .line 200
    .line 201
    const/high16 v18, 0x41100000    # 9.0f

    .line 202
    .line 203
    const/high16 v13, 0x41000000    # 8.0f

    .line 204
    .line 205
    const v14, 0x411570a4    # 9.34f

    .line 206
    .line 207
    .line 208
    const v15, 0x40f51eb8    # 7.66f

    .line 209
    .line 210
    .line 211
    const/high16 v16, 0x41100000    # 9.0f

    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x41a80000    # 21.0f

    .line 220
    .line 221
    const/high16 v2, 0x41380000    # 11.5f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, -0x40800000    # -1.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, -0x40400000    # -1.5f

    .line 232
    .line 233
    const/high16 v18, -0x40400000    # -1.5f

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const v14, -0x40ab851f    # -0.83f

    .line 237
    .line 238
    .line 239
    const v15, -0x40d47ae1    # -0.67f

    .line 240
    .line 241
    .line 242
    const/high16 v16, -0x40400000    # -1.5f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41880000    # 17.0f

    .line 248
    .line 249
    const/high16 v2, 0x41100000    # 9.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, -0x40800000    # -1.0f

    .line 255
    .line 256
    const/high16 v18, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const v13, -0x40f33333    # -0.55f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const/high16 v15, -0x40800000    # -1.0f

    .line 263
    .line 264
    const v16, 0x3ee66666    # 0.45f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x40880000    # 4.25f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x3f400000    # 0.75f

    .line 276
    .line 277
    const/high16 v18, 0x3f400000    # 0.75f

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, 0x3ed1eb85    # 0.41f

    .line 281
    .line 282
    .line 283
    const v15, 0x3eae147b    # 0.34f

    .line 284
    .line 285
    .line 286
    const/high16 v16, 0x3f400000    # 0.75f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, -0x40c00000    # -0.75f

    .line 292
    .line 293
    const v2, -0x4151eb85    # -0.34f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x418c0000    # 17.5f

    .line 300
    .line 301
    const/high16 v2, 0x41500000    # 13.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x3f8ccccd    # 1.1f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3f3851ec    # 0.72f

    .line 313
    .line 314
    .line 315
    const v2, 0x3fcb851f    # 1.59f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3f2147ae    # 0.63f

    .line 322
    .line 323
    .line 324
    const v18, 0x3ed1eb85    # 0.41f

    .line 325
    .line 326
    .line 327
    const v13, 0x3de147ae    # 0.11f

    .line 328
    .line 329
    .line 330
    const/high16 v14, 0x3e800000    # 0.25f

    .line 331
    .line 332
    const v15, 0x3eb851ec    # 0.36f

    .line 333
    .line 334
    .line 335
    const v16, 0x3ed1eb85    # 0.41f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3f23d70a    # 0.64f

    .line 342
    .line 343
    .line 344
    const v18, -0x408a3d71    # -0.96f

    .line 345
    .line 346
    .line 347
    const/high16 v13, 0x3f000000    # 0.5f

    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const v15, 0x3f547ae1    # 0.83f

    .line 351
    .line 352
    .line 353
    const v16, -0x40fd70a4    # -0.51f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x41051eb8    # -0.49f

    .line 360
    .line 361
    .line 362
    const v2, -0x406e147b    # -1.14f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3f666666    # 0.9f

    .line 369
    .line 370
    .line 371
    const v18, -0x404ccccd    # -1.4f

    .line 372
    .line 373
    .line 374
    const v14, -0x41666666    # -0.3f

    .line 375
    .line 376
    .line 377
    const v15, 0x3f666666    # 0.9f

    .line 378
    .line 379
    .line 380
    const v16, -0x40b33333    # -0.8f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x418c0000    # 17.5f

    .line 390
    .line 391
    const/high16 v2, 0x41380000    # 11.5f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, -0x40800000    # -1.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x40000000    # 2.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x3f800000    # 1.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, -0x40000000    # -2.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41500000    # 13.0f

    .line 420
    .line 421
    const/high16 v2, 0x41100000    # 9.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x41000000    # -0.5f

    .line 432
    .line 433
    const/high16 v18, 0x3f000000    # 0.5f

    .line 434
    .line 435
    const v13, -0x4170a3d7    # -0.28f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const/high16 v15, -0x41000000    # -0.5f

    .line 440
    .line 441
    const v16, 0x3e6147ae    # 0.22f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40a00000    # 5.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x3f000000    # 0.5f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3e8f5c29    # 0.28f

    .line 456
    .line 457
    .line 458
    const v15, 0x3e6147ae    # 0.22f

    .line 459
    .line 460
    .line 461
    const/high16 v16, 0x3f000000    # 0.5f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40400000    # 3.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 472
    .line 473
    const/high16 v18, -0x40400000    # -1.5f

    .line 474
    .line 475
    const v13, 0x3f51eb85    # 0.82f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 480
    .line 481
    const v16, -0x40d1eb85    # -0.68f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x40400000    # -1.5f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, -0x40ae147b    # -0.82f

    .line 496
    .line 497
    .line 498
    const v15, -0x40d1eb85    # -0.68f

    .line 499
    .line 500
    .line 501
    const/high16 v16, -0x40400000    # -1.5f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x41580000    # 13.5f

    .line 510
    .line 511
    const/high16 v2, 0x41500000    # 13.0f

    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, -0x40000000    # -2.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40400000    # 3.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/16 v16, 0x3800

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v8, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v7, 0x0

    .line 552
    const/high16 v9, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v12, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v14, 0x0

    .line 557
    const/4 v15, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    sput-object v0, Landroidx/compose/material/icons/rounded/HdrOnKt;->_hdrOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-object v0
.end method
