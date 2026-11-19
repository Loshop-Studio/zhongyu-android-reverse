.class public final Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/FocusFinderCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Landroidx/compose/ui/platform/FocusFinderCompat;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public initialValue()Landroidx/compose/ui/platform/FocusFinderCompat;
    .locals 1

    .line 2
    new-instance v0, Landroidx/compose/ui/platform/FocusFinderCompat;

    invoke-direct {v0}, Landroidx/compose/ui/platform/FocusFinderCompat;-><init>()V

    return-object v0
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;->initialValue()Landroidx/compose/ui/platform/FocusFinderCompat;

    move-result-object v0

    return-object v0
.end method
