.class public final synthetic Landroidx/room/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/room/z;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/z;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/w;->a:Landroidx/room/z;

    iput-object p2, p0, Landroidx/room/w;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/room/w;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/room/w;->a:Landroidx/room/z;

    iget-object v1, p0, Landroidx/room/w;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/room/w;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Landroidx/room/z;->m(Landroidx/room/z;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
