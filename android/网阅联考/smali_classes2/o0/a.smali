.class public abstract Lo0/a;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/a$e;,
        Lo0/a$d;
    }
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/ScheduledExecutorService;

.field public b:Landroid/content/Context;

.field public c:Landroid/util/DisplayMetrics;

.field public d:Landroidx/viewpager/widget/ViewPager;

.field public e:Ljava/util/List;

.field public f:I

.field public g:I

.field public h:J

.field public i:J

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Ljava/lang/Class;

.field public n:I

.field public o:I

.field public p:Landroid/widget/LinearLayout;

.field public q:Z

.field public r:Landroid/widget/LinearLayout;

.field public s:Landroid/widget/TextView;

.field public t:Z

.field public u:Z

.field public v:F

.field public w:Landroid/os/Handler;

.field public x:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field public y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo0/a;->e:Ljava/util/List;

    .line 10
    .line 11
    const/16 v0, 0x1c2

    .line 12
    .line 13
    iput v0, p0, Lo0/a;->l:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lo0/a;->t:Z

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lo0/a;->u:Z

    .line 20
    .line 21
    new-instance v0, Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v1, Lo0/a$a;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lo0/a$a;-><init>(Lo0/a;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lo0/a;->w:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v0, Lo0/a$b;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lo0/a$b;-><init>(Lo0/a;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lo0/a;->x:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lo0/a;->k(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static synthetic a(Lo0/a;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lo0/a;->r(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lo0/a;)Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/a;->y:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lo0/a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/a;->s:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lo0/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lo0/a;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lo0/a;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lo0/a;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/a;->w:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lo0/a;)Lo0/a$e;
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
.method public final A()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lo0/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final B()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo0/a;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->getPageAdapterWrapper()Landroidx/viewpager/widget/PagerAdapter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lo0/a;->j()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lo0/a;->j()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {p0}, Lo0/a;->q()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public getContainerScale()F
    .locals 1

    .line 1
    iget v0, p0, Lo0/a;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public getItemHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lo0/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lo0/a;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(FFFF)Lo0/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo0/a;->i(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p2}, Lo0/a;->i(F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p3}, Lo0/a;->i(F)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p0, p4}, Lo0/a;->i(F)I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public i(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public j()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lo0/a;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lo0/a;->k:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lo0/a;->l()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, Lo0/a;->j:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lo0/a;->q()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lo0/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v2, Lo0/a$c;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lo0/a$c;-><init>(Lo0/a;)V

    .line 35
    .line 36
    .line 37
    iget-wide v3, p0, Lo0/a;->h:J

    .line 38
    .line 39
    iget-wide v5, p0, Lo0/a;->i:J

    .line 40
    .line 41
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lo0/a;->k:Z

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "--->goOnScroll()"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lk0/c;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lo0/a;->k:Z

    .line 80
    .line 81
    :goto_0
    return-void
.end method

.method public final k(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lo0/a;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iput-object v3, v0, Lo0/a;->c:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->BaseBanner:[I

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_scale:I

    .line 26
    .line 27
    const/high16 v5, -0x40800000    # -1.0f

    .line 28
    .line 29
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iput v4, v0, Lo0/a;->v:F

    .line 34
    .line 35
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isLoopEnable:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_delay:I

    .line 43
    .line 44
    const/4 v7, 0x5

    .line 45
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    int-to-long v8, v6

    .line 50
    iput-wide v8, v0, Lo0/a;->h:J

    .line 51
    .line 52
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_period:I

    .line 53
    .line 54
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    int-to-long v8, v6

    .line 59
    iput-wide v8, v0, Lo0/a;->i:J

    .line 60
    .line 61
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isAutoScrollEnable:I

    .line 62
    .line 63
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    iput-boolean v6, v0, Lo0/a;->j:Z

    .line 68
    .line 69
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barColor:I

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isBarShowWhenLast:I

    .line 77
    .line 78
    invoke-virtual {v3, v9, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    iput-boolean v9, v0, Lo0/a;->q:Z

    .line 83
    .line 84
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_indicatorGravity:I

    .line 85
    .line 86
    const/16 v10, 0x11

    .line 87
    .line 88
    invoke-virtual {v3, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    sget v11, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingLeft:I

    .line 93
    .line 94
    const/high16 v12, 0x41200000    # 10.0f

    .line 95
    .line 96
    invoke-virtual {v0, v12}, Lo0/a;->i(F)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    int-to-float v13, v13

    .line 101
    invoke-virtual {v3, v11, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    sget v13, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingTop:I

    .line 106
    .line 107
    const/high16 v15, 0x40000000    # 2.0f

    .line 108
    .line 109
    if-ne v9, v10, :cond_0

    .line 110
    .line 111
    const/high16 v14, 0x40c00000    # 6.0f

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    move v14, v15

    .line 115
    :goto_0
    invoke-virtual {v0, v14}, Lo0/a;->i(F)I

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    int-to-float v14, v14

    .line 120
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingRight:I

    .line 125
    .line 126
    invoke-virtual {v0, v12}, Lo0/a;->i(F)I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    int-to-float v12, v12

    .line 131
    invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingBottom:I

    .line 136
    .line 137
    if-ne v9, v10, :cond_1

    .line 138
    .line 139
    const/high16 v15, 0x40c00000    # 6.0f

    .line 140
    .line 141
    :cond_1
    invoke-virtual {v0, v15}, Lo0/a;->i(F)I

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    int-to-float v15, v15

    .line 146
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textColor:I

    .line 151
    .line 152
    const-string v16, "#ffffff"

    .line 153
    .line 154
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textSize:I

    .line 163
    .line 164
    const/high16 v10, 0x41480000    # 12.5f

    .line 165
    .line 166
    invoke-virtual {v0, v10}, Lo0/a;->y(F)F

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isTitleShow:I

    .line 175
    .line 176
    invoke-virtual {v3, v15, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    sget v8, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isIndicatorShow:I

    .line 181
    .line 182
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 187
    .line 188
    .line 189
    const-string v3, "http://schemas.android.com/apk/res/android"

    .line 190
    .line 191
    const-string v5, "layout_height"

    .line 192
    .line 193
    invoke-interface {v2, v3, v5}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    if-eqz v4, :cond_2

    .line 198
    .line 199
    new-instance v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 200
    .line 201
    invoke-direct {v4, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;-><init>(Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_2
    new-instance v4, Landroidx/viewpager/widget/ViewPager;

    .line 206
    .line 207
    invoke-direct {v4, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 208
    .line 209
    .line 210
    :goto_1
    iput-object v4, v0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 211
    .line 212
    const/4 v5, 0x2

    .line 213
    invoke-virtual {v4, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 214
    .line 215
    .line 216
    iget-object v4, v0, Lo0/a;->c:Landroid/util/DisplayMetrics;

    .line 217
    .line 218
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 219
    .line 220
    iput v4, v0, Lo0/a;->n:I

    .line 221
    .line 222
    iget v5, v0, Lo0/a;->v:F

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    cmpg-float v17, v5, v17

    .line 227
    .line 228
    move/from16 v18, v9

    .line 229
    .line 230
    const/4 v9, -0x2

    .line 231
    if-gez v17, :cond_5

    .line 232
    .line 233
    const-string v4, "-1"

    .line 234
    .line 235
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_3

    .line 240
    .line 241
    const/4 v4, -0x1

    .line 242
    iput v4, v0, Lo0/a;->o:I

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_3
    const-string v4, "-2"

    .line 246
    .line 247
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_4

    .line 252
    .line 253
    iput v9, v0, Lo0/a;->o:I

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_4
    const v3, 0x10100f5

    .line 257
    .line 258
    .line 259
    filled-new-array {v3}, [I

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const/4 v3, 0x0

    .line 268
    invoke-virtual {v2, v3, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 273
    .line 274
    .line 275
    iput v4, v0, Lo0/a;->o:I

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 279
    .line 280
    cmpl-float v3, v5, v2

    .line 281
    .line 282
    if-lez v3, :cond_6

    .line 283
    .line 284
    iput v2, v0, Lo0/a;->v:F

    .line 285
    .line 286
    :cond_6
    int-to-float v2, v4

    .line 287
    iget v3, v0, Lo0/a;->v:F

    .line 288
    .line 289
    mul-float/2addr v2, v3

    .line 290
    float-to-int v2, v2

    .line 291
    iput v2, v0, Lo0/a;->o:I

    .line 292
    .line 293
    :goto_2
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 294
    .line 295
    iget v3, v0, Lo0/a;->n:I

    .line 296
    .line 297
    iget v4, v0, Lo0/a;->o:I

    .line 298
    .line 299
    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 300
    .line 301
    .line 302
    iget-object v3, v0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 303
    .line 304
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 305
    .line 306
    .line 307
    new-instance v3, Landroid/widget/RelativeLayout;

    .line 308
    .line 309
    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 313
    .line 314
    .line 315
    new-instance v2, Landroid/widget/LinearLayout;

    .line 316
    .line 317
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    iput-object v2, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 321
    .line 322
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 323
    .line 324
    iget v4, v0, Lo0/a;->n:I

    .line 325
    .line 326
    invoke-direct {v2, v4, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 327
    .line 328
    .line 329
    const/16 v4, 0xc

    .line 330
    .line 331
    const/4 v5, -0x1

    .line 332
    invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 333
    .line 334
    .line 335
    iget-object v4, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 336
    .line 337
    invoke-virtual {v3, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 338
    .line 339
    .line 340
    iget-object v2, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 341
    .line 342
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 343
    .line 344
    .line 345
    iget-object v2, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 346
    .line 347
    float-to-int v3, v11

    .line 348
    float-to-int v4, v13

    .line 349
    float-to-int v5, v12

    .line 350
    float-to-int v6, v14

    .line 351
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 352
    .line 353
    .line 354
    iget-object v2, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 355
    .line 356
    const/4 v3, 0x0

    .line 357
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 358
    .line 359
    .line 360
    iget-object v2, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 361
    .line 362
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 363
    .line 364
    .line 365
    new-instance v2, Landroid/widget/LinearLayout;

    .line 366
    .line 367
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 368
    .line 369
    .line 370
    iput-object v2, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 371
    .line 372
    const/16 v3, 0x11

    .line 373
    .line 374
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 375
    .line 376
    .line 377
    iget-object v2, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 378
    .line 379
    const/4 v3, 0x4

    .line 380
    if-eqz v8, :cond_7

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    goto :goto_3

    .line 384
    :cond_7
    move v4, v3

    .line 385
    :goto_3
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 386
    .line 387
    .line 388
    iget-object v2, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 392
    .line 393
    .line 394
    iget-object v2, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 397
    .line 398
    .line 399
    new-instance v2, Landroid/widget/TextView;

    .line 400
    .line 401
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 402
    .line 403
    .line 404
    iput-object v2, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 405
    .line 406
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 407
    .line 408
    const/high16 v5, 0x3f800000    # 1.0f

    .line 409
    .line 410
    invoke-direct {v1, v4, v9, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 414
    .line 415
    .line 416
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 417
    .line 418
    const/4 v2, 0x1

    .line 419
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 420
    .line 421
    .line 422
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 423
    .line 424
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 425
    .line 426
    .line 427
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 428
    .line 429
    invoke-virtual {v1, v4, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 430
    .line 431
    .line 432
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 433
    .line 434
    if-eqz v15, :cond_8

    .line 435
    .line 436
    const/4 v3, 0x0

    .line 437
    :cond_8
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 438
    .line 439
    .line 440
    move/from16 v1, v18

    .line 441
    .line 442
    const/16 v2, 0x11

    .line 443
    .line 444
    if-ne v1, v2, :cond_9

    .line 445
    .line 446
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 447
    .line 448
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 449
    .line 450
    .line 451
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 452
    .line 453
    iget-object v2, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 454
    .line 455
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    goto :goto_4

    .line 459
    :cond_9
    const/high16 v2, 0x40e00000    # 7.0f

    .line 460
    .line 461
    const/16 v3, 0x10

    .line 462
    .line 463
    const/4 v4, 0x3

    .line 464
    const/4 v5, 0x5

    .line 465
    if-ne v1, v5, :cond_a

    .line 466
    .line 467
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 468
    .line 469
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 470
    .line 471
    .line 472
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 473
    .line 474
    iget-object v3, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 475
    .line 476
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 477
    .line 478
    .line 479
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 480
    .line 481
    iget-object v3, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 482
    .line 483
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 484
    .line 485
    .line 486
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 487
    .line 488
    invoke-virtual {v0, v2}, Lo0/a;->i(F)I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    const/4 v3, 0x0

    .line 493
    invoke-virtual {v1, v3, v3, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 494
    .line 495
    .line 496
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 497
    .line 498
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 499
    .line 500
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 501
    .line 502
    .line 503
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 504
    .line 505
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 506
    .line 507
    .line 508
    goto :goto_4

    .line 509
    :cond_a
    if-ne v1, v4, :cond_b

    .line 510
    .line 511
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 512
    .line 513
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 514
    .line 515
    .line 516
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 517
    .line 518
    iget-object v3, v0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 519
    .line 520
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 521
    .line 522
    .line 523
    iget-object v1, v0, Lo0/a;->p:Landroid/widget/LinearLayout;

    .line 524
    .line 525
    iget-object v3, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 526
    .line 527
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 528
    .line 529
    .line 530
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 531
    .line 532
    invoke-virtual {v0, v2}, Lo0/a;->i(F)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    const/4 v3, 0x0

    .line 537
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 538
    .line 539
    .line 540
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 541
    .line 542
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 543
    .line 544
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 545
    .line 546
    .line 547
    iget-object v1, v0, Lo0/a;->s:Landroid/widget/TextView;

    .line 548
    .line 549
    const/4 v2, 0x5

    .line 550
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 551
    .line 552
    .line 553
    :cond_b
    :goto_4
    return-void
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    .line 4
    .line 5
    return v0
.end method

.method public m()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "ViewPager is not exist!"

    .line 7
    .line 8
    invoke-static {v0}, Lk0/c;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v0, p0, Lo0/a;->e:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-boolean v0, p0, Lo0/a;->u:Z

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lo0/a;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    :cond_2
    move v1, v2

    .line 37
    :cond_3
    return v1

    .line 38
    :cond_4
    :goto_0
    const-string v0, "DataList must be not empty!"

    .line 39
    .line 40
    invoke-static {v0}, Lk0/c;->c(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return v1
.end method

.method public abstract n()Landroid/view/View;
.end method

.method public abstract o(I)Landroid/view/View;
.end method

.method public p(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo0/a;->A()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "--->pauseScroll()"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lk0/c;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lo0/a;->k:Z

    .line 34
    .line 35
    return-void
.end method

.method public final r(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo0/a;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lo0/a;->t:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lo0/a;->B()V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public s(Z)Lo0/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo0/a;->j:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->s:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public t(Z)Lo0/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo0/a;->q:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final u()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const-string v1, "mScroller"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lp0/a;

    .line 19
    .line 20
    iget-object v3, p0, Lo0/a;->b:Landroid/content/Context;

    .line 21
    .line 22
    iget v4, p0, Lo0/a;->l:I

    .line 23
    .line 24
    invoke-direct {v2, v3, v1, v4}, Lp0/a;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
.end method

.method public v(Ljava/util/List;)Lo0/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/a;->e:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lo0/a;->t:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public w(Ljava/lang/Class;)Lo0/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/a;->m:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x()V
    .locals 3

    .line 1
    new-instance v0, Lo0/a$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lo0/a$d;-><init>(Lo0/a;Lo0/a$a;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 13
    .line 14
    iget-object v1, p0, Lo0/a;->e:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    sub-int/2addr v1, v2

    .line 22
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, p0, Lo0/a;->m:Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/viewpager/widget/ViewPager$PageTransformer;

    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lo0/a;->l()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/16 v0, 0x226

    .line 47
    .line 48
    iput v0, p0, Lo0/a;->l:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lo0/a;->u()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Lo0/a;->l()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    const/16 v0, 0x1c2

    .line 61
    .line 62
    iput v0, p0, Lo0/a;->l:I

    .line 63
    .line 64
    invoke-virtual {p0}, Lo0/a;->u()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    :cond_1
    :goto_0
    iget-object v0, p0, Lo0/a;->x:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v1, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, Lo0/a;->d:Landroidx/viewpager/widget/ViewPager;

    .line 82
    .line 83
    iget-object v1, p0, Lo0/a;->x:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final y(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    return p1
.end method

.method public z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo0/a;->e:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lo0/a;->f:I

    .line 12
    .line 13
    iget-object v1, p0, Lo0/a;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lo0/a;->f:I

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lo0/a;->s:Landroid/widget/TextView;

    .line 27
    .line 28
    iget v1, p0, Lo0/a;->f:I

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lo0/a;->p(Landroid/widget/TextView;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lo0/a;->x()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lo0/a;->n()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lo0/a;->r:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Lo0/a;->j()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "Data source is empty,you must setSource() before startScroll()"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method
