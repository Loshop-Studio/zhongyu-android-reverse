.class public final Landroidx/compose/material/icons/twotone/PeopleAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_peopleAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PeopleAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPeopleAlt",
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
        "SMAP\nPeopleAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleAlt.kt\nandroidx/compose/material/icons/twotone/PeopleAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n233#2,18:189\n253#2:226\n233#2,18:227\n253#2:264\n233#2,18:265\n253#2:302\n233#2,18:303\n253#2:340\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n705#4,2:207\n717#4,2:209\n719#4,11:215\n705#4,2:245\n717#4,2:247\n719#4,11:253\n705#4,2:283\n717#4,2:285\n719#4,11:291\n705#4,2:321\n717#4,2:323\n719#4,11:329\n72#5,4:135\n72#5,4:173\n72#5,4:211\n72#5,4:249\n72#5,4:287\n72#5,4:325\n*S KotlinDebug\n*F\n+ 1 PeopleAlt.kt\nandroidx/compose/material/icons/twotone/PeopleAltKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n36#1:151,18\n36#1:188\n45#1:189,18\n45#1:226\n54#1:227,18\n54#1:264\n64#1:265,18\n64#1:302\n78#1:303,18\n78#1:340\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n36#1:169,2\n36#1:171,2\n36#1:177,11\n45#1:207,2\n45#1:209,2\n45#1:215,11\n54#1:245,2\n54#1:247,2\n54#1:253,11\n64#1:283,2\n64#1:285,2\n64#1:291,11\n78#1:321,2\n78#1:323,2\n78#1:329,11\n30#1:135,4\n36#1:173,4\n45#1:211,4\n54#1:249,4\n64#1:287,4\n78#1:325,4\n*E\n"
    }
.end annotation


