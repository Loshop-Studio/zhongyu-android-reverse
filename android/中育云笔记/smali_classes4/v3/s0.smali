.class public final synthetic Lv3/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/friday/main/view/FullScreenPreviewActivity;

.field public final synthetic b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/s0;->a:Lcom/friday/main/view/FullScreenPreviewActivity;

    iput-object p2, p0, Lv3/s0;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/s0;->a:Lcom/friday/main/view/FullScreenPreviewActivity;

    iget-object v1, p0, Lv3/s0;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-static {v0, v1}, Lcom/friday/main/view/FullScreenPreviewActivity;->R(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method
