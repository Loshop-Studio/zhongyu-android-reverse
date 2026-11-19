.class public final synthetic Lge/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lce/b;

.field public final synthetic d:Lce/b;


# direct methods
.method public synthetic constructor <init>(Lce/b;Lce/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/s1;->c:Lce/b;

    iput-object p2, p0, Lge/s1;->d:Lce/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lge/s1;->c:Lce/b;

    iget-object v1, p0, Lge/s1;->d:Lce/b;

    check-cast p1, Lee/a;

    invoke-static {v0, v1, p1}, Lge/t1;->f(Lce/b;Lce/b;Lee/a;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
