# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/RefreshRepositoryImp;->a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.repository.RefreshRepositoryImp$refreshToken$3$1$2"
    f = "RefreshRepositoryImp.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/bean/TokenResp;


# direct methods
.method public constructor <init>(Lcom/zykj/study/bean/TokenResp;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->c:Lcom/zykj/study/bean/TokenResp;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/lib/login/proto/ServerBean;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->c:Lcom/zykj/study/bean/TokenResp;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;-><init>(Lcom/zykj/study/bean/TokenResp;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/lib/login/proto/ServerBean;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->c(Lcom/zykj/lib/login/proto/ServerBean;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->c:Lcom/zykj/study/bean/TokenResp;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/study/bean/TokenResp;->getAccessToken()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setAccessToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;->c:Lcom/zykj/study/bean/TokenResp;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/study/bean/TokenResp;->getRefreshToken()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setRefreshToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "build(...)"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method
