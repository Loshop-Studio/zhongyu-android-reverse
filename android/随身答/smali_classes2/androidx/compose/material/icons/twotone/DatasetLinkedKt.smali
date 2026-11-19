.class public final Landroidx/compose/material/icons/twotone/DatasetLinkedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_datasetLinked",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DatasetLinked",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDatasetLinked",
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
        "SMAP\nDatasetLinked.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatasetLinked.kt\nandroidx/compose/material/icons/twotone/DatasetLinkedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,139:1\n212#2,12:140\n233#2,18:153\n253#2:190\n233#2,18:191\n253#2:228\n233#2,18:229\n253#2:266\n233#2,18:267\n253#2:304\n233#2,18:305\n253#2:342\n233#2,18:343\n253#2:380\n233#2,18:381\n253#2:418\n233#2,18:419\n253#2:456\n174#3:152\n705#4,2:171\n717#4,2:173\n719#4,11:179\n705#4,2:209\n717#4,2:211\n719#4,11:217\n705#4,2:247\n717#4,2:249\n719#4,11:255\n705#4,2:285\n717#4,2:287\n719#4,11:293\n705#4,2:323\n717#4,2:325\n719#4,11:331\n705#4,2:361\n717#4,2:363\n719#4,11:369\n705#4,2:399\n717#4,2:401\n719#4,11:407\n705#4,2:437\n717#4,2:439\n719#4,11:445\n72#5,4:175\n72#5,4:213\n72#5,4:251\n72#5,4:289\n72#5,4:327\n72#5,4:365\n72#5,4:403\n72#5,4:441\n*S KotlinDebug\n*F\n+ 1 DatasetLinked.kt\nandroidx/compose/material/icons/twotone/DatasetLinkedKt\n*L\n29#1:140,12\n30#1:153,18\n30#1:190\n57#1:191,18\n57#1:228\n65#1:229,18\n65#1:266\n83#1:267,18\n83#1:304\n90#1:305,18\n90#1:342\n97#1:343,18\n97#1:380\n111#1:381,18\n111#1:418\n125#1:419,18\n125#1:456\n29#1:152\n30#1:171,2\n30#1:173,2\n30#1:179,11\n57#1:209,2\n57#1:211,2\n57#1:217,11\n65#1:247,2\n65#1:249,2\n65#1:255,11\n83#1:285,2\n83#1:287,2\n83#1:293,11\n90#1:323,2\n90#1:325,2\n90#1:331,11\n97#1:361,2\n97#1:363,2\n97#1:369,11\n111#1:399,2\n111#1:401,2\n111#1:407,11\n125#1:437,2\n125#1:439,2\n125#1:445,11\n30#1:175,4\n57#1:213,4\n65#1:251,4\n83#1:289,4\n90#1:327,4\n97#1:365,4\n111#1:403,4\n125#1:441,4\n*E\n"
    }
.end annotation


