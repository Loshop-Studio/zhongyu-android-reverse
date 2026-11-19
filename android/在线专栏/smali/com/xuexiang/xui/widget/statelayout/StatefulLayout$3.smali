.class Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;
.super Lcom/xuexiang/xui/widget/statelayout/SimpleAnimationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

.field final synthetic val$animCounterCopy:I

.field final synthetic val$options:Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;ILcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->val$animCounterCopy:I

    iput-object p3, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->val$options:Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/statelayout/SimpleAnimationListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->val$animCounterCopy:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$000(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)I

    move-result v0

    if-eq p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->val$options:Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$400(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$100(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/widget/LinearLayout;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;->this$0:Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->access$300(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
