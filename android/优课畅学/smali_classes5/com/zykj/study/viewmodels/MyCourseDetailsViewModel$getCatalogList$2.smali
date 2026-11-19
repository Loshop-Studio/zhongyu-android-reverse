.class final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g(I)V
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
    c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$getCatalogList$2"
    f = "MyCourseDetailsViewModel.kt"
    l = {}
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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->c(Li8/b0;Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;->c:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1, v0}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method
