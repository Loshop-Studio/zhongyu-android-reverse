.class final Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/TxtEditActivity;->initData()V
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
    c = "com.friday.document.view.viewer.TxtEditActivity$initData$4$1"
    f = "TxtEditActivity.kt"
    l = {
        0x96
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/viewer/TxtEditActivity;

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->e:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->c:I

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
    iget-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x6

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v1, v5, v3, v4, v5}, Lz1/b;->k(Ljava/lang/String;Ljava/nio/charset/Charset;ZILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {p1, v1}, Lcom/friday/document/view/viewer/TxtEditActivity;->X(Lcom/friday/document/view/viewer/TxtEditActivity;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v1, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1$1;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->d:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 52
    .line 53
    invoke-direct {v1, v3, v5}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

    .line 54
    .line 55
    .line 56
    iput v2, p0, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;->c:I

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p1
.end method
