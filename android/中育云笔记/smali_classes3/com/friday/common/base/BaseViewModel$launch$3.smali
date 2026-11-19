.class final Lcom/friday/common/base/BaseViewModel$launch$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V
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
    c = "com.friday.common.base.BaseViewModel$launch$3"
    f = "BaseViewModel.kt"
    l = {
        0x11,
        0x13
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lhd/p;

.field public final synthetic g:Lhd/p;

.field public final synthetic h:Lhd/a;


# direct methods
.method public constructor <init>(Lhd/p;Lhd/p;Lhd/a;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->f:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->g:Lhd/p;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->h:Lhd/a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/friday/common/base/BaseViewModel$launch$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->f:Lhd/p;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->g:Lhd/p;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->h:Lhd/a;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/friday/common/base/BaseViewModel$launch$3;-><init>(Lhd/p;Lhd/p;Lhd/a;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/friday/common/base/BaseViewModel$launch$3;->e:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/base/BaseViewModel$launch$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/base/BaseViewModel$launch$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/base/BaseViewModel$launch$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/base/BaseViewModel$launch$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->d:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Exception;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_4

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :try_start_2
    iget-object p1, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->f:Lhd/p;

    .line 47
    .line 48
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->e:Ljava/lang/Object;

    .line 53
    .line 54
    iput v4, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->d:I

    .line 55
    .line 56
    invoke-interface {p1, v0, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->h:Lhd/a;

    .line 64
    .line 65
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_1
    :try_start_3
    iget-object v2, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->g:Lhd/p;

    .line 70
    .line 71
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->e:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iput v3, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->d:I

    .line 84
    .line 85
    invoke-interface {v2, p1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    if-ne p1, v1, :cond_3

    .line 90
    .line 91
    :goto_2
    return-object v1

    .line 92
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 93
    .line 94
    return-object p1

    .line 95
    :goto_4
    iget-object v0, p0, Lcom/friday/common/base/BaseViewModel$launch$3;->h:Lhd/a;

    .line 96
    .line 97
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    throw p1
.end method
