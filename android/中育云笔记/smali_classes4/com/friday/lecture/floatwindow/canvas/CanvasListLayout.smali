.class public final Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public c:Landroidx/viewpager2/widget/ViewPager2;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/String;

.field public f:Z

.field public final g:Lqc/d;


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
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    .line 18
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->e:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p1, Le3/a;

    .line 21
    .line 22
    invoke-direct {p1}, Le3/a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->g:Lqc/d;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic a()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->c()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;

    move-result-object v0

    return-object v0
.end method

.method public static final c()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;
    .locals 2

    .line 1
    sget v0, Lcom/friday/lecture/R$layout;->item_canvas_list:I

    .line 2
    .line 3
    new-instance v1, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method private final getTheAdapter()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->f:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/friday/lecture/R$layout;->simple_canvas:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    sget v0, Lcom/friday/lecture/R$id;->view_pager:I

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "findViewById(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "getContext(...)"

    .line 42
    .line 43
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v1, v3, v5, v4, v2}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;-><init>(Landroid/content/Context;ZILkotlin/jvm/internal/n;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 55
    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    const-string v0, "viewPager"

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v2, v0

    .line 65
    :goto_0
    invoke-virtual {v2, v5}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->getTheAdapter()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->getTheAdapter()Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->d:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->f:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
