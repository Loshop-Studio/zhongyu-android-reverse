.class public final Landroidx/compose/material/icons/automirrored/twotone/StopScreenShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_stopScreenShare",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "StopScreenShare",
        "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;",
        "getStopScreenShare",
        "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nStopScreenShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/twotone/StopScreenShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n223#2:107\n216#2,3:108\n219#2,4:112\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n174#3:111\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n72#5,4:138\n72#5,4:176\n72#5,4:214\n*S KotlinDebug\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/twotone/StopScreenShareKt\n*L\n29#1:107\n29#1:108,3\n29#1:112,4\n31#1:116,18\n31#1:153\n42#1:154,18\n42#1:191\n89#1:192,18\n89#1:229\n29#1:111\n31#1:134,2\n31#1:136,2\n31#1:142,11\n42#1:172,2\n42#1:174,2\n42#1:180,11\n89#1:210,2\n89#1:212,2\n89#1:218,11\n31#1:138,4\n42#1:176,4\n89#1:214,4\n*E\n"
    }
.end annotation


# static fields
.field private static _stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStopScreenShare(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/twotone/StopScreenShareKt;->_stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.TwoTone.StopScreenShare"

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
    const v4, 0x412ab852    # 10.67f

    .line 71
    .line 72
    .line 73
    const v6, 0x4148a3d7    # 12.54f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const/high16 v26, 0x41700000    # 15.0f

    .line 82
    .line 83
    const v21, 0x4112147b    # 9.13f

    .line 84
    .line 85
    .line 86
    const v22, 0x414eb852    # 12.92f

    .line 87
    .line 88
    .line 89
    const v23, 0x40feb852    # 7.96f

    .line 90
    .line 91
    .line 92
    const v24, 0x415b5c29    # 13.71f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, 0x40051eb8    # 2.08f

    .line 101
    .line 102
    .line 103
    const v26, -0x3f7e6666    # -4.05f

    .line 104
    .line 105
    .line 106
    const v21, 0x3e9eb852    # 0.31f

    .line 107
    .line 108
    .line 109
    const v22, -0x40428f5c    # -1.48f

    .line 110
    .line 111
    .line 112
    const v23, 0x3f70a3d7    # 0.94f

    .line 113
    .line 114
    .line 115
    const v24, -0x3fc47ae1    # -2.93f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x408428f6    # 4.13f

    .line 122
    .line 123
    .line 124
    const v6, 0x40c0a3d7    # 6.02f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40800000    # 4.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x412028f6    # 10.01f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x41223d71    # 10.14f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, -0x3fa1eb85    # -3.47f

    .line 148
    .line 149
    .line 150
    const v6, -0x3fa0a3d7    # -3.49f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/16 v16, 0x3800

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const v6, 0x3e99999a    # 0.3f

    .line 168
    .line 169
    .line 170
    const v8, 0x3e99999a    # 0.3f

    .line 171
    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    const/high16 v9, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v12, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const-string v4, ""

    .line 182
    .line 183
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 184
    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 193
    .line 194
    .line 195
    move-result-wide v6

    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const v4, 0x41ae51ec    # 21.79f

    .line 214
    .line 215
    .line 216
    const/high16 v6, 0x41900000    # 18.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41c00000    # 24.0f

    .line 227
    .line 228
    const/high16 v6, 0x41a00000    # 20.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, -0x40000000    # -2.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, -0x3ff28f5c    # -2.21f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x403eb852    # 2.98f

    .line 248
    .line 249
    .line 250
    const v6, 0x3f8e147b    # 1.11f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x3fc66666    # 1.55f

    .line 257
    .line 258
    .line 259
    const v6, 0x3fc7ae14    # 1.56f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x40d70a3d    # -0.66f

    .line 266
    .line 267
    .line 268
    const v26, 0x3fbd70a4    # 1.48f

    .line 269
    .line 270
    .line 271
    const v21, -0x412e147b    # -0.41f

    .line 272
    .line 273
    .line 274
    const v22, 0x3ebd70a4    # 0.37f

    .line 275
    .line 276
    .line 277
    const v23, -0x40d70a3d    # -0.66f

    .line 278
    .line 279
    .line 280
    const v24, 0x3f63d70a    # 0.89f

    .line 281
    .line 282
    .line 283
    move-object/from16 v20, v2

    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x41800000    # 16.0f

    .line 289
    .line 290
    const/high16 v6, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x4000a3d7    # 2.01f

    .line 296
    .line 297
    .line 298
    const/high16 v26, 0x40000000    # 2.0f

    .line 299
    .line 300
    const/16 v21, 0x0

    .line 301
    .line 302
    const v22, 0x3f8ccccd    # 1.1f

    .line 303
    .line 304
    .line 305
    const v23, 0x3f666666    # 0.9f

    .line 306
    .line 307
    .line 308
    const/high16 v24, 0x40000000    # 2.0f

    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    const/high16 v6, 0x41900000    # 18.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x41910a3d    # 18.13f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x402d70a4    # 2.71f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x3fb47ae1    # 1.41f

    .line 337
    .line 338
    .line 339
    const v6, -0x404b851f    # -1.41f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x402147ae    # 2.52f

    .line 346
    .line 347
    .line 348
    const v6, 0x3fc8f5c3    # 1.57f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, 0x403eb852    # 2.98f

    .line 355
    .line 356
    .line 357
    const v6, 0x3f8e147b    # 1.11f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x40800000    # 4.0f

    .line 367
    .line 368
    const v6, 0x40c0a3d7    # 6.02f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x3e051eb8    # 0.13f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x409e6666    # 4.95f

    .line 381
    .line 382
    .line 383
    const v6, 0x409dc28f    # 4.93f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v25, 0x40e00000    # 7.0f

    .line 390
    .line 391
    const/high16 v26, 0x41700000    # 15.0f

    .line 392
    .line 393
    const v21, 0x40fe147b    # 7.94f

    .line 394
    .line 395
    .line 396
    const v22, 0x41411eb8    # 12.07f

    .line 397
    .line 398
    .line 399
    const v23, 0x40e9eb85    # 7.31f

    .line 400
    .line 401
    .line 402
    const v24, 0x415851ec    # 13.52f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x406ae148    # 3.67f

    .line 409
    .line 410
    .line 411
    const v26, -0x3fe28f5c    # -2.46f

    .line 412
    .line 413
    .line 414
    const v21, 0x3f75c28f    # 0.96f

    .line 415
    .line 416
    .line 417
    const v22, -0x405ae148    # -1.29f

    .line 418
    .line 419
    .line 420
    const v23, 0x400851ec    # 2.13f

    .line 421
    .line 422
    .line 423
    const v24, -0x3ffae148    # -2.08f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v4, 0x405d70a4    # 3.46f

    .line 430
    .line 431
    .line 432
    const v6, 0x405eb852    # 3.48f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x418028f6    # 16.02f

    .line 439
    .line 440
    .line 441
    const/high16 v6, 0x40800000    # 4.0f

    .line 442
    .line 443
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41a00000    # 20.0f

    .line 455
    .line 456
    const v6, 0x40c0a3d7    # 6.02f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v4, 0x41230a3d    # 10.19f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v4, 0x3fa66666    # 1.3f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v25, 0x3f333333    # 0.7f

    .line 475
    .line 476
    .line 477
    const v26, -0x404147ae    # -1.49f

    .line 478
    .line 479
    .line 480
    const v21, 0x3ed70a3d    # 0.42f

    .line 481
    .line 482
    .line 483
    const v22, -0x41428f5c    # -0.37f

    .line 484
    .line 485
    .line 486
    const v23, 0x3f333333    # 0.7f

    .line 487
    .line 488
    .line 489
    const v24, -0x409c28f6    # -0.89f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 496
    .line 497
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v25, -0x40000000    # -2.0f

    .line 501
    .line 502
    const/high16 v26, -0x40000000    # -2.0f

    .line 503
    .line 504
    const/16 v21, 0x0

    .line 505
    .line 506
    const v22, -0x4071eb85    # -1.11f

    .line 507
    .line 508
    .line 509
    const v23, -0x4099999a    # -0.9f

    .line 510
    .line 511
    .line 512
    const/high16 v24, -0x40000000    # -2.0f

    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v4, 0x40f9999a    # 7.8f

    .line 518
    .line 519
    .line 520
    const v6, 0x4080a3d7    # 4.02f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v4, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x41a00000    # 20.0f

    .line 532
    .line 533
    const v6, 0x40c0a3d7    # 6.02f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v4, 0x414ee148    # 12.93f

    .line 543
    .line 544
    .line 545
    const v6, 0x41126666    # 9.15f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v4, 0x40328f5c    # 2.79f

    .line 552
    .line 553
    .line 554
    const v6, 0x4031eb85    # 2.78f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, 0x3fa3d70a    # 1.28f

    .line 561
    .line 562
    .line 563
    const v6, -0x40666666    # -1.2f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x41500000    # 13.0f

    .line 570
    .line 571
    const/high16 v6, 0x40e00000    # 7.0f

    .line 572
    .line 573
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v4, 0x400851ec    # 2.13f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, -0x4270a3d7    # -0.07f

    .line 583
    .line 584
    .line 585
    const v6, 0x3ca3d70a    # 0.02f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    const/high16 v6, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v8, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v7, 0x0

    .line 603
    const-string v4, ""

    .line 604
    .line 605
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 606
    .line 607
    .line 608
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 613
    .line 614
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 615
    .line 616
    .line 617
    move-result-wide v6

    .line 618
    const/4 v0, 0x0

    .line 619
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 623
    .line 624
    .line 625
    move-result v10

    .line 626
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 627
    .line 628
    .line 629
    move-result v11

    .line 630
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 633
    .line 634
    .line 635
    const/high16 v0, 0x41a00000    # 20.0f

    .line 636
    .line 637
    const v2, 0x40c0a3d7    # 6.02f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x411ccccd    # 9.8f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x404851ec    # 3.13f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x3d8f5c29    # 0.07f

    .line 656
    .line 657
    .line 658
    const v18, -0x435c28f6    # -0.02f

    .line 659
    .line 660
    .line 661
    const v13, 0x3ca3d70a    # 0.02f

    .line 662
    .line 663
    .line 664
    const v15, 0x3d23d70a    # 0.04f

    .line 665
    .line 666
    .line 667
    const v16, -0x43dc28f6    # -0.01f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, 0x40e00000    # 7.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x406eb852    # 3.73f

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x40800000    # 4.0f

    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, -0x405c28f6    # -1.28f

    .line 687
    .line 688
    .line 689
    const v2, 0x3f99999a    # 1.2f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x4181ae14    # 16.21f

    .line 696
    .line 697
    .line 698
    const/high16 v2, 0x41a00000    # 20.0f

    .line 699
    .line 700
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x40c0a3d7    # 6.02f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const v6, 0x3e99999a    # 0.3f

    .line 721
    .line 722
    .line 723
    const v8, 0x3e99999a    # 0.3f

    .line 724
    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    const/high16 v12, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/4 v13, 0x0

    .line 730
    const/4 v15, 0x0

    .line 731
    const-string v4, ""

    .line 732
    .line 733
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    sput-object v0, Landroidx/compose/material/icons/automirrored/twotone/StopScreenShareKt;->_stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 742
    .line 743
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    return-object v0
.end method
