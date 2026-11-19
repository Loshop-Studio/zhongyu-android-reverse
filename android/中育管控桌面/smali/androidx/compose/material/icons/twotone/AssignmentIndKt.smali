.class public final Landroidx/compose/material/icons/twotone/AssignmentIndKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_assignmentInd",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AssignmentInd",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAssignmentInd",
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
        "SMAP\nAssignmentInd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssignmentInd.kt\nandroidx/compose/material/icons/twotone/AssignmentIndKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 AssignmentInd.kt\nandroidx/compose/material/icons/twotone/AssignmentIndKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n51#1:167,18\n51#1:204\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n51#1:185,2\n51#1:187,2\n51#1:193,11\n30#1:151,4\n51#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _assignmentInd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssignmentInd(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AssignmentIndKt;->_assignmentInd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AssignmentInd"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41980000    # 19.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x40c00000    # 6.0f

    .line 99
    .line 100
    const/high16 v6, 0x41400000    # 12.0f

    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x40400000    # 3.0f

    .line 106
    .line 107
    const/high16 v26, 0x40400000    # 3.0f

    .line 108
    .line 109
    const v21, 0x3fd33333    # 1.65f

    .line 110
    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const/high16 v23, 0x40400000    # 3.0f

    .line 115
    .line 116
    const v24, 0x3faccccd    # 1.35f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, -0x40533333    # -1.35f

    .line 125
    .line 126
    .line 127
    const/high16 v6, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x3faccccd    # 1.35f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x40400000    # 3.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41900000    # 18.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x40c00000    # 6.0f

    .line 156
    .line 157
    const/high16 v6, 0x41900000    # 18.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x403c28f6    # -1.53f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40c00000    # 6.0f

    .line 169
    .line 170
    const v26, -0x3f9ae148    # -3.58f

    .line 171
    .line 172
    .line 173
    const/16 v21, 0x0

    .line 174
    .line 175
    const/high16 v22, -0x3fe00000    # -2.5f

    .line 176
    .line 177
    const v23, 0x407e147b    # 3.97f

    .line 178
    .line 179
    .line 180
    const v24, -0x3f9ae148    # -3.58f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x3f8a3d71    # 1.08f

    .line 187
    .line 188
    .line 189
    const v6, 0x40651eb8    # 3.58f

    .line 190
    .line 191
    .line 192
    const/high16 v7, 0x40c00000    # 6.0f

    .line 193
    .line 194
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41900000    # 18.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const v0, 0x41a547ae    # 20.66f

    .line 260
    .line 261
    .line 262
    const v2, 0x407851ec    # 3.88f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x40f5c28f    # -0.54f

    .line 269
    .line 270
    .line 271
    const v18, -0x40f5c28f    # -0.54f

    .line 272
    .line 273
    .line 274
    const v13, -0x41f0a3d7    # -0.14f

    .line 275
    .line 276
    .line 277
    const v14, -0x41a8f5c3    # -0.21f

    .line 278
    .line 279
    .line 280
    const v15, -0x41570a3d    # -0.33f

    .line 281
    .line 282
    .line 283
    const v16, -0x41333333    # -0.4f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x4151eb85    # -0.34f

    .line 290
    .line 291
    .line 292
    const v18, -0x41c7ae14    # -0.18f

    .line 293
    .line 294
    .line 295
    const v13, -0x421eb852    # -0.11f

    .line 296
    .line 297
    .line 298
    const v14, -0x4270a3d7    # -0.07f

    .line 299
    .line 300
    .line 301
    const v15, -0x419eb852    # -0.22f

    .line 302
    .line 303
    .line 304
    const v16, -0x41fae148    # -0.13f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x40b851ec    # -0.78f

    .line 311
    .line 312
    .line 313
    const v18, -0x41dc28f6    # -0.16f

    .line 314
    .line 315
    .line 316
    const v13, -0x418a3d71    # -0.24f

    .line 317
    .line 318
    .line 319
    const v14, -0x42333333    # -0.1f

    .line 320
    .line 321
    .line 322
    const/high16 v15, -0x41000000    # -0.5f

    .line 323
    .line 324
    const v16, -0x41dc28f6    # -0.16f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x3f7a3d71    # -4.18f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x41400000    # 12.0f

    .line 337
    .line 338
    const/high16 v18, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const v13, 0x41666666    # 14.4f

    .line 341
    .line 342
    .line 343
    const v14, 0x3feb851f    # 1.84f

    .line 344
    .line 345
    .line 346
    const v15, 0x4154cccd    # 13.3f

    .line 347
    .line 348
    .line 349
    const/high16 v16, 0x3f800000    # 1.0f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, -0x3fcb851f    # -2.82f

    .line 355
    .line 356
    .line 357
    const/high16 v2, 0x40000000    # 2.0f

    .line 358
    .line 359
    const v4, -0x3fe66666    # -2.4f

    .line 360
    .line 361
    .line 362
    const v6, 0x3f570a3d    # 0.84f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40400000    # 3.0f

    .line 369
    .line 370
    const/high16 v2, 0x40a00000    # 5.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x40000000    # -2.0f

    .line 376
    .line 377
    const/high16 v18, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v13, -0x40733333    # -1.1f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/high16 v15, -0x40000000    # -2.0f

    .line 384
    .line 385
    const v16, 0x3f666666    # 0.9f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41600000    # 14.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x40000000    # 2.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, 0x3f8ccccd    # 1.1f

    .line 400
    .line 401
    .line 402
    const v15, 0x3f666666    # 0.9f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x40000000    # 2.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3f47ae14    # 0.78f

    .line 414
    .line 415
    .line 416
    const v18, -0x41dc28f6    # -0.16f

    .line 417
    .line 418
    .line 419
    const v13, 0x3e8f5c29    # 0.28f

    .line 420
    .line 421
    .line 422
    const/4 v14, 0x0

    .line 423
    const v15, 0x3f0a3d71    # 0.54f

    .line 424
    .line 425
    .line 426
    const v16, -0x428a3d71    # -0.06f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x3eae147b    # 0.34f

    .line 433
    .line 434
    .line 435
    const v18, -0x41c7ae14    # -0.18f

    .line 436
    .line 437
    .line 438
    const v13, 0x3df5c28f    # 0.12f

    .line 439
    .line 440
    .line 441
    const v14, -0x42b33333    # -0.05f

    .line 442
    .line 443
    .line 444
    const v15, 0x3e6b851f    # 0.23f

    .line 445
    .line 446
    .line 447
    const v16, -0x421eb852    # -0.11f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3f0a3d71    # 0.54f

    .line 454
    .line 455
    .line 456
    const v18, -0x40f5c28f    # -0.54f

    .line 457
    .line 458
    .line 459
    const v13, 0x3e570a3d    # 0.21f

    .line 460
    .line 461
    .line 462
    const v14, -0x41f0a3d7    # -0.14f

    .line 463
    .line 464
    .line 465
    const v15, 0x3ecccccd    # 0.4f

    .line 466
    .line 467
    .line 468
    const v16, -0x41570a3d    # -0.33f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3eae147b    # 0.34f

    .line 475
    .line 476
    .line 477
    const v18, -0x4070a3d7    # -1.12f

    .line 478
    .line 479
    .line 480
    const v14, -0x415c28f6    # -0.32f

    .line 481
    .line 482
    .line 483
    const v15, 0x3eae147b    # 0.34f

    .line 484
    .line 485
    .line 486
    const v16, -0x40ca3d71    # -0.71f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x41a80000    # 21.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, -0x4151eb85    # -0.34f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, -0x412e147b    # -0.41f

    .line 502
    .line 503
    .line 504
    const v15, -0x41fae148    # -0.13f

    .line 505
    .line 506
    .line 507
    const v16, -0x40b33333    # -0.8f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x40300000    # 2.75f

    .line 517
    .line 518
    const/high16 v2, 0x41400000    # 12.0f

    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3f0ccccd    # 0.55f

    .line 524
    .line 525
    .line 526
    const/high16 v18, 0x3e800000    # 0.25f

    .line 527
    .line 528
    const v13, 0x3e6147ae    # 0.22f

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const v15, 0x3ed1eb85    # 0.41f

    .line 533
    .line 534
    .line 535
    const v16, 0x3dcccccd    # 0.1f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3e4ccccd    # 0.2f

    .line 542
    .line 543
    .line 544
    const/high16 v18, 0x3f000000    # 0.5f

    .line 545
    .line 546
    const v13, 0x3df5c28f    # 0.12f

    .line 547
    .line 548
    .line 549
    const v14, 0x3e051eb8    # 0.13f

    .line 550
    .line 551
    .line 552
    const v15, 0x3e4ccccd    # 0.2f

    .line 553
    .line 554
    .line 555
    const v16, 0x3e9eb852    # 0.31f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, -0x40c00000    # -0.75f

    .line 562
    .line 563
    const/high16 v18, 0x3f400000    # 0.75f

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, 0x3ed1eb85    # 0.41f

    .line 567
    .line 568
    .line 569
    const v15, -0x4151eb85    # -0.34f

    .line 570
    .line 571
    .line 572
    const/high16 v16, 0x3f400000    # 0.75f

    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x4151eb85    # -0.34f

    .line 578
    .line 579
    .line 580
    const/high16 v2, -0x40c00000    # -0.75f

    .line 581
    .line 582
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, 0x3e4ccccd    # 0.2f

    .line 586
    .line 587
    .line 588
    const/high16 v18, -0x41000000    # -0.5f

    .line 589
    .line 590
    const v14, -0x41bd70a4    # -0.19f

    .line 591
    .line 592
    .line 593
    const v15, 0x3da3d70a    # 0.08f

    .line 594
    .line 595
    .line 596
    const v16, -0x41428f5c    # -0.37f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, 0x3f0ccccd    # 0.55f

    .line 603
    .line 604
    .line 605
    const/high16 v18, -0x41800000    # -0.25f

    .line 606
    .line 607
    const v13, 0x3e0f5c29    # 0.14f

    .line 608
    .line 609
    .line 610
    const v14, -0x41e66666    # -0.15f

    .line 611
    .line 612
    .line 613
    const v15, 0x3ea8f5c3    # 0.33f

    .line 614
    .line 615
    .line 616
    const/high16 v16, -0x41800000    # -0.25f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x41980000    # 19.0f

    .line 625
    .line 626
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v2, 0x40a00000    # 5.0f

    .line 630
    .line 631
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x40a00000    # 5.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x41600000    # 14.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41400000    # 12.0f

    .line 651
    .line 652
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x40400000    # 3.0f

    .line 656
    .line 657
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 658
    .line 659
    const v13, 0x3fd33333    # 1.65f

    .line 660
    .line 661
    .line 662
    const/4 v14, 0x0

    .line 663
    const/high16 v15, 0x40400000    # 3.0f

    .line 664
    .line 665
    const v16, -0x40533333    # -1.35f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, -0x40533333    # -1.35f

    .line 672
    .line 673
    .line 674
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x3faccccd    # 1.35f

    .line 680
    .line 681
    .line 682
    const/high16 v2, 0x40400000    # 3.0f

    .line 683
    .line 684
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 685
    .line 686
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x41200000    # 10.0f

    .line 696
    .line 697
    const/high16 v2, 0x41400000    # 12.0f

    .line 698
    .line 699
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v17, -0x40800000    # -1.0f

    .line 703
    .line 704
    const/high16 v18, -0x40800000    # -1.0f

    .line 705
    .line 706
    const v13, -0x40f33333    # -0.55f

    .line 707
    .line 708
    .line 709
    const/high16 v15, -0x40800000    # -1.0f

    .line 710
    .line 711
    const v16, -0x4119999a    # -0.45f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3ee66666    # 0.45f

    .line 718
    .line 719
    .line 720
    const/high16 v2, -0x40800000    # -1.0f

    .line 721
    .line 722
    const/high16 v4, 0x3f800000    # 1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v2, 0x3f800000    # 1.0f

    .line 728
    .line 729
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, -0x4119999a    # -0.45f

    .line 733
    .line 734
    .line 735
    const/high16 v2, -0x40800000    # -1.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x414e147b    # 12.88f

    .line 744
    .line 745
    .line 746
    const/high16 v2, 0x41400000    # 12.0f

    .line 747
    .line 748
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, -0x3f400000    # -6.0f

    .line 752
    .line 753
    const v18, 0x40651eb8    # 3.58f

    .line 754
    .line 755
    .line 756
    const v13, -0x3ffe147b    # -2.03f

    .line 757
    .line 758
    .line 759
    const/high16 v15, -0x3f400000    # -6.0f

    .line 760
    .line 761
    const v16, 0x3f8a3d71    # 1.08f

    .line 762
    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x40c00000    # 6.0f

    .line 768
    .line 769
    const/high16 v2, 0x41900000    # 18.0f

    .line 770
    .line 771
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v0, 0x41400000    # 12.0f

    .line 775
    .line 776
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, -0x403c28f6    # -1.53f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v18, -0x3f9a3d71    # -3.59f

    .line 786
    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const v14, -0x3fdf5c29    # -2.51f

    .line 790
    .line 791
    .line 792
    const v15, -0x3f81eb85    # -3.97f

    .line 793
    .line 794
    .line 795
    const v16, -0x3f9a3d71    # -3.59f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v0, 0x41800000    # 16.0f

    .line 805
    .line 806
    const v2, 0x4104f5c3    # 8.31f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v17, 0x406c28f6    # 3.69f

    .line 813
    .line 814
    .line 815
    const v18, -0x4070a3d7    # -1.12f

    .line 816
    .line 817
    .line 818
    const v13, 0x3f30a3d7    # 0.69f

    .line 819
    .line 820
    .line 821
    const v14, -0x40f0a3d7    # -0.56f

    .line 822
    .line 823
    .line 824
    const v15, 0x401851ec    # 2.38f

    .line 825
    .line 826
    .line 827
    const v16, -0x4070a3d7    # -1.12f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x406c28f6    # 3.69f

    .line 834
    .line 835
    .line 836
    const v2, 0x3f8f5c29    # 1.12f

    .line 837
    .line 838
    .line 839
    const v4, 0x4040a3d7    # 3.01f

    .line 840
    .line 841
    .line 842
    const v6, 0x3f0f5c29    # 0.56f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v0, 0x41800000    # 16.0f

    .line 849
    .line 850
    const v2, 0x4104f5c3    # 8.31f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    const/16 v16, 0x3800

    .line 864
    .line 865
    const/16 v17, 0x0

    .line 866
    .line 867
    const/high16 v6, 0x3f800000    # 1.0f

    .line 868
    .line 869
    const/high16 v8, 0x3f800000    # 1.0f

    .line 870
    .line 871
    const/4 v7, 0x0

    .line 872
    const/high16 v12, 0x3f800000    # 1.0f

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    const/4 v14, 0x0

    .line 876
    const/4 v15, 0x0

    .line 877
    const-string v4, ""

    .line 878
    .line 879
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    sput-object v0, Landroidx/compose/material/icons/twotone/AssignmentIndKt;->_assignmentInd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    return-object v0
.end method
