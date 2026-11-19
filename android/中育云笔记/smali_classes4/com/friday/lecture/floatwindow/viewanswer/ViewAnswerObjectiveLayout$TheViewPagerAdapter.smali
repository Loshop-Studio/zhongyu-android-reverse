.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TheViewPagerAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/lecture/R$layout;->item_statistic:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic i(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;->k(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static final k(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p3, v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->d(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p2, 0x1

    .line 54
    invoke-virtual {p1, p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->d(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 58
    .line 59
    .line 60
    const-string p0, "OptionDetail"

    .line 61
    .line 62
    const-class p2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 63
    .line 64
    invoke-static {p0, p2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;->j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;)V
    .locals 5

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Lcom/friday/lecture/R$id;->rv_statistic:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    new-instance v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter$convert$1$1;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter$convert$1$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Iterable;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->b()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-gez v4, :cond_2

    .line 111
    .line 112
    move-object v1, v3

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move-object v0, v1

    .line 115
    :goto_1
    new-instance v1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    :cond_4
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-direct {v1, v2, p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;-><init>(ILjava/util/List;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, Li3/o;

    .line 134
    .line 135
    invoke-direct {p1, v1}, Li3/o;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$StatisticAdapter;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
