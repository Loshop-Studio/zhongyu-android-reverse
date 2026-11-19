.class Landroidx/room/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/p$a;->i([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Landroidx/room/p$a;


# direct methods
.method constructor <init>(Landroidx/room/p$a;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/p$a$a;->b:Landroidx/room/p$a;

    iput-object p2, p0, Landroidx/room/p$a$a;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/room/p$a$a;->b:Landroidx/room/p$a;

    iget-object v0, v0, Landroidx/room/p$a;->a:Landroidx/room/p;

    iget-object v0, v0, Landroidx/room/p;->d:Landroidx/room/o;

    iget-object v1, p0, Landroidx/room/p$a$a;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/room/o;->h([Ljava/lang/String;)V

    return-void
.end method
