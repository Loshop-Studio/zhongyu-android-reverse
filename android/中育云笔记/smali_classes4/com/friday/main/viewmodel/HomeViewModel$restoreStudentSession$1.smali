.class final Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/HomeViewModel;->y()V
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
    c = "com.friday.main.viewmodel.HomeViewModel$restoreStudentSession$1"
    f = "HomeViewModel.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/main/viewmodel/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->d:Lcom/friday/main/viewmodel/HomeViewModel;

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
    new-instance p1, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->d:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/friday/common/network/SessionNotReadyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :try_start_1
    iget-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->d:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->i(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/network/StudentSession;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput v2, p0, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;->c:I

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/friday/common/network/StudentSession;->i(Lvc/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/friday/common/network/SessionNotReadyException; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 56
    .line 57
    return-object p1

    .line 58
    :goto_2
    throw p1
.end method
