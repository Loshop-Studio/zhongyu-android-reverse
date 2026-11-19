.class final Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/DictRepository$initDict$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/l;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.repository.DictRepository$initDict$2$1$1"
    f = "DictRepository.kt"
    l = {
        0x25
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/study/bean/dict/DictBean;

.field public final synthetic e:Lcom/zykj/study/repository/DictRepository;


# direct methods
.method public constructor <init>(Lcom/zykj/study/bean/dict/DictBean;Lcom/zykj/study/repository/DictRepository;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->d:Lcom/zykj/study/bean/dict/DictBean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->e:Lcom/zykj/study/repository/DictRepository;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->d:Lcom/zykj/study/bean/dict/DictBean;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->e:Lcom/zykj/study/repository/DictRepository;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;-><init>(Lcom/zykj/study/bean/dict/DictBean;Lcom/zykj/study/repository/DictRepository;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm7/c;

    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->invoke(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->create(Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;

    sget-object v0, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, v0}, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

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
    iget-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->d:Lcom/zykj/study/bean/dict/DictBean;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/bean/dict/DictBean;->getPeriodList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    invoke-static {p1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lcom/zykj/study/bean/dict/PeriodBean;

    .line 63
    .line 64
    new-instance v4, Lcom/zykj/study/data/PeriodEntity;

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/zykj/study/bean/dict/PeriodBean;->getId()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v3}, Lcom/zykj/study/bean/dict/PeriodBean;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {v4, v5, v3}, Lcom/zykj/study/data/PeriodEntity;-><init>(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->e:Lcom/zykj/study/repository/DictRepository;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/zykj/study/repository/DictRepository;->d(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/PeriodEntityDao;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    iput v3, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->b:I

    .line 95
    .line 96
    iput v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$1$1;->c:I

    .line 97
    .line 98
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/PeriodEntityDao;->insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_3

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_3
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 106
    .line 107
    return-object p1
.end method
