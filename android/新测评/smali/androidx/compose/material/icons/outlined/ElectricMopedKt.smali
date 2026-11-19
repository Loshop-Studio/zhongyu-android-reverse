.class public final Landroidx/compose/material/icons/outlined/ElectricMopedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_electricMoped",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ElectricMoped",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getElectricMoped",
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
        "SMAP\nElectricMoped.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricMoped.kt\nandroidx/compose/material/icons/outlined/ElectricMopedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n233#2,18:226\n253#2:263\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n705#4,2:244\n717#4,2:246\n719#4,11:252\n72#5,4:134\n72#5,4:172\n72#5,4:210\n72#5,4:248\n*S KotlinDebug\n*F\n+ 1 ElectricMoped.kt\nandroidx/compose/material/icons/outlined/ElectricMopedKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n63#1:150,18\n63#1:187\n70#1:188,18\n70#1:225\n84#1:226,18\n84#1:263\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n63#1:168,2\n63#1:170,2\n63#1:176,11\n70#1:206,2\n70#1:208,2\n70#1:214,11\n84#1:244,2\n84#1:246,2\n84#1:252,11\n30#1:134,4\n63#1:172,4\n70#1:210,4\n84#1:248,4\n*E\n"
    }
.end annotation


# static fields
.field private static _electricMoped:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricMoped(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ElectricMopedKt;->_electricMoped:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ElectricMoped"

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
    const/high16 v4, 0x40a00000    # 5.0f

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
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40400000    # 3.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x4029999a    # 2.65f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x415851ec    # 13.52f

    .line 118
    .line 119
    .line 120
    const/high16 v6, 0x41400000    # 12.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41200000    # 10.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x40c00000    # 6.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, -0x3f800000    # -4.0f

    .line 141
    .line 142
    const/high16 v26, 0x40800000    # 4.0f

    .line 143
    .line 144
    const v21, -0x3ff28f5c    # -2.21f

    .line 145
    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const/high16 v23, -0x3f800000    # -4.0f

    .line 150
    .line 151
    const v24, 0x3fe51eb8    # 1.79f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x40400000    # 3.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40000000    # 2.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x40400000    # 3.0f

    .line 168
    .line 169
    const/high16 v26, 0x40400000    # 3.0f

    .line 170
    .line 171
    const/16 v21, 0x0

    .line 172
    .line 173
    const v22, 0x3fd47ae1    # 1.66f

    .line 174
    .line 175
    .line 176
    const v23, 0x3fab851f    # 1.34f

    .line 177
    .line 178
    .line 179
    const/high16 v24, 0x40400000    # 3.0f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, -0x40547ae1    # -1.34f

    .line 185
    .line 186
    .line 187
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 188
    .line 189
    const/high16 v7, 0x40400000    # 3.0f

    .line 190
    .line 191
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x408f5c29    # 4.48f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x4105999a    # 8.35f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x41980000    # 19.0f

    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x40a00000    # 5.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41400000    # 12.0f

    .line 217
    .line 218
    const/high16 v6, 0x40800000    # 4.0f

    .line 219
    .line 220
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x40000000    # 2.0f

    .line 229
    .line 230
    const/high16 v26, -0x40000000    # -2.0f

    .line 231
    .line 232
    const v22, -0x40733333    # -1.1f

    .line 233
    .line 234
    .line 235
    const v23, 0x3f666666    # 0.9f

    .line 236
    .line 237
    .line 238
    const/high16 v24, -0x40000000    # -2.0f

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40000000    # 2.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x40400000    # 3.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x40e00000    # 7.0f

    .line 262
    .line 263
    const/high16 v6, 0x41700000    # 15.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, -0x40800000    # -1.0f

    .line 269
    .line 270
    const/high16 v26, -0x40800000    # -1.0f

    .line 271
    .line 272
    const v21, -0x40f33333    # -0.55f

    .line 273
    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    const/high16 v23, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v24, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/high16 v26, 0x41700000    # 15.0f

    .line 293
    .line 294
    const/high16 v21, 0x41000000    # 8.0f

    .line 295
    .line 296
    const v22, 0x4168cccd    # 14.55f

    .line 297
    .line 298
    .line 299
    const v23, 0x40f1999a    # 7.55f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x41700000    # 15.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const/16 v16, 0x3800

    .line 315
    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    const/high16 v6, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/high16 v8, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    const/high16 v9, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/high16 v12, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const/4 v14, 0x0

    .line 329
    const/4 v15, 0x0

    .line 330
    const-string v4, ""

    .line 331
    .line 332
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 340
    .line 341
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x40800000    # 4.0f

    .line 363
    .line 364
    const/high16 v6, 0x40a00000    # 5.0f

    .line 365
    .line 366
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40a00000    # 5.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x40000000    # 2.0f

    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, -0x3f600000    # -5.0f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const-string v4, ""

    .line 395
    .line 396
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 397
    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 404
    .line 405
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    const/4 v2, 0x0

    .line 410
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x41300000    # 11.0f

    .line 427
    .line 428
    const/high16 v6, 0x41980000    # 19.0f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 434
    .line 435
    const/high16 v26, 0x40400000    # 3.0f

    .line 436
    .line 437
    const v21, -0x402b851f    # -1.66f

    .line 438
    .line 439
    .line 440
    const/16 v22, 0x0

    .line 441
    .line 442
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 443
    .line 444
    const v24, 0x3fab851f    # 1.34f

    .line 445
    .line 446
    .line 447
    move-object/from16 v20, v2

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, 0x3fab851f    # 1.34f

    .line 453
    .line 454
    .line 455
    const/high16 v6, 0x40400000    # 3.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, -0x40547ae1    # -1.34f

    .line 461
    .line 462
    .line 463
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 464
    .line 465
    const/high16 v7, 0x40400000    # 3.0f

    .line 466
    .line 467
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, 0x41a547ae    # 20.66f

    .line 471
    .line 472
    .line 473
    const/high16 v6, 0x41300000    # 11.0f

    .line 474
    .line 475
    const/high16 v7, 0x41980000    # 19.0f

    .line 476
    .line 477
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v4, 0x41700000    # 15.0f

    .line 484
    .line 485
    const/high16 v6, 0x41980000    # 19.0f

    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v25, -0x40800000    # -1.0f

    .line 491
    .line 492
    const/high16 v26, -0x40800000    # -1.0f

    .line 493
    .line 494
    const v21, -0x40f33333    # -0.55f

    .line 495
    .line 496
    .line 497
    const/high16 v23, -0x40800000    # -1.0f

    .line 498
    .line 499
    const v24, -0x4119999a    # -0.45f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x3ee66666    # 0.45f

    .line 506
    .line 507
    .line 508
    const/high16 v6, -0x40800000    # -1.0f

    .line 509
    .line 510
    const/high16 v7, 0x3f800000    # 1.0f

    .line 511
    .line 512
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v6, 0x3f800000    # 1.0f

    .line 516
    .line 517
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v4, 0x419c6666    # 19.55f

    .line 521
    .line 522
    .line 523
    const/high16 v6, 0x41700000    # 15.0f

    .line 524
    .line 525
    const/high16 v7, 0x41980000    # 19.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v7, 0x0

    .line 540
    const-string v4, ""

    .line 541
    .line 542
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 543
    .line 544
    .line 545
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 550
    .line 551
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 552
    .line 553
    .line 554
    move-result-wide v6

    .line 555
    const/4 v0, 0x0

    .line 556
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 564
    .line 565
    .line 566
    move-result v11

    .line 567
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 570
    .line 571
    .line 572
    const/high16 v2, 0x41a00000    # 20.0f

    .line 573
    .line 574
    const/high16 v4, 0x40e00000    # 7.0f

    .line 575
    .line 576
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/4 v2, 0x0

    .line 580
    const/high16 v4, 0x40800000    # 4.0f

    .line 581
    .line 582
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v2, -0x40000000    # -2.0f

    .line 586
    .line 587
    const/4 v4, 0x0

    .line 588
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v2, 0x40c00000    # 6.0f

    .line 592
    .line 593
    const/high16 v4, 0x40400000    # 3.0f

    .line 594
    .line 595
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v2, -0x3f800000    # -4.0f

    .line 599
    .line 600
    const/4 v4, 0x0

    .line 601
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/4 v2, 0x0

    .line 605
    const/high16 v4, 0x40000000    # 2.0f

    .line 606
    .line 607
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/high16 v6, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const/4 v7, 0x0

    .line 620
    const-string v4, ""

    .line 621
    .line 622
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    sput-object v0, Landroidx/compose/material/icons/outlined/ElectricMopedKt;->_electricMoped:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    return-object v0
.end method
