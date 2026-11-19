.class public final Lt1/g$f;
.super Lt1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/g$f$a;
    }
.end annotation


# instance fields
.field public final a:Li2/a;

.field public final b:Lt1/g$f;

.field public c:Lm2/a;

.field public d:Lm2/a;

.field public e:Lm2/a;

.field public f:Lm2/a;

.field public g:Lm2/a;


# direct methods
.method public constructor <init>(Li2/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt1/d;-><init>()V

    .line 3
    iput-object p0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 4
    iput-object p1, p0, Lt1/g$f;->a:Li2/a;

    .line 5
    invoke-virtual {p0, p1}, Lt1/g$f;->k(Li2/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Li2/a;Lt1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt1/g$f;-><init>(Li2/a;)V

    return-void
.end method

.method public static bridge synthetic c(Lt1/g$f;)Lm2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt1/g$f;->c:Lm2/a;

    return-object p0
.end method

.method public static bridge synthetic d(Lt1/g$f;)Lm2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt1/g$f;->e:Lm2/a;

    return-object p0
.end method

.method public static bridge synthetic e(Lt1/g$f;)Lm2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt1/g$f;->f:Lm2/a;

    return-object p0
.end method

.method public static bridge synthetic f(Lt1/g$f;)Lm2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt1/g$f;->g:Lm2/a;

    return-object p0
.end method

.method public static bridge synthetic g(Lt1/g$f;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt1/g$f;->j()Lcom/zykj/http/interceptor/HeadInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h(Lt1/g$f;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt1/g$f;->o()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Lt1/g$f;)Lcom/zykj/http/interceptor/NetworkInterceptor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt1/g$f;->p()Lcom/zykj/http/interceptor/NetworkInterceptor;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lg2/b;
    .locals 3

    .line 1
    new-instance v0, Lt1/g$c;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lt1/g$c;-><init>(Lt1/g$f;Lt1/i;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public b(Lcom/zykj/insight/App;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lq1/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lt1/g$f;->l(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k(Li2/a;)V
    .locals 2

    .line 1
    new-instance p1, Lt1/g$f$a;

    .line 2
    .line 3
    iget-object v0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Lt1/g$f$a;-><init>(Lt1/g$f;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lt1/g$f;->c:Lm2/a;

    .line 14
    .line 15
    new-instance p1, Lt1/g$f$a;

    .line 16
    .line 17
    iget-object v0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {p1, v0, v1}, Lt1/g$f$a;-><init>(Lt1/g$f;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lt1/g$f;->d:Lm2/a;

    .line 28
    .line 29
    new-instance p1, Lt1/g$f$a;

    .line 30
    .line 31
    iget-object v0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {p1, v0, v1}, Lt1/g$f$a;-><init>(Lt1/g$f;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lt1/g$f;->e:Lm2/a;

    .line 42
    .line 43
    new-instance p1, Lt1/g$f$a;

    .line 44
    .line 45
    iget-object v0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-direct {p1, v0, v1}, Lt1/g$f$a;-><init>(Lt1/g$f;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lt1/g$f;->f:Lm2/a;

    .line 56
    .line 57
    new-instance p1, Lt1/g$f$a;

    .line 58
    .line 59
    iget-object v0, p0, Lt1/g$f;->b:Lt1/g$f;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-direct {p1, v0, v1}, Lt1/g$f$a;-><init>(Lt1/g$f;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lk2/a;->a(Lm2/a;)Lm2/a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lt1/g$f;->g:Lm2/a;

    .line 70
    .line 71
    return-void
.end method

.method public final l(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/g$f;->c:Lm2/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/http/bean/HeaderLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lq1/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final m(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/g$f;->c:Lm2/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/http/bean/HeaderLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lq1/d;->a(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lt1/g$f;->d:Lm2/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lr1/a;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lq1/d;->b(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;Lr1/a;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public final n(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lcom/zykj/http/interceptor/NetworkInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/g$f;->a:Li2/a;

    .line 2
    .line 3
    invoke-static {v0}, Li2/b;->a(Li2/a;)Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lq1/f;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Landroid/app/Application;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final o()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lq1/c;->a()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lt1/g$f;->m(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final p()Lcom/zykj/http/interceptor/NetworkInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lq1/e;->a()Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lt1/g$f;->n(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
