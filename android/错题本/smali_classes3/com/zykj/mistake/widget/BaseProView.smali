.class public abstract Lcom/zykj/mistake/widget/BaseProView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:I

.field public m:I

.field public n:Landroid/graphics/Paint;

.field public o:Landroid/graphics/Paint;

.field public p:Landroid/graphics/Paint;

.field public q:Landroid/graphics/Paint;

.field public r:Landroid/graphics/Paint;

.field public s:D

.field public t:D

.field public u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/zykj/mistake/widget/BaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/mistake/widget/BaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p3, ""

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->f:Ljava/lang/String;

    .line 5
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    .line 6
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    .line 9
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    .line 10
    sget-object p3, Lcom/zykj/mistake/R$styleable;->BaseProgressView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 11
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_progress_max:I

    const/16 p3, 0x64

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    int-to-double p2, p2

    iput-wide p2, p0, Lcom/zykj/mistake/widget/BaseProView;->s:D

    .line 12
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_progress_value:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    int-to-double v0, p2

    iput-wide v0, p0, Lcom/zykj/mistake/widget/BaseProView;->t:D

    .line 13
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_progress_size:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 14
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_progress_color_background:I

    const v0, -0x777778

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->d:I

    .line 15
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_progress_color:I

    const/16 v0, -0x100

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->e:I

    .line 16
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_text_size:I

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->g:I

    .line 19
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_text_color:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->h:I

    .line 20
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_text_show:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 21
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_text_decimal_num:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->i:I

    .line 22
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_light_color:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->j:I

    .line 23
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_light_show:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/zykj/mistake/widget/BaseProView;->k:Z

    .line 24
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_stroke_color:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->m:I

    .line 25
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_stroke_width:I

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->l:I

    .line 28
    sget p2, Lcom/zykj/mistake/R$styleable;->BaseProgressView_stroke_show:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 29
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/BaseProView;->c()V

    .line 31
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 32
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->d:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->e:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->h:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->g:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 39
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->j:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->l:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->m:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    iget-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract b()V
.end method

.method public final c()V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcom/zykj/mistake/widget/BaseProView;->t:D

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/zykj/mistake/widget/BaseProView;->s:D

    .line 9
    .line 10
    div-double/2addr v1, v3

    .line 11
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 12
    .line 13
    mul-double/2addr v1, v3

    .line 14
    iget v3, p0, Lcom/zykj/mistake/widget/BaseProView;->i:I

    .line 15
    .line 16
    const-string v4, ""

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    double-to-int v1, v1

    .line 26
    invoke-static {v3, v4, v1}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    const/4 v3, 0x0

    .line 32
    :goto_0
    iget v5, p0, Lcom/zykj/mistake/widget/BaseProView;->i:I

    .line 33
    .line 34
    if-ge v3, v5, :cond_2

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const-string v4, "0.0"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v5, "0"

    .line 42
    .line 43
    invoke-static {v4, v5}, Landroid/support/v4/media/f;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance v3, Ljava/text/DecimalFormat;

    .line 51
    .line 52
    invoke-direct {v3, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_2
    const-string v2, "%"

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public varargs d([I)V
    .locals 0

    .line 1
    return-void
.end method

.method public getLightColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getLightPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxProgress()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/widget/BaseProView;->s:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getProgress()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/widget/BaseProView;->t:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getProgressBgPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProgressColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgressColorBackground()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgressPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProgressSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getStrokeColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public getStrokePaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStrokeWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextDecimalNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->b:I

    .line 7
    .line 8
    iget p1, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 13
    .line 14
    :cond_0
    iget p1, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 15
    .line 16
    sub-int/2addr p2, p1

    .line 17
    div-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    iput p2, p0, Lcom/zykj/mistake/widget/BaseProView;->u:I

    .line 20
    .line 21
    iget-boolean p1, p0, Lcom/zykj/mistake/widget/BaseProView;->k:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    if-lez p2, :cond_1

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/BlurMaskFilter;

    .line 28
    .line 29
    iget p2, p0, Lcom/zykj/mistake/widget/BaseProView;->u:I

    .line 30
    .line 31
    int-to-float p2, p2

    .line 32
    sget-object p3, Landroid/graphics/BlurMaskFilter$Blur;->SOLID:Landroid/graphics/BlurMaskFilter$Blur;

    .line 33
    .line 34
    invoke-direct {p1, p2, p3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 35
    .line 36
    .line 37
    new-instance p2, Landroid/graphics/BlurMaskFilter;

    .line 38
    .line 39
    iget p3, p0, Lcom/zykj/mistake/widget/BaseProView;->u:I

    .line 40
    .line 41
    int-to-float p3, p3

    .line 42
    sget-object p4, Landroid/graphics/BlurMaskFilter$Blur;->OUTER:Landroid/graphics/BlurMaskFilter$Blur;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 45
    .line 46
    .line 47
    iget-object p3, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/BaseProView;->a()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/BaseProView;->b()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public setLightColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public setLightPaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->q:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setLightShow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/widget/BaseProView;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMaxProgress(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/widget/BaseProView;->s:D

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/BaseProView;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public varargs setOutGradient([I)V
    .locals 0
    .param p1    # [I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/widget/BaseProView;->d([I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setProgress(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/widget/BaseProView;->t:D

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/BaseProView;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressBgPaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setProgressColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressColorBackground(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressPaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->o:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setProgressSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public setStrokeColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->m:I

    .line 2
    .line 3
    return-void
.end method

.method public setStrokePaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->r:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setStrokeShow(Z)V
    .locals 0

    return-void
.end method

.method public setStrokeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public setTextDecimalNum(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setTextPaint(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/BaseProView;->p:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-void
.end method

.method public setTextShow(Z)V
    .locals 0

    return-void
.end method

.method public setTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/BaseProView;->g:I

    .line 2
    .line 3
    return-void
.end method
