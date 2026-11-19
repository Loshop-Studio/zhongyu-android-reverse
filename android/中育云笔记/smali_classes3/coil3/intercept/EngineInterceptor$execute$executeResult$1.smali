.class final Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptor;->h(Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;
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
    c = "coil3.intercept.EngineInterceptor$execute$executeResult$1"
    f = "EngineInterceptor.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcoil3/intercept/EngineInterceptor;

.field public final synthetic e:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic g:Lw/g;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic j:Lcoil3/b;


# direct methods
.method public constructor <init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lw/g;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/b;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->d:Lcoil3/intercept/EngineInterceptor;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->g:Lw/g;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->i:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 12
    .line 13
    iput-object p7, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->j:Lcoil3/b;

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
    new-instance v0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->d:Lcoil3/intercept/EngineInterceptor;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->g:Lw/g;

    .line 10
    .line 11
    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->i:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 14
    .line 15
    iget-object v7, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->j:Lcoil3/b;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;-><init>(Lcoil3/intercept/EngineInterceptor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lw/g;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/b;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->c:I

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
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->d:Lcoil3/intercept/EngineInterceptor;

    .line 28
    .line 29
    iget-object p1, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 30
    .line 31
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ln/p;

    .line 34
    .line 35
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 36
    .line 37
    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lcoil3/a;

    .line 40
    .line 41
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->g:Lw/g;

    .line 42
    .line 43
    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->h:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v6, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->i:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 46
    .line 47
    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, Lw/n;

    .line 50
    .line 51
    iget-object v7, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->j:Lcoil3/b;

    .line 52
    .line 53
    iput v2, p0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;->c:I

    .line 54
    .line 55
    move-object v8, p0

    .line 56
    move-object v2, p1

    .line 57
    invoke-static/range {v1 .. v8}, Lcoil3/intercept/EngineInterceptor;->b(Lcoil3/intercept/EngineInterceptor;Ln/p;Lcoil3/a;Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;Lvc/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    return-object p1
.end method
