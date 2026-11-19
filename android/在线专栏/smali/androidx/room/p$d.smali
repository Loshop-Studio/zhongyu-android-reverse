.class Landroidx/room/p$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/room/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/room/p;


# direct methods
.method constructor <init>(Landroidx/room/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/p$d;->a:Landroidx/room/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/room/p$d;->a:Landroidx/room/p;

    iget-object v1, v0, Landroidx/room/p;->d:Landroidx/room/o;

    iget-object v0, v0, Landroidx/room/p;->e:Landroidx/room/o$c;

    invoke-virtual {v1, v0}, Landroidx/room/o;->k(Landroidx/room/o$c;)V

    return-void
.end method
