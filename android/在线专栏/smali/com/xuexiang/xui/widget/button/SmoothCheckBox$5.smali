.class Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->startUnCheckedAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$402(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$700(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$1000(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$400(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$800(IIF)I

    move-result v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$502(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;I)I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
