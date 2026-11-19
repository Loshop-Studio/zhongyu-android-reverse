.class final Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/FloatingActionButtonElevation;->animateElevation(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
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
    c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1"
    f = "FloatingActionButton.kt"
    l = {
        0x21a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $animatable:Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;

.field label:I

.field final synthetic this$0:Landroidx/compose/material3/FloatingActionButtonElevation;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;Landroidx/compose/material3/FloatingActionButtonElevation;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->$animatable:Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

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
    .locals 2
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
    new-instance p1, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->$animatable:Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;-><init>(Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;Landroidx/compose/material3/FloatingActionButtonElevation;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->label:I

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
    iget-object v1, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->$animatable:Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 30
    .line 31
    invoke-static {p1}, Landroidx/compose/material3/FloatingActionButtonElevation;->access$getDefaultElevation$p(Landroidx/compose/material3/FloatingActionButtonElevation;)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v3, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 36
    .line 37
    invoke-static {v3}, Landroidx/compose/material3/FloatingActionButtonElevation;->access$getPressedElevation$p(Landroidx/compose/material3/FloatingActionButtonElevation;)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 42
    .line 43
    invoke-static {v4}, Landroidx/compose/material3/FloatingActionButtonElevation;->access$getHoveredElevation$p(Landroidx/compose/material3/FloatingActionButtonElevation;)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v5, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->this$0:Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 48
    .line 49
    invoke-static {v5}, Landroidx/compose/material3/FloatingActionButtonElevation;->access$getFocusedElevation$p(Landroidx/compose/material3/FloatingActionButtonElevation;)F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iput v2, p0, Landroidx/compose/material3/FloatingActionButtonElevation$animateElevation$1$1;->label:I

    .line 54
    .line 55
    move-object v6, p0

    .line 56
    move v2, p1

    .line 57
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;->updateElevation-lDy3nrA(FFFFLvc/c;)Ljava/lang/Object;

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
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 65
    .line 66
    return-object p1
.end method
