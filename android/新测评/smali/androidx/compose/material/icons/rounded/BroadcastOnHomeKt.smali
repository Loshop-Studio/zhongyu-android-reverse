.class public final Landroidx/compose/material/icons/rounded/BroadcastOnHomeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_broadcastOnHome",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BroadcastOnHome",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBroadcastOnHome",
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
        "SMAP\nBroadcastOnHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastOnHome.kt\nandroidx/compose/material/icons/rounded/BroadcastOnHomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n233#2,18:205\n253#2:242\n233#2,18:243\n253#2:280\n233#2,18:281\n253#2:318\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n705#4,2:223\n717#4,2:225\n719#4,11:231\n705#4,2:261\n717#4,2:263\n719#4,11:269\n705#4,2:299\n717#4,2:301\n719#4,11:307\n72#5,4:151\n72#5,4:189\n72#5,4:227\n72#5,4:265\n72#5,4:303\n*S KotlinDebug\n*F\n+ 1 BroadcastOnHome.kt\nandroidx/compose/material/icons/rounded/BroadcastOnHomeKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n43#1:167,18\n43#1:204\n61#1:205,18\n61#1:242\n74#1:243,18\n74#1:280\n92#1:281,18\n92#1:318\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n43#1:185,2\n43#1:187,2\n43#1:193,11\n61#1:223,2\n61#1:225,2\n61#1:231,11\n74#1:261,2\n74#1:263,2\n74#1:269,11\n92#1:299,2\n92#1:301,2\n92#1:307,11\n30#1:151,4\n43#1:189,4\n61#1:227,4\n74#1:265,4\n92#1:303,4\n*E\n"
    }
.end annotation


