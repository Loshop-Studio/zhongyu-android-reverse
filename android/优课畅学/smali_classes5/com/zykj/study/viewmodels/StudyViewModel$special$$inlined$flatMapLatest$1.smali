# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


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
        "Lx7/q;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.StudyViewModel$special$$inlined$flatMapLatest$1"
    f = "StudyViewModel.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/study/viewmodels/StudyViewModel;


# direct methods
.method public constructor <init>(Lm7/c;Lcom/zykj/study/viewmodels/StudyViewModel;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll8/d;

    check-cast p3, Lm7/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->invoke(Ll8/d;Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll8/d;Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance v0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/study/viewmodels/StudyViewModel;

    invoke-direct {v0, p3, v1}, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;-><init>(Lm7/c;Lcom/zykj/study/viewmodels/StudyViewModel;)V

    iput-object p1, v0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    sget-object p1, Lh7/p;->a:Lh7/p;

    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->a:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ll8/d;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ll8/d;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, Lcom/zykj/study/data/CourseStudyEntity;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->d:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/StudyViewModel;->i()Ll8/c;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    new-instance v5, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;

    .line 49
    .line 50
    invoke-direct {v5, v4, v3}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1;-><init>(Ll8/c;Lcom/zykj/study/data/CourseStudyEntity;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v3, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v3, v4}, Lcom/zykj/study/viewmodels/StudyViewModel$courseStudyList$1$2;-><init>(Lm7/c;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Ll8/e;->B(Lx7/p;)Ll8/c;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :goto_0
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput-object v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    iput v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;->a:I

    .line 77
    .line 78
    invoke-static {p1, v5, p0}, Ll8/e;->u(Ll8/d;Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_3

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 86
    .line 87
    return-object p1
.end method
