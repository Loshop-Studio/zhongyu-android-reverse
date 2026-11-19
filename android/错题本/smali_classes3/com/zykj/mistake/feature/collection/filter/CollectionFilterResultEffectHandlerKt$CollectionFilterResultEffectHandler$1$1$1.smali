.class final Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/mistake/feature/collection/filter/q;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/collection/filter/q;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1"
    f = "CollectionFilterResultEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $environment:Lz4/c;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lt4/e;Lw4/c;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/e;",
            "Lw4/c;",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lz4/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$environment:Lz4/c;

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
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$environment:Lz4/c;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;-><init>(Lt4/e;Lw4/c;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/c;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/collection/filter/q;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/filter/q;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/q;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->invoke(Lcom/zykj/mistake/feature/collection/filter/q;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/q;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lcom/zykj/mistake/feature/collection/filter/n;->a:Lcom/zykj/mistake/feature/collection/filter/n;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 23
    .line 24
    iget-object p1, p1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of p1, v0, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 35
    .line 36
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/filter/p;->a:Ljava/lang/String;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/mistake/activity/MainActivity;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    instance-of p1, v0, Lcom/zykj/mistake/feature/collection/filter/m;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    iput-boolean v1, p1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 56
    .line 57
    const-string v1, "nav_result_collection_detail_refresh"

    .line 58
    .line 59
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v1}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 65
    .line 66
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/m;

    .line 67
    .line 68
    iget v0, v0, Lcom/zykj/mistake/feature/collection/filter/m;->a:I

    .line 69
    .line 70
    new-instance v1, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const-string v0, "nav_result_collection_added_count"

    .line 76
    .line 77
    invoke-virtual {p1, v1, v0}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 81
    .line 82
    iget-object p1, p1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 83
    .line 84
    const-class v0, Lu4/c;

    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {p1, v0, v1, v1}, Landroidx/navigation/NavController;->popBackStack(Ly6/c;ZZ)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    instance-of p1, v0, Lcom/zykj/mistake/feature/collection/filter/o;

    .line 96
    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1;->$environment:Lz4/c;

    .line 100
    .line 101
    iget-object p1, p1, Lz4/c;->a:La5/e;

    .line 102
    .line 103
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/o;

    .line 104
    .line 105
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/o;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/filter/o;->b:Ljava/lang/String;

    .line 108
    .line 109
    sget-object v2, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->FILTER_RESULT:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 110
    .line 111
    invoke-virtual {p1, v2, v1, v0}, La5/e;->f(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 118
    .line 119
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method
