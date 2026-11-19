.class public final synthetic Landroidx/compose/ui/graphics/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/DoubleUnaryOperator;


# instance fields
.field public final synthetic a:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/graphics/p2;->a:Lhd/l;

    return-void
.end method


# virtual methods
.method public final applyAsDouble(D)D
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/p2;->a:Lhd/l;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;->b(Lhd/l;D)D

    move-result-wide p1

    return-wide p1
.end method
