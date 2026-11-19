.class final Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->J0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel$commitAnswer$3$1"
    f = "TodoDetailViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->c:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->c:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->a:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->c:Landroid/graphics/Bitmap;

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 62
    .line 63
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v2, v1

    .line 66
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const-string p1, "getAbsolutePath(...)"

    .line 73
    .line 74
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lm5/e$c;->b:Lm5/e$c;

    .line 78
    .line 79
    invoke-virtual {p1}, Lm5/e;->a()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    const/4 v7, 0x5

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-static/range {v2 .. v8}, Lcom/zykj/evaluation/bean/UploadData;->copy$default(Lcom/zykj/evaluation/bean/UploadData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/UploadData;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method
