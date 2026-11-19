.class public final synthetic Landroidx/navigation/serialization/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ls8/b;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ls8/b;ILjava/util/Map;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/serialization/e;->a:Ls8/b;

    iput p2, p0, Landroidx/navigation/serialization/e;->b:I

    iput-object p3, p0, Landroidx/navigation/serialization/e;->c:Ljava/util/Map;

    iput-object p4, p0, Landroidx/navigation/serialization/e;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/e;->a:Ls8/b;

    iget v1, p0, Landroidx/navigation/serialization/e;->b:I

    iget-object v2, p0, Landroidx/navigation/serialization/e;->c:Ljava/util/Map;

    iget-object v3, p0, Landroidx/navigation/serialization/e;->d:Ljava/lang/String;

    check-cast p1, Landroidx/navigation/NavArgumentBuilder;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/navigation/serialization/RouteSerializerKt;->c(Ls8/b;ILjava/util/Map;Ljava/lang/String;Landroidx/navigation/NavArgumentBuilder;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
