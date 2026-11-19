.class public final Landroidx/compose/material/icons/rounded/OnDeviceTrainingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_onDeviceTraining",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "OnDeviceTraining",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getOnDeviceTraining",
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
        "SMAP\nOnDeviceTraining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceTraining.kt\nandroidx/compose/material/icons/rounded/OnDeviceTrainingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,110:1\n212#2,12:111\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n233#2,18:200\n253#2:237\n233#2,18:238\n253#2:275\n233#2,18:276\n253#2:313\n174#3:123\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n705#4,2:218\n717#4,2:220\n719#4,11:226\n705#4,2:256\n717#4,2:258\n719#4,11:264\n705#4,2:294\n717#4,2:296\n719#4,11:302\n72#5,4:146\n72#5,4:184\n72#5,4:222\n72#5,4:260\n72#5,4:298\n*S KotlinDebug\n*F\n+ 1 OnDeviceTraining.kt\nandroidx/compose/material/icons/rounded/OnDeviceTrainingKt\n*L\n29#1:111,12\n30#1:124,18\n30#1:161\n42#1:162,18\n42#1:199\n55#1:200,18\n55#1:237\n73#1:238,18\n73#1:275\n87#1:276,18\n87#1:313\n29#1:123\n30#1:142,2\n30#1:144,2\n30#1:150,11\n42#1:180,2\n42#1:182,2\n42#1:188,11\n55#1:218,2\n55#1:220,2\n55#1:226,11\n73#1:256,2\n73#1:258,2\n73#1:264,11\n87#1:294,2\n87#1:296,2\n87#1:302,11\n30#1:146,4\n42#1:184,4\n55#1:222,4\n73#1:260,4\n87#1:298,4\n*E\n"
    }
.end annotation


