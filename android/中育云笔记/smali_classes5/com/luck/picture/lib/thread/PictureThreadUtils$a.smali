.class public Lcom/luck/picture/lib/thread/PictureThreadUtils$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/thread/PictureThreadUtils;->g(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;JJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/concurrent/ExecutorService;

.field public final synthetic d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;->c:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;->d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;->c:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;->d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
