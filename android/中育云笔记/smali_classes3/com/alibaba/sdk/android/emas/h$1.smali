.class Lcom/alibaba/sdk/android/emas/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/emas/h;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/alibaba/sdk/android/emas/h;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/emas/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/h$1;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$1;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/c;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/alibaba/sdk/android/emas/h;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$1;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gt v0, v1, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$1;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/c;->a()Lcom/alibaba/sdk/android/emas/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$1;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;Lcom/alibaba/sdk/android/emas/d;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
