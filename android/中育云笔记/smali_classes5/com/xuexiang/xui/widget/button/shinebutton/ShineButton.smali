.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
.super Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;
    }
.end annotation


# instance fields
.field public o:Z

.field public p:I

.field public q:I

.field public r:Landroid/animation/ValueAnimator;

.field public s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

.field public t:Ljava/lang/ref/WeakReference;

.field public u:Z

.field public v:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->ShineButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 5
    new-instance p3, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    invoke-direct {p3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->l(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->q:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->t:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/Window;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public isChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    const-wide/16 v1, 0x1f4

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    const-wide/16 v1, 0xb4

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    new-instance v1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$a;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$a;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    new-instance v1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$b;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$b;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :array_0
    .array-data 4
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
        0x3f666666    # 0.9f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final l(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShineButton:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_normal_color:I

    .line 8
    .line 9
    sget v1, Lcom/xuexiang/xui/R$color;->default_sb_normal_color:I

    .line 10
    .line 11
    invoke-static {v1}, Lcom/xuexiang/xui/utils/f;->c(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->p:I

    .line 20
    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_checked_color:I

    .line 22
    .line 23
    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 24
    .line 25
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->q:I

    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 36
    .line 37
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_allow_random_color:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->a:Z

    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 47
    .line 48
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_animation_duration:I

    .line 49
    .line 50
    iget-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->b:J

    .line 51
    .line 52
    long-to-int v3, v3

    .line 53
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    int-to-long v3, v1

    .line 58
    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->b:J

    .line 59
    .line 60
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 61
    .line 62
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_click_animation_duration:I

    .line 63
    .line 64
    iget-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->d:J

    .line 65
    .line 66
    long-to-int v3, v3

    .line 67
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    int-to-long v3, v1

    .line 72
    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->d:J

    .line 73
    .line 74
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 75
    .line 76
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_enable_flashing:I

    .line 77
    .line 78
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->e:Z

    .line 83
    .line 84
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 85
    .line 86
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_distance_multiple:I

    .line 87
    .line 88
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->h:F

    .line 89
    .line 90
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->h:F

    .line 95
    .line 96
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 97
    .line 98
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_count:I

    .line 99
    .line 100
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->f:I

    .line 101
    .line 102
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->f:I

    .line 107
    .line 108
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 109
    .line 110
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_size:I

    .line 111
    .line 112
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->k:I

    .line 113
    .line 114
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->k:I

    .line 119
    .line 120
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 121
    .line 122
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_turn_angle:I

    .line 123
    .line 124
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->g:F

    .line 125
    .line 126
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->g:F

    .line 131
    .line 132
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 133
    .line 134
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_small_shine_offset_angle:I

    .line 135
    .line 136
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->i:F

    .line 137
    .line 138
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->i:F

    .line 143
    .line 144
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 145
    .line 146
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_small_shine_color:I

    .line 147
    .line 148
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->j:I

    .line 149
    .line 150
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->j:I

    .line 155
    .line 156
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 157
    .line 158
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_big_shine_color:I

    .line 159
    .line 160
    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->c:I

    .line 161
    .line 162
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;->c:I

    .line 167
    .line 168
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 169
    .line 170
    .line 171
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->p:I

    .line 172
    .line 173
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 174
    .line 175
    .line 176
    instance-of p2, p1, Landroid/app/Activity;

    .line 177
    .line 178
    if-eqz p2, :cond_0

    .line 179
    .line 180
    check-cast p1, Landroid/app/Activity;

    .line 181
    .line 182
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->m(Landroid/app/Activity;)V

    .line 183
    .line 184
    .line 185
    :cond_0
    return-void
.end method

.method public m(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->n(Landroid/view/Window;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->u:Z

    .line 10
    .line 11
    return-void
.end method

.method public n(Landroid/view/Window;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->t:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    new-instance p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->v:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x1020002

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->p:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final r(ZZZ)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->q:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->p:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o:Z

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->q()V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->o(Z)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public s()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->s:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;

    .line 14
    .line 15
    invoke-direct {v0, v1, p0, v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;-><init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$e;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->u:Z

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const v2, 0x1020002

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {v3, v4, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->k()V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->r(ZZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->v:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$c;->a(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public toggle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
