.class public Lcom/xuexiang/xui/widget/button/SmoothCheckBox;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# static fields
.field public static final u:I


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public final d:[Landroid/graphics/Point;

.field public final e:Landroid/graphics/Point;

.field public final f:Landroid/graphics/Path;

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public final m:I

.field public n:I

.field public final o:I

.field public final p:I

.field public q:I

.field public final r:I

.field public s:Z

.field public t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "#DFDFDF"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->u:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->SmoothCheckBoxStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->k:F

    .line 5
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_tick:I

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 7
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_duration:I

    const/16 v3, 0x12c

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->m:I

    .line 8
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_unchecked_stroke:I

    sget v3, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->u:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    .line 9
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_checked:I

    sget v3, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 10
    invoke-static {p1, v3, v1}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p1

    .line 11
    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->o:I

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_unchecked:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->p:I

    .line 13
    sget p1, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_stroke_width:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 14
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->r:I

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 17
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c:Landroid/graphics/Paint;

    .line 21
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a:Landroid/graphics/Paint;

    .line 24
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->o:I

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 27
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->e:Landroid/graphics/Point;

    const/4 p1, 0x3

    .line 28
    new-array p1, p1, [Landroid/graphics/Point;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 29
    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    aput-object p3, p1, v1

    .line 30
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    aput-object p3, p1, p2

    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    const/4 p3, 0x2

    aput-object p2, p1, p3

    .line 32
    new-instance p1, Lb1/c;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static a(FII)I
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    int-to-float v0, v0

    .line 34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 35
    .line 36
    sub-float/2addr v6, p0

    .line 37
    mul-float/2addr v0, v6

    .line 38
    int-to-float v3, v3

    .line 39
    mul-float/2addr v3, p0

    .line 40
    add-float/2addr v3, v0

    .line 41
    float-to-int v0, v3

    .line 42
    int-to-float v1, v1

    .line 43
    mul-float/2addr v1, v6

    .line 44
    int-to-float v3, v4

    .line 45
    mul-float/2addr v3, p0

    .line 46
    add-float/2addr v3, v1

    .line 47
    float-to-int v1, v3

    .line 48
    int-to-float v2, v2

    .line 49
    mul-float/2addr v2, v6

    .line 50
    int-to-float v3, v5

    .line 51
    mul-float/2addr v3, p0

    .line 52
    add-float/2addr v3, v2

    .line 53
    float-to-int v2, v3

    .line 54
    int-to-float p1, p1

    .line 55
    mul-float/2addr p1, v6

    .line 56
    int-to-float p2, p2

    .line 57
    mul-float/2addr p2, p0

    .line 58
    add-float/2addr p2, p1

    .line 59
    float-to-int p0, p2

    .line 60
    invoke-static {v0, v1, v2, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x41c80000    # 25.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    if-eq p1, v2, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    .line 26
    .line 27
    if-eq p1, v0, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_0
    return v1

    .line 32
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->t:Z

    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->k:F

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    :cond_0
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->o:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->r:I

    .line 22
    .line 23
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 28
    .line 29
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->h:F

    .line 30
    .line 31
    add-float v2, v0, v1

    .line 32
    .line 33
    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 34
    .line 35
    return-void
.end method

.method public final isChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->e:Landroid/graphics/Point;

    .line 9
    .line 10
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 11
    .line 12
    int-to-float v1, v1

    .line 13
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->k:F

    .line 17
    .line 18
    mul-float/2addr v2, v1

    .line 19
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a:Landroid/graphics/Paint;

    .line 25
    .line 26
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->p:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->e:Landroid/graphics/Point;

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 34
    .line 35
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 36
    .line 37
    sub-int v2, v1, v2

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 41
    .line 42
    mul-float/2addr v2, v3

    .line 43
    int-to-float v1, v1

    .line 44
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 45
    .line 46
    int-to-float v0, v0

    .line 47
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->t:Z

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 63
    .line 64
    .line 65
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 66
    .line 67
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 68
    .line 69
    cmpg-float v2, v0, v1

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x1

    .line 73
    if-gez v2, :cond_1

    .line 74
    .line 75
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->l:I

    .line 76
    .line 77
    int-to-float v2, v2

    .line 78
    const/high16 v5, 0x41a00000    # 20.0f

    .line 79
    .line 80
    div-float/2addr v2, v5

    .line 81
    const/high16 v5, 0x40400000    # 3.0f

    .line 82
    .line 83
    cmpg-float v6, v2, v5

    .line 84
    .line 85
    if-gez v6, :cond_0

    .line 86
    .line 87
    move v2, v5

    .line 88
    :cond_0
    add-float/2addr v0, v2

    .line 89
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 90
    .line 91
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 92
    .line 93
    aget-object v3, v2, v3

    .line 94
    .line 95
    iget v5, v3, Landroid/graphics/Point;->x:I

    .line 96
    .line 97
    int-to-float v6, v5

    .line 98
    aget-object v2, v2, v4

    .line 99
    .line 100
    iget v4, v2, Landroid/graphics/Point;->x:I

    .line 101
    .line 102
    sub-int/2addr v4, v5

    .line 103
    int-to-float v4, v4

    .line 104
    mul-float/2addr v4, v0

    .line 105
    div-float/2addr v4, v1

    .line 106
    add-float/2addr v4, v6

    .line 107
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 108
    .line 109
    int-to-float v5, v3

    .line 110
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 111
    .line 112
    sub-int/2addr v2, v3

    .line 113
    int-to-float v2, v2

    .line 114
    mul-float/2addr v2, v0

    .line 115
    div-float/2addr v2, v1

    .line 116
    add-float/2addr v2, v5

    .line 117
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 118
    .line 119
    invoke-virtual {v0, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 123
    .line 124
    invoke-virtual {v0, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 135
    .line 136
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 137
    .line 138
    cmpl-float p1, p1, v0

    .line 139
    .line 140
    if-lez p1, :cond_3

    .line 141
    .line 142
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 147
    .line 148
    aget-object v0, v0, v3

    .line 149
    .line 150
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 151
    .line 152
    int-to-float v1, v1

    .line 153
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 154
    .line 155
    int-to-float v0, v0

    .line 156
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 157
    .line 158
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 162
    .line 163
    aget-object v0, v0, v4

    .line 164
    .line 165
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 166
    .line 167
    int-to-float v1, v1

    .line 168
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 169
    .line 170
    int-to-float v0, v0

    .line 171
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 172
    .line 173
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 177
    .line 178
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 184
    .line 185
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 186
    .line 187
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->h:F

    .line 188
    .line 189
    add-float v3, v1, v2

    .line 190
    .line 191
    cmpg-float v3, v0, v3

    .line 192
    .line 193
    const/4 v5, 0x2

    .line 194
    if-gez v3, :cond_2

    .line 195
    .line 196
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 197
    .line 198
    aget-object v6, v3, v4

    .line 199
    .line 200
    iget v7, v6, Landroid/graphics/Point;->x:I

    .line 201
    .line 202
    int-to-float v8, v7

    .line 203
    aget-object v3, v3, v5

    .line 204
    .line 205
    iget v5, v3, Landroid/graphics/Point;->x:I

    .line 206
    .line 207
    sub-int/2addr v5, v7

    .line 208
    int-to-float v5, v5

    .line 209
    sub-float/2addr v0, v1

    .line 210
    mul-float/2addr v5, v0

    .line 211
    div-float/2addr v5, v2

    .line 212
    add-float/2addr v5, v8

    .line 213
    iget v1, v6, Landroid/graphics/Point;->y:I

    .line 214
    .line 215
    int-to-float v6, v1

    .line 216
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 217
    .line 218
    sub-int/2addr v1, v3

    .line 219
    int-to-float v1, v1

    .line 220
    invoke-static {v0, v1, v2, v6}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 227
    .line 228
    .line 229
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 230
    .line 231
    aget-object v1, v1, v4

    .line 232
    .line 233
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 234
    .line 235
    int-to-float v2, v2

    .line 236
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 237
    .line 238
    int-to-float v1, v1

    .line 239
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 240
    .line 241
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 245
    .line 246
    invoke-virtual {v1, v5, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 250
    .line 251
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 252
    .line 253
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 254
    .line 255
    .line 256
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->l:I

    .line 257
    .line 258
    div-int/lit8 p1, p1, 0x14

    .line 259
    .line 260
    const/4 v0, 0x3

    .line 261
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    int-to-float p1, p1

    .line 266
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 267
    .line 268
    add-float/2addr v0, p1

    .line 269
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 275
    .line 276
    .line 277
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 278
    .line 279
    aget-object v0, v0, v4

    .line 280
    .line 281
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 282
    .line 283
    int-to-float v1, v1

    .line 284
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 285
    .line 286
    int-to-float v0, v0

    .line 287
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 288
    .line 289
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 293
    .line 294
    aget-object v0, v0, v5

    .line 295
    .line 296
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 297
    .line 298
    int-to-float v1, v1

    .line 299
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 300
    .line 301
    int-to-float v0, v0

    .line 302
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 303
    .line 304
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 305
    .line 306
    .line 307
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->f:Landroid/graphics/Path;

    .line 308
    .line 309
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 310
    .line 311
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 312
    .line 313
    .line 314
    :cond_3
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->i:F

    .line 315
    .line 316
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 317
    .line 318
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->h:F

    .line 319
    .line 320
    add-float/2addr v0, v1

    .line 321
    cmpg-float p1, p1, v0

    .line 322
    .line 323
    if-gez p1, :cond_4

    .line 324
    .line 325
    new-instance p1, Lcom/xuexiang/xui/widget/button/c;

    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    invoke-direct {p1, p0, v0}, Lcom/xuexiang/xui/widget/button/c;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;I)V

    .line 329
    .line 330
    .line 331
    const-wide/16 v0, 0xa

    .line 332
    .line 333
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 334
    .line 335
    .line 336
    :cond_4
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->l:I

    .line 6
    .line 7
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    div-int/lit8 p1, p1, 0xa

    .line 16
    .line 17
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    div-int/lit8 p2, p2, 0x5

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 30
    .line 31
    const/4 p2, 0x3

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 37
    .line 38
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->l:I

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    div-int/2addr p1, p2

    .line 42
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->e:Landroid/graphics/Point;

    .line 43
    .line 44
    iput p1, p3, Landroid/graphics/Point;->x:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    div-int/2addr p1, p2

    .line 51
    iput p1, p3, Landroid/graphics/Point;->y:I

    .line 52
    .line 53
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 54
    .line 55
    const/4 p3, 0x0

    .line 56
    aget-object p1, p1, p3

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    int-to-float p4, p4

    .line 63
    const/high16 p5, 0x41f00000    # 30.0f

    .line 64
    .line 65
    div-float/2addr p4, p5

    .line 66
    const/high16 v0, 0x40e00000    # 7.0f

    .line 67
    .line 68
    mul-float/2addr p4, v0

    .line 69
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    iput p4, p1, Landroid/graphics/Point;->x:I

    .line 74
    .line 75
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 76
    .line 77
    aget-object p1, p1, p3

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    int-to-float p4, p4

    .line 84
    div-float/2addr p4, p5

    .line 85
    const/high16 v0, 0x41600000    # 14.0f

    .line 86
    .line 87
    mul-float/2addr p4, v0

    .line 88
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    iput p4, p1, Landroid/graphics/Point;->y:I

    .line 93
    .line 94
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 95
    .line 96
    const/4 p4, 0x1

    .line 97
    aget-object p1, p1, p4

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-float v0, v0

    .line 104
    div-float/2addr v0, p5

    .line 105
    const/high16 v1, 0x41500000    # 13.0f

    .line 106
    .line 107
    mul-float/2addr v0, v1

    .line 108
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 113
    .line 114
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 115
    .line 116
    aget-object p1, p1, p4

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    int-to-float v0, v0

    .line 123
    div-float/2addr v0, p5

    .line 124
    const/high16 v1, 0x41a00000    # 20.0f

    .line 125
    .line 126
    mul-float/2addr v0, v1

    .line 127
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iput v0, p1, Landroid/graphics/Point;->y:I

    .line 132
    .line 133
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 134
    .line 135
    aget-object p1, p1, p2

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    int-to-float v0, v0

    .line 142
    div-float/2addr v0, p5

    .line 143
    const/high16 v1, 0x41b00000    # 22.0f

    .line 144
    .line 145
    mul-float/2addr v0, v1

    .line 146
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 151
    .line 152
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 153
    .line 154
    aget-object p1, p1, p2

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    int-to-float v0, v0

    .line 161
    div-float/2addr v0, p5

    .line 162
    const/high16 p5, 0x41200000    # 10.0f

    .line 163
    .line 164
    mul-float/2addr v0, p5

    .line 165
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 166
    .line 167
    .line 168
    move-result p5

    .line 169
    iput p5, p1, Landroid/graphics/Point;->y:I

    .line 170
    .line 171
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 172
    .line 173
    aget-object p5, p1, p4

    .line 174
    .line 175
    iget p5, p5, Landroid/graphics/Point;->x:I

    .line 176
    .line 177
    aget-object p1, p1, p3

    .line 178
    .line 179
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 180
    .line 181
    sub-int/2addr p5, p1

    .line 182
    int-to-double v0, p5

    .line 183
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 184
    .line 185
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 186
    .line 187
    .line 188
    move-result-wide v0

    .line 189
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 190
    .line 191
    aget-object p5, p1, p4

    .line 192
    .line 193
    iget p5, p5, Landroid/graphics/Point;->y:I

    .line 194
    .line 195
    aget-object p1, p1, p3

    .line 196
    .line 197
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 198
    .line 199
    sub-int/2addr p5, p1

    .line 200
    int-to-double v4, p5

    .line 201
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 202
    .line 203
    .line 204
    move-result-wide v4

    .line 205
    add-double/2addr v4, v0

    .line 206
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 207
    .line 208
    .line 209
    move-result-wide v0

    .line 210
    double-to-float p1, v0

    .line 211
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->g:F

    .line 212
    .line 213
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 214
    .line 215
    aget-object p3, p1, p2

    .line 216
    .line 217
    iget p3, p3, Landroid/graphics/Point;->x:I

    .line 218
    .line 219
    aget-object p1, p1, p4

    .line 220
    .line 221
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 222
    .line 223
    sub-int/2addr p3, p1

    .line 224
    int-to-double v0, p3

    .line 225
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->d:[Landroid/graphics/Point;

    .line 230
    .line 231
    aget-object p2, p1, p2

    .line 232
    .line 233
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 234
    .line 235
    aget-object p1, p1, p4

    .line 236
    .line 237
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 238
    .line 239
    sub-int/2addr p2, p1

    .line 240
    int-to-double p1, p2

    .line 241
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 242
    .line 243
    .line 244
    move-result-wide p1

    .line 245
    add-double/2addr p1, v0

    .line 246
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 247
    .line 248
    .line 249
    move-result-wide p1

    .line 250
    double-to-float p1, p1

    .line 251
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->h:F

    .line 252
    .line 253
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->n:I

    .line 254
    .line 255
    int-to-float p1, p1

    .line 256
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b:Landroid/graphics/Paint;

    .line 257
    .line 258
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 259
    .line 260
    .line 261
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->b(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "InstanceState"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setChecked(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "InstanceState"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public setChecked(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCheckedSilent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnCheckedChangeListener(Lcom/xuexiang/xui/widget/button/e;)V
    .locals 0

    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->s:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setChecked(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
