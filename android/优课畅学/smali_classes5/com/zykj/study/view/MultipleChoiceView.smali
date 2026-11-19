.class public final Lcom/zykj/study/view/MultipleChoiceView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;,
        Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->h()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final setAnswerList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "answer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->n(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setItemClickListener(Lx7/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "clickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->l(Lx7/p;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setJudgingStatus(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->m(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOptionList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->o(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setRightOptionList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "answer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView;->a:Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->p(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
