.class public final Lx4/c$g;
.super Lx4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public c:Z

.field public d:F

.field public e:Ljava/util/List;


# direct methods
.method public constructor <init>(ZFLjava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "colorList"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "\u7f16\u8f91"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {p0, v2, v3, v0, v1}, Lx4/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lx4/c$g;->c:Z

    .line 15
    .line 16
    iput p2, p0, Lx4/c$g;->d:F

    .line 17
    .line 18
    iput-object p3, p0, Lx4/c$g;->e:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/c$g;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lx4/c$g;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx4/c$g;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lx4/c$g;->e:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx4/c$g;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public final i(F)V
    .locals 0

    .line 1
    iput p1, p0, Lx4/c$g;->d:F

    .line 2
    .line 3
    return-void
.end method
