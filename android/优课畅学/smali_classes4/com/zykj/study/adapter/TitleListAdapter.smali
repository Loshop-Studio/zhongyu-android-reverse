.class public final Lcom/zykj/study/adapter/TitleListAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/TitleListAdapter$a;,
        Lcom/zykj/study/adapter/TitleListAdapter$DiffCallback;,
        Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;,
        Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lcom/zykj/study/bean/teach/GetQuizDetailBean;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/adapter/TitleListAdapter$a;

.field public static final c:I


# instance fields
.field public final a:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/TitleListAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/TitleListAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/TitleListAdapter;->b:Lcom/zykj/study/adapter/TitleListAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/TitleListAdapter;->c:I

    return-void
.end method

.method public constructor <init>(Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "onclickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/study/adapter/TitleListAdapter$DiffCallback;->a:Lcom/zykj/study/adapter/TitleListAdapter$DiffCallback;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/zykj/study/adapter/TitleListAdapter;->a:Lx7/p;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/TitleListAdapter;->e(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/TitleListAdapter;->f(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/TitleListAdapter;->a:Lx7/p;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p2, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final f(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/TitleListAdapter;->a:Lx7/p;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 11
    .line 12
    instance-of v1, p1, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast p1, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object p2, p2, Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;->tvLinearlayout:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object p2, p2, Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;->tvHead:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getTitle()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;->tvLinearlayout:Landroid/widget/LinearLayout;

    .line 49
    .line 50
    new-instance p2, Ln4/y0;

    .line 51
    .line 52
    invoke-direct {p2, p0, v0}, Ln4/y0;-><init>(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/bean/teach/GetQuizDetailBean;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    instance-of v1, p1, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    check-cast p1, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListBinding;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemTitleListBinding;->tvLinearlayout:Landroid/widget/LinearLayout;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListBinding;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemTitleListBinding;->tvHead:Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getTitle()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;->a()Lcom/zykj/study/databinding/ItemTitleListBinding;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemTitleListBinding;->tvLinearlayout:Landroid/widget/LinearLayout;

    .line 96
    .line 97
    new-instance v1, Ln4/z0;

    .line 98
    .line 99
    invoke-direct {v1, p0, p2, v0}, Ln4/z0;-><init>(Lcom/zykj/study/adapter/TitleListAdapter;ILcom/zykj/study/bean/teach/GetQuizDetailBean;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "inflate(...)"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-static {v0, p1, v2}, Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1}, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;-><init>(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;)V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_0
    invoke-static {v0, p1, v2}, Lcom/zykj/study/databinding/ItemTitleListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemTitleListBinding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;

    .line 40
    .line 41
    invoke-direct {p2, p0, p1}, Lcom/zykj/study/adapter/TitleListAdapter$ItemViewHolder;-><init>(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/databinding/ItemTitleListBinding;)V

    .line 42
    .line 43
    .line 44
    return-object p2
.end method
