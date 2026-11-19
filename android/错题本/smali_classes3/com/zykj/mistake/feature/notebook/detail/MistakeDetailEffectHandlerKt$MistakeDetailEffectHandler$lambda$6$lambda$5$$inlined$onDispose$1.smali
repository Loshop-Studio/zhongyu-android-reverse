.class public final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "runtime_release"
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MistakeDetailEffectHandler.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt\n*L\n1#1,67:1\n93#2,2:68\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/c5;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/c5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1;->a:Lcom/zykj/mistake/feature/notebook/detail/c5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$6$lambda$5$$inlined$onDispose$1;->a:Lcom/zykj/mistake/feature/notebook/detail/c5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/c5;->a:Landroidx/camera/camera2/interop/d;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
