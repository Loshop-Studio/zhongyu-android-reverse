.class public Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;
.super Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;
.source "SourceFile"


# instance fields
.field public j:Landroid/graphics/drawable/Drawable;

.field public final k:Landroid/graphics/Matrix;


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
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    if-eqz p2, :cond_0

    .line 4
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->PorterShapeImageView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    sget p2, Lcom/xuexiang/xui/R$styleable;->PorterShapeImageView_sb_icon_image:I

    .line 6
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    :cond_0
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->k:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v0, v3, :cond_0

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v5, v1

    .line 37
    :goto_0
    if-lez v3, :cond_1

    .line 38
    .line 39
    if-lez v4, :cond_1

    .line 40
    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    invoke-virtual {v5, v1, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 46
    .line 47
    .line 48
    int-to-float v0, v0

    .line 49
    int-to-float v3, v3

    .line 50
    div-float v5, v0, v3

    .line 51
    .line 52
    int-to-float v2, v2

    .line 53
    int-to-float v4, v4

    .line 54
    div-float v6, v2, v4

    .line 55
    .line 56
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    mul-float/2addr v3, v5

    .line 61
    sub-float/2addr v0, v3

    .line 62
    const/high16 v3, 0x3f000000    # 0.5f

    .line 63
    .line 64
    mul-float/2addr v0, v3

    .line 65
    add-float/2addr v0, v3

    .line 66
    float-to-int v0, v0

    .line 67
    int-to-float v0, v0

    .line 68
    mul-float/2addr v4, v5

    .line 69
    sub-float/2addr v2, v4

    .line 70
    mul-float/2addr v2, v3

    .line 71
    add-float/2addr v2, v3

    .line 72
    float-to-int v2, v2

    .line 73
    int-to-float v2, v2

    .line 74
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->k:Landroid/graphics/Matrix;

    .line 75
    .line 76
    invoke-virtual {v3, v5, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 77
    .line 78
    .line 79
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->k:Landroid/graphics/Matrix;

    .line 80
    .line 81
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void
.end method

.method public setIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->j:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
