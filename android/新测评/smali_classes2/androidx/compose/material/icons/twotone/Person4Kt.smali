.class public final Landroidx/compose/material/icons/twotone/Person4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_person4",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Person4",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPerson4",
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
        "SMAP\nPerson4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person4.kt\nandroidx/compose/material/icons/twotone/Person4Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n233#2,18:186\n253#2:223\n233#2,18:224\n253#2:261\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n705#4,2:204\n717#4,2:206\n719#4,11:212\n705#4,2:242\n717#4,2:244\n719#4,11:250\n72#5,4:132\n72#5,4:170\n72#5,4:208\n72#5,4:246\n*S KotlinDebug\n*F\n+ 1 Person4.kt\nandroidx/compose/material/icons/twotone/Person4Kt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n39#1:148,18\n39#1:185\n50#1:186,18\n50#1:223\n70#1:224,18\n70#1:261\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n39#1:166,2\n39#1:168,2\n39#1:174,11\n50#1:204,2\n50#1:206,2\n50#1:212,11\n70#1:242,2\n70#1:244,2\n70#1:250,11\n30#1:132,4\n39#1:170,4\n50#1:208,4\n70#1:246,4\n*E\n"
    }
.end annotation


# static fields
.field private static _person4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson4(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Person4Kt;->_person4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Person4"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v21, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, -0x4099999a    # -0.9f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40b00000    # 5.5f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, -0x3f800000    # -4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41400000    # 12.0f

    .line 112
    .line 113
    const/high16 v26, 0x41200000    # 10.0f

    .line 114
    .line 115
    const/high16 v21, 0x41200000    # 10.0f

    .line 116
    .line 117
    const v22, 0x4111999a    # 9.1f

    .line 118
    .line 119
    .line 120
    const v23, 0x412e6666    # 10.9f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41200000    # 10.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/16 v16, 0x3800

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const v6, 0x3e99999a    # 0.3f

    .line 140
    .line 141
    .line 142
    const v8, 0x3e99999a    # 0.3f

    .line 143
    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const/high16 v9, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/high16 v12, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const-string v4, ""

    .line 154
    .line 155
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const v4, 0x418bd70a    # 17.48f

    .line 186
    .line 187
    .line 188
    const v6, 0x4182b852    # 16.34f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v26, 0x41700000    # 15.0f

    .line 195
    .line 196
    const v21, 0x418251ec    # 16.29f

    .line 197
    .line 198
    .line 199
    const v22, 0x417bae14    # 15.73f

    .line 200
    .line 201
    .line 202
    const v23, 0x4165eb85    # 14.37f

    .line 203
    .line 204
    .line 205
    const/high16 v24, 0x41700000    # 15.0f

    .line 206
    .line 207
    move-object/from16 v20, v2

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, -0x3f50a3d7    # -5.48f

    .line 213
    .line 214
    .line 215
    const v26, 0x3fab851f    # 1.34f

    .line 216
    .line 217
    .line 218
    const v21, -0x3fe851ec    # -2.37f

    .line 219
    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    const v23, -0x3f76b852    # -4.29f

    .line 224
    .line 225
    .line 226
    const v24, 0x3f3ae148    # 0.73f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v25, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const v26, 0x4189c28f    # 17.22f

    .line 235
    .line 236
    .line 237
    const v21, 0x40c66666    # 6.2f

    .line 238
    .line 239
    .line 240
    const/high16 v22, 0x41840000    # 16.5f

    .line 241
    .line 242
    const/high16 v23, 0x40c00000    # 6.0f

    .line 243
    .line 244
    const v24, 0x4186b852    # 16.84f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41900000    # 18.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x41400000    # 12.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, -0x40b851ec    # -0.78f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x418bd70a    # 17.48f

    .line 267
    .line 268
    .line 269
    const v26, 0x4182b852    # 16.34f

    .line 270
    .line 271
    .line 272
    const/high16 v21, 0x41900000    # 18.0f

    .line 273
    .line 274
    const v22, 0x4186b852    # 16.84f

    .line 275
    .line 276
    .line 277
    const v23, 0x418e6666    # 17.8f

    .line 278
    .line 279
    .line 280
    const/high16 v24, 0x41840000    # 16.5f

    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const v6, 0x3e99999a    # 0.3f

    .line 293
    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const v4, 0x41931eb8    # 18.39f

    .line 329
    .line 330
    .line 331
    const v6, 0x4168f5c3    # 14.56f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v25, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/high16 v26, 0x41500000    # 13.0f

    .line 340
    .line 341
    const v21, 0x4185ae14    # 16.71f

    .line 342
    .line 343
    .line 344
    const v22, 0x415b3333    # 13.7f

    .line 345
    .line 346
    .line 347
    const v23, 0x41687ae1    # 14.53f

    .line 348
    .line 349
    .line 350
    const/high16 v24, 0x41500000    # 13.0f

    .line 351
    .line 352
    move-object/from16 v20, v2

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, -0x3f33851f    # -6.39f

    .line 358
    .line 359
    .line 360
    const v26, 0x3fc7ae14    # 1.56f

    .line 361
    .line 362
    .line 363
    const v21, -0x3fde147b    # -2.53f

    .line 364
    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const v23, -0x3f6947ae    # -4.71f

    .line 369
    .line 370
    .line 371
    const v24, 0x3f333333    # 0.7f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v25, 0x40800000    # 4.0f

    .line 378
    .line 379
    const v26, 0x4189c28f    # 17.22f

    .line 380
    .line 381
    .line 382
    const v21, 0x4093851f    # 4.61f

    .line 383
    .line 384
    .line 385
    const v22, 0x41711eb8    # 15.07f

    .line 386
    .line 387
    .line 388
    const/high16 v23, 0x40800000    # 4.0f

    .line 389
    .line 390
    const v24, 0x4180cccd    # 16.1f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x41a00000    # 20.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x41800000    # 16.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, -0x3fce147b    # -2.78f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v25, 0x41931eb8    # 18.39f

    .line 413
    .line 414
    .line 415
    const v26, 0x4168f5c3    # 14.56f

    .line 416
    .line 417
    .line 418
    const/high16 v21, 0x41a00000    # 20.0f

    .line 419
    .line 420
    const v22, 0x4180cccd    # 16.1f

    .line 421
    .line 422
    .line 423
    const v23, 0x419b1eb8    # 19.39f

    .line 424
    .line 425
    .line 426
    const v24, 0x41711eb8    # 15.07f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41900000    # 18.0f

    .line 436
    .line 437
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x40c00000    # 6.0f

    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, -0x40b851ec    # -0.78f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, 0x3f051eb8    # 0.52f

    .line 452
    .line 453
    .line 454
    const v26, -0x409eb852    # -0.88f

    .line 455
    .line 456
    .line 457
    const/16 v21, 0x0

    .line 458
    .line 459
    const v22, -0x413d70a4    # -0.38f

    .line 460
    .line 461
    .line 462
    const v23, 0x3e4ccccd    # 0.2f

    .line 463
    .line 464
    .line 465
    const v24, -0x40c7ae14    # -0.72f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v25, 0x41400000    # 12.0f

    .line 472
    .line 473
    const/high16 v26, 0x41700000    # 15.0f

    .line 474
    .line 475
    const v21, 0x40f6b852    # 7.71f

    .line 476
    .line 477
    .line 478
    const v22, 0x417bae14    # 15.73f

    .line 479
    .line 480
    .line 481
    const v23, 0x411a147b    # 9.63f

    .line 482
    .line 483
    .line 484
    const/high16 v24, 0x41700000    # 15.0f

    .line 485
    .line 486
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, 0x40af5c29    # 5.48f

    .line 490
    .line 491
    .line 492
    const v26, 0x3fab851f    # 1.34f

    .line 493
    .line 494
    .line 495
    const v21, 0x4017ae14    # 2.37f

    .line 496
    .line 497
    .line 498
    const/16 v22, 0x0

    .line 499
    .line 500
    const v23, 0x408947ae    # 4.29f

    .line 501
    .line 502
    .line 503
    const v24, 0x3f3ae148    # 0.73f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, 0x41900000    # 18.0f

    .line 510
    .line 511
    const v26, 0x4189c28f    # 17.22f

    .line 512
    .line 513
    .line 514
    const v21, 0x418e6666    # 17.8f

    .line 515
    .line 516
    .line 517
    const/high16 v22, 0x41840000    # 16.5f

    .line 518
    .line 519
    const/high16 v23, 0x41900000    # 18.0f

    .line 520
    .line 521
    const v24, 0x4186b852    # 16.84f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v4, 0x41900000    # 18.0f

    .line 528
    .line 529
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/high16 v6, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v8, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v7, 0x0

    .line 544
    const-string v4, ""

    .line 545
    .line 546
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 547
    .line 548
    .line 549
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 554
    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 556
    .line 557
    .line 558
    move-result-wide v6

    .line 559
    const/4 v0, 0x0

    .line 560
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x41400000    # 12.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x40800000    # 4.0f

    .line 582
    .line 583
    const/high16 v18, -0x3f800000    # -4.0f

    .line 584
    .line 585
    const v13, 0x400d70a4    # 2.21f

    .line 586
    .line 587
    .line 588
    const/high16 v15, 0x40800000    # 4.0f

    .line 589
    .line 590
    const v16, -0x401ae148    # -1.79f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/16 v17, 0x0

    .line 597
    .line 598
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 599
    .line 600
    const/4 v13, 0x0

    .line 601
    const v14, -0x4050a3d7    # -1.37f

    .line 602
    .line 603
    .line 604
    const/4 v15, 0x0

    .line 605
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x41680000    # 14.5f

    .line 611
    .line 612
    const/high16 v18, 0x40400000    # 3.0f

    .line 613
    .line 614
    const/high16 v13, 0x41800000    # 16.0f

    .line 615
    .line 616
    const v14, 0x406ae148    # 3.67f

    .line 617
    .line 618
    .line 619
    const v15, 0x417547ae    # 15.33f

    .line 620
    .line 621
    .line 622
    const/high16 v16, 0x40400000    # 3.0f

    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v17, -0x40600000    # -1.25f

    .line 628
    .line 629
    const v18, 0x3f2b851f    # 0.67f

    .line 630
    .line 631
    .line 632
    const v13, -0x40fae148    # -0.52f

    .line 633
    .line 634
    .line 635
    const/4 v14, 0x0

    .line 636
    const v15, -0x40851eb8    # -0.98f

    .line 637
    .line 638
    .line 639
    const v16, 0x3e8a3d71    # 0.27f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x41400000    # 12.0f

    .line 646
    .line 647
    const/high16 v18, 0x40400000    # 3.0f

    .line 648
    .line 649
    const v13, 0x414fae14    # 12.98f

    .line 650
    .line 651
    .line 652
    const v14, 0x405147ae    # 3.27f

    .line 653
    .line 654
    .line 655
    const v15, 0x414851ec    # 12.52f

    .line 656
    .line 657
    .line 658
    const/high16 v16, 0x40400000    # 3.0f

    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, -0x40600000    # -1.25f

    .line 664
    .line 665
    const v2, 0x3f2b851f    # 0.67f

    .line 666
    .line 667
    .line 668
    const v4, -0x40851eb8    # -0.98f

    .line 669
    .line 670
    .line 671
    const v6, 0x3e8a3d71    # 0.27f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v17, 0x41180000    # 9.5f

    .line 678
    .line 679
    const v13, 0x4127ae14    # 10.48f

    .line 680
    .line 681
    .line 682
    const v15, 0x412051ec    # 10.02f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x41000000    # 8.0f

    .line 689
    .line 690
    const/high16 v18, 0x40900000    # 4.5f

    .line 691
    .line 692
    const v13, 0x410ab852    # 8.67f

    .line 693
    .line 694
    .line 695
    const/high16 v14, 0x40400000    # 3.0f

    .line 696
    .line 697
    const/high16 v15, 0x41000000    # 8.0f

    .line 698
    .line 699
    const v16, 0x406ae148    # 3.67f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    const/high16 v18, 0x40600000    # 3.5f

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const/4 v14, 0x0

    .line 711
    const/4 v15, 0x0

    .line 712
    const v16, 0x4007ae14    # 2.12f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v17, 0x41400000    # 12.0f

    .line 719
    .line 720
    const/high16 v18, 0x41400000    # 12.0f

    .line 721
    .line 722
    const/high16 v13, 0x41000000    # 8.0f

    .line 723
    .line 724
    const v14, 0x41235c29    # 10.21f

    .line 725
    .line 726
    .line 727
    const v15, 0x411ca3d7    # 9.79f

    .line 728
    .line 729
    .line 730
    const/high16 v16, 0x41400000    # 12.0f

    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v0, 0x41200000    # 10.0f

    .line 739
    .line 740
    const/high16 v2, 0x40b00000    # 5.5f

    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x40800000    # 4.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x41000000    # 8.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v17, -0x40000000    # -2.0f

    .line 756
    .line 757
    const/high16 v18, 0x40000000    # 2.0f

    .line 758
    .line 759
    const/4 v13, 0x0

    .line 760
    const v14, 0x3f8ccccd    # 1.1f

    .line 761
    .line 762
    .line 763
    const v15, -0x4099999a    # -0.9f

    .line 764
    .line 765
    .line 766
    const/high16 v16, 0x40000000    # 2.0f

    .line 767
    .line 768
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, -0x4099999a    # -0.9f

    .line 772
    .line 773
    .line 774
    const/high16 v2, -0x40000000    # -2.0f

    .line 775
    .line 776
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v0, 0x40b00000    # 5.5f

    .line 780
    .line 781
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    const/16 v16, 0x3800

    .line 792
    .line 793
    const/16 v17, 0x0

    .line 794
    .line 795
    const/high16 v6, 0x3f800000    # 1.0f

    .line 796
    .line 797
    const/4 v7, 0x0

    .line 798
    const/high16 v12, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const-string v4, ""

    .line 803
    .line 804
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    sput-object v0, Landroidx/compose/material/icons/twotone/Person4Kt;->_person4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 813
    .line 814
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    return-object v0
.end method
