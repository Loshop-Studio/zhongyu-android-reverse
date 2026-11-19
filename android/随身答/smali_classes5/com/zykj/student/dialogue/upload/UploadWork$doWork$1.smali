.class final Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/upload/UploadWork;->doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
    c = "com.zykj.student.dialogue.upload.UploadWork"
    f = "UploadWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x89,
        0x8a,
        0x96,
        0xc3
    }
    m = "doWork"
    n = {
        "extras",
        "filePath",
        "type",
        "extras",
        "filePath",
        "type",
        "extras",
        "filePath",
        "date",
        "fileName",
        "type",
        "extras",
        "filePath",
        "ossData",
        "file",
        "type"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$1",
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
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/student/dialogue/upload/UploadWork;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/upload/UploadWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->g:Lcom/zykj/student/dialogue/upload/UploadWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->h:I

    iget-object p1, p0, Lcom/zykj/student/dialogue/upload/UploadWork$doWork$1;->g:Lcom/zykj/student/dialogue/upload/UploadWork;

    invoke-virtual {p1, p0}, Lcom/zykj/student/dialogue/upload/UploadWork;->doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
