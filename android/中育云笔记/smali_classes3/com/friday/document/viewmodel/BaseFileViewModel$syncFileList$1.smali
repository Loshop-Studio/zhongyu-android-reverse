.class final Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->A0()V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$syncFileList$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x9e,
        0x9f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/BaseFileViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 35
    .line 36
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->c:I

    .line 60
    .line 61
    const-wide/16 v3, 0x1f4

    .line 62
    .line 63
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    :goto_0
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v1, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;

    .line 75
    .line 76
    iget-object v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v1, v3, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 80
    .line 81
    .line 82
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->c:I

    .line 83
    .line 84
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_5

    .line 89
    .line 90
    :goto_1
    return-object v0

    .line 91
    :cond_5
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 92
    .line 93
    return-object p1
.end method
