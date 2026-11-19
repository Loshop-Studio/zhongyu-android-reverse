.class final Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareFileViewModel;->G(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareFileViewModel$getTchFileSharedFile$1"
    f = "ShareFileViewModel.kt"
    l = {
        0xb1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareFileViewModel;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->e:J

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->e:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->t(Lcom/friday/document/viewmodel/ShareFileViewModel;)Ls2/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-wide v3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->e:J

    .line 34
    .line 35
    iput v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;->c:I

    .line 36
    .line 37
    invoke-interface {p1, v3, v4, p0}, Ls2/b;->f(JLvc/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    return-object p1
.end method
