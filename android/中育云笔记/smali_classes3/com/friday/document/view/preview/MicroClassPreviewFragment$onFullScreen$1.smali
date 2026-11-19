.class final Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/preview/MicroClassPreviewFragment;->i()V
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
    c = "com.friday.document.view.preview.MicroClassPreviewFragment$onFullScreen$1"
    f = "MicroClassPreviewFragment.kt"
    l = {
        0x53
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->s(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_4

    .line 38
    .line 39
    iget-object p1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v1, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1$1;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct {v1, v3, v4}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1$1;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V

    .line 54
    .line 55
    .line 56
    iput v2, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->c:I

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 66
    .line 67
    check-cast p1, Ljava/util/List;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 71
    .line 72
    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    const-string p1, "\u5fae\u8bfe\u6587\u4ef6\u89e3\u538b\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 76
    .line 77
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->s(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p1, v0}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;->d:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->s(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 103
    .line 104
    return-object p1
.end method
