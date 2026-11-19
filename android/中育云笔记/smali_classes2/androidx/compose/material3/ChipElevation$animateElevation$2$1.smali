.class final Landroidx/compose/material3/ChipElevation$animateElevation$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ChipElevation;->animateElevation(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
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
    c = "androidx.compose.material3.ChipElevation$animateElevation$2$1"
    f = "Chip.kt"
    l = {
        0x8c1,
        0x8c3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $animatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $interaction:Landroidx/compose/foundation/interaction/Interaction;

.field final synthetic $lastInteraction$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/interaction/Interaction;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $target:F

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/Animatable;FZLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/runtime/MutableState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;FZ",
            "Landroidx/compose/foundation/interaction/Interaction;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/interaction/Interaction;",
            ">;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/material3/ChipElevation$animateElevation$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$target:F

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$enabled:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$lastInteraction$delegate:Landroidx/compose/runtime/MutableState;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 7
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
    new-instance v0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$target:F

    .line 6
    .line 7
    iget-boolean v3, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$enabled:Z

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$lastInteraction$delegate:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;-><init>(Landroidx/compose/animation/core/Animatable;FZLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/runtime/MutableState;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->label:I

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
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroidx/compose/ui/unit/Dp;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget v1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$target:F

    .line 44
    .line 45
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_5

    .line 50
    .line 51
    iget-boolean p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$enabled:Z

    .line 52
    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 56
    .line 57
    iget v1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$target:F

    .line 58
    .line 59
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput v3, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->label:I

    .line 64
    .line 65
    invoke-virtual {p1, v1, p0}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget-object p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$lastInteraction$delegate:Landroidx/compose/runtime/MutableState;

    .line 73
    .line 74
    invoke-static {p1}, Landroidx/compose/material3/ChipElevation;->access$animateElevation$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/foundation/interaction/Interaction;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 79
    .line 80
    iget v3, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$target:F

    .line 81
    .line 82
    iget-object v4, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    .line 83
    .line 84
    iput v2, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->label:I

    .line 85
    .line 86
    invoke-static {v1, v3, p1, v4, p0}, Landroidx/compose/material3/internal/ElevationKt;->animateElevation-rAjV9yQ(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lvc/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    :goto_1
    return-object v0

    .line 93
    :cond_4
    :goto_2
    iget-object p1, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$lastInteraction$delegate:Landroidx/compose/runtime/MutableState;

    .line 94
    .line 95
    iget-object v0, p0, Landroidx/compose/material3/ChipElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    .line 96
    .line 97
    invoke-static {p1, v0}, Landroidx/compose/material3/ChipElevation;->access$animateElevation$lambda$3(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/Interaction;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 101
    .line 102
    return-object p1
.end method
