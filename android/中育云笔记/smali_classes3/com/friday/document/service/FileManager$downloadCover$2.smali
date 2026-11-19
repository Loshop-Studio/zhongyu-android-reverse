.class final Lcom/friday/document/service/FileManager$downloadCover$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$downloadCover$2"
    f = "FileManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/service/FileManager$downloadCover$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/service/FileManager$downloadCover$2;-><init>(Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadCover$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadCover$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadCover$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadCover$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, ".jpg"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getMicroClassCoverUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v3, p0, Lcom/friday/document/service/FileManager$downloadCover$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v2, p1}, Lcom/friday/common/helper/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v2, p1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object v2, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2, v1, v0, p1}, Lcom/friday/common/helper/d;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method
