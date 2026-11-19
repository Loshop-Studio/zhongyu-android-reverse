.class public final Lcom/zykj/view/utils/CustomColorManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/view/utils/CustomColorManager;",
        "",
        "<init>",
        "()V",
        "baseColorList",
        "",
        "",
        "getBaseColorList",
        "()Ljava/util/List;",
        "customColorList",
        "",
        "getCustomColorList",
        "customColorSet",
        "",
        "isColorExist",
        "",
        "color",
        "rebuildColorWithWhiteAlpha",
        "alpha",
        "",
        "rebuildColorWithBlackAlpha",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomColorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorManager.kt\ncom/zykj/view/utils/CustomColorManager\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n404#2:67\n404#2:68\n404#2:69\n404#2:70\n404#2:71\n404#2:72\n404#2:73\n404#2:74\n404#2:75\n404#2:76\n404#2:77\n404#2:78\n404#2:79\n1563#3:80\n1634#3,3:81\n*S KotlinDebug\n*F\n+ 1 CustomColorManager.kt\ncom/zykj/view/utils/CustomColorManager\n*L\n9#1:67\n10#1:68\n11#1:69\n12#1:70\n13#1:71\n14#1:72\n15#1:73\n16#1:74\n17#1:75\n18#1:76\n19#1:77\n20#1:78\n21#1:79\n24#1:80\n24#1:81,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/view/utils/CustomColorManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final baseColorList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final customColorList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final customColorSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lcom/zykj/view/utils/CustomColorManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/utils/CustomColorManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/view/utils/CustomColorManager;->INSTANCE:Lcom/zykj/view/utils/CustomColorManager;

    .line 7
    .line 8
    const-string v0, "#666666"

    .line 9
    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v0, "#FC2A2A"

    .line 19
    .line 20
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v0, "#FF7903"

    .line 29
    .line 30
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v0, "#FDBE00"

    .line 39
    .line 40
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v0, "#FF9700"

    .line 49
    .line 50
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v0, "#8AD600"

    .line 59
    .line 60
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const-string v0, "#47CC46"

    .line 69
    .line 70
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const-string v0, "#00C0CA"

    .line 79
    .line 80
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    const-string v0, "#00AAF0"

    .line 89
    .line 90
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    const-string v0, "#007DFE"

    .line 99
    .line 100
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    const-string v0, "#3E56EC"

    .line 109
    .line 110
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    const-string v0, "#892BE1"

    .line 119
    .line 120
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    const-string v0, "#E40079"

    .line 129
    .line 130
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    filled-new-array/range {v1 .. v13}, [Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lcom/zykj/view/utils/CustomColorManager;->baseColorList:Ljava/util/List;

    .line 147
    .line 148
    new-instance v1, Ljava/util/ArrayList;

    .line 149
    .line 150
    const/16 v2, 0xa

    .line 151
    .line 152
    invoke-static {v0, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_2

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    new-instance v3, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    const/16 v4, 0x14

    .line 185
    .line 186
    const/16 v5, 0x50

    .line 187
    .line 188
    const/16 v6, -0x14

    .line 189
    .line 190
    invoke-static {v5, v4, v6}, Lv7/l;->m(III)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const/16 v6, 0x64

    .line 195
    .line 196
    if-gt v4, v5, :cond_0

    .line 197
    .line 198
    :goto_1
    sget-object v7, Lcom/zykj/view/utils/CustomColorManager;->INSTANCE:Lcom/zykj/view/utils/CustomColorManager;

    .line 199
    .line 200
    int-to-float v8, v5

    .line 201
    int-to-float v9, v6

    .line 202
    div-float/2addr v8, v9

    .line 203
    invoke-direct {v7, v2, v8}, Lcom/zykj/view/utils/CustomColorManager;->rebuildColorWithWhiteAlpha(IF)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    if-eq v5, v4, :cond_0

    .line 215
    .line 216
    add-int/lit8 v5, v5, -0x14

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    const/16 v4, 0x3c

    .line 227
    .line 228
    const/16 v5, 0xf

    .line 229
    .line 230
    invoke-static {v5, v4, v5}, Lv7/l;->m(III)I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-gt v5, v4, :cond_1

    .line 235
    .line 236
    :goto_2
    sget-object v7, Lcom/zykj/view/utils/CustomColorManager;->INSTANCE:Lcom/zykj/view/utils/CustomColorManager;

    .line 237
    .line 238
    int-to-float v8, v5

    .line 239
    int-to-float v9, v6

    .line 240
    div-float/2addr v8, v9

    .line 241
    invoke-direct {v7, v2, v8}, Lcom/zykj/view/utils/CustomColorManager;->rebuildColorWithBlackAlpha(IF)I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    if-eq v5, v4, :cond_1

    .line 253
    .line 254
    add-int/lit8 v5, v5, 0xf

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_2
    sput-object v1, Lcom/zykj/view/utils/CustomColorManager;->customColorList:Ljava/util/List;

    .line 262
    .line 263
    new-instance v0, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    const/4 v3, 0x0

    .line 273
    :goto_3
    if-ge v3, v2, :cond_3

    .line 274
    .line 275
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    add-int/lit8 v3, v3, 0x1

    .line 280
    .line 281
    check-cast v4, Ljava/lang/Iterable;

    .line 282
    .line 283
    invoke-static {v4, v0}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_3
    invoke-static {v0}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    sput-object v0, Lcom/zykj/view/utils/CustomColorManager;->customColorSet:Ljava/util/Set;

    .line 292
    .line 293
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final rebuildColorWithBlackAlpha(IF)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-float v0, v0

    .line 14
    const/4 v2, 0x1

    .line 15
    int-to-float v2, v2

    .line 16
    sub-float/2addr v2, p2

    .line 17
    mul-float/2addr v0, v2

    .line 18
    float-to-int p2, v0

    .line 19
    int-to-float v0, v1

    .line 20
    mul-float/2addr v0, v2

    .line 21
    float-to-int v0, v0

    .line 22
    int-to-float p1, p1

    .line 23
    mul-float/2addr p1, v2

    .line 24
    float-to-int p1, p1

    .line 25
    invoke-static {p2, v0, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method private final rebuildColorWithWhiteAlpha(IF)I
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-float v0, v0

    .line 14
    const/4 v2, 0x1

    .line 15
    int-to-float v2, v2

    .line 16
    sub-float/2addr v2, p2

    .line 17
    mul-float/2addr v0, v2

    .line 18
    const/16 v3, 0xff

    .line 19
    .line 20
    int-to-float v3, v3

    .line 21
    mul-float/2addr v3, p2

    .line 22
    add-float/2addr v0, v3

    .line 23
    float-to-int p2, v0

    .line 24
    int-to-float v0, v1

    .line 25
    mul-float/2addr v0, v2

    .line 26
    add-float/2addr v0, v3

    .line 27
    float-to-int v0, v0

    .line 28
    int-to-float p1, p1

    .line 29
    mul-float/2addr p1, v2

    .line 30
    add-float/2addr p1, v3

    .line 31
    float-to-int p1, p1

    .line 32
    invoke-static {p2, v0, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method


# virtual methods
.method public final getBaseColorList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/utils/CustomColorManager;->baseColorList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCustomColorList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/utils/CustomColorManager;->customColorList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isColorExist(I)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/utils/CustomColorManager;->customColorSet:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
