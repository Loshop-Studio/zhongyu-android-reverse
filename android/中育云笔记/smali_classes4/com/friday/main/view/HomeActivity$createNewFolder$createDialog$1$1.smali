.class final Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity;->j0(Landroid/widget/PopupWindow;)V
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
    c = "com.friday.main.view.HomeActivity$createNewFolder$createDialog$1$1"
    f = "HomeActivity.kt"
    l = {
        0x282
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
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->g:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->e:I

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
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/friday/main/viewmodel/HomeViewModel;

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
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/friday/main/view/HomeActivity;->h0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/viewmodel/HomeViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/friday/main/view/HomeActivity;->r0()Lj2/f;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iput-object v1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->d:Ljava/lang/Object;

    .line 52
    .line 53
    iput v2, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->e:I

    .line 54
    .line 55
    invoke-interface {v3, p0}, Lj2/f;->a(Lvc/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-ne v2, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    move-object v0, p1

    .line 63
    move-object p1, v2

    .line 64
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;->f:Lcom/friday/main/view/HomeActivity;

    .line 67
    .line 68
    invoke-static {v2}, Lcom/friday/main/view/HomeActivity;->i0(Lcom/friday/main/view/HomeActivity;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/friday/main/viewmodel/HomeViewModel;->o(Ljava/lang/String;Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 76
    .line 77
    return-object p1
.end method
