.class final Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1"
    f = "UploadFileWork.kt"
    l = {
        0x47,
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Lcom/zykj/download/work/UploadFileWork;

.field public final synthetic e:Lkotlinx/coroutines/n;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/download/work/UploadFileWork;Lkotlinx/coroutines/n;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/n;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/n;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/download/work/UploadFileWork;Lkotlinx/coroutines/n;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    .line 42
    .line 43
    iput-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput v4, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lcom/zykj/download/work/UploadFileWork;->uploadFile(Lm7/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v3, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iput v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 59
    .line 60
    const-wide/16 v1, 0x1f4

    .line 61
    .line 62
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    :goto_1
    return-object v0

    .line 69
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/n;

    .line 70
    .line 71
    invoke-static {p1, v3, v4, v3}, Lkotlinx/coroutines/n$a;->a(Lkotlinx/coroutines/n;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 75
    .line 76
    return-object p1
.end method
