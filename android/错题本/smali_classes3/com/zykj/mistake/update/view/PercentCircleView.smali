.class public final Lcom/zykj/mistake/update/view/PercentCircleView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/zykj/mistake/update/view/PercentCircleView;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "progress",
        "Ld6/s;",
        "setTargetPercent",
        "(F)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;

.field public e:I

.field public f:I

.field public g:F

.field public h:Landroid/graphics/RectF;

.field public i:F

.field public j:Ljava/lang/String;

.field public k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public o:I

.field public final p:I

.field public final q:I

.field public r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "0%"

    iput-object p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->j:Ljava/lang/String;

    const/16 p1, 0x7b

    .line 3
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    const/16 p1, 0x1e

    .line 4
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    const/16 p1, 0xa

    .line 5
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->q:I

    .line 6
    invoke-virtual {p0}, Lcom/zykj/mistake/update/view/PercentCircleView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    const-string v0, "0%"

    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->j:Ljava/lang/String;

    const/16 v0, 0x7b

    .line 9
    iput v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    const/16 v1, 0x1e

    .line 10
    iput v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    const/16 v1, 0xa

    .line 11
    iput v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->q:I

    .line 12
    sget-object v1, Lcom/zykj/mistake/R$styleable;->PercentCircleView:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget p2, Lcom/zykj/mistake/R$styleable;->PercentCircleView_radius:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 14
    sget p2, Lcom/zykj/mistake/R$styleable;->PercentCircleView_circleBackground:I

    const/4 v0, -0x1

    .line 15
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->l:I

    .line 16
    sget p2, Lcom/zykj/mistake/R$styleable;->PercentCircleView_textColor:I

    const/high16 v0, -0x5a000000

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->p:I

    .line 17
    sget p2, Lcom/zykj/mistake/R$styleable;->PercentCircleView_ringColor:I

    const v0, 0xf3f3f3

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->m:I

    .line 18
    sget p2, Lcom/zykj/mistake/R$styleable;->PercentCircleView_processColor:I

    const v0, 0x27c69a

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 19
    iput p2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->n:I

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    invoke-virtual {p0}, Lcom/zykj/mistake/update/view/PercentCircleView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    const-string p1, "0%"

    iput-object p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->j:Ljava/lang/String;

    const/16 p1, 0x7b

    .line 24
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    const/16 p1, 0x1e

    .line 25
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    const/16 p1, 0xa

    .line 26
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->q:I

    .line 27
    invoke-virtual {p0}, Lcom/zykj/mistake/update/view/PercentCircleView;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 2
    .line 3
    iput v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->i:F

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->g:F

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->b:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->b:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->l:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->b:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 45
    .line 46
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->p:I

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    .line 73
    .line 74
    int-to-float v2, v2

    .line 75
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Landroid/graphics/Paint;

    .line 89
    .line 90
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->m:I

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 119
    .line 120
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->q:I

    .line 124
    .line 125
    int-to-float v3, v3

    .line 126
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 127
    .line 128
    .line 129
    new-instance v0, Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 140
    .line 141
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->n:I

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 150
    .line 151
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 158
    .line 159
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    float-to-int v0, v0

    .line 175
    iput v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    .line 176
    .line 177
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    const-string v1, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->f:I

    .line 13
    .line 14
    int-to-float v2, v2

    .line 15
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 16
    .line 17
    int-to-float v3, v3

    .line 18
    iget-object v4, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->b:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->j:Ljava/lang/String;

    .line 27
    .line 28
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->f:I

    .line 32
    .line 33
    int-to-float v3, v3

    .line 34
    iget v4, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->o:I

    .line 35
    .line 36
    int-to-float v4, v4

    .line 37
    const/high16 v5, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v4, v5

    .line 40
    add-float/2addr v4, v3

    .line 41
    iget-object v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->r:Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->i:F

    .line 55
    .line 56
    iget-object v5, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/high16 v3, 0x43b40000    # 360.0f

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    move-object v0, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->h:Landroid/graphics/RectF;

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->i:F

    .line 74
    .line 75
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->g:F

    .line 76
    .line 77
    iget-object v5, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    div-int/lit8 p2, p2, 0x2

    .line 10
    .line 11
    iput p2, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    div-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    iput p2, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->f:I

    .line 20
    .line 21
    iget p2, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 22
    .line 23
    iget p3, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 24
    .line 25
    if-le p2, p3, :cond_0

    .line 26
    .line 27
    iput p3, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 28
    .line 29
    :cond_0
    new-instance p2, Landroid/graphics/RectF;

    .line 30
    .line 31
    iget p3, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 32
    .line 33
    iget p4, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 34
    .line 35
    sub-int p5, p3, p4

    .line 36
    .line 37
    iget v0, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->q:I

    .line 38
    .line 39
    div-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    add-int/2addr p5, v0

    .line 42
    int-to-float p5, p5

    .line 43
    iget v1, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->f:I

    .line 44
    .line 45
    sub-int v2, v1, p4

    .line 46
    .line 47
    add-int/2addr v2, v0

    .line 48
    int-to-float v2, v2

    .line 49
    add-int/2addr p3, p4

    .line 50
    sub-int/2addr p3, v0

    .line 51
    int-to-float p3, p3

    .line 52
    add-int/2addr v1, p4

    .line 53
    sub-int/2addr v1, v0

    .line 54
    int-to-float p4, v1

    .line 55
    invoke-direct {p2, p5, v2, p3, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->h:Landroid/graphics/RectF;

    .line 59
    .line 60
    new-instance p2, Landroid/graphics/RectF;

    .line 61
    .line 62
    iget p3, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->e:I

    .line 63
    .line 64
    iget p4, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 65
    .line 66
    sub-int p5, p3, p4

    .line 67
    .line 68
    add-int/2addr p5, v0

    .line 69
    int-to-float p5, p5

    .line 70
    iget v1, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->f:I

    .line 71
    .line 72
    sub-int v2, v1, p4

    .line 73
    .line 74
    add-int/2addr v2, v0

    .line 75
    int-to-float v2, v2

    .line 76
    add-int/2addr p3, p4

    .line 77
    sub-int/2addr p3, v0

    .line 78
    int-to-float p3, p3

    .line 79
    add-int/2addr v1, p4

    .line 80
    sub-int/2addr v1, v0

    .line 81
    int-to-float p4, v1

    .line 82
    invoke-direct {p2, p5, v2, p3, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 83
    .line 84
    .line 85
    iput-object p2, p1, Lcom/zykj/mistake/update/view/PercentCircleView;->r:Landroid/graphics/RectF;

    .line 86
    .line 87
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    const/high16 v2, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-ne p2, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v3, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 17
    .line 18
    mul-int/lit8 v3, v3, 0x2

    .line 19
    .line 20
    if-ne p2, v1, :cond_1

    .line 21
    .line 22
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v0, v3

    .line 28
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ne p2, v2, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v2, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->k:I

    .line 40
    .line 41
    mul-int/lit8 v2, v2, 0x2

    .line 42
    .line 43
    if-ne p2, v1, :cond_3

    .line 44
    .line 45
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move p1, v2

    .line 51
    :goto_1
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final setTargetPercent(F)V
    .locals 2

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    mul-float/2addr v0, p1

    .line 5
    float-to-int v0, v0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, "%"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->j:Ljava/lang/String;

    .line 24
    .line 25
    const/16 v0, 0x168

    .line 26
    .line 27
    int-to-float v0, v0

    .line 28
    mul-float/2addr p1, v0

    .line 29
    iput p1, p0, Lcom/zykj/mistake/update/view/PercentCircleView;->g:F

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 32
    .line 33
    .line 34
    return-void
.end method
