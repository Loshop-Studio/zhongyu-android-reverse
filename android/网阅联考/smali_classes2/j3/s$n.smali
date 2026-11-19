.class public final Lj3/s$n;
.super Lj3/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# instance fields
.field public final a:Lj3/i;

.field public final b:Z


# direct methods
.method public constructor <init>(Lj3/i;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj3/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/s$n;->a:Lj3/i;

    .line 5
    .line 6
    iput-boolean p2, p0, Lj3/s$n;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lj3/b0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lj3/s$n;->a:Lj3/i;

    .line 5
    .line 6
    invoke-interface {v0, p2}, Lj3/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iget-boolean v1, p0, Lj3/s$n;->b:Z

    .line 14
    .line 15
    invoke-virtual {p1, p2, v0, v1}, Lj3/b0;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
