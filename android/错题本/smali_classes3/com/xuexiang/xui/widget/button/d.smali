.class public final Lcom/xuexiang/xui/widget/button/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/button/d;->a:I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/d;->b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/d;->a:I

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
    check-cast p1, Ljava/lang/Float;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/d;->b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    .line 17
    .line 18
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->k:F

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/Float;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/d;->b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    .line 35
    .line 36
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 37
    .line 38
    iget p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->o:I

    .line 39
    .line 40
    iget v1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->r:I

    .line 41
    .line 42
    iget v2, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 43
    .line 44
    invoke-static {v2, p1, v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a(FII)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/Float;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/d;->b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    .line 65
    .line 66
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->k:F

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/lang/Float;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/d;->b:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    .line 83
    .line 84
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 85
    .line 86
    iget p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->p:I

    .line 87
    .line 88
    iget v1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->o:I

    .line 89
    .line 90
    const/high16 v2, 0x3f800000    # 1.0f

    .line 91
    .line 92
    iget v3, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->j:F

    .line 93
    .line 94
    sub-float/2addr v2, v3

    .line 95
    invoke-static {v2, p1, v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->a(FII)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->q:I

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
