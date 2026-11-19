.class public Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/blankj/utilcode/util/h;

.field public final c:Landroid/view/GestureDetector;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public e:Ljava/util/concurrent/ScheduledFuture;

.field public final f:Landroid/text/TextPaint;

.field public final g:Landroid/text/TextPaint;

.field public final h:Landroid/graphics/Paint;

.field public i:I

.field public j:Landroid/graphics/Typeface;

.field public k:I

.field public l:I

.field public m:I

.field public n:F

.field public o:Z

.field public p:F

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/graphics/Typeface;

    const v0, 0x3fcccccd    # 1.6f

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_wheel_view_text_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 9
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v3, v1, v2

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v3, v2, v1

    const/high16 v4, 0x3fc00000    # 1.5f

    if-gtz v3, :cond_1

    cmpg-float v3, v1, v4

    if-gez v3, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v3, v4, v1

    const/high16 v4, 0x40000000    # 2.0f

    if-gtz v3, :cond_2

    cmpg-float v3, v1, v4

    if-gez v3, :cond_2

    goto :goto_0

    :cond_2
    cmpg-float v3, v4, v1

    if-gtz v3, :cond_3

    const/high16 v3, 0x40400000    # 3.0f

    cmpg-float v1, v1, v3

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    .line 10
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->WheelView:[I

    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 11
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_gravity:I

    const/16 v3, 0x11

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 12
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorOut:I

    const v3, -0x575758

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:I

    .line 13
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorCenter:I

    const v3, -0xd5d5d6

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:I

    .line 14
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_dividerColor:I

    const v3, -0x2a2a2b

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 15
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textSize:I

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    .line 16
    sget v1, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_lineSpacingMultiplier:I

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    .line 17
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    :cond_4
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    cmpg-float v1, p2, v2

    if-gez v1, :cond_5

    .line 19
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    goto :goto_1

    :cond_5
    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float p2, p2, v1

    if-lez p2, :cond_6

    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    .line 21
    :cond_6
    :goto_1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a:Landroid/content/Context;

    .line 22
    new-instance p2, Lcom/blankj/utilcode/util/h;

    invoke-direct {p2, p0}, Lcom/blankj/utilcode/util/h;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Lcom/blankj/utilcode/util/h;

    .line 23
    new-instance p2, Landroid/view/GestureDetector;

    new-instance v1, Lf3/a;

    invoke-direct {v1, p0}, Lf3/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    invoke-direct {p2, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/view/GestureDetector;

    .line 24
    invoke-virtual {p2, v0}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Z

    const/4 p2, 0x0

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:F

    const/4 p2, -0x1

    .line 27
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 28
    new-instance p2, Landroid/text/TextPaint;

    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    .line 29
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/graphics/Typeface;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 32
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 33
    new-instance p2, Landroid/text/TextPaint;

    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    .line 34
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    const v0, 0x3f8ccccd    # 1.1f

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 37
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/graphics/Typeface;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 38
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 39
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Landroid/graphics/Paint;

    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p2, 0x0

    .line 42
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final getAdapter()Le3/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final getCurrentItem()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Lcom/blankj/utilcode/util/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getItemsCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getTotalScrollY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public final setAdapter(Le3/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:F

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    return-void
.end method

.method public setGravity(I)V
    .locals 0

    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpg-float v1, p1, v0

    .line 11
    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/high16 v0, 0x40800000    # 4.0f

    .line 18
    .line 19
    cmpl-float p1, p1, v0

    .line 20
    .line 21
    if-lez p1, :cond_1

    .line 22
    .line 23
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:F

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final setOnItemSelectedListener(Lf3/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTextColorOut(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    mul-float/2addr v0, p1

    .line 19
    float-to-int p1, v0

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:I

    .line 29
    .line 30
    int-to-float p1, p1

    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTotalScrollY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Landroid/text/TextPaint;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    return-void
.end method
