.class final Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;
.super Ljava/util/concurrent/LinkedBlockingQueue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/thread/PictureThreadUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkedBlockingQueue4Util"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/LinkedBlockingQueue<",
        "Ljava/lang/Runnable;",
        ">;"
    }
.end annotation


# instance fields
.field public volatile c:Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const v0, 0x7fffffff

    .line 2
    iput v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->d:I

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const v0, 0x7fffffff

    .line 4
    iput v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->d:I

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->d:I

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;Lcom/luck/picture/lib/thread/PictureThreadUtils$f;)Lcom/luck/picture/lib/thread/PictureThreadUtils$f;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->c:Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;)Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->d:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->c:Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->c:Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getPoolSize()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->c:Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->getMaximumPoolSize()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v0, v1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_0
    invoke-super {p0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
.end method

.method public bridge synthetic offer(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;->c(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
