.class public final Lcom/friday/document/view/share/ShareSearchAdapter$SearchViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/view/share/ShareSearchAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SearchViewHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemShareSearchBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/document/databinding/ItemShareSearchBinding;)V
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
    iput-object p1, p0, Lcom/friday/document/view/share/ShareSearchAdapter$SearchViewHolder;->c:Lcom/friday/document/databinding/ItemShareSearchBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lcom/friday/document/databinding/ItemShareSearchBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareSearchAdapter$SearchViewHolder;->c:Lcom/friday/document/databinding/ItemShareSearchBinding;

    .line 2
    .line 3
    return-object v0
.end method
