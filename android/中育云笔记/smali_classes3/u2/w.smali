.class public final synthetic Lu2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/NewestPreviewFragment;

.field public final synthetic b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/w;->a:Lcom/friday/document/view/NewestPreviewFragment;

    iput-object p2, p0, Lu2/w;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/w;->a:Lcom/friday/document/view/NewestPreviewFragment;

    iget-object v1, p0, Lu2/w;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-static {v0, v1}, Lcom/friday/document/view/NewestPreviewFragment;->A(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method
