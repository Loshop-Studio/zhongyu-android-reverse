.class public Lw8/a$a;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/a;->H(IIIIF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw8/a;


# direct methods
.method public constructor <init>(Lw8/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw8/a$a;->a:Lw8/a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Lw8/a;->w()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 24
    .line 25
    invoke-static {v2}, Lw8/a;->a(Lw8/a;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x4

    .line 30
    const/4 v4, 0x0

    .line 31
    if-ne v2, v3, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 34
    .line 35
    invoke-static {v2}, Lw8/a;->b(Lw8/a;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    rsub-int/lit8 v2, v2, 0x0

    .line 40
    .line 41
    move v3, v4

    .line 42
    move v4, v1

    .line 43
    move v1, v2

    .line 44
    move v2, v3

    .line 45
    :goto_0
    move v3, v0

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 48
    .line 49
    invoke-static {v2}, Lw8/a;->a(Lw8/a;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x1

    .line 54
    if-ne v2, v3, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 57
    .line 58
    invoke-static {v2}, Lw8/a;->b(Lw8/a;)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    rsub-int/lit8 v2, v2, 0x0

    .line 63
    .line 64
    move v3, v4

    .line 65
    move v4, v1

    .line 66
    move v1, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 69
    .line 70
    invoke-static {v2}, Lw8/a;->a(Lw8/a;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x2

    .line 75
    if-ne v2, v3, :cond_4

    .line 76
    .line 77
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 78
    .line 79
    invoke-static {v2}, Lw8/a;->b(Lw8/a;)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    add-int/2addr v0, v2

    .line 84
    :cond_3
    :goto_1
    move v3, v0

    .line 85
    move v2, v4

    .line 86
    move v4, v1

    .line 87
    move v1, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 90
    .line 91
    invoke-static {v2}, Lw8/a;->a(Lw8/a;)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v3, 0x3

    .line 96
    if-ne v2, v3, :cond_3

    .line 97
    .line 98
    iget-object v2, p0, Lw8/a$a;->a:Lw8/a;

    .line 99
    .line 100
    invoke-static {v2}, Lw8/a;->b(Lw8/a;)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-int/2addr v1, v2

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    iget-object v0, p0, Lw8/a$a;->a:Lw8/a;

    .line 107
    .line 108
    invoke-static {v0}, Lw8/a;->b(Lw8/a;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-float v5, v0

    .line 113
    move-object v0, p2

    .line 114
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    move v2, v0

    .line 119
    iget-object v3, p0, Lw8/a$a;->a:Lw8/a;

    .line 120
    .line 121
    invoke-static {v3}, Lw8/a;->c(Lw8/a;)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    add-int/lit8 v4, v3, 0x1

    .line 126
    .line 127
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 128
    .line 129
    invoke-static {v5}, Lw8/a;->d(Lw8/a;)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    sub-int/2addr v1, v5

    .line 134
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    iget-object v4, p0, Lw8/a$a;->a:Lw8/a;

    .line 139
    .line 140
    invoke-static {v4}, Lw8/a;->e(Lw8/a;)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 145
    .line 146
    invoke-static {v5}, Lw8/a;->f(Lw8/a;)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    sub-int/2addr v2, v5

    .line 151
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 152
    .line 153
    invoke-static {v5}, Lw8/a;->g(Lw8/a;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    add-int/2addr v4, v5

    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    add-int/2addr v3, v5

    .line 169
    add-int/lit8 v5, v4, 0x1

    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    sub-int/2addr v2, v6

    .line 176
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    add-int/lit8 v5, v3, 0x1

    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    sub-int/2addr v1, v6

    .line 187
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    :cond_6
    move v7, v4

    .line 192
    move v4, v1

    .line 193
    move v1, v7

    .line 194
    move v7, v3

    .line 195
    move v3, v2

    .line 196
    move v2, v7

    .line 197
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 198
    .line 199
    invoke-static {v5}, Lw8/a;->h(Lw8/a;)F

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    iget-object v6, p0, Lw8/a$a;->a:Lw8/a;

    .line 204
    .line 205
    invoke-static {v6}, Lw8/a;->i(Lw8/a;)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_7

    .line 210
    .line 211
    const/high16 v5, 0x3f800000    # 1.0f

    .line 212
    .line 213
    :cond_7
    invoke-virtual {p2, v5}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 214
    .line 215
    .line 216
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 217
    .line 218
    invoke-static {v5}, Lw8/a;->b(Lw8/a;)I

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-gtz v5, :cond_8

    .line 223
    .line 224
    invoke-virtual {p2, v1, v2, v3, v4}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_8
    iget-object v5, p0, Lw8/a$a;->a:Lw8/a;

    .line 229
    .line 230
    invoke-static {v5}, Lw8/a;->b(Lw8/a;)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    int-to-float v5, v5

    .line 235
    move-object v0, p2

    .line 236
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 237
    .line 238
    .line 239
    :cond_9
    :goto_3
    return-void
.end method
