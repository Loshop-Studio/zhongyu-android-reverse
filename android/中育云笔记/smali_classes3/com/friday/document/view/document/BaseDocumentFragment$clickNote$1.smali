.class final Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/BaseDocumentFragment;->z(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.view.document.BaseDocumentFragment$clickNote$1"
    f = "BaseDocumentFragment.kt"
    l = {
        0x98
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/BaseDocumentFragment;

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->e:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->c:I

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
    const-string p1, "\u70b9\u51fb\u4e8b\u4ef6\uff1aBaseDocumentFragment\u7684clickNote()"

    .line 28
    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 43
    .line 44
    iput v2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->c:I

    .line 45
    .line 46
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v1, "\u672c\u5730\u6587\u4ef6\u662f\u5426\u5b58\u5728"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 86
    .line 87
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    sget p1, Lcom/friday/document/R$string;->dis_net:I

    .line 94
    .line 95
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_3
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->d:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->y(Lcom/friday/common/entity/FileEntity;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 118
    .line 119
    return-object p1
.end method
