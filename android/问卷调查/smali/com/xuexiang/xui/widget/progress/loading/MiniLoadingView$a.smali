.class public Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;->a:Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;->a:Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 1
    iput p1, v0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;->a:Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
