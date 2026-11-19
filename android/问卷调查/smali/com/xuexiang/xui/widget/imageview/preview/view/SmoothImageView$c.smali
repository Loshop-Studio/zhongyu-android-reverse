.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;
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
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 1
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast v0, Lb/c/a/e/f/c/e/e;

    invoke-virtual {v0, p1}, Lb/c/a/e/f/c/e/e;->a(I)V

    :cond_0
    return-void
.end method
