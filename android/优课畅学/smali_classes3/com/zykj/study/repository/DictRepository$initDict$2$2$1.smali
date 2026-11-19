.class final Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/DictRepository$initDict$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.repository.DictRepository$initDict$2$2$1"
    f = "DictRepository.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/zykj/study/bean/dict/DictBean;

.field public final synthetic j:Lcom/zykj/study/repository/DictRepository;


# direct methods
.method public constructor <init>(Lcom/zykj/study/bean/dict/DictBean;Lcom/zykj/study/repository/DictRepository;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->i:Lcom/zykj/study/bean/dict/DictBean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->j:Lcom/zykj/study/repository/DictRepository;

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
    new-instance v0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->i:Lcom/zykj/study/bean/dict/DictBean;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->j:Lcom/zykj/study/repository/DictRepository;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;-><init>(Lcom/zykj/study/bean/dict/DictBean;Lcom/zykj/study/repository/DictRepository;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm7/c;

    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->invoke(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->create(Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;

    sget-object v0, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, v0}, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->h:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->f:I

    .line 14
    .line 15
    iget-object v4, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lcom/zykj/study/bean/dict/PeriodBean;

    .line 18
    .line 19
    iget-object v4, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/util/Iterator;

    .line 22
    .line 23
    iget-object v5, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Lcom/zykj/study/repository/DictRepository;

    .line 26
    .line 27
    iget-object v6, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->i:Lcom/zykj/study/bean/dict/DictBean;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/bean/dict/DictBean;->getPeriodList()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->j:Lcom/zykj/study/repository/DictRepository;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v6, p1

    .line 59
    move-object v5, v1

    .line 60
    move v1, v2

    .line 61
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    move-object v7, p1

    .line 72
    check-cast v7, Lcom/zykj/study/bean/dict/PeriodBean;

    .line 73
    .line 74
    invoke-static {v5}, Lcom/zykj/study/repository/DictRepository;->c(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/GradeEntityDao;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v7}, Lcom/zykj/study/bean/dict/PeriodBean;->getChildren()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iput-object v10, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v5, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->b:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v4, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->d:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->e:Ljava/lang/Object;

    .line 103
    .line 104
    iput v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->f:I

    .line 105
    .line 106
    iput v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->g:I

    .line 107
    .line 108
    iput v3, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$2$1;->h:I

    .line 109
    .line 110
    invoke-interface {v8, v9, p0}, Lcom/zykj/study/data/GradeEntityDao;->insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v0, :cond_2

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 118
    .line 119
    return-object p1
.end method
