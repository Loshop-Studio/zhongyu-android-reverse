.class final Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/MicroCodeFragment;->B(Ljava/lang/String;)V
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
    c = "com.zykj.study.ui.home.find.MicroCodeFragment$startUpload$1"
    f = "MicroCodeFragment.kt"
    l = {
        0x88
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/study/ui/home/find/MicroCodeFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->e:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

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
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->e:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->d:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, ".zip"

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v4, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1$1;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->d:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-direct {v4, v5, p1, v6}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->c:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    iput v3, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->b:I

    .line 71
    .line 72
    invoke-static {v2, v4, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v1, :cond_2

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_2
    move-object v7, v0

    .line 80
    move-object v0, p1

    .line 81
    move-object p1, v7

    .line 82
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->e:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v1, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->q(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;->e:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 95
    .line 96
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 97
    .line 98
    sget v1, Lcom/zykj/study/R$string;->micro_zip_error:I

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string v1, "getString(...)"

    .line 105
    .line 106
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 113
    .line 114
    return-object p1
.end method
