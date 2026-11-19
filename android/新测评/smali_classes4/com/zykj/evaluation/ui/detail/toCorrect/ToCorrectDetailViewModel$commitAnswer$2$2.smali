.class final Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->N0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$commitAnswer$2$2"
    f = "ToCorrectDetailViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->c:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->c:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/io/File;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-virtual {v0, v1, v2}, Lg7/e;->i(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ".webp"

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->c:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-static {v0, p1, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Z)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "\u56fe\u7247\u4fdd\u5b58\u5730\u5740: "

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, " "

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "\u6e05\u7406\u65e7\u8349\u7a3f\u56fe\u7247,DraftSave"

    .line 88
    .line 89
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 97
    .line 98
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const-string p1, "getAbsolutePath(...)"

    .line 108
    .line 109
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object p1, Lm5/e$c;->b:Lm5/e$c;

    .line 113
    .line 114
    invoke-virtual {p1}, Lm5/e;->a()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    const/4 v7, 0x5

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v3, 0x0

    .line 121
    const/4 v5, 0x0

    .line 122
    invoke-static/range {v2 .. v8}, Lcom/zykj/evaluation/bean/UploadData;->copy$default(Lcom/zykj/evaluation/bean/UploadData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/UploadData;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 127
    .line 128
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
.end method
