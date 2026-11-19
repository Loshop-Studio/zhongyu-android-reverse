# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/provide/ServerBeanSerializer;->b(Lcom/zykj/lib/login/proto/ServerBean;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.lib.login.provide.ServerBeanSerializer$writeTo$2"
    f = "ServerBeanSerializer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/lib/login/proto/ServerBean;

.field public final synthetic d:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/proto/ServerBean;Ljava/io/OutputStream;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->c:Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->d:Ljava/io/OutputStream;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->c:Lcom/zykj/lib/login/proto/ServerBean;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->d:Ljava/io/OutputStream;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;-><init>(Lcom/zykj/lib/login/proto/ServerBean;Ljava/io/OutputStream;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->a:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->c:Lcom/zykj/lib/login/proto/ServerBean;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/lib/login/provide/ServerBeanSerializer$writeTo$2;->d:Ljava/io/OutputStream;

    .line 18
    .line 19
    :try_start_0
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/google/protobuf/AbstractMessageLite;->writeTo(Ljava/io/OutputStream;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    sget-object v0, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method
