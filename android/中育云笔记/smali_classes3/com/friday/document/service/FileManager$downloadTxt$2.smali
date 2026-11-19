.class final Lcom/friday/document/service/FileManager$downloadTxt$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->b(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$downloadTxt$2"
    f = "FileManager.kt"
    l = {
        0x13e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;

.field public final synthetic f:Lcom/friday/document/service/FileManager;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->f:Lcom/friday/document/service/FileManager;

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
    new-instance p1, Lcom/friday/document/service/FileManager$downloadTxt$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->f:Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/service/FileManager$downloadTxt$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadTxt$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadTxt$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadTxt$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadTxt$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->d:I

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
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->c:Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v7, 0x4

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v3 .. v8}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->f:Lcom/friday/document/service/FileManager;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->e:Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v3, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->c:Ljava/lang/Object;

    .line 72
    .line 73
    iput v2, p0, Lcom/friday/document/service/FileManager$downloadTxt$2;->d:I

    .line 74
    .line 75
    invoke-interface {p1, v1, v2, p0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 83
    .line 84
    return-object p1
.end method
