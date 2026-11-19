.class final Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/DictRepository$initDict$2$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.repository.DictRepository$initDict$2$3$1"
    f = "DictRepository.kt"
    l = {
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/repository/DictRepository;

.field public final synthetic c:Lcom/zykj/study/bean/dict/DictBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/repository/DictRepository;Lcom/zykj/study/bean/dict/DictBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->b:Lcom/zykj/study/repository/DictRepository;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->c:Lcom/zykj/study/bean/dict/DictBean;

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
    new-instance v0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->b:Lcom/zykj/study/repository/DictRepository;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->c:Lcom/zykj/study/bean/dict/DictBean;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;-><init>(Lcom/zykj/study/repository/DictRepository;Lcom/zykj/study/bean/dict/DictBean;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm7/c;

    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->invoke(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->create(Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;

    sget-object v0, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, v0}, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->a:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->b:Lcom/zykj/study/repository/DictRepository;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/repository/DictRepository;->e(Lcom/zykj/study/repository/DictRepository;)Lcom/zykj/study/data/SubjectEntityDao;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->c:Lcom/zykj/study/bean/dict/DictBean;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/zykj/study/bean/dict/DictBean;->getSubjectList()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2$3$1;->a:I

    .line 40
    .line 41
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/SubjectEntityDao;->insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 49
    .line 50
    return-object p1
.end method
