.class final Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/core/SeekableTransitionState;->waitForCompositionAfterTargetStateChange(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.animation.core.SeekableTransitionState"
    f = "Transition.kt"
    l = {
        0x207,
        0x85e
    }
    m = "waitForCompositionAfterTargetStateChange"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/animation/core/SeekableTransitionState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/SeekableTransitionState<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/SeekableTransitionState<",
            "TS;>;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->this$0:Landroidx/compose/animation/core/SeekableTransitionState;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    iget-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->this$0:Landroidx/compose/animation/core/SeekableTransitionState;

    invoke-static {p1, p0}, Landroidx/compose/animation/core/SeekableTransitionState;->access$waitForCompositionAfterTargetStateChange(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
