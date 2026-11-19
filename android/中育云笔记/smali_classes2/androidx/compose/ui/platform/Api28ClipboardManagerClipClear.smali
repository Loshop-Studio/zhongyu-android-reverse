.class final Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1c
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;

    invoke-direct {v0}, Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;->INSTANCE:Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final clearPrimaryClip(Landroid/content/ClipboardManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/platform/w;->a(Landroid/content/ClipboardManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
