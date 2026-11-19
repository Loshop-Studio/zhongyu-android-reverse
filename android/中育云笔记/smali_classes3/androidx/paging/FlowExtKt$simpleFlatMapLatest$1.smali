.class public final Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/FlowExtKt;->simpleFlatMapLatest(Lvd/c;Lhd/p;)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1"
    f = "FlowExt.kt"
    l = {
        0x56,
        0x56
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $transform:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lhd/p;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->$transform:Lhd/p;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/d;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/d;",
            "TT;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;

    iget-object v1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->$transform:Lhd/p;

    invoke-direct {v0, v1, p3}, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;-><init>(Lhd/p;Lvc/c;)V

    iput-object p1, v0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object v1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lvd/d;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    check-cast v1, Lvd/d;

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v4, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->$transform:Lhd/p;

    .line 46
    .line 47
    iput-object v1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    iput v3, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->label:I

    .line 50
    .line 51
    invoke-interface {v4, p1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    check-cast p1, Lvd/c;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    iput-object v3, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v2, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->label:I

    .line 64
    .line 65
    invoke-static {v1, p1, p0}, Lvd/e;->t(Lvd/d;Lvd/c;Lvc/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    :goto_1
    return-object v0

    .line 72
    :cond_4
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1
.end method

.method public final invokeSuspend$$forInline(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lvd/d;

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->c(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->L$1:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/s;->c(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;->$transform:Lhd/p;

    .line 16
    .line 17
    invoke-interface {v0, v1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lvd/c;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, p0}, Lvd/e;->t(Lvd/d;Lvd/c;Lvc/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 35
    .line 36
    return-object p1
.end method
