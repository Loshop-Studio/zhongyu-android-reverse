.class public Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

.field public final b:Z

.field public final c:Landroid/view/View;

.field public final d:Landroid/view/View;

.field public final e:Landroid/view/View;

.field public final f:Landroid/view/View;

.field public final g:Landroid/view/animation/Animation;

.field public final h:Landroid/view/animation/Animation;

.field public final i:Landroid/os/Handler;

.field public final j:Lb0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->StatusViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->b:Z

    .line 5
    new-instance v0, Lb0/a;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->j:Lb0/a;

    .line 6
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$anim;->sv_slide_in:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->h:Landroid/view/animation/Animation;

    .line 8
    sget v0, Lcom/xuexiang/xui/R$anim;->sv_slide_out:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 10
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->i:Landroid/os/Handler;

    .line 11
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->StatusView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_complete:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 13
    sget p3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_error:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    .line 14
    sget v1, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_loading:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 15
    sget v3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_custom:I

    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 16
    sget v3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_dismissOnComplete:I

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->b:Z

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->b:Z

    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    .line 18
    invoke-virtual {v0, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    .line 19
    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    .line 20
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    .line 21
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p3, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 27
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 29
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    const/4 p3, 0x4

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 31
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 33
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->COMPLETE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->ERROR:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 15
    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_2
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->LOADING:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 22
    .line 23
    if-ne p1, v0, :cond_3

    .line 24
    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_3
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->CUSTOM:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 29
    .line 30
    if-ne p1, v0, :cond_4

    .line 31
    .line 32
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_4
    return-object v1
.end method

.method public getCompleteView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getErrorView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStatus()Lcom/xuexiang/xui/widget/popupwindow/status/Status;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 2
    .line 3
    return-object v0
.end method

.method public setOnCompleteClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnCustomClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->f:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnErrorClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->d:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnLoadingClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setStatus(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 6
    .line 7
    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 8
    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->h:Landroid/view/animation/Animation;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-eq p1, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Li3/b;

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v2}, Li3/b;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Li3/c;

    .line 76
    .line 77
    invoke-direct {v1, p0, v0}, Li3/c;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->i:Landroid/os/Handler;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->COMPLETE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 92
    .line 93
    if-ne p1, v0, :cond_4

    .line 94
    .line 95
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->b:Z

    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->j:Lb0/a;

    .line 100
    .line 101
    const-wide/16 v0, 0x3e8

    .line 102
    .line 103
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->i:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    .line 107
    .line 108
    :cond_4
    return-void
.end method
