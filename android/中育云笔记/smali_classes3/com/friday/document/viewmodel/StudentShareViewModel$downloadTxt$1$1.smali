.class final Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1$1"
    f = "StudentShareViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/model/ShareFile;

.field public final synthetic e:Lcom/friday/document/viewmodel/StudentShareViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->e:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->e:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->e:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->l(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ".txt"

    .line 47
    .line 48
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v4, 0x4

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static/range {v0 .. v5}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method
