# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$a;,
        Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;,
        Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 Z2\u00020\u0001:\u00030(,B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008&\u0010\u0003R\u0016\u0010*\u001a\u00020\'8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001a\u0010:\u001a\u000607R\u00020\u00008\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0018\u0010B\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR$\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010X\u00a8\u0006["
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Landroid/net/Uri;",
        "",
        "callback",
        "J",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onCreate",
        "onDestroy",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "Landroid/content/Context;",
        "context",
        "",
        "s",
        "(Landroid/content/Context;)Ljava/lang/String;",
        "saveDir",
        "I",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "imagePath",
        "u",
        "(Ljava/lang/String;)V",
        "error",
        "t",
        "B",
        "v",
        "A",
        "K",
        "",
        "isLeft",
        "O",
        "(Z)V",
        "N",
        "Landroid/view/WindowManager;",
        "a",
        "Landroid/view/WindowManager;",
        "windowManager",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "floatingView",
        "Landroid/view/WindowManager$LayoutParams;",
        "c",
        "Landroid/view/WindowManager$LayoutParams;",
        "layoutParams",
        "Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;",
        "d",
        "Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;",
        "binding",
        "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;",
        "e",
        "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;",
        "dragOrClickListener",
        "Lx3/w;",
        "f",
        "Lx3/w;",
        "screenshotFinishReceiver",
        "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;",
        "g",
        "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;",
        "binder",
        "Lj4/k;",
        "h",
        "Lj4/k;",
        "screenshotHelper",
        "Le4/f;",
        "i",
        "Le4/f;",
        "croppedBitmapDialog",
        "Lkotlinx/coroutines/CompletableJob;",
        "j",
        "Lkotlinx/coroutines/CompletableJob;",
        "job",
        "Lkotlinx/coroutines/CoroutineScope;",
        "k",
        "Lkotlinx/coroutines/CoroutineScope;",
        "scope",
        "Lcom/zykj/huiwei/launcher/server/OverlayToastManager;",
        "l",
        "Lcom/zykj/huiwei/launcher/server/OverlayToastManager;",
        "overlayToastManager",
        "m",
        "Lkotlin/jvm/functions/Function1;",
        "onImageSavedCallback",
        "n",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMyFloatingToolService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyFloatingToolService.kt\ncom/zykj/huiwei/launcher/server/MyFloatingToolService\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,493:1\n257#2,2:494\n257#2,2:496\n257#2,2:498\n257#2,2:500\n257#2,2:502\n*S KotlinDebug\n*F\n+ 1 MyFloatingToolService.kt\ncom/zykj/huiwei/launcher/server/MyFloatingToolService\n*L\n423#1:494,2\n430#1:496,2\n143#1:498,2\n149#1:500,2\n202#1:502,2\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$a;

.field public static final o:I


# instance fields
.field public a:Landroid/view/WindowManager;

.field public b:Landroid/view/View;

.field public c:Landroid/view/WindowManager$LayoutParams;

.field public d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

.field public e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

.field public f:Lx3/w;

.field public final g:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;

.field public h:Lj4/k;

.field public i:Le4/f;

.field public final j:Lkotlinx/coroutines/CompletableJob;

.field public final k:Lkotlinx/coroutines/CoroutineScope;

.field public l:Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

.field public m:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->n:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->g:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->j:Lkotlinx/coroutines/CompletableJob;

    .line 18
    .line 19
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, v0}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->k:Lkotlinx/coroutines/CoroutineScope;

    .line 32
    .line 33
    return-void
.end method