# static fields
.field private static _broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBroadcastOnHome(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BroadcastOnHomeKt;->_broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BroadcastOnHome"

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
    const/high16 v4, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40733333    # -1.1f

    .line 84
    .line 85
    .line 86
    const v23, -0x4099999a    # -0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40000000    # -2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x40800000    # 4.0f

    .line 102
    .line 103
    const/high16 v26, 0x40a00000    # 5.0f

    .line 104
    .line 105
    const v21, 0x408e6666    # 4.45f

    .line 106
    .line 107
    .line 108
    const/high16 v22, 0x40800000    # 4.0f

    .line 109
    .line 110
    const/high16 v23, 0x40800000    # 4.0f

    .line 111
    .line 112
    const v24, 0x408e6666    # 4.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v26, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/16 v21, 0x0

    .line 127
    .line 128
    const v22, 0x3f0ccccd    # 0.55f

    .line 129
    .line 130
    .line 131
    const v23, 0x3ee66666    # 0.45f

    .line 132
    .line 133
    .line 134
    const/high16 v24, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41700000    # 15.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x4025c28f    # 2.59f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x40000000    # 2.0f

    .line 151
    .line 152
    const v26, 0x3f95c28f    # 1.17f

    .line 153
    .line 154
    .line 155
    const v21, 0x3f3ae148    # 0.73f

    .line 156
    .line 157
    .line 158
    const v22, 0x3e947ae1    # 0.29f

    .line 159
    .line 160
    .line 161
    const v23, 0x3fb33333    # 1.4f

    .line 162
    .line 163
    .line 164
    const v24, 0x3f30a3d7    # 0.69f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x40c00000    # 6.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v16, 0x3800

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/high16 v6, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v8, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const/high16 v9, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v12, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    const-string v4, ""

    .line 199
    .line 200
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 208
    .line 209
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    const/4 v2, 0x0

    .line 214
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x41000000    # 8.0f

    .line 231
    .line 232
    const/high16 v6, 0x41100000    # 9.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x40400000    # 3.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, -0x40800000    # -1.0f

    .line 243
    .line 244
    const/high16 v26, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v21, -0x41000000    # -0.5f

    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const/high16 v23, -0x40800000    # -1.0f

    .line 251
    .line 252
    const/high16 v24, 0x3f000000    # 0.5f

    .line 253
    .line 254
    move-object/from16 v20, v2

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41100000    # 9.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v25, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/16 v21, 0x0

    .line 267
    .line 268
    const/high16 v22, 0x3f000000    # 0.5f

    .line 269
    .line 270
    const/high16 v23, 0x3f000000    # 0.5f

    .line 271
    .line 272
    const/high16 v24, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x40a00000    # 5.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v26, -0x40800000    # -1.0f

    .line 283
    .line 284
    const/high16 v21, 0x3f000000    # 0.5f

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/high16 v23, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v24, -0x41000000    # -0.5f

    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v25, 0x41000000    # 8.0f

    .line 301
    .line 302
    const/high16 v26, 0x41100000    # 9.0f

    .line 303
    .line 304
    const/high16 v21, 0x41100000    # 9.0f

    .line 305
    .line 306
    const/high16 v22, 0x41180000    # 9.5f

    .line 307
    .line 308
    const/high16 v23, 0x41080000    # 8.5f

    .line 309
    .line 310
    const/high16 v24, 0x41100000    # 9.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x40e00000    # 7.0f

    .line 319
    .line 320
    const/high16 v6, 0x41900000    # 18.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x40800000    # 4.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, -0x3f200000    # -7.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x40400000    # 3.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41900000    # 18.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/high16 v6, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 367
    .line 368
    .line 369
    move-result-wide v6

    .line 370
    const/4 v2, 0x0

    .line 371
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x418e0000    # 17.75f

    .line 388
    .line 389
    const v6, 0x4187c28f    # 16.97f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v25, 0x3f000000    # 0.5f

    .line 396
    .line 397
    const v26, -0x4087ae14    # -0.97f

    .line 398
    .line 399
    .line 400
    const v21, 0x3e99999a    # 0.3f

    .line 401
    .line 402
    .line 403
    const v22, -0x41947ae1    # -0.23f

    .line 404
    .line 405
    .line 406
    const/high16 v23, 0x3f000000    # 0.5f

    .line 407
    .line 408
    const v24, -0x40ee147b    # -0.57f

    .line 409
    .line 410
    .line 411
    move-object/from16 v20, v2

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v25, -0x40600000    # -1.25f

    .line 417
    .line 418
    const/high16 v26, -0x40600000    # -1.25f

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const v22, -0x40cf5c29    # -0.69f

    .line 423
    .line 424
    .line 425
    const v23, -0x40f0a3d7    # -0.56f

    .line 426
    .line 427
    .line 428
    const/high16 v24, -0x40600000    # -1.25f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x3f0f5c29    # 0.56f

    .line 434
    .line 435
    .line 436
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 437
    .line 438
    const/high16 v7, -0x40600000    # -1.25f

    .line 439
    .line 440
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v25, 0x3f000000    # 0.5f

    .line 444
    .line 445
    const v26, 0x3f7851ec    # 0.97f

    .line 446
    .line 447
    .line 448
    const v22, 0x3ecccccd    # 0.4f

    .line 449
    .line 450
    .line 451
    const v23, 0x3e4ccccd    # 0.2f

    .line 452
    .line 453
    .line 454
    const/high16 v24, 0x3f400000    # 0.75f

    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x4088f5c3    # 4.28f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, 0x3f400000    # 0.75f

    .line 466
    .line 467
    const/high16 v26, 0x3f400000    # 0.75f

    .line 468
    .line 469
    const v22, 0x3ed1eb85    # 0.41f

    .line 470
    .line 471
    .line 472
    const v23, 0x3eae147b    # 0.34f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/4 v4, 0x0

    .line 479
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v26, -0x40c00000    # -0.75f

    .line 483
    .line 484
    const v21, 0x3ed1eb85    # 0.41f

    .line 485
    .line 486
    .line 487
    const/16 v22, 0x0

    .line 488
    .line 489
    const/high16 v23, 0x3f400000    # 0.75f

    .line 490
    .line 491
    const v24, -0x4151eb85    # -0.34f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v4, 0x4187c28f    # 16.97f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    const/high16 v6, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/4 v7, 0x0

    .line 513
    const-string v4, ""

    .line 514
    .line 515
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 516
    .line 517
    .line 518
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 523
    .line 524
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 525
    .line 526
    .line 527
    move-result-wide v6

    .line 528
    const/4 v2, 0x0

    .line 529
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 533
    .line 534
    .line 535
    move-result v10

    .line 536
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 543
    .line 544
    .line 545
    const v4, 0x418c51ec    # 17.54f

    .line 546
    .line 547
    .line 548
    const v6, 0x4158f5c3    # 13.56f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v25, 0x3ff70a3d    # 1.93f

    .line 555
    .line 556
    .line 557
    const v26, 0x400147ae    # 2.02f

    .line 558
    .line 559
    .line 560
    const v21, 0x3f7ae148    # 0.98f

    .line 561
    .line 562
    .line 563
    const v22, 0x3e570a3d    # 0.21f

    .line 564
    .line 565
    .line 566
    const v23, 0x3fe147ae    # 1.76f

    .line 567
    .line 568
    .line 569
    const v24, 0x3f83d70a    # 1.03f

    .line 570
    .line 571
    .line 572
    move-object/from16 v20, v2

    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v25, -0x4151eb85    # -0.34f

    .line 578
    .line 579
    .line 580
    const v26, 0x3fdeb852    # 1.74f

    .line 581
    .line 582
    .line 583
    const v21, 0x3de147ae    # 0.11f

    .line 584
    .line 585
    .line 586
    const v22, 0x3f23d70a    # 0.64f

    .line 587
    .line 588
    .line 589
    const v23, -0x430a3d71    # -0.03f

    .line 590
    .line 591
    .line 592
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v25, 0x3df5c28f    # 0.12f

    .line 598
    .line 599
    .line 600
    const v26, 0x3f68f5c3    # 0.91f

    .line 601
    .line 602
    .line 603
    const v21, -0x41c7ae14    # -0.18f

    .line 604
    .line 605
    .line 606
    const v22, 0x3e947ae1    # 0.29f

    .line 607
    .line 608
    .line 609
    const v23, -0x41fae148    # -0.13f

    .line 610
    .line 611
    .line 612
    const v24, 0x3f2b851f    # 0.67f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/4 v4, 0x0

    .line 619
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v25, 0x3f947ae1    # 1.16f

    .line 623
    .line 624
    .line 625
    const v26, -0x420a3d71    # -0.12f

    .line 626
    .line 627
    .line 628
    const v21, 0x3eae147b    # 0.34f

    .line 629
    .line 630
    .line 631
    const v22, 0x3ea8f5c3    # 0.33f

    .line 632
    .line 633
    .line 634
    const v23, 0x3f666666    # 0.9f

    .line 635
    .line 636
    .line 637
    const v24, 0x3e947ae1    # 0.29f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v25, 0x3f07ae14    # 0.53f

    .line 644
    .line 645
    .line 646
    const v26, -0x3fc66666    # -2.9f

    .line 647
    .line 648
    .line 649
    const v21, 0x3f028f5c    # 0.51f

    .line 650
    .line 651
    .line 652
    const v22, -0x40ae147b    # -0.82f

    .line 653
    .line 654
    .line 655
    const v23, 0x3f3ae148    # 0.73f

    .line 656
    .line 657
    .line 658
    const v24, -0x4015c28f    # -1.83f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v25, -0x3fb851ec    # -3.12f

    .line 665
    .line 666
    .line 667
    const v26, -0x3fb7ae14    # -3.13f

    .line 668
    .line 669
    .line 670
    const v21, -0x41666666    # -0.3f

    .line 671
    .line 672
    .line 673
    const v22, -0x403851ec    # -1.56f

    .line 674
    .line 675
    .line 676
    const v23, -0x403851ec    # -1.56f

    .line 677
    .line 678
    .line 679
    const v24, -0x3fcae148    # -2.83f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v25, 0x41500000    # 13.0f

    .line 686
    .line 687
    const/high16 v26, 0x41800000    # 16.0f

    .line 688
    .line 689
    const v21, 0x4173d70a    # 15.24f

    .line 690
    .line 691
    .line 692
    const v22, 0x413947ae    # 11.58f

    .line 693
    .line 694
    .line 695
    const/high16 v23, 0x41500000    # 13.0f

    .line 696
    .line 697
    const v24, 0x41587ae1    # 13.53f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v25, 0x3f19999a    # 0.6f

    .line 704
    .line 705
    .line 706
    const v26, 0x40070a3d    # 2.11f

    .line 707
    .line 708
    .line 709
    const/16 v21, 0x0

    .line 710
    .line 711
    const v22, 0x3f47ae14    # 0.78f

    .line 712
    .line 713
    .line 714
    const v23, 0x3e6147ae    # 0.22f

    .line 715
    .line 716
    .line 717
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 718
    .line 719
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v25, 0x3f947ae1    # 1.16f

    .line 723
    .line 724
    .line 725
    const v26, 0x3df5c28f    # 0.12f

    .line 726
    .line 727
    .line 728
    const/high16 v21, 0x3e800000    # 0.25f

    .line 729
    .line 730
    const v22, 0x3ed1eb85    # 0.41f

    .line 731
    .line 732
    .line 733
    const v23, 0x3f547ae1    # 0.83f

    .line 734
    .line 735
    .line 736
    const v24, 0x3eeb851f    # 0.46f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v25, 0x3de147ae    # 0.11f

    .line 746
    .line 747
    .line 748
    const v26, -0x40947ae1    # -0.92f

    .line 749
    .line 750
    .line 751
    const v21, 0x3e75c28f    # 0.24f

    .line 752
    .line 753
    .line 754
    const v22, -0x418a3d71    # -0.24f

    .line 755
    .line 756
    .line 757
    const v23, 0x3e947ae1    # 0.29f

    .line 758
    .line 759
    .line 760
    const v24, -0x40deb852    # -0.63f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v25, -0x41428f5c    # -0.37f

    .line 767
    .line 768
    .line 769
    const v26, -0x405851ec    # -1.31f

    .line 770
    .line 771
    .line 772
    const v21, -0x418a3d71    # -0.24f

    .line 773
    .line 774
    .line 775
    const v22, -0x413d70a4    # -0.38f

    .line 776
    .line 777
    .line 778
    const v23, -0x41428f5c    # -0.37f

    .line 779
    .line 780
    .line 781
    const v24, -0x40ab851f    # -0.83f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v25, 0x418c51ec    # 17.54f

    .line 788
    .line 789
    .line 790
    const v26, 0x4158f5c3    # 13.56f

    .line 791
    .line 792
    .line 793
    const/high16 v21, 0x41680000    # 14.5f

    .line 794
    .line 795
    const v22, 0x41673333    # 14.45f

    .line 796
    .line 797
    .line 798
    const v23, 0x417ee148    # 15.93f

    .line 799
    .line 800
    .line 801
    const v24, 0x4153851f    # 13.22f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    const/high16 v6, 0x3f800000    # 1.0f

    .line 815
    .line 816
    const/4 v7, 0x0

    .line 817
    const-string v4, ""

    .line 818
    .line 819
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 820
    .line 821
    .line 822
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 827
    .line 828
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 829
    .line 830
    .line 831
    move-result-wide v6

    .line 832
    const/4 v0, 0x0

    .line 833
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 837
    .line 838
    .line 839
    move-result v10

    .line 840
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 841
    .line 842
    .line 843
    move-result v11

    .line 844
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 847
    .line 848
    .line 849
    const/high16 v0, 0x41820000    # 16.25f

    .line 850
    .line 851
    const v2, 0x4118a3d7    # 9.54f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v17, -0x3f49eb85    # -5.69f

    .line 858
    .line 859
    .line 860
    const v18, 0x40b3851f    # 5.61f

    .line 861
    .line 862
    .line 863
    const v13, -0x3fc3d70a    # -2.94f

    .line 864
    .line 865
    .line 866
    const v14, 0x3ea8f5c3    # 0.33f

    .line 867
    .line 868
    .line 869
    const v15, -0x3f55c28f    # -5.32f

    .line 870
    .line 871
    .line 872
    const v16, 0x402b851f    # 2.68f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v17, 0x3fa66666    # 1.3f

    .line 879
    .line 880
    .line 881
    const v18, 0x409a3d71    # 4.82f

    .line 882
    .line 883
    .line 884
    const v13, -0x41947ae1    # -0.23f

    .line 885
    .line 886
    .line 887
    const v14, 0x3fe8f5c3    # 1.82f

    .line 888
    .line 889
    .line 890
    const v15, 0x3e947ae1    # 0.29f

    .line 891
    .line 892
    .line 893
    const v16, 0x4060a3d7    # 3.51f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v17, 0x3f8f5c29    # 1.12f

    .line 900
    .line 901
    .line 902
    const v18, 0x3d75c28f    # 0.06f

    .line 903
    .line 904
    .line 905
    const v13, 0x3e8a3d71    # 0.27f

    .line 906
    .line 907
    .line 908
    const v14, 0x3eb33333    # 0.35f

    .line 909
    .line 910
    .line 911
    const v15, 0x3f4ccccd    # 0.8f

    .line 912
    .line 913
    .line 914
    const v16, 0x3ebd70a4    # 0.37f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/4 v0, 0x0

    .line 921
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v17, 0x3d4ccccd    # 0.05f

    .line 925
    .line 926
    .line 927
    const/high16 v18, -0x40800000    # -1.0f

    .line 928
    .line 929
    const v14, -0x4175c28f    # -0.27f

    .line 930
    .line 931
    .line 932
    const v15, 0x3e8f5c29    # 0.28f

    .line 933
    .line 934
    .line 935
    const v16, -0x40cccccd    # -0.7f

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, -0x408ccccd    # -0.95f

    .line 942
    .line 943
    .line 944
    const v18, -0x3f870a3d    # -3.89f

    .line 945
    .line 946
    .line 947
    const v13, -0x40b33333    # -0.8f

    .line 948
    .line 949
    .line 950
    const v14, -0x4079999a    # -1.05f

    .line 951
    .line 952
    .line 953
    const v15, -0x40666666    # -1.2f

    .line 954
    .line 955
    .line 956
    const v16, -0x3fe47ae1    # -2.43f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v17, 0x407eb852    # 3.98f

    .line 963
    .line 964
    .line 965
    const v18, -0x3f7e6666    # -4.05f

    .line 966
    .line 967
    .line 968
    const v13, 0x3eae147b    # 0.34f

    .line 969
    .line 970
    .line 971
    const v14, -0x3ffe147b    # -2.03f

    .line 972
    .line 973
    .line 974
    const v15, 0x3ff9999a    # 1.95f

    .line 975
    .line 976
    .line 977
    const v16, -0x3f951eb8    # -3.67f

    .line 978
    .line 979
    .line 980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v17, 0x41b00000    # 22.0f

    .line 984
    .line 985
    const/high16 v18, 0x41800000    # 16.0f

    .line 986
    .line 987
    const v13, 0x4199c28f    # 19.22f

    .line 988
    .line 989
    .line 990
    const/high16 v14, 0x41280000    # 10.5f

    .line 991
    .line 992
    const/high16 v15, 0x41b00000    # 22.0f

    .line 993
    .line 994
    const v16, 0x414ee148    # 12.93f

    .line 995
    .line 996
    .line 997
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v17, -0x407d70a4    # -1.02f

    .line 1001
    .line 1002
    .line 1003
    const v18, 0x404147ae    # 3.02f

    .line 1004
    .line 1005
    .line 1006
    const/4 v13, 0x0

    .line 1007
    const v14, 0x3f90a3d7    # 1.13f

    .line 1008
    .line 1009
    .line 1010
    const v15, -0x413d70a4    # -0.38f

    .line 1011
    .line 1012
    .line 1013
    const v16, 0x400b851f    # 2.18f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const v17, 0x3d75c28f    # 0.06f

    .line 1020
    .line 1021
    .line 1022
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1023
    .line 1024
    const v13, -0x41947ae1    # -0.23f

    .line 1025
    .line 1026
    .line 1027
    const v14, 0x3e99999a    # 0.3f

    .line 1028
    .line 1029
    .line 1030
    const v15, -0x41a8f5c3    # -0.21f

    .line 1031
    .line 1032
    .line 1033
    const v16, 0x3f3ae148    # 0.73f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const v17, 0x3f8e147b    # 1.11f

    .line 1043
    .line 1044
    .line 1045
    const v18, -0x428a3d71    # -0.06f

    .line 1046
    .line 1047
    .line 1048
    const v13, 0x3e9eb852    # 0.31f

    .line 1049
    .line 1050
    .line 1051
    const v14, 0x3e9eb852    # 0.31f

    .line 1052
    .line 1053
    .line 1054
    const v15, 0x3f570a3d    # 0.84f

    .line 1055
    .line 1056
    .line 1057
    const v16, 0x3e99999a    # 0.3f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const/high16 v17, 0x41bc0000    # 23.5f

    .line 1064
    .line 1065
    const/high16 v18, 0x41800000    # 16.0f

    .line 1066
    .line 1067
    const/high16 v13, 0x41b80000    # 23.0f

    .line 1068
    .line 1069
    const v14, 0x4196f5c3    # 18.87f

    .line 1070
    .line 1071
    .line 1072
    const/high16 v15, 0x41bc0000    # 23.5f

    .line 1073
    .line 1074
    const v16, 0x418beb85    # 17.49f

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const/high16 v17, 0x41820000    # 16.25f

    .line 1081
    .line 1082
    const v18, 0x4118a3d7    # 9.54f

    .line 1083
    .line 1084
    .line 1085
    const/high16 v13, 0x41bc0000    # 23.5f

    .line 1086
    .line 1087
    const v14, 0x41428f5c    # 12.16f

    .line 1088
    .line 1089
    .line 1090
    const v15, 0x41a15c29    # 20.17f

    .line 1091
    .line 1092
    .line 1093
    const v16, 0x4111999a    # 9.1f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    const/16 v16, 0x3800

    .line 1107
    .line 1108
    const/16 v17, 0x0

    .line 1109
    .line 1110
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1111
    .line 1112
    const/4 v7, 0x0

    .line 1113
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const/4 v13, 0x0

    .line 1116
    const/4 v14, 0x0

    .line 1117
    const/4 v15, 0x0

    .line 1118
    const-string v4, ""

    .line 1119
    .line 1120
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    sput-object v0, Landroidx/compose/material/icons/rounded/BroadcastOnHomeKt;->_broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1129
    .line 1130
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1131
    .line 1132
    .line 1133
    return-object v0
.end method
