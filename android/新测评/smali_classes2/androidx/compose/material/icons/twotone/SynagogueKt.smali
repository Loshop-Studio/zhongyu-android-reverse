.class public final Landroidx/compose/material/icons/twotone/SynagogueKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_synagogue",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Synagogue",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSynagogue",
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
        "SMAP\nSynagogue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synagogue.kt\nandroidx/compose/material/icons/twotone/SynagogueKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,151:1\n212#2,12:152\n233#2,18:165\n253#2:202\n233#2,18:203\n253#2:240\n233#2,18:241\n253#2:278\n233#2,18:279\n253#2:316\n233#2,18:317\n253#2:354\n233#2,18:355\n253#2:392\n233#2,18:393\n253#2:430\n174#3:164\n705#4,2:183\n717#4,2:185\n719#4,11:191\n705#4,2:221\n717#4,2:223\n719#4,11:229\n705#4,2:259\n717#4,2:261\n719#4,11:267\n705#4,2:297\n717#4,2:299\n719#4,11:305\n705#4,2:335\n717#4,2:337\n719#4,11:343\n705#4,2:373\n717#4,2:375\n719#4,11:381\n705#4,2:411\n717#4,2:413\n719#4,11:419\n72#5,4:187\n72#5,4:225\n72#5,4:263\n72#5,4:301\n72#5,4:339\n72#5,4:377\n72#5,4:415\n*S KotlinDebug\n*F\n+ 1 Synagogue.kt\nandroidx/compose/material/icons/twotone/SynagogueKt\n*L\n29#1:152,12\n30#1:165,18\n30#1:202\n39#1:203,18\n39#1:240\n46#1:241,18\n46#1:278\n66#1:279,18\n66#1:316\n75#1:317,18\n75#1:354\n82#1:355,18\n82#1:392\n140#1:393,18\n140#1:430\n29#1:164\n30#1:183,2\n30#1:185,2\n30#1:191,11\n39#1:221,2\n39#1:223,2\n39#1:229,11\n46#1:259,2\n46#1:261,2\n46#1:267,11\n66#1:297,2\n66#1:299,2\n66#1:305,11\n75#1:335,2\n75#1:337,2\n75#1:343,11\n82#1:373,2\n82#1:375,2\n82#1:381,11\n140#1:411,2\n140#1:413,2\n140#1:419,11\n30#1:187,4\n39#1:225,4\n46#1:263,4\n66#1:301,4\n75#1:339,4\n82#1:377,4\n140#1:415,4\n*E\n"
    }
.end annotation


