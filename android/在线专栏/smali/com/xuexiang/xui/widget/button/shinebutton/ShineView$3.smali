.class Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
