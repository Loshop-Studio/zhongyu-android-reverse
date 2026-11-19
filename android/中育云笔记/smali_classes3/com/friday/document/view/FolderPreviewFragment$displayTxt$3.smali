.class final Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/FolderPreviewFragment;->P(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.view.FolderPreviewFragment$displayTxt$3"
    f = "FolderPreviewFragment.kt"
    l = {
        0x15f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;

.field public final synthetic f:Lcom/friday/document/view/FolderPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->e:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->f:Lcom/friday/document/view/FolderPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->e:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->f:Lcom/friday/document/view/FolderPreviewFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->d:I

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
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

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
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->e:Lcom/friday/common/entity/FileEntity;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v3, 0x6

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-static {p1, v4, v1, v3, v4}, Lz1/b;->k(Ljava/lang/String;Ljava/nio/charset/Charset;ZILjava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v3, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3$1;

    .line 49
    .line 50
    iget-object v5, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->f:Lcom/friday/document/view/FolderPreviewFragment;

    .line 51
    .line 52
    invoke-direct {v3, v5, p1, v4}, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3$1;-><init>(Lcom/friday/document/view/FolderPreviewFragment;Ljava/lang/String;Lvc/c;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iput v2, p0, Lcom/friday/document/view/FolderPreviewFragment$displayTxt$3;->d:I

    .line 62
    .line 63
    invoke-static {v1, v3, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_2

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 71
    .line 72
    return-object p1
.end method
