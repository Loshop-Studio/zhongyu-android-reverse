.class Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->doShareAnim()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    return-void
.end method
