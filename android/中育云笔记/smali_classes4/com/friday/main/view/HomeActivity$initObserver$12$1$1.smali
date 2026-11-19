.class final Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity$initObserver$12$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.main.view.HomeActivity$initObserver$12$1$1"
    f = "HomeActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->e:Lcom/friday/main/view/HomeActivity;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/zykj/lib/error/code/ErrorCode;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/lib/error/code/ErrorCode;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->g(Lcom/zykj/lib/error/code/ErrorCode;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/error/code/ErrorCode;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 16
    .line 17
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    const-string p1, "\u767b\u5f55\u5df2\u8fc7\u671f,\u8bf7\u91cd\u65b0\u767b\u5f55"

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v1, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "com.zykj.manage"

    .line 28
    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->isAppInstalled(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$12$1$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string p1, "\u7528\u6237\u4e2d\u5fc3\u672a\u5b89\u88c5"

    .line 50
    .line 51
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Ljava/lang/RuntimeException;

    .line 58
    .line 59
    const-string v0, "System.exit returned normally, while it was supposed to halt JVM."

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method
