.class public final Lw8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/t;->a(Le8/c;)Ls8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw8/t;

.field public final synthetic b:Le8/c;


# direct methods
.method public constructor <init>(Lw8/t;Le8/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw8/t$a;->a:Lw8/t;

    .line 2
    .line 3
    iput-object p2, p0, Lw8/t$a;->b:Le8/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lw8/m;

    .line 2
    .line 3
    iget-object v1, p0, Lw8/t$a;->a:Lw8/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Lw8/t;->b()Lx7/l;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lw8/t$a;->b:Le8/c;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ls8/b;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lw8/m;-><init>(Ls8/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
