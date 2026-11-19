.class public Lcom/xuexiang/xui/widget/textview/BadgeView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/BadgeView;->d:Z

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->d()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/BadgeView;->d:Z

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->d()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/BadgeView;->d:Z

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->d()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 10
    .line 11
    const/16 v1, 0x35

    .line 12
    .line 13
    const/4 v2, -0x2

    .line 14
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, -0x1

    .line 21
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    const/high16 v1, 0x41300000    # 11.0f

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 33
    .line 34
    .line 35
    const/high16 v0, 0x40a00000    # 5.0f

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/high16 v2, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p0, v1, v3, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 56
    .line 57
    .line 58
    const-string v0, "#d3321b"

    .line 59
    .line 60
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v1, 0x9

    .line 65
    .line 66
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->f(II)V

    .line 67
    .line 68
    .line 69
    const/16 v0, 0x11

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->setHideOnNull(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final c(F)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    mul-float/2addr p1, v0

    .line 16
    const/high16 v0, 0x3f000000    # 0.5f

    .line 17
    .line 18
    add-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    return p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/BadgeView;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public f(II)V
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    int-to-float p1, p1

    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    new-array v0, v0, [F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput p1, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    aput p1, v0, v1

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    aput p1, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    aput p1, v0, v1

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    aput p1, v0, v1

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    aput p1, v0, v1

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    aput p1, v0, v1

    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    aput p1, v0, v1

    .line 34
    .line 35
    new-instance p1, Landroid/graphics/drawable/shapes/RoundRectShape;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {p1, v0, v1, v1}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public g(IIII)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 13
    .line 14
    int-to-float p1, p2

    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 20
    .line 21
    int-to-float p1, p3

    .line 22
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 27
    .line 28
    int-to-float p1, p4

    .line 29
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->c(F)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public getBadgeCount()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object v0

    .line 26
    :catch_0
    return-object v1
.end method

.method public getBadgeGravity()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 8
    .line 9
    return v0
.end method

.method public getBadgeMargin()[I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 8
    .line 9
    iget v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 10
    .line 11
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 12
    .line 13
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 14
    .line 15
    filled-new-array {v1, v2, v3, v0}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public setBadgeCount(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBadgeGravity(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBadgeMargin(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/xuexiang/xui/widget/textview/BadgeView;->g(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setHideOnNull(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/BadgeView;->d:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setTargetView(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v0, v0, Landroid/widget/FrameLayout;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/widget/FrameLayout;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Landroid/widget/FrameLayout;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    const/4 v5, -0x1

    .line 77
    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string v0, "ParentView is needed"

    .line 108
    .line 109
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_0
    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/BadgeView;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string v0, "0"

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/16 v0, 0x8

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
