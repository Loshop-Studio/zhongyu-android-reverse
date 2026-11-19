.class public final Landroidx/compose/material/icons/twotone/ContactSupportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_contactSupport",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ContactSupport",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getContactSupport$annotations",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)V",
        "getContactSupport",
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
        "SMAP\nContactSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSupport.kt\nandroidx/compose/material/icons/twotone/ContactSupportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n233#2,18:152\n253#2:189\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n705#4,2:170\n717#4,2:172\n719#4,11:178\n72#5,4:136\n72#5,4:174\n*S KotlinDebug\n*F\n+ 1 ContactSupport.kt\nandroidx/compose/material/icons/twotone/ContactSupportKt\n*L\n35#1:101,12\n36#1:114,18\n36#1:151\n62#1:152,18\n62#1:189\n35#1:113\n36#1:132,2\n36#1:134,2\n36#1:140,11\n62#1:170,2\n62#1:172,2\n62#1:178,11\n36#1:136,4\n62#1:174,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactSupport(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ContactSupport"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41380000    # 11.5f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v26, 0x41280000    # 10.5f

    .line 80
    .line 81
    const v21, 0x40eb851f    # 7.36f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40400000    # 3.0f

    .line 85
    .line 86
    const/high16 v23, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v24, 0x40cb851f    # 6.36f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40eb851f    # 7.36f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41900000    # 18.0f

    .line 100
    .line 101
    const/high16 v7, 0x41380000    # 11.5f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41500000    # 13.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x40133333    # 2.3f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const v26, -0x3ee33333    # -9.8f

    .line 120
    .line 121
    .line 122
    const v21, 0x4068f5c3    # 3.64f

    .line 123
    .line 124
    .line 125
    const v22, -0x3feccccd    # -2.3f

    .line 126
    .line 127
    .line 128
    const/high16 v23, 0x40c00000    # 6.0f

    .line 129
    .line 130
    const v24, -0x3f3d70a4    # -6.08f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41380000    # 11.5f

    .line 137
    .line 138
    const/high16 v26, 0x40400000    # 3.0f

    .line 139
    .line 140
    const/high16 v21, 0x41980000    # 19.0f

    .line 141
    .line 142
    const v22, 0x40cb851f    # 6.36f

    .line 143
    .line 144
    .line 145
    const v23, 0x417a3d71    # 15.64f

    .line 146
    .line 147
    .line 148
    const/high16 v24, 0x40400000    # 3.0f

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41840000    # 16.5f

    .line 157
    .line 158
    const/high16 v6, 0x41480000    # 12.5f

    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, -0x40000000    # -2.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x41480000    # 12.5f

    .line 183
    .line 184
    const/high16 v6, 0x41500000    # 13.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, -0x40000000    # -2.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x40400000    # 3.0f

    .line 195
    .line 196
    const/high16 v26, -0x3f600000    # -5.0f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const/high16 v22, -0x3fb00000    # -3.25f

    .line 201
    .line 202
    const/high16 v23, 0x40400000    # 3.0f

    .line 203
    .line 204
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, -0x40000000    # -2.0f

    .line 210
    .line 211
    const/high16 v26, -0x40000000    # -2.0f

    .line 212
    .line 213
    const v22, -0x40733333    # -1.1f

    .line 214
    .line 215
    .line 216
    const v23, -0x4099999a    # -0.9f

    .line 217
    .line 218
    .line 219
    const/high16 v24, -0x40000000    # -2.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x3f666666    # 0.9f

    .line 225
    .line 226
    .line 227
    const/high16 v6, -0x40000000    # -2.0f

    .line 228
    .line 229
    const/high16 v7, 0x40000000    # 2.0f

    .line 230
    .line 231
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, -0x40000000    # -2.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v25, 0x40800000    # 4.0f

    .line 240
    .line 241
    const/high16 v26, -0x3f800000    # -4.0f

    .line 242
    .line 243
    const v22, -0x3ff28f5c    # -2.21f

    .line 244
    .line 245
    .line 246
    const v23, 0x3fe51eb8    # 1.79f

    .line 247
    .line 248
    .line 249
    const/high16 v24, -0x3f800000    # -4.0f

    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, 0x3fe51eb8    # 1.79f

    .line 255
    .line 256
    .line 257
    const/high16 v6, 0x40800000    # 4.0f

    .line 258
    .line 259
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 263
    .line 264
    const/high16 v26, 0x40a00000    # 5.0f

    .line 265
    .line 266
    const/high16 v22, 0x40200000    # 2.5f

    .line 267
    .line 268
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 269
    .line 270
    const/high16 v24, 0x40300000    # 2.75f

    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/16 v16, 0x3800

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const v6, 0x3e99999a    # 0.3f

    .line 287
    .line 288
    .line 289
    const v8, 0x3e99999a    # 0.3f

    .line 290
    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    const/high16 v9, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v12, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const-string v4, ""

    .line 301
    .line 302
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    const/4 v0, 0x0

    .line 316
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v2, 0x41380000    # 11.5f

    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x40000000    # 2.0f

    .line 340
    .line 341
    const/high16 v18, 0x41280000    # 10.5f

    .line 342
    .line 343
    const v13, 0x40c851ec    # 6.26f

    .line 344
    .line 345
    .line 346
    const/high16 v14, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v15, 0x40000000    # 2.0f

    .line 349
    .line 350
    const v16, 0x40a851ec    # 5.26f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x41100000    # 9.0f

    .line 357
    .line 358
    const v18, 0x4117d70a    # 9.49f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, 0x40a23d71    # 5.07f

    .line 363
    .line 364
    .line 365
    const v15, 0x407f5c29    # 3.99f

    .line 366
    .line 367
    .line 368
    const v16, 0x4113ae14    # 9.23f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x40666666    # 3.6f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fb70a3d    # 1.43f

    .line 381
    .line 382
    .line 383
    const v2, -0x40cf5c29    # -0.69f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x41a80000    # 21.0f

    .line 390
    .line 391
    const/high16 v18, 0x41280000    # 10.5f

    .line 392
    .line 393
    const v13, 0x418c7ae1    # 17.56f

    .line 394
    .line 395
    .line 396
    const v14, 0x41a370a4    # 20.43f

    .line 397
    .line 398
    .line 399
    const/high16 v15, 0x41a80000    # 21.0f

    .line 400
    .line 401
    const v16, 0x41773333    # 15.45f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x41380000    # 11.5f

    .line 408
    .line 409
    const/high16 v18, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v13, 0x41a80000    # 21.0f

    .line 412
    .line 413
    const v14, 0x40a851ec    # 5.26f

    .line 414
    .line 415
    .line 416
    const v15, 0x4185eb85    # 16.74f

    .line 417
    .line 418
    .line 419
    const/high16 v16, 0x3f800000    # 1.0f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x41a26666    # 20.3f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x41500000    # 13.0f

    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41500000    # 13.0f

    .line 436
    .line 437
    const/high16 v2, 0x41900000    # 18.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, -0x40400000    # -1.5f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40800000    # 4.0f

    .line 448
    .line 449
    const/high16 v18, 0x41280000    # 10.5f

    .line 450
    .line 451
    const v13, 0x40eb851f    # 7.36f

    .line 452
    .line 453
    .line 454
    const/high16 v14, 0x41900000    # 18.0f

    .line 455
    .line 456
    const/high16 v15, 0x40800000    # 4.0f

    .line 457
    .line 458
    const v16, 0x416a3d71    # 14.64f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x40eb851f    # 7.36f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x40400000    # 3.0f

    .line 468
    .line 469
    const/high16 v4, 0x41380000    # 11.5f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x40cb851f    # 6.36f

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x41280000    # 10.5f

    .line 478
    .line 479
    const/high16 v4, 0x41980000    # 19.0f

    .line 480
    .line 481
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, -0x3f400000    # -6.0f

    .line 485
    .line 486
    const v18, 0x411ccccd    # 9.8f

    .line 487
    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    const v14, 0x406eb852    # 3.73f

    .line 491
    .line 492
    .line 493
    const v15, -0x3fe8f5c3    # -2.36f

    .line 494
    .line 495
    .line 496
    const v16, 0x40f051ec    # 7.51f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41680000    # 14.5f

    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40000000    # 2.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, -0x40000000    # -2.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x40800000    # 4.0f

    .line 527
    .line 528
    const/high16 v2, 0x41380000    # 11.5f

    .line 529
    .line 530
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, -0x3f800000    # -4.0f

    .line 534
    .line 535
    const/high16 v18, 0x40800000    # 4.0f

    .line 536
    .line 537
    const v13, -0x3ff28f5c    # -2.21f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const/high16 v15, -0x3f800000    # -4.0f

    .line 542
    .line 543
    const v16, 0x3fe51eb8    # 1.79f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x40000000    # 2.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x40000000    # 2.0f

    .line 555
    .line 556
    const/high16 v18, -0x40000000    # -2.0f

    .line 557
    .line 558
    const/4 v13, 0x0

    .line 559
    const v14, -0x40733333    # -1.1f

    .line 560
    .line 561
    .line 562
    const v15, 0x3f666666    # 0.9f

    .line 563
    .line 564
    .line 565
    const/high16 v16, -0x40000000    # -2.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x3f666666    # 0.9f

    .line 571
    .line 572
    .line 573
    const/high16 v2, 0x40000000    # 2.0f

    .line 574
    .line 575
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 579
    .line 580
    const/high16 v18, 0x40a00000    # 5.0f

    .line 581
    .line 582
    const/high16 v14, 0x40000000    # 2.0f

    .line 583
    .line 584
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 585
    .line 586
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40000000    # 2.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x40400000    # 3.0f

    .line 597
    .line 598
    const/high16 v18, -0x3f600000    # -5.0f

    .line 599
    .line 600
    const/high16 v14, -0x3ff00000    # -2.25f

    .line 601
    .line 602
    const/high16 v15, 0x40400000    # 3.0f

    .line 603
    .line 604
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, -0x3f800000    # -4.0f

    .line 610
    .line 611
    const/high16 v18, -0x3f800000    # -4.0f

    .line 612
    .line 613
    const v14, -0x3ff28f5c    # -2.21f

    .line 614
    .line 615
    .line 616
    const v15, -0x401ae148    # -1.79f

    .line 617
    .line 618
    .line 619
    const/high16 v16, -0x3f800000    # -4.0f

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v12, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/4 v15, 0x0

    .line 644
    const-string v4, ""

    .line 645
    .line 646
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sput-object v0, Landroidx/compose/material/icons/twotone/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 655
    .line 656
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    return-object v0
.end method

.method public static synthetic getContactSupport$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.ContactSupport"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.TwoTone.ContactSupport"
            imports = {
                "androidx.compose.material.icons.automirrored.twotone.ContactSupport"
            }
        .end subannotation
    .end annotation

    return-void
.end method