# static fields
.field private static _synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSynagogue(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SynagogueKt;->_synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Synagogue"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const v21, 0x405ccccd    # 3.45f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const/high16 v23, 0x40400000    # 3.0f

    .line 87
    .line 88
    const v24, 0x40ce6666    # 6.45f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40e00000    # 7.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40800000    # 4.0f

    .line 112
    .line 113
    const/high16 v26, 0x40c00000    # 6.0f

    .line 114
    .line 115
    const/high16 v21, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const v22, 0x40ce6666    # 6.45f

    .line 118
    .line 119
    .line 120
    const v23, 0x4091999a    # 4.55f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x40c00000    # 6.0f

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 186
    .line 187
    const/high16 v6, 0x41200000    # 10.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x40000000    # 2.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41100000    # 9.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, -0x40000000    # -2.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    const v6, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const-string v4, ""

    .line 219
    .line 220
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 221
    .line 222
    .line 223
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v6

    .line 233
    const/4 v2, 0x0

    .line 234
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const v4, 0x411eb852    # 9.92f

    .line 251
    .line 252
    .line 253
    const/high16 v6, 0x40e00000    # 7.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41980000    # 19.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40000000    # 2.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, 0x40400000    # 3.0f

    .line 274
    .line 275
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 276
    .line 277
    const/16 v21, 0x0

    .line 278
    .line 279
    const v22, -0x402ccccd    # -1.65f

    .line 280
    .line 281
    .line 282
    const v23, 0x3faccccd    # 1.35f

    .line 283
    .line 284
    .line 285
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 286
    .line 287
    move-object/from16 v20, v2

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v26, 0x40400000    # 3.0f

    .line 293
    .line 294
    const v21, 0x3fd33333    # 1.65f

    .line 295
    .line 296
    .line 297
    const/16 v22, 0x0

    .line 298
    .line 299
    const/high16 v23, 0x40400000    # 3.0f

    .line 300
    .line 301
    const v24, 0x3faccccd    # 1.35f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40400000    # 3.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x40000000    # 2.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x411eb852    # 9.92f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v4, -0x3f76b852    # -4.29f

    .line 324
    .line 325
    .line 326
    const/high16 v6, -0x3f600000    # -5.0f

    .line 327
    .line 328
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x411eb852    # 9.92f

    .line 332
    .line 333
    .line 334
    const/high16 v6, 0x40e00000    # 7.0f

    .line 335
    .line 336
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x41580000    # 13.5f

    .line 343
    .line 344
    const/high16 v6, 0x41200000    # 10.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, -0x40400000    # -1.5f

    .line 350
    .line 351
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    const v22, 0x3f547ae1    # 0.83f

    .line 356
    .line 357
    .line 358
    const v23, -0x40d47ae1    # -0.67f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, -0x40d47ae1    # -0.67f

    .line 367
    .line 368
    .line 369
    const/high16 v6, -0x40400000    # -1.5f

    .line 370
    .line 371
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x3f2b851f    # 0.67f

    .line 375
    .line 376
    .line 377
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 378
    .line 379
    const/high16 v7, -0x40400000    # -1.5f

    .line 380
    .line 381
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v4, 0x4112b852    # 9.17f

    .line 385
    .line 386
    .line 387
    const/high16 v6, 0x41580000    # 13.5f

    .line 388
    .line 389
    const/high16 v7, 0x41200000    # 10.0f

    .line 390
    .line 391
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const v6, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const/4 v7, 0x0

    .line 405
    const-string v4, ""

    .line 406
    .line 407
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 415
    .line 416
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 417
    .line 418
    .line 419
    move-result-wide v6

    .line 420
    const/4 v2, 0x0

    .line 421
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 429
    .line 430
    .line 431
    move-result v11

    .line 432
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x41a00000    # 20.0f

    .line 438
    .line 439
    const/high16 v6, 0x40c00000    # 6.0f

    .line 440
    .line 441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v25, -0x40800000    # -1.0f

    .line 445
    .line 446
    const/high16 v26, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const v21, -0x40f33333    # -0.55f

    .line 449
    .line 450
    .line 451
    const/16 v22, 0x0

    .line 452
    .line 453
    const/high16 v23, -0x40800000    # -1.0f

    .line 454
    .line 455
    const v24, 0x3ee66666    # 0.45f

    .line 456
    .line 457
    .line 458
    move-object/from16 v20, v2

    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x3f800000    # 1.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40000000    # 2.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40e00000    # 7.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v25, 0x41a00000    # 20.0f

    .line 479
    .line 480
    const/high16 v26, 0x40c00000    # 6.0f

    .line 481
    .line 482
    const/high16 v21, 0x41a80000    # 21.0f

    .line 483
    .line 484
    const v22, 0x40ce6666    # 6.45f

    .line 485
    .line 486
    .line 487
    const v23, 0x41a46666    # 20.55f

    .line 488
    .line 489
    .line 490
    const/high16 v24, 0x40c00000    # 6.0f

    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const v6, 0x3e99999a    # 0.3f

    .line 503
    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    const/4 v2, 0x0

    .line 522
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41200000    # 10.0f

    .line 539
    .line 540
    const/high16 v6, 0x41980000    # 19.0f

    .line 541
    .line 542
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v4, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x41100000    # 9.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v4, -0x40000000    # -2.0f

    .line 556
    .line 557
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const v6, 0x3e99999a    # 0.3f

    .line 568
    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 581
    .line 582
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 583
    .line 584
    .line 585
    move-result-wide v6

    .line 586
    const/4 v2, 0x0

    .line 587
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 591
    .line 592
    .line 593
    move-result v10

    .line 594
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 601
    .line 602
    .line 603
    const/high16 v4, 0x41a00000    # 20.0f

    .line 604
    .line 605
    const/high16 v6, 0x40800000    # 4.0f

    .line 606
    .line 607
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 611
    .line 612
    const/high16 v26, 0x40400000    # 3.0f

    .line 613
    .line 614
    const v21, -0x402b851f    # -1.66f

    .line 615
    .line 616
    .line 617
    const/16 v22, 0x0

    .line 618
    .line 619
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 620
    .line 621
    const v24, 0x3fab851f    # 1.34f

    .line 622
    .line 623
    .line 624
    move-object/from16 v20, v2

    .line 625
    .line 626
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v4, 0x3e947ae1    # 0.29f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v4, 0x41400000    # 12.0f

    .line 636
    .line 637
    const/high16 v6, 0x40400000    # 3.0f

    .line 638
    .line 639
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v4, 0x40e947ae    # 7.29f

    .line 643
    .line 644
    .line 645
    const/high16 v6, 0x40e00000    # 7.0f

    .line 646
    .line 647
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v4, 0x40e00000    # 7.0f

    .line 651
    .line 652
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 656
    .line 657
    const/16 v21, 0x0

    .line 658
    .line 659
    const v22, -0x402b851f    # -1.66f

    .line 660
    .line 661
    .line 662
    const v23, -0x40547ae1    # -1.34f

    .line 663
    .line 664
    .line 665
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v4, 0x40aae148    # 5.34f

    .line 671
    .line 672
    .line 673
    const/high16 v7, 0x3f800000    # 1.0f

    .line 674
    .line 675
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v4, 0x41600000    # 14.0f

    .line 679
    .line 680
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v4, 0x41200000    # 10.0f

    .line 684
    .line 685
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v4, -0x3f600000    # -5.0f

    .line 689
    .line 690
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v25, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/high16 v26, -0x40800000    # -1.0f

    .line 696
    .line 697
    const v22, -0x40f33333    # -0.55f

    .line 698
    .line 699
    .line 700
    const v23, 0x3ee66666    # 0.45f

    .line 701
    .line 702
    .line 703
    const/high16 v24, -0x40800000    # -1.0f

    .line 704
    .line 705
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v4, 0x3ee66666    # 0.45f

    .line 709
    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, 0x40a00000    # 5.0f

    .line 717
    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v4, 0x41200000    # 10.0f

    .line 722
    .line 723
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v4, 0x40e00000    # 7.0f

    .line 727
    .line 728
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v25, 0x41a00000    # 20.0f

    .line 732
    .line 733
    const/high16 v26, 0x40800000    # 4.0f

    .line 734
    .line 735
    const/high16 v21, 0x41b80000    # 23.0f

    .line 736
    .line 737
    const v22, 0x40aae148    # 5.34f

    .line 738
    .line 739
    .line 740
    const v23, 0x41ad47ae    # 21.66f

    .line 741
    .line 742
    .line 743
    const/high16 v24, 0x40800000    # 4.0f

    .line 744
    .line 745
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v4, 0x40a00000    # 5.0f

    .line 752
    .line 753
    const/high16 v6, 0x41980000    # 19.0f

    .line 754
    .line 755
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v4, 0x40400000    # 3.0f

    .line 759
    .line 760
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 764
    .line 765
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v4, 0x40000000    # 2.0f

    .line 769
    .line 770
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const/high16 v4, 0x41980000    # 19.0f

    .line 774
    .line 775
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v4, 0x41000000    # 8.0f

    .line 782
    .line 783
    const/high16 v6, 0x40a00000    # 5.0f

    .line 784
    .line 785
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v4, 0x40400000    # 3.0f

    .line 789
    .line 790
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v4, 0x40e00000    # 7.0f

    .line 794
    .line 795
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v25, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/high16 v26, -0x40800000    # -1.0f

    .line 801
    .line 802
    const/16 v21, 0x0

    .line 803
    .line 804
    const v22, -0x40f33333    # -0.55f

    .line 805
    .line 806
    .line 807
    const v23, 0x3ee66666    # 0.45f

    .line 808
    .line 809
    .line 810
    const/high16 v24, -0x40800000    # -1.0f

    .line 811
    .line 812
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v4, 0x3ee66666    # 0.45f

    .line 816
    .line 817
    .line 818
    const/high16 v6, 0x3f800000    # 1.0f

    .line 819
    .line 820
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v4, 0x41000000    # 8.0f

    .line 824
    .line 825
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v4, 0x41880000    # 17.0f

    .line 832
    .line 833
    const/high16 v6, 0x41980000    # 19.0f

    .line 834
    .line 835
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v4, -0x40000000    # -2.0f

    .line 839
    .line 840
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 844
    .line 845
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 849
    .line 850
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 851
    .line 852
    const v22, -0x402ccccd    # -1.65f

    .line 853
    .line 854
    .line 855
    const v23, -0x40533333    # -1.35f

    .line 856
    .line 857
    .line 858
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 859
    .line 860
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v26, 0x40400000    # 3.0f

    .line 864
    .line 865
    const v21, -0x402ccccd    # -1.65f

    .line 866
    .line 867
    .line 868
    const/16 v22, 0x0

    .line 869
    .line 870
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 871
    .line 872
    const v24, 0x3faccccd    # 1.35f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v4, 0x40400000    # 3.0f

    .line 879
    .line 880
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v4, 0x40e00000    # 7.0f

    .line 884
    .line 885
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v4, 0x411eb852    # 9.92f

    .line 889
    .line 890
    .line 891
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v4, -0x3f76b852    # -4.29f

    .line 895
    .line 896
    .line 897
    const/high16 v6, 0x40a00000    # 5.0f

    .line 898
    .line 899
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v4, 0x408947ae    # 4.29f

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const/high16 v4, 0x41980000    # 19.0f

    .line 909
    .line 910
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v4, 0x41a80000    # 21.0f

    .line 917
    .line 918
    const/high16 v6, 0x41980000    # 19.0f

    .line 919
    .line 920
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/high16 v4, -0x40000000    # -2.0f

    .line 924
    .line 925
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 929
    .line 930
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const/high16 v4, 0x40000000    # 2.0f

    .line 934
    .line 935
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const/high16 v4, 0x41980000    # 19.0f

    .line 939
    .line 940
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v4, 0x41a80000    # 21.0f

    .line 947
    .line 948
    const/high16 v6, 0x41000000    # 8.0f

    .line 949
    .line 950
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const/high16 v4, -0x40000000    # -2.0f

    .line 954
    .line 955
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const/high16 v4, 0x40e00000    # 7.0f

    .line 959
    .line 960
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v25, 0x3f800000    # 1.0f

    .line 964
    .line 965
    const/high16 v26, -0x40800000    # -1.0f

    .line 966
    .line 967
    const/16 v21, 0x0

    .line 968
    .line 969
    const v22, -0x40f33333    # -0.55f

    .line 970
    .line 971
    .line 972
    const v23, 0x3ee66666    # 0.45f

    .line 973
    .line 974
    .line 975
    const/high16 v24, -0x40800000    # -1.0f

    .line 976
    .line 977
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const v4, 0x3ee66666    # 0.45f

    .line 981
    .line 982
    .line 983
    const/high16 v6, 0x3f800000    # 1.0f

    .line 984
    .line 985
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const/high16 v4, 0x41000000    # 8.0f

    .line 989
    .line 990
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1001
    .line 1002
    const/4 v7, 0x0

    .line 1003
    const-string v4, ""

    .line 1004
    .line 1005
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1006
    .line 1007
    .line 1008
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1009
    .line 1010
    .line 1011
    move-result v3

    .line 1012
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1013
    .line 1014
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1015
    .line 1016
    .line 1017
    move-result-wide v6

    .line 1018
    const/4 v0, 0x0

    .line 1019
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1023
    .line 1024
    .line 1025
    move-result v10

    .line 1026
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1027
    .line 1028
    .line 1029
    move-result v11

    .line 1030
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1033
    .line 1034
    .line 1035
    const/high16 v0, 0x41400000    # 12.0f

    .line 1036
    .line 1037
    const/high16 v2, 0x41200000    # 10.0f

    .line 1038
    .line 1039
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/4 v0, 0x0

    .line 1043
    const/high16 v2, -0x40400000    # -1.5f

    .line 1044
    .line 1045
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const/high16 v18, 0x40400000    # 3.0f

    .line 1049
    .line 1050
    const/16 v19, 0x0

    .line 1051
    .line 1052
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 1053
    .line 1054
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 1055
    .line 1056
    const/16 v16, 0x1

    .line 1057
    .line 1058
    const/16 v17, 0x1

    .line 1059
    .line 1060
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 1064
    .line 1065
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    const/16 v16, 0x3800

    .line 1073
    .line 1074
    const/16 v17, 0x0

    .line 1075
    .line 1076
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1077
    .line 1078
    const/4 v7, 0x0

    .line 1079
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1080
    .line 1081
    const/4 v13, 0x0

    .line 1082
    const/4 v14, 0x0

    .line 1083
    const-string v4, ""

    .line 1084
    .line 1085
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    sput-object v0, Landroidx/compose/material/icons/twotone/SynagogueKt;->_synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1094
    .line 1095
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    return-object v0
.end method
