.class public final Lcom/zykj/policy/ext/PolicyHelper$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/policy/ext/PolicyHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ln4/a;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance p1, Ln4/a;

    .line 12
    .line 13
    invoke-direct {p1}, Ln4/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 17
    .line 18
    new-instance p1, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;-><init>(Lcom/zykj/policy/ext/PolicyHelper$Builder;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->c:Lkotlin/Lazy;

    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/policy/ext/PolicyHelper$Builder;)Ln4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Lcom/zykj/policy/ui/PolicyDialogFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;
    .locals 1

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln4/a;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln4/a;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln4/a;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final f(Lcom/zykj/policy/ui/PolicyCheckView;)V
    .locals 1

    .line 1
    const-string v0, "policyCheckView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ui/PolicyCheckView;->setData(Ln4/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/policy/ext/PolicyHelper;->a:Lcom/zykj/policy/ext/PolicyHelper$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$a;->b(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a:Landroid/content/Context;

    .line 12
    .line 13
    instance-of v0, v0, Landroidx/fragment/app/FragmentActivity;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b()Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a:Landroid/content/Context;

    .line 22
    .line 23
    check-cast v1, Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v1, "context must be FragmentActivity"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;->b:Ln4/a;

    .line 50
    .line 51
    invoke-virtual {v0}, Ln4/a;->e()Lkotlin/jvm/functions/Function0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method
