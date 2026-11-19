.class public final synthetic Landroidx/navigation/serialization/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lce/b;


# direct methods
.method public synthetic constructor <init>(Lce/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/serialization/d;->c:Lce/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/d;->c:Lce/b;

    invoke-static {v0}, Landroidx/navigation/serialization/RouteSerializerKt;->b(Lce/b;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