# static fields
.field private static _peopleAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPeopleAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PeopleAltKt;->_peopleAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PeopleAlt"

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
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41700000    # 15.0f

    .line 162
    .line 163
    const/high16 v6, 0x41100000    # 9.0f

    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, -0x3f400000    # -6.0f

    .line 169
    .line 170
    const v26, 0x4000a3d7    # 2.01f

    .line 171
    .line 172
    .line 173
    const v21, -0x3fd33333    # -2.7f

    .line 174
    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const v23, -0x3f466666    # -5.8f

    .line 179
    .line 180
    .line 181
    const v24, 0x3fa51eb8    # 1.29f

    .line 182
    .line 183
    .line 184
    move-object/from16 v20, v2

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41900000    # 18.0f

    .line 190
    .line 191
    const/high16 v6, 0x40400000    # 3.0f

    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x40800000    # -1.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x41100000    # 9.0f

    .line 207
    .line 208
    const/high16 v26, 0x41700000    # 15.0f

    .line 209
    .line 210
    const v21, 0x416ccccd    # 14.8f

    .line 211
    .line 212
    .line 213
    const v22, 0x418251ec    # 16.29f

    .line 214
    .line 215
    .line 216
    const v23, 0x413b3333    # 11.7f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x41700000    # 15.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    const v6, 0x3e99999a    # 0.3f

    .line 232
    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    const-string v4, ""

    .line 236
    .line 237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 245
    .line 246
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    const/4 v2, 0x0

    .line 251
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const v4, 0x41855c29    # 16.67f

    .line 268
    .line 269
    .line 270
    const v6, 0x4152147b    # 13.13f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v25, 0x41980000    # 19.0f

    .line 277
    .line 278
    const/high16 v26, 0x41880000    # 17.0f

    .line 279
    .line 280
    const v21, 0x419051ec    # 18.04f

    .line 281
    .line 282
    .line 283
    const v22, 0x4160f5c3    # 14.06f

    .line 284
    .line 285
    .line 286
    const/high16 v23, 0x41980000    # 19.0f

    .line 287
    .line 288
    const v24, 0x41751eb8    # 15.32f

    .line 289
    .line 290
    .line 291
    move-object/from16 v20, v2

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x40400000    # 3.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x40800000    # 4.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 307
    .line 308
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x41855c29    # 16.67f

    .line 312
    .line 313
    .line 314
    const v26, 0x4152147b    # 13.13f

    .line 315
    .line 316
    .line 317
    const/high16 v21, 0x41b80000    # 23.0f

    .line 318
    .line 319
    const v22, 0x416d1eb8    # 14.82f

    .line 320
    .line 321
    .line 322
    const v23, 0x419b70a4    # 19.43f

    .line 323
    .line 324
    .line 325
    const v24, 0x41587ae1    # 13.53f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/high16 v6, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v8, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const-string v4, ""

    .line 344
    .line 345
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 346
    .line 347
    .line 348
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    const/4 v2, 0x0

    .line 359
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41400000    # 12.0f

    .line 376
    .line 377
    const/high16 v6, 0x41700000    # 15.0f

    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, 0x40800000    # 4.0f

    .line 383
    .line 384
    const/high16 v26, -0x3f800000    # -4.0f

    .line 385
    .line 386
    const v21, 0x400d70a4    # 2.21f

    .line 387
    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/high16 v23, 0x40800000    # 4.0f

    .line 392
    .line 393
    const v24, -0x401ae148    # -1.79f

    .line 394
    .line 395
    .line 396
    move-object/from16 v20, v2

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, -0x3f800000    # -4.0f

    .line 402
    .line 403
    const/16 v21, 0x0

    .line 404
    .line 405
    const v22, -0x3ff28f5c    # -2.21f

    .line 406
    .line 407
    .line 408
    const v23, -0x401ae148    # -1.79f

    .line 409
    .line 410
    .line 411
    const/high16 v24, -0x3f800000    # -4.0f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v25, -0x4055c28f    # -1.33f

    .line 417
    .line 418
    .line 419
    const v26, 0x3e75c28f    # 0.24f

    .line 420
    .line 421
    .line 422
    const v21, -0x410f5c29    # -0.47f

    .line 423
    .line 424
    .line 425
    const/16 v22, 0x0

    .line 426
    .line 427
    const v23, -0x40970a3d    # -0.91f

    .line 428
    .line 429
    .line 430
    const v24, 0x3dcccccd    # 0.1f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v25, 0x41700000    # 15.0f

    .line 437
    .line 438
    const/high16 v26, 0x41000000    # 8.0f

    .line 439
    .line 440
    const/high16 v21, 0x41680000    # 14.5f

    .line 441
    .line 442
    const v22, 0x40a8a3d7    # 5.27f

    .line 443
    .line 444
    .line 445
    const/high16 v23, 0x41700000    # 15.0f

    .line 446
    .line 447
    const v24, 0x40d28f5c    # 6.58f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, -0x4055c28f    # -1.33f

    .line 454
    .line 455
    .line 456
    const v6, 0x4070a3d7    # 3.76f

    .line 457
    .line 458
    .line 459
    const/high16 v7, -0x41000000    # -0.5f

    .line 460
    .line 461
    const v8, 0x402eb852    # 2.73f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v26, 0x41400000    # 12.0f

    .line 468
    .line 469
    const v21, 0x416170a4    # 14.09f

    .line 470
    .line 471
    .line 472
    const v22, 0x413e6666    # 11.9f

    .line 473
    .line 474
    .line 475
    const v23, 0x41687ae1    # 14.53f

    .line 476
    .line 477
    .line 478
    const/high16 v24, 0x41400000    # 12.0f

    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v8, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const-string v4, ""

    .line 496
    .line 497
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 498
    .line 499
    .line 500
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 505
    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 507
    .line 508
    .line 509
    move-result-wide v6

    .line 510
    const/4 v2, 0x0

    .line 511
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 525
    .line 526
    .line 527
    const/high16 v4, 0x41400000    # 12.0f

    .line 528
    .line 529
    const/high16 v6, 0x41100000    # 9.0f

    .line 530
    .line 531
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v25, 0x40800000    # 4.0f

    .line 535
    .line 536
    const/high16 v26, -0x3f800000    # -4.0f

    .line 537
    .line 538
    const v21, 0x400d70a4    # 2.21f

    .line 539
    .line 540
    .line 541
    const/16 v22, 0x0

    .line 542
    .line 543
    const/high16 v23, 0x40800000    # 4.0f

    .line 544
    .line 545
    const v24, -0x401ae148    # -1.79f

    .line 546
    .line 547
    .line 548
    move-object/from16 v20, v2

    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v25, -0x3f800000    # -4.0f

    .line 554
    .line 555
    const/16 v21, 0x0

    .line 556
    .line 557
    const v22, -0x3ff28f5c    # -2.21f

    .line 558
    .line 559
    .line 560
    const v23, -0x401ae148    # -1.79f

    .line 561
    .line 562
    .line 563
    const/high16 v24, -0x3f800000    # -4.0f

    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, 0x40b947ae    # 5.79f

    .line 569
    .line 570
    .line 571
    const/high16 v6, 0x40a00000    # 5.0f

    .line 572
    .line 573
    const/high16 v7, 0x41000000    # 8.0f

    .line 574
    .line 575
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v25, 0x41100000    # 9.0f

    .line 579
    .line 580
    const/high16 v26, 0x41400000    # 12.0f

    .line 581
    .line 582
    const/high16 v21, 0x40a00000    # 5.0f

    .line 583
    .line 584
    const v22, 0x41235c29    # 10.21f

    .line 585
    .line 586
    .line 587
    const v23, 0x40d947ae    # 6.79f

    .line 588
    .line 589
    .line 590
    const/high16 v24, 0x41400000    # 12.0f

    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v4, 0x40c00000    # 6.0f

    .line 599
    .line 600
    const/high16 v6, 0x41100000    # 9.0f

    .line 601
    .line 602
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v25, 0x40000000    # 2.0f

    .line 606
    .line 607
    const/high16 v26, 0x40000000    # 2.0f

    .line 608
    .line 609
    const v21, 0x3f8ccccd    # 1.1f

    .line 610
    .line 611
    .line 612
    const/16 v22, 0x0

    .line 613
    .line 614
    const/high16 v23, 0x40000000    # 2.0f

    .line 615
    .line 616
    const v24, 0x3f666666    # 0.9f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v25, -0x40000000    # -2.0f

    .line 623
    .line 624
    const/16 v21, 0x0

    .line 625
    .line 626
    const v22, 0x3f8ccccd    # 1.1f

    .line 627
    .line 628
    .line 629
    const v23, -0x4099999a    # -0.9f

    .line 630
    .line 631
    .line 632
    const/high16 v24, 0x40000000    # 2.0f

    .line 633
    .line 634
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v4, 0x4111999a    # 9.1f

    .line 638
    .line 639
    .line 640
    const/high16 v6, 0x40e00000    # 7.0f

    .line 641
    .line 642
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v25, 0x41100000    # 9.0f

    .line 646
    .line 647
    const/high16 v26, 0x40c00000    # 6.0f

    .line 648
    .line 649
    const/high16 v21, 0x40e00000    # 7.0f

    .line 650
    .line 651
    const v22, 0x40dccccd    # 6.9f

    .line 652
    .line 653
    .line 654
    const v23, 0x40fccccd    # 7.9f

    .line 655
    .line 656
    .line 657
    const/high16 v24, 0x40c00000    # 6.0f

    .line 658
    .line 659
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/high16 v6, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 682
    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 684
    .line 685
    .line 686
    move-result-wide v6

    .line 687
    const/4 v0, 0x0

    .line 688
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x41500000    # 13.0f

    .line 705
    .line 706
    const/high16 v2, 0x41100000    # 9.0f

    .line 707
    .line 708
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, -0x3f000000    # -8.0f

    .line 712
    .line 713
    const/high16 v18, 0x40800000    # 4.0f

    .line 714
    .line 715
    const v13, -0x3fd51eb8    # -2.67f

    .line 716
    .line 717
    .line 718
    const/high16 v15, -0x3f000000    # -8.0f

    .line 719
    .line 720
    const v16, 0x3fab851f    # 1.34f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, 0x40400000    # 3.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x41800000    # 16.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, 0x41100000    # 9.0f

    .line 742
    .line 743
    const/high16 v18, 0x41500000    # 13.0f

    .line 744
    .line 745
    const/high16 v13, 0x41880000    # 17.0f

    .line 746
    .line 747
    const v14, 0x416570a4    # 14.34f

    .line 748
    .line 749
    .line 750
    const v15, 0x413ab852    # 11.67f

    .line 751
    .line 752
    .line 753
    const/high16 v16, 0x41500000    # 13.0f

    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, 0x41900000    # 18.0f

    .line 762
    .line 763
    const/high16 v2, 0x41700000    # 15.0f

    .line 764
    .line 765
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v0, 0x40400000    # 3.0f

    .line 769
    .line 770
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, -0x40828f5c    # -0.99f

    .line 774
    .line 775
    .line 776
    const/4 v2, 0x0

    .line 777
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v18, 0x41700000    # 15.0f

    .line 781
    .line 782
    const v13, 0x404ccccd    # 3.2f

    .line 783
    .line 784
    .line 785
    const v14, 0x418251ec    # 16.29f

    .line 786
    .line 787
    .line 788
    const v15, 0x40c9999a    # 6.3f

    .line 789
    .line 790
    .line 791
    const/high16 v16, 0x41700000    # 15.0f

    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x3fa51eb8    # 1.29f

    .line 797
    .line 798
    .line 799
    const/high16 v2, 0x40000000    # 2.0f

    .line 800
    .line 801
    const/high16 v4, 0x40c00000    # 6.0f

    .line 802
    .line 803
    const v6, 0x40b9999a    # 5.8f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const/high16 v0, 0x41900000    # 18.0f

    .line 810
    .line 811
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    const/16 v16, 0x3800

    .line 822
    .line 823
    const/16 v17, 0x0

    .line 824
    .line 825
    const/high16 v6, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/4 v7, 0x0

    .line 828
    const/high16 v12, 0x3f800000    # 1.0f

    .line 829
    .line 830
    const/4 v13, 0x0

    .line 831
    const/4 v14, 0x0

    .line 832
    const/4 v15, 0x0

    .line 833
    const-string v4, ""

    .line 834
    .line 835
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    sput-object v0, Landroidx/compose/material/icons/twotone/PeopleAltKt;->_peopleAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 844
    .line 845
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    return-object v0
.end method
