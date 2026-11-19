.class public final Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/compose/ConstraintSetScope;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ConstrainedLayoutReferences"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0008\u0000\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0008\u001a\u00020\u0007H\u0086\u0002J\t\u0010\t\u001a\u00020\u0007H\u0086\u0002J\t\u0010\n\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u000c\u001a\u00020\u0007H\u0086\u0002J\t\u0010\r\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0014\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0015\u001a\u00020\u0007H\u0086\u0002J\t\u0010\u0016\u001a\u00020\u0007H\u0086\u0002R\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;",
        "",
        "ids",
        "",
        "(Landroidx/constraintlayout/compose/ConstraintSetScope;[Ljava/lang/Object;)V",
        "[Ljava/lang/Object;",
        "component1",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"
    }
.end annotation


# instance fields
.field private final ids:[Ljava/lang/Object;

.field final synthetic this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/compose/ConstraintSetScope;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final component1()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ltz v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aget-object v0, v0, v1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    new-instance v1, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final component10()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x9

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component11()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component12()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xb

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component13()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xc

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component14()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xd

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component15()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xe

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component16()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final component2()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component3()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component4()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x3

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component5()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x4

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component6()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x5

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component7()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x6

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component8()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x7

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v1, v1, v3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final component9()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->this$0:Landroidx/constraintlayout/compose/ConstraintSetScope;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;->ids:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    if-gt v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/compose/ConstraintSetScope;->access$nextId(Landroidx/constraintlayout/compose/ConstraintSetScope;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ConstraintSetScope;->createRefFor(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
