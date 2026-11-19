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
.field public A:F

.field public B:F

.field public C:F

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:F

.field public M:J

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public R:F

.field public a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public b:Landroid/content/Context;

.field public c:Landroid/os/Handler;

.field public d:Landroid/view/GestureDetector;

.field public e:Lo3/b;

.field public f:Z

.field public g:Z

.field public h:Ljava/util/concurrent/ScheduledExecutorService;

.field public i:Ljava/util/concurrent/ScheduledFuture;

.field public j:Landroid/text/TextPaint;

.field public k:Landroid/text/TextPaint;

.field public l:Landroid/graphics/Paint;

.field public m:Ln3/a;

.field public n:Ljava/lang/String;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:F

.field public t:Landroid/graphics/Typeface;

.field public u:I

.field public v:I

.field public w:I

.field public x:F

.field public y:Z

.field public z:F


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
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 9
    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:Landroid/graphics/Typeface;

    .line 19
    .line 20
    const v1, 0x3fcccccd    # 1.6f

    .line 21
    .line 22
    .line 23
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 24
    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 28
    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:F

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:J

    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    .line 41
    .line 42
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 43
    .line 44
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

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
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

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
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 183
    .line 184
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textSize:I

    .line 185
    .line 186
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 187
    .line 188
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 193
    .line 194
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_lineSpacingMultiplier:I

    .line 195
    .line 196
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 197
    .line 198
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 203
    .line 204
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 205
    .line 206
    .line 207
    :cond_5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)Lo3/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Lo3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method private p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 10
    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    int-to-float v1, v1

    .line 16
    mul-float/2addr v0, v1

    .line 17
    float-to-int v0, v0

    .line 18
    mul-int/lit8 v1, v0, 0x2

    .line 19
    .line 20
    int-to-double v1, v1

    .line 21
    const-wide v3, 0x400921fb54442d18L    # Math.PI

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    div-double/2addr v1, v3

    .line 27
    double-to-int v1, v1

    .line 28
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 29
    .line 30
    int-to-double v0, v0

    .line 31
    div-double/2addr v0, v3

    .line 32
    double-to-int v0, v0

    .line 33
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 34
    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->N:I

    .line 36
    .line 37
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 42
    .line 43
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 44
    .line 45
    int-to-float v1, v0

    .line 46
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 47
    .line 48
    sub-float/2addr v1, v2

    .line 49
    const/high16 v3, 0x40000000    # 2.0f

    .line 50
    .line 51
    div-float/2addr v1, v3

    .line 52
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 53
    .line 54
    int-to-float v0, v0

    .line 55
    add-float/2addr v0, v2

    .line 56
    div-float/2addr v0, v3

    .line 57
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 58
    .line 59
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 60
    .line 61
    int-to-float v1, v1

    .line 62
    sub-float/2addr v2, v1

    .line 63
    div-float/2addr v2, v3

    .line 64
    sub-float/2addr v0, v2

    .line 65
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 66
    .line 67
    sub-float/2addr v0, v1

    .line 68
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    .line 69
    .line 70
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 71
    .line 72
    const/4 v1, -0x1

    .line 73
    if-ne v0, v1, :cond_2

    .line 74
    .line 75
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 80
    .line 81
    invoke-interface {v0}, Ln3/a;->a()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    div-int/lit8 v0, v0, 0x2

    .line 88
    .line 89
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const/4 v0, 0x0

    .line 93
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 94
    .line 95
    :cond_2
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 96
    .line 97
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledFuture;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledFuture;

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "%02d"

    .line 15
    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public final d(I)I
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 4
    .line 5
    invoke-interface {v0}, Ln3/a;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/2addr p1, v0

    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 16
    .line 17
    invoke-interface {v0}, Ln3/a;->a()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    if-le p1, v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 26
    .line 27
    invoke-interface {v0}, Ln3/a;->a()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int/2addr p1, v0

    .line 32
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    :cond_1
    return p1
.end method

