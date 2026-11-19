.class public final Landroidx/compose/material/icons/twotone/LandslideKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_landslide",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Landslide",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLandslide",
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
        "SMAP\nLandslide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/twotone/LandslideKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,146:1\n212#2,12:147\n233#2,18:160\n253#2:197\n233#2,18:198\n253#2:235\n233#2,18:236\n253#2:273\n233#2,18:274\n253#2:311\n233#2,18:312\n253#2:349\n233#2,18:350\n253#2:387\n233#2,18:388\n253#2:425\n233#2,18:426\n253#2:463\n174#3:159\n705#4,2:178\n717#4,2:180\n719#4,11:186\n705#4,2:216\n717#4,2:218\n719#4,11:224\n705#4,2:254\n717#4,2:256\n719#4,11:262\n705#4,2:292\n717#4,2:294\n719#4,11:300\n705#4,2:330\n717#4,2:332\n719#4,11:338\n705#4,2:368\n717#4,2:370\n719#4,11:376\n705#4,2:406\n717#4,2:408\n719#4,11:414\n705#4,2:444\n717#4,2:446\n719#4,11:452\n72#5,4:182\n72#5,4:220\n72#5,4:258\n72#5,4:296\n72#5,4:334\n72#5,4:372\n72#5,4:410\n72#5,4:448\n*S KotlinDebug\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/twotone/LandslideKt\n*L\n29#1:147,12\n30#1:160,18\n30#1:197\n38#1:198,18\n38#1:235\n47#1:236,18\n47#1:273\n56#1:274,18\n56#1:311\n64#1:312,18\n64#1:349\n73#1:350,18\n73#1:387\n105#1:388,18\n105#1:425\n123#1:426,18\n123#1:463\n29#1:159\n30#1:178,2\n30#1:180,2\n30#1:186,11\n38#1:216,2\n38#1:218,2\n38#1:224,11\n47#1:254,2\n47#1:256,2\n47#1:262,11\n56#1:292,2\n56#1:294,2\n56#1:300,11\n64#1:330,2\n64#1:332,2\n64#1:338,11\n73#1:368,2\n73#1:370,2\n73#1:376,11\n105#1:406,2\n105#1:408,2\n105#1:414,11\n123#1:444,2\n123#1:446,2\n123#1:452,11\n30#1:182,4\n38#1:220,4\n47#1:258,4\n56#1:296,4\n64#1:334,4\n73#1:372,4\n105#1:410,4\n123#1:448,4\n*E\n"
    }
.end annotation


