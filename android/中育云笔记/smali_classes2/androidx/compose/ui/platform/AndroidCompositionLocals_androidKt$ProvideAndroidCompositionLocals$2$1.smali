.class final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->ProvideAndroidCompositionLocals(Landroidx/compose/ui/platform/AndroidComposeView;Lhd/p;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $saveableStateRegistry:Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1;->$saveableStateRegistry:Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1;->$saveableStateRegistry:Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;

    .line 2
    new-instance v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1;-><init>(Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
