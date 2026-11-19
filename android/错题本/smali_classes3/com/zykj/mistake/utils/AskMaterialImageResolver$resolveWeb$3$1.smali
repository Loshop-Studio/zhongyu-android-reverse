.class final Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.utils.AskMaterialImageResolver$resolveWeb$3$1"
    f = "AskMaterialImageResolver.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $id:Ljava/lang/String;

.field final synthetic $it:Ljava/io/File;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/utils/c;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/utils/c;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$it:Ljava/io/File;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$id:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
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
    new-instance p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$it:Ljava/io/File;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$id:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;-><init>(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$it:Ljava/io/File;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;->$id:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Lcom/zykj/mistake/utils/c;->a(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
