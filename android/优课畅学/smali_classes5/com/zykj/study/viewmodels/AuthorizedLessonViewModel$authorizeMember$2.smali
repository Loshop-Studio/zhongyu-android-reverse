.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->f(ILcom/zykj/study/bean/exercise/AuthorizeLesson;)V
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
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$authorizeMember$2"
    f = "AuthorizedLessonViewModel.kt"
    l = {
        0x6d
    }
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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->c(Li8/b0;Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->b:Ljava/lang/Object;

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
    iget v2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->a:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->c(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v2, Lcom/zykj/study/bean/UiState$Error;

    .line 38
    .line 39
    invoke-direct {v2, v0}, Lcom/zykj/study/bean/UiState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$2;->a:I

    .line 49
    .line 50
    invoke-interface {p1, v2, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v1, :cond_2

    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 58
    .line 59
    return-object p1
.end method
