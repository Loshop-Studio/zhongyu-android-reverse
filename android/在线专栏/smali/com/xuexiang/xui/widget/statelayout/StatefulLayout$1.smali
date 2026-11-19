.class Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;
.super Lcom/xuexiang/xui/widget/statelayout/SimpleAnimationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showContent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

.field final synthetic val$animCounterCopy:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->val$animCounterCopy:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/statelayout/SimpleAnimationListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$000(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->val$animCounterCopy:I

    if-eq p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$100(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$200(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$200(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$300(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
