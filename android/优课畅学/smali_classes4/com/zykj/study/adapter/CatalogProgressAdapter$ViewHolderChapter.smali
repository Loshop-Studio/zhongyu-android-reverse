.class public final Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/CatalogProgressAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolderChapter"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemChapterProgressBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemChapterProgressBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(ZLx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->c(ZLx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ZLx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "catalog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->getLocked()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 15
    .line 16
    const-string p1, "\u5185\u5bb9\u5c1a\u672a\u5f00\u653e"

    .line 17
    .line 18
    invoke-static {p0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-interface {p1, p2}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 28
    .line 29
    return-object p0
.end method


# virtual methods
.method public final b(ZLcom/zykj/study/bean/SelectModel;Lx7/l;)V
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "openKnowLedge"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    iget-object v1, v0, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->knowView:Lcom/zykj/study/view/KnowledgeProgressView;

    .line 29
    .line 30
    invoke-virtual {v1, p1, p2}, Lcom/zykj/study/view/KnowledgeProgressView;->g(ZLjava/util/List;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, v0, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->knowView:Lcom/zykj/study/view/KnowledgeProgressView;

    .line 34
    .line 35
    new-instance v1, Ln4/m;

    .line 36
    .line 37
    invoke-direct {v1, p1, p3}, Ln4/m;-><init>(ZLx7/l;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v1}, Lcom/zykj/study/view/KnowledgeProgressView;->setKnowLedgeClickListener(Lx7/l;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final d()Lcom/zykj/study/databinding/ItemChapterProgressBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->a:Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 2
    .line 3
    return-object v0
.end method
