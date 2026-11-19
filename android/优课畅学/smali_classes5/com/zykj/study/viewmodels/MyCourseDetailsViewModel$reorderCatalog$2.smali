.class final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->o(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/q;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$reorderCatalog$2"
    f = "MyCourseDetailsViewModel.kt"
    l = {
        0x84
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Li8/b0;Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/b0;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lm7/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c(Li8/b0;Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->a:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    instance-of p1, v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    move-object p1, v0

    .line 36
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/16 v2, 0x3ff

    .line 47
    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    :try_start_1
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 51
    .line 52
    iput-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->b:Ljava/lang/Object;

    .line 53
    .line 54
    iput v3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->a:I

    .line 55
    .line 56
    invoke-static {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->b(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :catch_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p1, v0}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1, v0}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_0
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method
