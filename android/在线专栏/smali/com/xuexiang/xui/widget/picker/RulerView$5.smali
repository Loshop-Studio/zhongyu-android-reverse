.class Lcom/xuexiang/xui/widget/picker/RulerView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/RulerView;->drawScaleAndNum(Landroid/graphics/Canvas;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/RulerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$5;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView$5;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$002(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$5;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$402(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$5;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
