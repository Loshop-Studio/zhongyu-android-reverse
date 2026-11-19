.class public final Landroidx/compose/foundation/pager/PagerIntervalContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final item:Lhd/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/r;"
        }
    .end annotation
.end field

.field private final key:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/l;Lhd/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerIntervalContent;->key:Lhd/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerIntervalContent;->item:Lhd/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getItem()Lhd/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/r;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerIntervalContent;->item:Lhd/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public getKey()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerIntervalContent;->key:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
