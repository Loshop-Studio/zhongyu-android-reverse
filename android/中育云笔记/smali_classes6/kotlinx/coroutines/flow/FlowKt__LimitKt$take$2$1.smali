.class public final Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/FlowKt__LimitKt;->e(Lvd/c;I)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic d:I

.field public final synthetic e:Lvd/d;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;ILvd/d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->c:Lkotlin/jvm/internal/Ref$IntRef;

    .line 2
    .line 3
    iput p2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->d:I

    .line 4
    .line 5
    iput-object p3, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->e:Lvd/d;

    .line 6
    .line 7
    iput-object p4, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->f:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;-><init>(Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->c:Lkotlin/jvm/internal/Ref$IntRef;

    .line 61
    .line 62
    iget v2, p2, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 63
    .line 64
    add-int/2addr v2, v4

    .line 65
    iput v2, p2, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 66
    .line 67
    iget p2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->d:I

    .line 68
    .line 69
    if-ge v2, p2, :cond_5

    .line 70
    .line 71
    iget-object p2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->e:Lvd/d;

    .line 72
    .line 73
    iput v4, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->e:I

    .line 74
    .line 75
    invoke-interface {p2, p1, v0}, Lvd/d;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_5
    iget-object p2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->e:Lvd/d;

    .line 86
    .line 87
    iget-object v2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1;->f:Ljava/lang/Object;

    .line 88
    .line 89
    iput v3, v0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$take$2$1$emit$1;->e:I

    .line 90
    .line 91
    invoke-static {p2, p1, v2, v0}, Lkotlinx/coroutines/flow/FlowKt__LimitKt;->a(Lvd/d;Ljava/lang/Object;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v1, :cond_6

    .line 96
    .line 97
    :goto_2
    return-object v1

    .line 98
    :cond_6
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p1
.end method
