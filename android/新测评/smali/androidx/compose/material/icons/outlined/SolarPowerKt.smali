.class public final Landroidx/compose/material/icons/outlined/SolarPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_solarPower",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SolarPower",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSolarPower",
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
        "SMAP\nSolarPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SolarPower.kt\nandroidx/compose/material/icons/outlined/SolarPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n233#2,18:202\n253#2:239\n233#2,18:240\n253#2:277\n233#2,18:278\n253#2:315\n233#2,18:316\n253#2:353\n233#2,18:354\n253#2:391\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n705#4,2:220\n717#4,2:222\n719#4,11:228\n705#4,2:258\n717#4,2:260\n719#4,11:266\n705#4,2:296\n717#4,2:298\n719#4,11:304\n705#4,2:334\n717#4,2:336\n719#4,11:342\n705#4,2:372\n717#4,2:374\n719#4,11:380\n72#5,4:148\n72#5,4:186\n72#5,4:224\n72#5,4:262\n72#5,4:300\n72#5,4:338\n72#5,4:376\n*S KotlinDebug\n*F\n+ 1 SolarPower.kt\nandroidx/compose/material/icons/outlined/SolarPowerKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n62#1:164,18\n62#1:201\n69#1:202,18\n69#1:239\n76#1:240,18\n76#1:277\n83#1:278,18\n83#1:315\n90#1:316,18\n90#1:353\n97#1:354,18\n97#1:391\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n62#1:182,2\n62#1:184,2\n62#1:190,11\n69#1:220,2\n69#1:222,2\n69#1:228,11\n76#1:258,2\n76#1:260,2\n76#1:266,11\n83#1:296,2\n83#1:298,2\n83#1:304,11\n90#1:334,2\n90#1:336,2\n90#1:342,11\n97#1:372,2\n97#1:374,2\n97#1:380,11\n30#1:148,4\n62#1:186,4\n69#1:224,4\n76#1:262,4\n83#1:300,4\n90#1:338,4\n97#1:376,4\n*E\n"
    }
.end annotation


