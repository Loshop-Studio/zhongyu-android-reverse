.class public final synthetic Lge/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lge/u2;


# direct methods
.method public synthetic constructor <init>(Lge/u2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/t2;->c:Lge/u2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/t2;->c:Lge/u2;

    check-cast p1, Lee/a;

    invoke-static {v0, p1}, Lge/u2;->a(Lge/u2;Lee/a;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
