.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->h(Ljava/lang/String;)V
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
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$doSearch$2"
    f = "AuthorizedLessonViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->c(Li8/b0;Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lcom/zykj/study/bean/UiState;

    .line 27
    .line 28
    new-instance v2, Lcom/zykj/study/bean/UiState$Error;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Lcom/zykj/study/bean/UiState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->q()Ll8/h;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-static {v0}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v1, p1, v0}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
