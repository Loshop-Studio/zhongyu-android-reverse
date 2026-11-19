.class public final Landroidx/compose/material/icons/sharp/BuildKt;
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
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getBuild",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n122#2:50\n116#2,3:51\n119#2,3:55\n132#2,18:58\n152#2:95\n175#3:54\n694#4,2:76\n706#4,2:78\n708#4,11:84\n53#5,4:80\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n*L\n29#1:50\n29#1:51,3\n29#1:55,3\n30#1:58,18\n30#1:95\n29#1:54\n30#1:76,2\n30#1:78,2\n30#1:84,11\n30#1:80,4\n*E\n"
    }
.end annotation


# static fields
.field private static _build:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuild(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/sharp/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Build"

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
    const v0, 0x408ae148    # 4.34f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 130
    .line 131
    const/high16 v1, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, -0x3f751eb8    # -4.34f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v1, 0x3ef5c28f    # 0.48f

    .line 143
    .line 144
    .line 145
    const v2, 0x40e33333    # 7.1f

    .line 146
    .line 147
    .line 148
    const v3, 0x3f63d70a    # 0.89f

    .line 149
    .line 150
    .line 151
    const v4, 0x412170a4    # 10.09f

    .line 152
    .line 153
    .line 154
    const v5, 0x4039999a    # 2.9f

    .line 155
    .line 156
    .line 157
    const v6, 0x4141999a    # 12.1f

    .line 158
    .line 159
    .line 160
    move-object v0, v7

    .line 161
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v1, 0x3fee147b    # 1.86f

    .line 165
    .line 166
    .line 167
    const v2, 0x3fee147b    # 1.86f

    .line 168
    .line 169
    .line 170
    const v3, 0x40928f5c    # 4.58f

    .line 171
    .line 172
    .line 173
    const v4, 0x40166666    # 2.35f

    .line 174
    .line 175
    .line 176
    const v5, 0x40dc7ae1    # 6.89f

    .line 177
    .line 178
    .line 179
    const v6, 0x3fbd70a4    # 1.48f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x411d1eb8    # 9.82f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x406d70a4    # 3.71f

    .line 192
    .line 193
    .line 194
    const v1, -0x3f928f5c    # -3.71f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, -0x3ee3851f    # -9.78f

    .line 201
    .line 202
    .line 203
    const v1, -0x3ee35c29    # -9.79f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v1, 0x3f6b851f    # 0.92f

    .line 210
    .line 211
    .line 212
    const v2, -0x3fea3d71    # -2.34f

    .line 213
    .line 214
    .line 215
    const v3, 0x3ee147ae    # 0.44f

    .line 216
    .line 217
    .line 218
    const v4, -0x3f5ccccd    # -5.1f

    .line 219
    .line 220
    .line 221
    const v5, -0x40466666    # -1.45f

    .line 222
    .line 223
    .line 224
    const v6, -0x3f2051ec    # -6.99f

    .line 225
    .line 226
    .line 227
    move-object v0, v7

    .line 228
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    const/16 v25, 0x0

    .line 239
    .line 240
    const/16 v26, 0x0

    .line 241
    .line 242
    const/16 v27, 0x0

    .line 243
    .line 244
    const/16 v28, 0x3800

    .line 245
    .line 246
    const/16 v29, 0x0

    .line 247
    .line 248
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    sput-object v0, Landroidx/compose/material/icons/sharp/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 257
    .line 258
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-object v0
.end method