# static fields
.field private static _datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDatasetLinked(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DatasetLinkedKt;->_datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DatasetLinked"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x41600000    # 14.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const v4, 0x4045c28f    # 3.09f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v25, 0x41000000    # 8.0f

    .line 87
    .line 88
    const/high16 v26, 0x41900000    # 18.0f

    .line 89
    .line 90
    const v21, 0x4100a3d7    # 8.04f

    .line 91
    .line 92
    .line 93
    const v22, 0x41955c29    # 18.67f

    .line 94
    .line 95
    .line 96
    const/high16 v23, 0x41000000    # 8.0f

    .line 97
    .line 98
    const v24, 0x4192b852    # 18.34f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x3db851ec    # 0.09f

    .line 107
    .line 108
    .line 109
    const/high16 v6, -0x40800000    # -1.0f

    .line 110
    .line 111
    const v7, 0x3d23d70a    # 0.04f

    .line 112
    .line 113
    .line 114
    const v8, -0x40d47ae1    # -0.67f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40e00000    # 7.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, -0x3f800000    # -4.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x406c28f6    # 3.69f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, 0x4053d70a    # 3.31f

    .line 137
    .line 138
    .line 139
    const/high16 v26, -0x40800000    # -1.0f

    .line 140
    .line 141
    const v21, 0x3f733333    # 0.95f

    .line 142
    .line 143
    .line 144
    const v22, -0x40deb852    # -0.63f

    .line 145
    .line 146
    .line 147
    const v23, 0x4005c28f    # 2.09f

    .line 148
    .line 149
    .line 150
    const/high16 v24, -0x40800000    # -1.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x40a00000    # 5.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v4, 0x41300000    # 11.0f

    .line 170
    .line 171
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x40e00000    # 7.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x40800000    # 4.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x41300000    # 11.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41500000    # 13.0f

    .line 196
    .line 197
    const/high16 v6, 0x41300000    # 11.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40e00000    # 7.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x40800000    # 4.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41500000    # 13.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/16 v16, 0x3800

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const v6, 0x3e99999a    # 0.3f

    .line 232
    .line 233
    .line 234
    const v8, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/high16 v9, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v12, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v4, ""

    .line 246
    .line 247
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    const/4 v2, 0x0

    .line 261
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41880000    # 17.0f

    .line 278
    .line 279
    const/high16 v6, 0x40e00000    # 7.0f

    .line 280
    .line 281
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x3f8b851f    # 1.09f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v25, 0x40266666    # 2.6f

    .line 291
    .line 292
    .line 293
    const/high16 v26, -0x3f800000    # -4.0f

    .line 294
    .line 295
    const v21, 0x3e8f5c29    # 0.28f

    .line 296
    .line 297
    .line 298
    const v22, -0x402a3d71    # -1.67f

    .line 299
    .line 300
    .line 301
    const v23, 0x3f9eb852    # 1.24f

    .line 302
    .line 303
    .line 304
    const v24, -0x3fb9999a    # -3.1f

    .line 305
    .line 306
    .line 307
    move-object/from16 v20, v2

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x40e00000    # 7.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41880000    # 17.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/high16 v6, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/high16 v8, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/4 v7, 0x0

    .line 334
    const-string v4, ""

    .line 335
    .line 336
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 337
    .line 338
    .line 339
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 344
    .line 345
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 346
    .line 347
    .line 348
    move-result-wide v6

    .line 349
    const/4 v2, 0x0

    .line 350
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x41980000    # 19.0f

    .line 367
    .line 368
    const/high16 v6, 0x40a00000    # 5.0f

    .line 369
    .line 370
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x40a00000    # 5.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x41600000    # 14.0f

    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v4, 0x40e00000    # 7.0f

    .line 384
    .line 385
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x3f800000    # 1.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v25, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const v26, 0x3db851ec    # 0.09f

    .line 396
    .line 397
    .line 398
    const v21, 0x3eae147b    # 0.34f

    .line 399
    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    const v23, 0x3f2b851f    # 0.67f

    .line 404
    .line 405
    .line 406
    const v24, 0x3d23d70a    # 0.04f

    .line 407
    .line 408
    .line 409
    move-object/from16 v20, v2

    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x40a00000    # 5.0f

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, -0x40000000    # -2.0f

    .line 420
    .line 421
    const/high16 v26, -0x40000000    # -2.0f

    .line 422
    .line 423
    const/16 v21, 0x0

    .line 424
    .line 425
    const v22, -0x40733333    # -1.1f

    .line 426
    .line 427
    .line 428
    const v23, -0x4099999a    # -0.9f

    .line 429
    .line 430
    .line 431
    const/high16 v24, -0x40000000    # -2.0f

    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v25, 0x40400000    # 3.0f

    .line 440
    .line 441
    const/high16 v26, 0x40a00000    # 5.0f

    .line 442
    .line 443
    const v21, 0x4079999a    # 3.9f

    .line 444
    .line 445
    .line 446
    const/high16 v22, 0x40400000    # 3.0f

    .line 447
    .line 448
    const/high16 v23, 0x40400000    # 3.0f

    .line 449
    .line 450
    const v24, 0x4079999a    # 3.9f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x41600000    # 14.0f

    .line 457
    .line 458
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v25, 0x40000000    # 2.0f

    .line 462
    .line 463
    const/high16 v26, 0x40000000    # 2.0f

    .line 464
    .line 465
    const/16 v21, 0x0

    .line 466
    .line 467
    const v22, 0x3f8ccccd    # 1.1f

    .line 468
    .line 469
    .line 470
    const v23, 0x3f666666    # 0.9f

    .line 471
    .line 472
    .line 473
    const/high16 v24, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v4, 0x4073d70a    # 3.81f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v25, -0x40c7ae14    # -0.72f

    .line 485
    .line 486
    .line 487
    const/high16 v26, -0x40000000    # -2.0f

    .line 488
    .line 489
    const v21, -0x414ccccd    # -0.35f

    .line 490
    .line 491
    .line 492
    const v22, -0x40e3d70a    # -0.61f

    .line 493
    .line 494
    .line 495
    const v23, -0x40e66666    # -0.6f

    .line 496
    .line 497
    .line 498
    const v24, -0x405c28f6    # -1.28f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v4, 0x40a00000    # 5.0f

    .line 505
    .line 506
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v7, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 529
    .line 530
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 531
    .line 532
    .line 533
    move-result-wide v6

    .line 534
    const/4 v2, 0x0

    .line 535
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 539
    .line 540
    .line 541
    move-result v10

    .line 542
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 549
    .line 550
    .line 551
    const/high16 v4, 0x40e00000    # 7.0f

    .line 552
    .line 553
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v4, 0x40800000    # 4.0f

    .line 557
    .line 558
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, -0x3f800000    # -4.0f

    .line 565
    .line 566
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    const/high16 v6, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    const-string v4, ""

    .line 580
    .line 581
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 582
    .line 583
    .line 584
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 585
    .line 586
    .line 587
    move-result v3

    .line 588
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 589
    .line 590
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 591
    .line 592
    .line 593
    move-result-wide v6

    .line 594
    const/4 v2, 0x0

    .line 595
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 599
    .line 600
    .line 601
    move-result v10

    .line 602
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 603
    .line 604
    .line 605
    move-result v11

    .line 606
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x41500000    # 13.0f

    .line 612
    .line 613
    const/high16 v6, 0x40e00000    # 7.0f

    .line 614
    .line 615
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x40800000    # 4.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v4, -0x3f800000    # -4.0f

    .line 627
    .line 628
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    const/high16 v6, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v7, 0x0

    .line 641
    const-string v4, ""

    .line 642
    .line 643
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 644
    .line 645
    .line 646
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 651
    .line 652
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 653
    .line 654
    .line 655
    move-result-wide v6

    .line 656
    const/4 v2, 0x0

    .line 657
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 661
    .line 662
    .line 663
    move-result v10

    .line 664
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 671
    .line 672
    .line 673
    const/high16 v4, 0x41800000    # 16.0f

    .line 674
    .line 675
    const/high16 v6, 0x41a00000    # 20.0f

    .line 676
    .line 677
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v4, -0x40000000    # -2.0f

    .line 681
    .line 682
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v25, -0x40000000    # -2.0f

    .line 686
    .line 687
    const v21, -0x40733333    # -1.1f

    .line 688
    .line 689
    .line 690
    const/16 v22, 0x0

    .line 691
    .line 692
    const/high16 v23, -0x40000000    # -2.0f

    .line 693
    .line 694
    const v24, -0x4099999a    # -0.9f

    .line 695
    .line 696
    .line 697
    move-object/from16 v20, v2

    .line 698
    .line 699
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v4, 0x3f666666    # 0.9f

    .line 703
    .line 704
    .line 705
    const/high16 v6, -0x40000000    # -2.0f

    .line 706
    .line 707
    const/high16 v7, 0x40000000    # 2.0f

    .line 708
    .line 709
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v4, 0x40000000    # 2.0f

    .line 713
    .line 714
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v4, -0x40000000    # -2.0f

    .line 718
    .line 719
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v25, -0x3f800000    # -4.0f

    .line 726
    .line 727
    const/high16 v26, 0x40800000    # 4.0f

    .line 728
    .line 729
    const v21, -0x3ff28f5c    # -2.21f

    .line 730
    .line 731
    .line 732
    const/high16 v23, -0x3f800000    # -4.0f

    .line 733
    .line 734
    const v24, 0x3fe51eb8    # 1.79f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v25, 0x40800000    # 4.0f

    .line 741
    .line 742
    const/16 v21, 0x0

    .line 743
    .line 744
    const v22, 0x400d70a4    # 2.21f

    .line 745
    .line 746
    .line 747
    const v23, 0x3fe51eb8    # 1.79f

    .line 748
    .line 749
    .line 750
    const/high16 v24, 0x40800000    # 4.0f

    .line 751
    .line 752
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x40000000    # 2.0f

    .line 756
    .line 757
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v4, 0x41a00000    # 20.0f

    .line 761
    .line 762
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/high16 v6, 0x3f800000    # 1.0f

    .line 773
    .line 774
    const/4 v7, 0x0

    .line 775
    const-string v4, ""

    .line 776
    .line 777
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 778
    .line 779
    .line 780
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 785
    .line 786
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 787
    .line 788
    .line 789
    move-result-wide v6

    .line 790
    const/4 v2, 0x0

    .line 791
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 795
    .line 796
    .line 797
    move-result v10

    .line 798
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 805
    .line 806
    .line 807
    const/high16 v4, 0x41a00000    # 20.0f

    .line 808
    .line 809
    const/high16 v6, 0x41600000    # 14.0f

    .line 810
    .line 811
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v4, -0x40000000    # -2.0f

    .line 815
    .line 816
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v4, 0x40000000    # 2.0f

    .line 820
    .line 821
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v25, 0x40000000    # 2.0f

    .line 828
    .line 829
    const/high16 v26, 0x40000000    # 2.0f

    .line 830
    .line 831
    const v21, 0x3f8ccccd    # 1.1f

    .line 832
    .line 833
    .line 834
    const/16 v22, 0x0

    .line 835
    .line 836
    const/high16 v23, 0x40000000    # 2.0f

    .line 837
    .line 838
    const v24, 0x3f666666    # 0.9f

    .line 839
    .line 840
    .line 841
    move-object/from16 v20, v2

    .line 842
    .line 843
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v4, -0x4099999a    # -0.9f

    .line 847
    .line 848
    .line 849
    const/high16 v6, -0x40000000    # -2.0f

    .line 850
    .line 851
    const/high16 v7, 0x40000000    # 2.0f

    .line 852
    .line 853
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v4, -0x40000000    # -2.0f

    .line 857
    .line 858
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v4, 0x40000000    # 2.0f

    .line 862
    .line 863
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const/high16 v25, 0x40800000    # 4.0f

    .line 870
    .line 871
    const/high16 v26, -0x3f800000    # -4.0f

    .line 872
    .line 873
    const v21, 0x400d70a4    # 2.21f

    .line 874
    .line 875
    .line 876
    const/high16 v23, 0x40800000    # 4.0f

    .line 877
    .line 878
    const v24, -0x401ae148    # -1.79f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v25, 0x41a00000    # 20.0f

    .line 885
    .line 886
    const/high16 v26, 0x41600000    # 14.0f

    .line 887
    .line 888
    const/high16 v21, 0x41c00000    # 24.0f

    .line 889
    .line 890
    const v22, 0x417ca3d7    # 15.79f

    .line 891
    .line 892
    .line 893
    const v23, 0x41b1ae14    # 22.21f

    .line 894
    .line 895
    .line 896
    const/high16 v24, 0x41600000    # 14.0f

    .line 897
    .line 898
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    const/high16 v6, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/4 v7, 0x0

    .line 911
    const-string v4, ""

    .line 912
    .line 913
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 914
    .line 915
    .line 916
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 921
    .line 922
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 923
    .line 924
    .line 925
    move-result-wide v6

    .line 926
    const/4 v0, 0x0

    .line 927
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 931
    .line 932
    .line 933
    move-result v10

    .line 934
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 935
    .line 936
    .line 937
    move-result v11

    .line 938
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 941
    .line 942
    .line 943
    const/high16 v2, 0x41980000    # 19.0f

    .line 944
    .line 945
    const/high16 v4, 0x41a00000    # 20.0f

    .line 946
    .line 947
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const/4 v2, 0x0

    .line 951
    const/high16 v4, -0x40000000    # -2.0f

    .line 952
    .line 953
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 957
    .line 958
    const/4 v4, 0x0

    .line 959
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/4 v2, 0x0

    .line 966
    const/high16 v4, 0x40000000    # 2.0f

    .line 967
    .line 968
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v4, 0x40a00000    # 5.0f

    .line 972
    .line 973
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    const/high16 v6, 0x3f800000    # 1.0f

    .line 984
    .line 985
    const/4 v7, 0x0

    .line 986
    const-string v4, ""

    .line 987
    .line 988
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    sput-object v0, Landroidx/compose/material/icons/twotone/DatasetLinkedKt;->_datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 997
    .line 998
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    return-object v0
.end method
