.class public final Lj4/a;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj4/a$a;
    }
.end annotation


# static fields
.field public static final o:Lj4/a$a;

.field public static final p:I


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Landroid/graphics/Bitmap;

.field public c:Landroid/graphics/Rect;

.field public d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public final g:Landroid/graphics/Paint;

.field public final h:F

.field public i:F

.field public j:F

.field public k:I

.field public final l:F

.field public final m:I

.field public n:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj4/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lj4/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj4/a;->o:Lj4/a$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lj4/a;->p:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    const-string p1, "MyFloatingToolService-cropRectView"

    iput-object p1, p0, Lj4/a;->a:Ljava/lang/String;

    .line 4
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 5
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    const/4 p3, -0x1

    .line 7
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x40a00000    # 5.0f

    .line 9
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 10
    iput-object p1, p0, Lj4/a;->e:Landroid/graphics/Paint;

    .line 11
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 12
    const-string v2, "#99000000"

    .line 13
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 14
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    iput-object p1, p0, Lj4/a;->f:Landroid/graphics/Paint;

    .line 17
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 18
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 21
    iput-object p1, p0, Lj4/a;->g:Landroid/graphics/Paint;

    const/high16 p1, 0x42480000    # 50.0f

    .line 22
    iput p1, p0, Lj4/a;->h:F

    .line 23
    iput p1, p0, Lj4/a;->l:F

    const/16 p1, 0x64

    .line 24
    iput p1, p0, Lj4/a;->m:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lj4/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(FF)I
    .locals 7

    .line 1
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 7
    .line 8
    int-to-float v2, v2

    .line 9
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 10
    .line 11
    int-to-float v3, v3

    .line 12
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    sub-float v1, p1, v1

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget v4, p0, Lj4/a;->l:F

    .line 22
    .line 23
    cmpg-float v1, v1, v4

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-gez v1, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v4

    .line 32
    :goto_0
    sub-float v2, p2, v2

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget v6, p0, Lj4/a;->l:F

    .line 39
    .line 40
    cmpg-float v2, v2, v6

    .line 41
    .line 42
    if-gez v2, :cond_1

    .line 43
    .line 44
    move v2, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v2, v4

    .line 47
    :goto_1
    sub-float v3, p1, v3

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget v6, p0, Lj4/a;->l:F

    .line 54
    .line 55
    cmpg-float v3, v3, v6

    .line 56
    .line 57
    if-gez v3, :cond_2

    .line 58
    .line 59
    move v3, v5

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v3, v4

    .line 62
    :goto_2
    sub-float v0, p2, v0

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v6, p0, Lj4/a;->l:F

    .line 69
    .line 70
    cmpg-float v0, v0, v6

    .line 71
    .line 72
    if-gez v0, :cond_3

    .line 73
    .line 74
    move v0, v5

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move v0, v4

    .line 77
    :goto_3
    if-eqz v1, :cond_4

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    const/4 p1, 0x6

    .line 82
    return p1

    .line 83
    :cond_4
    if-eqz v3, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    const/4 p1, 0x7

    .line 88
    return p1

    .line 89
    :cond_5
    if-eqz v1, :cond_6

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    const/16 p1, 0x8

    .line 94
    .line 95
    return p1

    .line 96
    :cond_6
    if-eqz v3, :cond_7

    .line 97
    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    const/16 p1, 0x9

    .line 101
    .line 102
    return p1

    .line 103
    :cond_7
    if-eqz v1, :cond_8

    .line 104
    .line 105
    const/4 p1, 0x2

    .line 106
    return p1

    .line 107
    :cond_8
    if-eqz v2, :cond_9

    .line 108
    .line 109
    const/4 p1, 0x3

    .line 110
    return p1

    .line 111
    :cond_9
    if-eqz v3, :cond_a

    .line 112
    .line 113
    const/4 p1, 0x4

    .line 114
    return p1

    .line 115
    :cond_a
    if-eqz v0, :cond_b

    .line 116
    .line 117
    const/4 p1, 0x5

    .line 118
    return p1

    .line 119
    :cond_b
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 120
    .line 121
    float-to-int p1, p1

    .line 122
    float-to-int p2, p2

    .line 123
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_c

    .line 128
    .line 129
    return v5

    .line 130
    :cond_c
    return v4
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lj4/a;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "\u5185\u5bb9\u8fb9\u754c\u672a\u8bbe\u7f6e"

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 34
    .line 35
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    if-ge v2, v3, :cond_1

    .line 40
    .line 41
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 42
    .line 43
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 47
    .line 48
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 49
    .line 50
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    if-ge v2, v3, :cond_2

    .line 53
    .line 54
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    if-le v2, v3, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    sub-int/2addr v3, v2

    .line 72
    iget-object v2, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 73
    .line 74
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 75
    .line 76
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 80
    .line 81
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 82
    .line 83
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    if-le v2, v3, :cond_4

    .line 86
    .line 87
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    sub-int/2addr v3, v4

    .line 94
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    iget v2, p0, Lj4/a;->m:I

    .line 104
    .line 105
    const/4 v3, 0x6

    .line 106
    if-ge v1, v2, :cond_7

    .line 107
    .line 108
    iget v1, p0, Lj4/a;->k:I

    .line 109
    .line 110
    const/4 v4, 0x2

    .line 111
    if-eq v1, v4, :cond_6

    .line 112
    .line 113
    if-eq v1, v3, :cond_6

    .line 114
    .line 115
    const/16 v4, 0x8

    .line 116
    .line 117
    if-ne v1, v4, :cond_5

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 121
    .line 122
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 123
    .line 124
    add-int/2addr v4, v2

    .line 125
    iput v4, v1, Landroid/graphics/Rect;->right:I

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    :goto_1
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 129
    .line 130
    iget v4, v1, Landroid/graphics/Rect;->right:I

    .line 131
    .line 132
    sub-int/2addr v4, v2

    .line 133
    iput v4, v1, Landroid/graphics/Rect;->left:I

    .line 134
    .line 135
    :cond_7
    :goto_2
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget v2, p0, Lj4/a;->m:I

    .line 142
    .line 143
    if-ge v1, v2, :cond_a

    .line 144
    .line 145
    iget v1, p0, Lj4/a;->k:I

    .line 146
    .line 147
    const/4 v4, 0x3

    .line 148
    if-eq v1, v4, :cond_9

    .line 149
    .line 150
    if-eq v1, v3, :cond_9

    .line 151
    .line 152
    const/4 v3, 0x7

    .line 153
    if-ne v1, v3, :cond_8

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 157
    .line 158
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 159
    .line 160
    add-int/2addr v3, v2

    .line 161
    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_9
    :goto_3
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 165
    .line 166
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 167
    .line 168
    sub-int/2addr v3, v2

    .line 169
    iput v3, v1, Landroid/graphics/Rect;->top:I

    .line 170
    .line 171
    :cond_a
    :goto_4
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 172
    .line 173
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 174
    .line 175
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 176
    .line 177
    if-ge v2, v3, :cond_b

    .line 178
    .line 179
    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 180
    .line 181
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    iget v2, p0, Lj4/a;->m:I

    .line 186
    .line 187
    if-ge v1, v2, :cond_b

    .line 188
    .line 189
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 190
    .line 191
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 192
    .line 193
    add-int/2addr v3, v2

    .line 194
    iput v3, v1, Landroid/graphics/Rect;->right:I

    .line 195
    .line 196
    :cond_b
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 197
    .line 198
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 199
    .line 200
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 201
    .line 202
    if-le v2, v3, :cond_c

    .line 203
    .line 204
    iput v3, v1, Landroid/graphics/Rect;->right:I

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    iget v2, p0, Lj4/a;->m:I

    .line 211
    .line 212
    if-ge v1, v2, :cond_c

    .line 213
    .line 214
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 215
    .line 216
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 217
    .line 218
    sub-int/2addr v3, v2

    .line 219
    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 220
    .line 221
    :cond_c
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 222
    .line 223
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 224
    .line 225
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 226
    .line 227
    if-ge v2, v3, :cond_d

    .line 228
    .line 229
    iput v3, v1, Landroid/graphics/Rect;->top:I

    .line 230
    .line 231
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    iget v2, p0, Lj4/a;->m:I

    .line 236
    .line 237
    if-ge v1, v2, :cond_d

    .line 238
    .line 239
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 240
    .line 241
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 242
    .line 243
    add-int/2addr v3, v2

    .line 244
    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 245
    .line 246
    :cond_d
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 247
    .line 248
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 249
    .line 250
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 251
    .line 252
    if-le v2, v3, :cond_e

    .line 253
    .line 254
    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    iget v2, p0, Lj4/a;->m:I

    .line 261
    .line 262
    if-ge v1, v2, :cond_e

    .line 263
    .line 264
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 265
    .line 266
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 267
    .line 268
    sub-int/2addr v3, v2

    .line 269
    iput v3, v1, Landroid/graphics/Rect;->top:I

    .line 270
    .line 271
    :cond_e
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 272
    .line 273
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 274
    .line 275
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 276
    .line 277
    if-ge v2, v3, :cond_f

    .line 278
    .line 279
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 280
    .line 281
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 282
    .line 283
    .line 284
    :cond_f
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 285
    .line 286
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 287
    .line 288
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 289
    .line 290
    if-ge v2, v3, :cond_10

    .line 291
    .line 292
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 293
    .line 294
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 295
    .line 296
    .line 297
    :cond_10
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 298
    .line 299
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 300
    .line 301
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 302
    .line 303
    if-le v2, v3, :cond_11

    .line 304
    .line 305
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    sub-int/2addr v3, v2

    .line 310
    iget-object v2, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 311
    .line 312
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 313
    .line 314
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 315
    .line 316
    .line 317
    :cond_11
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 318
    .line 319
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 320
    .line 321
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 322
    .line 323
    if-le v2, v0, :cond_12

    .line 324
    .line 325
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    sub-int/2addr v0, v3

    .line 332
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 333
    .line 334
    .line 335
    :cond_12
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    iget v1, p0, Lj4/a;->m:I

    .line 342
    .line 343
    if-ge v0, v1, :cond_13

    .line 344
    .line 345
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 346
    .line 347
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 348
    .line 349
    add-int/2addr v2, v1

    .line 350
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 351
    .line 352
    :cond_13
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    iget v1, p0, Lj4/a;->m:I

    .line 359
    .line 360
    if-ge v0, v1, :cond_14

    .line 361
    .line 362
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 363
    .line 364
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 365
    .line 366
    add-int/2addr v2, v1

    .line 367
    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 368
    .line 369
    :cond_14
    return-void
