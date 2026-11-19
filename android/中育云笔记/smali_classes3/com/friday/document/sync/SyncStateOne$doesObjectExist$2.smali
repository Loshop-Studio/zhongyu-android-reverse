.class final Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->o(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.sync.SyncStateOne$doesObjectExist$2"
    f = "SyncStateOne.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->e:Ljava/lang/String;

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
    new-instance v0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;-><init>(Ljava/lang/String;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->c:I

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;->e:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 19
    .line 20
    new-instance v1, Lje/v$a;

    .line 21
    .line 22
    invoke-direct {v1}, Lje/v$a;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v3, 0x5

    .line 28
    .line 29
    invoke-virtual {v1, v3, v4, v2}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v3, v4, v2}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lje/v$a;->c()Lje/v;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lje/w$a;

    .line 42
    .line 43
    invoke-direct {v2}, Lje/w$a;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lje/w$a;->g()Lje/w$a;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1}, Lje/v;->b(Lje/w;)Lje/e;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lje/e;->execute()Lje/y;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lje/y;->j()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/16 v1, 0xc8

    .line 71
    .line 72
    if-ne p1, v1, :cond_0

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move p1, v0

    .line 77
    :goto_0
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 88
    .line 89
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_1
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    move-object p1, v0

    .line 108
    :cond_1
    return-object p1

    .line 109
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 112
    .line 113
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method
