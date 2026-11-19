.class public final Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Ll8/h;

.field public final b:Ll8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->a:Ll8/h;

    .line 11
    .line 12
    invoke-static {v0}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->b:Ll8/q;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->a:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->b:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel$setRefreshLessonList$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel$setRefreshLessonList$1;-><init>(Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;ZLm7/c;)V

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
