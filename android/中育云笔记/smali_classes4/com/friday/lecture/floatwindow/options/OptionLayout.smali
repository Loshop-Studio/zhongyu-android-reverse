.class public final Lcom/friday/lecture/floatwindow/options/OptionLayout;
.super Lcom/friday/lecture/widget/LifecycleFrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public d:Lcom/friday/lecture/databinding/FloatViewBinding;

.field public e:Z

.field public f:F

.field public g:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/friday/lecture/widget/LifecycleFrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->j()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/options/OptionLayout;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->p(Lcom/friday/lecture/floatwindow/options/OptionLayout;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic e(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->o(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->l(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->m(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->k(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->n(Landroid/view/View;)V

    return-void
.end method

.method private final j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->float_view:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 25
    .line 26
    const-string v1, "dataBinding"

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v2

    .line 34
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->d:Landroid/widget/FrameLayout;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v2

    .line 48
    :cond_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->i:Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v2

    .line 61
    :cond_2
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->f:Landroid/widget/ImageView;

    .line 62
    .line 63
    new-instance v3, Lg3/b;

    .line 64
    .line 65
    invoke-direct {v3}, Lg3/b;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v2

    .line 79
    :cond_3
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->g:Landroid/widget/ImageView;

    .line 80
    .line 81
    new-instance v3, Lg3/c;

    .line 82
    .line 83
    invoke-direct {v3, p0}, Lg3/c;-><init>(Lcom/friday/lecture/floatwindow/options/OptionLayout;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v2

    .line 97
    :cond_4
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->c:Landroidx/cardview/widget/CardView;

    .line 98
    .line 99
    new-instance v3, Lg3/d;

    .line 100
    .line 101
    invoke-direct {v3, p0}, Lg3/d;-><init>(Lcom/friday/lecture/floatwindow/options/OptionLayout;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 108
    .line 109
    if-nez v0, :cond_5

    .line 110
    .line 111
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v2

    .line 115
    :cond_5
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->i:Landroid/widget/ImageView;

    .line 116
    .line 117
    new-instance v3, Lg3/e;

    .line 118
    .line 119
    invoke-direct {v3}, Lg3/e;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getOnlineList()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0, v0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->r(I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 139
    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_6
    move-object v2, v0

    .line 147
    :goto_0
    iget-object v0, v2, Lcom/friday/lecture/databinding/FloatViewBinding;->d:Landroid/widget/FrameLayout;

    .line 148
    .line 149
    new-instance v1, Lg3/f;

    .line 150
    .line 151
    invoke-direct {v1}, Lg3/f;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private static final k(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final l(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "dataBinding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/friday/lecture/databinding/FloatViewBinding;->c:Landroidx/cardview/widget/CardView;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, p0

    .line 27
    :goto_0
    iget-object p0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->j:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->o()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final m(Lcom/friday/lecture/floatwindow/options/OptionLayout;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "dataBinding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/friday/lecture/databinding/FloatViewBinding;->c:Landroidx/cardview/widget/CardView;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, p0

    .line 28
    :goto_0
    iget-object p0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->j:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->n()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final n(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final o(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final p(Lcom/friday/lecture/floatwindow/options/OptionLayout;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "dataBinding"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/friday/lecture/databinding/FloatViewBinding;->f:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public c()Landroidx/lifecycle/LifecycleRegistry;
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getTouchDownX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTouchDownY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const-string v0, "CanvasEnable"

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lg3/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lg3/a;-><init>(Lcom/friday/lecture/floatwindow/options/OptionLayout;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v0, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->f:F

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    sub-float/2addr v0, v3

    .line 27
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-float v3, v3

    .line 44
    cmpl-float v0, v0, v3

    .line 45
    .line 46
    if-gez v0, :cond_1

    .line 47
    .line 48
    iget v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->g:F

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    sub-float/2addr v0, p1

    .line 55
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-float v0, v0

    .line 72
    cmpl-float p1, p1, v0

    .line 73
    .line 74
    if-ltz p1, :cond_2

    .line 75
    .line 76
    :cond_1
    move v1, v2

    .line 77
    :cond_2
    iput-boolean v1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->e:Z

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iput-boolean v1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->e:Z

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->f:F

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->g:F

    .line 94
    .line 95
    iput-boolean v1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->e:Z

    .line 96
    .line 97
    :goto_0
    iget-boolean p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->e:Z

    .line 98
    .line 99
    return p1
.end method

.method public final q()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->s(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final r(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "dataBinding"

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    iget-object p1, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->l:Landroid/widget/TextView;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v2, v0

    .line 31
    :cond_2
    iget-object v2, v2, Lcom/friday/lecture/databinding/FloatViewBinding;->l:Landroid/widget/TextView;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move-object v0, v2

    .line 46
    :goto_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->l:Landroid/widget/TextView;

    .line 47
    .line 48
    const/16 v1, 0x63

    .line 49
    .line 50
    if-le p1, v1, :cond_4

    .line 51
    .line 52
    const-string p1, "99"

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final s(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "dataBinding"

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    iget-object p1, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->k:Landroid/widget/TextView;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v2, v0

    .line 31
    :cond_2
    iget-object v2, v2, Lcom/friday/lecture/databinding/FloatViewBinding;->k:Landroid/widget/TextView;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move-object v0, v2

    .line 46
    :goto_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->k:Landroid/widget/TextView;

    .line 47
    .line 48
    const/16 v1, 0x63

    .line 49
    .line 50
    if-le p1, v1, :cond_4

    .line 51
    .line 52
    const-string p1, "99"

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final setAirPlayState(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "dataBinding"

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_0
    iget-object p1, p1, Lcom/friday/lecture/databinding/FloatViewBinding;->d:Landroid/widget/FrameLayout;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/friday/lecture/model/ClassTestHelper;->getOnlineList()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->r(I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, p1

    .line 42
    :goto_0
    iget-object p1, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->e:Landroid/widget/FrameLayout;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :cond_3
    iget-object p1, p1, Lcom/friday/lecture/databinding/FloatViewBinding;->d:Landroid/widget/FrameLayout;

    .line 57
    .line 58
    const/16 v2, 0x8

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 64
    .line 65
    if-nez p1, :cond_4

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v0, p1

    .line 72
    :goto_1
    iget-object p1, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->e:Landroid/widget/FrameLayout;

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final setClassState(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V
    .locals 2

    .line 1
    const-string v0, "classStatus"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->d:Lcom/friday/lecture/databinding/FloatViewBinding;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "dataBinding"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/FloatViewBinding;->h:Landroid/widget/ImageView;

    .line 17
    .line 18
    sget-object v1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->e:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 19
    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    sget-object v1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->f:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 23
    .line 24
    if-ne p1, v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 30
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final setTouchDownX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->f:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTouchDownY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/OptionLayout;->g:F

    .line 2
    .line 3
    return-void
.end method