.method public e(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-lez v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-array v2, v1, [F

    .line 15
    .line 16
    invoke-virtual {p1, p2, v2}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 17
    .line 18
    .line 19
    move p1, v0

    .line 20
    :goto_0
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    aget p2, v2, v0

    .line 23
    .line 24
    float-to-double v3, p2

    .line 25
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    double-to-int p2, v3

    .line 30
    add-int/2addr p1, p2

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return p1

    .line 35
    :cond_1
    return v0
.end method

.method public final f(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lp3/b;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lp3/b;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v0, Landroid/view/GestureDetector;

    .line 11
    .line 12
    new-instance v1, Lo3/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lo3/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 27
    .line 28
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 40
    .line 41
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:Landroid/graphics/Typeface;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 67
    .line 68
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

    .line 80
    .line 81
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

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

.method public final getAdapter()Ln3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentItem()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 8
    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 12
    .line 13
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ln3/a;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lt v2, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 28
    .line 29
    invoke-interface {v2}, Ln3/a;->a()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v0, v2

    .line 34
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 39
    .line 40
    invoke-interface {v2}, Ln3/a;->a()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/lit8 v2, v2, -0x1

    .line 45
    .line 46
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    return v0

    .line 55
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 56
    .line 57
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 58
    .line 59
    invoke-interface {v2}, Ln3/a;->a()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/lit8 v2, v2, -0x1

    .line 64
    .line 65
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
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
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ln3/a;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getTotalScrollY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 2
    .line 3
    return v0
.end method

.method public h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

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
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

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
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 9
    .line 10
    invoke-interface {v3}, Ln3/a;->a()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 17
    .line 18
    invoke-interface {v3, v2}, Ln3/a;->getItem(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v4, v3, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    .line 40
    .line 41
    if-le v3, v4, :cond_0

    .line 42
    .line 43
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    .line 44
    .line 45
    :cond_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 46
    .line 47
    const-string v4, "\u661f\u671f"

    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    invoke-virtual {v3, v4, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v5

    .line 58
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 64
    .line 65
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 66
    .line 67
    int-to-float v1, v1

    .line 68
    mul-float/2addr v0, v1

    .line 69
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 70
    .line 71
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq p1, v1, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-eq p1, v1, :cond_3

    .line 23
    .line 24
    const/16 v1, 0x11

    .line 25
    .line 26
    if-eq p1, v1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Z

    .line 30
    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 46
    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int/2addr p1, v0

    .line 57
    int-to-double v0, p1

    .line 58
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 59
    .line 60
    mul-double/2addr v0, v2

    .line 61
    double-to-int p1, v0

    .line 62
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sub-int/2addr p1, v0

    .line 72
    int-to-double v0, p1

    .line 73
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 74
    .line 75
    mul-double/2addr v0, v2

    .line 76
    double-to-int p1, v0

    .line 77
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sub-int/2addr p1, v0

    .line 87
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 88
    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 95
    .line 96
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq p1, v1, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-eq p1, v1, :cond_3

    .line 23
    .line 24
    const/16 v1, 0x11

    .line 25
    .line 26
    if-eq p1, v1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Z

    .line 30
    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 46
    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int/2addr p1, v0

    .line 57
    int-to-double v0, p1

    .line 58
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 59
    .line 60
    mul-double/2addr v0, v2

    .line 61
    double-to-int p1, v0

    .line 62
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sub-int/2addr p1, v0

    .line 72
    int-to-double v0, p1

    .line 73
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 74
    .line 75
    mul-double/2addr v0, v2

    .line 76
    double-to-int p1, v0

    .line 77
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sub-int/2addr p1, v0

    .line 87
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 88
    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 95
    .line 96
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Lo3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v1, 0xc8

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 21
    .line 22
    :goto_0
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 23
    .line 24
    if-le v1, v4, :cond_0

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 29
    .line 30
    int-to-float v4, v2

    .line 31
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v1, p1, v3, v4, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 49
    .line 50
    int-to-float v0, v2

    .line 51
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_10

    .line 8
    .line 9
    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 17
    .line 18
    invoke-interface {v2}, Ln3/a;->a()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v8, 0x1

    .line 23
    sub-int/2addr v2, v8

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 29
    .line 30
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 31
    .line 32
    new-array v9, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 35
    .line 36
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 37
    .line 38
    div-float/2addr v2, v3

    .line 39
    float-to-int v2, v2

    .line 40
    :try_start_0
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 41
    .line 42
    invoke-interface {v3}, Ln3/a;->a()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    rem-int/2addr v2, v3

    .line 47
    add-int/2addr v1, v2

    .line 48
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    const-string v1, "WheelView"

    .line 52
    .line 53
    const-string v2, "\u51fa\u9519\u4e86\uff01adapter.getItemsCount() == 0\uff0c\u8054\u52a8\u6570\u636e\u4e0d\u5339\u914d"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lp2/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 63
    .line 64
    if-gez v1, :cond_1

    .line 65
    .line 66
    iput v7, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 67
    .line 68
    :cond_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 69
    .line 70
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 71
    .line 72
    invoke-interface {v2}, Ln3/a;->a()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    sub-int/2addr v2, v8

    .line 77
    if-le v1, v2, :cond_4

    .line 78
    .line 79
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 80
    .line 81
    invoke-interface {v1}, Ln3/a;->a()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    sub-int/2addr v1, v8

    .line 86
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 90
    .line 91
    if-gez v1, :cond_3

    .line 92
    .line 93
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 94
    .line 95
    invoke-interface {v1}, Ln3/a;->a()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 100
    .line 101
    add-int/2addr v1, v2

    .line 102
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 103
    .line 104
    :cond_3
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 105
    .line 106
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 107
    .line 108
    invoke-interface {v2}, Ln3/a;->a()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    sub-int/2addr v2, v8

    .line 113
    if-le v1, v2, :cond_4

    .line 114
    .line 115
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 116
    .line 117
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 118
    .line 119
    invoke-interface {v2}, Ln3/a;->a()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    sub-int/2addr v1, v2

    .line 124
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 125
    .line 126
    :cond_4
    :goto_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 127
    .line 128
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 129
    .line 130
    rem-float v10, v1, v2

    .line 131
    .line 132
    move v1, v7

    .line 133
    :goto_2
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 134
    .line 135
    if-ge v1, v2, :cond_8

    .line 136
    .line 137
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 138
    .line 139
    div-int/lit8 v2, v2, 0x2

    .line 140
    .line 141
    sub-int/2addr v2, v1

    .line 142
    sub-int/2addr v3, v2

    .line 143
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 152
    .line 153
    invoke-interface {v3, v2}, Ln3/a;->getItem(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    aput-object v2, v9, v1

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    const-string v2, ""

    .line 161
    .line 162
    if-gez v3, :cond_6

    .line 163
    .line 164
    aput-object v2, v9, v1

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 168
    .line 169
    invoke-interface {v4}, Ln3/a;->a()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    sub-int/2addr v4, v8

    .line 174
    if-le v3, v4, :cond_7

    .line 175
    .line 176
    aput-object v2, v9, v1

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 180
    .line 181
    invoke-interface {v2, v3}, Ln3/a;->getItem(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    aput-object v2, v9, v1

    .line 186
    .line 187
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 191
    .line 192
    sget-object v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    if-ne v1, v2, :cond_b

    .line 196
    .line 197
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    const/high16 v2, 0x41400000    # 12.0f

    .line 204
    .line 205
    if-eqz v1, :cond_9

    .line 206
    .line 207
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 208
    .line 209
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    .line 210
    .line 211
    sub-int/2addr v1, v3

    .line 212
    int-to-float v1, v1

    .line 213
    const/high16 v3, 0x40000000    # 2.0f

    .line 214
    .line 215
    :goto_4
    div-float/2addr v1, v3

    .line 216
    sub-float/2addr v1, v2

    .line 217
    goto :goto_5

    .line 218
    :cond_9
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 219
    .line 220
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    .line 221
    .line 222
    sub-int/2addr v1, v3

    .line 223
    int-to-float v1, v1

    .line 224
    const/high16 v3, 0x40800000    # 4.0f

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :goto_5
    cmpg-float v2, v1, v11

    .line 228
    .line 229
    if-gtz v2, :cond_a

    .line 230
    .line 231
    const/high16 v1, 0x41200000    # 10.0f

    .line 232
    .line 233
    :cond_a
    move v2, v1

    .line 234
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 235
    .line 236
    int-to-float v1, v1

    .line 237
    sub-float v4, v1, v2

    .line 238
    .line 239
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 240
    .line 241
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

    .line 242
    .line 243
    move v5, v3

    .line 244
    move-object/from16 v1, p1

    .line 245
    .line 246
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 247
    .line 248
    .line 249
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 250
    .line 251
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

    .line 252
    .line 253
    move v5, v3

    .line 254
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_b
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 259
    .line 260
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 261
    .line 262
    int-to-float v4, v1

    .line 263
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

    .line 264
    .line 265
    const/4 v2, 0x0

    .line 266
    move v5, v3

    .line 267
    move-object/from16 v1, p1

    .line 268
    .line 269
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 270
    .line 271
    .line 272
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 273
    .line 274
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 275
    .line 276
    int-to-float v4, v1

    .line 277
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

    .line 278
    .line 279
    move v5, v3

    .line 280
    move-object/from16 v1, p1

    .line 281
    .line 282
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 283
    .line 284
    .line 285
    :goto_6
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-nez v2, :cond_c

    .line 292
    .line 293
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 294
    .line 295
    if-eqz v2, :cond_c

    .line 296
    .line 297
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 298
    .line 299
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 300
    .line 301
    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v0, v3, v4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    sub-int/2addr v2, v3

    .line 308
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 309
    .line 310
    int-to-float v2, v2

    .line 311
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 312
    .line 313
    sub-float/2addr v2, v4

    .line 314
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    .line 315
    .line 316
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 317
    .line 318
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 319
    .line 320
    .line 321
    :cond_c
    move v2, v7

    .line 322
    :goto_7
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 323
    .line 324
    if-ge v2, v3, :cond_16

    .line 325
    .line 326
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 327
    .line 328
    .line 329
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 330
    .line 331
    int-to-float v4, v2

    .line 332
    mul-float/2addr v3, v4

    .line 333
    sub-float/2addr v3, v10

    .line 334
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 335
    .line 336
    int-to-float v4, v4

    .line 337
    div-float/2addr v3, v4

    .line 338
    float-to-double v3, v3

    .line 339
    const-wide v5, 0x400921fb54442d18L    # Math.PI

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    div-double v5, v3, v5

    .line 345
    .line 346
    const-wide v12, 0x4066800000000000L    # 180.0

    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    mul-double/2addr v5, v12

    .line 352
    const-wide v12, 0x4056800000000000L    # 90.0

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    sub-double/2addr v12, v5

    .line 358
    double-to-float v5, v12

    .line 359
    const/high16 v6, 0x42b40000    # 90.0f

    .line 360
    .line 361
    cmpl-float v12, v5, v6

    .line 362
    .line 363
    if-gez v12, :cond_d

    .line 364
    .line 365
    const/high16 v12, -0x3d4c0000    # -90.0f

    .line 366
    .line 367
    cmpg-float v12, v5, v12

    .line 368
    .line 369
    if-gtz v12, :cond_e

    .line 370
    .line 371
    :cond_d
    move v14, v7

    .line 372
    move/from16 v16, v11

    .line 373
    .line 374
    goto/16 :goto_e

    .line 375
    .line 376
    :cond_e
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    div-float/2addr v12, v6

    .line 381
    float-to-double v12, v12

    .line 382
    const-wide v14, 0x400199999999999aL    # 2.2

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 388
    .line 389
    .line 390
    move-result-wide v12

    .line 391
    double-to-float v6, v12

    .line 392
    iget-boolean v12, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    .line 393
    .line 394
    if-nez v12, :cond_f

    .line 395
    .line 396
    iget-object v12, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 397
    .line 398
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-nez v12, :cond_f

    .line 403
    .line 404
    aget-object v12, v9, v2

    .line 405
    .line 406
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v12

    .line 410
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    if-nez v12, :cond_f

    .line 415
    .line 416
    new-instance v12, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 419
    .line 420
    .line 421
    aget-object v13, v9, v2

    .line 422
    .line 423
    invoke-virtual {v0, v13}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v13

    .line 427
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    iget-object v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    goto :goto_8

    .line 440
    :cond_f
    aget-object v12, v9, v2

    .line 441
    .line 442
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    :goto_8
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 456
    .line 457
    int-to-double v13, v13

    .line 458
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 459
    .line 460
    .line 461
    move-result-wide v15

    .line 462
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 463
    .line 464
    int-to-double v7, v8

    .line 465
    mul-double/2addr v15, v7

    .line 466
    sub-double/2addr v13, v15

    .line 467
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 468
    .line 469
    .line 470
    move-result-wide v7

    .line 471
    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 472
    .line 473
    move-object/from16 v17, v12

    .line 474
    .line 475
    int-to-double v11, v15

    .line 476
    mul-double/2addr v7, v11

    .line 477
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 478
    .line 479
    div-double/2addr v7, v11

    .line 480
    sub-double/2addr v13, v7

    .line 481
    double-to-float v7, v13

    .line 482
    const/4 v8, 0x0

    .line 483
    invoke-virtual {v1, v8, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 484
    .line 485
    .line 486
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 487
    .line 488
    cmpg-float v11, v7, v8

    .line 489
    .line 490
    const v12, 0x3f4ccccd    # 0.8f

    .line 491
    .line 492
    .line 493
    const/high16 v13, 0x3f800000    # 1.0f

    .line 494
    .line 495
    if-gtz v11, :cond_10

    .line 496
    .line 497
    iget v11, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 498
    .line 499
    int-to-float v11, v11

    .line 500
    add-float/2addr v11, v7

    .line 501
    cmpl-float v11, v11, v8

    .line 502
    .line 503
    if-ltz v11, :cond_10

    .line 504
    .line 505
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 506
    .line 507
    .line 508
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 509
    .line 510
    int-to-float v5, v5

    .line 511
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 512
    .line 513
    sub-float/2addr v6, v7

    .line 514
    const/4 v8, 0x0

    .line 515
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 516
    .line 517
    .line 518
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 519
    .line 520
    .line 521
    move-result-wide v5

    .line 522
    double-to-float v5, v5

    .line 523
    mul-float/2addr v5, v12

    .line 524
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 525
    .line 526
    .line 527
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 528
    .line 529
    int-to-float v5, v5

    .line 530
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 531
    .line 532
    int-to-float v6, v6

    .line 533
    iget-object v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 534
    .line 535
    move-object/from16 v11, v17

    .line 536
    .line 537
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 544
    .line 545
    .line 546
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:F

    .line 547
    .line 548
    sub-float/2addr v5, v7

    .line 549
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 550
    .line 551
    int-to-float v6, v6

    .line 552
    iget v7, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 553
    .line 554
    float-to-int v7, v7

    .line 555
    int-to-float v7, v7

    .line 556
    const/4 v8, 0x0

    .line 557
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 558
    .line 559
    .line 560
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 561
    .line 562
    .line 563
    move-result-wide v3

    .line 564
    double-to-float v3, v3

    .line 565
    mul-float/2addr v3, v13

    .line 566
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 567
    .line 568
    .line 569
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 570
    .line 571
    int-to-float v3, v3

    .line 572
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 573
    .line 574
    int-to-float v4, v4

    .line 575
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 576
    .line 577
    sub-float/2addr v4, v5

    .line 578
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 579
    .line 580
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 584
    .line 585
    .line 586
    :goto_9
    const/4 v14, 0x0

    .line 587
    const/16 v16, 0x0

    .line 588
    .line 589
    goto/16 :goto_d

    .line 590
    .line 591
    :cond_10
    move-object/from16 v11, v17

    .line 592
    .line 593
    iget v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 594
    .line 595
    cmpg-float v15, v7, v14

    .line 596
    .line 597
    if-gtz v15, :cond_11

    .line 598
    .line 599
    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 600
    .line 601
    int-to-float v15, v15

    .line 602
    add-float/2addr v15, v7

    .line 603
    cmpl-float v15, v15, v14

    .line 604
    .line 605
    if-ltz v15, :cond_11

    .line 606
    .line 607
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 608
    .line 609
    .line 610
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 611
    .line 612
    int-to-float v5, v5

    .line 613
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 614
    .line 615
    sub-float/2addr v6, v7

    .line 616
    const/4 v8, 0x0

    .line 617
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 618
    .line 619
    .line 620
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 621
    .line 622
    .line 623
    move-result-wide v5

    .line 624
    double-to-float v5, v5

    .line 625
    mul-float/2addr v5, v13

    .line 626
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 627
    .line 628
    .line 629
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 630
    .line 631
    int-to-float v5, v5

    .line 632
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 633
    .line 634
    int-to-float v6, v6

    .line 635
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 636
    .line 637
    sub-float/2addr v6, v8

    .line 638
    iget-object v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 639
    .line 640
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 647
    .line 648
    .line 649
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    .line 650
    .line 651
    sub-float/2addr v5, v7

    .line 652
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 653
    .line 654
    int-to-float v6, v6

    .line 655
    iget v7, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 656
    .line 657
    float-to-int v7, v7

    .line 658
    int-to-float v7, v7

    .line 659
    const/4 v8, 0x0

    .line 660
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 661
    .line 662
    .line 663
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 664
    .line 665
    .line 666
    move-result-wide v3

    .line 667
    double-to-float v3, v3

    .line 668
    mul-float/2addr v3, v12

    .line 669
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 670
    .line 671
    .line 672
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 673
    .line 674
    int-to-float v3, v3

    .line 675
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 676
    .line 677
    int-to-float v4, v4

    .line 678
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 679
    .line 680
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 684
    .line 685
    .line 686
    goto :goto_9

    .line 687
    :cond_11
    cmpl-float v8, v7, v8

    .line 688
    .line 689
    if-ltz v8, :cond_12

    .line 690
    .line 691
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 692
    .line 693
    int-to-float v15, v8

    .line 694
    add-float/2addr v15, v7

    .line 695
    cmpg-float v7, v15, v14

    .line 696
    .line 697
    if-gtz v7, :cond_12

    .line 698
    .line 699
    int-to-float v3, v8

    .line 700
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:F

    .line 701
    .line 702
    sub-float/2addr v3, v4

    .line 703
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    .line 704
    .line 705
    int-to-float v4, v4

    .line 706
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 707
    .line 708
    invoke-virtual {v1, v11, v4, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 709
    .line 710
    .line 711
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    .line 712
    .line 713
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 714
    .line 715
    div-int/lit8 v4, v4, 0x2

    .line 716
    .line 717
    sub-int/2addr v4, v2

    .line 718
    sub-int/2addr v3, v4

    .line 719
    iput v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 720
    .line 721
    goto/16 :goto_9

    .line 722
    .line 723
    :cond_12
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 724
    .line 725
    .line 726
    iget v7, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 727
    .line 728
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 729
    .line 730
    float-to-int v8, v8

    .line 731
    const/4 v14, 0x0

    .line 732
    invoke-virtual {v1, v14, v14, v7, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 733
    .line 734
    .line 735
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 736
    .line 737
    .line 738
    move-result-wide v3

    .line 739
    double-to-float v3, v3

    .line 740
    mul-float/2addr v3, v12

    .line 741
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 742
    .line 743
    .line 744
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 745
    .line 746
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 747
    .line 748
    const/4 v7, -0x1

    .line 749
    if-nez v4, :cond_13

    .line 750
    .line 751
    move v4, v14

    .line 752
    :goto_a
    const/16 v16, 0x0

    .line 753
    .line 754
    goto :goto_b

    .line 755
    :cond_13
    if-lez v4, :cond_14

    .line 756
    .line 757
    const/4 v4, 0x1

    .line 758
    goto :goto_a

    .line 759
    :cond_14
    move v4, v7

    .line 760
    goto :goto_a

    .line 761
    :goto_b
    cmpl-float v5, v5, v16

    .line 762
    .line 763
    if-lez v5, :cond_15

    .line 764
    .line 765
    goto :goto_c

    .line 766
    :cond_15
    const/4 v7, 0x1

    .line 767
    :goto_c
    mul-int/2addr v4, v7

    .line 768
    int-to-float v4, v4

    .line 769
    const/high16 v5, 0x3f000000    # 0.5f

    .line 770
    .line 771
    mul-float/2addr v4, v5

    .line 772
    mul-float/2addr v4, v6

    .line 773
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 774
    .line 775
    .line 776
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 777
    .line 778
    sub-float/2addr v13, v6

    .line 779
    const/high16 v4, 0x437f0000    # 255.0f

    .line 780
    .line 781
    mul-float/2addr v13, v4

    .line 782
    float-to-int v4, v13

    .line 783
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 784
    .line 785
    .line 786
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 787
    .line 788
    int-to-float v3, v3

    .line 789
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 790
    .line 791
    int-to-float v4, v4

    .line 792
    mul-float/2addr v4, v6

    .line 793
    add-float/2addr v3, v4

    .line 794
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    .line 795
    .line 796
    int-to-float v4, v4

    .line 797
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 798
    .line 799
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 803
    .line 804
    .line 805
    :goto_d
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 806
    .line 807
    .line 808
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 809
    .line 810
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 811
    .line 812
    int-to-float v4, v4

    .line 813
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 814
    .line 815
    .line 816
    goto :goto_f

    .line 817
    :goto_e
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 818
    .line 819
    .line 820
    :goto_f
    add-int/lit8 v2, v2, 0x1

    .line 821
    .line 822
    move v7, v14

    .line 823
    move/from16 v11, v16

    .line 824
    .line 825
    const/4 v8, 0x1

    .line 826
    goto/16 :goto_7

    .line 827
    .line 828
    :cond_16
    :goto_10
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->N:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p()V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    .line 7
    .line 8
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 8
    .line 9
    neg-int v1, v1

    .line 10
    int-to-float v1, v1

    .line 11
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 12
    .line 13
    mul-float/2addr v1, v2

    .line 14
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 15
    .line 16
    invoke-interface {v2}, Ln3/a;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 23
    .line 24
    sub-int/2addr v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 27
    .line 28
    mul-float/2addr v2, v4

    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-eq v4, v5, :cond_1

    .line 37
    .line 38
    if-nez v0, :cond_5

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 45
    .line 46
    int-to-float v2, v1

    .line 47
    sub-float/2addr v2, v0

    .line 48
    int-to-float v0, v1

    .line 49
    div-float/2addr v2, v0

    .line 50
    float-to-double v0, v2

    .line 51
    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    .line 56
    .line 57
    int-to-double v6, v2

    .line 58
    mul-double/2addr v0, v6

    .line 59
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 60
    .line 61
    const/high16 v4, 0x40000000    # 2.0f

    .line 62
    .line 63
    div-float v4, v2, v4

    .line 64
    .line 65
    float-to-double v6, v4

    .line 66
    add-double/2addr v0, v6

    .line 67
    float-to-double v6, v2

    .line 68
    div-double/2addr v0, v6

    .line 69
    double-to-int v0, v0

    .line 70
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 71
    .line 72
    rem-float/2addr v1, v2

    .line 73
    add-float/2addr v1, v2

    .line 74
    rem-float/2addr v1, v2

    .line 75
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    .line 76
    .line 77
    div-int/2addr v4, v5

    .line 78
    sub-int/2addr v0, v4

    .line 79
    int-to-float v0, v0

    .line 80
    mul-float/2addr v0, v2

    .line 81
    sub-float/2addr v0, v1

    .line 82
    float-to-int v0, v0

    .line 83
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iget-wide v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:J

    .line 90
    .line 91
    sub-long/2addr v0, v4

    .line 92
    const-wide/16 v4, 0x78

    .line 93
    .line 94
    cmp-long v0, v0, v4

    .line 95
    .line 96
    if-lez v0, :cond_0

    .line 97
    .line 98
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:F

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    sub-float/2addr v0, v4

    .line 117
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:F

    .line 122
    .line 123
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 124
    .line 125
    add-float/2addr v4, v0

    .line 126
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 127
    .line 128
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 129
    .line 130
    if-nez v5, :cond_5

    .line 131
    .line 132
    iget v5, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

    .line 133
    .line 134
    const/high16 v6, 0x3e800000    # 0.25f

    .line 135
    .line 136
    mul-float v7, v5, v6

    .line 137
    .line 138
    sub-float v7, v4, v7

    .line 139
    .line 140
    cmpg-float v1, v7, v1

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    if-gez v1, :cond_2

    .line 144
    .line 145
    cmpg-float v1, v0, v7

    .line 146
    .line 147
    if-ltz v1, :cond_3

    .line 148
    .line 149
    :cond_2
    mul-float/2addr v5, v6

    .line 150
    add-float/2addr v5, v4

    .line 151
    cmpl-float v1, v5, v2

    .line 152
    .line 153
    if-lez v1, :cond_5

    .line 154
    .line 155
    cmpl-float v1, v0, v7

    .line 156
    .line 157
    if-lez v1, :cond_5

    .line 158
    .line 159
    :cond_3
    sub-float/2addr v4, v0

    .line 160
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:J

    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:F

    .line 177
    .line 178
    :cond_5
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_6

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 185
    .line 186
    .line 187
    :cond_6
    :goto_1
    return v3
.end method

.method public final q(F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    new-instance v1, Lp3/a;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lp3/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    return-void
.end method

.method public r(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b()V

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
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 13
    .line 14
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v1, Lp3/c;

    .line 43
    .line 44
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, Lp3/c;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    return-void
.end method

.method public final setAdapter(Ln3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Ln3/a;

    .line 2
    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    .line 4
    .line 5
    if-gtz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p()V

    .line 11
    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 2
    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/graphics/Paint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    .line 2
    .line 3
    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Ljava/lang/String;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(Lo3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Lo3/b;

    .line 2
    .line 3
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:I

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 29
    .line 30
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:I

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    return-void
.end method
