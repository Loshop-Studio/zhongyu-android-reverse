.class Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canScrollVertically(I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;I)Z

    move-result p1

    return p1
.end method

.method public flingContent(Landroid/view/View;I)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingScroll(II)V

    return-void
.end method

.method public getVerticalScrollExtent()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->access$100(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I

    move-result v0

    return v0
.end method

.method public getVerticalScrollOffset()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->access$200(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I

    move-result v0

    return v0
.end method

.method public getVerticalScrollRange()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->access$300(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I

    move-result v0

    return v0
.end method

.method public isScrollable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public scrollContentToBottom()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->scrollToBottom()V

    return-void
.end method

.method public scrollContentToTop()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->scrollTo(II)V

    return-void
.end method

.method public stopContentScroll(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingScroll(II)V

    return-void
.end method
