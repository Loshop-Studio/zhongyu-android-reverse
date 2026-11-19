.class final Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;
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
    c = "com.zykj.mistake.utils.AskMaterialImageResolver$resolveImage$2"
    f = "AskMaterialImageResolver.kt"
    i = {}
    l = {
        0x2a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $id:Ljava/lang/String;

.field final synthetic $source:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/utils/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/mistake/utils/c;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->this$0:Lcom/zykj/mistake/utils/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$id:Ljava/lang/String;

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
    new-instance p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->this$0:Lcom/zykj/mistake/utils/c;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$id:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;-><init>(Ljava/lang/String;Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->label:I

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
    goto :goto_1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "http://"

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {p1, v1, v3}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_5

    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 37
    .line 38
    const-string v1, "https://"

    .line 39
    .line 40
    invoke-static {p1, v1, v3}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "file://"

    .line 50
    .line 51
    invoke-static {p1, v0, v3}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->this$0:Lcom/zykj/mistake/utils/c;

    .line 58
    .line 59
    new-instance v1, Ljava/io/File;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v2, v0}, Lkotlin/text/p;->V(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$id:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {p1, v1, v0}, Lcom/zykj/mistake/utils/c;->a(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_3
    new-instance p1, Ljava/io/File;

    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->this$0:Lcom/zykj/mistake/utils/c;

    .line 91
    .line 92
    new-instance v0, Ljava/io/File;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$id:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p1, v0, v1}, Lcom/zykj/mistake/utils/c;->a(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string v0, "Unsupported image source"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->this$0:Lcom/zykj/mistake/utils/c;

    .line 115
    .line 116
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$source:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->$id:Ljava/lang/String;

    .line 119
    .line 120
    iput v2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;->label:I

    .line 121
    .line 122
    invoke-static {p1, v1, v3, p0}, Lcom/zykj/mistake/utils/c;->b(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v0, :cond_6

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_6
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 130
    .line 131
    return-object p1
.end method
