.class public final Lcom/zykj/study/adapter/b;
.super Lu0/a;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Lcom/zykj/study/adapter/CatalogEditAdapter$b;

.field public final h:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILcom/zykj/study/adapter/CatalogEditAdapter$b;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "addIconClickListener"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "openKnowLedge"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lu0/a;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/study/adapter/b;->e:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/study/adapter/b;->f:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/study/adapter/b;->g:Lcom/zykj/study/adapter/CatalogEditAdapter$b;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/study/adapter/b;->h:Lx7/l;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic u(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/b;->y(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/b;->x(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V

    return-void
.end method

.method public static final x(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/b;->g:Lcom/zykj/study/adapter/CatalogEditAdapter$b;

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 7
    .line 8
    invoke-interface {p0, p2, p1}, Lcom/zykj/study/adapter/CatalogEditAdapter$b;->a(Landroid/view/View;Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final y(Lcom/zykj/study/adapter/b;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/b;->h:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lr0/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/b;->w(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/adapter/b;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/adapter/b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public q(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V
    .locals 0

    .line 1
    const-string p2, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public w(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;)V
    .locals 2

    .line 1
    const-string v0, "helper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 16
    .line 17
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->getBinding(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/study/databinding/ItemKnowledgeEditBinding;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    move-object v0, p2

    .line 26
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/zykj/study/databinding/ItemKnowledgeEditBinding;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->isChild()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Lcom/zykj/study/databinding/ItemKnowledgeEditBinding;->setIsChild(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p1, Lcom/zykj/study/databinding/ItemKnowledgeEditBinding;->ivAdd:Landroid/widget/ImageView;

    .line 39
    .line 40
    new-instance v1, Ln4/c0;

    .line 41
    .line 42
    invoke-direct {v1, p0, p2}, Ln4/c0;-><init>(Lcom/zykj/study/adapter/b;Lr0/b;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Ln4/d0;

    .line 53
    .line 54
    invoke-direct {v0, p0, p2}, Ln4/d0;-><init>(Lcom/zykj/study/adapter/b;Lr0/b;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/f;->b(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method
