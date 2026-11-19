.class public final Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ll8/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ll8/e;Ll8/y;)V
    .locals 6

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1;->a:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v3, p2, p1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;-><init>(Ll8/y;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 32
    .line 33
    .line 34
    return-void
.end method
