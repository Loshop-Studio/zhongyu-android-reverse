.class public final Lcom/zykj/study/adapter/a;
.super Lu0/a;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Ljava/util/HashSet;

.field public final h:Lcom/zykj/study/adapter/CatalogEditAdapter$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/util/HashSet;Lcom/zykj/study/adapter/CatalogEditAdapter$b;)V
    .locals 1

    .line 1
    const-string v0, "selectModel"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "addIconClickListener"

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
    iput p1, p0, Lcom/zykj/study/adapter/a;->e:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/study/adapter/a;->f:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/study/adapter/a;->g:Ljava/util/HashSet;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/study/adapter/a;->h:Lcom/zykj/study/adapter/CatalogEditAdapter$b;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic u(Lcom/zykj/study/adapter/a;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/a;->x(Lcom/zykj/study/adapter/a;Lr0/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/a;->y(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Lcom/zykj/study/adapter/a;Lr0/b;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/a;->h:Lcom/zykj/study/adapter/CatalogEditAdapter$b;

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

.method public static final y(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;Landroid/view/View;)Lh7/p;
    .locals 8

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lu0/a;->t()Lcom/chad/library/adapter/base/BaseNodeAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v6, 0xe

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v1 .. v7}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->o0(Lcom/chad/library/adapter/base/BaseNodeAdapter;IZZLjava/lang/Object;ILjava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 27
    .line 28
    invoke-virtual {p2}, Lr0/a;->isExpanded()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, Lcom/zykj/study/adapter/a;->g:Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p0, p0, Lcom/zykj/study/adapter/a;->g:Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 62
    .line 63
    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lr0/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/a;->w(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/adapter/a;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/adapter/a;->f:I

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
    .locals 3

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
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/databinding/DataBindingUtil;->getBinding(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/study/databinding/ItemChapterEditBinding;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/zykj/study/bean/SelectModel;

    .line 26
    .line 27
    move-object v2, p2

    .line 28
    check-cast v2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 29
    .line 30
    invoke-virtual {v2}, Lr0/a;->isExpanded()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2, p2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ItemChapterEditBinding;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lcom/zykj/study/databinding/ItemChapterEditBinding;->ivAdd:Landroid/widget/ImageView;

    .line 41
    .line 42
    new-instance v2, Ln4/o;

    .line 43
    .line 44
    invoke-direct {v2, p0, p2}, Ln4/o;-><init>(Lcom/zykj/study/adapter/a;Lr0/b;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "getRoot(...)"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ln4/p;

    .line 60
    .line 61
    invoke-direct {v1, p0, p1, p2}, Ln4/p;-><init>(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
.end method
