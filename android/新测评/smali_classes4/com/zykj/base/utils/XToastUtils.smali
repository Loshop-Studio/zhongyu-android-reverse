.class public final Lcom/zykj/base/utils/XToastUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0008H\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\u000cH\u0007J\u0012\u0010\n\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0008H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0008H\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001a\u0010\r\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0008H\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0008H\u0007J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u001a\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/base/utils/XToastUtils;",
        "",
        "<init>",
        "()V",
        "toast",
        "",
        "message",
        "",
        "",
        "duration",
        "error",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "success",
        "info",
        "warning",
        "base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/base/utils/XToastUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/base/utils/XToastUtils;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/base/utils/XToastUtils;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 7
    .line 8
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x11

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc4/b$b;->m(I)Lc4/b$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v1, 0xc8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lc4/b$b;->l(I)Lc4/b$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lc4/b$b;->j(Z)Lc4/b$b;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final error(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 3
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->d(Landroid/content/Context;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final error(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 5
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->e(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final error(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final error(Ljava/lang/CharSequence;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->g(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final error(Ljava/lang/Exception;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lc4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final info(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->i(Landroid/content/Context;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final info(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->j(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final info(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->k(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final info(Ljava/lang/CharSequence;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->l(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final success(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->s(Landroid/content/Context;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final success(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->t(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final success(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->u(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final success(Ljava/lang/CharSequence;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->v(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final toast(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->n(Landroid/content/Context;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final toast(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->o(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final toast(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->p(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final toast(Ljava/lang/CharSequence;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->q(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final warning(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->x(Landroid/content/Context;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final warning(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->y(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final warning(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc4/b;->z(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final warning(Ljava/lang/CharSequence;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lo2/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc4/b;->A(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
