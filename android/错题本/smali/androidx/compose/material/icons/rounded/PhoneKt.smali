.class public final Landroidx/compose/material/icons/rounded/PhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Phone",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPhone",
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
        "SMAP\nPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/rounded/PhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/rounded/PhoneKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phone:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getPhone(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Rounded;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneKt;->_phone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.Phone"

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
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const v0, 0x417428f6    # 15.26f

    .line 66
    .line 67
    .line 68
    const v2, -0x3fdd70a4    # -2.54f

    .line 69
    .line 70
    .line 71
    const v4, 0x4199d70a    # 19.23f

    .line 72
    .line 73
    .line 74
    const v6, -0x416b851f    # -0.29f

    .line 75
    .line 76
    .line 77
    invoke-static {v4, v0, v2, v6}, Landroidx/compose/material3/c;->g(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    const v17, -0x402e147b    # -1.64f

    .line 82
    .line 83
    .line 84
    const v18, 0x3f11eb85    # 0.57f

    .line 85
    .line 86
    .line 87
    const v13, -0x40e3d70a    # -0.61f

    .line 88
    .line 89
    .line 90
    const v14, -0x4270a3d7    # -0.07f

    .line 91
    .line 92
    .line 93
    const v15, -0x40651eb8    # -1.21f

    .line 94
    .line 95
    .line 96
    const v16, 0x3e0f5c29    # 0.14f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x40147ae1    # -1.84f

    .line 103
    .line 104
    .line 105
    const v2, 0x3feb851f    # 1.84f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, -0x3f2d1eb8    # -6.59f

    .line 112
    .line 113
    .line 114
    const v18, -0x3f2d1eb8    # -6.59f

    .line 115
    .line 116
    .line 117
    const v13, -0x3fcae148    # -2.83f

    .line 118
    .line 119
    .line 120
    const v14, -0x4047ae14    # -1.44f

    .line 121
    .line 122
    .line 123
    const v15, -0x3f5b3333    # -5.15f

    .line 124
    .line 125
    .line 126
    const/high16 v16, -0x3f900000    # -3.75f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x3feccccd    # 1.85f

    .line 132
    .line 133
    .line 134
    const v2, -0x40133333    # -1.85f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3f11eb85    # 0.57f

    .line 141
    .line 142
    .line 143
    const v18, -0x402e147b    # -1.64f

    .line 144
    .line 145
    .line 146
    const v13, 0x3edc28f6    # 0.43f

    .line 147
    .line 148
    .line 149
    const v14, -0x4123d70a    # -0.43f

    .line 150
    .line 151
    .line 152
    const v15, 0x3f23d70a    # 0.64f

    .line 153
    .line 154
    .line 155
    const v16, -0x407c28f6    # -1.03f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x3fdeb852    # -2.52f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, -0x400147ae    # -1.99f

    .line 168
    .line 169
    .line 170
    const v18, -0x401d70a4    # -1.77f

    .line 171
    .line 172
    .line 173
    const v13, -0x420a3d71    # -0.12f

    .line 174
    .line 175
    .line 176
    const v14, -0x407eb852    # -1.01f

    .line 177
    .line 178
    .line 179
    const v15, -0x4087ae14    # -0.97f

    .line 180
    .line 181
    .line 182
    const v16, -0x401d70a4    # -1.77f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x40a0f5c3    # 5.03f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, -0x40000000    # -2.0f

    .line 195
    .line 196
    const v18, 0x40047ae1    # 2.07f

    .line 197
    .line 198
    .line 199
    const v13, -0x406f5c29    # -1.13f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, -0x3ffb851f    # -2.07f

    .line 204
    .line 205
    .line 206
    const v16, 0x3f70a3d7    # 0.94f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x417e3d71    # 15.89f

    .line 213
    .line 214
    .line 215
    const v18, 0x417e3d71    # 15.89f

    .line 216
    .line 217
    .line 218
    const v13, 0x3f07ae14    # 0.53f

    .line 219
    .line 220
    .line 221
    const v14, 0x4108a3d7    # 8.54f

    .line 222
    .line 223
    .line 224
    const v15, 0x40eb851f    # 7.36f

    .line 225
    .line 226
    .line 227
    const v16, 0x4175c28f    # 15.36f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x40047ae1    # 2.07f

    .line 234
    .line 235
    .line 236
    const/high16 v18, -0x40000000    # -2.0f

    .line 237
    .line 238
    const v13, 0x3f90a3d7    # 1.13f

    .line 239
    .line 240
    .line 241
    const v14, 0x3d8f5c29    # 0.07f

    .line 242
    .line 243
    .line 244
    const v15, 0x40047ae1    # 2.07f

    .line 245
    .line 246
    .line 247
    const v16, -0x40a147ae    # -0.87f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x40228f5c    # -1.73f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x401eb852    # -1.76f

    .line 260
    .line 261
    .line 262
    const v18, -0x40028f5c    # -1.98f

    .line 263
    .line 264
    .line 265
    const v13, 0x3c23d70a    # 0.01f

    .line 266
    .line 267
    .line 268
    const v14, -0x407eb852    # -1.01f

    .line 269
    .line 270
    .line 271
    const/high16 v15, -0x40c00000    # -0.75f

    .line 272
    .line 273
    const v16, -0x4011eb85    # -1.86f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/16 v16, 0x3800

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const-string v4, ""

    .line 291
    .line 292
    const/high16 v6, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/high16 v8, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v9, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v12, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneKt;->_phone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 313
    .line 314
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    return-object v0
.end method
