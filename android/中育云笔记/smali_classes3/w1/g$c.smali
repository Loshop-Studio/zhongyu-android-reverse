.class public final Lw1/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public b:Ldc/h;


# direct methods
.method public constructor <init>(Lw1/g$h;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw1/g$c;->a:Lw1/g$h;

    return-void
.end method

.method public synthetic constructor <init>(Lw1/g$h;Lw1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw1/g$c;-><init>(Lw1/g$h;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ldc/h;)Lbc/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$c;->c(Ldc/h;)Lw1/g$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lw1/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lw1/g$c;->b:Ldc/h;

    .line 2
    .line 3
    const-class v1, Ldc/h;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgc/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lw1/g$d;

    .line 9
    .line 10
    iget-object v1, p0, Lw1/g$c;->a:Lw1/g$h;

    .line 11
    .line 12
    iget-object v2, p0, Lw1/g$c;->b:Ldc/h;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lw1/g$d;-><init>(Lw1/g$h;Ldc/h;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic build()Lyb/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw1/g$c;->b()Lw1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Ldc/h;)Lw1/g$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ldc/h;

    .line 6
    .line 7
    iput-object p1, p0, Lw1/g$c;->b:Ldc/h;

    .line 8
    .line 9
    return-object p0
.end method
