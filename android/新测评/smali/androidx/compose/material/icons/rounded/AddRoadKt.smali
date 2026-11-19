.class public final Landroidx/compose/material/icons/rounded/AddRoadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_addRoad",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AddRoad",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAddRoad",
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
        "SMAP\nAddRoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRoad.kt\nandroidx/compose/material/icons/rounded/AddRoadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n233#2,18:323\n253#2:360\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n705#4,2:341\n717#4,2:343\n719#4,11:349\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n72#5,4:345\n*S KotlinDebug\n*F\n+ 1 AddRoad.kt\nandroidx/compose/material/icons/rounded/AddRoadKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n54#1:171,18\n54#1:208\n66#1:209,18\n66#1:246\n78#1:247,18\n78#1:284\n90#1:285,18\n90#1:322\n102#1:323,18\n102#1:360\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n54#1:189,2\n54#1:191,2\n54#1:197,11\n66#1:227,2\n66#1:229,2\n66#1:235,11\n78#1:265,2\n78#1:267,2\n78#1:273,11\n90#1:303,2\n90#1:305,2\n90#1:311,11\n102#1:341,2\n102#1:343,2\n102#1:349,11\n30#1:155,4\n54#1:193,4\n66#1:231,4\n78#1:269,4\n90#1:307,4\n102#1:345,4\n*E\n"
    }
.end annotation


