.class public final Ln9/p$b;
.super Lm9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln9/p;-><init>(Lm9/d;IJLjava/util/concurrent/TimeUnit;Ln9/f;Lx7/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Ln9/p;


# direct methods
.method public constructor <init>(Ln9/p;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ln9/p$b;->e:Ln9/p;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p2, v1, p1, v0}, Lm9/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    iget-object v0, p0, Ln9/p$b;->e:Ln9/p;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Ln9/p;->b(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
