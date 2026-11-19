.class public final synthetic Lnb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lnb/f;


# direct methods
.method public synthetic constructor <init>(Lnb/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/e;->c:Lnb/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/e;->c:Lnb/f;

    check-cast p1, Lnb/c0;

    invoke-static {v0, p1}, Lnb/f;->a(Lnb/f;Lnb/c0;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
