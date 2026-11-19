.class public final Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/StudentViewMemberAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/SelectModel;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lx7/p;)V
    .locals 1

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
    const-string v0, "onMenuClickListener"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "memberClick"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;->setOnclick(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p4}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;->setMenuClick(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, v0, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    new-instance p4, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 46
    .line 47
    invoke-direct {p4, p1, p2, p5}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;-><init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Landroidx/lifecycle/MutableLiveData;Lx7/p;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 54
    .line 55
    .line 56
    return-void
.end method
