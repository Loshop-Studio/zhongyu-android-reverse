.class Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;-><init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$002(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
