.class final Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt"
    f = "AskMaterialEffectHandler.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x4e
    }
    m = "prepareWebPreviews"
    n = {
        "bundle",
        "environment",
        "viewModel",
        "webPreviewingItems",
        "webItems",
        "container",
        "resolver",
        "$this$forEach$iv",
        "element$iv",
        "item",
        "$i$f$forEach",
        "$i$a$-forEach-AskMaterialEffectHandlerKt$prepareWebPreviews$2",
        "$i$a$-runCatching-AskMaterialEffectHandlerKt$prepareWebPreviews$2$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$9",
        "L$10",
        "I$0",
        "I$1",
        "I$2"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lh6/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$prepareWebPreviews$1;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lcom/zykj/mistake/feature/ask/a;->b(Lcom/zykj/mistake/feature/ask/f;Lz4/a;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Ljava/util/Set;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
