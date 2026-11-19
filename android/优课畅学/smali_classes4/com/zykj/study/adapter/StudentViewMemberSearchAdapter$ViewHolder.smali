.class public final Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/SelectModel;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;Lx7/p;)V
    .locals 2

    .line 1
    const-string v0, "item"

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
    const-string v0, "onClickListener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "memberClick"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;->setOnclick(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    iget-object p3, v0, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberSearchBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    new-instance v1, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 38
    .line 39
    invoke-direct {v1, p1, p2, p4}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;-><init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Landroidx/lifecycle/MutableLiveData;Lx7/p;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 46
    .line 47
    .line 48
    return-void
.end method
