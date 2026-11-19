.class public Ls/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/j;->d(Landroid/graphics/ImageDecoder$Source;IILj/d;)Lm/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lcom/bumptech/glide/load/DecodeFormat;

.field public final synthetic e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

.field public final synthetic f:Lcom/bumptech/glide/load/PreferredColorSpace;

.field public final synthetic g:Ls/j;


# direct methods
.method public constructor <init>(Ls/j;IIZLcom/bumptech/glide/load/DecodeFormat;Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lcom/bumptech/glide/load/PreferredColorSpace;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls/j$a;->g:Ls/j;

    .line 2
    .line 3
    iput p2, p0, Ls/j$a;->a:I

    .line 4
    .line 5
    iput p3, p0, Ls/j$a;->b:I

    .line 6
    .line 7
    iput-boolean p4, p0, Ls/j$a;->c:Z

    .line 8
    .line 9
    iput-object p5, p0, Ls/j$a;->d:Lcom/bumptech/glide/load/DecodeFormat;

    .line 10
    .line 11
    iput-object p6, p0, Ls/j$a;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 12
    .line 13
    iput-object p7, p0, Ls/j$a;->f:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 7

    .line 1
    iget-object p3, p0, Ls/j$a;->g:Ls/j;

    .line 2
    .line 3
    iget-object p3, p3, Ls/j;->a:Lt/v;

    .line 4
    .line 5
    iget v0, p0, Ls/j$a;->a:I

    .line 6
    .line 7
    iget v1, p0, Ls/j$a;->b:I

    .line 8
    .line 9
    iget-boolean v2, p0, Ls/j$a;->c:Z

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p3, v0, v1, v2, v3}, Lt/v;->c(IIZZ)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    const/4 p3, 0x3

    .line 20
    invoke-static {p1, p3}, Ls/b;->a(Landroid/graphics/ImageDecoder;I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p1, v0}, Ls/b;->a(Landroid/graphics/ImageDecoder;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, p0, Ls/j$a;->d:Lcom/bumptech/glide/load/DecodeFormat;

    .line 28
    .line 29
    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->b:Lcom/bumptech/glide/load/DecodeFormat;

    .line 30
    .line 31
    if-ne p3, v1, :cond_1

    .line 32
    .line 33
    invoke-static {p1, v3}, Ls/d;->a(Landroid/graphics/ImageDecoder;I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance p3, Ls/j$a$a;

    .line 37
    .line 38
    invoke-direct {p3, p0}, Ls/j$a$a;-><init>(Ls/j$a;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p3}, Ls/e;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Ls/f;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    iget v1, p0, Ls/j$a;->a:I

    .line 49
    .line 50
    const/high16 v2, -0x80000000

    .line 51
    .line 52
    if-ne v1, v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    :cond_2
    iget v4, p0, Ls/j$a;->b:I

    .line 59
    .line 60
    if-ne v4, v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    :cond_3
    iget-object v2, p0, Ls/j$a;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 67
    .line 68
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-virtual {v2, v5, v6, v1, v4}, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->b(IIII)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    int-to-float v2, v2

    .line 85
    mul-float/2addr v2, v1

    .line 86
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    int-to-float v4, v4

    .line 95
    mul-float/2addr v4, v1

    .line 96
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const-string v5, "ImageDecoder"

    .line 101
    .line 102
    const/4 v6, 0x2

    .line 103
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    new-instance v5, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v6, "Resizing from ["

    .line 115
    .line 116
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v6, "x"

    .line 127
    .line 128
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p3, "] to ["

    .line 139
    .line 140
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p3, "] scaleFactor: "

    .line 153
    .line 154
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    :cond_4
    invoke-static {p1, v2, v4}, Ls/g;->a(Landroid/graphics/ImageDecoder;II)V

    .line 161
    .line 162
    .line 163
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    const/16 v1, 0x1c

    .line 166
    .line 167
    if-lt p3, v1, :cond_7

    .line 168
    .line 169
    iget-object p3, p0, Ls/j$a;->f:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 170
    .line 171
    sget-object v1, Lcom/bumptech/glide/load/PreferredColorSpace;->b:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 172
    .line 173
    if-ne p3, v1, :cond_5

    .line 174
    .line 175
    invoke-static {p2}, Ls/h;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    if-eqz p3, :cond_5

    .line 180
    .line 181
    invoke-static {p2}, Ls/h;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p2}, Ls/i;->a(Landroid/graphics/ColorSpace;)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_5

    .line 190
    .line 191
    move v3, v0

    .line 192
    :cond_5
    if-eqz v3, :cond_6

    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/ui/graphics/p0;->a()Landroid/graphics/ColorSpace$Named;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    goto :goto_1

    .line 199
    :cond_6
    invoke-static {}, Landroidx/compose/ui/graphics/r0;->a()Landroid/graphics/ColorSpace$Named;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    :goto_1
    invoke-static {p2}, Landroidx/compose/ui/graphics/y0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-static {p1, p2}, Ls/c;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_7
    const/16 p2, 0x1a

    .line 212
    .line 213
    if-lt p3, p2, :cond_8

    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/r0;->a()Landroid/graphics/ColorSpace$Named;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-static {p2}, Landroidx/compose/ui/graphics/y0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-static {p1, p2}, Ls/c;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 224
    .line 225
    .line 226
    :cond_8
    :goto_2
    return-void
.end method
