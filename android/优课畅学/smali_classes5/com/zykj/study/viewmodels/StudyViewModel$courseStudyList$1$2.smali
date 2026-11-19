# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudyViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V
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
    c = "com.zykj.study.viewmodels.StudyViewModel$courseStudyList$1$2"
    f = "StudyViewModel.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll8/d;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->invoke(Ll8/d;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll8/d;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->a:I

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
    sget-object p1, Landroidx/paging/PagingData;->Companion:Landroidx/paging/PagingData$Companion;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/paging/PagingData$Companion;->empty()Landroidx/paging/PagingData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->b:Ljava/lang/Object;

    .line 42
    .line 43
    iput v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p1, p0}, Ll8/d;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 53
    .line 54
    return-object p1
.end method
