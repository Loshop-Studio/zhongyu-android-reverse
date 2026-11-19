.class final Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1;->m(Ljava/lang/String;[Ljava/lang/Object;)V
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
    c = "com.friday.document.view.preview.VideoPreviewFragment$initData$1$onClickStartIcon$1"
    f = "VideoPreviewFragment.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/preview/VideoPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/preview/VideoPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->d:Lcom/friday/document/view/preview/VideoPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->d:Lcom/friday/document/view/preview/VideoPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;-><init>(Lcom/friday/document/view/preview/VideoPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->c:I

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
    iget-object p1, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->d:Lcom/friday/document/view/preview/VideoPreviewFragment;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/friday/document/view/preview/VideoPreviewFragment;->u()Lc2/g2;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v3, Lcom/friday/common/entity/ShareCacheEntity;

    .line 34
    .line 35
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v1, "get32UUID(...)"

    .line 40
    .line 41
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->d:Lcom/friday/document/view/preview/VideoPreviewFragment;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/friday/document/view/preview/VideoPreviewFragment;->r(Lcom/friday/document/view/preview/VideoPreviewFragment;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-direct/range {v3 .. v10}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 66
    .line 67
    .line 68
    iput v2, p0, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1$onClickStartIcon$1;->c:I

    .line 69
    .line 70
    invoke-interface {p1, v3, p0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_2

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 78
    .line 79
    return-object p1
.end method
