# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->E(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.sync.SyncStateOne$uploadSingleFile$2"
    f = "SyncStateOne.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->d:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;-><init>(Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lje/v$a;

    .line 12
    .line 13
    invoke-direct {p1}, Lje/v$a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v1, 0xc8

    .line 19
    .line 20
    invoke-virtual {p1, v1, v2, v0}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v1, v2, v0}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v1, v2, v0}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lje/v$a;->c()Lje/v;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;->d:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v2, "http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl="

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Lje/w$a;

    .line 56
    .line 57
    invoke-direct {v1}, Lje/w$a;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lje/w$a;->f()Lje/w$a;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v0}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lje/w$a;->b()Lje/w;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Lje/v;->b(Lje/w;)Lje/e;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lje/e;->execute()Lje/y;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/4 v0, 0x0

    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    invoke-virtual {p1}, Lje/z;->string()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    move-object p1, v0

    .line 93
    :goto_0
    const/4 v1, 0x1

    .line 94
    :try_start_0
    new-instance v2, Lcom/google/gson/Gson;

    .line 95
    .line 96
    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 97
    .line 98
    .line 99
    const-class v3, Lcom/friday/document/model/ConvertEntity;

    .line 100
    .line 101
    invoke-virtual {v2, p1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lcom/friday/document/model/ConvertEntity;

    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/friday/document/model/ConvertEntity;->getSuccess()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_1
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 115
    .line 116
    const-string v2, "office \u8f6c PDF \u5931\u8d25"

    .line 117
    .line 118
    invoke-direct {p1, v0, v2, v1, v0}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 119
    .line 120
    .line 121
    throw p1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :catch_0
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 123
    .line 124
    const-string v2, "office \u8f6c PDF \u7ed3\u679c\u89e3\u6790\u5931\u8d25"

    .line 125
    .line 126
    invoke-direct {p1, v0, v2, v1, v0}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 133
    .line 134
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1
.end method
