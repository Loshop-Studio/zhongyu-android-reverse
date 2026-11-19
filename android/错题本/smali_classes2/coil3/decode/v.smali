.class public final Lcoil3/decode/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic a:Lcoil3/decode/w;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public constructor <init>(Lcoil3/decode/w;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil3/decode/v;->a:Lcoil3/decode/w;

    iput-object p2, p0, Lcoil3/decode/v;->b:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 6

    .line 1
    invoke-static {p2}, Lcoil3/decode/s;->f(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Lcoil3/decode/v;->a:Lcoil3/decode/w;

    .line 14
    .line 15
    iget-object v0, v0, Lcoil3/decode/w;->c:Ls/l;

    .line 16
    .line 17
    iget-object v1, v0, Ls/l;->b:Lt/f;

    .line 18
    .line 19
    iget-object v2, v0, Ls/l;->c:Lcoil3/size/Scale;

    .line 20
    .line 21
    sget-object v3, Ls/g;->b:Lo2/a;

    .line 22
    .line 23
    invoke-static {v0, v3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lt/f;

    .line 28
    .line 29
    invoke-static {p3, p2, v1, v2, v0}, Ly1/a;->g(IILt/f;Lcoil3/size/Scale;Lt/f;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    const/16 v2, 0x20

    .line 34
    .line 35
    shr-long v2, v0, v2

    .line 36
    .line 37
    long-to-int v2, v2

    .line 38
    const-wide v3, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v0, v3

    .line 44
    long-to-int v0, v0

    .line 45
    const/4 v1, 0x1

    .line 46
    if-lez p3, :cond_3

    .line 47
    .line 48
    if-lez p2, :cond_3

    .line 49
    .line 50
    if-ne p3, v2, :cond_0

    .line 51
    .line 52
    if-eq p2, v0, :cond_3

    .line 53
    .line 54
    :cond_0
    iget-object v3, p0, Lcoil3/decode/v;->a:Lcoil3/decode/w;

    .line 55
    .line 56
    iget-object v3, v3, Lcoil3/decode/w;->c:Ls/l;

    .line 57
    .line 58
    iget-object v3, v3, Ls/l;->c:Lcoil3/size/Scale;

    .line 59
    .line 60
    invoke-static {p3, p2, v2, v0, v3}, Ly1/a;->h(IIIILcoil3/size/Scale;)D

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 65
    .line 66
    cmpg-double v0, v2, v4

    .line 67
    .line 68
    if-gez v0, :cond_1

    .line 69
    .line 70
    move v0, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, 0x0

    .line 73
    :goto_0
    iget-object v4, p0, Lcoil3/decode/v;->b:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 74
    .line 75
    iput-boolean v0, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Lcoil3/decode/v;->a:Lcoil3/decode/w;

    .line 80
    .line 81
    iget-object v0, v0, Lcoil3/decode/w;->c:Ls/l;

    .line 82
    .line 83
    iget-object v0, v0, Ls/l;->d:Lcoil3/size/Precision;

    .line 84
    .line 85
    sget-object v4, Lcoil3/size/Precision;->EXACT:Lcoil3/size/Precision;

    .line 86
    .line 87
    if-ne v0, v4, :cond_3

    .line 88
    .line 89
    :cond_2
    int-to-double v4, p3

    .line 90
    mul-double/2addr v4, v2

    .line 91
    invoke-static {v4, v5}, Lt6/a;->p(D)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    int-to-double v4, p2

    .line 96
    mul-double/2addr v2, v4

    .line 97
    invoke-static {v2, v3}, Lt6/a;->p(D)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-static {p1, p3, p2}, Lcoil3/decode/s;->h(Landroid/graphics/ImageDecoder;II)V

    .line 102
    .line 103
    .line 104
    :cond_3
    new-instance p2, Lcoil3/decode/t;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {p1, p2}, Lcoil3/decode/s;->j(Landroid/graphics/ImageDecoder;Lcoil3/decode/t;)V

    .line 110
    .line 111
    .line 112
    iget-object p2, p0, Lcoil3/decode/v;->a:Lcoil3/decode/w;

    .line 113
    .line 114
    iget-object p2, p2, Lcoil3/decode/w;->c:Ls/l;

    .line 115
    .line 116
    invoke-static {p2}, Ls/h;->b(Ls/l;)Landroid/graphics/Bitmap$Config;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-static {p3}, Lkotlin/collections/u;->x(Landroid/graphics/Bitmap$Config;)Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_4

    .line 125
    .line 126
    const/4 p3, 0x3

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    move p3, v1

    .line 129
    :goto_1
    invoke-static {p1, p3}, Lcoil3/decode/s;->g(Landroid/graphics/ImageDecoder;I)V

    .line 130
    .line 131
    .line 132
    sget-object p3, Ls/h;->g:Lo2/a;

    .line 133
    .line 134
    invoke-static {p2, p3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    check-cast p3, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    xor-int/2addr p3, v1

    .line 145
    invoke-static {p1, p3}, Lcoil3/decode/s;->n(Landroid/graphics/ImageDecoder;I)V

    .line 146
    .line 147
    .line 148
    sget-object p3, Ls/h;->c:Lo2/a;

    .line 149
    .line 150
    invoke-static {p2, p3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lokio/a;->b(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-static {p2, p3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-static {p3}, Lokio/a;->b(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    invoke-static {p1, p3}, Lcoil3/decode/s;->i(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    sget-object p3, Ls/h;->d:Lo2/a;

    .line 172
    .line 173
    invoke-static {p2, p3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    check-cast p2, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    xor-int/2addr p2, v1

    .line 184
    invoke-static {p1, p2}, Lcoil3/decode/s;->k(Landroid/graphics/ImageDecoder;Z)V

    .line 185
    .line 186
    .line 187
    return-void
.end method
