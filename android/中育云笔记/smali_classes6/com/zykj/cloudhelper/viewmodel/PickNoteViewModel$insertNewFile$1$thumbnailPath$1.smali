.class final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;
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
    c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1$thumbnailPath$1"
    f = "PickNoteViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->g:Ljava/lang/String;

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
    new-instance v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsd/i0;

    .line 6
    .line 7
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->c:I

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->e:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->f:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;->g:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    :try_start_0
    sget-object v4, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v6, ".jpg"

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v2, v4}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    new-instance v2, Lk2/t;

    .line 77
    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {v2, p1, v3}, Lk2/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lk2/t;->d()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1, v5}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_0

    .line 114
    .line 115
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    return-object v3

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    return-object v5

    .line 122
    :goto_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 123
    .line 124
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    move-object v3, p1

    .line 140
    :goto_1
    return-object v3

    .line 141
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 144
    .line 145
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1
.end method
