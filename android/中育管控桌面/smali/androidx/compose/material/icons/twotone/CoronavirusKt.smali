.class public final Landroidx/compose/material/icons/twotone/CoronavirusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_coronavirus",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Coronavirus",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCoronavirus",
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
        "SMAP\nCoronavirus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/twotone/CoronavirusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,207:1\n212#2,12:208\n233#2,18:221\n253#2:258\n233#2,18:259\n253#2:296\n174#3:220\n705#4,2:239\n717#4,2:241\n719#4,11:247\n705#4,2:277\n717#4,2:279\n719#4,11:285\n72#5,4:243\n72#5,4:281\n*S KotlinDebug\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/twotone/CoronavirusKt\n*L\n29#1:208,12\n30#1:221,18\n30#1:258\n80#1:259,18\n80#1:296\n29#1:220\n30#1:239,2\n30#1:241,2\n30#1:247,11\n80#1:277,2\n80#1:279,2\n80#1:285,11\n30#1:243,4\n80#1:281,4\n*E\n"
    }
.end annotation


# static fields
.field private static _coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoronavirus(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Coronavirus"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f600000    # -5.0f

    .line 78
    .line 79
    const/high16 v26, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v21, -0x3fcf5c29    # -2.76f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f600000    # -5.0f

    .line 87
    .line 88
    const v24, 0x400f5c29    # 2.24f

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
    const v4, 0x400f5c29    # 2.24f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40a00000    # 5.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3ff0a3d7    # -2.24f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f600000    # -5.0f

    .line 108
    .line 109
    const/high16 v7, 0x40a00000    # 5.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x416c28f6    # 14.76f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40e00000    # 7.0f

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 128
    .line 129
    const/high16 v6, 0x415c0000    # 13.75f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v26, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const v21, 0x3f0ccccd    # 0.55f

    .line 139
    .line 140
    .line 141
    const/high16 v23, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v24, 0x3ee66666    # 0.45f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, -0x4119999a    # -0.45f

    .line 150
    .line 151
    .line 152
    const/high16 v6, -0x40800000    # -1.0f

    .line 153
    .line 154
    const/high16 v7, 0x3f800000    # 1.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x41533333    # 13.2f

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x41000000    # 8.0f

    .line 166
    .line 167
    const/high16 v7, 0x415c0000    # 13.75f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x41240000    # 10.25f

    .line 176
    .line 177
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x4119999a    # -0.45f

    .line 184
    .line 185
    .line 186
    const/high16 v6, -0x40800000    # -1.0f

    .line 187
    .line 188
    const/high16 v7, 0x3f800000    # 1.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x411b3333    # 9.7f

    .line 197
    .line 198
    .line 199
    const/high16 v6, 0x41240000    # 10.25f

    .line 200
    .line 201
    const/high16 v7, 0x41000000    # 8.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x41080000    # 8.5f

    .line 210
    .line 211
    const/high16 v6, 0x41500000    # 13.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, -0x40800000    # -1.0f

    .line 217
    .line 218
    const/high16 v26, -0x40800000    # -1.0f

    .line 219
    .line 220
    const v21, -0x40f33333    # -0.55f

    .line 221
    .line 222
    .line 223
    const/high16 v23, -0x40800000    # -1.0f

    .line 224
    .line 225
    const v24, -0x4119999a    # -0.45f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    const v22, -0x40f33333    # -0.55f

    .line 236
    .line 237
    .line 238
    const v23, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    const/high16 v24, -0x40800000    # -1.0f

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x3ee66666    # 0.45f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 250
    .line 251
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v25, 0x41080000    # 8.5f

    .line 255
    .line 256
    const/high16 v26, 0x41500000    # 13.0f

    .line 257
    .line 258
    const/high16 v21, 0x41180000    # 9.5f

    .line 259
    .line 260
    const v22, 0x4148cccd    # 12.55f

    .line 261
    .line 262
    .line 263
    const v23, 0x4110cccd    # 9.05f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x41500000    # 13.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x41800000    # 16.0f

    .line 275
    .line 276
    const/high16 v6, 0x41240000    # 10.25f

    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, -0x40800000    # -1.0f

    .line 282
    .line 283
    const/high16 v26, -0x40800000    # -1.0f

    .line 284
    .line 285
    const v21, -0x40f33333    # -0.55f

    .line 286
    .line 287
    .line 288
    const/16 v22, 0x0

    .line 289
    .line 290
    const/high16 v23, -0x40800000    # -1.0f

    .line 291
    .line 292
    const v24, -0x4119999a    # -0.45f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/16 v21, 0x0

    .line 301
    .line 302
    const v22, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    const v23, 0x3ee66666    # 0.45f

    .line 306
    .line 307
    .line 308
    const/high16 v24, -0x40800000    # -1.0f

    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x3ee66666    # 0.45f

    .line 314
    .line 315
    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x41240000    # 10.25f

    .line 322
    .line 323
    const/high16 v26, 0x41800000    # 16.0f

    .line 324
    .line 325
    const/high16 v21, 0x41340000    # 11.25f

    .line 326
    .line 327
    const v22, 0x4178cccd    # 15.55f

    .line 328
    .line 329
    .line 330
    const v23, 0x412ccccd    # 10.8f

    .line 331
    .line 332
    .line 333
    const/high16 v24, 0x41800000    # 16.0f

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v4, 0x41500000    # 13.0f

    .line 342
    .line 343
    const/high16 v6, 0x41400000    # 12.0f

    .line 344
    .line 345
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v25, -0x40800000    # -1.0f

    .line 349
    .line 350
    const/high16 v26, -0x40800000    # -1.0f

    .line 351
    .line 352
    const v21, -0x40f33333    # -0.55f

    .line 353
    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const/high16 v23, -0x40800000    # -1.0f

    .line 358
    .line 359
    const v24, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v25, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/16 v21, 0x0

    .line 368
    .line 369
    const v22, -0x40f33333    # -0.55f

    .line 370
    .line 371
    .line 372
    const v23, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    const/high16 v24, -0x40800000    # -1.0f

    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x3ee66666    # 0.45f

    .line 381
    .line 382
    .line 383
    const/high16 v6, 0x3f800000    # 1.0f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v25, 0x41400000    # 12.0f

    .line 389
    .line 390
    const/high16 v26, 0x41500000    # 13.0f

    .line 391
    .line 392
    const/high16 v21, 0x41500000    # 13.0f

    .line 393
    .line 394
    const v22, 0x4148cccd    # 12.55f

    .line 395
    .line 396
    .line 397
    const v23, 0x4148cccd    # 12.55f

    .line 398
    .line 399
    .line 400
    const/high16 v24, 0x41500000    # 13.0f

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41800000    # 16.0f

    .line 409
    .line 410
    const/high16 v6, 0x415c0000    # 13.75f

    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v25, -0x40800000    # -1.0f

    .line 416
    .line 417
    const/high16 v26, -0x40800000    # -1.0f

    .line 418
    .line 419
    const v21, -0x40f33333    # -0.55f

    .line 420
    .line 421
    .line 422
    const/16 v22, 0x0

    .line 423
    .line 424
    const/high16 v23, -0x40800000    # -1.0f

    .line 425
    .line 426
    const v24, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v25, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/16 v21, 0x0

    .line 435
    .line 436
    const v22, -0x40f33333    # -0.55f

    .line 437
    .line 438
    .line 439
    const v23, 0x3ee66666    # 0.45f

    .line 440
    .line 441
    .line 442
    const/high16 v24, -0x40800000    # -1.0f

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, 0x3ee66666    # 0.45f

    .line 448
    .line 449
    .line 450
    const/high16 v6, 0x3f800000    # 1.0f

    .line 451
    .line 452
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v25, 0x415c0000    # 13.75f

    .line 456
    .line 457
    const/high16 v26, 0x41800000    # 16.0f

    .line 458
    .line 459
    const/high16 v21, 0x416c0000    # 14.75f

    .line 460
    .line 461
    const v22, 0x4178cccd    # 15.55f

    .line 462
    .line 463
    .line 464
    const v23, 0x4164cccd    # 14.3f

    .line 465
    .line 466
    .line 467
    const/high16 v24, 0x41800000    # 16.0f

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v4, 0x41780000    # 15.5f

    .line 476
    .line 477
    const/high16 v6, 0x41500000    # 13.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v25, -0x40800000    # -1.0f

    .line 483
    .line 484
    const/high16 v26, -0x40800000    # -1.0f

    .line 485
    .line 486
    const v21, -0x40f33333    # -0.55f

    .line 487
    .line 488
    .line 489
    const/16 v22, 0x0

    .line 490
    .line 491
    const/high16 v23, -0x40800000    # -1.0f

    .line 492
    .line 493
    const v24, -0x4119999a    # -0.45f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v25, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/16 v21, 0x0

    .line 502
    .line 503
    const v22, -0x40f33333    # -0.55f

    .line 504
    .line 505
    .line 506
    const v23, 0x3ee66666    # 0.45f

    .line 507
    .line 508
    .line 509
    const/high16 v24, -0x40800000    # -1.0f

    .line 510
    .line 511
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x3ee66666    # 0.45f

    .line 515
    .line 516
    .line 517
    const/high16 v6, 0x3f800000    # 1.0f

    .line 518
    .line 519
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v25, 0x41780000    # 15.5f

    .line 523
    .line 524
    const/high16 v26, 0x41500000    # 13.0f

    .line 525
    .line 526
    const/high16 v21, 0x41840000    # 16.5f

    .line 527
    .line 528
    const v22, 0x4148cccd    # 12.55f

    .line 529
    .line 530
    .line 531
    const v23, 0x41806666    # 16.05f

    .line 532
    .line 533
    .line 534
    const/high16 v24, 0x41500000    # 13.0f

    .line 535
    .line 536
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    const/16 v16, 0x3800

    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const v6, 0x3e99999a    # 0.3f

    .line 551
    .line 552
    .line 553
    const v8, 0x3e99999a    # 0.3f

    .line 554
    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 574
    .line 575
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 576
    .line 577
    .line 578
    move-result-wide v6

    .line 579
    const/4 v0, 0x0

    .line 580
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 584
    .line 585
    .line 586
    move-result v10

    .line 587
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 588
    .line 589
    .line 590
    move-result v11

    .line 591
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x41180000    # 9.5f

    .line 597
    .line 598
    const/high16 v2, 0x41400000    # 12.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, -0x40800000    # -1.0f

    .line 604
    .line 605
    const/high16 v18, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const v14, 0x3f0ccccd    # 0.55f

    .line 608
    .line 609
    .line 610
    const v15, -0x4119999a    # -0.45f

    .line 611
    .line 612
    .line 613
    const/high16 v16, 0x3f800000    # 1.0f

    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, -0x4119999a    # -0.45f

    .line 619
    .line 620
    .line 621
    const/high16 v2, -0x40800000    # -1.0f

    .line 622
    .line 623
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v18, -0x40800000    # -1.0f

    .line 629
    .line 630
    const v14, -0x40f33333    # -0.55f

    .line 631
    .line 632
    .line 633
    const v15, 0x3ee66666    # 0.45f

    .line 634
    .line 635
    .line 636
    const/high16 v16, -0x40800000    # -1.0f

    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x41373333    # 11.45f

    .line 642
    .line 643
    .line 644
    const/high16 v2, 0x41180000    # 9.5f

    .line 645
    .line 646
    const/high16 v4, 0x41400000    # 12.0f

    .line 647
    .line 648
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v0, 0x41200000    # 10.0f

    .line 655
    .line 656
    const/high16 v2, 0x415c0000    # 13.75f

    .line 657
    .line 658
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v13, 0x3f0ccccd    # 0.55f

    .line 662
    .line 663
    .line 664
    const/4 v14, 0x0

    .line 665
    const/high16 v15, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const v16, -0x4119999a    # -0.45f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, -0x4119999a    # -0.45f

    .line 674
    .line 675
    .line 676
    const/high16 v2, -0x40800000    # -1.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x3ee66666    # 0.45f

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x3f800000    # 1.0f

    .line 685
    .line 686
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x41533333    # 13.2f

    .line 690
    .line 691
    .line 692
    const/high16 v2, 0x41200000    # 10.0f

    .line 693
    .line 694
    const/high16 v4, 0x415c0000    # 13.75f

    .line 695
    .line 696
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x41200000    # 10.0f

    .line 703
    .line 704
    const/high16 v2, 0x41240000    # 10.25f

    .line 705
    .line 706
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, -0x4119999a    # -0.45f

    .line 713
    .line 714
    .line 715
    const/high16 v2, -0x40800000    # -1.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, 0x3ee66666    # 0.45f

    .line 721
    .line 722
    .line 723
    const/high16 v4, 0x3f800000    # 1.0f

    .line 724
    .line 725
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v0, 0x411b3333    # 9.7f

    .line 729
    .line 730
    .line 731
    const/high16 v2, 0x41200000    # 10.0f

    .line 732
    .line 733
    const/high16 v4, 0x41240000    # 10.25f

    .line 734
    .line 735
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x41600000    # 14.0f

    .line 742
    .line 743
    const/high16 v2, 0x41240000    # 10.25f

    .line 744
    .line 745
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v17, -0x40800000    # -1.0f

    .line 749
    .line 750
    const/high16 v18, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const v13, -0x40f33333    # -0.55f

    .line 753
    .line 754
    .line 755
    const/high16 v15, -0x40800000    # -1.0f

    .line 756
    .line 757
    const v16, 0x3ee66666    # 0.45f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const v14, 0x3f0ccccd    # 0.55f

    .line 767
    .line 768
    .line 769
    const v15, 0x3ee66666    # 0.45f

    .line 770
    .line 771
    .line 772
    const/high16 v16, 0x3f800000    # 1.0f

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v0, -0x4119999a    # -0.45f

    .line 778
    .line 779
    .line 780
    const/high16 v2, -0x40800000    # -1.0f

    .line 781
    .line 782
    const/high16 v4, 0x3f800000    # 1.0f

    .line 783
    .line 784
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v17, 0x41240000    # 10.25f

    .line 788
    .line 789
    const/high16 v18, 0x41600000    # 14.0f

    .line 790
    .line 791
    const/high16 v13, 0x41340000    # 11.25f

    .line 792
    .line 793
    const v14, 0x41673333    # 14.45f

    .line 794
    .line 795
    .line 796
    const v15, 0x412ccccd    # 10.8f

    .line 797
    .line 798
    .line 799
    const/high16 v16, 0x41600000    # 14.0f

    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v0, 0x41b00000    # 22.0f

    .line 808
    .line 809
    const/high16 v2, 0x41340000    # 11.25f

    .line 810
    .line 811
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 815
    .line 816
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v17, -0x40c00000    # -0.75f

    .line 820
    .line 821
    const/high16 v18, 0x3f400000    # 0.75f

    .line 822
    .line 823
    const/4 v13, 0x0

    .line 824
    const v14, 0x3ed1eb85    # 0.41f

    .line 825
    .line 826
    .line 827
    const v15, -0x4151eb85    # -0.34f

    .line 828
    .line 829
    .line 830
    const/high16 v16, 0x3f400000    # 0.75f

    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v18, -0x40c00000    # -0.75f

    .line 836
    .line 837
    const v13, -0x412e147b    # -0.41f

    .line 838
    .line 839
    .line 840
    const/4 v14, 0x0

    .line 841
    const/high16 v15, -0x40c00000    # -0.75f

    .line 842
    .line 843
    const v16, -0x4151eb85    # -0.34f

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v0, -0x403ae148    # -1.54f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v17, -0x403d70a4    # -1.52f

    .line 856
    .line 857
    .line 858
    const v18, 0x4069999a    # 3.65f

    .line 859
    .line 860
    .line 861
    const v13, -0x41e66666    # -0.15f

    .line 862
    .line 863
    .line 864
    const v14, 0x3faf5c29    # 1.37f

    .line 865
    .line 866
    .line 867
    const v15, -0x40cf5c29    # -0.69f

    .line 868
    .line 869
    .line 870
    const v16, 0x402851ec    # 2.63f

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, 0x3f8b851f    # 1.09f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, -0x43dc28f6    # -0.01f

    .line 883
    .line 884
    .line 885
    const v2, 0x3c23d70a    # 0.01f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, 0x3f87ae14    # 1.06f

    .line 892
    .line 893
    .line 894
    const/16 v18, 0x0

    .line 895
    .line 896
    const v13, 0x3e947ae1    # 0.29f

    .line 897
    .line 898
    .line 899
    const v14, -0x416b851f    # -0.29f

    .line 900
    .line 901
    .line 902
    const v15, 0x3f451eb8    # 0.77f

    .line 903
    .line 904
    .line 905
    const v16, -0x416b851f    # -0.29f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/16 v17, 0x0

    .line 912
    .line 913
    const v18, 0x3f87ae14    # 1.06f

    .line 914
    .line 915
    .line 916
    const v14, 0x3e947ae1    # 0.29f

    .line 917
    .line 918
    .line 919
    const v15, 0x3e947ae1    # 0.29f

    .line 920
    .line 921
    .line 922
    const v16, 0x3f451eb8    # 0.77f

    .line 923
    .line 924
    .line 925
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, -0x407851ec    # -1.06f

    .line 929
    .line 930
    .line 931
    const v2, 0x3f87ae14    # 1.06f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, -0x407851ec    # -1.06f

    .line 938
    .line 939
    .line 940
    const/16 v18, 0x0

    .line 941
    .line 942
    const v13, -0x416b851f    # -0.29f

    .line 943
    .line 944
    .line 945
    const v15, -0x40bae148    # -0.77f

    .line 946
    .line 947
    .line 948
    const v16, 0x3e947ae1    # 0.29f

    .line 949
    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v17, -0x43dc28f6    # -0.01f

    .line 955
    .line 956
    .line 957
    const v18, -0x4079999a    # -1.05f

    .line 958
    .line 959
    .line 960
    const v14, -0x416b851f    # -0.29f

    .line 961
    .line 962
    .line 963
    const v15, -0x416b851f    # -0.29f

    .line 964
    .line 965
    .line 966
    const v16, -0x40bd70a4    # -0.76f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v0, -0x40747ae1    # -1.09f

    .line 973
    .line 974
    .line 975
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, -0x3f970a3d    # -3.64f

    .line 979
    .line 980
    .line 981
    const v18, 0x3fc147ae    # 1.51f

    .line 982
    .line 983
    .line 984
    const v13, -0x407d70a4    # -1.02f

    .line 985
    .line 986
    .line 987
    const v14, 0x3f51eb85    # 0.82f

    .line 988
    .line 989
    .line 990
    const v15, -0x3feeb852    # -2.27f

    .line 991
    .line 992
    .line 993
    const v16, 0x3fae147b    # 1.36f

    .line 994
    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v0, 0x3fc51eb8    # 1.54f

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v0, 0x3c23d70a    # 0.01f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1012
    .line 1013
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1014
    .line 1015
    const v13, 0x3ed1eb85    # 0.41f

    .line 1016
    .line 1017
    .line 1018
    const/4 v14, 0x0

    .line 1019
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1020
    .line 1021
    const v16, 0x3eae147b    # 0.34f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1028
    .line 1029
    const/4 v13, 0x0

    .line 1030
    const v14, 0x3ed1eb85    # 0.41f

    .line 1031
    .line 1032
    .line 1033
    const v15, -0x4151eb85    # -0.34f

    .line 1034
    .line 1035
    .line 1036
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1037
    .line 1038
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const/high16 v0, -0x40400000    # -1.5f

    .line 1042
    .line 1043
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1047
    .line 1048
    const v13, -0x412e147b    # -0.41f

    .line 1049
    .line 1050
    .line 1051
    const/4 v14, 0x0

    .line 1052
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1053
    .line 1054
    const v16, -0x4151eb85    # -0.34f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v17, 0x3f3d70a4    # 0.74f

    .line 1061
    .line 1062
    .line 1063
    const/4 v13, 0x0

    .line 1064
    const v14, -0x412e147b    # -0.41f

    .line 1065
    .line 1066
    .line 1067
    const v15, 0x3ea8f5c3    # 0.33f

    .line 1068
    .line 1069
    .line 1070
    const v16, -0x40c28f5c    # -0.74f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v0, -0x4039999a    # -1.55f

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    const v17, -0x3f97ae14    # -3.63f

    .line 1083
    .line 1084
    .line 1085
    const v18, -0x403eb852    # -1.51f

    .line 1086
    .line 1087
    .line 1088
    const v13, -0x4050a3d7    # -1.37f

    .line 1089
    .line 1090
    .line 1091
    const v14, -0x41e66666    # -0.15f

    .line 1092
    .line 1093
    .line 1094
    const v15, -0x3fd851ec    # -2.62f

    .line 1095
    .line 1096
    .line 1097
    const v16, -0x40cf5c29    # -0.69f

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const v0, -0x40747ae1    # -1.09f

    .line 1104
    .line 1105
    .line 1106
    const v2, 0x3f8b851f    # 1.09f

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v0, 0x3c23d70a    # 0.01f

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const/16 v17, 0x0

    .line 1119
    .line 1120
    const v18, 0x3f87ae14    # 1.06f

    .line 1121
    .line 1122
    .line 1123
    const v13, 0x3e947ae1    # 0.29f

    .line 1124
    .line 1125
    .line 1126
    const v14, 0x3e947ae1    # 0.29f

    .line 1127
    .line 1128
    .line 1129
    const v15, 0x3e947ae1    # 0.29f

    .line 1130
    .line 1131
    .line 1132
    const v16, 0x3f451eb8    # 0.77f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const v17, -0x407851ec    # -1.06f

    .line 1139
    .line 1140
    .line 1141
    const/16 v18, 0x0

    .line 1142
    .line 1143
    const v13, -0x416b851f    # -0.29f

    .line 1144
    .line 1145
    .line 1146
    const v15, -0x40bae148    # -0.77f

    .line 1147
    .line 1148
    .line 1149
    const v16, 0x3e947ae1    # 0.29f

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const v0, 0x408ccccd    # 4.4f

    .line 1156
    .line 1157
    .line 1158
    const v2, 0x419451ec    # 18.54f

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const/16 v17, 0x0

    .line 1165
    .line 1166
    const v18, -0x407851ec    # -1.06f

    .line 1167
    .line 1168
    .line 1169
    const v14, -0x416b851f    # -0.29f

    .line 1170
    .line 1171
    .line 1172
    const v15, -0x416b851f    # -0.29f

    .line 1173
    .line 1174
    .line 1175
    const v16, -0x40bae148    # -0.77f

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const v17, 0x3f866666    # 1.05f

    .line 1182
    .line 1183
    .line 1184
    const v18, -0x43dc28f6    # -0.01f

    .line 1185
    .line 1186
    .line 1187
    const v13, 0x3e947ae1    # 0.29f

    .line 1188
    .line 1189
    .line 1190
    const v15, 0x3f428f5c    # 0.76f

    .line 1191
    .line 1192
    .line 1193
    const v16, -0x416b851f    # -0.29f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v0, -0x40747ae1    # -1.09f

    .line 1200
    .line 1201
    .line 1202
    const v2, 0x3f8b851f    # 1.09f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const/high16 v17, -0x40400000    # -1.5f

    .line 1209
    .line 1210
    const v18, -0x3f97ae14    # -3.63f

    .line 1211
    .line 1212
    .line 1213
    const v13, -0x40ae147b    # -0.82f

    .line 1214
    .line 1215
    .line 1216
    const v14, -0x407d70a4    # -1.02f

    .line 1217
    .line 1218
    .line 1219
    const v15, -0x4051eb85    # -1.36f

    .line 1220
    .line 1221
    .line 1222
    const v16, -0x3fef5c29    # -2.26f

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1226
    .line 1227
    .line 1228
    const/high16 v0, 0x40600000    # 3.5f

    .line 1229
    .line 1230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1234
    .line 1235
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1236
    .line 1237
    const/4 v13, 0x0

    .line 1238
    const v14, 0x3ed1eb85    # 0.41f

    .line 1239
    .line 1240
    .line 1241
    const v15, -0x4151eb85    # -0.34f

    .line 1242
    .line 1243
    .line 1244
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1245
    .line 1246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const/high16 v17, 0x40000000    # 2.0f

    .line 1250
    .line 1251
    const/high16 v18, 0x414c0000    # 12.75f

    .line 1252
    .line 1253
    const v13, 0x4015c28f    # 2.34f

    .line 1254
    .line 1255
    .line 1256
    const/high16 v14, 0x41580000    # 13.5f

    .line 1257
    .line 1258
    const/high16 v15, 0x40000000    # 2.0f

    .line 1259
    .line 1260
    const v16, 0x41528f5c    # 13.16f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const/high16 v0, -0x40400000    # -1.5f

    .line 1267
    .line 1268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1272
    .line 1273
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1274
    .line 1275
    const/4 v13, 0x0

    .line 1276
    const v14, -0x412e147b    # -0.41f

    .line 1277
    .line 1278
    .line 1279
    const v15, 0x3eae147b    # 0.34f

    .line 1280
    .line 1281
    .line 1282
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1283
    .line 1284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1288
    .line 1289
    const v13, 0x3ed1eb85    # 0.41f

    .line 1290
    .line 1291
    .line 1292
    const/4 v14, 0x0

    .line 1293
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1294
    .line 1295
    const v16, 0x3eae147b    # 0.34f

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1299
    .line 1300
    .line 1301
    const v0, 0x3fc51eb8    # 1.54f

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 1308
    .line 1309
    const v18, -0x3f97ae14    # -3.63f

    .line 1310
    .line 1311
    .line 1312
    const v13, 0x3e19999a    # 0.15f

    .line 1313
    .line 1314
    .line 1315
    const v14, -0x4050a3d7    # -1.37f

    .line 1316
    .line 1317
    .line 1318
    const v15, 0x3f30a3d7    # 0.69f

    .line 1319
    .line 1320
    .line 1321
    const v16, -0x3fd8f5c3    # -2.61f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v0, 0x40ae6666    # 5.45f

    .line 1328
    .line 1329
    .line 1330
    const v2, 0x40d0f5c3    # 6.53f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    const v17, 0x408ccccd    # 4.4f

    .line 1337
    .line 1338
    .line 1339
    const v18, 0x40d0a3d7    # 6.52f

    .line 1340
    .line 1341
    .line 1342
    const v13, 0x40a51eb8    # 5.16f

    .line 1343
    .line 1344
    .line 1345
    const v14, 0x40d9eb85    # 6.81f

    .line 1346
    .line 1347
    .line 1348
    const v15, 0x4096147b    # 4.69f

    .line 1349
    .line 1350
    .line 1351
    const v16, 0x40d9eb85    # 6.81f

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1355
    .line 1356
    .line 1357
    const/16 v17, 0x0

    .line 1358
    .line 1359
    const v18, -0x407851ec    # -1.06f

    .line 1360
    .line 1361
    .line 1362
    const v13, -0x416b851f    # -0.29f

    .line 1363
    .line 1364
    .line 1365
    const v14, -0x416b851f    # -0.29f

    .line 1366
    .line 1367
    .line 1368
    const v15, -0x416b851f    # -0.29f

    .line 1369
    .line 1370
    .line 1371
    const v16, -0x40bae148    # -0.77f

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1375
    .line 1376
    .line 1377
    const v0, 0x40aeb852    # 5.46f

    .line 1378
    .line 1379
    .line 1380
    const v2, 0x408ccccd    # 4.4f

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1384
    .line 1385
    .line 1386
    const v17, 0x3f87ae14    # 1.06f

    .line 1387
    .line 1388
    .line 1389
    const/16 v18, 0x0

    .line 1390
    .line 1391
    const v13, 0x3e947ae1    # 0.29f

    .line 1392
    .line 1393
    .line 1394
    const v15, 0x3f451eb8    # 0.77f

    .line 1395
    .line 1396
    .line 1397
    const v16, -0x416b851f    # -0.29f

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1401
    .line 1402
    .line 1403
    const/16 v17, 0x0

    .line 1404
    .line 1405
    const v18, 0x3f87ae14    # 1.06f

    .line 1406
    .line 1407
    .line 1408
    const v14, 0x3e947ae1    # 0.29f

    .line 1409
    .line 1410
    .line 1411
    const v15, 0x3e947ae1    # 0.29f

    .line 1412
    .line 1413
    .line 1414
    const v16, 0x3f451eb8    # 0.77f

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    const v0, 0x40d051ec    # 6.51f

    .line 1421
    .line 1422
    .line 1423
    const v2, 0x40af0a3d    # 5.47f

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1427
    .line 1428
    .line 1429
    const v0, 0x40f33333    # 7.6f

    .line 1430
    .line 1431
    .line 1432
    const v2, 0x40d1eb85    # 6.56f

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1436
    .line 1437
    .line 1438
    const v17, 0x406851ec    # 3.63f

    .line 1439
    .line 1440
    .line 1441
    const v18, -0x403eb852    # -1.51f

    .line 1442
    .line 1443
    .line 1444
    const v13, 0x3f828f5c    # 1.02f

    .line 1445
    .line 1446
    .line 1447
    const v14, -0x40ae147b    # -0.82f

    .line 1448
    .line 1449
    .line 1450
    const v15, 0x4010a3d7    # 2.26f

    .line 1451
    .line 1452
    .line 1453
    const v16, -0x4051eb85    # -1.36f

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1457
    .line 1458
    .line 1459
    const/high16 v0, 0x40600000    # 3.5f

    .line 1460
    .line 1461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    const v17, -0x40c28f5c    # -0.74f

    .line 1465
    .line 1466
    .line 1467
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1468
    .line 1469
    const v13, -0x412e147b    # -0.41f

    .line 1470
    .line 1471
    .line 1472
    const v14, -0x43dc28f6    # -0.01f

    .line 1473
    .line 1474
    .line 1475
    const v15, -0x40c28f5c    # -0.74f

    .line 1476
    .line 1477
    .line 1478
    const v16, -0x4151eb85    # -0.34f

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1482
    .line 1483
    .line 1484
    const/high16 v17, 0x41340000    # 11.25f

    .line 1485
    .line 1486
    const/high16 v18, 0x40000000    # 2.0f

    .line 1487
    .line 1488
    const/high16 v13, 0x41280000    # 10.5f

    .line 1489
    .line 1490
    const v14, 0x4015c28f    # 2.34f

    .line 1491
    .line 1492
    .line 1493
    const v15, 0x412d70a4    # 10.84f

    .line 1494
    .line 1495
    .line 1496
    const/high16 v16, 0x40000000    # 2.0f

    .line 1497
    .line 1498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1499
    .line 1500
    .line 1501
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1502
    .line 1503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1504
    .line 1505
    .line 1506
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1507
    .line 1508
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1509
    .line 1510
    const v13, 0x3ed1eb85    # 0.41f

    .line 1511
    .line 1512
    .line 1513
    const/4 v14, 0x0

    .line 1514
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1515
    .line 1516
    const v16, 0x3eae147b    # 0.34f

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1520
    .line 1521
    .line 1522
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1523
    .line 1524
    const/4 v13, 0x0

    .line 1525
    const v14, 0x3ed1eb85    # 0.41f

    .line 1526
    .line 1527
    .line 1528
    const v15, -0x4151eb85    # -0.34f

    .line 1529
    .line 1530
    .line 1531
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1532
    .line 1533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1534
    .line 1535
    .line 1536
    const v0, -0x43dc28f6    # -0.01f

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1540
    .line 1541
    .line 1542
    const v0, 0x3fc51eb8    # 1.54f

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1546
    .line 1547
    .line 1548
    const v17, 0x4068f5c3    # 3.64f

    .line 1549
    .line 1550
    .line 1551
    const v18, 0x3fc147ae    # 1.51f

    .line 1552
    .line 1553
    .line 1554
    const v13, 0x3faf5c29    # 1.37f

    .line 1555
    .line 1556
    .line 1557
    const v14, 0x3e0f5c29    # 0.14f

    .line 1558
    .line 1559
    .line 1560
    const v15, 0x4027ae14    # 2.62f

    .line 1561
    .line 1562
    .line 1563
    const v16, 0x3f30a3d7    # 0.69f

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1567
    .line 1568
    .line 1569
    const v0, -0x40747ae1    # -1.09f

    .line 1570
    .line 1571
    .line 1572
    const v2, 0x3f8b851f    # 1.09f

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1576
    .line 1577
    .line 1578
    const v17, 0x3c23d70a    # 0.01f

    .line 1579
    .line 1580
    .line 1581
    const v18, -0x4079999a    # -1.05f

    .line 1582
    .line 1583
    .line 1584
    const v13, -0x416b851f    # -0.29f

    .line 1585
    .line 1586
    .line 1587
    const v14, -0x416b851f    # -0.29f

    .line 1588
    .line 1589
    .line 1590
    const v15, -0x4170a3d7    # -0.28f

    .line 1591
    .line 1592
    .line 1593
    const v16, -0x40bd70a4    # -0.76f

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1597
    .line 1598
    .line 1599
    const v17, 0x3f87ae14    # 1.06f

    .line 1600
    .line 1601
    .line 1602
    const/16 v18, 0x0

    .line 1603
    .line 1604
    const v13, 0x3e947ae1    # 0.29f

    .line 1605
    .line 1606
    .line 1607
    const v15, 0x3f451eb8    # 0.77f

    .line 1608
    .line 1609
    .line 1610
    const v16, -0x416b851f    # -0.29f

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1614
    .line 1615
    .line 1616
    const v0, 0x3f87ae14    # 1.06f

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1620
    .line 1621
    .line 1622
    const/16 v17, 0x0

    .line 1623
    .line 1624
    const v18, 0x3f87ae14    # 1.06f

    .line 1625
    .line 1626
    .line 1627
    const v14, 0x3e947ae1    # 0.29f

    .line 1628
    .line 1629
    .line 1630
    const v15, 0x3e947ae1    # 0.29f

    .line 1631
    .line 1632
    .line 1633
    const v16, 0x3f451eb8    # 0.77f

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1637
    .line 1638
    .line 1639
    const v0, -0x407851ec    # -1.06f

    .line 1640
    .line 1641
    .line 1642
    const/4 v2, 0x0

    .line 1643
    const v4, -0x40bae148    # -0.77f

    .line 1644
    .line 1645
    .line 1646
    const v6, 0x3e947ae1    # 0.29f

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1650
    .line 1651
    .line 1652
    const v0, -0x43dc28f6    # -0.01f

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1656
    .line 1657
    .line 1658
    const v0, 0x418b851f    # 17.44f

    .line 1659
    .line 1660
    .line 1661
    const v2, 0x40f33333    # 7.6f

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1665
    .line 1666
    .line 1667
    const v17, 0x3fc28f5c    # 1.52f

    .line 1668
    .line 1669
    .line 1670
    const v18, 0x4069999a    # 3.65f

    .line 1671
    .line 1672
    .line 1673
    const v13, 0x3f51eb85    # 0.82f

    .line 1674
    .line 1675
    .line 1676
    const v14, 0x3f828f5c    # 1.02f

    .line 1677
    .line 1678
    .line 1679
    const v15, 0x3faf5c29    # 1.37f

    .line 1680
    .line 1681
    .line 1682
    const v16, 0x401147ae    # 2.27f

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1686
    .line 1687
    .line 1688
    const v0, 0x3fc51eb8    # 1.54f

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1692
    .line 1693
    .line 1694
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1695
    .line 1696
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1697
    .line 1698
    const/4 v13, 0x0

    .line 1699
    const v14, -0x412e147b    # -0.41f

    .line 1700
    .line 1701
    .line 1702
    const v15, 0x3eae147b    # 0.34f

    .line 1703
    .line 1704
    .line 1705
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1706
    .line 1707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1708
    .line 1709
    .line 1710
    const/high16 v17, 0x41b00000    # 22.0f

    .line 1711
    .line 1712
    const/high16 v18, 0x41340000    # 11.25f

    .line 1713
    .line 1714
    const v13, 0x41ad47ae    # 21.66f

    .line 1715
    .line 1716
    .line 1717
    const/high16 v14, 0x41280000    # 10.5f

    .line 1718
    .line 1719
    const/high16 v15, 0x41b00000    # 22.0f

    .line 1720
    .line 1721
    const v16, 0x412d70a4    # 10.84f

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1728
    .line 1729
    .line 1730
    const/high16 v0, 0x41880000    # 17.0f

    .line 1731
    .line 1732
    const/high16 v2, 0x41400000    # 12.0f

    .line 1733
    .line 1734
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1735
    .line 1736
    .line 1737
    const/high16 v17, -0x3f600000    # -5.0f

    .line 1738
    .line 1739
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1740
    .line 1741
    const/4 v13, 0x0

    .line 1742
    const v14, -0x3fcf5c29    # -2.76f

    .line 1743
    .line 1744
    .line 1745
    const v15, -0x3ff0a3d7    # -2.24f

    .line 1746
    .line 1747
    .line 1748
    const/high16 v16, -0x3f600000    # -5.0f

    .line 1749
    .line 1750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1751
    .line 1752
    .line 1753
    const/high16 v0, -0x3f600000    # -5.0f

    .line 1754
    .line 1755
    const v2, 0x400f5c29    # 2.24f

    .line 1756
    .line 1757
    .line 1758
    const/high16 v4, 0x40a00000    # 5.0f

    .line 1759
    .line 1760
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1761
    .line 1762
    .line 1763
    const v0, 0x400f5c29    # 2.24f

    .line 1764
    .line 1765
    .line 1766
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1767
    .line 1768
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1769
    .line 1770
    .line 1771
    const v0, 0x416c28f6    # 14.76f

    .line 1772
    .line 1773
    .line 1774
    const/high16 v2, 0x41880000    # 17.0f

    .line 1775
    .line 1776
    const/high16 v4, 0x41400000    # 12.0f

    .line 1777
    .line 1778
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1782
    .line 1783
    .line 1784
    const/high16 v0, 0x41300000    # 11.0f

    .line 1785
    .line 1786
    const/high16 v2, 0x41400000    # 12.0f

    .line 1787
    .line 1788
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1789
    .line 1790
    .line 1791
    const/high16 v17, -0x40800000    # -1.0f

    .line 1792
    .line 1793
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1794
    .line 1795
    const v13, -0x40f33333    # -0.55f

    .line 1796
    .line 1797
    .line 1798
    const/4 v14, 0x0

    .line 1799
    const/high16 v15, -0x40800000    # -1.0f

    .line 1800
    .line 1801
    const v16, 0x3ee66666    # 0.45f

    .line 1802
    .line 1803
    .line 1804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1805
    .line 1806
    .line 1807
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1808
    .line 1809
    const/4 v13, 0x0

    .line 1810
    const v14, 0x3f0ccccd    # 0.55f

    .line 1811
    .line 1812
    .line 1813
    const v15, 0x3ee66666    # 0.45f

    .line 1814
    .line 1815
    .line 1816
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1817
    .line 1818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1819
    .line 1820
    .line 1821
    const v0, -0x4119999a    # -0.45f

    .line 1822
    .line 1823
    .line 1824
    const/high16 v2, -0x40800000    # -1.0f

    .line 1825
    .line 1826
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1827
    .line 1828
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1829
    .line 1830
    .line 1831
    const/high16 v17, 0x41400000    # 12.0f

    .line 1832
    .line 1833
    const/high16 v18, 0x41300000    # 11.0f

    .line 1834
    .line 1835
    const/high16 v13, 0x41500000    # 13.0f

    .line 1836
    .line 1837
    const v14, 0x41373333    # 11.45f

    .line 1838
    .line 1839
    .line 1840
    const v15, 0x4148cccd    # 12.55f

    .line 1841
    .line 1842
    .line 1843
    const/high16 v16, 0x41300000    # 11.0f

    .line 1844
    .line 1845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1849
    .line 1850
    .line 1851
    const/high16 v0, 0x41780000    # 15.5f

    .line 1852
    .line 1853
    const/high16 v2, 0x41300000    # 11.0f

    .line 1854
    .line 1855
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1856
    .line 1857
    .line 1858
    const/high16 v17, -0x40800000    # -1.0f

    .line 1859
    .line 1860
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1861
    .line 1862
    const v13, -0x40f33333    # -0.55f

    .line 1863
    .line 1864
    .line 1865
    const/4 v14, 0x0

    .line 1866
    const/high16 v15, -0x40800000    # -1.0f

    .line 1867
    .line 1868
    const v16, 0x3ee66666    # 0.45f

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1872
    .line 1873
    .line 1874
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1875
    .line 1876
    const/4 v13, 0x0

    .line 1877
    const v14, 0x3f0ccccd    # 0.55f

    .line 1878
    .line 1879
    .line 1880
    const v15, 0x3ee66666    # 0.45f

    .line 1881
    .line 1882
    .line 1883
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1884
    .line 1885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1886
    .line 1887
    .line 1888
    const v0, -0x4119999a    # -0.45f

    .line 1889
    .line 1890
    .line 1891
    const/high16 v2, -0x40800000    # -1.0f

    .line 1892
    .line 1893
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1894
    .line 1895
    .line 1896
    const/high16 v17, 0x41780000    # 15.5f

    .line 1897
    .line 1898
    const/high16 v18, 0x41300000    # 11.0f

    .line 1899
    .line 1900
    const/high16 v13, 0x41840000    # 16.5f

    .line 1901
    .line 1902
    const v14, 0x41373333    # 11.45f

    .line 1903
    .line 1904
    .line 1905
    const v15, 0x41806666    # 16.05f

    .line 1906
    .line 1907
    .line 1908
    const/high16 v16, 0x41300000    # 11.0f

    .line 1909
    .line 1910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1914
    .line 1915
    .line 1916
    const/high16 v0, 0x41600000    # 14.0f

    .line 1917
    .line 1918
    const/high16 v2, 0x415c0000    # 13.75f

    .line 1919
    .line 1920
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1921
    .line 1922
    .line 1923
    const/high16 v17, -0x40800000    # -1.0f

    .line 1924
    .line 1925
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1926
    .line 1927
    const v13, -0x40f33333    # -0.55f

    .line 1928
    .line 1929
    .line 1930
    const/4 v14, 0x0

    .line 1931
    const/high16 v15, -0x40800000    # -1.0f

    .line 1932
    .line 1933
    const v16, 0x3ee66666    # 0.45f

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1937
    .line 1938
    .line 1939
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1940
    .line 1941
    const/4 v13, 0x0

    .line 1942
    const v14, 0x3f0ccccd    # 0.55f

    .line 1943
    .line 1944
    .line 1945
    const v15, 0x3ee66666    # 0.45f

    .line 1946
    .line 1947
    .line 1948
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1949
    .line 1950
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1951
    .line 1952
    .line 1953
    const v0, -0x4119999a    # -0.45f

    .line 1954
    .line 1955
    .line 1956
    const/high16 v2, -0x40800000    # -1.0f

    .line 1957
    .line 1958
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1959
    .line 1960
    .line 1961
    const/high16 v17, 0x415c0000    # 13.75f

    .line 1962
    .line 1963
    const/high16 v18, 0x41600000    # 14.0f

    .line 1964
    .line 1965
    const/high16 v13, 0x416c0000    # 14.75f

    .line 1966
    .line 1967
    const v14, 0x41673333    # 14.45f

    .line 1968
    .line 1969
    .line 1970
    const v15, 0x4164cccd    # 14.3f

    .line 1971
    .line 1972
    .line 1973
    const/high16 v16, 0x41600000    # 14.0f

    .line 1974
    .line 1975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1976
    .line 1977
    .line 1978
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1979
    .line 1980
    .line 1981
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v2

    .line 1985
    const/16 v16, 0x3800

    .line 1986
    .line 1987
    const/16 v17, 0x0

    .line 1988
    .line 1989
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1990
    .line 1991
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1992
    .line 1993
    const/4 v7, 0x0

    .line 1994
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1995
    .line 1996
    const/4 v13, 0x0

    .line 1997
    const/4 v14, 0x0

    .line 1998
    const/4 v15, 0x0

    .line 1999
    const-string v4, ""

    .line 2000
    .line 2001
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v0

    .line 2005
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    sput-object v0, Landroidx/compose/material/icons/twotone/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2010
    .line 2011
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2012
    .line 2013
    .line 2014
    return-object v0
.end method
