.class public final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MistakeDetailDraftPanel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt\n*L\n1#1,67:1\n426#2,2:68\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;->b:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->f()V

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    iput-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 15
    .line 16
    :try_start_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v2

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_0
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 27
    .line 28
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->e()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->b:Landroid/widget/FrameLayout;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->b:Landroid/widget/FrameLayout;

    .line 40
    .line 41
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setOnActionListener(Lr6/a;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    iput-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 52
    .line 53
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->k:Lr6/e;

    .line 54
    .line 55
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 56
    .line 57
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 61
    .line 62
    throw v2
.end method
