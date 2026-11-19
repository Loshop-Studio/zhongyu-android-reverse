.class public final Landroidx/compose/material/icons/twotone/NotificationsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_notificationsOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NotificationsOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getNotificationsOff",
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
        "SMAP\nNotificationsOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsOff.kt\nandroidx/compose/material/icons/twotone/NotificationsOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n72#5,4:126\n72#5,4:164\n*S KotlinDebug\n*F\n+ 1 NotificationsOff.kt\nandroidx/compose/material/icons/twotone/NotificationsOffKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n45#1:142,18\n45#1:179\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n45#1:160,2\n45#1:162,2\n45#1:168,11\n30#1:126,4\n45#1:164,4\n*E\n"
    }
.end annotation


# static fields
.field private static _notificationsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotificationsOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NotificationsOffKt;->_notificationsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NotificationsOff"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const v4, -0x418a3d71    # -0.24f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x410570a4    # 8.34f

    .line 87
    .line 88
    .line 89
    const v6, 0x4111999a    # 9.1f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v25, 0x41000000    # 8.0f

    .line 96
    .line 97
    const/high16 v26, 0x41300000    # 11.0f

    .line 98
    .line 99
    const v21, 0x4101eb85    # 8.12f

    .line 100
    .line 101
    .line 102
    const v22, 0x411ae148    # 9.68f

    .line 103
    .line 104
    .line 105
    const/high16 v23, 0x41000000    # 8.0f

    .line 106
    .line 107
    const v24, 0x41251eb8    # 10.32f

    .line 108
    .line 109
    .line 110
    move-object/from16 v20, v2

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40c00000    # 6.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40d00000    # 6.5f

    .line 124
    .line 125
    const/high16 v6, 0x41400000    # 12.0f

    .line 126
    .line 127
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v25, -0x40f33333    # -0.55f

    .line 131
    .line 132
    .line 133
    const v26, 0x3d75c28f    # 0.06f

    .line 134
    .line 135
    .line 136
    const v21, -0x41bd70a4    # -0.19f

    .line 137
    .line 138
    .line 139
    const/16 v22, 0x0

    .line 140
    .line 141
    const v23, -0x41428f5c    # -0.37f

    .line 142
    .line 143
    .line 144
    const v24, 0x3cf5c28f    # 0.03f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x4131999a    # 11.1f

    .line 151
    .line 152
    .line 153
    const/high16 v6, 0x41800000    # 16.0f

    .line 154
    .line 155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41300000    # 11.0f

    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, -0x3f800000    # -4.0f

    .line 164
    .line 165
    const/high16 v26, -0x3f700000    # -4.5f

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const v22, -0x3fe147ae    # -2.48f

    .line 170
    .line 171
    .line 172
    const v23, -0x403eb852    # -1.51f

    .line 173
    .line 174
    .line 175
    const/high16 v24, -0x3f700000    # -4.5f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v16, 0x3800

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const v6, 0x3e99999a    # 0.3f

    .line 192
    .line 193
    .line 194
    const v8, 0x3e99999a    # 0.3f

    .line 195
    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/high16 v9, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/high16 v12, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    const-string v4, ""

    .line 206
    .line 207
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 215
    .line 216
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 217
    .line 218
    .line 219
    move-result-wide v6

    .line 220
    const/4 v0, 0x0

    .line 221
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x41b00000    # 22.0f

    .line 238
    .line 239
    const/high16 v2, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40000000    # 2.0f

    .line 245
    .line 246
    const/high16 v18, -0x40000000    # -2.0f

    .line 247
    .line 248
    const v13, 0x3f8ccccd    # 1.1f

    .line 249
    .line 250
    .line 251
    const/high16 v15, 0x40000000    # 2.0f

    .line 252
    .line 253
    const v16, -0x4099999a    # -0.9f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, -0x3f800000    # -4.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v18, 0x40000000    # 2.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, 0x3f8ccccd    # 1.1f

    .line 268
    .line 269
    .line 270
    const v15, 0x3f666666    # 0.9f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x40000000    # 2.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40d00000    # 6.5f

    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40800000    # 4.0f

    .line 287
    .line 288
    const/high16 v18, 0x40900000    # 4.5f

    .line 289
    .line 290
    const v13, 0x401f5c29    # 2.49f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const/high16 v15, 0x40800000    # 4.0f

    .line 295
    .line 296
    const v16, 0x400147ae    # 2.02f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3dcccccd    # 0.1f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40000000    # 2.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41900000    # 18.0f

    .line 314
    .line 315
    const/high16 v2, 0x41300000    # 11.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x3f700000    # -4.5f

    .line 321
    .line 322
    const v18, -0x3f35c28f    # -6.32f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x3fbb851f    # -3.07f

    .line 327
    .line 328
    .line 329
    const v15, -0x402f5c29    # -1.63f

    .line 330
    .line 331
    .line 332
    const v16, -0x3f4b851f    # -5.64f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x41580000    # 13.5f

    .line 339
    .line 340
    const/high16 v2, 0x40800000    # 4.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x40400000    # -1.5f

    .line 346
    .line 347
    const/high16 v18, -0x40400000    # -1.5f

    .line 348
    .line 349
    const v14, -0x40ab851f    # -0.83f

    .line 350
    .line 351
    .line 352
    const v15, -0x40d47ae1    # -0.67f

    .line 353
    .line 354
    .line 355
    const/high16 v16, -0x40400000    # -1.5f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x3f2b851f    # 0.67f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 364
    .line 365
    const/high16 v4, -0x40400000    # -1.5f

    .line 366
    .line 367
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3f2e147b    # 0.68f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x40cf5c29    # -0.69f

    .line 377
    .line 378
    .line 379
    const v18, 0x3e6b851f    # 0.23f

    .line 380
    .line 381
    .line 382
    const v13, -0x418a3d71    # -0.24f

    .line 383
    .line 384
    .line 385
    const v14, 0x3d75c28f    # 0.06f

    .line 386
    .line 387
    .line 388
    const v15, -0x410f5c29    # -0.47f

    .line 389
    .line 390
    .line 391
    const v16, 0x3e19999a    # 0.15f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3fd1eb85    # 1.64f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x3f0ccccd    # 0.55f

    .line 404
    .line 405
    .line 406
    const v18, -0x42b33333    # -0.05f

    .line 407
    .line 408
    .line 409
    const v13, 0x3e3851ec    # 0.18f

    .line 410
    .line 411
    .line 412
    const v14, -0x435c28f6    # -0.02f

    .line 413
    .line 414
    .line 415
    const v15, 0x3eb851ec    # 0.36f

    .line 416
    .line 417
    .line 418
    const v16, -0x42b33333    # -0.05f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x40566666    # 3.35f

    .line 428
    .line 429
    .line 430
    const v2, 0x40ad1eb8    # 5.41f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x409851ec    # 4.76f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x40800000    # 4.0f

    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x4033d70a    # 2.81f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x40c00000    # 6.0f

    .line 451
    .line 452
    const/high16 v18, 0x41300000    # 11.0f

    .line 453
    .line 454
    const v13, 0x40c947ae    # 6.29f

    .line 455
    .line 456
    .line 457
    const v14, 0x41091eb8    # 8.57f

    .line 458
    .line 459
    .line 460
    const/high16 v15, 0x40c00000    # 6.0f

    .line 461
    .line 462
    const v16, 0x411bd70a    # 9.74f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x40a00000    # 5.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, -0x40000000    # -2.0f

    .line 474
    .line 475
    const/high16 v2, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x3f800000    # 1.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x4163d70a    # 14.24f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x3fdeb852    # 1.74f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3fb47ae1    # 1.41f

    .line 498
    .line 499
    .line 500
    const v2, -0x404b851f    # -1.41f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x40566666    # 3.35f

    .line 507
    .line 508
    .line 509
    const v2, 0x40ad1eb8    # 5.41f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41880000    # 17.0f

    .line 519
    .line 520
    const/high16 v2, 0x41800000    # 16.0f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x41000000    # 8.0f

    .line 526
    .line 527
    const/high16 v2, 0x41880000    # 17.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, -0x3f400000    # -6.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x3eae147b    # 0.34f

    .line 538
    .line 539
    .line 540
    const v18, -0x400ccccd    # -1.9f

    .line 541
    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    const v14, -0x40d1eb85    # -0.68f

    .line 545
    .line 546
    .line 547
    const v15, 0x3df5c28f    # 0.12f

    .line 548
    .line 549
    .line 550
    const v16, -0x40570a3d    # -1.32f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x4186147b    # 16.76f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x41800000    # 16.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41880000    # 17.0f

    .line 565
    .line 566
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    const/16 v16, 0x3800

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const/high16 v6, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/high16 v8, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v7, 0x0

    .line 585
    const/high16 v12, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    const/4 v15, 0x0

    .line 589
    const-string v4, ""

    .line 590
    .line 591
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    sput-object v0, Landroidx/compose/material/icons/twotone/NotificationsOffKt;->_notificationsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    return-object v0
.end method
