.class Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;
.super Lcom/xuexiang/xui/widget/popupwindow/status/SimpleAnimListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->exitAnimation(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

.field final synthetic val$exitView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->val$exitView:Landroid/view/View;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/status/SimpleAnimListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$002(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->val$exitView:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$500(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/view/animation/Animation;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method
