.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1$newFilePath$1"
    f = "ImageFunction.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/io/File;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->d:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v5, 0x6

    .line 21
    const/4 v6, 0x0

    .line 22
    const/16 v2, 0x2e

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static/range {v1 .. v6}, Lqd/c0;->k0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, -0x1

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "this as java.lang.String).substring(startIndex)"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v0, ""

    .line 46
    .line 47
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Ljava/io/File;

    .line 71
    .line 72
    new-instance v2, Ljava/io/File;

    .line 73
    .line 74
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1$newFilePath$1;->e:Ljava/lang/String;

    .line 75
    .line 76
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lna/k;->a:Lna/k;

    .line 87
    .line 88
    invoke-virtual {v0, p1, v1}, Lna/k;->a(Ljava/io/File;Ljava/io/File;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method
