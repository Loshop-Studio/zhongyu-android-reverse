.class public Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;
.super Landroid/widget/CompoundButton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;
    }
.end annotation


# static fields
.field public static l0:[I

.field public static m0:[I


# instance fields
.field public A:Landroid/graphics/RectF;

.field public B:Landroid/graphics/RectF;

.field public C:Landroid/graphics/RectF;

.field public D:Landroid/graphics/Paint;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Landroid/animation/ObjectAnimator;

.field public I:F

.field public J:Landroid/graphics/RectF;

.field public K:F

.field public L:F

.field public M:F

.field public N:I

.field public O:I

.field public P:Landroid/graphics/Paint;

.field public Q:Ljava/lang/CharSequence;

.field public R:Ljava/lang/CharSequence;

.field public S:Landroid/text/TextPaint;

.field public T:Landroid/text/Layout;

.field public U:Landroid/text/Layout;

.field public V:F

.field public W:F

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/content/res/ColorStateList;

.field public e0:I

.field public f:Landroid/content/res/ColorStateList;

.field public f0:I

.field public g:F

.field public g0:I

.field public h:F

.field public h0:Z

.field public i:Landroid/graphics/RectF;

.field public i0:Z

.field public j:F

.field public j0:Z

.field public k:J

.field public k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Landroid/graphics/RectF;

.field public z:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    const v1, 0x101009e

    .line 5
    .line 6
    .line 7
    const v2, 0x10100a7

    .line 8
    .line 9
    .line 10
    filled-new-array {v0, v1, v2}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l0:[I

    .line 15
    .line 16
    const v0, -0x10100a0

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1, v2}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m0:[I

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:Z

    .line 15
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 16
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:Z

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    .line 12
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:Z

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    .line 6
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 2
    .line 3
    return v0
.end method

.method private getStatusBasedOnPos()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f000000    # 0.5f

    .line 6
    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private setDrawableState(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private setProgress(F)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    :goto_0
    move p1, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    cmpg-float v1, p1, v0

    .line 11
    .line 12
    if-gez v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:J

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x2

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 32
    .line 33
    new-array v2, v2, [F

    .line 34
    .line 35
    aput v3, v2, v1

    .line 36
    .line 37
    const/high16 v1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    aput v1, v2, v0

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 46
    .line 47
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 48
    .line 49
    new-array v2, v2, [F

    .line 50
    .line 51
    aput v3, v2, v1

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    aput v1, v2, v0

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    .line 12
    .line 13
    return-void
.end method

.method public final c(D)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    double-to-int p1, p1

    .line 6
    return p1
.end method

.method public final d(Landroid/util/AttributeSet;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:I

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v2, v3

    .line 28
    iput v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:I

    .line 29
    .line 30
    new-instance v2, Landroid/graphics/Paint;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 44
    .line 45
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 61
    .line 62
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/TextPaint;

    .line 70
    .line 71
    new-instance v2, Landroid/graphics/RectF;

    .line 72
    .line 73
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 77
    .line 78
    new-instance v2, Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 84
    .line 85
    new-instance v2, Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 91
    .line 92
    new-instance v2, Landroid/graphics/RectF;

    .line 93
    .line 94
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 98
    .line 99
    new-instance v2, Landroid/graphics/RectF;

    .line 100
    .line 101
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/RectF;

    .line 105
    .line 106
    new-instance v2, Landroid/graphics/RectF;

    .line 107
    .line 108
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Landroid/graphics/RectF;

    .line 112
    .line 113
    const/4 v2, 0x2

    .line 114
    new-array v2, v2, [F

    .line 115
    .line 116
    fill-array-data v2, :array_0

    .line 117
    .line 118
    .line 119
    const-string v4, "progress"

    .line 120
    .line 121
    invoke-static {v0, v4, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-wide/16 v4, 0xfa

    .line 126
    .line 127
    invoke-virtual {v2, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 132
    .line 133
    new-instance v4, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 134
    .line 135
    invoke-direct {v4}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 139
    .line 140
    .line 141
    new-instance v2, Landroid/graphics/RectF;

    .line 142
    .line 143
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 157
    .line 158
    const/high16 v4, 0x40000000    # 2.0f

    .line 159
    .line 160
    mul-float/2addr v2, v4

    .line 161
    if-nez v1, :cond_0

    .line 162
    .line 163
    const/4 v5, 0x0

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    sget-object v6, Lcom/xuexiang/xui/R$styleable;->SwitchButton:[I

    .line 170
    .line 171
    invoke-virtual {v5, v1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    :goto_0
    const/4 v6, 0x0

    .line 176
    const/high16 v7, -0x40800000    # -1.0f

    .line 177
    .line 178
    const v8, 0x3fe66666    # 1.8f

    .line 179
    .line 180
    .line 181
    if-eqz v5, :cond_1

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    sget v12, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbDrawable:I

    .line 188
    .line 189
    invoke-static {v11, v5, v12}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    sget v12, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbColor:I

    .line 194
    .line 195
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    sget v13, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMargin:I

    .line 200
    .line 201
    invoke-virtual {v5, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    sget v13, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginLeft:I

    .line 206
    .line 207
    invoke-virtual {v5, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    sget v14, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginRight:I

    .line 212
    .line 213
    invoke-virtual {v5, v14, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 214
    .line 215
    .line 216
    move-result v14

    .line 217
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginTop:I

    .line 218
    .line 219
    invoke-virtual {v5, v15, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginBottom:I

    .line 224
    .line 225
    invoke-virtual {v5, v4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbWidth:I

    .line 230
    .line 231
    invoke-virtual {v5, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    sget v10, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbHeight:I

    .line 236
    .line 237
    invoke-virtual {v5, v10, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    move/from16 v17, v6

    .line 242
    .line 243
    sget v6, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRadius:I

    .line 244
    .line 245
    invoke-virtual {v5, v6, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backRadius:I

    .line 250
    .line 251
    invoke-virtual {v5, v3, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backDrawable:I

    .line 260
    .line 261
    invoke-static {v3, v5, v9}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backColor:I

    .line 266
    .line 267
    invoke-virtual {v5, v9}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    move/from16 v19, v2

    .line 272
    .line 273
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRangeRatio:I

    .line 274
    .line 275
    invoke-virtual {v5, v2, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_animationDuration:I

    .line 280
    .line 281
    move-object/from16 v20, v3

    .line 282
    .line 283
    const/16 v3, 0xfa

    .line 284
    .line 285
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_fadeBack:I

    .line 290
    .line 291
    move/from16 v18, v2

    .line 292
    .line 293
    const/4 v2, 0x1

    .line 294
    invoke-virtual {v5, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_tintColor:I

    .line 299
    .line 300
    move/from16 v21, v3

    .line 301
    .line 302
    const/4 v3, 0x0

    .line 303
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOn:I

    .line 308
    .line 309
    invoke-virtual {v5, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    move/from16 v22, v2

    .line 314
    .line 315
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOff:I

    .line 316
    .line 317
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    move-object/from16 v23, v2

    .line 322
    .line 323
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textThumbInset:I

    .line 324
    .line 325
    move-object/from16 v24, v3

    .line 326
    .line 327
    const/4 v3, 0x0

    .line 328
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    move/from16 v25, v2

    .line 333
    .line 334
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textExtra:I

    .line 335
    .line 336
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    move/from16 v26, v2

    .line 341
    .line 342
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textAdjust:I

    .line 343
    .line 344
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 349
    .line 350
    .line 351
    move/from16 v27, v14

    .line 352
    .line 353
    move/from16 v28, v15

    .line 354
    .line 355
    move/from16 v3, v19

    .line 356
    .line 357
    move-object/from16 v5, v24

    .line 358
    .line 359
    move-object v15, v9

    .line 360
    move v14, v13

    .line 361
    move/from16 v19, v18

    .line 362
    .line 363
    move/from16 v18, v21

    .line 364
    .line 365
    move/from16 v9, v22

    .line 366
    .line 367
    move/from16 v21, v6

    .line 368
    .line 369
    move/from16 v22, v8

    .line 370
    .line 371
    move-object v13, v11

    .line 372
    move/from16 v6, v25

    .line 373
    .line 374
    move v8, v2

    .line 375
    move v11, v4

    .line 376
    move v4, v10

    .line 377
    move-object/from16 v10, v20

    .line 378
    .line 379
    move-object/from16 v2, v23

    .line 380
    .line 381
    move/from16 v20, v7

    .line 382
    .line 383
    move/from16 v7, v26

    .line 384
    .line 385
    goto :goto_1

    .line 386
    :cond_1
    move/from16 v17, v6

    .line 387
    .line 388
    const/16 v3, 0xfa

    .line 389
    .line 390
    move/from16 v19, v3

    .line 391
    .line 392
    move/from16 v20, v7

    .line 393
    .line 394
    move/from16 v21, v20

    .line 395
    .line 396
    move/from16 v22, v8

    .line 397
    .line 398
    move/from16 v3, v17

    .line 399
    .line 400
    move v4, v3

    .line 401
    move v11, v4

    .line 402
    move v14, v11

    .line 403
    move/from16 v27, v14

    .line 404
    .line 405
    move/from16 v28, v27

    .line 406
    .line 407
    const/4 v2, 0x0

    .line 408
    const/4 v5, 0x0

    .line 409
    const/4 v6, 0x0

    .line 410
    const/4 v7, 0x0

    .line 411
    const/4 v8, 0x0

    .line 412
    const/4 v9, 0x0

    .line 413
    const/4 v10, 0x0

    .line 414
    const/4 v12, 0x0

    .line 415
    const/4 v13, 0x0

    .line 416
    const/4 v15, 0x0

    .line 417
    const/16 v18, 0x1

    .line 418
    .line 419
    :goto_1
    move/from16 v16, v3

    .line 420
    .line 421
    if-nez v1, :cond_2

    .line 422
    .line 423
    move/from16 v23, v14

    .line 424
    .line 425
    move-object/from16 v24, v15

    .line 426
    .line 427
    const/4 v1, 0x0

    .line 428
    goto :goto_2

    .line 429
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move/from16 v23, v14

    .line 434
    .line 435
    const v14, 0x10100da

    .line 436
    .line 437
    .line 438
    move-object/from16 v24, v15

    .line 439
    .line 440
    const v15, 0x10100e5

    .line 441
    .line 442
    .line 443
    filled-new-array {v14, v15}, [I

    .line 444
    .line 445
    .line 446
    move-result-object v14

    .line 447
    invoke-virtual {v3, v1, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    :goto_2
    if-eqz v1, :cond_3

    .line 452
    .line 453
    const/4 v3, 0x0

    .line 454
    const/4 v14, 0x1

    .line 455
    invoke-virtual {v1, v3, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 456
    .line 457
    .line 458
    move-result v15

    .line 459
    invoke-virtual {v1, v14, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    invoke-virtual {v0, v15}, Landroid/view/View;->setFocusable(Z)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 470
    .line 471
    .line 472
    goto :goto_3

    .line 473
    :cond_3
    const/4 v14, 0x1

    .line 474
    invoke-virtual {v0, v14}, Landroid/view/View;->setFocusable(Z)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v14}, Landroid/view/View;->setClickable(Z)V

    .line 478
    .line 479
    .line 480
    :goto_3
    iput-object v5, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 481
    .line 482
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 483
    .line 484
    iput v6, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:I

    .line 485
    .line 486
    iput v7, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:I

    .line 487
    .line 488
    iput v8, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:I

    .line 489
    .line 490
    iput-object v13, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 491
    .line 492
    iput-object v12, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 493
    .line 494
    if-eqz v13, :cond_4

    .line 495
    .line 496
    const/4 v2, 0x1

    .line 497
    goto :goto_4

    .line 498
    :cond_4
    const/4 v2, 0x0

    .line 499
    :goto_4
    iput-boolean v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 500
    .line 501
    iput v9, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 502
    .line 503
    if-nez v9, :cond_6

    .line 504
    .line 505
    new-instance v1, Landroid/util/TypedValue;

    .line 506
    .line 507
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    sget v3, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 519
    .line 520
    const/4 v14, 0x1

    .line 521
    invoke-virtual {v2, v3, v1, v14}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    if-eqz v2, :cond_5

    .line 526
    .line 527
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 528
    .line 529
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_5
    const v1, 0x327fc2

    .line 533
    .line 534
    .line 535
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 536
    .line 537
    goto :goto_5

    .line 538
    :cond_6
    const/4 v14, 0x1

    .line 539
    :goto_5
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 540
    .line 541
    if-nez v1, :cond_7

    .line 542
    .line 543
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 544
    .line 545
    if-nez v1, :cond_7

    .line 546
    .line 547
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 548
    .line 549
    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/switchbutton/a;->b(I)Landroid/content/res/ColorStateList;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 554
    .line 555
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 560
    .line 561
    :cond_7
    float-to-double v1, v11

    .line 562
    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 567
    .line 568
    float-to-double v1, v4

    .line 569
    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 574
    .line 575
    iput-object v10, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 576
    .line 577
    move-object/from16 v9, v24

    .line 578
    .line 579
    iput-object v9, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 580
    .line 581
    if-eqz v10, :cond_8

    .line 582
    .line 583
    move v3, v14

    .line 584
    goto :goto_6

    .line 585
    :cond_8
    const/4 v3, 0x0

    .line 586
    :goto_6
    iput-boolean v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 587
    .line 588
    if-nez v3, :cond_9

    .line 589
    .line 590
    if-nez v9, :cond_9

    .line 591
    .line 592
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 593
    .line 594
    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/switchbutton/a;->a(I)Landroid/content/res/ColorStateList;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 599
    .line 600
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 605
    .line 606
    iget-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 607
    .line 608
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l0:[I

    .line 609
    .line 610
    invoke-virtual {v2, v3, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

    .line 615
    .line 616
    :cond_9
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 617
    .line 618
    move/from16 v2, v16

    .line 619
    .line 620
    move/from16 v13, v23

    .line 621
    .line 622
    move/from16 v14, v27

    .line 623
    .line 624
    move/from16 v15, v28

    .line 625
    .line 626
    invoke-virtual {v1, v13, v15, v14, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 627
    .line 628
    .line 629
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 630
    .line 631
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    cmpl-float v1, v1, v17

    .line 636
    .line 637
    const/high16 v2, 0x3f800000    # 1.0f

    .line 638
    .line 639
    move/from16 v8, v22

    .line 640
    .line 641
    if-ltz v1, :cond_a

    .line 642
    .line 643
    invoke-static {v8, v2}, Ljava/lang/Math;->max(FF)F

    .line 644
    .line 645
    .line 646
    move-result v14

    .line 647
    goto :goto_7

    .line 648
    :cond_a
    move v14, v8

    .line 649
    :goto_7
    iput v14, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 650
    .line 651
    move/from16 v6, v21

    .line 652
    .line 653
    iput v6, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 654
    .line 655
    move/from16 v7, v20

    .line 656
    .line 657
    iput v7, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 658
    .line 659
    move/from16 v3, v19

    .line 660
    .line 661
    int-to-long v3, v3

    .line 662
    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:J

    .line 663
    .line 664
    move/from16 v1, v18

    .line 665
    .line 666
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:Z

    .line 667
    .line 668
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 669
    .line 670
    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    if-eqz v1, :cond_b

    .line 678
    .line 679
    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 680
    .line 681
    .line 682
    :cond_b
    return-void

    .line 683
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public drawableStateChanged()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setDrawableState(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    sget-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m0:[I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l0:[I

    .line 40
    .line 41
    :goto_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l0:[I

    .line 52
    .line 53
    invoke-virtual {v1, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:I

    .line 58
    .line 59
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m0:[I

    .line 60
    .line 61
    invoke-virtual {v1, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:I

    .line 66
    .line 67
    :cond_2
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 68
    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 80
    .line 81
    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 86
    .line 87
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 88
    .line 89
    invoke-virtual {v2, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    instance-of v2, v1, Landroid/graphics/drawable/StateListDrawable;

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:Z

    .line 103
    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    const/4 v0, 0x0

    .line 123
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setDrawableState(Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    :cond_5
    return-void
.end method

.method public final e(Ljava/lang/CharSequence;)Landroid/text/Layout;
    .locals 8

    .line 1
    new-instance v0, Landroid/text/StaticLayout;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-static {p1, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    float-to-double v3, v1

    .line 10
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    double-to-int v3, v3

    .line 15
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    .line 21
    move-object v1, p1

    .line 22
    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final f(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 24
    .line 25
    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-ne p1, v1, :cond_5

    .line 29
    .line 30
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 37
    .line 38
    iget v4, v3, Landroid/graphics/RectF;->top:F

    .line 39
    .line 40
    add-float/2addr p1, v4

    .line 41
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 42
    .line 43
    add-float/2addr p1, v3

    .line 44
    float-to-double v3, p1

    .line 45
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:F

    .line 53
    .line 54
    invoke-static {p1, v3}, Ljava/lang/Math;->max(FF)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    float-to-double v3, p1

    .line 59
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/2addr p1, v3

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    add-int/2addr p1, v3

    .line 75
    int-to-float p1, p1

    .line 76
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 77
    .line 78
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 79
    .line 80
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    sub-float/2addr p1, v3

    .line 85
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 86
    .line 87
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-float/2addr p1, v3

    .line 94
    int-to-float v3, v0

    .line 95
    cmpl-float p1, p1, v3

    .line 96
    .line 97
    if-lez p1, :cond_1

    .line 98
    .line 99
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 100
    .line 101
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    sub-int p1, v0, p1

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    sub-int/2addr p1, v3

    .line 116
    int-to-float p1, p1

    .line 117
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 118
    .line 119
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    add-float/2addr p1, v3

    .line 126
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 127
    .line 128
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 129
    .line 130
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-float/2addr p1, v1

    .line 135
    float-to-double v3, p1

    .line 136
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 141
    .line 142
    if-gez p1, :cond_2

    .line 143
    .line 144
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 145
    .line 146
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 147
    .line 148
    return v0

    .line 149
    :cond_2
    int-to-float p1, p1

    .line 150
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 151
    .line 152
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 153
    .line 154
    sub-float/2addr p1, v3

    .line 155
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 156
    .line 157
    sub-float/2addr p1, v1

    .line 158
    float-to-double v3, p1

    .line 159
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 164
    .line 165
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 166
    .line 167
    if-gez p1, :cond_4

    .line 168
    .line 169
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 170
    .line 171
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 172
    .line 173
    :cond_4
    return v0

    .line 174
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 175
    .line 176
    if-nez p1, :cond_6

    .line 177
    .line 178
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 187
    .line 188
    const/high16 v1, 0x41a00000    # 20.0f

    .line 189
    .line 190
    mul-float/2addr p1, v1

    .line 191
    float-to-double v3, p1

    .line 192
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 197
    .line 198
    :cond_6
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 199
    .line 200
    int-to-float p1, p1

    .line 201
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 202
    .line 203
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 204
    .line 205
    add-float/2addr p1, v3

    .line 206
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 207
    .line 208
    add-float/2addr p1, v1

    .line 209
    float-to-double v3, p1

    .line 210
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 215
    .line 216
    if-gez p1, :cond_7

    .line 217
    .line 218
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 219
    .line 220
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 221
    .line 222
    return v0

    .line 223
    :cond_7
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:F

    .line 224
    .line 225
    int-to-float p1, p1

    .line 226
    sub-float/2addr v0, p1

    .line 227
    float-to-double v0, v0

    .line 228
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-lez p1, :cond_8

    .line 233
    .line 234
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 235
    .line 236
    add-int/2addr v0, p1

    .line 237
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 238
    .line 239
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 240
    .line 241
    add-int/2addr v0, p1

    .line 242
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 243
    .line 244
    :cond_8
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 245
    .line 246
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 247
    .line 248
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    add-int/2addr v0, p1

    .line 257
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    add-int/2addr v0, v1

    .line 262
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    return p1
.end method

.method public final g(I)I
    .locals 9

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 24
    .line 25
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:F

    .line 26
    .line 27
    float-to-double v1, v1

    .line 28
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    cmpl-float v2, v2, v3

    .line 36
    .line 37
    const v4, 0x3fe66666    # 1.8f

    .line 38
    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 43
    .line 44
    :cond_1
    const/high16 v2, 0x40000000    # 2.0f

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    if-ne p1, v2, :cond_8

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int p1, v0, p1

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sub-int/2addr p1, v2

    .line 60
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 66
    .line 67
    mul-float/2addr v2, v4

    .line 68
    float-to-double v6, v2

    .line 69
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:I

    .line 74
    .line 75
    add-int/2addr v4, v1

    .line 76
    iget v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 77
    .line 78
    sub-int v6, v2, v6

    .line 79
    .line 80
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 81
    .line 82
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 85
    .line 86
    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    float-to-double v7, v7

    .line 91
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    add-int/2addr v6, v7

    .line 96
    sub-int/2addr v4, v6

    .line 97
    int-to-float v2, v2

    .line 98
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 99
    .line 100
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 101
    .line 102
    add-float/2addr v7, v2

    .line 103
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 104
    .line 105
    add-float/2addr v7, v6

    .line 106
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    int-to-float v6, v6

    .line 111
    add-float/2addr v7, v6

    .line 112
    float-to-double v6, v7

    .line 113
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 118
    .line 119
    if-gez v6, :cond_2

    .line 120
    .line 121
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 122
    .line 123
    :cond_2
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 124
    .line 125
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 126
    .line 127
    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    add-float/2addr v2, v6

    .line 132
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 133
    .line 134
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 135
    .line 136
    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    add-float/2addr v2, v6

    .line 141
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    int-to-float v4, v4

    .line 146
    add-float/2addr v2, v4

    .line 147
    int-to-float p1, p1

    .line 148
    cmpl-float p1, v2, p1

    .line 149
    .line 150
    if-lez p1, :cond_3

    .line 151
    .line 152
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 153
    .line 154
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 155
    .line 156
    if-nez p1, :cond_7

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    sub-int p1, v0, p1

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    sub-int/2addr p1, v2

    .line 169
    int-to-float p1, p1

    .line 170
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 171
    .line 172
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 173
    .line 174
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    sub-float/2addr p1, v2

    .line 179
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 180
    .line 181
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 182
    .line 183
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    sub-float/2addr p1, v2

    .line 188
    float-to-double v2, p1

    .line 189
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-gez p1, :cond_4

    .line 194
    .line 195
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 196
    .line 197
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 198
    .line 199
    return v0

    .line 200
    :cond_4
    int-to-float v2, p1

    .line 201
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 202
    .line 203
    div-float v3, v2, v3

    .line 204
    .line 205
    float-to-double v3, v3

    .line 206
    invoke-virtual {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 211
    .line 212
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 213
    .line 214
    iget v4, v3, Landroid/graphics/RectF;->left:F

    .line 215
    .line 216
    add-float/2addr v2, v4

    .line 217
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 218
    .line 219
    add-float/2addr v2, v3

    .line 220
    float-to-double v2, v2

    .line 221
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 226
    .line 227
    if-gez v2, :cond_5

    .line 228
    .line 229
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 230
    .line 231
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 232
    .line 233
    return v0

    .line 234
    :cond_5
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:I

    .line 235
    .line 236
    add-int/2addr v1, v2

    .line 237
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 238
    .line 239
    sub-int/2addr p1, v2

    .line 240
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 241
    .line 242
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 243
    .line 244
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 245
    .line 246
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    float-to-double v2, v2

    .line 251
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    add-int/2addr p1, v2

    .line 256
    sub-int/2addr v1, p1

    .line 257
    if-lez v1, :cond_6

    .line 258
    .line 259
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 260
    .line 261
    sub-int/2addr p1, v1

    .line 262
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 263
    .line 264
    :cond_6
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 265
    .line 266
    if-gez p1, :cond_7

    .line 267
    .line 268
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 269
    .line 270
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 271
    .line 272
    :cond_7
    return v0

    .line 273
    :cond_8
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 274
    .line 275
    if-nez p1, :cond_9

    .line 276
    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 286
    .line 287
    const/high16 v2, 0x41a00000    # 20.0f

    .line 288
    .line 289
    mul-float/2addr p1, v2

    .line 290
    float-to-double v6, p1

    .line 291
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 296
    .line 297
    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 298
    .line 299
    cmpl-float p1, p1, v3

    .line 300
    .line 301
    if-nez p1, :cond_a

    .line 302
    .line 303
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 304
    .line 305
    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 306
    .line 307
    int-to-float p1, p1

    .line 308
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 309
    .line 310
    mul-float/2addr p1, v2

    .line 311
    float-to-double v6, p1

    .line 312
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:I

    .line 317
    .line 318
    add-int/2addr v1, v2

    .line 319
    int-to-float v1, v1

    .line 320
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 321
    .line 322
    sub-int v2, p1, v2

    .line 323
    .line 324
    int-to-float v2, v2

    .line 325
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 326
    .line 327
    iget v6, v4, Landroid/graphics/RectF;->left:F

    .line 328
    .line 329
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 330
    .line 331
    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    add-float/2addr v2, v4

    .line 336
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:I

    .line 337
    .line 338
    int-to-float v4, v4

    .line 339
    add-float/2addr v2, v4

    .line 340
    sub-float/2addr v1, v2

    .line 341
    float-to-double v1, v1

    .line 342
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    int-to-float p1, p1

    .line 347
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 348
    .line 349
    iget v4, v2, Landroid/graphics/RectF;->left:F

    .line 350
    .line 351
    add-float/2addr v4, p1

    .line 352
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 353
    .line 354
    add-float/2addr v4, v2

    .line 355
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    int-to-float v2, v2

    .line 360
    add-float/2addr v4, v2

    .line 361
    float-to-double v6, v4

    .line 362
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 367
    .line 368
    if-gez v2, :cond_b

    .line 369
    .line 370
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 371
    .line 372
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 373
    .line 374
    return v0

    .line 375
    :cond_b
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 376
    .line 377
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 378
    .line 379
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    add-float/2addr p1, v0

    .line 384
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 385
    .line 386
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 387
    .line 388
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    add-float/2addr p1, v0

    .line 393
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    int-to-float v0, v0

    .line 398
    add-float/2addr p1, v0

    .line 399
    float-to-double v0, p1

    .line 400
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    add-int/2addr v0, p1

    .line 409
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    add-int/2addr v0, v1

    .line 414
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    return p1
.end method

.method public getAnimationDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getBackColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBackDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBackRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getBackSizeF()Landroid/graphics/PointF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public getTextOff()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextOn()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    return v0
.end method

.method public getThumbMargin()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public getThumbRangeRatio()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public getThumbWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    return v0
.end method

.method public getTintColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public h(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public i(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 6
    .line 7
    if-eqz v1, :cond_8

    .line 8
    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 10
    .line 11
    if-eqz v2, :cond_8

    .line 12
    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 20
    .line 21
    const/high16 v3, -0x40800000    # -1.0f

    .line 22
    .line 23
    cmpl-float v2, v2, v3

    .line 24
    .line 25
    const/high16 v4, 0x40000000    # 2.0f

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    int-to-float v0, v0

    .line 34
    div-float/2addr v0, v4

    .line 35
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 36
    .line 37
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 38
    .line 39
    cmpl-float v0, v0, v3

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 44
    .line 45
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v0, v0

    .line 52
    div-float/2addr v0, v4

    .line 53
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v0, v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    sub-int/2addr v0, v1

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    sub-int/2addr v1, v2

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sub-int/2addr v1, v2

    .line 83
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 84
    .line 85
    int-to-float v2, v2

    .line 86
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 87
    .line 88
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    sub-float/2addr v2, v3

    .line 96
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    sub-float/2addr v2, v3

    .line 105
    float-to-double v2, v2

    .line 106
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 111
    .line 112
    int-to-float v3, v3

    .line 113
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 114
    .line 115
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 116
    .line 117
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    sub-float/2addr v3, v6

    .line 122
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 123
    .line 124
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 125
    .line 126
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    sub-float/2addr v3, v6

    .line 131
    float-to-double v6, v3

    .line 132
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    const/4 v6, 0x1

    .line 137
    if-gt v1, v3, :cond_3

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    int-to-float v1, v1

    .line 144
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 145
    .line 146
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 147
    .line 148
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-float/2addr v1, v3

    .line 153
    goto :goto_0

    .line 154
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    int-to-float v7, v7

    .line 159
    iget-object v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 160
    .line 161
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 162
    .line 163
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    add-float/2addr v7, v8

    .line 168
    sub-int/2addr v1, v3

    .line 169
    add-int/2addr v1, v6

    .line 170
    int-to-float v1, v1

    .line 171
    div-float/2addr v1, v4

    .line 172
    add-float/2addr v1, v7

    .line 173
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 174
    .line 175
    if-gt v0, v3, :cond_4

    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    int-to-float v0, v0

    .line 182
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 183
    .line 184
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 185
    .line 186
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    add-float/2addr v0, v2

    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    int-to-float v3, v3

    .line 197
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 198
    .line 199
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 200
    .line 201
    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    add-float/2addr v3, v7

    .line 206
    sub-int/2addr v0, v2

    .line 207
    add-int/2addr v0, v6

    .line 208
    int-to-float v0, v0

    .line 209
    div-float/2addr v0, v4

    .line 210
    add-float/2addr v0, v3

    .line 211
    :goto_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 212
    .line 213
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 214
    .line 215
    int-to-float v3, v3

    .line 216
    add-float/2addr v3, v0

    .line 217
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 218
    .line 219
    int-to-float v7, v7

    .line 220
    add-float/2addr v7, v1

    .line 221
    invoke-virtual {v2, v0, v1, v3, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 225
    .line 226
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 227
    .line 228
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 229
    .line 230
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 231
    .line 232
    sub-float/2addr v1, v3

    .line 233
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 234
    .line 235
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 236
    .line 237
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 238
    .line 239
    sub-float v7, v0, v2

    .line 240
    .line 241
    iget v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 242
    .line 243
    int-to-float v8, v8

    .line 244
    add-float/2addr v8, v1

    .line 245
    sub-float/2addr v0, v2

    .line 246
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 247
    .line 248
    int-to-float v2, v2

    .line 249
    add-float/2addr v0, v2

    .line 250
    invoke-virtual {v3, v1, v7, v8, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 251
    .line 252
    .line 253
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 254
    .line 255
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 256
    .line 257
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 258
    .line 259
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 260
    .line 261
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 262
    .line 263
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 264
    .line 265
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 266
    .line 267
    sub-float/2addr v3, v7

    .line 268
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    sub-float/2addr v3, v1

    .line 273
    invoke-virtual {v0, v2, v5, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 274
    .line 275
    .line 276
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 283
    .line 284
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    div-float/2addr v0, v4

    .line 293
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 294
    .line 295
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 300
    .line 301
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 302
    .line 303
    if-eqz v0, :cond_5

    .line 304
    .line 305
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 306
    .line 307
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 308
    .line 309
    float-to-int v2, v2

    .line 310
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 311
    .line 312
    float-to-int v3, v3

    .line 313
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 314
    .line 315
    float-to-double v7, v1

    .line 316
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 321
    .line 322
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 323
    .line 324
    float-to-double v7, v5

    .line 325
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-virtual {v0, v2, v3, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 330
    .line 331
    .line 332
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 333
    .line 334
    if-eqz v0, :cond_6

    .line 335
    .line 336
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 337
    .line 338
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:I

    .line 345
    .line 346
    int-to-float v2, v2

    .line 347
    add-float/2addr v0, v2

    .line 348
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 349
    .line 350
    int-to-float v2, v2

    .line 351
    sub-float/2addr v0, v2

    .line 352
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 353
    .line 354
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 355
    .line 356
    sub-float/2addr v0, v2

    .line 357
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 358
    .line 359
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    int-to-float v2, v2

    .line 364
    sub-float/2addr v0, v2

    .line 365
    div-float/2addr v0, v4

    .line 366
    add-float/2addr v1, v0

    .line 367
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:I

    .line 368
    .line 369
    int-to-float v0, v0

    .line 370
    sub-float/2addr v1, v0

    .line 371
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 372
    .line 373
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 374
    .line 375
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 380
    .line 381
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    int-to-float v3, v3

    .line 386
    sub-float/2addr v0, v3

    .line 387
    div-float/2addr v0, v4

    .line 388
    add-float/2addr v2, v0

    .line 389
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/RectF;

    .line 390
    .line 391
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 392
    .line 393
    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    int-to-float v3, v3

    .line 398
    add-float/2addr v3, v1

    .line 399
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 400
    .line 401
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    int-to-float v5, v5

    .line 406
    add-float/2addr v5, v2

    .line 407
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 408
    .line 409
    .line 410
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 411
    .line 412
    if-eqz v0, :cond_7

    .line 413
    .line 414
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 415
    .line 416
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 417
    .line 418
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:I

    .line 423
    .line 424
    int-to-float v2, v2

    .line 425
    add-float/2addr v0, v2

    .line 426
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 427
    .line 428
    int-to-float v2, v2

    .line 429
    sub-float/2addr v0, v2

    .line 430
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:Landroid/graphics/RectF;

    .line 431
    .line 432
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 433
    .line 434
    sub-float/2addr v0, v2

    .line 435
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 436
    .line 437
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    int-to-float v2, v2

    .line 442
    sub-float/2addr v0, v2

    .line 443
    div-float/2addr v0, v4

    .line 444
    sub-float/2addr v1, v0

    .line 445
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 446
    .line 447
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    int-to-float v0, v0

    .line 452
    sub-float/2addr v1, v0

    .line 453
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:I

    .line 454
    .line 455
    int-to-float v0, v0

    .line 456
    add-float/2addr v1, v0

    .line 457
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 458
    .line 459
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 460
    .line 461
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 466
    .line 467
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    int-to-float v3, v3

    .line 472
    sub-float/2addr v0, v3

    .line 473
    div-float/2addr v0, v4

    .line 474
    add-float/2addr v2, v0

    .line 475
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Landroid/graphics/RectF;

    .line 476
    .line 477
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 478
    .line 479
    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    int-to-float v3, v3

    .line 484
    add-float/2addr v3, v1

    .line 485
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 486
    .line 487
    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    int-to-float v4, v4

    .line 492
    add-float/2addr v4, v2

    .line 493
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 494
    .line 495
    .line 496
    :cond_7
    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 497
    .line 498
    :cond_8
    :goto_2
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_b

    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 18
    .line 19
    const/high16 v1, 0x437f0000    # 255.0f

    .line 20
    .line 21
    const/16 v2, 0xff

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:Z

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    mul-float/2addr v4, v1

    .line 64
    float-to-int v4, v4

    .line 65
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    rsub-int v0, v4, 0xff

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:Z

    .line 94
    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

    .line 107
    .line 108
    :goto_2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 118
    .line 119
    :goto_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    mul-float/2addr v4, v1

    .line 124
    float-to-int v4, v4

    .line 125
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    mul-int/2addr v5, v4

    .line 130
    div-int/2addr v5, v2

    .line 131
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 132
    .line 133
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {v6, v5, v7, v8, v0}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 149
    .line 150
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 151
    .line 152
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 153
    .line 154
    invoke-virtual {p1, v0, v5, v5, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 155
    .line 156
    .line 157
    rsub-int v0, v4, 0xff

    .line 158
    .line 159
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    mul-int/2addr v4, v0

    .line 164
    div-int/2addr v4, v2

    .line 165
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 183
    .line 184
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 185
    .line 186
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 187
    .line 188
    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 192
    .line 193
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 198
    .line 199
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 205
    .line 206
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 207
    .line 208
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 209
    .line 210
    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 211
    .line 212
    .line 213
    :goto_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    float-to-double v3, v0

    .line 218
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 219
    .line 220
    cmpl-double v0, v3, v5

    .line 221
    .line 222
    if-lez v0, :cond_9

    .line 223
    .line 224
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 228
    .line 229
    :goto_5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    float-to-double v3, v3

    .line 234
    cmpl-double v3, v3, v5

    .line 235
    .line 236
    if-lez v3, :cond_a

    .line 237
    .line 238
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/RectF;

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_a
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Landroid/graphics/RectF;

    .line 242
    .line 243
    :goto_6
    const/4 v4, 0x0

    .line 244
    if-eqz v0, :cond_e

    .line 245
    .line 246
    if-eqz v3, :cond_e

    .line 247
    .line 248
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    float-to-double v7, v7

    .line 253
    const-wide/high16 v9, 0x3fe8000000000000L    # 0.75

    .line 254
    .line 255
    cmpl-double v7, v7, v9

    .line 256
    .line 257
    const/high16 v8, 0x40800000    # 4.0f

    .line 258
    .line 259
    if-ltz v7, :cond_b

    .line 260
    .line 261
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    mul-float/2addr v7, v8

    .line 266
    const/high16 v8, 0x40400000    # 3.0f

    .line 267
    .line 268
    sub-float/2addr v7, v8

    .line 269
    goto :goto_7

    .line 270
    :cond_b
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    float-to-double v9, v7

    .line 275
    const-wide/high16 v11, 0x3fd0000000000000L    # 0.25

    .line 276
    .line 277
    cmpg-double v7, v9, v11

    .line 278
    .line 279
    if-gez v7, :cond_c

    .line 280
    .line 281
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    mul-float/2addr v7, v8

    .line 286
    const/high16 v8, 0x3f800000    # 1.0f

    .line 287
    .line 288
    sub-float v7, v8, v7

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_c
    move v7, v4

    .line 292
    :goto_7
    mul-float/2addr v7, v1

    .line 293
    float-to-int v1, v7

    .line 294
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    float-to-double v7, v7

    .line 299
    cmpl-double v7, v7, v5

    .line 300
    .line 301
    if-lez v7, :cond_d

    .line 302
    .line 303
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:I

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_d
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:I

    .line 307
    .line 308
    :goto_8
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    mul-int/2addr v8, v1

    .line 313
    div-int/2addr v8, v2

    .line 314
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    invoke-virtual {v1, v8, v2, v9, v7}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 334
    .line 335
    .line 336
    iget v1, v3, Landroid/graphics/RectF;->left:F

    .line 337
    .line 338
    iget v2, v3, Landroid/graphics/RectF;->top:F

    .line 339
    .line 340
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 347
    .line 348
    .line 349
    :cond_e
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 350
    .line 351
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 357
    .line 358
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 359
    .line 360
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 361
    .line 362
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    mul-float/2addr v1, v2

    .line 367
    invoke-virtual {v0, v1, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 368
    .line 369
    .line 370
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 371
    .line 372
    if-eqz v0, :cond_f

    .line 373
    .line 374
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 375
    .line 376
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 377
    .line 378
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 379
    .line 380
    float-to-int v2, v2

    .line 381
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 382
    .line 383
    float-to-int v3, v3

    .line 384
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 385
    .line 386
    float-to-double v7, v1

    .line 387
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 392
    .line 393
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 394
    .line 395
    float-to-double v7, v4

    .line 396
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c(D)I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 401
    .line 402
    .line 403
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 404
    .line 405
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 406
    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_f
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 410
    .line 411
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 414
    .line 415
    .line 416
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 417
    .line 418
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 419
    .line 420
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Landroid/graphics/Paint;

    .line 421
    .line 422
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 423
    .line 424
    .line 425
    :goto_9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:Z

    .line 426
    .line 427
    if-eqz v0, :cond_11

    .line 428
    .line 429
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 430
    .line 431
    const-string v1, "#AA0000"

    .line 432
    .line 433
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 438
    .line 439
    .line 440
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 441
    .line 442
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 443
    .line 444
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 445
    .line 446
    .line 447
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 448
    .line 449
    const-string v1, "#0000FF"

    .line 450
    .line 451
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 456
    .line 457
    .line 458
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:Landroid/graphics/RectF;

    .line 459
    .line 460
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 461
    .line 462
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 463
    .line 464
    .line 465
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 466
    .line 467
    const-string v1, "#000000"

    .line 468
    .line 469
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 474
    .line 475
    .line 476
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 477
    .line 478
    iget v8, v0, Landroid/graphics/RectF;->left:F

    .line 479
    .line 480
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 481
    .line 482
    iget v9, v1, Landroid/graphics/RectF;->top:F

    .line 483
    .line 484
    iget v10, v0, Landroid/graphics/RectF;->right:F

    .line 485
    .line 486
    iget-object v12, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 487
    .line 488
    move v11, v9

    .line 489
    move-object v7, p1

    .line 490
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 491
    .line 492
    .line 493
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 494
    .line 495
    const-string v0, "#00CC00"

    .line 496
    .line 497
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 502
    .line 503
    .line 504
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    float-to-double v0, p1

    .line 509
    cmpl-double p1, v0, v5

    .line 510
    .line 511
    if-lez p1, :cond_10

    .line 512
    .line 513
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/RectF;

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Landroid/graphics/RectF;

    .line 517
    .line 518
    :goto_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Landroid/graphics/Paint;

    .line 519
    .line 520
    invoke-virtual {v7, p1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 521
    .line 522
    .line 523
    :cond_11
    :goto_b
    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e(Ljava/lang/CharSequence;)Landroid/text/Layout;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 26
    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e(Ljava/lang/CharSequence;)Landroid/text/Layout;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-float v0, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, v1

    .line 53
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-float v2, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move v2, v1

    .line 64
    :goto_1
    cmpl-float v3, v0, v1

    .line 65
    .line 66
    if-nez v3, :cond_5

    .line 67
    .line 68
    cmpl-float v3, v2, v1

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:F

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    :goto_2
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:F

    .line 81
    .line 82
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:Landroid/text/Layout;

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-float v0, v0

    .line 91
    goto :goto_4

    .line 92
    :cond_6
    move v0, v1

    .line 93
    :goto_4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:Landroid/text/Layout;

    .line 94
    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    int-to-float v2, v2

    .line 102
    goto :goto_5

    .line 103
    :cond_7
    move v2, v1

    .line 104
    :goto_5
    cmpl-float v3, v0, v1

    .line 105
    .line 106
    if-nez v3, :cond_9

    .line 107
    .line 108
    cmpl-float v3, v2, v1

    .line 109
    .line 110
    if-eqz v3, :cond_8

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:F

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_9
    :goto_6
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:F

    .line 121
    .line 122
    :goto_7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g(I)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f(I)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->c:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->d:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 22
    .line 23
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->c:Ljava/lang/CharSequence;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->d:Ljava/lang/CharSequence;

    .line 17
    .line 18
    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p3, :cond_1

    .line 5
    .line 6
    if-eq p2, p4, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void

    .line 10
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_a

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 35
    .line 36
    sub-float/2addr v2, v3

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:F

    .line 42
    .line 43
    sub-float/2addr v3, v4

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v0, :cond_9

    .line 46
    .line 47
    if-eq v0, v4, :cond_6

    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    if-eq v0, v5, :cond_1

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    if-eq v0, v5, :cond_6

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->M:F

    .line 66
    .line 67
    sub-float v5, p1, v5

    .line 68
    .line 69
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 70
    .line 71
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    div-float/2addr v5, v6

    .line 76
    add-float/2addr v0, v5

    .line 77
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 78
    .line 79
    .line 80
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    .line 81
    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:I

    .line 89
    .line 90
    int-to-float v5, v5

    .line 91
    const/high16 v6, 0x40000000    # 2.0f

    .line 92
    .line 93
    div-float/2addr v5, v6

    .line 94
    cmpl-float v0, v0, v5

    .line 95
    .line 96
    if-gtz v0, :cond_2

    .line 97
    .line 98
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:I

    .line 103
    .line 104
    int-to-float v5, v5

    .line 105
    div-float/2addr v5, v6

    .line 106
    cmpl-float v0, v0, v5

    .line 107
    .line 108
    if-lez v0, :cond_5

    .line 109
    .line 110
    :cond_2
    const/4 v0, 0x0

    .line 111
    cmpl-float v0, v3, v0

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    cmpl-float v0, v0, v5

    .line 124
    .line 125
    if-lez v0, :cond_3

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    cmpl-float v0, v0, v2

    .line 137
    .line 138
    if-lez v0, :cond_5

    .line 139
    .line 140
    return v1

    .line 141
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b()V

    .line 142
    .line 143
    .line 144
    :cond_5
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->M:F

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j0:Z

    .line 148
    .line 149
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    sub-long/2addr v5, v7

    .line 161
    long-to-float p1, v5

    .line 162
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:I

    .line 167
    .line 168
    int-to-float v2, v2

    .line 169
    cmpg-float v0, v0, v2

    .line 170
    .line 171
    if-gez v0, :cond_7

    .line 172
    .line 173
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:I

    .line 178
    .line 179
    int-to-float v2, v2

    .line 180
    cmpg-float v0, v0, v2

    .line 181
    .line 182
    if-gez v0, :cond_7

    .line 183
    .line 184
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:I

    .line 185
    .line 186
    int-to-float v0, v0

    .line 187
    cmpg-float p1, p1, v0

    .line 188
    .line 189
    if-gez p1, :cond_7

    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->performClick()Z

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getStatusBasedOnPos()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eq p1, v0, :cond_8

    .line 204
    .line 205
    invoke-virtual {p0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 221
    .line 222
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:F

    .line 227
    .line 228
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 229
    .line 230
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->M:F

    .line 231
    .line 232
    invoke-virtual {p0, v4}, Landroid/view/View;->setPressed(Z)V

    .line 233
    .line 234
    .line 235
    :goto_1
    return v4

    .line 236
    :cond_a
    :goto_2
    return v1
.end method

.method public performClick()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->performClick()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public setAnimationDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:J

    .line 2
    .line 3
    return-void
.end method

.method public setBackColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBackColorRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackColor(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBackDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v0

    .line 9
    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setBackDrawableRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBackRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediatelyNoEvent(Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setCheckedImmediately(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/animation/ObjectAnimator;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 17
    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setCheckedImmediatelyNoEvent(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediately(Z)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediately(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setCheckedNoEvent(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setDrawDebugRect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFadeBack(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 5
    .line 6
    return-void
.end method

.method public setTextAdjust(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTextExtra(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTextThumbInset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbColorRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbColor(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v0

    .line 9
    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setThumbDrawableRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbMargin(Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i(FFFF)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 9
    .line 10
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 11
    .line 12
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 13
    .line 14
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i(FFFF)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setThumbRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setThumbRangeRatio(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:F

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setTintColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/switchbutton/a;->b(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/switchbutton/a;->a(I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
