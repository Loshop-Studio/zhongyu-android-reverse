.class final Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2"
    f = "UploadFileWork.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/download/work/UploadFileWork;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/Ref$ObjectRef;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->c:Lcom/zykj/download/work/UploadFileWork;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->c:Lcom/zykj/download/work/UploadFileWork;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;-><init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/Ref$ObjectRef;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Li8/b0;

    .line 15
    .line 16
    new-instance v3, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$job$1;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->c:Lcom/zykj/download/work/UploadFileWork;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-direct {v3, p1, v6}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$job$1;-><init>(Lcom/zykj/download/work/UploadFileWork;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v3, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->c:Lcom/zykj/download/work/UploadFileWork;

    .line 37
    .line 38
    invoke-direct {v3, v1, v2, p1, v6}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/download/work/UploadFileWork;Lkotlinx/coroutines/n;Lm7/c;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method
