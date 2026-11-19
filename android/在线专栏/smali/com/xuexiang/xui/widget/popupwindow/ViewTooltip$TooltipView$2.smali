.class Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->startExitAnimation(Landroid/animation/Animator$AnimatorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

.field final synthetic val$animatorListener:Landroid/animation/Animator$AnimatorListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/animation/Animator$AnimatorListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->val$animatorListener:Landroid/animation/Animator$AnimatorListener;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->val$animatorListener:Landroid/animation/Animator$AnimatorListener;

    invoke-interface {v0, p1}, Landroid/animation/Animator$AnimatorListener;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->access$700(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->access$700(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;->onHide(Landroid/view/View;)V

    :cond_0
    return-void
.end method
