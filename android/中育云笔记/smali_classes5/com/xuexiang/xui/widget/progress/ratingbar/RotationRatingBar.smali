.class public Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;
.super Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->u:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->v:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v4, v1

    .line 29
    check-cast v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    float-to-double v1, p1

    .line 42
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    int-to-double v1, v5

    .line 47
    cmpl-double v1, v1, v6

    .line 48
    .line 49
    if-lez v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v2, p0

    .line 56
    move v3, p1

    .line 57
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;->m(FLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;ID)Ljava/lang/Runnable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, v2, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->u:Ljava/lang/Runnable;

    .line 62
    .line 63
    const-wide/16 v4, 0xf

    .line 64
    .line 65
    invoke-virtual {p0, p1, v4, v5}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->l(Ljava/lang/Runnable;J)V

    .line 66
    .line 67
    .line 68
    move p1, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v2, p0

    .line 71
    return-void
.end method

.method public final m(FLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;ID)Ljava/lang/Runnable;
    .locals 7

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$a;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v6, p1

    .line 5
    move-object v5, p2

    .line 6
    move v2, p3

    .line 7
    move-wide v3, p4

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$a;-><init>(Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;IDLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;F)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
