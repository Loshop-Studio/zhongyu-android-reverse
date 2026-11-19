.class public final Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lx7/p;

.field public final b:Ljava/util/List;

.field public c:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "memberClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->a:Lx7/p;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->c:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->g(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->h(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    xor-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final h(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "superviseGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "superviseGroupMember"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->k(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->a:Lx7/p;

    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->c:Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    new-instance v2, Ln4/u0;

    .line 17
    .line 18
    invoke-direct {v2, p0, p2}, Ln4/u0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;I)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Ln4/v0;

    .line 22
    .line 23
    invoke-direct {p2, p0}, Ln4/v0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;->a(Lcom/zykj/study/bean/SelectModel;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;Lx7/p;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final j(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final k(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->f(Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->i(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