# static fields
.field private static _solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSolarPower(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SolarPowerKt;->_solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SolarPower"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41b00000    # 22.0f

    .line 83
    .line 84
    const/high16 v6, 0x40000000    # 2.0f

    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x41a00000    # 20.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41400000    # 12.0f

    .line 95
    .line 96
    const/high16 v6, 0x41a00000    # 20.0f

    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41600000    # 14.0f

    .line 105
    .line 106
    const v6, 0x4192e148    # 18.36f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x3ecccccd    # 0.4f

    .line 113
    .line 114
    .line 115
    const/high16 v6, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41500000    # 13.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, -0x40000000    # -2.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x4192e148    # 18.36f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41600000    # 14.0f

    .line 140
    .line 141
    const/high16 v6, 0x41300000    # 11.0f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40000000    # 2.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40a7ae14    # 5.24f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x3ecccccd    # 0.4f

    .line 158
    .line 159
    .line 160
    const/high16 v6, -0x40000000    # -2.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41300000    # 11.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x409ae148    # 4.84f

    .line 174
    .line 175
    .line 176
    const/high16 v6, 0x41900000    # 18.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41300000    # 11.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x408e147b    # 4.44f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x409ae148    # 4.84f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41500000    # 13.0f

    .line 207
    .line 208
    const/high16 v6, 0x41a00000    # 20.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, -0x40000000    # -2.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x40c51eb8    # 6.16f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x3ecccccd    # 0.4f

    .line 225
    .line 226
    .line 227
    const/high16 v6, 0x40000000    # 2.0f

    .line 228
    .line 229
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x41500000    # 13.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const/16 v16, 0x3800

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const/high16 v6, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v8, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41000000    # 8.0f

    .line 293
    .line 294
    const/high16 v6, 0x41300000    # 11.0f

    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x40000000    # 2.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x40400000    # 3.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, -0x40000000    # -2.0f

    .line 310
    .line 311
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/high16 v6, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/4 v7, 0x0

    .line 324
    const-string v4, ""

    .line 325
    .line 326
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 327
    .line 328
    .line 329
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 334
    .line 335
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 336
    .line 337
    .line 338
    move-result-wide v6

    .line 339
    const/4 v2, 0x0

    .line 340
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 354
    .line 355
    .line 356
    const v4, 0x417c3958    # 15.764f

    .line 357
    .line 358
    .line 359
    const v6, 0x40e68f5c    # 7.205f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, -0x404b020c    # -1.414f

    .line 366
    .line 367
    .line 368
    const v6, 0x3fb4fdf4    # 1.414f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x4007be77    # 2.121f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, -0x404b020c    # -1.414f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    const-string v4, ""

    .line 397
    .line 398
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 399
    .line 400
    .line 401
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 406
    .line 407
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 408
    .line 409
    .line 410
    move-result-wide v6

    .line 411
    const/4 v2, 0x0

    .line 412
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 420
    .line 421
    .line 422
    move-result v11

    .line 423
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 426
    .line 427
    .line 428
    const v4, 0x40968f5c    # 4.705f

    .line 429
    .line 430
    .line 431
    const v6, 0x40fd374c    # 7.913f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v4, -0x3ff84189    # -2.121f

    .line 438
    .line 439
    .line 440
    const v6, 0x4007be77    # 2.121f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v4, 0x3fb4fdf4    # 1.414f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, -0x3ff84189    # -2.121f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/high16 v6, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/4 v7, 0x0

    .line 468
    const-string v4, ""

    .line 469
    .line 470
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 478
    .line 479
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 480
    .line 481
    .line 482
    move-result-wide v6

    .line 483
    const/4 v2, 0x0

    .line 484
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x40400000    # 3.0f

    .line 501
    .line 502
    const/high16 v6, 0x40000000    # 2.0f

    .line 503
    .line 504
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x40000000    # 2.0f

    .line 511
    .line 512
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/high16 v6, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v7, 0x0

    .line 530
    const-string v4, ""

    .line 531
    .line 532
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 533
    .line 534
    .line 535
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 540
    .line 541
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 542
    .line 543
    .line 544
    move-result-wide v6

    .line 545
    const/4 v2, 0x0

    .line 546
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 550
    .line 551
    .line 552
    move-result v10

    .line 553
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x41900000    # 18.0f

    .line 563
    .line 564
    const/high16 v6, 0x40000000    # 2.0f

    .line 565
    .line 566
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x40400000    # 3.0f

    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, 0x40000000    # 2.0f

    .line 575
    .line 576
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/high16 v6, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 606
    .line 607
    .line 608
    move-result-wide v6

    .line 609
    const/4 v0, 0x0

    .line 610
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 614
    .line 615
    .line 616
    move-result v10

    .line 617
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x40e00000    # 7.0f

    .line 627
    .line 628
    const/high16 v2, 0x41400000    # 12.0f

    .line 629
    .line 630
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x40a00000    # 5.0f

    .line 634
    .line 635
    const/high16 v18, -0x3f600000    # -5.0f

    .line 636
    .line 637
    const v13, 0x4030a3d7    # 2.76f

    .line 638
    .line 639
    .line 640
    const/high16 v15, 0x40a00000    # 5.0f

    .line 641
    .line 642
    const v16, -0x3ff0a3d7    # -2.24f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, -0x40000000    # -2.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 654
    .line 655
    const/high16 v18, 0x40400000    # 3.0f

    .line 656
    .line 657
    const/4 v13, 0x0

    .line 658
    const v14, 0x3fd33333    # 1.65f

    .line 659
    .line 660
    .line 661
    const v15, -0x40533333    # -1.35f

    .line 662
    .line 663
    .line 664
    const/high16 v16, 0x40400000    # 3.0f

    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x4069999a    # 3.65f

    .line 670
    .line 671
    .line 672
    const/high16 v2, 0x41100000    # 9.0f

    .line 673
    .line 674
    const/high16 v4, 0x40000000    # 2.0f

    .line 675
    .line 676
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, 0x40e00000    # 7.0f

    .line 680
    .line 681
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, 0x41400000    # 12.0f

    .line 685
    .line 686
    const/high16 v18, 0x40e00000    # 7.0f

    .line 687
    .line 688
    const/high16 v13, 0x40e00000    # 7.0f

    .line 689
    .line 690
    const v14, 0x409851ec    # 4.76f

    .line 691
    .line 692
    .line 693
    const v15, 0x4113d70a    # 9.24f

    .line 694
    .line 695
    .line 696
    const/high16 v16, 0x40e00000    # 7.0f

    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    const/16 v16, 0x3800

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const/high16 v6, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/4 v7, 0x0

    .line 715
    const/high16 v12, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/4 v13, 0x0

    .line 718
    const/4 v14, 0x0

    .line 719
    const/4 v15, 0x0

    .line 720
    const-string v4, ""

    .line 721
    .line 722
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    sput-object v0, Landroidx/compose/material/icons/outlined/SolarPowerKt;->_solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 731
    .line 732
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    return-object v0
.end method
