.class public final Lkb/x1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/x1;->f(Ly9/n;Lhd/l;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhd/l;

.field public final synthetic b:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkb/x1$f;->a:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Lkb/x1$f;->b:Lhd/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$f;->b:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c(IF)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$f;->a:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method
