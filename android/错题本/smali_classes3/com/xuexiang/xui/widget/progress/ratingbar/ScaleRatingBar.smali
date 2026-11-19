.class public Lcom/xuexiang/xui/widget/progress/ratingbar/ScaleRatingBar;
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
.method public final a(F)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->s:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    move-object v9, v3

    .line 28
    check-cast v9, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 29
    .line 30
    invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    float-to-double v3, p1

    .line 41
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    int-to-double v3, v6

    .line 46
    cmpl-double v3, v3, v7

    .line 47
    .line 48
    if-lez v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {v9}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v4, Lcom/xuexiang/xui/widget/progress/ratingbar/b;

    .line 55
    .line 56
    const/4 v11, 0x1

    .line 57
    move-object v5, p0

    .line 58
    move v10, p1

    .line 59
    invoke-direct/range {v4 .. v11}, Lcom/xuexiang/xui/widget/progress/ratingbar/b;-><init>(Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;IDLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FI)V

    .line 60
    .line 61
    .line 62
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->s:Ljava/lang/Runnable;

    .line 63
    .line 64
    iget-object p1, v5, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    new-instance p1, Landroid/os/Handler;

    .line 69
    .line 70
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, v5, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    .line 74
    .line 75
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    const-wide/16 v8, 0xf

    .line 80
    .line 81
    add-long/2addr v6, v8

    .line 82
    iget-object p1, v5, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    .line 83
    .line 84
    iget-object v3, v5, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, v4, v3, v6, v7}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 87
    .line 88
    .line 89
    move p1, v10

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-object v5, p0

    .line 92
    return-void
.end method
