.class final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1$zipFilePath$1"
    f = "PickNoteViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->g:Landroid/net/Uri;

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
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->g:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->c:I

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->f:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;->g:Landroid/net/Uri;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :try_start_0
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "/"

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, ".zip"

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Ljava/io/File;

    .line 68
    .line 69
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromIS(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 73
    .line 74
    .line 75
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_0
    return-object p1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 82
    .line 83
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move-object v2, p1

    .line 99
    :goto_0
    return-object v2

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1
.end method
