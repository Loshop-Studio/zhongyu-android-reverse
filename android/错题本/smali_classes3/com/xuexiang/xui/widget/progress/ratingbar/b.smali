.class public final Lcom/xuexiang/xui/widget/progress/ratingbar/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:D

.field public final synthetic d:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

.field public final synthetic e:F

.field public final synthetic f:Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;IDLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FI)V
    .locals 0

    .line 1
    iput p7, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->a:I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->f:Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->b:I

    iput-wide p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->c:D

    iput-object p5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->d:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    iput p6, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->e:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->f:Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/progress/ratingbar/ScaleRatingBar;

    .line 9
    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->b:I

    .line 11
    .line 12
    int-to-double v2, v1

    .line 13
    iget-wide v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->c:D

    .line 14
    .line 15
    cmpl-double v2, v2, v4

    .line 16
    .line 17
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->e:F

    .line 18
    .line 19
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->d:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c(F)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 28
    .line 29
    const/16 v5, 0x2710

    .line 30
    .line 31
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    int-to-float v1, v1

    .line 41
    cmpl-float v1, v1, v3

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget v2, Lcom/xuexiang/xui/R$anim;->srb_scale_up:I

    .line 50
    .line 51
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget v2, Lcom/xuexiang/xui/R$anim;->srb_scale_down:I

    .line 60
    .line 61
    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v4, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :pswitch_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->b:I

    .line 73
    .line 74
    int-to-double v1, v0

    .line 75
    iget-wide v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->c:D

    .line 76
    .line 77
    cmpl-double v1, v1, v3

    .line 78
    .line 79
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->e:F

    .line 80
    .line 81
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->d:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 82
    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c(F)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget-object v1, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 90
    .line 91
    const/16 v4, 0x2710

    .line 92
    .line 93
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 100
    .line 101
    .line 102
    :goto_1
    int-to-float v0, v0

    .line 103
    cmpl-float v0, v0, v2

    .line 104
    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/b;->f:Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;

    .line 108
    .line 109
    check-cast v0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget v1, Lcom/xuexiang/xui/R$anim;->srb_rotation:I

    .line 116
    .line 117
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
