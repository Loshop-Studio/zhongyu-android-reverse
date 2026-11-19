.class final Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;
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
    c = "com.zykj.mistake.utils.AskMaterialImageResolver"
    f = "AskMaterialImageResolver.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x71,
        0x73
    }
    m = "downloadImage"
    n = {
        "url",
        "id",
        "request",
        "url",
        "id",
        "request",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/zykj/mistake/utils/c;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/utils/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/utils/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lh6/c;)V

    .line 4
    .line 5
    .line 6
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

    iput-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->this$0:Lcom/zykj/mistake/utils/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/zykj/mistake/utils/c;->b(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
