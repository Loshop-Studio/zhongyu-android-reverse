.class public final Landroidx/compose/material/icons/rounded/ScheduleSendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_scheduleSend",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ScheduleSend",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getScheduleSend$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getScheduleSend",
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
        "SMAP\nScheduleSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleSend.kt\nandroidx/compose/material/icons/rounded/ScheduleSendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:115\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 ScheduleSend.kt\nandroidx/compose/material/icons/rounded/ScheduleSendKt\n*L\n35#1:80,12\n36#1:93,18\n36#1:130\n53#1:131,18\n53#1:168\n35#1:92\n36#1:111,2\n36#1:113,2\n36#1:119,11\n53#1:149,2\n53#1:151,2\n53#1:157,11\n36#1:115,4\n53#1:153,4\n*E\n"
    }
.end annotation


# static fields
.field private static _scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScheduleSend(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScheduleSendKt;->_scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScheduleSend"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3e8f5c29    # 0.28f

    .line 78
    .line 79
    .line 80
    const v26, 0x3c23d70a    # 0.01f

    .line 81
    .line 82
    .line 83
    const v21, 0x3dcccccd    # 0.1f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3e428f5c    # 0.19f

    .line 89
    .line 90
    .line 91
    const v24, 0x3c23d70a    # 0.01f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x408c7ae1    # 4.39f

    .line 100
    .line 101
    .line 102
    const v6, 0x40928f5c    # 4.58f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x40400000    # 3.0f

    .line 109
    .line 110
    const v26, 0x40b051ec    # 5.51f

    .line 111
    .line 112
    .line 113
    const v21, 0x406eb852    # 3.73f

    .line 114
    .line 115
    .line 116
    const v22, 0x4089eb85    # 4.31f

    .line 117
    .line 118
    .line 119
    const/high16 v23, 0x40400000    # 3.0f

    .line 120
    .line 121
    const v24, 0x409947ae    # 4.79f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x406d70a4    # 3.71f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x3f428f5c    # 0.76f

    .line 134
    .line 135
    .line 136
    const v26, 0x3f7851ec    # 0.97f

    .line 137
    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const v22, 0x3eeb851f    # 0.46f

    .line 142
    .line 143
    .line 144
    const v23, 0x3e9eb852    # 0.31f

    .line 145
    .line 146
    .line 147
    const v24, 0x3f5c28f6    # 0.86f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41300000    # 11.0f

    .line 154
    .line 155
    const/high16 v6, 0x41400000    # 12.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, -0x3f1851ec    # -7.24f

    .line 161
    .line 162
    .line 163
    const v6, 0x3fe7ae14    # 1.81f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x40400000    # 3.0f

    .line 170
    .line 171
    const v26, 0x416c7ae1    # 14.78f

    .line 172
    .line 173
    .line 174
    const v21, 0x4053d70a    # 3.31f

    .line 175
    .line 176
    .line 177
    const v22, 0x415eb852    # 13.92f

    .line 178
    .line 179
    .line 180
    const/high16 v23, 0x40400000    # 3.0f

    .line 181
    .line 182
    const v24, 0x41651eb8    # 14.32f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x406d70a4    # 3.71f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, 0x3fb1eb85    # 1.39f

    .line 195
    .line 196
    .line 197
    const v26, 0x3f6b851f    # 0.92f

    .line 198
    .line 199
    .line 200
    const/16 v21, 0x0

    .line 201
    .line 202
    const v22, 0x3f3851ec    # 0.72f

    .line 203
    .line 204
    .line 205
    const v23, 0x3f3ae148    # 0.73f

    .line 206
    .line 207
    .line 208
    const v24, 0x3f99999a    # 1.2f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x41886666    # 17.05f

    .line 215
    .line 216
    .line 217
    const/high16 v6, 0x41200000    # 10.0f

    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/16 v25, 0x0

    .line 223
    .line 224
    const v26, -0x42b33333    # -0.05f

    .line 225
    .line 226
    .line 227
    const v22, -0x435c28f6    # -0.02f

    .line 228
    .line 229
    .line 230
    const/16 v23, 0x0

    .line 231
    .line 232
    const v24, -0x430a3d71    # -0.03f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, 0x41880000    # 17.0f

    .line 239
    .line 240
    const/high16 v26, 0x41200000    # 10.0f

    .line 241
    .line 242
    const/high16 v21, 0x41200000    # 10.0f

    .line 243
    .line 244
    const v22, 0x41523d71    # 13.14f

    .line 245
    .line 246
    .line 247
    const v23, 0x41523d71    # 13.14f

    .line 248
    .line 249
    .line 250
    const/high16 v24, 0x41200000    # 10.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const/16 v16, 0x3800

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/high16 v6, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/high16 v8, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const/high16 v9, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/high16 v12, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const/4 v14, 0x0

    .line 277
    const/4 v15, 0x0

    .line 278
    const-string v4, ""

    .line 279
    .line 280
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 281
    .line 282
    .line 283
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 288
    .line 289
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 290
    .line 291
    .line 292
    move-result-wide v6

    .line 293
    const/4 v0, 0x0

    .line 294
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41880000    # 17.0f

    .line 311
    .line 312
    const/high16 v2, 0x41400000    # 12.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, -0x3f600000    # -5.0f

    .line 318
    .line 319
    const/high16 v18, 0x40a00000    # 5.0f

    .line 320
    .line 321
    const v13, -0x3fcf5c29    # -2.76f

    .line 322
    .line 323
    .line 324
    const/high16 v15, -0x3f600000    # -5.0f

    .line 325
    .line 326
    const v16, 0x400f5c29    # 2.24f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x400f5c29    # 2.24f

    .line 333
    .line 334
    .line 335
    const/high16 v2, 0x40a00000    # 5.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x40a00000    # 5.0f

    .line 341
    .line 342
    const/high16 v18, -0x3f600000    # -5.0f

    .line 343
    .line 344
    const v13, 0x4030a3d7    # 2.76f

    .line 345
    .line 346
    .line 347
    const/high16 v15, 0x40a00000    # 5.0f

    .line 348
    .line 349
    const v16, -0x3ff0a3d7    # -2.24f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x419e147b    # 19.76f

    .line 356
    .line 357
    .line 358
    const/high16 v2, 0x41880000    # 17.0f

    .line 359
    .line 360
    const/high16 v4, 0x41400000    # 12.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x419251ec    # 18.29f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x41980000    # 19.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x402ccccd    # -1.65f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x41e66666    # -0.15f

    .line 383
    .line 384
    .line 385
    const v18, -0x414ccccd    # -0.35f

    .line 386
    .line 387
    .line 388
    const v13, -0x4247ae14    # -0.09f

    .line 389
    .line 390
    .line 391
    const v14, -0x4247ae14    # -0.09f

    .line 392
    .line 393
    .line 394
    const v15, -0x41e66666    # -0.15f

    .line 395
    .line 396
    .line 397
    const v16, -0x419eb852    # -0.22f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x3f000000    # 0.5f

    .line 409
    .line 410
    const/high16 v18, -0x41000000    # -0.5f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const v14, -0x4170a3d7    # -0.28f

    .line 414
    .line 415
    .line 416
    const v15, 0x3e6147ae    # 0.22f

    .line 417
    .line 418
    .line 419
    const/high16 v16, -0x41000000    # -0.5f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/4 v0, 0x0

    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v18, 0x3f000000    # 0.5f

    .line 429
    .line 430
    const v13, 0x3e8f5c29    # 0.28f

    .line 431
    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const/high16 v15, 0x3f000000    # 0.5f

    .line 435
    .line 436
    const v16, 0x3e6147ae    # 0.22f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x40128f5c    # 2.29f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/16 v17, 0x0

    .line 454
    .line 455
    const v18, 0x3f35c28f    # 0.71f

    .line 456
    .line 457
    .line 458
    const v13, 0x3e4ccccd    # 0.2f

    .line 459
    .line 460
    .line 461
    const v14, 0x3e4ccccd    # 0.2f

    .line 462
    .line 463
    .line 464
    const v15, 0x3e4ccccd    # 0.2f

    .line 465
    .line 466
    .line 467
    const v16, 0x3f028f5c    # 0.51f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/4 v0, 0x0

    .line 474
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x419251ec    # 18.29f

    .line 478
    .line 479
    .line 480
    const/high16 v18, 0x41980000    # 19.0f

    .line 481
    .line 482
    const v13, 0x41966666    # 18.8f

    .line 483
    .line 484
    .line 485
    const v14, 0x4199999a    # 19.2f

    .line 486
    .line 487
    .line 488
    const v15, 0x4193eb85    # 18.49f

    .line 489
    .line 490
    .line 491
    const v16, 0x4199999a    # 19.2f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const/16 v16, 0x3800

    .line 505
    .line 506
    const/16 v17, 0x0

    .line 507
    .line 508
    const/high16 v6, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    const/high16 v12, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/4 v13, 0x0

    .line 514
    const/4 v14, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const-string v4, ""

    .line 517
    .line 518
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sput-object v0, Landroidx/compose/material/icons/rounded/ScheduleSendKt;->_scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 527
    .line 528
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-object v0
.end method

.method public static synthetic getScheduleSend$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.ScheduleSend"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.ScheduleSend"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.ScheduleSend"
            }
        .end subannotation
    .end annotation

    return-void
.end method
