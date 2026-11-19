.class final Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity$messageServerListener$1;->i(Lcom/zykj/message/server/bean/ServerInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.main.view.HomeActivity$messageServerListener$1$serverInfoUpdate$1"
    f = "HomeActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->d:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->d:Lcom/friday/main/view/HomeActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$messageServerListener$1$serverInfoUpdate$1;->d:Lcom/friday/main/view/HomeActivity;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "activity"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Landroid/app/ActivityManager;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast p1, Ljava/lang/Iterable;

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/app/ActivityManager$AppTask;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/app/ActivityManager$AppTask;->finishAndRemoveTask()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 64
    .line 65
    .line 66
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
