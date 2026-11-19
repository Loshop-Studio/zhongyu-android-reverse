.class public final Landroidx/compose/material/icons/outlined/LightModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lightMode",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LightMode",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getLightMode",
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
        "SMAP\nLightMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightMode.kt\nandroidx/compose/material/icons/outlined/LightModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n72#5,4:149\n*S KotlinDebug\n*F\n+ 1 LightMode.kt\nandroidx/compose/material/icons/outlined/LightModeKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n30#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLightMode(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LightModeKt;->_lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LightMode"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v18, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v13, 0x3fd33333    # 1.65f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40400000    # 3.0f

    .line 86
    .line 87
    const v16, 0x3faccccd    # 1.35f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40400000    # 3.0f

    .line 94
    .line 95
    const v2, -0x40533333    # -1.35f

    .line 96
    .line 97
    .line 98
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, -0x40533333    # -1.35f

    .line 104
    .line 105
    .line 106
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 107
    .line 108
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4125999a    # 10.35f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v4, 0x41400000    # 12.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40e00000    # 7.0f

    .line 122
    .line 123
    const/high16 v2, 0x41400000    # 12.0f

    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, -0x3f600000    # -5.0f

    .line 129
    .line 130
    const/high16 v18, 0x40a00000    # 5.0f

    .line 131
    .line 132
    const v13, -0x3fcf5c29    # -2.76f

    .line 133
    .line 134
    .line 135
    const/high16 v15, -0x3f600000    # -5.0f

    .line 136
    .line 137
    const v16, 0x400f5c29    # 2.24f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x400f5c29    # 2.24f

    .line 144
    .line 145
    .line 146
    const/high16 v2, 0x40a00000    # 5.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, -0x3ff0a3d7    # -2.24f

    .line 152
    .line 153
    .line 154
    const/high16 v2, -0x3f600000    # -5.0f

    .line 155
    .line 156
    const/high16 v4, 0x40a00000    # 5.0f

    .line 157
    .line 158
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x416c28f6    # 14.76f

    .line 162
    .line 163
    .line 164
    const/high16 v2, 0x40e00000    # 7.0f

    .line 165
    .line 166
    const/high16 v4, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40e00000    # 7.0f

    .line 172
    .line 173
    const/high16 v2, 0x41400000    # 12.0f

    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41500000    # 13.0f

    .line 182
    .line 183
    const/high16 v2, 0x40000000    # 2.0f

    .line 184
    .line 185
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v17, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/high16 v18, -0x40800000    # -1.0f

    .line 195
    .line 196
    const v13, 0x3f0ccccd    # 0.55f

    .line 197
    .line 198
    .line 199
    const/high16 v15, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const v16, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x4119999a    # -0.45f

    .line 208
    .line 209
    .line 210
    const/high16 v2, -0x40800000    # -1.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, -0x40000000    # -2.0f

    .line 216
    .line 217
    const/4 v2, 0x0

    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, -0x40800000    # -1.0f

    .line 222
    .line 223
    const/high16 v18, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const v13, -0x40f33333    # -0.55f

    .line 226
    .line 227
    .line 228
    const/high16 v15, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v16, 0x3ee66666    # 0.45f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x3fb9999a    # 1.45f

    .line 237
    .line 238
    .line 239
    const/high16 v2, 0x41500000    # 13.0f

    .line 240
    .line 241
    const/high16 v4, 0x40000000    # 2.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41a00000    # 20.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    const/high16 v2, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/high16 v18, -0x40800000    # -1.0f

    .line 263
    .line 264
    const v13, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const/high16 v15, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const v16, -0x4119999a    # -0.45f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x4119999a    # -0.45f

    .line 276
    .line 277
    .line 278
    const/high16 v2, -0x40800000    # -1.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, -0x40000000    # -2.0f

    .line 284
    .line 285
    const/4 v2, 0x0

    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40800000    # -1.0f

    .line 290
    .line 291
    const/high16 v18, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const v13, -0x40f33333    # -0.55f

    .line 294
    .line 295
    .line 296
    const/high16 v15, -0x40800000    # -1.0f

    .line 297
    .line 298
    const v16, 0x3ee66666    # 0.45f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x419b999a    # 19.45f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x41a00000    # 20.0f

    .line 308
    .line 309
    const/high16 v4, 0x41500000    # 13.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41300000    # 11.0f

    .line 318
    .line 319
    const/high16 v2, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x40000000    # 2.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, 0x3f0ccccd    # 0.55f

    .line 333
    .line 334
    .line 335
    const v15, 0x3ee66666    # 0.45f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x3f800000    # 1.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const v2, -0x4119999a    # -0.45f

    .line 346
    .line 347
    .line 348
    const/high16 v4, -0x40800000    # -1.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40000000    # 2.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, -0x40800000    # -1.0f

    .line 359
    .line 360
    const/high16 v18, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v14, -0x40f33333    # -0.55f

    .line 363
    .line 364
    .line 365
    const v15, -0x4119999a    # -0.45f

    .line 366
    .line 367
    .line 368
    const/high16 v16, -0x40800000    # -1.0f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3fb9999a    # 1.45f

    .line 374
    .line 375
    .line 376
    const/high16 v2, 0x41300000    # 11.0f

    .line 377
    .line 378
    const/high16 v4, 0x40000000    # 2.0f

    .line 379
    .line 380
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41a00000    # 20.0f

    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v18, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const v14, 0x3f0ccccd    # 0.55f

    .line 401
    .line 402
    .line 403
    const v15, 0x3ee66666    # 0.45f

    .line 404
    .line 405
    .line 406
    const/high16 v16, 0x3f800000    # 1.0f

    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const v2, -0x4119999a    # -0.45f

    .line 414
    .line 415
    .line 416
    const/high16 v4, -0x40800000    # -1.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, -0x40000000    # -2.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, -0x40800000    # -1.0f

    .line 427
    .line 428
    const/high16 v18, -0x40800000    # -1.0f

    .line 429
    .line 430
    const v14, -0x40f33333    # -0.55f

    .line 431
    .line 432
    .line 433
    const v15, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v16, -0x40800000    # -1.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x41300000    # 11.0f

    .line 442
    .line 443
    const/high16 v18, 0x41a00000    # 20.0f

    .line 444
    .line 445
    const v13, 0x41373333    # 11.45f

    .line 446
    .line 447
    .line 448
    const/high16 v14, 0x41980000    # 19.0f

    .line 449
    .line 450
    const/high16 v15, 0x41300000    # 11.0f

    .line 451
    .line 452
    const v16, 0x419b999a    # 19.45f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x40928f5c    # 4.58f

    .line 462
    .line 463
    .line 464
    const v2, 0x40bfae14    # 5.99f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, -0x404b851f    # -1.41f

    .line 471
    .line 472
    .line 473
    const/16 v18, 0x0

    .line 474
    .line 475
    const v13, -0x413851ec    # -0.39f

    .line 476
    .line 477
    .line 478
    const v14, -0x413851ec    # -0.39f

    .line 479
    .line 480
    .line 481
    const v15, -0x407c28f6    # -1.03f

    .line 482
    .line 483
    .line 484
    const v16, -0x413851ec    # -0.39f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/16 v17, 0x0

    .line 491
    .line 492
    const v18, 0x3fb47ae1    # 1.41f

    .line 493
    .line 494
    .line 495
    const v14, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v15, -0x413851ec    # -0.39f

    .line 499
    .line 500
    .line 501
    const v16, 0x3f83d70a    # 1.03f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3f87ae14    # 1.06f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3fb47ae1    # 1.41f

    .line 514
    .line 515
    .line 516
    const/16 v18, 0x0

    .line 517
    .line 518
    const v13, 0x3ec7ae14    # 0.39f

    .line 519
    .line 520
    .line 521
    const v15, 0x3f83d70a    # 1.03f

    .line 522
    .line 523
    .line 524
    const v16, 0x3ec7ae14    # 0.39f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, -0x407c28f6    # -1.03f

    .line 531
    .line 532
    .line 533
    const v2, -0x404b851f    # -1.41f

    .line 534
    .line 535
    .line 536
    const v4, 0x3ec7ae14    # 0.39f

    .line 537
    .line 538
    .line 539
    const/4 v6, 0x0

    .line 540
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x40928f5c    # 4.58f

    .line 544
    .line 545
    .line 546
    const v2, 0x40bfae14    # 5.99f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x4187999a    # 16.95f

    .line 556
    .line 557
    .line 558
    const v2, 0x4192e148    # 18.36f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x404b851f    # -1.41f

    .line 565
    .line 566
    .line 567
    const v13, -0x413851ec    # -0.39f

    .line 568
    .line 569
    .line 570
    const v14, -0x413851ec    # -0.39f

    .line 571
    .line 572
    .line 573
    const v15, -0x407c28f6    # -1.03f

    .line 574
    .line 575
    .line 576
    const v16, -0x413851ec    # -0.39f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const v18, 0x3fb47ae1    # 1.41f

    .line 585
    .line 586
    .line 587
    const v14, 0x3ec7ae14    # 0.39f

    .line 588
    .line 589
    .line 590
    const v15, -0x413851ec    # -0.39f

    .line 591
    .line 592
    .line 593
    const v16, 0x3f83d70a    # 1.03f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3f87ae14    # 1.06f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, 0x3fb47ae1    # 1.41f

    .line 606
    .line 607
    .line 608
    const/16 v18, 0x0

    .line 609
    .line 610
    const v13, 0x3ec7ae14    # 0.39f

    .line 611
    .line 612
    .line 613
    const v15, 0x3f83d70a    # 1.03f

    .line 614
    .line 615
    .line 616
    const v16, 0x3ec7ae14    # 0.39f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const v18, -0x404b851f    # -1.41f

    .line 625
    .line 626
    .line 627
    const v14, -0x413851ec    # -0.39f

    .line 628
    .line 629
    .line 630
    const v15, 0x3ec7ae14    # 0.39f

    .line 631
    .line 632
    .line 633
    const v16, -0x407c28f6    # -1.03f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x4187999a    # 16.95f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x419b5c29    # 19.42f

    .line 649
    .line 650
    .line 651
    const v2, 0x40bfae14    # 5.99f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, -0x404b851f    # -1.41f

    .line 661
    .line 662
    .line 663
    const/16 v18, 0x0

    .line 664
    .line 665
    const v13, -0x413851ec    # -0.39f

    .line 666
    .line 667
    .line 668
    const v15, -0x407c28f6    # -1.03f

    .line 669
    .line 670
    .line 671
    const v16, -0x413851ec    # -0.39f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, -0x407851ec    # -1.06f

    .line 678
    .line 679
    .line 680
    const v2, 0x3f87ae14    # 1.06f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const v18, 0x3fb47ae1    # 1.41f

    .line 689
    .line 690
    .line 691
    const v14, 0x3ec7ae14    # 0.39f

    .line 692
    .line 693
    .line 694
    const v15, -0x413851ec    # -0.39f

    .line 695
    .line 696
    .line 697
    const v16, 0x3f83d70a    # 1.03f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x3f83d70a    # 1.03f

    .line 704
    .line 705
    .line 706
    const v2, 0x3fb47ae1    # 1.41f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x419b5c29    # 19.42f

    .line 713
    .line 714
    .line 715
    const v2, 0x40bfae14    # 5.99f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, 0x40e1999a    # 7.05f

    .line 725
    .line 726
    .line 727
    const v2, 0x4192e148    # 18.36f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v18, -0x404b851f    # -1.41f

    .line 734
    .line 735
    .line 736
    const v13, 0x3ec7ae14    # 0.39f

    .line 737
    .line 738
    .line 739
    const v14, -0x413851ec    # -0.39f

    .line 740
    .line 741
    .line 742
    const v15, 0x3ec7ae14    # 0.39f

    .line 743
    .line 744
    .line 745
    const v16, -0x407c28f6    # -1.03f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v17, -0x404b851f    # -1.41f

    .line 752
    .line 753
    .line 754
    const/16 v18, 0x0

    .line 755
    .line 756
    const v13, -0x413851ec    # -0.39f

    .line 757
    .line 758
    .line 759
    const v15, -0x407c28f6    # -1.03f

    .line 760
    .line 761
    .line 762
    const v16, -0x413851ec    # -0.39f

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, -0x407851ec    # -1.06f

    .line 769
    .line 770
    .line 771
    const v2, 0x3f87ae14    # 1.06f

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const v18, 0x3fb47ae1    # 1.41f

    .line 780
    .line 781
    .line 782
    const v14, 0x3ec7ae14    # 0.39f

    .line 783
    .line 784
    .line 785
    const v15, -0x413851ec    # -0.39f

    .line 786
    .line 787
    .line 788
    const v16, 0x3f83d70a    # 1.03f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, 0x3f83d70a    # 1.03f

    .line 795
    .line 796
    .line 797
    const v2, 0x3fb47ae1    # 1.41f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v0, 0x40e1999a    # 7.05f

    .line 804
    .line 805
    .line 806
    const v2, 0x4192e148    # 18.36f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    const/16 v16, 0x3800

    .line 820
    .line 821
    const/16 v17, 0x0

    .line 822
    .line 823
    const/high16 v6, 0x3f800000    # 1.0f

    .line 824
    .line 825
    const/high16 v8, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/4 v7, 0x0

    .line 828
    const/high16 v9, 0x3f800000    # 1.0f

    .line 829
    .line 830
    const/high16 v12, 0x3f800000    # 1.0f

    .line 831
    .line 832
    const/4 v13, 0x0

    .line 833
    const/4 v14, 0x0

    .line 834
    const/4 v15, 0x0

    .line 835
    const-string v4, ""

    .line 836
    .line 837
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    sput-object v0, Landroidx/compose/material/icons/outlined/LightModeKt;->_lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 846
    .line 847
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    return-object v0
.end method
