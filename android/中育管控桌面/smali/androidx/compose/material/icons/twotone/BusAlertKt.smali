.class public final Landroidx/compose/material/icons/twotone/BusAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_busAlert",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BusAlert",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBusAlert",
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
        "SMAP\nBusAlert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusAlert.kt\nandroidx/compose/material/icons/twotone/BusAlertKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,132:1\n212#2,12:133\n233#2,18:146\n253#2:183\n233#2,18:184\n253#2:221\n233#2,18:222\n253#2:259\n233#2,18:260\n253#2:297\n233#2,18:298\n253#2:335\n233#2,18:336\n253#2:373\n174#3:145\n705#4,2:164\n717#4,2:166\n719#4,11:172\n705#4,2:202\n717#4,2:204\n719#4,11:210\n705#4,2:240\n717#4,2:242\n719#4,11:248\n705#4,2:278\n717#4,2:280\n719#4,11:286\n705#4,2:316\n717#4,2:318\n719#4,11:324\n705#4,2:354\n717#4,2:356\n719#4,11:362\n72#5,4:168\n72#5,4:206\n72#5,4:244\n72#5,4:282\n72#5,4:320\n72#5,4:358\n*S KotlinDebug\n*F\n+ 1 BusAlert.kt\nandroidx/compose/material/icons/twotone/BusAlertKt\n*L\n29#1:133,12\n30#1:146,18\n30#1:183\n52#1:184,18\n52#1:221\n59#1:222,18\n59#1:259\n95#1:260,18\n95#1:297\n101#1:298,18\n101#1:335\n107#1:336,18\n107#1:373\n29#1:145\n30#1:164,2\n30#1:166,2\n30#1:172,11\n52#1:202,2\n52#1:204,2\n52#1:210,11\n59#1:240,2\n59#1:242,2\n59#1:248,11\n95#1:278,2\n95#1:280,2\n95#1:286,11\n101#1:316,2\n101#1:318,2\n101#1:324,11\n107#1:354,2\n107#1:356,2\n107#1:362,11\n30#1:168,4\n52#1:206,4\n59#1:244,4\n95#1:282,4\n101#1:320,4\n107#1:358,4\n*E\n"
    }
.end annotation


