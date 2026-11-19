.class final Lcom/friday/common/network/StudentSession$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/network/StudentSession$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.common.network.StudentSession$3$1"
    f = "StudentSession.kt"
    l = {
        0x7e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 0

    .line 1
    new-instance p1, Lcom/friday/common/network/StudentSession$3$1;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lcom/friday/common/network/StudentSession$3$1;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$3$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/network/StudentSession$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/network/StudentSession$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/common/network/StudentSession$3$1;->d:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput p1, p0, Lcom/friday/common/network/StudentSession$3$1;->c:I

    .line 29
    .line 30
    iput v2, p0, Lcom/friday/common/network/StudentSession$3$1;->d:I

    .line 31
    .line 32
    new-instance p1, Lkotlinx/coroutines/c;

    .line 33
    .line 34
    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {p1, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lkotlinx/coroutines/c;->F()V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 45
    .line 46
    new-instance v2, Lcom/friday/common/network/StudentSession$3$1$a;

    .line 47
    .line 48
    invoke-direct {v2, p1}, Lcom/friday/common/network/StudentSession$3$1$a;-><init>(Lsd/j;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/zykj/message/client/MessageClient;->a(Lcb/b;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-ne p1, v1, :cond_2

    .line 63
    .line 64
    invoke-static {p0}, Lxc/f;->c(Lvc/c;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_3
    return-object p1
.end method