# static fields
.field private static _addRoad:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddRoad(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddRoadKt;->_addRoad:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddRoad"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, -0x40800000    # -1.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v23, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x40800000    # -1.0f

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
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v26, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v21, -0x40f33333    # -0.55f

    .line 108
    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const/high16 v23, -0x40800000    # -1.0f

    .line 113
    .line 114
    const v24, 0x3ee66666    # 0.45f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40000000    # 2.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, -0x40000000    # -2.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const v22, 0x3f0ccccd    # 0.55f

    .line 142
    .line 143
    .line 144
    const v23, 0x3ee66666    # 0.45f

    .line 145
    .line 146
    .line 147
    const/high16 v24, 0x3f800000    # 1.0f

    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/4 v4, 0x0

    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v26, -0x40800000    # -1.0f

    .line 168
    .line 169
    const v21, 0x3f0ccccd    # 0.55f

    .line 170
    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const/high16 v23, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const v24, -0x4119999a    # -0.45f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, -0x40000000    # -2.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x40000000    # 2.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, -0x40800000    # -1.0f

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const v22, -0x40f33333    # -0.55f

    .line 204
    .line 205
    .line 206
    const v23, -0x4119999a    # -0.45f

    .line 207
    .line 208
    .line 209
    const/high16 v24, -0x40800000    # -1.0f

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x41a00000    # 20.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const/16 v16, 0x3800

    .line 227
    .line 228
    const/16 v17, 0x0

    .line 229
    .line 230
    const/high16 v6, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v8, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    const/high16 v9, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/high16 v12, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/4 v13, 0x0

    .line 240
    const/4 v14, 0x0

    .line 241
    const/4 v15, 0x0

    .line 242
    const-string v4, ""

    .line 243
    .line 244
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 245
    .line 246
    .line 247
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    const/4 v2, 0x0

    .line 258
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x40800000    # 4.0f

    .line 275
    .line 276
    const/high16 v6, 0x41980000    # 19.0f

    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v26, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const v21, -0x40f33333    # -0.55f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/high16 v23, -0x40800000    # -1.0f

    .line 292
    .line 293
    const v24, 0x3ee66666    # 0.45f

    .line 294
    .line 295
    .line 296
    move-object/from16 v20, v2

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x40e00000    # 7.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v25, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const v22, 0x3f0ccccd    # 0.55f

    .line 311
    .line 312
    .line 313
    const v23, 0x3ee66666    # 0.45f

    .line 314
    .line 315
    .line 316
    const/high16 v24, 0x3f800000    # 1.0f

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v26, -0x40800000    # -1.0f

    .line 326
    .line 327
    const v21, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    const/16 v22, 0x0

    .line 331
    .line 332
    const/high16 v23, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v24, -0x4119999a    # -0.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x40a00000    # 5.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, 0x41980000    # 19.0f

    .line 346
    .line 347
    const/high16 v26, 0x40800000    # 4.0f

    .line 348
    .line 349
    const/high16 v21, 0x41a00000    # 20.0f

    .line 350
    .line 351
    const v22, 0x408e6666    # 4.45f

    .line 352
    .line 353
    .line 354
    const v23, 0x419c6666    # 19.55f

    .line 355
    .line 356
    .line 357
    const/high16 v24, 0x40800000    # 4.0f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/high16 v6, 0x3f800000    # 1.0f

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 405
    .line 406
    const/high16 v6, 0x41a00000    # 20.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v25, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/high16 v26, -0x40800000    # -1.0f

    .line 417
    .line 418
    const v21, 0x3f0ccccd    # 0.55f

    .line 419
    .line 420
    .line 421
    const/16 v22, 0x0

    .line 422
    .line 423
    const/high16 v23, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const v24, -0x4119999a    # -0.45f

    .line 426
    .line 427
    .line 428
    move-object/from16 v20, v2

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v25, -0x40800000    # -1.0f

    .line 437
    .line 438
    const/16 v21, 0x0

    .line 439
    .line 440
    const v22, -0x40f33333    # -0.55f

    .line 441
    .line 442
    .line 443
    const v23, -0x4119999a    # -0.45f

    .line 444
    .line 445
    .line 446
    const/high16 v24, -0x40800000    # -1.0f

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/4 v4, 0x0

    .line 452
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v25, 0x40800000    # 4.0f

    .line 456
    .line 457
    const/high16 v26, 0x40a00000    # 5.0f

    .line 458
    .line 459
    const v21, 0x408e6666    # 4.45f

    .line 460
    .line 461
    .line 462
    const/high16 v22, 0x40800000    # 4.0f

    .line 463
    .line 464
    const/high16 v23, 0x40800000    # 4.0f

    .line 465
    .line 466
    const v24, 0x408e6666    # 4.45f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41600000    # 14.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v25, 0x40a00000    # 5.0f

    .line 478
    .line 479
    const/high16 v26, 0x41a00000    # 20.0f

    .line 480
    .line 481
    const/high16 v21, 0x40800000    # 4.0f

    .line 482
    .line 483
    const v22, 0x419c6666    # 19.55f

    .line 484
    .line 485
    .line 486
    const v23, 0x408e6666    # 4.45f

    .line 487
    .line 488
    .line 489
    const/high16 v24, 0x41a00000    # 20.0f

    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const/high16 v6, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 514
    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41000000    # 8.0f

    .line 537
    .line 538
    const/high16 v6, 0x41400000    # 12.0f

    .line 539
    .line 540
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v25, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v26, -0x40800000    # -1.0f

    .line 549
    .line 550
    const v21, 0x3f0ccccd    # 0.55f

    .line 551
    .line 552
    .line 553
    const/16 v22, 0x0

    .line 554
    .line 555
    const/high16 v23, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const v24, -0x4119999a    # -0.45f

    .line 558
    .line 559
    .line 560
    move-object/from16 v20, v2

    .line 561
    .line 562
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v4, 0x40a00000    # 5.0f

    .line 566
    .line 567
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v25, -0x40800000    # -1.0f

    .line 571
    .line 572
    const/16 v21, 0x0

    .line 573
    .line 574
    const v22, -0x40f33333    # -0.55f

    .line 575
    .line 576
    .line 577
    const v23, -0x4119999a    # -0.45f

    .line 578
    .line 579
    .line 580
    const/high16 v24, -0x40800000    # -1.0f

    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/4 v4, 0x0

    .line 586
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v26, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const v21, -0x40f33333    # -0.55f

    .line 592
    .line 593
    .line 594
    const/16 v22, 0x0

    .line 595
    .line 596
    const/high16 v23, -0x40800000    # -1.0f

    .line 597
    .line 598
    const v24, 0x3ee66666    # 0.45f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x40000000    # 2.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v25, 0x41400000    # 12.0f

    .line 610
    .line 611
    const/high16 v26, 0x41000000    # 8.0f

    .line 612
    .line 613
    const/high16 v21, 0x41300000    # 11.0f

    .line 614
    .line 615
    const v22, 0x40f1999a    # 7.55f

    .line 616
    .line 617
    .line 618
    const v23, 0x41373333    # 11.45f

    .line 619
    .line 620
    .line 621
    const/high16 v24, 0x41000000    # 8.0f

    .line 622
    .line 623
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    const/high16 v6, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    const-string v4, ""

    .line 637
    .line 638
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 639
    .line 640
    .line 641
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 646
    .line 647
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 648
    .line 649
    .line 650
    move-result-wide v6

    .line 651
    const/4 v2, 0x0

    .line 652
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 656
    .line 657
    .line 658
    move-result v10

    .line 659
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 660
    .line 661
    .line 662
    move-result v11

    .line 663
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 666
    .line 667
    .line 668
    const/high16 v4, 0x41600000    # 14.0f

    .line 669
    .line 670
    const/high16 v6, 0x41400000    # 12.0f

    .line 671
    .line 672
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v25, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/high16 v26, -0x40800000    # -1.0f

    .line 681
    .line 682
    const v21, 0x3f0ccccd    # 0.55f

    .line 683
    .line 684
    .line 685
    const/16 v22, 0x0

    .line 686
    .line 687
    const/high16 v23, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const v24, -0x4119999a    # -0.45f

    .line 690
    .line 691
    .line 692
    move-object/from16 v20, v2

    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v4, -0x40000000    # -2.0f

    .line 698
    .line 699
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v25, -0x40800000    # -1.0f

    .line 703
    .line 704
    const/16 v21, 0x0

    .line 705
    .line 706
    const v22, -0x40f33333    # -0.55f

    .line 707
    .line 708
    .line 709
    const v23, -0x4119999a    # -0.45f

    .line 710
    .line 711
    .line 712
    const/high16 v24, -0x40800000    # -1.0f

    .line 713
    .line 714
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/4 v4, 0x0

    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v26, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const v21, -0x40f33333    # -0.55f

    .line 724
    .line 725
    .line 726
    const/16 v22, 0x0

    .line 727
    .line 728
    const/high16 v23, -0x40800000    # -1.0f

    .line 729
    .line 730
    const v24, 0x3ee66666    # 0.45f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v4, 0x40000000    # 2.0f

    .line 737
    .line 738
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v25, 0x41400000    # 12.0f

    .line 742
    .line 743
    const/high16 v26, 0x41600000    # 14.0f

    .line 744
    .line 745
    const/high16 v21, 0x41300000    # 11.0f

    .line 746
    .line 747
    const v22, 0x4158cccd    # 13.55f

    .line 748
    .line 749
    .line 750
    const v23, 0x41373333    # 11.45f

    .line 751
    .line 752
    .line 753
    const/high16 v24, 0x41600000    # 14.0f

    .line 754
    .line 755
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/high16 v6, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v7, 0x0

    .line 768
    const-string v4, ""

    .line 769
    .line 770
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 771
    .line 772
    .line 773
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 778
    .line 779
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 780
    .line 781
    .line 782
    move-result-wide v6

    .line 783
    const/4 v0, 0x0

    .line 784
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 792
    .line 793
    .line 794
    move-result v11

    .line 795
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x41400000    # 12.0f

    .line 801
    .line 802
    const/high16 v2, 0x41a00000    # 20.0f

    .line 803
    .line 804
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v17, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const/high16 v18, -0x40800000    # -1.0f

    .line 813
    .line 814
    const v13, 0x3f0ccccd    # 0.55f

    .line 815
    .line 816
    .line 817
    const/high16 v15, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const v16, -0x4119999a    # -0.45f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, -0x40000000    # -2.0f

    .line 826
    .line 827
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v17, -0x40800000    # -1.0f

    .line 831
    .line 832
    const/4 v13, 0x0

    .line 833
    const v14, -0x40f33333    # -0.55f

    .line 834
    .line 835
    .line 836
    const v15, -0x4119999a    # -0.45f

    .line 837
    .line 838
    .line 839
    const/high16 v16, -0x40800000    # -1.0f

    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const/4 v0, 0x0

    .line 845
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v18, 0x3f800000    # 1.0f

    .line 849
    .line 850
    const v13, -0x40f33333    # -0.55f

    .line 851
    .line 852
    .line 853
    const/4 v14, 0x0

    .line 854
    const/high16 v15, -0x40800000    # -1.0f

    .line 855
    .line 856
    const v16, 0x3ee66666    # 0.45f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const/high16 v0, 0x40000000    # 2.0f

    .line 863
    .line 864
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v17, 0x41400000    # 12.0f

    .line 868
    .line 869
    const/high16 v18, 0x41a00000    # 20.0f

    .line 870
    .line 871
    const/high16 v13, 0x41300000    # 11.0f

    .line 872
    .line 873
    const v14, 0x419c6666    # 19.55f

    .line 874
    .line 875
    .line 876
    const v15, 0x41373333    # 11.45f

    .line 877
    .line 878
    .line 879
    const/high16 v16, 0x41a00000    # 20.0f

    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v7, 0x0

    .line 898
    const/high16 v12, 0x3f800000    # 1.0f

    .line 899
    .line 900
    const/4 v13, 0x0

    .line 901
    const/4 v14, 0x0

    .line 902
    const/4 v15, 0x0

    .line 903
    const-string v4, ""

    .line 904
    .line 905
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    sput-object v0, Landroidx/compose/material/icons/rounded/AddRoadKt;->_addRoad:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 914
    .line 915
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    return-object v0
.end method
