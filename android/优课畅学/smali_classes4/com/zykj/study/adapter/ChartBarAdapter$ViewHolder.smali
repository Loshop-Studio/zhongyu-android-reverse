.class public final Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/ChartBarAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

.field public final synthetic b:Lcom/zykj/study/adapter/ChartBarAdapter;


# direct methods
.method public constructor <init>(Lcom/zykj/study/adapter/ChartBarAdapter;Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->b:Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "getRoot(...)"

    .line 22
    .line 23
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ln4/r;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1}, Ln4/r;-><init>(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v0}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->e(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->c(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 p2, -0x1

    .line 11
    if-eq p0, p2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/study/adapter/ChartBarAdapter;->d(Lcom/zykj/study/adapter/ChartBarAdapter;)Lx7/l;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p0}, Lcom/zykj/study/adapter/ChartBarAdapter;->c(Lcom/zykj/study/adapter/ChartBarAdapter;I)Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "access$getItem(...)"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final e(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->c(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v0, v1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getProgress()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    mul-int/2addr v0, p1

    .line 23
    div-int/lit8 v0, v0, 0x64

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    iget-object p1, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewContent:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_0

    .line 37
    .line 38
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 39
    .line 40
    iget-object p0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 41
    .line 42
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewContent:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->setData(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->isSelected()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->setIsSelected(Ljava/lang/Boolean;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getShowName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget v2, Lcom/zykj/view/R$dimen;->view_41:I

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 64
    .line 65
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    .line 66
    .line 67
    new-instance v1, Ln4/q;

    .line 68
    .line 69
    invoke-direct {v1, p0, p1}, Ln4/q;-><init>(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 78
    .line 79
    .line 80
    return-void
.end method
