.class final Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;->invoke(Ljava/lang/String;)V
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
    c = "com.zykj.image.QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1"
    f = "QRCodeFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/image/QRCodeFragment;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/image/QRCodeFragment;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->b:Lcom/zykj/image/QRCodeFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->c:Ljava/lang/String;

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
    new-instance p1, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->b:Lcom/zykj/image/QRCodeFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;-><init>(Lcom/zykj/image/QRCodeFragment;Ljava/lang/String;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->b:Lcom/zykj/image/QRCodeFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "vibrator"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Landroid/os/Vibrator;

    .line 26
    .line 27
    const-wide/16 v0, 0xc8

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Vibrator;->vibrate(JLandroid/media/AudioAttributes;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->b:Lcom/zykj/image/QRCodeFragment;

    .line 34
    .line 35
    const-string v0, "qr_code_text"

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "qr_code_key"

    .line 52
    .line 53
    invoke-static {p1, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1;->b:Lcom/zykj/image/QRCodeFragment;

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 63
    .line 64
    .line 65
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 69
    .line 70
    const-string v0, "null cannot be cast to non-null type android.os.Vibrator"

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method
