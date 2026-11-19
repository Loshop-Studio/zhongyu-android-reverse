.class final Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/BoundsTransformDeferredAnimation;->animate(Li8/b0;Landroidx/compose/animation/BoundsTransform;)Landroidx/compose/ui/geometry/Rect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1"
    f = "AnimateBoundsModifier.kt"
    l = {
        0x1ac
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $anim:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/geometry/Rect;",
            "Landroidx/compose/animation/core/AnimationVector4D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $boundsTransform:Landroidx/compose/animation/BoundsTransform;

.field final synthetic $target:Landroidx/compose/ui/geometry/Rect;

.field label:I

.field final synthetic this$0:Landroidx/compose/animation/BoundsTransformDeferredAnimation;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/BoundsTransformDeferredAnimation;Lm7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/geometry/Rect;",
            "Landroidx/compose/animation/core/AnimationVector4D;",
            ">;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Landroidx/compose/animation/BoundsTransform;",
            "Landroidx/compose/animation/BoundsTransformDeferredAnimation;",
            "Lm7/c<",
            "-",
            "Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$anim:Landroidx/compose/animation/core/Animatable;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$target:Landroidx/compose/ui/geometry/Rect;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$boundsTransform:Landroidx/compose/animation/BoundsTransform;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->this$0:Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm7/c<",
            "*>;)",
            "Lm7/c<",
            "Lh7/p;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$anim:Landroidx/compose/animation/core/Animatable;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$target:Landroidx/compose/ui/geometry/Rect;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$boundsTransform:Landroidx/compose/animation/BoundsTransform;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->this$0:Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/BoundsTransformDeferredAnimation;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li8/b0;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->label:I

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
    iget-object v1, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$anim:Landroidx/compose/animation/core/Animatable;

    .line 28
    .line 29
    move p1, v2

    .line 30
    iget-object v2, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$target:Landroidx/compose/ui/geometry/Rect;

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$boundsTransform:Landroidx/compose/animation/BoundsTransform;

    .line 33
    .line 34
    iget-object v4, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->this$0:Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    .line 35
    .line 36
    invoke-virtual {v4}, Landroidx/compose/animation/BoundsTransformDeferredAnimation;->getCurrentBounds()Landroidx/compose/ui/geometry/Rect;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->$target:Landroidx/compose/ui/geometry/Rect;

    .line 44
    .line 45
    invoke-interface {v3, v4, v5}, Landroidx/compose/animation/BoundsTransform;->transform(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iput p1, p0, Landroidx/compose/animation/BoundsTransformDeferredAnimation$animate$1;->label:I

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    const/16 v7, 0xc

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v6, p0

    .line 57
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/Animatable;->animateTo$default(Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lx7/l;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;

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
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 65
    .line 66
    return-object p1
.end method
