.class public Lcom/contrarywind/view/WheelView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/contrarywind/view/WheelView$DividerType;,
        Lcom/contrarywind/view/WheelView$ACTION;
    }
.end annotation


# static fields
.field public static final L:[Ljava/lang/String;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:J

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:F

.field public K:Z

.field public a:Lcom/contrarywind/view/WheelView$DividerType;

.field public b:Landroid/content/Context;

.field public c:Landroid/os/Handler;

.field public d:Landroid/view/GestureDetector;

.field public e:Z

.field public f:Z

.field public g:Ljava/util/concurrent/ScheduledExecutorService;

.field public h:Ljava/util/concurrent/ScheduledFuture;

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:F

.field public p:Landroid/graphics/Typeface;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:Z

.field public w:F

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v8, "08"

    .line 2
    .line 3
    const-string v9, "09"

    .line 4
    .line 5
    const-string v0, "00"

    .line 6
    .line 7
    const-string v1, "01"

    .line 8
    .line 9
    const-string v2, "02"

    .line 10
    .line 11
    const-string v3, "03"

    .line 12
    .line 13
    const-string v4, "04"

    .line 14
    .line 15
    const-string v5, "05"

    .line 16
    .line 17
    const-string v6, "06"

    .line 18
    .line 19
    const-string v7, "07"

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/contrarywind/view/WheelView;->L:[Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/contrarywind/view/WheelView;->e:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/contrarywind/view/WheelView;->f:Z

    .line 9
    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/contrarywind/view/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/contrarywind/view/WheelView;->p:Landroid/graphics/Typeface;

    .line 19
    .line 20
    const v1, 0x3fcccccd    # 1.6f

    .line 21
    .line 22
    .line 23
    iput v1, p0, Lcom/contrarywind/view/WheelView;->u:F

    .line 24
    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    iput v1, p0, Lcom/contrarywind/view/WheelView;->z:I

    .line 28
    .line 29
    iput v0, p0, Lcom/contrarywind/view/WheelView;->C:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lcom/contrarywind/view/WheelView;->E:J

    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    iput v1, p0, Lcom/contrarywind/view/WheelView;->G:I

    .line 41
    .line 42
    iput v0, p0, Lcom/contrarywind/view/WheelView;->H:I

    .line 43
    .line 44
    iput v0, p0, Lcom/contrarywind/view/WheelView;->I:I

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/contrarywind/view/WheelView;->K:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget v3, Lcom/contrarywind/view/R$dimen;->pickerview_textsize:I

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iput v2, p0, Lcom/contrarywind/view/WheelView;->m:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 69
    .line 70
    const/high16 v3, 0x3f800000    # 1.0f

    .line 71
    .line 72
    cmpg-float v4, v2, v3

    .line 73
    .line 74
    if-gez v4, :cond_0

    .line 75
    .line 76
    const v2, 0x4019999a    # 2.4f

    .line 77
    .line 78
    .line 79
    iput v2, p0, Lcom/contrarywind/view/WheelView;->J:F

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    cmpg-float v3, v3, v2

    .line 83
    .line 84
    const/high16 v4, 0x40000000    # 2.0f

    .line 85
    .line 86
    if-gtz v3, :cond_1

    .line 87
    .line 88
    cmpg-float v3, v2, v4

    .line 89
    .line 90
    if-gez v3, :cond_1

    .line 91
    .line 92
    const/high16 v2, 0x40800000    # 4.0f

    .line 93
    .line 94
    iput v2, p0, Lcom/contrarywind/view/WheelView;->J:F

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    cmpg-float v3, v4, v2

    .line 98
    .line 99
    const/high16 v4, 0x40400000    # 3.0f

    .line 100
    .line 101
    if-gtz v3, :cond_2

    .line 102
    .line 103
    cmpg-float v3, v2, v4

    .line 104
    .line 105
    if-gez v3, :cond_2

    .line 106
    .line 107
    const/high16 v2, 0x40c00000    # 6.0f

    .line 108
    .line 109
    iput v2, p0, Lcom/contrarywind/view/WheelView;->J:F

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    cmpl-float v3, v2, v4

    .line 113
    .line 114
    if-ltz v3, :cond_3

    .line 115
    .line 116
    const/high16 v3, 0x40200000    # 2.5f

    .line 117
    .line 118
    mul-float/2addr v2, v3

    .line 119
    iput v2, p0, Lcom/contrarywind/view/WheelView;->J:F

    .line 120
    .line 121
    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    .line 122
    .line 123
    sget-object v2, Lcom/contrarywind/view/R$styleable;->pickerview:[I

    .line 124
    .line 125
    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_gravity:I

    .line 130
    .line 131
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iput v0, p0, Lcom/contrarywind/view/WheelView;->G:I

    .line 136
    .line 137
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textColorOut:I

    .line 138
    .line 139
    const v1, -0x575758

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iput v0, p0, Lcom/contrarywind/view/WheelView;->q:I

    .line 147
    .line 148
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textColorCenter:I

    .line 149
    .line 150
    const v1, -0xd5d5d6

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iput v0, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 158
    .line 159
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_dividerColor:I

    .line 160
    .line 161
    const v1, -0x2a2a2b

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, p0, Lcom/contrarywind/view/WheelView;->s:I

    .line 169
    .line 170
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_dividerWidth:I

    .line 171
    .line 172
    const/4 v1, 0x2

    .line 173
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    iput v0, p0, Lcom/contrarywind/view/WheelView;->t:I

    .line 178
    .line 179
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textSize:I

    .line 180
    .line 181
    iget v1, p0, Lcom/contrarywind/view/WheelView;->m:I

    .line 182
    .line 183
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    iput v0, p0, Lcom/contrarywind/view/WheelView;->m:I

    .line 188
    .line 189
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_lineSpacingMultiplier:I

    .line 190
    .line 191
    iget v1, p0, Lcom/contrarywind/view/WheelView;->u:F

    .line 192
    .line 193
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput v0, p0, Lcom/contrarywind/view/WheelView;->u:F

    .line 198
    .line 199
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 200
    .line 201
    .line 202
    :cond_4
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->e()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p1}, Lcom/contrarywind/view/WheelView;->b(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

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
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

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
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->b:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lo1/b;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lo1/b;-><init>(Lcom/contrarywind/view/WheelView;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->c:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v0, Landroid/view/GestureDetector;

    .line 11
    .line 12
    new-instance v1, Ln1/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ln1/a;-><init>(Lcom/contrarywind/view/WheelView;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->d:Landroid/view/GestureDetector;

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
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->v:Z

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/contrarywind/view/WheelView;->w:F

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->c()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 7
    .line 8
    iget v1, p0, Lcom/contrarywind/view/WheelView;->q:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->p:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 27
    .line 28
    iget v2, p0, Lcom/contrarywind/view/WheelView;->m:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 40
    .line 41
    iget v2, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->p:Landroid/graphics/Typeface;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 67
    .line 68
    iget v2, p0, Lcom/contrarywind/view/WheelView;->m:I

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
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 80
    .line 81
    iget v2, p0, Lcom/contrarywind/view/WheelView;->s:I

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

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
    iget-boolean v0, p0, Lcom/contrarywind/view/WheelView;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->u:F

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
    iput v1, p0, Lcom/contrarywind/view/WheelView;->u:F

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
    iput v1, p0, Lcom/contrarywind/view/WheelView;->u:F

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

.method public final g()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getAdapter()Lm1/a;
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
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->c:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->o:F

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
    iget v0, p0, Lcom/contrarywind/view/WheelView;->w:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    new-instance v1, Lo1/a;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lo1/a;-><init>(Lcom/contrarywind/view/WheelView;F)V

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
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 22
    .line 23
    return-void
.end method

.method public i(Lcom/contrarywind/view/WheelView$ACTION;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->b:Lcom/contrarywind/view/WheelView$ACTION;

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->c:Lcom/contrarywind/view/WheelView$ACTION;

    .line 9
    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget p1, p0, Lcom/contrarywind/view/WheelView;->w:F

    .line 13
    .line 14
    iget v0, p0, Lcom/contrarywind/view/WheelView;->o:F

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->C:I

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->C:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    iput p1, p0, Lcom/contrarywind/view/WheelView;->C:I

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v1, Lo1/c;

    .line 43
    .line 44
    iget p1, p0, Lcom/contrarywind/view/WheelView;->C:I

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, Lo1/c;-><init>(Lcom/contrarywind/view/WheelView;I)V

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
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->h:Ljava/util/concurrent/ScheduledFuture;

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->F:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->g()V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/contrarywind/view/WheelView;->B:I

    .line 7
    .line 8
    iget p2, p0, Lcom/contrarywind/view/WheelView;->A:I

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
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->d:Landroid/view/GestureDetector;

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

.method public final setAdapter(Lm1/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setAlphaGradient(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->K:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/contrarywind/view/WheelView;->y:I

    .line 2
    .line 3
    iput p1, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/contrarywind/view/WheelView;->w:F

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
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/contrarywind/view/WheelView;->s:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDividerType(Lcom/contrarywind/view/WheelView$DividerType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->a:Lcom/contrarywind/view/WheelView$DividerType;

    .line 2
    .line 3
    return-void
.end method

.method public setDividerWidth(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/contrarywind/view/WheelView;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/contrarywind/view/WheelView;->G:I

    .line 2
    .line 3
    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemsVisibleCount(I)V
    .locals 1

    .line 1
    rem-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    :cond_0
    add-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    iput p1, p0, Lcom/contrarywind/view/WheelView;->z:I

    .line 10
    .line 11
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->l:Ljava/lang/String;

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->u:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(Ln1/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->q:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->b:Landroid/content/Context;

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->m:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 29
    .line 30
    iget v0, p0, Lcom/contrarywind/view/WheelView;->m:I

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->n:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

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
    iput p1, p0, Lcom/contrarywind/view/WheelView;->w:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->p:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->j:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->p:Landroid/graphics/Typeface;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    return-void
.end method
