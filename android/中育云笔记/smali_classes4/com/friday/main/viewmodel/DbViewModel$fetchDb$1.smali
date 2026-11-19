.class final Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/DbViewModel;->m()V
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
    c = "com.friday.main.viewmodel.DbViewModel$fetchDb$1"
    f = "DbViewModel.kt"
    l = {
        0x28
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/main/viewmodel/DbViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

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
    new-instance p1, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->c:I

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
    goto :goto_0

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
    iget-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/main/viewmodel/DbViewModel;->e(Lcom/friday/main/viewmodel/DbViewModel;)Lcom/friday/common/dao/FileDao;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iput v2, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->c:I

    .line 44
    .line 45
    invoke-interface {p1, v3, v4, p0}, Lcom/friday/common/dao/FileDao;->m(JLvc/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;->d:Lcom/friday/main/viewmodel/DbViewModel;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/friday/main/viewmodel/DbViewModel;->i(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_3
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    move-object v2, v1

    .line 65
    check-cast v2, Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v0, v1, p1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 74
    .line 75
    return-object p1
.end method
