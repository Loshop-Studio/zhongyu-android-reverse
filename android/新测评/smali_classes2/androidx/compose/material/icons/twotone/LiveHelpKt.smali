.class public final Landroidx/compose/material/icons/twotone/LiveHelpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_liveHelp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LiveHelp",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLiveHelp$annotations",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)V",
        "getLiveHelp",
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
        "SMAP\nLiveHelp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveHelp.kt\nandroidx/compose/material/icons/twotone/LiveHelpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n72#5,4:147\n72#5,4:185\n*S KotlinDebug\n*F\n+ 1 LiveHelp.kt\nandroidx/compose/material/icons/twotone/LiveHelpKt\n*L\n35#1:112,12\n36#1:125,18\n36#1:162\n65#1:163,18\n65#1:200\n35#1:124\n36#1:143,2\n36#1:145,2\n36#1:151,11\n65#1:181,2\n65#1:183,2\n65#1:189,11\n36#1:147,4\n65#1:185,4\n*E\n"
    }
.end annotation


# static fields
.field private static _liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLiveHelp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LiveHelpKt;->_liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LiveHelp"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x409a8f5c    # 4.83f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x3f170a3d    # 0.59f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x41a15c29    # 20.17f

    .line 90
    .line 91
    .line 92
    const/high16 v6, 0x41400000    # 12.0f

    .line 93
    .line 94
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x3fcb851f    # 1.59f

    .line 98
    .line 99
    .line 100
    const v6, -0x40347ae1    # -1.59f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x3f147ae1    # 0.58f

    .line 107
    .line 108
    .line 109
    const v6, -0x40eb851f    # -0.58f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x41980000    # 19.0f

    .line 116
    .line 117
    const/high16 v6, 0x41900000    # 18.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v6, 0x40800000    # 4.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40a00000    # 5.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41600000    # 14.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x41500000    # 13.0f

    .line 141
    .line 142
    const/high16 v6, 0x41880000    # 17.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, -0x40000000    # -2.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x40000000    # 2.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41400000    # 12.0f

    .line 167
    .line 168
    const/high16 v6, 0x40a00000    # 5.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x40800000    # 4.0f

    .line 174
    .line 175
    const/high16 v26, 0x40800000    # 4.0f

    .line 176
    .line 177
    const v21, 0x400d70a4    # 2.21f

    .line 178
    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    .line 182
    const/high16 v23, 0x40800000    # 4.0f

    .line 183
    .line 184
    const v24, 0x3fe51eb8    # 1.79f

    .line 185
    .line 186
    .line 187
    move-object/from16 v20, v2

    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 193
    .line 194
    const/high16 v26, 0x40a00000    # 5.0f

    .line 195
    .line 196
    const/16 v21, 0x0

    .line 197
    .line 198
    const/high16 v22, 0x40200000    # 2.5f

    .line 199
    .line 200
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    const/high16 v24, 0x40300000    # 2.75f

    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, -0x40000000    # -2.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, 0x40400000    # 3.0f

    .line 213
    .line 214
    const/high16 v26, -0x3f600000    # -5.0f

    .line 215
    .line 216
    const/high16 v22, -0x3fb00000    # -3.25f

    .line 217
    .line 218
    const/high16 v23, 0x40400000    # 3.0f

    .line 219
    .line 220
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v25, -0x40000000    # -2.0f

    .line 226
    .line 227
    const/high16 v26, -0x40000000    # -2.0f

    .line 228
    .line 229
    const v22, -0x40733333    # -1.1f

    .line 230
    .line 231
    .line 232
    const v23, -0x4099999a    # -0.9f

    .line 233
    .line 234
    .line 235
    const/high16 v24, -0x40000000    # -2.0f

    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x3f666666    # 0.9f

    .line 241
    .line 242
    .line 243
    const/high16 v6, -0x40000000    # -2.0f

    .line 244
    .line 245
    const/high16 v7, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41100000    # 9.0f

    .line 251
    .line 252
    const/high16 v6, 0x41000000    # 8.0f

    .line 253
    .line 254
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v25, 0x40800000    # 4.0f

    .line 258
    .line 259
    const/high16 v26, -0x3f800000    # -4.0f

    .line 260
    .line 261
    const v22, -0x3ff28f5c    # -2.21f

    .line 262
    .line 263
    .line 264
    const v23, 0x3fe51eb8    # 1.79f

    .line 265
    .line 266
    .line 267
    const/high16 v24, -0x3f800000    # -4.0f

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    const/16 v16, 0x3800

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    const v6, 0x3e99999a    # 0.3f

    .line 284
    .line 285
    .line 286
    const v8, 0x3e99999a    # 0.3f

    .line 287
    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    const/high16 v9, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v12, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const/4 v14, 0x0

    .line 296
    const/4 v15, 0x0

    .line 297
    const-string v4, ""

    .line 298
    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    const/4 v0, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41a80000    # 21.0f

    .line 330
    .line 331
    const/high16 v2, 0x40800000    # 4.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, -0x40000000    # -2.0f

    .line 337
    .line 338
    const/high16 v18, -0x40000000    # -2.0f

    .line 339
    .line 340
    const v14, -0x40733333    # -1.1f

    .line 341
    .line 342
    .line 343
    const v15, -0x4099999a    # -0.9f

    .line 344
    .line 345
    .line 346
    const/high16 v16, -0x40000000    # -2.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x40a00000    # 5.0f

    .line 352
    .line 353
    const/high16 v2, 0x40000000    # 2.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v18, 0x40000000    # 2.0f

    .line 359
    .line 360
    const v13, -0x4071eb85    # -1.11f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/high16 v15, -0x40000000    # -2.0f

    .line 365
    .line 366
    const v16, 0x3f666666    # 0.9f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41600000    # 14.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x40000000    # 2.0f

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const v14, 0x3f8ccccd    # 1.1f

    .line 381
    .line 382
    .line 383
    const v15, 0x3f63d70a    # 0.89f

    .line 384
    .line 385
    .line 386
    const/high16 v16, 0x40000000    # 2.0f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40800000    # 4.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40400000    # 3.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 402
    .line 403
    const/high16 v2, 0x40400000    # 3.0f

    .line 404
    .line 405
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40800000    # 4.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v18, -0x40000000    # -2.0f

    .line 414
    .line 415
    const v13, 0x3f8ccccd    # 1.1f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const/high16 v15, 0x40000000    # 2.0f

    .line 420
    .line 421
    const v16, -0x4099999a    # -0.9f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41a80000    # 21.0f

    .line 428
    .line 429
    const/high16 v2, 0x40800000    # 4.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41980000    # 19.0f

    .line 438
    .line 439
    const/high16 v2, 0x41900000    # 18.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x3f6570a4    # -4.83f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x40e8f5c3    # -0.59f

    .line 451
    .line 452
    .line 453
    const v2, 0x3f170a3d    # 0.59f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x41a15c29    # 20.17f

    .line 460
    .line 461
    .line 462
    const/high16 v2, 0x41400000    # 12.0f

    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, -0x40347ae1    # -1.59f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, -0x40eb851f    # -0.58f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41900000    # 18.0f

    .line 480
    .line 481
    const/high16 v2, 0x40a00000    # 5.0f

    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x40a00000    # 5.0f

    .line 487
    .line 488
    const/high16 v2, 0x40800000    # 4.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41600000    # 14.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41300000    # 11.0f

    .line 505
    .line 506
    const/high16 v2, 0x41700000    # 15.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x40000000    # 2.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, -0x40000000    # -2.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x40e00000    # 7.0f

    .line 528
    .line 529
    const/high16 v2, 0x41400000    # 12.0f

    .line 530
    .line 531
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v18, 0x40000000    # 2.0f

    .line 535
    .line 536
    const v16, 0x3f666666    # 0.9f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 543
    .line 544
    const/high16 v18, 0x40a00000    # 5.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/high16 v14, 0x40000000    # 2.0f

    .line 548
    .line 549
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 550
    .line 551
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x40000000    # 2.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x40400000    # 3.0f

    .line 562
    .line 563
    const/high16 v18, -0x3f600000    # -5.0f

    .line 564
    .line 565
    const/high16 v14, -0x3ff00000    # -2.25f

    .line 566
    .line 567
    const/high16 v15, 0x40400000    # 3.0f

    .line 568
    .line 569
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, -0x3f800000    # -4.0f

    .line 575
    .line 576
    const/high16 v18, -0x3f800000    # -4.0f

    .line 577
    .line 578
    const v14, -0x3ff28f5c    # -2.21f

    .line 579
    .line 580
    .line 581
    const v15, -0x401ae148    # -1.79f

    .line 582
    .line 583
    .line 584
    const/high16 v16, -0x3f800000    # -4.0f

    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40d947ae    # 6.79f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x41100000    # 9.0f

    .line 593
    .line 594
    const/high16 v4, 0x41000000    # 8.0f

    .line 595
    .line 596
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x40000000    # 2.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x40000000    # 2.0f

    .line 605
    .line 606
    const/high16 v18, -0x40000000    # -2.0f

    .line 607
    .line 608
    const v14, -0x40733333    # -1.1f

    .line 609
    .line 610
    .line 611
    const v15, 0x3f666666    # 0.9f

    .line 612
    .line 613
    .line 614
    const/high16 v16, -0x40000000    # -2.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/16 v16, 0x3800

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const/high16 v12, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/4 v14, 0x0

    .line 638
    const/4 v15, 0x0

    .line 639
    const-string v4, ""

    .line 640
    .line 641
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    sput-object v0, Landroidx/compose/material/icons/twotone/LiveHelpKt;->_liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    .line 651
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    return-object v0
.end method

.method public static synthetic getLiveHelp$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.LiveHelp"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.TwoTone.LiveHelp"
            imports = {
                "androidx.compose.material.icons.automirrored.twotone.LiveHelp"
            }
        .end subannotation
    .end annotation

    return-void
.end method
