.class public final synthetic Landroidx/room/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/room/z;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/r;->a:Landroidx/room/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/room/r;->a:Landroidx/room/z;

    invoke-static {v0}, Landroidx/room/z;->b(Landroidx/room/z;)V

    return-void
.end method
