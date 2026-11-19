.class public Lcom/alibaba/sdk/android/emas/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/emas/Cache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/alibaba/sdk/android/emas/Cache<",
        "Lcom/alibaba/sdk/android/emas/e;",
        ">;"
    }
.end annotation


# instance fields
.field private a:I

.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private mSendManager:Lcom/alibaba/sdk/android/emas/h;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/emas/h;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/alibaba/sdk/android/emas/a;->a:I

    .line 5
    .line 6
    iput p3, p0, Lcom/alibaba/sdk/android/emas/a;->b:I

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    iput p2, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    .line 10
    .line 11
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/a;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 12
    .line 13
    return-void
.end method

.method private a()V
    .locals 2

    .line 11
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->a(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    return-void
.end method


# virtual methods
.method public a()Lcom/alibaba/sdk/android/emas/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public declared-synchronized a(Lcom/alibaba/sdk/android/emas/e;)V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget v0, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/e;->length()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    .line 7
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:I

    if-ge p1, v0, :cond_1

    iget p1, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    iget v0, p0, Lcom/alibaba/sdk/android/emas/a;->b:I

    if-lt p1, v0, :cond_2

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "CacheManager satisfy limit. immediately send. size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", current capacity: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/alibaba/sdk/android/emas/a;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Lcom/alibaba/sdk/android/emas/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Lcom/alibaba/sdk/android/emas/e;)Z
    .locals 0

    .line 2
    const/4 p1, 0x0

    return p1
.end method

.method public synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/sdk/android/emas/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/emas/a;->a(Lcom/alibaba/sdk/android/emas/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/a;->a:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "CacheManager flush. immediately send."

    .line 14
    .line 15
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/alibaba/sdk/android/emas/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/emas/a;->a()Lcom/alibaba/sdk/android/emas/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public synthetic remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/sdk/android/emas/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/emas/a;->a(Lcom/alibaba/sdk/android/emas/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
