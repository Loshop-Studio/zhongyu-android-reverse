.class Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$002(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
