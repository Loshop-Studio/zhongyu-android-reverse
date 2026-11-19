.class final Lcom/zykj/subscriber/MainActivity$d;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->K(Ljava/lang/String;Lx2/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/MainActivity$d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-",
        "Lo2/r;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.subscriber.MainActivity$downloadAndOpen$1"
    f = "MainActivity.kt"
    l = {
        0x316
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lcom/zykj/subscriber/MainActivity;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/zykj/download/work/DownloadFileWorkProxy;

.field final synthetic i:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lcom/zykj/download/work/DownloadFileWorkProxy;Lx2/l;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/subscriber/MainActivity;",
            "Ljava/lang/String;",
            "Lcom/zykj/download/work/DownloadFileWorkProxy;",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/subscriber/MainActivity$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$d;->f:Lcom/zykj/subscriber/MainActivity;

    iput-object p2, p0, Lcom/zykj/subscriber/MainActivity$d;->g:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/subscriber/MainActivity$d;->h:Lcom/zykj/download/work/DownloadFileWorkProxy;

    iput-object p4, p0, Lcom/zykj/subscriber/MainActivity$d;->i:Lx2/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method

.method public static synthetic e(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/subscriber/MainActivity$d;->m(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic i(Lx0/w;Lx0/p;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$d;->l(Lx0/w;Lx0/p;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic j(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;Lx0/v;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/zykj/subscriber/MainActivity$d;->n(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;Lx0/v;)V

    return-void
.end method

.method private static final l(Lx0/w;Lx0/p;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-virtual {p1}, Lx0/y;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx0/w;->b(Ljava/util/UUID;)Lx0/q;

    return-void
.end method

.method private static final m(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lx0/y;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx0/w;->f(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    .line 2
    new-instance p1, Lcom/zykj/subscriber/d;

    invoke-direct {p1, p4, p2, p3}, Lcom/zykj/subscriber/d;-><init>(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;)V

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/l;Landroidx/lifecycle/t;)V

    return-void
.end method

.method private static final n(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;Lx0/v;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Lx0/v;->e()Lx0/v$a;

    move-result-object v0

    sget-object v1, Lcom/zykj/subscriber/MainActivity$d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p2, 0x2

    const/4 v1, 0x0

    if-eq v0, p2, :cond_0

    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 2
    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 3
    invoke-virtual {p3}, Lx0/v;->c()Landroidx/work/a;

    move-result-object p1

    const-string p2, "progress"

    invoke-virtual {p1, p2, v1}, Landroidx/work/a;->h(Ljava/lang/String;I)I

    move-result p1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->setProgress(I)V

    goto :goto_1

    .line 5
    :cond_0
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 6
    invoke-virtual {p3}, Lx0/v;->b()Landroidx/work/a;

    move-result-object p0

    const-string p2, "error_key"

    invoke-virtual {p0, p2, v1}, Landroidx/work/a;->h(Ljava/lang/String;I)I

    move-result p0

    .line 7
    sget-object p2, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    invoke-virtual {p2, p0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p0

    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p2, "DownLoad"

    .line 8
    invoke-static {p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string p0, "\u6587\u4ef6\u4e0b\u8f7d\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5"

    .line 9
    invoke-virtual {p1, p0}, Lcom/zykj/subscriber/BaseActivity;->f(Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 11
    invoke-virtual {p3}, Lx0/v;->b()Landroidx/work/a;

    move-result-object p0

    const-string p1, "success_key"

    invoke-virtual {p0, p1}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    .line 12
    :cond_3
    invoke-interface {p2, p0}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v6, Lcom/zykj/subscriber/MainActivity$d;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$d;->f:Lcom/zykj/subscriber/MainActivity;

    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$d;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/subscriber/MainActivity$d;->h:Lcom/zykj/download/work/DownloadFileWorkProxy;

    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->i:Lx2/l;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/subscriber/MainActivity$d;-><init>(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lcom/zykj/download/work/DownloadFileWorkProxy;Lx2/l;Lq2/d;)V

    iput-object p1, v6, Lcom/zykj/subscriber/MainActivity$d;->e:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$d;->k(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/zykj/subscriber/MainActivity$d;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$d;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->e:Ljava/lang/Object;

    check-cast v4, Lf3/h0;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$d;->e:Ljava/lang/Object;

    check-cast p1, Lf3/h0;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->f:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {v4}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "browser"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->g:Ljava/lang/String;

    const/4 v5, 0x2

    const-string v6, "/"

    invoke-static {v4, v6, v2, v5, v2}, Le3/l;->C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v11

    new-instance v12, Lcom/zykj/subscriber/MainActivity$d$a;

    iget-object v6, p0, Lcom/zykj/subscriber/MainActivity$d;->h:Lcom/zykj/download/work/DownloadFileWorkProxy;

    iget-object v7, p0, Lcom/zykj/subscriber/MainActivity$d;->g:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v5, v12

    move-object v8, v1

    move-object v9, v4

    invoke-direct/range {v5 .. v10}, Lcom/zykj/subscriber/MainActivity$d$a;-><init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq2/d;)V

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$d;->e:Ljava/lang/Object;

    iput-object v1, p0, Lcom/zykj/subscriber/MainActivity$d;->b:Ljava/lang/Object;

    iput-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->c:Ljava/lang/Object;

    iput v3, p0, Lcom/zykj/subscriber/MainActivity$d;->d:I

    invoke-static {v11, v12, p0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v4

    .line 7
    :goto_0
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$d;->i:Lx2/l;

    .line 9
    invoke-interface {v2, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v2, Lo2/r;->a:Lo2/r;

    :goto_1
    if-nez v2, :cond_4

    .line 11
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$d;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$d;->f:Lcom/zykj/subscriber/MainActivity;

    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$d;->i:Lx2/l;

    .line 12
    new-instance v5, Lx0/p$a;

    const-class v6, Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-direct {v5, v6}, Lx0/p$a;-><init>(Ljava/lang/Class;)V

    .line 13
    sget-object v6, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    invoke-virtual {v6, p1, v1, v0}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/work/a;

    move-result-object p1

    .line 14
    invoke-virtual {v5, p1}, Lx0/y$a;->e(Landroidx/work/a;)Lx0/y$a;

    move-result-object p1

    check-cast p1, Lx0/p$a;

    .line 15
    invoke-virtual {p1}, Lx0/y$a;->b()Lx0/y;

    move-result-object p1

    const-string v0, "OneTimeWorkRequestBuilde\u2026                ).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lx0/p;

    .line 16
    invoke-static {v2}, Lx0/w;->e(Landroid/content/Context;)Lx0/w;

    move-result-object v0

    const-string v1, "getInstance(this@MainActivity)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0, p1}, Lx0/w;->d(Lx0/y;)Lx0/q;

    .line 18
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v5, "\u4e0b\u8f7d\u4e2d"

    .line 19
    invoke-virtual {v1, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v1

    .line 20
    sget-object v5, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->CENTER:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    invoke-virtual {v1, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->contentGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x64

    .line 21
    invoke-virtual {v1, v5, v6, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->progress(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v1

    .line 22
    new-instance v3, Lcom/zykj/subscriber/b;

    invoke-direct {v3, v0, p1}, Lcom/zykj/subscriber/b;-><init>(Lx0/w;Lx0/p;)V

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelListener(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v1

    const v3, 0x7f0f0027

    .line 23
    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v1

    .line 24
    new-instance v3, Lcom/zykj/subscriber/c;

    invoke-direct {v3, v0, p1, v2, v4}, Lcom/zykj/subscriber/c;-><init>(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;)V

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->showListener(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object v2

    :cond_4
    if-nez v2, :cond_5

    .line 26
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$d;->f:Lcom/zykj/subscriber/MainActivity;

    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6"

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/BaseActivity;->f(Ljava/lang/String;)V

    .line 27
    :cond_5
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final k(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$d;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/subscriber/MainActivity$d;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
