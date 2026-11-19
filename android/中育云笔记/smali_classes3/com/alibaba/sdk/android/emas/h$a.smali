.class Lcom/alibaba/sdk/android/emas/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RejectedExecutionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/sdk/android/emas/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/alibaba/sdk/android/emas/h$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/alibaba/sdk/android/emas/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    instance-of p2, p1, Lcom/alibaba/sdk/android/emas/h$b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/alibaba/sdk/android/emas/h$b;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/h$b;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
