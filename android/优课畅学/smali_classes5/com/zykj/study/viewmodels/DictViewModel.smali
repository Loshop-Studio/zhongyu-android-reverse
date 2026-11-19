.class public final Lcom/zykj/study/viewmodels/DictViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/DictRepository;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/DictRepository;)V
    .locals 3

    .line 1
    const-string v0, "dictRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/DictViewModel;->a:Lcom/zykj/study/repository/DictRepository;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/repository/DictRepository;->g()Landroidx/lifecycle/LiveData;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lg5/y;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lg5/y;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lcom/zykj/study/viewmodels/DictViewModel$a;

    .line 21
    .line 22
    invoke-direct {v2, v1}, Lcom/zykj/study/viewmodels/DictViewModel$a;-><init>(Lx7/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LiveData;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/study/repository/DictRepository;->f()Landroidx/lifecycle/LiveData;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lg5/z;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lg5/z;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lcom/zykj/study/viewmodels/DictViewModel$a;

    .line 38
    .line 39
    invoke-direct {v2, v1}, Lcom/zykj/study/viewmodels/DictViewModel$a;-><init>(Lx7/l;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LiveData;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/study/repository/DictRepository;->h()Landroidx/lifecycle/LiveData;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Lg5/a0;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lg5/a0;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lcom/zykj/study/viewmodels/DictViewModel$a;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lcom/zykj/study/viewmodels/DictViewModel$a;-><init>(Lx7/l;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroidx/lifecycle/LiveData;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/viewmodels/DictViewModel;->d(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/viewmodels/DictViewModel;->e(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/viewmodels/DictViewModel;->f(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/DictViewModel;->c:Ljava/util/List;

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0
.end method

.method public static final e(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/DictViewModel;->d:Ljava/util/List;

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0
.end method

.method public static final f(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/DictViewModel;->b:Ljava/util/List;

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/zykj/study/viewmodels/DictViewModel;)Lcom/zykj/study/repository/DictRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->a:Lcom/zykj/study/repository/DictRepository;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(II)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->d:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Lcom/zykj/study/data/GradeEntity;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/zykj/study/data/GradeEntity;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v3, p2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v1

    .line 35
    :goto_0
    check-cast v2, Lcom/zykj/study/data/GradeEntity;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v2, v1

    .line 39
    :goto_1
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/zykj/study/data/GradeEntity;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_3
    iget-object p2, p0, Lcom/zykj/study/viewmodels/DictViewModel;->c:Ljava/util/List;

    .line 47
    .line 48
    if-eqz p2, :cond_6

    .line 49
    .line 50
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-interface {p2, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :cond_4
    invoke-interface {p2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v2, v0

    .line 69
    check-cast v2, Lcom/zykj/study/data/PeriodEntity;

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/study/data/PeriodEntity;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ne v2, p1, :cond_4

    .line 76
    .line 77
    move-object v1, v0

    .line 78
    :cond_5
    check-cast v1, Lcom/zykj/study/data/PeriodEntity;

    .line 79
    .line 80
    :cond_6
    if-eqz v1, :cond_8

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/zykj/study/data/PeriodEntity;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_7

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_7
    return-object p1

    .line 90
    :cond_8
    :goto_2
    const-string p1, ""

    .line 91
    .line 92
    return-object p1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(III)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/DictViewModel;->i(II)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p3}, Lcom/zykj/study/viewmodels/DictViewModel;->m(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, "  "

    .line 18
    .line 19
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lg8/c0;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m(I)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/DictViewModel;->b:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Lcom/zykj/study/data/SubjectEntity;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/zykj/study/data/SubjectEntity;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v3, p1, :cond_0

    .line 32
    .line 33
    move-object v1, v2

    .line 34
    :cond_1
    check-cast v1, Lcom/zykj/study/data/SubjectEntity;

    .line 35
    .line 36
    :cond_2
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/zykj/study/data/SubjectEntity;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return-object p1

    .line 46
    :cond_4
    :goto_0
    const-string p1, ""

    .line 47
    .line 48
    return-object p1
.end method

.method public final n()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/study/viewmodels/DictViewModel$initDict$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/viewmodels/DictViewModel$initDict$1;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    return-void
.end method
