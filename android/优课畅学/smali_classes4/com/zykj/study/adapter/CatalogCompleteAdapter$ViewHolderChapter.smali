.class public final Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/CatalogCompleteAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolderChapter"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemChapterCompleteBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemChapterCompleteBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->e(Lx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx7/l;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->d(Lx7/l;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V

    return-void
.end method

.method public static final d(Lx7/l;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final e(Lx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public final c(Lx7/l;Lx7/l;Lcom/zykj/study/bean/SelectModel;IZI)V
    .locals 1

    .line 1
    const-string v0, "progressClickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "itemCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "item"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 17
    .line 18
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p4}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->setTotalMember(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p5}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->setIsSelected(Z)V

    .line 25
    .line 26
    .line 27
    new-instance p5, Ln4/g;

    .line 28
    .line 29
    invoke-direct {p5, p1, p3}, Ln4/g;-><init>(Lx7/l;Lcom/zykj/study/bean/SelectModel;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p5}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->setOnArrowClick(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 40
    .line 41
    invoke-virtual {p3}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    if-eqz p3, :cond_0

    .line 46
    .line 47
    iget-object p5, v0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 48
    .line 49
    invoke-virtual {p5, p4}, Lcom/zykj/study/view/KnowledgeCompleteView;->setTotalMember(I)V

    .line 50
    .line 51
    .line 52
    iget-object p4, v0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 53
    .line 54
    invoke-virtual {p4, p6}, Lcom/zykj/study/view/KnowledgeCompleteView;->setSelectCatalogId(I)V

    .line 55
    .line 56
    .line 57
    iget-object p4, v0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 58
    .line 59
    invoke-virtual {p4, p3}, Lcom/zykj/study/view/KnowledgeCompleteView;->setKnowLedge(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    iget-object p3, v0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 63
    .line 64
    invoke-virtual {p3, p1}, Lcom/zykj/study/view/KnowledgeCompleteView;->setProgressClickListener(Lx7/l;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 68
    .line 69
    new-instance p3, Ln4/h;

    .line 70
    .line 71
    invoke-direct {p3, p2}, Ln4/h;-><init>(Lx7/l;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p3}, Lcom/zykj/study/view/KnowledgeCompleteView;->setKnowLedgeClickListener(Lx7/l;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final f()Lcom/zykj/study/databinding/ItemChapterCompleteBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 2
    .line 3
    return-object v0
.end method
