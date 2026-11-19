.class public final Landroidx/compose/ui/platform/FocusFinderCompat$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/FocusFinderCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/FocusFinderCompat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Landroidx/compose/ui/platform/FocusFinderCompat;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/FocusFinderCompat;->access$getFocusFinderThreadLocal$cp()Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroidx/compose/ui/platform/FocusFinderCompat;

    .line 13
    .line 14
    return-object v0
.end method
