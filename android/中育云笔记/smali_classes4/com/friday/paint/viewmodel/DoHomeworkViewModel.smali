.class public final Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/UserDao;

.field public c:Lcom/friday/common/classtest/MqttResponse;

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:Z

.field public i:Z

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public k:Ljava/util/ArrayList;

.field public l:Z

.field public m:Ljava/util/ArrayList;

.field public final n:Lvd/l;

.field public final o:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/UserDao;)V
    .locals 1

    .line 1
    const-string v0, "userDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f:Z

    .line 13
    .line 14
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->m:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->n:Lvd/l;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o:Lvd/u;

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic e(Lcom/friday/paint/viewmodel/DoHomeworkViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A(Lcom/friday/common/classtest/MqttResponse;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->n:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/friday/common/classtest/MqttResponse;

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-void
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Lcom/friday/common/classtest/MqttResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->c:Lcom/friday/common/classtest/MqttResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final q(Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/viewmodel/DoHomeworkViewModel$getScreensPermission$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel$getScreensPermission$2;-><init>(Lcom/friday/paint/viewmodel/DoHomeworkViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final t(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public final v(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final w(Lcom/friday/common/classtest/MqttResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->c:Lcom/friday/common/classtest/MqttResponse;

    .line 2
    .line 3
    return-void
.end method

.method public final x(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final y(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public final z(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f:Z

    .line 2
    .line 3
    return-void
.end method
