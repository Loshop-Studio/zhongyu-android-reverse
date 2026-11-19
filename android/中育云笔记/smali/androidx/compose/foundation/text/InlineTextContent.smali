.class public final Landroidx/compose/foundation/text/InlineTextContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final children:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field private final placeholder:Landroidx/compose/ui/text/Placeholder;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/Placeholder;Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/Placeholder;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/InlineTextContent;->placeholder:Landroidx/compose/ui/text/Placeholder;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/InlineTextContent;->children:Lhd/q;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getChildren()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/InlineTextContent;->children:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholder()Landroidx/compose/ui/text/Placeholder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/InlineTextContent;->placeholder:Landroidx/compose/ui/text/Placeholder;

    .line 2
    .line 3
    return-object v0
.end method
