.class final Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/collection/list/g;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/collection/list/g;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.list.CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1"
    f = "CollectionListEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lw4/c;Lcom/zykj/mistake/main/MainShellViewModel;Lt4/e;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/c;",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lt4/e;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$mainNavController:Lt4/e;

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
    .locals 4
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
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;-><init>(Lw4/c;Lcom/zykj/mistake/main/MainShellViewModel;Lt4/e;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/collection/list/g;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/list/g;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/collection/list/g;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->invoke(Lcom/zykj/mistake/feature/collection/list/g;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/g;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    instance-of p1, v0, Lcom/zykj/mistake/feature/collection/list/f;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/f;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/list/f;->a:Ljava/lang/String;

    .line 23
    .line 24
    check-cast p1, Lcom/zykj/mistake/activity/MainActivity;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p1, Lcom/zykj/mistake/feature/collection/list/c;->a:Lcom/zykj/mistake/feature/collection/list/c;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object p1, Lcom/zykj/mistake/feature/collection/list/e;->a:Lcom/zykj/mistake/feature/collection/list/e;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 53
    .line 54
    new-instance v0, Lcom/zykj/mistake/main/y0;

    .line 55
    .line 56
    sget-object v1, Lcom/zykj/mistake/main/RemoveDialogTarget;->COLLECTION:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/zykj/mistake/main/y0;-><init>(Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    instance-of p1, v0, Lcom/zykj/mistake/feature/collection/list/d;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 70
    .line 71
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/d;

    .line 72
    .line 73
    const-string v1, "<this>"

    .line 74
    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lu4/c;

    .line 79
    .line 80
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/d;->a:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/d;->b:Ljava/lang/String;

    .line 83
    .line 84
    iget v4, v0, Lcom/zykj/mistake/feature/collection/list/d;->c:I

    .line 85
    .line 86
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/list/d;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 87
    .line 88
    invoke-direct {v3, v1, v2, v4, v0}, Lu4/c;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v2, p1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 95
    .line 96
    const/4 v6, 0x6

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-static/range {v2 .. v7}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 107
    .line 108
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method
