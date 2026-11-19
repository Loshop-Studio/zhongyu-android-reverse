.class public final Lcom/zykj/mistake/activity/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/activity/g;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    sget p1, Lo1/b;->c:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "com.techvision.aldl.ICheckAppUpdate"

    .line 9
    .line 10
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v1, v0, Lo1/c;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast v0, Lo1/c;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Lo1/a;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p2, v0, Lo1/a;->c:Landroid/os/IBinder;

    .line 29
    .line 30
    :goto_0
    iget-object p2, p0, Lcom/zykj/mistake/activity/g;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 31
    .line 32
    iput-object v0, p2, Lcom/zykj/mistake/activity/MainActivity;->c:Lo1/c;

    .line 33
    .line 34
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 39
    .line 40
    sget-object v1, Lg7/d;->a:Lg7/d;

    .line 41
    .line 42
    new-instance v2, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;

    .line 43
    .line 44
    invoke-direct {v2, p2, p1}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x2

    .line 48
    invoke-static {v0, v1, p1, v2, p2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
