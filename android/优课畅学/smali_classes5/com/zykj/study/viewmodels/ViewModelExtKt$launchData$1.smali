.class final Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ViewModelExtKt;->b(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;)Lkotlinx/coroutines/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.ViewModelExtKt$launchData$1"
    f = "ViewModelExt.kt"
    l = {
        0x15,
        0x17
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

.field public final synthetic e:Lx7/p;

.field public final synthetic f:Lx7/q;

.field public final synthetic g:Lcom/zykj/base/BaseViewModel;

.field public final synthetic h:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;


# direct methods
.method public constructor <init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->e:Lx7/p;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->f:Lx7/q;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->g:Lcom/zykj/base/BaseViewModel;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->h:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->e:Lx7/p;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->f:Lx7/q;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->g:Lcom/zykj/base/BaseViewModel;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->h:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lm7/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Throwable;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_4

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_6

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-static {v5}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p1, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :try_start_2
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->e:Lx7/p;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iput v5, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->b:I

    .line 63
    .line 64
    invoke-interface {p1, v0, p0}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    if-ne p1, v1, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_5

    .line 83
    :goto_2
    :try_start_3
    iget-object v2, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->f:Lx7/q;

    .line 84
    .line 85
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iput-object v5, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput v3, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->b:I

    .line 94
    .line 95
    invoke-interface {v2, v0, p1, p0}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v1, :cond_5

    .line 100
    .line 101
    :goto_3
    return-object v1

    .line 102
    :cond_5
    move-object v6, v0

    .line 103
    move-object v0, p1

    .line 104
    move-object p1, v6

    .line 105
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->g:Lcom/zykj/base/BaseViewModel;

    .line 114
    .line 115
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->h:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 116
    .line 117
    invoke-virtual {p1, v0, v1}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    .line 119
    .line 120
    :cond_6
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    :goto_5
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 126
    .line 127
    return-object p1

    .line 128
    :goto_6
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    throw p1
.end method
