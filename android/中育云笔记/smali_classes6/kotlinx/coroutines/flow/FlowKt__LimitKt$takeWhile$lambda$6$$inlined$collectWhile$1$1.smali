.class public final Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1"
    f = "Limit.kt"
    l = {
        0x84,
        0x85
    }
    m = "emit"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;->f:Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;

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

    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;->d:Ljava/lang/Object;

    iget p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;->e:I

    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1;->f:Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lkotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
