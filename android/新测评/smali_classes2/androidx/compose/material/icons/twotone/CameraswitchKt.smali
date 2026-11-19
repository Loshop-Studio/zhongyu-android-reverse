.class public final Landroidx/compose/material/icons/twotone/CameraswitchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cameraswitch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cameraswitch",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCameraswitch",
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
        "SMAP\nCameraswitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cameraswitch.kt\nandroidx/compose/material/icons/twotone/CameraswitchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n233#2,18:231\n253#2:268\n233#2,18:269\n253#2:306\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n705#4,2:249\n717#4,2:251\n719#4,11:257\n705#4,2:287\n717#4,2:289\n719#4,11:295\n72#5,4:139\n72#5,4:177\n72#5,4:215\n72#5,4:253\n72#5,4:291\n*S KotlinDebug\n*F\n+ 1 Cameraswitch.kt\nandroidx/compose/material/icons/twotone/CameraswitchKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n48#1:155,18\n48#1:192\n74#1:193,18\n74#1:230\n80#1:231,18\n80#1:268\n89#1:269,18\n89#1:306\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n48#1:173,2\n48#1:175,2\n48#1:181,11\n74#1:211,2\n74#1:213,2\n74#1:219,11\n80#1:249,2\n80#1:251,2\n80#1:257,11\n89#1:287,2\n89#1:289,2\n89#1:295,11\n30#1:139,4\n48#1:177,4\n74#1:215,4\n80#1:253,4\n89#1:291,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCameraswitch(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CameraswitchKt;->_cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Cameraswitch"

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
    const v4, 0x4152b852    # 13.17f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3fea3d71    # -2.34f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const/high16 v6, -0x40800000    # -1.0f

    .line 87
    .line 88
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x41000000    # 8.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40c00000    # 6.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41100000    # 9.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x4015c28f    # -1.83f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x4152b852    # 13.17f

    .line 118
    .line 119
    .line 120
    const/high16 v6, 0x41000000    # 8.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41600000    # 14.0f

    .line 129
    .line 130
    const/high16 v6, 0x41400000    # 12.0f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, -0x40000000    # -2.0f

    .line 136
    .line 137
    const/high16 v26, -0x40000000    # -2.0f

    .line 138
    .line 139
    const v21, -0x40733333    # -1.1f

    .line 140
    .line 141
    .line 142
    const/16 v22, 0x0

    .line 143
    .line 144
    const/high16 v23, -0x40000000    # -2.0f

    .line 145
    .line 146
    const v24, -0x4099999a    # -0.9f

    .line 147
    .line 148
    .line 149
    move-object/from16 v20, v2

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x40000000    # 2.0f

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const v22, -0x40733333    # -1.1f

    .line 159
    .line 160
    .line 161
    const v23, 0x3f666666    # 0.9f

    .line 162
    .line 163
    .line 164
    const/high16 v24, -0x40000000    # -2.0f

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x3f666666    # 0.9f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x40000000    # 2.0f

    .line 173
    .line 174
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v25, 0x41400000    # 12.0f

    .line 178
    .line 179
    const/high16 v26, 0x41600000    # 14.0f

    .line 180
    .line 181
    const/high16 v21, 0x41600000    # 14.0f

    .line 182
    .line 183
    const v22, 0x4151999a    # 13.1f

    .line 184
    .line 185
    .line 186
    const v23, 0x4151999a    # 13.1f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x41600000    # 14.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const/16 v16, 0x3800

    .line 202
    .line 203
    const/16 v17, 0x0

    .line 204
    .line 205
    const v6, 0x3e99999a    # 0.3f

    .line 206
    .line 207
    .line 208
    const v8, 0x3e99999a    # 0.3f

    .line 209
    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/high16 v9, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v12, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const-string v4, ""

    .line 220
    .line 221
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40e00000    # 7.0f

    .line 252
    .line 253
    const/high16 v6, 0x41800000    # 16.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, -0x40800000    # -1.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, -0x3f800000    # -4.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x40e00000    # 7.0f

    .line 272
    .line 273
    const/high16 v6, 0x41100000    # 9.0f

    .line 274
    .line 275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41000000    # 8.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x40c00000    # 6.0f

    .line 284
    .line 285
    const/high16 v26, 0x41100000    # 9.0f

    .line 286
    .line 287
    const v21, 0x40dccccd    # 6.9f

    .line 288
    .line 289
    .line 290
    const/high16 v22, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/high16 v23, 0x40c00000    # 6.0f

    .line 293
    .line 294
    const v24, 0x40fccccd    # 7.9f

    .line 295
    .line 296
    .line 297
    move-object/from16 v20, v2

    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x40c00000    # 6.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x40000000    # 2.0f

    .line 308
    .line 309
    const/high16 v26, 0x40000000    # 2.0f

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const v22, 0x3f8ccccd    # 1.1f

    .line 314
    .line 315
    .line 316
    const v23, 0x3f666666    # 0.9f

    .line 317
    .line 318
    .line 319
    const/high16 v24, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v4, 0x41000000    # 8.0f

    .line 325
    .line 326
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v26, -0x40000000    # -2.0f

    .line 330
    .line 331
    const v21, 0x3f8ccccd    # 1.1f

    .line 332
    .line 333
    .line 334
    const/16 v22, 0x0

    .line 335
    .line 336
    const/high16 v23, 0x40000000    # 2.0f

    .line 337
    .line 338
    const v24, -0x4099999a    # -0.9f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x41100000    # 9.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, 0x41800000    # 16.0f

    .line 350
    .line 351
    const/high16 v26, 0x40e00000    # 7.0f

    .line 352
    .line 353
    const/high16 v21, 0x41900000    # 18.0f

    .line 354
    .line 355
    const v22, 0x40fccccd    # 7.9f

    .line 356
    .line 357
    .line 358
    const v23, 0x4188cccd    # 17.1f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x40e00000    # 7.0f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x41700000    # 15.0f

    .line 370
    .line 371
    const/high16 v6, 0x41800000    # 16.0f

    .line 372
    .line 373
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x41000000    # 8.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41100000    # 9.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v4, 0x3fea3d71    # 1.83f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v4, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v6, -0x40800000    # -1.0f

    .line 395
    .line 396
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v4, 0x4015c28f    # 2.34f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x3f800000    # 1.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41800000    # 16.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v4, 0x41700000    # 15.0f

    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const/high16 v6, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/high16 v8, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    const-string v4, ""

    .line 433
    .line 434
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 435
    .line 436
    .line 437
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 442
    .line 443
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 444
    .line 445
    .line 446
    move-result-wide v6

    .line 447
    const/4 v2, 0x0

    .line 448
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 452
    .line 453
    .line 454
    move-result v10

    .line 455
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    const/high16 v4, 0x41400000    # 12.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, -0x40000000    # -2.0f

    .line 470
    .line 471
    const/4 v6, 0x0

    .line 472
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v26, 0x40800000    # 4.0f

    .line 476
    .line 477
    const/16 v27, 0x0

    .line 478
    .line 479
    const/high16 v21, 0x40000000    # 2.0f

    .line 480
    .line 481
    const/high16 v22, 0x40000000    # 2.0f

    .line 482
    .line 483
    const/16 v23, 0x0

    .line 484
    .line 485
    const/16 v24, 0x1

    .line 486
    .line 487
    const/16 v25, 0x1

    .line 488
    .line 489
    move-object/from16 v20, v2

    .line 490
    .line 491
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v26, -0x3f800000    # -4.0f

    .line 495
    .line 496
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const/high16 v6, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    const/4 v2, 0x0

    .line 522
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const v4, 0x41091eb8    # 8.57f

    .line 539
    .line 540
    .line 541
    const v6, 0x3f051eb8    # 0.52f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v4, 0x4150cccd    # 13.05f

    .line 548
    .line 549
    .line 550
    const/high16 v6, 0x40a00000    # 5.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x40033333    # 2.05f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v25, 0x41b00000    # 22.0f

    .line 562
    .line 563
    const/high16 v26, 0x41300000    # 11.0f

    .line 564
    .line 565
    const v21, 0x418e28f6    # 17.77f

    .line 566
    .line 567
    .line 568
    const v22, 0x402147ae    # 2.52f

    .line 569
    .line 570
    .line 571
    const v23, 0x41ac3d71    # 21.53f

    .line 572
    .line 573
    .line 574
    const v24, 0x40c8f5c3    # 6.28f

    .line 575
    .line 576
    .line 577
    move-object/from16 v20, v2

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v25, 0x40000000    # 2.0f

    .line 583
    .line 584
    const/16 v26, 0x0

    .line 585
    .line 586
    const/16 v21, 0x0

    .line 587
    .line 588
    const/16 v22, 0x0

    .line 589
    .line 590
    const/high16 v23, 0x40000000    # 2.0f

    .line 591
    .line 592
    const/16 v24, 0x0

    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v25, 0x41091eb8    # 8.57f

    .line 598
    .line 599
    .line 600
    const v26, 0x3f051eb8    # 0.52f

    .line 601
    .line 602
    .line 603
    const v21, 0x41bab852    # 23.34f

    .line 604
    .line 605
    .line 606
    const v22, 0x4041eb85    # 3.03f

    .line 607
    .line 608
    .line 609
    const v23, 0x4177d70a    # 15.49f

    .line 610
    .line 611
    .line 612
    const v24, -0x4035c28f    # -1.58f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/high16 v6, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v7, 0x0

    .line 628
    const-string v4, ""

    .line 629
    .line 630
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 631
    .line 632
    .line 633
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 638
    .line 639
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 640
    .line 641
    .line 642
    move-result-wide v6

    .line 643
    const/4 v0, 0x0

    .line 644
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 648
    .line 649
    .line 650
    move-result v10

    .line 651
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 652
    .line 653
    .line 654
    move-result v11

    .line 655
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 658
    .line 659
    .line 660
    const v0, 0x412f3333    # 10.95f

    .line 661
    .line 662
    .line 663
    const v2, 0x41afae14    # 21.96f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v17, 0x40000000    # 2.0f

    .line 670
    .line 671
    const v18, 0x415028f6    # 13.01f

    .line 672
    .line 673
    .line 674
    const v13, 0x40c75c29    # 6.23f

    .line 675
    .line 676
    .line 677
    const v14, 0x41abeb85    # 21.49f

    .line 678
    .line 679
    .line 680
    const v15, 0x401e147b    # 2.47f

    .line 681
    .line 682
    .line 683
    const v16, 0x418dd70a    # 17.73f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, -0x40000000    # -2.0f

    .line 690
    .line 691
    const/16 v18, 0x0

    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const/4 v14, 0x0

    .line 695
    const/high16 v15, -0x40000000    # -2.0f

    .line 696
    .line 697
    const/16 v16, 0x0

    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x4176e148    # 15.43f

    .line 703
    .line 704
    .line 705
    const v18, 0x4127ae14    # 10.48f

    .line 706
    .line 707
    .line 708
    const v13, 0x3f28f5c3    # 0.66f

    .line 709
    .line 710
    .line 711
    const v14, 0x40ff0a3d    # 7.97f

    .line 712
    .line 713
    .line 714
    const v15, 0x410828f6    # 8.51f

    .line 715
    .line 716
    .line 717
    const v16, 0x414947ae    # 12.58f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, -0x3f70a3d7    # -4.48f

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x41afae14    # 21.96f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    const/16 v16, 0x3800

    .line 743
    .line 744
    const/16 v17, 0x0

    .line 745
    .line 746
    const/high16 v6, 0x3f800000    # 1.0f

    .line 747
    .line 748
    const/4 v7, 0x0

    .line 749
    const/high16 v12, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const/4 v13, 0x0

    .line 752
    const/4 v14, 0x0

    .line 753
    const/4 v15, 0x0

    .line 754
    const-string v4, ""

    .line 755
    .line 756
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    sput-object v0, Landroidx/compose/material/icons/twotone/CameraswitchKt;->_cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 765
    .line 766
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    return-object v0
.end method
