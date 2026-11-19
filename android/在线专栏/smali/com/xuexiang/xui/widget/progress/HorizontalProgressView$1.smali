.class Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->startProgressAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;->this$0:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    const-string v0, "progress"

    .line 1
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;->this$0:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->access$000(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;->this$0:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->access$000(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;->this$0:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    invoke-interface {v0, v1, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;->onHorizontalProgressUpdate(Landroid/view/View;F)V

    :cond_0
    return-void
.end method
