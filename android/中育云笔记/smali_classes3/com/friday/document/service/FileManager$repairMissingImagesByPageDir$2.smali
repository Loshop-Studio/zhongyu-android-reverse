.class final Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->f(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$repairMissingImagesByPageDir$2"
    f = "FileManager.kt"
    l = {
        0x244,
        0x245
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/service/FileManager;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->e:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->g:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->e:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->g:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;-><init>(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->d:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v8, p0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->e:Lcom/friday/document/service/FileManager;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object p1, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iput v3, p0, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->d:I

    .line 52
    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    const/4 v9, 0x2

    .line 56
    const/4 v10, 0x0

    .line 57
    move-object v8, p0

    .line 58
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    move-object v6, p1

    .line 66
    check-cast v6, Ljava/util/List;

    .line 67
    .line 68
    sget-object v3, Lcom/friday/document/repair/CommandImageRepairer;->a:Lcom/friday/document/repair/CommandImageRepairer;

    .line 69
    .line 70
    iget-object v4, v8, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 71
    .line 72
    iget-object v5, v8, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p1, v8, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->e:Lcom/friday/document/service/FileManager;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, v8, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->c:Ljava/lang/Object;

    .line 85
    .line 86
    iput v2, v8, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;->d:I

    .line 87
    .line 88
    invoke-virtual/range {v3 .. v8}, Lcom/friday/document/repair/CommandImageRepairer;->k(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v0, :cond_4

    .line 93
    .line 94
    :goto_1
    return-object v0

    .line 95
    :cond_4
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 96
    .line 97
    return-object p1
.end method
