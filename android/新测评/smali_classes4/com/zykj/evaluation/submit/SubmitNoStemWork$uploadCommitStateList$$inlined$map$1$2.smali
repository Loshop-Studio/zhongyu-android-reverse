.class public final Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/FlowCollector;

.field public final synthetic b:Lcom/zykj/evaluation/submit/SubmitNoStemWork;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;Lcom/zykj/evaluation/submit/SubmitNoStemWork;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    iput-object p2, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->b:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

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
    iput v1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;-><init>(Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->b:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    .line 67
    .line 68
    invoke-static {v4}, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->p(Lcom/zykj/evaluation/submit/SubmitNoStemWork;)Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 73
    .line 74
    .line 75
    iget-object v4, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->b:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    .line 76
    .line 77
    invoke-static {v4}, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->p(Lcom/zykj/evaluation/submit/SubmitNoStemWork;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    const/16 v5, 0xa

    .line 87
    .line 88
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ln5/h;

    .line 110
    .line 111
    invoke-virtual {v5}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iput-object v2, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    iput p1, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->h:I

    .line 153
    .line 154
    iput v3, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

    .line 155
    .line 156
    invoke-interface {p2, v4, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v1, :cond_4

    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p1
.end method
