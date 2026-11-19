.class final Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/ota/UpdateChoiceDialog;->o(Ljava/lang/String;)V
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
    c = "com.zykj.lib.ota.UpdateChoiceDialog$startDownload$1$1$1$1"
    f = "UpdateChoiceDialog.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/lib/ota/UpdateChoiceDialog;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/lib/ota/UpdateChoiceDialog;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->b:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->c:Lcom/zykj/lib/ota/UpdateChoiceDialog;

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
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->c:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;-><init>(Ljava/lang/String;Lcom/zykj/lib/ota/UpdateChoiceDialog;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 12
    .line 13
    sget v0, Lcom/zykj/lib/ota/R$string;->download_complete:I

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->success(I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->b:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->c:Lcom/zykj/lib/ota/UpdateChoiceDialog;

    .line 23
    .line 24
    new-instance v0, Ljava/io/File;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/lib/ota/UpdateChoiceDialog$startDownload$1$1$1$1;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/zykj/lib/ota/UpdateChoiceDialog;->j(Lcom/zykj/lib/ota/UpdateChoiceDialog;Ljava/io/File;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method
