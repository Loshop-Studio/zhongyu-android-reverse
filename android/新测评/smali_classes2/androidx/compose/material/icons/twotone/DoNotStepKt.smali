.class public final Landroidx/compose/material/icons/twotone/DoNotStepKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_doNotStep",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DoNotStep",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDoNotStep",
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
        "SMAP\nDoNotStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/twotone/DoNotStepKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n212#2,12:115\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n174#3:127\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n72#5,4:150\n72#5,4:188\n*S KotlinDebug\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/twotone/DoNotStepKt\n*L\n29#1:115,12\n30#1:128,18\n30#1:165\n50#1:166,18\n50#1:203\n29#1:127\n30#1:146,2\n30#1:148,2\n30#1:154,11\n50#1:184,2\n50#1:186,2\n50#1:192,11\n30#1:150,4\n50#1:188,4\n*E\n"
    }
.end annotation


# static fields
.field private static _doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotStep(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DoNotStep"

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
    const v4, 0x41426666    # 12.15f

    .line 71
    .line 72
    .line 73
    const v6, 0x416fae14    # 14.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, -0x3fbb851f    # -3.07f

    .line 83
    .line 84
    .line 85
    const v6, 0x40447ae1    # 3.07f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v4, 0x409a3d71    # 4.82f

    .line 92
    .line 93
    .line 94
    const v6, 0x415ccccd    # 13.8f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x3fbae148    # -3.08f

    .line 101
    .line 102
    .line 103
    const v6, 0x40447ae1    # 3.07f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x41426666    # 12.15f

    .line 110
    .line 111
    .line 112
    const v6, 0x416fae14    # 14.98f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x417428f6    # 15.26f

    .line 122
    .line 123
    .line 124
    const v6, 0x4146b852    # 12.42f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x4028f5c3    # -1.68f

    .line 131
    .line 132
    .line 133
    const v6, -0x402a3d71    # -1.67f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x41873333    # 16.9f

    .line 140
    .line 141
    .line 142
    const v6, 0x40ed70a4    # 7.42f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, -0x3fcae148    # -2.83f

    .line 149
    .line 150
    .line 151
    const v26, -0x43dc28f6    # -0.01f

    .line 152
    .line 153
    .line 154
    const v21, -0x40b851ec    # -0.78f

    .line 155
    .line 156
    .line 157
    const v22, 0x3f47ae14    # 0.78f

    .line 158
    .line 159
    .line 160
    const v23, -0x3ffccccd    # -2.05f

    .line 161
    .line 162
    .line 163
    const v24, 0x3f47ae14    # 0.78f

    .line 164
    .line 165
    .line 166
    move-object/from16 v20, v2

    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x4185c28f    # 16.72f

    .line 172
    .line 173
    .line 174
    const v6, 0x408ccccd    # 4.4f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, 0x3e75c28f    # 0.24f

    .line 181
    .line 182
    .line 183
    const v6, -0x410f5c29    # -0.47f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, -0x409c28f6    # -0.89f

    .line 190
    .line 191
    .line 192
    const v26, 0x3ec7ae14    # 0.39f

    .line 193
    .line 194
    .line 195
    const v21, -0x416b851f    # -0.29f

    .line 196
    .line 197
    .line 198
    const v22, 0x3e0f5c29    # 0.14f

    .line 199
    .line 200
    .line 201
    const v23, -0x40e8f5c3    # -0.59f

    .line 202
    .line 203
    .line 204
    const v24, 0x3e8a3d71    # 0.27f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, 0x4041eb85    # 3.03f

    .line 211
    .line 212
    .line 213
    const/high16 v6, 0x41900000    # 18.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x40d47ae1    # 6.64f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x417428f6    # 15.26f

    .line 225
    .line 226
    .line 227
    const v6, 0x4146b852    # 12.42f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const/16 v16, 0x3800

    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const v6, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const v8, 0x3e99999a    # 0.3f

    .line 248
    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/high16 v9, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/high16 v12, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const/4 v14, 0x0

    .line 257
    const/4 v15, 0x0

    .line 258
    const-string v4, ""

    .line 259
    .line 260
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 261
    .line 262
    .line 263
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 268
    .line 269
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 270
    .line 271
    .line 272
    move-result-wide v6

    .line 273
    const/4 v0, 0x0

    .line 274
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const v0, 0x4194147b    # 18.51f

    .line 291
    .line 292
    .line 293
    const v2, 0x417ae148    # 15.68f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, -0x404b851f    # -1.41f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x408f5c29    # 4.48f

    .line 306
    .line 307
    .line 308
    const v2, -0x3f70a3d7    # -4.48f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41b80000    # 23.0f

    .line 315
    .line 316
    const v2, 0x41333333    # 11.2f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x4194147b    # 18.51f

    .line 323
    .line 324
    .line 325
    const v2, 0x417ae148    # 15.68f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x41426666    # 12.15f

    .line 335
    .line 336
    .line 337
    const v2, 0x416fae14    # 14.98f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x3fbb851f    # -3.07f

    .line 347
    .line 348
    .line 349
    const v2, 0x40447ae1    # 3.07f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x409a3d71    # 4.82f

    .line 356
    .line 357
    .line 358
    const v2, 0x415ccccd    # 13.8f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, -0x3fbae148    # -3.08f

    .line 365
    .line 366
    .line 367
    const v2, 0x40447ae1    # 3.07f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x4114cccd    # 9.3f

    .line 374
    .line 375
    .line 376
    const v2, 0x40cf0a3d    # 6.47f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x40000000    # 2.0f

    .line 383
    .line 384
    const v2, 0x415ccccd    # 13.8f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/4 v0, 0x0

    .line 391
    const/4 v2, 0x0

    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x40e28f5c    # 7.08f

    .line 396
    .line 397
    .line 398
    const v2, 0x40e28f5c    # 7.08f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, -0x3f70a3d7    # -4.48f

    .line 405
    .line 406
    .line 407
    const v2, 0x408f5c29    # 4.48f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x41426666    # 12.15f

    .line 414
    .line 415
    .line 416
    const v2, 0x416fae14    # 14.98f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x41a970a4    # 21.18f

    .line 426
    .line 427
    .line 428
    const v2, 0x41a9999a    # 21.2f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x3fb47ae1    # 1.41f

    .line 435
    .line 436
    .line 437
    const v2, -0x404b851f    # -1.41f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x3f41eb85    # -5.94f

    .line 444
    .line 445
    .line 446
    const v2, -0x3f41eb85    # -5.94f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41280000    # 10.5f

    .line 453
    .line 454
    const/high16 v2, 0x41a00000    # 20.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x3f800000    # 1.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, -0x3fd7ae14    # -2.63f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3fa66666    # 1.3f

    .line 471
    .line 472
    .line 473
    const v18, -0x400f5c29    # -1.88f

    .line 474
    .line 475
    .line 476
    const v14, -0x40a8f5c3    # -0.84f

    .line 477
    .line 478
    .line 479
    const v15, 0x3f051eb8    # 0.52f

    .line 480
    .line 481
    .line 482
    const v16, -0x40370a3d    # -1.57f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3ffc28f6    # 1.97f

    .line 489
    .line 490
    .line 491
    const v18, -0x407d70a4    # -1.02f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f147ae1    # 0.58f

    .line 495
    .line 496
    .line 497
    const v14, -0x41947ae1    # -0.23f

    .line 498
    .line 499
    .line 500
    const v15, 0x3fa3d70a    # 1.28f

    .line 501
    .line 502
    .line 503
    const v16, -0x40f0a3d7    # -0.56f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x3fb0a3d7    # 1.38f

    .line 510
    .line 511
    .line 512
    const v2, 0x3fb0a3d7    # 1.38f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x40c00000    # 6.0f

    .line 519
    .line 520
    const/high16 v18, 0x41800000    # 16.0f

    .line 521
    .line 522
    const v13, 0x40b7ae14    # 5.74f

    .line 523
    .line 524
    .line 525
    const v14, 0x417f3333    # 15.95f

    .line 526
    .line 527
    .line 528
    const v15, 0x40bbd70a    # 5.87f

    .line 529
    .line 530
    .line 531
    const/high16 v16, 0x41800000    # 16.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3e851eb8    # 0.26f

    .line 537
    .line 538
    .line 539
    const v2, 0x3eb851ec    # 0.36f

    .line 540
    .line 541
    .line 542
    const v4, -0x41e66666    # -0.15f

    .line 543
    .line 544
    .line 545
    const v6, -0x42b33333    # -0.05f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const v18, -0x40ca3d71    # -0.71f

    .line 554
    .line 555
    .line 556
    const v13, 0x3e4ccccd    # 0.2f

    .line 557
    .line 558
    .line 559
    const v14, -0x41b33333    # -0.2f

    .line 560
    .line 561
    .line 562
    const v15, 0x3e4ccccd    # 0.2f

    .line 563
    .line 564
    .line 565
    const v16, -0x40fd70a4    # -0.51f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x405c28f6    # -1.28f

    .line 572
    .line 573
    .line 574
    const v2, -0x405c28f6    # -1.28f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x3f451eb8    # 0.77f

    .line 581
    .line 582
    .line 583
    const v18, -0x40b33333    # -0.8f

    .line 584
    .line 585
    .line 586
    const v13, 0x3e8a3d71    # 0.27f

    .line 587
    .line 588
    .line 589
    const v14, -0x418a3d71    # -0.24f

    .line 590
    .line 591
    .line 592
    const v15, 0x3f07ae14    # 0.53f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x3fa28f5c    # 1.27f

    .line 599
    .line 600
    .line 601
    const v2, 0x3fa28f5c    # 1.27f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, 0x3eb33333    # 0.35f

    .line 608
    .line 609
    .line 610
    const v18, 0x3e19999a    # 0.15f

    .line 611
    .line 612
    .line 613
    const v13, 0x3db851ec    # 0.09f

    .line 614
    .line 615
    .line 616
    const v14, 0x3dcccccd    # 0.1f

    .line 617
    .line 618
    .line 619
    const v15, 0x3e6b851f    # 0.23f

    .line 620
    .line 621
    .line 622
    const v16, 0x3e19999a    # 0.15f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x3e800000    # 0.25f

    .line 629
    .line 630
    const v2, 0x3eb33333    # 0.35f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/16 v17, 0x0

    .line 637
    .line 638
    const v18, -0x40ca3d71    # -0.71f

    .line 639
    .line 640
    .line 641
    const v13, 0x3e4ccccd    # 0.2f

    .line 642
    .line 643
    .line 644
    const v14, -0x41b33333    # -0.2f

    .line 645
    .line 646
    .line 647
    const v15, 0x3e4ccccd    # 0.2f

    .line 648
    .line 649
    .line 650
    const v16, -0x40fd70a4    # -0.51f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, -0x404ccccd    # -1.4f

    .line 657
    .line 658
    .line 659
    const v2, -0x404ccccd    # -1.4f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, 0x3ee66666    # 0.45f

    .line 666
    .line 667
    .line 668
    const v18, -0x4070a3d7    # -1.12f

    .line 669
    .line 670
    .line 671
    const v13, 0x3e428f5c    # 0.19f

    .line 672
    .line 673
    .line 674
    const v14, -0x4151eb85    # -0.34f

    .line 675
    .line 676
    .line 677
    const v15, 0x3eae147b    # 0.34f

    .line 678
    .line 679
    .line 680
    const v16, -0x40c7ae14    # -0.72f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, 0x3fdae148    # 1.71f

    .line 687
    .line 688
    .line 689
    const v2, 0x3fdc28f6    # 1.72f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x3eb33333    # 0.35f

    .line 696
    .line 697
    .line 698
    const v18, 0x3e19999a    # 0.15f

    .line 699
    .line 700
    .line 701
    const v13, 0x3db851ec    # 0.09f

    .line 702
    .line 703
    .line 704
    const v14, 0x3dcccccd    # 0.1f

    .line 705
    .line 706
    .line 707
    const v15, 0x3e6b851f    # 0.23f

    .line 708
    .line 709
    .line 710
    const v16, 0x3e19999a    # 0.15f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, 0x3e800000    # 0.25f

    .line 717
    .line 718
    const v2, 0x3eb33333    # 0.35f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3c23d70a    # 0.01f

    .line 725
    .line 726
    .line 727
    const v18, -0x40cccccd    # -0.7f

    .line 728
    .line 729
    .line 730
    const v13, 0x3e428f5c    # 0.19f

    .line 731
    .line 732
    .line 733
    const v14, -0x41b33333    # -0.2f

    .line 734
    .line 735
    .line 736
    const v15, 0x3e428f5c    # 0.19f

    .line 737
    .line 738
    .line 739
    const/high16 v16, -0x41000000    # -0.5f

    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, -0x3f033333    # -7.9f

    .line 745
    .line 746
    .line 747
    const v2, -0x3f033333    # -7.9f

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x3fb5c28f    # 1.42f

    .line 754
    .line 755
    .line 756
    const v2, -0x404b851f    # -1.41f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x41a970a4    # 21.18f

    .line 763
    .line 764
    .line 765
    const v2, 0x41a9999a    # 21.2f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x417428f6    # 15.26f

    .line 775
    .line 776
    .line 777
    const v2, 0x4146b852    # 12.42f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v0, -0x4028f5c3    # -1.68f

    .line 784
    .line 785
    .line 786
    const v2, -0x402a3d71    # -1.67f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v0, 0x41873333    # 16.9f

    .line 793
    .line 794
    .line 795
    const v2, 0x40ed70a4    # 7.42f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, -0x3fcae148    # -2.83f

    .line 802
    .line 803
    .line 804
    const v18, -0x43dc28f6    # -0.01f

    .line 805
    .line 806
    .line 807
    const v13, -0x40b851ec    # -0.78f

    .line 808
    .line 809
    .line 810
    const v14, 0x3f47ae14    # 0.78f

    .line 811
    .line 812
    .line 813
    const v15, -0x3ffccccd    # -2.05f

    .line 814
    .line 815
    .line 816
    const v16, 0x3f47ae14    # 0.78f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x4185c28f    # 16.72f

    .line 823
    .line 824
    .line 825
    const v2, 0x408ccccd    # 4.4f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v0, 0x3e75c28f    # 0.24f

    .line 832
    .line 833
    .line 834
    const v2, -0x410f5c29    # -0.47f

    .line 835
    .line 836
    .line 837
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v17, -0x409c28f6    # -0.89f

    .line 841
    .line 842
    .line 843
    const v18, 0x3ec7ae14    # 0.39f

    .line 844
    .line 845
    .line 846
    const v13, -0x416b851f    # -0.29f

    .line 847
    .line 848
    .line 849
    const v14, 0x3e0f5c29    # 0.14f

    .line 850
    .line 851
    .line 852
    const v15, -0x40e8f5c3    # -0.59f

    .line 853
    .line 854
    .line 855
    const v16, 0x3e8a3d71    # 0.27f

    .line 856
    .line 857
    .line 858
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v0, 0x4041eb85    # 3.03f

    .line 862
    .line 863
    .line 864
    const/high16 v2, 0x41900000    # 18.0f

    .line 865
    .line 866
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v0, 0x40d47ae1    # 6.64f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v0, 0x417428f6    # 15.26f

    .line 876
    .line 877
    .line 878
    const v2, 0x4146b852    # 12.42f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    const/16 v16, 0x3800

    .line 892
    .line 893
    const/16 v17, 0x0

    .line 894
    .line 895
    const/high16 v6, 0x3f800000    # 1.0f

    .line 896
    .line 897
    const/high16 v8, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v7, 0x0

    .line 900
    const/high16 v12, 0x3f800000    # 1.0f

    .line 901
    .line 902
    const/4 v13, 0x0

    .line 903
    const/4 v14, 0x0

    .line 904
    const/4 v15, 0x0

    .line 905
    const-string v4, ""

    .line 906
    .line 907
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    sput-object v0, Landroidx/compose/material/icons/twotone/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 916
    .line 917
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    return-object v0
.end method
