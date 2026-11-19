.class public final Landroidx/compose/material/icons/rounded/ArchitectureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_architecture",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Architecture",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getArchitecture",
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
        "SMAP\nArchitecture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Architecture.kt\nandroidx/compose/material/icons/rounded/ArchitectureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n72#5,4:108\n72#5,4:146\n72#5,4:184\n*S KotlinDebug\n*F\n+ 1 Architecture.kt\nandroidx/compose/material/icons/rounded/ArchitectureKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n39#1:124,18\n39#1:161\n48#1:162,18\n48#1:199\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n39#1:142,2\n39#1:144,2\n39#1:150,11\n48#1:180,2\n48#1:182,2\n48#1:188,11\n30#1:108,4\n39#1:146,4\n48#1:184,4\n*E\n"
    }
.end annotation


# static fields
.field private static _architecture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getArchitecture(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ArchitectureKt;->_architecture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Architecture"

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
    const v4, 0x41963d71    # 18.78f

    .line 71
    .line 72
    .line 73
    const v6, 0x40cb851f    # 6.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40d3851f    # 6.61f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41a80000    # 21.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x3fcf5c29    # 1.62f

    .line 88
    .line 89
    .line 90
    const v6, -0x403ae148    # -1.54f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3f0ccccd    # -7.6f

    .line 97
    .line 98
    .line 99
    const v6, 0x403147ae    # 2.77f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v25, -0x401d70a4    # -1.77f

    .line 106
    .line 107
    .line 108
    const v26, -0x40851eb8    # -0.98f

    .line 109
    .line 110
    .line 111
    const v21, -0x40d1eb85    # -0.68f

    .line 112
    .line 113
    .line 114
    const v22, -0x41d1eb85    # -0.17f

    .line 115
    .line 116
    .line 117
    const v23, -0x405c28f6    # -1.28f

    .line 118
    .line 119
    .line 120
    const v24, -0x40fd70a4    # -0.51f

    .line 121
    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x41963d71    # 18.78f

    .line 129
    .line 130
    .line 131
    const v6, 0x40cb851f    # 6.36f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const/high16 v8, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/4 v7, 0x0

    .line 153
    const/high16 v9, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/high16 v12, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x0

    .line 160
    const-string v4, ""

    .line 161
    .line 162
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 163
    .line 164
    .line 165
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const v4, 0x412e147b    # 10.88f

    .line 193
    .line 194
    .line 195
    const v6, 0x416c51ec    # 14.77f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v26, 0x3f7ae148    # 0.98f

    .line 202
    .line 203
    .line 204
    const v21, -0x41051eb8    # -0.49f

    .line 205
    .line 206
    .line 207
    const v22, 0x3ef0a3d7    # 0.47f

    .line 208
    .line 209
    .line 210
    const v23, -0x40733333    # -1.1f

    .line 211
    .line 212
    .line 213
    const v24, 0x3f4f5c29    # 0.81f

    .line 214
    .line 215
    .line 216
    move-object/from16 v20, v2

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x40f33333    # 7.6f

    .line 222
    .line 223
    .line 224
    const v6, 0x403147ae    # 2.77f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x418b1eb8    # 17.39f

    .line 231
    .line 232
    .line 233
    const/high16 v6, 0x41a80000    # 21.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x3e851eb8    # 0.26f

    .line 239
    .line 240
    .line 241
    const v6, -0x3ff1eb85    # -2.22f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x412e147b    # 10.88f

    .line 248
    .line 249
    .line 250
    const v6, 0x416c51ec    # 14.77f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const/high16 v6, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/4 v7, 0x0

    .line 266
    const-string v4, ""

    .line 267
    .line 268
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 269
    .line 270
    .line 271
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 278
    .line 279
    .line 280
    move-result-wide v6

    .line 281
    const/4 v0, 0x0

    .line 282
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    const v0, 0x416f0a3d    # 14.94f

    .line 299
    .line 300
    .line 301
    const v2, 0x4109999a    # 8.6f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x4007ae14    # -1.94f

    .line 308
    .line 309
    .line 310
    const v18, -0x3fa51eb8    # -3.42f

    .line 311
    .line 312
    .line 313
    const v13, 0x3e99999a    # 0.3f

    .line 314
    .line 315
    .line 316
    const v14, -0x403851ec    # -1.56f

    .line 317
    .line 318
    .line 319
    const v15, -0x40e66666    # -0.6f

    .line 320
    .line 321
    .line 322
    const v16, -0x3fc3d70a    # -2.94f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x40800000    # 4.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v17, -0x40800000    # -1.0f

    .line 334
    .line 335
    const/high16 v18, -0x40800000    # -1.0f

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, -0x40f33333    # -0.55f

    .line 339
    .line 340
    .line 341
    const v15, -0x4119999a    # -0.45f

    .line 342
    .line 343
    .line 344
    const/high16 v16, -0x40800000    # -1.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/4 v0, 0x0

    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v18, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const v13, -0x40f33333    # -0.55f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const/high16 v15, -0x40800000    # -1.0f

    .line 360
    .line 361
    const v16, 0x3ee66666    # 0.45f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3f970a3d    # 1.18f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x41100000    # 9.0f

    .line 374
    .line 375
    const/high16 v18, 0x41000000    # 8.0f

    .line 376
    .line 377
    const v13, 0x411d70a4    # 9.84f

    .line 378
    .line 379
    .line 380
    const v14, 0x40b33333    # 5.6f

    .line 381
    .line 382
    .line 383
    const/high16 v15, 0x41100000    # 9.0f

    .line 384
    .line 385
    const v16, 0x40d66666    # 6.7f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x4063d70a    # 3.56f

    .line 392
    .line 393
    .line 394
    const v18, 0x403ccccd    # 2.95f

    .line 395
    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, 0x3feb851f    # 1.84f

    .line 399
    .line 400
    .line 401
    const v15, 0x3fd47ae1    # 1.66f

    .line 402
    .line 403
    .line 404
    const v16, 0x40533333    # 3.3f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x416f0a3d    # 14.94f

    .line 411
    .line 412
    .line 413
    const v18, 0x4109999a    # 8.6f

    .line 414
    .line 415
    .line 416
    const v13, 0x415bd70a    # 13.74f

    .line 417
    .line 418
    .line 419
    const v14, 0x412bae14    # 10.73f

    .line 420
    .line 421
    .line 422
    const v15, 0x416b5c29    # 14.71f

    .line 423
    .line 424
    .line 425
    const v16, 0x411c7ae1    # 9.78f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x41400000    # 12.0f

    .line 435
    .line 436
    const/high16 v2, 0x41100000    # 9.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x40800000    # -1.0f

    .line 442
    .line 443
    const/high16 v18, -0x40800000    # -1.0f

    .line 444
    .line 445
    const v13, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const/high16 v15, -0x40800000    # -1.0f

    .line 450
    .line 451
    const v16, -0x4119999a    # -0.45f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, -0x40f33333    # -0.55f

    .line 461
    .line 462
    .line 463
    const v15, 0x3ee66666    # 0.45f

    .line 464
    .line 465
    .line 466
    const/high16 v16, -0x40800000    # -1.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x3f800000    # 1.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x41400000    # 12.0f

    .line 480
    .line 481
    const/high16 v18, 0x41100000    # 9.0f

    .line 482
    .line 483
    const/high16 v13, 0x41500000    # 13.0f

    .line 484
    .line 485
    const v14, 0x4108cccd    # 8.55f

    .line 486
    .line 487
    .line 488
    const v15, 0x4148cccd    # 12.55f

    .line 489
    .line 490
    .line 491
    const/high16 v16, 0x41100000    # 9.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const/16 v16, 0x3800

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    const/high16 v6, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    const/high16 v12, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    const/4 v14, 0x0

    .line 514
    const/4 v15, 0x0

    .line 515
    const-string v4, ""

    .line 516
    .line 517
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    sput-object v0, Landroidx/compose/material/icons/rounded/ArchitectureKt;->_architecture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    return-object v0
.end method
