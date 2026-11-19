.class final Landroidx/navigation/compose/NavHostKt$NavHost$28$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V
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
    c = "androidx.navigation.compose.NavHostKt$NavHost$28$1"
    f = "NavHost.kt"
    l = {
        0x26c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $currentBackStack$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $progress$delegate:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $transitionState:Landroidx/compose/animation/core/SeekableTransitionState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/SeekableTransitionState<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/SeekableTransitionState<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Lvc/c<",
            "-",
            "Landroidx/navigation/compose/NavHostKt$NavHost$28$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$transitionState:Landroidx/compose/animation/core/SeekableTransitionState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

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
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$transitionState:Landroidx/compose/animation/core/SeekableTransitionState;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->label:I

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
    goto :goto_0

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
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 34
    .line 35
    invoke-static {v1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 v1, v1, -0x2

    .line 44
    .line 45
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$transitionState:Landroidx/compose/animation/core/SeekableTransitionState;

    .line 52
    .line 53
    iget-object v3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 54
    .line 55
    invoke-static {v3}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$40(Landroidx/compose/runtime/MutableFloatState;)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iput v2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;->label:I

    .line 60
    .line 61
    invoke-virtual {v1, v3, p1, p0}, Landroidx/compose/animation/core/SeekableTransitionState;->seekTo(FLjava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 69
    .line 70
    return-object p1
.end method