# static fields
.field private static _landslide:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLandslide(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LandslideKt;->_landslide:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Landslide"

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
    const v4, 0x41091eb8    # 8.57f

    .line 71
    .line 72
    .line 73
    const v6, 0x414170a4    # 12.09f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x40370a3d    # -1.57f

    .line 80
    .line 81
    .line 82
    const v6, -0x3ffa3d71    # -2.09f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x4011eb85    # 2.28f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x3f2b851f    # 0.67f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const/16 v16, 0x3800

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const v6, 0x3e99999a    # 0.3f

    .line 120
    .line 121
    .line 122
    const v8, 0x3e99999a    # 0.3f

    .line 123
    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    const/high16 v9, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/high16 v12, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x0

    .line 133
    const-string v4, ""

    .line 134
    .line 135
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 145
    .line 146
    .line 147
    move-result-wide v6

    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const v4, 0x41487ae1    # 12.53f

    .line 166
    .line 167
    .line 168
    const v6, 0x416c51ec    # 14.77f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, -0x407c28f6    # -1.03f

    .line 175
    .line 176
    .line 177
    const v6, -0x3fdae148    # -2.58f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x3f833333    # -3.95f

    .line 184
    .line 185
    .line 186
    const v6, 0x3fa7ae14    # 1.31f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x40d70a3d    # -0.66f

    .line 193
    .line 194
    .line 195
    const/high16 v6, -0x40000000    # -2.0f

    .line 196
    .line 197
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x3ff1eb85    # 1.89f

    .line 201
    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x3f2b851f    # 0.67f

    .line 208
    .line 209
    .line 210
    const/high16 v6, 0x40000000    # 2.0f

    .line 211
    .line 212
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const v6, 0x3e99999a    # 0.3f

    .line 223
    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const v4, 0x4094cccd    # 4.65f

    .line 259
    .line 260
    .line 261
    const/high16 v6, 0x41700000    # 15.0f

    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, -0x3fff5c29    # -2.01f

    .line 267
    .line 268
    .line 269
    const/4 v6, 0x0

    .line 270
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, -0x40fae148    # -0.52f

    .line 274
    .line 275
    .line 276
    const v6, -0x3fdae148    # -2.58f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, -0x404a3d71    # -1.42f

    .line 283
    .line 284
    .line 285
    const v6, 0x3f733333    # 0.95f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x3fee147b    # 1.86f

    .line 292
    .line 293
    .line 294
    const/4 v6, 0x0

    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x3f9d70a4    # 1.23f

    .line 299
    .line 300
    .line 301
    const v6, 0x3f51eb85    # 0.82f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const v6, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const-string v4, ""

    .line 319
    .line 320
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v6

    .line 333
    const/4 v2, 0x0

    .line 334
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const v4, 0x41986666    # 19.05f

    .line 351
    .line 352
    .line 353
    const/high16 v6, 0x40c00000    # 6.0f

    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, -0x40d70a3d    # -0.66f

    .line 359
    .line 360
    .line 361
    const/high16 v6, -0x40000000    # -2.0f

    .line 362
    .line 363
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x3fce147b    # 1.61f

    .line 367
    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x41600000    # 14.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v4, -0x3fc1eb85    # -2.97f

    .line 379
    .line 380
    .line 381
    const v6, -0x3f828f5c    # -3.96f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    const v6, 0x3e99999a    # 0.3f

    .line 395
    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const-string v4, ""

    .line 399
    .line 400
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 401
    .line 402
    .line 403
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 408
    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v6

    .line 413
    const/4 v2, 0x0

    .line 414
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 422
    .line 423
    .line 424
    move-result v11

    .line 425
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 428
    .line 429
    .line 430
    const v4, 0x411f5c29    # 9.96f

    .line 431
    .line 432
    .line 433
    const/high16 v6, 0x41900000    # 18.0f

    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x3f8a3d71    # 1.08f

    .line 439
    .line 440
    .line 441
    const/4 v6, 0x0

    .line 442
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x3f4ccccd    # 0.8f

    .line 446
    .line 447
    .line 448
    const v6, 0x3f23d70a    # 0.64f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, 0x400ccccd    # 2.2f

    .line 455
    .line 456
    .line 457
    const v6, -0x40851eb8    # -0.98f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v4, -0x40733333    # -1.1f

    .line 464
    .line 465
    .line 466
    const/4 v6, 0x0

    .line 467
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, -0x411eb852    # -0.44f

    .line 471
    .line 472
    .line 473
    const/high16 v6, -0x40000000    # -2.0f

    .line 474
    .line 475
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const v6, 0x3e99999a    # 0.3f

    .line 486
    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const-string v4, ""

    .line 490
    .line 491
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 492
    .line 493
    .line 494
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 499
    .line 500
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 501
    .line 502
    .line 503
    move-result-wide v6

    .line 504
    const/4 v2, 0x0

    .line 505
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 519
    .line 520
    .line 521
    const/high16 v4, 0x41400000    # 12.0f

    .line 522
    .line 523
    const/high16 v6, 0x41300000    # 11.0f

    .line 524
    .line 525
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41000000    # 8.0f

    .line 529
    .line 530
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v4, 0x40000000    # 2.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41600000    # 14.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v4, 0x41a00000    # 20.0f

    .line 544
    .line 545
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v4, -0x3f400000    # -6.0f

    .line 549
    .line 550
    const/high16 v6, -0x3f000000    # -8.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v4, 0x41400000    # 12.0f

    .line 556
    .line 557
    const/high16 v6, 0x41300000    # 11.0f

    .line 558
    .line 559
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v4, 0x41200000    # 10.0f

    .line 566
    .line 567
    const/high16 v6, 0x40800000    # 4.0f

    .line 568
    .line 569
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v4, 0x40400000    # 3.0f

    .line 573
    .line 574
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v4, 0x3fc8f5c3    # 1.57f

    .line 578
    .line 579
    .line 580
    const v6, 0x4005c28f    # 2.09f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v4, 0x414f3333    # 12.95f

    .line 587
    .line 588
    .line 589
    const/high16 v6, 0x40c00000    # 6.0f

    .line 590
    .line 591
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v4, -0x40d47ae1    # -0.67f

    .line 595
    .line 596
    .line 597
    const/high16 v6, -0x40000000    # -2.0f

    .line 598
    .line 599
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x41200000    # 10.0f

    .line 603
    .line 604
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v4, 0x41663d71    # 14.39f

    .line 611
    .line 612
    .line 613
    const/high16 v6, 0x40800000    # 4.0f

    .line 614
    .line 615
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v4, 0x3f2b851f    # 0.67f

    .line 619
    .line 620
    .line 621
    const/high16 v6, 0x40000000    # 2.0f

    .line 622
    .line 623
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v4, 0x407ccccd    # 3.95f

    .line 627
    .line 628
    .line 629
    const v6, -0x40570a3d    # -1.32f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v4, 0x40251eb8    # 2.58f

    .line 636
    .line 637
    .line 638
    const v6, 0x3f83d70a    # 1.03f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v4, 0x4187999a    # 16.95f

    .line 645
    .line 646
    .line 647
    const/high16 v6, 0x40c00000    # 6.0f

    .line 648
    .line 649
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v4, -0x40d47ae1    # -0.67f

    .line 653
    .line 654
    .line 655
    const/high16 v6, -0x40000000    # -2.0f

    .line 656
    .line 657
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v4, 0x41663d71    # 14.39f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v4, 0x41a00000    # 20.0f

    .line 670
    .line 671
    const/high16 v6, 0x40800000    # 4.0f

    .line 672
    .line 673
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v4, -0x4031eb85    # -1.61f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v4, 0x3f2b851f    # 0.67f

    .line 683
    .line 684
    .line 685
    const/high16 v6, 0x40000000    # 2.0f

    .line 686
    .line 687
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v4, 0x41107ae1    # 9.03f

    .line 691
    .line 692
    .line 693
    const v6, -0x3fbf5c29    # -3.01f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v4, 0x41a00000    # 20.0f

    .line 700
    .line 701
    const/high16 v6, 0x41900000    # 18.0f

    .line 702
    .line 703
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v4, 0x40800000    # 4.0f

    .line 707
    .line 708
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    const/high16 v6, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/high16 v8, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v7, 0x0

    .line 723
    const-string v4, ""

    .line 724
    .line 725
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 726
    .line 727
    .line 728
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 729
    .line 730
    .line 731
    move-result v3

    .line 732
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 733
    .line 734
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 735
    .line 736
    .line 737
    move-result-wide v6

    .line 738
    const/4 v2, 0x0

    .line 739
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 747
    .line 748
    .line 749
    move-result v11

    .line 750
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x41880000    # 17.0f

    .line 756
    .line 757
    const/high16 v6, 0x40c00000    # 6.0f

    .line 758
    .line 759
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v4, 0x3f800000    # 1.0f

    .line 763
    .line 764
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v4, -0x3f600000    # -5.0f

    .line 768
    .line 769
    const/high16 v6, -0x40800000    # -1.0f

    .line 770
    .line 771
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v4, 0x41100000    # 9.0f

    .line 775
    .line 776
    const/high16 v6, 0x40000000    # 2.0f

    .line 777
    .line 778
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v4, 0x40800000    # 4.0f

    .line 782
    .line 783
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v4, 0x40400000    # 3.0f

    .line 787
    .line 788
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v4, 0x41880000    # 17.0f

    .line 792
    .line 793
    const/high16 v6, 0x40c00000    # 6.0f

    .line 794
    .line 795
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v4, 0x40447ae1    # 3.07f

    .line 802
    .line 803
    .line 804
    const/high16 v6, 0x41300000    # 11.0f

    .line 805
    .line 806
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v4, 0x3fb5c28f    # 1.42f

    .line 810
    .line 811
    .line 812
    const v6, -0x408ccccd    # -0.95f

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v4, 0x4028f5c3    # 2.64f

    .line 819
    .line 820
    .line 821
    const/high16 v6, 0x41700000    # 15.0f

    .line 822
    .line 823
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v4, 0x4000a3d7    # 2.01f

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v4, -0x3fceb852    # -2.77f

    .line 833
    .line 834
    .line 835
    const v6, 0x3f8e147b    # 1.11f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v4, 0x409dc28f    # 4.93f

    .line 842
    .line 843
    .line 844
    const/high16 v6, 0x41300000    # 11.0f

    .line 845
    .line 846
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v4, 0x40447ae1    # 3.07f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    const/high16 v6, 0x3f800000    # 1.0f

    .line 863
    .line 864
    const/4 v7, 0x0

    .line 865
    const-string v4, ""

    .line 866
    .line 867
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 868
    .line 869
    .line 870
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 875
    .line 876
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 877
    .line 878
    .line 879
    move-result-wide v6

    .line 880
    const/4 v0, 0x0

    .line 881
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 885
    .line 886
    .line 887
    move-result v10

    .line 888
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 889
    .line 890
    .line 891
    move-result v11

    .line 892
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 895
    .line 896
    .line 897
    const/high16 v2, 0x41940000    # 18.5f

    .line 898
    .line 899
    const/high16 v4, 0x40e00000    # 7.0f

    .line 900
    .line 901
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/high16 v2, 0x41800000    # 16.0f

    .line 905
    .line 906
    const/high16 v4, 0x41100000    # 9.0f

    .line 907
    .line 908
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v2, 0x40400000    # 3.0f

    .line 912
    .line 913
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v2, 0x40200000    # 2.5f

    .line 917
    .line 918
    const/high16 v4, 0x40000000    # 2.0f

    .line 919
    .line 920
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/high16 v2, 0x40900000    # 4.5f

    .line 924
    .line 925
    const/high16 v4, -0x40000000    # -2.0f

    .line 926
    .line 927
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v2, 0x41000000    # 8.0f

    .line 931
    .line 932
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const/high16 v2, 0x41940000    # 18.5f

    .line 936
    .line 937
    const/high16 v4, 0x40e00000    # 7.0f

    .line 938
    .line 939
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const/high16 v2, 0x41a80000    # 21.0f

    .line 946
    .line 947
    const v4, 0x412b3333    # 10.7f

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const v2, -0x3ff33333    # -2.2f

    .line 954
    .line 955
    .line 956
    const v4, 0x3f7ae148    # 0.98f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v2, 0x4130a3d7    # 11.04f

    .line 963
    .line 964
    .line 965
    const/high16 v4, 0x41900000    # 18.0f

    .line 966
    .line 967
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v2, 0x411f5c29    # 9.96f

    .line 971
    .line 972
    .line 973
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const/high16 v2, 0x3f800000    # 1.0f

    .line 977
    .line 978
    const v4, -0x40b33333    # -0.8f

    .line 979
    .line 980
    .line 981
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const v2, 0x3ee147ae    # 0.44f

    .line 985
    .line 986
    .line 987
    const/high16 v4, 0x40000000    # 2.0f

    .line 988
    .line 989
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v2, 0x412b3333    # 10.7f

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1006
    .line 1007
    const/4 v7, 0x0

    .line 1008
    const-string v4, ""

    .line 1009
    .line 1010
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    sput-object v0, Landroidx/compose/material/icons/twotone/LandslideKt;->_landslide:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1019
    .line 1020
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    return-object v0
.end method
