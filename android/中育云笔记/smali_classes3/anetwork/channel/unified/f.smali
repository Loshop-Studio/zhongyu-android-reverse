.class Lanetwork/channel/unified/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lanetwork/channel/unified/e;


# direct methods
.method public constructor <init>(Lanetwork/channel/unified/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lanetwork/channel/unified/f;->a:Lanetwork/channel/unified/e;

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
    iget-object v0, p0, Lanetwork/channel/unified/f;->a:Lanetwork/channel/unified/e;

    .line 2
    .line 3
    sget v1, Lanet/channel/thread/ThreadPoolExecutorFactory$Priority;->HIGH:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lanet/channel/thread/ThreadPoolExecutorFactory;->submitPriorityTask(Ljava/lang/Runnable;I)Ljava/util/concurrent/Future;

    .line 6
    .line 7
    .line 8
    return-void
.end method
