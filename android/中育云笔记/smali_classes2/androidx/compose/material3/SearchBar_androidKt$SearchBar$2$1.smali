.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-Y92LkZI(Lhd/p;ZLhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lhd/q;Landroidx/compose/runtime/Composer;II)V
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
    c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1"
    f = "SearchBar.android.kt"
    l = {
        0xca
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $animationProgress:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentBackEvent:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $firstBackEvent:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

.field final synthetic $onExpandedChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/animation/core/Animatable;Lhd/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MutatorMutex;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Lhd/l;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$animationProgress:Landroidx/compose/animation/core/Animatable;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$onExpandedChange:Lhd/l;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$firstBackEvent:Landroidx/compose/runtime/MutableState;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 8
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
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$animationProgress:Landroidx/compose/animation/core/Animatable;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$onExpandedChange:Lhd/l;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$firstBackEvent:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;-><init>(Landroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/animation/core/Animatable;Lhd/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/c;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->invoke(Lvd/c;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/c;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->label:I

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
    iget-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    check-cast v5, Lvd/c;

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$mutatorMutex:Landroidx/compose/foundation/MutatorMutex;

    .line 33
    .line 34
    new-instance v3, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1$1;

    .line 35
    .line 36
    iget-object v4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

    .line 37
    .line 38
    iget-object v6, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$animationProgress:Landroidx/compose/animation/core/Animatable;

    .line 39
    .line 40
    iget-object v7, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$onExpandedChange:Lhd/l;

    .line 41
    .line 42
    iget-object v8, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$firstBackEvent:Landroidx/compose/runtime/MutableState;

    .line 43
    .line 44
    iget-object v9, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    invoke-direct/range {v3 .. v10}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Lvd/c;Landroidx/compose/animation/core/Animatable;Lhd/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lvc/c;)V

    .line 48
    .line 49
    .line 50
    iput v2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;->label:I

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v10, 0x1

    .line 54
    const/4 v11, 0x0

    .line 55
    move-object v9, p0

    .line 56
    move-object v6, p1

    .line 57
    move-object v8, v3

    .line 58
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/MutatorMutex;->mutate$default(Landroidx/compose/foundation/MutatorMutex;Landroidx/compose/foundation/MutatePriority;Lhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p1
.end method
