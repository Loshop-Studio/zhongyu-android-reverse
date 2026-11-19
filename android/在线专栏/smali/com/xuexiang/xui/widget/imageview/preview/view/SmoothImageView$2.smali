.class Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->moveToOldPosition()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field startValue:I

.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;->startValue:I

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;->startValue:I

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    sub-int v0, p1, v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->offsetLeftAndRight(I)V

    .line 4
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$2;->startValue:I

    return-void
.end method
