.class public final synthetic Lc5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lc5/x;->c(Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
