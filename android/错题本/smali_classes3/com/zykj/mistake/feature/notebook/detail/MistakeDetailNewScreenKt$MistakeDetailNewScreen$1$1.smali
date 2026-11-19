.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1"
    f = "MistakeDetailNewScreen.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field final synthetic $isTemporaryDraftMode:Z

.field final synthetic $onIntent:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/m3;ZLcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/m3;",
            "Z",
            "Lcom/zykj/mistake/feature/notebook/detail/a5;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$isTemporaryDraftMode:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$onIntent:Lr6/c;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$isTemporaryDraftMode:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$onIntent:Lr6/c;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;ZLcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 13
    .line 14
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$isTemporaryDraftMode:Z

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->f()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$onIntent:Lr6/c;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/c2;

    .line 40
    .line 41
    invoke-direct {v2, p1}, Lcom/zykj/mistake/feature/notebook/detail/c2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$draftController:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;->$onIntent:Lr6/c;

    .line 51
    .line 52
    new-instance v3, Landroidx/navigation/d;

    .line 53
    .line 54
    const/16 v4, 0xa

    .line 55
    .line 56
    invoke-direct {v3, v4, v2, p1}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/a5;->k(Lr6/c;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method
