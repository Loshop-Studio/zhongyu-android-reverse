.class public final Lkotlinx/serialization/modules/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/serialization/modules/d;->b(Lhe/a;Lhe/a;)Lhe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/serialization/modules/c;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/modules/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lod/c;Lod/c;Lce/b;)V
    .locals 2

    .line 1
    const-string v0, "baseClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "actualClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "actualSerializer"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, p1, p2, p3, v1}, Lkotlinx/serialization/modules/c;->j(Lod/c;Lod/c;Lce/b;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public b(Lod/c;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "baseClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "defaultSerializerProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/serialization/modules/c;->i(Lod/c;Lhd/l;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c(Lod/c;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "baseClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "defaultDeserializerProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/serialization/modules/c;->h(Lod/c;Lhd/l;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d(Lod/c;Lce/b;)V
    .locals 2

    .line 1
    const-string v0, "kClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serializer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    new-instance v1, Lkotlinx/serialization/modules/a$a;

    .line 14
    .line 15
    invoke-direct {v1, p2}, Lkotlinx/serialization/modules/a$a;-><init>(Lce/b;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {v0, p1, v1, p2}, Lkotlinx/serialization/modules/c;->l(Lod/c;Lkotlinx/serialization/modules/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public e(Lod/c;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "kClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "provider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/serialization/modules/d$a;->a:Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    new-instance v1, Lkotlinx/serialization/modules/a$b;

    .line 14
    .line 15
    invoke-direct {v1, p2}, Lkotlinx/serialization/modules/a$b;-><init>(Lhd/l;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {v0, p1, v1, p2}, Lkotlinx/serialization/modules/c;->l(Lod/c;Lkotlinx/serialization/modules/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
