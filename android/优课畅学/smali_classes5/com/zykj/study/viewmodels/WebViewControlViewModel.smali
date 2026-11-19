.class public final Lcom/zykj/study/viewmodels/WebViewControlViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Ll8/h;

.field public final b:Ll8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/study/viewmodels/b$c;->a:Lcom/zykj/study/viewmodels/b$c;

    .line 5
    .line 6
    invoke-static {v0}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->a:Ll8/h;

    .line 11
    .line 12
    invoke-static {v0}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->b:Ll8/q;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->b:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->a:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/study/viewmodels/b;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/study/viewmodels/b$c;->a:Lcom/zykj/study/viewmodels/b$c;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->a:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/study/viewmodels/b;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/study/viewmodels/b$b;->a:Lcom/zykj/study/viewmodels/b$b;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->a:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/study/viewmodels/b;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/study/viewmodels/b$a;->a:Lcom/zykj/study/viewmodels/b$a;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void
.end method
