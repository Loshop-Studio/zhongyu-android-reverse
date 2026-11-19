.class public final synthetic Lce/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lce/f;


# direct methods
.method public synthetic constructor <init>(Lce/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/e;->c:Lce/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lce/e;->c:Lce/f;

    check-cast p1, Lee/a;

    invoke-static {v0, p1}, Lce/f;->g(Lce/f;Lee/a;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
