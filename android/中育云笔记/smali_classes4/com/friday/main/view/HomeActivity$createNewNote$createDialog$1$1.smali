.class final Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity;->l0(Landroid/widget/PopupWindow;)V
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
    c = "com.friday.main.view.HomeActivity$createNewNote$createDialog$1$1"
    f = "HomeActivity.kt"
    l = {
        0x29b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/main/view/HomeActivity;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->g:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->e:I

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
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/friday/common/helper/c;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/friday/main/view/HomeActivity;->g0(Lcom/friday/main/view/HomeActivity;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const-string v1, ""

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->g:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v2, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 50
    .line 51
    const-string v3, "0"

    .line 52
    .line 53
    invoke-virtual {p1, v1, v3, v0, v2}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/friday/main/view/HomeActivity;->g0(Lcom/friday/main/view/HomeActivity;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, v2, :cond_4

    .line 64
    .line 65
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 66
    .line 67
    iget-object v3, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/friday/main/view/HomeActivity;->r0()Lj2/f;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->d:Ljava/lang/Object;

    .line 76
    .line 77
    iput v2, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->e:I

    .line 78
    .line 79
    invoke-interface {v3, p0}, Lj2/f;->a(Lvc/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-ne v2, v0, :cond_3

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    move-object v0, v1

    .line 87
    move-object v1, p1

    .line 88
    move-object p1, v2

    .line 89
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v2, p0, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;->g:Ljava/lang/String;

    .line 92
    .line 93
    sget-object v3, Lcom/friday/common/entity/FromPage;->FROM_FOLDER:Lcom/friday/common/entity/FromPage;

    .line 94
    .line 95
    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p1
.end method
