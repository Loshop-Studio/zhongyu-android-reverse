.class final Lcom/friday/document/service/FileManager$downloadMicroClass$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->d(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$downloadMicroClass$2"
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
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->d:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/service/FileManager$downloadMicroClass$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/service/FileManager$downloadMicroClass$2;-><init>(Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadMicroClass$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p1, p0, Lcom/friday/document/service/FileManager$downloadMicroClass$2;->d:Lcom/friday/common/entity/FileEntity;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v4, 0x4

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
