.class public final Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/teach/SuperviseGroupMember;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;)V
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
    const-string v0, "onclick"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;->setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;->setOnclick(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {v0, p2}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;->setIsSelected(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p2, v0, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;->progressBar2:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getProgress()Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 53
    .line 54
    .line 55
    return-void
.end method
