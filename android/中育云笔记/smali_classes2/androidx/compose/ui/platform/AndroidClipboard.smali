.class public final Landroidx/compose/ui/platform/AndroidClipboard;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/Clipboard;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final androidClipboardManager:Landroidx/compose/ui/platform/AndroidClipboardManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 3
    new-instance v0, Landroidx/compose/ui/platform/AndroidClipboardManager;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/AndroidClipboardManager;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidClipboard;-><init>(Landroidx/compose/ui/platform/AndroidClipboardManager;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidClipboardManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidClipboard;->androidClipboardManager:Landroidx/compose/ui/platform/AndroidClipboardManager;

    return-void
.end method


# virtual methods
.method public getClipEntry(Lvc/c;)Ljava/lang/Object;
    .locals 0
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

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidClipboard;->androidClipboardManager:Landroidx/compose/ui/platform/AndroidClipboardManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidClipboardManager;->getClip()Landroidx/compose/ui/platform/ClipEntry;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getNativeClipboard()Landroid/content/ClipboardManager;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidClipboard;->androidClipboardManager:Landroidx/compose/ui/platform/AndroidClipboardManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidClipboardManager;->getNativeClipboard()Landroid/content/ClipboardManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public setClipEntry(Landroidx/compose/ui/platform/ClipEntry;Lvc/c;)Ljava/lang/Object;
    .locals 0
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

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidClipboard;->androidClipboardManager:Landroidx/compose/ui/platform/AndroidClipboardManager;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroidx/compose/ui/platform/AndroidClipboardManager;->setClip(Landroidx/compose/ui/platform/ClipEntry;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method
