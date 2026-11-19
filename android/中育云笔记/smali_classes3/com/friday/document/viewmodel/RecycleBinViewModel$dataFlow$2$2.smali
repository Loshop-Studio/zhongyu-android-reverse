.class final Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/RecycleBinViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V
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
    c = "com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$2"
    f = "RecycleBinViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, v0

    .line 4
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 5
    .line 6
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$dataFlow$2$2;->c:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 17
    .line 18
    const/4 v5, 0x3

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/adapter/MultiModeFileEntity;-><init>(ZZLcom/friday/common/entity/FileEntity;ILkotlin/jvm/internal/n;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
