.class public Lcom/xuexiang/xui/widget/button/shinebutton/a;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/shinebutton/a$e;
    }
.end annotation


# static fields
.field public static D:[I


# instance fields
.field public A:F

.field public B:Z

.field public C:F

.field public a:Lr0/a;

.field public b:Landroid/animation/ValueAnimator;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Paint;

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:J

.field public l:J

.field public m:F

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Landroid/graphics/RectF;

.field public t:Landroid/graphics/RectF;

.field public u:Ljava/util/Random;

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    sput-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->D:[I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Lcom/xuexiang/xui/widget/button/shinebutton/a$e;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0xa

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 7
    .line 8
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/a;->D:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    aget v1, p1, v0

    .line 12
    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->n:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aget p1, p1, v1

    .line 17
    .line 18
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->o:I

    .line 19
    .line 20
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->p:I

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->q:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->r:Z

    .line 25
    .line 26
    new-instance p1, Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->s:Landroid/graphics/RectF;

    .line 32
    .line 33
    new-instance p1, Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->t:Landroid/graphics/RectF;

    .line 39
    .line 40
    new-instance p1, Ljava/util/Random;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->u:Ljava/util/Random;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->A:F

    .line 49
    .line 50
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->B:Z

    .line 51
    .line 52
    const p1, 0x3e4ccccd    # 0.2f

    .line 53
    .line 54
    .line 55
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->C:F

    .line 56
    .line 57
    invoke-virtual {p0, p3, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/a;->q(Lcom/xuexiang/xui/widget/button/shinebutton/a$e;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->c:Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    new-instance p1, Lr0/a;

    .line 68
    .line 69
    iget-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->k:J

    .line 70
    .line 71
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->m:F

    .line 72
    .line 73
    iget-wide v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->l:J

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    invoke-direct/range {v0 .. v5}, Lr0/a;-><init>(JFJ)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->a:Lr0/a;

    .line 80
    .line 81
    const-wide/16 p1, 0x19

    .line 82
    .line 83
    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->setFrameDelay(J)V

    .line 84
    .line 85
    .line 86
    new-instance p3, Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 92
    .line 93
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->o:I

    .line 94
    .line 95
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 96
    .line 97
    .line 98
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 99
    .line 100
    const/high16 v0, 0x41a00000    # 20.0f

    .line 101
    .line 102
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 103
    .line 104
    .line 105
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 106
    .line 107
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 108
    .line 109
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 110
    .line 111
    .line 112
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 113
    .line 114
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 115
    .line 116
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 117
    .line 118
    .line 119
    new-instance p3, Landroid/graphics/Paint;

    .line 120
    .line 121
    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 125
    .line 126
    const/4 v1, -0x1

    .line 127
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    .line 129
    .line 130
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 131
    .line 132
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 133
    .line 134
    .line 135
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 136
    .line 137
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 138
    .line 139
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 140
    .line 141
    .line 142
    new-instance p3, Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 148
    .line 149
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->n:I

    .line 150
    .line 151
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    .line 153
    .line 154
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 155
    .line 156
    const/high16 v0, 0x41200000    # 10.0f

    .line 157
    .line 158
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 159
    .line 160
    .line 161
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 162
    .line 163
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 164
    .line 165
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 166
    .line 167
    .line 168
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 169
    .line 170
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 171
    .line 172
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 173
    .line 174
    .line 175
    const/4 p3, 0x2

    .line 176
    new-array p3, p3, [F

    .line 177
    .line 178
    fill-array-data p3, :array_0

    .line 179
    .line 180
    .line 181
    invoke-static {p3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 186
    .line 187
    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->setFrameDelay(J)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 191
    .line 192
    iget-wide p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->l:J

    .line 193
    .line 194
    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 198
    .line 199
    new-instance p2, Ls0/a;

    .line 200
    .line 201
    sget-object p3, Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;->i:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;

    .line 202
    .line 203
    invoke-direct {p2, p3}, Ls0/a;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 210
    .line 211
    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/a$a;

    .line 212
    .line 213
    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/a$a;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/a;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 217
    .line 218
    .line 219
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 220
    .line 221
    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/a$b;

    .line 222
    .line 223
    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/a$b;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/a;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->a:Lr0/a;

    .line 230
    .line 231
    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/a$c;

    .line 232
    .line 233
    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/a$c;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/a;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    nop

    .line 241
    :array_0
    .array-data 4
        0x0
        0x3f8ccccd    # 1.1f
    .end array-data
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/button/shinebutton/a;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->A:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/button/shinebutton/a;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/button/shinebutton/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->y:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/button/shinebutton/a;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->s:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/button/shinebutton/a;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->C:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/button/shinebutton/a;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->t:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/button/shinebutton/a;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->z:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/button/shinebutton/a;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->z:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/button/shinebutton/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/button/shinebutton/a;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->m:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Lcom/xuexiang/xui/widget/button/shinebutton/a;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l(Lcom/xuexiang/xui/widget/button/shinebutton/a;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(Lcom/xuexiang/xui/widget/button/shinebutton/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->x:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic n(Lcom/xuexiang/xui/widget/button/shinebutton/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic o(Lcom/xuexiang/xui/widget/button/shinebutton/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->h:I

    .line 7
    .line 8
    const/high16 v3, 0x43b40000    # 360.0f

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->q:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 19
    .line 20
    sget-object v5, Lcom/xuexiang/xui/widget/button/shinebutton/a;->D:[I

    .line 21
    .line 22
    iget v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 23
    .line 24
    div-int/lit8 v6, v6, 0x2

    .line 25
    .line 26
    sub-int/2addr v6, v1

    .line 27
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget v7, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 32
    .line 33
    if-lt v6, v7, :cond_0

    .line 34
    .line 35
    add-int/lit8 v7, v7, -0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    div-int/lit8 v7, v7, 0x2

    .line 39
    .line 40
    sub-int/2addr v7, v1

    .line 41
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    :goto_1
    aget v5, v5, v7

    .line 46
    .line 47
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->s:Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->h:I

    .line 53
    .line 54
    int-to-float v2, v2

    .line 55
    div-float/2addr v3, v2

    .line 56
    int-to-float v2, v1

    .line 57
    mul-float/2addr v3, v2

    .line 58
    add-float/2addr v3, v4

    .line 59
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->z:F

    .line 60
    .line 61
    sub-float/2addr v2, v4

    .line 62
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->j:F

    .line 63
    .line 64
    mul-float/2addr v2, v4

    .line 65
    add-float v8, v3, v2

    .line 66
    .line 67
    const v9, 0x3dcccccd    # 0.1f

    .line 68
    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/button/shinebutton/a;->p(Landroid/graphics/Paint;)Landroid/graphics/Paint;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    move-object v6, p1

    .line 78
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    :goto_2
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->h:I

    .line 85
    .line 86
    if-ge v0, v1, :cond_5

    .line 87
    .line 88
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->q:Z

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 93
    .line 94
    sget-object v2, Lcom/xuexiang/xui/widget/button/shinebutton/a;->D:[I

    .line 95
    .line 96
    iget v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 97
    .line 98
    div-int/lit8 v5, v5, 0x2

    .line 99
    .line 100
    sub-int/2addr v5, v0

    .line 101
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    iget v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 106
    .line 107
    if-lt v5, v6, :cond_3

    .line 108
    .line 109
    add-int/lit8 v6, v6, -0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    div-int/lit8 v6, v6, 0x2

    .line 113
    .line 114
    sub-int/2addr v6, v0

    .line 115
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    :goto_3
    aget v2, v2, v6

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 122
    .line 123
    .line 124
    :cond_4
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->t:Landroid/graphics/RectF;

    .line 125
    .line 126
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->h:I

    .line 127
    .line 128
    int-to-float v1, v1

    .line 129
    div-float v1, v3, v1

    .line 130
    .line 131
    int-to-float v2, v0

    .line 132
    mul-float/2addr v1, v2

    .line 133
    add-float/2addr v1, v4

    .line 134
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->i:F

    .line 135
    .line 136
    sub-float/2addr v1, v2

    .line 137
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->z:F

    .line 138
    .line 139
    sub-float/2addr v2, v4

    .line 140
    iget v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->j:F

    .line 141
    .line 142
    mul-float/2addr v2, v5

    .line 143
    add-float v7, v1, v2

    .line 144
    .line 145
    const v8, 0x3dcccccd    # 0.1f

    .line 146
    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->f:Landroid/graphics/Paint;

    .line 150
    .line 151
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/button/shinebutton/a;->p(Landroid/graphics/Paint;)Landroid/graphics/Paint;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    move-object v5, p1

    .line 156
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v0, v0, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 163
    .line 164
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->x:I

    .line 165
    .line 166
    int-to-float v1, v1

    .line 167
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->A:F

    .line 168
    .line 169
    mul-float/2addr v1, v2

    .line 170
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->m:F

    .line 171
    .line 172
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->C:F

    .line 173
    .line 174
    sub-float/2addr v2, v3

    .line 175
    mul-float/2addr v1, v2

    .line 176
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 177
    .line 178
    .line 179
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->A:F

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    cmpl-float v2, v0, v1

    .line 183
    .line 184
    if-eqz v2, :cond_6

    .line 185
    .line 186
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 187
    .line 188
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->x:I

    .line 189
    .line 190
    int-to-float v2, v2

    .line 191
    mul-float/2addr v2, v0

    .line 192
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->m:F

    .line 193
    .line 194
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->C:F

    .line 195
    .line 196
    sub-float/2addr v0, v3

    .line 197
    mul-float/2addr v2, v0

    .line 198
    const/high16 v0, 0x41000000    # 8.0f

    .line 199
    .line 200
    sub-float/2addr v2, v0

    .line 201
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 208
    .line 209
    .line 210
    :goto_4
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 211
    .line 212
    int-to-float v0, v0

    .line 213
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 214
    .line 215
    int-to-float v1, v1

    .line 216
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->d:Landroid/graphics/Paint;

    .line 217
    .line 218
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 219
    .line 220
    .line 221
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 222
    .line 223
    int-to-float v0, v0

    .line 224
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 225
    .line 226
    int-to-float v1, v1

    .line 227
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->e:Landroid/graphics/Paint;

    .line 228
    .line 229
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->a:Lr0/a;

    .line 233
    .line 234
    if-eqz p1, :cond_7

    .line 235
    .line 236
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->B:Z

    .line 237
    .line 238
    if-nez p1, :cond_7

    .line 239
    .line 240
    const/4 p1, 0x1

    .line 241
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->B:Z

    .line 242
    .line 243
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->c:Ljava/lang/ref/WeakReference;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    .line 250
    .line 251
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/a;->r(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 252
    .line 253
    .line 254
    :cond_7
    return-void
.end method

.method public final p(Landroid/graphics/Paint;)Landroid/graphics/Paint;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->D:[I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->u:Ljava/util/Random;

    .line 8
    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->g:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aget v0, v0, v1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
.end method

.method public final q(Lcom/xuexiang/xui/widget/button/shinebutton/a$e;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public r(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->x:I

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->y:I

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    new-array v1, v0, [I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget v2, v1, v2

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    div-int/2addr v3, v0

    .line 30
    add-int/2addr v2, v3

    .line 31
    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aget v1, v1, v2

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    div-int/2addr v2, v0

    .line 41
    add-int/2addr v1, v2

    .line 42
    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    sub-int/2addr v0, v1

    .line 65
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->v:I

    .line 66
    .line 67
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    sub-int/2addr v0, p1

    .line 74
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->w:I

    .line 75
    .line 76
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->a:Lr0/a;

    .line 77
    .line 78
    new-instance v0, Lcom/xuexiang/xui/widget/button/shinebutton/a$d;

    .line 79
    .line 80
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/a$d;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/a;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->a:Lr0/a;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/a;->b:Landroid/animation/ValueAnimator;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 94
    .line 95
    .line 96
    return-void
.end method
