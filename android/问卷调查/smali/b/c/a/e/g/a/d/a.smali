.class public final Lb/c/a/e/g/a/d/a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    iput-object p1, p0, Lb/c/a/e/g/a/d/a;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-void
.end method


# virtual methods
.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    iget-object p1, p0, Lb/c/a/e/g/a/d/a;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    iget-object v0, p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lb/c/a/e/g/a/e/a;

    invoke-direct {v1, p1, p4}, Lb/c/a/e/g/a/e/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x5

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    iput-object p2, p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    const/4 p1, 0x1

    return p1
.end method
