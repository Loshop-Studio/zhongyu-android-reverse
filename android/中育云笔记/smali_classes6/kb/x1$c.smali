.class public final Lkb/x1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/x1;->c(Ly9/n;Lhd/a;Lhd/p;Lhd/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Lhd/p;

.field public final synthetic d:Lhd/a;

.field public final synthetic e:Lhd/a;


# direct methods
.method public constructor <init>(Lhd/p;Lhd/a;Lhd/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkb/x1$c;->c:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Lkb/x1$c;->d:Lhd/a;

    .line 4
    .line 5
    iput-object p3, p0, Lkb/x1$c;->e:Lhd/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 2

    .line 1
    iput p1, p0, Lkb/x1$c;->b:F

    .line 2
    .line 3
    iget-object p1, p0, Lkb/x1$c;->c:Lhd/p;

    .line 4
    .line 5
    iget v0, p0, Lkb/x1$c;->a:F

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lkb/x1$c;->b:F

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1, v0, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b(F)V
    .locals 2

    .line 1
    iput p1, p0, Lkb/x1$c;->a:F

    .line 2
    .line 3
    iget-object v0, p0, Lkb/x1$c;->c:Lhd/p;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p0, Lkb/x1$c;->b:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, p1, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$c;->e:Lhd/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$c;->d:Lhd/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
