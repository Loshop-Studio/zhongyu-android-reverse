.class final Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.guide.normal.GuideViewModel$getGuideTask$1"
    f = "GuideViewModel.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x75,
        0x79,
        0x80
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-GuideViewModel$getGuideTask$1$1"
    }
    s = {
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 59
    .line 60
    iput-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iput v4, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->d:I

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_0
    check-cast p1, Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 72
    .line 73
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->G(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->C(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 85
    .line 86
    invoke-static {p1, v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->K(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->b:Ljava/lang/Object;

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    iput v5, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->c:I

    .line 95
    .line 96
    iput v3, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->d:I

    .line 97
    .line 98
    invoke-virtual {p1, v1, p0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Y(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-ne v3, v0, :cond_5

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move-object v3, p1

    .line 106
    :goto_1
    invoke-static {v3, v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->I(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->C(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->isRepresentative()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-ne p1, v4, :cond_8

    .line 122
    .line 123
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 124
    .line 125
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->D(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;)Lp5/j;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-object v3, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 130
    .line 131
    invoke-static {v3}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->C(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getExamId()J

    .line 139
    .line 140
    .line 141
    move-result-wide v3

    .line 142
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->a:Ljava/lang/Object;

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    iput-object v5, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->b:Ljava/lang/Object;

    .line 146
    .line 147
    iput v2, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->d:I

    .line 148
    .line 149
    invoke-interface {v1, v3, v4, p0}, Lp5/j;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-ne v1, v0, :cond_7

    .line 154
    .line 155
    :goto_2
    return-object v0

    .line 156
    :cond_7
    move-object v0, p1

    .line 157
    move-object p1, v1

    .line 158
    :goto_3
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 159
    .line 160
    invoke-static {p1}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    .line 165
    .line 166
    check-cast p1, Lcom/zykj/evaluation/bean/ExamProgress;

    .line 167
    .line 168
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->J(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->H(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p1
.end method
