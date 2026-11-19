.class public final Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;
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
    name = "ViewHolderKnowledge"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View$OnClickListener;Lcom/zykj/study/bean/SelectModel;IZ)V
    .locals 1

    .line 1
    const-string v0, "onProgressClick"

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
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setTotalMember(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p4}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->setIsSelected(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final b()Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;->a:Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 2
    .line 3
    return-object v0
.end method
