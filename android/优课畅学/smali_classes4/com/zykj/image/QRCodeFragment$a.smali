.class public final Lcom/zykj/image/QRCodeFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/image/QRCodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/ImageProxy;)[B
    .locals 12

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x2

    .line 19
    div-int/2addr v2, v3

    .line 20
    add-int/2addr v1, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    aget-object v1, v1, v2

    .line 30
    .line 31
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v4, "image.planes[0].buffer"

    .line 36
    .line 37
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x1

    .line 45
    aget-object v4, v4, v5

    .line 46
    .line 47
    invoke-interface {v4}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v6, "image.planes[1].buffer"

    .line 52
    .line 53
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    aget-object v6, v6, v3

    .line 61
    .line 62
    invoke-interface {v6}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getBuffer()Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const-string v7, "image.planes[2].buffer"

    .line 67
    .line 68
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    mul-int/2addr v7, v8

    .line 80
    invoke-virtual {v1, v0, v2, v7}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    aget-object v1, v1, v5

    .line 88
    .line 89
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy$PlaneProxy;->getRowStride()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    div-int/2addr v7, v3

    .line 98
    sub-int/2addr v1, v7

    .line 99
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    mul-int/2addr v7, v8

    .line 108
    if-nez v1, :cond_0

    .line 109
    .line 110
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    mul-int/2addr v1, v2

    .line 119
    div-int/lit8 v1, v1, 0x4

    .line 120
    .line 121
    invoke-virtual {v4, v0, v7, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    mul-int/2addr v1, v2

    .line 133
    div-int/lit8 v1, v1, 0x4

    .line 134
    .line 135
    add-int/2addr v7, v1

    .line 136
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    mul-int/2addr v1, p1

    .line 145
    div-int/lit8 v1, v1, 0x4

    .line 146
    .line 147
    invoke-virtual {v6, v0, v7, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    div-int/2addr v8, v3

    .line 156
    if-lez v8, :cond_3

    .line 157
    .line 158
    move v9, v2

    .line 159
    :goto_0
    add-int/lit8 v10, v9, 0x1

    .line 160
    .line 161
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    div-int/2addr v11, v3

    .line 166
    invoke-virtual {v4, v0, v7, v11}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    div-int/2addr v11, v3

    .line 174
    add-int/2addr v7, v11

    .line 175
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    div-int/2addr v11, v3

    .line 180
    sub-int/2addr v11, v3

    .line 181
    if-ge v9, v11, :cond_1

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    add-int/2addr v9, v1

    .line 188
    invoke-virtual {v4, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 189
    .line 190
    .line 191
    :cond_1
    if-lt v10, v8, :cond_2

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_2
    move v9, v10

    .line 195
    goto :goto_0

    .line 196
    :cond_3
    :goto_1
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    div-int/2addr v4, v3

    .line 201
    if-lez v4, :cond_6

    .line 202
    .line 203
    :goto_2
    add-int/lit8 v8, v2, 0x1

    .line 204
    .line 205
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    div-int/2addr v9, v3

    .line 210
    invoke-virtual {v6, v0, v7, v9}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 211
    .line 212
    .line 213
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    div-int/2addr v9, v3

    .line 218
    add-int/2addr v7, v9

    .line 219
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    div-int/2addr v9, v3

    .line 224
    sub-int/2addr v9, v5

    .line 225
    if-ge v2, v9, :cond_4

    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    add-int/2addr v2, v1

    .line 232
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 233
    .line 234
    .line 235
    :cond_4
    if-lt v8, v4, :cond_5

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_5
    move v2, v8

    .line 239
    goto :goto_2

    .line 240
    :cond_6
    :goto_3
    return-object v0
.end method
