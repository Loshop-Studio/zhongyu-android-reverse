.class public abstract Lcom/zykj/evaluation/ui/sheet/c$b;
.super Lcom/zykj/evaluation/ui/sheet/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/sheet/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/sheet/c$b$a;,
        Lcom/zykj/evaluation/ui/sheet/c$b$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(J)V
    .locals 10

    const-wide v0, 0xffffffffL

    .line 2
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v3

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v7

    const/4 v9, 0x0

    move-object v2, p0

    move-wide v5, p1

    .line 4
    invoke-direct/range {v2 .. v9}, Lcom/zykj/evaluation/ui/sheet/c;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/c$b;-><init>(J)V

    return-void
.end method
