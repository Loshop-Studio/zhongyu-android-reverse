.class public final Landroidx/compose/material/icons/rounded/MopedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_moped",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Moped",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMoped",
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
        "SMAP\nMoped.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Moped.kt\nandroidx/compose/material/icons/rounded/MopedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:126\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 Moped.kt\nandroidx/compose/material/icons/rounded/MopedKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n59#1:142,18\n59#1:179\n71#1:180,18\n71#1:217\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n59#1:160,2\n59#1:162,2\n59#1:168,11\n71#1:198,2\n71#1:200,2\n71#1:206,11\n30#1:126,4\n59#1:164,4\n71#1:202,4\n*E\n"
    }
.end annotation


# static fields
.field private static _moped:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoped(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MopedKt;->_moped:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Moped"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40733333    # -1.1f

    .line 84
    .line 85
    .line 86
    const v23, -0x4099999a    # -0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40000000    # -2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, -0x40800000    # -1.0f

    .line 102
    .line 103
    const/high16 v26, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const v21, -0x40f33333    # -0.55f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const/high16 v23, -0x40800000    # -1.0f

    .line 111
    .line 112
    const v24, 0x3ee66666    # 0.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const v22, 0x3f0ccccd    # 0.55f

    .line 127
    .line 128
    .line 129
    const v23, 0x3ee66666    # 0.45f

    .line 130
    .line 131
    .line 132
    const/high16 v24, 0x3f800000    # 1.0f

    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x40000000    # 2.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x4029999a    # 2.65f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x415851ec    # 13.52f

    .line 149
    .line 150
    .line 151
    const/high16 v6, 0x41600000    # 14.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41200000    # 10.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, -0x3f800000    # -4.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, -0x40800000    # -1.0f

    .line 167
    .line 168
    const/high16 v26, -0x40800000    # -1.0f

    .line 169
    .line 170
    const v22, -0x40f33333    # -0.55f

    .line 171
    .line 172
    .line 173
    const v23, -0x4119999a    # -0.45f

    .line 174
    .line 175
    .line 176
    const/high16 v24, -0x40800000    # -1.0f

    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40c00000    # 6.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, -0x3f800000    # -4.0f

    .line 187
    .line 188
    const/high16 v26, 0x40800000    # 4.0f

    .line 189
    .line 190
    const v21, -0x3ff28f5c    # -2.21f

    .line 191
    .line 192
    .line 193
    const/16 v22, 0x0

    .line 194
    .line 195
    const/high16 v23, -0x3f800000    # -4.0f

    .line 196
    .line 197
    const v24, 0x3fe51eb8    # 1.79f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x40400000    # 3.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x40000000    # 2.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x40400000    # 3.0f

    .line 214
    .line 215
    const/high16 v26, 0x40400000    # 3.0f

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, 0x3fd47ae1    # 1.66f

    .line 220
    .line 221
    .line 222
    const v23, 0x3fab851f    # 1.34f

    .line 223
    .line 224
    .line 225
    const/high16 v24, 0x40400000    # 3.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 231
    .line 232
    const v6, -0x40547ae1    # -1.34f

    .line 233
    .line 234
    .line 235
    const/high16 v7, 0x40400000    # 3.0f

    .line 236
    .line 237
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x408f5c29    # 4.48f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x4125999a    # 10.35f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x41980000    # 19.0f

    .line 250
    .line 251
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40e00000    # 7.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v6, 0x41880000    # 17.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v25, -0x40800000    # -1.0f

    .line 268
    .line 269
    const/high16 v26, -0x40800000    # -1.0f

    .line 270
    .line 271
    const v21, -0x40f33333    # -0.55f

    .line 272
    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    const/high16 v23, -0x40800000    # -1.0f

    .line 277
    .line 278
    const v24, -0x4119999a    # -0.45f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40000000    # 2.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x40e00000    # 7.0f

    .line 290
    .line 291
    const/high16 v26, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v21, 0x41000000    # 8.0f

    .line 294
    .line 295
    const v22, 0x41846666    # 16.55f

    .line 296
    .line 297
    .line 298
    const v23, 0x40f1999a    # 7.55f

    .line 299
    .line 300
    .line 301
    const/high16 v24, 0x41880000    # 17.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/16 v16, 0x3800

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/high16 v8, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/high16 v9, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v12, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const/4 v14, 0x0

    .line 328
    const/4 v15, 0x0

    .line 329
    const-string v4, ""

    .line 330
    .line 331
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 339
    .line 340
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 341
    .line 342
    .line 343
    move-result-wide v6

    .line 344
    const/4 v2, 0x0

    .line 345
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x41100000    # 9.0f

    .line 362
    .line 363
    const/high16 v6, 0x40c00000    # 6.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x40c00000    # 6.0f

    .line 369
    .line 370
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v25, 0x40a00000    # 5.0f

    .line 374
    .line 375
    const/high16 v26, 0x40e00000    # 7.0f

    .line 376
    .line 377
    const v21, 0x40ae6666    # 5.45f

    .line 378
    .line 379
    .line 380
    const/high16 v22, 0x40c00000    # 6.0f

    .line 381
    .line 382
    const/high16 v23, 0x40a00000    # 5.0f

    .line 383
    .line 384
    const v24, 0x40ce6666    # 6.45f

    .line 385
    .line 386
    .line 387
    move-object/from16 v20, v2

    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/4 v4, 0x0

    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v25, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v26, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/16 v21, 0x0

    .line 401
    .line 402
    const v22, 0x3f0ccccd    # 0.55f

    .line 403
    .line 404
    .line 405
    const v23, 0x3ee66666    # 0.45f

    .line 406
    .line 407
    .line 408
    const/high16 v24, 0x3f800000    # 1.0f

    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x40400000    # 3.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v26, -0x40800000    # -1.0f

    .line 419
    .line 420
    const v21, 0x3f0ccccd    # 0.55f

    .line 421
    .line 422
    .line 423
    const/16 v22, 0x0

    .line 424
    .line 425
    const/high16 v23, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const v24, -0x4119999a    # -0.45f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/4 v4, 0x0

    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v25, 0x41100000    # 9.0f

    .line 438
    .line 439
    const/high16 v26, 0x40c00000    # 6.0f

    .line 440
    .line 441
    const/high16 v21, 0x41200000    # 10.0f

    .line 442
    .line 443
    const v22, 0x40ce6666    # 6.45f

    .line 444
    .line 445
    .line 446
    const v23, 0x4118cccd    # 9.55f

    .line 447
    .line 448
    .line 449
    const/high16 v24, 0x40c00000    # 6.0f

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const/high16 v6, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const-string v4, ""

    .line 465
    .line 466
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 467
    .line 468
    .line 469
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 474
    .line 475
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 476
    .line 477
    .line 478
    move-result-wide v6

    .line 479
    const/4 v0, 0x0

    .line 480
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41500000    # 13.0f

    .line 497
    .line 498
    const/high16 v2, 0x41980000    # 19.0f

    .line 499
    .line 500
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 504
    .line 505
    const/high16 v18, 0x40400000    # 3.0f

    .line 506
    .line 507
    const v13, -0x402b851f    # -1.66f

    .line 508
    .line 509
    .line 510
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 511
    .line 512
    const v16, 0x3fab851f    # 1.34f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x3fab851f    # 1.34f

    .line 519
    .line 520
    .line 521
    const/high16 v2, 0x40400000    # 3.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 527
    .line 528
    const v2, -0x40547ae1    # -1.34f

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x40400000    # 3.0f

    .line 532
    .line 533
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x41a547ae    # 20.66f

    .line 537
    .line 538
    .line 539
    const/high16 v2, 0x41500000    # 13.0f

    .line 540
    .line 541
    const/high16 v4, 0x41980000    # 19.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x41880000    # 17.0f

    .line 550
    .line 551
    const/high16 v2, 0x41980000    # 19.0f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, -0x40800000    # -1.0f

    .line 557
    .line 558
    const/high16 v18, -0x40800000    # -1.0f

    .line 559
    .line 560
    const v13, -0x40f33333    # -0.55f

    .line 561
    .line 562
    .line 563
    const/high16 v15, -0x40800000    # -1.0f

    .line 564
    .line 565
    const v16, -0x4119999a    # -0.45f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, -0x40800000    # -1.0f

    .line 572
    .line 573
    const v2, 0x3ee66666    # 0.45f

    .line 574
    .line 575
    .line 576
    const/high16 v4, 0x3f800000    # 1.0f

    .line 577
    .line 578
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x3ee66666    # 0.45f

    .line 582
    .line 583
    .line 584
    const/high16 v2, 0x3f800000    # 1.0f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x419c6666    # 19.55f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x41880000    # 17.0f

    .line 593
    .line 594
    const/high16 v4, 0x41980000    # 19.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    const/16 v16, 0x3800

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    const/high16 v6, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v7, 0x0

    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v15, 0x0

    .line 617
    const-string v4, ""

    .line 618
    .line 619
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    sput-object v0, Landroidx/compose/material/icons/rounded/MopedKt;->_moped:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 628
    .line 629
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    return-object v0
.end method
