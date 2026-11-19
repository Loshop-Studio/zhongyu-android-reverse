.class public final synthetic Landroidx/room/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/a;


# instance fields
.field public final synthetic a:Landroidx/room/f$b;

.field public final synthetic b:Lj/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/f$b;Lj/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/g;->a:Landroidx/room/f$b;

    iput-object p2, p0, Landroidx/room/g;->b:Lj/a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/room/g;->a:Landroidx/room/f$b;

    iget-object v1, p0, Landroidx/room/g;->b:Lj/a;

    check-cast p1, Ls0/b;

    invoke-static {v0, v1, p1}, Landroidx/room/f$b;->a(Landroidx/room/f$b;Lj/a;Ls0/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
