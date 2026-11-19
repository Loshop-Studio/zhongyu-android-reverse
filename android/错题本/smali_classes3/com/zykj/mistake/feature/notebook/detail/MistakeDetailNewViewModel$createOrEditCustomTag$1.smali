.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$createOrEditCustomTag$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x917
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $id:J

.field final synthetic $name:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;JLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Ljava/lang/String;",
            "J",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$id:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$id:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;JLh6/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Lkotlin/Result;

    .line 14
    .line 15
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 32
    .line 33
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/h1;->a:Lcom/zykj/mistake/feature/notebook/detail/h1;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 41
    .line 42
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 43
    .line 44
    iget-wide v6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->$id:J

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;JLh6/c;)V

    .line 48
    .line 49
    .line 50
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->label:I

    .line 51
    .line 52
    invoke-static {v3, p0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v7, 0x0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    move-object v0, p1

    .line 69
    check-cast v0, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$loadCustomTags$1;

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-direct {v3, v2, v8}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$loadCustomTags$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lh6/c;)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/v;

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    invoke-direct {v5, v2, v7, v0}, Lcom/zykj/mistake/feature/notebook/detail/v;-><init>(Ljava/lang/Object;ZI)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lcom/zykj/mistake/feature/collection/component/j;

    .line 87
    .line 88
    const/16 v0, 0xe

    .line 89
    .line 90
    invoke-direct {v4, v0}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$requestApi$2;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$requestApi$2;-><init>(ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lr6/c;Lr6/c;Lr6/c;Lh6/c;)V

    .line 102
    .line 103
    .line 104
    const/4 v1, 0x3

    .line 105
    invoke-static {v9, v8, v8, v0, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, ""

    .line 124
    .line 125
    if-nez v1, :cond_4

    .line 126
    .line 127
    move-object v1, v2

    .line 128
    :cond_4
    const-string v3, "\u91cd\u590d"

    .line 129
    .line 130
    invoke-static {v1, v3, v7}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    sget-object p1, Lcom/zykj/mistake/feature/notebook/detail/u0;->a:Lcom/zykj/mistake/feature/notebook/detail/u0;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/v0;->a:Lcom/zykj/mistake/feature/notebook/detail/v0;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 145
    .line 146
    .line 147
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-nez p1, :cond_6

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    move-object v2, p1

    .line 157
    :goto_1
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 164
    .line 165
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 168
    .line 169
    .line 170
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 171
    .line 172
    return-object p1
.end method
