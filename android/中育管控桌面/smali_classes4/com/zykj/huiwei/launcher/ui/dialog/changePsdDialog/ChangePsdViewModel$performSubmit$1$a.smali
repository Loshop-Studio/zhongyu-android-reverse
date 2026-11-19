.class public final Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->c(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    move-object v0, p2

    .line 14
    check-cast v0, Ld4/q;

    .line 15
    .line 16
    const/16 v10, 0x1f7

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    invoke-static/range {v0 .. v11}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 39
    .line 40
    sget-object p2, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$b;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$b;

    .line 41
    .line 42
    invoke-static {p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
