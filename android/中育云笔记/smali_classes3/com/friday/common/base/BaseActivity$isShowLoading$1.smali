.class final Lcom/friday/common/base/BaseActivity$isShowLoading$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V
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
    c = "com.friday.common.base.BaseActivity$isShowLoading$1"
    f = "BaseActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Z

.field public final synthetic e:Lcom/friday/common/base/BaseActivity;


# direct methods
.method public constructor <init>(ZLcom/friday/common/base/BaseActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->d:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->e:Lcom/friday/common/base/BaseActivity;

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
    new-instance p1, Lcom/friday/common/base/BaseActivity$isShowLoading$1;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->d:Z

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->e:Lcom/friday/common/base/BaseActivity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/common/base/BaseActivity$isShowLoading$1;-><init>(ZLcom/friday/common/base/BaseActivity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/base/BaseActivity$isShowLoading$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->d:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->e:Lcom/friday/common/base/BaseActivity;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p1, v0}, Lcom/friday/common/base/BaseActivity;->access$showLoading(Lcom/friday/common/base/BaseActivity;Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/friday/common/base/BaseActivity$isShowLoading$1;->e:Lcom/friday/common/base/BaseActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/friday/common/base/BaseActivity;->access$hideLoading(Lcom/friday/common/base/BaseActivity;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
