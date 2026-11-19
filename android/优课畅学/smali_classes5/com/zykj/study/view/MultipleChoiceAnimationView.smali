.class public final Lcom/zykj/study/view/MultipleChoiceAnimationView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;


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
    new-instance p1, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->e()V

    .line 4
    .line 5
    .line 6
    return-void
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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->m(Ljava/util/List;)V

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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->k(Lx7/p;)V

    .line 9
    .line 10
    .line 11
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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->n(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->o(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setSelectedIndex(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView;->a:Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->l(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
