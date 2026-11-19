.class public final synthetic Landroidx/compose/ui/text/android/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/Layout$TextInclusionStrategy;


# instance fields
.field public final synthetic a:Lhd/p;


# direct methods
.method public synthetic constructor <init>(Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/text/android/e;->a:Lhd/p;

    return-void
.end method


# virtual methods
.method public final isSegmentInside(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/e;->a:Lhd/p;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/text/android/AndroidLayoutApi34;->a(Lhd/p;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method
