.class public final Lnb/f;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;

.field public c:Lhd/l;

.field public final d:Lcom/zykj/view/board/play/SpeedRateAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnb/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "inflate(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lnb/f;->b:Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/view/board/play/SpeedRateAdapter;

    .line 27
    .line 28
    new-instance v1, Lnb/e;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lnb/e;-><init>(Lnb/f;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/SpeedRateAdapter;-><init>(Lhd/l;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lnb/f;->d:Lcom/zykj/view/board/play/SpeedRateAdapter;

    .line 37
    .line 38
    iget-object v1, p0, Lnb/f;->b:Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 59
    .line 60
    .line 61
    sget-object v1, Lnb/c0;->e:Lnb/c0$a;

    .line 62
    .line 63
    invoke-virtual {v1}, Lnb/c0$a;->a()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lnb/f;->b:Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    const/4 v0, -0x2

    .line 80
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 84
    .line 85
    .line 86
    sget v0, Lcom/zykj/view/R$drawable;->view_bg_play_speed_rate_popup:I

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static synthetic a(Lnb/f;Lnb/c0;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnb/f;->c(Lnb/f;Lnb/c0;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lnb/f;Lnb/c0;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lnb/f;->c:Lhd/l;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/view/View;Ljava/lang/String;Lhd/l;)V
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "speedLabel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "clickCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lnb/f;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/zykj/view/R$dimen;->view_17:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    neg-int v0, v0

    .line 29
    iget-object v1, p0, Lnb/f;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget v2, Lcom/zykj/view/R$dimen;->view_154:I

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    neg-int v1, v1

    .line 42
    invoke-virtual {p0, p1, v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 43
    .line 44
    .line 45
    iput-object p3, p0, Lnb/f;->c:Lhd/l;

    .line 46
    .line 47
    iget-object p1, p0, Lnb/f;->d:Lcom/zykj/view/board/play/SpeedRateAdapter;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const-string v0, "getCurrentList(...)"

    .line 54
    .line 55
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast p3, Ljava/lang/Iterable;

    .line 59
    .line 60
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v1, 0xa

    .line 63
    .line 64
    invoke-static {p3, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v2, v1

    .line 86
    check-cast v2, Lnb/c0;

    .line 87
    .line 88
    invoke-virtual {v2}, Lnb/c0;->c()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    const/16 v8, 0xb

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    const-wide/16 v3, 0x0

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    invoke-static/range {v2 .. v9}, Lnb/c0;->b(Lnb/c0;DLjava/lang/String;ZIILjava/lang/Object;)Lnb/c0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
