.class final Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/insight/ui/theme/ThemeKt;->a(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroidx/compose/material3/ColorScheme;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/compose/material3/ColorScheme;Z)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->b:Landroidx/compose/material3/ColorScheme;

    iput-boolean p3, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->c:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->b:Landroidx/compose/material3/ColorScheme;

    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 4
    iget-object v1, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroidx/core/view/WindowCompat;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object v0

    iget-boolean v1, p0, Lcom/zykj/insight/ui/theme/ThemeKt$EzyAndroidInsightTheme$1;->c:Z

    invoke-virtual {v0, v1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    return-void
.end method
