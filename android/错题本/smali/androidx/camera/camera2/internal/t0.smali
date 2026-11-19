.class public final synthetic Landroidx/camera/camera2/internal/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroid/util/Size;

    check-cast p2, Landroid/util/Size;

    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/MeteringRepeatingSession;->b(Landroid/util/Size;Landroid/util/Size;)I

    move-result p1

    return p1
.end method
