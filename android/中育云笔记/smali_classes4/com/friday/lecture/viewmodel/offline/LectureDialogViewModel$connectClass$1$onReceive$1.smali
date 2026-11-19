.class final Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->a(Li2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.lecture.viewmodel.offline.LectureDialogViewModel$connectClass$1$onReceive$1"
    f = "LectureDialogViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Li2/a;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;


# direct methods
.method public constructor <init>(Li2/a;Lhd/l;Ljava/lang/String;Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->d:Li2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->e:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->g:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->d:Li2/a;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->e:Lhd/l;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->g:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;-><init>(Li2/a;Lhd/l;Ljava/lang/String;Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->d:Li2/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Li2/a;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->d:Li2/a;

    .line 26
    .line 27
    invoke-virtual {v0}, Li2/a;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1, v0}, Lcom/friday/common/helper/b;->C(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->e:Lhd/l;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;->g:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->h(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method
