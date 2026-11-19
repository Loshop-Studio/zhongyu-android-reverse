.class public Lq0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq0/d;->d(Landroid/graphics/ImageDecoder$Source;IILh0/d;)Lk0/j;
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

.field public final synthetic g:Lq0/d;


# direct methods
.method public constructor <init>(Lq0/d;IIZLcom/bumptech/glide/load/DecodeFormat;Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lcom/bumptech/glide/load/PreferredColorSpace;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/d$a;->g:Lq0/d;

    .line 2
    .line 3
    iput p2, p0, Lq0/d$a;->a:I

    .line 4
    .line 5
    iput p3, p0, Lq0/d$a;->b:I

    .line 6
    .line 7
    iput-boolean p4, p0, Lq0/d$a;->c:Z

    .line 8
    .line 9
    iput-object p5, p0, Lq0/d$a;->d:Lcom/bumptech/glide/load/DecodeFormat;

    .line 10
    .line 11
    iput-object p6, p0, Lq0/d$a;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 12
    .line 13
    iput-object p7, p0, Lq0/d$a;->f:Lcom/bumptech/glide/load/PreferredColorSpace;

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
    .locals 5

    .line 1
    iget-object p3, p0, Lq0/d$a;->g:Lq0/d;

    .line 2
    .line 3
    iget-object p3, p3, Lq0/d;->a:Lr0/s;

    .line 4
    .line 5
    iget v0, p0, Lq0/d$a;->a:I

    .line 6
    .line 7
    iget v1, p0, Lq0/d$a;->b:I

    .line 8
    .line 9
    iget-boolean v2, p0, Lq0/d$a;->c:Z

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p3, v0, v1, v2, v3}, Lr0/s;->c(IIZZ)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    const/4 p3, 0x3

    .line 19
    invoke-static {p1, p3}, Ln/w;->a(Landroid/graphics/ImageDecoder;I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p3, 0x1

    .line 24
    invoke-static {p1, p3}, Ln/w;->a(Landroid/graphics/ImageDecoder;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, p0, Lq0/d$a;->d:Lcom/bumptech/glide/load/DecodeFormat;

    .line 28
    .line 29
    sget-object v0, Lcom/bumptech/glide/load/DecodeFormat;->b:Lcom/bumptech/glide/load/DecodeFormat;

    .line 30
    .line 31
    if-ne p3, v0, :cond_1

    .line 32
    .line 33
    invoke-static {p1, v3}, Ln/x;->a(Landroid/graphics/ImageDecoder;I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance p3, Lq0/d$a$a;

    .line 37
    .line 38
    invoke-direct {p3, p0}, Lq0/d$a$a;-><init>(Lq0/d$a;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p3}, Ln/v;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Ln/b0;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    iget v0, p0, Lq0/d$a;->a:I

    .line 49
    .line 50
    const/high16 v1, -0x80000000

    .line 51
    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :cond_2
    iget v2, p0, Lq0/d$a;->b:I

    .line 59
    .line 60
    if-ne v2, v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :cond_3
    iget-object v1, p0, Lq0/d$a;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 67
    .line 68
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v1, v3, v4, v0, v2}, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->b(IIII)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    int-to-float v1, v1

    .line 85
    mul-float/2addr v1, v0

    .line 86
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    int-to-float v2, v2

    .line 95
    mul-float/2addr v0, v2

    .line 96
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const-string v2, "ImageDecoder"

    .line 101
    .line 102
    const/4 v3, 0x2

    .line 103
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 113
    .line 114
    .line 115
    :cond_4
    invoke-static {p1, v1, v0}, Ln/c0;->a(Landroid/graphics/ImageDecoder;II)V

    .line 116
    .line 117
    .line 118
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    const/16 v0, 0x1c

    .line 121
    .line 122
    if-lt p3, v0, :cond_6

    .line 123
    .line 124
    iget-object p3, p0, Lq0/d$a;->f:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 125
    .line 126
    sget-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->b:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 127
    .line 128
    if-ne p3, v0, :cond_5

    .line 129
    .line 130
    invoke-static {p2}, Lq0/b;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    if-eqz p3, :cond_5

    .line 135
    .line 136
    invoke-static {p2}, Lq0/b;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Lq0/c;->a(Landroid/graphics/ColorSpace;)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-eqz p2, :cond_5

    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/ui/graphics/n2;->a()Landroid/graphics/ColorSpace$Named;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    goto :goto_1

    .line 151
    :cond_5
    invoke-static {}, Landroidx/compose/ui/graphics/t1;->a()Landroid/graphics/ColorSpace$Named;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    :goto_1
    invoke-static {p2}, Landroidx/compose/ui/graphics/j2;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {p1, p2}, Ln/y;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_6
    const/16 p2, 0x1a

    .line 164
    .line 165
    if-lt p3, p2, :cond_7

    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/t1;->a()Landroid/graphics/ColorSpace$Named;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-static {p2}, Landroidx/compose/ui/graphics/j2;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-static {p1, p2}, Ln/y;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    return-void
.end method
