.class public final Lcom/zykj/study/ui/home/HomeFragment$connection$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/HomeFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/HomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1;->a:Lcom/zykj/study/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1;->a:Lcom/zykj/study/ui/home/HomeFragment;

    .line 2
    .line 3
    invoke-static {p2}, Lj1/a$a;->k(Landroid/os/IBinder;)Lj1/a;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {p1, p2}, Lcom/zykj/study/ui/home/HomeFragment;->k(Lcom/zykj/study/ui/home/HomeFragment;Lj1/a;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1;->a:Lcom/zykj/study/ui/home/HomeFragment;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Li8/i0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1;

    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1;->a:Lcom/zykj/study/ui/home/HomeFragment;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {v3, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
