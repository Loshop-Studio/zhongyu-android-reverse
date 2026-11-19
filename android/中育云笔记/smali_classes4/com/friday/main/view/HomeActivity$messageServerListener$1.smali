.class public final Lcom/friday/main/view/HomeActivity$messageServerListener$1;
.super Ldb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1;->b:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ldb/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public i(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    sget-object v2, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1;->b:Lcom/friday/main/view/HomeActivity;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/friday/main/view/HomeActivity;->h0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/viewmodel/HomeViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lcom/friday/main/viewmodel/HomeViewModel;->z(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1;->b:Lcom/friday/main/view/HomeActivity;

    .line 25
    .line 26
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v4, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;

    .line 31
    .line 32
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1;->b:Lcom/friday/main/view/HomeActivity;

    .line 33
    .line 34
    invoke-direct {v4, p1, v0}, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 42
    .line 43
    .line 44
    return-void
.end method
