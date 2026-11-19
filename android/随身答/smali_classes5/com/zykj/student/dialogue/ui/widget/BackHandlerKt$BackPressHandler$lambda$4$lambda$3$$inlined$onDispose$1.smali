.class public final Lcom/zykj/student/dialogue/ui/widget/BackHandlerKt$BackPressHandler$lambda$4$lambda$3$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\ncom/zykj/student/dialogue/ui/widget/BackHandlerKt\n*L\n1#1,67:1\n56#2,2:68\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/widget/BackHandlerKt$BackPressHandler$backCallback$1$1;


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/widget/BackHandlerKt$BackPressHandler$lambda$4$lambda$3$$inlined$onDispose$1;->a:Lcom/zykj/student/dialogue/ui/widget/BackHandlerKt$BackPressHandler$backCallback$1$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/OnBackPressedCallback;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
