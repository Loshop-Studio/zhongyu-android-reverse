.class public final Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;
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
    name = "ViewHolderKnowledge"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/SelectModel;)V
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->getIsTeacher()Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->setIsTeacher(Ljava/lang/Boolean;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final b()Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;

    .line 2
    .line 3
    return-object v0
.end method
