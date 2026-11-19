.class public Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:Landroid/view/animation/Animation;

.field public e:Landroid/view/animation/Animation;

.field public f:Landroid/view/View;

.field public g:Landroid/widget/LinearLayout;

.field public h:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->StatefulLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->f:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_stateful_template:I

    .line 21
    .line 22
    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    sget v0, Lcom/xuexiang/xui/R$id;->stContainer:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/LinearLayout;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->g:Landroid/widget/LinearLayout;

    .line 34
    .line 35
    sget v0, Lcom/xuexiang/xui/R$id;->stProgress:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->h:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 44
    .line 45
    sget v0, Lcom/xuexiang/xui/R$id;->stImage:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/ImageView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->i:Landroid/widget/ImageView;

    .line 54
    .line 55
    sget v0, Lcom/xuexiang/xui/R$id;->stMessage:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/TextView;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->j:Landroid/widget/TextView;

    .line 64
    .line 65
    sget v0, Lcom/xuexiang/xui/R$id;->stButton:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/widget/Button;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->k:Landroid/widget/Button;

    .line 74
    .line 75
    return-void
.end method

.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->StatefulLayout:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_animationEnabled:I

    .line 9
    .line 10
    invoke-static {}, Ly7/a;->b()Ly7/a;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-virtual {p3}, Ly7/a;->c()Lj9/a;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iget-boolean p3, p3, Lj9/a;->a:Z

    .line 19
    .line 20
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->c:Z

    .line 25
    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_inAnimation:I

    .line 27
    .line 28
    const/4 p3, -0x1

    .line 29
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eq p2, p3, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->c(I)Landroid/view/animation/Animation;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->d:Landroid/view/animation/Animation;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, Ly7/a;->b()Ly7/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ly7/a;->c()Lj9/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, Lj9/a;->b:Landroid/view/animation/Animation;

    .line 51
    .line 52
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->d:Landroid/view/animation/Animation;

    .line 53
    .line 54
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_outAnimation:I

    .line 55
    .line 56
    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eq p2, p3, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->c(I)Landroid/view/animation/Animation;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->e:Landroid/view/animation/Animation;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {}, Ly7/a;->b()Ly7/a;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Ly7/a;->c()Lj9/a;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object p2, p2, Lj9/a;->c:Landroid/view/animation/Animation;

    .line 78
    .line 79
    iput-object p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->e:Landroid/view/animation/Animation;

    .line 80
    .line 81
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final c(I)Landroid/view/animation/Animation;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getInAnimation()Landroid/view/animation/Animation;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->d:Landroid/view/animation/Animation;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOutAnimation()Landroid/view/animation/Animation;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->e:Landroid/view/animation/Animation;

    .line 2
    .line 3
    return-object v0
.end method

.method public onFinishInflate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->a()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "StatefulLayout must have one child!"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
