.class public final Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final handler:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method private synthetic constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic box-impl(Lhd/l;)Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;-><init>(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static constructor-impl(Lhd/l;)Lhd/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    return-object p0
.end method

.method public static equals-impl(Lhd/l;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->unbox-impl()Lhd/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final equals-impl0(Lhd/l;Lhd/l;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static hashCode-impl(Lhd/l;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static toString-impl(Lhd/l;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ClipboardKeyCommandsHandler(handler="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x29

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    invoke-static {v0, p1}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->equals-impl(Lhd/l;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getHandler()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->hashCode-impl(Lhd/l;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->toString-impl(Lhd/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->handler:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
