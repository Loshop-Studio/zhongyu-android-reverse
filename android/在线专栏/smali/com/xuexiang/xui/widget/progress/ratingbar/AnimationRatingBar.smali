.class public Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;
.super Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;
.source "SourceFile"


# instance fields
.field protected mHandler:Landroid/os/Handler;

.field protected mRunnable:Ljava/lang/Runnable;

.field protected mRunnableToken:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mRunnableToken:Ljava/lang/String;

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->init()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mRunnableToken:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->init()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mRunnableToken:Ljava/lang/String;

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->init()V

    return-void
.end method

.method private init()V
    .locals 1

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method protected postRunnable(Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mHandler:Landroid/os/Handler;

    .line 3
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p2

    .line 4
    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mHandler:Landroid/os/Handler;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/AnimationRatingBar;->mRunnableToken:Ljava/lang/String;

    invoke-virtual {p2, p1, p3, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method
