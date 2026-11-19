.class public Lcom/lzy/okserver/task/PriorityBlockingQueue$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lzy/okserver/task/PriorityBlockingQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Z

.field public b:Li7/a;

.field public c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

.field public final synthetic d:Lcom/lzy/okserver/task/PriorityBlockingQueue;


# direct methods
.method public constructor <init>(Lcom/lzy/okserver/task/PriorityBlockingQueue;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->d:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->a:Z

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b:Li7/a;

    .line 2
    .line 3
    iget v0, v0, Li7/a;->c:I

    .line 4
    .line 5
    return v0
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b:Li7/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-boolean v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->a:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    iget-object v0, v0, Li7/a;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b:Li7/a;

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p1, Li7/a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Li7/a;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b:Li7/a;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->a:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance v0, Li7/a;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1, p1}, Li7/a;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b:Li7/a;

    .line 26
    .line 27
    return-void
.end method
