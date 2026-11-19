.class final Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseViewViewModel;->h(I)V
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
    c = "com.zykj.study.viewmodels.CourseViewViewModel$updateCatalogProgress$1$1"
    f = "CourseViewViewModel.kt"
    l = {
        0x25
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/CourseViewViewModel;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseViewViewModel;IILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->c:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->d:I

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->e:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->c:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->d:I

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->e:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;-><init>(Lcom/zykj/study/viewmodels/CourseViewViewModel;IILm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->c:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->c:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->e()Lcom/zykj/study/repository/TeachCourseRepository;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget v3, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->d:I

    .line 44
    .line 45
    iget v4, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->e:I

    .line 46
    .line 47
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iput v2, p0, Lcom/zykj/study/viewmodels/CourseViewViewModel$updateCatalogProgress$1$1;->b:I

    .line 50
    .line 51
    invoke-virtual {v1, v3, v4, p0}, Lcom/zykj/study/repository/TeachCourseRepository;->c(IILm7/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-ne v1, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    move-object v0, p1

    .line 59
    move-object p1, v1

    .line 60
    :goto_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 64
    .line 65
    return-object p1
.end method
