.class final Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/QRCodeFragment;->bindCameraUseCases()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/image/QRCodeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/image/QRCodeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;->a:Lcom/zykj/image/QRCodeFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;->a:Lcom/zykj/image/QRCodeFragment;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Li8/i0;->c()Li8/h1;

    move-result-object v2

    new-instance v4, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;

    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;->a:Lcom/zykj/image/QRCodeFragment;

    const/4 v3, 0x0

    invoke-direct {v4, v0, p1, v3}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;-><init>(Lcom/zykj/image/QRCodeFragment;Ljava/lang/String;Lm7/c;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    return-void
.end method
