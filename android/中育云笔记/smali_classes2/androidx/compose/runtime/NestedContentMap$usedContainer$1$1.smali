.class final Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/NestedContentMap;->usedContainer(Landroidx/compose/runtime/MovableContentStateReference;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $reference:Landroidx/compose/runtime/MovableContentStateReference;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;->$reference:Landroidx/compose/runtime/MovableContentStateReference;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/NestedMovableContent;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/compose/runtime/NestedMovableContent;->getContainer()Landroidx/compose/runtime/MovableContentStateReference;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;->$reference:Landroidx/compose/runtime/MovableContentStateReference;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/runtime/NestedMovableContent;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;->invoke(Landroidx/compose/runtime/NestedMovableContent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
