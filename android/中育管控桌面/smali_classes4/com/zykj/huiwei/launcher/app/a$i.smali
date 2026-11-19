# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/app/a$i;
.super Lr3/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$i;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Landroid/app/Service;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr3/f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->b:Lcom/zykj/huiwei/launcher/app/a$i;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/huiwei/launcher/server/MyService;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$i;->c(Lcom/zykj/huiwei/launcher/server/MyService;)Lcom/zykj/huiwei/launcher/server/MyService;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b()Lw3/a;
    .locals 2

    .line 1
    new-instance v0, Lw3/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->r:La5/f;

    .line 6
    .line 7
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/zykj/huiwei/launcher/api/DeviceService;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lw3/a;-><init>(Lcom/zykj/huiwei/launcher/api/DeviceService;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final c(Lcom/zykj/huiwei/launcher/server/MyService;)Lcom/zykj/huiwei/launcher/server/MyService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 4
    .line 5
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lx3/u;->d(Lcom/zykj/huiwei/launcher/server/MyService;Landroidx/datastore/core/DataStore;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 17
    .line 18
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lx3/u;->f(Lcom/zykj/huiwei/launcher/server/MyService;Landroidx/datastore/core/DataStore;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->f:La5/f;

    .line 30
    .line 31
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 36
    .line 37
    invoke-static {p1, v0}, Lx3/u;->e(Lcom/zykj/huiwei/launcher/server/MyService;Landroidx/datastore/core/DataStore;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->h:La5/f;

    .line 43
    .line 44
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 49
    .line 50
    invoke-static {p1, v0}, Lx3/u;->b(Lcom/zykj/huiwei/launcher/server/MyService;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$i;->d()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p1, v0}, Lx3/u;->g(Lcom/zykj/huiwei/launcher/server/MyService;Lcom/zykj/huiwei/launcher/repository/UserRepository;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$i;->b()Lw3/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1, v0}, Lx3/u;->a(Lcom/zykj/huiwei/launcher/server/MyService;Lw3/a;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->k:La5/f;

    .line 70
    .line 71
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lq3/a;

    .line 76
    .line 77
    invoke-static {p1, v0}, Lx3/u;->c(Lcom/zykj/huiwei/launcher/server/MyService;Lq3/a;)V

    .line 78
    .line 79
    .line 80
    return-object p1
.end method

.method public d()Lcom/zykj/huiwei/launcher/repository/UserRepository;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$i;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->l:La5/f;

    .line 6
    .line 7
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/zykj/huiwei/launcher/api/UserService;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/repository/UserRepository;-><init>(Lcom/zykj/huiwei/launcher/api/UserService;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
