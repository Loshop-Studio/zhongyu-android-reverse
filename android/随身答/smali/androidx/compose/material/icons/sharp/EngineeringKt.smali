.class public final Landroidx/compose/material/icons/sharp/EngineeringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_engineering",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Engineering",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getEngineering",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nEngineering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Engineering.kt\nandroidx/compose/material/icons/sharp/EngineeringKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,140:1\n212#2,12:141\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n233#2,18:230\n253#2:267\n233#2,18:268\n253#2:305\n233#2,18:306\n253#2:343\n174#3:153\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n705#4,2:248\n717#4,2:250\n719#4,11:256\n705#4,2:286\n717#4,2:288\n719#4,11:294\n705#4,2:324\n717#4,2:326\n719#4,11:332\n72#5,4:176\n72#5,4:214\n72#5,4:252\n72#5,4:290\n72#5,4:328\n*S KotlinDebug\n*F\n+ 1 Engineering.kt\nandroidx/compose/material/icons/sharp/EngineeringKt\n*L\n29#1:141,12\n30#1:154,18\n30#1:191\n39#1:192,18\n39#1:229\n60#1:230,18\n60#1:267\n67#1:268,18\n67#1:305\n101#1:306,18\n101#1:343\n29#1:153\n30#1:172,2\n30#1:174,2\n30#1:180,11\n39#1:210,2\n39#1:212,2\n39#1:218,11\n60#1:248,2\n60#1:250,2\n60#1:256,11\n67#1:286,2\n67#1:288,2\n67#1:294,11\n101#1:324,2\n101#1:326,2\n101#1:332,11\n30#1:176,4\n39#1:214,4\n60#1:252,4\n67#1:290,4\n101#1:328,4\n*E\n"
    }
.end annotation


