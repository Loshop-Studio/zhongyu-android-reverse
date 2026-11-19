.class public final Landroidx/compose/material/icons/twotone/HubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hub",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Hub",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getHub",
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
        "SMAP\nHub.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/twotone/HubKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,152:1\n212#2,12:153\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n174#3:165\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n72#5,4:188\n72#5,4:226\n*S KotlinDebug\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/twotone/HubKt\n*L\n29#1:153,12\n30#1:166,18\n30#1:203\n68#1:204,18\n68#1:241\n29#1:165\n30#1:184,2\n30#1:186,2\n30#1:192,11\n68#1:222,2\n68#1:224,2\n68#1:230,11\n30#1:188,4\n68#1:226,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHub(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Hub"

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
    const/high16 v4, 0x41280000    # 10.5f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v21, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v24, -0x4119999a    # -0.45f

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
    const/high16 v25, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, -0x40f33333    # -0.55f

    .line 101
    .line 102
    .line 103
    const v23, 0x3ee66666    # 0.45f

    .line 104
    .line 105
    .line 106
    const/high16 v24, -0x40800000    # -1.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x3ee66666    # 0.45f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x3f800000    # 1.0f

    .line 115
    .line 116
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v26, 0x41280000    # 10.5f

    .line 122
    .line 123
    const/high16 v21, 0x40800000    # 4.0f

    .line 124
    .line 125
    const v22, 0x4120cccd    # 10.05f

    .line 126
    .line 127
    .line 128
    const v23, 0x40633333    # 3.55f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x41280000    # 10.5f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40c00000    # 6.0f

    .line 140
    .line 141
    const/high16 v6, 0x41a80000    # 21.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x40800000    # -1.0f

    .line 147
    .line 148
    const/high16 v26, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v21, -0x40f33333    # -0.55f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/high16 v23, -0x40800000    # -1.0f

    .line 156
    .line 157
    const v24, -0x4119999a    # -0.45f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const v22, -0x40f33333    # -0.55f

    .line 168
    .line 169
    .line 170
    const v23, 0x3ee66666    # 0.45f

    .line 171
    .line 172
    .line 173
    const/high16 v24, -0x40800000    # -1.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x3ee66666    # 0.45f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x3f800000    # 1.0f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x40c00000    # 6.0f

    .line 187
    .line 188
    const/high16 v26, 0x41a80000    # 21.0f

    .line 189
    .line 190
    const/high16 v21, 0x40e00000    # 7.0f

    .line 191
    .line 192
    const v22, 0x41a46666    # 20.55f

    .line 193
    .line 194
    .line 195
    const v23, 0x40d1999a    # 6.55f

    .line 196
    .line 197
    .line 198
    const/high16 v24, 0x41a80000    # 21.0f

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41300000    # 11.0f

    .line 207
    .line 208
    const/high16 v6, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v26, -0x40800000    # -1.0f

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const v23, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v24, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x3ee66666    # 0.45f

    .line 231
    .line 232
    .line 233
    const/high16 v6, 0x3f800000    # 1.0f

    .line 234
    .line 235
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, -0x40800000    # -1.0f

    .line 239
    .line 240
    const/high16 v26, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const v22, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const v23, -0x4119999a    # -0.45f

    .line 246
    .line 247
    .line 248
    const/high16 v24, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x40633333    # 3.55f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x41300000    # 11.0f

    .line 257
    .line 258
    const/high16 v7, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x41700000    # 15.0f

    .line 267
    .line 268
    const/high16 v6, 0x41400000    # 12.0f

    .line 269
    .line 270
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 274
    .line 275
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 276
    .line 277
    const v21, -0x404f5c29    # -1.38f

    .line 278
    .line 279
    .line 280
    const/16 v22, 0x0

    .line 281
    .line 282
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 283
    .line 284
    const v24, -0x4070a3d7    # -1.12f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40200000    # 2.5f

    .line 291
    .line 292
    const/16 v21, 0x0

    .line 293
    .line 294
    const v22, -0x404f5c29    # -1.38f

    .line 295
    .line 296
    .line 297
    const v23, 0x3f8f5c29    # 1.12f

    .line 298
    .line 299
    .line 300
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, 0x3f8f5c29    # 1.12f

    .line 306
    .line 307
    .line 308
    const/high16 v6, 0x40200000    # 2.5f

    .line 309
    .line 310
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v25, 0x41400000    # 12.0f

    .line 314
    .line 315
    const/high16 v26, 0x41700000    # 15.0f

    .line 316
    .line 317
    const/high16 v21, 0x41680000    # 14.5f

    .line 318
    .line 319
    const v22, 0x415e147b    # 13.88f

    .line 320
    .line 321
    .line 322
    const v23, 0x4156147b    # 13.38f

    .line 323
    .line 324
    .line 325
    const/high16 v24, 0x41700000    # 15.0f

    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x41980000    # 19.0f

    .line 334
    .line 335
    const/high16 v6, 0x41900000    # 18.0f

    .line 336
    .line 337
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v25, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v26, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const v21, 0x3f0ccccd    # 0.55f

    .line 345
    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const/high16 v23, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v24, 0x3ee66666    # 0.45f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, -0x40800000    # -1.0f

    .line 358
    .line 359
    const/16 v21, 0x0

    .line 360
    .line 361
    const v22, 0x3f0ccccd    # 0.55f

    .line 362
    .line 363
    .line 364
    const v23, -0x4119999a    # -0.45f

    .line 365
    .line 366
    .line 367
    const/high16 v24, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v4, -0x4119999a    # -0.45f

    .line 373
    .line 374
    .line 375
    const/high16 v6, -0x40800000    # -1.0f

    .line 376
    .line 377
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v25, 0x41900000    # 18.0f

    .line 381
    .line 382
    const/high16 v26, 0x41980000    # 19.0f

    .line 383
    .line 384
    const/high16 v21, 0x41880000    # 17.0f

    .line 385
    .line 386
    const v22, 0x419b999a    # 19.45f

    .line 387
    .line 388
    .line 389
    const v23, 0x418b999a    # 17.45f

    .line 390
    .line 391
    .line 392
    const/high16 v24, 0x41980000    # 19.0f

    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41280000    # 10.5f

    .line 401
    .line 402
    const/high16 v6, 0x41a80000    # 21.0f

    .line 403
    .line 404
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v25, -0x40800000    # -1.0f

    .line 408
    .line 409
    const/high16 v26, -0x40800000    # -1.0f

    .line 410
    .line 411
    const v21, -0x40f33333    # -0.55f

    .line 412
    .line 413
    .line 414
    const/16 v22, 0x0

    .line 415
    .line 416
    const/high16 v23, -0x40800000    # -1.0f

    .line 417
    .line 418
    const v24, -0x4119999a    # -0.45f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v25, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/16 v21, 0x0

    .line 427
    .line 428
    const v22, -0x40f33333    # -0.55f

    .line 429
    .line 430
    .line 431
    const v23, 0x3ee66666    # 0.45f

    .line 432
    .line 433
    .line 434
    const/high16 v24, -0x40800000    # -1.0f

    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v4, 0x3ee66666    # 0.45f

    .line 440
    .line 441
    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v25, 0x41a80000    # 21.0f

    .line 448
    .line 449
    const/high16 v26, 0x41280000    # 10.5f

    .line 450
    .line 451
    const/high16 v21, 0x41b00000    # 22.0f

    .line 452
    .line 453
    const v22, 0x4120cccd    # 10.05f

    .line 454
    .line 455
    .line 456
    const v23, 0x41ac6666    # 21.55f

    .line 457
    .line 458
    .line 459
    const/high16 v24, 0x41280000    # 10.5f

    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/16 v16, 0x3800

    .line 472
    .line 473
    const/16 v17, 0x0

    .line 474
    .line 475
    const v6, 0x3e99999a    # 0.3f

    .line 476
    .line 477
    .line 478
    const v8, 0x3e99999a    # 0.3f

    .line 479
    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    const/high16 v9, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v12, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const/4 v14, 0x0

    .line 488
    const/4 v15, 0x0

    .line 489
    const-string v4, ""

    .line 490
    .line 491
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 492
    .line 493
    .line 494
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 499
    .line 500
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 501
    .line 502
    .line 503
    move-result-wide v6

    .line 504
    const/4 v0, 0x0

    .line 505
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x40d00000    # 6.5f

    .line 522
    .line 523
    const/high16 v2, 0x41a80000    # 21.0f

    .line 524
    .line 525
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 529
    .line 530
    const/high16 v18, 0x40400000    # 3.0f

    .line 531
    .line 532
    const v13, -0x402b851f    # -1.66f

    .line 533
    .line 534
    .line 535
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 536
    .line 537
    const v16, 0x3fab851f    # 1.34f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, 0x3c23d70a    # 0.01f

    .line 544
    .line 545
    .line 546
    const v18, 0x3e570a3d    # 0.21f

    .line 547
    .line 548
    .line 549
    const/4 v13, 0x0

    .line 550
    const v14, 0x3d8f5c29    # 0.07f

    .line 551
    .line 552
    .line 553
    const/4 v15, 0x0

    .line 554
    const v16, 0x3e0f5c29    # 0.14f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, -0x3ffe147b    # -2.03f

    .line 561
    .line 562
    .line 563
    const v2, 0x3f2e147b    # 0.68f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, -0x3fb1eb85    # -3.22f

    .line 570
    .line 571
    .line 572
    const v18, -0x3feb851f    # -2.32f

    .line 573
    .line 574
    .line 575
    const v13, -0x40dc28f6    # -0.64f

    .line 576
    .line 577
    .line 578
    const v14, -0x40651eb8    # -1.21f

    .line 579
    .line 580
    .line 581
    const v15, -0x40170a3d    # -1.82f

    .line 582
    .line 583
    .line 584
    const v16, -0x3ffa3d71    # -2.09f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x40bd1eb8    # 5.91f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x41700000    # 15.0f

    .line 597
    .line 598
    const/high16 v18, 0x40400000    # 3.0f

    .line 599
    .line 600
    const v13, 0x4160a3d7    # 14.04f

    .line 601
    .line 602
    .line 603
    const v14, 0x40b23d71    # 5.57f

    .line 604
    .line 605
    .line 606
    const/high16 v15, 0x41700000    # 15.0f

    .line 607
    .line 608
    const v16, 0x408ccccd    # 4.4f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 615
    .line 616
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 617
    .line 618
    const/4 v13, 0x0

    .line 619
    const v14, -0x402b851f    # -1.66f

    .line 620
    .line 621
    .line 622
    const v15, -0x40547ae1    # -1.34f

    .line 623
    .line 624
    .line 625
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41100000    # 9.0f

    .line 631
    .line 632
    const/high16 v2, 0x41100000    # 9.0f

    .line 633
    .line 634
    const v4, 0x3fab851f    # 1.34f

    .line 635
    .line 636
    .line 637
    const/high16 v6, 0x40400000    # 3.0f

    .line 638
    .line 639
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, 0x40100000    # 2.25f

    .line 643
    .line 644
    const v18, 0x403a3d71    # 2.91f

    .line 645
    .line 646
    .line 647
    const v14, 0x3fb33333    # 1.4f

    .line 648
    .line 649
    .line 650
    const v15, 0x3f75c28f    # 0.96f

    .line 651
    .line 652
    .line 653
    const v16, 0x40247ae1    # 2.57f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x400a3d71    # 2.16f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, -0x3fb1eb85    # -3.22f

    .line 666
    .line 667
    .line 668
    const v18, 0x40147ae1    # 2.32f

    .line 669
    .line 670
    .line 671
    const v13, -0x404ccccd    # -1.4f

    .line 672
    .line 673
    .line 674
    const v14, 0x3e6b851f    # 0.23f

    .line 675
    .line 676
    .line 677
    const v15, -0x3fdae148    # -2.58f

    .line 678
    .line 679
    .line 680
    const v16, 0x3f8e147b    # 1.11f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, 0x40bfae14    # 5.99f

    .line 687
    .line 688
    .line 689
    const v2, 0x411b5c29    # 9.71f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v17, 0x40c00000    # 6.0f

    .line 696
    .line 697
    const/high16 v18, 0x41180000    # 9.5f

    .line 698
    .line 699
    const/high16 v13, 0x40c00000    # 6.0f

    .line 700
    .line 701
    const v14, 0x411a3d71    # 9.64f

    .line 702
    .line 703
    .line 704
    const/high16 v15, 0x40c00000    # 6.0f

    .line 705
    .line 706
    const v16, 0x41191eb8    # 9.57f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 713
    .line 714
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const v14, -0x402b851f    # -1.66f

    .line 718
    .line 719
    .line 720
    const v15, -0x40547ae1    # -1.34f

    .line 721
    .line 722
    .line 723
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v0, 0x3fab851f    # 1.34f

    .line 729
    .line 730
    .line 731
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 732
    .line 733
    const/high16 v4, 0x40400000    # 3.0f

    .line 734
    .line 735
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v2, 0x40400000    # 3.0f

    .line 739
    .line 740
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, 0x402147ae    # 2.52f

    .line 744
    .line 745
    .line 746
    const v18, -0x4050a3d7    # -1.37f

    .line 747
    .line 748
    .line 749
    const v13, 0x3f87ae14    # 1.06f

    .line 750
    .line 751
    .line 752
    const/4 v14, 0x0

    .line 753
    const v15, 0x3ffd70a4    # 1.98f

    .line 754
    .line 755
    .line 756
    const v16, -0x40f33333    # -0.55f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x4001eb85    # 2.03f

    .line 763
    .line 764
    .line 765
    const v2, 0x3f2e147b    # 0.68f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v17, 0x3f8b851f    # 1.09f

    .line 772
    .line 773
    .line 774
    const v18, 0x406c28f6    # 3.69f

    .line 775
    .line 776
    .line 777
    const v13, -0x41b33333    # -0.2f

    .line 778
    .line 779
    .line 780
    const v14, 0x3fa51eb8    # 1.29f

    .line 781
    .line 782
    .line 783
    const v15, 0x3e2e147b    # 0.17f

    .line 784
    .line 785
    .line 786
    const v16, 0x402a3d71    # 2.66f

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v0, -0x404b851f    # -1.41f

    .line 793
    .line 794
    .line 795
    const v2, 0x3fe28f5c    # 1.77f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v17, 0x40c00000    # 6.0f

    .line 802
    .line 803
    const/high16 v18, 0x41880000    # 17.0f

    .line 804
    .line 805
    const v13, 0x40db3333    # 6.85f

    .line 806
    .line 807
    .line 808
    const v14, 0x4188b852    # 17.09f

    .line 809
    .line 810
    .line 811
    const v15, 0x40ce147b    # 6.44f

    .line 812
    .line 813
    .line 814
    const/high16 v16, 0x41880000    # 17.0f

    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 820
    .line 821
    const/high16 v18, 0x40400000    # 3.0f

    .line 822
    .line 823
    const v13, -0x402b851f    # -1.66f

    .line 824
    .line 825
    .line 826
    const/4 v14, 0x0

    .line 827
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 828
    .line 829
    const v16, 0x3fab851f    # 1.34f

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v0, 0x3fab851f    # 1.34f

    .line 836
    .line 837
    .line 838
    const/high16 v2, 0x40400000    # 3.0f

    .line 839
    .line 840
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, -0x40547ae1    # -1.34f

    .line 844
    .line 845
    .line 846
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 847
    .line 848
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v17, -0x40e66666    # -0.6f

    .line 852
    .line 853
    .line 854
    const v18, -0x4019999a    # -1.8f

    .line 855
    .line 856
    .line 857
    const/4 v13, 0x0

    .line 858
    const v14, -0x40d1eb85    # -0.68f

    .line 859
    .line 860
    .line 861
    const v15, -0x419eb852    # -0.22f

    .line 862
    .line 863
    .line 864
    const v16, -0x4059999a    # -1.3f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, 0x3fb47ae1    # 1.41f

    .line 871
    .line 872
    .line 873
    const v2, -0x401d70a4    # -1.77f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v17, 0x408bd70a    # 4.37f

    .line 880
    .line 881
    .line 882
    const/16 v18, 0x0

    .line 883
    .line 884
    const v13, 0x3fae147b    # 1.36f

    .line 885
    .line 886
    .line 887
    const v14, 0x3f428f5c    # 0.76f

    .line 888
    .line 889
    .line 890
    const v15, 0x404147ae    # 3.02f

    .line 891
    .line 892
    .line 893
    const/high16 v16, 0x3f400000    # 0.75f

    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v2, 0x3fe28f5c    # 1.77f

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/high16 v17, 0x41700000    # 15.0f

    .line 905
    .line 906
    const/high16 v18, 0x41a00000    # 20.0f

    .line 907
    .line 908
    const v13, 0x4173851f    # 15.22f

    .line 909
    .line 910
    .line 911
    const v14, 0x4195999a    # 18.7f

    .line 912
    .line 913
    .line 914
    const/high16 v15, 0x41700000    # 15.0f

    .line 915
    .line 916
    const v16, 0x419a8f5c    # 19.32f

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v17, 0x40400000    # 3.0f

    .line 923
    .line 924
    const/high16 v18, 0x40400000    # 3.0f

    .line 925
    .line 926
    const/4 v13, 0x0

    .line 927
    const v14, 0x3fd47ae1    # 1.66f

    .line 928
    .line 929
    .line 930
    const v15, 0x3fab851f    # 1.34f

    .line 931
    .line 932
    .line 933
    const/high16 v16, 0x40400000    # 3.0f

    .line 934
    .line 935
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v0, -0x40547ae1    # -1.34f

    .line 939
    .line 940
    .line 941
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 942
    .line 943
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v17, -0x40628f5c    # -1.23f

    .line 950
    .line 951
    .line 952
    const v18, 0x3e851eb8    # 0.26f

    .line 953
    .line 954
    .line 955
    const v13, -0x411eb852    # -0.44f

    .line 956
    .line 957
    .line 958
    const/4 v14, 0x0

    .line 959
    const v15, -0x40a66666    # -0.85f

    .line 960
    .line 961
    .line 962
    const v16, 0x3db851ec    # 0.09f

    .line 963
    .line 964
    .line 965
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const v0, -0x404b851f    # -1.41f

    .line 969
    .line 970
    .line 971
    const v2, -0x401d70a4    # -1.77f

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v17, 0x3f8b851f    # 1.09f

    .line 978
    .line 979
    .line 980
    const v18, -0x3f93d70a    # -3.69f

    .line 981
    .line 982
    .line 983
    const v13, 0x3f6e147b    # 0.93f

    .line 984
    .line 985
    .line 986
    const v14, -0x407ae148    # -1.04f

    .line 987
    .line 988
    .line 989
    const v15, 0x3fa51eb8    # 1.29f

    .line 990
    .line 991
    .line 992
    const v16, -0x3fe66666    # -2.4f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v0, 0x4001eb85    # 2.03f

    .line 999
    .line 1000
    .line 1001
    const v2, -0x40d1eb85    # -0.68f

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    const v17, 0x402147ae    # 2.52f

    .line 1008
    .line 1009
    .line 1010
    const v18, 0x3faf5c29    # 1.37f

    .line 1011
    .line 1012
    .line 1013
    const v13, 0x3f07ae14    # 0.53f

    .line 1014
    .line 1015
    .line 1016
    const v14, 0x3f51eb85    # 0.82f

    .line 1017
    .line 1018
    .line 1019
    const v15, 0x3fbae148    # 1.46f

    .line 1020
    .line 1021
    .line 1022
    const v16, 0x3faf5c29    # 1.37f

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    .line 1028
    const/high16 v17, 0x40400000    # 3.0f

    .line 1029
    .line 1030
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 1031
    .line 1032
    const v13, 0x3fd47ae1    # 1.66f

    .line 1033
    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    const/high16 v15, 0x40400000    # 3.0f

    .line 1037
    .line 1038
    const v16, -0x40547ae1    # -1.34f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const v0, 0x41b547ae    # 22.66f

    .line 1045
    .line 1046
    .line 1047
    const/high16 v2, 0x40d00000    # 6.5f

    .line 1048
    .line 1049
    const/high16 v4, 0x41a80000    # 21.0f

    .line 1050
    .line 1051
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/high16 v0, 0x41280000    # 10.5f

    .line 1058
    .line 1059
    const/high16 v2, 0x40400000    # 3.0f

    .line 1060
    .line 1061
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const/high16 v17, -0x40800000    # -1.0f

    .line 1065
    .line 1066
    const/high16 v18, -0x40800000    # -1.0f

    .line 1067
    .line 1068
    const v13, -0x40f33333    # -0.55f

    .line 1069
    .line 1070
    .line 1071
    const/high16 v15, -0x40800000    # -1.0f

    .line 1072
    .line 1073
    const v16, -0x4119999a    # -0.45f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1080
    .line 1081
    const/4 v13, 0x0

    .line 1082
    const v14, -0x40f33333    # -0.55f

    .line 1083
    .line 1084
    .line 1085
    const v15, 0x3ee66666    # 0.45f

    .line 1086
    .line 1087
    .line 1088
    const/high16 v16, -0x40800000    # -1.0f

    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v0, 0x3ee66666    # 0.45f

    .line 1094
    .line 1095
    .line 1096
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1097
    .line 1098
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const/high16 v17, 0x40400000    # 3.0f

    .line 1102
    .line 1103
    const/high16 v18, 0x41280000    # 10.5f

    .line 1104
    .line 1105
    const/high16 v13, 0x40800000    # 4.0f

    .line 1106
    .line 1107
    const v14, 0x4120cccd    # 10.05f

    .line 1108
    .line 1109
    .line 1110
    const v15, 0x40633333    # 3.55f

    .line 1111
    .line 1112
    .line 1113
    const/high16 v16, 0x41280000    # 10.5f

    .line 1114
    .line 1115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const/high16 v0, 0x40c00000    # 6.0f

    .line 1122
    .line 1123
    const/high16 v2, 0x41a80000    # 21.0f

    .line 1124
    .line 1125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const/high16 v17, -0x40800000    # -1.0f

    .line 1129
    .line 1130
    const/high16 v18, -0x40800000    # -1.0f

    .line 1131
    .line 1132
    const v13, -0x40f33333    # -0.55f

    .line 1133
    .line 1134
    .line 1135
    const/4 v14, 0x0

    .line 1136
    const/high16 v15, -0x40800000    # -1.0f

    .line 1137
    .line 1138
    const v16, -0x4119999a    # -0.45f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1145
    .line 1146
    const/4 v13, 0x0

    .line 1147
    const v14, -0x40f33333    # -0.55f

    .line 1148
    .line 1149
    .line 1150
    const v15, 0x3ee66666    # 0.45f

    .line 1151
    .line 1152
    .line 1153
    const/high16 v16, -0x40800000    # -1.0f

    .line 1154
    .line 1155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v0, 0x3ee66666    # 0.45f

    .line 1159
    .line 1160
    .line 1161
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1162
    .line 1163
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const/high16 v17, 0x40c00000    # 6.0f

    .line 1167
    .line 1168
    const/high16 v18, 0x41a80000    # 21.0f

    .line 1169
    .line 1170
    const/high16 v13, 0x40e00000    # 7.0f

    .line 1171
    .line 1172
    const v14, 0x41a46666    # 20.55f

    .line 1173
    .line 1174
    .line 1175
    const v15, 0x40d1999a    # 6.55f

    .line 1176
    .line 1177
    .line 1178
    const/high16 v16, 0x41a80000    # 21.0f

    .line 1179
    .line 1180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const/high16 v0, 0x41300000    # 11.0f

    .line 1187
    .line 1188
    const/high16 v2, 0x40400000    # 3.0f

    .line 1189
    .line 1190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1194
    .line 1195
    const/high16 v18, -0x40800000    # -1.0f

    .line 1196
    .line 1197
    const/4 v13, 0x0

    .line 1198
    const v14, -0x40f33333    # -0.55f

    .line 1199
    .line 1200
    .line 1201
    const v15, 0x3ee66666    # 0.45f

    .line 1202
    .line 1203
    .line 1204
    const/high16 v16, -0x40800000    # -1.0f

    .line 1205
    .line 1206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1207
    .line 1208
    .line 1209
    const v0, 0x3ee66666    # 0.45f

    .line 1210
    .line 1211
    .line 1212
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1213
    .line 1214
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    .line 1217
    const/high16 v17, -0x40800000    # -1.0f

    .line 1218
    .line 1219
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1220
    .line 1221
    const v14, 0x3f0ccccd    # 0.55f

    .line 1222
    .line 1223
    .line 1224
    const v15, -0x4119999a    # -0.45f

    .line 1225
    .line 1226
    .line 1227
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1228
    .line 1229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    const v0, 0x40633333    # 3.55f

    .line 1233
    .line 1234
    .line 1235
    const/high16 v2, 0x41300000    # 11.0f

    .line 1236
    .line 1237
    const/high16 v4, 0x40400000    # 3.0f

    .line 1238
    .line 1239
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const/high16 v0, 0x41700000    # 15.0f

    .line 1246
    .line 1247
    const/high16 v2, 0x41400000    # 12.0f

    .line 1248
    .line 1249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1250
    .line 1251
    .line 1252
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 1253
    .line 1254
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1255
    .line 1256
    const v13, -0x404f5c29    # -1.38f

    .line 1257
    .line 1258
    .line 1259
    const/4 v14, 0x0

    .line 1260
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 1261
    .line 1262
    const v16, -0x4070a3d7    # -1.12f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    const/high16 v17, 0x40200000    # 2.5f

    .line 1269
    .line 1270
    const/4 v13, 0x0

    .line 1271
    const v14, -0x404f5c29    # -1.38f

    .line 1272
    .line 1273
    .line 1274
    const v15, 0x3f8f5c29    # 1.12f

    .line 1275
    .line 1276
    .line 1277
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 1278
    .line 1279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    const v0, 0x3f8f5c29    # 1.12f

    .line 1283
    .line 1284
    .line 1285
    const/high16 v2, 0x40200000    # 2.5f

    .line 1286
    .line 1287
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1288
    .line 1289
    .line 1290
    const/high16 v17, 0x41400000    # 12.0f

    .line 1291
    .line 1292
    const/high16 v18, 0x41700000    # 15.0f

    .line 1293
    .line 1294
    const/high16 v13, 0x41680000    # 14.5f

    .line 1295
    .line 1296
    const v14, 0x415e147b    # 13.88f

    .line 1297
    .line 1298
    .line 1299
    const v15, 0x4156147b    # 13.38f

    .line 1300
    .line 1301
    .line 1302
    const/high16 v16, 0x41700000    # 15.0f

    .line 1303
    .line 1304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1308
    .line 1309
    .line 1310
    const/high16 v0, 0x41980000    # 19.0f

    .line 1311
    .line 1312
    const/high16 v2, 0x41900000    # 18.0f

    .line 1313
    .line 1314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1315
    .line 1316
    .line 1317
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1318
    .line 1319
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1320
    .line 1321
    const v13, 0x3f0ccccd    # 0.55f

    .line 1322
    .line 1323
    .line 1324
    const/4 v14, 0x0

    .line 1325
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1326
    .line 1327
    const v16, 0x3ee66666    # 0.45f

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const/high16 v17, -0x40800000    # -1.0f

    .line 1334
    .line 1335
    const/4 v13, 0x0

    .line 1336
    const v14, 0x3f0ccccd    # 0.55f

    .line 1337
    .line 1338
    .line 1339
    const v15, -0x4119999a    # -0.45f

    .line 1340
    .line 1341
    .line 1342
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1343
    .line 1344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1345
    .line 1346
    .line 1347
    const v0, -0x4119999a    # -0.45f

    .line 1348
    .line 1349
    .line 1350
    const/high16 v2, -0x40800000    # -1.0f

    .line 1351
    .line 1352
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    const/high16 v17, 0x41900000    # 18.0f

    .line 1356
    .line 1357
    const/high16 v18, 0x41980000    # 19.0f

    .line 1358
    .line 1359
    const/high16 v13, 0x41880000    # 17.0f

    .line 1360
    .line 1361
    const v14, 0x419b999a    # 19.45f

    .line 1362
    .line 1363
    .line 1364
    const v15, 0x418b999a    # 17.45f

    .line 1365
    .line 1366
    .line 1367
    const/high16 v16, 0x41980000    # 19.0f

    .line 1368
    .line 1369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1373
    .line 1374
    .line 1375
    const/high16 v0, 0x41280000    # 10.5f

    .line 1376
    .line 1377
    const/high16 v2, 0x41a80000    # 21.0f

    .line 1378
    .line 1379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1380
    .line 1381
    .line 1382
    const/high16 v17, -0x40800000    # -1.0f

    .line 1383
    .line 1384
    const/high16 v18, -0x40800000    # -1.0f

    .line 1385
    .line 1386
    const v13, -0x40f33333    # -0.55f

    .line 1387
    .line 1388
    .line 1389
    const/4 v14, 0x0

    .line 1390
    const/high16 v15, -0x40800000    # -1.0f

    .line 1391
    .line 1392
    const v16, -0x4119999a    # -0.45f

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1396
    .line 1397
    .line 1398
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1399
    .line 1400
    const/4 v13, 0x0

    .line 1401
    const v14, -0x40f33333    # -0.55f

    .line 1402
    .line 1403
    .line 1404
    const v15, 0x3ee66666    # 0.45f

    .line 1405
    .line 1406
    .line 1407
    const/high16 v16, -0x40800000    # -1.0f

    .line 1408
    .line 1409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    const v0, 0x3ee66666    # 0.45f

    .line 1413
    .line 1414
    .line 1415
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1416
    .line 1417
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    const/high16 v17, 0x41a80000    # 21.0f

    .line 1421
    .line 1422
    const/high16 v18, 0x41280000    # 10.5f

    .line 1423
    .line 1424
    const/high16 v13, 0x41b00000    # 22.0f

    .line 1425
    .line 1426
    const v14, 0x4120cccd    # 10.05f

    .line 1427
    .line 1428
    .line 1429
    const v15, 0x41ac6666    # 21.55f

    .line 1430
    .line 1431
    .line 1432
    const/high16 v16, 0x41280000    # 10.5f

    .line 1433
    .line 1434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    const/16 v16, 0x3800

    .line 1445
    .line 1446
    const/16 v17, 0x0

    .line 1447
    .line 1448
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1449
    .line 1450
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1451
    .line 1452
    const/4 v7, 0x0

    .line 1453
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1454
    .line 1455
    const/4 v13, 0x0

    .line 1456
    const/4 v14, 0x0

    .line 1457
    const/4 v15, 0x0

    .line 1458
    const-string v4, ""

    .line 1459
    .line 1460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    sput-object v0, Landroidx/compose/material/icons/twotone/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1469
    .line 1470
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v0
.end method
