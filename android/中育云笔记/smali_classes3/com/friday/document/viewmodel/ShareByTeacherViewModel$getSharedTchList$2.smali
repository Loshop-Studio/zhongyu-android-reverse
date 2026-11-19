.class final Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->i(Z)V
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
    c = "com.friday.document.viewmodel.ShareByTeacherViewModel$getSharedTchList$2"
    f = "ShareByTeacherViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;-><init>(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;->d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->h(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p1, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
