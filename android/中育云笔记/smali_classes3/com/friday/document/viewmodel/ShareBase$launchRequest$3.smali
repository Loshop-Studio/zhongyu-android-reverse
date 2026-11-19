.class final Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBase;->i(ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;)V
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
    c = "com.friday.document.viewmodel.ShareBase$launchRequest$3"
    f = "ShareBase.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareBase;

.field public final synthetic f:Lhd/l;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBase;Lhd/l;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->e:Lcom/friday/document/viewmodel/ShareBase;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->f:Lhd/l;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->e:Lcom/friday/document/viewmodel/ShareBase;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->f:Lhd/l;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;-><init>(Lcom/friday/document/viewmodel/ShareBase;Lhd/l;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->e:Lcom/friday/document/viewmodel/ShareBase;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->e:Lcom/friday/document/viewmodel/ShareBase;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Lz2/b1;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    const-string v1, "\u672a\u77e5\u9519\u8bef"

    .line 41
    .line 42
    :cond_0
    move-object v5, v1

    .line 43
    const/16 v7, 0xb

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static/range {v2 .. v8}, Lz2/b1;->b(Lz2/b1;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lz2/b1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;->f:Lhd/l;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method
