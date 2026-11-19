.class Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onContentScroll(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$700(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Z

    return-void
.end method

.method public onContentScrollToBottom(Landroid/view/View;)V
    .locals 3

    const-string v0, "ELinkageScrollLayout"

    const-string v1, "#onContentScrollToBottom#"

    .line 1
    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I

    move-result v1

    const/16 v2, 0x11

    if-eq v1, v2, :cond_0

    const-string p1, "onContentScrollToBottom, Invalid Fling Orientation"

    .line 3
    invoke-static {v0, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$600(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$200(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v1

    invoke-interface {v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    .line 6
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$300(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    move-result-object p1

    if-nez p1, :cond_3

    return-void

    .line 7
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-eq v1, p1, :cond_4

    return-void

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    move-result p1

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-lez v1, :cond_5

    goto :goto_0

    :cond_5
    neg-float p1, p1

    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onContentScrollToBottom, currVelocity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$500(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V

    :cond_6
    return-void
.end method

.method public onContentScrollToTop(Landroid/view/View;)V
    .locals 3

    const-string v0, "ELinkageScrollLayout"

    const-string v1, "#onContentScrollToTop#"

    .line 1
    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I

    move-result v1

    const/16 v2, 0x12

    if-eq v1, v2, :cond_0

    const-string p1, "onContentScrollToTop, Invalid Fling Orientation"

    .line 3
    invoke-static {v0, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$100(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$200(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v1

    invoke-interface {v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    .line 6
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$300(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    move-result-object p1

    if-nez p1, :cond_3

    return-void

    .line 7
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-eq v1, p1, :cond_4

    return-void

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gez v1, :cond_5

    goto :goto_0

    :cond_5
    neg-float p1, p1

    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onContentScrollToTop, currVelocity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->access$500(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V

    :cond_6
    return-void
.end method
