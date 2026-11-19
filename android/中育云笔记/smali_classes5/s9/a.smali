.class public final Ls9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/a$a;
    }
.end annotation


# static fields
.field public static final c:Ls9/a$a;


# instance fields
.field public final a:Lq9/b;

.field public final b:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls9/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls9/a$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls9/a;->c:Ls9/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lq9/b;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ls9/a;->a:Lq9/b;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Ls9/a;->a:Lq9/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq9/b;->E()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x42180000    # 38.0f

    .line 8
    .line 9
    sub-float/2addr v0, v1

    .line 10
    const/4 v1, 0x2

    .line 11
    int-to-float v1, v1

    .line 12
    div-float/2addr v0, v1

    .line 13
    new-instance v1, Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    const/high16 v3, 0x41b80000    # 23.0f

    .line 28
    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 41
    .line 42
    sub-float/2addr v4, v0

    .line 43
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    add-float/2addr v5, v3

    .line 56
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Landroid/graphics/RectF;

    .line 65
    .line 66
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 67
    .line 68
    add-float/2addr v3, v0

    .line 69
    invoke-direct {v1, v2, v4, v5, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 73
    .line 74
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    .line 79
    .line 80
    const/high16 p4, 0x40c00000    # 6.0f

    .line 81
    .line 82
    invoke-virtual {p1, v1, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    check-cast p5, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p5

    .line 91
    const/4 v0, 0x0

    .line 92
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    add-int/lit8 v2, v0, 0x1

    .line 103
    .line 104
    if-gez v0, :cond_0

    .line 105
    .line 106
    invoke-static {}, Lrc/w;->w()V

    .line 107
    .line 108
    .line 109
    :cond_0
    check-cast v1, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 116
    .line 117
    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 118
    .line 119
    .line 120
    const v3, 0xffffff

    .line 121
    .line 122
    .line 123
    and-int/2addr v3, v1

    .line 124
    const/high16 v4, -0x1000000

    .line 125
    .line 126
    or-int/2addr v3, v4

    .line 127
    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    .line 129
    .line 130
    new-instance v3, Landroid/graphics/RectF;

    .line 131
    .line 132
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    check-cast v5, Landroid/graphics/RectF;

    .line 141
    .line 142
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 143
    .line 144
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Landroid/graphics/RectF;

    .line 153
    .line 154
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 155
    .line 156
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    check-cast v7, Landroid/graphics/RectF;

    .line 165
    .line 166
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 167
    .line 168
    invoke-virtual {p2}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Landroid/graphics/RectF;

    .line 177
    .line 178
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 179
    .line 180
    invoke-direct {v3, v5, v6, v7, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v3, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 184
    .line 185
    .line 186
    if-ne v1, p6, :cond_2

    .line 187
    .line 188
    sget-object v0, Lna/s;->a:Lna/s;

    .line 189
    .line 190
    invoke-virtual {v0, v3}, Lna/s;->f(Landroid/graphics/RectF;)Landroid/graphics/Path;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    sget-object v1, Lna/f;->a:Lna/f;

    .line 195
    .line 196
    invoke-virtual {v1, p6}, Lna/f;->a(I)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_1

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_1
    const/4 v4, -0x1

    .line 204
    :goto_1
    invoke-virtual {p3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 205
    .line 206
    .line 207
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 208
    .line 209
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 210
    .line 211
    .line 212
    const/high16 v1, 0x40400000    # 3.0f

    .line 213
    .line 214
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 218
    .line 219
    .line 220
    :cond_2
    move v0, v2

    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_3
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;ZLandroid/graphics/Path;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 8

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionRectF"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "typeList"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast p5, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Ls9/c;

    .line 44
    .line 45
    invoke-virtual {v2}, Ls9/c;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-lez v2, :cond_0

    .line 54
    .line 55
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p5

    .line 63
    if-eqz p5, :cond_2

    .line 64
    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_2
    if-eqz p2, :cond_3

    .line 68
    .line 69
    const/high16 p5, -0x41000000    # -0.5f

    .line 70
    .line 71
    :goto_1
    move v5, p5

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const p5, 0x33ffffff

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 78
    .line 79
    const/high16 v1, 0x40400000    # 3.0f

    .line 80
    .line 81
    invoke-virtual {p5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 82
    .line 83
    .line 84
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 85
    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    const p2, -0xb8680d

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    const p2, -0x333334

    .line 93
    .line 94
    .line 95
    :goto_3
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 99
    .line 100
    sget-object p5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 101
    .line 102
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 109
    .line 110
    .line 111
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 114
    .line 115
    .line 116
    if-eqz p6, :cond_5

    .line 117
    .line 118
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 119
    .line 120
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 121
    .line 122
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 126
    .line 127
    const p3, -0x9a00

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    .line 132
    .line 133
    iget p2, p6, Landroid/graphics/PointF;->x:F

    .line 134
    .line 135
    iget p3, p6, Landroid/graphics/PointF;->y:F

    .line 136
    .line 137
    iget-object p6, p0, Ls9/a;->a:Lq9/b;

    .line 138
    .line 139
    invoke-virtual {p6}, Lq9/b;->H()F

    .line 140
    .line 141
    .line 142
    move-result p6

    .line 143
    const/16 v2, 0x8

    .line 144
    .line 145
    int-to-float v2, v2

    .line 146
    div-float/2addr p6, v2

    .line 147
    iget-object v2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 148
    .line 149
    invoke-virtual {p1, p2, p3, p6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 153
    .line 154
    const/high16 p3, 0x41c80000    # 25.0f

    .line 155
    .line 156
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 157
    .line 158
    .line 159
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 160
    .line 161
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 162
    .line 163
    .line 164
    new-instance p2, Landroid/graphics/RectF;

    .line 165
    .line 166
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p4}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 170
    .line 171
    .line 172
    move-result-object p5

    .line 173
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p4}, Lt9/d;->e()Landroid/graphics/RectF;

    .line 177
    .line 178
    .line 179
    move-result-object p5

    .line 180
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4}, Lt9/d;->c()Landroid/graphics/RectF;

    .line 184
    .line 185
    .line 186
    move-result-object p5

    .line 187
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p4}, Lt9/d;->d()Landroid/graphics/RectF;

    .line 191
    .line 192
    .line 193
    move-result-object p5

    .line 194
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p4}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 198
    .line 199
    .line 200
    move-result-object p5

    .line 201
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 202
    .line 203
    .line 204
    iget p5, p2, Landroid/graphics/RectF;->left:F

    .line 205
    .line 206
    const/high16 p6, 0x41000000    # 8.0f

    .line 207
    .line 208
    sub-float/2addr p5, p6

    .line 209
    iput p5, p2, Landroid/graphics/RectF;->left:F

    .line 210
    .line 211
    iget p5, p2, Landroid/graphics/RectF;->right:F

    .line 212
    .line 213
    add-float/2addr p5, p6

    .line 214
    iput p5, p2, Landroid/graphics/RectF;->right:F

    .line 215
    .line 216
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 217
    .line 218
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 219
    .line 220
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 221
    .line 222
    .line 223
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 224
    .line 225
    invoke-virtual {p5, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 226
    .line 227
    .line 228
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 229
    .line 230
    const/high16 v3, 0x40c00000    # 6.0f

    .line 231
    .line 232
    invoke-virtual {p1, p2, v3, v3, p5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 236
    .line 237
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 238
    .line 239
    .line 240
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 241
    .line 242
    const/high16 v2, -0x1000000

    .line 243
    .line 244
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    .line 246
    .line 247
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 248
    .line 249
    invoke-virtual {p5, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 250
    .line 251
    .line 252
    iget p3, p2, Landroid/graphics/RectF;->bottom:F

    .line 253
    .line 254
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    iget-object p5, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 259
    .line 260
    invoke-virtual {p5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 261
    .line 262
    .line 263
    move-result-object p5

    .line 264
    iget p5, p5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 265
    .line 266
    iget-object v2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 267
    .line 268
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 273
    .line 274
    sub-float/2addr p5, v2

    .line 275
    sub-float/2addr p2, p5

    .line 276
    const/4 p5, 0x2

    .line 277
    int-to-float p5, p5

    .line 278
    div-float/2addr p2, p5

    .line 279
    sub-float/2addr p3, p2

    .line 280
    iget-object p2, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 281
    .line 282
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 287
    .line 288
    sub-float/2addr p3, p2

    .line 289
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    const/4 p5, 0x0

    .line 294
    move v2, p5

    .line 295
    :goto_4
    if-ge v2, p2, :cond_c

    .line 296
    .line 297
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    add-int/lit8 v2, v2, 0x1

    .line 302
    .line 303
    check-cast v3, Ls9/c;

    .line 304
    .line 305
    instance-of v4, v3, Ls9/c$g;

    .line 306
    .line 307
    if-eqz v4, :cond_6

    .line 308
    .line 309
    invoke-virtual {p4}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_6
    instance-of v4, v3, Ls9/c$f;

    .line 317
    .line 318
    if-eqz v4, :cond_7

    .line 319
    .line 320
    invoke-virtual {p4}, Lt9/d;->e()Landroid/graphics/RectF;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_7
    instance-of v4, v3, Ls9/c$b;

    .line 328
    .line 329
    if-eqz v4, :cond_8

    .line 330
    .line 331
    invoke-virtual {p4}, Lt9/d;->c()Landroid/graphics/RectF;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_8
    instance-of v4, v3, Ls9/c$c;

    .line 339
    .line 340
    if-eqz v4, :cond_9

    .line 341
    .line 342
    invoke-virtual {p4}, Lt9/d;->d()Landroid/graphics/RectF;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_9
    instance-of v4, v3, Ls9/c$a;

    .line 350
    .line 351
    if-eqz v4, :cond_a

    .line 352
    .line 353
    invoke-virtual {p4}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_a
    move v4, p6

    .line 361
    :goto_5
    const/high16 v6, 0x41700000    # 15.0f

    .line 362
    .line 363
    add-float/2addr v4, v6

    .line 364
    iget-object v6, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 365
    .line 366
    invoke-virtual {v3}, Ls9/c;->b()Z

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    if-eqz v7, :cond_b

    .line 371
    .line 372
    const v7, -0xea8901

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_b
    const/4 v7, -0x1

    .line 377
    :goto_6
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, Ls9/c;->a()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    iget-object v6, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 385
    .line 386
    invoke-virtual {p1, v3, v4, p3, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    :cond_d
    if-ge p5, p2, :cond_e

    .line 395
    .line 396
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    add-int/lit8 p5, p5, 0x1

    .line 401
    .line 402
    move-object p6, p3

    .line 403
    check-cast p6, Ls9/c;

    .line 404
    .line 405
    invoke-virtual {p6}, Ls9/c;->b()Z

    .line 406
    .line 407
    .line 408
    move-result p6

    .line 409
    if-eqz p6, :cond_d

    .line 410
    .line 411
    move-object v1, p3

    .line 412
    :cond_e
    check-cast v1, Ls9/c;

    .line 413
    .line 414
    instance-of p2, v1, Ls9/c$g;

    .line 415
    .line 416
    if-eqz p2, :cond_12

    .line 417
    .line 418
    iget-object v4, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 419
    .line 420
    move-object p2, v1

    .line 421
    check-cast p2, Ls9/c$g;

    .line 422
    .line 423
    invoke-virtual {p2}, Ls9/c$g;->f()Z

    .line 424
    .line 425
    .line 426
    move-result p3

    .line 427
    if-eqz p3, :cond_f

    .line 428
    .line 429
    iget-object p3, p0, Ls9/a;->a:Lq9/b;

    .line 430
    .line 431
    invoke-virtual {p3}, Lq9/b;->G()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object p3

    .line 435
    :goto_7
    move-object v6, p3

    .line 436
    goto :goto_8

    .line 437
    :cond_f
    iget-object p3, p0, Ls9/a;->a:Lq9/b;

    .line 438
    .line 439
    invoke-virtual {p3}, Lq9/b;->J()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object p3

    .line 443
    goto :goto_7

    .line 444
    :goto_8
    invoke-virtual {p2}, Ls9/c$g;->e()F

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    move-object v1, p0

    .line 449
    move-object v2, p1

    .line 450
    move-object v3, p4

    .line 451
    invoke-virtual/range {v1 .. v7}, Ls9/a;->f(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;F)V

    .line 452
    .line 453
    .line 454
    iget-object v4, v1, Ls9/a;->b:Landroid/graphics/Paint;

    .line 455
    .line 456
    invoke-virtual {p2}, Ls9/c$g;->f()Z

    .line 457
    .line 458
    .line 459
    move-result p1

    .line 460
    if-eqz p1, :cond_11

    .line 461
    .line 462
    iget-object p1, v1, Ls9/a;->a:Lq9/b;

    .line 463
    .line 464
    invoke-virtual {p1}, Lq9/b;->I()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    check-cast p1, Ljava/lang/Iterable;

    .line 469
    .line 470
    new-instance p3, Ljava/util/ArrayList;

    .line 471
    .line 472
    const/16 p4, 0xa

    .line 473
    .line 474
    invoke-static {p1, p4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 475
    .line 476
    .line 477
    move-result p4

    .line 478
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 479
    .line 480
    .line 481
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result p4

    .line 489
    if-eqz p4, :cond_10

    .line 490
    .line 491
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p4

    .line 495
    check-cast p4, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result p4

    .line 501
    const p5, 0xffffff

    .line 502
    .line 503
    .line 504
    and-int/2addr p4, p5

    .line 505
    iget-object p5, v1, Ls9/a;->a:Lq9/b;

    .line 506
    .line 507
    invoke-virtual {p5}, Lq9/b;->v()F

    .line 508
    .line 509
    .line 510
    move-result p5

    .line 511
    const/16 p6, 0xff

    .line 512
    .line 513
    int-to-float p6, p6

    .line 514
    mul-float/2addr p5, p6

    .line 515
    float-to-int p5, p5

    .line 516
    shl-int/lit8 p5, p5, 0x18

    .line 517
    .line 518
    or-int/2addr p4, p5

    .line 519
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    .line 521
    .line 522
    move-result-object p4

    .line 523
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_10
    :goto_a
    move-object v6, p3

    .line 528
    goto :goto_b

    .line 529
    :cond_11
    iget-object p1, v1, Ls9/a;->a:Lq9/b;

    .line 530
    .line 531
    invoke-virtual {p1}, Lq9/b;->I()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object p3

    .line 535
    goto :goto_a

    .line 536
    :goto_b
    invoke-virtual {p2}, Ls9/c$g;->d()I

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    invoke-virtual/range {v1 .. v7}, Ls9/a;->a(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 541
    .line 542
    .line 543
    move-object p1, v1

    .line 544
    return-void

    .line 545
    :cond_12
    move-object v2, p1

    .line 546
    move-object v3, p4

    .line 547
    move-object p1, p0

    .line 548
    instance-of p2, v1, Ls9/c$f;

    .line 549
    .line 550
    if-eqz p2, :cond_13

    .line 551
    .line 552
    iget-object p2, p1, Ls9/a;->b:Landroid/graphics/Paint;

    .line 553
    .line 554
    invoke-virtual {p0, v2, v3, p2, v5}, Ls9/a;->e(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;I)V

    .line 555
    .line 556
    .line 557
    iget-object v4, p1, Ls9/a;->b:Landroid/graphics/Paint;

    .line 558
    .line 559
    iget-object p2, p1, Ls9/a;->a:Lq9/b;

    .line 560
    .line 561
    invoke-virtual {p2}, Lq9/b;->I()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v1, Ls9/c$f;

    .line 566
    .line 567
    invoke-virtual {v1}, Ls9/c$f;->d()I

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    move-object v1, p1

    .line 572
    invoke-virtual/range {v1 .. v7}, Ls9/a;->a(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :cond_13
    instance-of p2, v1, Ls9/c$b;

    .line 577
    .line 578
    if-eqz p2, :cond_14

    .line 579
    .line 580
    iget-object v4, p1, Ls9/a;->b:Landroid/graphics/Paint;

    .line 581
    .line 582
    iget-object p2, p1, Ls9/a;->a:Lq9/b;

    .line 583
    .line 584
    invoke-virtual {p2}, Lq9/b;->I()Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    check-cast v1, Ls9/c$b;

    .line 589
    .line 590
    invoke-virtual {v1}, Ls9/c$b;->d()I

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    move-object v1, p1

    .line 595
    invoke-virtual/range {v1 .. v7}, Ls9/a;->a(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 596
    .line 597
    .line 598
    :cond_14
    :goto_c
    return-void
.end method

.method public final c(Z)Landroid/graphics/Paint;
    .locals 3

    .line 1
    iget-object v0, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/high16 v1, 0x40400000    # 3.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/high16 p1, -0x1000000

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const p1, -0x333334

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    new-array v1, v1, [F

    .line 34
    .line 35
    fill-array-data v1, :array_0

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ls9/a;->b:Landroid/graphics/Paint;

    .line 46
    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final d(FFFF)Landroid/graphics/Path;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final e(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;I)V
    .locals 8

    .line 1
    new-instance v6, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 8
    .line 9
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 14
    .line 15
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 20
    .line 21
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    invoke-direct {v6, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p3 .. p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x40c00000    # 6.0f

    .line 39
    .line 40
    invoke-virtual {p1, v6, v0, v0, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 44
    .line 45
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    .line 51
    .line 52
    const/high16 v0, 0x40400000    # 3.0f

    .line 53
    .line 54
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/high16 v7, 0x41400000    # 12.0f

    .line 66
    .line 67
    sub-float/2addr v0, v7

    .line 68
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-float/2addr v3, v7

    .line 85
    invoke-virtual {p2}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    move-object v5, p3

    .line 94
    move v1, v0

    .line 95
    move-object v0, p1

    .line 96
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    sub-float v1, v0, v7

    .line 108
    .line 109
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    add-float v3, v0, v7

    .line 122
    .line 123
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    move-object v0, p1

    .line 128
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sub-float v2, v0, v7

    .line 144
    .line 145
    invoke-virtual {p2}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    add-float v4, v0, v7

    .line 158
    .line 159
    move-object v0, p1

    .line 160
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40000000    # 2.0f

    .line 164
    .line 165
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 166
    .line 167
    .line 168
    const v0, -0x7f000001

    .line 169
    .line 170
    .line 171
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    sub-float v2, v0, v7

    .line 183
    .line 184
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    add-float v4, v0, v7

    .line 193
    .line 194
    move-object v0, p1

    .line 195
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;Lt9/d;Landroid/graphics/Paint;ILjava/util/List;F)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    const/high16 v2, 0x41800000    # 16.0f

    .line 16
    .line 17
    sub-float/2addr v1, v2

    .line 18
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/RectF;

    .line 27
    .line 28
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 29
    .line 30
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 41
    .line 42
    add-float/2addr v4, v2

    .line 43
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    invoke-direct {v0, v1, v3, v4, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 59
    .line 60
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 64
    .line 65
    .line 66
    const/high16 p4, 0x40c00000    # 6.0f

    .line 67
    .line 68
    invoke-virtual {p1, v0, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    check-cast p5, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    const/4 p5, 0x0

    .line 78
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    add-int/lit8 v1, p5, 0x1

    .line 89
    .line 90
    if-gez p5, :cond_0

    .line 91
    .line 92
    invoke-static {}, Lrc/w;->w()V

    .line 93
    .line 94
    .line 95
    :cond_0
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    cmpg-float v0, v0, p6

    .line 102
    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    const v0, -0xea8901

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    const v0, -0x363637

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    int-to-float v0, p5

    .line 116
    const/high16 v2, 0x40400000    # 3.0f

    .line 117
    .line 118
    mul-float/2addr v0, v2

    .line 119
    const/high16 v2, 0x41000000    # 8.0f

    .line 120
    .line 121
    add-float/2addr v0, v2

    .line 122
    const/4 v2, 0x2

    .line 123
    int-to-float v2, v2

    .line 124
    div-float/2addr v0, v2

    .line 125
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Landroid/graphics/RectF;

    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-virtual {p2}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p5

    .line 147
    check-cast p5, Landroid/graphics/RectF;

    .line 148
    .line 149
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 150
    .line 151
    .line 152
    move-result p5

    .line 153
    invoke-virtual {p1, v2, p5, v0, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    move p5, v1

    .line 157
    goto :goto_0

    .line 158
    :cond_2
    return-void
.end method

.method public final g(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "selectRectF"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "typeList"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/graphics/Path;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object/from16 v10, p0

    .line 32
    .line 33
    iget-object v5, v10, Ls9/a;->a:Lq9/b;

    .line 34
    .line 35
    invoke-virtual {v5}, Lq9/b;->H()F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v5, 0x2

    .line 44
    int-to-float v5, v5

    .line 45
    div-float v11, v3, v5

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    int-to-float v12, v6

    .line 49
    div-float v13, v11, v12

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    div-float v14, v6, v5

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    div-float v15, v6, v5

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/4 v7, 0x0

    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    move-object v8, v6

    .line 81
    check-cast v8, Ls9/c;

    .line 82
    .line 83
    instance-of v8, v8, Ls9/c$b;

    .line 84
    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object v6, v7

    .line 89
    :goto_0
    check-cast v6, Ls9/c;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    if-eqz v6, :cond_2

    .line 93
    .line 94
    check-cast v6, Ls9/c$b;

    .line 95
    .line 96
    invoke-virtual {v6}, Ls9/c$b;->e()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    move/from16 v16, v6

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    move/from16 v16, v5

    .line 104
    .line 105
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    move-object v9, v8

    .line 120
    check-cast v9, Ls9/c;

    .line 121
    .line 122
    instance-of v9, v9, Ls9/c$f;

    .line 123
    .line 124
    if-eqz v9, :cond_3

    .line 125
    .line 126
    move-object v7, v8

    .line 127
    :cond_4
    check-cast v7, Ls9/c;

    .line 128
    .line 129
    if-eqz v7, :cond_5

    .line 130
    .line 131
    check-cast v7, Ls9/c$f;

    .line 132
    .line 133
    invoke-virtual {v7}, Ls9/c$f;->e()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    move/from16 v17, v6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    move/from16 v17, v16

    .line 141
    .line 142
    :goto_2
    instance-of v6, v1, Ljava/util/Collection;

    .line 143
    .line 144
    const/4 v7, 0x1

    .line 145
    if-eqz v6, :cond_7

    .line 146
    .line 147
    move-object v8, v1

    .line 148
    check-cast v8, Ljava/util/Collection;

    .line 149
    .line 150
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_7

    .line 155
    .line 156
    :cond_6
    move/from16 v18, v5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_6

    .line 168
    .line 169
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    check-cast v9, Ls9/c;

    .line 174
    .line 175
    instance-of v9, v9, Ls9/c$d;

    .line 176
    .line 177
    if-eqz v9, :cond_8

    .line 178
    .line 179
    move/from16 v18, v7

    .line 180
    .line 181
    :goto_3
    if-eqz v6, :cond_a

    .line 182
    .line 183
    move-object v6, v1

    .line 184
    check-cast v6, Ljava/util/Collection;

    .line 185
    .line 186
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_a

    .line 191
    .line 192
    :cond_9
    move v1, v5

    .line 193
    goto :goto_4

    .line 194
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_9

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    check-cast v6, Ls9/c;

    .line 209
    .line 210
    instance-of v6, v6, Ls9/c$e;

    .line 211
    .line 212
    if-eqz v6, :cond_b

    .line 213
    .line 214
    move v1, v7

    .line 215
    :goto_4
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 216
    .line 217
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 218
    .line 219
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 220
    .line 221
    .line 222
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 223
    .line 224
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 225
    .line 226
    add-float/2addr v6, v15

    .line 227
    sub-float/2addr v6, v13

    .line 228
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 229
    .line 230
    .line 231
    if-nez v16, :cond_c

    .line 232
    .line 233
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 234
    .line 235
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 236
    .line 237
    add-float/2addr v6, v15

    .line 238
    add-float/2addr v6, v13

    .line 239
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_c
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 244
    .line 245
    move v6, v5

    .line 246
    sub-float v5, v6, v13

    .line 247
    .line 248
    iget v7, v0, Landroid/graphics/RectF;->top:F

    .line 249
    .line 250
    add-float v8, v7, v15

    .line 251
    .line 252
    sub-float/2addr v8, v13

    .line 253
    add-float/2addr v6, v13

    .line 254
    add-float/2addr v7, v15

    .line 255
    add-float/2addr v7, v13

    .line 256
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 257
    .line 258
    move/from16 v19, v7

    .line 259
    .line 260
    move v7, v6

    .line 261
    move v6, v8

    .line 262
    move/from16 v8, v19

    .line 263
    .line 264
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 265
    .line 266
    .line 267
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 268
    .line 269
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 270
    .line 271
    add-float/2addr v6, v15

    .line 272
    add-float/2addr v6, v13

    .line 273
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 274
    .line 275
    .line 276
    :goto_5
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 277
    .line 278
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 279
    .line 280
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 281
    .line 282
    .line 283
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 284
    .line 285
    add-float/2addr v5, v14

    .line 286
    sub-float/2addr v5, v13

    .line 287
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 288
    .line 289
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 290
    .line 291
    .line 292
    if-nez v16, :cond_d

    .line 293
    .line 294
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 295
    .line 296
    add-float/2addr v5, v14

    .line 297
    add-float/2addr v5, v13

    .line 298
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 299
    .line 300
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_d
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 305
    .line 306
    add-float v6, v5, v14

    .line 307
    .line 308
    sub-float/2addr v6, v13

    .line 309
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 310
    .line 311
    move v8, v5

    .line 312
    move v5, v6

    .line 313
    sub-float v6, v7, v13

    .line 314
    .line 315
    add-float/2addr v8, v14

    .line 316
    add-float/2addr v8, v13

    .line 317
    add-float/2addr v7, v13

    .line 318
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 319
    .line 320
    move/from16 v19, v8

    .line 321
    .line 322
    move v8, v7

    .line 323
    move/from16 v7, v19

    .line 324
    .line 325
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 326
    .line 327
    .line 328
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 329
    .line 330
    add-float/2addr v5, v14

    .line 331
    add-float/2addr v5, v13

    .line 332
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 333
    .line 334
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 335
    .line 336
    .line 337
    :goto_6
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 338
    .line 339
    sub-float/2addr v5, v11

    .line 340
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 341
    .line 342
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 343
    .line 344
    .line 345
    if-eqz v1, :cond_e

    .line 346
    .line 347
    sget-object v1, Lna/s;->a:Lna/s;

    .line 348
    .line 349
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 350
    .line 351
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 352
    .line 353
    invoke-virtual {v1, v4, v5, v6, v11}, Lna/s;->c(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_e
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 358
    .line 359
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 360
    .line 361
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 362
    .line 363
    .line 364
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 365
    .line 366
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 367
    .line 368
    sub-float/2addr v5, v11

    .line 369
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 370
    .line 371
    .line 372
    :goto_7
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 373
    .line 374
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 375
    .line 376
    sub-float/2addr v5, v11

    .line 377
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 378
    .line 379
    .line 380
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 381
    .line 382
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 383
    .line 384
    add-float/2addr v5, v15

    .line 385
    add-float/2addr v5, v13

    .line 386
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 387
    .line 388
    .line 389
    if-nez v17, :cond_f

    .line 390
    .line 391
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 392
    .line 393
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 394
    .line 395
    add-float/2addr v5, v15

    .line 396
    sub-float/2addr v5, v13

    .line 397
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_f
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 402
    .line 403
    sub-float v5, v1, v13

    .line 404
    .line 405
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 406
    .line 407
    add-float v7, v6, v15

    .line 408
    .line 409
    sub-float/2addr v7, v13

    .line 410
    add-float/2addr v1, v13

    .line 411
    add-float/2addr v6, v15

    .line 412
    add-float v8, v6, v13

    .line 413
    .line 414
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 415
    .line 416
    move v6, v7

    .line 417
    move v7, v1

    .line 418
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 419
    .line 420
    .line 421
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 422
    .line 423
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 424
    .line 425
    add-float/2addr v5, v15

    .line 426
    sub-float/2addr v5, v13

    .line 427
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 428
    .line 429
    .line 430
    :goto_8
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 431
    .line 432
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 433
    .line 434
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 435
    .line 436
    .line 437
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 438
    .line 439
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 440
    .line 441
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 442
    .line 443
    .line 444
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 445
    .line 446
    add-float/2addr v1, v14

    .line 447
    add-float/2addr v1, v13

    .line 448
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 449
    .line 450
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 451
    .line 452
    .line 453
    if-nez v16, :cond_10

    .line 454
    .line 455
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 456
    .line 457
    add-float/2addr v1, v14

    .line 458
    sub-float/2addr v1, v13

    .line 459
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 460
    .line 461
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 462
    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 466
    .line 467
    add-float v5, v1, v14

    .line 468
    .line 469
    sub-float/2addr v5, v13

    .line 470
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 471
    .line 472
    move v7, v6

    .line 473
    sub-float v6, v7, v13

    .line 474
    .line 475
    add-float/2addr v1, v14

    .line 476
    add-float/2addr v1, v13

    .line 477
    add-float v8, v7, v13

    .line 478
    .line 479
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 480
    .line 481
    move v7, v1

    .line 482
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 483
    .line 484
    .line 485
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 486
    .line 487
    add-float/2addr v1, v14

    .line 488
    sub-float/2addr v1, v13

    .line 489
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 490
    .line 491
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 492
    .line 493
    .line 494
    :goto_9
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 495
    .line 496
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 497
    .line 498
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 499
    .line 500
    .line 501
    if-eqz v18, :cond_12

    .line 502
    .line 503
    const/4 v1, 0x5

    .line 504
    int-to-float v1, v1

    .line 505
    mul-float/2addr v3, v1

    .line 506
    div-float/2addr v3, v12

    .line 507
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 508
    .line 509
    add-float/2addr v1, v14

    .line 510
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 511
    .line 512
    sub-float/2addr v5, v13

    .line 513
    sub-float/2addr v5, v3

    .line 514
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 515
    .line 516
    .line 517
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 518
    .line 519
    add-float/2addr v1, v14

    .line 520
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 521
    .line 522
    sub-float/2addr v5, v13

    .line 523
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 524
    .line 525
    .line 526
    if-nez v16, :cond_11

    .line 527
    .line 528
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 529
    .line 530
    add-float/2addr v1, v14

    .line 531
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 532
    .line 533
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 534
    .line 535
    .line 536
    :cond_11
    sget-object v1, Lna/s;->a:Lna/s;

    .line 537
    .line 538
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 539
    .line 540
    add-float/2addr v5, v14

    .line 541
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 542
    .line 543
    sub-float/2addr v0, v13

    .line 544
    sub-float/2addr v0, v3

    .line 545
    sub-float/2addr v0, v11

    .line 546
    invoke-virtual {v1, v4, v5, v0, v11}, Lna/s;->b(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 547
    .line 548
    .line 549
    :cond_12
    invoke-virtual {v4, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 550
    .line 551
    .line 552
    return-object v4
.end method
