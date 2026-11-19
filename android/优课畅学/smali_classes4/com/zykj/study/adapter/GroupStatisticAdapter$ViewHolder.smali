.class public final Lcom/zykj/study/adapter/GroupStatisticAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/GroupStatisticAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemGroupStatisticBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemGroupStatisticBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/GroupStatisticAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemGroupStatisticBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(ILcom/zykj/study/bean/exercise/QuestionBean;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "click"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/GroupStatisticAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemGroupStatisticBinding;

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemGroupStatisticBinding;->setIndex(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lcom/zykj/study/databinding/ItemGroupStatisticBinding;->setBean(Lcom/zykj/study/bean/exercise/QuestionBean;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemGroupStatisticBinding;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