# static fields
.field private static _engineering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEngineering(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Engineering"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3fd51eb8    # -2.67f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x3fab851f    # 1.34f

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41800000    # 16.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41100000    # 9.0f

    .line 112
    .line 113
    const/high16 v26, 0x41700000    # 15.0f

    .line 114
    .line 115
    const/high16 v21, 0x41880000    # 17.0f

    .line 116
    .line 117
    const v22, 0x4182b852    # 16.34f

    .line 118
    .line 119
    .line 120
    const v23, 0x413ab852    # 11.67f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41700000    # 15.0f

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v8, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/high16 v9, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/high16 v12, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    const/4 v15, 0x0

    .line 151
    const-string v4, ""

    .line 152
    .line 153
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 163
    .line 164
    .line 165
    move-result-wide v6

    .line 166
    const/4 v2, 0x0

    .line 167
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x415c0000    # 13.75f

    .line 184
    .line 185
    const/high16 v6, 0x41000000    # 8.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x41500000    # 13.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, -0x40000000    # -2.0f

    .line 196
    .line 197
    const v26, -0x3fa33333    # -3.45f

    .line 198
    .line 199
    .line 200
    const/16 v21, 0x0

    .line 201
    .line 202
    const v22, -0x40428f5c    # -1.48f

    .line 203
    .line 204
    .line 205
    const v23, -0x40b0a3d7    # -0.81f

    .line 206
    .line 207
    .line 208
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 209
    .line 210
    move-object/from16 v20, v2

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x40b00000    # 5.5f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x41280000    # 10.5f

    .line 221
    .line 222
    const/high16 v26, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const/high16 v21, 0x41300000    # 11.0f

    .line 225
    .line 226
    const v22, 0x40b8f5c3    # 5.78f

    .line 227
    .line 228
    .line 229
    const v23, 0x412c7ae1    # 10.78f

    .line 230
    .line 231
    .line 232
    const/high16 v24, 0x40c00000    # 6.0f

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x40b8f5c3    # 5.78f

    .line 238
    .line 239
    .line 240
    const/high16 v6, 0x41200000    # 10.0f

    .line 241
    .line 242
    const/high16 v7, 0x40b00000    # 5.5f

    .line 243
    .line 244
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x40847ae1    # 4.14f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41100000    # 9.0f

    .line 254
    .line 255
    const/high16 v26, 0x40800000    # 4.0f

    .line 256
    .line 257
    const v21, 0x411ae148    # 9.68f

    .line 258
    .line 259
    .line 260
    const v22, 0x4081eb85    # 4.06f

    .line 261
    .line 262
    .line 263
    const v23, 0x4115999a    # 9.35f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x40800000    # 4.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x41051eb8    # 8.32f

    .line 272
    .line 273
    .line 274
    const v6, 0x4081eb85    # 4.06f

    .line 275
    .line 276
    .line 277
    const v7, 0x40847ae1    # 4.14f

    .line 278
    .line 279
    .line 280
    const/high16 v8, 0x41000000    # 8.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x40b00000    # 5.5f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40f00000    # 7.5f

    .line 291
    .line 292
    const/high16 v26, 0x40c00000    # 6.0f

    .line 293
    .line 294
    const/high16 v21, 0x41000000    # 8.0f

    .line 295
    .line 296
    const v22, 0x40b8f5c3    # 5.78f

    .line 297
    .line 298
    .line 299
    const v23, 0x40f8f5c3    # 7.78f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x40c00000    # 6.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40e00000    # 7.0f

    .line 308
    .line 309
    const v6, 0x40b8f5c3    # 5.78f

    .line 310
    .line 311
    .line 312
    const/high16 v7, 0x40b00000    # 5.5f

    .line 313
    .line 314
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x4091999a    # 4.55f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v25, 0x40a00000    # 5.0f

    .line 324
    .line 325
    const/high16 v26, 0x41000000    # 8.0f

    .line 326
    .line 327
    const v21, 0x40b9eb85    # 5.81f

    .line 328
    .line 329
    .line 330
    const/high16 v22, 0x40a80000    # 5.25f

    .line 331
    .line 332
    const/high16 v23, 0x40a00000    # 5.0f

    .line 333
    .line 334
    const v24, 0x40d0a3d7    # 6.52f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x40880000    # 4.25f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x3f800000    # 1.0f

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41180000    # 9.5f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x41000000    # 8.0f

    .line 356
    .line 357
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 382
    .line 383
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 384
    .line 385
    .line 386
    move-result-wide v6

    .line 387
    const/4 v2, 0x0

    .line 388
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x41500000    # 13.0f

    .line 405
    .line 406
    const/high16 v6, 0x41100000    # 9.0f

    .line 407
    .line 408
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, 0x40770a3d    # 3.86f

    .line 412
    .line 413
    .line 414
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 415
    .line 416
    const v21, 0x3fee147b    # 1.86f

    .line 417
    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const v23, 0x405a3d71    # 3.41f

    .line 422
    .line 423
    .line 424
    const v24, -0x405c28f6    # -1.28f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, 0x40a47ae1    # 5.14f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v25, 0x41100000    # 9.0f

    .line 439
    .line 440
    const/high16 v26, 0x41500000    # 13.0f

    .line 441
    .line 442
    const v21, 0x40b2e148    # 5.59f

    .line 443
    .line 444
    .line 445
    const v22, 0x413b851f    # 11.72f

    .line 446
    .line 447
    .line 448
    const v23, 0x40e47ae1    # 7.14f

    .line 449
    .line 450
    .line 451
    const/high16 v24, 0x41500000    # 13.0f

    .line 452
    .line 453
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    const/high16 v6, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 476
    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 478
    .line 479
    .line 480
    move-result-wide v6

    .line 481
    const/4 v2, 0x0

    .line 482
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 490
    .line 491
    .line 492
    move-result v11

    .line 493
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 496
    .line 497
    .line 498
    const v4, 0x41afd70a    # 21.98f

    .line 499
    .line 500
    .line 501
    const v6, 0x40c75c29    # 6.23f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v4, -0x40ab851f    # -0.83f

    .line 508
    .line 509
    .line 510
    const v6, 0x3f6e147b    # 0.93f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v4, -0x4059999a    # -1.3f

    .line 517
    .line 518
    .line 519
    const/high16 v6, -0x40c00000    # -0.75f

    .line 520
    .line 521
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v4, -0x4067ae14    # -1.19f

    .line 525
    .line 526
    .line 527
    const v6, 0x3ec7ae14    # 0.39f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v25, -0x410f5c29    # -0.47f

    .line 534
    .line 535
    .line 536
    const v26, -0x4175c28f    # -0.27f

    .line 537
    .line 538
    .line 539
    const v21, -0x41f0a3d7    # -0.14f

    .line 540
    .line 541
    .line 542
    const v22, -0x421eb852    # -0.11f

    .line 543
    .line 544
    .line 545
    const v23, -0x41666666    # -0.3f

    .line 546
    .line 547
    .line 548
    const v24, -0x41b33333    # -0.2f

    .line 549
    .line 550
    .line 551
    move-object/from16 v20, v2

    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v4, 0x41a20000    # 20.25f

    .line 557
    .line 558
    const/high16 v6, 0x40400000    # 3.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, -0x40400000    # -1.5f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x41940000    # 18.5f

    .line 569
    .line 570
    const v6, 0x40870a3d    # 4.22f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v25, -0x410a3d71    # -0.48f

    .line 577
    .line 578
    .line 579
    const v26, 0x3e8a3d71    # 0.27f

    .line 580
    .line 581
    .line 582
    const v21, -0x41d1eb85    # -0.17f

    .line 583
    .line 584
    .line 585
    const v22, 0x3d8f5c29    # 0.07f

    .line 586
    .line 587
    .line 588
    const v23, -0x41570a3d    # -0.33f

    .line 589
    .line 590
    .line 591
    const v24, 0x3e23d70a    # 0.16f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v4, 0x4186b852    # 16.84f

    .line 598
    .line 599
    .line 600
    const v6, 0x40833333    # 4.1f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v4, 0x3fa66666    # 1.3f

    .line 607
    .line 608
    .line 609
    const/high16 v6, -0x40c00000    # -0.75f

    .line 610
    .line 611
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v4, 0x3f547ae1    # 0.83f

    .line 615
    .line 616
    .line 617
    const v6, 0x3f6e147b    # 0.93f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v25, 0x418828f6    # 17.02f

    .line 624
    .line 625
    .line 626
    const/high16 v26, 0x40d80000    # 6.75f

    .line 627
    .line 628
    const/high16 v21, 0x41880000    # 17.0f

    .line 629
    .line 630
    const v22, 0x40cccccd    # 6.4f

    .line 631
    .line 632
    .line 633
    const/high16 v23, 0x41880000    # 17.0f

    .line 634
    .line 635
    const v24, 0x40d28f5c    # 6.58f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v4, 0x4180b852    # 16.09f

    .line 642
    .line 643
    .line 644
    const v6, 0x40f33333    # 7.6f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v4, 0x3f400000    # 0.75f

    .line 651
    .line 652
    const v6, 0x3fa66666    # 1.3f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v4, 0x3f99999a    # 1.2f

    .line 659
    .line 660
    .line 661
    const v6, -0x413d70a4    # -0.38f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v25, 0x3edc28f6    # 0.43f

    .line 668
    .line 669
    .line 670
    const/high16 v26, 0x3e800000    # 0.25f

    .line 671
    .line 672
    const v21, 0x3e051eb8    # 0.13f

    .line 673
    .line 674
    .line 675
    const v22, 0x3dcccccd    # 0.1f

    .line 676
    .line 677
    .line 678
    const v23, 0x3e8f5c29    # 0.28f

    .line 679
    .line 680
    .line 681
    const v24, 0x3e3851ec    # 0.18f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v4, 0x41960000    # 18.75f

    .line 688
    .line 689
    const/high16 v6, 0x41200000    # 10.0f

    .line 690
    .line 691
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 695
    .line 696
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v4, -0x4063d70a    # -1.22f

    .line 700
    .line 701
    .line 702
    const v6, 0x3e8a3d71    # 0.27f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v25, 0x3ee147ae    # 0.44f

    .line 709
    .line 710
    .line 711
    const/high16 v26, -0x41800000    # -0.25f

    .line 712
    .line 713
    const v21, 0x3e23d70a    # 0.16f

    .line 714
    .line 715
    .line 716
    const v22, -0x4270a3d7    # -0.07f

    .line 717
    .line 718
    .line 719
    const v23, 0x3e99999a    # 0.3f

    .line 720
    .line 721
    .line 722
    const v24, -0x41e66666    # -0.15f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v4, 0x3f9851ec    # 1.19f

    .line 729
    .line 730
    .line 731
    const v6, 0x3ec28f5c    # 0.38f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v4, 0x3f400000    # 0.75f

    .line 738
    .line 739
    const v6, -0x4059999a    # -1.3f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v4, -0x40a66666    # -0.85f

    .line 746
    .line 747
    .line 748
    const v6, -0x4091eb85    # -0.93f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v25, 0x41afd70a    # 21.98f

    .line 755
    .line 756
    .line 757
    const v26, 0x40c75c29    # 6.23f

    .line 758
    .line 759
    .line 760
    const/high16 v21, 0x41b00000    # 22.0f

    .line 761
    .line 762
    const v22, 0x40d23d71    # 6.57f

    .line 763
    .line 764
    .line 765
    const v23, 0x41afeb85    # 21.99f

    .line 766
    .line 767
    .line 768
    const v24, 0x40cccccd    # 6.4f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v4, 0x419c0000    # 19.5f

    .line 778
    .line 779
    const/high16 v6, 0x40f80000    # 7.75f

    .line 780
    .line 781
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v25, -0x40600000    # -1.25f

    .line 785
    .line 786
    const/high16 v26, -0x40600000    # -1.25f

    .line 787
    .line 788
    const v21, -0x40cf5c29    # -0.69f

    .line 789
    .line 790
    .line 791
    const/16 v22, 0x0

    .line 792
    .line 793
    const/high16 v23, -0x40600000    # -1.25f

    .line 794
    .line 795
    const v24, -0x40f0a3d7    # -0.56f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v4, -0x40600000    # -1.25f

    .line 802
    .line 803
    const/high16 v6, -0x40600000    # -1.25f

    .line 804
    .line 805
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 806
    .line 807
    const v8, 0x3f0f5c29    # 0.56f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v4, 0x3f0f5c29    # 0.56f

    .line 814
    .line 815
    .line 816
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 817
    .line 818
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v4, 0x41a1851f    # 20.19f

    .line 822
    .line 823
    .line 824
    const/high16 v6, 0x419c0000    # 19.5f

    .line 825
    .line 826
    const/high16 v7, 0x40f80000    # 7.75f

    .line 827
    .line 828
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    const/high16 v6, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/high16 v8, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/4 v7, 0x0

    .line 843
    const-string v4, ""

    .line 844
    .line 845
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 846
    .line 847
    .line 848
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 853
    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 855
    .line 856
    .line 857
    move-result-wide v6

    .line 858
    const/4 v0, 0x0

    .line 859
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 863
    .line 864
    .line 865
    move-result v10

    .line 866
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 867
    .line 868
    .line 869
    move-result v11

    .line 870
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 873
    .line 874
    .line 875
    const v0, 0x419b3333    # 19.4f

    .line 876
    .line 877
    .line 878
    const v2, 0x412ca3d7    # 10.79f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const v0, 0x3e8f5c29    # 0.28f

    .line 885
    .line 886
    .line 887
    const v2, -0x40a66666    # -0.85f

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v17, -0x41570a3d    # -0.33f

    .line 894
    .line 895
    .line 896
    const v18, -0x41bd70a4    # -0.19f

    .line 897
    .line 898
    .line 899
    const v13, -0x42333333    # -0.1f

    .line 900
    .line 901
    .line 902
    const v14, -0x425c28f6    # -0.08f

    .line 903
    .line 904
    .line 905
    const v15, -0x41a8f5c3    # -0.21f

    .line 906
    .line 907
    .line 908
    const v16, -0x41f0a3d7    # -0.14f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v0, 0x419051ec    # 18.04f

    .line 915
    .line 916
    .line 917
    const/high16 v2, 0x41200000    # 10.0f

    .line 918
    .line 919
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, -0x40770a3d    # -1.07f

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, -0x41c7ae14    # -0.18f

    .line 929
    .line 930
    .line 931
    const v2, 0x3f5eb852    # 0.87f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, -0x4151eb85    # -0.34f

    .line 938
    .line 939
    .line 940
    const v18, 0x3e428f5c    # 0.19f

    .line 941
    .line 942
    .line 943
    const v13, -0x420a3d71    # -0.12f

    .line 944
    .line 945
    .line 946
    const v14, 0x3d4ccccd    # 0.05f

    .line 947
    .line 948
    .line 949
    const v15, -0x418a3d71    # -0.24f

    .line 950
    .line 951
    .line 952
    const v16, 0x3df5c28f    # 0.12f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v0, -0x40a8f5c3    # -0.84f

    .line 959
    .line 960
    .line 961
    const v2, -0x4170a3d7    # -0.28f

    .line 962
    .line 963
    .line 964
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v0, -0x40f5c28f    # -0.54f

    .line 968
    .line 969
    .line 970
    const v2, 0x3f6e147b    # 0.93f

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v0, 0x3f28f5c3    # 0.66f

    .line 977
    .line 978
    .line 979
    const v2, 0x3f170a3d    # 0.59f

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const/16 v17, 0x0

    .line 986
    .line 987
    const v18, 0x3ebd70a4    # 0.37f

    .line 988
    .line 989
    .line 990
    const v13, -0x43dc28f6    # -0.01f

    .line 991
    .line 992
    .line 993
    const v14, 0x3e051eb8    # 0.13f

    .line 994
    .line 995
    .line 996
    const v15, -0x43dc28f6    # -0.01f

    .line 997
    .line 998
    .line 999
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1000
    .line 1001
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v0, -0x40d70a3d    # -0.66f

    .line 1005
    .line 1006
    .line 1007
    const v2, 0x3f1c28f6    # 0.61f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, 0x3f0a3d71    # 0.54f

    .line 1014
    .line 1015
    .line 1016
    const v2, 0x3f6e147b    # 0.93f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x3f5c28f6    # 0.86f

    .line 1023
    .line 1024
    .line 1025
    const v2, -0x4175c28f    # -0.27f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, 0x3e9eb852    # 0.31f

    .line 1032
    .line 1033
    .line 1034
    const v18, 0x3e3851ec    # 0.18f

    .line 1035
    .line 1036
    .line 1037
    const v13, 0x3dcccccd    # 0.1f

    .line 1038
    .line 1039
    .line 1040
    const v14, 0x3d8f5c29    # 0.07f

    .line 1041
    .line 1042
    .line 1043
    const v15, 0x3e4ccccd    # 0.2f

    .line 1044
    .line 1045
    .line 1046
    const v16, 0x3e051eb8    # 0.13f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v0, 0x4187ae14    # 16.96f

    .line 1053
    .line 1054
    .line 1055
    const/high16 v2, 0x41700000    # 15.0f

    .line 1056
    .line 1057
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v0, 0x3f88f5c3    # 1.07f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v0, 0x3e428f5c    # 0.19f

    .line 1067
    .line 1068
    .line 1069
    const v2, -0x40a147ae    # -0.87f

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    .line 1075
    const v17, 0x3ea3d70a    # 0.32f

    .line 1076
    .line 1077
    .line 1078
    const v18, -0x41c7ae14    # -0.18f

    .line 1079
    .line 1080
    .line 1081
    const v13, 0x3de147ae    # 0.11f

    .line 1082
    .line 1083
    .line 1084
    const v14, -0x42b33333    # -0.05f

    .line 1085
    .line 1086
    .line 1087
    const v15, 0x3e6147ae    # 0.22f

    .line 1088
    .line 1089
    .line 1090
    const v16, -0x421eb852    # -0.11f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v0, 0x3f59999a    # 0.85f

    .line 1097
    .line 1098
    .line 1099
    const v2, 0x3e8a3d71    # 0.27f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const v0, 0x3f0a3d71    # 0.54f

    .line 1106
    .line 1107
    .line 1108
    const v2, -0x4091eb85    # -0.93f

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    const v0, -0x40d70a3d    # -0.66f

    .line 1115
    .line 1116
    .line 1117
    const v2, -0x40e3d70a    # -0.61f

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/16 v17, 0x0

    .line 1124
    .line 1125
    const v18, -0x41428f5c    # -0.37f

    .line 1126
    .line 1127
    .line 1128
    const v13, 0x3c23d70a    # 0.01f

    .line 1129
    .line 1130
    .line 1131
    const v14, -0x41fae148    # -0.13f

    .line 1132
    .line 1133
    .line 1134
    const v15, 0x3c23d70a    # 0.01f

    .line 1135
    .line 1136
    .line 1137
    const/high16 v16, -0x41800000    # -0.25f

    .line 1138
    .line 1139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    const v0, 0x3f28f5c3    # 0.66f

    .line 1143
    .line 1144
    .line 1145
    const v2, -0x40e8f5c3    # -0.59f

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    const v0, 0x419b3333    # 19.4f

    .line 1152
    .line 1153
    .line 1154
    const v2, 0x412ca3d7    # 10.79f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1164
    .line 1165
    const v2, 0x41563d71    # 13.39f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const v17, -0x409c28f6    # -0.89f

    .line 1172
    .line 1173
    .line 1174
    const v18, -0x409c28f6    # -0.89f

    .line 1175
    .line 1176
    .line 1177
    const v13, -0x41051eb8    # -0.49f

    .line 1178
    .line 1179
    .line 1180
    const/4 v14, 0x0

    .line 1181
    const v15, -0x409c28f6    # -0.89f

    .line 1182
    .line 1183
    .line 1184
    const v16, -0x41333333    # -0.4f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v17, 0x3f63d70a    # 0.89f

    .line 1191
    .line 1192
    .line 1193
    const/4 v13, 0x0

    .line 1194
    const v14, -0x41051eb8    # -0.49f

    .line 1195
    .line 1196
    .line 1197
    const v15, 0x3ecccccd    # 0.4f

    .line 1198
    .line 1199
    .line 1200
    const v16, -0x409c28f6    # -0.89f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v0, 0x3ecccccd    # 0.4f

    .line 1207
    .line 1208
    .line 1209
    const v2, 0x3f63d70a    # 0.89f

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1213
    .line 1214
    .line 1215
    const/high16 v17, 0x418c0000    # 17.5f

    .line 1216
    .line 1217
    const v18, 0x41563d71    # 13.39f

    .line 1218
    .line 1219
    .line 1220
    const v13, 0x41931eb8    # 18.39f

    .line 1221
    .line 1222
    .line 1223
    const v14, 0x414fd70a    # 12.99f

    .line 1224
    .line 1225
    .line 1226
    const v15, 0x418feb85    # 17.99f

    .line 1227
    .line 1228
    .line 1229
    const v16, 0x41563d71    # 13.39f

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    const/16 v16, 0x3800

    .line 1243
    .line 1244
    const/16 v17, 0x0

    .line 1245
    .line 1246
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1247
    .line 1248
    const/4 v7, 0x0

    .line 1249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1250
    .line 1251
    const/4 v13, 0x0

    .line 1252
    const/4 v14, 0x0

    .line 1253
    const/4 v15, 0x0

    .line 1254
    const-string v4, ""

    .line 1255
    .line 1256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    sput-object v0, Landroidx/compose/material/icons/sharp/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1265
    .line 1266
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1267
    .line 1268
    .line 1269
    return-object v0
.end method
