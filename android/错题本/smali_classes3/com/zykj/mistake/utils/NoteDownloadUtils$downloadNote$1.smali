.class final Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.utils.NoteDownloadUtils"
    f = "NoteDownloadUtils.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x6c,
        0x7b,
        0x94
    }
    m = "downloadNote-BWLJW6A"
    n = {
        "noteUrl",
        "localPath",
        "downloadFunction",
        "file",
        "zipFile",
        "$i$a$-runCatching-NoteDownloadUtils$downloadNote$2",
        "noteUrl",
        "localPath",
        "downloadFunction",
        "fileName",
        "$i$a$-runCatching-NoteDownloadUtils$downloadNote$2",
        "noteUrl",
        "localPath",
        "downloadFunction",
        "fileName",
        "jsonFile",
        "$this$forEach$iv",
        "list",
        "urlPre",
        "element$iv",
        "info",
        "name",
        "file",
        "localFileMd5",
        "$i$a$-runCatching-NoteDownloadUtils$downloadNote$2",
        "$i$f$forEach",
        "$i$a$-forEach-NoteDownloadUtils$downloadNote$2$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$9",
        "L$10",
        "L$11",
        "L$12",
        "L$13",
        "I$0",
        "I$1",
        "I$2"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/zykj/mistake/utils/j;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/utils/j;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/utils/j;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->this$0:Lcom/zykj/mistake/utils/j;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lh6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->this$0:Lcom/zykj/mistake/utils/j;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/zykj/mistake/utils/j;->a(Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
