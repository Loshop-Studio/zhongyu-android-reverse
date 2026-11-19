.class Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;->this$0:Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;->this$0:Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;->this$0:Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method
