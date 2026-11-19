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
.field public static final h0:[I

.field public static final i0:[I


# instance fields
.field public A:Landroid/graphics/RectF;

.field public B:Landroid/graphics/Paint;

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Landroid/animation/ObjectAnimator;

.field public G:F

.field public H:Landroid/graphics/RectF;

.field public I:F

.field public J:F

.field public K:F

.field public L:I

.field public M:I

.field public N:Landroid/graphics/Paint;

.field public O:Ljava/lang/CharSequence;

.field public P:Ljava/lang/CharSequence;

.field public Q:Landroid/text/TextPaint;

.field public R:Landroid/text/StaticLayout;

.field public S:Landroid/text/StaticLayout;

.field public T:F

.field public U:F

.field public V:I

.field public W:I

.field public a:Landroid/graphics/drawable/Drawable;

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:Landroid/content/res/ColorStateList;

.field public c0:I

.field public d:Landroid/content/res/ColorStateList;

.field public d0:Z

.field public e:F

.field public e0:Z

.field public f:F

.field public f0:Z

.field public g:Landroid/graphics/RectF;

.field public g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public h:F

.field public i:J

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:Landroid/graphics/RectF;

.field public x:Landroid/graphics/RectF;

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
    sput-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:[I

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
    sput-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:[I

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 15
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

    .line 16
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    .line 12
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    .line 6
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:J

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:F

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

    .line 46
    .line 47
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:F

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;)V
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
    iput v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:I

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
    add-int/2addr v3, v2

    .line 28
    iput v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->M:I

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
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 44
    .line 45
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

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
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Landroid/text/TextPaint;

    .line 70
    .line 71
    new-instance v2, Landroid/graphics/RectF;

    .line 72
    .line 73
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 77
    .line 78
    new-instance v2, Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 84
    .line 85
    new-instance v2, Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 91
    .line 92
    new-instance v2, Landroid/graphics/RectF;

    .line 93
    .line 94
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 98
    .line 99
    new-instance v2, Landroid/graphics/RectF;

    .line 100
    .line 101
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 105
    .line 106
    new-instance v2, Landroid/graphics/RectF;

    .line 107
    .line 108
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

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
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

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
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

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
    sget v11, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbDrawable:I

    .line 187
    .line 188
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    sget v12, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbColor:I

    .line 193
    .line 194
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    sget v13, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMargin:I

    .line 199
    .line 200
    invoke-virtual {v5, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    sget v13, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginLeft:I

    .line 205
    .line 206
    invoke-virtual {v5, v13, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    sget v14, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginRight:I

    .line 211
    .line 212
    invoke-virtual {v5, v14, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginTop:I

    .line 217
    .line 218
    invoke-virtual {v5, v15, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginBottom:I

    .line 223
    .line 224
    invoke-virtual {v5, v4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbWidth:I

    .line 229
    .line 230
    invoke-virtual {v5, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    sget v10, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbHeight:I

    .line 235
    .line 236
    invoke-virtual {v5, v10, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    move/from16 v17, v6

    .line 241
    .line 242
    sget v6, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRadius:I

    .line 243
    .line 244
    invoke-virtual {v5, v6, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backRadius:I

    .line 249
    .line 250
    invoke-virtual {v5, v3, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backDrawable:I

    .line 258
    .line 259
    invoke-virtual {v5, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backColor:I

    .line 264
    .line 265
    invoke-virtual {v5, v9}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    move/from16 v19, v2

    .line 270
    .line 271
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRangeRatio:I

    .line 272
    .line 273
    invoke-virtual {v5, v2, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_animationDuration:I

    .line 278
    .line 279
    move-object/from16 v20, v3

    .line 280
    .line 281
    const/16 v3, 0xfa

    .line 282
    .line 283
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_fadeBack:I

    .line 288
    .line 289
    move/from16 v18, v2

    .line 290
    .line 291
    const/4 v2, 0x1

    .line 292
    invoke-virtual {v5, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_tintColor:I

    .line 297
    .line 298
    move/from16 v21, v3

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOn:I

    .line 306
    .line 307
    invoke-virtual {v5, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    move/from16 v22, v2

    .line 312
    .line 313
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOff:I

    .line 314
    .line 315
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    move-object/from16 v23, v2

    .line 320
    .line 321
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textThumbInset:I

    .line 322
    .line 323
    move-object/from16 v24, v3

    .line 324
    .line 325
    const/4 v3, 0x0

    .line 326
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    move/from16 v25, v2

    .line 331
    .line 332
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textExtra:I

    .line 333
    .line 334
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    move/from16 v26, v2

    .line 339
    .line 340
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textAdjust:I

    .line 341
    .line 342
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 347
    .line 348
    .line 349
    move/from16 v27, v14

    .line 350
    .line 351
    move/from16 v28, v15

    .line 352
    .line 353
    move/from16 v3, v19

    .line 354
    .line 355
    move-object/from16 v5, v24

    .line 356
    .line 357
    move-object v15, v9

    .line 358
    move v14, v13

    .line 359
    move/from16 v19, v18

    .line 360
    .line 361
    move/from16 v18, v21

    .line 362
    .line 363
    move/from16 v9, v22

    .line 364
    .line 365
    move/from16 v21, v6

    .line 366
    .line 367
    move/from16 v22, v8

    .line 368
    .line 369
    move-object v13, v11

    .line 370
    move/from16 v6, v25

    .line 371
    .line 372
    move v8, v2

    .line 373
    move v11, v4

    .line 374
    move v4, v10

    .line 375
    move-object/from16 v10, v20

    .line 376
    .line 377
    move-object/from16 v2, v23

    .line 378
    .line 379
    move/from16 v20, v7

    .line 380
    .line 381
    move/from16 v7, v26

    .line 382
    .line 383
    goto :goto_1

    .line 384
    :cond_1
    move/from16 v17, v6

    .line 385
    .line 386
    const/16 v3, 0xfa

    .line 387
    .line 388
    move/from16 v19, v3

    .line 389
    .line 390
    move/from16 v20, v7

    .line 391
    .line 392
    move/from16 v21, v20

    .line 393
    .line 394
    move/from16 v22, v8

    .line 395
    .line 396
    move/from16 v3, v17

    .line 397
    .line 398
    move v4, v3

    .line 399
    move v11, v4

    .line 400
    move v14, v11

    .line 401
    move/from16 v27, v14

    .line 402
    .line 403
    move/from16 v28, v27

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    const/4 v5, 0x0

    .line 407
    const/4 v6, 0x0

    .line 408
    const/4 v7, 0x0

    .line 409
    const/4 v8, 0x0

    .line 410
    const/4 v9, 0x0

    .line 411
    const/4 v10, 0x0

    .line 412
    const/4 v12, 0x0

    .line 413
    const/4 v13, 0x0

    .line 414
    const/4 v15, 0x0

    .line 415
    const/16 v18, 0x1

    .line 416
    .line 417
    :goto_1
    move/from16 v16, v3

    .line 418
    .line 419
    if-nez v1, :cond_2

    .line 420
    .line 421
    move/from16 v23, v14

    .line 422
    .line 423
    move-object/from16 v24, v15

    .line 424
    .line 425
    const/4 v1, 0x0

    .line 426
    goto :goto_2

    .line 427
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    move/from16 v23, v14

    .line 432
    .line 433
    const v14, 0x10100da

    .line 434
    .line 435
    .line 436
    move-object/from16 v24, v15

    .line 437
    .line 438
    const v15, 0x10100e5

    .line 439
    .line 440
    .line 441
    filled-new-array {v14, v15}, [I

    .line 442
    .line 443
    .line 444
    move-result-object v14

    .line 445
    invoke-virtual {v3, v1, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    :goto_2
    if-eqz v1, :cond_3

    .line 450
    .line 451
    const/4 v3, 0x0

    .line 452
    const/4 v14, 0x1

    .line 453
    invoke-virtual {v1, v3, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 454
    .line 455
    .line 456
    move-result v15

    .line 457
    invoke-virtual {v1, v14, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    invoke-virtual {v0, v15}, Landroid/view/View;->setFocusable(Z)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 468
    .line 469
    .line 470
    goto :goto_3

    .line 471
    :cond_3
    const/4 v14, 0x1

    .line 472
    invoke-virtual {v0, v14}, Landroid/view/View;->setFocusable(Z)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v14}, Landroid/view/View;->setClickable(Z)V

    .line 476
    .line 477
    .line 478
    :goto_3
    iput-object v5, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

    .line 479
    .line 480
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 481
    .line 482
    iput v6, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:I

    .line 483
    .line 484
    iput v7, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:I

    .line 485
    .line 486
    iput v8, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c0:I

    .line 487
    .line 488
    iput-object v13, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 489
    .line 490
    iput-object v12, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

    .line 491
    .line 492
    if-eqz v13, :cond_4

    .line 493
    .line 494
    const/4 v2, 0x1

    .line 495
    goto :goto_4

    .line 496
    :cond_4
    const/4 v2, 0x0

    .line 497
    :goto_4
    iput-boolean v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 498
    .line 499
    iput v9, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 500
    .line 501
    if-nez v9, :cond_6

    .line 502
    .line 503
    new-instance v1, Landroid/util/TypedValue;

    .line 504
    .line 505
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    sget v3, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 517
    .line 518
    const/4 v14, 0x1

    .line 519
    invoke-virtual {v2, v3, v1, v14}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_5

    .line 524
    .line 525
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 526
    .line 527
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 528
    .line 529
    goto :goto_5

    .line 530
    :cond_5
    const v1, 0x327fc2

    .line 531
    .line 532
    .line 533
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 534
    .line 535
    goto :goto_5

    .line 536
    :cond_6
    const/4 v14, 0x1

    .line 537
    :goto_5
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 538
    .line 539
    if-nez v1, :cond_7

    .line 540
    .line 541
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

    .line 542
    .line 543
    if-nez v1, :cond_7

    .line 544
    .line 545
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 546
    .line 547
    invoke-static {v1}, Lv7/d;->j(I)Landroid/content/res/ColorStateList;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

    .line 552
    .line 553
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 558
    .line 559
    :cond_7
    float-to-double v1, v11

    .line 560
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    double-to-int v1, v1

    .line 565
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 566
    .line 567
    float-to-double v1, v4

    .line 568
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 569
    .line 570
    .line 571
    move-result-wide v1

    .line 572
    double-to-int v1, v1

    .line 573
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 574
    .line 575
    iput-object v10, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 576
    .line 577
    move-object/from16 v9, v24

    .line 578
    .line 579
    iput-object v9, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

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
    iput-boolean v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

    .line 587
    .line 588
    if-nez v3, :cond_9

    .line 589
    .line 590
    if-nez v9, :cond_9

    .line 591
    .line 592
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 593
    .line 594
    invoke-static {v1}, Lv7/d;->i(I)Landroid/content/res/ColorStateList;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 599
    .line 600
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 605
    .line 606
    iget-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 607
    .line 608
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:[I

    .line 609
    .line 610
    invoke-virtual {v2, v3, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 615
    .line 616
    :cond_9
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

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
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

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
    iput v14, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 650
    .line 651
    move/from16 v6, v21

    .line 652
    .line 653
    iput v6, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

    .line 654
    .line 655
    move/from16 v7, v20

    .line 656
    .line 657
    iput v7, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 658
    .line 659
    move/from16 v3, v19

    .line 660
    .line 661
    int-to-long v3, v3

    .line 662
    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:J

    .line 663
    .line 664
    move/from16 v1, v18

    .line 665
    .line 666
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:Z

    .line 667
    .line 668
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

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

.method public final c()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 6
    .line 7
    if-eqz v1, :cond_8

    .line 8
    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 10
    .line 11
    if-eqz v2, :cond_8

    .line 12
    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

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
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

    .line 36
    .line 37
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 38
    .line 39
    cmpl-float v0, v0, v3

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 44
    .line 45
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

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
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 84
    .line 85
    int-to-float v2, v2

    .line 86
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

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
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

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
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    double-to-int v2, v2

    .line 111
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 112
    .line 113
    int-to-float v3, v3

    .line 114
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 115
    .line 116
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 117
    .line 118
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    sub-float/2addr v3, v6

    .line 123
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 124
    .line 125
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 126
    .line 127
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    sub-float/2addr v3, v6

    .line 132
    float-to-double v6, v3

    .line 133
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    double-to-int v3, v6

    .line 138
    const/4 v6, 0x1

    .line 139
    if-gt v1, v3, :cond_3

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    int-to-float v1, v1

    .line 146
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 147
    .line 148
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 149
    .line 150
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    add-float/2addr v3, v1

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    int-to-float v7, v7

    .line 161
    iget-object v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 162
    .line 163
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 164
    .line 165
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    add-float/2addr v8, v7

    .line 170
    sub-int/2addr v1, v3

    .line 171
    add-int/2addr v1, v6

    .line 172
    int-to-float v1, v1

    .line 173
    div-float/2addr v1, v4

    .line 174
    add-float v3, v1, v8

    .line 175
    .line 176
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 177
    .line 178
    if-gt v0, v1, :cond_4

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    int-to-float v0, v0

    .line 185
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 186
    .line 187
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 188
    .line 189
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    add-float/2addr v1, v0

    .line 194
    goto :goto_1

    .line 195
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    int-to-float v1, v1

    .line 200
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 201
    .line 202
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 203
    .line 204
    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    add-float/2addr v7, v1

    .line 209
    sub-int/2addr v0, v2

    .line 210
    add-int/2addr v0, v6

    .line 211
    int-to-float v0, v0

    .line 212
    div-float/2addr v0, v4

    .line 213
    add-float v1, v0, v7

    .line 214
    .line 215
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 216
    .line 217
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 218
    .line 219
    int-to-float v2, v2

    .line 220
    add-float/2addr v2, v1

    .line 221
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 222
    .line 223
    int-to-float v7, v7

    .line 224
    add-float/2addr v7, v3

    .line 225
    invoke-virtual {v0, v1, v3, v2, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 229
    .line 230
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 231
    .line 232
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 233
    .line 234
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 235
    .line 236
    sub-float/2addr v1, v3

    .line 237
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 238
    .line 239
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 240
    .line 241
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 242
    .line 243
    sub-float/2addr v0, v2

    .line 244
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 245
    .line 246
    int-to-float v2, v2

    .line 247
    add-float/2addr v2, v1

    .line 248
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 249
    .line 250
    int-to-float v7, v7

    .line 251
    add-float/2addr v7, v0

    .line 252
    invoke-virtual {v3, v1, v0, v2, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 256
    .line 257
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 258
    .line 259
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 260
    .line 261
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 262
    .line 263
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 264
    .line 265
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 266
    .line 267
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 268
    .line 269
    sub-float/2addr v3, v7

    .line 270
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    sub-float/2addr v3, v1

    .line 275
    invoke-virtual {v0, v2, v5, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 279
    .line 280
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 285
    .line 286
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    div-float/2addr v0, v4

    .line 295
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 296
    .line 297
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 302
    .line 303
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 304
    .line 305
    if-eqz v0, :cond_5

    .line 306
    .line 307
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 308
    .line 309
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 310
    .line 311
    float-to-int v2, v2

    .line 312
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 313
    .line 314
    float-to-int v3, v3

    .line 315
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 316
    .line 317
    float-to-double v7, v1

    .line 318
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 319
    .line 320
    .line 321
    move-result-wide v7

    .line 322
    double-to-int v1, v7

    .line 323
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 324
    .line 325
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 326
    .line 327
    float-to-double v7, v5

    .line 328
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 329
    .line 330
    .line 331
    move-result-wide v7

    .line 332
    double-to-int v5, v7

    .line 333
    invoke-virtual {v0, v2, v3, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 334
    .line 335
    .line 336
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 337
    .line 338
    if-eqz v0, :cond_6

    .line 339
    .line 340
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 341
    .line 342
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 343
    .line 344
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:I

    .line 349
    .line 350
    int-to-float v2, v2

    .line 351
    add-float/2addr v0, v2

    .line 352
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 353
    .line 354
    int-to-float v2, v2

    .line 355
    sub-float/2addr v0, v2

    .line 356
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 357
    .line 358
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 359
    .line 360
    sub-float/2addr v0, v2

    .line 361
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 362
    .line 363
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    int-to-float v2, v2

    .line 368
    invoke-static {v0, v2, v4, v1}, Landroidx/collection/a;->a(FFFF)F

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c0:I

    .line 373
    .line 374
    int-to-float v1, v1

    .line 375
    sub-float/2addr v0, v1

    .line 376
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 377
    .line 378
    iget v2, v1, Landroid/graphics/RectF;->top:F

    .line 379
    .line 380
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 385
    .line 386
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    int-to-float v3, v3

    .line 391
    invoke-static {v1, v3, v4, v2}, Landroidx/collection/a;->a(FFFF)F

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 396
    .line 397
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 398
    .line 399
    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    int-to-float v3, v3

    .line 404
    add-float/2addr v3, v0

    .line 405
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 406
    .line 407
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    int-to-float v5, v5

    .line 412
    add-float/2addr v5, v1

    .line 413
    invoke-virtual {v2, v0, v1, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 414
    .line 415
    .line 416
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 417
    .line 418
    if-eqz v0, :cond_7

    .line 419
    .line 420
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 421
    .line 422
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 423
    .line 424
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:I

    .line 429
    .line 430
    int-to-float v2, v2

    .line 431
    add-float/2addr v0, v2

    .line 432
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 433
    .line 434
    int-to-float v2, v2

    .line 435
    sub-float/2addr v0, v2

    .line 436
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 437
    .line 438
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 439
    .line 440
    sub-float/2addr v0, v2

    .line 441
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 442
    .line 443
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    int-to-float v2, v2

    .line 448
    sub-float/2addr v0, v2

    .line 449
    div-float/2addr v0, v4

    .line 450
    sub-float/2addr v1, v0

    .line 451
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 452
    .line 453
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    int-to-float v0, v0

    .line 458
    sub-float/2addr v1, v0

    .line 459
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c0:I

    .line 460
    .line 461
    int-to-float v0, v0

    .line 462
    add-float/2addr v1, v0

    .line 463
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 464
    .line 465
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 466
    .line 467
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 472
    .line 473
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    int-to-float v3, v3

    .line 478
    invoke-static {v0, v3, v4, v2}, Landroidx/collection/a;->a(FFFF)F

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 483
    .line 484
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 485
    .line 486
    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    int-to-float v3, v3

    .line 491
    add-float/2addr v3, v1

    .line 492
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 493
    .line 494
    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    int-to-float v4, v4

    .line 499
    add-float/2addr v4, v0

    .line 500
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 501
    .line 502
    .line 503
    :cond_7
    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 504
    .line 505
    :cond_8
    :goto_2
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

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
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

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
    sget-object v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h0:[I

    .line 35
    .line 36
    sget-object v2, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i0:[I

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    move-object v0, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :goto_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v3, v1, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 58
    .line 59
    invoke-virtual {v3, v2, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

    .line 64
    .line 65
    :cond_2
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 78
    .line 79
    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 84
    .line 85
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 86
    .line 87
    invoke-virtual {v2, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    instance-of v2, v1, Landroid/graphics/drawable/StateListDrawable;

    .line 97
    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:Z

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    const/4 v0, 0x0

    .line 121
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setDrawableState(Landroid/graphics/drawable/Drawable;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public getAnimationDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getBackColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBackDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBackRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextOn()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    return v0
.end method

.method public getThumbMargin()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThumbRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public getThumbRangeRatio()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getThumbWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    return v0
.end method

.method public getTintColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_b

    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:Z

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:Landroid/graphics/drawable/Drawable;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:Landroid/graphics/drawable/Drawable;

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
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->v:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->u:Landroid/graphics/drawable/Drawable;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:Z

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
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

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
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->r:I

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

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
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 149
    .line 150
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 151
    .line 152
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 183
    .line 184
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 185
    .line 186
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 187
    .line 188
    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 192
    .line 193
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 198
    .line 199
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->q:I

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 205
    .line 206
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 207
    .line 208
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

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
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_a
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

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
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->s:I

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_d
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->t:I

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

    .line 350
    .line 351
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

    .line 357
    .line 358
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->G:F

    .line 359
    .line 360
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 361
    .line 362
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    mul-float/2addr v2, v1

    .line 367
    invoke-virtual {v0, v2, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 368
    .line 369
    .line 370
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 371
    .line 372
    if-eqz v0, :cond_f

    .line 373
    .line 374
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 375
    .line 376
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

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
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 388
    .line 389
    .line 390
    move-result-wide v7

    .line 391
    double-to-int v1, v7

    .line 392
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

    .line 393
    .line 394
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 395
    .line 396
    float-to-double v7, v4

    .line 397
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 398
    .line 399
    .line 400
    move-result-wide v7

    .line 401
    double-to-int v4, v7

    .line 402
    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 403
    .line 404
    .line 405
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 406
    .line 407
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 408
    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_f
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 412
    .line 413
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->p:I

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 416
    .line 417
    .line 418
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

    .line 419
    .line 420
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

    .line 421
    .line 422
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->B:Landroid/graphics/Paint;

    .line 423
    .line 424
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 425
    .line 426
    .line 427
    :goto_9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

    .line 428
    .line 429
    if-eqz v0, :cond_11

    .line 430
    .line 431
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 432
    .line 433
    const-string v1, "#AA0000"

    .line 434
    .line 435
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 440
    .line 441
    .line 442
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->x:Landroid/graphics/RectF;

    .line 443
    .line 444
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 445
    .line 446
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 450
    .line 451
    const-string v1, "#0000FF"

    .line 452
    .line 453
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 458
    .line 459
    .line 460
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->H:Landroid/graphics/RectF;

    .line 461
    .line 462
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 463
    .line 464
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 465
    .line 466
    .line 467
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 468
    .line 469
    const-string v1, "#000000"

    .line 470
    .line 471
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 476
    .line 477
    .line 478
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 479
    .line 480
    iget v8, v0, Landroid/graphics/RectF;->left:F

    .line 481
    .line 482
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->w:Landroid/graphics/RectF;

    .line 483
    .line 484
    iget v9, v1, Landroid/graphics/RectF;->top:F

    .line 485
    .line 486
    iget v10, v0, Landroid/graphics/RectF;->right:F

    .line 487
    .line 488
    iget-object v12, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 489
    .line 490
    move v11, v9

    .line 491
    move-object v7, p1

    .line 492
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 493
    .line 494
    .line 495
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 496
    .line 497
    const-string v0, "#00CC00"

    .line 498
    .line 499
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 504
    .line 505
    .line 506
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    float-to-double v0, p1

    .line 511
    cmpl-double p1, v0, v5

    .line 512
    .line 513
    if-lez p1, :cond_10

    .line 514
    .line 515
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->z:Landroid/graphics/RectF;

    .line 516
    .line 517
    goto :goto_a

    .line 518
    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->A:Landroid/graphics/RectF;

    .line 519
    .line 520
    :goto_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->N:Landroid/graphics/Paint;

    .line 521
    .line 522
    invoke-virtual {v7, p1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 523
    .line 524
    .line 525
    :cond_11
    :goto_b
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

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
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

    .line 14
    .line 15
    new-instance v1, Landroid/text/StaticLayout;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Landroid/text/TextPaint;

    .line 18
    .line 19
    invoke-static {v2, v3}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    float-to-double v4, v0

    .line 24
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    double-to-int v4, v4

    .line 29
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/high16 v6, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 45
    .line 46
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 53
    .line 54
    new-instance v1, Landroid/text/StaticLayout;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->Q:Landroid/text/TextPaint;

    .line 57
    .line 58
    invoke-static {v2, v3}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    float-to-double v4, v0

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    double-to-int v4, v4

    .line 68
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const/high16 v6, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 78
    .line 79
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-float v0, v0

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    move v0, v1

    .line 91
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    int-to-float v2, v2

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move v2, v1

    .line 102
    :goto_1
    cmpl-float v3, v0, v1

    .line 103
    .line 104
    if-nez v3, :cond_5

    .line 105
    .line 106
    cmpl-float v3, v2, v1

    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:F

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:F

    .line 119
    .line 120
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    int-to-float v0, v0

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    move v0, v1

    .line 131
    :goto_4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 132
    .line 133
    if-eqz v2, :cond_7

    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    int-to-float v2, v2

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    move v2, v1

    .line 142
    :goto_5
    cmpl-float v3, v0, v1

    .line 143
    .line 144
    if-nez v3, :cond_9

    .line 145
    .line 146
    cmpl-float v3, v2, v1

    .line 147
    .line 148
    if-eqz v3, :cond_8

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_8
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:F

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_9
    :goto_6
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:F

    .line 159
    .line 160
    :goto_7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 169
    .line 170
    if-nez v2, :cond_a

    .line 171
    .line 172
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 173
    .line 174
    if-eqz v2, :cond_a

    .line 175
    .line 176
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 183
    .line 184
    :cond_a
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->T:F

    .line 185
    .line 186
    float-to-double v2, v2

    .line 187
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 188
    .line 189
    .line 190
    move-result-wide v2

    .line 191
    double-to-int v2, v2

    .line 192
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 193
    .line 194
    cmpl-float v3, v3, v1

    .line 195
    .line 196
    const v4, 0x3fe66666    # 1.8f

    .line 197
    .line 198
    .line 199
    if-nez v3, :cond_b

    .line 200
    .line 201
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 202
    .line 203
    :cond_b
    const/high16 v3, 0x41a00000    # 20.0f

    .line 204
    .line 205
    const/high16 v5, 0x40000000    # 2.0f

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    if-ne p1, v5, :cond_11

    .line 209
    .line 210
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    sub-int p1, v0, p1

    .line 215
    .line 216
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    sub-int/2addr p1, v4

    .line 221
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 222
    .line 223
    if-eqz v4, :cond_d

    .line 224
    .line 225
    int-to-float v4, v4

    .line 226
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 227
    .line 228
    mul-float/2addr v4, v7

    .line 229
    float-to-double v7, v4

    .line 230
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 231
    .line 232
    .line 233
    move-result-wide v7

    .line 234
    double-to-int v4, v7

    .line 235
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:I

    .line 236
    .line 237
    add-int/2addr v7, v2

    .line 238
    iget v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 239
    .line 240
    sub-int v8, v4, v8

    .line 241
    .line 242
    iget-object v9, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 243
    .line 244
    iget v10, v9, Landroid/graphics/RectF;->left:F

    .line 245
    .line 246
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 247
    .line 248
    invoke-static {v10, v9}, Ljava/lang/Math;->max(FF)F

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    float-to-double v9, v9

    .line 253
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 254
    .line 255
    .line 256
    move-result-wide v9

    .line 257
    double-to-int v9, v9

    .line 258
    add-int/2addr v8, v9

    .line 259
    sub-int/2addr v7, v8

    .line 260
    int-to-float v4, v4

    .line 261
    iget-object v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 262
    .line 263
    iget v9, v8, Landroid/graphics/RectF;->left:F

    .line 264
    .line 265
    add-float/2addr v9, v4

    .line 266
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 267
    .line 268
    add-float/2addr v9, v8

    .line 269
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    int-to-float v8, v8

    .line 274
    add-float/2addr v9, v8

    .line 275
    float-to-double v8, v9

    .line 276
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 277
    .line 278
    .line 279
    move-result-wide v8

    .line 280
    double-to-int v8, v8

    .line 281
    iput v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 282
    .line 283
    if-gez v8, :cond_c

    .line 284
    .line 285
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 286
    .line 287
    :cond_c
    iget-object v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 288
    .line 289
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 290
    .line 291
    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    add-float/2addr v8, v4

    .line 296
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 297
    .line 298
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 299
    .line 300
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    add-float/2addr v4, v8

    .line 305
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    int-to-float v7, v7

    .line 310
    add-float/2addr v4, v7

    .line 311
    int-to-float p1, p1

    .line 312
    cmpl-float p1, v4, p1

    .line 313
    .line 314
    if-lez p1, :cond_d

    .line 315
    .line 316
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 317
    .line 318
    :cond_d
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 319
    .line 320
    if-nez p1, :cond_15

    .line 321
    .line 322
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    sub-int p1, v0, p1

    .line 327
    .line 328
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    sub-int/2addr p1, v4

    .line 333
    int-to-float p1, p1

    .line 334
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 335
    .line 336
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 337
    .line 338
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    sub-float/2addr p1, v4

    .line 343
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 344
    .line 345
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 346
    .line 347
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    sub-float/2addr p1, v4

    .line 352
    float-to-double v7, p1

    .line 353
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 354
    .line 355
    .line 356
    move-result-wide v7

    .line 357
    double-to-int p1, v7

    .line 358
    if-gez p1, :cond_e

    .line 359
    .line 360
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 361
    .line 362
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 363
    .line 364
    goto/16 :goto_8

    .line 365
    .line 366
    :cond_e
    int-to-float v4, p1

    .line 367
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 368
    .line 369
    div-float v7, v4, v7

    .line 370
    .line 371
    float-to-double v7, v7

    .line 372
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 373
    .line 374
    .line 375
    move-result-wide v7

    .line 376
    double-to-int v7, v7

    .line 377
    iput v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 378
    .line 379
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 380
    .line 381
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 382
    .line 383
    add-float/2addr v4, v8

    .line 384
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 385
    .line 386
    add-float/2addr v4, v7

    .line 387
    float-to-double v7, v4

    .line 388
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 389
    .line 390
    .line 391
    move-result-wide v7

    .line 392
    double-to-int v4, v7

    .line 393
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 394
    .line 395
    if-gez v4, :cond_f

    .line 396
    .line 397
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 398
    .line 399
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 400
    .line 401
    goto/16 :goto_8

    .line 402
    .line 403
    :cond_f
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:I

    .line 404
    .line 405
    add-int/2addr v2, v4

    .line 406
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 407
    .line 408
    sub-int/2addr p1, v4

    .line 409
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 410
    .line 411
    iget v7, v4, Landroid/graphics/RectF;->left:F

    .line 412
    .line 413
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 414
    .line 415
    invoke-static {v7, v4}, Ljava/lang/Math;->max(FF)F

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    float-to-double v7, v4

    .line 420
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 421
    .line 422
    .line 423
    move-result-wide v7

    .line 424
    double-to-int v4, v7

    .line 425
    add-int/2addr p1, v4

    .line 426
    sub-int/2addr v2, p1

    .line 427
    if-lez v2, :cond_10

    .line 428
    .line 429
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 430
    .line 431
    sub-int/2addr p1, v2

    .line 432
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 433
    .line 434
    :cond_10
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 435
    .line 436
    if-gez p1, :cond_15

    .line 437
    .line 438
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 439
    .line 440
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 441
    .line 442
    goto/16 :goto_8

    .line 443
    .line 444
    :cond_11
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 445
    .line 446
    if-nez p1, :cond_12

    .line 447
    .line 448
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 457
    .line 458
    mul-float/2addr p1, v3

    .line 459
    float-to-double v7, p1

    .line 460
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 461
    .line 462
    .line 463
    move-result-wide v7

    .line 464
    double-to-int p1, v7

    .line 465
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 466
    .line 467
    :cond_12
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 468
    .line 469
    cmpl-float p1, p1, v1

    .line 470
    .line 471
    if-nez p1, :cond_13

    .line 472
    .line 473
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 474
    .line 475
    :cond_13
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 476
    .line 477
    int-to-float p1, p1

    .line 478
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 479
    .line 480
    mul-float/2addr p1, v4

    .line 481
    float-to-double v7, p1

    .line 482
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 483
    .line 484
    .line 485
    move-result-wide v7

    .line 486
    double-to-int p1, v7

    .line 487
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:I

    .line 488
    .line 489
    add-int/2addr v2, v4

    .line 490
    int-to-float v2, v2

    .line 491
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 492
    .line 493
    sub-int v4, p1, v4

    .line 494
    .line 495
    int-to-float v4, v4

    .line 496
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 497
    .line 498
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 499
    .line 500
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 501
    .line 502
    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    add-float/2addr v7, v4

    .line 507
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:I

    .line 508
    .line 509
    int-to-float v4, v4

    .line 510
    add-float/2addr v7, v4

    .line 511
    sub-float/2addr v2, v7

    .line 512
    float-to-double v7, v2

    .line 513
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 514
    .line 515
    .line 516
    move-result-wide v7

    .line 517
    double-to-int v2, v7

    .line 518
    int-to-float p1, p1

    .line 519
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 520
    .line 521
    iget v7, v4, Landroid/graphics/RectF;->left:F

    .line 522
    .line 523
    add-float/2addr v7, p1

    .line 524
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 525
    .line 526
    add-float/2addr v7, v4

    .line 527
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    int-to-float v4, v4

    .line 532
    add-float/2addr v7, v4

    .line 533
    float-to-double v7, v7

    .line 534
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 535
    .line 536
    .line 537
    move-result-wide v7

    .line 538
    double-to-int v4, v7

    .line 539
    iput v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 540
    .line 541
    if-gez v4, :cond_14

    .line 542
    .line 543
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->l:I

    .line 544
    .line 545
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->n:I

    .line 546
    .line 547
    goto :goto_8

    .line 548
    :cond_14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 549
    .line 550
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 551
    .line 552
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    add-float/2addr v0, p1

    .line 557
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 558
    .line 559
    iget p1, p1, Landroid/graphics/RectF;->right:F

    .line 560
    .line 561
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 562
    .line 563
    .line 564
    move-result p1

    .line 565
    add-float/2addr p1, v0

    .line 566
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    int-to-float v0, v0

    .line 571
    add-float/2addr p1, v0

    .line 572
    float-to-double v7, p1

    .line 573
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 574
    .line 575
    .line 576
    move-result-wide v7

    .line 577
    double-to-int p1, v7

    .line 578
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    add-int/2addr v0, p1

    .line 583
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    add-int/2addr v2, v0

    .line 588
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    :cond_15
    :goto_8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 593
    .line 594
    .line 595
    move-result p1

    .line 596
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 597
    .line 598
    .line 599
    move-result p2

    .line 600
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 601
    .line 602
    if-nez v2, :cond_16

    .line 603
    .line 604
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 605
    .line 606
    if-eqz v2, :cond_16

    .line 607
    .line 608
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

    .line 609
    .line 610
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 615
    .line 616
    :cond_16
    if-ne p2, v5, :cond_1a

    .line 617
    .line 618
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 619
    .line 620
    if-eqz p2, :cond_17

    .line 621
    .line 622
    int-to-float p2, p2

    .line 623
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 624
    .line 625
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 626
    .line 627
    add-float/2addr p2, v3

    .line 628
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 629
    .line 630
    add-float/2addr p2, v2

    .line 631
    float-to-double v2, p2

    .line 632
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 633
    .line 634
    .line 635
    move-result-wide v2

    .line 636
    double-to-int p2, v2

    .line 637
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 638
    .line 639
    int-to-float p2, p2

    .line 640
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:F

    .line 641
    .line 642
    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    .line 643
    .line 644
    .line 645
    move-result p2

    .line 646
    float-to-double v2, p2

    .line 647
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 648
    .line 649
    .line 650
    move-result-wide v2

    .line 651
    double-to-int p2, v2

    .line 652
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 653
    .line 654
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    add-int/2addr v2, p2

    .line 659
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 660
    .line 661
    .line 662
    move-result p2

    .line 663
    add-int/2addr p2, v2

    .line 664
    int-to-float p2, p2

    .line 665
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 666
    .line 667
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 668
    .line 669
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    sub-float/2addr p2, v2

    .line 674
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 675
    .line 676
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 677
    .line 678
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    sub-float/2addr p2, v2

    .line 683
    int-to-float v2, p1

    .line 684
    cmpl-float p2, p2, v2

    .line 685
    .line 686
    if-lez p2, :cond_17

    .line 687
    .line 688
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 689
    .line 690
    :cond_17
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 691
    .line 692
    if-nez p2, :cond_19

    .line 693
    .line 694
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 695
    .line 696
    .line 697
    move-result p2

    .line 698
    sub-int p2, p1, p2

    .line 699
    .line 700
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    sub-int/2addr p2, v2

    .line 705
    int-to-float p2, p2

    .line 706
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 707
    .line 708
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 709
    .line 710
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    add-float/2addr v2, p2

    .line 715
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 716
    .line 717
    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    .line 718
    .line 719
    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    .line 720
    .line 721
    .line 722
    move-result p2

    .line 723
    add-float/2addr p2, v2

    .line 724
    float-to-double v1, p2

    .line 725
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 726
    .line 727
    .line 728
    move-result-wide v1

    .line 729
    double-to-int p2, v1

    .line 730
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 731
    .line 732
    if-gez p2, :cond_18

    .line 733
    .line 734
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 735
    .line 736
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 737
    .line 738
    goto/16 :goto_9

    .line 739
    .line 740
    :cond_18
    int-to-float p2, p2

    .line 741
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 742
    .line 743
    iget v2, v1, Landroid/graphics/RectF;->top:F

    .line 744
    .line 745
    sub-float/2addr p2, v2

    .line 746
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 747
    .line 748
    sub-float/2addr p2, v1

    .line 749
    float-to-double v1, p2

    .line 750
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 751
    .line 752
    .line 753
    move-result-wide v1

    .line 754
    double-to-int p2, v1

    .line 755
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 756
    .line 757
    :cond_19
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 758
    .line 759
    if-gez p2, :cond_1e

    .line 760
    .line 761
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 762
    .line 763
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 764
    .line 765
    goto :goto_9

    .line 766
    :cond_1a
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 767
    .line 768
    if-nez p2, :cond_1b

    .line 769
    .line 770
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 771
    .line 772
    .line 773
    move-result-object p2

    .line 774
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 775
    .line 776
    .line 777
    move-result-object p2

    .line 778
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 779
    .line 780
    mul-float/2addr p2, v3

    .line 781
    float-to-double v1, p2

    .line 782
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 783
    .line 784
    .line 785
    move-result-wide v1

    .line 786
    double-to-int p2, v1

    .line 787
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 788
    .line 789
    :cond_1b
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 790
    .line 791
    int-to-float p2, p2

    .line 792
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 793
    .line 794
    iget v2, v1, Landroid/graphics/RectF;->top:F

    .line 795
    .line 796
    add-float/2addr p2, v2

    .line 797
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 798
    .line 799
    add-float/2addr p2, v1

    .line 800
    float-to-double v1, p2

    .line 801
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 802
    .line 803
    .line 804
    move-result-wide v1

    .line 805
    double-to-int p2, v1

    .line 806
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 807
    .line 808
    if-gez p2, :cond_1c

    .line 809
    .line 810
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 811
    .line 812
    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 813
    .line 814
    goto :goto_9

    .line 815
    :cond_1c
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->U:F

    .line 816
    .line 817
    int-to-float p2, p2

    .line 818
    sub-float/2addr p1, p2

    .line 819
    float-to-double p1, p1

    .line 820
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 821
    .line 822
    .line 823
    move-result-wide p1

    .line 824
    double-to-int p1, p1

    .line 825
    if-lez p1, :cond_1d

    .line 826
    .line 827
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 828
    .line 829
    add-int/2addr p2, p1

    .line 830
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 831
    .line 832
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 833
    .line 834
    add-int/2addr p2, p1

    .line 835
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 836
    .line 837
    :cond_1d
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->m:I

    .line 838
    .line 839
    iget p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->o:I

    .line 840
    .line 841
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 842
    .line 843
    .line 844
    move-result p1

    .line 845
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 846
    .line 847
    .line 848
    move-result p2

    .line 849
    add-int/2addr p2, p1

    .line 850
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    add-int/2addr v1, p2

    .line 855
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 856
    .line 857
    .line 858
    move-result p1

    .line 859
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 860
    .line 861
    .line 862
    move-result p2

    .line 863
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 864
    .line 865
    .line 866
    move-result p1

    .line 867
    :cond_1e
    :goto_9
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 868
    .line 869
    .line 870
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->a:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->b:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->R:Landroid/text/StaticLayout;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->S:Landroid/text/StaticLayout;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

    .line 36
    .line 37
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
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
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->O:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->a:Ljava/lang/CharSequence;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->P:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->b:Ljava/lang/CharSequence;

    .line 17
    .line 18
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
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
    if-eqz v0, :cond_b

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_1

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
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

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
    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:F

    .line 42
    .line 43
    sub-float/2addr v3, v4

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v0, :cond_a

    .line 46
    .line 47
    if-eq v0, v4, :cond_7

    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    if-eq v0, v5, :cond_1

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    if-eq v0, v5, :cond_7

    .line 54
    .line 55
    return v4

    .line 56
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 65
    .line 66
    sub-float v5, p1, v5

    .line 67
    .line 68
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->y:Landroid/graphics/RectF;

    .line 69
    .line 70
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    div-float/2addr v5, v6

    .line 75
    add-float/2addr v5, v0

    .line 76
    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 77
    .line 78
    .line 79
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    .line 80
    .line 81
    if-nez v0, :cond_6

    .line 82
    .line 83
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:I

    .line 88
    .line 89
    int-to-float v5, v5

    .line 90
    const/high16 v6, 0x40000000    # 2.0f

    .line 91
    .line 92
    div-float/2addr v5, v6

    .line 93
    cmpl-float v0, v0, v5

    .line 94
    .line 95
    if-gtz v0, :cond_2

    .line 96
    .line 97
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:I

    .line 102
    .line 103
    int-to-float v5, v5

    .line 104
    div-float/2addr v5, v6

    .line 105
    cmpl-float v0, v0, v5

    .line 106
    .line 107
    if-lez v0, :cond_6

    .line 108
    .line 109
    :cond_2
    const/4 v0, 0x0

    .line 110
    cmpl-float v0, v3, v0

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    cmpl-float v0, v0, v5

    .line 123
    .line 124
    if-lez v0, :cond_3

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    cmpl-float v0, v0, v2

    .line 136
    .line 137
    if-lez v0, :cond_6

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    invoke-interface {v0, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 147
    .line 148
    .line 149
    :cond_5
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    .line 150
    .line 151
    :cond_6
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 152
    .line 153
    return v4

    .line 154
    :cond_7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f0:Z

    .line 155
    .line 156
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 164
    .line 165
    .line 166
    move-result-wide v7

    .line 167
    sub-long/2addr v5, v7

    .line 168
    long-to-float p1, v5

    .line 169
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:I

    .line 174
    .line 175
    int-to-float v2, v2

    .line 176
    cmpg-float v0, v0, v2

    .line 177
    .line 178
    if-gez v0, :cond_8

    .line 179
    .line 180
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->L:I

    .line 185
    .line 186
    int-to-float v2, v2

    .line 187
    cmpg-float v0, v0, v2

    .line 188
    .line 189
    if-gez v0, :cond_8

    .line 190
    .line 191
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->M:I

    .line 192
    .line 193
    int-to-float v0, v0

    .line 194
    cmpg-float p1, p1, v0

    .line 195
    .line 196
    if-gez p1, :cond_8

    .line 197
    .line 198
    invoke-super {p0}, Landroid/widget/CompoundButton;->performClick()Z

    .line 199
    .line 200
    .line 201
    return v4

    .line 202
    :cond_8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getStatusBasedOnPos()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eq p1, v0, :cond_9

    .line 211
    .line 212
    invoke-virtual {p0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    .line 216
    .line 217
    .line 218
    return v4

    .line 219
    :cond_9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a(Z)V

    .line 220
    .line 221
    .line 222
    return v4

    .line 223
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 228
    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->J:F

    .line 234
    .line 235
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->I:F

    .line 236
    .line 237
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->K:F

    .line 238
    .line 239
    invoke-virtual {p0, v4}, Landroid/view/View;->setPressed(Z)V

    .line 240
    .line 241
    .line 242
    return v4

    .line 243
    :cond_b
    :goto_1
    return v1
.end method

.method public setAnimationDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->i:J

    .line 2
    .line 3
    return-void
.end method

.method public setBackColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->b:Landroid/graphics/drawable/Drawable;

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->f:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d0:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->F:Landroid/animation/ObjectAnimator;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->E:Z

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->j:Z

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 5
    .line 6
    return-void
.end method

.method public setTextAdjust(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c0:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->W:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->V:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->a:Landroid/graphics/drawable/Drawable;

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 8
    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 21
    .line 22
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 23
    .line 24
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->g:Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 27
    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public setThumbRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->h:F

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->e0:Z

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
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 2
    .line 3
    invoke-static {p1}, Lv7/d;->j(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->k:I

    .line 10
    .line 11
    invoke-static {p1}, Lv7/d;->i(I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->c:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->D:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->C:Z

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
