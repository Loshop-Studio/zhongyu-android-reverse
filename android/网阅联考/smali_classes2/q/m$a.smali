.class public Lq/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lj/b;

.field public final b:Ljava/util/List;

.field public final c:Lk/d;


# direct methods
.method public constructor <init>(Lj/b;Ljava/util/List;Lk/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lg0/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/b;

    iput-object p1, p0, Lq/m$a;->a:Lj/b;

    .line 4
    invoke-static {p2}, Lg0/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lq/m$a;->b:Ljava/util/List;

    .line 5
    invoke-static {p3}, Lg0/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/d;

    iput-object p1, p0, Lq/m$a;->c:Lk/d;

    return-void
.end method

.method public constructor <init>(Lj/b;Lk/d;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lq/m$a;-><init>(Lj/b;Ljava/util/List;Lk/d;)V

    return-void
.end method
