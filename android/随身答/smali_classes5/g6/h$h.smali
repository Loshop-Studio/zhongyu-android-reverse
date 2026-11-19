.class public final Lg6/h$h;
.super Lg6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/h$h$a;
    }
.end annotation


# instance fields
.field public final a:Lx7/a;

.field public final b:Lg6/h$h;

.field public c:Lz7/f;

.field public d:Lz7/f;

.field public e:Lz7/f;

.field public f:Lz7/f;

.field public g:Lz7/f;

.field public h:Lz7/f;

.field public i:Lz7/f;

.field public j:Lz7/f;

.field public k:Lz7/f;


# direct methods
.method public constructor <init>(Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 5
    .line 6
    iput-object p1, p0, Lg6/h$h;->a:Lx7/a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lg6/h$h;->g(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lg6/h$h;)Lx7/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lg6/h$h;->a:Lx7/a;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/zykj/student/dialogue/App;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg6/h$h;->h(Lcom/zykj/student/dialogue/App;)Lcom/zykj/student/dialogue/App;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c()Lu7/b;
    .locals 3

    .line 1
    new-instance v0, Lg6/h$c;

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lg6/h$c;-><init>(Lg6/h$h;Lg6/i;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public e()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Ly5/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lg6/h$h;->i(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public f()Landroidx/hilt/work/HiltWorkerFactory;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg6/h$h;->l()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/hilt/work/WorkerFactoryModule_ProvideFactoryFactory;->provideFactory(Ljava/util/Map;)Landroidx/hilt/work/HiltWorkerFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final g(Lx7/a;)V
    .locals 2

    .line 1
    new-instance p1, Lg6/h$h$a;

    .line 2
    .line 3
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lg6/h$h;->c:Lz7/f;

    .line 14
    .line 15
    new-instance p1, Lg6/h$h$a;

    .line 16
    .line 17
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lg6/h$h;->d:Lz7/f;

    .line 28
    .line 29
    new-instance p1, Lg6/h$h$a;

    .line 30
    .line 31
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lg6/h$h;->e:Lz7/f;

    .line 42
    .line 43
    new-instance p1, Lg6/h$h$a;

    .line 44
    .line 45
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lg6/h$h;->f:Lz7/f;

    .line 56
    .line 57
    new-instance p1, Lg6/h$h$a;

    .line 58
    .line 59
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lg6/h$h;->g:Lz7/f;

    .line 70
    .line 71
    new-instance p1, Lg6/h$h$a;

    .line 72
    .line 73
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lg6/h$h;->h:Lz7/f;

    .line 84
    .line 85
    new-instance p1, Lg6/h$h$a;

    .line 86
    .line 87
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 88
    .line 89
    const/4 v1, 0x6

    .line 90
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lz7/g;->a(Lz7/f;)Lz7/f;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lg6/h$h;->i:Lz7/f;

    .line 98
    .line 99
    new-instance p1, Lg6/h$h$a;

    .line 100
    .line 101
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 102
    .line 103
    const/4 v1, 0x7

    .line 104
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Lg6/h$h;->j:Lz7/f;

    .line 112
    .line 113
    new-instance p1, Lg6/h$h$a;

    .line 114
    .line 115
    iget-object v0, p0, Lg6/h$h;->b:Lg6/h$h;

    .line 116
    .line 117
    const/16 v1, 0x8

    .line 118
    .line 119
    invoke-direct {p1, v0, v1}, Lg6/h$h$a;-><init>(Lg6/h$h;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lz7/b;->b(Lz7/f;)Lz7/f;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lg6/h$h;->k:Lz7/f;

    .line 127
    .line 128
    return-void
.end method

.method public final h(Lcom/zykj/student/dialogue/App;)Lcom/zykj/student/dialogue/App;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/h$h;->h:Lz7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lg6/g;->a(Lcom/zykj/student/dialogue/App;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lg6/h$h;->f()Landroidx/hilt/work/HiltWorkerFactory;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lg6/g;->b(Lcom/zykj/student/dialogue/App;Landroidx/hilt/work/HiltWorkerFactory;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final i(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/h$h;->c:Lz7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/http/bean/HeaderLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ly5/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final j(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/h$h;->c:Lz7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/http/bean/HeaderLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ly5/d;->a(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lg6/h$h;->d:Lz7/f;

    .line 13
    .line 14
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lz5/a;

    .line 19
    .line 20
    invoke-static {p1, v0}, Ly5/d;->b(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;Lz5/a;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public final k(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lcom/zykj/http/interceptor/NetworkInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/h$h;->a:Lx7/a;

    .line 2
    .line 3
    invoke-static {v0}, Lx7/b;->a(Lx7/a;)Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Ly5/f;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Landroid/app/Application;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public l()Ljava/util/Map;
    .locals 2

    .line 1
    const-string v0, "com.zykj.student.dialogue.upload.UploadWork"

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$h;->i:Lz7/f;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public m()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Ly5/c;->a()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lg6/h$h;->j(Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public n()Lcom/zykj/http/interceptor/NetworkInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Ly5/e;->a()Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lg6/h$h;->k(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public o()Ll8/v;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg6/h$h;->n()Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lg6/h$h;->e()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lg6/h$h;->m()Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, v1, v2}, Lk6/d;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Ll8/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