.end method

.method public final c(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final getCropRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCroppedBitmap()Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    iget-object v0, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v3, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 26
    .line 27
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sub-int/2addr v3, v0

    .line 43
    iget-object v4, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget-object v4, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    sub-int/2addr v4, v2

    .line 63
    iget-object v5, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-static {v4, v5}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ltz v0, :cond_2

    .line 74
    .line 75
    if-ltz v2, :cond_2

    .line 76
    .line 77
    if-lez v3, :cond_2

    .line 78
    .line 79
    if-lez v4, :cond_2

    .line 80
    .line 81
    add-int v5, v0, v3

    .line 82
    .line 83
    iget-object v6, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 84
    .line 85
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-gt v5, v6, :cond_2

    .line 93
    .line 94
    add-int v5, v2, v4

    .line 95
    .line 96
    iget-object v6, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 97
    .line 98
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-le v5, v6, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    :try_start_0
    iget-object v5, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 109
    .line 110
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v5, v0, v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    return-object v0

    .line 118
    :catch_0
    move-exception v0

    .line 119
    iget-object v2, p0, Lj4/a;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v5, "\u521b\u5efa\u88c1\u526a\u540e\u7684 Bitmap \u5931\u8d25: "

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_2
    :goto_0
    iget-object v0, p0, Lj4/a;->a:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v2, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 149
    .line 150
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget-object v3, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 158
    .line 159
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v5, "\u539f\u59cb\u7684bitmap: width="

    .line 172
    .line 173
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v2, ", height="

    .line 180
    .line 181
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final getCurrentCropRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnCropRectChangeListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/Rect;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lj4/a;->n:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    const-string v1, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {p1, v1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Path;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v2, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    int-to-float v4, v4

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    int-to-float v5, v5

    .line 35
    invoke-direct {v2, v3, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget-object v4, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 46
    .line 47
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 48
    .line 49
    .line 50
    sget-object v2, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 51
    .line 52
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lj4/a;->f:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget-object v2, p0, Lj4/a;->e:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x2

    .line 74
    int-to-float v2, v2

    .line 75
    div-float v6, v1, v2

    .line 76
    .line 77
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 78
    .line 79
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 80
    .line 81
    int-to-float v3, v2

    .line 82
    sub-float/2addr v3, v6

    .line 83
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 84
    .line 85
    int-to-float v4, v1

    .line 86
    sub-float/2addr v4, v6

    .line 87
    int-to-float v2, v2

    .line 88
    sub-float/2addr v2, v6

    .line 89
    iget v5, p0, Lj4/a;->h:F

    .line 90
    .line 91
    add-float/2addr v2, v5

    .line 92
    int-to-float v1, v1

    .line 93
    sub-float/2addr v1, v6

    .line 94
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 95
    .line 96
    move v0, v4

    .line 97
    move v4, v1

    .line 98
    move v1, v3

    .line 99
    move v3, v2

    .line 100
    move v2, v0

    .line 101
    move-object v0, p1

    .line 102
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 106
    .line 107
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 108
    .line 109
    int-to-float v2, v1

    .line 110
    sub-float/2addr v2, v6

    .line 111
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 112
    .line 113
    int-to-float v3, v0

    .line 114
    sub-float/2addr v3, v6

    .line 115
    int-to-float v1, v1

    .line 116
    sub-float/2addr v1, v6

    .line 117
    int-to-float v0, v0

    .line 118
    sub-float/2addr v0, v6

    .line 119
    iget v4, p0, Lj4/a;->h:F

    .line 120
    .line 121
    add-float/2addr v4, v0

    .line 122
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 123
    .line 124
    move v0, v3

    .line 125
    move v3, v1

    .line 126
    move v1, v2

    .line 127
    move v2, v0

    .line 128
    move-object v0, p1

    .line 129
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 133
    .line 134
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    int-to-float v2, v1

    .line 137
    add-float/2addr v2, v6

    .line 138
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 139
    .line 140
    int-to-float v3, v0

    .line 141
    sub-float/2addr v3, v6

    .line 142
    int-to-float v1, v1

    .line 143
    add-float/2addr v1, v6

    .line 144
    iget v4, p0, Lj4/a;->h:F

    .line 145
    .line 146
    sub-float/2addr v1, v4

    .line 147
    int-to-float v0, v0

    .line 148
    sub-float v4, v0, v6

    .line 149
    .line 150
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 151
    .line 152
    move v0, v3

    .line 153
    move v3, v1

    .line 154
    move v1, v2

    .line 155
    move v2, v0

    .line 156
    move-object v0, p1

    .line 157
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 161
    .line 162
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 163
    .line 164
    int-to-float v2, v1

    .line 165
    add-float/2addr v2, v6

    .line 166
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    int-to-float v3, v0

    .line 169
    sub-float/2addr v3, v6

    .line 170
    int-to-float v1, v1

    .line 171
    add-float/2addr v1, v6

    .line 172
    int-to-float v0, v0

    .line 173
    sub-float/2addr v0, v6

    .line 174
    iget v4, p0, Lj4/a;->h:F

    .line 175
    .line 176
    add-float/2addr v4, v0

    .line 177
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 178
    .line 179
    move v0, v3

    .line 180
    move v3, v1

    .line 181
    move v1, v2

    .line 182
    move v2, v0

    .line 183
    move-object v0, p1

    .line 184
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 188
    .line 189
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 190
    .line 191
    int-to-float v2, v1

    .line 192
    sub-float/2addr v2, v6

    .line 193
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 194
    .line 195
    int-to-float v3, v0

    .line 196
    add-float/2addr v3, v6

    .line 197
    int-to-float v1, v1

    .line 198
    sub-float/2addr v1, v6

    .line 199
    iget v4, p0, Lj4/a;->h:F

    .line 200
    .line 201
    add-float/2addr v1, v4

    .line 202
    int-to-float v0, v0

    .line 203
    add-float v4, v0, v6

    .line 204
    .line 205
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 206
    .line 207
    move v0, v3

    .line 208
    move v3, v1

    .line 209
    move v1, v2

    .line 210
    move v2, v0

    .line 211
    move-object v0, p1

    .line 212
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 216
    .line 217
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 218
    .line 219
    int-to-float v2, v1

    .line 220
    sub-float/2addr v2, v6

    .line 221
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 222
    .line 223
    int-to-float v3, v0

    .line 224
    add-float/2addr v3, v6

    .line 225
    int-to-float v1, v1

    .line 226
    sub-float/2addr v1, v6

    .line 227
    int-to-float v0, v0

    .line 228
    add-float/2addr v0, v6

    .line 229
    iget v4, p0, Lj4/a;->h:F

    .line 230
    .line 231
    sub-float v4, v0, v4

    .line 232
    .line 233
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 234
    .line 235
    move v0, v3

    .line 236
    move v3, v1

    .line 237
    move v1, v2

    .line 238
    move v2, v0

    .line 239
    move-object v0, p1

    .line 240
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 244
    .line 245
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 246
    .line 247
    int-to-float v2, v1

    .line 248
    add-float/2addr v2, v6

    .line 249
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 250
    .line 251
    int-to-float v3, v0

    .line 252
    add-float/2addr v3, v6

    .line 253
    int-to-float v1, v1

    .line 254
    add-float/2addr v1, v6

    .line 255
    iget v4, p0, Lj4/a;->h:F

    .line 256
    .line 257
    sub-float/2addr v1, v4

    .line 258
    int-to-float v0, v0

    .line 259
    add-float v4, v0, v6

    .line 260
    .line 261
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 262
    .line 263
    move v0, v3

    .line 264
    move v3, v1

    .line 265
    move v1, v2

    .line 266
    move v2, v0

    .line 267
    move-object v0, p1

    .line 268
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 272
    .line 273
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 274
    .line 275
    int-to-float v2, v1

    .line 276
    add-float/2addr v2, v6

    .line 277
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 278
    .line 279
    int-to-float v3, v0

    .line 280
    add-float/2addr v3, v6

    .line 281
    int-to-float v1, v1

    .line 282
    add-float/2addr v1, v6

    .line 283
    int-to-float v0, v0

    .line 284
    add-float/2addr v0, v6

    .line 285
    iget v4, p0, Lj4/a;->h:F

    .line 286
    .line 287
    sub-float v4, v0, v4

    .line 288
    .line 289
    iget-object v5, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 290
    .line 291
    move v0, v3

    .line 292
    move v3, v1

    .line 293
    move v1, v2

    .line 294
    move v2, v0

    .line 295
    move-object v0, p1

    .line 296
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 297
    .line 298
    .line 299
    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj4/a;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "event"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v4, 0x1

    .line 23
    if-eqz v2, :cond_6

    .line 24
    .line 25
    if-eq v2, v4, :cond_5

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-eq v2, v5, :cond_0

    .line 29
    .line 30
    move/from16 p1, v4

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    iget v2, v0, Lj4/a;->i:F

    .line 35
    .line 36
    sub-float v2, v1, v2

    .line 37
    .line 38
    float-to-int v2, v2

    .line 39
    iget v5, v0, Lj4/a;->j:F

    .line 40
    .line 41
    sub-float v5, v3, v5

    .line 42
    .line 43
    float-to-int v5, v5

    .line 44
    iget v6, v0, Lj4/a;->k:I

    .line 45
    .line 46
    packed-switch v6, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    :goto_0
    move/from16 p1, v4

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :pswitch_0
    iget-object v6, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 54
    .line 55
    iget v7, v6, Landroid/graphics/Rect;->right:I

    .line 56
    .line 57
    add-int/2addr v7, v2

    .line 58
    iget v2, v6, Landroid/graphics/Rect;->bottom:I

    .line 59
    .line 60
    add-int/2addr v2, v5

    .line 61
    iget v5, v6, Landroid/graphics/Rect;->left:I

    .line 62
    .line 63
    add-int/lit8 v5, v5, 0x64

    .line 64
    .line 65
    iget-object v8, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget v8, v8, Landroid/graphics/Rect;->right:I

    .line 68
    .line 69
    invoke-static {v7, v5, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    iput v5, v6, Landroid/graphics/Rect;->right:I

    .line 74
    .line 75
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget v6, v5, Landroid/graphics/Rect;->top:I

    .line 78
    .line 79
    add-int/lit8 v6, v6, 0x64

    .line 80
    .line 81
    iget-object v7, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 82
    .line 83
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    invoke-static {v2, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iput v2, v5, Landroid/graphics/Rect;->bottom:I

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_1
    iget-object v6, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 93
    .line 94
    iget v7, v6, Landroid/graphics/Rect;->left:I

    .line 95
    .line 96
    add-int/2addr v7, v2

    .line 97
    iget v2, v6, Landroid/graphics/Rect;->bottom:I

    .line 98
    .line 99
    add-int/2addr v2, v5

    .line 100
    iget-object v5, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 101
    .line 102
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 103
    .line 104
    iget v8, v6, Landroid/graphics/Rect;->right:I

    .line 105
    .line 106
    add-int/lit8 v8, v8, -0x64

    .line 107
    .line 108
    invoke-static {v7, v5, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    iput v5, v6, Landroid/graphics/Rect;->left:I

    .line 113
    .line 114
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 115
    .line 116
    iget v6, v5, Landroid/graphics/Rect;->top:I

    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x64

    .line 119
    .line 120
    iget-object v7, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 121
    .line 122
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 123
    .line 124
    invoke-static {v2, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    iput v2, v5, Landroid/graphics/Rect;->bottom:I

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_2
    iget-object v6, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 132
    .line 133
    iget v7, v6, Landroid/graphics/Rect;->right:I

    .line 134
    .line 135
    add-int/2addr v7, v2

    .line 136
    iget v2, v6, Landroid/graphics/Rect;->top:I

    .line 137
    .line 138
    add-int/2addr v2, v5

    .line 139
    iget v5, v6, Landroid/graphics/Rect;->left:I

    .line 140
    .line 141
    add-int/lit8 v5, v5, 0x64

    .line 142
    .line 143
    iget-object v8, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 144
    .line 145
    iget v8, v8, Landroid/graphics/Rect;->right:I

    .line 146
    .line 147
    invoke-static {v7, v5, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iput v5, v6, Landroid/graphics/Rect;->right:I

    .line 152
    .line 153
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 154
    .line 155
    iget-object v6, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 156
    .line 157
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 158
    .line 159
    iget v7, v5, Landroid/graphics/Rect;->bottom:I

    .line 160
    .line 161
    add-int/lit8 v7, v7, -0x64

    .line 162
    .line 163
    invoke-static {v2, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    iput v2, v5, Landroid/graphics/Rect;->top:I

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :pswitch_3
    iget-object v6, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 171
    .line 172
    iget v7, v6, Landroid/graphics/Rect;->left:I

    .line 173
    .line 174
    add-int/2addr v7, v2

    .line 175
    iget v2, v6, Landroid/graphics/Rect;->top:I

    .line 176
    .line 177
    add-int/2addr v2, v5

    .line 178
    iget-object v5, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 179
    .line 180
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 181
    .line 182
    iget v8, v6, Landroid/graphics/Rect;->right:I

    .line 183
    .line 184
    add-int/lit8 v8, v8, -0x64

    .line 185
    .line 186
    invoke-static {v7, v5, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    iput v5, v6, Landroid/graphics/Rect;->left:I

    .line 191
    .line 192
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 193
    .line 194
    iget-object v6, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 195
    .line 196
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 197
    .line 198
    iget v7, v5, Landroid/graphics/Rect;->bottom:I

    .line 199
    .line 200
    add-int/lit8 v7, v7, -0x64

    .line 201
    .line 202
    invoke-static {v2, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    iput v2, v5, Landroid/graphics/Rect;->top:I

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :pswitch_4
    iget-object v2, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 211
    .line 212
    iget v6, v2, Landroid/graphics/Rect;->bottom:I

    .line 213
    .line 214
    add-int/2addr v6, v5

    .line 215
    iget v5, v2, Landroid/graphics/Rect;->top:I

    .line 216
    .line 217
    add-int/lit8 v5, v5, 0x64

    .line 218
    .line 219
    iget-object v7, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 220
    .line 221
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 222
    .line 223
    invoke-static {v6, v5, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    iput v5, v2, Landroid/graphics/Rect;->bottom:I

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_5
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 232
    .line 233
    iget v6, v5, Landroid/graphics/Rect;->right:I

    .line 234
    .line 235
    add-int/2addr v6, v2

    .line 236
    iget v2, v5, Landroid/graphics/Rect;->left:I

    .line 237
    .line 238
    add-int/lit8 v2, v2, 0x64

    .line 239
    .line 240
    iget-object v7, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 241
    .line 242
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 243
    .line 244
    invoke-static {v6, v2, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    iput v2, v5, Landroid/graphics/Rect;->right:I

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :pswitch_6
    iget-object v2, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 253
    .line 254
    iget v6, v2, Landroid/graphics/Rect;->top:I

    .line 255
    .line 256
    add-int/2addr v6, v5

    .line 257
    iget-object v5, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 258
    .line 259
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 260
    .line 261
    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 262
    .line 263
    add-int/lit8 v7, v7, -0x64

    .line 264
    .line 265
    invoke-static {v6, v5, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    iput v5, v2, Landroid/graphics/Rect;->top:I

    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :pswitch_7
    iget-object v5, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 274
    .line 275
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 276
    .line 277
    add-int/2addr v6, v2

    .line 278
    iget-object v2, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 279
    .line 280
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 281
    .line 282
    iget v7, v5, Landroid/graphics/Rect;->right:I

    .line 283
    .line 284
    add-int/lit8 v7, v7, -0x64

    .line 285
    .line 286
    invoke-static {v6, v2, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    iput v2, v5, Landroid/graphics/Rect;->left:I

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :pswitch_8
    iget-object v6, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 295
    .line 296
    iget v7, v6, Landroid/graphics/Rect;->left:I

    .line 297
    .line 298
    add-int v8, v7, v2

    .line 299
    .line 300
    iget v9, v6, Landroid/graphics/Rect;->top:I

    .line 301
    .line 302
    add-int v10, v9, v5

    .line 303
    .line 304
    iget v11, v6, Landroid/graphics/Rect;->right:I

    .line 305
    .line 306
    add-int v12, v11, v2

    .line 307
    .line 308
    iget v13, v6, Landroid/graphics/Rect;->bottom:I

    .line 309
    .line 310
    add-int v14, v13, v5

    .line 311
    .line 312
    iget-object v15, v0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 313
    .line 314
    move/from16 p1, v4

    .line 315
    .line 316
    iget v4, v15, Landroid/graphics/Rect;->left:I

    .line 317
    .line 318
    if-ge v8, v4, :cond_1

    .line 319
    .line 320
    sub-int v2, v4, v7

    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_1
    iget v4, v15, Landroid/graphics/Rect;->right:I

    .line 324
    .line 325
    if-le v12, v4, :cond_2

    .line 326
    .line 327
    sub-int v2, v4, v11

    .line 328
    .line 329
    :cond_2
    :goto_1
    iget v4, v15, Landroid/graphics/Rect;->top:I

    .line 330
    .line 331
    if-ge v10, v4, :cond_3

    .line 332
    .line 333
    sub-int v5, v4, v9

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_3
    iget v4, v15, Landroid/graphics/Rect;->bottom:I

    .line 337
    .line 338
    if-le v14, v4, :cond_4

    .line 339
    .line 340
    sub-int v5, v4, v13

    .line 341
    .line 342
    :cond_4
    :goto_2
    invoke-virtual {v6, v2, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 343
    .line 344
    .line 345
    :goto_3
    iput v1, v0, Lj4/a;->i:F

    .line 346
    .line 347
    iput v3, v0, Lj4/a;->j:F

    .line 348
    .line 349
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 350
    .line 351
    .line 352
    iget-object v1, v0, Lj4/a;->n:Lkotlin/jvm/functions/Function1;

    .line 353
    .line 354
    if-eqz v1, :cond_7

    .line 355
    .line 356
    iget-object v2, v0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 357
    .line 358
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_5
    move/from16 p1, v4

    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    iput v1, v0, Lj4/a;->k:I

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_6
    move/from16 p1, v4

    .line 369
    .line 370
    iput v1, v0, Lj4/a;->i:F

    .line 371
    .line 372
    iput v3, v0, Lj4/a;->j:F

    .line 373
    .line 374
    invoke-virtual {v0, v1, v3}, Lj4/a;->a(FF)I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    iput v1, v0, Lj4/a;->k:I

    .line 379
    .line 380
    :cond_7
    :goto_4
    return p1

    .line 381
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final setContentBoundaries(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    const-string v0, "boundaries"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lj4/a;->b:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-double v0, p1

    .line 30
    const-wide v2, 0x3fe999999999999aL    # 0.8

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    mul-double/2addr v0, v2

    .line 36
    double-to-int p1, v0

    .line 37
    iget-object v0, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-double v0, v0

    .line 44
    const-wide v2, 0x3fe3333333333333L    # 0.6

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    mul-double/2addr v0, v2

    .line 50
    double-to-int v0, v0

    .line 51
    iget-object v1, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 52
    .line 53
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    sub-int/2addr v1, p1

    .line 60
    div-int/lit8 v1, v1, 0x2

    .line 61
    .line 62
    add-int/2addr v2, v1

    .line 63
    iget-object v1, p0, Lj4/a;->d:Landroid/graphics/Rect;

    .line 64
    .line 65
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-int/2addr v1, v0

    .line 72
    div-int/lit8 v1, v1, 0x2

    .line 73
    .line 74
    add-int/2addr v3, v1

    .line 75
    iget-object v1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 76
    .line 77
    add-int/2addr p1, v2

    .line 78
    add-int/2addr v0, v3

    .line 79
    invoke-virtual {v1, v2, v3, p1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lj4/a;->n:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    iget-object v0, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p0}, Lj4/a;->b()V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final setCropRect(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lj4/a;->c:Landroid/graphics/Rect;

    .line 7
    .line 8
    return-void
.end method

.method public final setCropRectColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/a;->e:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj4/a;->g:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setOnCropRectChangeListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Rect;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lj4/a;->n:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method
