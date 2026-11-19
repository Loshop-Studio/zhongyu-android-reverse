.class final Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformableStateKt;->animateBy-Su4bsnU(Landroidx/compose/foundation/gestures/TransformableState;FJFLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3"
    f = "TransformableState.kt"
    l = {
        0xe6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $animationSpec:Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;

.field final synthetic $previousState:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/AnimationData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targetState:Landroidx/compose/foundation/gestures/AnimationData;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/AnimationData;Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/AnimationData;",
            ">;",
            "Landroidx/compose/foundation/gestures/AnimationData;",
            "Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$targetState:Landroidx/compose/foundation/gestures/AnimationData;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$animationSpec:Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;

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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$targetState:Landroidx/compose/foundation/gestures/AnimationData;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$animationSpec:Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/AnimationData;Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/TransformScope;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/TransformScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/foundation/gestures/TransformScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->invoke(Landroidx/compose/foundation/gestures/TransformScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v8

    .line 7
    iget v0, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->label:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroidx/compose/foundation/gestures/TransformScope;

    .line 32
    .line 33
    sget-object v9, Landroidx/compose/foundation/gestures/AnimationDataConverter;->INSTANCE:Landroidx/compose/foundation/gestures/AnimationDataConverter;

    .line 34
    .line 35
    iget-object v2, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 36
    .line 37
    iget-object v10, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {}, Landroidx/compose/foundation/gestures/TransformableStateKt;->access$getZeroAnimationVelocity$p()Landroidx/compose/foundation/gestures/AnimationData;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    const/16 v17, 0x38

    .line 44
    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const-wide/16 v12, 0x0

    .line 48
    .line 49
    const-wide/16 v14, 0x0

    .line 50
    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    invoke-static/range {v9 .. v18}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v3, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$targetState:Landroidx/compose/foundation/gestures/AnimationData;

    .line 58
    .line 59
    move-object v4, v2

    .line 60
    iget-object v2, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$animationSpec:Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;

    .line 61
    .line 62
    move-object v6, v4

    .line 63
    new-instance v4, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3$1;

    .line 64
    .line 65
    iget-object v7, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 66
    .line 67
    invoke-direct {v4, v7, v0}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/TransformScope;)V

    .line 68
    .line 69
    .line 70
    iput v1, v5, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$3;->label:I

    .line 71
    .line 72
    move-object v1, v3

    .line 73
    const/4 v3, 0x0

    .line 74
    move-object v0, v6

    .line 75
    const/4 v6, 0x4

    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v8, :cond_2

    .line 82
    .line 83
    return-object v8

    .line 84
    :cond_2
    :goto_0
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 85
    .line 86
    return-object v0
.end method
