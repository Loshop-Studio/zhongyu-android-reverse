.class public Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;
.super Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;
.source "SourceFile"


# instance fields
.field public l:Landroid/graphics/drawable/Drawable;

.field public m:Landroid/graphics/Matrix;

.field public n:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private e(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->PorterShapeImageView:[I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    sget p3, Lcom/xuexiang/xui/R$styleable;->PorterShapeImageView_sb_icon_image:I

    .line 15
    .line 16
    invoke-static {p2, p1, p3}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance p1, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->m:Landroid/graphics/Matrix;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    instance-of p2, p2, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->d(II)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->n:Landroid/graphics/Matrix;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 29
    .line 30
    .line 31
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->m:Landroid/graphics/Matrix;

    .line 32
    .line 33
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 34
    .line 35
    .line 36
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p2, v0, v0, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public final d(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->n:Landroid/graphics/Matrix;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    if-ne p2, v1, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v2

    .line 24
    :goto_0
    if-lez v0, :cond_1

    .line 25
    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    invoke-virtual {v3, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 33
    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    int-to-float v0, v0

    .line 37
    div-float v2, p1, v0

    .line 38
    .line 39
    int-to-float p2, p2

    .line 40
    int-to-float v1, v1

    .line 41
    div-float v3, p2, v1

    .line 42
    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    mul-float/2addr v0, v2

    .line 48
    sub-float/2addr p1, v0

    .line 49
    const/high16 v0, 0x3f000000    # 0.5f

    .line 50
    .line 51
    mul-float/2addr p1, v0

    .line 52
    add-float/2addr p1, v0

    .line 53
    float-to-int p1, p1

    .line 54
    int-to-float p1, p1

    .line 55
    mul-float/2addr v1, v2

    .line 56
    sub-float/2addr p2, v1

    .line 57
    mul-float/2addr p2, v0

    .line 58
    add-float/2addr p2, v0

    .line 59
    float-to-int p2, p2

    .line 60
    int-to-float p2, p2

    .line 61
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->m:Landroid/graphics/Matrix;

    .line 62
    .line 63
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->m:Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public setIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
