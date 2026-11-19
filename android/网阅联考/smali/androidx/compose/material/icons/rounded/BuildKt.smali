.class public final Landroidx/compose/material/icons/rounded/BuildKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_build",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Build",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBuild",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/rounded/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,52:1\n122#2:53\n116#2,3:54\n119#2,3:58\n132#2,18:61\n152#2:98\n175#3:57\n694#4,2:79\n706#4,2:81\n708#4,11:87\n53#5,4:83\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/rounded/BuildKt\n*L\n29#1:53\n29#1:54,3\n29#1:58,3\n30#1:61,18\n30#1:98\n29#1:57\n30#1:79,2\n30#1:81,2\n30#1:87,11\n30#1:83,4\n*E\n"
    }
.end annotation


# static fields
.field private static _build:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuild(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/rounded/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Rounded.Build"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x414170a4    # 12.09f

    .line 93
    .line 94
    .line 95
    const v1, 0x403a3d71    # 2.91f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, 0x412147ae    # 10.08f

    .line 102
    .line 103
    .line 104
    const v2, 0x3f666666    # 0.9f

    .line 105
    .line 106
    .line 107
    const v3, 0x40e23d71    # 7.07f

    .line 108
    .line 109
    .line 110
    const v4, 0x3efae148    # 0.49f

    .line 111
    .line 112
    .line 113
    const v5, 0x4094cccd    # 4.65f

    .line 114
    .line 115
    .line 116
    const v6, 0x3fd5c28f    # 1.67f

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x41047ae1    # 8.28f

    .line 124
    .line 125
    .line 126
    const v1, 0x40a9999a    # 5.3f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v1, 0x3ec7ae14    # 0.39f

    .line 133
    .line 134
    .line 135
    const v2, 0x3ec7ae14    # 0.39f

    .line 136
    .line 137
    .line 138
    const v3, 0x3ec7ae14    # 0.39f

    .line 139
    .line 140
    .line 141
    const v4, 0x3f828f5c    # 1.02f

    .line 142
    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    const v6, 0x3fb47ae1    # 1.41f

    .line 146
    .line 147
    .line 148
    move-object v0, v7

    .line 149
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x40d6147b    # 6.69f

    .line 153
    .line 154
    .line 155
    const v1, 0x4104cccd    # 8.3f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v1, -0x413851ec    # -0.39f

    .line 162
    .line 163
    .line 164
    const v2, 0x3ecccccd    # 0.4f

    .line 165
    .line 166
    .line 167
    const v3, -0x407d70a4    # -1.02f

    .line 168
    .line 169
    .line 170
    const v4, 0x3ecccccd    # 0.4f

    .line 171
    .line 172
    .line 173
    const v5, -0x404b851f    # -1.41f

    .line 174
    .line 175
    .line 176
    const/4 v6, 0x0

    .line 177
    move-object v0, v7

    .line 178
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3fd33333    # 1.65f

    .line 182
    .line 183
    .line 184
    const v1, 0x409570a4    # 4.67f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v1, 0x3ef5c28f    # 0.48f

    .line 191
    .line 192
    .line 193
    const v2, 0x40e33333    # 7.1f

    .line 194
    .line 195
    .line 196
    const v3, 0x3f63d70a    # 0.89f

    .line 197
    .line 198
    .line 199
    const v4, 0x412170a4    # 10.09f

    .line 200
    .line 201
    .line 202
    const v5, 0x4039999a    # 2.9f

    .line 203
    .line 204
    .line 205
    const v6, 0x4141999a    # 12.1f

    .line 206
    .line 207
    .line 208
    move-object v0, v7

    .line 209
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v1, 0x3fee147b    # 1.86f

    .line 213
    .line 214
    .line 215
    const v2, 0x3fee147b    # 1.86f

    .line 216
    .line 217
    .line 218
    const v3, 0x40928f5c    # 4.58f

    .line 219
    .line 220
    .line 221
    const v4, 0x40166666    # 2.35f

    .line 222
    .line 223
    .line 224
    const v5, 0x40dc7ae1    # 6.89f

    .line 225
    .line 226
    .line 227
    const v6, 0x3fbd70a4    # 1.48f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40feb852    # 7.96f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v1, 0x3f83d70a    # 1.03f

    .line 240
    .line 241
    .line 242
    const v2, 0x3f83d70a    # 1.03f

    .line 243
    .line 244
    .line 245
    const v3, 0x402c28f6    # 2.69f

    .line 246
    .line 247
    .line 248
    const v4, 0x3f83d70a    # 1.03f

    .line 249
    .line 250
    .line 251
    const v5, 0x406d70a4    # 3.71f

    .line 252
    .line 253
    .line 254
    const/4 v6, 0x0

    .line 255
    move-object v0, v7

    .line 256
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v2, -0x407c28f6    # -1.03f

    .line 260
    .line 261
    .line 262
    const v3, 0x3f83d70a    # 1.03f

    .line 263
    .line 264
    .line 265
    const v4, -0x3fd3d70a    # -2.69f

    .line 266
    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    const v6, -0x3f928f5c    # -3.71f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x4158a3d7    # 13.54f

    .line 276
    .line 277
    .line 278
    const v1, 0x411e6666    # 9.9f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v1, 0x3f6b851f    # 0.92f

    .line 285
    .line 286
    .line 287
    const v2, -0x3fea3d71    # -2.34f

    .line 288
    .line 289
    .line 290
    const v3, 0x3ee147ae    # 0.44f

    .line 291
    .line 292
    .line 293
    const v4, -0x3f5ccccd    # -5.1f

    .line 294
    .line 295
    .line 296
    const v5, -0x40466666    # -1.45f

    .line 297
    .line 298
    .line 299
    const v6, -0x3f2051ec    # -6.99f

    .line 300
    .line 301
    .line 302
    move-object v0, v7

    .line 303
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    const/16 v25, 0x0

    .line 314
    .line 315
    const/16 v26, 0x0

    .line 316
    .line 317
    const/16 v27, 0x0

    .line 318
    .line 319
    const/16 v28, 0x3800

    .line 320
    .line 321
    const/16 v29, 0x0

    .line 322
    .line 323
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sput-object v0, Landroidx/compose/material/icons/rounded/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 332
    .line 333
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    return-object v0
.end method
