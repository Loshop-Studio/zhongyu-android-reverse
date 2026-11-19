.class final Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/NewestViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;Lcom/friday/document/repositroy/FileRepository;)V
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
    c = "com.friday.document.viewmodel.NewestViewModel$allFiles$2$1"
    f = "NewestViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/viewmodel/NewestViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/NewestViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->e:Lcom/friday/document/viewmodel/NewestViewModel;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->e:Lcom/friday/document/viewmodel/NewestViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;-><init>(Lcom/friday/document/viewmodel/NewestViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/common/entity/FileEntity;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/viewmodel/NewestViewModel$allFiles$2$1;->e:Lcom/friday/document/viewmodel/NewestViewModel;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->b0(Lcom/friday/common/entity/FileEntity;)Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
