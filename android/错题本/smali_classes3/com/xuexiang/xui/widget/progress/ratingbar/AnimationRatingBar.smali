.class public Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;
.super Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;
.source "SourceFile"


# instance fields
.field public r:Landroid/os/Handler;

.field public s:Ljava/lang/Runnable;

.field public final t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Ljava/lang/String;

    .line 3
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Ljava/lang/String;

    .line 6
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->t:Ljava/lang/String;

    .line 9
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->r:Landroid/os/Handler;

    return-void
.end method
