.class Lcom/tendcloud/tenddata/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private mAlive:Z

.field private volatile mDying:Z

.field private final mEdit:Lcom/tendcloud/tenddata/t;

.field private final mHandler:Landroid/os/Handler;

.field private final mViewRoot:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/tendcloud/tenddata/t;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/tendcloud/tenddata/g$a;->mEdit:Lcom/tendcloud/tenddata/t;

    .line 5
    .line 6
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/tendcloud/tenddata/g$a;->mViewRoot:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/tendcloud/tenddata/g$a;->mHandler:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/g$a;->mAlive:Z

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/g$a;->mDying:Z

    .line 20
    .line 21
    return-void
.end method

.method private cleanUp()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/g$a;->mAlive:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tendcloud/tenddata/g$a;->mViewRoot:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/g$a;->mEdit:Lcom/tendcloud/tenddata/t;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/t;->a()V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/g$a;->mAlive:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public kill()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/g$a;->mDying:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/g$a;->mHandler:Landroid/os/Handler;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :catchall_0
    return-void
.end method

.method public onGlobalLayout()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/g$a;->run()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public run()V
    .locals 0

    return-void
.end method
