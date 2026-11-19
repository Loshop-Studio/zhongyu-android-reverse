.class final Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareFileViewModel;->L(Ljava/lang/String;J)V
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
    c = "com.friday.document.viewmodel.ShareFileViewModel$setFolderLevelById$1"
    f = "ShareFileViewModel.kt"
    l = {
        0x2b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareFileViewModel;

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->e:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->f:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->e:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->f:J

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;-><init>(Ljava/lang/String;Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->d:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "0"

    .line 31
    .line 32
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->e:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->t(Lcom/friday/document/viewmodel/ShareFileViewModel;)Ls2/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-wide v4, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->f:J

    .line 48
    .line 49
    iput v3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;->c:I

    .line 50
    .line 51
    invoke-interface {p1, v1, v4, v5, p0}, Ls2/b;->c(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    :goto_0
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    return-object v2
.end method
