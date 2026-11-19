.class final Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.ui.MainActivity$onCreate$4$1"
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

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->g(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->k(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/MainViewModel;->d(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->u()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final k(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)Lkotlin/Unit;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/MainViewModel;->e(Lcom/zykj/message/server/bean/UserInfo;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppFilesPath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "log"

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setDir(Ljava/lang/String;)Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/MainViewModel;->f()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->a:I

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
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    .line 14
    .line 15
    new-instance v1, Lcom/zykj/student/dialogue/ui/c;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/c;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lcom/zykj/message/client/MessageClient;->a(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4$1;->b:Lcom/zykj/student/dialogue/ui/MainActivity;

    .line 24
    .line 25
    new-instance v1, Lcom/zykj/student/dialogue/ui/d;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/d;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lcom/zykj/message/client/MessageClient;->c(Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
