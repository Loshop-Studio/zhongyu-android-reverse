.class public final synthetic Lcom/zykj/mistake/feature/home/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field public final synthetic b:Lcom/zykj/mistake/main/MainShellViewModel;

.field public final synthetic c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

.field public final synthetic d:Lcom/zykj/mistake/feature/review/ReviewViewModel;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/home/e;->a:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/e;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    iput-object p3, p0, Lcom/zykj/mistake/feature/home/e;->c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    iput-object p4, p0, Lcom/zykj/mistake/feature/home/e;->d:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    iput-object p5, p0, Lcom/zykj/mistake/feature/home/e;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 12
    .line 13
    if-ne p2, p1, :cond_3

    .line 14
    .line 15
    sget-object p1, Lcom/zykj/mistake/feature/notebook/list/a1;->a:Lcom/zykj/mistake/feature/notebook/list/a1;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/zykj/mistake/feature/home/e;->a:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/e;->e:Landroidx/compose/runtime/State;

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 29
    .line 30
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_COLLECTION:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/e;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 34
    .line 35
    if-ne p2, v0, :cond_1

    .line 36
    .line 37
    iget-boolean p2, v2, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 38
    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iput-boolean v1, v2, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 43
    .line 44
    sget-object p2, Lcom/zykj/mistake/feature/collection/list/s;->a:Lcom/zykj/mistake/feature/collection/list/s;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/mistake/feature/home/e;->c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 47
    .line 48
    invoke-virtual {v0, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->a(Lcom/zykj/mistake/feature/collection/list/u;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 56
    .line 57
    sget-object p2, Lcom/zykj/mistake/feature/home/HomeTab;->REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 58
    .line 59
    if-ne p1, p2, :cond_3

    .line 60
    .line 61
    iget-boolean p1, v2, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 62
    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iput-boolean v1, v2, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 67
    .line 68
    sget-object p1, Lcom/zykj/mistake/feature/review/e;->a:Lcom/zykj/mistake/feature/review/e;

    .line 69
    .line 70
    iget-object p2, p0, Lcom/zykj/mistake/feature/home/e;->d:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/feature/review/ReviewViewModel;->a(Lcom/zykj/mistake/feature/review/h;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    return-void
.end method
