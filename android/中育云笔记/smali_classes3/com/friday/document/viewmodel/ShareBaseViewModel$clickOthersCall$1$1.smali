.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.ShareBaseViewModel$clickOthersCall$1$1"
    f = "ShareBaseViewModel.kt"
    l = {
        0x73
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareBaseViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

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
    new-instance v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/document/model/ShareFile;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->g(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 32
    .line 33
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput v3, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1$1;->c:I

    .line 40
    .line 41
    invoke-virtual {p1, v0, p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->w(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object p1
.end method
