.class final Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.zykj.download.work.UploadFileWork"
    f = "UploadFileWork.kt"
    l = {
        0x40
    }
    m = "uploadFileWithProgress"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/download/work/UploadFileWork;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->e:Lcom/zykj/download/work/UploadFileWork;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->e:Lcom/zykj/download/work/UploadFileWork;

    invoke-static {p1, p0}, Lcom/zykj/download/work/UploadFileWork;->access$uploadFileWithProgress(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