# static fields
.field private static _busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBusAlert(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BusAlertKt;->_busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BusAlert"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f8ccccd    # 1.1f

    .line 84
    .line 85
    .line 86
    const v23, 0x3f666666    # 0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40000000    # 2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41000000    # 8.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v26, -0x40000000    # -2.0f

    .line 102
    .line 103
    const v21, 0x3f8ccccd    # 1.1f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x40000000    # 2.0f

    .line 109
    .line 110
    const v24, -0x4099999a    # -0.9f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41800000    # 16.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41580000    # 13.5f

    .line 135
    .line 136
    const/high16 v6, 0x41600000    # 14.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 142
    .line 143
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 144
    .line 145
    const v21, 0x3f547ae1    # 0.83f

    .line 146
    .line 147
    .line 148
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 149
    .line 150
    const v24, 0x3f2b851f    # 0.67f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x416547ae    # 14.33f

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41880000    # 17.0f

    .line 160
    .line 161
    const/high16 v7, 0x41580000    # 13.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x4182a3d7    # 16.33f

    .line 167
    .line 168
    .line 169
    const/high16 v6, 0x41400000    # 12.0f

    .line 170
    .line 171
    const/high16 v7, 0x41780000    # 15.5f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x414ab852    # 12.67f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x41580000    # 13.5f

    .line 180
    .line 181
    const/high16 v7, 0x41600000    # 14.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x40d00000    # 6.5f

    .line 190
    .line 191
    const/high16 v6, 0x41600000    # 14.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x41000000    # 8.0f

    .line 197
    .line 198
    const/high16 v26, 0x41780000    # 15.5f

    .line 199
    .line 200
    const v21, 0x40ea8f5c    # 7.33f

    .line 201
    .line 202
    .line 203
    const/high16 v22, 0x41600000    # 14.0f

    .line 204
    .line 205
    const/high16 v23, 0x41000000    # 8.0f

    .line 206
    .line 207
    const v24, 0x416ab852    # 14.67f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x40ea8f5c    # 7.33f

    .line 214
    .line 215
    .line 216
    const/high16 v6, 0x40d00000    # 6.5f

    .line 217
    .line 218
    const/high16 v7, 0x41880000    # 17.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x4182a3d7    # 16.33f

    .line 224
    .line 225
    .line 226
    const/high16 v6, 0x41780000    # 15.5f

    .line 227
    .line 228
    const/high16 v7, 0x40a00000    # 5.0f

    .line 229
    .line 230
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x40b570a4    # 5.67f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x40d00000    # 6.5f

    .line 237
    .line 238
    const/high16 v7, 0x41600000    # 14.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    const/16 v16, 0x3800

    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const v6, 0x3e99999a    # 0.3f

    .line 255
    .line 256
    .line 257
    const v8, 0x3e99999a    # 0.3f

    .line 258
    .line 259
    .line 260
    const/4 v7, 0x0

    .line 261
    const/high16 v9, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/high16 v12, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const/4 v14, 0x0

    .line 267
    const/4 v15, 0x0

    .line 268
    const-string v4, ""

    .line 269
    .line 270
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 278
    .line 279
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x40c00000    # 6.0f

    .line 301
    .line 302
    const v6, 0x408dc28f    # 4.43f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x41300000    # 11.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v25, 0x3da3d70a    # 0.08f

    .line 314
    .line 315
    .line 316
    const v26, -0x40851eb8    # -0.98f

    .line 317
    .line 318
    .line 319
    const/16 v21, 0x0

    .line 320
    .line 321
    const v22, -0x41570a3d    # -0.33f

    .line 322
    .line 323
    .line 324
    const v23, 0x3cf5c28f    # 0.03f

    .line 325
    .line 326
    .line 327
    const v24, -0x40d70a3d    # -0.66f

    .line 328
    .line 329
    .line 330
    move-object/from16 v20, v2

    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v25, 0x408dc28f    # 4.43f

    .line 336
    .line 337
    .line 338
    const/high16 v26, 0x40c00000    # 6.0f

    .line 339
    .line 340
    const v21, 0x40eccccd    # 7.4f

    .line 341
    .line 342
    .line 343
    const v22, 0x409d1eb8    # 4.91f

    .line 344
    .line 345
    .line 346
    const/high16 v23, 0x40a80000    # 5.25f

    .line 347
    .line 348
    const v24, 0x40a947ae    # 5.29f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const v6, 0x3e99999a    # 0.3f

    .line 362
    .line 363
    .line 364
    const/4 v7, 0x0

    .line 365
    const-string v4, ""

    .line 366
    .line 367
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 375
    .line 376
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 377
    .line 378
    .line 379
    move-result-wide v6

    .line 380
    const/4 v2, 0x0

    .line 381
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 389
    .line 390
    .line 391
    move-result v11

    .line 392
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    const/high16 v4, 0x41300000    # 11.0f

    .line 398
    .line 399
    const/high16 v6, 0x40800000    # 4.0f

    .line 400
    .line 401
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x41000000    # 8.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x40e947ae    # 7.29f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v25, 0x41300000    # 11.0f

    .line 416
    .line 417
    const v21, 0x4131999a    # 11.1f

    .line 418
    .line 419
    .line 420
    const v22, 0x40ebd70a    # 7.37f

    .line 421
    .line 422
    .line 423
    const/high16 v23, 0x41300000    # 11.0f

    .line 424
    .line 425
    const v24, 0x40d66666    # 6.7f

    .line 426
    .line 427
    .line 428
    move-object/from16 v20, v2

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x408dc28f    # 4.43f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v25, 0x40d4cccd    # 6.65f

    .line 440
    .line 441
    .line 442
    const v26, -0x40851eb8    # -0.98f

    .line 443
    .line 444
    .line 445
    const v21, 0x3f547ae1    # 0.83f

    .line 446
    .line 447
    .line 448
    const v22, -0x40ca3d71    # -0.71f

    .line 449
    .line 450
    .line 451
    const v23, 0x403eb852    # 2.98f

    .line 452
    .line 453
    .line 454
    const v24, -0x40747ae1    # -1.09f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x3f170a3d    # 0.59f

    .line 461
    .line 462
    .line 463
    const v26, -0x400147ae    # -1.99f

    .line 464
    .line 465
    .line 466
    const v21, 0x3dcccccd    # 0.1f

    .line 467
    .line 468
    .line 469
    const v22, -0x40cccccd    # -0.7f

    .line 470
    .line 471
    .line 472
    const v23, 0x3e99999a    # 0.3f

    .line 473
    .line 474
    .line 475
    const v24, -0x4050a3d7    # -1.37f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v25, 0x40000000    # 2.0f

    .line 482
    .line 483
    const/high16 v26, 0x40e00000    # 7.0f

    .line 484
    .line 485
    const v21, 0x403e147b    # 2.97f

    .line 486
    .line 487
    .line 488
    const v22, 0x402ae148    # 2.67f

    .line 489
    .line 490
    .line 491
    const/high16 v23, 0x40000000    # 2.0f

    .line 492
    .line 493
    const v24, 0x40a0a3d7    # 5.02f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x41180000    # 9.5f

    .line 500
    .line 501
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v25, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const v26, 0x401c28f6    # 2.44f

    .line 507
    .line 508
    .line 509
    const/16 v21, 0x0

    .line 510
    .line 511
    const v22, 0x3f733333    # 0.95f

    .line 512
    .line 513
    .line 514
    const v23, 0x3ec28f5c    # 0.38f

    .line 515
    .line 516
    .line 517
    const v24, 0x3fe7ae14    # 1.81f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x41a80000    # 21.0f

    .line 524
    .line 525
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v26, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const v22, 0x3f0ccccd    # 0.55f

    .line 531
    .line 532
    .line 533
    const v23, 0x3ee66666    # 0.45f

    .line 534
    .line 535
    .line 536
    const/high16 v24, 0x3f800000    # 1.0f

    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v26, -0x40800000    # -1.0f

    .line 547
    .line 548
    const v21, 0x3f0ccccd    # 0.55f

    .line 549
    .line 550
    .line 551
    const/16 v22, 0x0

    .line 552
    .line 553
    const/high16 v23, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const v24, -0x4119999a    # -0.45f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, -0x40800000    # -1.0f

    .line 562
    .line 563
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v4, 0x41000000    # 8.0f

    .line 567
    .line 568
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v4, 0x3f800000    # 1.0f

    .line 572
    .line 573
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v26, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/16 v21, 0x0

    .line 579
    .line 580
    const v22, 0x3f0ccccd    # 0.55f

    .line 581
    .line 582
    .line 583
    const v23, 0x3ee66666    # 0.45f

    .line 584
    .line 585
    .line 586
    const/high16 v24, 0x3f800000    # 1.0f

    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v26, -0x40800000    # -1.0f

    .line 595
    .line 596
    const v21, 0x3f0ccccd    # 0.55f

    .line 597
    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const/high16 v23, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const v24, -0x4119999a    # -0.45f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v4, -0x3ffc28f6    # -2.06f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v26, -0x3fe3d70a    # -2.44f

    .line 616
    .line 617
    .line 618
    const v21, 0x3f1eb852    # 0.62f

    .line 619
    .line 620
    .line 621
    const v22, -0x40deb852    # -0.63f

    .line 622
    .line 623
    .line 624
    const v24, -0x404147ae    # -1.49f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v4, 0x41500000    # 13.0f

    .line 631
    .line 632
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v25, -0x3f63851f    # -4.89f

    .line 636
    .line 637
    .line 638
    const/high16 v26, -0x40000000    # -2.0f

    .line 639
    .line 640
    const v21, -0x400b851f    # -1.91f

    .line 641
    .line 642
    .line 643
    const/16 v22, 0x0

    .line 644
    .line 645
    const v23, -0x3f97ae14    # -3.63f

    .line 646
    .line 647
    .line 648
    const v24, -0x40bd70a4    # -0.76f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v4, 0x40800000    # 4.0f

    .line 655
    .line 656
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v4, 0x41800000    # 16.0f

    .line 663
    .line 664
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v25, -0x40000000    # -2.0f

    .line 668
    .line 669
    const/high16 v26, 0x40000000    # 2.0f

    .line 670
    .line 671
    const/16 v21, 0x0

    .line 672
    .line 673
    const v22, 0x3f8ccccd    # 1.1f

    .line 674
    .line 675
    .line 676
    const v23, -0x4099999a    # -0.9f

    .line 677
    .line 678
    .line 679
    const/high16 v24, 0x40000000    # 2.0f

    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x40c00000    # 6.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v26, -0x40000000    # -2.0f

    .line 690
    .line 691
    const v21, -0x40733333    # -1.1f

    .line 692
    .line 693
    .line 694
    const/16 v22, 0x0

    .line 695
    .line 696
    const/high16 v23, -0x40000000    # -2.0f

    .line 697
    .line 698
    const v24, -0x4099999a    # -0.9f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 705
    .line 706
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v4, 0x41400000    # 12.0f

    .line 710
    .line 711
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v4, 0x41800000    # 16.0f

    .line 715
    .line 716
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v8, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const-string v4, ""

    .line 732
    .line 733
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 734
    .line 735
    .line 736
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 741
    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 743
    .line 744
    .line 745
    move-result-wide v6

    .line 746
    const/4 v2, 0x0

    .line 747
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 751
    .line 752
    .line 753
    move-result v10

    .line 754
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 755
    .line 756
    .line 757
    move-result v11

    .line 758
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 761
    .line 762
    .line 763
    const/high16 v4, 0x40d00000    # 6.5f

    .line 764
    .line 765
    const/high16 v6, 0x41780000    # 15.5f

    .line 766
    .line 767
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/4 v4, 0x0

    .line 771
    const/high16 v6, -0x40400000    # -1.5f

    .line 772
    .line 773
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v26, 0x40400000    # 3.0f

    .line 777
    .line 778
    const/16 v27, 0x0

    .line 779
    .line 780
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 781
    .line 782
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 783
    .line 784
    const/16 v23, 0x0

    .line 785
    .line 786
    const/16 v24, 0x1

    .line 787
    .line 788
    const/16 v25, 0x1

    .line 789
    .line 790
    move-object/from16 v20, v2

    .line 791
    .line 792
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 796
    .line 797
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const/high16 v6, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 817
    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 819
    .line 820
    .line 821
    move-result-wide v6

    .line 822
    const/4 v2, 0x0

    .line 823
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 831
    .line 832
    .line 833
    move-result v11

    .line 834
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    const/high16 v4, 0x41780000    # 15.5f

    .line 840
    .line 841
    const/high16 v6, 0x41580000    # 13.5f

    .line 842
    .line 843
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/4 v4, 0x0

    .line 847
    const/high16 v6, -0x40400000    # -1.5f

    .line 848
    .line 849
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v26, 0x40400000    # 3.0f

    .line 853
    .line 854
    move-object/from16 v20, v2

    .line 855
    .line 856
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 860
    .line 861
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    const/high16 v6, 0x3f800000    # 1.0f

    .line 869
    .line 870
    const/4 v7, 0x0

    .line 871
    const-string v4, ""

    .line 872
    .line 873
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 874
    .line 875
    .line 876
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 881
    .line 882
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 883
    .line 884
    .line 885
    move-result-wide v6

    .line 886
    const/4 v0, 0x0

    .line 887
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 891
    .line 892
    .line 893
    move-result v10

    .line 894
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 895
    .line 896
    .line 897
    move-result v11

    .line 898
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 901
    .line 902
    .line 903
    const/high16 v0, 0x41900000    # 18.0f

    .line 904
    .line 905
    const/high16 v2, 0x3f800000    # 1.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/high16 v17, -0x3f600000    # -5.0f

    .line 911
    .line 912
    const/high16 v18, 0x40a00000    # 5.0f

    .line 913
    .line 914
    const v13, -0x3fcf5c29    # -2.76f

    .line 915
    .line 916
    .line 917
    const/high16 v15, -0x3f600000    # -5.0f

    .line 918
    .line 919
    const v16, 0x400f5c29    # 2.24f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, 0x400f5c29    # 2.24f

    .line 926
    .line 927
    .line 928
    const/high16 v2, 0x40a00000    # 5.0f

    .line 929
    .line 930
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, -0x3ff0a3d7    # -2.24f

    .line 934
    .line 935
    .line 936
    const/high16 v2, -0x3f600000    # -5.0f

    .line 937
    .line 938
    const/high16 v4, 0x40a00000    # 5.0f

    .line 939
    .line 940
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const v0, 0x41a6147b    # 20.76f

    .line 944
    .line 945
    .line 946
    const/high16 v2, 0x41900000    # 18.0f

    .line 947
    .line 948
    const/high16 v4, 0x3f800000    # 1.0f

    .line 949
    .line 950
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const/high16 v0, 0x41940000    # 18.5f

    .line 957
    .line 958
    const/high16 v2, 0x41100000    # 9.0f

    .line 959
    .line 960
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v0, -0x40800000    # -1.0f

    .line 964
    .line 965
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const/high16 v0, 0x41000000    # 8.0f

    .line 969
    .line 970
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const/high16 v0, 0x3f800000    # 1.0f

    .line 974
    .line 975
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const/high16 v0, 0x41100000    # 9.0f

    .line 979
    .line 980
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v0, 0x41940000    # 18.5f

    .line 987
    .line 988
    const/high16 v2, 0x40e00000    # 7.0f

    .line 989
    .line 990
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v0, -0x40800000    # -1.0f

    .line 994
    .line 995
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const/high16 v0, 0x40400000    # 3.0f

    .line 999
    .line 1000
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1009
    .line 1010
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v2

    .line 1020
    const/16 v16, 0x3800

    .line 1021
    .line 1022
    const/16 v17, 0x0

    .line 1023
    .line 1024
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1025
    .line 1026
    const/4 v7, 0x0

    .line 1027
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1028
    .line 1029
    const/4 v13, 0x0

    .line 1030
    const/4 v15, 0x0

    .line 1031
    const-string v4, ""

    .line 1032
    .line 1033
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    sput-object v0, Landroidx/compose/material/icons/twotone/BusAlertKt;->_busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1042
    .line 1043
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1044
    .line 1045
    .line 1046
    return-object v0
.end method
