.class final Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/SecureTextFieldController;->observeHideEvents(Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2"
    f = "BasicSecureTextField.kt"
    l = {
        0xf2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text/SecureTextFieldController;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/SecureTextFieldController;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/SecureTextFieldController;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->this$0:Landroidx/compose/foundation/text/SecureTextFieldController;

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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->this$0:Landroidx/compose/foundation/text/SecureTextFieldController;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;-><init>(Landroidx/compose/foundation/text/SecureTextFieldController;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqc/q;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->invoke(Lqc/q;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lqc/q;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/q;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->label:I

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
    iput v2, p0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->label:I

    .line 28
    .line 29
    const-wide/16 v1, 0x5dc

    .line 30
    .line 31
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/text/SecureTextFieldController$observeHideEvents$2;->this$0:Landroidx/compose/foundation/text/SecureTextFieldController;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/compose/foundation/text/SecureTextFieldController;->getPasswordInputTransformation()Landroidx/compose/foundation/text/PasswordInputTransformation;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroidx/compose/foundation/text/PasswordInputTransformation;->hide()V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 48
    .line 49
    return-object p1
.end method
