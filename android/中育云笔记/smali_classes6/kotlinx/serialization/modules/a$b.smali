.class public final Lkotlinx/serialization/modules/a$b;
.super Lkotlinx/serialization/modules/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/serialization/modules/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lkotlinx/serialization/modules/a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lkotlinx/serialization/modules/a$b;->a:Lhd/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Lce/b;
    .locals 1

    .line 1
    const-string v0, "typeArgumentsSerializers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/modules/a$b;->a:Lhd/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lce/b;

    .line 13
    .line 14
    return-object p1
.end method

.method public final b()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/modules/a$b;->a:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
