.class public final Lx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx2/b;->a:I

    iput-object p1, p0, Lx2/b;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget v0, p0, Lx2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx2/b;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 9
    .line 10
    const-string v2, "animAlpha"

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iput v2, v1, Lx2/e;->e:I

    .line 23
    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 25
    .line 26
    const-string v2, "animScale"

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v1, Lx2/e;->f:F

    .line 39
    .line 40
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 41
    .line 42
    const-string v2, "animLeft"

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Float;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iput v2, v1, Lx2/e;->a:F

    .line 55
    .line 56
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 57
    .line 58
    const-string v2, "animTop"

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Float;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iput v2, v1, Lx2/e;->b:F

    .line 71
    .line 72
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 73
    .line 74
    const-string v2, "animWidth"

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iput v2, v1, Lx2/e;->c:F

    .line 87
    .line 88
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 89
    .line 90
    const-string v2, "animHeight"

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/lang/Float;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, v1, Lx2/e;->d:F

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/Float;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget-object v0, p0, Lx2/b;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_1
    iget-object v0, p0, Lx2/b;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 128
    .line 129
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:Lx2/c;

    .line 130
    .line 131
    if-eqz v0, :cond_0

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    check-cast v0, Lw2/a;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lw2/a;->a(I)V

    .line 146
    .line 147
    .line 148
    :cond_0
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
