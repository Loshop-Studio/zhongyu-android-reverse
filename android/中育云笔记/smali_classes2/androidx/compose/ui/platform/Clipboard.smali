.class public interface abstract Landroidx/compose/ui/platform/Clipboard;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getClipEntry(Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/platform/ClipEntry;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNativeClipboard()Landroid/content/ClipboardManager;
.end method

.method public abstract setClipEntry(Landroidx/compose/ui/platform/ClipEntry;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/ClipEntry;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
