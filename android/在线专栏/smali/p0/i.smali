.class public final synthetic Lp0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/a;


# instance fields
.field public final synthetic a:Landroidx/room/h0;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/i;->a:Landroidx/room/h0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/i;->a:Landroidx/room/h0;

    check-cast p1, Ls0/b;

    invoke-static {v0, p1}, Landroidx/room/h0;->b(Landroidx/room/h0;Ls0/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
