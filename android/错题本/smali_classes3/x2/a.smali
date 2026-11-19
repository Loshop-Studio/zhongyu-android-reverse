.class public final Lx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx2/a;->a:I

    iput-object p1, p0, Lx2/a;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const/4 p1, 0x0

    iput p1, p0, Lx2/a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget v0, p0, Lx2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v0, p0, Lx2/a;->b:I

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lx2/a;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 21
    .line 22
    sub-int v0, p1, v0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput p1, p0, Lx2/a;->b:I

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget v0, p0, Lx2/a;->b:I

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lx2/a;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 45
    .line 46
    sub-int v0, p1, v0

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iput p1, p0, Lx2/a;->b:I

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