.method public static final C(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "croppedBitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "MyFloatingToolService,\u6536\u5230\u88c1\u526a\u5b8c\u6210\u7684 Bitmap\uff01"

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string v0, "binding"

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :cond_0
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    const-string v2, "imgLinear"

    .line 29
    .line 30
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->i:Le4/f;

    .line 38
    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    const-string p0, "croppedBitmapDialog"

    .line 42
    .line 43
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, p0

    .line 48
    :goto_0
    invoke-virtual {v1, p1}, Le4/f;->d(Landroid/graphics/Bitmap;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0
.end method

.method public static final D(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "MyFloatingToolService,\u622a\u56fe\u88c1\u526a\u6d41\u7a0b\u5df2\u53d6\u6d88 Bitmap\uff01"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const-string p0, "binding"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    const-string v0, "imgLinear"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method

.method public static final E(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "croppedBitmapDialog,\u5f00\u59cb\u7f16\u8f91\u56fe\u7247\u903b\u8f91"

    .line 7
    .line 8
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final F(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "croppedBitmapDialog,\u5f00\u59cb\u4fdd\u5b58\u56fe\u7247\u903b\u8f91"

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1}, Li4/p;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->m:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method

.method public static final G(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->u(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final H(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->t(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final L(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 7
    .line 8
    const-string v1, "layoutParams"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    .line 22
    .line 23
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const-string p1, "windowManager"

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v2

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const-string v0, "floatingView"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v2

    .line 54
    :cond_2
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v2, p0

    .line 63
    :goto_0
    invoke-interface {p1, v0, v2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static final M(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 7
    .line 8
    const-string v1, "layoutParams"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    .line 22
    .line 23
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const-string p1, "windowManager"

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v2

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const-string v0, "floatingView"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v2

    .line 54
    :cond_2
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v2, p0

    .line 63
    :goto_0
    invoke-interface {p1, v0, v2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static final P(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 7
    .line 8
    const-string v1, "layoutParams"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    .line 22
    .line 23
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const-string p1, "windowManager"

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v2

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const-string v0, "floatingView"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v2

    .line 54
    :cond_2
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v2, p0

    .line 63
    :goto_0
    invoke-interface {p1, v0, v2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->L(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->H(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->z(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->C(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->x(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->F(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->E(Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->D(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->M(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->P(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->y(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->w(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->G(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lcom/zykj/huiwei/launcher/server/OverlayToastManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->l:Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->K()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final w(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "binding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, p0

    .line 27
    :goto_0
    iget-object p0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->linearMenu:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    const-string p0, "MyFloatingToolService"

    .line 35
    .line 36
    const-string p1, "\u53f3\u7bad\u5934\u88ab\u70b9\u51fb - \u6536\u8d77"

    .line 37
    .line 38
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final x(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "binding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, p0

    .line 27
    :goto_0
    iget-object p0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->linearMenu:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    const-string p0, "MyFloatingToolService"

    .line 35
    .line 36
    const-string p1, "\u5de6\u7bad\u5934\u88ab\u70b9\u51fb - \u6536\u8d77"

    .line 37
    .line 38
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final y(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p1, "MyFloatingToolService"

    .line 2
    .line 3
    const-string v0, "\u622a\u56fe\u6309\u94ae\u88ab\u70b9\u51fb"

    .line 4
    .line 5
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p1, "binding"

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    :cond_0
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    const-string v0, "imgLinear"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->s(Landroid/content/Context;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p0, p1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->I(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final z(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "binding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, p0

    .line 28
    :goto_0
    iget-object p0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->linearMenu:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    const-string p0, "MyFloatingToolService"

    .line 35
    .line 36
    const-string p1, "\u5355\u4e2a\u7bad\u5934\u88ab\u70b9\u51fb - \u5c55\u5f00"

    .line 37
    .line 38
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-string v2, "FloatingToolbarChannel"

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lx3/b;->a()V

    .line 10
    .line 11
    .line 12
    const-string v0, "\u60ac\u6d6e\u5de5\u5177\u680f\u901a\u77e5"

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v2, v0, v1}, Lcom/blankj/utilcode/util/w;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "\u7528\u4e8e\u663e\u793a\u60ac\u6d6e\u5de5\u5177\u680f\u7684\u524d\u53f0\u670d\u52a1\u901a\u77e5"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lx3/c;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "notification"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 31
    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v1, Landroid/app/NotificationManager;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/u;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    .line 41
    .line 42
    invoke-direct {v0, p0, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "\u60ac\u6d6e\u5de5\u5177\u680f\u6b63\u5728\u8fd0\u884c"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "\u70b9\u51fb\u6b64\u5904\u7ba1\u7406\u60ac\u6d6e\u5de5\u5177\u680f"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const v1, 0x7f0e000b

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, -0x1

    .line 70
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "build(...)"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x65

    .line 84
    .line 85
    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final B()V
    .locals 6

    .line 1
    new-instance v0, Lj4/k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "windowManager"

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v1, v2

    .line 14
    :cond_0
    new-instance v4, Lx3/k;

    .line 15
    .line 16
    invoke-direct {v4, p0}, Lx3/k;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, Lx3/l;

    .line 20
    .line 21
    invoke-direct {v5, p0}, Lx3/l;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, v1, v4, v5}, Lj4/k;-><init>(Landroid/content/Context;Landroid/view/WindowManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->h:Lj4/k;

    .line 28
    .line 29
    new-instance v0, Le4/f;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v1

    .line 40
    :goto_0
    new-instance v1, Lx3/m;

    .line 41
    .line 42
    invoke-direct {v1}, Lx3/m;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lx3/n;

    .line 46
    .line 47
    invoke-direct {v3, p0}, Lx3/n;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, p0, v2, v1, v3}, Le4/f;-><init>(Landroid/content/Context;Landroid/view/WindowManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->i:Le4/f;

    .line 54
    .line 55
    return-void
.end method

.method public final I(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "saveDir"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v1, "com.linspirer.edu.screenshot"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "com.android.launcher3"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const-string v1, "savedir"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    const-string p2, "packageName"

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p2

    .line 42
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v1, "\u53d1\u9001\u622a\u56fe\u8bf7\u6c42\u5931\u8d25: "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final J(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->m:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final K()V
    .locals 9

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "floatingView"

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 27
    .line 28
    const-string v4, "layoutParams"

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v3, v2

    .line 36
    :cond_1
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 37
    .line 38
    const/4 v5, 0x5

    .line 39
    and-int/2addr v3, v5

    .line 40
    if-ne v3, v5, :cond_3

    .line 41
    .line 42
    sub-int v3, v0, v1

    .line 43
    .line 44
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 45
    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v5, v2

    .line 52
    :cond_2
    iget v5, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 53
    .line 54
    sub-int/2addr v3, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 57
    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v2

    .line 64
    :cond_4
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 65
    .line 66
    :goto_0
    div-int/lit8 v5, v1, 0x2

    .line 67
    .line 68
    add-int/2addr v5, v3

    .line 69
    div-int/lit8 v6, v0, 0x2

    .line 70
    .line 71
    const-string v7, "ofInt(...)"

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    if-ge v5, v6, :cond_6

    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    move-object v2, v0

    .line 85
    :goto_1
    const/16 v0, 0x13

    .line 86
    .line 87
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 88
    .line 89
    filled-new-array {v3, v8}, [I

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v1, Lx3/f;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Lx3/f;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    invoke-virtual {p0, v1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->O(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    sub-int/2addr v0, v1

    .line 114
    sub-int/2addr v0, v3

    .line 115
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 116
    .line 117
    if-nez v1, :cond_7

    .line 118
    .line 119
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    move-object v2, v1

    .line 124
    :goto_2
    const/16 v1, 0x15

    .line 125
    .line 126
    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 127
    .line 128
    filled-new-array {v0, v8}, [I

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v1, Lx3/g;

    .line 140
    .line 141
    invoke-direct {v1, p0}, Lx3/g;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v8}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->O(Z)V

    .line 148
    .line 149
    .line 150
    :goto_3
    const-wide/16 v1, 0x12c

    .line 151
    .line 152
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final N()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->k:Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    new-instance v3, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, v1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$startGlobalEventListening$1;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final O(Z)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "floatingView"

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 27
    .line 28
    const-string v4, "layoutParams"

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v3, v2

    .line 36
    :cond_1
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 37
    .line 38
    const/4 v5, 0x5

    .line 39
    and-int/2addr v3, v5

    .line 40
    if-ne v3, v5, :cond_3

    .line 41
    .line 42
    sub-int/2addr v0, v1

    .line 43
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v1, v2

    .line 51
    :cond_2
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 52
    .line 53
    sub-int/2addr v0, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object v0, v2

    .line 63
    :cond_4
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 64
    .line 65
    :goto_0
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 66
    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v1, v2

    .line 73
    :cond_5
    if-eqz p1, :cond_6

    .line 74
    .line 75
    const/16 v3, 0x13

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_6
    const/16 v3, 0x15

    .line 79
    .line 80
    :goto_1
    iput v3, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    filled-new-array {v0, v1}, [I

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-wide/16 v3, 0x12c

    .line 92
    .line 93
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 94
    .line 95
    .line 96
    new-instance v3, Lx3/h;

    .line 97
    .line 98
    invoke-direct {v3, p0}, Lx3/h;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 105
    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    const v0, 0x7f080258

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    const v0, 0x7f080259

    .line 114
    .line 115
    .line 116
    :goto_2
    if-eqz p1, :cond_8

    .line 117
    .line 118
    const v3, 0x7f080252

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_8
    const v3, 0x7f080253

    .line 123
    .line 124
    .line 125
    :goto_3
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 126
    .line 127
    const-string v5, "binding"

    .line 128
    .line 129
    if-nez v4, :cond_9

    .line 130
    .line 131
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v4, v2

    .line 135
    :cond_9
    iget-object v4, v4, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 136
    .line 137
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 141
    .line 142
    if-nez v0, :cond_a

    .line 143
    .line 144
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v0, v2

    .line 148
    :cond_a
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 149
    .line 150
    invoke-static {p0, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    const/16 v0, 0x8

    .line 158
    .line 159
    if-eqz p1, :cond_d

    .line 160
    .line 161
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 162
    .line 163
    if-nez p1, :cond_b

    .line 164
    .line 165
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    move-object p1, v2

    .line 169
    :cond_b
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowLeft:Landroid/widget/ImageView;

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 175
    .line 176
    if-nez p1, :cond_c

    .line 177
    .line 178
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_c
    move-object v2, p1

    .line 183
    :goto_4
    iget-object p1, v2, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowRight:Landroid/widget/ImageView;

    .line 184
    .line 185
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_d
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 190
    .line 191
    if-nez p1, :cond_e

    .line 192
    .line 193
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    move-object p1, v2

    .line 197
    :cond_e
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowLeft:Landroid/widget/ImageView;

    .line 198
    .line 199
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 203
    .line 204
    if-nez p1, :cond_f

    .line 205
    .line 206
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_f
    move-object v2, p1

    .line 211
    :goto_5
    iget-object p1, v2, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowRight:Landroid/widget/ImageView;

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->g:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;

    .line 2
    .line 3
    return-object p1
.end method

.method public onCreate()V
    .locals 8

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    const-string v0, "window"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Landroid/view/WindowManager;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 18
    .line 19
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "inflate(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const-string v0, "binding"

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v0, v1

    .line 43
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->getRoot()Landroid/widget/LinearLayout;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "getRoot(...)"

    .line 48
    .line 49
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 53
    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/16 v2, 0x1a

    .line 57
    .line 58
    if-lt v0, v2, :cond_1

    .line 59
    .line 60
    const/16 v0, 0x7f6

    .line 61
    .line 62
    :goto_0
    move v5, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/16 v0, 0x7d3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_1
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 68
    .line 69
    const/16 v6, 0x8

    .line 70
    .line 71
    const/4 v7, -0x3

    .line 72
    const/4 v3, -0x2

    .line 73
    const/4 v4, -0x2

    .line 74
    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 75
    .line 76
    .line 77
    const/16 v0, 0x15

    .line 78
    .line 79
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 83
    .line 84
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 85
    .line 86
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    const-string v0, "windowManager"

    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v0, v1

    .line 98
    :cond_2
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 99
    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    const-string v2, "floatingView"

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move-object v2, v1

    .line 108
    :cond_3
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->c:Landroid/view/WindowManager$LayoutParams;

    .line 109
    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    const-string v3, "layoutParams"

    .line 113
    .line 114
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object v3, v1

    .line 118
    :cond_4
    invoke-interface {v0, v2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->v()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->A()V

    .line 125
    .line 126
    .line 127
    new-instance v0, Lx3/w;

    .line 128
    .line 129
    invoke-direct {v0}, Lx3/w;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v2, Lx3/i;

    .line 133
    .line 134
    invoke-direct {v2, p0}, Lx3/i;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v2}, Lx3/w;->b(Lkotlin/jvm/functions/Function1;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lx3/j;

    .line 141
    .line 142
    invoke-direct {v2, p0}, Lx3/j;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Lx3/w;->a(Lkotlin/jvm/functions/Function1;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->f:Lx3/w;

    .line 149
    .line 150
    new-instance v0, Landroid/content/IntentFilter;

    .line 151
    .line 152
    const-string v2, "com.android.launcher3.mdm.SCREEN_SHOT_FINISH"

    .line 153
    .line 154
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->f:Lx3/w;

    .line 158
    .line 159
    if-nez v2, :cond_5

    .line 160
    .line 161
    const-string v2, "screenshotFinishReceiver"

    .line 162
    .line 163
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    move-object v1, v2

    .line 168
    :goto_2
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->B()V

    .line 172
    .line 173
    .line 174
    new-instance v0, Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

    .line 175
    .line 176
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->k:Lkotlinx/coroutines/CoroutineScope;

    .line 177
    .line 178
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/server/OverlayToastManager;-><init>(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V

    .line 179
    .line 180
    .line 181
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->l:Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->N()V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const-string v2, "floatingView"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->a:Landroid/view/WindowManager;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "windowManager"

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v1

    .line 33
    :cond_1
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v3, v1

    .line 41
    :cond_2
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    const/4 v0, 0x1

    .line 45
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->l:Lcom/zykj/huiwei/launcher/server/OverlayToastManager;

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    const-string v2, "overlayToastManager"

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v2, v1

    .line 58
    :cond_4
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/server/OverlayToastManager;->e()V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->j:Lkotlinx/coroutines/CompletableJob;

    .line 62
    .line 63
    invoke-static {v2, v1, v0, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final s(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Ljava/io/File;

    .line 13
    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/d;->d()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v4, "Screenshot_"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public final t(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "\u622a\u56fe\u5931\u8d25: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "MyFloatingToolService"

    .line 24
    .line 25
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/s;->k([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const-string p1, "binding"

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    :cond_0
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    const-string v0, "imgLinear"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final u(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "\u63a5\u6536\u5230\u622a\u56fe\u5b8c\u6210\u56de\u8c03\uff0c\u8def\u5f84: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "MyFloatingToolService"

    .line 24
    .line 25
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/io/File;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "\u6587\u4ef6\u5b9e\u9645\u5b58\u5728: "

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "\u56fe\u7247\u6587\u4ef6\u672a\u627e\u5230\u6216\u672a\u4fdd\u5b58\u6210\u529f: "

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lcom/blankj/utilcode/util/s;->k([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    new-instance v0, Ljava/io/File;

    .line 93
    .line 94
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/4 v2, 0x0

    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    new-instance v3, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v4, "\u622a\u56fe\u5df2\u663e\u793a: "

    .line 114
    .line 115
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->h:Lj4/k;

    .line 133
    .line 134
    if-nez p1, :cond_1

    .line 135
    .line 136
    const-string p1, "screenshotHelper"

    .line 137
    .line 138
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    move-object v2, p1

    .line 143
    :goto_1
    invoke-virtual {v2, v0}, Lj4/k;->g(Landroid/graphics/Bitmap;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_2
    const-string p1, "\u65e0\u6cd5\u52a0\u8f7d\u622a\u56fe\u6587\u4ef6"

    .line 148
    .line 149
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lcom/blankj/utilcode/util/s;->i([Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 157
    .line 158
    if-nez p1, :cond_3

    .line 159
    .line 160
    const-string p1, "binding"

    .line 161
    .line 162
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    move-object v2, p1

    .line 167
    :goto_2
    iget-object p1, v2, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgLinear:Landroid/widget/LinearLayout;

    .line 168
    .line 169
    const-string v0, "imgLinear"

    .line 170
    .line 171
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final v()V
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 2
    .line 3
    const-wide/16 v1, 0x1f4

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, v2}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;J)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->b:Landroid/view/View;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "floatingView"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :cond_0
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 22
    .line 23
    const-string v3, "dragOrClickListener"

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v2, v1

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 35
    .line 36
    const-string v2, "binding"

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :cond_2
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 45
    .line 46
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 47
    .line 48
    if-nez v4, :cond_3

    .line 49
    .line 50
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v4, v1

    .line 54
    :cond_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    move-object v0, v1

    .line 65
    :cond_4
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowLeft:Landroid/widget/ImageView;

    .line 66
    .line 67
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 68
    .line 69
    if-nez v4, :cond_5

    .line 70
    .line 71
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object v4, v1

    .line 75
    :cond_5
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 79
    .line 80
    if-nez v0, :cond_6

    .line 81
    .line 82
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v0, v1

    .line 86
    :cond_6
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowRight:Landroid/widget/ImageView;

    .line 87
    .line 88
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 89
    .line 90
    if-nez v4, :cond_7

    .line 91
    .line 92
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v4, v1

    .line 96
    :cond_7
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 100
    .line 101
    if-nez v0, :cond_8

    .line 102
    .line 103
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move-object v0, v1

    .line 107
    :cond_8
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenShot:Landroid/widget/ImageView;

    .line 108
    .line 109
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->e:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    .line 110
    .line 111
    if-nez v4, :cond_9

    .line 112
    .line 113
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v4, v1

    .line 117
    :cond_9
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 121
    .line 122
    if-nez v0, :cond_a

    .line 123
    .line 124
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    move-object v0, v1

    .line 128
    :cond_a
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenTurnOpen:Landroid/widget/ImageView;

    .line 129
    .line 130
    new-instance v3, Lx3/o;

    .line 131
    .line 132
    invoke-direct {v3, p0}, Lx3/o;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 139
    .line 140
    if-nez v0, :cond_b

    .line 141
    .line 142
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    move-object v0, v1

    .line 146
    :cond_b
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowLeft:Landroid/widget/ImageView;

    .line 147
    .line 148
    new-instance v3, Lx3/p;

    .line 149
    .line 150
    invoke-direct {v3, p0}, Lx3/p;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 157
    .line 158
    if-nez v0, :cond_c

    .line 159
    .line 160
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    move-object v0, v1

    .line 164
    :cond_c
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgArrowRight:Landroid/widget/ImageView;

    .line 165
    .line 166
    new-instance v3, Lx3/d;

    .line 167
    .line 168
    invoke-direct {v3, p0}, Lx3/d;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;->d:Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;

    .line 175
    .line 176
    if-nez v0, :cond_d

    .line 177
    .line 178
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_d
    move-object v1, v0

    .line 183
    :goto_0
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;->imgScreenShot:Landroid/widget/ImageView;

    .line 184
    .line 185
    new-instance v1, Lx3/e;

    .line 186
    .line 187
    invoke-direct {v1, p0}, Lx3/e;-><init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method
