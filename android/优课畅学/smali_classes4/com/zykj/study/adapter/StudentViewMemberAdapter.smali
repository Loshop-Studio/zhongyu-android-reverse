.class public final Lcom/zykj/study/adapter/StudentViewMemberAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lx7/p;

.field public final b:Lx7/p;

.field public final c:Ljava/util/List;

.field public d:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/p;Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "menuCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "memberClick"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->a:Lx7/p;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->b:Lx7/p;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->d:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->i(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->h(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/study/adapter/StudentViewMemberAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->j(Lcom/zykj/study/adapter/StudentViewMemberAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

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

.method public static final i(Lcom/zykj/study/adapter/StudentViewMemberAdapter;ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->a:Lx7/p;

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/zykj/study/bean/SelectModel;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {v0, p2, p0}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final j(Lcom/zykj/study/adapter/StudentViewMemberAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
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
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->m(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->b:Lx7/p;

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
.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;I)V
    .locals 7

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Lcom/zykj/study/bean/SelectModel;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->d:Landroidx/lifecycle/MutableLiveData;

    .line 16
    .line 17
    new-instance v4, Ln4/q0;

    .line 18
    .line 19
    invoke-direct {v4, p0, p2}, Ln4/q0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberAdapter;I)V

    .line 20
    .line 21
    .line 22
    new-instance v5, Ln4/r0;

    .line 23
    .line 24
    invoke-direct {v5, p0, p2}, Ln4/r0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberAdapter;I)V

    .line 25
    .line 26
    .line 27
    new-instance v6, Ln4/s0;

    .line 28
    .line 29
    invoke-direct {v6, p0}, Ln4/s0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberAdapter;)V

    .line 30
    .line 31
    .line 32
    move-object v1, p1

    .line 33
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;->a(Lcom/zykj/study/bean/SelectModel;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lx7/p;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

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

.method public k(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final l(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->c:Ljava/util/List;

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

.method public final m(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->d:Landroidx/lifecycle/MutableLiveData;

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
    check-cast p1, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->g(Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->k(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
