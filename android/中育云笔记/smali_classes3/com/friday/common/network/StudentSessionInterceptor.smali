.class public final Lcom/friday/common/network/StudentSessionInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# instance fields
.field public final a:Lcom/friday/common/network/StudentSession;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/network/StudentSession;)V
    .locals 1

    .line 1
    const-string v0, "studentSession"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/common/network/StudentSessionInterceptor;->a:Lcom/friday/common/network/StudentSession;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/friday/common/network/StudentSessionInterceptor;)Lcom/friday/common/network/StudentSession;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/network/StudentSessionInterceptor;->a:Lcom/friday/common/network/StudentSession;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public intercept(Lje/s$a;)Lje/y;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/common/network/StudentSessionInterceptor$intercept$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/friday/common/network/StudentSessionInterceptor$intercept$1;-><init>(Lcom/friday/common/network/StudentSessionInterceptor;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v1, v0, v2, v1}, Lsd/f;->f(Lkotlin/coroutines/d;Lhd/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method
