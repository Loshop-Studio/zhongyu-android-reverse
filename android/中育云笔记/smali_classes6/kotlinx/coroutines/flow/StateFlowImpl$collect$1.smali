.class final Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/StateFlowImpl;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "kotlinx.coroutines.flow.StateFlowImpl"
    f = "StateFlow.kt"
    l = {
        0x185,
        0x191,
        0x196
    }
    m = "collect"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lkotlinx/coroutines/flow/StateFlowImpl;

.field public j:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlowImpl;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;->i:Lkotlinx/coroutines/flow/StateFlowImpl;

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

    iput-object p1, p0, Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;->h:Ljava/lang/Object;

    iget p1, p0, Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;->j:I

    iget-object p1, p0, Lkotlinx/coroutines/flow/StateFlowImpl$collect$1;->i:Lkotlinx/coroutines/flow/StateFlowImpl;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lkotlinx/coroutines/flow/StateFlowImpl;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
