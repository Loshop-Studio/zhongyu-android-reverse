.class public final Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1$a;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/server/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of p2, p1, Lcom/zykj/huiwei/launcher/server/b$a;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1$a;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 6
    .line 7
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->p(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const-string p2, "overlayToastManager"

    .line 14
    .line 15
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :cond_0
    move-object v0, p2

    .line 20
    check-cast p1, Lcom/zykj/huiwei/launcher/server/b$a;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/server/b$a;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v4, 0x2

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-static/range {v0 .. v5}, Lcom/zykj/huiwei/launcher/server/OverlayToastManager;->i(Lcom/zykj/huiwei/launcher/server/OverlayToastManager;Ljava/lang/String;JILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 37
    .line 38
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/server/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1$a;->a(Lcom/zykj/huiwei/launcher/server/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
