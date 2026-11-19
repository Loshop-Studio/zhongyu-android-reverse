.class public final Landroidx/compose/material/icons/twotone/FaxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_fax",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Fax",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFax",
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
        "SMAP\nFax.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fax.kt\nandroidx/compose/material/icons/twotone/FaxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,160:1\n212#2,12:161\n233#2,18:174\n253#2:211\n233#2,18:212\n253#2:249\n233#2,18:250\n253#2:287\n233#2,18:288\n253#2:325\n233#2,18:326\n253#2:363\n233#2,18:364\n253#2:401\n233#2,18:402\n253#2:439\n233#2,18:440\n253#2:477\n233#2,18:478\n253#2:515\n174#3:173\n705#4,2:192\n717#4,2:194\n719#4,11:200\n705#4,2:230\n717#4,2:232\n719#4,11:238\n705#4,2:268\n717#4,2:270\n719#4,11:276\n705#4,2:306\n717#4,2:308\n719#4,11:314\n705#4,2:344\n717#4,2:346\n719#4,11:352\n705#4,2:382\n717#4,2:384\n719#4,11:390\n705#4,2:420\n717#4,2:422\n719#4,11:428\n705#4,2:458\n717#4,2:460\n719#4,11:466\n705#4,2:496\n717#4,2:498\n719#4,11:504\n72#5,4:196\n72#5,4:234\n72#5,4:272\n72#5,4:310\n72#5,4:348\n72#5,4:386\n72#5,4:424\n72#5,4:462\n72#5,4:500\n*S KotlinDebug\n*F\n+ 1 Fax.kt\nandroidx/compose/material/icons/twotone/FaxKt\n*L\n29#1:161,12\n30#1:174,18\n30#1:211\n40#1:212,18\n40#1:249\n47#1:250,18\n47#1:287\n86#1:288,18\n86#1:325\n124#1:326,18\n124#1:363\n130#1:364,18\n130#1:401\n136#1:402,18\n136#1:439\n142#1:440,18\n142#1:477\n148#1:478,18\n148#1:515\n29#1:173\n30#1:192,2\n30#1:194,2\n30#1:200,11\n40#1:230,2\n40#1:232,2\n40#1:238,11\n47#1:268,2\n47#1:270,2\n47#1:276,11\n86#1:306,2\n86#1:308,2\n86#1:314,11\n124#1:344,2\n124#1:346,2\n124#1:352,11\n130#1:382,2\n130#1:384,2\n130#1:390,11\n136#1:420,2\n136#1:422,2\n136#1:428,11\n142#1:458,2\n142#1:460,2\n142#1:466,11\n148#1:496,2\n148#1:498,2\n148#1:504,11\n30#1:196,4\n40#1:234,4\n47#1:272,4\n86#1:310,4\n124#1:348,4\n130#1:386,4\n136#1:424,4\n142#1:462,4\n148#1:500,4\n*E\n"
    }
.end annotation


