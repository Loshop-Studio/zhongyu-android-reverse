# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt;->f(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.zykj.evaluation.ui.detail.mistake.CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1"
    f = "CreateOrUpdateTagDialogPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCreateOrUpdateTagDialogPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateOrUpdateTagDialogPage.kt\ncom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/runtime/MutableState;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->c:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->d:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->c:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->d:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->c:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    new-instance v0, Lcom/google/gson/Gson;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->b:Ljava/lang/String;

    .line 19
    .line 20
    const-class v2, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "fromJson(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    check-cast v0, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt;->q(Landroidx/compose/runtime/MutableState;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->c:Landroidx/compose/runtime/MutableState;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt;->p(Landroidx/compose/runtime/MutableState;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1;->d:Landroidx/compose/runtime/MutableState;

    .line 49
    .line 50
    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/detail/mistake/CreateOrUpdateTagDialogPageKt;->r(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
