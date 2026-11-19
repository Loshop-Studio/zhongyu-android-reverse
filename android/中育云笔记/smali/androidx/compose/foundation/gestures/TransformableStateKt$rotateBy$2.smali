.class final Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformableStateKt;->rotateBy(Landroidx/compose/foundation/gestures/TransformableState;FLvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2"
    f = "TransformableState.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $degrees:F

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(FLvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->$degrees:F

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->$degrees:F

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;-><init>(FLvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/foundation/gestures/TransformScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->invoke(Landroidx/compose/foundation/gestures/TransformScope;Lvc/c;)Ljava/lang/Object;

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
    iget v0, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/gestures/TransformScope;

    .line 14
    .line 15
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget v2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$rotateBy$2;->$degrees:F

    .line 22
    .line 23
    const/high16 v3, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-interface {p1, v3, v0, v1, v2}, Landroidx/compose/foundation/gestures/TransformScope;->transformBy-d-4ec7I(FJF)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method
