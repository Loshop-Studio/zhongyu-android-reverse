.class public final Lf2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lhd/p;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSoftKeyBoardChangeListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lf2/k;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lf2/k;-><init>(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p2}, Lf2/k;->c(Lf2/k;Lhd/p;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