# static fields
.field private static _fax:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFax(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FaxKt;->_fax:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Fax"

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v21, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v24, 0x3ee66666    # 0.45f

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x3f0ccccd    # 0.55f

    .line 106
    .line 107
    .line 108
    const v23, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x4119999a    # -0.45f

    .line 117
    .line 118
    .line 119
    const/high16 v6, -0x40800000    # -1.0f

    .line 120
    .line 121
    const/high16 v7, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, -0x3f200000    # -7.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x40a00000    # 5.0f

    .line 132
    .line 133
    const/high16 v26, 0x41200000    # 10.0f

    .line 134
    .line 135
    const/high16 v21, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v22, 0x41273333    # 10.45f

    .line 138
    .line 139
    .line 140
    const v23, 0x40b1999a    # 5.55f

    .line 141
    .line 142
    .line 143
    const/high16 v24, 0x41200000    # 10.0f

    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const/16 v16, 0x3800

    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const v6, 0x3e99999a    # 0.3f

    .line 160
    .line 161
    .line 162
    const v8, 0x3e99999a    # 0.3f

    .line 163
    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    const/high16 v9, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/high16 v12, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const/4 v14, 0x0

    .line 172
    const/4 v15, 0x0

    .line 173
    const-string v4, ""

    .line 174
    .line 175
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 176
    .line 177
    .line 178
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 183
    .line 184
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    const/4 v2, 0x0

    .line 189
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x41200000    # 10.0f

    .line 206
    .line 207
    const/high16 v6, 0x40c00000    # 6.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40c00000    # 6.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v4, 0x40400000    # 3.0f

    .line 218
    .line 219
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v4, -0x3f400000    # -6.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    const v6, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const-string v4, ""

    .line 239
    .line 240
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 241
    .line 242
    .line 243
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 248
    .line 249
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    const/4 v2, 0x0

    .line 254
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41980000    # 19.0f

    .line 271
    .line 272
    const/high16 v6, 0x41300000    # 11.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41000000    # 8.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40e00000    # 7.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x41400000    # 12.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, -0x3f400000    # -6.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, 0x41980000    # 19.0f

    .line 298
    .line 299
    const/high16 v26, 0x41300000    # 11.0f

    .line 300
    .line 301
    const/high16 v21, 0x41a00000    # 20.0f

    .line 302
    .line 303
    const v22, 0x41373333    # 11.45f

    .line 304
    .line 305
    .line 306
    const v23, 0x419c6666    # 19.55f

    .line 307
    .line 308
    .line 309
    const/high16 v24, 0x41300000    # 11.0f

    .line 310
    .line 311
    move-object/from16 v20, v2

    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41500000    # 13.0f

    .line 320
    .line 321
    const/high16 v6, 0x41880000    # 17.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x41100000    # 9.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, -0x3f600000    # -5.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, 0x40800000    # 4.0f

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v4, 0x41880000    # 17.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x41700000    # 15.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v25, -0x40800000    # -1.0f

    .line 355
    .line 356
    const/high16 v26, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v21, -0x40f33333    # -0.55f

    .line 359
    .line 360
    .line 361
    const/16 v22, 0x0

    .line 362
    .line 363
    const/high16 v23, -0x40800000    # -1.0f

    .line 364
    .line 365
    const v24, -0x4119999a    # -0.45f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x3ee66666    # 0.45f

    .line 372
    .line 373
    .line 374
    const/high16 v6, -0x40800000    # -1.0f

    .line 375
    .line 376
    const/high16 v7, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v4, 0x4178cccd    # 15.55f

    .line 387
    .line 388
    .line 389
    const/high16 v6, 0x41700000    # 15.0f

    .line 390
    .line 391
    const/high16 v7, 0x41880000    # 17.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41600000    # 14.0f

    .line 400
    .line 401
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x3ee66666    # 0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v6, -0x40800000    # -1.0f

    .line 411
    .line 412
    const/high16 v7, 0x3f800000    # 1.0f

    .line 413
    .line 414
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v6, 0x3f800000    # 1.0f

    .line 418
    .line 419
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v4, 0x4178cccd    # 15.55f

    .line 423
    .line 424
    .line 425
    const/high16 v6, 0x41600000    # 14.0f

    .line 426
    .line 427
    const/high16 v7, 0x41700000    # 15.0f

    .line 428
    .line 429
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41880000    # 17.0f

    .line 436
    .line 437
    const/high16 v6, 0x41900000    # 18.0f

    .line 438
    .line 439
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x3ee66666    # 0.45f

    .line 446
    .line 447
    .line 448
    const/high16 v6, -0x40800000    # -1.0f

    .line 449
    .line 450
    const/high16 v7, 0x3f800000    # 1.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v6, 0x3f800000    # 1.0f

    .line 456
    .line 457
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, 0x41946666    # 18.55f

    .line 461
    .line 462
    .line 463
    const/high16 v6, 0x41880000    # 17.0f

    .line 464
    .line 465
    const/high16 v7, 0x41900000    # 18.0f

    .line 466
    .line 467
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x41600000    # 14.0f

    .line 474
    .line 475
    const/high16 v6, 0x41900000    # 18.0f

    .line 476
    .line 477
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, 0x3ee66666    # 0.45f

    .line 484
    .line 485
    .line 486
    const/high16 v6, -0x40800000    # -1.0f

    .line 487
    .line 488
    const/high16 v7, 0x3f800000    # 1.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v4, 0x41946666    # 18.55f

    .line 499
    .line 500
    .line 501
    const/high16 v6, 0x41600000    # 14.0f

    .line 502
    .line 503
    const/high16 v7, 0x41900000    # 18.0f

    .line 504
    .line 505
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const v6, 0x3e99999a    # 0.3f

    .line 516
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
    const/high16 v4, 0x41980000    # 19.0f

    .line 552
    .line 553
    const/high16 v6, 0x41100000    # 9.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, -0x40800000    # -1.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x40800000    # 4.0f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x41000000    # 8.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x40a00000    # 5.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v4, 0x40e70a3d    # 7.22f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v25, 0x40a00000    # 5.0f

    .line 585
    .line 586
    const/high16 v26, 0x41000000    # 8.0f

    .line 587
    .line 588
    const v21, 0x40d570a4    # 6.67f

    .line 589
    .line 590
    .line 591
    const v22, 0x41063d71    # 8.39f

    .line 592
    .line 593
    .line 594
    const v23, 0x40bc7ae1    # 5.89f

    .line 595
    .line 596
    .line 597
    const/high16 v24, 0x41000000    # 8.0f

    .line 598
    .line 599
    move-object/from16 v20, v2

    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 605
    .line 606
    const/high16 v26, 0x40400000    # 3.0f

    .line 607
    .line 608
    const v21, -0x402b851f    # -1.66f

    .line 609
    .line 610
    .line 611
    const/16 v22, 0x0

    .line 612
    .line 613
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 614
    .line 615
    const v24, 0x3fab851f    # 1.34f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v4, 0x40e00000    # 7.0f

    .line 622
    .line 623
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v25, 0x40400000    # 3.0f

    .line 627
    .line 628
    const/16 v21, 0x0

    .line 629
    .line 630
    const v22, 0x3fd47ae1    # 1.66f

    .line 631
    .line 632
    .line 633
    const v23, 0x3fab851f    # 1.34f

    .line 634
    .line 635
    .line 636
    const/high16 v24, 0x40400000    # 3.0f

    .line 637
    .line 638
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v25, 0x400e147b    # 2.22f

    .line 642
    .line 643
    .line 644
    const/high16 v26, -0x40800000    # -1.0f

    .line 645
    .line 646
    const v21, 0x3f63d70a    # 0.89f

    .line 647
    .line 648
    .line 649
    const/16 v22, 0x0

    .line 650
    .line 651
    const v23, 0x3fd5c28f    # 1.67f

    .line 652
    .line 653
    .line 654
    const v24, -0x413851ec    # -0.39f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, 0x41b00000    # 22.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v4, -0x3f000000    # -8.0f

    .line 666
    .line 667
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v25, 0x41980000    # 19.0f

    .line 671
    .line 672
    const/high16 v26, 0x41100000    # 9.0f

    .line 673
    .line 674
    const/high16 v21, 0x41b00000    # 22.0f

    .line 675
    .line 676
    const v22, 0x412570a4    # 10.34f

    .line 677
    .line 678
    .line 679
    const v23, 0x41a547ae    # 20.66f

    .line 680
    .line 681
    .line 682
    const/high16 v24, 0x41100000    # 9.0f

    .line 683
    .line 684
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x40c00000    # 6.0f

    .line 691
    .line 692
    const/high16 v6, 0x41900000    # 18.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v25, -0x40800000    # -1.0f

    .line 698
    .line 699
    const/high16 v26, 0x3f800000    # 1.0f

    .line 700
    .line 701
    const/16 v21, 0x0

    .line 702
    .line 703
    const v22, 0x3f0ccccd    # 0.55f

    .line 704
    .line 705
    .line 706
    const v23, -0x4119999a    # -0.45f

    .line 707
    .line 708
    .line 709
    const/high16 v24, 0x3f800000    # 1.0f

    .line 710
    .line 711
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v4, -0x4119999a    # -0.45f

    .line 715
    .line 716
    .line 717
    const/high16 v6, -0x40800000    # -1.0f

    .line 718
    .line 719
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v4, -0x3f200000    # -7.0f

    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v25, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v26, -0x40800000    # -1.0f

    .line 730
    .line 731
    const v22, -0x40f33333    # -0.55f

    .line 732
    .line 733
    .line 734
    const v23, 0x3ee66666    # 0.45f

    .line 735
    .line 736
    .line 737
    const/high16 v24, -0x40800000    # -1.0f

    .line 738
    .line 739
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v4, 0x3ee66666    # 0.45f

    .line 743
    .line 744
    .line 745
    const/high16 v6, 0x3f800000    # 1.0f

    .line 746
    .line 747
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v4, 0x41900000    # 18.0f

    .line 751
    .line 752
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v4, 0x41200000    # 10.0f

    .line 759
    .line 760
    const/high16 v6, 0x40c00000    # 6.0f

    .line 761
    .line 762
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v4, 0x40c00000    # 6.0f

    .line 766
    .line 767
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v4, 0x40400000    # 3.0f

    .line 771
    .line 772
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v4, -0x3f400000    # -6.0f

    .line 776
    .line 777
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v4, 0x40c00000    # 6.0f

    .line 781
    .line 782
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v4, 0x41a00000    # 20.0f

    .line 789
    .line 790
    const/high16 v6, 0x41900000    # 18.0f

    .line 791
    .line 792
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v4, 0x41000000    # 8.0f

    .line 796
    .line 797
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v4, -0x3f200000    # -7.0f

    .line 801
    .line 802
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v4, 0x41300000    # 11.0f

    .line 806
    .line 807
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v26, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const v21, 0x3f0ccccd    # 0.55f

    .line 813
    .line 814
    .line 815
    const/16 v22, 0x0

    .line 816
    .line 817
    const/high16 v23, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const v24, 0x3ee66666    # 0.45f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v4, 0x41900000    # 18.0f

    .line 826
    .line 827
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    const/high16 v6, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/high16 v8, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/4 v7, 0x0

    .line 842
    const-string v4, ""

    .line 843
    .line 844
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 845
    .line 846
    .line 847
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 852
    .line 853
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 854
    .line 855
    .line 856
    move-result-wide v6

    .line 857
    const/4 v2, 0x0

    .line 858
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 862
    .line 863
    .line 864
    move-result v10

    .line 865
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 866
    .line 867
    .line 868
    move-result v11

    .line 869
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 872
    .line 873
    .line 874
    const/high16 v4, 0x41500000    # 13.0f

    .line 875
    .line 876
    const/high16 v6, 0x41700000    # 15.0f

    .line 877
    .line 878
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/4 v4, 0x0

    .line 882
    const/high16 v6, -0x40800000    # -1.0f

    .line 883
    .line 884
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v26, 0x40000000    # 2.0f

    .line 888
    .line 889
    const/16 v27, 0x0

    .line 890
    .line 891
    const/high16 v21, 0x3f800000    # 1.0f

    .line 892
    .line 893
    const/high16 v22, 0x3f800000    # 1.0f

    .line 894
    .line 895
    const/16 v23, 0x0

    .line 896
    .line 897
    const/16 v24, 0x1

    .line 898
    .line 899
    const/16 v25, 0x1

    .line 900
    .line 901
    move-object/from16 v20, v2

    .line 902
    .line 903
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v26, -0x40000000    # -2.0f

    .line 907
    .line 908
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    const/high16 v6, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/4 v7, 0x0

    .line 918
    const-string v4, ""

    .line 919
    .line 920
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 921
    .line 922
    .line 923
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 928
    .line 929
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 930
    .line 931
    .line 932
    move-result-wide v6

    .line 933
    const/4 v2, 0x0

    .line 934
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 938
    .line 939
    .line 940
    move-result v10

    .line 941
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 942
    .line 943
    .line 944
    move-result v11

    .line 945
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 948
    .line 949
    .line 950
    const/high16 v4, 0x41500000    # 13.0f

    .line 951
    .line 952
    const/high16 v6, 0x41900000    # 18.0f

    .line 953
    .line 954
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/4 v4, 0x0

    .line 958
    const/high16 v6, -0x40800000    # -1.0f

    .line 959
    .line 960
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v26, 0x40000000    # 2.0f

    .line 964
    .line 965
    move-object/from16 v20, v2

    .line 966
    .line 967
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const/high16 v26, -0x40000000    # -2.0f

    .line 971
    .line 972
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    const/high16 v6, 0x3f800000    # 1.0f

    .line 980
    .line 981
    const/4 v7, 0x0

    .line 982
    const-string v4, ""

    .line 983
    .line 984
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 985
    .line 986
    .line 987
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 992
    .line 993
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 994
    .line 995
    .line 996
    move-result-wide v6

    .line 997
    const/4 v2, 0x0

    .line 998
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1002
    .line 1003
    .line 1004
    move-result v10

    .line 1005
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1006
    .line 1007
    .line 1008
    move-result v11

    .line 1009
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    const/high16 v4, 0x41800000    # 16.0f

    .line 1015
    .line 1016
    const/high16 v6, 0x41700000    # 15.0f

    .line 1017
    .line 1018
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const/4 v4, 0x0

    .line 1022
    const/high16 v6, -0x40800000    # -1.0f

    .line 1023
    .line 1024
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const/high16 v26, 0x40000000    # 2.0f

    .line 1028
    .line 1029
    move-object/from16 v20, v2

    .line 1030
    .line 1031
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const/high16 v26, -0x40000000    # -2.0f

    .line 1035
    .line 1036
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1044
    .line 1045
    const/4 v7, 0x0

    .line 1046
    const-string v4, ""

    .line 1047
    .line 1048
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1049
    .line 1050
    .line 1051
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1052
    .line 1053
    .line 1054
    move-result v3

    .line 1055
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1056
    .line 1057
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v6

    .line 1061
    const/4 v2, 0x0

    .line 1062
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1066
    .line 1067
    .line 1068
    move-result v10

    .line 1069
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1076
    .line 1077
    .line 1078
    const/high16 v4, 0x41800000    # 16.0f

    .line 1079
    .line 1080
    const/high16 v6, 0x41900000    # 18.0f

    .line 1081
    .line 1082
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/4 v4, 0x0

    .line 1086
    const/high16 v6, -0x40800000    # -1.0f

    .line 1087
    .line 1088
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1089
    .line 1090
    .line 1091
    const/high16 v26, 0x40000000    # 2.0f

    .line 1092
    .line 1093
    move-object/from16 v20, v2

    .line 1094
    .line 1095
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const/high16 v26, -0x40000000    # -2.0f

    .line 1099
    .line 1100
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1108
    .line 1109
    const/4 v7, 0x0

    .line 1110
    const-string v4, ""

    .line 1111
    .line 1112
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1113
    .line 1114
    .line 1115
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1116
    .line 1117
    .line 1118
    move-result v3

    .line 1119
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1120
    .line 1121
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1122
    .line 1123
    .line 1124
    move-result-wide v6

    .line 1125
    const/4 v0, 0x0

    .line 1126
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1130
    .line 1131
    .line 1132
    move-result v10

    .line 1133
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1134
    .line 1135
    .line 1136
    move-result v11

    .line 1137
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1140
    .line 1141
    .line 1142
    const/high16 v2, 0x41400000    # 12.0f

    .line 1143
    .line 1144
    const/high16 v4, 0x41100000    # 9.0f

    .line 1145
    .line 1146
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const/high16 v2, 0x40800000    # 4.0f

    .line 1150
    .line 1151
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1155
    .line 1156
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    const/high16 v2, -0x3f800000    # -4.0f

    .line 1160
    .line 1161
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1172
    .line 1173
    const/4 v7, 0x0

    .line 1174
    const-string v4, ""

    .line 1175
    .line 1176
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    sput-object v0, Landroidx/compose/material/icons/twotone/FaxKt;->_fax:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1185
    .line 1186
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    return-object v0
.end method
