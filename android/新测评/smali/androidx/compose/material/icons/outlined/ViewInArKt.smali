.class public final Landroidx/compose/material/icons/outlined/ViewInArKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_viewInAr",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ViewInAr",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getViewInAr",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nViewInAr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n*S KotlinDebug\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n42#1:171,18\n42#1:208\n54#1:209,18\n54#1:246\n66#1:247,18\n66#1:284\n78#1:285,18\n78#1:322\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n42#1:189,2\n42#1:191,2\n42#1:197,11\n54#1:227,2\n54#1:229,2\n54#1:235,11\n66#1:265,2\n66#1:267,2\n66#1:273,11\n78#1:303,2\n78#1:305,2\n78#1:311,11\n30#1:155,4\n42#1:193,4\n54#1:231,4\n66#1:269,4\n78#1:307,4\n*E\n"
    }
.end annotation


# static fields
.field private static _viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getViewInAr(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ViewInArKt;->_viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ViewInAr"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40f33333    # -0.55f

    .line 84
    .line 85
    .line 86
    const v23, 0x3ee66666    # 0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40800000    # -1.0f

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
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, 0x40800000    # 4.0f

    .line 112
    .line 113
    const v21, 0x4015c28f    # 2.34f

    .line 114
    .line 115
    .line 116
    const/high16 v22, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/high16 v23, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const v24, 0x4015c28f    # 2.34f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40800000    # 4.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const/16 v16, 0x3800

    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    const/high16 v6, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v8, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x40400000    # 3.0f

    .line 195
    .line 196
    const/high16 v6, 0x41a00000    # 20.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x40000000    # -2.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x3f800000    # 1.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x40000000    # 2.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x40400000    # 3.0f

    .line 217
    .line 218
    const/high16 v26, 0x40400000    # 3.0f

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const v22, 0x3fd47ae1    # 1.66f

    .line 223
    .line 224
    .line 225
    const v23, 0x3fab851f    # 1.34f

    .line 226
    .line 227
    .line 228
    const/high16 v24, 0x40400000    # 3.0f

    .line 229
    .line 230
    move-object/from16 v20, v2

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, -0x40000000    # -2.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40800000    # 4.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v26, 0x41a00000    # 20.0f

    .line 249
    .line 250
    const v21, 0x405ccccd    # 3.45f

    .line 251
    .line 252
    .line 253
    const/high16 v22, 0x41a80000    # 21.0f

    .line 254
    .line 255
    const/high16 v23, 0x40400000    # 3.0f

    .line 256
    .line 257
    const v24, 0x41a46666    # 20.55f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/high16 v6, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const-string v4, ""

    .line 274
    .line 275
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x41a00000    # 20.0f

    .line 306
    .line 307
    const/high16 v6, 0x3f800000    # 1.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, -0x40000000    # -2.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x40000000    # 2.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v25, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v26, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const v21, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const/16 v22, 0x0

    .line 333
    .line 334
    const/high16 v23, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const v24, 0x3ee66666    # 0.45f

    .line 337
    .line 338
    .line 339
    move-object/from16 v20, v2

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x40800000    # 4.0f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v25, 0x41a00000    # 20.0f

    .line 356
    .line 357
    const/high16 v21, 0x41b80000    # 23.0f

    .line 358
    .line 359
    const v22, 0x4015c28f    # 2.34f

    .line 360
    .line 361
    .line 362
    const v23, 0x41ad47ae    # 21.66f

    .line 363
    .line 364
    .line 365
    const/high16 v24, 0x3f800000    # 1.0f

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/4 v7, 0x0

    .line 378
    const-string v4, ""

    .line 379
    .line 380
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 381
    .line 382
    .line 383
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 388
    .line 389
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    const/4 v2, 0x0

    .line 394
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41a80000    # 21.0f

    .line 411
    .line 412
    const/high16 v6, 0x41a00000    # 20.0f

    .line 413
    .line 414
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v25, -0x40800000    # -1.0f

    .line 418
    .line 419
    const/16 v21, 0x0

    .line 420
    .line 421
    const v22, 0x3f0ccccd    # 0.55f

    .line 422
    .line 423
    .line 424
    const v23, -0x4119999a    # -0.45f

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
    const/high16 v4, -0x40000000    # -2.0f

    .line 433
    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x40000000    # 2.0f

    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v25, 0x40400000    # 3.0f

    .line 446
    .line 447
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 448
    .line 449
    const v21, 0x3fd47ae1    # 1.66f

    .line 450
    .line 451
    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const/high16 v23, 0x40400000    # 3.0f

    .line 455
    .line 456
    const v24, -0x40547ae1    # -1.34f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v4, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v4, 0x41a00000    # 20.0f

    .line 471
    .line 472
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41980000    # 19.0f

    .line 518
    .line 519
    const v2, 0x416deb85    # 14.87f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x4112147b    # 9.13f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, -0x40800000    # -1.0f

    .line 532
    .line 533
    const v18, -0x40228f5c    # -1.73f

    .line 534
    .line 535
    .line 536
    const v14, -0x40c7ae14    # -0.72f

    .line 537
    .line 538
    .line 539
    const v15, -0x413d70a4    # -0.38f

    .line 540
    .line 541
    .line 542
    const v16, -0x404f5c29    # -1.38f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, -0x3f600000    # -5.0f

    .line 549
    .line 550
    const v2, -0x3fc7ae14    # -2.88f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v18, -0x4175c28f    # -0.27f

    .line 557
    .line 558
    .line 559
    const v13, -0x416147ae    # -0.31f

    .line 560
    .line 561
    .line 562
    const v14, -0x41c7ae14    # -0.18f

    .line 563
    .line 564
    .line 565
    const v15, -0x40d9999a    # -0.65f

    .line 566
    .line 567
    .line 568
    const v16, -0x4175c28f    # -0.27f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, -0x40800000    # -1.0f

    .line 575
    .line 576
    const v2, 0x3e8a3d71    # 0.27f

    .line 577
    .line 578
    .line 579
    const v4, -0x40cf5c29    # -0.69f

    .line 580
    .line 581
    .line 582
    const v6, 0x3db851ec    # 0.09f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x40c00000    # 6.0f

    .line 589
    .line 590
    const v2, 0x40ec7ae1    # 7.39f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x40a00000    # 5.0f

    .line 597
    .line 598
    const v18, 0x4112147b    # 9.13f

    .line 599
    .line 600
    .line 601
    const v13, 0x40ac28f6    # 5.38f

    .line 602
    .line 603
    .line 604
    const/high16 v14, 0x40f80000    # 7.75f

    .line 605
    .line 606
    const/high16 v15, 0x40a00000    # 5.0f

    .line 607
    .line 608
    const v16, 0x41068f5c    # 8.41f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x40b7ae14    # 5.74f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const v18, 0x3fdd70a4    # 1.73f

    .line 623
    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const v14, 0x3f3851ec    # 0.72f

    .line 627
    .line 628
    .line 629
    const v15, 0x3ec28f5c    # 0.38f

    .line 630
    .line 631
    .line 632
    const v16, 0x3fb0a3d7    # 1.38f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x403851ec    # 2.88f

    .line 639
    .line 640
    .line 641
    const/high16 v2, 0x40a00000    # 5.0f

    .line 642
    .line 643
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v18, 0x3e8a3d71    # 0.27f

    .line 647
    .line 648
    .line 649
    const v13, 0x3e9eb852    # 0.31f

    .line 650
    .line 651
    .line 652
    const v14, 0x3e3851ec    # 0.18f

    .line 653
    .line 654
    .line 655
    const v15, 0x3f266666    # 0.65f

    .line 656
    .line 657
    .line 658
    const v16, 0x3e8a3d71    # 0.27f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, -0x4247ae14    # -0.09f

    .line 665
    .line 666
    .line 667
    const v2, -0x4175c28f    # -0.27f

    .line 668
    .line 669
    .line 670
    const/high16 v4, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const v6, 0x3f30a3d7    # 0.69f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x40a00000    # 5.0f

    .line 679
    .line 680
    const v2, -0x3fc7ae14    # -2.88f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, 0x41980000    # 19.0f

    .line 687
    .line 688
    const v18, 0x416deb85    # 14.87f

    .line 689
    .line 690
    .line 691
    const v13, 0x4194f5c3    # 18.62f

    .line 692
    .line 693
    .line 694
    const/high16 v14, 0x41820000    # 16.25f

    .line 695
    .line 696
    const/high16 v15, 0x41980000    # 19.0f

    .line 697
    .line 698
    const v16, 0x417970a4    # 15.59f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v0, 0x41300000    # 11.0f

    .line 708
    .line 709
    const v2, 0x41895c29    # 17.17f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, -0x3feccccd    # -2.3f

    .line 716
    .line 717
    .line 718
    const/high16 v2, -0x3f800000    # -4.0f

    .line 719
    .line 720
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, -0x3f6bd70a    # -4.63f

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x40151eb8    # 2.33f

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x40800000    # 4.0f

    .line 733
    .line 734
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, 0x41895c29    # 17.17f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x412d70a4    # 10.84f

    .line 747
    .line 748
    .line 749
    const/high16 v2, 0x41400000    # 12.0f

    .line 750
    .line 751
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, 0x4100a3d7    # 8.04f

    .line 755
    .line 756
    .line 757
    const v2, 0x41087ae1    # 8.53f

    .line 758
    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x40c80000    # 6.25f

    .line 764
    .line 765
    const/high16 v2, 0x41400000    # 12.0f

    .line 766
    .line 767
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, 0x407d70a4    # 3.96f

    .line 771
    .line 772
    .line 773
    const v2, 0x4011eb85    # 2.28f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x412d70a4    # 10.84f

    .line 780
    .line 781
    .line 782
    const/high16 v2, 0x41400000    # 12.0f

    .line 783
    .line 784
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v0, 0x41880000    # 17.0f

    .line 791
    .line 792
    const v2, 0x416deb85    # 14.87f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x40133333    # 2.3f

    .line 799
    .line 800
    .line 801
    const/high16 v2, -0x3f800000    # -4.0f

    .line 802
    .line 803
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, -0x3f6ccccd    # -4.6f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, -0x3feae148    # -2.33f

    .line 813
    .line 814
    .line 815
    const/high16 v2, 0x40800000    # 4.0f

    .line 816
    .line 817
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v0, 0x416deb85    # 14.87f

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const/16 v16, 0x3800

    .line 834
    .line 835
    const/16 v17, 0x0

    .line 836
    .line 837
    const/high16 v6, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v7, 0x0

    .line 840
    const/high16 v12, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/4 v13, 0x0

    .line 843
    const/4 v14, 0x0

    .line 844
    const/4 v15, 0x0

    .line 845
    const-string v4, ""

    .line 846
    .line 847
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    sput-object v0, Landroidx/compose/material/icons/outlined/ViewInArKt;->_viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 856
    .line 857
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    return-object v0
.end method
