.class public final Lkb/x1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/x1;->e(Ly9/n;Lhd/a;Lhd/l;Lhd/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhd/l;

.field public final synthetic b:Lhd/a;

.field public final synthetic c:Lhd/a;


# direct methods
.method public constructor <init>(Lhd/l;Lhd/a;Lhd/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkb/x1$e;->a:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Lkb/x1$e;->b:Lhd/a;

    .line 4
    .line 5
    iput-object p3, p0, Lkb/x1$e;->c:Lhd/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public progress(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$e;->a:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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

.method public startRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$e;->b:Lhd/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public stopRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/x1$e;->c:Lhd/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
