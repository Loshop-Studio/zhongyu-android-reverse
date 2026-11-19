.class final Lcoil3/intercept/EngineInterceptor$intercept$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptor;->a(Lcoil3/intercept/a$a;Lvc/c;)Ljava/lang/Object;
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
    c = "coil3.intercept.EngineInterceptor$intercept$2"
    f = "EngineInterceptor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcoil3/intercept/EngineInterceptor;

.field public final synthetic e:Lw/g;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lw/n;

.field public final synthetic h:Lcoil3/b;

.field public final synthetic i:Lr/d$b;

.field public final synthetic j:Lcoil3/intercept/a$a;


# direct methods
.method public constructor <init>(Lcoil3/intercept/EngineInterceptor;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lr/d$b;Lcoil3/intercept/a$a;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Lcoil3/intercept/EngineInterceptor;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Lw/g;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lw/n;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/b;

    .line 10
    .line 11
    iput-object p6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->i:Lr/d$b;

    .line 12
    .line 13
    iput-object p7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->j:Lcoil3/intercept/a$a;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 9

    .line 1
    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Lcoil3/intercept/EngineInterceptor;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Lw/g;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lw/n;

    .line 10
    .line 11
    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/b;

    .line 12
    .line 13
    iget-object v6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->i:Lr/d$b;

    .line 14
    .line 15
    iget-object v7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->j:Lcoil3/intercept/a$a;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/EngineInterceptor;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lr/d$b;Lcoil3/intercept/a$a;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcoil3/intercept/EngineInterceptor$intercept$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    iget v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Lcoil3/intercept/EngineInterceptor;

    .line 29
    .line 30
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Lw/g;

    .line 31
    .line 32
    move-object v3, v2

    .line 33
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v4, v3

    .line 36
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lw/n;

    .line 37
    .line 38
    move-object v7, v4

    .line 39
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/b;

    .line 40
    .line 41
    iput v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:I

    .line 42
    .line 43
    move-object v5, p0

    .line 44
    move-object v1, v7

    .line 45
    invoke-static/range {v0 .. v5}, Lcoil3/intercept/EngineInterceptor;->c(Lcoil3/intercept/EngineInterceptor;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v6, :cond_2

    .line 50
    .line 51
    return-object v6

    .line 52
    :cond_2
    :goto_0
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;

    .line 53
    .line 54
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Lcoil3/intercept/EngineInterceptor;

    .line 55
    .line 56
    invoke-static {v1}, Lcoil3/intercept/EngineInterceptor;->f(Lcoil3/intercept/EngineInterceptor;)La0/x;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v1}, La0/x;->a()V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Lcoil3/intercept/EngineInterceptor;

    .line 64
    .line 65
    invoke-static {v1}, Lcoil3/intercept/EngineInterceptor;->e(Lcoil3/intercept/EngineInterceptor;)Lr/e;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->i:Lr/d$b;

    .line 70
    .line 71
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Lw/g;

    .line 72
    .line 73
    invoke-virtual {v1, v2, v3, v0}, Lr/e;->h(Lr/d$b;Lw/g;Lcoil3/intercept/EngineInterceptor$b;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iget-object v8, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Lw/g;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->c()Lcoil3/decode/DataSource;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->i:Lr/d$b;

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    :goto_1
    move-object v10, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/4 v2, 0x0

    .line 94
    goto :goto_1

    .line 95
    :goto_2
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->d()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->f()Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->j:Lcoil3/intercept/a$a;

    .line 104
    .line 105
    invoke-static {v0}, Lcoil3/util/c;->o(Lcoil3/intercept/a$a;)Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    new-instance v6, Lw/r;

    .line 110
    .line 111
    invoke-direct/range {v6 .. v13}, Lw/r;-><init>(Lk/j;Lw/g;Lcoil3/decode/DataSource;Lr/d$b;Ljava/lang/String;ZZ)V

    .line 112
    .line 113
    .line 114
    return-object v6
.end method
