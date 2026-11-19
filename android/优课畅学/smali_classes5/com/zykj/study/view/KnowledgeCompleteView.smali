.class public final Lcom/zykj/study/view/KnowledgeCompleteView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public a:Ljava/util/List;

.field public b:Lx7/l;

.field public c:Lx7/l;

.field public d:I

.field public e:I


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
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->a:Ljava/util/List;

    .line 19
    .line 20
    new-instance p1, Lf5/g;

    .line 21
    .line 22
    invoke-direct {p1}, Lf5/g;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->b:Lx7/l;

    .line 26
    .line 27
    new-instance p1, Lf5/h;

    .line 28
    .line 29
    invoke-direct {p1}, Lf5/h;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->c:Lx7/l;

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    iput p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->e:I

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/view/KnowledgeCompleteView;->f(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/view/KnowledgeCompleteView;->j(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/view/KnowledgeCompleteView;->i(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/view/KnowledgeCompleteView;->g(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->c:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final g(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->b:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final i(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final j(Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final e(Lcom/zykj/study/bean/course/CatalogBean;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/zykj/study/R$layout;->item_knowledge_complete:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, v1, v2, v3}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "inflate(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 23
    .line 24
    new-instance v1, Lf5/i;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lf5/i;-><init>(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->e:I

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    :cond_0
    invoke-virtual {v0, v3}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setIsSelected(Z)V

    .line 45
    .line 46
    .line 47
    iget v1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->d:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setTotalMember(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lf5/j;

    .line 57
    .line 58
    invoke-direct {v2, p0, p1}, Lf5/j;-><init>(Lcom/zykj/study/view/KnowledgeCompleteView;Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/f;->b(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "getRoot(...)"

    .line 69
    .line 70
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object p1
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/KnowledgeCompleteView;->e(Lcom/zykj/study/bean/course/CatalogBean;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final setKnowLedge(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
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
    iget-object v0, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/view/KnowledgeCompleteView;->h()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setKnowLedgeClickListener(Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "knowledgeClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->b:Lx7/l;

    .line 7
    .line 8
    return-void
.end method

.method public final setProgressClickListener(Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "progressClickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->c:Lx7/l;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelectCatalogId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTotalMember(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/view/KnowledgeCompleteView;->d:I

    .line 2
    .line 3
    return-void
.end method
