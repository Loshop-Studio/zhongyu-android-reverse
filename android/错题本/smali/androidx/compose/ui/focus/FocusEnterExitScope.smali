.class public interface abstract Landroidx/compose/ui/focus/FocusEnterExitScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0001\n\u00f8\u0001\u0002\u0082\u0002\u0011\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusEnterExitScope;",
        "",
        "Ld6/s;",
        "cancelFocusChange",
        "()V",
        "cancelFocus",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "getRequestedFocusDirection-dhqQ-8s",
        "()I",
        "requestedFocusDirection",
        "Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public cancelFocus()V
    .locals 0
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use cancelFocusChange instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "cancelFocusChange"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/focus/FocusEnterExitScope;->cancelFocusChange()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract cancelFocusChange()V
.end method

.method public abstract getRequestedFocusDirection-dhqQ-8s()I
.end method
