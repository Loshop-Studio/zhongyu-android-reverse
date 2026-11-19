.class public final Landroidx/compose/material/icons/filled/HdrAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hdrAuto",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HdrAuto",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getHdrAuto",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nHdrAuto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HdrAuto.kt\nandroidx/compose/material/icons/filled/HdrAutoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n233#2,18:112\n253#2:149\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n705#4,2:130\n717#4,2:132\n719#4,11:138\n72#5,4:96\n72#5,4:134\n*S KotlinDebug\n*F\n+ 1 HdrAuto.kt\nandroidx/compose/material/icons/filled/HdrAutoKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n37#1:112,18\n37#1:149\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n37#1:130,2\n37#1:132,2\n37#1:138,11\n30#1:96,4\n37#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hdrAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrAuto(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 21

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/HdrAutoKt;->_hdrAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.HdrAuto"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x4140a3d7    # 12.04f

    .line 71
    .line 72
    .line 73
    const v7, 0x4100a3d7    # 8.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v6, -0x4247ae14    # -0.09f

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v6, -0x40333333    # -1.6f

    .line 87
    .line 88
    .line 89
    const v8, 0x4091999a    # 4.55f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v6, 0x40528f5c    # 3.29f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const/16 v16, 0x3800

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    move-object v6, v2

    .line 113
    move-object v2, v4

    .line 114
    const-string v4, ""

    .line 115
    .line 116
    move-object v7, v6

    .line 117
    const/high16 v6, 0x3f800000    # 1.0f

    .line 118
    .line 119
    move-object v8, v7

    .line 120
    const/4 v7, 0x0

    .line 121
    move-object v9, v8

    .line 122
    const/high16 v8, 0x3f800000    # 1.0f

    .line 123
    .line 124
    move-object v12, v9

    .line 125
    const/high16 v9, 0x3f800000    # 1.0f

    .line 126
    .line 127
    move-object v13, v12

    .line 128
    const/high16 v12, 0x3f800000    # 1.0f

    .line 129
    .line 130
    move-object v14, v13

    .line 131
    const/4 v13, 0x0

    .line 132
    move-object v15, v14

    .line 133
    const/4 v14, 0x0

    .line 134
    move-object/from16 v20, v15

    .line 135
    .line 136
    const/4 v15, 0x0

    .line 137
    move-object/from16 p0, v0

    .line 138
    .line 139
    move-object/from16 v0, v20

    .line 140
    .line 141
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 142
    .line 143
    .line 144
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 149
    .line 150
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41400000    # 12.0f

    .line 171
    .line 172
    const/high16 v2, 0x40000000    # 2.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x40000000    # 2.0f

    .line 178
    .line 179
    const/high16 v18, 0x41400000    # 12.0f

    .line 180
    .line 181
    const v13, 0x40cf5c29    # 6.48f

    .line 182
    .line 183
    .line 184
    const/high16 v14, 0x40000000    # 2.0f

    .line 185
    .line 186
    const/high16 v15, 0x40000000    # 2.0f

    .line 187
    .line 188
    const v16, 0x40cf5c29    # 6.48f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x408f5c29    # 4.48f

    .line 195
    .line 196
    .line 197
    const/high16 v6, 0x41200000    # 10.0f

    .line 198
    .line 199
    invoke-virtual {v12, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, -0x3f70a3d7    # -4.48f

    .line 203
    .line 204
    .line 205
    const/high16 v7, -0x3ee00000    # -10.0f

    .line 206
    .line 207
    invoke-virtual {v12, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, 0x418c28f6    # 17.52f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x41880000    # 17.0f

    .line 220
    .line 221
    const v2, 0x41735c29    # 15.21f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, -0x40851eb8    # -0.98f

    .line 228
    .line 229
    .line 230
    const v4, -0x3fcc28f6    # -2.81f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x411c7ae1    # 9.78f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, -0x40800000    # -1.0f

    .line 243
    .line 244
    const v4, 0x4033d70a    # 2.81f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x400ccccd    # -1.9f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 257
    .line 258
    const v4, 0x408428f6    # 4.13f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x3ffc28f6    # 1.97f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41300000    # 11.0f

    .line 271
    .line 272
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const/16 v16, 0x3800

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    const-string v4, ""

    .line 290
    .line 291
    const/high16 v6, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    const/high16 v12, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sput-object v0, Landroidx/compose/material/icons/filled/HdrAutoKt;->_hdrAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 308
    .line 309
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-object v0
.end method
