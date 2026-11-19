.class final Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1$3"
    f = "TxtEditActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/viewer/TxtEditActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

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
    new-instance p1, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "\u672c\u5730\u6587\u4ef6\u4e22\u5931"

    .line 12
    .line 13
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 22
    .line 23
    return-object p1

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
.end method