# static fields
.field private static _onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOnDeviceTraining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/OnDeviceTrainingKt;->_onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.OnDeviceTraining"

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
    const/high16 v4, 0x41380000    # 11.5f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x3f000000    # 0.5f

    .line 83
    .line 84
    const/high16 v26, -0x41000000    # -0.5f

    .line 85
    .line 86
    const v21, 0x3e8f5c29    # 0.28f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x3f000000    # 0.5f

    .line 92
    .line 93
    const v24, -0x419eb852    # -0.22f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, -0x41000000    # -0.5f

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, -0x4170a3d7    # -0.28f

    .line 110
    .line 111
    .line 112
    const v23, -0x419eb852    # -0.22f

    .line 113
    .line 114
    .line 115
    const/high16 v24, -0x41000000    # -0.5f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, -0x40800000    # -1.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v26, 0x3f000000    # 0.5f

    .line 126
    .line 127
    const v21, -0x4170a3d7    # -0.28f

    .line 128
    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const/high16 v23, -0x41000000    # -0.5f

    .line 133
    .line 134
    const v24, 0x3e6147ae    # 0.22f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, 0x41380000    # 11.5f

    .line 145
    .line 146
    const/high16 v26, 0x41880000    # 17.0f

    .line 147
    .line 148
    const/high16 v21, 0x41300000    # 11.0f

    .line 149
    .line 150
    const v22, 0x41863d71    # 16.78f

    .line 151
    .line 152
    .line 153
    const v23, 0x4133851f    # 11.22f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x41880000    # 17.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const/16 v16, 0x3800

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v8, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v12, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const-string v4, ""

    .line 185
    .line 186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const/4 v2, 0x0

    .line 200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const v4, 0x413851ec    # 11.52f

    .line 217
    .line 218
    .line 219
    const v6, 0x4130f5c3    # 11.06f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, -0x40451eb8    # -1.46f

    .line 226
    .line 227
    .line 228
    const v26, 0x3fb851ec    # 1.44f

    .line 229
    .line 230
    .line 231
    const v21, -0x40ca3d71    # -0.71f

    .line 232
    .line 233
    .line 234
    const v22, 0x3e23d70a    # 0.16f

    .line 235
    .line 236
    .line 237
    const v23, -0x405ae148    # -1.29f

    .line 238
    .line 239
    .line 240
    const v24, 0x3f3d70a4    # 0.74f

    .line 241
    .line 242
    .line 243
    move-object/from16 v20, v2

    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v25, 0x3f70a3d7    # 0.94f

    .line 249
    .line 250
    .line 251
    const v26, 0x400e147b    # 2.22f

    .line 252
    .line 253
    .line 254
    const v21, -0x41947ae1    # -0.23f

    .line 255
    .line 256
    .line 257
    const v22, 0x3f70a3d7    # 0.94f

    .line 258
    .line 259
    .line 260
    const v23, 0x3e570a3d    # 0.21f

    .line 261
    .line 262
    .line 263
    const v24, 0x3fe66666    # 1.8f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x3f07ae14    # 0.53f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x3e800000    # 0.25f

    .line 276
    .line 277
    const/high16 v26, 0x3e800000    # 0.25f

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, 0x3e0f5c29    # 0.14f

    .line 282
    .line 283
    .line 284
    const v23, 0x3de147ae    # 0.11f

    .line 285
    .line 286
    .line 287
    const/high16 v24, 0x3e800000    # 0.25f

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v26, -0x41800000    # -0.25f

    .line 298
    .line 299
    const v21, 0x3e0f5c29    # 0.14f

    .line 300
    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    const/high16 v23, 0x3e800000    # 0.25f

    .line 305
    .line 306
    const v24, -0x421eb852    # -0.11f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, -0x40f851ec    # -0.53f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v25, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v26, -0x4023d70a    # -1.72f

    .line 321
    .line 322
    .line 323
    const v21, 0x3f19999a    # 0.6f

    .line 324
    .line 325
    .line 326
    const v22, -0x414ccccd    # -0.35f

    .line 327
    .line 328
    .line 329
    const/high16 v23, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const v24, -0x40851eb8    # -0.98f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, 0x413851ec    # 11.52f

    .line 338
    .line 339
    .line 340
    const v26, 0x4130f5c3    # 11.06f

    .line 341
    .line 342
    .line 343
    const/high16 v21, 0x41600000    # 14.0f

    .line 344
    .line 345
    const v22, 0x413bd70a    # 11.74f

    .line 346
    .line 347
    .line 348
    const v23, 0x414d47ae    # 12.83f

    .line 349
    .line 350
    .line 351
    const/high16 v24, 0x412c0000    # 10.75f

    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const-string v4, ""

    .line 367
    .line 368
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    const/4 v2, 0x0

    .line 382
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const v4, 0x3f8147ae    # 1.01f

    .line 399
    .line 400
    .line 401
    const/high16 v6, 0x41900000    # 18.0f

    .line 402
    .line 403
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v6, 0x40c00000    # 6.0f

    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x40800000    # 4.0f

    .line 414
    .line 415
    const/high16 v26, 0x40400000    # 3.0f

    .line 416
    .line 417
    const v21, 0x409ccccd    # 4.9f

    .line 418
    .line 419
    .line 420
    const/high16 v22, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v23, 0x40800000    # 4.0f

    .line 423
    .line 424
    const v24, 0x3ff33333    # 1.9f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x41900000    # 18.0f

    .line 433
    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v25, 0x40000000    # 2.0f

    .line 438
    .line 439
    const/high16 v26, 0x40000000    # 2.0f

    .line 440
    .line 441
    const/16 v21, 0x0

    .line 442
    .line 443
    const v22, 0x3f8ccccd    # 1.1f

    .line 444
    .line 445
    .line 446
    const v23, 0x3f666666    # 0.9f

    .line 447
    .line 448
    .line 449
    const/high16 v24, 0x40000000    # 2.0f

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41400000    # 12.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v26, -0x40000000    # -2.0f

    .line 460
    .line 461
    const v21, 0x3f8ccccd    # 1.1f

    .line 462
    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/high16 v23, 0x40000000    # 2.0f

    .line 467
    .line 468
    const v24, -0x4099999a    # -0.9f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x40400000    # 3.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v25, 0x41900000    # 18.0f

    .line 480
    .line 481
    const v26, 0x3f8147ae    # 1.01f

    .line 482
    .line 483
    .line 484
    const/high16 v21, 0x41a00000    # 20.0f

    .line 485
    .line 486
    const v22, 0x3ff33333    # 1.9f

    .line 487
    .line 488
    .line 489
    const v23, 0x4198cccd    # 19.1f

    .line 490
    .line 491
    .line 492
    const v24, 0x3f8147ae    # 1.01f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v4, 0x41900000    # 18.0f

    .line 502
    .line 503
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v4, 0x40c00000    # 6.0f

    .line 507
    .line 508
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x41400000    # 12.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x41900000    # 18.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 544
    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    const/4 v2, 0x0

    .line 550
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    const v4, 0x417547ae    # 15.33f

    .line 567
    .line 568
    .line 569
    const v6, 0x417451ec    # 15.27f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v25, 0x3f9ae148    # 1.21f

    .line 576
    .line 577
    .line 578
    const v26, -0x41b33333    # -0.2f

    .line 579
    .line 580
    .line 581
    const v21, 0x3eb851ec    # 0.36f

    .line 582
    .line 583
    .line 584
    const v22, 0x3eb851ec    # 0.36f

    .line 585
    .line 586
    .line 587
    const v23, 0x3f7d70a4    # 0.99f

    .line 588
    .line 589
    .line 590
    const v24, 0x3e851eb8    # 0.26f

    .line 591
    .line 592
    .line 593
    move-object/from16 v20, v2

    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v25, 0x41880000    # 17.0f

    .line 599
    .line 600
    const/high16 v26, 0x41500000    # 13.0f

    .line 601
    .line 602
    const v21, 0x4186a3d7    # 16.83f

    .line 603
    .line 604
    .line 605
    const v22, 0x41670a3d    # 14.44f

    .line 606
    .line 607
    .line 608
    const/high16 v23, 0x41880000    # 17.0f

    .line 609
    .line 610
    const v24, 0x415bd70a    # 13.74f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v4, -0x41147ae1    # -0.46f

    .line 617
    .line 618
    .line 619
    const v6, -0x3ffb851f    # -2.07f

    .line 620
    .line 621
    .line 622
    const v7, -0x4047ae14    # -1.44f

    .line 623
    .line 624
    .line 625
    const v8, -0x41d1eb85    # -0.17f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v25, -0x40651eb8    # -1.21f

    .line 632
    .line 633
    .line 634
    const v26, -0x41b33333    # -0.2f

    .line 635
    .line 636
    .line 637
    const v21, -0x419eb852    # -0.22f

    .line 638
    .line 639
    .line 640
    const v22, -0x410f5c29    # -0.47f

    .line 641
    .line 642
    .line 643
    const v23, -0x40a8f5c3    # -0.84f

    .line 644
    .line 645
    .line 646
    const v24, -0x40ee147b    # -0.57f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/4 v4, 0x0

    .line 653
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v25, -0x41e66666    # -0.15f

    .line 657
    .line 658
    .line 659
    const v26, 0x3f570a3d    # 0.84f

    .line 660
    .line 661
    .line 662
    const v22, 0x3e6147ae    # 0.22f

    .line 663
    .line 664
    .line 665
    const v23, -0x4170a3d7    # -0.28f

    .line 666
    .line 667
    .line 668
    const v24, 0x3f0f5c29    # 0.56f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v25, 0x3e9eb852    # 0.31f

    .line 675
    .line 676
    .line 677
    const v26, 0x3fb70a3d    # 1.43f

    .line 678
    .line 679
    .line 680
    const v21, 0x3e4ccccd    # 0.2f

    .line 681
    .line 682
    .line 683
    const v22, 0x3ee147ae    # 0.44f

    .line 684
    .line 685
    .line 686
    const v23, 0x3e9eb852    # 0.31f

    .line 687
    .line 688
    .line 689
    const v24, 0x3f6b851f    # 0.92f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v4, -0x416147ae    # -0.31f

    .line 696
    .line 697
    .line 698
    const v6, 0x3fb70a3d    # 1.43f

    .line 699
    .line 700
    .line 701
    const v7, -0x421eb852    # -0.11f

    .line 702
    .line 703
    .line 704
    const v8, 0x3f7d70a4    # 0.99f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v25, 0x417547ae    # 15.33f

    .line 711
    .line 712
    .line 713
    const v26, 0x417451ec    # 15.27f

    .line 714
    .line 715
    .line 716
    const v21, 0x4170f5c3    # 15.06f

    .line 717
    .line 718
    .line 719
    const v22, 0x416b851f    # 14.72f

    .line 720
    .line 721
    .line 722
    const v23, 0x4171c28f    # 15.11f

    .line 723
    .line 724
    .line 725
    const v24, 0x4170cccd    # 15.05f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v4, 0x417547ae    # 15.33f

    .line 732
    .line 733
    .line 734
    const v6, 0x417451ec    # 15.27f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    const/high16 v6, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/high16 v8, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const/4 v7, 0x0

    .line 752
    const-string v4, ""

    .line 753
    .line 754
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 755
    .line 756
    .line 757
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 762
    .line 763
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 764
    .line 765
    .line 766
    move-result-wide v6

    .line 767
    const/4 v0, 0x0

    .line 768
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 772
    .line 773
    .line 774
    move-result v10

    .line 775
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 776
    .line 777
    .line 778
    move-result v11

    .line 779
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 782
    .line 783
    .line 784
    const v0, 0x410ab852    # 8.67f

    .line 785
    .line 786
    .line 787
    const v2, 0x417451ec    # 15.27f

    .line 788
    .line 789
    .line 790
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v17, 0x3e19999a    # 0.15f

    .line 794
    .line 795
    .line 796
    const v18, -0x40a8f5c3    # -0.84f

    .line 797
    .line 798
    .line 799
    const v13, 0x3e6147ae    # 0.22f

    .line 800
    .line 801
    .line 802
    const v14, -0x419eb852    # -0.22f

    .line 803
    .line 804
    .line 805
    const v15, 0x3e8f5c29    # 0.28f

    .line 806
    .line 807
    .line 808
    const v16, -0x40f0a3d7    # -0.56f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v17, 0x41080000    # 8.5f

    .line 815
    .line 816
    const/high16 v18, 0x41500000    # 13.0f

    .line 817
    .line 818
    const v13, 0x4109c28f    # 8.61f

    .line 819
    .line 820
    .line 821
    const v14, 0x415fd70a    # 13.99f

    .line 822
    .line 823
    .line 824
    const/high16 v15, 0x41080000    # 8.5f

    .line 825
    .line 826
    const v16, 0x415828f6    # 13.51f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v17, 0x40600000    # 3.5f

    .line 833
    .line 834
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 835
    .line 836
    const/4 v13, 0x0

    .line 837
    const v14, -0x4008f5c3    # -1.93f

    .line 838
    .line 839
    .line 840
    const v15, 0x3fc8f5c3    # 1.57f

    .line 841
    .line 842
    .line 843
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, 0x3f30a3d7    # 0.69f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v17, 0x3ed70a3d    # 0.42f

    .line 855
    .line 856
    .line 857
    const v18, 0x3e428f5c    # 0.19f

    .line 858
    .line 859
    .line 860
    const v14, 0x3e6147ae    # 0.22f

    .line 861
    .line 862
    .line 863
    const/high16 v15, 0x3e800000    # 0.25f

    .line 864
    .line 865
    const v16, 0x3ea8f5c3    # 0.33f

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v0, 0x3fcf5c29    # 1.62f

    .line 872
    .line 873
    .line 874
    const v2, -0x4047ae14    # -1.44f

    .line 875
    .line 876
    .line 877
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/16 v17, 0x0

    .line 881
    .line 882
    const v18, -0x41428f5c    # -0.37f

    .line 883
    .line 884
    .line 885
    const v13, 0x3de147ae    # 0.11f

    .line 886
    .line 887
    .line 888
    const v14, -0x42333333    # -0.1f

    .line 889
    .line 890
    .line 891
    const v15, 0x3de147ae    # 0.11f

    .line 892
    .line 893
    .line 894
    const v16, -0x4175c28f    # -0.27f

    .line 895
    .line 896
    .line 897
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v0, -0x4030a3d7    # -1.62f

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v17, 0x41400000    # 12.0f

    .line 907
    .line 908
    const v18, 0x40e9eb85    # 7.31f

    .line 909
    .line 910
    .line 911
    const/high16 v13, 0x41440000    # 12.25f

    .line 912
    .line 913
    const v14, 0x40df5c29    # 6.98f

    .line 914
    .line 915
    .line 916
    const/high16 v15, 0x41400000    # 12.0f

    .line 917
    .line 918
    const v16, 0x40e2e148    # 7.09f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v0, 0x41000000    # 8.0f

    .line 925
    .line 926
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v17, -0x3f600000    # -5.0f

    .line 930
    .line 931
    const/high16 v18, 0x40a00000    # 5.0f

    .line 932
    .line 933
    const v13, -0x3fcf5c29    # -2.76f

    .line 934
    .line 935
    .line 936
    const/4 v14, 0x0

    .line 937
    const/high16 v15, -0x3f600000    # -5.0f

    .line 938
    .line 939
    const v16, 0x400f5c29    # 2.24f

    .line 940
    .line 941
    .line 942
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v17, 0x3eeb851f    # 0.46f

    .line 946
    .line 947
    .line 948
    const v18, 0x40047ae1    # 2.07f

    .line 949
    .line 950
    .line 951
    const/4 v13, 0x0

    .line 952
    const v14, 0x3f3d70a4    # 0.74f

    .line 953
    .line 954
    .line 955
    const v15, 0x3e2e147b    # 0.17f

    .line 956
    .line 957
    .line 958
    const v16, 0x3fb851ec    # 1.44f

    .line 959
    .line 960
    .line 961
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v17, 0x410ab852    # 8.67f

    .line 965
    .line 966
    .line 967
    const v18, 0x417451ec    # 15.27f

    .line 968
    .line 969
    .line 970
    const v13, 0x40f5c28f    # 7.68f

    .line 971
    .line 972
    .line 973
    const v14, 0x4178a3d7    # 15.54f

    .line 974
    .line 975
    .line 976
    const v15, 0x4104cccd    # 8.3f

    .line 977
    .line 978
    .line 979
    const v16, 0x417a3d71    # 15.64f

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v0, 0x410ab852    # 8.67f

    .line 986
    .line 987
    .line 988
    const v2, 0x417451ec    # 15.27f

    .line 989
    .line 990
    .line 991
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const/16 v16, 0x3800

    .line 1002
    .line 1003
    const/16 v17, 0x0

    .line 1004
    .line 1005
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1006
    .line 1007
    const/4 v7, 0x0

    .line 1008
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1009
    .line 1010
    const/4 v13, 0x0

    .line 1011
    const/4 v14, 0x0

    .line 1012
    const/4 v15, 0x0

    .line 1013
    const-string v4, ""

    .line 1014
    .line 1015
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    sput-object v0, Landroidx/compose/material/icons/rounded/OnDeviceTrainingKt;->_onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1024
    .line 1025
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    return-object v0
.end method
