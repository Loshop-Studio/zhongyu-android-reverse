.class public Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;,
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:F

.field public F:J

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:F

.field public c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public d:Landroid/content/Context;

.field public e:Landroid/os/Handler;

.field public f:Landroid/view/GestureDetector;

.field public g:Z

.field public h:Z

.field public i:Ljava/util/concurrent/ScheduledExecutorService;

.field public j:Ljava/util/concurrent/ScheduledFuture;

.field public k:Landroid/text/TextPaint;

.field public l:Landroid/text/TextPaint;

.field public m:Landroid/graphics/Paint;

.field public n:Ljava/lang/String;

.field public o:I

.field public p:I

.field public q:F

.field public r:Landroid/graphics/Typeface;

.field public s:I

.field public t:I

.field public u:I

.field public v:F

.field public w:Z

.field public x:F

.field public y:I

.field public z:I


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

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:Landroid/graphics/Typeface;

    const v1, 0x3fcccccd    # 1.6f

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    const/16 v1, 0xb

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:F

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:J

    const/16 v1, 0x11

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_wheel_view_text_size:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 17
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, v2, v3

    if-gez v4, :cond_0

    const v2, 0x4019999a    # 2.4f

    .line 18
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:F

    goto :goto_0

    :cond_0
    cmpg-float v3, v3, v2

    const/high16 v4, 0x3fc00000    # 1.5f

    if-gtz v3, :cond_1

    cmpg-float v3, v2, v4

    if-gez v3, :cond_1

    const v2, 0x40666666    # 3.6f

    .line 19
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:F

    goto :goto_0

    :cond_1
    cmpg-float v3, v4, v2

    const/high16 v4, 0x40000000    # 2.0f

    if-gtz v3, :cond_2

    cmpg-float v3, v2, v4

    if-gez v3, :cond_2

    const/high16 v2, 0x40900000    # 4.5f

    .line 20
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:F

    goto :goto_0

    :cond_2
    cmpg-float v3, v4, v2

    const/high16 v4, 0x40400000    # 3.0f

    if-gtz v3, :cond_3

    cmpg-float v3, v2, v4

    if-gez v3, :cond_3

    const/high16 v2, 0x40c00000    # 6.0f

    .line 21
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:F

    goto :goto_0

    :cond_3
    cmpl-float v3, v2, v4

    if-ltz v3, :cond_4

    const/high16 v3, 0x40200000    # 2.5f

    mul-float/2addr v2, v3

    .line 22
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:F

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 23
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->WheelView:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_gravity:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorOut:I

    const v1, -0x575758

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorCenter:I

    const v1, -0xd5d5d6

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:I

    .line 27
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_dividerColor:I

    const v1, -0x2a2a2b

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_lineSpacingMultiplier:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 30
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    :cond_5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    .line 32
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Landroid/content/Context;)V

    return-void
.end method

.method private g()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lb9/b;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lb9/b;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v0, Landroid/view/GestureDetector;

    .line 11
    .line 12
    new-instance v1, La9/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, La9/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/view/GestureDetector;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:Z

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 27
    .line 28
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 40
    .line 41
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:I

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 52
    .line 53
    const v2, 0x3f8ccccd    # 1.1f

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:Landroid/graphics/Typeface;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 67
    .line 68
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 69
    .line 70
    int-to-float v2, v2

    .line 71
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    .line 80
    .line 81
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    cmpg-float v2, v0, v1

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    .line 13
    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getAdapter()Lz8/a;
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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:F

    .line 2
    .line 3
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
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    new-instance v1, Lb9/a;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lb9/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v4, 0x5

    .line 12
    .line 13
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    return-void
.end method

.method public i(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 9
    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 13
    .line 14
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:F

    .line 15
    .line 16
    rem-float/2addr p1, v0

    .line 17
    add-float/2addr p1, v0

    .line 18
    rem-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 21
    .line 22
    int-to-float v1, p1

    .line 23
    const/high16 v2, 0x40000000    # 2.0f

    .line 24
    .line 25
    div-float v2, v0, v2

    .line 26
    .line 27
    cmpl-float v1, v1, v2

    .line 28
    .line 29
    if-lez v1, :cond_1

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    sub-float/2addr v0, p1

    .line 33
    float-to-int p1, v0

    .line 34
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v1, Lb9/c;

    .line 43
    .line 44
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, Lb9/c;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v4, 0xa

    .line 50
    .line 51
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g()V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:I

    .line 7
    .line 8
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Landroid/view/GestureDetector;

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

.method public final setAdapter(Lz8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:I

    .line 2
    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

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

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 2
    .line 3
    return-void
.end method

.method public setGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 2
    .line 3
    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(La9/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/content/Context;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 29
    .line 30
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTotalScrollY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    return-void
.end method
