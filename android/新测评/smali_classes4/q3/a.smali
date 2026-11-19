.class public abstract Lq3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/view/ViewGroup;

.field public c:Landroid/view/ViewGroup;

.field public d:Landroid/view/ViewGroup;

.field public e:Lt3/a;

.field public f:Z

.field public g:Landroid/view/animation/Animation;

.field public h:Landroid/view/animation/Animation;

.field public i:Z

.field public j:I

.field public k:Landroid/app/Dialog;

.field public l:Landroid/view/View;

.field public m:Z

.field public n:Landroid/view/View$OnKeyListener;

.field public final o:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x50

    .line 5
    .line 6
    iput v0, p0, Lq3/a;->j:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lq3/a;->m:Z

    .line 10
    .line 11
    new-instance v0, Lq3/a$d;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lq3/a$d;-><init>(Lq3/a;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lq3/a;->n:Landroid/view/View$OnKeyListener;

    .line 17
    .line 18
    new-instance v0, Lq3/a$e;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lq3/a$e;-><init>(Lq3/a;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lq3/a;->o:Landroid/view/View$OnTouchListener;

    .line 24
    .line 25
    iput-object p1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lq3/a;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lq3/a;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq3/a;->i:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lq3/a;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq3/a;->f:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lq3/a;)Lu3/b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/app/Dialog;

    .line 6
    .line 7
    iget-object v1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    sget v2, Lcom/xuexiang/xui/R$style;->XUIDialog_Custom:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 15
    .line 16
    iget-object v1, p0, Lq3/a;->e:Lt3/a;

    .line 17
    .line 18
    iget-boolean v1, v1, Lt3/a;->U:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 24
    .line 25
    iget-object v1, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget v1, Lcom/xuexiang/xui/R$style;->picker_view_scale_anim:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x11

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lq3/a;->u(Landroid/view/Window;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 52
    .line 53
    new-instance v1, Lq3/a$f;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lq3/a$f;-><init>(Lq3/a;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lq3/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lq3/a;->g()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Lq3/a;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-boolean v0, p0, Lq3/a;->m:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lq3/a;->g:Landroid/view/animation/Animation;

    .line 21
    .line 22
    new-instance v1, Lq3/a$b;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lq3/a$b;-><init>(Lq3/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lq3/a;->b:Landroid/view/ViewGroup;

    .line 31
    .line 32
    iget-object v1, p0, Lq3/a;->g:Landroid/view/animation/Animation;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0}, Lq3/a;->h()V

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lq3/a;->f:Z

    .line 43
    .line 44
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq3/a;->e:Lt3/a;

    .line 2
    .line 3
    iget-object v0, v0, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 4
    .line 5
    new-instance v1, Lq3/a$c;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lq3/a$c;-><init>(Lq3/a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lq3/a;->b:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final j()Landroid/view/animation/Animation;
    .locals 2

    .line 1
    iget v0, p0, Lq3/a;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lv3/c;->a(IZ)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final k()Landroid/view/animation/Animation;
    .locals 2

    .line 1
    iget v0, p0, Lq3/a;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lv3/c;->a(IZ)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final l(Landroid/view/Window;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Landroid/graphics/Point;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 15
    .line 16
    .line 17
    iget p1, v0, Landroid/graphics/Point;->x:I

    .line 18
    .line 19
    return p1
.end method

.method public m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq3/a;->j()Landroid/view/animation/Animation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lq3/a;->h:Landroid/view/animation/Animation;

    .line 6
    .line 7
    invoke-virtual {p0}, Lq3/a;->k()Landroid/view/animation/Animation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lq3/a;->g:Landroid/view/animation/Animation;

    .line 12
    .line 13
    return-void
.end method

.method public n()V
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const/16 v2, 0x50

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    invoke-direct {v0, v3, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lq3/a;->o()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_base:I

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/view/ViewGroup;

    .line 31
    .line 32
    iput-object v1, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 38
    .line 39
    sget v2, Lcom/xuexiang/xui/R$id;->content_container:I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/view/ViewGroup;

    .line 46
    .line 47
    iput-object v1, p0, Lq3/a;->b:Landroid/view/ViewGroup;

    .line 48
    .line 49
    const/16 v2, 0x1e

    .line 50
    .line 51
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 52
    .line 53
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lq3/a;->e()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 62
    .line 63
    new-instance v1, Lq3/a$a;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Lq3/a$a;-><init>(Lq3/a;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v2, p0, Lq3/a;->e:Lt3/a;

    .line 73
    .line 74
    iget-object v5, v2, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    iget-object v5, p0, Lq3/a;->a:Landroid/content/Context;

    .line 79
    .line 80
    check-cast v5, Landroid/app/Activity;

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Landroid/view/ViewGroup;

    .line 91
    .line 92
    iput-object v5, v2, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 93
    .line 94
    :cond_1
    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_base:I

    .line 95
    .line 96
    iget-object v5, p0, Lq3/a;->e:Lt3/a;

    .line 97
    .line 98
    iget-object v5, v5, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 99
    .line 100
    invoke-virtual {v1, v2, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Landroid/view/ViewGroup;

    .line 105
    .line 106
    iput-object v1, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 107
    .line 108
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 109
    .line 110
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lq3/a;->e:Lt3/a;

    .line 117
    .line 118
    iget v1, v1, Lt3/a;->R:I

    .line 119
    .line 120
    if-eq v1, v3, :cond_2

    .line 121
    .line 122
    iget-object v2, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 125
    .line 126
    .line 127
    :cond_2
    iget-object v1, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 128
    .line 129
    sget v2, Lcom/xuexiang/xui/R$id;->content_container:I

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Landroid/view/ViewGroup;

    .line 136
    .line 137
    iput-object v1, p0, Lq3/a;->b:Landroid/view/ViewGroup;

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    .line 141
    .line 142
    :goto_0
    const/4 v0, 0x1

    .line 143
    invoke-virtual {p0, v0}, Lq3/a;->s(Z)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public abstract o()Z
.end method

.method public p()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lq3/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-boolean v0, p0, Lq3/a;->i:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1

    .line 23
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 24
    return v0
.end method

.method public final q(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq3/a;->e:Lt3/a;

    .line 2
    .line 3
    iget-object v0, v0, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, Lq3/a;->m:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lq3/a;->b:Landroid/view/ViewGroup;

    .line 13
    .line 14
    iget-object v0, p0, Lq3/a;->h:Landroid/view/animation/Animation;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lq3/a;->e:Lt3/a;

    .line 6
    .line 7
    iget-boolean v1, v1, Lt3/a;->U:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq3/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lq3/a;->d:Landroid/view/ViewGroup;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lq3/a;->n:Landroid/view/View$OnKeyListener;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public t(Z)Lq3/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget v1, Lcom/xuexiang/xui/R$id;->outmost_container:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lq3/a;->o:Landroid/view/View$OnTouchListener;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-object p0
.end method

.method public final u(Landroid/view/Window;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lq3/a;->l(Landroid/view/Window;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lq3/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    sget v2, Lcom/xuexiang/xui/R$attr;->md_dialog_horizontal_margin:I

    .line 8
    .line 9
    sget v3, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_horizontal_margin_phone:I

    .line 10
    .line 11
    invoke-static {v1, v3}, Lcom/xuexiang/xui/utils/e;->e(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lq3/a;->a:Landroid/content/Context;

    .line 20
    .line 21
    sget v3, Lcom/xuexiang/xui/R$attr;->md_dialog_max_width:I

    .line 22
    .line 23
    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    mul-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    sub-int/2addr v0, v1

    .line 30
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    .line 31
    .line 32
    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq3/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lq3/a;->w()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lq3/a;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lq3/a;->i:Z

    .line 20
    .line 21
    iget-object v0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lq3/a;->q(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lq3/a;->c:Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq3/a;->k:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
