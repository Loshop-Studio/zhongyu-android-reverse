.class public final synthetic Landroidx/navigation/serialization/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Ls8/b;


# direct methods
.method public synthetic constructor <init>(Ls8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/serialization/a;->a:Ls8/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/a;->a:Ls8/b;

    invoke-static {v0}, Landroidx/navigation/serialization/RouteSerializerKt;->e(Ls8/b;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
