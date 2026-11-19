.class public final synthetic Lge/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lge/d2;


# direct methods
.method public synthetic constructor <init>(Lge/d2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/a2;->c:Lge/d2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/a2;->c:Lge/d2;

    invoke-static {v0}, Lge/d2;->k(Lge/d2;)[Lce/b;

    move-result-object v0

    return-object v0
.end method
