.class public Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:Z

.field public f:Ljava/util/List;

.field public g:I

.field public h:F

.field public i:F

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Z

.field public final o:Ljava/lang/Object;

.field public p:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->k:I

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l:Z

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->o:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$a;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$a;-><init>(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->p:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l(Landroid/util/AttributeSet;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->h:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->r()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->k:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->p(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCurrentIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getCurrentPosition()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public getDisplayList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo9/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDisplaySize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getScrollWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowDisplayEntity()Lo9/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getSpeed()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 17
    .line 18
    sub-int/2addr v1, v0

    .line 19
    div-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    return v1
.end method

.method public j(I)Lo9/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    if-gt p1, v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v1
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView_mtv_isAutoFit:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->m:Z

    .line 19
    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView_mtv_isAutoDisplay:I

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->n:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->n:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->j(I)Lo9/a;

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->s(Lo9/a;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->n:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const/16 v0, 0x8

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l:Z

    .line 39
    .line 40
    return-void
.end method

.method public final n()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public o()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->j:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->d:I

    .line 19
    .line 20
    return-object p0
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->e:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->n()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l:Z

    .line 12
    .line 13
    :goto_0
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->e:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->p:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->p:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatTextView;->onDetachedFromWindow()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->n()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->i()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->d:I

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->m:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->o()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final p(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->e:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->p:Landroid/os/Handler;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    int-to-long v2, p1

    .line 14
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->l:Z

    .line 20
    .line 21
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->j(I)Lo9/a;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->s(Lo9/a;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->k()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->g:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->q(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final s(Lo9/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->r()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
