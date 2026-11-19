.class final Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.MainActivity$onCreate$3"
    f = "MainActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/MainActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->g(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->k(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/MainViewModel;->d(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->u()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    const-string p1, "System.exit returned normally, while it was supposed to halt JVM."

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final k(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/MainViewModel;->e(Lcom/zykj/message/server/bean/UserInfo;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    .line 14
    .line 15
    new-instance v1, Lcom/zykj/student/dialogue/ui/a;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/a;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    .line 21
    .line 22
    new-instance v2, Lcom/zykj/student/dialogue/ui/b;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/b;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Lcom/zykj/message/client/MessageClient;->q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method
