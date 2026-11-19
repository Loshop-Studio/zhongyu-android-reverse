.class Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canScrollVertically(I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public flingContent(Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {p1, p2}, Landroidx/core/widget/NestedScrollView;->fling(I)V

    return-void
.end method

.method public getVerticalScrollExtent()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method public getVerticalScrollOffset()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollOffset()I

    move-result v0

    return v0
.end method

.method public getVerticalScrollRange()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    move-result v0

    return v0
.end method

.method public isScrollable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public scrollContentToBottom()V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->getVerticalScrollRange()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    return-void
.end method

.method public scrollContentToTop()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    return-void
.end method

.method public stopContentScroll(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->fling(I)V

    return-void
.end method
