.class public final synthetic Landroidx/room/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/room/z;

.field public final synthetic b:Ls0/e;

.field public final synthetic c:Landroidx/room/c0;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/x;->a:Landroidx/room/z;

    iput-object p2, p0, Landroidx/room/x;->b:Ls0/e;

    iput-object p3, p0, Landroidx/room/x;->c:Landroidx/room/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/room/x;->a:Landroidx/room/z;

    iget-object v1, p0, Landroidx/room/x;->b:Ls0/e;

    iget-object v2, p0, Landroidx/room/x;->c:Landroidx/room/c0;

    invoke-static {v0, v1, v2}, Landroidx/room/z;->o(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V

    return-void
.end method
