.class public final Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/TitleListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "HeaderViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

.field public final synthetic b:Lcom/zykj/study/adapter/TitleListAdapter;


# direct methods
.method public constructor <init>(Lcom/zykj/study/adapter/TitleListAdapter;Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->b:Lcom/zykj/study/adapter/TitleListAdapter;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->a:Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/TitleListAdapter$HeaderViewHolder;->a:Lcom/zykj/study/databinding/ItemTitleListHeaderBinding;

    .line 2
    .line 3
    return-object v0
.end method
