.class public final Landroidx/compose/material/icons/twotone/AutoDeleteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoDelete",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoDelete",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAutoDelete",
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
        "SMAP\nAutoDelete.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoDelete.kt\nandroidx/compose/material/icons/twotone/AutoDeleteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n233#2,18:182\n253#2:219\n233#2,18:220\n253#2:257\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n705#4,2:200\n717#4,2:202\n719#4,11:208\n705#4,2:238\n717#4,2:240\n719#4,11:246\n72#5,4:128\n72#5,4:166\n72#5,4:204\n72#5,4:242\n*S KotlinDebug\n*F\n+ 1 AutoDelete.kt\nandroidx/compose/material/icons/twotone/AutoDeleteKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n40#1:144,18\n40#1:181\n51#1:182,18\n51#1:219\n78#1:220,18\n78#1:257\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n40#1:162,2\n40#1:164,2\n40#1:170,11\n51#1:200,2\n51#1:202,2\n51#1:208,11\n78#1:238,2\n78#1:240,2\n78#1:246,11\n30#1:128,4\n40#1:166,4\n51#1:204,4\n78#1:242,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoDelete:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoDelete(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AutoDeleteKt;->_autoDelete:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AutoDelete"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41200000    # 10.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x40a28f5c    # 5.08f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v25, 0x41100000    # 9.0f

    .line 94
    .line 95
    const/high16 v26, 0x41800000    # 16.0f

    .line 96
    .line 97
    const v21, 0x41107ae1    # 9.03f

    .line 98
    .line 99
    .line 100
    const v22, 0x41855c29    # 16.67f

    .line 101
    .line 102
    .line 103
    const/high16 v23, 0x41100000    # 9.0f

    .line 104
    .line 105
    const v24, 0x4182b852    # 16.34f

    .line 106
    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, 0x40400000    # 3.0f

    .line 114
    .line 115
    const v26, -0x3f4851ec    # -5.74f

    .line 116
    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const v22, -0x3fe7ae14    # -2.38f

    .line 121
    .line 122
    .line 123
    const v23, 0x3f9851ec    # 1.19f

    .line 124
    .line 125
    .line 126
    const v24, -0x3f70f5c3    # -4.47f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x40e00000    # 7.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/16 v16, 0x3800

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const v6, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const v8, 0x3e99999a    # 0.3f

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x41700000    # 15.0f

    .line 195
    .line 196
    const/high16 v6, 0x40000000    # 2.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, -0x40800000    # -1.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, -0x3f600000    # -5.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v4, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v6, -0x40800000    # -1.0f

    .line 220
    .line 221
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x40000000    # 2.0f

    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41600000    # 14.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const/high16 v6, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v8, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v7, 0x0

    .line 252
    const-string v4, ""

    .line 253
    .line 254
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 255
    .line 256
    .line 257
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 262
    .line 263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 264
    .line 265
    .line 266
    move-result-wide v6

    .line 267
    const/4 v2, 0x0

    .line 268
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x41100000    # 9.0f

    .line 285
    .line 286
    const/high16 v6, 0x41800000    # 16.0f

    .line 287
    .line 288
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, -0x40000000    # -2.0f

    .line 292
    .line 293
    const v26, 0x3e947ae1    # 0.29f

    .line 294
    .line 295
    .line 296
    const v21, -0x40cccccd    # -0.7f

    .line 297
    .line 298
    .line 299
    const/16 v22, 0x0

    .line 300
    .line 301
    const v23, -0x4050a3d7    # -1.37f

    .line 302
    .line 303
    .line 304
    const v24, 0x3dcccccd    # 0.1f

    .line 305
    .line 306
    .line 307
    move-object/from16 v20, v2

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x40a00000    # 5.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x40000000    # 2.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x41400000    # 12.0f

    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/high16 v26, 0x40000000    # 2.0f

    .line 330
    .line 331
    const/16 v21, 0x0

    .line 332
    .line 333
    const v22, 0x3f8ccccd    # 1.1f

    .line 334
    .line 335
    .line 336
    const v23, 0x3f666666    # 0.9f

    .line 337
    .line 338
    .line 339
    const/high16 v24, 0x40000000    # 2.0f

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x40b5c28f    # 5.68f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x40ca3d71    # 6.32f

    .line 351
    .line 352
    .line 353
    const/high16 v26, 0x40800000    # 4.0f

    .line 354
    .line 355
    const v21, 0x3f8f5c29    # 1.12f

    .line 356
    .line 357
    .line 358
    const v22, 0x40170a3d    # 2.36f

    .line 359
    .line 360
    .line 361
    const v23, 0x4061eb85    # 3.53f

    .line 362
    .line 363
    .line 364
    const/high16 v24, 0x40800000    # 4.0f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, 0x40e00000    # 7.0f

    .line 370
    .line 371
    const/high16 v26, -0x3f200000    # -7.0f

    .line 372
    .line 373
    const v21, 0x4077ae14    # 3.87f

    .line 374
    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const/high16 v23, 0x40e00000    # 7.0f

    .line 379
    .line 380
    const v24, -0x3fb7ae14    # -3.13f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v25, 0x41800000    # 16.0f

    .line 387
    .line 388
    const/high16 v26, 0x41100000    # 9.0f

    .line 389
    .line 390
    const/high16 v21, 0x41b80000    # 23.0f

    .line 391
    .line 392
    const v22, 0x4142147b    # 12.13f

    .line 393
    .line 394
    .line 395
    const v23, 0x419ef5c3    # 19.87f

    .line 396
    .line 397
    .line 398
    const/high16 v24, 0x41100000    # 9.0f

    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x41100000    # 9.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, 0x3da3d70a    # 0.08f

    .line 412
    .line 413
    .line 414
    const/high16 v26, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/16 v21, 0x0

    .line 417
    .line 418
    const v22, 0x3eae147b    # 0.34f

    .line 419
    .line 420
    .line 421
    const v23, 0x3cf5c28f    # 0.03f

    .line 422
    .line 423
    .line 424
    const v24, 0x3f2b851f    # 0.67f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x40800000    # 4.0f

    .line 431
    .line 432
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x40e00000    # 7.0f

    .line 436
    .line 437
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x41000000    # 8.0f

    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x4050a3d7    # 3.26f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v25, 0x41100000    # 9.0f

    .line 452
    .line 453
    const/high16 v26, 0x41800000    # 16.0f

    .line 454
    .line 455
    const v21, 0x41230a3d    # 10.19f

    .line 456
    .line 457
    .line 458
    const v22, 0x41387ae1    # 11.53f

    .line 459
    .line 460
    .line 461
    const/high16 v23, 0x41100000    # 9.0f

    .line 462
    .line 463
    const v24, 0x4159eb85    # 13.62f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41a80000    # 21.0f

    .line 473
    .line 474
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v25, -0x3f600000    # -5.0f

    .line 478
    .line 479
    const/high16 v26, -0x3f600000    # -5.0f

    .line 480
    .line 481
    const v21, -0x3fcf5c29    # -2.76f

    .line 482
    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    const/high16 v23, -0x3f600000    # -5.0f

    .line 487
    .line 488
    const v24, -0x3ff0a3d7    # -2.24f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v4, 0x400f5c29    # 2.24f

    .line 495
    .line 496
    .line 497
    const/high16 v6, -0x3f600000    # -5.0f

    .line 498
    .line 499
    const/high16 v7, 0x40a00000    # 5.0f

    .line 500
    .line 501
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v6, 0x40a00000    # 5.0f

    .line 505
    .line 506
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v4, 0x4196147b    # 18.76f

    .line 510
    .line 511
    .line 512
    const/high16 v6, 0x41a80000    # 21.0f

    .line 513
    .line 514
    const/high16 v7, 0x41800000    # 16.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const-string v4, ""

    .line 530
    .line 531
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 532
    .line 533
    .line 534
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 539
    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 541
    .line 542
    .line 543
    move-result-wide v6

    .line 544
    const/4 v0, 0x0

    .line 545
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x41840000    # 16.5f

    .line 562
    .line 563
    const/high16 v4, 0x41400000    # 12.0f

    .line 564
    .line 565
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v2, -0x40400000    # -1.5f

    .line 569
    .line 570
    const/4 v4, 0x0

    .line 571
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v2, 0x40a00000    # 5.0f

    .line 575
    .line 576
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v2, 0x40666666    # 3.6f

    .line 580
    .line 581
    .line 582
    const v4, 0x40066666    # 2.1f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v2, 0x3f4ccccd    # 0.8f

    .line 589
    .line 590
    .line 591
    const v4, -0x40666666    # -1.2f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v2, -0x3fc66666    # -2.9f

    .line 598
    .line 599
    .line 600
    const v4, -0x40266666    # -1.7f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    const-string v4, ""

    .line 617
    .line 618
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    sput-object v0, Landroidx/compose/material/icons/twotone/AutoDeleteKt;->_autoDelete:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    return-object v0
.end method
