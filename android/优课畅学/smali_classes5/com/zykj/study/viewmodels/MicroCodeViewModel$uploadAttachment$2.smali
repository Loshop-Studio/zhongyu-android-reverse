# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MicroCodeViewModel;->b(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.viewmodels.MicroCodeViewModel$uploadAttachment$2"
    f = "MicroCodeViewModel.kt"
    l = {
        0x1f,
        0x21
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/MicroCodeViewModel;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MicroCodeViewModel;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->c:Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->e:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->c:Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;-><init>(Lcom/zykj/study/viewmodels/MicroCodeViewModel;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->c:Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MicroCodeViewModel;->a()Lcom/zykj/study/repository/QuickCodeRepository;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v4, Lcom/zykj/study/bean/AttachmentIdInput;

    .line 41
    .line 42
    iget-object v7, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->d:Ljava/lang/String;

    .line 43
    .line 44
    const/16 v9, 0xb

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-direct/range {v4 .. v10}, Lcom/zykj/study/bean/AttachmentIdInput;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    iput v3, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->b:I

    .line 54
    .line 55
    invoke-virtual {p1, v4, p0}, Lcom/zykj/study/repository/QuickCodeRepository;->a(Lcom/zykj/study/bean/AttachmentIdInput;Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->c:Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MicroCodeViewModel;->a()Lcom/zykj/study/repository/QuickCodeRepository;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v1, Lcom/zykj/study/bean/AttachmentInput;

    .line 75
    .line 76
    iget-object v6, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->e:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v7, Lcom/google/gson/Gson;

    .line 79
    .line 80
    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v8, Lcom/zykj/study/bean/AttachmentExtraInput;

    .line 84
    .line 85
    iget-object v9, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->d:Ljava/lang/String;

    .line 86
    .line 87
    invoke-direct {v8, v4, v5, v9}, Lcom/zykj/study/bean/AttachmentExtraInput;-><init>(JLjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v8, "toJson(...)"

    .line 95
    .line 96
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v6, v3, v7}, Lcom/zykj/study/bean/AttachmentInput;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-wide v4, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->a:J

    .line 103
    .line 104
    iput v2, p0, Lcom/zykj/study/viewmodels/MicroCodeViewModel$uploadAttachment$2;->b:I

    .line 105
    .line 106
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/QuickCodeRepository;->b(Lcom/zykj/study/bean/AttachmentInput;Lm7/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_4

    .line 111
    .line 112
    :goto_1
    return-object v0

    .line 113
    :cond_4
    :goto_2
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    return-object p1
.end method
