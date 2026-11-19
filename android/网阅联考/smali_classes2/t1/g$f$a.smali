.class public final Lt1/g$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:I


# direct methods
.method public constructor <init>(Lt1/g$f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 5
    .line 6
    iput p2, p0, Lt1/g$f$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lt1/g$f$a;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 18
    .line 19
    iget-object v1, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 20
    .line 21
    invoke-static {v1}, Lt1/g$f;->c(Lt1/g$f;)Lm2/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Lm2/a;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/zykj/http/bean/HeaderLiveData;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/zykj/insight/network/RefreshRepositoryImpl;-><init>(Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 36
    .line 37
    iget v1, p0, Lt1/g$f$a;->b:I

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    iget-object v0, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 44
    .line 45
    invoke-static {v0}, Lt1/g$f;->i(Lt1/g$f;)Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 50
    .line 51
    invoke-static {v1}, Lt1/g$f;->g(Lt1/g$f;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 56
    .line 57
    invoke-static {v2}, Lt1/g$f;->h(Lt1/g$f;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v0, v1, v2}, Lu1/c;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Lr2/x;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :cond_2
    iget-object v0, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 67
    .line 68
    invoke-static {v0}, Lt1/g$f;->d(Lt1/g$f;)Lm2/a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lr2/x;

    .line 77
    .line 78
    invoke-static {v0}, Lu1/d;->a(Lr2/x;)Lj3/e0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :cond_3
    iget-object v0, p0, Lt1/g$f$a;->a:Lt1/g$f;

    .line 84
    .line 85
    invoke-static {v0}, Lt1/g$f;->e(Lt1/g$f;)Lm2/a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Lm2/a;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lj3/e0;

    .line 94
    .line 95
    invoke-static {v0}, Lu1/e;->a(Lj3/e0;)Lu1/g;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :cond_4
    invoke-static {}, Lu1/b;->a()Lcom/zykj/http/bean/HeaderLiveData;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method
