# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/MainViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public a:Ll8/h;

.field public final b:Landroidx/datastore/core/DataStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll8/h;Landroidx/datastore/core/DataStore;)V
    .locals 7

    .line 1
    const-string v0, "headerBeanFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serverDataStore"

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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MainViewModel;->a:Ll8/h;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/MainViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v4, Lcom/zykj/study/viewmodels/MainViewModel$1;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/viewmodels/MainViewModel$1;-><init>(Lcom/zykj/study/viewmodels/MainViewModel;Lm7/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/MainViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/MainViewModel;->a:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/viewmodels/MainViewModel;)Landroidx/datastore/core/DataStore;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/MainViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/viewmodels/MainViewModel$initServer$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/study/viewmodels/MainViewModel$initServer$1;-><init>(Lcom/zykj/study/viewmodels/MainViewModel;Lm7/c;)V

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
