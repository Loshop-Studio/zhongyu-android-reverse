# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/HomeViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Landroidx/datastore/core/DataStore;

.field public final b:Lo4/k;

.field public final c:Ll8/g;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:I

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Lo4/k;)V
    .locals 1

    .line 1
    const-string v0, "userDataStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updateApi"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->b:Lo4/k;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 p2, 0x7

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v0, v0, p1, p2, p1}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->c:Ll8/g;

    .line 26
    .line 27
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    sget p1, Lcom/zykj/study/R$color;->menu_text_color_select:I

    .line 39
    .line 40
    iput p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->e:I

    .line 41
    .line 42
    sget p1, Lcom/zykj/study/R$color;->menu_text_color_normal:I

    .line 43
    .line 44
    iput p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->f:I

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/HomeViewModel;)Lo4/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->b:Lo4/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;-><init>(Lcom/zykj/study/viewmodels/HomeViewModel;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c()Ll8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->c:Ll8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
