.class public Lcom/xuexiang/xui/widget/button/RippleView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:F

.field public g:Landroid/view/animation/ScaleAnimation;

.field public h:Ljava/lang/Integer;

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RippleViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->a:I

    const/16 v0, 0x190

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->b:I

    const/16 v0, 0x5a

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->c:I

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->d:Z

    .line 8
    new-instance v1, Lb0/a;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 9
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->RippleView:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 10
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->b:I

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->d:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    throw p1

    .line 27
    :cond_1
    return-void
.end method

.method public getFrameRate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getRipplePadding()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleType()Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->values()[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->h:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    return-object v0
.end method

.method public getZoomDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getZoomScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final onSizeChanged(IIII)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    .line 5
    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:F

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    shr-int/2addr p1, p3

    .line 10
    int-to-float v5, p1

    .line 11
    shr-int/lit8 p1, p2, 0x1

    .line 12
    .line 13
    int-to-float v6, p1

    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/high16 v3, 0x3f800000    # 1.0f

    .line 17
    .line 18
    move v4, v2

    .line 19
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:Landroid/view/animation/ScaleAnimation;

    .line 23
    .line 24
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 25
    .line 26
    int-to-long p1, p1

    .line 27
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:Landroid/view/animation/ScaleAnimation;

    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    invoke-virtual {p1, p2}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:Landroid/view/animation/ScaleAnimation;

    .line 37
    .line 38
    invoke-virtual {p1, p3}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public setCentered(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public setFrameRate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnRippleCompleteListener(Lcom/xuexiang/xui/widget/button/b;)V
    .locals 0

    return-void
.end method

.method public setRippleAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:I

    .line 10
    .line 11
    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public setRipplePadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleType(Lcom/xuexiang/xui/widget/button/RippleView$RippleType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->h:Ljava/lang/Integer;

    .line 10
    .line 11
    return-void
.end method

.method public setZoomDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setZoomScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:F

    .line 2
    .line 3
    return-void
.end method

.method public setZooming(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method
