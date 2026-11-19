.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;->a:I

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;->a:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    sub-int v0, p1, v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->offsetTopAndBottom(I)V

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;->a:I

    return-void
.end method
