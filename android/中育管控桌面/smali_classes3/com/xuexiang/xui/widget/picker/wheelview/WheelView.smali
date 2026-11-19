.class public Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;,
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:F

.field public D:J

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:F

.field public a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public b:Landroid/content/Context;

.field public c:Landroid/os/Handler;

.field public d:Landroid/view/GestureDetector;

.field public e:Z

.field public f:Z

.field public g:Ljava/util/concurrent/ScheduledExecutorService;

.field public h:Ljava/util/concurrent/ScheduledFuture;

.field public i:Landroid/text/TextPaint;

.field public j:Landroid/text/TextPaint;

.field public k:Landroid/graphics/Paint;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:F

.field public p:Landroid/graphics/Typeface;

.field public q:I

.field public r:I

.field public s:I

.field public t:F

.field public u:Z

.field public v:F

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Z

    .line 9
    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:Landroid/graphics/Typeface;

    .line 19
    .line 20
    const v1, 0x3fcccccd    # 1.6f

    .line 21
    .line 22
    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 24
    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:I

    .line 28
    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:J

    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 41
    .line 42
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 43
    .line 44
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget v3, Lcom/xuexiang/xui/R$dimen;->default_wheel_view_text_size:I

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 67
    .line 68
    const/high16 v3, 0x3f800000    # 1.0f

    .line 69
    .line 70
    cmpg-float v4, v2, v3

    .line 71
    .line 72
    if-gez v4, :cond_0

    .line 73
    .line 74
    const v2, 0x4019999a    # 2.4f

    .line 75
    .line 76
    .line 77
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:F

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    cmpg-float v3, v3, v2

    .line 81
    .line 82
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 83
    .line 84
    if-gtz v3, :cond_1

    .line 85
    .line 86
    cmpg-float v3, v2, v4

    .line 87
    .line 88
    if-gez v3, :cond_1

    .line 89
    .line 90
    const v2, 0x40666666    # 3.6f

    .line 91
    .line 92
    .line 93
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:F

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    cmpg-float v3, v4, v2

    .line 97
    .line 98
    const/high16 v4, 0x40000000    # 2.0f

    .line 99
    .line 100
    if-gtz v3, :cond_2

    .line 101
    .line 102
    cmpg-float v3, v2, v4

    .line 103
    .line 104
    if-gez v3, :cond_2

    .line 105
    .line 106
    const/high16 v2, 0x40900000    # 4.5f

    .line 107
    .line 108
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:F

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    cmpg-float v3, v4, v2

    .line 112
    .line 113
    const/high16 v4, 0x40400000    # 3.0f

    .line 114
    .line 115
    if-gtz v3, :cond_3

    .line 116
    .line 117
    cmpg-float v3, v2, v4

    .line 118
    .line 119
    if-gez v3, :cond_3

    .line 120
    .line 121
    const/high16 v2, 0x40c00000    # 6.0f

    .line 122
    .line 123
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:F

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    cmpl-float v3, v2, v4

    .line 127
    .line 128
    if-ltz v3, :cond_4

    .line 129
    .line 130
    const/high16 v3, 0x40200000    # 2.5f

    .line 131
    .line 132
    mul-float/2addr v2, v3

    .line 133
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:F

    .line 134
    .line 135
    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 136
    .line 137
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->WheelView:[I

    .line 138
    .line 139
    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_gravity:I

    .line 144
    .line 145
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 150
    .line 151
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorOut:I

    .line 152
    .line 153
    const v1, -0x575758

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 161
    .line 162
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorCenter:I

    .line 163
    .line 164
    const v1, -0xd5d5d6

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 172
    .line 173
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_dividerColor:I

    .line 174
    .line 175
    const v1, -0x2a2a2b

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 183
    .line 184
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textSize:I

    .line 185
    .line 186
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 187
    .line 188
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 193
    .line 194
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_lineSpacingMultiplier:I

    .line 195
    .line 196
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 197
    .line 198
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 203
    .line 204
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 205
    .line 206
    .line 207
    :cond_5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method private g()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lq2/b;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lq2/b;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v0, Landroid/view/GestureDetector;

    .line 11
    .line 12
    new-instance v1, Lp2/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/view/GestureDetector;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Z

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 27
    .line 28
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 40
    .line 41
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 52
    .line 53
    const v2, 0x3f8ccccd    # 1.1f

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:Landroid/graphics/Typeface;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 67
    .line 68
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 69
    .line 70
    int-to-float v2, v2

    .line 71
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/graphics/Paint;

    .line 80
    .line 81
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    cmpg-float v2, v0, v1

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    .line 13
    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getAdapter()Lo2/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final getCurrentItem()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemsCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getTotalScrollY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    new-instance v1, Lq2/a;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lq2/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v4, 0x5

    .line 12
    .line 13
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    return-void
.end method

.method public i(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 9
    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 13
    .line 14
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:F

    .line 15
    .line 16
    rem-float/2addr p1, v0

    .line 17
    add-float/2addr p1, v0

    .line 18
    rem-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 21
    .line 22
    int-to-float v1, p1

    .line 23
    const/high16 v2, 0x40000000    # 2.0f

    .line 24
    .line 25
    div-float v2, v0, v2

    .line 26
    .line 27
    cmpl-float v1, v1, v2

    .line 28
    .line 29
    if-lez v1, :cond_1

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    sub-float/2addr v0, p1

    .line 33
    float-to-int p1, v0

    .line 34
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v1, Lq2/c;

    .line 43
    .line 44
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:I

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, Lq2/c;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v4, 0xa

    .line 50
    .line 51
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g()V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:I

    .line 7
    .line 8
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:I

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public final setAdapter(Lo2/a;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:I

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g()V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:I

    .line 2
    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 2
    .line 3
    return-void
.end method

.method public setGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 2
    .line 3
    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(Lp2/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTextColorOut(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    mul-float/2addr v0, p1

    .line 19
    float-to-int p1, v0

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 29
    .line 30
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:I

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTotalScrollY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    return-void
.end method
