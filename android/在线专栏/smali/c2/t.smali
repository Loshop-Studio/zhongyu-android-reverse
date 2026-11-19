.class public final Lc2/t;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/t$a;,
        Lc2/t$b;
    }
.end annotation


# static fields
.field public static final g:Lc2/t$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/github/barteksc/pdfviewer/PDFView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private e:Lc2/t$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final f:Le2/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc2/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc2/t$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lc2/t;->g:Lc2/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lc2/t;->a:Ljava/util/Map;

    .line 2
    sget-object v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->n:Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;

    invoke-static {}, Ld2/b;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "context()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->E()Le2/b;

    move-result-object v0

    iput-object v0, p0, Lc2/t;->f:Le2/b;

    return-void
.end method

.method public static synthetic a(Lc2/t;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc2/t;->q(Lc2/t;II)V

    return-void
.end method

.method public static synthetic b(IF)V
    .locals 0

    invoke-static {p0, p1}, Lc2/t;->s(IF)V

    return-void
.end method

.method public static synthetic c(Lc2/t;Ljava/io/File;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc2/t;->n(Lc2/t;Ljava/io/File;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lc2/t;F)V
    .locals 0

    invoke-static {p0, p1}, Lc2/t;->p(Lc2/t;F)V

    return-void
.end method

.method public static synthetic e(Lc2/t;ILjava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc2/t;->r(Lc2/t;ILjava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;FI)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc2/t;->o(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;FI)V

    return-void
.end method

.method public static final synthetic h(Lc2/t;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc2/t;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic i(Lc2/t;)Le2/b;
    .locals 0

    iget-object p0, p0, Lc2/t;->f:Le2/b;

    return-object p0
.end method

.method public static final synthetic j(Lc2/t;Ljava/lang/String;IF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc2/t;->m(Ljava/lang/String;IF)V

    return-void
.end method

.method private final k(Ljava/lang/String;Lx2/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx2/p<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Float;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/g;

    move-result-object v0

    new-instance v1, Lc2/t$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lc2/t$c;-><init>(Lc2/t;Ljava/lang/String;Lx2/p;Lq2/d;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/g;->j(Lx2/p;)Lf3/m1;

    return-void
.end method

.method private final m(Ljava/lang/String;IF)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const v2, 0x7f0900fb

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/barteksc/pdfviewer/PDFView;

    if-nez p1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0, p1}, Lc2/t;->t(Lcom/github/barteksc/pdfviewer/PDFView;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->B(Ljava/io/File;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v2

    const/4 v3, 0x1

    .line 6
    invoke-virtual {v2, v3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->i(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v2

    .line 7
    invoke-virtual {v2, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->p(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v1

    .line 8
    invoke-virtual {v1, v3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->h(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v1

    .line 9
    invoke-virtual {v1, v3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->g(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v1

    .line 10
    new-instance v2, Lc2/o;

    invoke-direct {v2, p0, v0}, Lc2/o;-><init>(Lc2/t;Ljava/io/File;)V

    invoke-virtual {v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView$b;->k(Ln1/b;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object v0

    .line 11
    new-instance v1, Lc2/p;

    invoke-direct {v1, p1, p0, p3}, Lc2/p;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;F)V

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->l(Ln1/c;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object p1

    .line 12
    new-instance p3, Lc2/q;

    invoke-direct {p3, p0}, Lc2/q;-><init>(Lc2/t;)V

    invoke-virtual {p1, p3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->m(Ln1/d;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object p1

    .line 13
    new-instance p3, Lc2/r;

    invoke-direct {p3, p0}, Lc2/r;-><init>(Lc2/t;)V

    invoke-virtual {p1, p3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->n(Ln1/e;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object p1

    sget-object p3, Lc2/s;->a:Lc2/s;

    .line 14
    invoke-virtual {p1, p3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->o(Ln1/f;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView$b;->f(I)Lcom/github/barteksc/pdfviewer/PDFView$b;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->j()V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lc2/t;->b:Ljava/lang/String;

    if-nez p2, :cond_3

    const-string p2, "localPath"

    invoke-static {p2}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_3
    const-string p3, "\u6587\u4ef6\u4e0d\u5b58\u5728:"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method private static final n(Lc2/t;Ljava/io/File;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p2, Ljava/io/FileNotFoundException;

    const-string v1, "requireContext()"

    if-eqz v0, :cond_0

    .line 2
    sget-object p2, Ll2/h;->a:Ll2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\u6587\u4ef6\u4e0d\u5b58\u5728 "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_2

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lc2/t;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "urlPath"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    const-string v2, "file_error"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    sget-object p2, Ll2/h;->a:Ll2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\u6587\u4ef6\u5f02\u5e38\uff0c\u8bf7\u91cd\u65b0\u4e0b\u8f7d"

    invoke-virtual {p2, p0, v0}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_2
    :goto_0
    return-void
.end method

.method private static final o(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;FI)V
    .locals 3

    const-string v0, "$this_run"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lc2/n;

    invoke-direct {v0, p1, p2}, Lc2/n;-><init>(Lc2/t;F)V

    const-wide/16 v1, 0x14

    invoke-virtual {p0, v0, v1, v2}, Landroid/widget/RelativeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2
    iget-object p0, p1, Lc2/t;->e:Lc2/t$b;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-interface {p0, p1, p3}, Lc2/t$b;->b(II)V

    :goto_0
    return-void
.end method

.method private static final p(Lc2/t;F)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lc2/t;->d:Lcom/github/barteksc/pdfviewer/PDFView;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setPositionOffset(F)V

    :goto_0
    return-void
.end method

.method private static final q(Lc2/t;II)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PdfFragment"

    const-string v1, "onPageChange"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p0, p0, Lc2/t;->e:Lc2/t$b;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    invoke-interface {p0, p1, p2}, Lc2/t$b;->b(II)V

    :goto_0
    return-void
.end method

.method private static final r(Lc2/t;ILjava/lang/Throwable;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file_error_page_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc2/t;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "urlPath"

    invoke-static {v2}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    sget-object v0, Ll2/h;->a:Ll2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext()"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x7b2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u9875\u52a0\u8f7d\u5f02\u5e38"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final s(IF)V
    .locals 0

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public g()V
    .locals 1

    iget-object v0, p0, Lc2/t;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final l()Lcom/github/barteksc/pdfviewer/PDFView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lc2/t;->d:Lcom/github/barteksc/pdfviewer/PDFView;

    return-object v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lc2/t;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "localPath"

    invoke-static {p1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Lc2/t$d;

    invoke-direct {v0, p0}, Lc2/t$d;-><init>(Lc2/t;)V

    invoke-direct {p0, p1, v0}, Lc2/t;->k(Ljava/lang/String;Lx2/p;)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    instance-of v0, p1, Lc2/t$b;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lc2/t$b;

    iput-object p1, p0, Lc2/t;->e:Lc2/t$b;

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_3

    :cond_0
    const-string v0, "file_path"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    :goto_1
    const-string v4, "requireContext()"

    const-string v5, "this"

    if-eqz v3, :cond_3

    .line 5
    sget-object v0, Ll2/h;->a:Ll2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-virtual {v0, v3, v6}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 6
    :cond_3
    invoke-static {v0, v5}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lc2/t;->b:Ljava/lang/String;

    :goto_2
    const-string v0, "url_path"

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    if-eqz v1, :cond_6

    .line 9
    sget-object p1, Ll2/h;->a:Ll2/h;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Url\u4e0d\u5b58\u5728"

    invoke-virtual {p1, v0, v1}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 10
    :cond_6
    invoke-static {p1, v5}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc2/t;->c:Ljava/lang/String;

    :goto_3
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0c0032

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const-string v0, "PdfFragment"

    const-string v1, "onDestroyView"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Lc2/t;->g()V

    return-void
.end method

.method public onPause()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    sget-object v0, Lf3/f1;->a:Lf3/f1;

    new-instance v3, Lc2/t$e;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lc2/t$e;-><init>(Lc2/t;Lq2/d;)V

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    return-void
.end method

.method public final t(Lcom/github/barteksc/pdfviewer/PDFView;)V
    .locals 0
    .param p1    # Lcom/github/barteksc/pdfviewer/PDFView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lc2/t;->d:Lcom/github/barteksc/pdfviewer/PDFView;

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Lc2/t;->d:Lcom/github/barteksc/pdfviewer/PDFView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->G(I)V

    :goto_0
    return-void
.end method
