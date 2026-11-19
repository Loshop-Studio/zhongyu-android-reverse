.class final Landroidx/activity/compose/OnBackInstance$job$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/OnBackInstance$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.activity.compose.OnBackInstance$job$1$1"
    f = "PredictiveBackHandler.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $completed:Lkotlin/jvm/internal/Ref$BooleanRef;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "Lvc/c<",
            "-",
            "Landroidx/activity/compose/OnBackInstance$job$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/activity/compose/OnBackInstance$job$1$1;->$completed:Lkotlin/jvm/internal/Ref$BooleanRef;

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

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/activity/compose/OnBackInstance$job$1$1;->invoke(Lvd/d;Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/d;Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/d;",
            "Ljava/lang/Throwable;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance p1, Landroidx/activity/compose/OnBackInstance$job$1$1;

    iget-object p2, p0, Landroidx/activity/compose/OnBackInstance$job$1$1;->$completed:Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {p1, p2, p3}, Landroidx/activity/compose/OnBackInstance$job$1$1;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lvc/c;)V

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/activity/compose/OnBackInstance$job$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/activity/compose/OnBackInstance$job$1$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/compose/OnBackInstance$job$1$1;->$completed:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 15
    .line 16
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p1

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
.end method
